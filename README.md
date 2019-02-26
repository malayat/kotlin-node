## Simple Node example with Kotlin

### Compile your Kotlin code to JS

```bash
gradle build
```

### Start your Node server

```bash
node node/crypto.js
```
### Go to
 
 - [http://localhost:3000/crypto](http://localhost:3000/crypto)



### ModuleKind


    Kotlin documentation:
    - plain (default)
    - amd: is usually used on the client-side in the browser. The idea behind AMD is to load modules asynchronously, thus improving usability and performance.
    - commonjs: is the module system used on the server-side, and in particular with node.js. Node modules all abide by this definition. CommonJS modules can also be used in the browser via Browserify.
    - umd: tries to unify both models allowing these to be used either on the client or server

Source: [https://medium.com/@Miqubel/your-first-node-js-app-with-kotlin-30e07baa0bf7](https://medium.com/@Miqubel/your-first-node-js-app-with-kotlin-30e07baa0bf7)