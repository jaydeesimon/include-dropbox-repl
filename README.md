```
$ ACCESS_TOKEN=PUT_YOUR_ACCESS_TOKEN_HERE lein repl
nREPL server started on port 53218 on host 127.0.0.1 - nrepl://127.0.0.1:53218
REPL-y 0.3.7, nREPL 0.2.12
Clojure 1.9.0
Java HotSpot(TM) 64-Bit Server VM 1.8.0_131-b11
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

include-dropbox-repl.core=> (require '[dropbox-repl.core :as dr])
nil
include-dropbox-repl.core=> (dr/get-current-account)
{:email "myemail@gmail.com", :account_type {:.tag "pro"}, :disabled false, :account_id "dbid:kjqjnakjsdkjankq", :profile_photo_url "https://dl-web.dropbox.com/account_photo/get/jkhaskjdhkjsahdkq?size=128x128&vers=837283423", :is_paired true, :locale "en", :name {:given_name "Jeffrey", :surname "Simon", :familiar_name "Jeffrey", :display_name "Jeffrey Simon", :abbreviated_name "JS"}, :email_verified true, :referral_link "https://db.tt/jsjlakjsdlkasd", :root_info {:.tag "user", :root_namespace_id "384234234", :home_namespace_id "123123123"}, :country "US"}
```