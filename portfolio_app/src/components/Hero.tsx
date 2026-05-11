export function Hero() {
  return (
    <div className="hero">
      <div className="avail">
        <span className="avail-dot" />
        disponível para novas oportunidades
      </div>
      <div className="hero-tag">Full Stack Developer · Brasília, DF</div>
      <h1>
        Davi Gustavo Rosa
      </h1>
      <p className="hero-desc">
        Desenvolvedor Full Stack com foco em backend Java/Spring e APIs REST.
        Experiência real em produção: gateway de pagamentos Pix, sistemas
        integrados com órgãos públicos e plataformas SaaS.
      </p>
      <div className="hero-btns">
        <a className="btn btn-primary" href="mailto:davi.rosa.ofc@gmail.com">
          Entrar em contato
        </a>
        <a
          className="btn btn-ghost"
          href="https://github.com/rosadavi"
          target="_blank"
          rel="noreferrer"
        >
          GitHub /rosadavi
        </a>
      </div>
    </div>
  );
}
