import Route from '@ember/routing/route';

export default Route.extend({
   actions:{
                delete:function(id){                    
                    this.controllerFor('contacthome').send('deletecontact',id);            
                 },edit(id){
                    this.controllerFor('contacthome').send('edit',id); 
                 }
          
                 
   }
});
