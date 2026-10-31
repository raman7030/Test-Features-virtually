.class public final Ll/ۛܺܽ;
.super Ll/ۤܺܽ;
.source "05ZP"


# virtual methods
.method public final ֫(I)Ljava/lang/String;
    .locals 3

    .line 23
    iget-object v0, p0, Ll/ۤܺܽ;->ۗ:Ll/ۙܺܽ;

    iget-object v0, v0, Ll/ۙܺܽ;->֫:Ljava/nio/ByteBuffer;

    .line 24
    iget-wide v1, p0, Ll/ۤܺܽ;->ۙ:J

    long-to-int v2, v1

    add-int/2addr v2, p1

    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    :goto_0
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    if-eqz v1, :cond_0

    int-to-char v1, v1

    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
