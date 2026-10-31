.class public abstract Ll/ۨ۠ܺ;
.super Ljava/lang/Object;
.source "532I"

# interfaces
.implements Ll/ᩴܶܺ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 362
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۧ(C)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x6

    new-array v0, v0, [C

    const/16 v1, 0x5c

    const/4 v2, 0x0

    aput-char v1, v0, v2

    const/4 v1, 0x1

    const/16 v3, 0x75

    aput-char v3, v0, v1

    const/4 v1, 0x2

    aput-char v2, v0, v1

    const/4 v1, 0x3

    aput-char v2, v0, v1

    const/4 v1, 0x4

    aput-char v2, v0, v1

    const/4 v3, 0x5

    aput-char v2, v0, v3

    :goto_0
    if-ge v2, v1, :cond_0

    rsub-int/lit8 v3, v2, 0x5

    and-int/lit8 v4, p0, 0xf

    const-string v5, "0123456789ABCDEF"

    .line 938
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    aput-char v4, v0, v3

    shr-int/2addr p0, v1

    int-to-char p0, p0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 941
    :cond_0
    invoke-static {v0}, Ljava/lang/String;->copyValueOf([C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ()Ll/ۨ۠ܺ;
    .locals 3

    const-string v0, "\n\r"

    const/4 v1, 0x0

    .line 321
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 1702
    new-instance v2, Ll/᩶۠ܺ;

    invoke-direct {v2, v1, v0}, Ll/᩶۠ܺ;-><init>(CC)V

    return-object v2
.end method

.method public static ܽ()Ll/ۨ۠ܺ;
    .locals 2

    .line 307
    new-instance v0, Ll/ۙ۠ܺ;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ll/ۙ۠ܺ;-><init>(C)V

    return-object v0
.end method

.method public static ܽ(C)Ll/ۨ۠ܺ;
    .locals 1

    .line 298
    new-instance v0, Ll/᩹۠ܺ;

    invoke-direct {v0, p0}, Ll/᩹۠ܺ;-><init>(C)V

    return-object v0
.end method

.method public static ᩳ()Ll/ۨ۠ܺ;
    .locals 1

    .line 148
    sget-object v0, Ll/ۛ۠ܺ;->᩹:Ll/ۨ۠ܺ;

    return-object v0
.end method


# virtual methods
.method public ֫(ILjava/lang/CharSequence;)I
    .locals 2

    .line 564
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 565
    invoke-static {p1, v0}, Ll/ۘܶܺ;->ۧ(II)V

    :goto_0
    if-ge p1, v0, :cond_1

    .line 567
    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v1

    if-eqz v1, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public ֫(Ljava/lang/CharSequence;)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 600
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 601
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p0, v2}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public abstract ֫()Ll/ۨ۠ܺ;
.end method

.method public abstract ֫(C)Z
.end method

.method public ۧ(Ljava/lang/CharSequence;)I
    .locals 1

    const/4 v0, 0x0

    .line 545
    invoke-virtual {p0, v0, p1}, Ll/ۨ۠ܺ;->֫(ILjava/lang/CharSequence;)I

    move-result p1

    return p1
.end method

.method public ܽ(Ljava/lang/CharSequence;)Z
    .locals 3

    .line 511
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    .line 512
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p0, v2}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ᩳ(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 531
    invoke-virtual {p0, p1}, Ll/ۨ۠ܺ;->ۧ(Ljava/lang/CharSequence;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
