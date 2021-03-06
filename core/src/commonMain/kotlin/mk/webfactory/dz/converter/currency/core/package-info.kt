/**
 * Core module v.0.1 - Lookup table. Boring.

+--------------------+    +---------------------------+
| FromToCurrencyPair |    | RateNotAvailableException |
+--------------------+    +---------------------------+
| + FROM: Currency   |                     ^
| + TO:   Currency   |<-----+              |         +----------------+
+--------------------+      |              |    +--->|  ExchangeRate  |
          |                 |              |    |    +----------------+
          |                 |              |    |
          |                ++--------------+----+-+
          V                |                      |
   +------+-------+        | <interface>          |
   |   Currency   |<-------+ ExchangeRateProvider |
   +--------------+        |                      |
                           +----------------------+
                                       ^
                                       |
                            +----------+----------+
                            |                     |
                            |  CurrencyConverter  |
                            |                     |
                            +---------------------+

*/
package mk.webfactory.dz.converter.currency.core

