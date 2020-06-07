object Collections_Safe {

  //Interference between iterators and collection updates is eliminated.
//The statically typed and functional nature of Scala's collections means that the overwhelming majority of errors you might make are caught
  //at compile-time
//the usages of the collection operation make inputs and output explicit as function parameters and results.
  //These explicit inputs and outputs are subject to static type checking.
  //large majority of misuses will manifest themselves as type errors.
//What's more, collections are have been adapted to parallel execution on multi-cores.
  // Parallel collections support the same operations as sequential ones, so no new operations need to be learned and no code needs to be rewritten.
//You can turn a sequential collection into a parallel one simply by invoking the par method.
  //For instance, a string is
  //conceptually a sequence of characters. Consequently, in Scala collections, strings support all sequence operations. The same holds for arrays.

  //Immutable collections, by contrast, never change. You still have operations that simulate additions, removals, or updates, but those operations will in each case return a new collection and leave the old collection unchanged.
/*
  The difference between root collections and immutable collections is that clients of an immutable collection have a guarantee that nobody can mutate the collection, whereas clients of a root collection only know that they can't change the collection themselves. Even though the static type of such a collection provides no operations for modifying the collection,
  it might still be possible that the run- time type is a mutable collection that can be changed by other clients.
*/
  /*

  Traversable
      Iterable
          Seq
              IndexedSeq
                  Vector
                  ResizableArray
                  GenericArray
              LinearSeq
                  MutableList
                  List
                  Stream
              Buffer
                  ListBuffer
                  ArrayBuffer
          Set
              SortedSet
                  TreeSet
              HashSet (mutable)
              LinkedHashSet
              HashSet (immutable)
              BitSet
              EmptySet, Set1, Set2, Set3, Set4
          Map
              SortedMap
                  TreeMap
              HashMap (mutable)
              LinkedHashMap (mutable)
              HashMap (immutable)
              EmptyMap, Map1, Map2, Map3, Map4
   */

  /*

  The Scala List class is very different from the Java List classes -- including the part where it’s immutable --
  and although the Scala Array is an improvement on the Java array in most ways, it’s not even recommended as the “go to” sequential collection class.
   */

}
