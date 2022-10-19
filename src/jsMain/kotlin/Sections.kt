import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*

@Composable
fun HeroSection() {
    Section(attrs = {
        id("hero")
        classes("d-flex", "flex-column", "justify-content-center", "align-items-center")
    }) {
        Div(attrs = {
            classes("hero-container")
            attr("data-aos", "fade-in")
        }) {
            H1 { Text(Content.getName()) }
            P {
                Text("I'm ")
                Span(attrs = {
                    classes("typed")
                    attr("data-typed-items", Content.getShowcaseDesignations())
                })
            }
        }
    }
}

@Composable
fun AboutSection() {
    Section(attrs = {
        id("about")
        classes("about")
    }) {
        Div(attrs = { classes("container") }) {
            SectionTitle("About", Content.getAboutSummary())
            Div(attrs = { classes("row") }) {
                Div(attrs = {
                    classes("col-lg-4")
                    attr("data-aos", "fade-right")
                }) {
                    Img(src = "assets/img/profile-img.jpg", alt = "", attrs = { classes("img-fluid") })
                }
                Div(attrs = {
                    classes("col-lg-8", "pt-4", "pt-lg-0", "content")
                    attr("data-aos", "fade-left")
                }) {
                    H3 { Text(Content.getAboutHeading()) }
                    P(attrs = { classes("fst-italic") }) {
                        Text(Content.getAboutDetails())
                    }
                    Div(attrs = { classes("row") }) {
                        Div(attrs = { classes("col-lg-6") }) {
                            Ul {
                                AboutCell("Birthday", Content.getDateOfBirth())
                                AboutCell("Phone", Content.getPhone())
                                AboutCell("City", Content.getCity())
                            }
                        }
                        Div(attrs = { classes("col-lg-6") }) {
                            Ul {
                                AboutCell("Age", Content.getAge())
                                AboutCell("Degree", Content.getDegree())
                                AboutCell("Email", Content.getEmail())
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SectionTitle(title: String, data: String) {
    Div(attrs = { classes("section-title") }) {
        H1 {
            Text(title)
        }
        P {
            Text(data)
        }
    }
}

@Composable
fun AboutCell(title: String, value: String) {
    Li {
        I(attrs = { classes("bi", "bi-chevron-right") })
        Strong {
            Text(title)
        }
        Span {
            Text(value)
        }
    }
}