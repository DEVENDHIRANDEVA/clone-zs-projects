import Route from '@ember/routing/route';

export default Route.extend({
                model:function(){
                        console.log(this.controllerFor('contacthome').get('contactDetails'));
                },   
                // passing data to controler
                actions:{      
                       
                        addDedails(name,number,email){                  
                                this.controllerFor('contacthome').send('Add',name,number,email);                    
                        },
                        
                       
                }
                
});
