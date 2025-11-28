function validate() {
    const bank = document.getElementById("bank").value;
    const branch = document.getElementById("branch").value;
    const account = document.getElementById("account").value;
    const key = document.getElementById("key").value;
    const order = document.getElementById("order").value;

    if (!/^\d{3}$/.test(bank)) return show("Invalid bank code");
    if (!/^\d{4}$/.test(branch)) return show("Invalid branch code");
    if (!/^\d{10}$/.test(account)) return show("Invalid account number");
    if (!/^\d{4}$/.test(key)) return show("Invalid key");
    if (!/^[12]$/.test(order)) return show("Invalid order value");

    show("Operation accepted");
}

function show(msg) {
    document.getElementById("result").innerText = msg;
}