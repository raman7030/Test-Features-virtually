.class public final Ll/᩹᩹ۡ;
.super Ljava/lang/Object;
.source "A7JN"


# instance fields
.field public final ֫:[B

.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    :try_start_0
    const-class v0, Ll/᩶᩹ۡ;

    const-string v1, "/assets/icons"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :try_start_1
    new-instance v1, Ll/۬ۜܽ;

    invoke-static {v0}, Ll/۠ۨۡ;->֫(Ljava/io/InputStream;)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ll/۬ۜܽ;-><init>([B)V

    .line 32
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    .line 33
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v3, p0, Ll/᩹᩹ۡ;->ۧ:Ljava/util/HashMap;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 35
    invoke-virtual {v1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v4

    .line 36
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    filled-new-array {v5, v6}, [I

    move-result-object v5

    .line 37
    iget-object v6, p0, Ll/᩹᩹ۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v6, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v1}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object v1

    iput-object v1, p0, Ll/᩹᩹ۡ;->֫:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    .line 30
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    .line 41
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static bridge synthetic ֫(Ll/᩹᩹ۡ;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹᩹ۡ;->ۧ:Ljava/util/HashMap;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    .line 47
    iget-object v0, p0, Ll/᩹᩹ۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    xor-int/lit8 p2, p2, 0x1

    .line 51
    aget p1, p1, p2

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 56
    :cond_1
    iget-object p2, p0, Ll/᩹᩹ۡ;->֫:[B

    array-length v0, p2

    if-lt p1, v0, :cond_2

    const-string p1, ""

    return-object p1

    :cond_2
    move v0, p1

    .line 60
    :goto_1
    array-length v1, p2

    if-ge v0, v1, :cond_3

    aget-byte v1, p2, v0

    if-eqz v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 63
    :cond_3
    aget-byte v1, p2, v0

    if-eqz v1, :cond_4

    add-int/lit8 v0, v0, 0x1

    .line 66
    :cond_4
    new-instance v1, Ljava/lang/String;

    sub-int/2addr v0, p1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p2, p1, v0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v1
.end method
