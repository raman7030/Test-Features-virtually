.class public final Ll/᩷ۧᩳ;
.super Ljava/lang/Object;
.source "T5CS"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/᩷ۧᩳ;->ۧ:Ljava/lang/String;

    .line 46
    iput p2, p0, Ll/᩷ۧᩳ;->֫:I

    .line 48
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܳ()C

    move-result v1

    const/16 v2, 0x24

    if-ne v1, v2, :cond_0

    .line 51
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܽ()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-ne v1, v2, :cond_2

    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    .line 114
    iget v1, p0, Ll/᩷ۧᩳ;->֫:I

    sub-int/2addr v1, v0

    iput v1, p0, Ll/᩷ۧᩳ;->֫:I

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :cond_2
    if-nez v0, :cond_3

    :goto_1
    const-string v1, ",-(+# 0<"

    .line 62
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܳ()C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_3

    .line 63
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܽ()V

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    .line 66
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 67
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ᩳ()Ljava/lang/String;

    .line 70
    :cond_4
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܳ()C

    move-result v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_6

    .line 71
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܽ()V

    .line 72
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 75
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ᩳ()Ljava/lang/String;

    goto :goto_2

    .line 73
    :cond_5
    new-instance p1, Ljava/util/IllegalFormatPrecisionException;

    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܳ()C

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/IllegalFormatPrecisionException;-><init>(I)V

    throw p1

    .line 78
    :cond_6
    :goto_2
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܳ()C

    move-result v0

    const/16 v1, 0x74

    if-eq v0, v1, :cond_7

    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܳ()C

    move-result v0

    const/16 v1, 0x54

    if-ne v0, v1, :cond_8

    .line 79
    :cond_7
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܽ()V

    .line 82
    :cond_8
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܽ()V

    add-int/lit8 p2, p2, -0x1

    .line 84
    iget v0, p0, Ll/᩷ۧᩳ;->֫:I

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۧᩳ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method private ܳ()C
    .locals 3

    .line 118
    iget v0, p0, Ll/᩷ۧᩳ;->֫:I

    iget-object v1, p0, Ll/᩷ۧᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 103
    iget v0, p0, Ll/᩷ۧᩳ;->֫:I

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0

    .line 101
    :cond_0
    new-instance v0, Ljava/util/UnknownFormatConversionException;

    const-string v1, "End of String"

    invoke-direct {v0, v1}, Ljava/util/UnknownFormatConversionException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܽ()V
    .locals 2

    .line 118
    iget v0, p0, Ll/᩷ۧᩳ;->֫:I

    iget-object v1, p0, Ll/᩷ۧᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 110
    iget v0, p0, Ll/᩷ۧᩳ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩷ۧᩳ;->֫:I

    return-void

    .line 108
    :cond_0
    new-instance v0, Ljava/util/UnknownFormatConversionException;

    const-string v1, "End of String"

    invoke-direct {v0, v1}, Ljava/util/UnknownFormatConversionException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܿ()Z
    .locals 2

    .line 118
    iget v0, p0, Ll/᩷ۧᩳ;->֫:I

    iget-object v1, p0, Ll/᩷ۧᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 96
    :cond_0
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܳ()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private ᩳ()Ljava/lang/String;
    .locals 3

    .line 88
    iget v0, p0, Ll/᩷ۧᩳ;->֫:I

    .line 89
    :goto_0
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    invoke-direct {p0}, Ll/᩷ۧᩳ;->ܽ()V

    goto :goto_0

    .line 92
    :cond_0
    iget-object v1, p0, Ll/᩷ۧᩳ;->ۧ:Ljava/lang/String;

    iget v2, p0, Ll/᩷ۧᩳ;->֫:I

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 122
    iget v0, p0, Ll/᩷ۧᩳ;->֫:I

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Ll/᩷ۧᩳ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
