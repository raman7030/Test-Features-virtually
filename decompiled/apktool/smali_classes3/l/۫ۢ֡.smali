.class public final Ll/۫ۢ֡;
.super Ljava/lang/Object;
.source "U7IN"


# direct methods
.method public static ֫(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/ByteBuffer;)I
    .locals 3

    .line 143
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    .line 147
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    .line 149
    invoke-interface {p0, p1}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v1

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    .line 154
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_1
    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    return v0

    :cond_3
    return v2

    .line 144
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/channels/ReadableByteChannel;)Z
    .locals 8

    .line 64
    invoke-static {p0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0x2000

    .line 68
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 69
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :cond_1
    :goto_0
    if-nez v3, :cond_3

    .line 77
    invoke-static {p0, v1}, Ll/۫ۢ֡;->֫(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/ByteBuffer;)I

    move-result v4

    .line 78
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    if-nez v4, :cond_2

    const/4 v5, 0x1

    move v5, v4

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    move v5, v4

    const/4 v4, 0x0

    :cond_3
    :goto_1
    if-nez v4, :cond_5

    .line 82
    invoke-static {p1, v0}, Ll/۫ۢ֡;->֫(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 83
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    if-nez v3, :cond_4

    const/4 v6, 0x1

    move v6, v3

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    move v6, v3

    const/4 v3, 0x0

    :cond_5
    :goto_2
    const/4 v7, -0x1

    if-ne v5, v7, :cond_6

    if-ne v6, v7, :cond_6

    .line 87
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_6
    if-eqz v5, :cond_9

    if-nez v6, :cond_7

    goto :goto_4

    :cond_7
    if-eq v5, v6, :cond_8

    goto :goto_3

    .line 97
    :cond_8
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    :goto_3
    return v2

    .line 91
    :cond_9
    :goto_4
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0
.end method
