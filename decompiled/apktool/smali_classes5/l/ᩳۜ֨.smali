.class public Ll/ᩳۜ֨;
.super Ljava/io/InputStream;
.source "4CG0"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:Ll/᩺ۜ֨;

.field public ۙ:Ljava/io/InputStream;

.field public final ۛ:[B

.field public ۤ:J

.field public ۫:Ll/۠᩷֨;

.field public ۬:Ll/᩷᩷֨;

.field public ᩶:Ljava/io/IOException;

.field public ᩸:Ll/ۘ᩻֨;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;JBI)V
    .locals 10

    .line 366
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Ll/ᩳۜ֨;->᩹:Z

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 54
    iput-object v0, p0, Ll/ᩳۜ֨;->ۛ:[B

    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Ll/ᩳۜ֨;->᩶:Ljava/io/IOException;

    .line 368
    invoke-static {}, Ll/ۘ᩻֨;->֫()Ll/ۘ᩻֨;

    move-result-object v0

    const-wide/16 v1, -0x1

    cmp-long v3, p2, v1

    if-ltz v3, :cond_4

    and-int/lit16 p4, p4, 0xff

    const/16 v1, 0xe0

    if-gt p4, v1, :cond_3

    .line 563
    div-int/lit8 v9, p4, 0x2d

    mul-int/lit8 v1, v9, 0x2d

    sub-int/2addr p4, v1

    .line 565
    div-int/lit8 v8, p4, 0x9

    mul-int/lit8 v1, v8, 0x9

    sub-int v7, p4, v1

    if-ltz p5, :cond_2

    const p4, 0x7ffffff0

    if-gt p5, p4, :cond_2

    if-ltz v3, :cond_1

    if-ltz v7, :cond_1

    const/16 p4, 0x8

    if-gt v7, p4, :cond_1

    if-ltz v8, :cond_1

    const/4 p4, 0x4

    if-gt v8, p4, :cond_1

    if-ltz v9, :cond_1

    if-gt v9, p4, :cond_1

    .line 589
    iput-object p1, p0, Ll/ᩳۜ֨;->ۙ:Ljava/io/InputStream;

    .line 590
    iput-object v0, p0, Ll/ᩳۜ֨;->᩸:Ll/ۘ᩻֨;

    .line 594
    invoke-static {p5}, Ll/ᩳۜ֨;->֫(I)I

    move-result p4

    const-wide/16 v1, 0x0

    cmp-long p5, p2, v1

    if-ltz p5, :cond_0

    int-to-long v1, p4

    cmp-long p5, v1, p2

    if-lez p5, :cond_0

    long-to-int p4, p2

    .line 596
    invoke-static {p4}, Ll/ᩳۜ֨;->֫(I)I

    move-result p4

    .line 598
    :cond_0
    new-instance p5, Ll/᩺ۜ֨;

    invoke-static {p4}, Ll/ᩳۜ֨;->֫(I)I

    move-result p4

    invoke-direct {p5, p4, v0}, Ll/᩺ۜ֨;-><init>(ILl/ۘ᩻֨;)V

    iput-object p5, p0, Ll/ᩳۜ֨;->ۗ:Ll/᩺ۜ֨;

    .line 599
    new-instance v6, Ll/۠᩷֨;

    invoke-direct {v6, p1}, Ll/۠᩷֨;-><init>(Ljava/io/InputStream;)V

    iput-object v6, p0, Ll/ᩳۜ֨;->۫:Ll/۠᩷֨;

    .line 600
    new-instance p1, Ll/᩷᩷֨;

    iget-object v5, p0, Ll/ᩳۜ֨;->ۗ:Ll/᩺ۜ֨;

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Ll/᩷᩷֨;-><init>(Ll/᩺ۜ֨;Ll/ۚ᩷֨;III)V

    iput-object p1, p0, Ll/ᩳۜ֨;->۬:Ll/᩷᩷֨;

    .line 602
    iput-wide p2, p0, Ll/ᩳۜ֨;->ۤ:J

    return-void

    .line 587
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 571
    :cond_2
    new-instance p1, Ll/ۢۜ֨;

    const-string p2, "LZMA dictionary is too big for this implementation"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 571
    throw p1

    .line 561
    :cond_3
    new-instance p1, Ll/᩹᩻֨;

    const-string p2, "Invalid LZMA properties byte"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 561
    throw p1

    .line 554
    :cond_4
    new-instance p1, Ll/ۢۜ֨;

    const-string p2, "Uncompressed size is too big"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 554
    throw p1
.end method

.method public static ֫(I)I
    .locals 1

    if-ltz p0, :cond_1

    const v0, 0x7ffffff0

    if-gt p0, v0, :cond_1

    const/16 v0, 0x1000

    if-ge p0, v0, :cond_0

    const/16 p0, 0x1000

    :cond_0
    add-int/lit8 p0, p0, 0xf

    and-int/lit8 p0, p0, -0x10

    return p0

    .line 132
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "LZMA dictionary is too big for this implementation"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 830
    iget-object v0, p0, Ll/ᩳۜ֨;->ۙ:Ljava/io/InputStream;

    if-eqz v0, :cond_1

    .line 816
    iget-object v0, p0, Ll/ᩳۜ֨;->ۗ:Ll/᩺ۜ֨;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 817
    iget-object v2, p0, Ll/ᩳۜ֨;->᩸:Ll/ۘ᩻֨;

    invoke-virtual {v0, v2}, Ll/᩺ۜ֨;->֫(Ll/ۘ᩻֨;)V

    .line 818
    iput-object v1, p0, Ll/ᩳۜ֨;->ۗ:Ll/᩺ۜ֨;

    .line 834
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ᩳۜ֨;->ۙ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 836
    iput-object v1, p0, Ll/ᩳۜ֨;->ۙ:Ljava/io/InputStream;

    return-void

    :catchall_0
    move-exception v0

    iput-object v1, p0, Ll/ᩳۜ֨;->ۙ:Ljava/io/InputStream;

    .line 837
    throw v0

    :cond_1
    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 650
    iget-object v1, p0, Ll/ᩳۜ֨;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ᩳۜ֨;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([BII)I
    .locals 11

    if-ltz p2, :cond_c

    if-ltz p3, :cond_c

    add-int v0, p2, p3

    if-ltz v0, :cond_c

    .line 678
    array-length v1, p1

    if-gt v0, v1, :cond_c

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 684
    :cond_0
    iget-object v1, p0, Ll/ᩳۜ֨;->ۙ:Ljava/io/InputStream;

    if-eqz v1, :cond_b

    .line 687
    iget-object v1, p0, Ll/ᩳۜ֨;->᩶:Ljava/io/IOException;

    if-nez v1, :cond_a

    .line 690
    iget-boolean v1, p0, Ll/ᩳۜ֨;->᩹:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    if-lez p3, :cond_9

    .line 701
    :try_start_0
    iget-wide v3, p0, Ll/ᩳۜ֨;->ۤ:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-ltz v1, :cond_2

    int-to-long v7, p3

    cmp-long v1, v3, v7

    if-gez v1, :cond_2

    long-to-int v1, v3

    goto :goto_0

    :cond_2
    move v1, p3

    .line 704
    :goto_0
    iget-object v3, p0, Ll/ᩳۜ֨;->ۗ:Ll/᩺ۜ֨;

    invoke-virtual {v3, v1}, Ll/᩺ۜ֨;->ۧ(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v1, 0x1

    .line 708
    :try_start_1
    iget-object v3, p0, Ll/ᩳۜ֨;->۬:Ll/᩷᩷֨;

    invoke-virtual {v3}, Ll/᩷᩷֨;->ۧ()V
    :try_end_1
    .catch Ll/᩹᩻֨; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    move-exception v3

    .line 714
    :try_start_2
    iget-wide v7, p0, Ll/ᩳۜ֨;->ۤ:J

    const-wide/16 v9, -0x1

    cmp-long v4, v7, v9

    if-nez v4, :cond_8

    iget-object v4, p0, Ll/ᩳۜ֨;->۬:Ll/᩷᩷֨;

    invoke-virtual {v4}, Ll/᩷᩷֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 717
    iput-boolean v1, p0, Ll/ᩳۜ֨;->᩹:Z

    .line 723
    iget-object v3, p0, Ll/ᩳۜ֨;->۫:Ll/۠᩷֨;

    invoke-virtual {v3}, Ll/۠᩷֨;->֫()V

    .line 727
    :goto_1
    iget-object v3, p0, Ll/ᩳۜ֨;->ۗ:Ll/᩺ۜ֨;

    invoke-virtual {v3, p2, p1}, Ll/᩺ۜ֨;->֫(I[B)I

    move-result v3

    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    add-int/2addr v0, v3

    .line 732
    iget-wide v7, p0, Ll/ᩳۜ֨;->ۤ:J

    cmp-long v4, v7, v5

    if-ltz v4, :cond_3

    int-to-long v3, v3

    sub-long/2addr v7, v3

    .line 734
    iput-wide v7, p0, Ll/ᩳۜ֨;->ۤ:J

    cmp-long v3, v7, v5

    if-nez v3, :cond_3

    .line 738
    iput-boolean v1, p0, Ll/ᩳۜ֨;->᩹:Z

    .line 741
    :cond_3
    iget-boolean v1, p0, Ll/ᩳۜ֨;->᩹:Z

    if-eqz v1, :cond_1

    .line 747
    iget-object p1, p0, Ll/ᩳۜ֨;->ۗ:Ll/᩺ۜ֨;

    invoke-virtual {p1}, Ll/᩺ۜ֨;->ۧ()Z

    move-result p1

    if-nez p1, :cond_7

    .line 754
    iget-object p1, p0, Ll/ᩳۜ֨;->۫:Ll/۠᩷֨;

    invoke-virtual {p1}, Ll/۠᩷֨;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 816
    iget-object p1, p0, Ll/ᩳۜ֨;->ۗ:Ll/᩺ۜ֨;

    if-eqz p1, :cond_4

    .line 817
    iget-object p2, p0, Ll/ᩳۜ֨;->᩸:Ll/ۘ᩻֨;

    invoke-virtual {p1, p2}, Ll/᩺ۜ֨;->֫(Ll/ۘ᩻֨;)V

    const/4 p1, 0x0

    .line 818
    iput-object p1, p0, Ll/ᩳۜ֨;->ۗ:Ll/᩺ۜ֨;

    :cond_4
    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    move v2, v0

    :goto_2
    return v2

    .line 764
    :cond_6
    new-instance p1, Ll/᩹᩻֨;

    invoke-direct {p1}, Ll/᩹᩻֨;-><init>()V

    throw p1

    .line 748
    :cond_7
    new-instance p1, Ll/᩹᩻֨;

    invoke-direct {p1}, Ll/᩹᩻֨;-><init>()V

    throw p1

    .line 715
    :cond_8
    throw v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    .line 810
    iput-object p1, p0, Ll/ᩳۜ֨;->᩶:Ljava/io/IOException;

    .line 811
    throw p1

    :cond_9
    return v0

    .line 688
    :cond_a
    throw v1

    .line 685
    :cond_b
    new-instance p1, Ll/ۖۜ֨;

    const-string p2, "Stream closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 685
    throw p1

    .line 679
    :cond_c
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
