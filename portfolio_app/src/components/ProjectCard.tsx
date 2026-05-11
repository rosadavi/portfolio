type ProjectCardProps = {
  project: {
    featured?: boolean;
    tagClass: string;
    tag: string;
    title: string;
    desc: string;
    stack: string[];
  };
};

export function ProjectCard({ project }: ProjectCardProps) {
  return (
    <div className={`project-card${project.featured ? " featured" : ""}`}>
      <span className={`proj-tag ${project.tagClass}`}>{project.tag}</span>
      <div className="proj-title">{project.title}</div>
      <div className="proj-desc">{project.desc}</div>
      <div className="proj-stack">
        {project.stack.map((tech: string) => (
          <span key={tech} className="tech-pill">
            {tech}
          </span>
        ))}
      </div>
    </div>
  );
}
