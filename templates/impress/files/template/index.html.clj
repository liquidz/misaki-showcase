; @layout  impress
; @title   presentation sample

(defn l [s] (p {:class "largest strong"} s))
;---

(slide
  (l "1"))

(slide
  (l "2"))

(slide
  {:x 650 :y 1300 :rotate 90}
  (l "3"))

(slide
  {:x 650 :y 1000 :scale 3}
  (l "4"))

(slide
  {:x 100 :y 500 :rotate -180 :scale 0.2}
  (code {:class "xx-large"} (+ 2 3)))

(slide
  {:x 5000 :y 0 :scale 30}
  (l ":)"))

