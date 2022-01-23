module.exports = {  
    devServer: {  
      proxy: "http://localhost:8081"
    },  
    chainWebpack: config => {  
      const svgRule = config.module.rule("svg");    
      svgRule.uses.clear();    
      svgRule.use("vue-svg-loader").loader("vue-svg-loader");  
    }  
  };