![chat](assets/icon/chat.png)
# Toasty - Bootstrap Style Toasts
A new way to create toasts, similar like Bootstrap alerts.

[![](https://jitpack.io/v/pprathameshmore/Toasty.svg)](https://jitpack.io/#pprathameshmore/Toasty) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)  [![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/pprathameshmore/Toasty) [![Known Vulnerabilities](https://snyk.io/test/github/pprathameshmore/Toasty/badge.svg)](https://snyk.io/test/github/pprathameshmore/Toasty)


### Demo Application
[![en_badge_web_generic](assets/icon/en_badge_web_generic.png)](https://play.google.com/store/apps/details?id=com.prathameshmore.toasty)

## Sample Screenshot:



![device-2019-07-11-171926](assets/screenshots/device-2019-07-11-171926.png )

## Installation:


In order to use it, you need to include it in your project

#### Gradle:
```groovy
allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
}
```
```groovy
dependencies {
      implementation 'com.github.pprathameshmore:Toasty:v1.1'
}
```
## Usages:


1. Create instance of `Toasty` class
```java
     final Toasty toasty = new Toasty(MainActivity.this);

        Button btnPrimary = findViewById(R.id.btn_primary);

        btnPrimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 toasty.primaryToasty(context, "3 missed call", Toasty.LENGTH_LONG, Toasty.BOTTOM);
            }
        });
```
1. Toasty provides total eight methods to implement different types of Toasts.
2. All Toasty methods takes same parameters as given below.
    ```java
   Toasty toasty = new Toasty(Context contex);
     toasty.secondaryToasty(Context context, String text, int duration, int position);
     infoToasty();
     lightToasty();
     darkToasty();
     successToasty();
     dangerToasty();
     warningToasty();  
    ```
1. The duration can be assigned from`Toasty.LENGTH_LONG` and `Toasty.LENGTH_SHORT`..
2. As in default`Toast`class, Toasts always are shown at the bottom, but in `Toasty` we have to decide where toast should be displayed.
3. `Toasty` provides four parameters:
4.  1. `Toasty.BOTTOM` : To show on the bottom..
    1.  `Toasty.TOP` :    To show on top.
    2.  `Toasty.LEFT` : To show on left.
    3.  `Toasty.RIGHT` : To show on right.
    4.  `Toasty.TOP | Toasty.RIGHT` : Combining values.

## License (MIT):


```
The MIT License (MIT)
=====================

Copyright © 2019 Prathamesh More

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the “Software”), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
```



