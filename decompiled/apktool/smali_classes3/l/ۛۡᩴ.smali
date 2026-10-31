.class public final Ll/ۛۡᩴ;
.super Ll/ۛܿᩴ;
.source "DC36"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۗ:I

.field public transient ۙ:I

.field public ۤ:I

.field public transient ۫:I

.field public final transient ۬:I

.field public transient ᩶:[I

.field public transient ᩸:Z

.field public final ᩹:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/high16 v0, 0x3f400000    # 0.75f

    .line 82
    iput v0, p0, Ll/ۛۡᩴ;->᩹:F

    const/16 v1, 0x10

    .line 83
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v1

    iput v1, p0, Ll/ۛۡᩴ;->۫:I

    iput v1, p0, Ll/ۛۡᩴ;->۬:I

    add-int/lit8 v2, v1, -0x1

    .line 84
    iput v2, p0, Ll/ۛۡᩴ;->ۙ:I

    .line 85
    invoke-static {v0, v1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/ۛۡᩴ;->ۗ:I

    .line 86
    iget v0, p0, Ll/ۛۡᩴ;->۫:I

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Ll/ۛۡᩴ;->᩶:[I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 6

    .line 892
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 893
    iget v0, p0, Ll/ۛۡᩴ;->ۤ:I

    iget v1, p0, Ll/ۛۡᩴ;->᩹:F

    invoke-static {v1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/ۛۡᩴ;->۫:I

    .line 894
    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/ۛۡᩴ;->ۗ:I

    .line 895
    iget v0, p0, Ll/ۛۡᩴ;->۫:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/ۛۡᩴ;->ۙ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 896
    new-array v0, v0, [I

    iput-object v0, p0, Ll/ۛۡᩴ;->᩶:[I

    .line 898
    iget v2, p0, Ll/ۛۡᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    .line 899
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    if-nez v2, :cond_0

    .line 901
    iget v4, p0, Ll/ۛۡᩴ;->۫:I

    .line 902
    iput-boolean v1, p0, Ll/ۛۡᩴ;->᩸:Z

    goto :goto_2

    .line 904
    :cond_0
    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    iget v5, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v4, v5

    aget v5, v0, v4

    if-eqz v5, :cond_1

    :goto_1
    add-int/2addr v4, v1

    iget v5, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v4, v5

    aget v5, v0, v4

    if-eqz v5, :cond_1

    goto :goto_1

    .line 906
    :cond_1
    :goto_2
    aput v2, v0, v4

    move v2, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 632
    new-instance v0, Ll/۫ۡᩴ;

    invoke-direct {v0, p0}, Ll/۫ۡᩴ;-><init>(Ll/ۛۡᩴ;)V

    .line 887
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 888
    iget v1, p0, Ll/ۛۡᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/۫ۡᩴ;->nextInt()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    move v1, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(J)V
    .locals 2

    long-to-float p1, p1

    .line 369
    iget p2, p0, Ll/ۛۡᩴ;->᩹:F

    div-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-long p1, p1

    invoke-static {p1, p2}, Ll/ܰۛۡ;->֫(J)J

    move-result-wide p1

    const-wide/16 v0, 0x2

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    const-wide/32 v0, 0x40000000

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    .line 370
    iget p1, p0, Ll/ۛۡᩴ;->۫:I

    if-le p2, p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۛۡᩴ;->֫(I)V

    :cond_0
    return-void
.end method

.method private ᩳ(I)V
    .locals 5

    .line 438
    iget v0, p0, Ll/ۛۡᩴ;->ۤ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۛۡᩴ;->ۤ:I

    .line 421
    iget-object v0, p0, Ll/ۛۡᩴ;->᩶:[I

    :goto_0
    add-int/lit8 v1, p1, 0x1

    .line 423
    iget v2, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v1, v2

    .line 425
    :goto_1
    aget v2, v0, v1

    if-nez v2, :cond_1

    const/4 v1, 0x0

    .line 426
    aput v1, v0, p1

    .line 440
    iget p1, p0, Ll/ۛۡᩴ;->۫:I

    iget v0, p0, Ll/ۛۡᩴ;->۬:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/ۛۡᩴ;->ۤ:I

    iget v1, p0, Ll/ۛۡᩴ;->ۗ:I

    div-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/ۛۡᩴ;->֫(I)V

    :cond_0
    return-void

    .line 429
    :cond_1
    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v3, v4

    if-gt p1, v1, :cond_2

    if-ge p1, v3, :cond_3

    if-le v3, v1, :cond_4

    goto :goto_2

    :cond_2
    if-lt p1, v3, :cond_4

    if-le v3, v1, :cond_4

    .line 433
    :cond_3
    :goto_2
    aput v2, v0, p1

    move p1, v1

    goto :goto_0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    and-int/2addr v1, v4

    goto :goto_1
.end method


# virtual methods
.method public final add(I)Z
    .locals 4

    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 394
    iget-boolean p1, p0, Ll/ۛۡᩴ;->᩸:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 395
    :cond_0
    iput-boolean v0, p0, Ll/ۛۡᩴ;->᩸:Z

    goto :goto_1

    .line 398
    :cond_1
    iget-object v1, p0, Ll/ۛۡᩴ;->᩶:[I

    .line 400
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v2, v3

    aget v3, v1, v2

    if-eqz v3, :cond_3

    if-ne v3, p1, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr v2, v0

    .line 402
    iget v3, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v2, v3

    aget v3, v1, v2

    if-eqz v3, :cond_3

    if-ne v3, p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 404
    :cond_3
    aput p1, v1, v2

    .line 406
    :goto_1
    iget p1, p0, Ll/ۛۡᩴ;->ۤ:I

    add-int/lit8 v1, p1, 0x1

    iput v1, p0, Ll/ۛۡᩴ;->ۤ:I

    iget v1, p0, Ll/ۛۡᩴ;->ۗ:I

    if-lt p1, v1, :cond_4

    add-int/lit8 p1, p1, 0x2

    iget v1, p0, Ll/ۛۡᩴ;->᩹:F

    invoke-static {v1, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۛۡᩴ;->֫(I)V

    :cond_4
    return v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 6

    .line 384
    iget v0, p0, Ll/ۛۡᩴ;->᩹:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 364
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 365
    iget v1, p0, Ll/ۛۡᩴ;->۫:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/ۛۡᩴ;->֫(I)V

    goto :goto_0

    .line 503
    :cond_0
    iget v0, p0, Ll/ۛۡᩴ;->ۤ:I

    .line 385
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    int-to-long v0, v1

    invoke-direct {p0, v0, v1}, Ll/ۛۡᩴ;->֫(J)V

    .line 387
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/᩸ܿᩴ;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 2

    .line 495
    iget v0, p0, Ll/ۛۡᩴ;->ۤ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 496
    iput v0, p0, Ll/ۛۡᩴ;->ۤ:I

    .line 497
    iput-boolean v0, p0, Ll/ۛۡᩴ;->᩸:Z

    .line 498
    iget-object v1, p0, Ll/ۛۡᩴ;->᩶:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 854
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۡᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 858
    iget-object v1, p0, Ll/ۛۡᩴ;->᩶:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Ll/ۛۡᩴ;->᩶:[I

    .line 859
    iget-boolean v1, p0, Ll/ۛۡᩴ;->᩸:Z

    iput-boolean v1, v0, Ll/ۛۡᩴ;->᩸:Z

    return-object v0

    .line 856
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final contains(I)Z
    .locals 4

    if-nez p1, :cond_0

    .line 472
    iget-boolean p1, p0, Ll/ۛۡᩴ;->᩸:Z

    return p1

    .line 474
    :cond_0
    iget-object v0, p0, Ll/ۛۡᩴ;->᩶:[I

    .line 477
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    if-ne p1, v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v1, v3

    .line 480
    iget v2, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    if-ne p1, v2, :cond_2

    :goto_1
    return v3
.end method

.method public final forEach(Ljava/util/function/IntConsumer;)V
    .locals 3

    .line 762
    iget-object v0, p0, Ll/ۛۡᩴ;->᩶:[I

    .line 763
    iget-boolean v1, p0, Ll/ۛۡᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ۛۡᩴ;->۫:I

    aget v1, v0, v1

    invoke-interface {p1, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 764
    :cond_0
    iget v1, p0, Ll/ۛۡᩴ;->۫:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_2

    aget v1, v0, v2

    if-eqz v1, :cond_1

    invoke-interface {p1, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final hashCode()I
    .locals 5

    .line 875
    iget-object v0, p0, Ll/ۛۡᩴ;->᩶:[I

    .line 354
    iget-boolean v1, p0, Ll/ۛۡᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ۛۡᩴ;->ۤ:I

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget v1, p0, Ll/ۛۡᩴ;->ۤ:I

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    add-int/lit8 v4, v1, -0x1

    if-eqz v1, :cond_2

    .line 877
    :goto_2
    aget v1, v0, v3

    if-nez v1, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    add-int/2addr v2, v1

    add-int/lit8 v3, v3, 0x1

    move v1, v4

    goto :goto_1

    :cond_2
    return v2
.end method

.method public final isEmpty()Z
    .locals 1

    .line 508
    iget v0, p0, Ll/ۛۡᩴ;->ۤ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 632
    new-instance v0, Ll/۫ۡᩴ;

    invoke-direct {v0, p0}, Ll/۫ۡᩴ;-><init>(Ll/ۛۡᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/ۜۡᩴ;
    .locals 1

    .line 632
    new-instance v0, Ll/۫ۡᩴ;

    invoke-direct {v0, p0}, Ll/۫ۡᩴ;-><init>(Ll/ۛۡᩴ;)V

    return-object v0
.end method

.method public final remove(I)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 455
    iget-boolean p1, p0, Ll/ۛۡᩴ;->᩸:Z

    if-eqz p1, :cond_4

    .line 445
    iput-boolean v0, p0, Ll/ۛۡᩴ;->᩸:Z

    .line 446
    iget-object p1, p0, Ll/ۛۡᩴ;->᩶:[I

    iget v2, p0, Ll/ۛۡᩴ;->۫:I

    aput v0, p1, v2

    .line 447
    iget p1, p0, Ll/ۛۡᩴ;->ۤ:I

    sub-int/2addr p1, v1

    iput p1, p0, Ll/ۛۡᩴ;->ۤ:I

    .line 448
    iget v0, p0, Ll/ۛۡᩴ;->۬:I

    if-le v2, v0, :cond_0

    iget v0, p0, Ll/ۛۡᩴ;->ۗ:I

    div-int/lit8 v0, v0, 0x4

    if-ge p1, v0, :cond_0

    const/16 p1, 0x10

    if-le v2, p1, :cond_0

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {p0, v2}, Ll/ۛۡᩴ;->֫(I)V

    :cond_0
    return v1

    .line 459
    :cond_1
    iget-object v2, p0, Ll/ۛۡᩴ;->᩶:[I

    .line 462
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v3, v4

    aget v4, v2, v3

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    if-ne p1, v4, :cond_3

    .line 463
    invoke-direct {p0, v3}, Ll/ۛۡᩴ;->ᩳ(I)V

    return v1

    :cond_3
    add-int/2addr v3, v1

    .line 465
    iget v4, p0, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v3, v4

    aget v4, v2, v3

    if-nez v4, :cond_5

    :cond_4
    :goto_0
    return v0

    :cond_5
    if-ne p1, v4, :cond_3

    .line 466
    invoke-direct {p0, v3}, Ll/ۛۡᩴ;->ᩳ(I)V

    return v1
.end method

.method public final size()I
    .locals 1

    .line 503
    iget v0, p0, Ll/ۛۡᩴ;->ۤ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۛۡᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 757
    new-instance v0, Ll/ۤۡᩴ;

    invoke-direct {v0, p0}, Ll/ۤۡᩴ;-><init>(Ll/ۛۡᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܽܺᩴ;
    .locals 1

    .line 757
    new-instance v0, Ll/ۤۡᩴ;

    invoke-direct {v0, p0}, Ll/ۤۡᩴ;-><init>(Ll/ۛۡᩴ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 7

    .line 825
    iget-object v0, p0, Ll/ۛۡᩴ;->᩶:[I

    add-int/lit8 v1, p1, -0x1

    add-int/lit8 v2, p1, 0x1

    .line 827
    new-array v2, v2, [I

    .line 828
    iget v3, p0, Ll/ۛۡᩴ;->۫:I

    .line 354
    iget-boolean v4, p0, Ll/ۛۡᩴ;->᩸:Z

    if-eqz v4, :cond_0

    iget v4, p0, Ll/ۛۡᩴ;->ۤ:I

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_0
    iget v4, p0, Ll/ۛۡᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v5, v4, -0x1

    if-eqz v4, :cond_3

    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 830
    aget v4, v0, v3

    if-nez v4, :cond_1

    goto :goto_1

    .line 831
    :cond_1
    invoke-static {v4}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    and-int/2addr v4, v1

    aget v6, v2, v4

    if-eqz v6, :cond_2

    :goto_2
    add-int/lit8 v4, v4, 0x1

    and-int/2addr v4, v1

    aget v6, v2, v4

    if-eqz v6, :cond_2

    goto :goto_2

    .line 832
    :cond_2
    aget v6, v0, v3

    aput v6, v2, v4

    move v4, v5

    goto :goto_0

    .line 834
    :cond_3
    iput p1, p0, Ll/ۛۡᩴ;->۫:I

    .line 835
    iput v1, p0, Ll/ۛۡᩴ;->ۙ:I

    .line 836
    iget v0, p0, Ll/ۛۡᩴ;->᩹:F

    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/ۛۡᩴ;->ۗ:I

    .line 837
    iput-object v2, p0, Ll/ۛۡᩴ;->᩶:[I

    return-void
.end method

.method public final ֫(Ll/֨ۢᩴ;)Z
    .locals 6

    .line 375
    iget v0, p0, Ll/ۛۡᩴ;->᩹:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 364
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 365
    iget v1, p0, Ll/ۛۡᩴ;->۫:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/ۛۡᩴ;->֫(I)V

    goto :goto_0

    .line 503
    :cond_0
    iget v0, p0, Ll/ۛۡᩴ;->ۤ:I

    .line 376
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    int-to-long v0, v1

    invoke-direct {p0, v0, v1}, Ll/ۛۡᩴ;->֫(J)V

    .line 378
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/᩸ܿᩴ;->֫(Ll/֨ۢᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ܿ()V
    .locals 4

    .line 781
    iget v0, p0, Ll/ۛۡᩴ;->ۤ:I

    int-to-float v0, v0

    .line 803
    iget v1, p0, Ll/ۛۡᩴ;->᩹:F

    div-float/2addr v0, v1

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    .line 167
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x20

    shl-int v0, v2, v0

    .line 804
    iget v2, p0, Ll/ۛۡᩴ;->۫:I

    if-ge v0, v2, :cond_1

    iget v2, p0, Ll/ۛۡᩴ;->ۤ:I

    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v1

    if-le v2, v1, :cond_0

    goto :goto_0

    .line 806
    :cond_0
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ۛۡᩴ;->֫(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method
