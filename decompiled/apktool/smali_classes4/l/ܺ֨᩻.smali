.class public final Ll/ܺ֨᩻;
.super Ljava/io/OutputStream;
.source "M9Q4"


# instance fields
.field public final ᩸:Ljava/nio/channels/FileChannel;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ljava/nio/channels/FileChannel;J)V
    .locals 0

    .line 855
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 856
    iput-object p1, p0, Ll/ܺ֨᩻;->᩸:Ljava/nio/channels/FileChannel;

    .line 857
    iput-wide p2, p0, Ll/ܺ֨᩻;->᩹:J

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 0

    .line 862
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final write([BII)V
    .locals 2

    .line 867
    invoke-static {p1, p2, p3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 868
    iget-wide p2, p0, Ll/ܺ֨᩻;->᩹:J

    .line 869
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 870
    iget-object v0, p0, Ll/ܺ֨᩻;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;J)I

    move-result v0

    if-lez v0, :cond_0

    int-to-long v0, v0

    add-long/2addr p2, v0

    goto :goto_0

    .line 872
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "FileChannel write made no progress"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 876
    :cond_1
    iput-wide p2, p0, Ll/ܺ֨᩻;->᩹:J

    return-void
.end method
