package com.company;

public class Main {

    public static void main(String[] args) {
    String text="Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
            "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n" +
            "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n" +
            "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
            "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
            "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";
	text= text.replaceAll("ё","z");
	text=text.replaceAll("Ё","Z");
        String decodeText=new String();
        int key=11;
        for (int i = 0; i < text.length() ; i++) {
            char ch = text.charAt(i);
            int value=(int)ch;
            if(ch=='z'){
                decodeText+=(char)(1077+key);
            }else if(ch=='Z'){
                decodeText+=(char)(1045+key);
            }else if (ch != ',' && ch != '.' && ch != ' ' && String.valueOf(ch)!="\n") {
                if (value < 1072){
                    decodeText += capitalLetter.symbolPlusKey(value, key);
                }else{
                    decodeText += lowLetter.symbolPlusKey(value,key);
                }

            } else {
                decodeText += ch;
            }

        }

        System.out.println(decodeText);
    }


}
