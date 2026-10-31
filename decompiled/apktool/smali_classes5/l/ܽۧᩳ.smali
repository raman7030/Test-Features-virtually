.class public final Ll/ܽۧᩳ;
.super Lbin/mt/plugin/api/translation/BaseTranslationEngine;
.source "P3YK"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Ljava/util/List;

.field public final ܽ:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 38
    invoke-direct {p0}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;-><init>()V

    const-string v12, "nl"

    const-string v13, "th"

    const-string v0, "zh"

    const-string v1, "en"

    const-string v2, "ja"

    const-string v3, "fr"

    const-string v4, "de"

    const-string v5, "ru"

    const-string v6, "es"

    const-string v7, "pt"

    const-string v8, "it"

    const-string v9, "vi"

    const-string v10, "id"

    const-string v11, "ar"

    .line 33
    filled-new-array/range {v0 .. v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۧᩳ;->֫:Ljava/util/List;

    const/4 v1, 0x1

    .line 35
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۧᩳ;->ۧ:Ljava/util/List;

    const-string v0, "zh"

    .line 36
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۧᩳ;->ܽ:Ljava/util/List;

    .line 39
    new-instance v0, Ll/ۙ᩻᩷;

    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p0, v0}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->init(Lbin/mt/plugin/api/PluginContext;)V

    return-void
.end method


# virtual methods
.method public final loadSourceLanguages()Ljava/util/List;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ܽۧᩳ;->֫:Ljava/util/List;

    return-object v0
.end method

.method public final loadTargetLanguages(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    const-string v0, "zh"

    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 67
    iget-object p1, p0, Ll/ܽۧᩳ;->ۧ:Ljava/util/List;

    return-object p1

    .line 69
    :cond_0
    iget-object p1, p0, Ll/ܽۧᩳ;->ܽ:Ljava/util/List;

    return-object p1
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    const-string v0, "Youdao Translator"

    return-object v0
.end method

.method public final onBuildConfiguration(Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;)V
    .locals 2

    .line 44
    invoke-super {p0, p1}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->onBuildConfiguration(Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;)V

    const/4 v0, 0x1

    .line 45
    invoke-virtual {p1, v0}, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->setAllowBatchTranslationBySeparator(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;

    const/16 v1, 0x4e20

    .line 46
    invoke-virtual {p1, v1}, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->setMaxTranslationTextLength(I)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;

    .line 47
    invoke-virtual {p1, v0}, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->setTargetLanguageMutable(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;

    return-void
.end method

.method public final translate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-wide/16 v0, 0x12c

    .line 75
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 76
    invoke-static {p1, p2, p3}, Ll/ᩳۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 77
    invoke-static {p1, p2}, Ll/ᩳ᩸ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
