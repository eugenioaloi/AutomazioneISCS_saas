<template>
  <v-app>
    <v-app-bar v-if="appbar"
      app
      color="primary"
      dark
    >
      <div class="d-flex align-center"> 
        <v-img
          alt="Logo iscs"
          class="shrink mt-1 hidden-sm-and-down"
          contain
          src="https://iscsconsulting.com/wp-content/uploads/2023/08/orizzontale.png"
          width="80"
        />
      </div>

      <v-spacer></v-spacer>

      <v-btn href="/servizi" target="_blank" text>
        <!-- <v-icon>mdi-open-in-new</v-icon> -->
        <span class="mr-2">Servizi</span>
      </v-btn>

      <v-btn href="/blog" target="_blank" text>
        <!-- <v-icon>mdi-open-in-new</v-icon> -->
        <span class="mr-2">Blog</span>
      </v-btn>

      <v-btn href="/login-demo" target="_blank" text>
        <!-- <v-icon>mdi-open-in-new</v-icon> -->
        <span class="mr-2">Login demo</span>
      </v-btn>
  
      <v-btn href="/laboratorio" color="success">
        <span class="mr-2">Demo gratuita</span>
        <v-icon>mdi-page-next-outline</v-icon>
      </v-btn>
      
    </v-app-bar>

    <v-main>
      <router-view/>
    </v-main>
  </v-app>
</template>

<script>

export default {

  data(){
    return{
      isLogged: false,
      arrRouteNoAppBar :["login","laboratorio"],//route dove non serve l'app-bar 
      appbar : true,
    }
  },
  methods:{
    //return true se serve l'app bar
    appBarNecessary(route){
      for(let i=0;i<this.arrRouteNoAppBar.length;i++){
        if(route==this.arrRouteNoAppBar[i]){
          return false
        }
      }
      return true;
    }

  },

  beforeMount(){  
    const currentRoute = this.$route.name;
    this.appbar = this.appBarNecessary(currentRoute);
  }

  

};
</script>
