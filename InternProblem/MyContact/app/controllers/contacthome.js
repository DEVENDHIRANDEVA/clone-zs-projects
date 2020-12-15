import Controller from '@ember/controller';
import { A } from '@ember/array';

export default Controller.extend({
                   
                    contactDetails:A([]),
                    actions:{
                        Add(name,num,mid){                                  
                                    var newid=this.contactDetails.length+1;
                                    var  newContact={"id":newid,'name':name,'number':num,'email':mid};
                                    this.contactDetails.pushObject(newContact);              
                                    console.log(this.contactDetails);
                                
                        },                       
                        deletecontact(id){                                      
                                    for(var index=0;index<this.contactDetails.length;index++){
                                            if(this.contactDetails[index].id==id){                                             
                                                this.contactDetails.splice(index,1);                              
                                                                                   
                                            }
                                    };
                         },
                         edit(id){  
                                    
                                   
                                    for(var index=0;index<this.contactDetails.length;index++){
                                            if(this.contactDetails[index].id==id){
                                                var array=[];   
                                                let id=this.contactDetails[index].id;
                                                let name=this.contactDetails[index].name;
                                                let email=this.contactDetails[index].email;
                                                let number=this.contactDetails[index].number;
                                                array.push(name,email,id,number);
                                                
                                                
                                                  this.set("contactDetails",this.contactDetails);                                          

                                                
                                                  

                                            }
                                    };

                         },
                        
                              
                       
                        
                    }     
                
               
               
});
