.class public Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
.super Ljava/lang/Object;
.source "TranslationEngine.java"


# instance fields
.field public acceptTranslated:Z

.field public allowBatchTranslationBySeparator:Z

.field public autoRepairFormatSpecifiersError:Z

.field public disableAutoHideLanguage:Z

.field public forceNotToSkipTranslated:Z

.field public maxTranslationTextLength:I

.field public targetLanguageMutable:Z

.field public textLengthCalculator:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 201
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;
    .locals 11

    .line 363
    new-instance v10, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget v1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->maxTranslationTextLength:I

    iget-object v2, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->textLengthCalculator:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    iget-boolean v3, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->allowBatchTranslationBySeparator:Z

    iget-boolean v4, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->acceptTranslated:Z

    iget-boolean v5, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->forceNotToSkipTranslated:Z

    iget-boolean v6, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->targetLanguageMutable:Z

    iget-boolean v7, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->autoRepairFormatSpecifiersError:Z

    iget-boolean v8, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->disableAutoHideLanguage:Z

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;-><init>(ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;ZZZZZZLl/ۛܳ᩷;)V

    return-object v10
.end method

.method public setAcceptTranslated(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
    .locals 0

    .line 274
    iput-boolean p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->acceptTranslated:Z

    return-object p0
.end method

.method public setAllowBatchTranslationBySeparator(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
    .locals 0

    .line 256
    iput-boolean p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->allowBatchTranslationBySeparator:Z

    return-object p0
.end method

.method public setAutoRepairFormatControlError(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 337
    iput-boolean p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->autoRepairFormatSpecifiersError:Z

    return-object p0
.end method

.method public setAutoRepairFormatSpecifiersError(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
    .locals 0

    .line 322
    iput-boolean p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->autoRepairFormatSpecifiersError:Z

    return-object p0
.end method

.method public setDisableAutoHideLanguage(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
    .locals 0

    .line 353
    iput-boolean p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->disableAutoHideLanguage:Z

    return-object p0
.end method

.method public setForceNotToSkipTranslated(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
    .locals 0

    .line 289
    iput-boolean p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->forceNotToSkipTranslated:Z

    return-object p0
.end method

.method public setMaxTranslationTextLength(I)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
    .locals 0

    .line 222
    iput p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->maxTranslationTextLength:I

    return-object p0
.end method

.method public setTargetLanguageMutable(Z)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
    .locals 0

    .line 306
    iput-boolean p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->targetLanguageMutable:Z

    return-object p0
.end method

.method public setTextLengthCalculator(Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;
    .locals 0

    .line 238
    iput-object p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$ConfigurationBuilder;->textLengthCalculator:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    return-object p0
.end method
