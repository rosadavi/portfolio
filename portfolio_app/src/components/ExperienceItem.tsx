type Experience = {
  period: string;
  role: string;
  company: string;
  bullets: string[];
};

export function ExperienceItem({ exp }: { exp: Experience }) {
  return (
    <div className="exp-item">
      <div className="exp-period" style={{ whiteSpace: "pre-line" }}>
        {exp.period}
      </div>
      <div>
        <div className="exp-role">{exp.role}</div>
        <div className="exp-company">{exp.company}</div>
        <ul className="exp-bullets">
          {exp.bullets.map((b, i) => (
            <li key={i}>{b}</li>
          ))}
        </ul>
      </div>
    </div>
  );
}
