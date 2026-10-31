.class public final Ll/ۘۚᩴ;
.super Ll/ܿᩴᩴ;
.source "0C59"

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

.field public transient ᩶:[Ljava/lang/Object;

.field public transient ᩸:Z

.field public final ᩹:F


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 307
    new-instance v0, Ll/᩷ۚᩴ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ll/ۢۚᩴ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ll/ۡۚᩴ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x1

    new-array v3, v3, [Ll/ۛۨᩴ;

    sget-object v4, Ll/ۛۨᩴ;->UNORDERED:Ll/ۛۨᩴ;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Ll/ۤۨᩴ;->of(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;[Ll/ۛۨᩴ;)Ll/ۨۨᩴ;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/high16 v0, 0x3f400000    # 0.75f

    .line 84
    iput v0, p0, Ll/ۘۚᩴ;->᩹:F

    const/16 v1, 0x10

    .line 85
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v1

    iput v1, p0, Ll/ۘۚᩴ;->۫:I

    iput v1, p0, Ll/ۘۚᩴ;->۬:I

    add-int/lit8 v2, v1, -0x1

    .line 86
    iput v2, p0, Ll/ۘۚᩴ;->ۙ:I

    .line 87
    invoke-static {v0, v1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/ۘۚᩴ;->ۗ:I

    .line 88
    iget v0, p0, Ll/ۘۚᩴ;->۫:I

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 6

    .line 917
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 918
    iget v0, p0, Ll/ۘۚᩴ;->ۤ:I

    iget v1, p0, Ll/ۘۚᩴ;->᩹:F

    invoke-static {v1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/ۘۚᩴ;->۫:I

    .line 919
    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/ۘۚᩴ;->ۗ:I

    .line 920
    iget v0, p0, Ll/ۘۚᩴ;->۫:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/ۘۚᩴ;->ۙ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 921
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    .line 923
    iget v2, p0, Ll/ۘۚᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    .line 924
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 926
    iget v4, p0, Ll/ۘۚᩴ;->۫:I

    .line 927
    iput-boolean v1, p0, Ll/ۘۚᩴ;->᩸:Z

    goto :goto_2

    .line 929
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-static {v4}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    iget v5, p0, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v4, v5

    aget-object v5, v0, v4

    if-eqz v5, :cond_1

    :goto_1
    add-int/2addr v4, v1

    iget v5, p0, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v4, v5

    aget-object v5, v0, v4

    if-eqz v5, :cond_1

    goto :goto_1

    .line 931
    :cond_1
    :goto_2
    aput-object v2, v0, v4

    move v2, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 656
    new-instance v0, Ll/ܺۚᩴ;

    invoke-direct {v0, p0}, Ll/ܺۚᩴ;-><init>(Ll/ۘۚᩴ;)V

    .line 911
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 912
    iget v1, p0, Ll/ۘۚᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ܺۚᩴ;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    move v1, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ᩳ(I)V
    .locals 5

    .line 438
    iget v0, p0, Ll/ۘۚᩴ;->ۤ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۘۚᩴ;->ۤ:I

    .line 421
    iget-object v0, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    :goto_0
    add-int/lit8 v1, p1, 0x1

    .line 423
    iget v2, p0, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v1, v2

    .line 425
    :goto_1
    aget-object v2, v0, v1

    if-nez v2, :cond_1

    const/4 v1, 0x0

    .line 426
    aput-object v1, v0, p1

    .line 440
    iget p1, p0, Ll/ۘۚᩴ;->۫:I

    iget v0, p0, Ll/ۘۚᩴ;->۬:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/ۘۚᩴ;->ۤ:I

    iget v1, p0, Ll/ۘۚᩴ;->ۗ:I

    div-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/ۘۚᩴ;->֫(I)V

    :cond_0
    return-void

    .line 429
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, p0, Ll/ۘۚᩴ;->ۙ:I

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
    aput-object v2, v0, p1

    move p1, v1

    goto :goto_0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    and-int/2addr v1, v4

    goto :goto_1
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 361
    iget-boolean p1, p0, Ll/ۘۚᩴ;->᩸:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 362
    :cond_0
    iput-boolean v0, p0, Ll/ۘۚᩴ;->᩸:Z

    goto :goto_1

    .line 365
    :cond_1
    iget-object v1, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    .line 367
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v2, v3

    aget-object v3, v1, v2

    if-eqz v3, :cond_3

    .line 368
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr v2, v0

    .line 369
    iget v3, p0, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v2, v3

    aget-object v3, v1, v2

    if-eqz v3, :cond_3

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 371
    :cond_3
    aput-object p1, v1, v2

    .line 373
    :goto_1
    iget p1, p0, Ll/ۘۚᩴ;->ۤ:I

    add-int/lit8 v1, p1, 0x1

    iput v1, p0, Ll/ۘۚᩴ;->ۤ:I

    iget v1, p0, Ll/ۘۚᩴ;->ۗ:I

    if-lt p1, v1, :cond_4

    add-int/lit8 p1, p1, 0x2

    iget v1, p0, Ll/ۘۚᩴ;->᩹:F

    invoke-static {v1, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۘۚᩴ;->֫(I)V

    :cond_4
    return v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 6

    .line 351
    iget v0, p0, Ll/ۘۚᩴ;->᩹:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 339
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 340
    iget v1, p0, Ll/ۘۚᩴ;->۫:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/ۘۚᩴ;->֫(I)V

    goto :goto_0

    .line 527
    :cond_0
    iget v1, p0, Ll/ۘۚᩴ;->ۤ:I

    .line 352
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v2, v1

    int-to-long v1, v2

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-double v0, v1

    .line 344
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-long v0, v0

    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(J)J

    move-result-wide v0

    const-wide/16 v2, 0x2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/32 v2, 0x40000000

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    .line 345
    iget v0, p0, Ll/ۘۚᩴ;->۫:I

    if-le v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ll/ۘۚᩴ;->֫(I)V

    .line 354
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 2

    .line 519
    iget v0, p0, Ll/ۘۚᩴ;->ۤ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 520
    iput v0, p0, Ll/ۘۚᩴ;->ۤ:I

    .line 521
    iput-boolean v0, p0, Ll/ۘۚᩴ;->᩸:Z

    .line 522
    iget-object v0, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 878
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘۚᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 882
    iget-object v1, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    .line 883
    iget-boolean v1, p0, Ll/ۘۚᩴ;->᩸:Z

    iput-boolean v1, v0, Ll/ۘۚᩴ;->᩸:Z

    return-object v0

    .line 880
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    if-nez p1, :cond_0

    .line 474
    iget-boolean p1, p0, Ll/ۘۚᩴ;->᩸:Z

    return p1

    .line 476
    :cond_0
    iget-object v0, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    .line 479
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    .line 480
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v1, v3

    .line 482
    iget v2, p0, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 483
    :cond_3
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    return v3
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 3

    .line 786
    iget-object v0, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    .line 787
    iget-boolean v1, p0, Ll/ۘۚᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ۘۚᩴ;->۫:I

    aget-object v1, v0, v1

    invoke-interface {p1, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 788
    :cond_0
    iget v1, p0, Ll/ۘۚᩴ;->۫:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_2

    aget-object v1, v0, v2

    if-eqz v1, :cond_1

    invoke-interface {p1, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final hashCode()I
    .locals 5

    .line 899
    iget-object v0, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    .line 329
    iget-boolean v1, p0, Ll/ۘۚᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ۘۚᩴ;->ۤ:I

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget v1, p0, Ll/ۘۚᩴ;->ۤ:I

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    add-int/lit8 v4, v1, -0x1

    if-eqz v1, :cond_3

    .line 901
    :goto_2
    aget-object v1, v0, v3

    if-nez v1, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    if-eq p0, v1, :cond_2

    .line 902
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v2

    move v2, v1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    move v1, v4

    goto :goto_1

    :cond_3
    return v2
.end method

.method public final isEmpty()Z
    .locals 1

    .line 532
    iget v0, p0, Ll/ۘۚᩴ;->ۤ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 656
    new-instance v0, Ll/ܺۚᩴ;

    invoke-direct {v0, p0}, Ll/ܺۚᩴ;-><init>(Ll/ۘۚᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 656
    new-instance v0, Ll/ܺۚᩴ;

    invoke-direct {v0, p0}, Ll/ܺۚᩴ;-><init>(Ll/ۘۚᩴ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 456
    iget-boolean p1, p0, Ll/ۘۚᩴ;->᩸:Z

    if-eqz p1, :cond_4

    .line 445
    iput-boolean v0, p0, Ll/ۘۚᩴ;->᩸:Z

    .line 446
    iget-object p1, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    iget v0, p0, Ll/ۘۚᩴ;->۫:I

    const/4 v2, 0x0

    aput-object v2, p1, v0

    .line 447
    iget p1, p0, Ll/ۘۚᩴ;->ۤ:I

    sub-int/2addr p1, v1

    iput p1, p0, Ll/ۘۚᩴ;->ۤ:I

    .line 448
    iget v2, p0, Ll/ۘۚᩴ;->۬:I

    if-le v0, v2, :cond_0

    iget v2, p0, Ll/ۘۚᩴ;->ۗ:I

    div-int/lit8 v2, v2, 0x4

    if-ge p1, v2, :cond_0

    const/16 p1, 0x10

    if-le v0, p1, :cond_0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Ll/ۘۚᩴ;->֫(I)V

    :cond_0
    return v1

    .line 460
    :cond_1
    iget-object v2, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    .line 463
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, p0, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v3, v4

    aget-object v4, v2, v3

    if-nez v4, :cond_2

    goto :goto_0

    .line 464
    :cond_2
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v3}, Ll/ۘۚᩴ;->ᩳ(I)V

    return v1

    :cond_3
    add-int/2addr v3, v1

    .line 466
    iget v4, p0, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v3, v4

    aget-object v4, v2, v3

    if-nez v4, :cond_5

    :cond_4
    :goto_0
    return v0

    .line 467
    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v3}, Ll/ۘۚᩴ;->ᩳ(I)V

    return v1
.end method

.method public final size()I
    .locals 1

    .line 527
    iget v0, p0, Ll/ۘۚᩴ;->ۤ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۘۚᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 1

    .line 781
    new-instance v0, Ll/ۖۚᩴ;

    invoke-direct {v0, p0}, Ll/ۖۚᩴ;-><init>(Ll/ۘۚᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 781
    new-instance v0, Ll/ۖۚᩴ;

    invoke-direct {v0, p0}, Ll/ۖۚᩴ;-><init>(Ll/ۘۚᩴ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 7

    .line 849
    iget-object v0, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    add-int/lit8 v1, p1, -0x1

    add-int/lit8 v2, p1, 0x1

    .line 851
    new-array v2, v2, [Ljava/lang/Object;

    .line 852
    iget v3, p0, Ll/ۘۚᩴ;->۫:I

    .line 329
    iget-boolean v4, p0, Ll/ۘۚᩴ;->᩸:Z

    if-eqz v4, :cond_0

    iget v4, p0, Ll/ۘۚᩴ;->ۤ:I

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_0
    iget v4, p0, Ll/ۘۚᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v5, v4, -0x1

    if-eqz v4, :cond_3

    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 854
    aget-object v4, v0, v3

    if-nez v4, :cond_1

    goto :goto_1

    .line 855
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-static {v4}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    and-int/2addr v4, v1

    aget-object v6, v2, v4

    if-eqz v6, :cond_2

    :goto_2
    add-int/lit8 v4, v4, 0x1

    and-int/2addr v4, v1

    aget-object v6, v2, v4

    if-eqz v6, :cond_2

    goto :goto_2

    .line 856
    :cond_2
    aget-object v6, v0, v3

    aput-object v6, v2, v4

    move v4, v5

    goto :goto_0

    .line 858
    :cond_3
    iput p1, p0, Ll/ۘۚᩴ;->۫:I

    .line 859
    iput v1, p0, Ll/ۘۚᩴ;->ۙ:I

    .line 860
    iget v0, p0, Ll/ۘۚᩴ;->᩹:F

    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/ۘۚᩴ;->ۗ:I

    .line 861
    iput-object v2, p0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    return-void
.end method
