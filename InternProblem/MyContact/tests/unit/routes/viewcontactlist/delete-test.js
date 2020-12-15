import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | viewcontactlist/delete', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:viewcontactlist/delete');
    assert.ok(route);
  });
});
