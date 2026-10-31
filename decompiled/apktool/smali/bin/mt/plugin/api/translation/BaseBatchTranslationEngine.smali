.class public abstract Lbin/mt/plugin/api/translation/BaseBatchTranslationEngine;
.super Lbin/mt/plugin/api/translation/BaseTranslationEngine;
.source "BaseBatchTranslationEngine.java"

# interfaces
.implements Lbin/mt/plugin/api/translation/BatchTranslationEngine;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;-><init>()V

    return-void
.end method

.method public constructor <init>(Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;-><init>(Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;)V

    return-void
.end method


# virtual methods
.method public createBatchingStrategy()Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;
    .locals 3

    .line 57
    new-instance v0, Ll/ۤܳ᩷;

    const/16 v1, 0x64

    const/16 v2, 0x1388

    invoke-direct {v0, p0, v1, v2}, Ll/ۤܳ᩷;-><init>(Lbin/mt/plugin/api/translation/BaseBatchTranslationEngine;II)V

    return-object v0
.end method

.method public final translate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 68
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
