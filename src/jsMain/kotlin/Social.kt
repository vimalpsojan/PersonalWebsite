import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.I

@Composable
fun SocialLinks() {
    Div(attrs = {
        classes("social-links", "mt-3", "text-center")
    }) {
        Twitter()
        Facebook()
        Instagram()
        Skype()
        Linkedin()
        Github()
    }
}

@Composable
fun Twitter() {
    if (Content.haveTwitter()) {
        A(attrs = {
            href(Content.getTwitter())
            classes("twitter")
        }) {
            I(attrs = { classes("bx", "bxl-twitter") })
        }
    }
}

@Composable
fun Facebook() {
    if (Content.haveFacebook()) {
        A(attrs = {
            href(Content.getFacebook())
            classes("facebook")
        }) {
            I(attrs = { classes("bx", "bxl-facebook") })
        }
    }
}

@Composable
fun Instagram() {
    if (Content.haveInstagram()) {
        A(attrs = {
            href(Content.getInstagram())
            classes("instagram")
        }) {
            I(attrs = { classes("bx", "bxl-instagram") })
        }
    }
}

@Composable
fun Skype() {
    if (Content.haveSkype()) {
        A(attrs = {
            href(Content.getSkype())
            classes("skype")
        }) {
            I(attrs = { classes("bx", "bxl-skype") })
        }
    }
}

@Composable
fun Linkedin() {
    if (Content.haveLinkedin()) {
        A(attrs = {
            href(Content.getLinkedin())
            classes("linkedin")
        }) {
            I(attrs = { classes("bx", "bxl-linkedin") })
        }
    }
}

@Composable
fun Github() {
    if (Content.haveGithub()) {
        A(attrs = {
            href(Content.getGithub())
            classes("github")
        }) {
            I(attrs = { classes("bx", "bxl-github") })
        }
    }
}