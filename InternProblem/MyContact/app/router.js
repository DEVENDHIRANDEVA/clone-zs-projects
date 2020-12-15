import EmberRouter from '@ember/routing/router';
import config from './config/environment';

export default class Router extends EmberRouter {
  location = config.locationType;
  rootURL = config.rootURL;
}

Router.map(function() {
  this.route('contacthome', function() {
    this.route('Addcontact',{path:'/addnewcontact'});
    this.route('viewcontactlist',{path:"/contactlist"});
  });

  this.route('viewcontactlist', function() {
    this.route('edit');
    this.route('delete');
  });
});
	