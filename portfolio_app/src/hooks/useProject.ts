import { useState, useEffect } from "react";
import { API } from "../api";

export function useProject() {
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    API.get("/project/list/c7b7925f-5643-48e9-a140-42fba3b07a73")
      .then(setData)
      .catch((err) => {
        console.error("Erro ao buscar project:", err);
        setError(err);
      })
      .finally(() => setLoading(false));
  }, []);

  return { data, loading, error };
}
