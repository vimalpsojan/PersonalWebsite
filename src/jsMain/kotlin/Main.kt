import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.I
import org.jetbrains.compose.web.dom.Main
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        I(attrs = {
            classes("bi", "bi-list", "mobile-nav-toggle", "d-xl-none")
        })
        SideBar()
        HeroSection()
        MainBody()
    }
}
@Composable
fun MainBody(){
    Main(attrs = { id("main") }) {
        AboutSection()
        FactsSection()
    }
}