import { useState, useEffect } from "react";
import { API } from "../api";

export function useProject() {
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    API.get("/project/list/308f4de6-2aed-488a-879e-8fe457f65aca")
      .then(setData)
      .catch((err) => {
        console.error("Erro ao buscar project:", err);
        setError(err);
      })
      .finally(() => setLoading(false));
  }, []);

  return { data, loading, error };
}
