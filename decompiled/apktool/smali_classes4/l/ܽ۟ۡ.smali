.class public final Ll/ܽ۟ۡ;
.super Ljava/io/InputStream;
.source "DARC"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۙ:Ljava/io/InputStream;

.field public final ᩶:[B

.field public ᩸:Ll/ۡ۟ۡ;

.field public final ᩹:Ll/ۗ᩺ۡ;


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 17
    iput-object v0, p0, Ll/ܽ۟ۡ;->᩶:[B

    .line 22
    new-instance v0, Ll/ۡ۟ۡ;

    invoke-direct {v0, p2}, Ll/ۡ۟ۡ;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/ܽ۟ۡ;->᩸:Ll/ۡ۟ۡ;

    .line 23
    iput-object p2, p0, Ll/ܽ۟ۡ;->ۙ:Ljava/io/InputStream;

    .line 24
    iput-object p1, p0, Ll/ܽ۟ۡ;->᩹:Ll/ۗ᩺ۡ;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ܽ۟ۡ;->᩸:Ll/ۡ۟ۡ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۡ۟ۡ;->available()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final close()V
    .locals 3

    const/4 v0, 0x0

    .line 87
    :try_start_0
    iget-object v1, p0, Ll/ܽ۟ۡ;->᩸:Ll/ۡ۟ۡ;

    .line 524
    invoke-static {v1}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    .line 88
    iput-object v0, p0, Ll/ܽ۟ۡ;->᩸:Ll/ۡ۟ۡ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    iget-object v1, p0, Ll/ܽ۟ۡ;->ۙ:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    .line 80
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 81
    iput-object v0, p0, Ll/ܽ۟ۡ;->ۙ:Ljava/io/InputStream;

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 79
    iget-object v2, p0, Ll/ܽ۟ۡ;->ۙ:Ljava/io/InputStream;

    if-eqz v2, :cond_1

    .line 80
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 81
    iput-object v0, p0, Ll/ܽ۟ۡ;->ۙ:Ljava/io/InputStream;

    .line 83
    :cond_1
    throw v1
.end method

.method public final read()I
    .locals 4

    .line 33
    :cond_0
    iget-object v0, p0, Ll/ܽ۟ۡ;->᩶:[B

    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    .line 36
    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid return value from read: "

    const-string v3, " ("

    .line 0
    invoke-static {v1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 42
    iget-object v2, p0, Ll/ܽ۟ۡ;->᩹:Ll/ۗ᩺ۡ;

    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return v2
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 56
    :cond_0
    iget-object v0, p0, Ll/ܽ۟ۡ;->᩸:Ll/ۡ۟ۡ;

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    .line 58
    :try_start_0
    invoke-virtual {v0, p2, p3, p1}, Ll/ۡ۟ۡ;->ܿ(II[B)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, v1, :cond_1

    .line 87
    iget-object p2, p0, Ll/ܽ۟ۡ;->᩸:Ll/ۡ۟ۡ;

    .line 524
    invoke-static {p2}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    const/4 p2, 0x0

    .line 88
    iput-object p2, p0, Ll/ܽ۟ۡ;->᩸:Ll/ۡ۟ۡ;

    :cond_1
    return p1

    :catch_0
    move-exception p1

    .line 60
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Invalid Deflate64 input. ("

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ܽ۟ۡ;->᩹:Ll/ۗ᩺ۡ;

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    return v1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
