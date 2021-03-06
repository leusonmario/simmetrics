Change Log
==========

## Since 3.2.3 ##
 - Changed license to Apache License Version 2.0
 - Added the Identity metric
 - Added cacheTokens(Cache) and cacheStrings(Cache) methods to the StringMetricBuilder
 - Deprecated TokenizingTokenizer and SimplifyingSimplifier utilities in favor of cacheTokens(Cache) and cacheStrings(Cache)
 - Deprecated all convenience caching methods in StringMetric builder in favor of cacheTokens(Cache) and cacheStrings(Cache)
 - Deprecated Math utility class

## Since 3.2.2 ##
 - There has been no release for v3.2.2

## Since 3.2.1 ##
 - Fixed bug where EuclidianDistance would return incorrect similarity when one argument was empty
 - Fixed bug where Tokenizers.whiteSpace and Whitespace would return leading empty tokens
 - Corrected DamerauLevenshtein.tostring to include all cost parameters
 - Case, NonDiacritics, WordCharacters simplifiers have been depreciated over having unclear names and to avoid leaking implementation details. Equivalent functions have been added to Simplifiers
 - Added Simplifiers.replaceAll and Simplifiers.removeAll. These respectively replace and remove parts of a string based on a regex.
 - QGram, QGramExtended and WhiteSpace have been deprecated due to having ambiguous names and to avoid leaking implementation details. 
 - Added Tokenizers.pattern to create a tokenizer that splits a string based on a regex.
 - StringMetrics.compare and StringMetrics.compareArrays have been depreciated for a lack of a clear use case.

## Since 3.2.0 ##

 - Better handling of null elements in ListDistance and ListMetric
 - Added transformation step for tokens in StringMetricBuilder
 - Added efficient chaining of tokenizers, simplifiers, filters and transforms
 - Fixed bug where builder would allow incorrect initial step

## Since 3.1.0 ##
 - Added Block distance
 - Added Hamming distance
 - Added Damerau-Levenshtein
 - Added weights to Levensthein
 - Minor optimization for Levensthein
 - Fixed bug where Levensthein would return incorrect similarity when one argument was empty
 - Fixed bug where NeedlemanWunch would return incorrect similarity one argument was empty
 - SmithWaterman.toString and SmithWatermanGotoh.toString now return correct values
 - Jaro now returns correct similarity for strings containing \0

## Since 3.0.4 ##
  - Fixed bug where Jaro would produce NaN similarity when neither string had any characters in common.

## Since 3.0.3 ##
  - Clarified java doc w/ regards to reflexive reflexive properties
  - Clarified java doc w/ regards to NullPointerExceptions
  - Optimization of Jaro
  - Optimization of SimonWhite
  - Various minor optimizations

## Since 3.0.2 ##
  - Optimization of Jaro

## Since 3.0.1 ##
  - Fixed dependency on snapshot version of core in example module.

## Since 3.0.0 ##

 - Further crud removal
  - Removed Chapman Algorithms
  - Removed Taglink and Taglink Token
  - Removed CSV tokenizer
 - Improved algorithms
  - Improved Jaro
    - Fixed bug that incorrectly calculated the half length
    - Refactored code
    - Added tests based on Wikipedia references
  - Changed MongeElkan implementation
    - Added normalization to remove asymmetry
    - Similarity is now calculated as sqrt(monge-elkan(a,b) * monge-elkan(b,a))
  - Changed Matching Coeficient implementation
    - Original implementation should have been identical to Jaccard but wasn't. Implementation now is Jaccard but for lists rather then sets.
  - Refactored Levenstein and NeedlemanWunch
    - Memory reduced from O(n^2) to O(n)
  - Reimplemented SmithWatermanGotoh and SmithWaterman
    - SW implementation was Gotoh's O(n^2) implementation. SWG was regular SW. Implementations have been swapped.
  - Refactored cost functions 
    - Replaced SubstitutionCostFunction and AffineGapPenalty interfaces with Substitution and Gap interface respectively.
    - Gap penalties and mismatched character both apply a negative value.
 - Reduced  of StringBuilder syntax
 - Added simplifiers from Apache Encoders project	
   - Caverphone1
   - Caverphone2
   - ColognePhonetic
   - DaitchMokotoffSoundex
   - DoubleMetaphone
   - MatchRatingApproach
   - Metaphone
   - Nysiis
   - RefinedSoundex
   - Soundex

## Since 2.0.0 ##

 - General refactoring
 - Added StringMetricBuilder
