import { useUser } from "../hooks/useUser";

export function Hero() {
  const { data, loading, error } = useUser();

  if (loading) return <div>Carregando...</div>;
  if (error) return <div>Erro ao carregar contato: {error}</div>;
  if (!data) return null;

  return (
    <div className="hero">
      <div className="avail">
        <span className="avail-dot" />
        disponível para novas oportunidades
      </div>
      <div className="hero-tag">{data?.topic}</div>
      <h1>{data?.name}</h1>
      <p className="hero-desc">{data?.description}</p>
      <div className="hero-btns">
        <a className="btn btn-primary" href={`mailto:${data?.email}`}>
          Entrar em contato
        </a>
        <a
          className="btn btn-ghost"
          href={data?.github}
          target="_blank"
          rel="noreferrer"
        >
          GitHub /rosadavi
        </a>
      </div>
    </div>
  );
}
