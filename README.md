MaterialEditText
================
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-MaterialEditText-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1085)


![MaterialEditText](./images/material_edittext.png)

2.0.0 snapshot:
```groovy
maven { url 'https://oss.sonatype.org/content/groups/public' }
```
```groovy
compile 'com.rengwuxian.materialedittext:library:2.0.0-SNAPSHOT'
```
**NOTE: There is no doc or sample for `MaterialEditText` v2.0 for now. They will come together with the lib's release version within several days.**

AppCompat v21 makes it easy to use Material Design EditText in our apps, but it's so limited. If you've tried that, you know what I mean. So I wrote MaterialEditText, the EditText in Material Design, with more features that [Google Material Design Spec](http://www.google.com/design/spec/components/text-fields.html) has introduced.

## Features
1. **Basic**

  ![Basic](./images/basic.png)
  
2. **Floating Label**
  
  normal:
  
  ![FloatingLabel](./images/floating_label.png)
  
  highlight:
  
  ![HighlightFloatingLabel](./images/highlight.png)

  custom floating label text:

  ![CustomFloatingLabelText](./images/custom_floating_label_text.png)
  
3. **Single Line Ellipsis**
  
  ![SingLineEllipsis](./images/ellipsis.png)
  
4. **Max/Min Characters**
  
  ![MaxCharacters](./images/max_characters.png)

  ![MinCharacters](./images/min_characters.png)

  ![MinAndMaxCharacters](./images/min_and_max.png)
  
5. **Helper Text and Error Text**

  ![HelperTextAndErrorText](./images/helper_error_text.png)

6. **Custom Base/Primary/Error/HelperText Colors**

  ![CustomColors](./images/custom_colors.png)

7. **Custom accent typeface**

  floating label, error/helper text, character counter, etc.

  ![CustomAccentTypeface](./images/custom_accent_typeface.png)

8. **Hide Underline**

  ![HideUnderLine](./images/hide_underline.png)

8. **Material Design Icon**

  ![MaterialDesignIcon](./images/material_design_icon.png)

## Sample

[MaterialEditText-1.8.3-sample.apk](https://github.com/rengwuxian/MaterialEditText/releases/download/1.8.3/MaterialEditText-1.8.3-sample.apk)
  
## Download

Eclipse:
[MaterialEditText-1.8.3.aar](https://github.com/rengwuxian/MaterialEditText/releases/download/1.8.3/MaterialEditText-1.8.3.aar)

gradle:

```groovy
compile 'com.rengwuxian.materialedittext:library:1.8.3'
```

Maven:
```xml
<dependency>
  <groupId>com.rengwuxian.materialedittext</groupId>
  <artifactId>library</artifactId>
  <version>1.8.3</version>
  <type>aar</type>
</dependency>
```

## Usage

See on [Wiki Page](https://github.com/rengwuxian/MaterialEditText/wiki) or [中文看这里](http://www.rengwuxian.com/post/materialedittext)

## Thanks to

[NineOldAndroids](https://github.com/JakeWharton/NineOldAndroids/)

## License

    Copyright 2014 rengwuxian

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
