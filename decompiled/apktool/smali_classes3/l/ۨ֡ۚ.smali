.class public abstract Ll/ۨ֡ۚ;
.super Ljava/lang/Object;
.source "E1HX"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ᩶:Ljava/util/List;


# instance fields
.field public ᩸:Ll/ۨ֡ۚ;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 25
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sput-object v0, Ll/ۨ֡ۚ;->᩶:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private ܽ(I)V
    .locals 3

    .line 549
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ᩳ()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 551
    :cond_0
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v1

    :goto_0
    if-ge p1, v0, :cond_1

    .line 553
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ֡ۚ;

    .line 615
    iput p1, v2, Ll/ۨ֡ۚ;->᩹:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ܽ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 1

    const/16 v0, 0xa

    .line 738
    invoke-interface {p0, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 739
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    invoke-virtual {p2}, Ll/֡֡ۚ;->ᩳ()I

    move-result v0

    mul-int v0, v0, p1

    invoke-virtual {p2}, Ll/֡֡ۚ;->ܿ()I

    move-result p1

    invoke-static {v0, p1}, Ll/᩷֡ۚ;->֫(II)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->clone()Ll/ۨ֡ۚ;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ll/ۨ֡ۚ;
    .locals 7

    const/4 v0, 0x0

    .line 797
    invoke-virtual {p0, v0}, Ll/ۨ֡ۚ;->֫(Ll/ۨ֡ۚ;)Ll/ۨ֡ۚ;

    move-result-object v0

    .line 800
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 801
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 803
    :cond_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 804
    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ֡ۚ;

    .line 806
    invoke-virtual {v2}, Ll/ۨ֡ۚ;->ᩳ()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 808
    invoke-virtual {v2}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v5

    .line 809
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۨ֡ۚ;

    invoke-virtual {v6, v2}, Ll/ۨ֡ۚ;->֫(Ll/ۨ֡ۚ;)Ll/ۨ֡ۚ;

    move-result-object v6

    .line 810
    invoke-interface {v5, v4, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 811
    invoke-virtual {v1, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 734
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۖ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ll/ۨ֡ۚ;
    .locals 1

    .line 284
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    return-object v0
.end method

.method public ֨()Ll/ۨ֡ۚ;
    .locals 2

    move-object v0, p0

    .line 293
    :goto_0
    iget-object v1, v0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 206
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 207
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/ۨ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܺ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 210
    :cond_0
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۨ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ܺ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public final ֫(I)Ll/ۨ֡ۚ;
    .locals 1

    .line 221
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨ֡ۚ;

    return-object p1
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;
    .locals 1

    .line 108
    invoke-static {p0}, Ll/᩺֡ۚ;->֫(Ll/ۨ֡ۚ;)Ll/ۧ֨ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ֨ۚ;->ܿ()Ll/֫֨ۚ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֫֨ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 109
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ܺ֡ۚ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public ֫(Ll/ۨ֡ۚ;)Ll/ۨ֡ۚ;
    .locals 2

    .line 836
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ֡ۚ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 841
    iput-object p1, v0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 842
    :cond_0
    iget v1, p0, Ll/ۨ֡ۚ;->᩹:I

    :goto_0
    iput v1, v0, Ll/ۨ֡ۚ;->᩹:I

    if-nez p1, :cond_1

    .line 844
    instance-of p1, p0, Ll/֨֡ۚ;

    if-nez p1, :cond_1

    .line 845
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۘ()Ll/֨֡ۚ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 847
    invoke-virtual {p1}, Ll/֨֡ۚ;->۬֫()Ll/֨֡ۚ;

    move-result-object p1

    .line 848
    iput-object p1, v0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    .line 849
    invoke-virtual {p1}, Ll/᩶֡ۚ;->ۜ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0

    :catch_0
    move-exception p1

    .line 838
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract ֫()Ll/ܺ֡ۚ;
.end method

.method public final varargs ֫(I[Ll/ۨ֡ۚ;)V
    .locals 7

    .line 503
    invoke-static {p2}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 504
    array-length v0, p2

    if-nez v0, :cond_0

    goto :goto_3

    .line 507
    :cond_0
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 510
    aget-object v2, p2, v1

    invoke-virtual {v2}, Ll/ۨ֡ۚ;->᩵()Ll/ۨ֡ۚ;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 511
    invoke-virtual {v2}, Ll/ۨ֡ۚ;->ᩳ()I

    move-result v3

    array-length v4, p2

    if-ne v3, v4, :cond_7

    .line 513
    invoke-virtual {v2}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v3

    .line 515
    array-length v4, p2

    :goto_0
    add-int/lit8 v5, v4, -0x1

    if-lez v4, :cond_2

    .line 517
    aget-object v4, p2, v5

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-eq v4, v6, :cond_1

    goto :goto_5

    :cond_1
    move v4, v5

    goto :goto_0

    .line 523
    :cond_2
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ᩳ()I

    move-result v3

    if-nez v3, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 524
    :goto_1
    invoke-virtual {v2}, Ll/ۨ֡ۚ;->ܳ()Ll/ۨ֡ۚ;

    .line 525
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 526
    array-length v0, p2

    :goto_2
    add-int/lit8 v2, v0, -0x1

    if-lez v0, :cond_4

    .line 528
    aget-object v0, p2, v2

    iput-object p0, v0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    move v0, v2

    goto :goto_2

    :cond_4
    if-eqz v3, :cond_6

    .line 530
    aget-object p2, p2, v1

    iget p2, p2, Ll/ۨ֡ۚ;->᩹:I

    if-eqz p2, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    return-void

    .line 531
    :cond_6
    :goto_4
    invoke-direct {p0, p1}, Ll/ۨ֡ۚ;->ܽ(I)V

    return-void

    .line 131
    :cond_7
    :goto_5
    array-length v2, p2

    const/4 v3, 0x0

    :goto_6
    if-ge v3, v2, :cond_9

    aget-object v4, p2, v3

    if-eqz v4, :cond_8

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 133
    :cond_8
    new-instance p1, Ll/ܳ֡ۚ;

    const-string p2, "Array must not contain any null objects"

    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 133
    throw p1

    .line 537
    :cond_9
    array-length v2, p2

    :goto_7
    if-ge v1, v2, :cond_b

    aget-object v3, p2, v1

    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    iget-object v4, v3, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-eqz v4, :cond_a

    .line 466
    invoke-virtual {v4, v3}, Ll/ۨ֡ۚ;->ۧ(Ll/ۨ֡ۚ;)V

    .line 467
    :cond_a
    iput-object p0, v3, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 540
    :cond_b
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 541
    invoke-direct {p0, p1}, Ll/ۨ֡ۚ;->ܽ(I)V

    return-void
.end method

.method public abstract ֫(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
.end method

.method public final ֫(Ll/ܰ֡ۚ;)V
    .locals 3

    .line 459
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 460
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    iget-object v1, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-ne v1, v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/ܿ֡ۚ;->֫(Z)V

    .line 473
    iget-object v1, p1, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-eqz v1, :cond_1

    .line 474
    invoke-virtual {v1, p1}, Ll/ۨ֡ۚ;->ۧ(Ll/ۨ֡ۚ;)V

    .line 476
    :cond_1
    iget v1, p0, Ll/ۨ֡ۚ;->᩹:I

    .line 477
    invoke-virtual {v0}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 478
    iput-object v0, p1, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    .line 615
    iput v1, p1, Ll/ۨ֡ۚ;->᩹:I

    const/4 p1, 0x0

    .line 480
    iput-object p1, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    return-void
.end method

.method public ۖ()Ljava/lang/String;
    .locals 4

    .line 687
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 693
    new-instance v1, Ll/ۛ֡ۚ;

    .line 22
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۘ()Ll/֨֡ۚ;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    new-instance v2, Ll/֨֡ۚ;

    const-string v3, ""

    invoke-direct {v2, v3}, Ll/֨֡ۚ;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v2}, Ll/֨֡ۚ;->֡֫()Ll/֡֡ۚ;

    move-result-object v2

    .line 693
    invoke-direct {v1, v0, v2}, Ll/ۛ֡ۚ;-><init>(Ljava/lang/Appendable;Ll/֡֡ۚ;)V

    invoke-static {v1, p0}, Ll/᩹ܽܽ;->֫(Ll/ۡ᩹ۚ;Ll/ۨ֡ۚ;)V

    .line 689
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ll/֨֡ۚ;
    .locals 2

    .line 303
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->֨()Ll/ۨ֡ۚ;

    move-result-object v0

    .line 304
    instance-of v1, v0, Ll/֨֡ۚ;

    if-eqz v1, :cond_0

    check-cast v0, Ll/֨֡ۚ;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۚ()V
    .locals 1

    .line 311
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 312
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    invoke-virtual {v0, p0}, Ll/ۨ֡ۚ;->ۧ(Ll/ۨ֡ۚ;)V

    return-void
.end method

.method public abstract ۜ()Ljava/util/List;
.end method

.method public final ۠()I
    .locals 1

    .line 611
    iget v0, p0, Ll/ۨ֡ۚ;->᩹:I

    return v0
.end method

.method public final ۡ()Ll/ۨ֡ۚ;
    .locals 4

    .line 579
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 582
    :cond_0
    invoke-virtual {v0}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v0

    .line 583
    iget v2, p0, Ll/ۨ֡ۚ;->᩹:I

    add-int/lit8 v2, v2, 0x1

    .line 584
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v2, :cond_1

    .line 585
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ֡ۚ;

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final ۢ()Z
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 72
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 73
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܺ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    return-object v0

    :cond_1
    const-string v0, "abs:"

    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public abstract ۧ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
.end method

.method public ۧ(Ll/ۨ֡ۚ;)V
    .locals 2

    .line 484
    iget-object v0, p1, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Z)V

    .line 485
    iget v0, p1, Ll/ۨ֡ۚ;->᩹:I

    .line 486
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 487
    invoke-direct {p0, v0}, Ll/ۨ֡ۚ;->ܽ(I)V

    const/4 v0, 0x0

    .line 488
    iput-object v0, p1, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    return-void
.end method

.method public abstract ܳ()Ll/ۨ֡ۚ;
.end method

.method public final ܶ()Ljava/util/List;
    .locals 3

    .line 563
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-nez v0, :cond_0

    .line 564
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 566
    :cond_0
    invoke-virtual {v0}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v0

    .line 567
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 568
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ֡ۚ;

    if-eq v2, p0, :cond_1

    .line 570
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public abstract ܺ()Ljava/lang/String;
.end method

.method public abstract ܽ()Ljava/lang/String;
.end method

.method public abstract ܽ(Ljava/lang/String;)V
.end method

.method public final ܿ()Ljava/util/List;
    .locals 3

    .line 230
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ᩳ()I

    move-result v0

    if-nez v0, :cond_0

    .line 231
    sget-object v0, Ll/ۨ֡ۚ;->᩶:Ljava/util/List;

    return-object v0

    .line 233
    :cond_0
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object v0

    .line 234
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 235
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 236
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 0

    .line 178
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 179
    invoke-virtual {p0, p1}, Ll/ۨ֡ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public abstract ᩳ()I
.end method

.method public ᩳ(Ljava/lang/String;)Z
    .locals 2

    .line 119
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 120
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "abs:"

    .line 123
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    .line 124
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 125
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܺ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 128
    :cond_1
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܺ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ᩵()Ll/ۨ֡ۚ;
    .locals 1

    .line 276
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    return-object v0
.end method

.method public abstract ᩷()Z
.end method

.method public final ᩹()Ll/֫ۚۚ;
    .locals 1

    const/4 v0, 0x1

    .line 725
    invoke-static {p0, v0}, Ll/֫ۚۚ;->ۧ(Ll/ۨ֡ۚ;Z)Ll/֫ۚۚ;

    move-result-object v0

    return-object v0
.end method
