Very simple TODO application. Shows a form with one text input and a button. Clicking the button adds the text to list of TODOs and updates view.

Pretty much all interesting source code is in [app/src/todo\_app/app.cljs](app/src/todo_app/app.cljs). Contrary to Pedestal samples, this one has very rich explanations in comments.

To launch the application, run the following:

```
lein repl
(dev)
(run)
```

Once it is started, browse to [http://localhost:3000/todo-app-dev.html](http://localhost:3000/todo-app-dev.html).

Based largely on the "helloworld" and "sample" apps from original Pedestal examples.
