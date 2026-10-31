.class public final Ll/᩻۟ۡ;
.super Ljava/lang/Object;
.source "OAR3"


# instance fields
.field public final ֫:[B

.field public ۧ:I

.field public ܽ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 498
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 499
    iput-object v0, p0, Ll/᩻۟ۡ;->֫:[B

    return-void
.end method


# virtual methods
.method public final ֫(B)V
    .locals 2

    .line 504
    iget v0, p0, Ll/᩻۟ۡ;->ۧ:I

    iget-object v1, p0, Ll/᩻۟ۡ;->֫:[B

    aput-byte p1, v1, v0

    add-int/lit8 p1, v0, 0x1

    const v1, 0xffff

    and-int/2addr p1, v1

    .line 530
    iget-boolean v1, p0, Ll/᩻۟ۡ;->ܽ:Z

    if-nez v1, :cond_0

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    .line 531
    iput-boolean v0, p0, Ll/᩻۟ۡ;->ܽ:Z

    .line 505
    :cond_0
    iput p1, p0, Ll/᩻۟ۡ;->ۧ:I

    return-void
.end method

.method public final ֫(II[B)V
    .locals 5

    .line 516
    iget-object v0, p0, Ll/᩻۟ۡ;->֫:[B

    array-length v1, v0

    if-gt p1, v1, :cond_4

    .line 519
    iget v1, p0, Ll/᩻۟ۡ;->ۧ:I

    sub-int v2, v1, p1

    const v3, 0xffff

    and-int/2addr v2, v3

    .line 520
    iget-boolean v4, p0, Ll/᩻۟ۡ;->ܽ:Z

    if-nez v4, :cond_1

    if-ge v2, v1, :cond_0

    goto :goto_0

    .line 521
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Attempt to read beyond memory: dist="

    .line 0
    invoke-static {p1, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 521
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-ge p1, p2, :cond_3

    .line 524
    aget-byte v1, v0, v2

    invoke-virtual {p0, v1}, Ll/᩻۟ۡ;->֫(B)V

    aput-byte v1, p3, p1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v1, v2, 0x1

    and-int/2addr v1, v3

    .line 530
    iget-boolean v4, p0, Ll/᩻۟ۡ;->ܽ:Z

    if-nez v4, :cond_2

    if-ge v1, v2, :cond_2

    const/4 v2, 0x1

    .line 531
    iput-boolean v2, p0, Ll/᩻۟ۡ;->ܽ:Z

    :cond_2
    move v2, v1

    goto :goto_1

    :cond_3
    return-void

    .line 517
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Illegal distance parameter: "

    .line 0
    invoke-static {p1, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 517
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
