.class public final Ll/ܿۢ֡;
.super Ljava/lang/Object;
.source "VAGX"

# interfaces
.implements Ljava/nio/channels/WritableByteChannel;


# instance fields
.field public final ᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩹:Ll/۟ۡ֡;


# direct methods
.method public constructor <init>(Ll/۟ۡ֡;)V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ܿۢ֡;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 66
    iput-object p1, p0, Ll/ܿۢ֡;->᩹:Ll/۟ۡ֡;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 71
    iget-object v2, p0, Ll/ܿۢ֡;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Ll/ܿۢ֡;->᩹:Ll/۟ۡ֡;

    invoke-virtual {v0}, Ll/ۧܺ֡;->close()V

    :cond_0
    return-void
.end method

.method public final isOpen()Z
    .locals 1

    .line 78
    iget-object v0, p0, Ll/ܿۢ֡;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 5

    .line 83
    invoke-virtual {p0}, Ll/ܿۢ֡;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    :try_start_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    .line 92
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    sub-int/2addr v1, v0

    .line 93
    iget-object v2, p0, Ll/ܿۢ֡;->᩹:Ll/۟ۡ֡;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {v2, v3, v4, v1}, Ll/ۧܺ֡;->write([BII)V

    .line 94
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    .line 98
    :try_start_1
    invoke-virtual {p0}, Ll/ܿۢ֡;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 101
    :catch_1
    throw p1

    .line 87
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Direct buffer somehow written to BufferAtATimeOutputChannel"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 84
    :cond_1
    new-instance p1, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {p1}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw p1
.end method
