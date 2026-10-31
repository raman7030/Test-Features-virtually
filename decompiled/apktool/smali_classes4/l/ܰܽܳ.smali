.class public final Ll/ܰܽܳ;
.super Ll/ۧᩳܳ;
.source "970R"


# instance fields
.field public final ֫:[I


# direct methods
.method public constructor <init>([I)V
    .locals 0

    .line 1325
    invoke-direct {p0}, Ll/ۧᩳܳ;-><init>()V

    iput-object p1, p0, Ll/ܰܽܳ;->֫:[I

    return-void
.end method


# virtual methods
.method public final ֫(II)I
    .locals 1

    .line 1381
    iget-object v0, p0, Ll/ܰܽܳ;->֫:[I

    invoke-static {p2, v0}, Ll/ܿᩳܳ;->֫(I[I)I

    move-result p2

    invoke-static {p1, v0}, Ll/ܿᩳܳ;->֫(I[I)I

    move-result p1

    sub-int/2addr p2, p1

    const/4 p1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final ֫()J
    .locals 4

    .line 1389
    iget-object v0, p0, Ll/ܰܽܳ;->֫:[I

    array-length v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x4

    mul-long v0, v0, v2

    const-wide/16 v2, 0x30

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫(IILl/᩸ܽܳ;)V
    .locals 2

    .line 1372
    iget-object v0, p0, Ll/ܰܽܳ;->֫:[I

    invoke-static {p1, v0}, Ll/ܿᩳܳ;->֫(I[I)I

    move-result p1

    .line 1373
    invoke-static {p2, v0}, Ll/ܿᩳܳ;->֫(I[I)I

    move-result p2

    :goto_0
    if-ge p1, p2, :cond_0

    .line 1375
    aget v1, v0, p1

    invoke-interface {p3, p1, v1}, Ll/᩸ܽܳ;->֫(II)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/io/DataOutputStream;I)V
    .locals 9

    const/4 v0, 0x1

    .line 1395
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 1396
    iget-object v0, p0, Ll/ܰܽܳ;->֫:[I

    array-length v1, v0

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1397
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget v3, v0, v2

    int-to-long v3, v3

    int-to-long v5, p2

    sub-long/2addr v3, v5

    long-to-int v5, v3

    int-to-long v6, v5

    cmp-long v8, v3, v6

    if-nez v8, :cond_0

    .line 1398
    invoke-virtual {p1, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_1
    return-void
.end method

.method public final ֫([BIIBI)V
    .locals 3

    .line 1362
    iget-object v0, p0, Ll/ܰܽܳ;->֫:[I

    invoke-static {p2, v0}, Ll/ܿᩳܳ;->֫(I[I)I

    move-result v1

    .line 1363
    invoke-static {p3, v0}, Ll/ܿᩳܳ;->֫(I[I)I

    move-result p3

    :goto_0
    if-ge v1, p3, :cond_0

    .line 1365
    aget v2, v0, v1

    add-int/2addr v2, p5

    sub-int/2addr v2, p2

    aput-byte p4, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(I)Z
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 1345
    :goto_0
    iget-object v2, p0, Ll/ܰܽܳ;->֫:[I

    array-length v3, v2

    if-ge v1, v3, :cond_1

    add-int/lit8 v3, v1, -0x1

    .line 1346
    aget v3, v2, v3

    int-to-long v3, v3

    int-to-long v5, p1

    add-long/2addr v3, v5

    aget v2, v2, v1

    int-to-long v5, v2

    cmp-long v2, v3, v5

    if-lez v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final ֫(Ll/ۧᩳܳ;)Z
    .locals 1

    .line 1356
    instance-of v0, p1, Ll/ܰܽܳ;

    if-eqz v0, :cond_0

    .line 1355
    check-cast p1, Ll/ܰܽܳ;

    iget-object v0, p0, Ll/ܰܽܳ;->֫:[I

    iget-object p1, p1, Ll/ܰܽܳ;->֫:[I

    .line 1356
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(I)I
    .locals 2

    const v0, 0x7fffffff

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 1335
    :goto_0
    iget-object p1, p0, Ll/ܰܽܳ;->֫:[I

    invoke-static {v0, p1}, Ll/ܿᩳܳ;->֫(I[I)I

    move-result v0

    .line 1337
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 1340
    aget p1, p1, v0

    return p1

    .line 1338
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "No next start"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()J
    .locals 4

    .line 1385
    iget-object v0, p0, Ll/ܰܽܳ;->֫:[I

    array-length v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x4

    mul-long v0, v0, v2

    return-wide v0
.end method

.method public final ܽ()I
    .locals 1

    .line 1328
    iget-object v0, p0, Ll/ܰܽܳ;->֫:[I

    array-length v0, v0

    return v0
.end method

.method public final ܽ(I)I
    .locals 1

    .line 1331
    iget-object v0, p0, Ll/ܰܽܳ;->֫:[I

    aget p1, v0, p1

    return p1
.end method
