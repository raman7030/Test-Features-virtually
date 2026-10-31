.class public final Ll/۟ۘ֡;
.super Ll/᩷ᩴ֡;
.source "62DG"


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;Ljava/io/StringWriter;)V
    .locals 12

    const/4 v0, 0x0

    .line 78
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x22

    if-ne v1, v2, :cond_a

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-eq v1, v2, :cond_0

    goto/16 :goto_6

    .line 84
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-interface {p1, v3, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 86
    invoke-static {}, Ll/֫ᩴ֡;->֫()[C

    move-result-object v2

    .line 2153
    invoke-static {v1}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_8

    if-nez v2, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    .line 1387
    :cond_1
    invoke-static {v2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v3

    :goto_0
    if-nez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_3

    goto :goto_5

    .line 2156
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    .line 2157
    array-length v4, v2

    add-int/lit8 v5, v3, -0x1

    add-int/lit8 v6, v4, -0x1

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v3, :cond_8

    .line 2161
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v4, :cond_7

    .line 2163
    aget-char v10, v2, v9

    if-ne v10, v8, :cond_6

    .line 2164
    invoke-static {v8}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v10

    if-eqz v10, :cond_5

    if-ne v9, v6, :cond_4

    goto :goto_4

    :cond_4
    if-ge v7, v5, :cond_6

    add-int/lit8 v10, v9, 0x1

    .line 2169
    aget-char v10, v2, v10

    add-int/lit8 v11, v7, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v10, v11, :cond_6

    :cond_5
    :goto_4
    const/4 v0, 0x1

    goto :goto_5

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_8
    :goto_5
    if-eqz v0, :cond_9

    .line 88
    invoke-static {}, Ll/֫ᩴ֡;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ll/֫ᩴ֡;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, p1, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 90
    :cond_9
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 79
    :cond_a
    :goto_6
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method
