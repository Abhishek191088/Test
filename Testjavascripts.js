(function(){
  return{
          a:function(){console.log("a");return{b:this.b,c:this.c}},
          b:function(){console.log("b");return{a:this.a,c:this.c}},
          c:function(){console.log("c");return{a:this.a,b:this.b}}
       }  
})();
