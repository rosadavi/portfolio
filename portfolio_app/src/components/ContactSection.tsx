import { useUser } from "../hooks/useUser";

type User = {
  id: string;
  name: string;
  description: string;
  topic: string;
  github: string;
  email: string;
  phone: string;
  linkedin: string;
};

type ContactKey = "email" | "phone" | "github" | "linkedin";

type ContactField = {
  label: string;
  key: ContactKey;
  href: ((u: User) => string) | null;
};

const CONTACT_FIELDS: ContactField[] = [
  { label: "email", key: "email", href: (u) => `mailto:${u.email}` },
  { label: "telefone", key: "phone", href: null },
  { label: "github", key: "github", href: (u) => u.github },
  { label: "linkedin", key: "linkedin", href: (u) => u.linkedin },
];

export function ContactSection() {
  const { data, loading, error } = useUser();

  if (loading) return <div>Carregando...</div>;
  if (error) return <div>Erro ao carregar contato: {error}</div>;
  if (!data) return null;

  return (
    <section id="contato" className="section">
      <div className="section-label">Contato</div>
      <div className="contact-grid">
        {(CONTACT_FIELDS?.map ?? [])(({ label, key, href }) => {
          const value =
            key === "github"
              ? `github.com/${(data as User).github.split("/").pop()}`
              : key === "linkedin"
                ? `linkedin.com/in/${(data as User).linkedin.split("/").pop()}`
                : (data as User)[key];
          const url = href ? href(data as unknown as User) : null;
          return (
            <div key={label} className="contact-item">
              <span className="contact-label">{label}</span>
              {url ? (
                <a
                  className="contact-val"
                  href={url}
                  target={url.startsWith("http") ? "_blank" : undefined}
                  rel="noreferrer"
                >
                  {value}
                </a>
              ) : (
                <span className="contact-val">{value}</span>
              )}
            </div>
          );
        })}
      </div>
    </section>
  );
}
