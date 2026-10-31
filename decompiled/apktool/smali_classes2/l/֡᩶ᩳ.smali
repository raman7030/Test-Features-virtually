.class public final Ll/֡᩶ᩳ;
.super Ljava/lang/Object;
.source "O6SM"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/۫᩹ᩳ;

.field public final ۙ:I

.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۫᩹ᩳ;II)V
    .locals 5

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_0

    if-ltz p3, :cond_0

    int-to-long v0, p2

    int-to-long v2, p3

    add-long/2addr v0, v2

    .line 19
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->length()I

    move-result v2

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 22
    iput p2, p0, Ll/֡᩶ᩳ;->ۙ:I

    iput p3, p0, Ll/֡᩶ᩳ;->᩶:I

    .line 23
    invoke-virtual {p1, p2}, Ll/۬᩹ᩳ;->ܽ(I)I

    move-result v0

    iput v0, p0, Ll/֡᩶ᩳ;->᩸:I

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, Ll/۬᩹ᩳ;->ܽ(I)I

    move-result p2

    iput p2, p0, Ll/֡᩶ᩳ;->᩹:I

    .line 24
    new-instance p2, Ll/۫᩹ᩳ;

    invoke-virtual {p1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object p3

    invoke-virtual {p1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v0

    invoke-direct {p2, p3, v0, v1}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V

    iput-object p2, p0, Ll/֡᩶ᩳ;->ۗ:Ll/۫᩹ᩳ;

    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Legacy page range exceeds joined text"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/֡᩶ᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V

    return-void
.end method

.method public final ֫(I)I
    .locals 2

    .line 29
    iget-object v0, p0, Ll/֡᩶ᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v0}, Ll/۬᩹ᩳ;->length()I

    const/4 v0, -0x1

    if-lt p1, v0, :cond_1

    .line 30
    iget v1, p0, Ll/֡᩶ᩳ;->᩶:I

    if-gt p1, v1, :cond_1

    if-ne p1, v0, :cond_0

    return v0

    .line 31
    :cond_0
    iget v0, p0, Ll/֡᩶ᩳ;->ۙ:I

    add-int/2addr v0, p1

    return v0

    .line 30
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Legacy coordinate exceeds active page"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/io/InputStream;JLl/᩵᩶ᩳ;)V
    .locals 11

    .line 52
    iget-object v0, p0, Ll/֡᩶ᩳ;->ۗ:Ll/۫᩹ᩳ;

    .line 53
    :try_start_0
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->length()I

    .line 55
    new-instance v1, Ll/᩻᩶ᩳ;

    invoke-direct {v1, p2, p3, p1}, Ll/᩻᩶ᩳ;-><init>(JLjava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-nez v4, :cond_0

    .line 65
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    .line 57
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p2

    const p3, -0x5d7d9e7d

    if-ne p2, p3, :cond_6

    .line 58
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readByte()I

    move-result p2

    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readByte()I

    move-result p3

    shl-int/lit8 p3, p3, 0x8

    or-int/2addr p2, p3

    .line 59
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->ܽ()J

    move-result-wide v2

    int-to-long v4, p2

    const-wide/16 v6, 0x8

    mul-long v4, v4, v6

    cmp-long p3, v2, v4

    if-nez p3, :cond_5

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_4

    .line 61
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v2

    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v3

    .line 39
    iget v4, p0, Ll/֡᩶ᩳ;->ۙ:I

    iget v5, p0, Ll/֡᩶ᩳ;->᩸:I

    invoke-virtual {v0}, Ll/۬᩹ᩳ;->length()I

    if-ltz v2, :cond_3

    if-gez v3, :cond_1

    goto :goto_2

    .line 41
    :cond_1
    iget v6, p0, Ll/֡᩶ᩳ;->᩹:I

    sub-int/2addr v6, v5

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    add-int/2addr v6, v5

    if-ne v6, v5, :cond_2

    move v5, v4

    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {v0, v6}, Ll/۬᩹ᩳ;->ᩳ(I)I

    move-result v5

    :goto_1
    int-to-long v5, v5

    int-to-long v7, v3

    add-long/2addr v5, v7

    int-to-long v7, v4

    .line 43
    iget v4, p0, Ll/֡᩶ᩳ;->᩶:I

    int-to-long v9, v4

    add-long/2addr v7, v9

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v5, v4

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v5, -0x1

    .line 62
    :goto_3
    invoke-interface {p4, v2, v3, v5}, Ll/᩵᩶ᩳ;->֫(III)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 64
    :cond_4
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->ᩳ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    .line 59
    :cond_5
    :try_start_2
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Invalid legacy position stack length"

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 57
    :cond_6
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Invalid legacy position stack magic"

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p2

    .line 52
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p2
.end method
