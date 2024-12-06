pm.test("PATCH request - Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("PATCH request - Response body matches expected values", function () {
    const jsonData = pm.response.json();
    pm.expect(jsonData).to.have.property("method", "PATCH");
    pm.expect(jsonData).to.have.property("url").that.includes("https://postman-echo.com/patch");
    pm.expect(jsonData).to.have.property("data").that.deep.equals(pm.request.body.raw);
});

