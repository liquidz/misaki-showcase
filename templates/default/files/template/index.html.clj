;; Define template options here
; @layout  default
; @title   top page

; Template is compiled with hiccup
(header
  (:site-title site)
  "Site description")

;; Posts
(h1 "Posts")
(post-list)

;; Post tags
(h1 "Tags")
(tag-list)

