import Controller from '@ember/controller';
import edit from './viewcontactlist/edit';


export default Controller.extend({

                init(){
                    this._super(...arguments);        
                    let Details = Em.getOwner(this).lookup("controller:contacthome");         
                    this.set('Details', Details); 
                    
                
                    },
                  actions:{
                        back(){
                            this.transitionToRoute("contacthome");  
                        }
                       
                  }  
                   
            
       
    
       
});
