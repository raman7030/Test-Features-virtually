.class public final Ll/ܰ֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"

# interfaces
.implements Ll/ۧۚܽ;


# instance fields
.field public final ֫:[I

.field public final ۧ:[I

.field public final ܽ:[I


# direct methods
.method public constructor <init>([I[I[I)V
    .locals 0

    .line 2637
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2638
    iput-object p1, p0, Ll/ܰ֨ܽ;->ܽ:[I

    .line 2639
    iput-object p2, p0, Ll/ܰ֨ܽ;->֫:[I

    .line 2640
    iput-object p3, p0, Ll/ܰ֨ܽ;->ۧ:[I

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Z)Ll/ۧۚܽ;
    .locals 9

    .line 2681
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 2682
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    .line 2683
    aget v0, p0, v1

    aget p0, p0, v2

    filled-new-array {v0, p0}, [I

    move-result-object p0

    goto/16 :goto_3

    .line 2687
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2688
    new-instance p0, Ll/᩺֨ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2691
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 2692
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    invoke-virtual {v3}, [I->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    const/4 v4, 0x1

    .line 2693
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_2

    .line 2694
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [I

    .line 2695
    aget v6, v5, v1

    aget v7, v3, v2

    add-int/lit8 v8, v7, 0x1

    if-gt v6, v8, :cond_1

    .line 2697
    aget v5, v5, v2

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    aput v5, v3, v2

    goto :goto_1

    .line 2699
    :cond_1
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2700
    invoke-virtual {v5}, [I->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 2703
    :cond_2
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2706
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [I

    const/4 v3, 0x0

    .line 2707
    :goto_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    mul-int/lit8 v4, v3, 0x2

    .line 2708
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [I

    aget v5, v5, v1

    aput v5, v0, v4

    add-int/2addr v4, v2

    .line 2709
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [I

    aget v5, v5, v2

    aput v5, v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    move-object p0, v0

    .line 2656
    :goto_3
    array-length v0, p0

    if-ge v2, v0, :cond_4

    .line 2657
    aget v0, p0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v2, v2, 0x2

    goto :goto_3

    .line 2661
    :cond_4
    invoke-static {}, Ll/ܳ۠ܽ;->֫()[I

    move-result-object v0

    invoke-static {v0, p0}, Ll/ܰ֨ܽ;->֫([I[I)[I

    move-result-object v0

    const/high16 v2, 0x10000

    if-lt v1, v2, :cond_5

    .line 2664
    sget-object v3, Ll/ۗ֨ܽ;->֫:[I

    invoke-static {v3, p0}, Ll/ܰ֨ܽ;->֫([I[I)[I

    move-result-object v3

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    if-ge v1, v2, :cond_6

    if-nez p1, :cond_6

    .line 2669
    sget-boolean p1, Ll/ۙ֨ܽ;->֫:Z

    if-nez p1, :cond_6

    .line 2671
    new-instance p1, Ll/ۛ֨ܽ;

    invoke-direct {p1, p0, v0}, Ll/ۛ֨ܽ;-><init>([I[I)V

    return-object p1

    .line 2674
    :cond_6
    new-instance p1, Ll/ܰ֨ܽ;

    invoke-direct {p1, p0, v0, v3}, Ll/ܰ֨ܽ;-><init>([I[I[I)V

    return-object p1
.end method

.method public static ֫(I[I)Z
    .locals 7

    .line 2742
    array-length v0, p1

    div-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-gt v3, v0, :cond_2

    add-int v4, v3, v0

    ushr-int/2addr v4, v1

    mul-int/lit8 v5, v4, 0x2

    .line 2745
    aget v6, p1, v5

    add-int/2addr v5, v1

    .line 2746
    aget v5, p1, v5

    if-ge p0, v6, :cond_0

    add-int/lit8 v0, v4, -0x1

    goto :goto_0

    :cond_0
    if-le p0, v5, :cond_1

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    return v2
.end method

.method public static ֫([II)Z
    .locals 5

    .line 2783
    array-length v0, p0

    const/16 v1, 0x10

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gt v0, v1, :cond_3

    .line 2784
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget v4, p0, v1

    if-ne v4, p1, :cond_0

    return v2

    :cond_0
    if-le v4, p1, :cond_1

    return v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v3

    .line 2790
    :cond_3
    invoke-static {p0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p0

    if-ltz p0, :cond_4

    return v2

    :cond_4
    return v3
.end method

.method public static ֫([I[I)[I
    .locals 7

    const/16 v0, 0x40

    new-array v0, v0, [I

    .line 2720
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget v4, p0, v2

    .line 2722
    invoke-static {v4, p1}, Ll/ܰ֨ܽ;->֫(I[I)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 2726
    :cond_0
    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v5

    .line 2727
    invoke-static {v5, p1}, Ll/ܰ֨ܽ;->֫(I[I)Z

    move-result v6

    if-nez v6, :cond_1

    .line 2728
    invoke-static {v5}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v5

    invoke-static {v5, p1}, Ll/ܰ֨ܽ;->֫(I[I)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 2729
    :cond_1
    array-length v5, v0

    if-ne v3, v5, :cond_2

    mul-int/lit8 v5, v3, 0x2

    .line 2730
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    :cond_2
    add-int/lit8 v5, v3, 0x1

    .line 2732
    aput v4, v0, v3

    move v3, v5

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2735
    :cond_4
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final negate()Ll/۟᩵ܽ;
    .locals 1

    .line 2395
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2374
    invoke-static {p0}, Ll/۟᩵ܽ;->ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Z
    .locals 3

    .line 2761
    iget-object v0, p0, Ll/ܰ֨ܽ;->ܽ:[I

    invoke-static {p1, v0}, Ll/ܰ֨ܽ;->֫(I[I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const/high16 v1, 0x10000

    if-ge p1, v1, :cond_1

    .line 2766
    iget-object v0, p0, Ll/ܰ֨ܽ;->֫:[I

    invoke-static {v0, p1}, Ll/ܰ֨ܽ;->֫([II)Z

    move-result p1

    return p1

    .line 2769
    :cond_1
    iget-object v1, p0, Ll/ܰ֨ܽ;->ۧ:[I

    if-eqz v1, :cond_2

    .line 2770
    invoke-static {v1, p1}, Ll/ܰ֨ܽ;->֫([II)Z

    move-result p1

    return p1

    .line 2773
    :cond_2
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(I)I

    move-result p1

    .line 2774
    invoke-static {p1, v0}, Ll/ܰ֨ܽ;->֫(I[I)Z

    move-result v1

    if-nez v1, :cond_4

    .line 2775
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(I)I

    move-result p1

    invoke-static {p1, v0}, Ll/ܰ֨ܽ;->֫(I[I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    return v2
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
