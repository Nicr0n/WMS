import service from "@/utlis/request";

/**
 * 登录
 */
export function Login(data) {
  return service.request({
    method: "post",
    url: "/login",
    data
  });
}

/**
 * 登出
 */
export function Logout(data) {
  return service.request({
    method: "post",
    url: "/logout",
    data
  });
}

/**
 * 获取用户角色
 */
export function getUserRole(data) {
  return service.request({
    method: "post",
    url: "/userRole",
    data
  });
}
