# Volley Test

It looks like Volley may not work correctly on Android Pie

## versions

targetSDKversion = 28
compileSDKversion = 28
Gradle version = 3.2.1
volley version = 1.1.1

### Prerequisites

This app loads 2 images using Volley, but 1 of them does not show up on Android Pie

```
First image: http://www.abc.net.au/news/image/4444678-4x3-140x105.jpg

Second image: https://sites.google.com/a/pressatgoogle.com/mooningoogleearth/_/rsrc/1247886477794/home/google-space-products/Google%20Sky%20for%20site.jpg?height=242&width=420
```

Android 8.1:
![screenshot_1541411257](https://user-images.githubusercontent.com/654012/47990659-093e8f80-e123-11e8-9428-8bd06afa7ce2.png)

Android 9.0
![screenshot_1541411256](https://user-images.githubusercontent.com/654012/47990658-093e8f80-e123-11e8-8b72-bdf1096bb29b.png)