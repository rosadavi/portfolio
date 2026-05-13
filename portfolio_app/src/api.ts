const BASE = "/api";

export const API = {
  get: (path: string) => fetch(`${BASE}${path}`).then((res) => res.json()),
};
