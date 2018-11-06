# Update on 6 Nov 2018

As pointed out by jpd236 in this [post], starting from Android API level 28, http connection will no longer supported by default.

Therefore I have updated the app accordingly and added "abc.net.au" into whitelist, so the app is working fine for now.

Check this [commit history].

<br/><br/><br/><br/><br/><br/>

# Previously

It looks like Volley may not work correctly on Android Pie

## versions

targetSDKversion = 28,  <br />
compileSDKversion = 28,  <br />
Gradle version = 3.2.1,  <br />
volley version = 1.1.1,  <br />

### Issue Details

This app loads 2 images using Volley, but 1 of them does not show up on Android Pie

First image:  <br />
http://www.abc.net.au/news/image/4444678-4x3-140x105.jpg<br />
![image1](http://www.abc.net.au/news/image/4444678-4x3-140x105.jpg)

Second image:  <br />
https://sites.google.com/a/pressatgoogle.com/mooningoogleearth/_/rsrc/1247886477794/home/google-space-products/Google%20Sky%20for%20site.jpg?height=242&width=420<br />
![image2](https://sites.google.com/a/pressatgoogle.com/mooningoogleearth/_/rsrc/1247886477794/home/google-space-products/Google%20Sky%20for%20site.jpg?height=242&width=420)


### Screenshots
Android 8.1: <br />

![a8 1](https://user-images.githubusercontent.com/654012/48005789-520c3d80-e14f-11e8-9e80-557b29282811.png)

Android 9.0 <br />

![a9](https://user-images.githubusercontent.com/654012/48005790-52a4d400-e14f-11e8-909d-0152f23712e9.png)


[post]: https://github.com/google/volley/issues/235
[commit history]: https://github.com/mktsui/VolleyTest/commit/7f6f5bf065de50792f1ef60bb4d9a0e57e869737#diff-a4a7c49a558393b9dae7c81d46f42aa2