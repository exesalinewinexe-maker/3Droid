self.addEventListener('install', event => {
  self.skipWaiting();
});

self.addEventListener('activate', event => {
  clients.claim();
});

self.addEventListener('fetch', event => {
  // ensure requests inside /3Droid/ work correctly
  const url = new URL(event.request.url);

  if (url.pathname.startsWith('/3Droid/')) {
    event.respondWith(fetch(event.request));
    return;
  }

  event.respondWith(fetch(event.request));
});