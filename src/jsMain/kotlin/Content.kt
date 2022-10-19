object Content {

    public const val EMPTY_TEXT = ""

    public const val NAME = "Vimal P Sojan"
    public const val ABOUT_HEADING = "UI/UX Designer &amp; Web Developer."
    public const val ABOUT_SUMMARY =
        "Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas."
    public const val ABOUT_DETAILS =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore\n" +
                "              magna aliqua."

    public const val ABOUT_DETAILS_2 =
        "Officiis eligendi itaque labore et dolorum mollitia officiis optio vero. Quisquam sunt adipisci omnis et ut. Nulla accusantium dolor incidunt officia tempore. Et eius omnis. Cupiditate ut dicta maxime officiis quidem quia. Sed et consectetur qui quia repellendus itaque neque. Aliquid amet quidem ut quaerat cupiditate. Ab et eum qui repellendus omnis culpa magni laudantium dolores."
    public const val TWITTER: String = "https://twitter.com/vimalpsojan"
    public const val FACEBOOK = "https://www.facebook.com/vimalpsojan/"
    public const val INSTAGRAM = "https://www.instagram.com/vimalsojan/"
    public const val SKYPE = EMPTY_TEXT
    public const val LINKEDIN = "https://www.linkedin.com/in/vimalpsojan/"
    public const val GITHUB = "https://github.com/vimalpsojan"
    private val DESIGNATIONS = listOf("Android App Developer", "Game Developer", "Accessibility Specialist")

    public const val DOB = "08 April 1993"
    public const val PHONE = "+91 7349554683"
    public const val CITY = "Thrissur, Kerala, India"
    public const val AGE = "29"
    public const val DEGREE = "Diploma"
    public const val EMAIL = "vimalpsojan@gmail.com"
    public const val FREELANCE = "Not Available"

    public const val FACT_SUMMARY ="Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas."

    public const val CLIENT_COUNT = "0"
    public const val CLIENT_COUNT_DES = "0"
    public const val PROJECT_COUNT = "0"
    public const val PROJECT_COUNT_DES = "0"
    public const val SUPPORT_HOUR_COUNT_DES = "0"
    public const val SUPPORT_HOUR_COUNT= "0"

    public const val SKILLS_SUMMARY = "Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas."

    public val SKILLS = mapOf<String, Int>(
        Pair("Android", 100),
        Pair("JAVA", 80),
        Pair("Kotlin", 70),
        Pair("C++", 25),
        Pair("Unreal Engine", 15)
    )
    
    fun getShowcaseDesignations(): String {
        return DESIGNATIONS.joinToString(",")
    }

    fun haveTwitter(): Boolean {
        return TWITTER != EMPTY_TEXT
    }

    fun haveFacebook(): Boolean {
        return FACEBOOK != EMPTY_TEXT
    }

    fun haveInstagram(): Boolean {
        return INSTAGRAM != EMPTY_TEXT
    }

    fun haveSkype(): Boolean {
        return SKYPE != EMPTY_TEXT
    }

    fun haveLinkedin(): Boolean {
        return LINKEDIN != EMPTY_TEXT
    }

    fun haveGithub(): Boolean {
        return GITHUB != EMPTY_TEXT
    }
}