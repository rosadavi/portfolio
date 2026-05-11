import { useStack } from "../hooks/useStack";

type StackItem = {
  name: string;
  use: string;
};

export function StackSection() {
  const { data, loading, error } = useStack();

  if (loading) return <div>Carregando...</div>;
  if (error) return <div>Erro ao carregar stack: {error}</div>;

  return (
    <section id="stack" className="section">
      <div className="section-label">Stack técnica</div>
      <div className="stack-grid">
        {data.map((item: StackItem) => (
          <div key={item.name} className="stack-item">
            <div className="stack-name">{item.name}</div>
            <div className="stack-type">{item.use}</div>
          </div>
        ))}
      </div>
    </section>
  );
}
