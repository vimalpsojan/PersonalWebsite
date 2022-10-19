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
            H1 { Text(Content.NAME) }
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
            SectionTitle("About", Content.ABOUT_SUMMARY)
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
                    H3 { Text(Content.ABOUT_HEADING) }
                    P(attrs = { classes("fst-italic") }) {
                        Text(Content.ABOUT_DETAILS)
                    }
                    Div(attrs = { classes("row") }) {
                        Div(attrs = { classes("col-lg-6") }) {
                            Ul {
                                AboutCell("Birthday", Content.DOB)
                                AboutCell("Phone", Content.PHONE)
                                AboutCell("City", Content.CITY)
                            }
                        }
                        Div(attrs = { classes("col-lg-6") }) {
                            Ul {
                                AboutCell("Age", Content.AGE)
                                AboutCell("Degree", Content.DEGREE)
                                AboutCell("Email", Content.EMAIL)
                            }
                        }
                    }
                    P {
                        Text(Content.ABOUT_DETAILS_2)
                    }
                }
            }
        }
    }
}

@Composable
fun FactsSection() {
    Section(attrs = {
        id("facts")
        classes("facts")
    }) {
        Div(attrs = { classes("container") }) {
            SectionTitle("Facts", Content.FACT_SUMMARY)
            Div(attrs = { classes("row", "no-gutters") }) {
                FactCell(
                    value = "Happy Clients",
                    valueDes = Content.CLIENT_COUNT_DES,
                    emoji = "bi-emoji-smile",
                    dataPurecounterEnd = Content.CLIENT_COUNT
                )
                FactCell(
                    value = "Projects",
                    valueDes = Content.PROJECT_COUNT_DES,
                    emoji = "bi-journal-richtext",
                    dataPurecounterEnd = Content.PROJECT_COUNT
                )
                FactCell(
                    value = "Hours Of Support",
                    valueDes = Content.SUPPORT_HOUR_COUNT_DES,
                    emoji = "bi-headset",
                    dataPurecounterEnd = Content.SUPPORT_HOUR_COUNT
                )
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
            Text("$title:")
        }
        Span {
            Text(value)
        }
    }
}

@Composable
fun FactCell(value: String, valueDes: String, emoji: String, dataPurecounterEnd: String, aosDelay: String = "") {
    Div(attrs = {
        classes("col-lg-3", "col-md-6", "d-md-flex", "align-items-md-stretch")
        attr("data-aos", "fade-up")
        if (aosDelay.isNotBlank()) {
            attr("data-aos-delay", aosDelay)
        }
    }) {
        Div(attrs = { classes("count-bo") }) {
            I(attrs = { classes("bi", emoji) })
            Span(attrs = {
                classes("purecounter")
                attr("data-purecounter-start", "0")
                attr("data-purecounter-end", dataPurecounterEnd)
                attr("data-purecounter-duration", "1")
            })
            P {
                Strong {
                    Text(value)
                }
                Text(valueDes)
            }
        }
    }
}