.class public Ll/ۤ᩵֨;
.super Ll/ܰ᩵֨;
.source "R450"


# static fields
.field public static final ۢ:Ll/ܳ᩵֨;


# instance fields
.field public ۜ:I

.field public ܳ:Ll/ۤ᩵֨;

.field public ܽ:Ll/ܳ᩵֨;

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:[Ll/ܳ᩵֨;

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 306
    new-instance v0, Ll/ܳ᩵֨;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Ll/ܳ᩵֨;-><init>(Ll/ۛ֡֨;Ll/ܳ᩵֨;Ll/ܳ᩵֨;Ll/ۤ᩵֨;)V

    sput-object v0, Ll/ۤ᩵֨;->ۢ:Ll/ܳ᩵֨;

    return-void
.end method

.method public constructor <init>(Ll/ۛ֡֨;)V
    .locals 2

    const/16 v0, 0x10

    new-array v0, v0, [Ll/ܳ᩵֨;

    const/4 v1, 0x0

    .line 333
    invoke-direct {p0, v1, p1, v0}, Ll/ۤ᩵֨;-><init>(Ll/ۤ᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;)V

    return-void
.end method

.method public constructor <init>(Ll/ۤ᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;)V
    .locals 1

    .line 222
    invoke-direct {p0, p2}, Ll/۟᩵֨;-><init>(Ll/ۛ֡֨;)V

    const/4 v0, 0x0

    .line 299
    iput v0, p0, Ll/ۤ᩵֨;->ܿ:I

    .line 301
    iput v0, p0, Ll/ۤ᩵֨;->᩻:I

    .line 317
    iput-object p1, p0, Ll/ۤ᩵֨;->ܳ:Ll/ۤ᩵֨;

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    .line 318
    :cond_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 319
    iput-object p3, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    .line 320
    array-length p1, p3

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۤ᩵֨;->ᩳ:I

    return-void
.end method

.method public constructor <init>(Ll/ۤ᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;I)V
    .locals 0

    .line 325
    invoke-direct {p0, p1, p2, p3}, Ll/ۤ᩵֨;-><init>(Ll/ۤ᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;)V

    .line 326
    iput p4, p0, Ll/ۤ᩵֨;->ܿ:I

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩻᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/ۤ᩵֨;-><init>(Ll/ۤ᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .line 677
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Scope["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_3

    if-eq v1, p0, :cond_0

    const-string v2, " | "

    .line 680
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    :cond_0
    iget-object v2, v1, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    :goto_1
    if-eqz v2, :cond_2

    .line 682
    iget-object v3, v1, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    if-eq v2, v3, :cond_1

    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    :cond_1
    iget-object v3, v2, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 681
    iget-object v2, v2, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    goto :goto_1

    .line 679
    :cond_2
    iget-object v1, v1, Ll/ۤ᩵֨;->ܳ:Ll/ۤ᩵֨;

    goto :goto_0

    :cond_3
    const-string v1, "]"

    .line 686
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 1

    .line 573
    new-instance v0, Ll/᩶᩵֨;

    invoke-direct {v0, p0, p2, p1}, Ll/᩶᩵֨;-><init>(Ll/ۤ᩵֨;Ll/֨᩵֨;Ljava/util/function/Predicate;)V

    return-object v0
.end method

.method public ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 1

    .line 630
    new-instance v0, Ll/ۙ᩵֨;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۙ᩵֨;-><init>(Ll/ۤ᩵֨;Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)V

    return-object v0
.end method

.method public ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;
    .locals 0

    .line 528
    invoke-virtual {p0, p1, p2}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object p1

    iget-object p1, p1, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    return-object p1
.end method

.method public ֫(Ll/ۛ֡֨;)Ll/۟᩵֨;
    .locals 2

    .line 663
    iget-object v0, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p0, v0}, Ll/ۤ᩵֨;->ܽ(Ll/ۤܶ۠;)Ll/ܳ᩵֨;

    move-result-object v0

    :goto_0
    iget-object v1, v0, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-eqz v1, :cond_1

    .line 664
    iget-object v1, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    if-ne v1, p1, :cond_0

    return-object p0

    .line 663
    :cond_0
    invoke-virtual {v0}, Ll/ܳ᩵֨;->֫()Ll/ܳ᩵֨;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(Ll/ᩴۧ֨;)Z
    .locals 1

    .line 568
    sget-object v0, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    invoke-virtual {p0, p1, v0}, Ll/ۤ᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object p1

    check-cast p1, Ll/᩶᩵֨;

    invoke-virtual {p1}, Ll/᩶᩵֨;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/ۤܶ۠;)I
    .locals 5

    .line 546
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 547
    iget v1, p0, Ll/ۤ᩵֨;->ᩳ:I

    and-int v2, v0, v1

    shr-int/lit8 v3, v0, 0x10

    add-int/2addr v0, v3

    shl-int/lit8 v0, v0, 0x1

    sub-int/2addr v1, v0

    const/4 v0, -0x1

    .line 553
    :goto_0
    iget-object v3, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    aget-object v3, v3, v2

    if-nez v3, :cond_0

    if-ltz v0, :cond_2

    return v0

    .line 556
    :cond_0
    sget-object v4, Ll/ۤ᩵֨;->ۢ:Ll/ܳ᩵֨;

    if-ne v3, v4, :cond_1

    if-gez v0, :cond_3

    move v0, v2

    goto :goto_1

    .line 561
    :cond_1
    iget-object v3, v3, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-ne v3, p1, :cond_3

    :cond_2
    return v2

    :cond_3
    :goto_1
    add-int/2addr v2, v1

    .line 563
    iget v3, p0, Ll/ۤ᩵֨;->ᩳ:I

    and-int/2addr v2, v3

    goto :goto_0
.end method

.method public ۧ()Ll/ܰ᩵֨;
    .locals 5

    .line 386
    iget v0, p0, Ll/ۤ᩵֨;->ۜ:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 387
    iget-object v0, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    iget-object v2, p0, Ll/ۤ᩵֨;->ܳ:Ll/ۤ᩵֨;

    iget-object v3, v2, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    if-eq v0, v3, :cond_1

    return-object v2

    .line 388
    :cond_1
    :goto_1
    iget-object v0, p0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    if-eqz v0, :cond_3

    .line 389
    iget-object v0, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p0, v0}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;)I

    move-result v0

    .line 390
    iget-object v3, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    aget-object v3, v3, v0

    .line 391
    iget-object v4, p0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    if-ne v3, v4, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    iget-object v4, v4, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    invoke-static {v4, v3}, Ll/۫ۙ;->֫(Ljava/lang/Object;Z)V

    .line 392
    iget-object v3, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    iget-object v4, p0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    invoke-static {v4}, Ll/ܳ᩵֨;->֫(Ll/ܳ᩵֨;)Ll/ܳ᩵֨;

    move-result-object v4

    aput-object v4, v3, v0

    .line 393
    iget-object v0, p0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    iget-object v0, v0, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    iput-object v0, p0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    goto :goto_1

    .line 395
    :cond_3
    iget v0, v2, Ll/ۤ᩵֨;->ۜ:I

    if-lez v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    .line 396
    iget v0, v2, Ll/ۤ᩵֨;->ۜ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v2, Ll/ۤ᩵֨;->ۜ:I

    .line 397
    iget v0, p0, Ll/ۤ᩵֨;->ܿ:I

    iput v0, v2, Ll/ۤ᩵֨;->ܿ:I

    return-object v2
