(ns user
  (:require 
            [mount.core :as mount]
            [swagger-service.figwheel :refer [start-fw stop-fw cljs]]
            [swagger-service.core :refer [start-app]]))

(defn start []
  (mount/start-without #'swagger-service.core/repl-server))

(defn stop []
  (mount/stop-except #'swagger-service.core/repl-server))

(defn restart []
  (stop)
  (start))


