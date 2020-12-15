import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | contacthome/Addcontact', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:contacthome/addcontact');
    assert.ok(route);
  });
});
