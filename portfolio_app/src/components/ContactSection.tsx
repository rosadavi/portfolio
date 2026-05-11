export function ContactSection() {
  const CONTACTS = [
    {
      label: "email",
      value: "davi.rosa.ofc@gmail.com",
      href: "mailto:davi.rosa.ofc@gmail.com",
    },
    { label: "telefone", value: "(61) 99653-1102", href: null },
    {
      label: "github",
      value: "github.com/rosadavi",
      href: "https://github.com/rosadavi",
    },
    {
      label: "linkedin",
      value: "Davi Rosa",
      href: "https://www.linkedin.com/in/davi-rosa-148520284/",
    },
  ];

  return (
    <section id="contato" className="section">
      <div className="section-label">Contato</div>
      <div className="contact-grid">
        {CONTACTS.map((c) => (
          <div key={c.label} className="contact-item">
            <span className="contact-label">{c.label}</span>
            {c.href ? (
              <a
                className="contact-val"
                href={c.href}
                target={c.href.startsWith("http") ? "_blank" : undefined}
                rel="noreferrer"
              >
                {c.value}
              </a>
            ) : (
              <span className="contact-val">{c.value}</span>
            )}
          </div>
        ))}
      </div>
    </section>
  );
}
