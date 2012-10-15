; @layout  impress
; @title   presentation sample

(defn l [& body] (p {:class "largest"} body))


(slide {:x 0 :y 0}
       (l "hello"))

(group
  {:x -100 :y 0}

  (slide {:scale 0.1 :rotate 90}
         (l "misaki"))

  (slide {:rotate -90}
         (l "world")))

