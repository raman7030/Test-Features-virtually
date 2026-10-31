.class public Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;
.super Ljava/lang/Object;
.source "TranslationEngine.java"


# instance fields
.field public final acceptTranslated:Z

.field public final allowBatchTranslationBySeparator:Z

.field public final autoRepairFormatSpecifiersError:Z

.field public final disableAutoHideLanguage:Z

.field public final forceNotToSkipTranslated:Z

.field public final maxTranslationTextLength:I

.field public final targetLanguageMutable:Z

.field public final textLengthCalculator:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;


# direct methods
.method public constructor <init>(ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;ZZZZZZ)V
    .locals 0

    .line 481
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 482
    iput p1, p0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->maxTranslationTextLength:I

    .line 483
    iput-object p2, p0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->textLengthCalculator:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    .line 484
    iput-boolean p3, p0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->allowBatchTranslationBySeparator:Z

    .line 485
    iput-boolean p4, p0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->acceptTranslated:Z

    .line 486
    iput-boolean p5, p0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->forceNotToSkipTranslated:Z

    .line 487
    iput-boolean p6, p0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->targetLanguageMutable:Z

    .line 488
    iput-boolean p7, p0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->autoRepairFormatSpecifiersError:Z

    .line 489
    iput-boolean p8, p0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->disableAutoHideLanguage:Z

    return-void
.end method

.method public synthetic constructor <init>(ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;ZZZZZZLl/ۛܳ᩷;)V
    .locals 0

    .line 382
    invoke-direct/range {p0 .. p8}, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;-><init>(ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;ZZZZZZ)V

    return-void
.end method