.end method

.method public final ۧ(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ܳ᩵֨;
    .locals 3

    .line 519
    iget-object v0, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    invoke-virtual {p0, p1}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;)I

    move-result v1

    aget-object v0, v0, v1

    .line 520
    sget-object v1, Ll/ۤ᩵֨;->ۢ:Ll/ܳ᩵֨;

    if-eqz v0, :cond_3

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 522
    :cond_0
    :goto_0
    iget-object v1, v0, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-eqz v1, :cond_2

    iget-object v1, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    iget-object v2, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-ne v2, p1, :cond_1

    if-eqz p2, :cond_2

    invoke-interface {p2, v1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 523
    :cond_1
    invoke-static {v0}, Ll/ܳ᩵֨;->֫(Ll/ܳ᩵֨;)Ll/ܳ᩵֨;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public ۧ(Ll/ۛ֡֨;)Z
    .locals 2

    .line 500
    iget-object v0, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p0, v0}, Ll/ۤ᩵֨;->ܽ(Ll/ۤܶ۠;)Ll/ܳ᩵֨;

    move-result-object v0

    .line 501
    :goto_0
    iget-object v1, v0, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-ne v1, p0, :cond_1

    .line 503
    iget-object v1, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 502
    :cond_0
    invoke-virtual {v0}, Ll/ܳ᩵֨;->֫()Ll/ܳ᩵֨;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public ܳ(Ll/ۛ֡֨;)V
    .locals 4

    .line 490
    iget v0, p0, Ll/ۤ᩵֨;->ۜ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 491
    iget-object v0, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p0, v0}, Ll/ۤ᩵֨;->ܽ(Ll/ۤܶ۠;)Ll/ܳ᩵֨;

    move-result-object v0

    .line 492
    :goto_1
    iget-object v1, v0, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-ne v1, p0, :cond_1

    iget-object v2, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    iget-object v3, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, Ll/ܳ᩵֨;->֫()Ll/ܳ᩵֨;

    move-result-object v0

    goto :goto_1

    :cond_1
    if-eq v1, p0, :cond_2

    .line 493
    invoke-virtual {p0, p1}, Ll/ۤ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    :cond_2
    return-void
