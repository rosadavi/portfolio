import { useProject } from "../hooks/useProject";
import { ProjectCard } from "./ProjectCard";

type Stack = {
  id: string;
  name: string;
  use: string;
};

type Project = {
  id: string;
  topic1: string;
  topic2: string;
  title: string;
  description: string;
  stack: Stack[];
};

export function ProjectsSection() {
  const { data, loading, error } = useProject();

  if (loading) return <div>Carregando...</div>;
  if (error) return <div>Erro ao carregar project: {error}</div>;

  return (
    <section id="projetos" className="section">
      <div className="section-label">Projetos</div>
      <div className="projects-grid">
        {(data ?? []).map((p: Project, index) => (
          <ProjectCard key={p.id} project={p} index={index} />
        ))}
      </div>
    </section>
  );
}
