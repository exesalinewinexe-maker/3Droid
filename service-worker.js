self.addEventListener("install", event => {
    console.log("3Droid service worker installed");
    self.skipWaiting();
});

self.addEventListener("activate", event => {
    console.log("3Droid service worker activated");
});

self.addEventListener("fetch", event => {
    event.respondWith(fetch(event.request));
});