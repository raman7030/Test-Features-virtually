.class public final Ll/ۡۚۧ;
.super Ljava/lang/Object;
.source "H8MM"

# interfaces
.implements Ll/ᩳۚۧ;


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ܽ֨֫;

.field public final synthetic ܽ:Ll/ܺۚۧ;

.field public final ܿ:Landroid/util/SparseArray;

.field public final ᩳ:Landroid/util/SparseIntArray;


# direct methods
.method public constructor <init>(Ll/ܺۚۧ;I)V
    .locals 2

    .line 702
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۚۧ;->ܽ:Ll/ܺۚۧ;

    .line 703
    new-instance p1, Ll/ܽ֨֫;

    const/4 v0, 0x5

    new-array v1, v0, [B

    .line 48
    invoke-direct {p1, v1, v0}, Ll/ܽ֨֫;-><init>([BI)V

    .line 703
    iput-object p1, p0, Ll/ۡۚۧ;->ۧ:Ll/ܽ֨֫;

    .line 704
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/ۡۚۧ;->ܿ:Landroid/util/SparseArray;

    .line 705
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Ll/ۡۚۧ;->ᩳ:Landroid/util/SparseIntArray;

    .line 706
    iput p2, p0, Ll/ۡۚۧ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢ֨֫;Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 719
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    :goto_0
    move-object v1, v0

    goto/16 :goto_11

    .line 726
    :cond_0
    iget-object v2, v0, Ll/ۡۚۧ;->ܽ:Ll/ܺۚۧ;

    invoke-static {v2}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v4, v6, :cond_2

    invoke-static {v2}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;)I

    move-result v4

    if-eq v4, v3, :cond_2

    invoke-static {v2}, Ll/ܺۚۧ;->ܿ(Ll/ܺۚۧ;)I

    move-result v4

    if-ne v4, v6, :cond_1

    goto :goto_1

    .line 729
    :cond_1
    new-instance v4, Ll/ۢ֨֫;

    invoke-static {v2}, Ll/ܺۚۧ;->ܳ(Ll/ܺۚۧ;)Ljava/util/List;

    move-result-object v7

    .line 730
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۢ֨֫;

    invoke-virtual {v7}, Ll/ۢ֨֫;->֫()J

    move-result-wide v7

    invoke-direct {v4, v7, v8}, Ll/ۢ֨֫;-><init>(J)V

    .line 731
    invoke-static {v2}, Ll/ܺۚۧ;->ܳ(Ll/ܺۚۧ;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 727
    :cond_2
    :goto_1
    invoke-static {v2}, Ll/ܺۚۧ;->ܳ(Ll/ܺۚۧ;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢ֨֫;

    .line 735
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v7

    and-int/lit16 v7, v7, 0x80

    if-nez v7, :cond_3

    goto :goto_0

    .line 741
    :cond_3
    invoke-virtual {v1, v6}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 742
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v6

    const/4 v7, 0x3

    .line 747
    invoke-virtual {v1, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 217
    iget-object v8, v0, Ll/ۡۚۧ;->ۧ:Ll/ܽ֨֫;

    iget-object v9, v8, Ll/ܽ֨֫;->ᩳ:[B

    invoke-virtual {v1, v5, v3, v9}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 218
    invoke-virtual {v8, v5}, Ll/ܽ֨֫;->ᩳ(I)V

    .line 751
    invoke-virtual {v8, v7}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v9, 0xd

    .line 752
    invoke-virtual {v8, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    invoke-static {v2, v10}, Ll/ܺۚۧ;->֫(Ll/ܺۚۧ;I)V

    .line 217
    iget-object v10, v8, Ll/ܽ֨֫;->ᩳ:[B

    invoke-virtual {v1, v5, v3, v10}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 218
    invoke-virtual {v8, v5}, Ll/ܽ֨֫;->ᩳ(I)V

    const/4 v10, 0x4

    .line 756
    invoke-virtual {v8, v10}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v11, 0xc

    .line 757
    invoke-virtual {v8, v11}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    .line 760
    invoke-virtual {v1, v12}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 762
    invoke-static {v2}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;)I

    move-result v12

    const/16 v13, 0x2000

    const/16 v14, 0x15

    if-ne v12, v3, :cond_4

    invoke-static {v2}, Ll/ܺۚۧ;->֫(Ll/ܺۚۧ;)Ll/֡ۚۧ;

    move-result-object v3

    if-nez v3, :cond_4

    .line 765
    new-instance v3, Ll/ۘۚۧ;

    const/16 v19, 0x0

    sget-object v20, Ll/ۘ֨֫;->ܿ:[B

    const/16 v16, 0x15

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v15, v3

    invoke-direct/range {v15 .. v20}, Ll/ۘۚۧ;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    .line 767
    invoke-static {v2}, Ll/ܺۚۧ;->ᩳ(Ll/ܺۚۧ;)Ll/ᩴۚۧ;

    move-result-object v12

    check-cast v12, Ll/᩷֡ۧ;

    invoke-virtual {v12, v14, v3}, Ll/᩷֡ۧ;->֫(ILl/ۘۚۧ;)Ll/֡ۚۧ;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ܺۚۧ;->֫(Ll/ܺۚۧ;Ll/֡ۚۧ;)V

    .line 768
    invoke-static {v2}, Ll/ܺۚۧ;->֫(Ll/ܺۚۧ;)Ll/֡ۚۧ;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 769
    invoke-static {v2}, Ll/ܺۚۧ;->֫(Ll/ܺۚۧ;)Ll/֡ۚۧ;

    move-result-object v3

    invoke-static {v2}, Ll/ܺۚۧ;->ܽ(Ll/ܺۚۧ;)Ll/᩸᩷ۧ;

    move-result-object v12

    new-instance v15, Ll/᩵ۚۧ;

    invoke-direct {v15, v6, v14, v13}, Ll/᩵ۚۧ;-><init>(III)V

    invoke-interface {v3, v4, v12, v15}, Ll/֡ۚۧ;->֫(Ll/ۢ֨֫;Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    .line 776
    :cond_4
    iget-object v3, v0, Ll/ۡۚۧ;->ܿ:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    .line 777
    iget-object v12, v0, Ll/ۡۚۧ;->ᩳ:Landroid/util/SparseIntArray;

    invoke-virtual {v12}, Landroid/util/SparseIntArray;->clear()V

    .line 778
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v13

    :goto_3
    if-lez v13, :cond_1d

    .line 217
    iget-object v14, v8, Ll/ܽ֨֫;->ᩳ:[B

    const/4 v15, 0x5

    invoke-virtual {v1, v5, v15, v14}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 218
    invoke-virtual {v8, v5}, Ll/ܽ֨֫;->ᩳ(I)V

    const/16 v5, 0x8

    .line 781
    invoke-virtual {v8, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    .line 782
    invoke-virtual {v8, v7}, Ll/ܽ֨֫;->ܿ(I)V

    .line 783
    invoke-virtual {v8, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v7

    .line 784
    invoke-virtual {v8, v10}, Ll/ܽ֨֫;->ܿ(I)V

    .line 785
    invoke-virtual {v8, v11}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 852
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v10

    add-int v11, v10, v9

    const/4 v14, 0x0

    const/16 v16, -0x1

    const/16 v17, 0x0

    move-object/from16 v20, v14

    move-object/from16 v22, v20

    const/16 v21, 0x0

    .line 858
    :goto_4
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v14

    if-ge v14, v11, :cond_15

    .line 859
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v14

    .line 860
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v17

    .line 861
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v18

    move-object/from16 v24, v8

    add-int v8, v18, v17

    if-le v8, v11, :cond_5

    move-object/from16 v17, v4

    move/from16 v25, v6

    goto/16 :goto_9

    :cond_5
    if-ne v14, v15, :cond_9

    .line 867
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v14

    const-wide/32 v17, 0x41432d33

    cmp-long v19, v14, v17

    if-nez v19, :cond_6

    const/16 v16, 0x81

    goto/16 :goto_6

    :cond_6
    const-wide/32 v17, 0x45414333

    cmp-long v19, v14, v17

    if-nez v19, :cond_7

    const/16 v16, 0x87

    goto/16 :goto_6

    :cond_7
    const-wide/32 v17, 0x41432d34

    cmp-long v19, v14, v17

    if-nez v19, :cond_8

    goto :goto_5

    :cond_8
    const-wide/32 v17, 0x48455643

    cmp-long v19, v14, v17

    if-nez v19, :cond_10

    const/16 v16, 0x24

    goto :goto_6

    :cond_9
    const/16 v15, 0x6a

    if-ne v14, v15, :cond_a

    const/16 v14, 0x81

    move-object/from16 v17, v4

    move/from16 v25, v6

    const/16 v16, 0x81

    goto/16 :goto_8

    :cond_a
    const/16 v15, 0x7a

    if-ne v14, v15, :cond_b

    const/16 v14, 0x87

    move-object/from16 v17, v4

    move/from16 v25, v6

    const/16 v16, 0x87

    goto/16 :goto_8

    :cond_b
    const/16 v15, 0x7f

    if-ne v14, v15, :cond_e

    .line 883
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v14

    const/16 v15, 0x15

    if-ne v14, v15, :cond_c

    :goto_5
    const/16 v16, 0xac

    goto :goto_6

    :cond_c
    const/16 v15, 0xe

    if-ne v14, v15, :cond_d

    const/16 v16, 0x88

    goto :goto_6

    :cond_d
    const/16 v15, 0x21

    if-ne v14, v15, :cond_10

    const/16 v16, 0x8b

    goto :goto_6

    :cond_e
    const/16 v15, 0x7b

    if-ne v14, v15, :cond_f

    const/16 v14, 0x8a

    move-object/from16 v17, v4

    move/from16 v25, v6

    const/16 v16, 0x8a

    goto :goto_8

    :cond_f
    const/16 v15, 0xa

    if-ne v14, v15, :cond_11

    .line 510
    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v15, 0x3

    invoke-virtual {v1, v15, v14}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v14

    .line 897
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v20

    .line 898
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v21

    :cond_10
    :goto_6
    move-object/from16 v17, v4

    move/from16 v25, v6

    goto :goto_8

    :cond_11
    const/16 v15, 0x59

    if-ne v14, v15, :cond_13

    .line 901
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 902
    :goto_7
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v15

    if-ge v15, v8, :cond_12

    .line 510
    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v0, 0x3

    invoke-virtual {v1, v0, v15}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    .line 903
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 904
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    const/4 v15, 0x4

    move-object/from16 v17, v4

    new-array v4, v15, [B

    move/from16 v25, v6

    const/4 v6, 0x0

    .line 906
    invoke-virtual {v1, v6, v15, v4}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 907
    new-instance v6, Ll/ۖۚۧ;

    invoke-direct {v6, v0, v4}, Ll/ۖۚۧ;-><init>(Ljava/lang/String;[B)V

    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object/from16 v4, v17

    move/from16 v6, v25

    goto :goto_7

    :cond_12
    move-object/from16 v17, v4

    move/from16 v25, v6

    const/16 v0, 0x59

    move-object/from16 v22, v14

    const/16 v16, 0x59

    goto :goto_8

    :cond_13
    move-object/from16 v17, v4

    move/from16 v25, v6

    const/16 v0, 0x6f

    if-ne v14, v0, :cond_14

    const/16 v0, 0x101

    const/16 v16, 0x101

    .line 914
    :cond_14
    :goto_8
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    sub-int/2addr v8, v0

    invoke-virtual {v1, v8}, Ll/ᩳ֨֫;->ܳ(I)V

    const/4 v15, 0x5

    move-object/from16 v0, p0

    move-object/from16 v4, v17

    move-object/from16 v8, v24

    move/from16 v6, v25

    goto/16 :goto_4

    :cond_15
    move-object/from16 v17, v4

    move/from16 v25, v6

    move-object/from16 v24, v8

    .line 916
    :goto_9
    invoke-virtual {v1, v11}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 917
    new-instance v0, Ll/ۘۚۧ;

    .line 922
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    invoke-static {v4, v10, v11}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v23

    move-object/from16 v18, v0

    move/from16 v19, v16

    invoke-direct/range {v18 .. v23}, Ll/ۘۚۧ;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    const/4 v4, 0x6

    if-eq v5, v4, :cond_16

    const/4 v4, 0x5

    if-ne v5, v4, :cond_17

    :cond_16
    move/from16 v5, v16

    :cond_17
    add-int/lit8 v9, v9, 0x5

    sub-int/2addr v13, v9

    .line 792
    invoke-static {v2}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;)I

    move-result v4

    const/4 v6, 0x2

    if-ne v4, v6, :cond_18

    move v4, v5

    goto :goto_a

    :cond_18
    move v4, v7

    .line 793
    :goto_a
    invoke-static {v2}, Ll/ܺۚۧ;->᩻(Ll/ܺۚۧ;)Landroid/util/SparseBooleanArray;

    move-result-object v8

    invoke-virtual {v8, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v8

    if-eqz v8, :cond_19

    goto :goto_c

    .line 799
    :cond_19
    invoke-static {v2}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;)I

    move-result v8

    const/16 v9, 0x15

    if-ne v8, v6, :cond_1a

    if-ne v5, v9, :cond_1a

    .line 800
    invoke-static {v2}, Ll/ܺۚۧ;->֫(Ll/ܺۚۧ;)Ll/֡ۚۧ;

    move-result-object v0

    goto :goto_b

    .line 801
    :cond_1a
    invoke-static {v2}, Ll/ܺۚۧ;->ᩳ(Ll/ܺۚۧ;)Ll/ᩴۚۧ;

    move-result-object v8

    check-cast v8, Ll/᩷֡ۧ;

    invoke-virtual {v8, v5, v0}, Ll/᩷֡ۧ;->֫(ILl/ۘۚۧ;)Ll/֡ۚۧ;

    move-result-object v0

    .line 802
    :goto_b
    invoke-static {v2}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;)I

    move-result v5

    if-ne v5, v6, :cond_1b

    const/16 v5, 0x2000

    .line 803
    invoke-virtual {v12, v4, v5}, Landroid/util/SparseIntArray;->get(II)I

    move-result v5

    if-ge v7, v5, :cond_1c

    .line 804
    :cond_1b
    invoke-virtual {v12, v4, v7}, Landroid/util/SparseIntArray;->put(II)V

    .line 805
    invoke-virtual {v3, v4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1c
    :goto_c
    const/4 v5, 0x0

    const/4 v7, 0x3

    const/16 v9, 0xd

    const/4 v10, 0x4

    const/16 v11, 0xc

    move-object/from16 v0, p0

    move-object/from16 v4, v17

    move-object/from16 v8, v24

    move/from16 v6, v25

    goto/16 :goto_3

    :cond_1d
    move-object/from16 v17, v4

    move/from16 v25, v6

    .line 809
    invoke-virtual {v12}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_d
    if-ge v1, v0, :cond_20

    .line 811
    invoke-virtual {v12, v1}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v4

    .line 812
    invoke-virtual {v12, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v5

    .line 813
    invoke-static {v2}, Ll/ܺۚۧ;->᩻(Ll/ܺۚۧ;)Landroid/util/SparseBooleanArray;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {v6, v4, v7}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 814
    invoke-static {v2}, Ll/ܺۚۧ;->ۜ(Ll/ܺۚۧ;)Landroid/util/SparseBooleanArray;

    move-result-object v6

    invoke-virtual {v6, v5, v7}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 815
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ۚۧ;

    if-eqz v6, :cond_1f

    .line 817
    invoke-static {v2}, Ll/ܺۚۧ;->֫(Ll/ܺۚۧ;)Ll/֡ۚۧ;

    move-result-object v7

    if-eq v6, v7, :cond_1e

    .line 818
    invoke-static {v2}, Ll/ܺۚۧ;->ܽ(Ll/ܺۚۧ;)Ll/᩸᩷ۧ;

    move-result-object v7

    new-instance v8, Ll/᩵ۚۧ;

    const/16 v9, 0x2000

    move/from16 v10, v25

    invoke-direct {v8, v10, v4, v9}, Ll/᩵ۚۧ;-><init>(III)V

    move-object/from16 v4, v17

    invoke-interface {v6, v4, v7, v8}, Ll/֡ۚۧ;->֫(Ll/ۢ֨֫;Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    goto :goto_e

    :cond_1e
    move-object/from16 v4, v17

    move/from16 v10, v25

    .line 823
    :goto_e
    invoke-static {v2}, Ll/ܺۚۧ;->ۢ(Ll/ܺۚۧ;)Landroid/util/SparseArray;

    move-result-object v7

    invoke-virtual {v7, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_f

    :cond_1f
    move-object/from16 v4, v17

    move/from16 v10, v25

    :goto_f
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v17, v4

    move/from16 v25, v10

    goto :goto_d

    .line 827
    :cond_20
    invoke-static {v2}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_22

    .line 828
    invoke-static {v2}, Ll/ܺۚۧ;->᩷(Ll/ܺۚۧ;)Z

    move-result v0

    if-nez v0, :cond_21

    .line 829
    invoke-static {v2}, Ll/ܺۚۧ;->ܽ(Ll/ܺۚۧ;)Ll/᩸᩷ۧ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩸᩷ۧ;->ܳ()V

    const/4 v0, 0x0

    .line 830
    invoke-static {v2, v0}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;I)V

    .line 831
    invoke-static {v2}, Ll/ܺۚۧ;->ۡ(Ll/ܺۚۧ;)V

    return-void

    :cond_21
    move-object/from16 v1, p0

    goto :goto_11

    .line 834
    :cond_22
    invoke-static {v2}, Ll/ܺۚۧ;->ۢ(Ll/ܺۚۧ;)Landroid/util/SparseArray;

    move-result-object v0

    move-object/from16 v1, p0

    iget v3, v1, Ll/ۡۚۧ;->֫:I

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->remove(I)V

    .line 835
    invoke-static {v2}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;)I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_23

    const/4 v0, 0x0

    goto :goto_10

    :cond_23
    invoke-static {v2}, Ll/ܺۚۧ;->ܿ(Ll/ܺۚۧ;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_10
    invoke-static {v2, v0}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;I)V

    .line 836
    invoke-static {v2}, Ll/ܺۚۧ;->ܿ(Ll/ܺۚۧ;)I

    move-result v0

    if-nez v0, :cond_24

    .line 837
    invoke-static {v2}, Ll/ܺۚۧ;->ܽ(Ll/ܺۚۧ;)Ll/᩸᩷ۧ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩸᩷ۧ;->ܳ()V

    .line 838
    invoke-static {v2}, Ll/ܺۚۧ;->ۡ(Ll/ܺۚۧ;)V

    :cond_24
    :goto_11
    return-void
.end method
