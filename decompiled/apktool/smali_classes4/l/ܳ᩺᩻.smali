.class public final Ll/ܳ᩺᩻;
.super Ljava/lang/Object;
.source "V79X"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_0

    .line 117
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 118
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x4c

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v1

    const/16 v2, 0x3b

    if-ne v1, v2, :cond_0

    invoke-static {v0, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)V
    .locals 8

    .line 101
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object p0

    invoke-static {p0}, Ll/۬ۛ֡;->֫([B)Ll/۬ۛ֡;

    move-result-object p0

    .line 102
    invoke-virtual {p0}, Ll/۬ۛ֡;->ܳ()I

    move-result v0

    .line 103
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 105
    invoke-virtual {p0, v2}, Ll/۬ۛ֡;->֫(I)I

    move-result v3

    .line 106
    invoke-virtual {p0, v2}, Ll/۬ۛ֡;->ۘ(I)I

    move-result v4

    .line 107
    invoke-virtual {p0, v3}, Ll/۬ۛ֡;->ܺ(I)Ljava/lang/String;

    move-result-object v5

    .line 108
    new-instance v6, Ll/ܿ᩺᩻;

    invoke-static {v5}, Ll/ܳ᩺᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    .line 147
    invoke-direct {v6, v7, v3, v4, v5}, Ll/ܿ᩺᩻;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 108
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 33
    new-instance p0, Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܿۧ()Ljava/io/BufferedOutputStream;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    const p1, 0x4d445449    # 2.05866128E8f

    .line 34
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/io/DataOutputStream;->writeInt(I)V

    const/4 p1, 0x2

    .line 35
    invoke-virtual {p0, p1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ᩺᩻;

    .line 38
    iget-object v1, v0, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    iget v2, v0, Ll/ܿ᩺᩻;->ᩳ:I

    invoke-virtual {p0, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 39
    iget v0, v0, Ll/ܿ᩺᩻;->֫:I

    const/high16 v1, -0x80000000

    and-int v3, v0, v1

    if-nez v3, :cond_2

    if-eqz v2, :cond_1

    or-int/2addr v0, v1

    .line 43
    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 44
    invoke-virtual {p0, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    goto :goto_1

    .line 40
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid class def offset"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :cond_3
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 33
    :try_start_1
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "L"

    .line 128
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const-string v2, ";"

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    .line 0
    :cond_0
    invoke-static {v0, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
