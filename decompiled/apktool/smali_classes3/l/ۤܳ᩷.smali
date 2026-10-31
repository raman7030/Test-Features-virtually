.class public Ll/ۤܳ᩷;
.super Ljava/lang/Object;
.source "W7H2"

# interfaces
.implements Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;


# instance fields
.field public final ֫:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

.field public ۧ:I

.field public ܳ:I

.field public final ܽ:I

.field public final synthetic ܿ:Lbin/mt/plugin/api/translation/BaseBatchTranslationEngine;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/translation/BaseBatchTranslationEngine;II)V
    .locals 0

    .line 105
    iput-object p1, p0, Ll/ۤܳ᩷;->ܿ:Lbin/mt/plugin/api/translation/BaseBatchTranslationEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput p2, p0, Ll/ۤܳ᩷;->ܽ:I

    .line 107
    iput p3, p0, Ll/ۤܳ᩷;->ᩳ:I

    .line 108
    invoke-virtual {p1}, Lbin/mt/plugin/api/translation/BaseTranslationEngine;->getConfiguration()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    move-result-object p1

    iget-object p1, p1, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->textLengthCalculator:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    iput-object p1, p0, Ll/ۤܳ᩷;->֫:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    return-void
.end method


# virtual methods
.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 116
    iput v0, p0, Ll/ۤܳ᩷;->ۧ:I

    .line 117
    iput v0, p0, Ll/ۤܳ᩷;->ܳ:I

    return-void
.end method

.method public tryAdd(Ljava/lang/String;)Z
    .locals 3

    .line 130
    iget v0, p0, Ll/ۤܳ᩷;->ܽ:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    iget v2, p0, Ll/ۤܳ᩷;->ۧ:I

    if-lt v2, v0, :cond_0

    return v1

    .line 133
    :cond_0
    iget-object v0, p0, Ll/ۤܳ᩷;->֫:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result p1

    .line 134
    :goto_0
    iget v0, p0, Ll/ۤܳ᩷;->ᩳ:I

    if-lez v0, :cond_2

    iget v2, p0, Ll/ۤܳ᩷;->ܳ:I

    add-int/2addr v2, p1

    if-le v2, v0, :cond_2

    return v1

    .line 137
    :cond_2
    iget v0, p0, Ll/ۤܳ᩷;->ۧ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۤܳ᩷;->ۧ:I

    .line 138
    iget v0, p0, Ll/ۤܳ᩷;->ܳ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۤܳ᩷;->ܳ:I

    return v1
.end method
