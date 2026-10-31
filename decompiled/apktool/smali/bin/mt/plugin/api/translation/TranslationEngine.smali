.class public interface abstract Lbin/mt/plugin/api/translation/TranslationEngine;
.super Ljava/lang/Object;
.source "TranslationEngine.java"


# virtual methods
.method public abstract afterFinish()V
.end method

.method public abstract beforeStart()V
.end method

.method public abstract getConfiguration()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;
.end method

.method public abstract getContext()Lbin/mt/plugin/api/PluginContext;
.end method

.method public abstract getLanguageDisplayName(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract init(Lbin/mt/plugin/api/PluginContext;)V
.end method

.method public abstract loadSourceLanguages()Ljava/util/List;
.end method

.method public abstract loadTargetLanguages(Ljava/lang/String;)Ljava/util/List;
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public abstract onError(Ljava/lang/Exception;)Z
.end method

.method public abstract onFinish()V
.end method

.method public abstract onStart()V
.end method

.method public abstract translate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method
