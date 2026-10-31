.class public final Ll/۬᩻֨;
.super Ljava/io/InputStream;
.source "E1TJ"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ۙ:[B

.field public ᩶:Ljava/io/InputStream;

.field public final ᩸:Ll/᩶ۜ֨;

.field public ᩹:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Ll/۬᩻֨;->᩹:Ljava/io/IOException;

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 34
    iput-object v0, p0, Ll/۬᩻֨;->ۙ:[B

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    iput-object p1, p0, Ll/۬᩻֨;->᩶:Ljava/io/InputStream;

    .line 53
    new-instance p1, Ll/᩶ۜ֨;

    invoke-direct {p1, p2}, Ll/᩶ۜ֨;-><init>(I)V

    iput-object p1, p0, Ll/۬᩻֨;->᩸:Ll/᩶ۜ֨;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 120
    iget-object v0, p0, Ll/۬᩻֨;->᩶:Ljava/io/InputStream;

    if-eqz v0, :cond_1

    .line 123
    iget-object v1, p0, Ll/۬᩻֨;->᩹:Ljava/io/IOException;

    if-nez v1, :cond_0

    .line 126
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0

    .line 124
    :cond_0
    throw v1

    .line 121
    :cond_1
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 121
    throw v0
.end method

.method public final close()V
    .locals 2

    .line 137
    iget-object v0, p0, Ll/۬᩻֨;->᩶:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 139
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    iput-object v1, p0, Ll/۬᩻֨;->᩶:Ljava/io/InputStream;

    return-void

    :catchall_0
    move-exception v0

    iput-object v1, p0, Ll/۬᩻֨;->᩶:Ljava/io/InputStream;

    .line 142
    throw v0

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 66
    iget-object v1, p0, Ll/۬᩻֨;->ۙ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/۬᩻֨;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 92
    :cond_0
    iget-object v0, p0, Ll/۬᩻֨;->᩶:Ljava/io/InputStream;

    if-eqz v0, :cond_3

    .line 95
    iget-object v1, p0, Ll/۬᩻֨;->᩹:Ljava/io/IOException;

    if-nez v1, :cond_2

    .line 100
    :try_start_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, -0x1

    if-ne p3, v0, :cond_1

    return v0

    .line 109
    :cond_1
    iget-object v0, p0, Ll/۬᩻֨;->᩸:Ll/᩶ۜ֨;

    invoke-virtual {v0, p2, p3, p1}, Ll/᩶ۜ֨;->֫(II[B)V

    return p3

    :catch_0
    move-exception p1

    .line 102
    iput-object p1, p0, Ll/۬᩻֨;->᩹:Ljava/io/IOException;

    .line 103
    throw p1

    .line 96
    :cond_2
    throw v1

    .line 93
    :cond_3
    new-instance p1, Ll/ۖۜ֨;

    const-string p2, "Stream closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 93
    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
