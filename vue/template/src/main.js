import Vue from 'vue'
import Element from 'element-ui'
import ElementPersonal from '@ele'
import '@/asset/style/index.scss'
import App from '@/App'
import store from '@/store'
import router from '@/router'
import '@/asset/icon'
import filters from './filter'

Vue.use(Element)
Vue.use(ElementPersonal)
Vue.use(filters)

Vue.config.productionTip = false

new Vue({
    el: '#app',
    router,
    store,
    render: h => h(App)
})
