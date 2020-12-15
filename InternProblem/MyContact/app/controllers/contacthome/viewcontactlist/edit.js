import Controller from '@ember/controller';

export default Controller.extend({
                actions:{
                    test(x){
                        console.log(x);
                    }
                }
                // init(){
                //         this.get(this.model);
                //     // let Data = Em.getOwner(this).lookup("controller:contacthome"); 
                //     // this.set("Data",Data);
                //     // console.log(Data)
                // }
            
    
});
