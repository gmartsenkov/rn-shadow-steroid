(ns steroid.rn.navigation.drawer
  (:require ["@react-navigation/drawer" :refer [createDrawerNavigator]]
            [reagent.core :as reagent]
            [steroid.rn.core :as rn]
            [steroid.rn.utils :as utils]))

(defn create-drawer-navigator []
  (let [^js drawer (createDrawerNavigator)]
    [(reagent/adapt-react-class (.-Navigator drawer))
     (reagent/adapt-react-class (.-Screen drawer))]))

(defn drawer [& params]
  (let [[navigator screen] (create-drawer-navigator)]
    (utils/prepare-navigator navigator screen)))