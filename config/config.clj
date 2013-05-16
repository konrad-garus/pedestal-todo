(ns config
  (:require [net.cgrand.enlive-html :as html]
            [io.pedestal.app-tools.compile :as compile]))

(def configs
  {:todo-app
   {:build {:watch-files (compile/html-files-in "templates")
            ;; When an HTML file changes, trigger the compilation of
            ;; any files which use macros to read in templates. 
            :triggers {:html [#"todo_app/app.js"]}}
    :application {:generated-javascript "generated-js"
                  :api-server {:host "localhost" :port 8080 :log-fn nil}
                  :default-template "application.html"
                  :output-root :public}
    :control-panel {:design {:uri "/design.html"
                             :name "Design"
                             :order 0}}
    :aspects {:development {:uri "/todo-app-dev.html"
                            :name "Development"
                            :out-file "todo-app-dev.js"
                            :scripts ["goog.require('todo_app.app');"
                                      "todo_app.app.main();"]
                            :order 1}
              :production {:uri "/todo-app.html"
                           :name "Production"
                           :optimizations :advanced
                           :out-file "todo-app.js"
                           :scripts ["todo_app.app.main();"]
                           :order 2}}}})
