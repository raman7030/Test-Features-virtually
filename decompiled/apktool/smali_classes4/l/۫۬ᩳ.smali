.class public final Ll/۫۬ᩳ;
.super Ljava/lang/Object;
.source "M6UH"

# interfaces
.implements Ll/ۤ۬ᩳ;


# instance fields
.field public final ᩸:Ljava/nio/channels/FileChannel;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;)V
    .locals 3

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [Ll/᩻۠ᩴ;

    sget-object v1, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    iput-object p1, p0, Ll/۫۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 52
    iget-object v0, p0, Ll/۫۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    return-void
.end method

.method public final length()J
    .locals 2

    .line 47
    iget-object v0, p0, Ll/۫۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v0

    return-wide v0
.end method

.method public final truncate(J)V
    .locals 0

    .line 49
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery validation file is read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(JI[B)V
    .locals 0

    .line 48
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery validation file is read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(J[BII)V
    .locals 0

    .line 38
    invoke-static {p3, p4, p5}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 39
    :goto_0
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 40
    iget-object p4, p0, Ll/۫۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {p4, p3, p1, p2}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result p4

    if-ltz p4, :cond_1

    if-eqz p4, :cond_0

    int-to-long p4, p4

    add-long/2addr p1, p4

    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery validation read made no progress"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Truncated recovery validation file"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final ۘ֫()V
    .locals 2

    .line 51
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery validation file is read-only"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܺ()V
    .locals 2

    .line 50
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery validation file is read-only"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
