Lookup a definition
Narrative:
  In order to make me feel **a sense of accomplishment**
  As a forgetful person
  I want to be to _view all of things I have completed_s

Scenario: Looking up the definition of 'apple'
Given that Jane has a todo list containing Buy some milk, Walk the dog
And has completed the task called 'Walk the dog'
When filters her list to show only Completed tasks
Then todo list should contain Walk the dog

Scenario: Looking up the definition of 'pear'
Given that Jane has a todo list containing <tasks>
And has completed the task called 'Walk the dog'
When filters her list to show only <filter> tasks
Then todo list should contain <expected>
Examples:
| tasks                       | filter    | expected      |
| Buy some milk, Walk the dog | Active    | Buy some milk |
| Buy some milk, Walk the dog | Completed | Walk the dog  |
