import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | viewcontactlist', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:viewcontactlist');
    assert.ok(route);
  });
});
