Summary:

Good:
  - retroactive extension is kind of awesome
  - breaks you out of subtyping as method of extension
  - everybody is doing it

Bad:
  - implicit are "hard to find" compiler churns a lot
  - can make code harder to reader
    "How did that conversion happen?"
    - Mitigate by putting them in expected places
    - Typeclass also helps this, gives you a trait to find

Thought:

You can't have a TypeClass hiarchy, since you can only only
ask for one trait at a time. Other conversions need
to be in scope of where you're using them.

Which is ... good? Makes them less crazy.
You can only combine/chain TypeClasses at call-site.
