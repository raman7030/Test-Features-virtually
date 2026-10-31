.class public abstract Ll/ܽ᩶ۘ;
.super Ljava/lang/Object;
.source "9A7H"

# interfaces
.implements Ll/ۧ᩶ۘ;


# direct methods
.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v0, 0x39

    if-le p0, v0, :cond_2

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_1

    const/16 v0, 0x66

    if-le p0, v0, :cond_2

    :cond_1
    const/16 v0, 0x41

    if-gt v0, p0, :cond_3

    const/16 v0, 0x46

    if-gt p0, v0, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ll/ᩴ۟᩵;)V
    .locals 14

    .line 26
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v0

    if-nez v0, :cond_c

    const/4 v0, 0x0

    .line 30
    :try_start_0
    const-class v1, Lcom/thegrizzlylabs/sardineandroid/model/ErrorMessage;

    invoke-virtual {p0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܳ᩶ۘ;->֫(Ljava/lang/Class;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thegrizzlylabs/sardineandroid/model/ErrorMessage;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_b

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error contacting "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    .line 42
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x1f4

    if-le v4, v6, :cond_0

    div-int/lit8 v6, v4, 0x2

    goto :goto_1

    :cond_0
    move v6, v4

    :goto_1
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_2
    if-ge v7, v4, :cond_9

    .line 51
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x25

    if-ne v9, v10, :cond_8

    if-nez v0, :cond_1

    sub-int v0, v4, v7

    .line 57
    :try_start_1
    div-int/lit8 v0, v0, 0x3

    new-array v0, v0, [B

    goto :goto_3

    :catch_1
    move-exception p0

    goto/16 :goto_6

    :cond_1
    :goto_3
    const/4 v8, 0x0

    :goto_4
    add-int/lit8 v11, v7, 0x2

    if-ge v11, v4, :cond_5

    if-ne v9, v10, :cond_5

    add-int/lit8 v12, v7, 0x1

    .line 63
    invoke-virtual {v2, v12}, Ljava/lang/String;->charAt(I)C

    move-result v13

    invoke-static {v13}, Ll/ܽ᩶ۘ;->֫(C)Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    invoke-static {v11}, Ll/ܽ᩶ۘ;->֫(C)Z

    move-result v11

    if-eqz v11, :cond_4

    add-int/lit8 v11, v7, 0x3

    .line 68
    invoke-virtual {v2, v12, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x10

    invoke-static {v12, v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v12

    if-ltz v12, :cond_3

    add-int/lit8 v7, v8, 0x1

    int-to-byte v12, v12

    .line 73
    aput-byte v12, v0, v8

    if-ge v11, v4, :cond_2

    .line 76
    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    move-result v8

    move v9, v8

    :cond_2
    move v8, v7

    move v7, v11

    goto :goto_4

    .line 71
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "URLDecoder: Illegal hex characters in escape (%) pattern - negative value : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-virtual {v2, v7, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 64
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "URLDecoder: Illegal hex characters in escape (%) pattern : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v7, 0x3

    .line 65
    invoke-virtual {v2, v7, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    if-ge v7, v4, :cond_7

    if-eq v9, v10, :cond_6

    goto :goto_5

    .line 79
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "URLDecoder: Incomplete trailing escape (%) pattern"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 81
    :cond_7
    :goto_5
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v0, v6, v8, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v8, 0x1

    goto/16 :goto_2

    .line 83
    :goto_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "URLDecoder: Illegal hex characters in escape (%) pattern - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_8
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_2

    :cond_9
    if-eqz v8, :cond_a

    .line 93
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 36
    :cond_a
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 37
    new-instance v1, Ll/ۨ᩹ۘ;

    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ۖ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, v0, v2, p0}, Ll/ۨ᩹ۘ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    throw v1

    .line 34
    :cond_b
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/ErrorMessage;->getException()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/ErrorMessage;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    return-void
.end method
