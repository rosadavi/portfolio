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

export function Hero() {
  const { data, loading, error } = useUser();

  if (loading) return <div>Carregando...</div>;
  if (error) return <div>Erro ao carregar contato: {error}</div>;
  if (!data) return null;

  return (
    <div className="hero">
      <div className="avail">
        <span className="avail-dot" />
        disponível para novas oportunidades
      </div>
      <div className="hero-tag">{data?.topic}</div>
      <h1>{data?.name}</h1>
      <p className="hero-desc">{data?.description}</p>
      <div className="hero-btns">
        <a className="btn btn-primary" href={`mailto:${data?.email}`}>
          Entrar em contato
        </a>
        <a
          className="btn btn-ghost"
          href={data?.github}
          target="_blank"
          rel="noreferrer"
        >
          GitHub /rosadavi
        </a>
      </div>
    </div>
  );
}
