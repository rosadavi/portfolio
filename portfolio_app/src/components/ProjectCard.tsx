type Stack = {
  id: string;
  name: string;
  use: string;
};

type ProjectCardProps = {
  project: {
    topic1: string;
    topic2: string;
    title: string;
    description: string;
    stack: Stack[];
  };
};

export function ProjectCard({ project }: ProjectCardProps) {
  return (
    <div className={`project-card${project.topic1 ? " featured" : ""}`}>
      <span className={`proj-tag ${project.topic2}`}>{project.topic2}</span>
      <div className="proj-title">{project.title}</div>
      <div className="proj-desc">{project.description}</div>
      <div className="proj-stack">
        {(project.stack ?? []).map((tech) => (
          <span key={tech.id} className="tech-pill">
            {tech.name}
          </span>
        ))}
      </div>
    </div>
  );
}
