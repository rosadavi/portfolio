import { ExperienceItem } from "./ExperienceItem";

export function ExperienceSection() {
  const EXPERIENCE = [
    {
      period: "2025\natual",
      role: "Desenvolvedor Full Stack",
      company: "Rosh Tecnologia · Brasília",
      bullets: [
        "Arquitetura de backends escaláveis com separação de responsabilidades",
        "Criação e consumo de APIs REST com autenticação e segurança",
        "Pipelines CI/CD e ambientes Docker para dev e produção",
        "Modelagem relacional e otimização de consultas SQL",
        "Documentação de processos técnicos e decisões de arquitetura",
      ],
    },
    {
      period: "2024\n2025",
      role: "Desenvolvedor Backend",
      company: "BrFideliza · Soluções Fintech",
      bullets: [
        "Gateway de pagamento via Pix com QR Code dinâmico e estático",
        "Notificações assíncronas via webhook e conciliação automática",
        "Endpoints seguros e criptografados para comunicação financeira",
        "Documentação de API com Swagger para uso interno e externo",
      ],
    },
    {
      period: "2024\n2025",
      role: "Estagiário em Desenvolvimento",
      company: "Defensoria Pública do DF · Lab. Jr.",
      bullets: [
        "Desenvolvimento full stack de soluções web institucionais",
        "Automação de processos e otimização de fluxos de trabalho",
        "Soluções que ampliaram atendimento a novos órgãos públicos",
      ],
    },
  ];

  return (
    <section id="experiencia" className="section">
      <div className="section-label">Experiência</div>
      <div>
        {EXPERIENCE.map((exp, i) => (
          <ExperienceItem key={i} exp={exp} />
        ))}
      </div>
    </section>
  );
}
