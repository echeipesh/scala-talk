Summary:

Good:
- "Dependency injenction" is easy and clear
  - What is this even?
- Dependencies are expressed in types(vs imports), nice
- Baked cake can't be messed with, also safe
- Clearly useful and proven to work


Bad:
- Namespace collisions, all the traits get dumped together
  - Mitigrate with inner objects
- Cake can become a Blob, engalfs all
  - "Oh, I need that thing that is in the cake .. Another layer!"
  - Control the Cake
- Initilization management
  - Lifetime may make order of extension meaningful, eek

Conclusion:
  - Best used with very large granululity components, subsystems
    - use Cake at the "edges"
  - Once you can't give it a name, it's probably too big