.end method

.method public ܽ(Ll/ۛ֡֨;)Ll/ܰ᩵֨;
    .locals 3

    .line 342
    new-instance v0, Ll/ۤ᩵֨;

    iget-object v1, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    iget v2, p0, Ll/ۤ᩵֨;->ܿ:I

    invoke-direct {v0, p0, p1, v1, v2}, Ll/ۤ᩵֨;-><init>(Ll/ۤ᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;I)V

    .line 343
    iget p1, p0, Ll/ۤ᩵֨;->ۜ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۤ᩵֨;->ۜ:I

    return-object v0
.end method

.method public ܽ(Ll/ۤܶ۠;)Ll/ܳ᩵֨;
    .locals 1

    const/4 v0, 0x0

    .line 515
    invoke-virtual {p0, p1, v0}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object p1

    return-object p1
.end method

.method public ܿ(Ll/ۛ֡֨;)V
    .locals 7

    .line 432
    iget v0, p0, Ll/ۤ᩵֨;->ۜ:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 433
    iget v0, p0, Ll/ۤ᩵֨;->ܿ:I

    mul-int/lit8 v0, v0, 0x3

    iget v2, p0, Ll/ۤ᩵֨;->ᩳ:I

    mul-int/lit8 v2, v2, 0x2

    sget-object v3, Ll/ۤ᩵֨;->ۢ:Ll/ܳ᩵֨;

    if-lt v0, v2, :cond_8

    .line 406
    iget v0, p0, Ll/ۤ᩵֨;->ۜ:I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 407
    iget-object v0, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    .line 408
    array-length v2, v0

    mul-int/lit8 v2, v2, 0x2

    new-array v4, v2, [Ll/ܳ᩵֨;

    move-object v5, p0

    :goto_2
    if-eqz v5, :cond_5

    .line 410
    iget-object v6, v5, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    if-ne v6, v0, :cond_4

    if-eq v5, p0, :cond_3

    .line 411
    iget v6, v5, Ll/ۤ᩵֨;->ۜ:I

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    const/4 v6, 0x0

    goto :goto_4

    :cond_3
    :goto_3
    const/4 v6, 0x1

    :goto_4
    invoke-static {v6}, Ll/۫ۙ;->֫(Z)V

    .line 412
    iput-object v4, v5, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    add-int/lit8 v6, v2, -0x1

    .line 413
    iput v6, v5, Ll/ۤ᩵֨;->ᩳ:I

    .line 409
    :cond_4
    iget-object v5, v5, Ll/ۤ᩵֨;->ܳ:Ll/ۤ᩵֨;

    goto :goto_2

    .line 417
    :cond_5
    array-length v2, v0

    :cond_6
    :goto_5
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_7

    .line 418
    aget-object v4, v0, v2

    if-eqz v4, :cond_6

    if-eq v4, v3, :cond_6

    .line 420
    iget-object v5, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    iget-object v6, v4, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    iget-object v6, v6, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p0, v6}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;)I

    move-result v6

    aput-object v4, v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 426
    :cond_7
    iput v1, p0, Ll/ۤ᩵֨;->ܿ:I

    .line 435
    :cond_8
    iget-object v0, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p0, v0}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;)I

    move-result v0

    .line 436
    iget-object v1, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    aget-object v1, v1, v0

    if-nez v1, :cond_9

    .line 439
    iget v1, p0, Ll/ۤ᩵֨;->ܿ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۤ᩵֨;->ܿ:I

    goto :goto_6

    :cond_9
    move-object v3, v1

    .line 441
    :goto_6
    new-instance v1, Ll/ܳ᩵֨;

    iget-object v2, p0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    invoke-direct {v1, p1, v3, v2, p0}, Ll/ܳ᩵֨;-><init>(Ll/ۛ֡֨;Ll/ܳ᩵֨;Ll/ܳ᩵֨;Ll/ۤ᩵֨;)V

    .line 442
    iget-object v2, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    aput-object v1, v2, v0

    .line 443
    iput-object v1, p0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    .line 446
    iget-object v0, p0, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    invoke-virtual {v0, p0, p1}, Ll/ۨ᩵֨;->֫(Ll/۟᩵֨;Ll/ۛ֡֨;)V

    return-void
