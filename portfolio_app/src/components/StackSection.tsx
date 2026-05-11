export function StackSection() {
  const STACK = [
    { name: "Java", type: "backend · principal", dot: "dot-be" },
    { name: "Spring Boot", type: "backend · principal", dot: "dot-be" },
    { name: "TypeScript", type: "backend / frontend", dot: "dot-be" },
    { name: "Node.js", type: "backend · APIs", dot: "dot-be" },
    { name: "React / Next.js", type: "frontend", dot: "dot-fe" },
    { name: "Angular 8+", type: "frontend", dot: "dot-fe" },
    { name: "PostgreSQL", type: "banco de dados", dot: "dot-db" },
    { name: "MySQL", type: "banco de dados", dot: "dot-db" },
    { name: "Docker", type: "devops · CI/CD", dot: "dot-dv" },
    { name: "JWT / Bcrypt", type: "segurança", dot: "dot-be" },
    { name: "JPA / Hibernate", type: "ORM", dot: "dot-be" },
    { name: "Spring Batch", type: "processamento", dot: "dot-dv" },
  ];

  return (
    <section id="stack" className="section">
      <div className="section-label">Stack técnica</div>
      <div className="stack-grid">
        {STACK.map((item) => (
          <div key={item.name} className="stack-item">
            <div className={`stack-dot ${item.dot}`} />
            <div className="stack-name">{item.name}</div>
            <div className="stack-type">{item.type}</div>
          </div>
        ))}
      </div>
    </section>
  );
}
