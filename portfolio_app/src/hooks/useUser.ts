import { useState, useEffect } from "react";
import { API } from "../api";

type User = {
  id: string;
  name: string;
  description: string;
  topic: string;
  github: string;
  email: string;
  phone: string;
  linkedin: string;
};

export function useUser() {
  const [data, setData] = useState<User | null>(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    API.get("/user/list/c7b7925f-5643-48e9-a140-42fba3b07a73")
      .then(setData)
      .catch((err) => setError(err.message))
      .finally(() => setLoading(false));
  }, []);

  return { data, loading, error };
}
