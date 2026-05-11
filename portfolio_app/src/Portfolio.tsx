import { useEffect } from "react";
import { Navbar } from "./components/Navbar";
import { Hero } from "./components/Hero";
import { StackSection } from "./components/StackSection";
import { ProjectsSection } from "./components/ProjectsSection";
import { ExperienceSection } from "./components/ExperienceSection";
import { ContactSection } from "./components/ContactSection";
import { Footer } from "./components/Footer";

export default function Portfolio() {
  useEffect(() => {
    const style = document.createElement("style");
    document.head.appendChild(style);
    return () => void document.head.removeChild(style);
  }, []);

  return (
    <>
      <Navbar />
      <Hero />
      <StackSection />
      <ProjectsSection />
      <ExperienceSection />
      <ContactSection />
      <Footer />
    </>
  );
}
