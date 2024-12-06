pm.test("POST request - Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("POST request - Response body matches expected values", function () {
    const jsonData = pm.response.json();
    pm.expect(jsonData).to.have.property("method", "POST");
    pm.expect(jsonData).to.have.property("url").that.includes("https://postman-echo.com/post");
    pm.expect(jsonData).to.have.property("data").that.deep.equals(pm.request.body.raw);
});

