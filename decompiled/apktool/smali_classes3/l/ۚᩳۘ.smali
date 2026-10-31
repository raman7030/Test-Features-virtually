.class public final Ll/ۚᩳۘ;
.super Ll/֡ᩳۘ;
.source "I9JA"


# instance fields
.field public final ۫:[B

.field public final ۬:Ll/ۢ۟ۖ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/InputStream;Ll/ۢ۟ۖ;Ll/ۡ۟ۖ;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p4}, Ll/֡ᩳۘ;-><init>(Ljava/lang/String;Ljava/io/InputStream;Ll/ۡ۟ۖ;)V

    const/4 p1, 0x4

    new-array p1, p1, [B

    .line 32
    iput-object p1, p0, Ll/ۚᩳۘ;->۫:[B

    .line 36
    iput-object p3, p0, Ll/ۚᩳۘ;->۬:Ll/ۢ۟ۖ;

    return-void
.end method

.method private ֫([B)V
    .locals 4

    .line 68
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-lez v0, :cond_1

    .line 71
    iget-object v2, p0, Ll/֡ᩳۘ;->᩹:Ljava/io/BufferedInputStream;

    invoke-virtual {v2, p1, v1, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    sub-int/2addr v0, v2

    add-int/2addr v1, v2

    goto :goto_0

    .line 73
    :cond_0
    new-instance p1, Ll/ۖ۟ۖ;

    new-instance v0, Ljava/io/EOFException;

    const-string v1, "EOF while reading packet"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 35
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 73
    throw p1

    :cond_1
    return-void
.end method

.method private ᩳ()I
    .locals 3

    .line 61
    iget-object v0, p0, Ll/ۚᩳۘ;->۫:[B

    invoke-direct {p0, v0}, Ll/ۚᩳۘ;->֫([B)V

    const/4 v1, 0x1

    .line 62
    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    const/4 v2, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    const/4 v2, 0x3

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final ֫()Ll/ۚܰۖ;
    .locals 2

    .line 48
    :try_start_0
    invoke-direct {p0}, Ll/ۚᩳۘ;->ᩳ()I

    move-result v0

    .line 40
    new-array v0, v0, [B

    .line 41
    invoke-direct {p0, v0}, Ll/ۚᩳۘ;->֫([B)V

    .line 42
    iget-object v1, p0, Ll/ۚᩳۘ;->۬:Ll/ۢ۟ۖ;

    invoke-interface {v1, v0}, Ll/ۢ۟ۖ;->read([B)Ll/ۚܰۖ;

    move-result-object v0
    :try_end_0
    .catch Ll/ۖ۟ۖ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 53
    :goto_0
    new-instance v1, Ll/ۖ۟ۖ;

    .line 35
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 53
    throw v1

    :catch_2
    move-exception v0

    .line 51
    throw v0
.end method
