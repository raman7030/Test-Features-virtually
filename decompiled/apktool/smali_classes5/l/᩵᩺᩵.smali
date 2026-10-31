.class public final Ll/᩵᩺᩵;
.super Ljava/lang/Object;
.source "WB6R"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IOutStream;
.implements Ljava/io/Closeable;


# instance fields
.field public ᩸:Z

.field public final ᩹:Ll/᩻ۖܽ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rw"

    .line 26
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩺᩵;->᩹:Ll/᩻ۖܽ;

    const-wide/16 v0, 0x0

    .line 27
    invoke-virtual {p1, v0, v1}, Ll/᩻ۖܽ;->setLength(J)V

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;JLl/۬ۤ;)V
    .locals 3

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ll/ᩴۢᩴ;

    invoke-direct {v0}, Ll/ᩴۢᩴ;-><init>()V

    .line 32
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll/ᩴ᩺᩵;

    invoke-direct {v2, p1, v0, p4}, Ll/ᩴ᩺᩵;-><init>(Ll/ܶ᩵ܿ;Ll/ᩴۢᩴ;Ll/۬ۤ;)V

    invoke-static {v1, p2, p3, v2}, Ll/᩶ۖܽ;->֫(Ljava/lang/String;JLl/᩹ۖܽ;)Ll/᩶ۖܽ;

    move-result-object p1

    .line 50
    invoke-static {p1}, Ll/֡ۖܽ;->֫(Ll/ۖۖܽ;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩺᩵;->᩹:Ll/᩻ۖܽ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 55
    iget-boolean v0, p0, Ll/᩵᩺᩵;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    .line 58
    :cond_0
    iget-object v0, p0, Ll/᩵᩺᩵;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->close()V

    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Ll/᩵᩺᩵;->᩸:Z

    return-void
.end method

.method public final seek(JI)J
    .locals 4

    const-string v0, "Seek: unknown origin: "

    .line 76
    iget-boolean v1, p0, Ll/᩵᩺᩵;->᩸:Z

    if-nez v1, :cond_3

    .line 80
    iget-object v1, p0, Ll/᩵᩺᩵;->᩹:Ll/᩻ۖܽ;

    if-eqz p3, :cond_2

    const/4 v2, 0x1

    if-eq p3, v2, :cond_1

    const/4 v2, 0x2

    if-ne p3, v2, :cond_0

    .line 88
    :try_start_0
    invoke-virtual {v1}, Ll/᩻ۖܽ;->length()J

    move-result-wide v2

    add-long/2addr v2, p1

    invoke-virtual {v1, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    goto :goto_0

    .line 91
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 85
    :cond_1
    invoke-virtual {v1}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v2

    add-long/2addr v2, p1

    invoke-virtual {v1, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {v1, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    .line 93
    :goto_0
    invoke-virtual {v1}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    .line 95
    new-instance p2, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string p3, "Error while seek operation"

    invoke-direct {p2, p3, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 77
    :cond_3
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string p2, "Closed"

    invoke-direct {p1, p2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSize(J)V
    .locals 1

    .line 64
    iget-boolean v0, p0, Ll/᩵᩺᩵;->᩸:Z

    if-nez v0, :cond_0

    .line 68
    :try_start_0
    iget-object v0, p0, Ll/᩵᩺᩵;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1, p2}, Ll/᩻ۖܽ;->setLength(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 70
    new-instance p2, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {p2, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 65
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string p2, "Closed"

    invoke-direct {p1, p2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 101
    iget-boolean v0, p0, Ll/᩵᩺᩵;->᩸:Z

    if-nez v0, :cond_0

    .line 105
    :try_start_0
    iget-object v0, p0, Ll/᩵᩺᩵;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1}, Ll/᩻ۖܽ;->write(Ljava/nio/ByteBuffer;)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 107
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 102
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "Closed"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
