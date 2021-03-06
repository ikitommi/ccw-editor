(require '[paredit.core :as p])
(alter-var-root
  #'p/lisp-forms
  conj
       ; Midje
       "fact"  "midje.sweet/fact"
       "facts" "midje.sweet/facts"

       ;compojure-api
       "GET*"  "compojure.api.core/GET*"
       "ANY*"  "compojure.api.core/ANY*"
       "HEAD*"  "compojure.api.core/GET*"
       "PATCH*"  "compojure.api.core/PATCH*"
       "DELETE*"  "compojure.api.core/DELETE*"
       "OPTIONS*"  "compojure.api.core/OPTIONS*"
       "POST*"  "compojure.api.core/POST*"
       "PUT*"  "compojure.api.core/PUT*"
       "swaggered"  "compojure.api.core/swaggered"
       "swagger-docs"  "compojure.api.core/swagger-docs"

       ;compojure
       "context" "compojure.core/context"
       )
(alter-var-root
  #'p/lisp-forms
  disj
       ; Threading macros
       "->"  "clojure.core/->"
       "->>"  "clojure.core/->>"
       "some->"  "clojure.core/some->"
       "some->>"  "clojure.core/some->>"
       "cond->"  "clojure.core/cond->"
       "cond->>"  "clojure.core/cond->>"
       )