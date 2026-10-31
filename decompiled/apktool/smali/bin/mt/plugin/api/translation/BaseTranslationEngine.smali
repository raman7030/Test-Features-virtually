.class public abstract Lbin/mt/plugin/api/translation/BaseTranslationEngine;
.super Ljava/lang/Object;
.source "BaseTranslationEngine.java"

# interfaces
.implements Lbin/mt/plugin/api/translation/TranslationEngine;


# instance fields
.field public final configuration:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

.field public context:Lbin/mt/plugin/api/PluginContext;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;

    invoke-direct {v0}, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;-><init>()V

    .line 57
    invoke-virtual {p0, v0}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->onBuildConfiguration(Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;)V

    .line 58
    invoke-virtual {v0}, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->build()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    move-result-object v0

    iput-object v0, p0, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->configuration:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    return-void
.end method

.method public constructor <init>(Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->configuration:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    return-void
.end method


# virtual methods
.method public afterFinish()V
    .locals 0

    return-void
.end method

.method public beforeStart()V
    .locals 0

    return-void
.end method

.method public getConfiguration()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;
    .locals 1

    .line 119
    iget-object v0, p0, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->configuration:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    return-object v0
.end method

.method public getContext()Lbin/mt/plugin/api/PluginContext;
    .locals 1

    .line 108
    iget-object v0, p0, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->context:Lbin/mt/plugin/api/PluginContext;

    return-object v0
.end method

.method public getLanguageDisplayName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 134
    invoke-virtual {p0}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "lang:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p1
.end method

.method public init()V
    .locals 0

    return-void
.end method

.method public final init(Lbin/mt/plugin/api/PluginContext;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->context:Lbin/mt/plugin/api/PluginContext;

    .line 86
    invoke-virtual {p0}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->init()V

    return-void
.end method

.method public onBuildConfiguration(Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;)V
    .locals 1

    const/4 v0, 0x1

    .line 71
    invoke-virtual {p1, v0}, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->setAutoRepairFormatSpecifiersError(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;

    return-void
.end method

.method public onError(Ljava/lang/Exception;)Z
    .locals 1

    .line 197
    invoke-virtual {p0}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 199
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onFinish()V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method
