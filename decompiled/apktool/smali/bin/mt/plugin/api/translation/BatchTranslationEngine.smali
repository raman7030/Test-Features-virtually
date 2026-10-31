.class public interface abstract Lbin/mt/plugin/api/translation/BatchTranslationEngine;
.super Ljava/lang/Object;
.source "BatchTranslationEngine.java"

# interfaces
.implements Lbin/mt/plugin/api/translation/TranslationEngine;


# virtual methods
.method public abstract batchTranslate([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
.end method

.method public abstract createBatchingStrategy()Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;
.end method

.method public abstract translate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
