.class public Ll/ۖܶ۠;
.super Ljava/util/AbstractCollection;
.source "L42O"

# interfaces
.implements Ljava/util/List;


# static fields
.field public static final ۗ:Ll/ۖܶ۠;

.field public static final ۙ:Ljava/util/Iterator;

.field public static final synthetic ᩶:I


# instance fields
.field public ᩸:Ljava/lang/Object;

.field public ᩹:Ll/ۖܶ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 79
    new-instance v0, Ll/ۢܶ۠;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    sput-object v0, Ll/ۖܶ۠;->ۗ:Ll/ۖܶ۠;

    .line 441
    new-instance v0, Ll/ۡܶ۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۖܶ۠;->ۙ:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ll/ۖܶ۠;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 68
    iput-object p2, p0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 69
    iput-object p1, p0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    return-void
.end method

.method public static of(Ljava/lang/Object;)Ll/ۖܶ۠;
    .locals 2

    .line 137
    new-instance v0, Ll/ۖܶ۠;

    .line 76
    sget-object v1, Ll/ۖܶ۠;->ۗ:Ll/ۖܶ۠;

    .line 137
    invoke-direct {v0, p0, v1}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۖܶ۠;
    .locals 1

    .line 143
    new-instance v0, Ll/ۖܶ۠;

    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ۖܶ۠;
    .locals 1

    .line 149
    new-instance v0, Ll/ۖܶ۠;

    invoke-static {p1, p2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Iterable;)Ll/ۖܶ۠;
    .locals 2

    .line 172
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 173
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 174
    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 176
    :cond_0
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ll/ۖܶ۠;
    .locals 3

    .line 156
    new-instance v0, Ll/ۖܶ۠;

    new-instance v1, Ll/ۖܶ۠;

    new-instance v2, Ll/ۖܶ۠;

    invoke-static {p3}, Ll/ۖܶ۠;->֫([Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p3

    invoke-direct {v2, p2, p3}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    invoke-direct {v1, p1, v2}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    invoke-direct {v0, p0, v1}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Object;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 3

    .line 91
    invoke-static {p0}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 93
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    sget-object v0, Ll/ۖܶ۠;->ۗ:Ll/ۖܶ۠;

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 94
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v2, Ll/ۖܶ۠;

    invoke-direct {v2, v1, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    move-object v0, v2

    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v0}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([Ljava/lang/Object;)Ll/ۖܶ۠;
    .locals 4

    .line 165
    sget-object v0, Ll/ۖܶ۠;->ۗ:Ll/ۖܶ۠;

    if-eqz p0, :cond_0

    .line 166
    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    .line 167
    new-instance v2, Ll/ۖܶ۠;

    aget-object v3, p0, v1

    invoke-direct {v2, v3, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    add-int/lit8 v1, v1, -0x1

    move-object v0, v2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ܳ()Ll/ۖܶ۠;
    .locals 1

    .line 76
    sget-object v0, Ll/ۖܶ۠;->ۗ:Ll/ۖܶ۠;

    return-object v0
.end method

.method public static ܿ()Ll/ۨۨᩴ;
    .locals 5

    .line 559
    new-instance v0, Ll/᩻ܶ۠;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/᩻ܶ۠;-><init>(I)V

    new-instance v1, Ll/ۜܶ۠;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۜܶ۠;-><init>(I)V

    new-instance v2, Ll/᩷ܶ۠;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/᩷ܶ۠;-><init>(I)V

    new-instance v3, Ll/ܶᩴᩳ;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Ll/ܶᩴᩳ;-><init>(I)V

    const/4 v4, 0x0

    new-array v4, v4, [Ll/ۛۨᩴ;

    invoke-static {v0, v1, v2, v3, v4}, Ll/ۤۨᩴ;->of(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Ll/ۛۨᩴ;)Ll/ۨۨᩴ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 0

    .line 505
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0

    .line 495
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 497
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    move-object v0, p0

    .line 397
    :goto_0
    iget-object v1, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    if-nez p1, :cond_0

    .line 399
    iget-object v2, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    if-nez v2, :cond_1

    return v1

    .line 401
    :cond_0
    iget-object v2, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    .line 403
    :cond_1
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 361
    instance-of v0, p1, Ll/ۖܶ۠;

    if-eqz v0, :cond_3

    check-cast p1, Ll/ۖܶ۠;

    move-object v0, p0

    .line 380
    :goto_0
    iget-object v1, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v1, :cond_2

    iget-object v2, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v2, :cond_2

    .line 381
    iget-object v1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    if-nez v1, :cond_0

    .line 382
    iget-object v1, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    if-eqz v1, :cond_1

    goto :goto_4

    .line 384
    :cond_0
    iget-object v2, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_4

    .line 386
    :cond_1
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 387
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_2
    if-nez v1, :cond_7

    .line 389
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-nez p1, :cond_7

    goto :goto_3

    .line 363
    :cond_3
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_7

    check-cast p1, Ljava/util/List;

    .line 365
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v0, p0

    .line 366
    :goto_1
    iget-object v1, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 367
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 368
    iget-object v2, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    if-nez v2, :cond_4

    if-nez v1, :cond_7

    goto :goto_2

    :cond_4
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_4

    .line 370
    :cond_5
    :goto_2
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_1

    .line 372
    :cond_6
    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_7

    :goto_3
    const/4 p1, 0x1

    return p1

    :cond_7
    :goto_4
    const/4 p1, 0x0

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3

    if-ltz p1, :cond_2

    move-object v1, p0

    move v0, p1

    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-lez v0, :cond_0

    .line 485
    invoke-virtual {v1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    move v0, v2

    goto :goto_0

    .line 488
    :cond_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 491
    iget-object p1, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    return-object p1

    .line 489
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index: "

    const-string v2, ", Size: "

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 218
    invoke-virtual {p0}, Ll/ۖܶ۠;->ۧ()I

    move-result v1

    .line 490
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 482
    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    move-object v1, p0

    .line 349
    :goto_0
    iget-object v2, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v2, :cond_1

    mul-int/lit8 v0, v0, 0x1f

    .line 350
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    .line 351
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 3

    const/4 v0, 0x0

    move-object v1, p0

    .line 514
    :goto_0
    iget-object v2, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v2, :cond_2

    .line 515
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    if-nez v2, :cond_0

    if-nez p1, :cond_1

    goto :goto_1

    :cond_0
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_1
    return v0

    .line 514
    :cond_1
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 460
    iget-object v0, p0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-nez v0, :cond_0

    .line 455
    sget-object v0, Ll/ۖܶ۠;->ۙ:Ljava/util/Iterator;

    return-object v0

    .line 462
    :cond_0
    new-instance v0, Ll/ܺܶ۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 463
    iput-object p0, v0, Ll/ܺܶ۠;->᩸:Ll/ۖܶ۠;

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    move-object v1, p0

    .line 413
    :goto_0
    iget-object v2, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v2, :cond_0

    .line 414
    iget-object v0, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    move-object v1, v2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 4

    const/4 v0, -0x1

    const/4 v1, 0x0

    move-object v2, p0

    .line 524
    :goto_0
    iget-object v3, v2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v3, :cond_2

    .line 525
    iget-object v3, v2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    if-nez v3, :cond_0

    if-nez p1, :cond_1

    goto :goto_1

    :cond_0
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    move v0, v1

    .line 524
    :cond_1
    iget-object v2, v2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 532
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 536
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    return-object p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0

    .line 509
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 501
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 218
    invoke-virtual {p0}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    return v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 4

    if-ltz p1, :cond_3

    .line 218
    invoke-virtual {p0}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    if-gt p2, v0, :cond_3

    if-gt p1, p2, :cond_3

    .line 543
    new-instance v0, Ljava/util/ArrayList;

    sub-int v1, p2, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move-object v2, p0

    .line 545
    :goto_0
    iget-object v3, v2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v3, :cond_2

    if-ne v1, p2, :cond_0

    goto :goto_1

    :cond_0
    if-lt v1, p1, :cond_1

    .line 549
    iget-object v3, v2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 545
    :cond_1
    iget-object v2, v2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 552
    :cond_2
    :goto_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 541
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 218
    invoke-virtual {p0}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    .line 316
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ll/ۖܶ۠;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    move-object v1, p0

    .line 300
    :goto_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_0

    array-length v2, p1

    if-ge v0, v2, :cond_0

    .line 301
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    aput-object v2, p1, v0

    .line 302
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 305
    :cond_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 306
    array-length v1, p1

    if-ge v0, v1, :cond_1

    const/4 v1, 0x0

    .line 307
    aput-object v1, p1, v0

    :cond_1
    return-object p1

    .line 311
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    .line 218
    invoke-virtual {p0}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    .line 311
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 312
    invoke-virtual {p0, p1}, Ll/ۖܶ۠;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, ","

    .line 339
    invoke-virtual {p0, v0}, Ll/ۖܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 322
    invoke-virtual {p0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    return-object p1

    .line 325
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    iget-object v1, p0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 327
    iget-object v1, p0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    :goto_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 328
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 327
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 331
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;)Ll/ۖܶ۠;
    .locals 0

    .line 274
    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/util/function/Function;)Ll/ۖܶ۠;
    .locals 5

    .line 423
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 424
    invoke-virtual {p0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 425
    invoke-interface {p1, v3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 426
    invoke-virtual {v0, v4}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    if-eq v4, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    or-int/2addr v2, v3

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    .line 429
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    :cond_2
    return-object p0
.end method

.method public final ֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 4

    .line 112
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 113
    invoke-virtual {p0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 114
    invoke-virtual {p1, v2}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 115
    invoke-virtual {v0, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 118
    :cond_1
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()I
    .locals 2

    const/4 v0, 0x0

    move-object v1, p0

    .line 210
    :goto_0
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;
    .locals 1

    .line 230
    new-instance v0, Ll/ۖܶ۠;

    invoke-direct {v0, p1, p0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    return-object v0
.end method

.method public final ۧ(Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 4

    .line 102
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 103
    invoke-virtual {p0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 104
    invoke-virtual {p1, v2}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 105
    invoke-virtual {v0, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 108
    :cond_1
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 2

    .line 237
    invoke-virtual {p0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 238
    :cond_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 239
    :cond_1
    iget-object v0, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    .line 230
    new-instance v0, Ll/ۖܶ۠;

    invoke-direct {v0, p1, p0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    return-object v0

    .line 242
    :cond_2
    invoke-virtual {p1}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v0

    if-eq v0, p1, :cond_3

    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 243
    :goto_0
    invoke-static {p1}, Ll/۫ۙ;->֫(Z)V

    move-object p1, p0

    .line 246
    :goto_1
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 248
    iget-object v1, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 249
    invoke-virtual {v0, p1}, Ll/ۖܶ۠;->ᩳ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-object p1, v0

    move-object v0, v1

    goto :goto_1

    :cond_4
    return-object p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 201
    iget-object v0, p0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Ll/ۖܶ۠;
    .locals 4

    .line 261
    invoke-virtual {p0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 265
    :cond_0
    sget-object v0, Ll/ۖܶ۠;->ۗ:Ll/ۖܶ۠;

    move-object v1, p0

    :goto_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 266
    new-instance v2, Ll/ۖܶ۠;

    iget-object v3, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-direct {v2, v3, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    .line 265
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    move-object v0, v2

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public ᩳ(Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 0

    .line 222
    iput-object p1, p0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    return-object p1
.end method
