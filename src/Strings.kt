fun main(){
    val name = "Vitor";
    println(name);
    println(name.length);
    println(name.uppercase());
    println(name.lowercase());
    println(name[0]);
    println(name[4]);

    val age = 20;

    var message = name + age;  // worse
    message = "${name} ${age}";  // good
    message = "$name $age";  // better

    println(message)

    // multiline string
    val email = """
        %s
        Pereira
        Resende
    """.trimIndent();

    println(email.format(name));

    // equals
    val name1 = "john";
    val name2 = "jhon";
    val name3 = "john";

    println(name1 == name2);
    println(name1.equals(name2));

    println(name1 == name3);
    println(name1.equals(name3));
}