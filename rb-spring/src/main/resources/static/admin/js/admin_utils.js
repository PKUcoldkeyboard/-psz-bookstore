// 获取fieldLst包含的字段的值
// 若fieldLst[0]为"all"，则返回所有字段及对应值
function collectData(fieldLst) {
	var tableName = $("section.mtb").first().attr("db-table");
	var ret = {
		"table": tableName
	};
	var fieldMap = {};
	var tas = $("section.mtb:first textarea");
	for (var i = 0; i < tas.length; i++) {
		var ta = tas.eq(i);
		if (fieldLst[0] == "all" || fieldLst.indexOf(ta.attr("db-field")) > -1) {
			// console.log(ta.attr("db-field"));
			fieldMap[ta.attr("db-field")] = ta.val();
		}
	}
	ret["data"] = fieldMap;
	return ret;
}
// 与collectData类似
// 区别在于：需要更新的字段和where条件的字段分别放在ret["update"]和ret["where"]中
function collectDataUpdate(fieldLst, where) {
	var tableName = $("section.mtb").first().attr("db-table");
	var ret = {
		"table": tableName,
		"update": {},
		"where": {}
	};
	var tas = $("section.mtb:first textarea");
	for (var i = 0; i < tas.length; i++) {
		var ta = tas.eq(i);
		var field = ta.attr("db-field");
		if (fieldLst[0] == "all" || fieldLst.indexOf(field) > -1) {
			// console.log(ta.attr("db-field"));
			if (where.indexOf(field) > -1) {
				ret["where"][field] = ta.val();
			} else {
				ret["update"][field] = ta.val();
			}
		}
	}
	return ret;
}

async function dbDelete(dataObj) {
	let result;
	try {
		result = await $.ajax({
			type: "POST", // 方法类型
			dataType: "text", // 预期服务器返回的数据类型
			url: path + "/AdminDelete",
			data: {
				data: JSON.stringify(dataObj)
			}
		});

		return result;
	} catch (error) {
		console.error(error);
	}
}

async function dbInsert(dataObj) {
	let result;
	try {
		result = await $.ajax({
			type: "POST", // 方法类型
			dataType: "text", // 预期服务器返回的数据类型
			url: path + "/AdminInsert",
			data: {
				data: JSON.stringify(dataObj)
			}
		});

		return result;
	} catch (error) {
		console.error(error);
	}
}

async function dbUpdate(dataObj){
	let result;
	try {
		result = await $.ajax({
			type: "POST", // 方法类型
			dataType: "text", // 预期服务器返回的数据类型
			url: path + "/AdminUpdate",
			data: {
				data: JSON.stringify(dataObj)
			}
		});

		return result;
	} catch (error) {
		console.error(error);
	}
}
