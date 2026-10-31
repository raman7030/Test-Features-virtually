.class public final Ll/ܽۢ֡;
.super Ll/֫ۢ֡;
.source "C8EE"


# instance fields
.field public final ۙ:Ljava/nio/channels/SeekableByteChannel;


# direct methods
.method public constructor <init>(JJLl/᩻ۖܽ;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3, p4}, Ll/֫ۢ֡;-><init>(JJ)V

    .line 42
    iput-object p5, p0, Ll/ܽۢ֡;->ۙ:Ljava/nio/channels/SeekableByteChannel;

    return-void
.end method


# virtual methods
.method public final ֫(JLjava/nio/ByteBuffer;)I
    .locals 2

    .line 48
    iget-object v0, p0, Ll/ܽۢ֡;->ۙ:Ljava/nio/channels/SeekableByteChannel;

    monitor-enter v0

    .line 49
    :try_start_0
    iget-object v1, p0, Ll/ܽۢ֡;->ۙ:Ljava/nio/channels/SeekableByteChannel;

    invoke-interface {v1, p1, p2}, Ljava/nio/channels/SeekableByteChannel;->position(J)Ljava/nio/channels/SeekableByteChannel;

    .line 50
    iget-object p1, p0, Ll/ܽۢ֡;->ۙ:Ljava/nio/channels/SeekableByteChannel;

    invoke-interface {p1, p3}, Ljava/nio/channels/SeekableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    .line 51
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return p1

    :catchall_0
    move-exception p1

    .line 51
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
