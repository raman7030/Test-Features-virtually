.class public final Ll/ܶ۬ۡ;
.super Ljava/lang/Object;
.source "GBKJ"


# instance fields
.field public final ֫:[I

.field public final ۧ:Landroid/util/TypedValue;

.field public final ܽ:Ll/ۤۨۡ;


# direct methods
.method public constructor <init>(Ll/ۤۨۡ;I)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/ܶ۬ۡ;->ۧ:Landroid/util/TypedValue;

    .line 27
    iput-object p1, p0, Ll/ܶ۬ۡ;->ܽ:Ll/ۤۨۡ;

    mul-int/lit8 p2, p2, 0x2

    .line 29
    new-array p1, p2, [I

    iput-object p1, p0, Ll/ܶ۬ۡ;->֫:[I

    return-void
.end method

.method public static ֫(ILjava/lang/CharSequence;)I
    .locals 6

    .line 168
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return p0

    .line 171
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    .line 174
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x2d

    const/4 v1, 0x0

    .line 176
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v0, v2, :cond_1

    const/4 v0, -0x1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x30

    .line 180
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x10

    if-ne v3, v4, :cond_5

    add-int/lit8 p1, p1, -0x1

    if-ne v2, p1, :cond_2

    return v1

    :cond_2
    add-int/lit8 p1, v2, 0x1

    .line 183
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x78

    if-eq v3, v1, :cond_4

    const/16 v3, 0x58

    if-ne v3, v1, :cond_3

    goto :goto_1

    :cond_3
    const/16 v5, 0x8

    move v2, p1

    goto :goto_2

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x2

    goto :goto_2

    :cond_5
    const/16 p1, 0x23

    .line 191
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne p1, v1, :cond_6

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    const/16 v5, 0xa

    .line 195
    :goto_2
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    mul-int p0, p0, v0

    return p0
.end method

.method private ۧ(ILandroid/util/TypedValue;)Z
    .locals 3

    .line 290
    iget-object v0, p0, Ll/ܶ۬ۡ;->֫:[I

    aget v1, v0, p1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 294
    :cond_0
    iput v1, p2, Landroid/util/TypedValue;->type:I

    const/4 v2, 0x1

    add-int/2addr p1, v2

    .line 295
    aget p1, v0, p1

    iput p1, p2, Landroid/util/TypedValue;->data:I

    const/4 v0, 0x3

    if-ne v1, v0, :cond_1

    .line 301
    iget-object v0, p0, Ll/ܶ۬ۡ;->ܽ:Ll/ۤۨۡ;

    invoke-virtual {v0, p1}, Ll/ۤۨۡ;->ۢ(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 296
    :goto_0
    iput-object p1, p2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    return v2
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 308
    iget-object v0, p0, Ll/ܶ۬ۡ;->֫:[I

    invoke-static {v0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(FI)F
    .locals 3

    mul-int/lit8 v0, p2, 0x2

    .line 258
    iget-object v1, p0, Ll/ܶ۬ۡ;->֫:[I

    aget v2, v1, v0

    if-nez v2, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x5

    if-ne v2, p1, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 262
    aget p1, v1, v0

    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/TypedValue;->complexToDimension(ILandroid/util/DisplayMetrics;)F

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x2

    if-ne v2, p1, :cond_2

    .line 265
    iget-object p1, p0, Ll/ܶ۬ۡ;->ۧ:Landroid/util/TypedValue;

    invoke-direct {p0, v0, p1}, Ll/ܶ۬ۡ;->ۧ(ILandroid/util/TypedValue;)Z

    .line 266
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to resolve attribute at index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 270
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Can\'t convert value at index "

    const-string v1, " to dimension: type=0x"

    .line 0
    invoke-static {p2, v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {p2, v2}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p2

    .line 271
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(II)I
    .locals 3

    mul-int/lit8 p1, p1, 0x2

    .line 152
    iget-object v0, p0, Ll/ܶ۬ۡ;->֫:[I

    aget v1, v0, p1

    if-nez v1, :cond_0

    return p2

    :cond_0
    const/16 v2, 0x10

    if-lt v1, v2, :cond_1

    const/16 v2, 0x1f

    if-gt v1, v2, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 157
    aget p1, v0, p1

    return p1

    .line 161
    :cond_1
    iget-object v0, p0, Ll/ܶ۬ۡ;->ۧ:Landroid/util/TypedValue;

    invoke-direct {p0, p1, v0}, Ll/ܶ۬ۡ;->ۧ(ILandroid/util/TypedValue;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 162
    invoke-virtual {v0}, Landroid/util/TypedValue;->coerceToString()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p2, p1}, Ll/ܶ۬ۡ;->֫(ILjava/lang/CharSequence;)I

    move-result p1

    return p1

    .line 164
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "getInt of bad type: 0x"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p2, v1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p2

    .line 164
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 3

    mul-int/lit8 p1, p1, 0x2

    .line 68
    iget-object v0, p0, Ll/ܶ۬ۡ;->֫:[I

    aget v1, v0, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 301
    aget p1, v0, p1

    iget-object v0, p0, Ll/ܶ۬ۡ;->ܽ:Ll/ۤۨۡ;

    invoke-virtual {v0, p1}, Ll/ۤۨۡ;->ۢ(I)Ljava/lang/String;

    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 76
    :cond_1
    iget-object v0, p0, Ll/ܶ۬ۡ;->ۧ:Landroid/util/TypedValue;

    invoke-direct {p0, p1, v0}, Ll/ܶ۬ۡ;->ۧ(ILandroid/util/TypedValue;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 77
    invoke-virtual {v0}, Landroid/util/TypedValue;->coerceToString()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 78
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 82
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "getString of bad type: 0x"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    .line 82
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILandroid/util/TypedValue;)V
    .locals 0

    mul-int/lit8 p1, p1, 0x2

    .line 284
    invoke-direct {p0, p1, p2}, Ll/ܶ۬ۡ;->ۧ(ILandroid/util/TypedValue;)Z

    return-void
.end method

.method public final ֫(Z)Z
    .locals 4

    .line 104
    iget-object v0, p0, Ll/ܶ۬ۡ;->֫:[I

    const/16 v1, 0xa

    aget v2, v0, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v3, 0x10

    if-lt v2, v3, :cond_1

    const/16 v3, 0x1f

    if-gt v2, v3, :cond_1

    const/16 p1, 0xb

    .line 109
    aget p1, v0, p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 113
    :cond_1
    iget-object v0, p0, Ll/ܶ۬ۡ;->ۧ:Landroid/util/TypedValue;

    invoke-direct {p0, v1, v0}, Ll/ܶ۬ۡ;->ۧ(ILandroid/util/TypedValue;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 114
    invoke-virtual {v0}, Landroid/util/TypedValue;->coerceToString()Ljava/lang/CharSequence;

    move-result-object v0

    .line 124
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    return p1

    :cond_2
    const-string p1, "1"

    .line 128
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "true"

    .line 129
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "TRUE"

    .line 130
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1

    .line 118
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getBoolean of bad type: 0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v2}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    .line 118
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(FI)F
    .locals 2

    mul-int/lit8 p2, p2, 0x2

    .line 212
    iget-object v0, p0, Ll/ܶ۬ۡ;->֫:[I

    aget v1, v0, p2

    if-nez v1, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x4

    if-ne v1, p1, :cond_1

    add-int/lit8 p2, p2, 0x1

    .line 216
    aget p1, v0, p2

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1

    :cond_1
    const/16 p1, 0x10

    if-lt v1, p1, :cond_2

    const/16 p1, 0x1f

    if-gt v1, p1, :cond_2

    add-int/lit8 p2, p2, 0x1

    .line 219
    aget p1, v0, p2

    int-to-float p1, p1

    return p1

    .line 223
    :cond_2
    iget-object p1, p0, Ll/ܶ۬ۡ;->ۧ:Landroid/util/TypedValue;

    invoke-direct {p0, p2, p1}, Ll/ܶ۬ۡ;->ۧ(ILandroid/util/TypedValue;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 224
    invoke-virtual {p1}, Landroid/util/TypedValue;->coerceToString()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 226
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    return p1

    .line 231
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "getFloat of bad type: 0x"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p2, v1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p2

    .line 231
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(I)I
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    .line 50
    iget-object v0, p0, Ll/ܶ۬ۡ;->֫:[I

    aget p1, v0, p1

    return p1
.end method
