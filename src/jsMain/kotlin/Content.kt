object Content {

    private const val EMPTY_TEXT = ""

    private const val NAME = "Vimal P Sojan"
    private const val ABOUT_HEADING = "UI/UX Designer &amp; Web Developer."
    private const val ABOUT_SUMMARY =
        "Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas."
    private const val ABOUT_DETAILS =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore\n" +
                "              magna aliqua."
    private const val TWITTER: String = "https://twitter.com/vimalpsojan"
    private const val FACEBOOK = "https://www.facebook.com/vimalpsojan/"
    private const val INSTAGRAM = "https://www.instagram.com/vimalsojan/"
    private const val SKYPE = EMPTY_TEXT
    private const val LINKEDIN = "https://www.linkedin.com/in/vimalpsojan/"
    private const val GITHUB = "https://github.com/vimalpsojan"
    private val DESIGNATIONS = listOf("Android App Developer", "Game Developer", "Accessibility Specialist")

    private const val DOB = "08 April 1993"
    private const val PHONE = "+91 7349554683"
    private const val CITY = "Thrissur, Kerala, India"
    private const val AGE = "29"
    private const val DEGREE = "Diploma"
    private const val EMAIL = "vimalpsojan@gmail.com"
    private const val FREELANCE = "Not Available"

    fun getName(): String {
        return NAME
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

    fun getTwitter(): String {
        return TWITTER
    }


    fun getFacebook(): String {
        return FACEBOOK
    }

    fun getInstagram(): String {
        return INSTAGRAM
    }

    fun getSkype(): String {
        return SKYPE
    }

    fun getLinkedin(): String {
        return LINKEDIN
    }

    fun getGithub(): String {
        return GITHUB
    }

    fun getShowcaseDesignations(): String {
        return DESIGNATIONS.joinToString(",")
    }

    fun getAboutSummary(): String {
        return ABOUT_SUMMARY
    }

    fun getAboutHeading(): String {
        return ABOUT_HEADING
    }

    fun getAboutDetails(): String {
        return ABOUT_DETAILS
    }

    fun getDateOfBirth(): String {
        return DOB
    }

    fun getPhone(): String {
        return PHONE
    }

    fun getCity(): String {
        return CITY
    }

    fun getAge(): String {
        return AGE
    }

    fun getDegree(): String {
        return DEGREE
    }

    fun getEmail(): String {
        return EMAIL
    }

    fun getFreelance(): String {
        return FREELANCE
    }
}