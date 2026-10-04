import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.*

@Composable
fun SideBar() {
    Header(attrs = { id("header") }) {
        Div(attrs = { classes("d-flex", "flex-column") }) {
            Div(attrs = { classes("profile") }) {
                Img(src = "assets/img/profile-img.jpg", alt = "Vimal P Sojan", attrs = { classes("img-fluid", "rounded-circle") })
                H2(attrs = { classes("text-light", "profile-name") }) { A(attrs = { href("#hero") }) { Text(Content.getName()) } }
                SocialLinks()
            }
            Nav(attrs = { id("navbar"); classes("nav-menu", "navbar"); attr("aria-label", "Main navigation") }) {
                Ul {
                    NavItem("hero", "Home", "bx-home", true)
                    NavItem("about", "About", "bx-user")
                    NavItem("work", "Work", "bx-briefcase")
                    NavItem("projects", "Side projects", "bx-code-alt")
                    NavItem("personal", "Outside work", "bx-coffee")
                    NavItem("contact", "Get in touch", "bx-envelope")
                }
            }
        }
    }
}

@Composable
private fun NavItem(section: String, label: String, icon: String, active: Boolean = false) {
    Li {
        A(attrs = {
            href("#$section")
            classes("nav-link", "scrollto")
            if (active) classes("active")
        }) {
            I(attrs = { classes("bx", icon); attr("aria-hidden", "true") })
            Span { Text(label) }
        }
    }
}
