package bufferchime.com.fanmeterkohli;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


class TriviaQuizHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String DB_NAME = "TQuiz.db";

    //If you want to add more questions or wanna update table values
    //or any kind of modification in db just increment version no.
    private static final int DB_VERSION = 3;
    //Table name
    private static final String TABLE_NAME = "TQ";
    //Id of question
    private static final String UID = "_UID";
    //Question
    private static final String QUESTION = "QUESTION";
    //Option A
    private static final String OPTA = "OPTA";
    //Option B
    private static final String OPTB = "OPTB";
    //Option C
    private static final String OPTC = "OPTC";
    //Answer
    private static final String ANSWER = "ANSWER";
    //So basically we are now creating table with first column-id , sec column-question , third column -option A, fourth column -option B , Fifth column -option C , sixth column -option D , seventh column - answer(i.e ans of  question)
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    //Drop table query
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    TriviaQuizHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //OnCreate is called only once
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //OnUpgrade is called when ever we upgrade or increment our database version no
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
    }

    void allQuestion() {
        ArrayList<TriviaQuestion> arraylist = new ArrayList<>();

        arraylist.add(new TriviaQuestion("What number was kohli's ranked in ESPN list world of athletes?", "8th", "4th", "5th",  "8th"));

        arraylist.add(new TriviaQuestion("In what year was Kohli ranked in the list of the world athletes?", "2014", "2015", "2016", "2016"));

        arraylist.add(new TriviaQuestion("Presently, Virat Kohli is playing for which team in the IPL?", "kkr",  "srh", "rcb", "rcb"));

        arraylist.add(new TriviaQuestion("What number was kohli's ranked in ESPN list world of athletes?", "8th", "4th", "5th",  "8th"));

        arraylist.add(new TriviaQuestion("In what year was Kohli ranked in the list of the world athletes?", "2014", "2015", "2016", "2016"));

        arraylist.add(new TriviaQuestion("Is Virat Kohli a married man?", "Maybe",  "No", "Yes", "No"));

        arraylist.add(new TriviaQuestion("What is the name of Kohli's wife?", "Anushka Sharma",  "Rahama Dehli", "Shikahr Dhawan",  "Anushka Sharma"));

        arraylist.add(new TriviaQuestion("How many kids does Kohli have?", "3",  "None", "1",  "None"));

        arraylist.add(new TriviaQuestion("In what year did Virat Kohli become the ODI captain?", "2012",  "2009", "2010",  "2012"));

        arraylist.add(new TriviaQuestion("Who is Virat Kohli?", "A footballer",  "A cricketer", "A Jumper",  "A cricketer"));

        arraylist.add(new TriviaQuestion("In what year did Kohli made his first-class debut?", "2008",  "2006", "2009",  "2006"));

        arraylist.add(new TriviaQuestion("In what year was Virat Kohli born?", "1988",  "1986", "1989",  "1988"));

        arraylist.add(new TriviaQuestion("What is Kohli's IPL jersey number?", "16",  "18", "20",  "18"));

        arraylist.add(new TriviaQuestion("What number was kohli's ranked in ESPN list world of athletes?",  "8th",  "4th", "5th",  "8th"));

        arraylist.add(new TriviaQuestion("In what year was Kohli ranked in the list of the world athletes?", "2014",  "2016", "2012",  "2016"));

        arraylist.add(new TriviaQuestion("Presently, Virat Kohli is playing for which team in the IPL?", "Royal Challenge Bangalore",  "West Dehli cricket team", "India Squad A",  "Royal Challenge Bangalore"));

        arraylist.add(new TriviaQuestion("Again, which country did Kohli play his last ODI match?", "South Africa",  "New Zealand", "Zimbabwe",  "New Zealand"));

        arraylist.add(new TriviaQuestion("In what year did Virat Kohli play his last ODI match?", "2017",  "2012", "2015",  "2017"));

        arraylist.add(new TriviaQuestion("In what year did Kohli play his last test match?", "2012",  "2017", "2014",  "2017"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli play his last test match?", "Sri Lanka",  "New Zealand", "Delhi",  "Sri lanka"));

        arraylist.add(new TriviaQuestion("How many times did Virat Kohli won the man of the tournament at the ICC world Twenty 20?", "Twice",  "Once", "7times",  "Twice"));

        arraylist.add(new TriviaQuestion("In what year did Kohli won his first T201 debut?", "2012",  "2010", "2015",  "2010"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli play his last T201 match?", "England",  "New Zealand", "Zimbabwe",  "New Zealand"));

        arraylist.add(new TriviaQuestion("Kohli won his first T201 debut against which country?", "Zimbabwe",  "South Africa", "Cameroon",  "Zimbabwe"));

        arraylist.add(new TriviaQuestion("When did Virat Kohli play his last T201 match?", "2012",  "2017", "2015",  "2017"));

        arraylist.add(new TriviaQuestion("What is Kohli T201 jersey number?", "18",  "20", "14",  "18"));

        arraylist.add(new TriviaQuestion("At what age did Kohli became the third Indian to make 2001 hundreds?", "23",  "22", "25",  "25"));

        arraylist.add(new TriviaQuestion("Virat Kohli became third to score how many double hundreds in a calendar year?", "3",  "2", "1",  "3"));

        arraylist.add(new TriviaQuestion("At what age did Kohli made his ODI debut for India?", "19",  "23", "24",  "19"));

        arraylist.add(new TriviaQuestion("In what year did Kohli became the top ranked T201 bats man in the ICC ranking?", "2014",  "2017", "2016",  "2014"));

        arraylist.add(new TriviaQuestion("What year did Virat Kohli reach the number one spot in the ICC rankings for ODI batsman?", "2014",  "2013", "2011",  "2013"));

        arraylist.add(new TriviaQuestion("Kohli received the ArJuna Award in what year?", "2013",  "2015", "2017",  "2013"));

        arraylist.add(new TriviaQuestion("Kohli was named the ICC ODI player in what year?", "2009",  "2012", "2008",  "2012"));

        arraylist.add(new TriviaQuestion("Between what year did Kohli first became the BCCI'S international cricketer?", "2011-2012",  "2009-2010", "2008-2009",  "2011-2012"));

        arraylist.add(new TriviaQuestion("Kohli has over how many brand endorsements?", "20",  "23", "25",  "20"));

        arraylist.add(new TriviaQuestion("Kohli co-own which football club in the ISL?", "UAE Royal",  "FC Goa", "Virat FC",  "FC Goa"));

        arraylist.add(new TriviaQuestion("What is Kohli's rank on the list of India's most valued celebrity brands?", "Second",  "Fourth", "Seventh",  "second"));

        arraylist.add(new TriviaQuestion("Kohli handed over the test captaincy in what year? ", "2014",  "2016", "2014",  "2014"));

        arraylist.add(new TriviaQuestion("Between what year did Kohli became the BCCI's international cricketer for the second time?", "2013-2014",  "2014-2015", "2009-2010",  "2014-2015"));

        arraylist.add(new TriviaQuestion("What is Virat Kohli Father's name?", "Prem Kohli",  "Sharsm Kohli", "Saroj Kohli",  "Prem Kohli"));

        arraylist.add(new TriviaQuestion("What is Virat's height?", "7ft",  "5ft 9 inches", "6ft 3 inches",  "5ft 9inches"));

        arraylist.add(new TriviaQuestion("Which country does Virat Kohli belong?", "India",  "England", "China",  "India"));

        arraylist.add(new TriviaQuestion("Which bike company does Virat promote? ", "Honda",  "TVS", "Bajaj",  "TVS"));

        arraylist.add(new TriviaQuestion("Who is Virat Kohli's brother?", "Ki Kash Kohli",  "Prem Kohli", "Sharsm Kohli",  "Vikash Kohli"));

        arraylist.add(new TriviaQuestion("What is Virat's position in the Indian National Team ?", "Player",  "Captain", "Coach",  "Captain"));

        arraylist.add(new TriviaQuestion("What is Virat Kohli mother's name? ", "Prem Kohli",  "Saroj Kohli", "Vi Kash Kohli",  "Saroj Kohli"));

        arraylist.add(new TriviaQuestion("What is the highest score of Virat in an ODI?", "183",  "193", "213",  "183"));

        arraylist.add(new TriviaQuestion("What is Kohli father's occupation? ", "Prosecutor",  "Criminal Lawyer", "Judge",  "Criminal lawyer"));

        arraylist.add(new TriviaQuestion("Which town in India was Viart Kohli raised?", "Uttam Nagar",  "Punjabi", "Dehli",  "Uttam Nagar"));

        arraylist.add(new TriviaQuestion("What is Kohli's bowling style?", "Right Arm",  "Right Arm Medium", "Left Arm",  "Right Arm medium"));

        arraylist.add(new TriviaQuestion("Virat Kohli T201 match played on October 10, 2017 was against which country?", "Europe",  "Australia", "England",  "Australia"));

        arraylist.add(new TriviaQuestion("What is Kohli's batting style?", "Left handed medium",  "Right handed", "Left handed",  "Right handed"));

        arraylist.add(new TriviaQuestion("The ODI match Virat played on October 29, 2017 was against which country?", "Zimbabwe",  "New Zealand", "England",  "New Zealand"));

        arraylist.add(new TriviaQuestion("The test match played on August 12, 2017 by Virat Kohli was against which city?", "Sri Lanka",  "South Africa", "Dehli",  "Sri Lanka"));

        arraylist.add(new TriviaQuestion("Virat Kohli played is most recent. Tests match against Australia in what year?", "2017",  "2015", "2014",  "2017"));

        arraylist.add(new TriviaQuestion("In which team did Virat Kohli started playing cricket?", "West Dehli Cricket Academy",  "Royal Challenge Bangalore", "India Squad A",  "West Delhi Cricket Academy"));

        arraylist.add(new TriviaQuestion("At what age did Kohli started showing interest in Cricket? ", "3",  "15", "18",  "3"));

        arraylist.add(new TriviaQuestion("What is the occupation of Virat's girlfriend?", "Actress",  "Dancer", "Boxer",  "Actress"));

        arraylist.add(new TriviaQuestion("Does Virat Kohli own any non-governmental organization?", "No",  "Yes", "Maybe",  "Yes"));

        arraylist.add(new TriviaQuestion("What is Virat Kohli's best drink?", "Black Coffee",  "Wine", "Coca Cola",  "Black coffee"));

        arraylist.add(new TriviaQuestion("What is Virat Kohli's gender?", "Male",  "Female", "Amaphrodite",  "Male"));

        arraylist.add(new TriviaQuestion("What is Virat Kohli present age?", "29",  "25", "22",  "29"));

        arraylist.add(new TriviaQuestion("As of October 2, 2013 how many one day international centuries has Virat Kohli scored?", "9",  "15", "10",  "15"));

        arraylist.add(new TriviaQuestion("How many runs have Kohli scored on his IPL carreer as of october 2, 2013?", "2485",  "4723", "2273",  "2273"));

        arraylist.add(new TriviaQuestion("What is Virat Kohli's ODI jersey number?", "15",  "20", "18",  "18"));

        arraylist.add(new TriviaQuestion("What is the name of Virat Kohli's sister?", "Bhavina Kohli",  "Prem Kohli", "Vikash Kohli",  "Bhavina Kohli"));

        arraylist.add(new TriviaQuestion("In what year did Kohli lead India to the world cup victory?", "2011",  "2010", "2018",  "2008"));

        arraylist.add(new TriviaQuestion("What is the name of Virat Charity foundation?", "Virat foundation",  "Kohli foundation", "Virat foundation",  "Virat Kohli foundation"));

        arraylist.add(new TriviaQuestion("In what year did Virat organise his charity foundation?", "2016",  "2013", "2011",  "2013"));

        arraylist.add(new TriviaQuestion("What is Virat Kohli's pet?", "Dog",  "Cat", "Bird",  "Dog"));

        arraylist.add(new TriviaQuestion("In early 2017, which captain did Virat became?", "Limited-over captain",  "India's Captain", "Captain",  "Limited-over captain"));

        arraylist.add(new TriviaQuestion("Which player's position did Kohli family occupy as a captain in early 2017 ?", "Dhoni",  "Tendulkar", "Prem",  "Dhoni"));

        arraylist.add(new TriviaQuestion("What language does Virat Kohli family speak?", "French",  "English", "Punjabi",  "Punjabi"));

        arraylist.add(new TriviaQuestion("Which family was Kohli born into?", "Dehli family",  "Punjabi family", "Bhavina family",  "Punjabi family"));

        arraylist.add(new TriviaQuestion("What is Virat Kohli mother's occupation?", "Lawyer",  "House-wife", "Accountant",  "House wife"));

        arraylist.add(new TriviaQuestion("Kohli would pick up a cricket bat and ask his father to bowl at him at what age?", "3 years",  "6 years", "4 years",  "3 years "));

        arraylist.add(new TriviaQuestion("In what year did Kohli join the west Delhi Cricket Academy?", "1995",  "1998", "1999",  "1998"));

        arraylist.add(new TriviaQuestion("At what age did Kohli first join a Cricket team?", "9",  "7", "12",  "9"));

        arraylist.add(new TriviaQuestion("Which people said Virat shouldn't waste his time in gully cricket?", "Family members",  "Friends", "Neighbour",  "neighbors"));

        arraylist.add(new TriviaQuestion("Kohli trained under who at West Delhi Cricket Academy?", "Raul Dravid",  "Rajkumar Sharma", "Sachin Tendulkar",  "Rajkumar Sharma"));

        arraylist.add(new TriviaQuestion("Kohli also played at which academy on his early days?", "Sunmeet Dogra Acamedy",  "Dehli  Cricket Team", "India Squad A",  "Sumeet Dogra Academy"));

        arraylist.add(new TriviaQuestion("What year did Kohli's father died ?", "2009",  "2008", "2006",  "2006"));

        arraylist.add(new TriviaQuestion("In which month did Kohli's father died?", "August",  "December", "November",  "December"));

        arraylist.add(new TriviaQuestion("Kohli's father died due to what? ", "Cancer",  "Heart-Attack", "Stroke",  "Stroke"));

        arraylist.add(new TriviaQuestion("What did Kohli say was his biggest support?", "His brother",  "His father", "His sister",  "His father "));

        arraylist.add(new TriviaQuestion("Which school did Kohli start schooling?", "India government Colledge",  "Vishal Bharti Public School", "Krishna basic School",  "Vishal Bharti Public School"));

        arraylist.add(new TriviaQuestion("When did Kohli's family moved away from meera Bagh?", "2013",  "2017", "2015",  "2015"));

        arraylist.add(new TriviaQuestion("Where did Kohli's family moved to after leaving Meera Bagh?", "Sri Lanka",  "Gurgaon", "Zimbabwe",  "Gurgaon"));

        arraylist.add(new TriviaQuestion("In what year did Kohli play for Delhi U/15 team?", "2004",  "2002", "2006",  "2002"));

        arraylist.add(new TriviaQuestion("How many run did Kohli made when he first played for Delhi U/15?", "180",  "172", "193",  "172"));

        arraylist.add(new TriviaQuestion("At what average did Kohli first play at U/15?", "34.4",  "64.82", "93.13",  "34.4"));

        arraylist.add(new TriviaQuestion("During which period did Virat fist became captain Delhi U/15 team?", "2008-2009",  "2003-2004", "2006-2007",  "2003-2004"));

        arraylist.add(new TriviaQuestion("For which runs did Kohli scored during his 2003-2004 U/15 captaincy?", "Polty Umrigar",  "India Squad A", "Uttam Nagar",  "Polly Umrigar"));

        arraylist.add(new TriviaQuestion("How many runs did Kohli first Become Delhi U/15 captain?", "400",  "390", "629",  "390"));

        arraylist.add(new TriviaQuestion("In how many innings did Kohli made his score during his Delhi 2003-04 U/15 captaincy?", "5",  "4", "2",  "5"));

        arraylist.add(new TriviaQuestion("At what average fid Virat made his scoreduring his Delhi 2003-04 U/15 captaincy?", "39",  "78", "42",  "78"));

        arraylist.add(new TriviaQuestion("When was Virat Kohli selected in the Delhi U/17 team?", "2006",  "late 2004", "Early 2007",  "late 2004"));

        arraylist.add(new TriviaQuestion("Which trophy was Kohli selected to play for on the Delhi U/17 team?", "Vijay Merchant Trophy",  "Asia Cup", "President xi trophy",  "Vijay Merchant Trophy"));


        arraylist.add(new TriviaQuestion("How many runs did Kohli first made in the Delhi U/17 team?", "583",  "672", "470",  "470"));

        arraylist.add(new TriviaQuestion("How many matches did Virat made his runs in the Delhi U/17 team?", "23",  "4", "16",  "4"));

        arraylist.add(new TriviaQuestion("At what average did Kohli made is 470 runs in the Delhi U/17 team?", "117.5",  "85.76", "123.64",  "117.5"));

        arraylist.add(new TriviaQuestion("What was Kohli's top score in the Delhi U/17 team?", "356",  "123", "251",  "251"));

        arraylist.add(new TriviaQuestion("How many centuries did Kohli made during his play in the Delhi U/17 team?", "2",  "3", "5",  "two"));

        arraylist.add(new TriviaQuestion("In the Delhi U/17 team, Kohli finished as the highest run-scorer with low many runs?", "757",  "857", "336",  "757"));

        arraylist.add(new TriviaQuestion("From how many matches dig Kohli finish as the highest run-scorer on the Delhi U/17 team?", "12",  "21", "7",  "7"));

        arraylist.add(new TriviaQuestion("At what average did Kohli finished as the highest run-scorer on yhe Delhi U/17 team?", "53.26",  "84.11", "57.23",  "84.11"));

        arraylist.add(new TriviaQuestion("In what year did Kohli first made his list A Debut?", "2010",  "2009", "2006",  "2006"));

        arraylist.add(new TriviaQuestion("For who did Kohli first made his list A debut?", "Dehli",  "Sri Lanka", "India Squad A",  "Delhi"));

        arraylist.add(new TriviaQuestion("Against which team did Kohli first made list A debut?", "India squad A",  "Services", "Dehli",  "services"));

        arraylist.add(new TriviaQuestion("When Kohli first made his list A debut, did he get to bat?", "No",  "Yes", "Maybe",  "No"));

        arraylist.add(new TriviaQuestion("In which month of the year did Kohli first made is list A debut?", "June",  "March", "February",  "February"));

        arraylist.add(new TriviaQuestion("In what year was Virat Kohli selected in the India U-19 squad?", "2009",  "2006", "2012",  "2006"));

        arraylist.add(new TriviaQuestion("In what month of the the year was Virat Kohli selected on the India?", "January",  "November", "July",  "July"));

        arraylist.add(new TriviaQuestion("On which tour was Kohli selected in the India U-19 squad?", "Test series",  "Sri Lanka tour", "Tour of England",  "Tour of England"));

        arraylist.add(new TriviaQuestion("What was Kohli's average in the three-matchh ODI series against England U-19?", "105",  "223", "164",  "105"));

        arraylist.add(new TriviaQuestion("What was Kohli's average on the three-match test against England U-19?", "25",  "53", "49",  "49"));

        arraylist.add(new TriviaQuestion("What was the name of Kohli's coach  when he played for the India U-19?", "Sachin Tendulkar",  "Lalchand Rajput", "Rahul Dravid",  "Lalchand Rajput"));

        arraylist.add(new TriviaQuestion("Which other series apart from the ODI series did the India U-19 win during Kohli's selection?", "List A",  "Asia Cup", "Test series",  "Test series"));

        arraylist.add(new TriviaQuestion("In what month of the the year did Kohli play for the India U-19 team touring Pakistan?", "September",  "October", "December",  "September"));

        arraylist.add(new TriviaQuestion("In what year did Kohli play for the India U-19 team touring Pakistan?", "2001",  "2012", "2006",  "2006"));

        arraylist.add(new TriviaQuestion("During the India U-19 Pakistan tour, What was Virat's average in the test series?", "43",  "22", "58",  "58"));

        arraylist.add(new TriviaQuestion("What was Kohli's average in the ODI series during the India U-19 Pakistan tour?", "41.66",  "23.13", "11.24",  "41.66"));

        arraylist.add(new TriviaQuestion("In what year did Virat Kohli made his first class debut for Delhi?", "2011",  "2010", "2006",  "2006"));

        arraylist.add(new TriviaQuestion("In which month of the year did Kohli made his first class debut for Delhi?", "November",  "January", "March",  "November"));

        arraylist.add(new TriviaQuestion("At what age did Kohli made his first-class debut for Delhi?", "19",  "22", "18",  "18"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in his first-class debut innings for Delhi?", "14",  "10", "23",  "10"));

        arraylist.add(new TriviaQuestion("In what year did Kohli decided to play for his team the day after his father's death?", "2006",  "2009", "2010",  "2006"));

        arraylist.add(new TriviaQuestion("In what month of the year did Kohli decided to play for his team the day his father's death?", "January",  "December", "August",  "December"));

        arraylist.add(new TriviaQuestion("Against which team did Kohli play a day after his father's death?", "Karnataka",  "Zimbabwe", "Services",  "Karmataka"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the match he played a day after his father's death?", "51",  "90", "83",  "90"));

        arraylist.add(new TriviaQuestion("Who was Virat's captain when he played for Delhi in the year 2006?", "Rahul Dravid",  "Jim Jones", "Mithun manhas",  "Mithun manhas"));

        arraylist.add(new TriviaQuestion("Who was Virat's coach when he played for Delhi in the year 2006?", "Tendulkar Dravid",  " Chetan Chauntan", "Prem Sachin",  "Chetan Chauntan"));

        arraylist.add(new TriviaQuestion("What was Kohli's total run in the 2006 season?", "187",  "289", "257",  "257"));

        arraylist.add(new TriviaQuestion("At what avearge did Kohli made his total runs for the 2006 season?", "36.71",  "43.67", "56.78",  "36.71"));

        arraylist.add(new TriviaQuestion("From how many matches did Kohli made his total runs for the 2006 season?", "4",  "8", "6",  "6"));

        arraylist.add(new TriviaQuestion("In what month of the year did Kohli made his Twenty 20 debut?", " April",  "June", "August",  "April"));

        arraylist.add(new TriviaQuestion("In what year did Virat Kohli made his Twenty 20 debut?", "2013",  "2007", "2014",  "2007"));

        arraylist.add(new TriviaQuestion("Kohli finished as the highest run-getter for his team on his appearance in the inter-state T201 championship in what year?", "2011",  "2008", "2007",  "2007"));

        arraylist.add(new TriviaQuestion("How many runs did Kohli make at his Twenty 20 Debut?", "179",  "186", "235",  "179"));

        arraylist.add(new TriviaQuestion("At what average did Kohli complete his Twenty 20 debut?", "89.43",  "34.67", "35.8",  "35.8"));

        arraylist.add(new TriviaQuestion("In July-August 2007, Kohli played for India U-19 team againnst which team?", "Sri Lanka",  "New Zealand", "Dehli",  "Sri-Lanka"));

        arraylist.add(new TriviaQuestion("Which series did Kohli play for the Bangladesh U-19?", "Test series",  "Tri-series", "ODI series",  "Tri-series"));

        arraylist.add(new TriviaQuestion("In July-August 2007, Kohli was ranked which highest run-getter?", "Fourth",  "Second", "First",  "Second"));

        arraylist.add(new TriviaQuestion("How many runs did Kohli make in his match against Sri Lanka in July-August 2007?", "263",  "154", "146",  "146"));

        arraylist.add(new TriviaQuestion("From how many matches did Kohli made his runs in July-August 2007?", "5",  "8", "4",  "5"));

        arraylist.add(new TriviaQuestion(" Following his match against the Sri Lanka in July-August 2007, which other series did Kohli play?", "List A",  "Test series", "Tri-series",  "Test series"));

        arraylist.add(new TriviaQuestion("How many runs did Kohli made in the series he played following his match against Sri Lanka in July-August 2007?", "287",  "243", "87",  "122"));

        arraylist.add(new TriviaQuestion("At what average did Kohli made his runs in the series he played after the Tri-series on July-August 2007?", "122",  "243", "87",  "122"));

        arraylist.add(new TriviaQuestion("At what average did Kohli made his runs in the series he played after the Tri-series on July-August 2007?", "2",  "5", "1",  "1"));

        arraylist.add(new TriviaQuestion("How many fifties did Kohli make in the series he played after the Tri-series in July-August 2007?", "1",  "4", "3",  "1"));

        arraylist.add(new TriviaQuestion("He is a very physical type of player who likes to impose himself on the game Who said about Kohli?", "India's Coach",  "India's Captain", "Dhoni",  "India's coach"));

        arraylist.add(new TriviaQuestion("He is a very physical type of player who likes to impose himself on the game Where was this said about Kohli?", "2008 Asia world cup",  "2008 U-19 world cup", "2010 Asia Cup",  "India's coach"));

        arraylist.add(new TriviaQuestion("In what country did Kohli captained the Indian team at the 2008 ICC U-19 cricket world cup?", "China",  "New Zealand", "Malaysia",  "Malaysia"));

        arraylist.add(new TriviaQuestion("What number did Kohli bat during the 2008 ICC U-19 cricket world cup?", "Number18",  "Number8", "Number4",  "Number4"));

        arraylist.add(new TriviaQuestion("In which month period did Kohli captained the Indian team at the 2008 ICC U-19 cricket world cup?", "February-March",  " May-June", "June-July",  "February-march"));

        arraylist.add(new TriviaQuestion("How many runs did Kohli score at the 2008 ICC U-19 world cup?", "265",  "356", "235",  "235"));

        arraylist.add(new TriviaQuestion("From how many matches did Virat Kohli score is runs in the 2008 ICC world cup?", "6 matches",  "8 matches", "12 matches",  "6 matches "));

        arraylist.add(new TriviaQuestion("At what average did Virat score is runs in the 2008 ICC world cup?", "47",  "54", "36",  "47"));

        arraylist.add(new TriviaQuestion("After completing the 2008 ICC U-19 world cup Virat had which position of the highest run-getter?", "Sixth",  "Second", "Third",  "Third"));

        arraylist.add(new TriviaQuestion("After completing the 2008 ICC U-19 world cup Kohli became one of the three batsman to score a century in how many tournaments?", "One",  "First", "Fourth",  "One"));

        arraylist.add(new TriviaQuestion("In February-March 2008, Virat had 100 runs from 74 balls against which team?", "South Africa",  "West Indies", "Zimbabwe",  "West Indies"));

        arraylist.add(new TriviaQuestion("In february-March 2008, Kohli's century against the west Indies gave India how many victory?", "120",  "67", "50",  "50"));

        arraylist.add(new TriviaQuestion("In February-March 2008, Kohli's century against the west indies earned him what?", "Highest goal scorer",  "Highest run scorer", "Man of the match",  "man of the match "));

        arraylist.add(new TriviaQuestion("Did Kohli pick up an injury in the February-March 2008 match against west Indies?", "Maybe",  "Yes", "No",  "Yes"));

        arraylist.add(new TriviaQuestion("In February-March 2008, what was Kohli's century against the west indies U-19 in the group stage called?", "The innings of the tournament",  "The best score", " The match saviour",  "The innings of the tournament "));

        arraylist.add(new TriviaQuestion("In feb-Mar 2008, who named Kohli's century against the west indies U-19 in the group stage?", "ESPN cricinfo",  "India's Captain", "India's Coach",  "ESPN cricinfo"));

        arraylist.add(new TriviaQuestion("In Feb-Mar 2008,U-19 ice cricket world cup, Virat led his team to play against which team in the Quarter finals?", "London",  "England", "New Zealand",  "England"));

        arraylist.add(new TriviaQuestion("In February-March 2008, U-19 cricket world cup, again who did Kohli led his team to the semi-finals?", "South Africa",  "New Zealand", "England",  "New Zealand"));

        arraylist.add(new TriviaQuestion("What was Kohli's position on the semi-final during the Feb-Mar 2008 U-19 world cup?", "3rd",  "7th", "2nd",  "2nd"));

        arraylist.add(new TriviaQuestion("From how many matches did Kohli made his runs in July-August 2007?", "43",  "45", "35",  "43"));

        arraylist.add(new TriviaQuestion("Also on Feb-Mar 2008 U-19 world cup smi-finals, what was Kohli awarded?", "Man of the match",  " Highest run scorer", "Man of the year",  "man of the match "));

        arraylist.add(new TriviaQuestion("Against who did Virat led his team to play the Feb-Mar 2008 U-19 world cup final?", "Cameroon",  "South Africa", "China",  "South Africa"));

        arraylist.add(new TriviaQuestion("What was Kohli score in the Feb-Mar 2008 U-19 world cup final?", "19",  "37", "20",  "19"));

        arraylist.add(new TriviaQuestion("Kohli led the India team to win the Feb-Mar 2008 world cup final by how many runs?", "14",  "12", "19",  "12"));

        arraylist.add(new TriviaQuestion("In what year was Kohli bought by the Royal Challengers Bangalore?", "2010",  "2012", "2008",  "2008"));

        arraylist.add(new TriviaQuestion("After which period was Kohli bought by the Royal Challengers Bangalore?", "After the U-19 world cup",  "After the 2012 Test series", " After 2008 Asia cup",  "After the U-19 world cup"));

        arraylist.add(new TriviaQuestion("At what price was Kohli bought by the Royal Challengers Bangalore?", "$34,000",  "$20,000", "$30,000",  "$30,000"));

        arraylist.add(new TriviaQuestion("On which type of contract was Virat Kohli awarded a scholarship?", "Youth contract",  "Basic contract", "Short-time Contrat",  "Youth contract"));

        arraylist.add(new TriviaQuestion("In what year was Kohli awarded a scholarship?", "2008",  "2009", "2010",  "2008"));

        arraylist.add(new TriviaQuestion("In what month of the year was Kohli awarded a scholarship?", "September",  "June", "May",  "June"));

        arraylist.add(new TriviaQuestion("What was the name of the scholarship awarded to Virat Kohli?", "Border-Gavaskar",  "President Scholarship", "Chetan Chauntan",  "Border-Gavaskar"));

        arraylist.add(new TriviaQuestion("The scholarship awarded to Kohli allowed him to train how many weeks?", "Seven weeks",  "Three weeks", "Six weeks",  "Six weeks"));

        arraylist.add(new TriviaQuestion("The Scholarship awarded to Kohli allowed him to train in which centre?", "Cricket Australia's centre",  "India cricket training ground", "Melbourne stadium",  "Cricket Australia's centre"));

        arraylist.add(new TriviaQuestion("In what month of the year was Virat Kohli included the India's 30-man probable squad?", "February",  "July", "March",  "July"));

        arraylist.add(new TriviaQuestion("In what year was Virat Kohli Included in the India's 30-man probable squad?", "2009",  "2008", "2011",  "2008"));

        arraylist.add(new TriviaQuestion("For which trophy, was Kohli included in the India's 30-man probable squad?", "Asia cup",  "ICC champions Trophy", "President xi trophy",  "ICC champions Trophy"));

        arraylist.add(new TriviaQuestion("In which country did Kohli played with the 30-man India probable squad for the 2008 Champions Trophy?", "South Africa",  "China", "Pakistan",  "Pakistan"));

        arraylist.add(new TriviaQuestion("Virat was picked in the India Emergency players squad for which tournament ?", "4-team emergency players tournament",  "List A", "Sri Lanka tour",  "4-team emergency players tournament"));

        arraylist.add(new TriviaQuestion("In which country did Kohli played in the 4 team emergency players tournament?", "Zimbabwe",  "Australia", "Asia",  "Australia"));


        arraylist.add(new TriviaQuestion("How many runs did Kohli score in the 4-team emergency players tournament?", "143",  "117", "206",  "206"));

        arraylist.add(new TriviaQuestion("At what average did Kohli score his runs in the 4-team emergency players tournament?", "41.2",  "21.4", "15.6",  "41.2"));

        arraylist.add(new TriviaQuestion("From how many matches did Kohli score his runs in the 4-team emergency players tournament?", "4 matches",  "9 matches", "6 matches",  "6 matches"));

        arraylist.add(new TriviaQuestion("In what year did Kohli play the 4-team emergency players tournament?", "2008",  "2011", "2012",  "2008"));

        arraylist.add(new TriviaQuestion("In which month of the year did Kohli play the 4-team emergency players tornament?", "March",  "July", "August",  "July"));

        arraylist.add(new TriviaQuestion("In what month of the year did Kohli play in Pakistan with the India's 30-man probable squad?", "September",  "January", "December",  "September"));

        arraylist.add(new TriviaQuestion("In what year was Kohli included in the Indian ODI squad for tour of Sri Lanka?", "2008",  "2007", "2006",  "2008"));

        arraylist.add(new TriviaQuestion("In which month of the year was Kohli included in the Indian ODI squad for tour of Sri Lanka?", "August",  "September", "July",  "August"));

        arraylist.add(new TriviaQuestion("Before the Sri Lanka tour in 2008, how many List A matches had Kohli played?", "13",  "6", "8",  "8"));

        arraylist.add(new TriviaQuestion("What was Kohli's selection to the Sri Lanka tour called?", "Surprise call-up",  "successful selection", "Unexpected call up",  "Surprise call-up"));

        arraylist.add(new TriviaQuestion("Throughout the Sri Lamka tour, how did Virat Kohli batted?", "As a left handler",  "Make Shift Opener", "A Bowler",  "Make Shift Opener"));

        arraylist.add(new TriviaQuestion("What age did Kohli made his first International appearance?", "19",  "23", "18",  "19"));

        arraylist.add(new TriviaQuestion("In what year did Kohli made his first international appearance?", "2012",  "2011", "2008",  "2008"));

        arraylist.add(new TriviaQuestion("In what month of the year did Kohli made his first international appearance?", "July",  "August", "March",  "August"));

        arraylist.add(new TriviaQuestion("In which series did Virat made his first international appearnce?", "Test series",  "ODI series", "Tri-series",  "ODI series"));

        arraylist.add(new TriviaQuestion("In what year did Kohli made his first ODI half century?", "2008",  "2012", "2010",  "2008"));

        arraylist.add(new TriviaQuestion("What was Kohli's score whwn he made his ODI half century?", "45",  "54", "65",  "54"));

        arraylist.add(new TriviaQuestion("In which match did Kohli first made his ODI half century?", "Fourth",  "Third", "Second",  "Fourth "));

        arraylist.add(new TriviaQuestion("What was Kohli's score on the first match of his ODI debut?", "18",  "12", "20",  "12"));

        arraylist.add(new TriviaQuestion("What was Virat's  score in the third match of his ODI debut?", "25",  "30", "18",  "25"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the second match of his ODI debut match?", "56",  "45", "37",  "37"));

        arraylist.add(new TriviaQuestion("Virat Kohli helped India to win it's first ODI series against which country?", "Sri Lanka",  "Dehli", "South Africa",  "Sri Lanka"));

        arraylist.add(new TriviaQuestion("By how many score did Kohli help India to win it's first ODI series?", "52",  "53", "54",  "54"));

        arraylist.add(new TriviaQuestion("In the 2008 un-official tests for who was Kohli picked as replacement?", "Shikhar Dhawan",  "Dhoni", "Sachin Tendulkar",  "Shikhar Dhawan"));

        arraylist.add(new TriviaQuestion("Against which team did Kohli join the Indis A squad to paly the 2008 un-official tests?", "Nigeria",  "Australia", "Antartica",  "Australia A"));

        arraylist.add(new TriviaQuestion("How many times did Kohli batted in the 2008 un-official tests?", "twice",  "thrice", "once",  "once"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the 2008 un-official tests?", "49",  "12", "30",  "49"));

        arraylist.add(new TriviaQuestion("In September 2008, Kohli palyed for Delhi in the Nissar Trophy against which team?", "SNGPL",  "India Squad A", "Dehli Cricket Team",  "SNGPL"));

        arraylist.add(new TriviaQuestion("What was Kohli 's score in both innings of the 2008 Nissar Trophy?", "43 and 54",  "52 and 197", "45 and 76",  "52 and 197"));

        arraylist.add(new TriviaQuestion("In what year did Kohli play for the India Board President's XI?", "2009",  "2007", "2008",  "2008"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli play for the Indian Board President's XI?", "New Zealand",  "Australia", "Europe",  "Austrailia"));

        arraylist.add(new TriviaQuestion("In which month of the year did kohli play for the Indian Board President XI?", "August",  "October", "January",  "October"));

        arraylist.add(new TriviaQuestion("In year 2008, Kohli was included in the squad for the home ODI series against which country?", "England",  "Germany", "New Zealand",  "England"));

        arraylist.add(new TriviaQuestion("Was Kohli given a chance to play in the 2008 home ODI series?", "No",  "Yes", "Maybe",  "No"));

        arraylist.add(new TriviaQuestion("In what year was Kohli given a Grade D contract in the BCCI contract list?", "2010",  "2006", "2008",  "2008"));

        arraylist.add(new TriviaQuestion("In which month of the year was kohli given a Grade D contract in the BCCI contract list?", "November",  "December", "August",  "December"));

        arraylist.add(new TriviaQuestion("The BCCI Grade D contract entitled kohli to receive how many Rs?", "3lakh",  "10lakh", "15lakh",  "15lakh"));

        arraylist.add(new TriviaQuestion("In what year did Virat Kohli scored his second ODI century?", "2009",  "2010", "2008",  "2010"));

        arraylist.add(new TriviaQuestion("Against which country did kohli score his second ODI century?", "China",  "Bangladesh", "England",  "Bangladesh"));

        arraylist.add(new TriviaQuestion("In what year did Kohli became the third Indian batsman to score two ODI centuries before 22nd birthday?", "2010",  "2012", "2006",  "2010"));

        arraylist.add(new TriviaQuestion("At what age did Virat score his second ODI century?", "18",  "21", "25",  "21"));

        arraylist.add(new TriviaQuestion("What was Kohli's score against Bangladesh in the 2010 Tri-nation ODI tournament?", "100",  "84", "91",  "91"));

        arraylist.add(new TriviaQuestion("What was Kohli's score against Sri Lankan in the 2010 Tri-nation ODI tournament?", "71",  "82", "102",  "71"));

        arraylist.add(new TriviaQuestion("How many runs did Kohli made in the 2010 Tri-nation ODI tournament finals?", "6",  "4", "2",  "2"));

        arraylist.add(new TriviaQuestion("Against which team did Kohli play the 2010 Tri-nation ODI tournament finals?", "Dehli",  "Sri Lankan", "New Zealand",  "Sri Lankan"));

        arraylist.add(new TriviaQuestion("Kohli finished the Tri-nations ODI tournament with how many runs?", "275",  "280", "200",  "275"));

        arraylist.add(new TriviaQuestion("At what average did Kohli finished the 2010 Tri-nation ODI tournament as the leading run getter?", "55.55",  "97.4", "91.66",  "91.66"));

        arraylist.add(new TriviaQuestion("From how many innings did Kohli finished the 2010 Tri-nation ODI tournament as the leading run getter?", "5",  "7", "10",  "5"));

        arraylist.add(new TriviaQuestion("In how many game did Kohli bat in the february 2010 Three-match ODI series?", "2",  "4", "6",  "2"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli bat in the february 2010 Three-match ODI series?", "Cameroon",  "England", "South Africa",  "South Africa"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in his first game of the february 2010 Three-match ODI series?", "59",  "31", "45",  "31"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in his second game of the february 2010 Three-match ODI series?", "57",  "63", "45",  "57"));

        arraylist.add(new TriviaQuestion("In what year was Kohli named the vice-captain for the Tri-series against Sri Lankan and Zimbabwe?", "2010",  "2008", "2009",  "2010"));

        arraylist.add(new TriviaQuestion("In which month period was Kohli named the vice-captain for the Tri-series against Sri Lankan and Zimbabwe?", "July-August",  "Jan-Feb", "May-June",  "May-June"));

        arraylist.add(new TriviaQuestion("How many runs in total did Kohli make at the Tri-series against Sri Lankan and Zimbabwe?", "168",  "134", "201",  "168"));

        arraylist.add(new TriviaQuestion("From what average did kohli made his runs in the Tri-series against Sri Lankan and Zimbabwe?", "35.66",  "36.87", "42",  "42"));

        arraylist.add(new TriviaQuestion("How many fifties did Kohli made in the Tri-series against Sri Lankan and Zimbabwe?", "6",  "2", "3",  "2"));

        arraylist.add(new TriviaQuestion("During which month period did Kohli become the fastest Indian batsman to reach 1,000 runs in ODI cricket?", "May-june",  "Feb-March", "June-July",  "May-June"));

        arraylist.add(new TriviaQuestion("In what year did Kohli became the fastest Indian to reach 1,000 runs in the ODI cricket?", "2009",  "2015", "2010",  "2010"));

        arraylist.add(new TriviaQuestion("How many runs in total did Kohli score in the 2010 Asia cup?", "102",  "67", "85",  "67"));

        arraylist.add(new TriviaQuestion("At what average did Kohli made his total score in the 2010 Asia cup?", "16.75",  "43.26", "20.56",  "16.75"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli made his T20I debut?", "New Zealand",  "South Africa", "Zimbabwe",  "Zimbabwe"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in his T20I debut?", "35",  "26", "29",  "26"));

        arraylist.add(new TriviaQuestion("In which city did Kohli play his T20I debut?", "Mali",  "Harare", "New York",  "Harare"));

        arraylist.add(new TriviaQuestion("From how many matches did Kohli score his runs to become Indian's leading run-scorer in ODIs in 2010?", "23",  "30", "25",  "25"));

        arraylist.add(new TriviaQuestion("What was Kohli's average in the 2010 Tri-series against Sri Lankan and New Zealand?", "15",  "17", "23",  "15"));

        arraylist.add(new TriviaQuestion("In what year did Kohli score his third ODI century?", "2009",  "2006", "2010",  "2010"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli score his third ODI century?", "Sri Lankan",  "Australia", "Europe",  "Australia"));

        arraylist.add(new TriviaQuestion("In what year did Kohli score his fourth ODI century?", "2010",  "2007", "2009",  "2010"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli score his fourth ODI century?", "India",  "Zimbabwe", "New Zealand",  "New Zealand"));

        arraylist.add(new TriviaQuestion("With how many runs, did Kohli become India's leading run-scorer in ODIs in 2010?", "995",  "1007", "867",  "995"));

        arraylist.add(new TriviaQuestion("At what average did Kohli score his runs to become India's leading run-scorer in ODIs in 2010?", "76.43",  "47.38", "37.48",  "47.38"));

        arraylist.add(new TriviaQuestion("How many centuries did Kohli score to become India's leading run-scorer in ODIs in 2010?", "1",  "5", "3",  "3"));

        arraylist.add(new TriviaQuestion("What was Virat runs in the five-match ODI series of the South African Tour in January 2011?", "193",  "145", "209",  "193"));

        arraylist.add(new TriviaQuestion("At what average did Virat Kohli made his runs in the five-match ODI series of the South African Tour in January 2011?", "36.76",  "48.25", "56.64",  "48.25"));

        arraylist.add(new TriviaQuestion("How many fifties did Virat score in the five-match ODI series of the South African Tour in January 2011?", "2",  "4", "6",  "2"));

        arraylist.add(new TriviaQuestion("In which year did Virat Kohli made his world cup debut?", "2009",  "2011", "2012",  "2011"));

        arraylist.add(new TriviaQuestion("In which year did Virat Kohli become the first Indian batsman to score a century in world cuo debut?", "2011",  "2016", "2014",  "2011"));

        arraylist.add(new TriviaQuestion("In which year did Virat Kohli score his fifth ODI century?", "2009",  "2008", "2011",  "2011"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli score his fifth ODI century?", "China",  "Bangladesh", "New Zealand",  "Bangladesh"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli play the 2011 world cup quarter-finals for India?", "Asia",  "Australia", "England",  "Australia"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the 2011 world cup quaterfinals?", "24",  "22", "18",  "24"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli play the 2011 world cup semi-finals for India?", "New Zealand",  "Bangladesh", "Pakistan",  "Pakistan"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli play the 2011 world cup finals for India?", "Delhi",  "Sri Lankan", "Bangladesh",  "Sri Lankan"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the 2011 world cup finals?", "43",  "56", "35",  "35"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the 2011 world cup semi-finals?", "9",  "15", "6",  "9"));

        arraylist.add(new TriviaQuestion("In the 2011 world cup, what was Kohli's score against West Indies?", "43",  "52", "59",  "59"));

        arraylist.add(new TriviaQuestion("In which month of the year was Kohli born?", "January",  "September", "November",  "November"));

        arraylist.add(new TriviaQuestion("In which year did Kohli score his maiden test century?", "2012",  "2016", "2009",  "2012"));

        arraylist.add(new TriviaQuestion("How many fifties did Virat score in the 2012 Common Wealth Bank Triangular series?", "4",  "2", "6",  "2"));

        arraylist.add(new TriviaQuestion("Against which team did Kohli made his fifties in the 2012 Common Wealth Bank Triangular series?", "Bangladesh",  "Sri Lankan", "New Zealand",  "Sri Lankan"));

        arraylist.add(new TriviaQuestion("In what year did Kohli made his eleventh ODI century?", "2008",  "2014", "2012",  "2012"));

        arraylist.add(new TriviaQuestion("Virat Kohli finished the 2012 Asia cup as the leading run-scorer by how many runs?", "450",  "350", "269",  "350"));

        arraylist.add(new TriviaQuestion("At what average did Kohli finish the 2012 Asia cup as the leading run-scorer?", "89",  "165", "119",  "119"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the opening match against Sri Lankan of the 2012 Asia cup?", "108",  "74", "118",  "108"));

        arraylist.add(new TriviaQuestion("In the final group stage match of the 2012 Asia cup against Pakistan, what was Kohli's score? ", "185",  "183", "234",  "183"));

        arraylist.add(new TriviaQuestion("How many centuries did Kohli made in July-August 2012 In the five-match ODI tour of Sri Lankan?", "2",  "6", "1",  "2"));

        arraylist.add(new TriviaQuestion("In what year did Kohli score his first T20I fifty?", "2009",  "2012", "2010",  "2012"));

        arraylist.add(new TriviaQuestion("In what year did Kohli score his second Test century?", "2006",  "2009", "2012",  "2012"));

        arraylist.add(new TriviaQuestion("In which city did Kohli score his second Test century?", "Bangalore",  "Bangladesh", "Delhi",  "Bangalore"));

        arraylist.add(new TriviaQuestion("During which Tournament did Virat score his second Test century?", "Asia world cup",  "ICC world Twenty20", "New Zealand's tour of England",  "New Zealand's tour of England"));

        arraylist.add(new TriviaQuestion("During which Tournament did Virat won his first Test cricket man of the match award?", "Test series",  "New Zealand's tour of England", "ODI series",  "New Zealand's tour of England"));

        arraylist.add(new TriviaQuestion("How many fifties did Kohli score during the 2012 ICC world Twenty20?", "4",  "5", "2",  "2"));

        arraylist.add(new TriviaQuestion("Kohli finished the 2012 ICC world Twenty20 by how many runs?", "100",  "185", "235",  "185"));

        arraylist.add(new TriviaQuestion("From how many matches did Kohli score his total runs in the 2012 ICC world Twenty20?", "5",  "12", "8",  "5"));

        arraylist.add(new TriviaQuestion("At what average di Virat finished the 2012 ICC world Twenty20?", "57.56",  "35.56", "46.25",  "46.25"));

        arraylist.add(new TriviaQuestion("Against Pakistan in the December 2012 T20I series, what was Kohli's average?", "15",  "18", "24",  "18"));

        arraylist.add(new TriviaQuestion("Against Pakistan, what was Kohli's average in the December 2012 ODI series?", "4.33",  "34.56", "46.25",  "46.25"));

        arraylist.add(new TriviaQuestion("Virat finished his December 2012 ODI series with how many runs?", "190",  "155", "235",  "155"));

        arraylist.add(new TriviaQuestion("At what average did Kohli finish his December 2012 ODI series?", "34.57",  "38.75", "34.65",  "38.75"));

        arraylist.add(new TriviaQuestion("In what year did Kohli score his fourth Test century?", "2011",  "2014", "2013",  "2013"));

        arraylist.add(new TriviaQuestion("In which city did Kohli score his fourth Test century?", "Chennai",  "New York", "Delhi",  "Chennai"));

        arraylist.add(new TriviaQuestion("Against which team did Kohli score his fourth Test century?", "New Zealand",  "New York", "Australia",  "Australia"));

        arraylist.add(new TriviaQuestion("What was Kohli's average at the end of the February 2013 home Test series?", "56.8",  "45.37", "36.28",  "56.8"));

        arraylist.add(new TriviaQuestion("How many runs did Kohli score in the first game of the July 2013 five-match ODI tour?", "96",  "115", "156",  "115"));

        arraylist.add(new TriviaQuestion("In what year did Virat score the third fastest India batsman ODI century?", "2013",  "2009", "2014",  "2013"));

        arraylist.add(new TriviaQuestion("In 2013, Kohli became the world fastest batsman to score how many hundreds in ODI cricket?", "19",  "26", "17",  "17"));

        arraylist.add(new TriviaQuestion("How many times did Kohli batted in the 2013 two-match Test series?", "Five times",  "Twice", "Once",  "Twice"));

        arraylist.add(new TriviaQuestion("Against which team did Kohli batted in the 2013 two-match Test series?", "South Africa",  "Madagascar", "West Indies",  "West Indies"));

        arraylist.add(new TriviaQuestion("In which year did Virat equalled Viv Richards record of becoming the fastest batsmen to make 5,000 runs in ODI cricket?", "2011",  "2013", "2009",  "2013"));

        arraylist.add(new TriviaQuestion("In which of Kohli's innings did he equal Viv Richards record?", "114th",  "52nd", "135th",  "114th"));

        arraylist.add(new TriviaQuestion("With how many runs did Kohli finish the 2013 three-match ODI series?", "195",  "235", "204",  "204"));

        arraylist.add(new TriviaQuestion("At what average did Kohli finish the 2013 three-match ODI series?", "37.93",  "68", "45.67",  "68"));

        arraylist.add(new TriviaQuestion("Did Kohli finish the 2013 three-match ODI series as the leading run getter?", "Yes",  "Maybe", "No",  "Yes"));

        arraylist.add(new TriviaQuestion("What was Kohli's score during India's opening match of the year 2014 ICC world Twenty20?", "36",  "45", "56",  "36"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli made a top score during the India's opening match of the 2014 ICC world Twenty20?", "New Zealand",  "China", "Pakistan",  "Pakistan"));

        arraylist.add(new TriviaQuestion("During the India's march against West Indies in the 2014 ICC world Twenty20, what was Kohli's score?", "65",  "54", "46",  "54"));

        arraylist.add(new TriviaQuestion("During the India's match against Bangladesh, in the 2014 ICC world Twenty20, what was Kohli's score?", "59",  "57", "47",  "47"));

        arraylist.add(new TriviaQuestion("What was Kohli's score during the India's 2014 ICC world Twenty semi-finals?", "45",  "110", "72",  "72"));

        arraylist.add(new TriviaQuestion("In the finals against Sri Lankan during the 2014 ICC world Twenty20, what was Virat's score?", "77",  "83", "126",  "77"));

        arraylist.add(new TriviaQuestion("What was Kohli's total runs in the 2014 ICC world Twenty20?", "364",  "319", "564",  "319"));

        arraylist.add(new TriviaQuestion("At what average did Kohli finish the 2014 ICC world Twenty20?", "106.33",  "36.56", "130.45",  "106.33"));

        arraylist.add(new TriviaQuestion("In what year did Kohli score his 20th ODI century?", "2011",  "2013", "2014",  "2014"));

        arraylist.add(new TriviaQuestion("In which city did Kohli score his 20th ODI century?", "Zimbabwe",  "Delhi", "Dharamsala",  "Dharamsala"));

        arraylist.add(new TriviaQuestion("At what age did Kohli made his first ODI century?", "20",  "23", "21",  "20"));

        arraylist.add(new TriviaQuestion("Virat Kohli was how many years old when he scored his second ODI century?", "21",  "20", "23",  "21"));

        arraylist.add(new TriviaQuestion("In what year did Kohli become the fastest batman in the world to go past the 6,000-run mark in the ODIs?", "2012",  "2014", "2016",  "2014"));

        arraylist.add(new TriviaQuestion("During which series did Kohli become the second player in the world to make more than 1000 runs in the ODIs for four consecutive calendar years?", "Test series",  "October 2014 ODI series", "Tri-nation series",  "October 2014 ODI series"));

        arraylist.add(new TriviaQuestion("How many runs did Kohli made in the 2014 ODI series?", "1946",  "1000", "1054",  "1054"));

        arraylist.add(new TriviaQuestion("At what average did Kohli complete the 2014 ODI series?", "58.55",  "49.38", "61.47",  "58.55"));

        arraylist.add(new TriviaQuestion("In what year did Kohli become the test captain for the first time?", "2010",  "2014", "2012",  "2014"));

        arraylist.add(new TriviaQuestion("During the first Test of the Australian tour in December 2014, what was Kohli's score in India's first innings?", "76",  "137", "115",  "115"));

        arraylist.add(new TriviaQuestion("What is Kohli's position on the list of Indians to score a hundred on Test captaincy Debut?", "1st",  "4th", "2nd",  "4th"));

        arraylist.add(new TriviaQuestion("Why was Kohli appointed as the full-time Test captain?", "Dhoni retired",  "He scored a century", "He made many runs",  "Dhoni retired"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the first innings of his second time Test captaincy?", "147",  "99", "185",  "147"));

        arraylist.add(new TriviaQuestion("Kohli became the first batsman in Test cricket history to score three hundreds in his first three as Test captain in what year?", "2014",  "2012", "2010",  "2014"));

        arraylist.add(new TriviaQuestion("During the 2015 world cup, what was Kohli's score in the match against Pakistan?", "136",  "107", "63",  "107"));

        arraylist.add(new TriviaQuestion("In what year did Kohli receive his 20th man of the match award in ODI series?", "2011",  "2016", "2015",  "2015"));

        arraylist.add(new TriviaQuestion("During the 2015 world cup, what was Kohli's score in the match against Zimbabwe?", "38",  "45", "57",  "38"));

        arraylist.add(new TriviaQuestion("Kohli made a score of 44 in the 2010 world cup against which team?", "Island",  "Ire Land", "Jamaica",  "Ire Land"));

        arraylist.add(new TriviaQuestion("Kohli received his first world cup man of the match award in what year?", "2009",  "2013", "2015",  "2015"));

        arraylist.add(new TriviaQuestion("In which tour did Kohli score his 11th Test century?", "Test series",  "Sri Lankan tour", "ODI series",  "Sri Lankan tour"));

        arraylist.add(new TriviaQuestion("In what year did Kohli score his 11 Test century?", "2015",  "2013", "2011",  "2015"));

        arraylist.add(new TriviaQuestion("During which tour did Kohli become the fastest batsman in the world to make 1000 runs in the T20I cricket?", "South Africa's tour",  "Sri Lankan tour", "ICC world tournament",  "South Africa's tour"));

        arraylist.add(new TriviaQuestion("At what age did Kohli score his 11th Test century?", "56",  "45", "26",  "26"));

        arraylist.add(new TriviaQuestion("What was Kohli's total run in the 2015 four-match Test series?", "200",  "101", "158",  "200"));

        arraylist.add(new TriviaQuestion("At what average, did Kohli finished the 2015 four-match Test series?", "43.65",  "33.33", "24.55",  "33.33"));

        arraylist.add(new TriviaQuestion("In what year did Kohli become the fastest batman in the world to cross the 7,000 run mark in the ODIs?", "2015",  "2017", "2016",  "2016"));

        arraylist.add(new TriviaQuestion("During which series did Kohli become the fastest batsman in the world to cross the 7000 run mark in ODIs?", "Limited-overs tour of Australia",  "Sri Lankan tour", "South Africa's tour",  "Limited-overs tour of Australia"));

        arraylist.add(new TriviaQuestion("In what year did Virat Kohli become the fastest to get to 25 centuries in the ODI cricket?", "2016",  "2013", "2012",  "2016"));

        arraylist.add(new TriviaQuestion("How many fifties did Kohli make in the 2016 T20I series?", "2",  "3", "6",  "3"));

        arraylist.add(new TriviaQuestion("How many man of the match award did Kohli receive during the 2016 T20I series?", "6",  "4", "2",  "2"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the 2016 Asia cup final?", "38",  "50", "41",  "41"));

        arraylist.add(new TriviaQuestion("Against which country did Kohli score an unbeaten 56 in the 2016?", "Delhi",  "Sri Lankan", "Zimbabwe",  "Sri Lankan"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in his first Test in the West Indies since his debut series?", "100",  "200", "195",  "200"));

        arraylist.add(new TriviaQuestion("In which city did Kohli play his first Test match in West Indies since his debut?", "Delhi",  "Antigua", "Ire Land",  "Antigua"));

        arraylist.add(new TriviaQuestion("In what year did Kohli score his first double hundred in the first-class cricket?", "2017",  "2014", "2016",  "2016"));

        arraylist.add(new TriviaQuestion("What was Kohli's score in the 2016 ICC world Twenty20 semi-final?", "89",  "76", "102",  "89"));

        arraylist.add(new TriviaQuestion("What was Virat's total run in the 2016 ICC world Twenty20?", "273",  "345", "457",  "273"));

        arraylist.add(new TriviaQuestion("At what average did Kohli finished the 2016 ICC world Twenty20?", "78.49",  "35.47", "136.5",  "136.5"));

        arraylist.add(new TriviaQuestion("From how many matches did Kohli made his total runs in the 2016 ICC world Twenty20?", "12",  "5", "8",  "5"));

        arraylist.add(new TriviaQuestion("Against which team did kohli score another double hundred in the first-class cricket?", "Zimbabwe",  "New Zealand", "England",  "New Zealand"));

        arraylist.add(new TriviaQuestion("In which city did Kohli score his second double hundred in the first-class cricket?", "Delhi",  "Antigua", "Indore",  "Indore"));

        arraylist.add(new TriviaQuestion("In what year did  Kohli made his second highest ODI score?", "2016",  "2017", "2012",  "2016"));

        arraylist.add(new TriviaQuestion("In which city did Kohli made his second highest ODI score?", "Mohali",  "Mali", "Delhi",  "Mohali"));

        arraylist.add(new TriviaQuestion("In what year did Kohli became the first batsman to score double centuries in four consecutive series?", "2017",  "2014", "2012",  "2017"));

        arraylist.add(new TriviaQuestion("By scoring double centuries in four consecutive series, Kohli broke the record of which Australian?", "Rahul Dravid",  "Donald Bradman", "Sachin Tendulkar",  "Donald Bradman"));

        arraylist.add(new TriviaQuestion("In what year did Kohli score his highest Test score?", "2014",  "2016", "2017",  "2017"));

        arraylist.add(new TriviaQuestion("Against which team did Kohli score his highest Test score?", "Australia",  "Zimbabwe", "England",  "England"));

        arraylist.add(new TriviaQuestion("By scoring double centuries in four consecutive series, Kohli broke the record of which Indian?", "Sachin Tendulkar",  "Rahul Dravid", "James Rodrigueze",  "Rahul Dravid"));

        arraylist.add(new TriviaQuestion("As at october 2017, what was Kohli's total runs for the ODI series?", "5,735",  "8,888", "10,000",  "8,888"));

        arraylist.add(new TriviaQuestion("As at october 2017, what was Kohli's total batting average for the ODI series?", "55.55",  "55.63", "35.46",  "55.55"));

        arraylist.add(new TriviaQuestion("What is the total number of centuries Virat scored in the ODI series as of November 2017?", "31",  "20", "45",  "31"));

        arraylist.add(new TriviaQuestion("From how many ODI series did Kohli made his highest number of centuries?", "200",  "205", "354",  "200"));

        arraylist.add(new TriviaQuestion("In which year did Kohli made his most recent ODI record?", "2017",  "2016", "2014",  "2017"));

        arraylist.add(new TriviaQuestion("Kohli is naturally which type of man?", "Cool",  "Aggresive", "Disciplined",  "Aggresive"));

        arraylist.add(new TriviaQuestion("Kohli is one of the best Limited-overs batsmen in the world?", "FALSE",  "TRUE", "NO",  "TRUE"));

        arraylist.add(new TriviaQuestion("Why is Kohli often compared to Tendulkar?", "Batting similaritie",  "They look alike", "They are brothers",  "Batting Similarities"));

        arraylist.add(new TriviaQuestion("Kohli is referred to sometimes as whose successor?", "Sachin Tendulkar",  "Rahul Dravid", "James Rodrigueze",  "Sachin Tendulkar"));

        arraylist.add(new TriviaQuestion("Who did Kohli say was his role model while growing up as a kid?", "C.Ronaldo",  "Donald Bradman", "Sachin Tendulkar",  "Sachin Tendulkar"));

        arraylist.add(new TriviaQuestion("Who called Virat Kohli the new king of world cricket?", "Sachin Tendulkar",  "Dean Jones", "Rahul Dravid",  "Dean Jones"));

        arraylist.add(new TriviaQuestion("In what year did Vivian Richards said that Kohli was already Legendary?", "2014",  "2015", "2012",  "2015"));

        arraylist.add(new TriviaQuestion("In what year did Kohli became the fastest in the world to reach 15,000 international runs?", "2017",  "2016", "2015",  "2017"));

        arraylist.add(new TriviaQuestion("Kohli became the fastest Indian to score 25 centuries in what year?", "2008",  "2012", "2016",  "2016"));

        arraylist.add(new TriviaQuestion("From how many matches did Kohli score 15,000 international runs?", "304",  "356", "254",  "304"));

        arraylist.add(new TriviaQuestion("Kohli was picked as replacement for who in the India A squad for the unofficial Test against Australia A?", "Rahul Dravid",  "Sachin Tendulkar", "Shikhar Dhawan",  "Shikhar Dhawan"));

        arraylist.add(new TriviaQuestion("How many times did Kohli batted in the two-match series of the 2008 unofficial Test against Australia A?", "Twice",  "Once", "Thrice",  "Once"));

        arraylist.add(new TriviaQuestion("In what year did Kohli got involved in a relationship with an actress?", "2013",  "2016", "2011",  "2013"));

        arraylist.add(new TriviaQuestion("What was Virat Kohli second favourite sport?", "Cricket",  "Football", "Tennis",  "Football"));

        arraylist.add(new TriviaQuestion("In what year did Kohli become a co-owner of a Football club?", "2014",  "2016", "2015",  "2014"));

        arraylist.add(new TriviaQuestion("Kohli is a co-owner of which Tenis club?", "Kohli Tennis Club",  "UAE Royals", "Fc GOA",  "UAE Royals"));

        arraylist.add(new TriviaQuestion("In what year did Kohli become a co-owner of a Tennis club?", "2014",  "2015", "2012",  "2015"));

        arraylist.add(new TriviaQuestion("In what year was Kohli announced as an ambassador of the sport convo based in London?", "2009",  "2011", "2014",  "2014"));

        arraylist.add(new TriviaQuestion("Together with which business group did Kohli started a Children Fitness Venture?", "Stepathlon Lifestyle",  "Tendulkar Inc.", "Sports Agent",  "Stepathlon Lifestyle"));

        arraylist.add(new TriviaQuestion("In what year did Kohli started a Children Fitness Ventrure?", "2016",  "2015", "2011",  "2016"));

        arraylist.add(new TriviaQuestion("After the 2008 U-19 world cup, Kohli was signed up by which Agent?", "Stepathlon Lifestyle",  "Fc GOA", "Sports Agent",  "Sports Agent"));

        arraylist.add(new TriviaQuestion("In 2014, what was the estimation of Kohli's brand value?", "US$58million",  "US$56.4million", "US$48million",  "US$56.4million"));

        arraylist.add(new TriviaQuestion("Which UK based magazine rated Kohli as the second most marketable athelete in the world?", "Punch News",  "Sports Agent", "Sports Pro",  "Sports Pro"));

        arraylist.add(new TriviaQuestion("In 2016, what was the estimation of Kohli's brand value?", "US$103million",  "US$56.4million", "US$92million",  "US$92million"));

        arraylist.add(new TriviaQuestion("How many matches did it take Kohli to score 25 ODI centuries?", "97",  "173", "162",  "162"));

        arraylist.add(new TriviaQuestion("Virat Kohli became the quickest to score 30 ODI centuries in which year?", "2012",  "2017", "2015",  "2017"));

        arraylist.add(new TriviaQuestion("How many matches did it take Kohli to score 30 ODI centuries?", "194",  "200", "162",  "194"));

        arraylist.add(new TriviaQuestion("Kohli scored is 30th ODI century against which team?", "Zimbabwe",  "Delhi", "Sri Lankan",  "Sri Lankan"));

        arraylist.add(new TriviaQuestion("In what year did Virat Kohli received the Padma Shri Award?", "2017",  "2012", "2010",  "2017"));

        arraylist.add(new TriviaQuestion("In which month of the year did Kohli receive the Padma Shri Award?", "February",  "December", "March",  "March"));

        arraylist.add(new TriviaQuestion("As at September 2017, how many ODI centuries has Kohli made?", "58",  "45", "30",  "30"));

        arraylist.add(new TriviaQuestion("What is Kohli's topscore in the Test series as at November 7, 2017?", "235",  "254", "144",  "235"));

        arraylist.add(new TriviaQuestion("How many centuries has Kohli made in the Test series as at November 7, 2017?", "8",  "27", "17",  "17"));

        arraylist.add(new TriviaQuestion("What is the total runs scored by Kohli in the Test series as of November 7, 2017?", "3,567",  "5,533", "4,616",  "4,616"));

        arraylist.add(new TriviaQuestion("What is Vira Kohli's nickname?", "Chikka",  "Sheru", "Cheeku",  "Cheeku"));

        arraylist.add(new TriviaQuestion("Kohli was born in which Indian city?", "Mumbai",  "Delhi", "Noida",  "Delhi"));

        arraylist.add(new TriviaQuestion("Kohli smashed the fastest ODI century by an Indian off how many balls against Australia at Jaipur in 2013?", "78",  "55", "52",  "52"));

        arraylist.add(new TriviaQuestion("Kohli was fined half of his match fee for swearing at fans at which Australian ground in 2011-12?", "21",  "23", "25",  "23"));

        arraylist.add(new TriviaQuestion("What was Kohli's age when he was named the ICC ODI cricketer of the year in 2012?", "21",  "23", "25",  "23"));

        arraylist.add(new TriviaQuestion("Against who did Kohli made his first class debut for Dehli?", "Tamil Nadu",  "Karnataka", "Mumbai",  "Tamil Nadu"));





        this.addAllQuestions(arraylist);

    }


    private void addAllQuestions(ArrayList<TriviaQuestion> allQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for (TriviaQuestion question : allQuestions) {
                values.put(QUESTION, question.getQuestion());
                values.put(OPTA, question.getOptA());
                values.put(OPTB, question.getOptB());
                values.put(OPTC, question.getOptC());
               // values.put(OPTD, question.getOptD());
                values.put(ANSWER, question.getAnswer());
                db.insert(TABLE_NAME, null, values);
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }
    }


    List<TriviaQuestion> getAllOfTheQuestions() {

        List<TriviaQuestion> questionsList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String coloumn[] = {UID, QUESTION, OPTA, OPTB, OPTC,  ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumn, null, null, null, null, null);


        while (cursor.moveToNext()) {
            TriviaQuestion question = new TriviaQuestion();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptA(cursor.getString(2));
            question.setOptB(cursor.getString(3));
            question.setOptC(cursor.getString(4));
            //question.setOptD(cursor.getString(5));
            question.setAnswer(cursor.getString(5));
            questionsList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionsList;
    }
}
