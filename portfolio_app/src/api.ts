const BASE = "http://localhost:8000";

export const API = {
  get: (path: string) => fetch(`${BASE}${path}`).then((res) => res.json()),
};
