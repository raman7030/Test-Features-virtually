.class public final Ll/۫᩻ۘ;
.super Ljava/io/OutputStream;
.source "27ZX"


# instance fields
.field public ۗ:Z

.field public ۙ:Ll/ۛ᩻ۘ;

.field public final synthetic ۛ:[J

.field public final synthetic ۤ:Ll/֫ۜۘ;

.field public final synthetic ۨ:[B

.field public ۫:I

.field public ۬:Z

.field public ᩶:[I

.field public ᩸:[B

.field public ᩹:I

.field public ᩺:I


# direct methods
.method public constructor <init>(Ll/֫ۜۘ;[B[J)V
    .locals 0

    .line 743
    iput-object p1, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    iput-object p2, p0, Ll/۫᩻ۘ;->ۨ:[B

    iput-object p3, p0, Ll/۫᩻ۘ;->ۛ:[J

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 p1, 0x1

    .line 744
    iput-boolean p1, p0, Ll/۫᩻ۘ;->ۗ:Z

    const/4 p2, 0x0

    .line 745
    iput-boolean p2, p0, Ll/۫᩻ۘ;->۬:Z

    new-array p3, p1, [I

    .line 746
    iput-object p3, p0, Ll/۫᩻ۘ;->᩶:[I

    .line 747
    iput p2, p0, Ll/۫᩻ۘ;->۫:I

    .line 749
    iput p2, p0, Ll/۫᩻ۘ;->᩹:I

    .line 750
    iput p2, p0, Ll/۫᩻ۘ;->᩺:I

    .line 751
    new-instance p2, Ll/ۛ᩻ۘ;

    .line 2897
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 751
    iput-object p2, p0, Ll/۫᩻ۘ;->ۙ:Ll/ۛ᩻ۘ;

    new-array p1, p1, [B

    .line 806
    iput-object p1, p0, Ll/۫᩻ۘ;->᩸:[B

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 837
    iget-boolean v0, p0, Ll/۫᩻ۘ;->۬:Z

    if-eqz v0, :cond_0

    return-void

    .line 840
    :cond_0
    invoke-virtual {p0}, Ll/۫᩻ۘ;->flush()V

    .line 844
    :try_start_0
    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    iget-object v1, p0, Ll/۫᩻ۘ;->ۨ:[B

    iget-object v2, p0, Ll/۫᩻ۘ;->ۙ:Ll/ۛ᩻ۘ;

    invoke-static {v0, v1, v2}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;[BLl/ۛ᩻ۘ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    .line 850
    iput-boolean v0, p0, Ll/۫᩻ۘ;->۬:Z

    return-void

    :catch_0
    move-exception v0

    .line 848
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 846
    throw v0
.end method

.method public final flush()V
    .locals 3

    .line 817
    iget-boolean v0, p0, Ll/۫᩻ۘ;->۬:Z

    if-nez v0, :cond_1

    .line 821
    iget-boolean v0, p0, Ll/۫᩻ۘ;->ۗ:Z

    if-nez v0, :cond_0

    .line 823
    :goto_0
    :try_start_0
    iget v0, p0, Ll/۫᩻ۘ;->᩺:I

    iget v1, p0, Ll/۫᩻ۘ;->᩹:I

    if-le v0, v1, :cond_0

    .line 824
    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    iget-object v1, p0, Ll/۫᩻ۘ;->ۙ:Ll/ۛ᩻ۘ;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;[ILl/ۛ᩻ۘ;)V

    .line 827
    iget v0, p0, Ll/۫᩻ۘ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۫᩻ۘ;->᩹:I
    :try_end_0
    .catch Ll/ܽۡۘ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 830
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-void

    .line 818
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream already closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final write(I)V
    .locals 2

    int-to-byte p1, p1

    .line 810
    iget-object v0, p0, Ll/۫᩻ۘ;->᩸:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 811
    invoke-virtual {p0, v0, v1, p1}, Ll/۫᩻ۘ;->write([BII)V

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 755
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/۫᩻ۘ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 10

    .line 760
    iget-boolean v0, p0, Ll/۫᩻ۘ;->ۗ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 761
    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    invoke-static {v0}, Ll/֫ۜۘ;->ᩳ(Ll/֫ۜۘ;)I

    move-result v0

    iput v0, p0, Ll/۫᩻ۘ;->۫:I

    .line 762
    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    invoke-static {v0}, Ll/֫ۜۘ;->ᩳ(Ll/֫ۜۘ;)I

    .line 763
    iput-boolean v1, p0, Ll/۫᩻ۘ;->ۗ:Z

    .line 766
    :cond_0
    iget-boolean v0, p0, Ll/۫᩻ۘ;->۬:Z

    if-nez v0, :cond_6

    :cond_1
    if-lez p3, :cond_5

    .line 773
    :try_start_0
    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    invoke-static {v0}, Ll/֫ۜۘ;->ܳ(Ll/֫ۜۘ;)Z

    move-result v0

    const/4 v9, 0x4

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    iget-wide v2, v0, Ll/᩵᩻ۘ;->ᩴ:J

    iget-object v0, p0, Ll/۫᩻ۘ;->ۨ:[B

    array-length v0, v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v4, 0x15

    invoke-static {v0, v4, p3, v9}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result v0

    int-to-long v4, v0

    cmp-long v0, v2, v4

    if-gez v0, :cond_2

    .line 774
    :try_start_1
    invoke-virtual {p0}, Ll/۫᩻ۘ;->flush()V

    .line 776
    :cond_2
    iget-object v2, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    iget-object v3, p0, Ll/۫᩻ۘ;->ۨ:[B

    iget-object v0, p0, Ll/۫᩻ۘ;->ۛ:[J

    aget-wide v4, v0, v1

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-static/range {v2 .. v8}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;[BJ[BII)I

    move-result v0

    .line 777
    iget v2, p0, Ll/۫᩻ۘ;->᩺:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/۫᩻ۘ;->᩺:I

    .line 778
    iget-object v2, p0, Ll/۫᩻ۘ;->ۛ:[J

    aget-wide v3, v2, v1

    int-to-long v5, v0

    add-long/2addr v3, v5

    aput-wide v3, v2, v1

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    .line 781
    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    invoke-static {v0}, Ll/֫ۜۘ;->ᩳ(Ll/֫ۜۘ;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget v2, p0, Ll/۫᩻ۘ;->۫:I

    if-eq v0, v2, :cond_3

    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    invoke-static {v0}, Ll/֫ۜۘ;->ۧ(Ll/֫ۜۘ;)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/16 v2, 0x400

    if-lt v0, v2, :cond_1

    .line 782
    :cond_3
    :goto_0
    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    invoke-static {v0}, Ll/֫ۜۘ;->ۧ(Ll/֫ۜۘ;)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    if-lez v0, :cond_1

    .line 783
    iget-object v0, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    iget-object v2, p0, Ll/۫᩻ۘ;->᩶:[I

    iget-object v3, p0, Ll/۫᩻ۘ;->ۙ:Ll/ۛ᩻ۘ;

    invoke-static {v0, v2, v3}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;[ILl/ۛ᩻ۘ;)V

    .line 784
    iget-object v0, p0, Ll/۫᩻ۘ;->᩶:[I

    aget v0, v0, v1

    .line 785
    iget v2, p0, Ll/۫᩻ۘ;->۫:I

    if-gt v2, v0, :cond_4

    iget-object v2, p0, Ll/۫᩻ۘ;->ۤ:Ll/֫ۜۘ;

    invoke-static {v2}, Ll/֫ۜۘ;->ᩳ(Ll/֫ۜۘ;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-gt v0, v2, :cond_4

    .line 788
    iget v0, p0, Ll/۫᩻ۘ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۫᩻ۘ;->᩹:I

    goto :goto_0

    .line 786
    :cond_4
    new-instance p1, Ll/ܽۡۘ;

    const-string p2, ""

    invoke-direct {p1, v9, p2}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    .line 802
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 800
    throw p1

    :cond_5
    return-void

    .line 767
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream already closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
