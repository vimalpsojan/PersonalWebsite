import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.*

@Composable
fun SideBar() {
    Header(attrs = {
        id("header")
    }) {
        Div(attrs = {
            classes("d-flex", "flex-column")
        }) {
            Profile()
            Navbar()
        }
    }
}

@Composable
fun Profile() {
    Div(attrs = {
        classes("profile")
    }) {
        Img(src = "assets/img/profile-img.jpg", alt = "", attrs = { classes("img-fluid", "rounded-circle") })
        H1(attrs = { classes("text-light") }) { A(attrs = { href("index.html") }) { Text(Content.NAME) } }
        SocialLinks()
    }
}

@Composable
fun Navbar() {
    Nav(attrs = {
        id("navbar")
        classes("nav-menu", "navbar")
    }) {
        Ul {
            Hero()
            About()
            Resume()
            Portfolio()
            Services()
            Contact()
        }
    }
}

@Composable
fun Hero() {
    Li {
        A(attrs = {
            href("#hero")
            classes("nav-link", "scrollto", "active")
        }
        ) {
            I(attrs = { classes("bx", "bx-home") })
            Span { Text("Home") }
        }
    }
}

@Composable
fun About() {
    Li {
        A(attrs = {
            href("#about")
            classes("nav-link", "scrollto")
        }
        ) {
            I(attrs = { classes("bx", "bx-user") })
            Span { Text("About") }
        }
    }
}

@Composable
fun Resume() {
    Li {
        A(attrs = {
            href("#resume")
            classes("nav-link", "scrollto")
        }
        ) {
            I(attrs = { classes("bx", "bx-file-blank") })
            Span { Text("Resume") }
        }
    }
}

@Composable
fun Portfolio() {
    Li {
        A(attrs = {
            href("#portfolio")
            classes("nav-link", "scrollto")
        }
        ) {
            I(attrs = { classes("bx", "bx-book-content") })
            Span { Text("Portfolio") }
        }
    }
}

@Composable
fun Services() {
    Li {
        A(attrs = {
            href("#services")
            classes("nav-link", "scrollto")
        }
        ) {
            I(attrs = { classes("bx", "bx-server") })
            Span { Text("Services") }
        }
    }
}

@Composable
fun Contact() {
    Li {
        A(attrs = {
            href("#contact")
            classes("nav-link", "scrollto")
        }
        ) {
            I(attrs = { classes("bx", "bx-envelope") })
            Span { Text("Contact") }
        }
    }
}