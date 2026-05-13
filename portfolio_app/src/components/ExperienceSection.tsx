import { useExperience } from "../hooks/useExperience";
import { ExperienceItem } from "./ExperienceItem";

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

export function ExperienceSection() {
  const { data, loading, error } = useExperience();

  if (loading) return <div>Carregando...</div>;
  if (error) return <div>Erro ao carregar experience: {error}</div>;

  return (
    <section id="experiencia" className="section">
      <div className="section-label">Experiência</div>
      <div>
        {(data?.map ?? [])((exp: Experience, i: number) => (
          <ExperienceItem key={i} exp={exp} />
        ))}
      </div>
    </section>
  );
}
