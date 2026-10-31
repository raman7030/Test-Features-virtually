.class public final Ll/ۙܰۡ;
.super Ljava/lang/Object;
.source "34GF"


# instance fields
.field public ֫:Ll/ۗܰۡ;


# direct methods
.method public constructor <init>(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ljava/lang/String;[B)V
    .locals 4

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1

    .line 18
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 21
    invoke-static {p3}, Ll/֡ܰۡ;->֫(Ljava/lang/String;)[Ljava/nio/charset/Charset;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 23
    :try_start_0
    invoke-virtual {p3, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-static {p2, p4, v3}, Ll/ۙܰۡ;->֫(Ll/ۗ᩺ۡ;[B[B)Ll/ۗܰۡ;

    move-result-object v3

    iput-object v3, p0, Ll/ۙܰۡ;->֫:Ll/ۗܰۡ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string p3, ""

    .line 28
    invoke-virtual {p1, p3}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 29
    new-instance p1, Ll/ۘܰۡ;

    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ۘܰۡ;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Password can not be empty."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ۗ᩺ۡ;[B[B)Ll/ۗܰۡ;
    .locals 8

    .line 49
    new-instance v0, Ll/ۗܰۡ;

    invoke-direct {v0}, Ll/ۗܰۡ;-><init>()V

    .line 50
    invoke-virtual {v0, p2}, Ll/ۗܰۡ;->֫([B)V

    const/4 p2, 0x0

    .line 51
    aget-byte v1, p1, p2

    :cond_0
    :goto_0
    const/16 v2, 0xc

    if-ge p2, v2, :cond_4

    add-int/lit8 p2, p2, 0x1

    if-ne p2, v2, :cond_3

    .line 54
    invoke-virtual {v0}, Ll/ۗܰۡ;->֫()B

    move-result v3

    xor-int/2addr v3, v1

    int-to-byte v3, v3

    .line 56
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v4

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_1

    .line 57
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll/ۖܰۡ;->ۧ(J)J

    move-result-wide v6

    shr-long v4, v6, v5

    long-to-int v5, v4

    int-to-byte v4, v5

    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result v4

    shr-int/lit8 v4, v4, 0x18

    int-to-byte v4, v4

    :goto_1
    if-ne v3, v4, :cond_2

    goto :goto_2

    .line 62
    :cond_2
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0

    .line 65
    :cond_3
    :goto_2
    invoke-virtual {v0}, Ll/ۗܰۡ;->֫()B

    move-result v3

    xor-int/2addr v3, v1

    int-to-byte v3, v3

    invoke-virtual {v0, v3}, Ll/ۗܰۡ;->֫(B)V

    if-eq p2, v2, :cond_0

    .line 67
    aget-byte v1, p1, p2

    goto :goto_0

    :cond_4
    return-object v0
.end method


# virtual methods
.method public final ֫(II[B)V
    .locals 4

    .line 33
    iget-object v0, p0, Ll/ۙܰۡ;->֫:Ll/ۗܰۡ;

    if-ltz p1, :cond_1

    if-ltz p2, :cond_1

    move v1, p1

    :goto_0
    add-int v2, p1, p2

    if-ge v1, v2, :cond_0

    .line 38
    :try_start_0
    aget-byte v2, p3, v1

    and-int/lit16 v2, v2, 0xff

    .line 39
    invoke-virtual {v0}, Ll/ۗܰۡ;->֫()B

    move-result v3

    xor-int/2addr v2, v3

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    .line 40
    invoke-virtual {v0, v2}, Ll/ۗܰۡ;->֫(B)V

    .line 41
    aput-byte v2, p3, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 44
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    return-void

    .line 34
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "One of the input parameters were null in standard decrpyt data"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
