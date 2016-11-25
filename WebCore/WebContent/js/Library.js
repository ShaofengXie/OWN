/**
 * 
 */
function Age() {
	try {
		var m = "age";
		var n = 20;
		document.write(parseInt(m) + n);
		throw new Error("not a valid number");
	} catch (errMsg) {
		alert(errMsg.message);
	}
}

function sumAll() {
    var i, sum = 0;
    for(i = 0; i < arguments.length; i++) {
        sum += arguments[i];
    }
 alert(sum);
} 

