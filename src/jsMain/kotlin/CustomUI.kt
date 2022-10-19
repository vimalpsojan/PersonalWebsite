import androidx.compose.runtime.Composable
import kotlinx.browser.document
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.Element
import org.w3c.dom.HTMLLIElement

private open class CustomElementBuilderImplementation<TElement : Element>(private val tagName: String) : ElementBuilder<TElement> {
    private val el: Element by lazy { document.createElement(tagName) }
    @Suppress("UNCHECKED_CAST")
    override fun create(): TElement = el.cloneNode() as TElement
}

private val Strong: ElementBuilder<HTMLLIElement> = CustomElementBuilderImplementation("strong")

@Composable
fun Strong(
    attrs: AttrBuilderContext<HTMLLIElement>? = null,
    content: ContentBuilder<HTMLLIElement>? = null
) = TagElement(elementBuilder = Strong, applyAttrs = attrs, content = content)