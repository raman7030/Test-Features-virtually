.class public final Ll/۠۫ۢ;
.super Ljava/lang/Object;
.source "Y6P2"


# direct methods
.method public static ֫(C)Z
    .locals 1

    .line 31
    invoke-static {p0}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x5c

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

.method public static ֫(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 39
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0xa

    if-eq v2, v3, :cond_1

    const/16 v3, 0xd

    if-eq v2, v3, :cond_1

    const/16 v3, 0x2028

    if-eq v2, v3, :cond_1

    const/16 v3, 0x2029

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static ֫(Ll/֡ܳ֡;Ll/֡ܳ֡;)Z
    .locals 7

    .line 11
    invoke-interface {p0}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_f

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v0

    .line 13
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 15
    invoke-static {v1}, Ll/۠۫ۢ;->֫(C)Z

    move-result v4

    const/16 v5, 0x8b

    const/16 v6, 0x8c

    if-nez v4, :cond_2

    .line 35
    invoke-interface {p1}, Ll/֡ܳ֡;->getType()I

    move-result v4

    if-eq v4, v6, :cond_2

    invoke-interface {p1}, Ll/֡ܳ֡;->getType()I

    move-result p1

    if-ne p1, v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 16
    :goto_1
    invoke-static {v0}, Ll/۠۫ۢ;->֫(C)Z

    move-result v4

    if-nez v4, :cond_3

    .line 35
    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result v4

    if-eq v4, v6, :cond_3

    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result v4

    if-ne v4, v5, :cond_4

    :cond_3
    if-eqz p1, :cond_4

    goto/16 :goto_2

    .line 17
    :cond_4
    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result v4

    const/4 v5, 0x5

    if-ne v4, v5, :cond_5

    if-eqz p1, :cond_5

    goto :goto_2

    .line 19
    :cond_5
    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result p0

    const/16 v4, 0x8a

    const/16 v5, 0x2e

    if-ne p0, v4, :cond_6

    if-nez p1, :cond_e

    if-ne v1, v5, :cond_6

    goto :goto_2

    :cond_6
    const/16 p0, 0x2b

    if-ne v0, p0, :cond_7

    if-eq v1, p0, :cond_e

    :cond_7
    const/16 p0, 0x2d

    if-ne v0, p0, :cond_8

    if-ne v1, p0, :cond_8

    goto :goto_2

    :cond_8
    const/16 p1, 0x2f

    if-ne v0, p1, :cond_9

    if-eq v1, p1, :cond_e

    const/16 p1, 0x2a

    if-ne v1, p1, :cond_9

    goto :goto_2

    :cond_9
    const/16 p1, 0x3c

    if-ne v0, p1, :cond_a

    const/16 p1, 0x21

    if-ne v1, p1, :cond_a

    goto :goto_2

    :cond_a
    if-ne v0, p0, :cond_b

    const/16 p0, 0x3e

    if-ne v1, p0, :cond_b

    goto :goto_2

    :cond_b
    const/16 p0, 0x3f

    if-ne v0, p0, :cond_c

    if-ne v1, v5, :cond_c

    goto :goto_2

    :cond_c
    if-ne v0, v5, :cond_d

    if-ne v1, v5, :cond_d

    goto :goto_2

    :cond_d
    const-string p0, "+-*/%&|^!=<>?"

    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result p0

    if-ltz p0, :cond_f

    const-string p0, "=&|*<>?"

    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result p0

    if-ltz p0, :cond_f

    :cond_e
    :goto_2
    return v2

    :cond_f
    :goto_3
    return v3
.end method
