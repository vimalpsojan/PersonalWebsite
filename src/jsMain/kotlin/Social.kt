import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.*

@Composable
fun SocialLinks() {
    Div(attrs = { classes("social-links", "mt-3", "text-center") }) {
        SocialLink(Content.getLinkedin(), "LinkedIn", "bxl-linkedin")
        SocialLink(Content.getGithub(), "GitHub", "bxl-github")
        SocialLink(Content.getInstagram(), "Instagram", "bxl-instagram")
        SocialLink(Content.getFacebook(), "Facebook", "bxl-facebook")
    }
}

@Composable
private fun SocialLink(url: String, label: String, icon: String) {
    A(attrs = { href(url); attr("aria-label", label) }) {
        I(attrs = { classes("bx", icon); attr("aria-hidden", "true") })
    }
}
