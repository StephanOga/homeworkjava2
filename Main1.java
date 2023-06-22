//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow, age=null

public class Main1 {
    public static void main(String[] args) {
        String result = "select * from students where ";
        String strJSON = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(strJSON);
        String fromStrJSON = strJSON.replace("{", "");
        fromStrJSON = fromStrJSON.replace("}", "");
        fromStrJSON = fromStrJSON.replace("\"", "");
        fromStrJSON = fromStrJSON.replace(":", "=");
        System.out.println(fromStrJSON);

        result += fromStrJSON;
        System.out.println(result);
    }
}