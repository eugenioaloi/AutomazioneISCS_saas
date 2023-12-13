<template>
    <div>
      <v-card
        class="mx-auto pa-12 pb-8"
        elevation="8"
        max-width="448"
        rounded="lg"
      >
  
        <div class="d-flex justify-center">
            <v-card-title class="text-h5 text-md-h5 text-lg-h4">
              {{ header }}
            </v-card-title>
        </div>
  
        <!--sezione nome utente  -->
        <div class="text-subtitle-1 text-medium-emphasis d-flex align-center justify-space-between">
          Nome utente
        </div>
        <v-text-field
          density="compact"
          placeholder="Inserisci il Nome utente"
          prepend-inner-icon="mdi-account"
          variant="outlined"
          v-model="nomeUt"
          :rules = "[rules.nomeUtReq]"
        />
          
        <!-- sezione password  -->
        <div class="text-subtitle-1 text-medium-emphasis d-flex align-center justify-space-between">
          Password
        </div>
        <v-text-field
          :append-inner-icon="visible ? 'mdi-eye-off' : 'mdi-eye'"
          :type="visible ? '' : 'password'"
          density="compact"
          placeholder="Inserisci la password"
          prepend-inner-icon="mdi-lock-outline"
          variant="outlined"
          @click:append-inner="visible = !visible"
          v-model="password"
          :rules = "[rules.passwordReq]"
        />
        
        <!--sezione bottone  -->
        <v-btn
          block
          class="mb-8"
          color="success"
          size="large"
          :disabled ="!formValid"
          @click="handleLogin"
        >Accedi</v-btn>
  
          <v-card-text class="text-center">
            <a
              class="text-blue text-decoration-none"
              href="#"
              rel="noopener noreferrer"
              target="_blank"
            >Credenziali dimenticate? 
                <v-icon icon="mdi-chevron-right"></v-icon>
            </a>
          </v-card-text>
      </v-card>
    </div>
  </template>
  
  <script>
  export default {
    data: () => ({
      header: 'Accedi al laboratorio',
      nomeUt: "",
      password: "",
      visible: false,
      rules:{
        nomeUtReq: req => !!req || "E' richiesto il nome utente",
        passwordReq: req => !!req || "E' richiesta la password"
      }
    }),
    methods:{
      handleLogin(){
        console.log("nomeUt ", this.nomeUt);
        console.log("psw ", this.password);
      },
      
    },
    computed:{
      formValid(){
        return this.nomeUt !="" && this.password !=""?true:false
      },
    }
  }
  </script>