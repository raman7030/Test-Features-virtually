.class public Ll/۫ۖܽ;
.super Ljava/io/FilterOutputStream;
.source "OAPU"


# static fields
.field public static final ۗ:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public ۙ:Z

.field public ᩶:Ljava/util/zip/Deflater;

.field public ᩸:[B

.field public ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Ll/۫ۖܽ;->ۗ:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V
    .locals 1

    .line 72
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Ll/۫ۖܽ;->᩹:Z

    .line 84
    iput-boolean v0, p0, Ll/۫ۖܽ;->ۙ:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 76
    iput-object p2, p0, Ll/۫ۖܽ;->᩶:Ljava/util/zip/Deflater;

    .line 77
    sget-object p1, Ll/۫ۖܽ;->ۗ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-nez p1, :cond_0

    const/16 p1, 0x200

    new-array p1, p1, [B

    .line 81
    :cond_0
    iput-object p1, p0, Ll/۫ۖܽ;->᩸:[B

    return-void

    .line 74
    :cond_1
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 161
    iget-boolean v0, p0, Ll/۫ۖܽ;->᩹:Z

    if-nez v0, :cond_3

    .line 162
    invoke-virtual {p0}, Ll/۫ۖܽ;->finish()V

    .line 163
    iget-boolean v0, p0, Ll/۫ۖܽ;->ۙ:Z

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Ll/۫ۖܽ;->᩶:Ljava/util/zip/Deflater;

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    .line 165
    :cond_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    const/4 v0, 0x1

    .line 166
    iput-boolean v0, p0, Ll/۫ۖܽ;->᩹:Z

    .line 167
    iget-object v0, p0, Ll/۫ۖܽ;->᩸:[B

    .line 0
    :cond_1
    sget-object v1, Ll/۫ۖܽ;->ۗ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 168
    :goto_0
    iput-object v2, p0, Ll/۫ۖܽ;->᩸:[B

    :cond_3
    return-void
.end method

.method public finish()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final flush()V
    .locals 1

    .line 197
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 3

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    .line 109
    invoke-virtual {p0, v1, v2, v0}, Ll/۫ۖܽ;->write([BII)V

    return-void
.end method

.method public write([BII)V
    .locals 4

    .line 122
    iget-object v0, p0, Ll/۫ۖܽ;->᩶:Ljava/util/zip/Deflater;

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finished()Z

    move-result v1

    if-nez v1, :cond_4

    or-int v1, p2, p3

    add-int v2, p2, p3

    or-int/2addr v1, v2

    .line 125
    array-length v3, p1

    sub-int/2addr v3, v2

    or-int/2addr v1, v3

    if-ltz v1, :cond_3

    if-nez p3, :cond_0

    goto :goto_1

    .line 130
    :cond_0
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finished()Z

    move-result v1

    if-nez v1, :cond_2

    .line 131
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/Deflater;->setInput([BII)V

    .line 132
    :cond_1
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->needsInput()Z

    move-result p1

    if-nez p1, :cond_2

    .line 185
    :goto_0
    iget-object p1, p0, Ll/۫ۖܽ;->᩸:[B

    array-length p2, p1

    const/4 p3, 0x0

    invoke-virtual {v0, p1, p3, p2}, Ljava/util/zip/Deflater;->deflate([BII)I

    move-result p1

    if-lez p1, :cond_1

    .line 186
    iget-object p2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Ll/۫ۖܽ;->᩸:[B

    invoke-virtual {p2, v1, p3, p1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    .line 126
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 123
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "write beyond end of stream"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
