module.exports = {
  // 基本路径
  publicPath: "./",
  // 输出路径
  outputDir: "dist",
  // 静态资源
  assetsDir: "./",
  // eslint-loader是否在保存时候检查
  lintOnSave: true,
  // 服务项配置
  devServer: {
    host: "localhost",
    port: 8081,
    https: false,
    open: true,
    // 设置代理proxy
    proxy: {
      "/api": {
        target: "http://localhost:8080",
        changeOrigin: true, //表示是否跨域，
        pathRewrite: {
          //表示需要rewrite重写的
          "^/api": "  "
        }
      }
    }
  }
};