.end method

.method public ᩳ(Ll/ۛ֡֨;)Ll/ܰ᩵֨;
    .locals 7

    .line 354
    iget v0, p0, Ll/ۤ᩵֨;->ۜ:I

    if-lez v0, :cond_4

    .line 357
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_0

    .line 360
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 361
    iget-object v1, v1, Ll/ۤ᩵֨;->ܳ:Ll/ۤ᩵֨;

    goto :goto_0

    .line 364
    :cond_0
    iget-object v1, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    .line 365
    array-length v2, v1

    new-array v2, v2, [Ll/ܳ᩵֨;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 366
    :goto_1
    array-length v5, v1

    if-ge v3, v5, :cond_3

    .line 367
    aget-object v5, v1, v3

    :goto_2
    if-eqz v5, :cond_1

    .line 368
    sget-object v6, Ll/ۤ᩵֨;->ۢ:Ll/ܳ᩵֨;

    if-eq v5, v6, :cond_1

    iget-object v6, v5, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 369
    invoke-static {v5}, Ll/ܳ᩵֨;->֫(Ll/ܳ᩵֨;)Ll/ܳ᩵֨;

    move-result-object v5

    goto :goto_2

    :cond_1
    if-eqz v5, :cond_2

    add-int/lit8 v4, v4, 0x1

    .line 373
    aput-object v5, v2, v3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 376
    :cond_3
    new-instance v0, Ll/ۤ᩵֨;

    invoke-direct {v0, p0, p1, v2, v4}, Ll/ۤ᩵֨;-><init>(Ll/ۤ᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;I)V

    return-object v0

    .line 378
    :cond_4
    new-instance v0, Ll/ۤ᩵֨;

    iget-object v1, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    invoke-virtual {v1}, [Ll/ܳ᩵֨;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ܳ᩵֨;

    iget v2, p0, Ll/ۤ᩵֨;->ܿ:I

    invoke-direct {v0, p0, p1, v1, v2}, Ll/ۤ᩵֨;-><init>(Ll/ۤ᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;I)V

    return-object v0
.end method

.method public ᩻(Ll/ۛ֡֨;)V
    .locals 5

    .line 452
    iget v0, p0, Ll/ۤ᩵֨;->ۜ:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 453
    iget-object v0, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    new-instance v2, Ll/ۗ᩵֨;

    invoke-direct {v2, p1}, Ll/ۗ᩵֨;-><init>(Ll/ۛ֡֨;)V

    invoke-virtual {p0, v0, v2}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object v0

    .line 454
    iget-object v2, v0, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-nez v2, :cond_1

    return-void

    .line 457
    :cond_1
    iget-object v2, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p0, v2}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;)I

    move-result v2

    .line 458
    iget-object v3, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    aget-object v4, v3, v2

    if-ne v4, v0, :cond_2

    .line 460
    invoke-static {v0}, Ll/ܳ᩵֨;->֫(Ll/ܳ᩵֨;)Ll/ܳ᩵֨;

    move-result-object v4

    aput-object v4, v3, v2

    goto :goto_2

    .line 462
    :cond_2
    :goto_1
    invoke-static {v4}, Ll/ܳ᩵֨;->֫(Ll/ܳ᩵֨;)Ll/ܳ᩵֨;

    move-result-object v2

    if-ne v2, v0, :cond_6

    .line 463
    invoke-static {v0}, Ll/ܳ᩵֨;->֫(Ll/ܳ᩵֨;)Ll/ܳ᩵֨;

    move-result-object v2

    invoke-static {v4, v2}, Ll/ܳ᩵֨;->֫(Ll/ܳ᩵֨;Ll/ܳ᩵֨;)V

    .line 470
    :goto_2
    iget-object v2, p0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    if-ne v2, v0, :cond_3

    .line 471
    iget-object v0, v0, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    iput-object v0, p0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    if-eqz v0, :cond_5

    const/4 v1, 0x0

    .line 473
    iput-object v1, v0, Ll/ܳ᩵֨;->ۧ:Ll/ܳ᩵֨;

    goto :goto_3

    .line 475
    :cond_3
    iget-object v2, v0, Ll/ܳ᩵֨;->ۧ:Ll/ܳ᩵֨;

    if-eqz v2, :cond_4

    const/4 v1, 0x1

    :cond_4
    iget-object v2, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    invoke-static {v2, v1}, Ll/۫ۙ;->֫(Ljava/lang/Object;Z)V

    .line 476
    iget-object v1, v0, Ll/ܳ᩵֨;->ۧ:Ll/ܳ᩵֨;

    iget-object v2, v0, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    iput-object v2, v1, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    .line 477
    iget-object v0, v0, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    if-eqz v0, :cond_5

    .line 478
    iput-object v1, v0, Ll/ܳ᩵֨;->ۧ:Ll/ܳ᩵֨;

    .line 481
    :cond_5
    :goto_3
    iget v0, p0, Ll/ۤ᩵֨;->᩻:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۤ᩵֨;->᩻:I

    .line 484
    iget-object v0, p0, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    invoke-virtual {v0, p0, p1}, Ll/ۨ᩵֨;->ۧ(Ll/۟᩵֨;Ll/ۛ֡֨;)V

    return-void

    .line 466
    :cond_6
    invoke-static {v4}, Ll/ܳ᩵֨;->֫(Ll/ܳ᩵֨;)Ll/ܳ᩵֨;

    move-result-object v4

    goto :goto_1
.end method
