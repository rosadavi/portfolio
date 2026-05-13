export function Navbar() {
  const scrollTo = (id: string) => {
    document.getElementById(id)?.scrollIntoView({ behavior: "smooth" });
  };
  return (
    <nav className="nav">
      <span className="nav-logo">davi.rosa</span>
      <ul className="nav-links">
        {(["stack", "projetos", "experiencia", "contato"].map ?? [])((id) => (
          <li key={id}>
            <button className="nav-link" onClick={() => scrollTo(id)}>
              {id === "experiencia"
                ? "Experiência"
                : id.charAt(0).toUpperCase() + id.slice(1)}
            </button>
          </li>
        ))}
      </ul>
    </nav>
  );
}
