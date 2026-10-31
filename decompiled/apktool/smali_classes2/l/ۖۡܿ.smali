.class public final Ll/ۖۡܿ;
.super Ljava/lang/Object;
.source "Q6ZO"


# instance fields
.field public final ֫:[B

.field public final ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    .line 413
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_0

    if-lt p3, p2, :cond_0

    .line 414
    array-length v0, p1

    if-gt p3, v0, :cond_0

    .line 417
    iput-object p1, p0, Ll/ۖۡܿ;->֫:[B

    .line 418
    iput p2, p0, Ll/ۖۡܿ;->ܽ:I

    .line 419
    iput p3, p0, Ll/ۖۡܿ;->ۧ:I

    return-void

    .line 415
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid syntax cache reader range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۧ(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 468
    iget v0, p0, Ll/ۖۡܿ;->ۧ:I

    iget v1, p0, Ll/ۖۡܿ;->ܽ:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_0

    return-void

    .line 469
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Truncated syntax cache payload"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 423
    iget v0, p0, Ll/ۖۡܿ;->ܽ:I

    return v0
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 4

    .line 451
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v0

    if-ltz v0, :cond_0

    if-gt v0, p1, :cond_0

    .line 455
    invoke-direct {p0, v0}, Ll/ۖۡܿ;->ۧ(I)V

    .line 456
    new-instance p1, Ljava/lang/String;

    iget v1, p0, Ll/ۖۡܿ;->ܽ:I

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    iget-object v3, p0, Ll/ۖۡܿ;->֫:[B

    invoke-direct {p1, v3, v1, v0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 457
    iget v1, p0, Ll/ۖۡܿ;->ܽ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۖۡܿ;->ܽ:I

    return-object p1

    .line 453
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid syntax cache string length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()I
    .locals 3

    const/4 v0, 0x4

    .line 444
    invoke-direct {p0, v0}, Ll/ۖۡܿ;->ۧ(I)V

    .line 445
    iget-object v1, p0, Ll/ۖۡܿ;->֫:[B

    iget v2, p0, Ll/ۖۡܿ;->ܽ:I

    invoke-static {v2, v1}, Ll/ᩴۡܿ;->֫(I[B)I

    move-result v1

    .line 446
    iget v2, p0, Ll/ۖۡܿ;->ܽ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ۖۡܿ;->ܽ:I

    return v1
.end method

.method public final ܽ()I
    .locals 2

    const/4 v0, 0x1

    .line 431
    invoke-direct {p0, v0}, Ll/ۖۡܿ;->ۧ(I)V

    .line 432
    iget v0, p0, Ll/ۖۡܿ;->ܽ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۖۡܿ;->ܽ:I

    iget-object v1, p0, Ll/ۖۡܿ;->֫:[B

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ܿ()V
    .locals 2

    .line 462
    iget v0, p0, Ll/ۖۡܿ;->ܽ:I

    iget v1, p0, Ll/ۖۡܿ;->ۧ:I

    if-ne v0, v1, :cond_0

    return-void

    .line 463
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trailing syntax cache payload"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 427
    iget v0, p0, Ll/ۖۡܿ;->ۧ:I

    iget v1, p0, Ll/ۖۡܿ;->ܽ:I

    sub-int/2addr v0, v1

    return v0
.end method
