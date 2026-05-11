import { useState, useEffect } from "react";
import { API } from "../api";

export function useExperience() {
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    API.get("/experience/list/308f4de6-2aed-488a-879e-8fe457f65aca")
      .then(setData)
      .catch((err) => {
        console.error("Erro ao buscar experience:", err);
        setError(err);
      })
      .finally(() => setLoading(false));
  }, []);

  return { data, loading, error };
}
