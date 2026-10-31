.class public final Ll/᩶۟ܿ;
.super Ljava/lang/Object;
.source "X4M8"


# instance fields
.field public final ֫:[B

.field public final ۧ:Ll/ܿۖ᩷;

.field public final ܽ:Ll/ۤ۟ܿ;

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۤ۟ܿ;Ll/ܿۖ᩷;)V
    .locals 1

    .line 472
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x100000

    new-array v0, v0, [B

    .line 468
    iput-object v0, p0, Ll/᩶۟ܿ;->֫:[B

    .line 473
    iput-object p1, p0, Ll/᩶۟ܿ;->ܽ:Ll/ۤ۟ܿ;

    .line 474
    iput-object p2, p0, Ll/᩶۟ܿ;->ۧ:Ll/ܿۖ᩷;

    return-void
.end method

.method private ۧ()V
    .locals 3

    .line 505
    iget v0, p0, Ll/᩶۟ܿ;->ᩳ:I

    if-nez v0, :cond_0

    return-void

    .line 508
    :cond_0
    iget-object v0, p0, Ll/᩶۟ܿ;->ۧ:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/ۛ۟ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 509
    iget v0, p0, Ll/᩶۟ܿ;->ܿ:I

    iget v1, p0, Ll/᩶۟ܿ;->ᩳ:I

    const v2, 0x7fffffff

    sub-int/2addr v2, v1

    if-gt v0, v2, :cond_1

    .line 512
    iget-object v0, p0, Ll/᩶۟ܿ;->ܽ:Ll/ۤ۟ܿ;

    iget-object v2, p0, Ll/᩶۟ܿ;->֫:[B

    invoke-virtual {v0, v1, v2}, Ll/ۤ۟ܿ;->֫(I[B)V

    .line 513
    iget v0, p0, Ll/᩶۟ܿ;->ܿ:I

    iget v1, p0, Ll/᩶۟ܿ;->ᩳ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩶۟ܿ;->ܿ:I

    const/4 v0, 0x0

    .line 514
    iput v0, p0, Ll/᩶۟ܿ;->ᩳ:I

    return-void

    .line 510
    :cond_1
    new-instance v0, Ll/۟֫ܳ;

    invoke-direct {v0}, Ll/۟֫ܳ;-><init>()V

    throw v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 498
    invoke-direct {p0}, Ll/᩶۟ܿ;->ۧ()V

    .line 499
    iget-object v0, p0, Ll/᩶۟ܿ;->ۧ:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/ۛ۟ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 500
    iget v0, p0, Ll/᩶۟ܿ;->ܿ:I

    return v0
.end method

.method public final ֫(I)V
    .locals 3

    .line 478
    iget v0, p0, Ll/᩶۟ܿ;->ᩳ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩶۟ܿ;->ᩳ:I

    int-to-byte p1, p1

    iget-object v2, p0, Ll/᩶۟ܿ;->֫:[B

    aput-byte p1, v2, v0

    .line 479
    array-length p1, v2

    if-ne v1, p1, :cond_0

    .line 480
    invoke-direct {p0}, Ll/᩶۟ܿ;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ֫(I[B)V
    .locals 4

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-lez p1, :cond_1

    .line 486
    iget-object v1, p0, Ll/᩶۟ܿ;->֫:[B

    array-length v2, v1

    iget v3, p0, Ll/᩶۟ܿ;->ᩳ:I

    sub-int/2addr v2, v3

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 487
    iget v3, p0, Ll/᩶۟ܿ;->ᩳ:I

    invoke-static {p2, v0, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 488
    iget v3, p0, Ll/᩶۟ܿ;->ᩳ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/᩶۟ܿ;->ᩳ:I

    add-int/2addr v0, v2

    sub-int/2addr p1, v2

    .line 491
    array-length v1, v1

    if-ne v3, v1, :cond_0

    .line 492
    invoke-direct {p0}, Ll/᩶۟ܿ;->ۧ()V

    goto :goto_0

    :cond_1
    return-void
.end method
