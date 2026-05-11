type ExperienceAttribute = {
  id: string;
  description: string;
};

type Experience = {
  id: string;
  name: string;
  enterprise: string;
  dateInitial: string;
  dateEnd: string;
  actual: boolean;
  experienceAttribute: ExperienceAttribute[];
};

export function ExperienceItem({ exp }: { exp: Experience }) {
  return (
    <div className="exp-item">
      <div className="exp-period" style={{ whiteSpace: "pre-line" }}>
        {exp.dateInitial} - {exp.dateEnd}
      </div>
      <div>
        <div className="exp-role">{exp.name}</div>
        <div className="exp-company">{exp.enterprise}</div>
        <ul className="exp-bullets">
          {(exp.experienceAttribute ?? []).map((attr, i) => (
            <li key={i}>{attr.description}</li>
          ))}
        </ul>
      </div>
    </div>
  );
}
