.class public final Ll/᩶ۧᩴ;
.super Ll/֡ܰۘ;
.source "0C1E"

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

.field public transient ᩶:[C

.field public transient ᩸:Z

.field public final ᩹:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/high16 v0, 0x3f400000    # 0.75f

    .line 82
    iput v0, p0, Ll/᩶ۧᩴ;->᩹:F

    const/16 v1, 0x10

    .line 83
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v1

    iput v1, p0, Ll/᩶ۧᩴ;->۫:I

    iput v1, p0, Ll/᩶ۧᩴ;->۬:I

    add-int/lit8 v2, v1, -0x1

    .line 84
    iput v2, p0, Ll/᩶ۧᩴ;->ۙ:I

    .line 85
    invoke-static {v0, v1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/᩶ۧᩴ;->ۗ:I

    .line 86
    iget v0, p0, Ll/᩶ۧᩴ;->۫:I

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [C

    iput-object v0, p0, Ll/᩶ۧᩴ;->᩶:[C

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 6

    .line 858
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 859
    iget v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    iget v1, p0, Ll/᩶ۧᩴ;->᩹:F

    invoke-static {v1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/᩶ۧᩴ;->۫:I

    .line 860
    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/᩶ۧᩴ;->ۗ:I

    .line 861
    iget v0, p0, Ll/᩶ۧᩴ;->۫:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/᩶ۧᩴ;->ۙ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 862
    new-array v0, v0, [C

    iput-object v0, p0, Ll/᩶ۧᩴ;->᩶:[C

    .line 864
    iget v2, p0, Ll/᩶ۧᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    .line 865
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readChar()C

    move-result v2

    if-nez v2, :cond_0

    .line 867
    iget v4, p0, Ll/᩶ۧᩴ;->۫:I

    .line 868
    iput-boolean v1, p0, Ll/᩶ۧᩴ;->᩸:Z

    goto :goto_2

    .line 870
    :cond_0
    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    iget v5, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v4, v5

    aget-char v5, v0, v4

    if-eqz v5, :cond_1

    :goto_1
    add-int/2addr v4, v1

    iget v5, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v4, v5

    aget-char v5, v0, v4

    if-eqz v5, :cond_1

    goto :goto_1

    .line 872
    :cond_1
    :goto_2
    aput-char v2, v0, v4

    move v2, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 598
    new-instance v0, Ll/᩸ۧᩴ;

    invoke-direct {v0, p0}, Ll/᩸ۧᩴ;-><init>(Ll/᩶ۧᩴ;)V

    .line 853
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 854
    iget v1, p0, Ll/᩶ۧᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/᩸ۧᩴ;->֡ۧ()C

    move-result v1

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeChar(I)V

    move v1, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(J)V
    .locals 2

    long-to-float p1, p1

    .line 335
    iget p2, p0, Ll/᩶ۧᩴ;->᩹:F

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

    .line 336
    iget p1, p0, Ll/᩶ۧᩴ;->۫:I

    if-le p2, p1, :cond_0

    invoke-virtual {p0, p2}, Ll/᩶ۧᩴ;->֫(I)V

    :cond_0
    return-void
.end method

.method private ᩳ(I)V
    .locals 5

    .line 404
    iget v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    .line 387
    iget-object v0, p0, Ll/᩶ۧᩴ;->᩶:[C

    :goto_0
    add-int/lit8 v1, p1, 0x1

    .line 389
    iget v2, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v1, v2

    .line 391
    :goto_1
    aget-char v2, v0, v1

    if-nez v2, :cond_1

    const/4 v1, 0x0

    .line 392
    aput-char v1, v0, p1

    .line 406
    iget p1, p0, Ll/᩶ۧᩴ;->۫:I

    iget v0, p0, Ll/᩶ۧᩴ;->۬:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    iget v1, p0, Ll/᩶ۧᩴ;->ۗ:I

    div-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/᩶ۧᩴ;->֫(I)V

    :cond_0
    return-void

    .line 395
    :cond_1
    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v3, v4

    if-gt p1, v1, :cond_2

    if-ge p1, v3, :cond_3

    if-le v3, v1, :cond_4

    goto :goto_2

    :cond_2
    if-lt p1, v3, :cond_4

    if-le v3, v1, :cond_4

    .line 399
    :cond_3
    :goto_2
    aput-char v2, v0, p1

    move p1, v1

    goto :goto_0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    and-int/2addr v1, v4

    goto :goto_1
.end method


# virtual methods
.method public final addAll(Ljava/util/Collection;)Z
    .locals 6

    .line 350
    iget v0, p0, Ll/᩶ۧᩴ;->᩹:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 330
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 331
    iget v1, p0, Ll/᩶ۧᩴ;->۫:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/᩶ۧᩴ;->֫(I)V

    goto :goto_0

    .line 469
    :cond_0
    iget v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    .line 351
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    int-to-long v0, v1

    invoke-direct {p0, v0, v1}, Ll/᩶ۧᩴ;->֫(J)V

    .line 353
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/᩷ܰۘ;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 2

    .line 461
    iget v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 462
    iput v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    .line 463
    iput-boolean v0, p0, Ll/᩶ۧᩴ;->᩸:Z

    .line 464
    iget-object v1, p0, Ll/᩶ۧᩴ;->᩶:[C

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([CC)V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 820
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۧᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 824
    iget-object v1, p0, Ll/᩶ۧᩴ;->᩶:[C

    invoke-virtual {v1}, [C->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [C

    iput-object v1, v0, Ll/᩶ۧᩴ;->᩶:[C

    .line 825
    iget-boolean v1, p0, Ll/᩶ۧᩴ;->᩸:Z

    iput-boolean v1, v0, Ll/᩶ۧᩴ;->᩸:Z

    return-object v0

    .line 822
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final hashCode()I
    .locals 5

    .line 841
    iget-object v0, p0, Ll/᩶ۧᩴ;->᩶:[C

    .line 320
    iget-boolean v1, p0, Ll/᩶ۧᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/᩶ۧᩴ;->ۤ:I

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget v1, p0, Ll/᩶ۧᩴ;->ۤ:I

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    add-int/lit8 v4, v1, -0x1

    if-eqz v1, :cond_2

    .line 843
    :goto_2
    aget-char v1, v0, v3

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

    .line 474
    iget v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 598
    new-instance v0, Ll/᩸ۧᩴ;

    invoke-direct {v0, p0}, Ll/᩸ۧᩴ;-><init>(Ll/᩶ۧᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/ܺۧᩴ;
    .locals 1

    .line 598
    new-instance v0, Ll/᩸ۧᩴ;

    invoke-direct {v0, p0}, Ll/᩸ۧᩴ;-><init>(Ll/᩶ۧᩴ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 469
    iget v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩶ۧᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 723
    new-instance v0, Ll/᩹ۧᩴ;

    invoke-direct {v0, p0}, Ll/᩹ۧᩴ;-><init>(Ll/᩶ۧᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܽܽᩴ;
    .locals 1

    .line 723
    new-instance v0, Ll/᩹ۧᩴ;

    invoke-direct {v0, p0}, Ll/᩹ۧᩴ;-><init>(Ll/᩶ۧᩴ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 7

    .line 791
    iget-object v0, p0, Ll/᩶ۧᩴ;->᩶:[C

    add-int/lit8 v1, p1, -0x1

    add-int/lit8 v2, p1, 0x1

    .line 793
    new-array v2, v2, [C

    .line 794
    iget v3, p0, Ll/᩶ۧᩴ;->۫:I

    .line 320
    iget-boolean v4, p0, Ll/᩶ۧᩴ;->᩸:Z

    if-eqz v4, :cond_0

    iget v4, p0, Ll/᩶ۧᩴ;->ۤ:I

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_0
    iget v4, p0, Ll/᩶ۧᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v5, v4, -0x1

    if-eqz v4, :cond_3

    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 796
    aget-char v4, v0, v3

    if-nez v4, :cond_1

    goto :goto_1

    .line 797
    :cond_1
    invoke-static {v4}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    and-int/2addr v4, v1

    aget-char v6, v2, v4

    if-eqz v6, :cond_2

    :goto_2
    add-int/lit8 v4, v4, 0x1

    and-int/2addr v4, v1

    aget-char v6, v2, v4

    if-eqz v6, :cond_2

    goto :goto_2

    .line 798
    :cond_2
    aget-char v6, v0, v3

    aput-char v6, v2, v4

    move v4, v5

    goto :goto_0

    .line 800
    :cond_3
    iput p1, p0, Ll/᩶ۧᩴ;->۫:I

    .line 801
    iput v1, p0, Ll/᩶ۧᩴ;->ۙ:I

    .line 802
    iget v0, p0, Ll/᩶ۧᩴ;->᩹:F

    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/᩶ۧᩴ;->ۗ:I

    .line 803
    iput-object v2, p0, Ll/᩶ۧᩴ;->᩶:[C

    return-void
.end method

.method public final ֫(Ll/᩻ۧᩴ;)V
    .locals 3

    .line 728
    iget-object v0, p0, Ll/᩶ۧᩴ;->᩶:[C

    .line 729
    iget-boolean v1, p0, Ll/᩶ۧᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/᩶ۧᩴ;->۫:I

    aget-char v1, v0, v1

    invoke-interface {p1, v1}, Ll/᩻ۧᩴ;->ܽ(C)V

    .line 730
    :cond_0
    iget v1, p0, Ll/᩶ۧᩴ;->۫:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_2

    aget-char v1, v0, v2

    if-eqz v1, :cond_1

    invoke-interface {p1, v1}, Ll/᩻ۧᩴ;->ܽ(C)V

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(C)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 421
    iget-boolean p1, p0, Ll/᩶ۧᩴ;->᩸:Z

    if-eqz p1, :cond_4

    .line 411
    iput-boolean v0, p0, Ll/᩶ۧᩴ;->᩸:Z

    .line 412
    iget-object p1, p0, Ll/᩶ۧᩴ;->᩶:[C

    iget v2, p0, Ll/᩶ۧᩴ;->۫:I

    aput-char v0, p1, v2

    .line 413
    iget p1, p0, Ll/᩶ۧᩴ;->ۤ:I

    sub-int/2addr p1, v1

    iput p1, p0, Ll/᩶ۧᩴ;->ۤ:I

    .line 414
    iget v0, p0, Ll/᩶ۧᩴ;->۬:I

    if-le v2, v0, :cond_0

    iget v0, p0, Ll/᩶ۧᩴ;->ۗ:I

    div-int/lit8 v0, v0, 0x4

    if-ge p1, v0, :cond_0

    const/16 p1, 0x10

    if-le v2, p1, :cond_0

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {p0, v2}, Ll/᩶ۧᩴ;->֫(I)V

    :cond_0
    return v1

    .line 425
    :cond_1
    iget-object v2, p0, Ll/᩶ۧᩴ;->᩶:[C

    .line 428
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v3, v4

    aget-char v4, v2, v3

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    if-ne p1, v4, :cond_3

    .line 429
    invoke-direct {p0, v3}, Ll/᩶ۧᩴ;->ᩳ(I)V

    return v1

    :cond_3
    add-int/2addr v3, v1

    .line 431
    iget v4, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v3, v4

    aget-char v4, v2, v3

    if-nez v4, :cond_5

    :cond_4
    :goto_0
    return v0

    :cond_5
    if-ne p1, v4, :cond_3

    .line 432
    invoke-direct {p0, v3}, Ll/᩶ۧᩴ;->ᩳ(I)V

    return v1
.end method

.method public final ֫(Ll/ۛ֫ᩴ;)Z
    .locals 6

    .line 341
    iget v0, p0, Ll/᩶ۧᩴ;->᩹:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 330
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 331
    iget v1, p0, Ll/᩶ۧᩴ;->۫:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/᩶ۧᩴ;->֫(I)V

    goto :goto_0

    .line 469
    :cond_0
    iget v0, p0, Ll/᩶ۧᩴ;->ۤ:I

    .line 342
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    int-to-long v0, v1

    invoke-direct {p0, v0, v1}, Ll/᩶ۧᩴ;->֫(J)V

    .line 344
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/᩷ܰۘ;->֫(Ll/ۛ֫ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(C)Z
    .locals 4

    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 360
    iget-boolean p1, p0, Ll/᩶ۧᩴ;->᩸:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 361
    :cond_0
    iput-boolean v0, p0, Ll/᩶ۧᩴ;->᩸:Z

    goto :goto_1

    .line 364
    :cond_1
    iget-object v1, p0, Ll/᩶ۧᩴ;->᩶:[C

    .line 366
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v2, v3

    aget-char v3, v1, v2

    if-eqz v3, :cond_3

    if-ne v3, p1, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr v2, v0

    .line 368
    iget v3, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v2, v3

    aget-char v3, v1, v2

    if-eqz v3, :cond_3

    if-ne v3, p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 370
    :cond_3
    aput-char p1, v1, v2

    .line 372
    :goto_1
    iget p1, p0, Ll/᩶ۧᩴ;->ۤ:I

    add-int/lit8 v1, p1, 0x1

    iput v1, p0, Ll/᩶ۧᩴ;->ۤ:I

    iget v1, p0, Ll/᩶ۧᩴ;->ۗ:I

    if-lt p1, v1, :cond_4

    add-int/lit8 p1, p1, 0x2

    iget v1, p0, Ll/᩶ۧᩴ;->᩹:F

    invoke-static {v1, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩶ۧᩴ;->֫(I)V

    :cond_4
    return v0
.end method

.method public final ᩻(C)Z
    .locals 4

    if-nez p1, :cond_0

    .line 438
    iget-boolean p1, p0, Ll/᩶ۧᩴ;->᩸:Z

    return p1

    .line 440
    :cond_0
    iget-object v0, p0, Ll/᩶ۧᩴ;->᩶:[C

    .line 443
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v1, v2

    aget-char v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    if-ne p1, v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v1, v3

    .line 446
    iget v2, p0, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v1, v2

    aget-char v2, v0, v1

    if-nez v2, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    if-ne p1, v2, :cond_2

    :goto_1
    return v3
.end method
