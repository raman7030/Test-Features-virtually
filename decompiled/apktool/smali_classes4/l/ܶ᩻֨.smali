.class public final Ll/ܶ᩻֨;
.super Ll/ۛ᩻֨;
.source "Y1QW"


# instance fields
.field public final ۗ:Ljava/io/OutputStream;

.field public final ۙ:I

.field public ۤ:J

.field public final ۫:[B

.field public final ۬:Ll/ۙ᩻֨;

.field public ᩶:Ll/ۛ᩻֨;

.field public final ᩸:Ll/ۚۜ֨;

.field public final ᩹:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;[Ll/۟᩻֨;Ll/ۚۜ֨;Ll/ۘ᩻֨;)V
    .locals 5

    .line 14
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const-wide/16 v0, 0x0

    .line 21
    iput-wide v0, p0, Ll/ܶ᩻֨;->ۤ:J

    const/4 v0, 0x1

    new-array v1, v0, [B

    .line 23
    iput-object v1, p0, Ll/ܶ᩻֨;->۫:[B

    .line 28
    iput-object p1, p0, Ll/ܶ᩻֨;->ۗ:Ljava/io/OutputStream;

    .line 29
    iput-object p3, p0, Ll/ܶ᩻֨;->᩸:Ll/ۚۜ֨;

    .line 32
    new-instance v1, Ll/ۙ᩻֨;

    invoke-direct {v1, p1}, Ll/ۙ᩻֨;-><init>(Ljava/io/OutputStream;)V

    iput-object v1, p0, Ll/ܶ᩻֨;->۬:Ll/ۙ᩻֨;

    .line 33
    iput-object v1, p0, Ll/ܶ᩻֨;->᩶:Ll/ۛ᩻֨;

    .line 34
    array-length v1, p2

    sub-int/2addr v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 35
    aget-object v2, p2, v1

    iget-object v3, p0, Ll/ܶ᩻֨;->᩶:Ll/ۛ᩻֨;

    invoke-virtual {v2, v3, p4}, Ll/۟᩻֨;->֫(Ll/ۛ᩻֨;Ll/ۘ᩻֨;)Ll/ۛ᩻֨;

    move-result-object v2

    iput-object v2, p0, Ll/ܶ᩻֨;->᩶:Ll/ۛ᩻֨;

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 38
    :cond_0
    new-instance p4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    .line 42
    invoke-virtual {p4, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 46
    array-length v2, p2

    sub-int/2addr v2, v0

    invoke-virtual {p4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/4 v0, 0x0

    .line 49
    :goto_1
    array-length v2, p2

    if-ge v0, v2, :cond_1

    .line 50
    aget-object v2, p2, v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v2, 0x21

    invoke-static {p4, v2, v3}, Ll/᩸ۜ֨;->֫(Ljava/io/OutputStream;J)V

    .line 51
    aget-object v2, p2, v0

    invoke-virtual {v2}, Ll/۟᩻֨;->ܿ()[B

    move-result-object v2

    .line 52
    array-length v3, v2

    int-to-long v3, v3

    invoke-static {p4, v3, v4}, Ll/᩸ۜ֨;->֫(Ljava/io/OutputStream;J)V

    .line 53
    invoke-virtual {p4, v2}, Ljava/io/OutputStream;->write([B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 57
    :cond_1
    :goto_2
    invoke-virtual {p4}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    if-eqz p2, :cond_2

    .line 58
    invoke-virtual {p4, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {p4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    .line 64
    array-length p4, p2

    add-int/lit8 p4, p4, 0x4

    iput p4, p0, Ll/ܶ᩻֨;->ۙ:I

    const/16 v0, 0x400

    if-gt p4, v0, :cond_3

    .line 71
    array-length v0, p2

    div-int/lit8 v0, v0, 0x4

    int-to-byte v0, v0

    aput-byte v0, p2, v1

    .line 74
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 75
    invoke-static {p2, p1}, Ll/᩸ۜ֨;->֫([BLjava/io/OutputStream;)V

    const-wide p1, 0x7ffffffffffffffcL

    int-to-long v0, p4

    sub-long/2addr p1, v0

    .line 80
    invoke-virtual {p3}, Ll/ۚۜ֨;->ܽ()I

    move-result p3

    int-to-long p3, p3

    sub-long/2addr p1, p3

    iput-wide p1, p0, Ll/ܶ᩻֨;->᩹:J

    return-void

    .line 68
    :cond_3
    new-instance p1, Ll/ۢۜ֨;

    .line 16
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 68
    throw p1
.end method

.method private ᩳ()V
    .locals 7

    .line 118
    iget-object v0, p0, Ll/ܶ᩻֨;->۬:Ll/ۙ᩻֨;

    invoke-virtual {v0}, Ll/ۙ᩻֨;->֫()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 122
    iget-wide v4, p0, Ll/ܶ᩻֨;->᩹:J

    cmp-long v6, v0, v4

    if-gtz v6, :cond_0

    iget-wide v0, p0, Ll/ܶ᩻֨;->ۤ:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    return-void

    .line 124
    :cond_0
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "XZ Stream has grown too big"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 124
    throw v0
.end method


# virtual methods
.method public final finish()V
    .locals 8

    .line 106
    iget-object v0, p0, Ll/ܶ᩻֨;->᩶:Ll/ۛ᩻֨;

    invoke-virtual {v0}, Ll/ۛ᩻֨;->finish()V

    .line 107
    invoke-direct {p0}, Ll/ܶ᩻֨;->ᩳ()V

    .line 110
    iget-object v0, p0, Ll/ܶ᩻֨;->۬:Ll/ۙ᩻֨;

    invoke-virtual {v0}, Ll/ۙ᩻֨;->֫()J

    move-result-wide v0

    :goto_0
    const-wide/16 v2, 0x3

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    iget-object v6, p0, Ll/ܶ᩻֨;->ۗ:Ljava/io/OutputStream;

    cmp-long v7, v2, v4

    if-eqz v7, :cond_0

    const/4 v2, 0x0

    .line 111
    invoke-virtual {v6, v2}, Ljava/io/OutputStream;->write(I)V

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    goto :goto_0

    .line 114
    :cond_0
    iget-object v0, p0, Ll/ܶ᩻֨;->᩸:Ll/ۚۜ֨;

    invoke-virtual {v0}, Ll/ۚۜ֨;->֫()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܶ᩻֨;->᩶:Ll/ۛ᩻֨;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 100
    invoke-direct {p0}, Ll/ܶ᩻֨;->ᩳ()V

    return-void
.end method

.method public final write(I)V
    .locals 2

    int-to-byte p1, p1

    .line 85
    iget-object v0, p0, Ll/ܶ᩻֨;->۫:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 86
    invoke-virtual {p0, v0, v1, p1}, Ll/ܶ᩻֨;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 2

    .line 91
    iget-object v0, p0, Ll/ܶ᩻֨;->᩶:Ll/ۛ᩻֨;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 92
    iget-object v0, p0, Ll/ܶ᩻֨;->᩸:Ll/ۚۜ֨;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۚۜ֨;->֫([BII)V

    .line 93
    iget-wide p1, p0, Ll/ܶ᩻֨;->ۤ:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ܶ᩻֨;->ۤ:J

    .line 94
    invoke-direct {p0}, Ll/ܶ᩻֨;->ᩳ()V

    return-void
.end method

.method public final ֫()J
    .locals 2

    .line 132
    iget-wide v0, p0, Ll/ܶ᩻֨;->ۤ:J

    return-wide v0
.end method

.method public final ܽ()J
    .locals 4

    .line 128
    iget v0, p0, Ll/ܶ᩻֨;->ۙ:I

    int-to-long v0, v0

    iget-object v2, p0, Ll/ܶ᩻֨;->۬:Ll/ۙ᩻֨;

    invoke-virtual {v2}, Ll/ۙ᩻֨;->֫()J

    move-result-wide v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll/ܶ᩻֨;->᩸:Ll/ۚۜ֨;

    invoke-virtual {v2}, Ll/ۚۜ֨;->ܽ()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method
