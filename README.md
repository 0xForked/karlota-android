# Karlota Client for Android

DATA FLOW

```
[NETWORK/REMOTE] <-------------|
                               |
[DATASTORE/PREFERENCE] <------ | ------> [DATA/REPOSITORY] 
                               |                 |
[DATABASE/LOCAL] <-------------|                 |
                                                 |
                           [COMMON]---------------
                              |
[APP] <--------- |            |
                 |            |
[feature-a] <--- | ----------------------> [DESIGN_SYSTEM]
[feature-b] <--- |
[feature-n] <--- |
```