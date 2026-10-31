.class public final Ll/ۢ۬ۚ;
.super Ll/ۘ۬ۚ;
.source "KBGJ"


# instance fields
.field public ܽ:Ljava/io/ByteArrayOutputStream;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ll/ۘ۬ۚ;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢ۬ۚ;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 46
    iget-object v0, p0, Ll/ۢ۬ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۜ۬ۚ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۜ۬ۚ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/io/DataOutputStream;
    .locals 2

    .line 51
    new-instance v0, Ljava/io/DataOutputStream;

    iget-object v1, p0, Ll/ۢ۬ۚ;->ܽ:Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 89
    :try_start_0
    iget-object v0, p0, Ll/ۢ۬ۚ;->ܽ:Ljava/io/ByteArrayOutputStream;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 91
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;Ll/ܽ۫ᩴ;Ll/᩶ۗۚ;)V
    .locals 0

    .line 59
    iput-object p1, p0, Ll/ۘ۬ۚ;->ۧ:Ljava/lang/String;

    .line 58
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    const/16 p2, 0x400

    invoke-direct {p1, p2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object p1, p0, Ll/ۢ۬ۚ;->ܽ:Ljava/io/ByteArrayOutputStream;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "byte stream"

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 4

    .line 54
    iget-object v0, p0, Ll/ۘ۬ۚ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Ended different class: "

    const-string v3, " then was started "

    .line 0
    invoke-static {v2, p1, v3, v0}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 65
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 69
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۢ۬ۚ;->ܽ:Ljava/io/ByteArrayOutputStream;

    if-eqz v0, :cond_2

    .line 70
    new-instance v1, Ll/᩷۬ۚ;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ll/᩷۬ۚ;-><init>(Ljava/lang/String;[B)V

    iget-object v0, p0, Ll/ۢ۬ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_2
    invoke-super {p0, p1}, Ll/ۘ۬ۚ;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 73
    iput-object p1, p0, Ll/ۢ۬ۚ;->ܽ:Ljava/io/ByteArrayOutputStream;

    return-void
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۢ۬ۚ;->ᩳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    .line 80
    :try_start_0
    iget-object v0, p0, Ll/ۢ۬ۚ;->ܽ:Ljava/io/ByteArrayOutputStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 82
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
