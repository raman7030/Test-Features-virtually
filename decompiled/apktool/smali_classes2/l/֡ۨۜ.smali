.class public final Ll/֡ۨۜ;
.super Ljava/lang/Object;
.source "46LQ"


# instance fields
.field public final ֫:[B

.field public final ۧ:Ll/ۡ᩺ۜ;

.field public final ܽ:Ljava/io/BufferedInputStream;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ljava/io/BufferedInputStream;Ll/ۡ᩺ۜ;)V
    .locals 1

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [B

    .line 317
    iput-object v0, p0, Ll/֡ۨۜ;->֫:[B

    .line 319
    iput-object p1, p0, Ll/֡ۨۜ;->ܽ:Ljava/io/BufferedInputStream;

    iput-object p2, p0, Ll/֡ۨۜ;->ۧ:Ll/ۡ᩺ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 5

    .line 321
    iget-object v0, p0, Ll/֡ۨۜ;->ۧ:Ll/ۡ᩺ۜ;

    invoke-static {v0}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 322
    iget-wide v0, p0, Ll/֡ۨۜ;->ᩳ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/֡ۨۜ;->ᩳ:J

    const-wide/32 v2, 0x10000000

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    .line 323
    iget-object v0, p0, Ll/֡ۨۜ;->ܽ:Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    .line 324
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated GIF container"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 322
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "GIF input exceeds byte limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 6

    :goto_0
    if-lez p1, :cond_3

    .line 330
    iget-object v0, p0, Ll/֡ۨۜ;->ۧ:Ll/ۡ᩺ۜ;

    invoke-static {v0}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 331
    iget-object v0, p0, Ll/֡ۨۜ;->֫:[B

    array-length v1, v0

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Ll/֡ۨۜ;->ܽ:Ljava/io/BufferedInputStream;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-ltz v0, :cond_2

    if-nez v0, :cond_0

    .line 333
    invoke-virtual {p0}, Ll/֡ۨۜ;->֫()I

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    .line 335
    :cond_0
    iget-wide v1, p0, Ll/֡ۨۜ;->ᩳ:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/֡ۨۜ;->ᩳ:J

    const-wide/32 v3, 0x10000000

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    sub-int/2addr p1, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "GIF input exceeds byte limit"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 332
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Truncated GIF container"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 327
    invoke-virtual {p0}, Ll/֡ۨۜ;->֫()I

    move-result v0

    invoke-virtual {p0}, Ll/֡ۨۜ;->֫()I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    return v0
.end method
