.class public abstract Ll/ܰ᩶ۢ;
.super Ll/᩻ܳ֡;
.source "Z6OG"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 75
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 76
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x41

    if-lt v2, v3, :cond_0

    const/16 v3, 0x5a

    if-gt v2, v3, :cond_0

    add-int/lit8 v2, v2, 0x20

    int-to-char v2, v2

    .line 77
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xc

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 46
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_9

    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    if-ne v2, v3, :cond_7

    add-int/lit8 v3, v1, 0x1

    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    add-int/lit8 v4, v1, 0x1

    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_2

    const/4 v5, 0x6

    if-ge v2, v5, :cond_2

    .line 55
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x10

    invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    if-ltz v5, :cond_2

    .line 56
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x7f

    if-le v6, v7, :cond_1

    goto :goto_2

    :cond_1
    mul-int/lit8 v3, v3, 0x10

    add-int/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    move v1, v4

    goto :goto_1

    :cond_2
    :goto_2
    if-nez v2, :cond_3

    .line 61
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_3
    if-eqz v3, :cond_4

    const v2, 0x10ffff

    if-gt v3, v2, :cond_4

    const v2, 0xd800

    if-lt v3, v2, :cond_5

    const v2, 0xdfff

    if-gt v3, v2, :cond_5

    :cond_4
    const v3, 0xfffd

    .line 63
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 65
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v4, v2, :cond_8

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ll/ܰ᩶ۢ;->֫(C)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 66
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0xd

    if-ne v2, v3, :cond_6

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_6

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_6

    goto :goto_5

    :cond_6
    :goto_3
    move v1, v4

    goto :goto_5

    .line 49
    :cond_7
    :goto_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_8
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 70
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final nextToken()Ll/֡ܳ֡;
    .locals 1

    .line 17
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 18
    invoke-super {p0}, Ll/᩻ܳ֡;->nextToken()Ll/֡ܳ֡;

    move-result-object v0

    return-object v0
.end method
