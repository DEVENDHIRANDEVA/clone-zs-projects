import Controller from '@ember/controller';

export default Controller.extend({
        actions:{
            gotohomepage(){
                this.transitionToRoute("contacthome");
            }
        }
});
