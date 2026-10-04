import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.*

@Composable
fun HeroSection() {
    Section(attrs = { id("hero"); classes("d-flex", "flex-column", "justify-content-center", "align-items-center") }) {
        Div(attrs = { classes("hero-container") }) {
            H1 { Text(Content.getName()) }
            P { Text("Software engineer · Thrissur, Kerala") }
            P(attrs = { classes("hero-note") }) { Text("Android development, mobile accessibility and game development experiments.") }
            A(attrs = { href("#about"); classes("hero-link", "scrollto") }) { Text("A little about me ↓") }
        }
    }
}

@Composable
fun AboutSection() {
    Section(attrs = { id("about"); classes("about") }) {
        Div(attrs = { classes("container") }) {
            SectionTitle("About", Content.getAboutSummary())
            Div(attrs = { classes("row", "align-items-center") }) {
                Div(attrs = { classes("col-lg-4") }) {
                    Img(src = "/assets/img/profile-img.jpg", alt = "Vimal P Sojan", attrs = { classes("img-fluid", "about-photo") })
                }
                Div(attrs = { classes("col-lg-8", "pt-4", "pt-lg-0", "content") }) {
                    H3 { Text(Content.getAboutHeading()) }
                    P { Text(Content.getAboutDetails()) }
                    P { Text("I work mainly with Kotlin, Java and C++, and use Kotlin Multiplatform to explore shared code across platforms.") }
                    P(attrs = { classes("quiet-note") }) { Text("I studied Computer Engineering at Maharaja's Technological Institute in Thrissur.") }
                }
            }
        }
    }
}

@Composable
fun WorkSection() {
    Section(attrs = { id("work"); classes("section-bg") }) {
        Div(attrs = { classes("container") }) {
            SectionTitle("Android development & mobile accessibility", "A few areas I've spent time on in my work.")
            Div(attrs = { classes("row", "g-4") }) {
                WorkNote("Accessibility & kiosk software", "At QBurst, I've worked on an Android screen reader for kiosks, including SDK architecture, native integration and support for managed devices.")
                WorkNote("Android development", "My earlier work includes the ila Bank app through Mindteck, parent and conductor apps at Qaptive, and applications involving messaging, BLE devices and tracking.")
                WorkNote("SDKs & shared code", "I build reusable SDKs, including a screen-reading library being developed with Kotlin Multiplatform.")
            }
            Div(attrs = { classes("patent-note") }) {
                H3 { Text("Screen reader language switching") }
                P { Text("I'm a co-inventor on a patent for screen reader language switching. I contributed to the technical approach and implementation.") }
                A(attrs = { href("https://patents.google.com/patent/US11656886B1/en") }) { Text("Read the patent · US11656886B1") }
            }
        }
    }
}

@Composable
private fun WorkNote(title: String, description: String) {
    Div(attrs = { classes("col-lg-4") }) {
        H3 { Text(title) }
        P { Text(description) }
    }
}

@Composable
fun ProjectsSection() {
    Section(attrs = { id("projects") }) {
        Div(attrs = { classes("container") }) {
            SectionTitle("Game development & side projects", "Personal projects in Unreal Engine, game development tools and Kotlin.")
            Div(attrs = { classes("row", "g-4") }) {
                Project("SaveGameInspector", "An Unreal Engine editor plugin for inspecting and editing save-game data. I built it for my own workflow and shared it on GitHub.", "SaveGameInspector", "Unreal Engine · C++")
                Project("AdvancedSaveSystem", "An Unreal Engine save-system project exploring asynchronous saves and reusable runtime components.", "AdvancedSaveSystem", "Unreal Engine · C++")
                Project("Kotlin Multiplatform experiments", "Samples and foundations for exploring shared application logic and Compose across platforms.", "MiltiplatformBase", "Kotlin · Compose")
            }
            P(attrs = { classes("projects-more") }) {
                A(attrs = { href(Content.getGithub()) }) { Text("More code and experiments on GitHub →") }
            }
        }
    }
}

@Composable
private fun Project(title: String, description: String, repo: String, tools: String) {
    Div(attrs = { classes("col-lg-4") }) {
        Div(attrs = { classes("project-card") }) {
            P(attrs = { classes("project-tools") }) { Text(tools) }
            H3 { A(attrs = { href("${Content.getGithub()}/$repo") }) { Text(title) } }
            P { Text(description) }
            A(attrs = { href("${Content.getGithub()}/$repo") }) { Text("View repository →") }
        }
    }
}

@Composable
fun PersonalSection() {
    Section(attrs = { id("personal"); classes("section-bg") }) {
        Div(attrs = { classes("container") }) {
            SectionTitle("Outside work", "I enjoy learning by building and running things myself.")
            Div(attrs = { classes("personal-copy") }) {
                P { Text("I run a homelab to experiment with self-hosted services, Linux and networking.") }
                P { A(attrs = { href("/homelab/") }) { Text("Explore my homelab experiments →") } }
            }
        }
    }
}

@Composable
fun ContactSection() {
    Section(attrs = { id("contact") }) {
        Div(attrs = { classes("container") }) {
            SectionTitle("Get in touch", "For a conversation about software, a project, or a shared interest.")
            P { A(attrs = { href("mailto:${Content.getEmail()}") }) { Text(Content.getEmail()) } }
            P(attrs = { classes("contact-links") }) {
                A(attrs = { href(Content.getLinkedin()) }) { Text("LinkedIn") }
                Text(" · ")
                A(attrs = { href(Content.getGithub()) }) { Text("GitHub") }
                Text(" · ")
                A(attrs = { href(Content.getInstagram()) }) { Text("Instagram") }
                Text(" · ")
                A(attrs = { href(Content.getFacebook()) }) { Text("Facebook") }
            }
            P(attrs = { classes("quiet-note") }) { Text("Vimal P Sojan · Thrissur, Kerala, India") }
        }
    }
}

@Composable
fun SectionTitle(title: String, data: String) {
    Div(attrs = { classes("section-title") }) {
        H2 { Text(title) }
        P { Text(data) }
    }
}
