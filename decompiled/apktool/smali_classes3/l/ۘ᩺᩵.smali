.class public final Ll/ۘ᩺᩵;
.super Ljava/lang/Object;
.source "6B5Z"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IInStream;


# instance fields
.field public ᩸:Z

.field public final ᩹:Ll/۠ۖܽ;


# direct methods
.method public constructor <init>(Ll/۠ۖܽ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/ۘ᩺᩵;->᩹:Ll/۠ۖܽ;

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "r"

    .line 18
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ᩺᩵;->᩹:Ll/۠ۖܽ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 70
    iget-boolean v0, p0, Ll/ۘ᩺᩵;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    .line 73
    :cond_0
    iget-object v0, p0, Ll/ۘ᩺᩵;->᩹:Ll/۠ۖܽ;

    invoke-interface {v0}, Ljava/nio/channels/Channel;->close()V

    const/4 v0, 0x1

    .line 74
    iput-boolean v0, p0, Ll/ۘ᩺᩵;->᩸:Z

    return-void
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 58
    :try_start_0
    iget-object v0, p0, Ll/ۘ᩺᩵;->᩹:Ll/۠ۖܽ;

    invoke-interface {v0, p1}, Ll/۠ۖܽ;->read(Ljava/nio/ByteBuffer;)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1

    :catch_0
    move-exception p1

    .line 64
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final seek(JI)J
    .locals 5

    const-string v0, "Seek: unknown origin: "

    const/4 v1, 0x0

    .line 36
    iget-object v2, p0, Ll/ۘ᩺᩵;->᩹:Ll/۠ۖܽ;

    if-eqz p3, :cond_2

    const/4 v3, 0x1

    if-eq p3, v3, :cond_1

    const/4 v3, 0x2

    if-ne p3, v3, :cond_0

    .line 44
    :try_start_0
    invoke-interface {v2}, Ll/۠ۖܽ;->length()J

    move-result-wide v3

    add-long/2addr v3, p1

    invoke-interface {v2, v3, v4}, Ll/۠ۖܽ;->seek(J)V

    goto :goto_0

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_1
    invoke-interface {v2}, Ll/۠ۖܽ;->getFilePointer()J

    move-result-wide v3

    add-long/2addr v3, p1

    invoke-interface {v2, v3, v4}, Ll/۠ۖܽ;->seek(J)V

    goto :goto_0

    :cond_2
    int-to-long v3, v1

    add-long/2addr p1, v3

    .line 38
    invoke-interface {v2, p1, p2}, Ll/۠ۖܽ;->seek(J)V

    .line 49
    :goto_0
    invoke-interface {v2}, Ll/۠ۖܽ;->getFilePointer()J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v0, v1

    sub-long/2addr p1, v0

    return-wide p1

    :catch_0
    move-exception p1

    .line 51
    new-instance p2, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string p3, "Error while seek operation"

    invoke-direct {p2, p3, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
