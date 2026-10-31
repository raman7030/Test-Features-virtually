.class public final Ll/ܳۢ֡;
.super Ljava/io/OutputStream;
.source "VAGX"

# interfaces
.implements Ljava/nio/channels/WritableByteChannel;


# instance fields
.field public final ۙ:Ljava/nio/channels/WritableByteChannel;

.field public final ᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩸:I

.field public final ᩹:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ll/۟ۡ֡;)V
    .locals 2

    .line 119
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 111
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ܳۢ֡;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0x200

    .line 125
    new-instance v1, Ll/ܿۢ֡;

    invoke-direct {v1, p1}, Ll/ܿۢ֡;-><init>(Ll/۟ۡ֡;)V

    iput-object v1, p0, Ll/ܳۢ֡;->ۙ:Ljava/nio/channels/WritableByteChannel;

    .line 126
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/ܳۢ֡;->᩹:Ljava/nio/ByteBuffer;

    .line 128
    iput v0, p0, Ll/ܳۢ֡;->᩸:I

    return-void
.end method

.method private ܽ()V
    .locals 4

    .line 265
    iget-object v0, p0, Ll/ܳۢ֡;->᩹:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 266
    iget-object v1, p0, Ll/ܳۢ֡;->ۙ:Ljava/nio/channels/WritableByteChannel;

    invoke-interface {v1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v1

    .line 267
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    .line 268
    iget v3, p0, Ll/ܳۢ֡;->᩸:I

    if-ne v1, v3, :cond_0

    if-nez v2, :cond_0

    .line 272
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    return-void

    .line 269
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const-string v0, "Failed to write %,d bytes atomically. Only wrote  %,d"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 270
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 145
    iget-object v0, p0, Ll/ܳۢ֡;->ۙ:Ljava/nio/channels/WritableByteChannel;

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ܳۢ֡;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 147
    :try_start_0
    invoke-virtual {p0}, Ll/ܳۢ֡;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    invoke-interface {v0}, Ljava/nio/channels/Channel;->close()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/nio/channels/Channel;->close()V

    .line 150
    throw v1

    :cond_0
    return-void
.end method

.method public final isOpen()Z
    .locals 3

    .line 168
    iget-object v0, p0, Ll/ܳۢ֡;->ۙ:Ljava/nio/channels/WritableByteChannel;

    invoke-interface {v0}, Ljava/nio/channels/Channel;->isOpen()Z

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ܳۢ֡;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-nez v0, :cond_0

    .line 169
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 171
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/2addr v0, v1

    return v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 221
    invoke-virtual {p0}, Ll/ܳۢ֡;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 224
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    .line 226
    iget-object v1, p0, Ll/ܳۢ֡;->᩹:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 228
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return v0

    .line 231
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v2

    .line 234
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v3

    if-eqz v3, :cond_1

    .line 235
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    .line 236
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 237
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 238
    invoke-direct {p0}, Ll/ܳۢ֡;->ܽ()V

    sub-int v3, v0, v3

    goto :goto_0

    :cond_1
    move v3, v0

    .line 243
    :goto_0
    iget v4, p0, Ll/ܳۢ֡;->᩸:I

    if-lt v3, v4, :cond_2

    .line 244
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 245
    iget-object v5, p0, Ll/ܳۢ֡;->ۙ:Ljava/nio/channels/WritableByteChannel;

    invoke-interface {v5, p1}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    sub-int/2addr v3, v4

    goto :goto_0

    .line 249
    :cond_2
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 250
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return v0

    .line 222
    :cond_3
    new-instance p1, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {p1}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw p1
.end method

.method public final write(I)V
    .locals 1

    .line 257
    invoke-virtual {p0}, Ll/ܳۢ֡;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_1

    int-to-byte p1, p1

    .line 260
    iget-object v0, p0, Ll/ܳۢ֡;->᩹:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 175
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p1

    if-nez p1, :cond_0

    .line 176
    invoke-direct {p0}, Ll/ܳۢ֡;->ܽ()V

    :cond_0
    return-void

    .line 258
    :cond_1
    new-instance p1, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {p1}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw p1
.end method

.method public final write([BII)V
    .locals 2

    .line 205
    invoke-virtual {p0}, Ll/ܳۢ֡;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    if-lez p3, :cond_1

    .line 211
    iget-object v0, p0, Ll/ܳۢ֡;->᩹:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 212
    invoke-virtual {v0, p1, p2, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 175
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    invoke-direct {p0}, Ll/ܳۢ֡;->ܽ()V

    :cond_0
    sub-int/2addr p3, v1

    add-int/2addr p2, v1

    goto :goto_0

    :cond_1
    return-void

    .line 206
    :cond_2
    new-instance p1, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {p1}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw p1
.end method

.method public final ֫()V
    .locals 6

    .line 160
    iget-object v0, p0, Ll/ܳۢ֡;->᩹:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-eqz v1, :cond_4

    .line 181
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 182
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-le v1, v3, :cond_2

    .line 184
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    and-int/lit8 v4, v4, 0x7

    if-eqz v4, :cond_1

    rsub-int/lit8 v4, v4, 0x8

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 188
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    sub-int/2addr v1, v4

    :cond_1
    :goto_1
    if-lt v1, v3, :cond_2

    const-wide/16 v4, 0x0

    .line 194
    invoke-virtual {v0, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, -0x8

    goto :goto_1

    .line 198
    :cond_2
    :goto_2
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 199
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_2

    .line 162
    :cond_3
    invoke-direct {p0}, Ll/ܳۢ֡;->ܽ()V

    :cond_4
    return-void
.end method
