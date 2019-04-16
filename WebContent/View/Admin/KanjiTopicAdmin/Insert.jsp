<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Kanji study</title>

<!-- Bootstrap -->
<link
	href="../../../Template/Admin/css/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link
	href="../../../Template/Admin/css/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="../../../Template/Admin/css/vendors/nprogress/nprogress.css"
	rel="stylesheet">
<script type="text/javascript"
	src="./Template/Admin/ckeditor/ckeditor.js"></script>

<!-- Custom Theme Style -->
<link href="../../../Template/Admin/css/build/css/custom.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="../../../Template/Admin/List/css/font-awesome.min.css">
<link rel="stylesheet" href="../../../Template/Admin/List/css/main.css">
<link rel="stylesheet" href="../../../Template/Admin/List/style.css">
<link rel="stylesheet"
	href="../../../Template/Admin/List/css/responsive.css">

</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<!--Begin-Menuleft -->

			<jsp:include page="../MenuLeft.jsp" />
			<!-- End-Menuleft -->

			<!--Begin header  -->
			<jsp:include page="../HeaderAdmin.jsp" />
			<!--End Header    -->



			<!-- page content -->
			<div class="right_col" role="main">
				<div class="">
					<div class="clearfix"></div>
					<div class="row">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="product-status-wrap">
								<h4>Kanji mới</h4>
								</br>
								<!--    content -->
								<%=request.getAttribute("messageinsert")%>

								<form action="" method="post" enctype="multipart/form-data"
									class="form-horizontal" style="margin-top: 20px;">
									<div class="row form-group" style="margin-top: 20px;">
										<div class="col col-md-3">
											<label for="text-input" class=" form-control-label">Tiêu
												đề bài viết</label>
										</div>
										<div class="col-12 col-md-9">
											<input type="title" id="title-input" name="email-input"
												placeholder="Tên tiêu đề" class="form-control" />
										</div>
									</div>
									<div class="row form-group" style="margin-top: 30px;">
										<div class="col col-md-3">
											<label for="file-input" class=" form-control-label">File
												ảnh</label>
										</div>
										<div class="col-12 col-md-9">
											<input type="file" id="file-input" name="file-input"
												class="form-control-file" />
										</div>
									</div>

									<div class="row form-group" style="margin-top: 30px;">
										<div class="col col-md-3">
											<label for="file-input" class=" form-control-label">Nội
												dung</label>
										</div>

										<div class="col-12 col-md-9">

											<div class="form-group">
												<div class="row">

													<div class="col-md-12">
														<td><textarea class="ckeditor" name="nd" cols="80"
																rows="10"></textarea>
													</div>
												</div>
											</div>
										</div>


									</div>

									<div class="row form-group"
										style="padding: auto; margin: auto; width: 70%;">

										<button type="submit" class="btn btn-primary btn-sm">
											<i class="fa fa-dot-circle-o"></i> Thêm mới
										</button>
										<a href=""><button type="reset"
												class="btn btn-danger btn-sm">
												<i class="fa fa-ban"></i> Reset
											</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /page content -->

			<!--Begin Footer  -->
			<jsp:include page="../FooterAdmin.jsp" />
			<!--End Footer  -->
		</div>
	</div>

	<!-- jQuery -->
	<script src="./Template/css/vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="./Template/css/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="./Template/css/vendors/fastclick/lib/fastclick.js"></script>
	<!-- NProgress -->
	<script src="./Template/css/vendors/nprogress/nprogress.js"></script>
	<!-- validator -->
	<script src="./Template/css/vendors/validator/validator.js"></script>

	<!-- Custom Theme Scripts -->
	<script src="./Template/css/build/js/custom.min.js"></script>

</body>
</html>