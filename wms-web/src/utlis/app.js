import cookie from "cookie_js";

const adminToKen = "token";

export function getToKen() {
  return cookie.get(adminToKen);
}

export function setToKen(token) {
  return cookie.set(adminToKen, token);
}

export function removeToKen() {
  return cookie.remove(adminToKen);
}
