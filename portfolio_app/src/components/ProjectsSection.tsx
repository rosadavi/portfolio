import { ProjectCard } from "./ProjectCard";

export function ProjectsSection() {
  const PROJECTS = [
    {
      id: "pix",
      featured: true,
      tag: "backend · fintech",
      tagClass: "tag-be",
      title: "Gateway Pix",
      desc: "Sistema de pagamentos para automação de cobranças via Pix. API RESTful com geração de QR Code dinâmico/estático, notificações assíncronas via webhook, conciliação automática de pagamentos e endpoints criptografados para comunicação financeira.",
      stack: [
        "Node.js",
        "TypeScript",
        "Express",
        "Prisma",
        "MySQL",
        "Docker",
        "JWT",
        "Swagger",
      ],
    },
    {
      id: "nebula",
      tag: "java · governo",
      tagClass: "tag-java",
      title: "Nebula",
      desc: "Sistema multiplataforma para cadastro e validação de detentos integrado ao sistema Solar da Defensoria Pública do DF. Automatiza envio de formulários e unifica dados.",
      stack: ["Java", "Kotlin", "JAX-RS", "Docker"],
    },
    {
      id: "contador",
      tag: "fullstack · saas",
      tagClass: "tag-full",
      title: "Contador Online",
      desc: "Plataforma para centralização de contadores com autoatendimento, autenticação segura e área administrativa. Cadastro automático, validação manual e cartão virtual personalizado.",
      stack: [
        "Next.js",
        "TypeScript",
        "React",
        "Drizzle ORM",
        "PostgreSQL",
        "Clerk",
      ],
    },
    {
      id: "cac",
      tag: "fullstack · comunidade",
      tagClass: "tag-fe",
      title: "App Brasil CAC",
      desc: "Plataforma para comunidade de Colecionadores, Atiradores e Caçadores. Oferece conhecimento, acesso e aprimoramento de habilidades para praticantes e fornecedores.",
      stack: [
        "Next.js",
        "TypeScript",
        "React",
        "Drizzle ORM",
        "PostgreSQL",
        "Clerk",
      ],
    },
  ];

  return (
    <section id="projetos" className="section">
      <div className="section-label">Projetos</div>
      <div className="projects-grid">
        {PROJECTS.map((p) => (
          <ProjectCard key={p.id} project={p} />
        ))}
      </div>
    </section>
  );
}
