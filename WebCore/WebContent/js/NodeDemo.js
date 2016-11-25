/**
 * 
 */
window.onload = initAll;
function initAll() {
	document.getElementsByTagName("form")[0].onsubmit = function() {
		return addNode();
	}
}

function addNode() {
	var inText = document.getElementById("textArea").value;
	var newText = document.createTextNode(inText);
	var newGraf = document.createElement("p");
	newGraf.appendChild(newText);
	var docBody = document.getElementsByTagName("body")[0];
	docBody.appendChild(newGraf);

	return false; // 此处不可以省略，起到抑制默认行为的作用
}

function delNode() {
	var allGrafs = document.getElementsByTagName("p");
	if (allGrafs.length > 0) {
		var lastGraf = allGrafs.item(allGrafs.length - 1)
		var docBody = document.getElementsByTagName("body")[0]
		docBody.removeChild(lastGraf)
	}
	// return false;
}

function insertBeforeDemo() {
	var newItem = document.createElement("LI");
	var textnode = document.createTextNode("MMM");
	newItem.appendChild(textnode)

	var list = document.getElementById("List");
	list.insertBefore(newItem, list.childNodes[0]);
	return false;
}

function replaceChildDemo() {
	var newItem = document.createElement("LI");
	var textnode = document.createTextNode("YYY");
	newItem.appendChild(textnode)
	
	var list = document.getElementById("List");
	list.replaceChild(newItem, list.childNodes[0]);
	return false;
}


