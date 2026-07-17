interface WordCount {
    int count(String str);
}

class MyClassWithLambda {
    public static void main(String[] args) {
        WordCount wc = str -> str.trim().split("\\s+").length;

        String sentence = "This is a sample sentence for word count";
        int result = wc.count(sentence);

        System.out.println("Word count: " + result);
    }
}