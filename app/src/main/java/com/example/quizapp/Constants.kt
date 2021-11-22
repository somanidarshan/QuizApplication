package com.example.quizapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionlist=ArrayList<Question>()
        val que1=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.india,
                "India",
                "Bangladesh",
                "England",
                "Germany",
                1
                )
        questionlist.add(que1)

        //q2
        val que2=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.bangla,
                "India",
                "Bangladesh",
                "England",
                "Germany",
                2
        )
        questionlist.add(que2)

        //q3
        val que3=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.germany,
                "India",
                "Bangladesh",
                "England",
                "Germany",
                4
        )
        questionlist.add(que3)


        val que4=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.malysia,
                "India",
                "Bangladesh",
                "England",
                "Mylasia",
                4
        )
        questionlist.add(que4)

        val que5=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.england,
                "India",
                "Bangladesh",
                "England",
                "Germany",
                3
        )
        questionlist.add(que5)

        val que6=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.france,
                "India",
                "Bangladesh",
                "England",
                "France",
                4
        )
        questionlist.add(que6)


        val que7=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.denmark,
                "Denmark",
                "Bangladesh",
                "England",
                "Germany",
                1
        )
        questionlist.add(que7)


        val que8=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.usa,
                "India",
                "Bangladesh",
                "USA",
                "Germany",
                3
        )
        questionlist.add(que8)

        val que9=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.afgan,
                "India",
                "Afganistan",
                "England",
                "Germany",
                2
        )
        questionlist.add(que9)


        val que10=Question(1,
                "What Country Does this flag Belong to?",
                R.drawable.indonesia,
                "India",
                "Bangladesh",
                "Indonesia",
                "Germany",
                3
        )
        questionlist.add(que10)



        return questionlist;


    }


}