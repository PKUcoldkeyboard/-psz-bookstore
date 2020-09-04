function setApplyAsRead(userAccount, userType, idLstStr) {
	setAsRead("apply", userAccount, userType, idLstStr);
}

function setNoticeAsRead(userAccount, idLstStr) {
	setAsRead("notice", userAccount, userType, idLstStr);
}

function setAsRead(table, userAccount, userType, idLstStr) {
	$.ajax({
		url : "/rb/MarkAsReadServlet",
		type : "POST",
		data : {
			"table" : table,
			"userAccount" : userAccount,
			"userType" : userType,
			"ids" : idLstStr
		},
		success : function(result) {
			//alert("success!");
		}
	});
}