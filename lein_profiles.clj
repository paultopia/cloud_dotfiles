{:user {
        :plugins [[lein-try "0.4.3"]
                  [nightlight/lein-nightlight "1.3.0"]
                  [lein-bin "0.3.5"]
                  [lein-ancient "0.6.10"]
                  [jonase/eastwood "0.2.3"]
                  [lein-kibit "0.1.2"]
                  [lein-deps-tree "0.1.2"]
                  [venantius/ultra "0.5.0"]
                  [lein-cljfmt "0.5.2"]
                  [lein-bikeshed "0.3.0"]
                  [lein-checkall "0.1.1"]
                  [lein-gitify "0.1.0"]
                  [lein-oneoff "0.3.2"]
                  [hiccup-bridge "1.0.1"]
                  [lein-plz "0.4.0-SNAPSHOT" :exclusions [[rewrite-clj] [ancient-clj]]]]

	:dependencies [[com.cemerick/pomegranate "0.3.1"]]
	} 
 
 }
{:repl {:dependencies [^:displace [org.clojure/clojure "1.8.0"]]}}