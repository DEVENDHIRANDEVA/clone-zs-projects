import Controller from '@ember/controller';
import { A } from '@ember/array';
export default Controller.extend({
    actions:{
        cancel(){
            this.transitionToRoute("contacthome");
        } 
}

});



