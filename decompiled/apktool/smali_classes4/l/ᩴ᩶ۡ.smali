.class public final Ll/ᩴ᩶ۡ;
.super Ljava/lang/Object;
.source "QAWL"


# direct methods
.method public static final ֫(Ljava/lang/String;)I
    .locals 6

    const-string v0, "color"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "#"

    .line 449
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 63
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/high16 v1, 0x110000

    const/4 v2, 0x4

    const-string v3, "substring(...)"

    const/4 v4, 0x1

    const/high16 v5, -0x1000000

    if-eq v0, v2, :cond_3

    const/4 v2, 0x5

    if-eq v0, v2, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    return v5

    .line 70
    :cond_0
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۚ᩶ۡ;->֫(Ljava/lang/String;)I

    move-result p0

    return p0

    .line 66
    :cond_1
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۚ᩶ۡ;->֫(Ljava/lang/String;)I

    move-result p0

    or-int/2addr p0, v5

    return p0

    .line 82
    :cond_2
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۚ᩶ۡ;->֫(Ljava/lang/String;)I

    move-result p0

    shr-int/lit8 v0, p0, 0xc

    and-int/lit8 v0, v0, 0xf

    const/high16 v2, 0x11000000

    mul-int v0, v0, v2

    shr-int/lit8 v2, p0, 0x8

    and-int/lit8 v2, v2, 0xf

    mul-int v2, v2, v1

    or-int/2addr v0, v2

    shr-int/lit8 v1, p0, 0x4

    and-int/lit8 v1, v1, 0xf

    mul-int/lit16 v1, v1, 0x1100

    or-int/2addr v0, v1

    and-int/lit8 p0, p0, 0xf

    mul-int/lit8 p0, p0, 0x11

    or-int/2addr p0, v0

    or-int/2addr p0, v5

    return p0

    .line 74
    :cond_3
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۚ᩶ۡ;->֫(Ljava/lang/String;)I

    move-result p0

    shr-int/lit8 v0, p0, 0x8

    and-int/lit8 v0, v0, 0xf

    mul-int v0, v0, v1

    shr-int/lit8 v1, p0, 0x4

    and-int/lit8 v1, v1, 0xf

    mul-int/lit16 v1, v1, 0x1100

    or-int/2addr v0, v1

    and-int/lit8 p0, p0, 0xf

    mul-int/lit8 p0, p0, 0x11

    or-int/2addr p0, v0

    or-int/2addr p0, v5

    return p0

    :cond_4
    const-string v0, "Invalid color value "

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
