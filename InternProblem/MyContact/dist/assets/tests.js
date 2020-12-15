'use strict';

define("my-contact/tests/integration/components/formpage-test", ["qunit", "ember-qunit", "@ember/test-helpers"], function (_qunit, _emberQunit, _testHelpers) {
  "use strict";

  (0, _qunit.module)('Integration | Component | formpage', function (hooks) {
    (0, _emberQunit.setupRenderingTest)(hooks);
    (0, _qunit.test)('it renders', async function (assert) {
      // Set any properties with this.set('myProperty', 'value');
      // Handle any actions with this.set('myAction', function(val) { ... });
      await (0, _testHelpers.render)(Ember.HTMLBars.template(
      /*
        <Formpage />
      */
      {
        id: "1W2G3Mrp",
        block: "{\"symbols\":[],\"statements\":[[5,\"formpage\",[],[[],[]]]],\"hasEval\":false}",
        meta: {}
      }));
      assert.equal(this.element.textContent.trim(), ''); // Template block usage:

      await (0, _testHelpers.render)(Ember.HTMLBars.template(
      /*
        
            <Formpage>
              template block text
            </Formpage>
          
      */
      {
        id: "b/we1zSm",
        block: "{\"symbols\":[],\"statements\":[[0,\"\\n      \"],[5,\"formpage\",[],[[],[]],{\"statements\":[[0,\"\\n        template block text\\n      \"]],\"parameters\":[]}],[0,\"\\n    \"]],\"hasEval\":false}",
        meta: {}
      }));
      assert.equal(this.element.textContent.trim(), 'template block text');
    });
  });
});
define("my-contact/tests/integration/components/listpage-test", ["qunit", "ember-qunit", "@ember/test-helpers"], function (_qunit, _emberQunit, _testHelpers) {
  "use strict";

  (0, _qunit.module)('Integration | Component | listpage', function (hooks) {
    (0, _emberQunit.setupRenderingTest)(hooks);
    (0, _qunit.test)('it renders', async function (assert) {
      // Set any properties with this.set('myProperty', 'value');
      // Handle any actions with this.set('myAction', function(val) { ... });
      await (0, _testHelpers.render)(Ember.HTMLBars.template(
      /*
        <Listpage />
      */
      {
        id: "EEQKqm8w",
        block: "{\"symbols\":[],\"statements\":[[5,\"listpage\",[],[[],[]]]],\"hasEval\":false}",
        meta: {}
      }));
      assert.equal(this.element.textContent.trim(), ''); // Template block usage:

      await (0, _testHelpers.render)(Ember.HTMLBars.template(
      /*
        
            <Listpage>
              template block text
            </Listpage>
          
      */
      {
        id: "jbNmvMqL",
        block: "{\"symbols\":[],\"statements\":[[0,\"\\n      \"],[5,\"listpage\",[],[[],[]],{\"statements\":[[0,\"\\n        template block text\\n      \"]],\"parameters\":[]}],[0,\"\\n    \"]],\"hasEval\":false}",
        meta: {}
      }));
      assert.equal(this.element.textContent.trim(), 'template block text');
    });
  });
});
define("my-contact/tests/lint/app.lint-test", [], function () {
  "use strict";

  QUnit.module('ESLint | app');
  QUnit.test('app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'app.js should pass ESLint\n\n');
  });
  QUnit.test('components/formpage.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/formpage.js should pass ESLint\n\n');
  });
  QUnit.test('components/listpage.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/listpage.js should pass ESLint\n\n');
  });
  QUnit.test('controllers/application.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/application.js should pass ESLint\n\n');
  });
  QUnit.test('controllers/contacthome.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/contacthome.js should pass ESLint\n\n12:37 - Unexpected console statement. (no-console)\n21:38 - Unnecessary semicolon. (no-extra-semi)\n42:38 - Unnecessary semicolon. (no-extra-semi)');
  });
  QUnit.test('controllers/contacthome/addcontact.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/contacthome/addcontact.js should pass ESLint\n\n2:10 - \'A\' is defined but never used. (no-unused-vars)');
  });
  QUnit.test('controllers/contacthome/viewcontactlist.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/contacthome/viewcontactlist.js should pass ESLint\n\n2:8 - \'edit\' is defined but never used. (no-unused-vars)\n9:35 - \'Em\' is not defined. (no-undef)');
  });
  QUnit.test('controllers/contacthome/viewcontactlist/delete.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/contacthome/viewcontactlist/delete.js should pass ESLint\n\n6:25 - Unexpected console statement. (no-console)');
  });
  QUnit.test('controllers/contacthome/viewcontactlist/edit.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/contacthome/viewcontactlist/edit.js should pass ESLint\n\n6:25 - Unexpected console statement. (no-console)');
  });
  QUnit.test('resolver.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'resolver.js should pass ESLint\n\n');
  });
  QUnit.test('router.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'router.js should pass ESLint\n\n11:5 - Unexpected capital letter in route\'s name (ember/no-capital-letters-in-routes)');
  });
  QUnit.test('routes/contacthome.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'routes/contacthome.js should pass ESLint\n\n5:25 - Unexpected console statement. (no-console)');
  });
  QUnit.test('routes/contacthome/addcontact.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/contacthome/addcontact.js should pass ESLint\n\n');
  });
  QUnit.test('routes/contacthome/viewcontactlist.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/contacthome/viewcontactlist.js should pass ESLint\n\n');
  });
  QUnit.test('routes/viewcontactlist/delete.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/viewcontactlist/delete.js should pass ESLint\n\n');
  });
  QUnit.test('routes/viewcontactlist/edit.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/viewcontactlist/edit.js should pass ESLint\n\n');
  });
});
define("my-contact/tests/lint/templates.template.lint-test", [], function () {
  "use strict";

  QUnit.module('TemplateLint');
  QUnit.test('my-contact/templates/application.hbs', function (assert) {
    assert.expect(1);
    assert.ok(false, 'my-contact/templates/application.hbs should pass TemplateLint.\n\nmy-contact/templates/application.hbs\n  3:17  error  Incorrect indentation for `<img>` beginning at L3:C17. Expected `<img>` to be at an indentation of 15 but was found at 17.  block-indentation\n  7:25  error  Incorrect indentation for `<button>` beginning at L7:C25. Expected `<button>` to be at an indentation of 14 but was found at 25.  block-indentation\n');
  });
  QUnit.test('my-contact/templates/components/formpage.hbs', function (assert) {
    assert.expect(1);
    assert.ok(true, 'my-contact/templates/components/formpage.hbs should pass TemplateLint.\n\n');
  });
  QUnit.test('my-contact/templates/components/listpage.hbs', function (assert) {
    assert.expect(1);
    assert.ok(true, 'my-contact/templates/components/listpage.hbs should pass TemplateLint.\n\n');
  });
  QUnit.test('my-contact/templates/contacthome.hbs', function (assert) {
    assert.expect(1);
    assert.ok(false, 'my-contact/templates/contacthome.hbs should pass TemplateLint.\n\nmy-contact/templates/contacthome.hbs\n  1:1  error  Incorrect indentation for `<div>` beginning at L1:C1. Expected `<div>` to be at an indentation of 0, but was found at 1.  block-indentation\n  3:8  error  Incorrect indentation for `div` beginning at L1:C1. Expected `</div>` ending at L3:C8 to be at an indentation of 1 but was found at 2.  block-indentation\n  2:5  error  Incorrect indentation for `<h1>` beginning at L2:C5. Expected `<h1>` to be at an indentation of 3 but was found at 5.  block-indentation\n  8:6  error  Incorrect indentation for `<button>` beginning at L8:C6. Expected `<button>` to be at an indentation of 4 but was found at 6.  block-indentation\n  9:6  error  Incorrect indentation for `<button>` beginning at L9:C6. Expected `<button>` to be at an indentation of 4 but was found at 6.  block-indentation\n');
  });
  QUnit.test('my-contact/templates/contacthome/addcontact.hbs', function (assert) {
    assert.expect(1);
    assert.ok(false, 'my-contact/templates/contacthome/addcontact.hbs should pass TemplateLint.\n\nmy-contact/templates/contacthome/addcontact.hbs\n  41:12  error  Incorrect indentation for `form` beginning at L4:C3. Expected `</form>` ending at L41:C12 to be at an indentation of 3 but was found at 5.  block-indentation\n  5:7  error  Incorrect indentation for `<div>` beginning at L5:C7. Expected `<div>` to be at an indentation of 5 but was found at 7.  block-indentation\n  14:7  error  Incorrect indentation for `<div>` beginning at L14:C7. Expected `<div>` to be at an indentation of 5 but was found at 7.  block-indentation\n  25:7  error  Incorrect indentation for `<div>` beginning at L25:C7. Expected `<div>` to be at an indentation of 5 but was found at 7.  block-indentation\n  35:7  error  Incorrect indentation for `<div>` beginning at L35:C7. Expected `<div>` to be at an indentation of 5 but was found at 7.  block-indentation\n  6:8  error  Incorrect indentation for `<div>` beginning at L6:C8. Expected `<div>` to be at an indentation of 9 but was found at 8.  block-indentation\n  8:15  error  Incorrect indentation for `div` beginning at L6:C8. Expected `</div>` ending at L8:C15 to be at an indentation of 8 but was found at 9.  block-indentation\n  7:11  error  Incorrect indentation for `<label>` beginning at L7:C11. Expected `<label>` to be at an indentation of 10 but was found at 11.  block-indentation\n  11:10  error  Incorrect indentation for `{{input}}` beginning at L11:C10. Expected `{{input}}` to be at an indentation of 11 but was found at 10.  block-indentation\n  15:8  error  Incorrect indentation for `<div>` beginning at L15:C8. Expected `<div>` to be at an indentation of 9 but was found at 8.  block-indentation\n  18:8  error  Incorrect indentation for `<div>` beginning at L18:C8. Expected `<div>` to be at an indentation of 9 but was found at 8.  block-indentation\n  26:8  error  Incorrect indentation for `<div>` beginning at L26:C8. Expected `<div>` to be at an indentation of 9 but was found at 8.  block-indentation\n  28:15  error  Incorrect indentation for `div` beginning at L26:C8. Expected `</div>` ending at L28:C15 to be at an indentation of 8 but was found at 9.  block-indentation\n  27:11  error  Incorrect indentation for `<label>` beginning at L27:C11. Expected `<label>` to be at an indentation of 10 but was found at 11.  block-indentation\n  32:14  error  Incorrect indentation for `div` beginning at L29:C9. Expected `</div>` ending at L32:C14 to be at an indentation of 9 but was found at 8.  block-indentation\n  31:10  error  Incorrect indentation for `{{input}}` beginning at L31:C10. Expected `{{input}}` to be at an indentation of 11 but was found at 10.  block-indentation\n');
  });
  QUnit.test('my-contact/templates/contacthome/viewcontactlist.hbs', function (assert) {
    assert.expect(1);
    assert.ok(false, 'my-contact/templates/contacthome/viewcontactlist.hbs should pass TemplateLint.\n\nmy-contact/templates/contacthome/viewcontactlist.hbs\n  15:8  error  Incorrect indentation for `{{#each}}` beginning at L15:C8. Expected `{{#each}}` to be at an indentation of 6 but was found at 8.  block-indentation\n  23:14  error  Incorrect indentation for `each` beginning at L15:C8. Expected `{{/each}}` ending at L23:C14 to be at an indentation of 8 but was found at 5.  block-indentation\n  16:12  error  Incorrect indentation for `<tr>` beginning at L16:C12. Expected `<tr>` to be at an indentation of 10 but was found at 12.  block-indentation\n  17:16  error  Incorrect indentation for `<td>` beginning at L17:C16. Expected `<td>` to be at an indentation of 14 but was found at 16.  block-indentation\n  18:16  error  Incorrect indentation for `<td>` beginning at L18:C16. Expected `<td>` to be at an indentation of 14 but was found at 16.  block-indentation\n  19:16  error  Incorrect indentation for `<td>` beginning at L19:C16. Expected `<td>` to be at an indentation of 14 but was found at 16.  block-indentation\n  20:15  error  Incorrect indentation for `<td>` beginning at L20:C15. Expected `<td>` to be at an indentation of 14 but was found at 15.  block-indentation\n  21:15  error  Incorrect indentation for `<td>` beginning at L21:C15. Expected `<td>` to be at an indentation of 14 but was found at 15.  block-indentation\n  28:11  error  Incorrect indentation for `<button>` beginning at L28:C11. Expected `<button>` to be at an indentation of 6 but was found at 11.  block-indentation\n');
  });
  QUnit.test('my-contact/templates/viewcontactlist/delete.hbs', function (assert) {
    assert.expect(1);
    assert.ok(true, 'my-contact/templates/viewcontactlist/delete.hbs should pass TemplateLint.\n\n');
  });
  QUnit.test('my-contact/templates/viewcontactlist/edit.hbs', function (assert) {
    assert.expect(1);
    assert.ok(false, 'my-contact/templates/viewcontactlist/edit.hbs should pass TemplateLint.\n\nmy-contact/templates/viewcontactlist/edit.hbs\n  1:1  error  Incorrect indentation for `<form>` beginning at L1:C1. Expected `<form>` to be at an indentation of 0, but was found at 1.  block-indentation\n  38:12  error  Incorrect indentation for `form` beginning at L1:C1. Expected `</form>` ending at L38:C12 to be at an indentation of 1 but was found at 5.  block-indentation\n  2:7  error  Incorrect indentation for `<div>` beginning at L2:C7. Expected `<div>` to be at an indentation of 3 but was found at 7.  block-indentation\n  11:7  error  Incorrect indentation for `<div>` beginning at L11:C7. Expected `<div>` to be at an indentation of 3 but was found at 7.  block-indentation\n  22:7  error  Incorrect indentation for `<div>` beginning at L22:C7. Expected `<div>` to be at an indentation of 3 but was found at 7.  block-indentation\n  32:7  error  Incorrect indentation for `<div>` beginning at L32:C7. Expected `<div>` to be at an indentation of 3 but was found at 7.  block-indentation\n  3:8  error  Incorrect indentation for `<div>` beginning at L3:C8. Expected `<div>` to be at an indentation of 9 but was found at 8.  block-indentation\n  5:15  error  Incorrect indentation for `div` beginning at L3:C8. Expected `</div>` ending at L5:C15 to be at an indentation of 8 but was found at 9.  block-indentation\n  4:11  error  Incorrect indentation for `<label>` beginning at L4:C11. Expected `<label>` to be at an indentation of 10 but was found at 11.  block-indentation\n  8:10  error  Incorrect indentation for `{{input}}` beginning at L8:C10. Expected `{{input}}` to be at an indentation of 11 but was found at 10.  block-indentation\n  12:8  error  Incorrect indentation for `<div>` beginning at L12:C8. Expected `<div>` to be at an indentation of 9 but was found at 8.  block-indentation\n  15:8  error  Incorrect indentation for `<div>` beginning at L15:C8. Expected `<div>` to be at an indentation of 9 but was found at 8.  block-indentation\n  23:8  error  Incorrect indentation for `<div>` beginning at L23:C8. Expected `<div>` to be at an indentation of 9 but was found at 8.  block-indentation\n  25:15  error  Incorrect indentation for `div` beginning at L23:C8. Expected `</div>` ending at L25:C15 to be at an indentation of 8 but was found at 9.  block-indentation\n  24:11  error  Incorrect indentation for `<label>` beginning at L24:C11. Expected `<label>` to be at an indentation of 10 but was found at 11.  block-indentation\n  29:14  error  Incorrect indentation for `div` beginning at L26:C9. Expected `</div>` ending at L29:C14 to be at an indentation of 9 but was found at 8.  block-indentation\n  28:10  error  Incorrect indentation for `{{input}}` beginning at L28:C10. Expected `{{input}}` to be at an indentation of 11 but was found at 10.  block-indentation\n');
  });
});
define("my-contact/tests/lint/tests.lint-test", [], function () {
  "use strict";

  QUnit.module('ESLint | tests');
  QUnit.test('integration/components/formpage-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/formpage-test.js should pass ESLint\n\n');
  });
  QUnit.test('integration/components/listpage-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/listpage-test.js should pass ESLint\n\n');
  });
  QUnit.test('test-helper.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'test-helper.js should pass ESLint\n\n');
  });
  QUnit.test('unit/controllers/addcontact-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/addcontact-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/controllers/application-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/application-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/controllers/contacthome-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/contacthome-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/controllers/contacthome/addcontact-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/contacthome/addcontact-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/controllers/contacthome/viewcontactlist-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/contacthome/viewcontactlist-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/controllers/viewcontactlist-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/viewcontactlist-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/controllers/viewcontactlist/delete-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/viewcontactlist/delete-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/controllers/viewcontactlist/edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/viewcontactlist/edit-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/routes/addcontact-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/addcontact-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/routes/contacthome-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/contacthome-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/routes/contacthome/addcontact-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/contacthome/addcontact-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/routes/contacthome/viewcontactlist-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/contacthome/viewcontactlist-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/routes/delete-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/delete-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/routes/homepage-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/homepage-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/routes/viewcontactlist-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/viewcontactlist-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/routes/viewcontactlist/delete-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/viewcontactlist/delete-test.js should pass ESLint\n\n');
  });
  QUnit.test('unit/routes/viewcontactlist/edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/viewcontactlist/edit-test.js should pass ESLint\n\n');
  });
});
define("my-contact/tests/test-helper", ["my-contact/app", "my-contact/config/environment", "@ember/test-helpers", "ember-qunit"], function (_app, _environment, _testHelpers, _emberQunit) {
  "use strict";

  (0, _testHelpers.setApplication)(_app.default.create(_environment.default.APP));
  (0, _emberQunit.start)();
});
define("my-contact/tests/unit/controllers/addcontact-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Controller | addcontact', function (hooks) {
    (0, _emberQunit.setupTest)(hooks); // Replace this with your real tests.

    (0, _qunit.test)('it exists', function (assert) {
      let controller = this.owner.lookup('controller:addcontact');
      assert.ok(controller);
    });
  });
});
define("my-contact/tests/unit/controllers/application-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Controller | application', function (hooks) {
    (0, _emberQunit.setupTest)(hooks); // Replace this with your real tests.

    (0, _qunit.test)('it exists', function (assert) {
      let controller = this.owner.lookup('controller:application');
      assert.ok(controller);
    });
  });
});
define("my-contact/tests/unit/controllers/contacthome-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Controller | contacthome', function (hooks) {
    (0, _emberQunit.setupTest)(hooks); // Replace this with your real tests.

    (0, _qunit.test)('it exists', function (assert) {
      let controller = this.owner.lookup('controller:contacthome');
      assert.ok(controller);
    });
  });
});
define("my-contact/tests/unit/controllers/contacthome/addcontact-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Controller | contacthome/addcontact', function (hooks) {
    (0, _emberQunit.setupTest)(hooks); // Replace this with your real tests.

    (0, _qunit.test)('it exists', function (assert) {
      let controller = this.owner.lookup('controller:contacthome/addcontact');
      assert.ok(controller);
    });
  });
});
define("my-contact/tests/unit/controllers/contacthome/viewcontactlist-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Controller | contacthome/viewcontactlist', function (hooks) {
    (0, _emberQunit.setupTest)(hooks); // Replace this with your real tests.

    (0, _qunit.test)('it exists', function (assert) {
      let controller = this.owner.lookup('controller:contacthome/viewcontactlist');
      assert.ok(controller);
    });
  });
});
define("my-contact/tests/unit/controllers/viewcontactlist-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Controller | viewcontactlist', function (hooks) {
    (0, _emberQunit.setupTest)(hooks); // Replace this with your real tests.

    (0, _qunit.test)('it exists', function (assert) {
      let controller = this.owner.lookup('controller:viewcontactlist');
      assert.ok(controller);
    });
  });
});
define("my-contact/tests/unit/controllers/viewcontactlist/delete-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Controller | viewcontactlist/delete', function (hooks) {
    (0, _emberQunit.setupTest)(hooks); // Replace this with your real tests.

    (0, _qunit.test)('it exists', function (assert) {
      let controller = this.owner.lookup('controller:viewcontactlist/delete');
      assert.ok(controller);
    });
  });
});
define("my-contact/tests/unit/controllers/viewcontactlist/edit-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Controller | viewcontactlist/edit', function (hooks) {
    (0, _emberQunit.setupTest)(hooks); // Replace this with your real tests.

    (0, _qunit.test)('it exists', function (assert) {
      let controller = this.owner.lookup('controller:viewcontactlist/edit');
      assert.ok(controller);
    });
  });
});
define("my-contact/tests/unit/routes/addcontact-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Route | Addcontact', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);
    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:addcontact');
      assert.ok(route);
    });
  });
});
define("my-contact/tests/unit/routes/contacthome-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Route | contacthome', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);
    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:contacthome');
      assert.ok(route);
    });
  });
});
define("my-contact/tests/unit/routes/contacthome/addcontact-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Route | contacthome/Addcontact', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);
    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:contacthome/addcontact');
      assert.ok(route);
    });
  });
});
define("my-contact/tests/unit/routes/contacthome/viewcontactlist-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Route | contacthome/viewcontactlist', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);
    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:contacthome/viewcontactlist');
      assert.ok(route);
    });
  });
});
define("my-contact/tests/unit/routes/delete-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Route | delete', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);
    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:delete');
      assert.ok(route);
    });
  });
});
define("my-contact/tests/unit/routes/homepage-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Route | Homepage', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);
    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:homepage');
      assert.ok(route);
    });
  });
});
define("my-contact/tests/unit/routes/viewcontactlist-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Route | viewcontactlist', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);
    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:viewcontactlist');
      assert.ok(route);
    });
  });
});
define("my-contact/tests/unit/routes/viewcontactlist/delete-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Route | viewcontactlist/delete', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);
    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:viewcontactlist/delete');
      assert.ok(route);
    });
  });
});
define("my-contact/tests/unit/routes/viewcontactlist/edit-test", ["qunit", "ember-qunit"], function (_qunit, _emberQunit) {
  "use strict";

  (0, _qunit.module)('Unit | Route | viewcontactlist/edit', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);
    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:viewcontactlist/edit');
      assert.ok(route);
    });
  });
});
define('my-contact/config/environment', [], function() {
  var prefix = 'my-contact';
try {
  var metaName = prefix + '/config/environment';
  var rawConfig = document.querySelector('meta[name="' + metaName + '"]').getAttribute('content');
  var config = JSON.parse(decodeURIComponent(rawConfig));

  var exports = { 'default': config };

  Object.defineProperty(exports, '__esModule', { value: true });

  return exports;
}
catch(err) {
  throw new Error('Could not read config from meta tag with name "' + metaName + '".');
}

});

require('my-contact/tests/test-helper');
EmberENV.TESTS_FILE_LOADED = true;
//# sourceMappingURL=tests.map
