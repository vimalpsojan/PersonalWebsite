import androidx.compose.runtime.Composable
import kotlinx.browser.document
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    // Replace the visible HTML fallback with the interactive site.
    document.getElementById("root")?.textContent = ""
    renderComposable(rootElementId = "root") {
        A(attrs = { attr("href", "#main"); classes("skip-link") }) { Text("Skip to content") }
        Button(attrs = {
            classes("mobile-nav-toggle", "d-xl-none")
            attr("type", "button")
            attr("aria-label", "Open navigation")
            attr("aria-controls", "header")
            attr("aria-expanded", "false")
        }) { I(attrs = { classes("bi", "bi-list"); attr("aria-hidden", "true") }) }
        SideBar()
        HeroSection()
        MainBody()
    }
}

@Composable
fun MainBody() {
    Main(attrs = { id("main") }) {
        AboutSection()
        WorkSection()
        ProjectsSection()
        PersonalSection()
        ContactSection()
    }
}
