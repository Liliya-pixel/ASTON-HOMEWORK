pm.test("GET request - Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("GET request - Response body matches expected values", function () {
    const jsonData = pm.response.json();
    pm.expect(jsonData).to.have.property("method", "GET");
    pm.expect(jsonData).to.have.property("url").that.includes("https://postman-echo.com/get");
});

