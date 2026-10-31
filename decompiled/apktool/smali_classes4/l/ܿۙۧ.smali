.class public final Ll/ܿۙۧ;
.super Ljava/lang/Object;
.source "I5WF"


# instance fields
.field public final ֫:Ll/ۧۙۧ;

.field public final ۧ:Z

.field public final ܳ:[I

.field public final ܽ:Ljava/util/ArrayList;

.field public final ܿ:I

.field public final ᩳ:[I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ۧۙۧ;Ljava/util/ArrayList;[I[I)V
    .locals 8

    .line 664
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 665
    iput-object p2, p0, Ll/ܿۙۧ;->ܽ:Ljava/util/ArrayList;

    .line 666
    iput-object p3, p0, Ll/ܿۙۧ;->ܳ:[I

    .line 667
    iput-object p4, p0, Ll/ܿۙۧ;->ᩳ:[I

    const/4 v0, 0x0

    .line 668
    invoke-static {p3, v0}, Ljava/util/Arrays;->fill([II)V

    .line 669
    invoke-static {p4, v0}, Ljava/util/Arrays;->fill([II)V

    .line 670
    iput-object p1, p0, Ll/ܿۙۧ;->֫:Ll/ۧۙۧ;

    .line 671
    invoke-virtual {p1}, Ll/ۧۙۧ;->ۧ()I

    move-result v1

    iput v1, p0, Ll/ܿۙۧ;->᩻:I

    .line 672
    invoke-virtual {p1}, Ll/ۧۙۧ;->֫()I

    move-result v2

    iput v2, p0, Ll/ܿۙۧ;->ܿ:I

    const/4 v3, 0x1

    .line 673
    iput-boolean v3, p0, Ll/ܿۙۧ;->ۧ:Z

    .line 683
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۙۧ;

    :goto_0
    if-eqz v3, :cond_1

    .line 685
    iget v4, v3, Ll/ᩳۙۧ;->ۧ:I

    if-nez v4, :cond_1

    iget v3, v3, Ll/ᩳۙۧ;->ܽ:I

    if-eqz v3, :cond_2

    .line 686
    :cond_1
    new-instance v3, Ll/ᩳۙۧ;

    invoke-direct {v3, v0, v0, v0}, Ll/ᩳۙۧ;-><init>(III)V

    invoke-virtual {p2, v0, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 689
    :cond_2
    new-instance v3, Ll/ᩳۙۧ;

    invoke-direct {v3, v1, v2, v0}, Ll/ᩳۙۧ;-><init>(III)V

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 698
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۙۧ;

    const/4 v2, 0x0

    .line 699
    :goto_1
    iget v3, v1, Ll/ᩳۙۧ;->֫:I

    if-ge v2, v3, :cond_3

    .line 700
    iget v3, v1, Ll/ᩳۙۧ;->ۧ:I

    add-int/2addr v3, v2

    .line 701
    iget v4, v1, Ll/ᩳۙۧ;->ܽ:I

    add-int/2addr v4, v2

    .line 702
    invoke-virtual {p1, v3, v4}, Ll/ۧۙۧ;->֫(II)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v5, 0x2

    :goto_2
    shl-int/lit8 v6, v4, 0x4

    or-int/2addr v6, v5

    .line 704
    aput v6, p3, v3

    shl-int/lit8 v3, v3, 0x4

    or-int/2addr v3, v5

    .line 705
    aput v3, p4, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 709
    :cond_5
    iget-boolean v0, p0, Ll/ܿۙۧ;->ۧ:Z

    if-eqz v0, :cond_b

    .line 719
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۙۧ;

    .line 720
    :goto_4
    iget v3, v2, Ll/ᩳۙۧ;->ۧ:I

    if-ge v1, v3, :cond_a

    .line 721
    aget v3, p3, v1

    if-nez v3, :cond_9

    .line 739
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_5
    if-ge v4, v3, :cond_9

    .line 741
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۙۧ;

    .line 742
    :goto_6
    iget v7, v6, Ll/ᩳۙۧ;->ܽ:I

    if-ge v5, v7, :cond_8

    .line 744
    aget v7, p4, v5

    if-nez v7, :cond_7

    .line 745
    invoke-virtual {p1, v1, v5}, Ll/ۧۙۧ;->ۧ(II)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 748
    invoke-virtual {p1, v1, v5}, Ll/ۧۙۧ;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x8

    goto :goto_7

    :cond_6
    const/4 v3, 0x4

    :goto_7
    shl-int/lit8 v4, v5, 0x4

    or-int/2addr v4, v3

    .line 752
    aput v4, p3, v1

    shl-int/lit8 v4, v1, 0x4

    or-int/2addr v3, v4

    .line 753
    aput v3, p4, v5

    goto :goto_8

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 492
    :cond_8
    iget v5, v6, Ll/ᩳۙۧ;->֫:I

    add-int/2addr v5, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_9
    :goto_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 488
    :cond_a
    iget v1, v2, Ll/ᩳۙۧ;->֫:I

    add-int/2addr v1, v3

    goto :goto_3

    :cond_b
    return-void
.end method

.method public static ֫(Ljava/util/ArrayDeque;IZ)Ll/ܳۙۧ;
    .locals 2

    .line 976
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 977
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 978
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۙۧ;

    .line 979
    iget v1, v0, Ll/ܳۙۧ;->ۧ:I

    if-ne v1, p1, :cond_0

    iget-boolean v1, v0, Ll/ܳۙۧ;->ܽ:Z

    if-ne v1, p2, :cond_0

    .line 981
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 985
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 987
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۙۧ;

    if-eqz p2, :cond_2

    .line 989
    iget v1, p1, Ll/ܳۙۧ;->֫:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p1, Ll/ܳۙۧ;->֫:I

    goto :goto_0

    .line 991
    :cond_2
    iget v1, p1, Ll/ܳۙۧ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Ll/ܳۙۧ;->֫:I

    goto :goto_0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/᩶ۗۧ;)V
    .locals 17

    move-object/from16 v0, p0

    .line 840
    new-instance v1, Ll/۠᩶ۧ;

    move-object/from16 v2, p1

    invoke-direct {v1, v2}, Ll/۠᩶ۧ;-><init>(Ll/᩶ۗۧ;)V

    .line 858
    new-instance v2, Ll/ܶ᩶ۧ;

    invoke-direct {v2, v1}, Ll/ܶ᩶ۧ;-><init>(Ll/۠᩶ۧ;)V

    .line 870
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 877
    iget-object v3, v0, Ll/ܿۙۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    iget v5, v0, Ll/ܿۙۧ;->᩻:I

    iget v6, v0, Ll/ܿۙۧ;->ܿ:I

    move v7, v6

    move v6, v5

    :goto_0
    if-ltz v4, :cond_c

    .line 878
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩳۙۧ;

    .line 488
    iget v9, v8, Ll/ᩳۙۧ;->ۧ:I

    iget v10, v8, Ll/ᩳۙۧ;->ܽ:I

    iget v8, v8, Ll/ᩳۙۧ;->֫:I

    add-int v11, v9, v8

    add-int v12, v10, v8

    .line 884
    :goto_1
    iget-object v13, v0, Ll/ܿۙۧ;->ܳ:[I

    iget-object v14, v0, Ll/ܿۙۧ;->֫:Ll/ۧۙۧ;

    const/4 v15, 0x0

    if-le v6, v11, :cond_4

    add-int/lit8 v6, v6, -0x1

    .line 887
    aget v13, v13, v6

    and-int/lit8 v16, v13, 0xc

    if-eqz v16, :cond_1

    move-object/from16 v16, v3

    shr-int/lit8 v3, v13, 0x4

    .line 891
    invoke-static {v1, v3, v15}, Ll/ܿۙۧ;->֫(Ljava/util/ArrayDeque;IZ)Ll/ܳۙۧ;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 895
    iget v3, v3, Ll/ܳۙۧ;->֫:I

    sub-int v3, v5, v3

    add-int/lit8 v3, v3, -0x1

    .line 896
    invoke-virtual {v2, v6, v3}, Ll/ܶ᩶ۧ;->ۧ(II)V

    and-int/lit8 v13, v13, 0x4

    if-eqz v13, :cond_3

    .line 898
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v13, 0x1

    .line 899
    invoke-virtual {v2, v3, v13}, Ll/ܶ᩶ۧ;->֫(II)V

    goto :goto_3

    :cond_0
    const/4 v3, 0x1

    .line 903
    new-instance v13, Ll/ܳۙۧ;

    sub-int v14, v5, v6

    sub-int/2addr v14, v3

    invoke-direct {v13, v6, v14, v3}, Ll/ܳۙۧ;-><init>(IIZ)V

    invoke-virtual {v1, v13}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_1
    move-object/from16 v16, v3

    .line 92
    iget v3, v2, Ll/ܶ᩶ۧ;->ܽ:I

    const/4 v13, 0x2

    if-ne v3, v13, :cond_2

    iget v3, v2, Ll/ܶ᩶ۧ;->ۧ:I

    if-lt v3, v6, :cond_2

    add-int/lit8 v14, v6, 0x1

    if-gt v3, v14, :cond_2

    .line 94
    iget v3, v2, Ll/ܶ᩶ۧ;->֫:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Ll/ܶ᩶ۧ;->֫:I

    .line 95
    iput v6, v2, Ll/ܶ᩶ۧ;->ۧ:I

    goto :goto_2

    :cond_2
    const/4 v3, 0x1

    .line 98
    invoke-virtual {v2}, Ll/ܶ᩶ۧ;->֫()V

    .line 99
    iput v6, v2, Ll/ܶ᩶ۧ;->ۧ:I

    .line 100
    iput v3, v2, Ll/ܶ᩶ۧ;->֫:I

    .line 101
    iput v13, v2, Ll/ܶ᩶ۧ;->ܽ:I

    :goto_2
    add-int/lit8 v5, v5, -0x1

    :cond_3
    :goto_3
    move-object/from16 v3, v16

    goto :goto_1

    :cond_4
    move-object/from16 v16, v3

    :cond_5
    :goto_4
    if-le v7, v12, :cond_9

    add-int/lit8 v7, v7, -0x1

    .line 918
    iget-object v3, v0, Ll/ܿۙۧ;->ᩳ:[I

    aget v3, v3, v7

    and-int/lit8 v11, v3, 0xc

    if-eqz v11, :cond_7

    shr-int/lit8 v11, v3, 0x4

    const/4 v15, 0x1

    .line 924
    invoke-static {v1, v11, v15}, Ll/ܿۙۧ;->֫(Ljava/util/ArrayDeque;IZ)Ll/ܳۙۧ;

    move-result-object v11

    if-nez v11, :cond_6

    .line 929
    new-instance v3, Ll/ܳۙۧ;

    sub-int v11, v5, v6

    const/4 v15, 0x0

    invoke-direct {v3, v7, v11, v15}, Ll/ܳۙۧ;-><init>(IIZ)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 938
    :cond_6
    iget v11, v11, Ll/ܳۙۧ;->֫:I

    sub-int v11, v5, v11

    add-int/lit8 v11, v11, -0x1

    .line 939
    invoke-virtual {v2, v11, v6}, Ll/ܶ᩶ۧ;->ۧ(II)V

    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_5

    .line 941
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x1

    .line 942
    invoke-virtual {v2, v6, v3}, Ll/ܶ᩶ۧ;->֫(II)V

    goto :goto_4

    .line 78
    :cond_7
    iget v3, v2, Ll/ܶ᩶ۧ;->ܽ:I

    const/4 v11, 0x1

    if-ne v3, v11, :cond_8

    iget v3, v2, Ll/ܶ᩶ۧ;->ۧ:I

    if-lt v6, v3, :cond_8

    iget v11, v2, Ll/ܶ᩶ۧ;->֫:I

    add-int v15, v3, v11

    if-gt v6, v15, :cond_8

    add-int/lit8 v11, v11, 0x1

    .line 80
    iput v11, v2, Ll/ܶ᩶ۧ;->֫:I

    .line 81
    invoke-static {v6, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v2, Ll/ܶ᩶ۧ;->ۧ:I

    goto :goto_5

    .line 84
    :cond_8
    invoke-virtual {v2}, Ll/ܶ᩶ۧ;->֫()V

    .line 85
    iput v6, v2, Ll/ܶ᩶ۧ;->ۧ:I

    const/4 v3, 0x1

    .line 86
    iput v3, v2, Ll/ܶ᩶ۧ;->֫:I

    .line 87
    iput v3, v2, Ll/ܶ᩶ۧ;->ܽ:I

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    move v6, v9

    :goto_6
    if-ge v3, v8, :cond_b

    .line 956
    aget v7, v13, v6

    and-int/lit8 v7, v7, 0xf

    const/4 v11, 0x2

    if-ne v7, v11, :cond_a

    .line 957
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x1

    .line 958
    invoke-virtual {v2, v6, v7}, Ll/ܶ᩶ۧ;->֫(II)V

    :cond_a
    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_b
    add-int/lit8 v4, v4, -0x1

    move v6, v9

    move v7, v10

    move-object/from16 v3, v16

    goto/16 :goto_0

    .line 967
    :cond_c
    invoke-virtual {v2}, Ll/ܶ᩶ۧ;->֫()V

    return-void
.end method
