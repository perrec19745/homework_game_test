function calculateAvgAge() {
	const allAge = document.getElementsByClassName("age");
	let sum = 0;
	for (const td of allAge){
		sum += parseInt(td.innerHTML);
	}
	return Math.floor(sum / allAge.length);
}

function addStudent() {
	const name = document.getElementById("fullname").value;
	const gender = document.getElementById("gender").value;
	const birthday = document.getElementById("birthday").value;
	const age = getAge(birthday);
	// alert(name + ", " + gender + ", " + birthday + ", " + age);

	const tr = document.createElement("tr");
	const tdName = document.createElement("td");
	const tdGender =document.createElement("td");
	const tdBirthday = document.createElement("td");
	const tdAge = document.createElement("td");
	tdName.innerHTML = name;
	tdGender.innerHTML = gender;
	tdBirthday.innerHTML = birthday;
	tdAge.innerHTML = age;
	tdAge.className = "age";
	tr.append(tdName, tdGender, tdBirthday, tdAge);
	const tbody = document.getElementById("students-body");
	tbody.append(tr);

const avg = calculateAvgAge();
	const tdAvg = document.getElementById("avg-age");
	tdAvg.innerHTML = avg;

}

function getAge(birthday) {
	let today = new Date();
	let dateOfBirth = new Date(birthday);
	let years = today.getFullYear() - dateOfBirth.getFullYear();
	if (today.getMonth() > dateOfBirth.getMonth() ||
		(today.getMonth() == dateOfBirth.getMonth() &&
			today.getDay() >= dateOfBirth.getDay())){
		return years;
	}
	return  years - 1;
}

