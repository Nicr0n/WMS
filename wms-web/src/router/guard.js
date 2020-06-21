import router from "./index";
import { getToKen } from "@/utlis/app";

const whiteList = ["/login"];

router.beforeEach((to, from, next) => {
  if (getToKen()) {
    console.log("存在");
    next();
  } else {
    console.log("不存在");
    if (whiteList.indexOf(to.path) !== -1) {
      next();
    } else {
      next("/login");
    }
  }
});
