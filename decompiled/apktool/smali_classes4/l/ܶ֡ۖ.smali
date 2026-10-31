.class public final Ll/ܶ֡ۖ;
.super Ljava/lang/Object;
.source "09OR"

# interfaces
.implements Ll/ۢۚۖ;


# static fields
.field public static final ֡:[I

.field public static final ۚ:Lsun/misc/Unsafe;


# instance fields
.field public final ֫:[I

.field public final ۖ:[Ljava/lang/Object;

.field public final ۘ:I

.field public final ۜ:Z

.field public final ۡ:I

.field public final ۢ:I

.field public final ۧ:I

.field public final ܳ:[I

.field public final ܺ:Ll/᩹֡ۖ;

.field public final ܽ:Ll/ۡ֡ۖ;

.field public final ܿ:Z

.field public final ᩳ:Ll/ܿۘۖ;

.field public final ᩴ:Ll/ܿ֨ۖ;

.field public final ᩵:Z

.field public final ᩷:Ll/ۧ֡ۖ;

.field public final ᩻:Ll/֡᩵ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 73
    sput-object v0, Ll/ܶ֡ۖ;->֡:[I

    .line 93
    invoke-static {}, Ll/᩸֨ۖ;->ܽ()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILl/ۡ֡ۖ;[IIILl/᩹֡ۖ;Ll/֡᩵ۖ;Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۧ֡ۖ;)V
    .locals 0

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    iput-object p1, p0, Ll/ܶ֡ۖ;->֫:[I

    .line 197
    iput-object p2, p0, Ll/ܶ֡ۖ;->ۖ:[Ljava/lang/Object;

    .line 198
    iput p3, p0, Ll/ܶ֡ۖ;->ۡ:I

    .line 199
    iput p4, p0, Ll/ܶ֡ۖ;->ۢ:I

    .line 201
    instance-of p1, p5, Ll/᩸ᩴۖ;

    iput-boolean p1, p0, Ll/ܶ֡ۖ;->ۜ:Z

    const/4 p1, 0x1

    if-eqz p12, :cond_0

    .line 203
    invoke-virtual {p12, p5}, Ll/ܿۘۖ;->֫(Ll/ۡ֡ۖ;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ll/ܶ֡ۖ;->ܿ:Z

    .line 204
    iput-boolean p1, p0, Ll/ܶ֡ۖ;->᩵:Z

    .line 206
    iput-object p6, p0, Ll/ܶ֡ۖ;->ܳ:[I

    .line 207
    iput p7, p0, Ll/ܶ֡ۖ;->ۧ:I

    .line 208
    iput p8, p0, Ll/ܶ֡ۖ;->ۘ:I

    .line 210
    iput-object p9, p0, Ll/ܶ֡ۖ;->ܺ:Ll/᩹֡ۖ;

    .line 211
    iput-object p10, p0, Ll/ܶ֡ۖ;->᩻:Ll/֡᩵ۖ;

    .line 212
    iput-object p11, p0, Ll/ܶ֡ۖ;->ᩴ:Ll/ܿ֨ۖ;

    .line 213
    iput-object p12, p0, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    .line 214
    iput-object p5, p0, Ll/ܶ֡ۖ;->ܽ:Ll/ۡ֡ۖ;

    .line 215
    iput-object p13, p0, Ll/ܶ֡ۖ;->᩷:Ll/ۧ֡ۖ;

    return-void
.end method

.method public static ֫(JLjava/lang/Object;)I
    .locals 0

    .line 4731
    invoke-static {p0, p1, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method private ֫(I)Ll/۫ᩴۖ;
    .locals 1

    .line 3922
    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Ll/ܶ֡ۖ;->ۖ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    check-cast p1, Ll/۫ᩴۖ;

    return-object p1
.end method

.method public static ֫(Ll/ۜ֡ۖ;Ll/᩹֡ۖ;Ll/֡᩵ۖ;Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۧ֡ۖ;)Ll/ܶ֡ۖ;
    .locals 24

    move-object/from16 v0, p0

    .line 226
    instance-of v1, v0, Ll/֫ۚۖ;

    if-nez v1, :cond_17

    .line 236
    check-cast v0, Ll/᩶ۚۖ;

    .line 632
    invoke-virtual {v0}, Ll/᩶ۚۖ;->ܿ()[Ll/ܺۘۖ;

    move-result-object v1

    .line 635
    array-length v2, v1

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    goto :goto_0

    .line 639
    :cond_0
    aget-object v2, v1, v3

    invoke-virtual {v2}, Ll/ܺۘۖ;->᩻()I

    move-result v2

    .line 640
    array-length v3, v1

    add-int/lit8 v3, v3, -0x1

    aget-object v3, v1, v3

    invoke-virtual {v3}, Ll/ܺۘۖ;->᩻()I

    move-result v3

    move v7, v2

    move v8, v3

    .line 643
    :goto_0
    array-length v2, v1

    mul-int/lit8 v3, v2, 0x3

    .line 645
    new-array v5, v3, [I

    mul-int/lit8 v2, v2, 0x2

    .line 646
    new-array v6, v2, [Ljava/lang/Object;

    .line 650
    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_1
    const/16 v10, 0x31

    const/16 v11, 0x12

    if-ge v3, v2, :cond_3

    aget-object v12, v1, v3

    .line 651
    invoke-virtual {v12}, Ll/ܺۘۖ;->getType()Ll/֨ۘۖ;

    move-result-object v13

    sget-object v14, Ll/֨ۘۖ;->᩹֫:Ll/֨ۘۖ;

    if-ne v13, v14, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 653
    :cond_1
    invoke-virtual {v12}, Ll/ܺۘۖ;->getType()Ll/֨ۘۖ;

    move-result-object v13

    invoke-virtual {v13}, Ll/֨ۘۖ;->ۧ()I

    move-result v13

    if-lt v13, v11, :cond_2

    invoke-virtual {v12}, Ll/ܺۘۖ;->getType()Ll/֨ۘۖ;

    move-result-object v11

    invoke-virtual {v11}, Ll/֨ۘۖ;->ۧ()I

    move-result v11

    if-gt v11, v10, :cond_2

    add-int/lit8 v9, v9, 0x1

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    if-lez v4, :cond_4

    .line 659
    new-array v3, v4, [I

    goto :goto_3

    :cond_4
    move-object v3, v2

    :goto_3
    if-lez v9, :cond_5

    .line 660
    new-array v2, v9, [I

    .line 664
    :cond_5
    invoke-virtual {v0}, Ll/᩶ۚۖ;->ᩳ()[I

    move-result-object v4

    .line 665
    sget-object v9, Ll/ܶ֡ۖ;->֡:[I

    if-nez v4, :cond_6

    move-object v4, v9

    :cond_6
    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 671
    :goto_4
    array-length v15, v1

    if-ge v10, v15, :cond_14

    .line 672
    aget-object v15, v1, v10

    move-object/from16 p0, v1

    .line 673
    invoke-virtual {v15}, Ll/ܺۘۖ;->᩻()I

    move-result v1

    .line 740
    invoke-virtual {v15}, Ll/ܺۘۖ;->ۡ()Ll/۬֡ۖ;

    move-result-object v16

    if-eqz v16, :cond_7

    .line 742
    invoke-virtual {v15}, Ll/ܺۘۖ;->getType()Ll/֨ۘۖ;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ll/֨ۘۖ;->ۧ()I

    move-result v17

    add-int/lit8 v17, v17, 0x33

    .line 743
    invoke-virtual/range {v16 .. v16}, Ll/۬֡ۖ;->ۧ()Ljava/lang/reflect/Field;

    move-result-object v18

    move/from16 v19, v8

    move-object/from16 v20, v9

    invoke-static/range {v18 .. v18}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v9, v8

    .line 744
    invoke-virtual/range {v16 .. v16}, Ll/۬֡ۖ;->֫()Ljava/lang/reflect/Field;

    move-result-object v8

    invoke-static {v8}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/reflect/Field;)J

    move-result-wide v21

    move/from16 v16, v10

    move v10, v9

    :goto_5
    move-wide/from16 v8, v21

    goto :goto_7

    :cond_7
    move/from16 v19, v8

    move-object/from16 v20, v9

    .line 747
    invoke-virtual {v15}, Ll/ܺۘۖ;->getType()Ll/֨ۘۖ;

    move-result-object v8

    .line 748
    invoke-virtual {v15}, Ll/ܺۘۖ;->ܿ()Ljava/lang/reflect/Field;

    move-result-object v9

    move/from16 v16, v10

    invoke-static {v9}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/reflect/Field;)J

    move-result-wide v9

    long-to-int v9, v9

    .line 749
    invoke-virtual {v8}, Ll/֨ۘۖ;->ۧ()I

    move-result v17

    .line 750
    invoke-virtual {v8}, Ll/֨ۘۖ;->ܿ()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-virtual {v8}, Ll/֨ۘۖ;->᩻()Z

    move-result v8

    if-nez v8, :cond_9

    .line 751
    invoke-virtual {v15}, Ll/ܺۘۖ;->ܺ()Ljava/lang/reflect/Field;

    move-result-object v8

    if-nez v8, :cond_8

    const v8, 0xfffff

    move v10, v9

    goto :goto_6

    :cond_8
    move v10, v9

    .line 755
    invoke-static {v8}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v8, v8

    .line 757
    :goto_6
    invoke-virtual {v15}, Ll/ܺۘۖ;->ᩴ()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v9

    move/from16 v23, v10

    move v10, v9

    move/from16 v9, v23

    goto :goto_9

    :cond_9
    move v10, v9

    .line 759
    invoke-virtual {v15}, Ll/ܺۘۖ;->֫()Ljava/lang/reflect/Field;

    move-result-object v8

    if-nez v8, :cond_a

    const/4 v9, 0x0

    const/4 v8, 0x0

    goto :goto_8

    .line 763
    :cond_a
    invoke-virtual {v15}, Ll/ܺۘۖ;->֫()Ljava/lang/reflect/Field;

    move-result-object v8

    invoke-static {v8}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/reflect/Field;)J

    move-result-wide v21

    goto :goto_5

    :goto_7
    long-to-int v8, v8

    const/4 v9, 0x0

    :goto_8
    move v9, v10

    const/4 v10, 0x0

    .line 769
    :goto_9
    invoke-virtual {v15}, Ll/ܺۘۖ;->᩻()I

    move-result v18

    aput v18, v5, v11

    add-int/lit8 v18, v11, 0x1

    .line 771
    invoke-virtual {v15}, Ll/ܺۘۖ;->֡()Z

    move-result v21

    if-eqz v21, :cond_b

    const/high16 v21, 0x20000000

    goto :goto_a

    :cond_b
    const/16 v21, 0x0

    .line 772
    :goto_a
    invoke-virtual {v15}, Ll/ܺۘۖ;->ۚ()Z

    move-result v22

    if-eqz v22, :cond_c

    const/high16 v22, 0x10000000

    goto :goto_b

    :cond_c
    const/16 v22, 0x0

    :goto_b
    or-int v21, v21, v22

    shl-int/lit8 v17, v17, 0x14

    or-int v17, v21, v17

    or-int v9, v17, v9

    aput v9, v5, v18

    add-int/lit8 v9, v11, 0x2

    shl-int/lit8 v10, v10, 0x14

    or-int/2addr v8, v10

    .line 775
    aput v8, v5, v9

    .line 777
    invoke-virtual {v15}, Ll/ܺۘۖ;->ۢ()Ljava/lang/Class;

    move-result-object v8

    .line 778
    invoke-virtual {v15}, Ll/ܺۘۖ;->᩷()Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_e

    .line 779
    div-int/lit8 v9, v11, 0x3

    mul-int/lit8 v9, v9, 0x2

    invoke-virtual {v15}, Ll/ܺۘۖ;->᩷()Ljava/lang/Object;

    move-result-object v10

    aput-object v10, v6, v9

    if-eqz v8, :cond_d

    add-int/lit8 v9, v9, 0x1

    .line 781
    aput-object v8, v6, v9

    goto :goto_c

    .line 782
    :cond_d
    invoke-virtual {v15}, Ll/ܺۘۖ;->ۧ()Ll/۫ᩴۖ;

    move-result-object v8

    if-eqz v8, :cond_10

    add-int/lit8 v9, v9, 0x1

    .line 783
    invoke-virtual {v15}, Ll/ܺۘۖ;->ۧ()Ll/۫ᩴۖ;

    move-result-object v8

    aput-object v8, v6, v9

    goto :goto_c

    :cond_e
    if-eqz v8, :cond_f

    .line 787
    div-int/lit8 v9, v11, 0x3

    mul-int/lit8 v9, v9, 0x2

    add-int/lit8 v9, v9, 0x1

    aput-object v8, v6, v9

    goto :goto_c

    .line 788
    :cond_f
    invoke-virtual {v15}, Ll/ܺۘۖ;->ۧ()Ll/۫ᩴۖ;

    move-result-object v8

    if-eqz v8, :cond_10

    .line 789
    div-int/lit8 v8, v11, 0x3

    mul-int/lit8 v8, v8, 0x2

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v15}, Ll/ܺۘۖ;->ۧ()Ll/۫ᩴۖ;

    move-result-object v9

    aput-object v9, v6, v8

    .line 680
    :cond_10
    :goto_c
    array-length v8, v4

    if-ge v12, v8, :cond_11

    aget v8, v4, v12

    if-ne v8, v1, :cond_11

    add-int/lit8 v1, v12, 0x1

    .line 682
    aput v11, v4, v12

    move v12, v1

    .line 685
    :cond_11
    invoke-virtual {v15}, Ll/ܺۘۖ;->getType()Ll/֨ۘۖ;

    move-result-object v1

    sget-object v8, Ll/֨ۘۖ;->᩹֫:Ll/֨ۘۖ;

    if-ne v1, v8, :cond_12

    add-int/lit8 v1, v13, 0x1

    .line 686
    aput v11, v3, v13

    move v13, v1

    goto :goto_d

    .line 687
    :cond_12
    invoke-virtual {v15}, Ll/ܺۘۖ;->getType()Ll/֨ۘۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۘۖ;->ۧ()I

    move-result v1

    const/16 v8, 0x12

    if-lt v1, v8, :cond_13

    invoke-virtual {v15}, Ll/ܺۘۖ;->getType()Ll/֨ۘۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۘۖ;->ۧ()I

    move-result v1

    const/16 v8, 0x31

    if-gt v1, v8, :cond_13

    add-int/lit8 v1, v14, 0x1

    .line 691
    invoke-virtual {v15}, Ll/ܺۘۖ;->ܿ()Ljava/lang/reflect/Field;

    move-result-object v8

    invoke-static {v8}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v9, v8

    aput v9, v2, v14

    move v14, v1

    :cond_13
    :goto_d
    add-int/lit8 v10, v16, 0x1

    add-int/lit8 v11, v11, 0x3

    move-object/from16 v1, p0

    move/from16 v8, v19

    move-object/from16 v9, v20

    goto/16 :goto_4

    :cond_14
    move/from16 v19, v8

    move-object/from16 v20, v9

    if-nez v3, :cond_15

    move-object/from16 v3, v20

    :cond_15
    if-nez v2, :cond_16

    move-object/from16 v2, v20

    .line 703
    :cond_16
    array-length v1, v4

    array-length v8, v3

    add-int/2addr v1, v8

    array-length v8, v2

    add-int/2addr v1, v8

    new-array v10, v1, [I

    .line 705
    array-length v1, v4

    const/4 v8, 0x0

    invoke-static {v4, v8, v10, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 706
    array-length v1, v4

    array-length v9, v3

    invoke-static {v3, v8, v10, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 708
    array-length v1, v4

    array-length v9, v3

    add-int/2addr v1, v9

    array-length v9, v2

    invoke-static {v2, v8, v10, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 715
    new-instance v1, Ll/ܶ֡ۖ;

    .line 720
    invoke-virtual {v0}, Ll/᩶ۚۖ;->ۧ()Ll/ۡ֡ۖ;

    move-result-object v9

    .line 721
    array-length v11, v4

    array-length v0, v4

    array-length v2, v3

    add-int v12, v0, v2

    move-object v4, v1

    move/from16 v8, v19

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move-object/from16 v15, p3

    move-object/from16 v16, p4

    move-object/from16 v17, p5

    invoke-direct/range {v4 .. v17}, Ll/ܶ֡ۖ;-><init>([I[Ljava/lang/Object;IILl/ۡ֡ۖ;[IIILl/᩹֡ۖ;Ll/֡᩵ۖ;Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۧ֡ۖ;)V

    return-object v1

    :cond_17
    const/4 v0, 0x0

    .line 254
    throw v0
.end method

.method private ֫(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1385
    invoke-direct {p0, p1, p3}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1389
    :cond_0
    invoke-direct {p0, p1}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    .line 1392
    sget-object v2, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    invoke-virtual {v2, p3, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 1398
    invoke-direct {p0, p1}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object p3

    .line 1399
    invoke-direct {p0, p1, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 1400
    invoke-static {v3}, Ll/ܶ֡ۖ;->ᩳ(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 1402
    invoke-virtual {v2, p2, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    .line 1405
    :cond_1
    invoke-interface {p3}, Ll/ۢۚۖ;->֫()Ljava/lang/Object;

    move-result-object v4

    .line 1406
    invoke-interface {p3, v4, v3}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1407
    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1409
    :goto_0
    invoke-direct {p0, p1, p2}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    return-void

    .line 1414
    :cond_2
    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    .line 1415
    invoke-static {p1}, Ll/ܶ֡ۖ;->ᩳ(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 1416
    invoke-interface {p3}, Ll/ۢۚۖ;->֫()Ljava/lang/Object;

    move-result-object v4

    .line 1417
    invoke-interface {p3, v4, p1}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1418
    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p1, v4

    .line 1421
    :cond_3
    invoke-interface {p3, p1, v3}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 1394
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Source subfield "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4649
    iget-object v1, p0, Ll/ܶ֡ۖ;->֫:[I

    aget p1, v1, p1

    .line 1395
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static ֫(ILjava/lang/Object;Ll/ۜ۠ۖ;)V
    .locals 1

    .line 4594
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 4595
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p1}, Ll/᩻᩷ۖ;->֫(ILjava/lang/String;)V

    return-void

    .line 4597
    :cond_0
    check-cast p1, Ll/ۛۜۖ;

    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p1}, Ll/᩻᩷ۖ;->֫(ILl/ۛۜۖ;)V

    return-void
.end method

.method private ֫(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    .line 4293
    sget-object v0, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    invoke-direct {p0, p3}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 4294
    invoke-direct {p0, p2, p3, p1}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    return-void
.end method

.method private ֫(Ljava/lang/Object;ILjava/lang/Object;Ll/ܿ֨ۖ;Ljava/lang/Object;)V
    .locals 2

    .line 4649
    iget-object v0, p0, Ll/ܶ֡ۖ;->֫:[I

    aget v0, v0, p2

    .line 4421
    invoke-direct {p0, p2}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    .line 4422
    invoke-static {v0, v1, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 4426
    :cond_0
    invoke-direct {p0, p2}, Ll/ܶ֡ۖ;->֫(I)Ll/۫ᩴۖ;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 4430
    :cond_1
    iget-object v1, p0, Ll/ܶ֡ۖ;->᩷:Ll/ۧ֡ۖ;

    invoke-interface {v1, p1}, Ll/ۧ֡ۖ;->ۧ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    .line 4454
    invoke-direct {p0, p2}, Ll/ܶ֡ۖ;->ۧ(I)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v1, p2}, Ll/ۧ֡ۖ;->֫(Ljava/lang/Object;)V

    .line 4455
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 4456
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 4457
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Ll/۫ᩴۖ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_2

    if-nez p3, :cond_3

    .line 4459
    invoke-virtual {p4, p5}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4462
    :cond_3
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    const/4 p1, 0x0

    .line 91
    throw p1

    :cond_4
    :goto_0
    return-void
.end method

.method private final ֫(Ljava/lang/Object;ILjava/lang/Object;Ll/ᩳۘۖ;Ll/ۧۚۖ;)V
    .locals 3

    .line 4393
    invoke-direct {p0, p2}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result p2

    const p4, 0xfffff

    and-int/2addr p2, p4

    int-to-long v0, p2

    .line 4394
    invoke-static {v0, v1, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 4399
    iget-object p4, p0, Ll/ܶ֡ۖ;->᩷:Ll/ۧ֡ۖ;

    if-eqz p2, :cond_0

    .line 4402
    invoke-interface {p4, p2}, Ll/ۧ֡ۖ;->ܳ(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4404
    invoke-interface {p4, p3}, Ll/ۧ֡ۖ;->ܽ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 4405
    invoke-interface {p4, v2, p2}, Ll/ۧ֡ۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4406
    invoke-static {v0, v1, p1, v2}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, v2

    goto :goto_0

    .line 4400
    :cond_0
    invoke-interface {p4, p3}, Ll/ۧ֡ۖ;->ܽ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 4401
    invoke-static {v0, v1, p1, p2}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 4409
    :cond_1
    :goto_0
    invoke-interface {p4, p2}, Ll/ۧ֡ۖ;->ۧ(Ljava/lang/Object;)Ljava/util/Map;

    .line 4410
    invoke-interface {p4, p3}, Ll/ۧ֡ۖ;->֫(Ljava/lang/Object;)V

    .line 4408
    invoke-interface {p5}, Ll/ۧۚۖ;->ܿ()V

    const/4 p1, 0x0

    throw p1
.end method

.method private ֫(Ljava/lang/Object;ILl/ۧۚۖ;)V
    .locals 2

    const/high16 v0, 0x20000000

    and-int/2addr v0, p2

    const v1, 0xfffff

    if-eqz v0, :cond_0

    and-int/2addr p2, v1

    int-to-long v0, p2

    .line 4604
    invoke-interface {p3}, Ll/ۧۚۖ;->֨()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, v1, p1, p2}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 4605
    :cond_0
    iget-boolean v0, p0, Ll/ܶ֡ۖ;->ۜ:Z

    if-eqz v0, :cond_1

    and-int/2addr p2, v1

    int-to-long v0, p2

    .line 4608
    invoke-interface {p3}, Ll/ۧۚۖ;->ۖ()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, v1, p1, p2}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_1
    and-int/2addr p2, v1

    int-to-long v0, p2

    .line 4612
    invoke-interface {p3}, Ll/ۧۚۖ;->ۜ()Ll/ۛۜۖ;

    move-result-object p2

    invoke-static {v0, v1, p1, p2}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private ֫(IILjava/lang/Object;)Z
    .locals 2

    add-int/lit8 p2, p2, 0x2

    .line 4657
    iget-object v0, p0, Ll/ܶ֡ۖ;->֫:[I

    aget p2, v0, p2

    const v0, 0xfffff

    and-int/2addr p2, v0

    int-to-long v0, p2

    .line 4830
    invoke-static {v0, v1, p3}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result p2

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ֫(ILjava/lang/Object;)Z
    .locals 8

    add-int/lit8 v0, p1, 0x2

    .line 4657
    iget-object v1, p0, Ll/ܶ֡ۖ;->֫:[I

    aget v0, v1, v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    const/4 v6, 0x1

    cmp-long v7, v2, v4

    if-nez v7, :cond_2

    .line 4760
    invoke-direct {p0, p1}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result p1

    and-int v0, p1, v1

    int-to-long v0, v0

    .line 4762
    invoke-static {p1}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result p1

    const-wide/16 v2, 0x0

    packed-switch p1, :pswitch_data_0

    .line 4807
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 4805
    :pswitch_0
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    goto/16 :goto_1

    .line 4803
    :pswitch_1
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    goto/16 :goto_1

    .line 4801
    :pswitch_2
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_1

    .line 4799
    :pswitch_3
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    goto/16 :goto_1

    .line 4797
    :pswitch_4
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_1

    .line 4795
    :pswitch_5
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_1

    .line 4793
    :pswitch_6
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_1

    .line 4791
    :pswitch_7
    sget-object p1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۛۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    .line 4789
    :pswitch_8
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    goto/16 :goto_1

    .line 4780
    :pswitch_9
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 4781
    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 4782
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    goto :goto_0

    .line 4783
    :cond_0
    instance-of p2, p1, Ll/ۛۜۖ;

    if-eqz p2, :cond_1

    .line 4784
    sget-object p2, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    invoke-virtual {p2, p1}, Ll/ۛۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    xor-int/2addr p1, v6

    return p1

    .line 4786
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 4778
    :pswitch_a
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ܿ(JLjava/lang/Object;)Z

    move-result p1

    return p1

    .line 4776
    :pswitch_b
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 4774
    :pswitch_c
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    goto :goto_1

    .line 4772
    :pswitch_d
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 4770
    :pswitch_e
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    goto :goto_1

    .line 4768
    :pswitch_f
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    goto :goto_1

    .line 4766
    :pswitch_10
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->᩻(JLjava/lang/Object;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 4764
    :pswitch_11
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ܳ(JLjava/lang/Object;)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_2
    ushr-int/lit8 p1, v0, 0x14

    shl-int p1, v6, p1

    .line 4811
    invoke-static {v2, v3, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_3

    :goto_1
    return v6

    :cond_3
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ֫(Ljava/lang/Object;IIII)Z
    .locals 1

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    .line 4750
    invoke-direct {p0, p2, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z
    .locals 0

    .line 4744
    invoke-direct {p0, p3, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result p1

    invoke-direct {p0, p3, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ۧ(JLjava/lang/Object;)J
    .locals 0

    .line 4735
    invoke-static {p0, p1, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method private ۧ(I)Ljava/lang/Object;
    .locals 1

    .line 3918
    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Ll/ܶ֡ۖ;->ۖ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method private ۧ(IILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 4271
    invoke-direct {p0, p2}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v0

    .line 4274
    invoke-direct {p0, p1, p2, p3}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 4275
    invoke-interface {v0}, Ll/ۢۚۖ;->֫()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 4279
    :cond_0
    sget-object p1, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    invoke-direct {p0, p2}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result p2

    const v1, 0xfffff

    and-int/2addr p2, v1

    int-to-long v1, p2

    invoke-virtual {p1, p3, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    .line 4280
    invoke-static {p1}, Ll/ܶ֡ۖ;->ᩳ(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    .line 4285
    :cond_1
    invoke-interface {v0}, Ll/ۢۚۖ;->֫()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    .line 4287
    invoke-interface {v0, p2, p1}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method private ۧ(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 4243
    invoke-direct {p0, p1}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v0

    .line 4244
    invoke-direct {p0, p1}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    .line 4247
    invoke-direct {p0, p1, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 4248
    invoke-interface {v0}, Ll/ۢۚۖ;->֫()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 4252
    :cond_0
    sget-object p1, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    .line 4253
    invoke-static {p1}, Ll/ܶ֡ۖ;->ᩳ(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    .line 4258
    :cond_1
    invoke-interface {v0}, Ll/ۢۚۖ;->֫()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    .line 4260
    invoke-interface {v0, p2, p1}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method private ۧ(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 4649
    iget-object v0, p0, Ll/ܶ֡ۖ;->֫:[I

    aget v1, v0, p1

    .line 1426
    invoke-direct {p0, v1, p1, p3}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 1430
    :cond_0
    invoke-direct {p0, p1}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v2, v3

    int-to-long v2, v2

    .line 1431
    sget-object v4, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    invoke-virtual {v4, p3, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 1437
    invoke-direct {p0, p1}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object p3

    .line 1438
    invoke-direct {p0, v1, p1, p2}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1439
    invoke-static {v5}, Ll/ܶ֡ۖ;->ᩳ(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1441
    invoke-virtual {v4, p2, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    .line 1444
    :cond_1
    invoke-interface {p3}, Ll/ۢۚۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 1445
    invoke-interface {p3, v0, v5}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1446
    invoke-virtual {v4, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1448
    :goto_0
    invoke-direct {p0, v1, p1, p2}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    return-void

    .line 1453
    :cond_2
    invoke-virtual {v4, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    .line 1454
    invoke-static {p1}, Ll/ܶ֡ۖ;->ᩳ(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1455
    invoke-interface {p3}, Ll/ۢۚۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 1456
    invoke-interface {p3, v0, p1}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1457
    invoke-virtual {v4, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p1, v0

    .line 1460
    :cond_3
    invoke-interface {p3, p1, v5}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 1433
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Source subfield "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4649
    aget p1, v0, p1

    .line 1434
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private ۧ(Ljava/lang/Object;Ll/ۜ۠ۖ;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    .line 2081
    iget-boolean v1, v0, Ll/ܶ֡ۖ;->ܿ:Z

    iget-object v9, v0, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    if-eqz v1, :cond_0

    .line 2082
    invoke-virtual {v9, v7}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object v1

    .line 2083
    invoke-virtual {v1}, Ll/᩵ۘۖ;->ܿ()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2084
    invoke-virtual {v1}, Ll/᩵ۘۖ;->ۜ()Ljava/util/Iterator;

    move-result-object v1

    .line 2085
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v1, 0x0

    :goto_0
    move-object v10, v1

    .line 2091
    iget-object v11, v0, Ll/ܶ֡ۖ;->֫:[I

    array-length v12, v11

    .line 2092
    sget-object v13, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    const/4 v1, 0x0

    const v3, 0xfffff

    const/4 v4, 0x0

    move-object v15, v0

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v12, :cond_9

    .line 2094
    invoke-direct {v15, v14}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v1

    .line 4649
    aget v6, v11, v14

    .line 2096
    invoke-static {v1}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result v5

    const v16, 0xfffff

    const/16 v0, 0x11

    if-gt v5, v0, :cond_3

    add-int/lit8 v0, v14, 0x2

    .line 2100
    aget v0, v11, v0

    const/16 v17, 0x1

    move-object/from16 v18, v2

    and-int v2, v0, v16

    if-eq v2, v3, :cond_2

    const v3, 0xfffff

    if-ne v2, v3, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_2

    :cond_1
    int-to-long v3, v2

    .line 2112
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    move v4, v3

    :goto_2
    move v3, v2

    :cond_2
    ushr-int/lit8 v0, v0, 0x14

    shl-int v0, v17, v0

    move/from16 v16, v3

    move/from16 v17, v4

    move-object/from16 v22, v18

    move/from16 v18, v0

    move-object/from16 v0, v22

    goto :goto_3

    :cond_3
    move-object/from16 v18, v2

    const/4 v0, 0x0

    move/from16 v16, v3

    move/from16 v17, v4

    move-object/from16 v0, v18

    const/16 v18, 0x0

    :goto_3
    if-eqz v0, :cond_5

    .line 2119
    invoke-virtual {v9, v0}, Ll/ܿۘۖ;->֫(Ljava/util/Map$Entry;)I

    move-result v2

    if-gt v2, v6, :cond_5

    .line 2120
    invoke-virtual {v9, v8, v0}, Ll/ܿۘۖ;->֫(Ll/ۜ۠ۖ;Ljava/util/Map$Entry;)V

    .line 2121
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    goto :goto_3

    :cond_5
    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v3, v1

    packed-switch v5, :pswitch_data_0

    :cond_6
    :goto_4
    move-object/from16 v21, v0

    move-object/from16 v19, v11

    move/from16 v20, v12

    goto/16 :goto_6

    .line 2463
    :pswitch_0
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2465
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v15, v14}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    .line 2464
    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v6, v1, v2}, Ll/᩻᩷ۖ;->֫(ILjava/lang/Object;Ll/ۢۚۖ;)V

    goto :goto_4

    .line 2458
    :pswitch_1
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2459
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v6, v1, v2}, Ll/᩻᩷ۖ;->ᩳ(IJ)V

    goto :goto_4

    .line 2453
    :pswitch_2
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2454
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v6, v1}, Ll/᩻᩷ۖ;->ܿ(II)V

    goto :goto_4

    .line 2448
    :pswitch_3
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2449
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v6, v1, v2}, Ll/᩻᩷ۖ;->ܽ(IJ)V

    goto :goto_4

    .line 2443
    :pswitch_4
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2444
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v6, v1}, Ll/᩻᩷ۖ;->ᩳ(II)V

    goto :goto_4

    .line 2438
    :pswitch_5
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2439
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v6, v1}, Ll/᩻᩷ۖ;->֫(II)V

    goto :goto_4

    .line 2433
    :pswitch_6
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2434
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v6, v1}, Ll/᩻᩷ۖ;->ܳ(II)V

    goto/16 :goto_4

    .line 2428
    :pswitch_7
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2429
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜۖ;

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v6, v1}, Ll/᩻᩷ۖ;->֫(ILl/ۛۜۖ;)V

    goto/16 :goto_4

    .line 2422
    :pswitch_8
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2423
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    .line 2424
    invoke-direct {v15, v14}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v6, v1, v2}, Ll/᩻᩷ۖ;->ۧ(ILjava/lang/Object;Ll/ۢۚۖ;)V

    goto/16 :goto_4

    .line 2417
    :pswitch_9
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2418
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6, v1, v8}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;Ll/ۜ۠ۖ;)V

    goto/16 :goto_4

    .line 2412
    :pswitch_a
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 4739
    invoke-static {v3, v4, v7}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 2413
    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v6, v1}, Ll/᩻᩷ۖ;->֫(IZ)V

    goto/16 :goto_4

    .line 2407
    :pswitch_b
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2408
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v6, v1}, Ll/᩻᩷ۖ;->ۧ(II)V

    goto/16 :goto_4

    .line 2402
    :pswitch_c
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2403
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v6, v1, v2}, Ll/᩻᩷ۖ;->֫(IJ)V

    goto/16 :goto_4

    .line 2397
    :pswitch_d
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2398
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v6, v1}, Ll/᩻᩷ۖ;->ܽ(II)V

    goto/16 :goto_4

    .line 2392
    :pswitch_e
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2393
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v6, v1, v2}, Ll/᩻᩷ۖ;->ܿ(IJ)V

    goto/16 :goto_4

    .line 2387
    :pswitch_f
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2388
    invoke-static {v3, v4, v7}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v6, v1, v2}, Ll/᩻᩷ۖ;->ۧ(IJ)V

    goto/16 :goto_4

    .line 2382
    :pswitch_10
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 4727
    invoke-static {v3, v4, v7}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 2383
    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v1, v6}, Ll/᩻᩷ۖ;->֫(FI)V

    goto/16 :goto_4

    .line 2377
    :pswitch_11
    invoke-direct {v15, v6, v14, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 4723
    invoke-static {v3, v4, v7}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    .line 2378
    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v6, v1, v2}, Ll/᩻᩷ۖ;->֫(ID)V

    goto/16 :goto_4

    .line 2374
    :pswitch_12
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 2938
    invoke-direct {v15, v14}, Ll/ܶ֡ۖ;->ۧ(I)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v15, Ll/ܶ֡ۖ;->᩷:Ll/ۧ֡ۖ;

    invoke-interface {v3, v2}, Ll/ۧ֡ۖ;->֫(Ljava/lang/Object;)V

    .line 2939
    invoke-interface {v3, v1}, Ll/ۧ֡ۖ;->ᩳ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    .line 2936
    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v6, v1}, Ll/᩻᩷ۖ;->֫(ILjava/util/Map;)V

    goto/16 :goto_4

    .line 4649
    :pswitch_13
    aget v1, v11, v14

    .line 2368
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 2370
    invoke-direct {v15, v14}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v3

    .line 2366
    invoke-static {v1, v2, v8, v3}, Ll/ۡۚۖ;->֫(ILjava/util/List;Ll/ۜ۠ۖ;Ll/ۢۚۖ;)V

    goto/16 :goto_4

    .line 4649
    :pswitch_14
    aget v1, v11, v14

    .line 2363
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x1

    .line 2362
    invoke-static {v1, v2, v8, v3}, Ll/ۡۚۖ;->ܺ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_15
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2359
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2358
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۡ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_16
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2355
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2354
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۢ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_17
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2351
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2350
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->᩷(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_18
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2347
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2346
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ܽ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_19
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2343
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2342
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۖ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_1a
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2339
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2338
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->֫(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_1b
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2334
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2333
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ᩳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_1c
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2330
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2329
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ܿ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_1d
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2326
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2325
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->᩻(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_1e
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2322
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2321
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۘ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_1f
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2318
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2317
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۜ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_20
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2314
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2313
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ܳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_21
    const/4 v1, 0x1

    .line 4649
    aget v2, v11, v14

    .line 2310
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2309
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    .line 4649
    :pswitch_22
    aget v1, v11, v14

    .line 2305
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    .line 2304
    invoke-static {v1, v2, v8, v3}, Ll/ۡۚۖ;->ܺ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_23
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2301
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2300
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۡ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_24
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2297
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2296
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۢ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_25
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2293
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2292
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->᩷(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_26
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2289
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2288
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ܽ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_27
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2285
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2284
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۖ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    .line 4649
    :pswitch_28
    aget v1, v11, v14

    .line 2281
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 2280
    sget v3, Ll/ۡۚۖ;->֫:I

    if-eqz v2, :cond_6

    .line 267
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    .line 268
    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v1, v2}, Ll/᩻᩷ۖ;->֫(ILjava/util/List;)V

    goto/16 :goto_4

    .line 4649
    :pswitch_29
    aget v1, v11, v14

    .line 2275
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 2277
    invoke-direct {v15, v14}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v3

    .line 2273
    invoke-static {v1, v2, v8, v3}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;Ll/ۜ۠ۖ;Ll/ۢۚۖ;)V

    goto/16 :goto_4

    .line 4649
    :pswitch_2a
    aget v1, v11, v14

    .line 2270
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 2269
    sget v3, Ll/ۡۚۖ;->֫:I

    if-eqz v2, :cond_6

    .line 260
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    .line 261
    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v1, v2}, Ll/᩻᩷ۖ;->ۧ(ILjava/util/List;)V

    goto/16 :goto_4

    .line 4649
    :pswitch_2b
    aget v1, v11, v14

    .line 2266
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    .line 2265
    invoke-static {v1, v2, v8, v3}, Ll/ۡۚۖ;->֫(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_2c
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2262
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2261
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ᩳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_2d
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2258
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2257
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ܿ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_2e
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2254
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2253
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->᩻(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_2f
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2250
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2249
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۘ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_30
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2246
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2245
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۜ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_31
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2242
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2241
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ܳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_32
    const/4 v1, 0x0

    .line 4649
    aget v2, v11, v14

    .line 2238
    invoke-virtual {v13, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2237
    invoke-static {v2, v3, v8, v1}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_4

    :pswitch_33
    move-object v1, v15

    move-object/from16 v2, p1

    move-wide v4, v3

    move v3, v14

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v4

    move/from16 v4, v16

    move/from16 v5, v17

    move-object/from16 v21, v0

    move v0, v6

    move/from16 v6, v18

    .line 2230
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 2233
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v15, v14}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    .line 2232
    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v0, v1, v2}, Ll/᩻᩷ۖ;->֫(ILjava/lang/Object;Ll/ۢۚۖ;)V

    goto/16 :goto_6

    :pswitch_34
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2224
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2226
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v0, v1, v2}, Ll/᩻᩷ۖ;->ᩳ(IJ)V

    goto/16 :goto_5

    :pswitch_35
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2218
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2220
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v0, v1}, Ll/᩻᩷ۖ;->ܿ(II)V

    goto/16 :goto_5

    :pswitch_36
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2212
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2214
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v0, v1, v2}, Ll/᩻᩷ۖ;->ܽ(IJ)V

    goto/16 :goto_5

    :pswitch_37
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2206
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2208
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v0, v1}, Ll/᩻᩷ۖ;->ᩳ(II)V

    goto/16 :goto_5

    :pswitch_38
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2200
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2202
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v0, v1}, Ll/᩻᩷ۖ;->֫(II)V

    goto/16 :goto_5

    :pswitch_39
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2194
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2196
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v0, v1}, Ll/᩻᩷ۖ;->ܳ(II)V

    goto/16 :goto_5

    :pswitch_3a
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2188
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2190
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜۖ;

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v0, v1}, Ll/᩻᩷ۖ;->֫(ILl/ۛۜۖ;)V

    goto/16 :goto_5

    :pswitch_3b
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2181
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 2183
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    .line 2184
    invoke-direct {v15, v14}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v0, v1, v2}, Ll/᩻᩷ۖ;->ۧ(ILjava/lang/Object;Ll/ۢۚۖ;)V

    goto/16 :goto_6

    :pswitch_3c
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2175
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2177
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1, v8}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;Ll/ۜ۠ۖ;)V

    goto/16 :goto_5

    :pswitch_3d
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2169
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 4719
    invoke-static {v11, v12, v7}, Ll/᩸֨ۖ;->ܿ(JLjava/lang/Object;)Z

    move-result v1

    .line 2171
    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v0, v1}, Ll/᩻᩷ۖ;->֫(IZ)V

    goto/16 :goto_5

    :pswitch_3e
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2163
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2165
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v0, v1}, Ll/᩻᩷ۖ;->ۧ(II)V

    goto/16 :goto_5

    :pswitch_3f
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2157
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2159
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v0, v1, v2}, Ll/᩻᩷ۖ;->֫(IJ)V

    goto/16 :goto_5

    :pswitch_40
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2151
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2153
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v0, v1}, Ll/᩻᩷ۖ;->ܽ(II)V

    goto/16 :goto_5

    :pswitch_41
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2145
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2147
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v0, v1, v2}, Ll/᩻᩷ۖ;->ܿ(IJ)V

    goto :goto_5

    :pswitch_42
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2139
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2141
    invoke-virtual {v13, v7, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v1

    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v0, v1, v2}, Ll/᩻᩷ۖ;->ۧ(IJ)V

    goto :goto_5

    :pswitch_43
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2133
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 4707
    invoke-static {v11, v12, v7}, Ll/᩸֨ۖ;->᩻(JLjava/lang/Object;)F

    move-result v1

    .line 2135
    move-object v2, v8

    check-cast v2, Ll/᩻᩷ۖ;

    invoke-virtual {v2, v1, v0}, Ll/᩻᩷ۖ;->֫(FI)V

    :cond_7
    :goto_5
    move-object/from16 v15, p0

    goto :goto_6

    :pswitch_44
    move-object/from16 v21, v0

    move v0, v6

    move-object/from16 v19, v11

    move/from16 v20, v12

    move-wide v11, v3

    move-object v1, v15

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    .line 2127
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 4703
    invoke-static {v11, v12, v7}, Ll/᩸֨ۖ;->ܳ(JLjava/lang/Object;)D

    move-result-wide v1

    .line 2129
    move-object v3, v8

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v0, v1, v2}, Ll/᩻᩷ۖ;->֫(ID)V

    :cond_8
    :goto_6
    add-int/lit8 v14, v14, 0x3

    move-object/from16 v0, p0

    move/from16 v3, v16

    move/from16 v4, v17

    move-object/from16 v11, v19

    move/from16 v12, v20

    move-object/from16 v2, v21

    goto/16 :goto_1

    :cond_9
    move-object/from16 v18, v2

    :goto_7
    if-eqz v2, :cond_b

    .line 2474
    invoke-virtual {v9, v8, v2}, Ll/ܿۘۖ;->֫(Ll/ۜ۠ۖ;Ljava/util/Map$Entry;)V

    .line 2475
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_7

    :cond_a
    const/4 v2, 0x0

    goto :goto_7

    .line 2945
    :cond_b
    iget-object v0, v15, Ll/ܶ֡ۖ;->ᩴ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, v7}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, v8}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;Ll/ۜ۠ۖ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ܳ(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    .line 4653
    iget-object v0, p0, Ll/ܶ֡ۖ;->֫:[I

    aget p1, v0, p1

    return p1
.end method

.method private ܽ(I)Ll/ۢۚۖ;
    .locals 3

    .line 3907
    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    .line 3908
    iget-object v0, p0, Ll/ܶ֡ۖ;->ۖ:[Ljava/lang/Object;

    aget-object v1, v0, p1

    check-cast v1, Ll/ۢۚۖ;

    if-eqz v1, :cond_0

    return-object v1

    .line 3912
    :cond_0
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object v1

    add-int/lit8 v2, p1, 0x1

    aget-object v2, v0, v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object v1

    .line 3913
    aput-object v1, v0, p1

    return-object v1
.end method

.method private ܽ(IILjava/lang/Object;)V
    .locals 2

    add-int/lit8 p2, p2, 0x2

    .line 4657
    iget-object v0, p0, Ll/ܶ֡ۖ;->֫:[I

    aget p2, v0, p2

    const v0, 0xfffff

    and-int/2addr p2, v0

    int-to-long v0, p2

    .line 4841
    invoke-static {p1, v0, v1, p3}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    return-void
.end method

.method private ܽ(ILjava/lang/Object;)V
    .locals 5

    add-int/lit8 p1, p1, 0x2

    .line 4657
    iget-object v0, p0, Ll/ܶ֡ۖ;->֫:[I

    aget p1, v0, p1

    const v0, 0xfffff

    and-int/2addr v0, p1

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    ushr-int/lit8 p1, p1, 0x14

    const/4 v2, 0x1

    shl-int p1, v2, p1

    .line 4825
    invoke-static {v0, v1, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v2

    or-int/2addr p1, v2

    .line 4822
    invoke-static {p1, v0, v1, p2}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    return-void
.end method

.method private ܽ(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 4266
    sget-object v0, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    invoke-direct {p0, p1}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p2, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 4267
    invoke-direct {p0, p1, p2}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    return-void
.end method

.method public static ܽ(Ljava/lang/Object;)V
    .locals 2

    .line 4697
    invoke-static {p0}, Ll/ܶ֡ۖ;->ᩳ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4698
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Mutating immutable message: "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4698
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܿ(I)I
    .locals 1

    const/high16 v0, 0xff00000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x14

    return p0
.end method

.method public static ᩳ(I)J
    .locals 2

    const v0, 0xfffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static ᩳ(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 4687
    :cond_0
    instance-of v0, p0, Ll/᩸ᩴۖ;

    if-eqz v0, :cond_1

    .line 4688
    check-cast p0, Ll/᩸ᩴۖ;

    invoke-virtual {p0}, Ll/᩸ᩴۖ;->ۧ()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ۘۜۖ;)I
    .locals 21

    .line 1468
    sget-object v0, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    const v1, 0xfffff

    const/4 v2, 0x0

    const v3, 0xfffff

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    .line 1471
    :goto_0
    iget-object v2, v9, Ll/ܶ֡ۖ;->֫:[I

    array-length v5, v2

    if-ge v8, v5, :cond_2e

    .line 1472
    invoke-direct {v9, v8}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v5

    .line 1473
    invoke-static {v5}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result v6

    .line 4649
    aget v12, v2, v8

    add-int/lit8 v7, v8, 0x2

    .line 1477
    aget v2, v2, v7

    and-int v7, v2, v1

    const/16 v13, 0x11

    const/4 v14, 0x1

    if-gt v6, v13, :cond_2

    if-eq v7, v3, :cond_1

    if-ne v7, v1, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    int-to-long v3, v7

    .line 1489
    invoke-virtual {v0, v10, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    move v4, v3

    :goto_1
    move v3, v7

    :cond_1
    ushr-int/lit8 v2, v2, 0x14

    shl-int v2, v14, v2

    move/from16 v16, v2

    move v13, v3

    move v15, v4

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    move v13, v3

    move v15, v4

    const/16 v16, 0x0

    :goto_2
    and-int/2addr v1, v5

    int-to-long v4, v1

    .line 1498
    sget-object v1, Ll/֨ۘۖ;->֫֫:Ll/֨ۘۖ;

    .line 1497
    invoke-virtual {v1}, Ll/֨ۘۖ;->ۧ()I

    move-result v1

    if-lt v6, v1, :cond_3

    sget-object v1, Ll/֨ۘۖ;->ܽۧ:Ll/֨ۘۖ;

    .line 1498
    invoke-virtual {v1}, Ll/֨ۘۖ;->ۧ()I

    move-result v1

    if-gt v6, v1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    const/16 v1, 0x3f

    .line 1502
    iget-boolean v2, v9, Ll/ܶ֡ۖ;->᩵:Z

    packed-switch v6, :pswitch_data_0

    goto :goto_5

    .line 2037
    :pswitch_0
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2041
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    .line 2042
    invoke-direct {v9, v8}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    goto/16 :goto_16

    .line 2032
    :pswitch_1
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2033
    invoke-static {v4, v5, v10}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v2

    .line 544
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v4

    shl-long v5, v2, v14

    shr-long v1, v2, v1

    xor-long/2addr v1, v5

    .line 779
    invoke-static {v1, v2}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v1

    add-int/2addr v1, v4

    :goto_4
    add-int/2addr v11, v1

    :cond_4
    :goto_5
    move v1, v13

    goto/16 :goto_22

    .line 2027
    :pswitch_2
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2028
    invoke-static {v4, v5, v10}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    .line 504
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    shl-int/lit8 v3, v1, 0x1

    shr-int/lit8 v1, v1, 0x1f

    xor-int/2addr v1, v3

    .line 746
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v1

    add-int/2addr v1, v2

    goto/16 :goto_15

    .line 2022
    :pswitch_3
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 560
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v1

    goto/16 :goto_8

    .line 2017
    :pswitch_4
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 520
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v1

    goto/16 :goto_7

    .line 2012
    :pswitch_5
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2013
    invoke-static {v4, v5, v10}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v12, v1}, Ll/ܳ᩷ۖ;->ܿ(II)I

    move-result v1

    goto/16 :goto_15

    .line 2007
    :pswitch_6
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2008
    invoke-static {v4, v5, v10}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v12, v1}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v1

    goto/16 :goto_15

    .line 2000
    :pswitch_7
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2003
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜۖ;

    .line 2002
    invoke-static {v12, v1}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v1

    goto/16 :goto_15

    .line 1994
    :pswitch_8
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1995
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    .line 1996
    invoke-direct {v9, v8}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    sget v3, Ll/ۡۚۖ;->֫:I

    .line 647
    instance-of v3, v1, Ll/ܺ᩵ۖ;

    if-eqz v3, :cond_5

    .line 648
    check-cast v1, Ll/ܺ᩵ۖ;

    invoke-static {v12, v1}, Ll/ܳ᩷ۖ;->֫(ILl/ܺ᩵ۖ;)I

    move-result v1

    goto/16 :goto_15

    .line 650
    :cond_5
    check-cast v1, Ll/ۡ֡ۖ;

    .line 649
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    .line 865
    check-cast v1, Ll/ۘۜۖ;

    invoke-virtual {v1, v2}, Ll/ۘۜۖ;->getSerializedSize(Ll/ۢۚۖ;)I

    move-result v1

    .line 869
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v2

    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v13

    goto/16 :goto_19

    .line 1984
    :pswitch_9
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1985
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    .line 1986
    instance-of v2, v1, Ll/ۛۜۖ;

    if-eqz v2, :cond_6

    .line 1987
    check-cast v1, Ll/ۛۜۖ;

    invoke-static {v12, v1}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v1

    goto :goto_6

    .line 1989
    :cond_6
    check-cast v1, Ljava/lang/String;

    .line 600
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    invoke-static {v1}, Ll/ܳ᩷ۖ;->ۧ(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v1, v2

    :goto_6
    add-int/2addr v1, v11

    move v11, v1

    goto/16 :goto_5

    .line 1979
    :pswitch_a
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1980
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    goto/16 :goto_15

    .line 1974
    :pswitch_b
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1975
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܿ(I)I

    move-result v1

    goto/16 :goto_15

    .line 1969
    :pswitch_c
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 552
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v1

    goto :goto_8

    .line 1964
    :pswitch_d
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1965
    invoke-static {v4, v5, v10}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v12, v1}, Ll/ܳ᩷ۖ;->ܳ(II)I

    move-result v1

    goto/16 :goto_15

    .line 1959
    :pswitch_e
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1960
    invoke-static {v4, v5, v10}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {v12, v1, v2}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v1

    goto/16 :goto_15

    .line 1954
    :pswitch_f
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1955
    invoke-static {v4, v5, v10}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {v12, v1, v2}, Ll/ܳ᩷ۖ;->ܽ(IJ)I

    move-result v1

    goto/16 :goto_15

    .line 1949
    :pswitch_10
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 568
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v1

    :goto_7
    add-int/lit8 v1, v1, 0x4

    goto/16 :goto_15

    .line 1944
    :pswitch_11
    invoke-direct {v9, v12, v8, v10}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 576
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v1

    :goto_8
    move v2, v1

    move v1, v13

    goto/16 :goto_21

    .line 1941
    :pswitch_12
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v9, v8}, Ll/ܶ֡ۖ;->ۧ(I)Ljava/lang/Object;

    move-result-object v2

    .line 1940
    iget-object v3, v9, Ll/ܶ֡ۖ;->᩷:Ll/ۧ֡ۖ;

    invoke-interface {v3, v12, v1, v2}, Ll/ۧ֡ۖ;->֫(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 1934
    :pswitch_13
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1935
    invoke-direct {v9, v8}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    .line 1932
    sget v3, Ll/ۡۚۖ;->֫:I

    .line 713
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_7

    :goto_9
    const/4 v1, 0x0

    goto/16 :goto_4

    :cond_7
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_a
    if-ge v4, v3, :cond_8

    .line 719
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۡ֡ۖ;

    .line 1051
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v7

    mul-int/lit8 v7, v7, 0x2

    .line 1064
    check-cast v6, Ll/ۘۜۖ;

    invoke-virtual {v6, v2}, Ll/ۘۜۖ;->getSerializedSize(Ll/ۢۚۖ;)I

    move-result v6

    add-int/2addr v7, v6

    add-int/2addr v5, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_8
    move v1, v5

    goto/16 :goto_4

    .line 1918
    :pswitch_14
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1917
    invoke-static {v1}, Ll/ۡۚۖ;->ܿ(Ljava/util/List;)I

    move-result v1

    if-lez v1, :cond_4

    if-eqz v2, :cond_9

    int-to-long v2, v7

    .line 1921
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1924
    :cond_9
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1925
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1902
    :pswitch_15
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1901
    invoke-static {v1}, Ll/ۡۚۖ;->ᩳ(Ljava/util/List;)I

    move-result v1

    if-lez v1, :cond_4

    if-eqz v2, :cond_a

    int-to-long v2, v7

    .line 1905
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1908
    :cond_a
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1909
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1886
    :pswitch_16
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1885
    sget v3, Ll/ۡۚۖ;->֫:I

    .line 581
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    if-lez v1, :cond_4

    if-eqz v2, :cond_b

    int-to-long v2, v7

    .line 1889
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1892
    :cond_b
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1893
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1870
    :pswitch_17
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1869
    sget v3, Ll/ۡۚۖ;->֫:I

    .line 563
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    if-lez v1, :cond_4

    if-eqz v2, :cond_c

    int-to-long v2, v7

    .line 1873
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1876
    :cond_c
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1877
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1854
    :pswitch_18
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1853
    invoke-static {v1}, Ll/ۡۚۖ;->֫(Ljava/util/List;)I

    move-result v1

    if-lez v1, :cond_4

    if-eqz v2, :cond_d

    int-to-long v2, v7

    .line 1857
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1860
    :cond_d
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1861
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1838
    :pswitch_19
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1837
    invoke-static {v1}, Ll/ۡۚۖ;->ܳ(Ljava/util/List;)I

    move-result v1

    if-lez v1, :cond_4

    if-eqz v2, :cond_e

    int-to-long v2, v7

    .line 1841
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1844
    :cond_e
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1845
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1822
    :pswitch_1a
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1821
    sget v3, Ll/ۡۚۖ;->֫:I

    .line 600
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_4

    if-eqz v2, :cond_f

    int-to-long v2, v7

    .line 1825
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1828
    :cond_f
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1829
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1806
    :pswitch_1b
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1805
    sget v3, Ll/ۡۚۖ;->֫:I

    .line 563
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    if-lez v1, :cond_4

    if-eqz v2, :cond_10

    int-to-long v2, v7

    .line 1809
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1812
    :cond_10
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1813
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1790
    :pswitch_1c
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1789
    sget v3, Ll/ۡۚۖ;->֫:I

    .line 581
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    if-lez v1, :cond_4

    if-eqz v2, :cond_11

    int-to-long v2, v7

    .line 1793
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1796
    :cond_11
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1797
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1774
    :pswitch_1d
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1773
    invoke-static {v1}, Ll/ۡۚۖ;->ۧ(Ljava/util/List;)I

    move-result v1

    if-lez v1, :cond_4

    if-eqz v2, :cond_12

    int-to-long v2, v7

    .line 1777
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1780
    :cond_12
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1781
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto/16 :goto_b

    .line 1758
    :pswitch_1e
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1757
    invoke-static {v1}, Ll/ۡۚۖ;->᩻(Ljava/util/List;)I

    move-result v1

    if-lez v1, :cond_4

    if-eqz v2, :cond_13

    int-to-long v2, v7

    .line 1761
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1764
    :cond_13
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1765
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto :goto_b

    .line 1742
    :pswitch_1f
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1741
    invoke-static {v1}, Ll/ۡۚۖ;->ܽ(Ljava/util/List;)I

    move-result v1

    if-lez v1, :cond_4

    if-eqz v2, :cond_14

    int-to-long v2, v7

    .line 1745
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1748
    :cond_14
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1749
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto :goto_b

    .line 1726
    :pswitch_20
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1725
    sget v3, Ll/ۡۚۖ;->֫:I

    .line 563
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    if-lez v1, :cond_4

    if-eqz v2, :cond_15

    int-to-long v2, v7

    .line 1729
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1732
    :cond_15
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1733
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    goto :goto_b

    .line 1710
    :pswitch_21
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1709
    sget v3, Ll/ۡۚۖ;->֫:I

    .line 581
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    if-lez v1, :cond_4

    if-eqz v2, :cond_16

    int-to-long v2, v7

    .line 1713
    invoke-virtual {v0, v10, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1716
    :cond_16
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    .line 1717
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    :goto_b
    add-int/2addr v3, v2

    goto/16 :goto_17

    .line 1704
    :pswitch_22
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1703
    sget v2, Ll/ۡۚۖ;->֫:I

    .line 403
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_17

    goto/16 :goto_14

    .line 407
    :cond_17
    invoke-static {v1}, Ll/ۡۚۖ;->ܿ(Ljava/util/List;)I

    move-result v1

    .line 413
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    goto/16 :goto_13

    .line 1699
    :pswitch_23
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1698
    sget v2, Ll/ۡۚۖ;->֫:I

    .line 547
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_18

    goto/16 :goto_14

    .line 552
    :cond_18
    invoke-static {v1}, Ll/ۡۚۖ;->ᩳ(Ljava/util/List;)I

    move-result v1

    .line 558
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    goto/16 :goto_13

    .line 1694
    :pswitch_24
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1693
    invoke-static {v12, v1}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;)I

    move-result v1

    goto/16 :goto_15

    .line 1689
    :pswitch_25
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1688
    invoke-static {v12, v1}, Ll/ۡۚۖ;->֫(ILjava/util/List;)I

    move-result v1

    goto/16 :goto_15

    .line 1684
    :pswitch_26
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1683
    sget v2, Ll/ۡۚۖ;->֫:I

    .line 439
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_19

    goto/16 :goto_14

    .line 443
    :cond_19
    invoke-static {v1}, Ll/ۡۚۖ;->֫(Ljava/util/List;)I

    move-result v1

    .line 449
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    goto/16 :goto_13

    .line 1679
    :pswitch_27
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1678
    sget v2, Ll/ۡۚۖ;->֫:I

    .line 511
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1a

    goto/16 :goto_14

    .line 515
    :cond_1a
    invoke-static {v1}, Ll/ۡۚۖ;->ܳ(Ljava/util/List;)I

    move-result v1

    .line 521
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    goto/16 :goto_13

    .line 1674
    :pswitch_28
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1673
    sget v2, Ll/ۡۚۖ;->֫:I

    .line 689
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1b

    goto/16 :goto_14

    .line 693
    :cond_1b
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    mul-int v3, v3, v2

    const/4 v2, 0x0

    .line 694
    :goto_c
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_27

    .line 695
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۜۖ;

    .line 845
    invoke-virtual {v4}, Ll/ۛۜۖ;->size()I

    move-result v4

    .line 869
    invoke-static {v4}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v5

    add-int/2addr v5, v4

    add-int/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    .line 1669
    :pswitch_29
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-direct {v9, v8}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    .line 1668
    sget v3, Ll/ۡۚۖ;->֫:I

    .line 672
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_1c

    goto/16 :goto_9

    .line 676
    :cond_1c
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v4

    mul-int v4, v4, v3

    const/4 v5, 0x0

    :goto_d
    if-ge v5, v3, :cond_1e

    .line 678
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 679
    instance-of v7, v6, Ll/ܺ᩵ۖ;

    if-eqz v7, :cond_1d

    .line 680
    check-cast v6, Ll/ܺ᩵ۖ;

    .line 840
    invoke-virtual {v6}, Ll/ܺ᩵ۖ;->֫()I

    move-result v6

    goto :goto_e

    .line 682
    :cond_1d
    check-cast v6, Ll/ۡ֡ۖ;

    .line 865
    check-cast v6, Ll/ۘۜۖ;

    invoke-virtual {v6, v2}, Ll/ۘۜۖ;->getSerializedSize(Ll/ۢۚۖ;)I

    move-result v6

    .line 869
    :goto_e
    invoke-static {v6}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v7

    add-int/2addr v7, v6

    add-int/2addr v4, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    :cond_1e
    move v1, v4

    goto/16 :goto_4

    .line 1664
    :pswitch_2a
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    sget v2, Ll/ۡۚۖ;->֫:I

    .line 618
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1f

    goto/16 :goto_14

    .line 622
    :cond_1f
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    mul-int v3, v3, v2

    .line 623
    instance-of v4, v1, Ll/ۘ᩵ۖ;

    if-eqz v4, :cond_21

    .line 624
    check-cast v1, Ll/ۘ᩵ۖ;

    const/4 v4, 0x0

    :goto_f
    if-ge v4, v2, :cond_27

    .line 626
    invoke-interface {v1, v4}, Ll/ۘ᩵ۖ;->᩵(I)Ljava/lang/Object;

    move-result-object v5

    .line 627
    instance-of v6, v5, Ll/ۛۜۖ;

    if-eqz v6, :cond_20

    .line 628
    check-cast v5, Ll/ۛۜۖ;

    .line 845
    invoke-virtual {v5}, Ll/ۛۜۖ;->size()I

    move-result v5

    .line 869
    invoke-static {v5}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v6

    add-int/2addr v6, v5

    add-int/2addr v6, v3

    move v3, v6

    goto :goto_10

    .line 630
    :cond_20
    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ll/ܳ᩷ۖ;->ۧ(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v5, v3

    move v3, v5

    :goto_10
    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    :cond_21
    const/4 v4, 0x0

    :goto_11
    if-ge v4, v2, :cond_27

    .line 635
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 636
    instance-of v6, v5, Ll/ۛۜۖ;

    if-eqz v6, :cond_22

    .line 637
    check-cast v5, Ll/ۛۜۖ;

    .line 845
    invoke-virtual {v5}, Ll/ۛۜۖ;->size()I

    move-result v5

    .line 869
    invoke-static {v5}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v6

    add-int/2addr v6, v5

    add-int/2addr v6, v3

    move v3, v6

    goto :goto_12

    .line 639
    :cond_22
    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ll/ܳ᩷ۖ;->ۧ(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v5, v3

    move v3, v5

    :goto_12
    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    .line 1660
    :pswitch_2b
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1659
    sget v2, Ll/ۡۚۖ;->֫:I

    .line 604
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_23

    goto/16 :goto_9

    .line 613
    :cond_23
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v2

    mul-int v1, v1, v2

    goto/16 :goto_4

    .line 1655
    :pswitch_2c
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1654
    invoke-static {v12, v1}, Ll/ۡۚۖ;->֫(ILjava/util/List;)I

    move-result v1

    goto/16 :goto_15

    .line 1650
    :pswitch_2d
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1649
    invoke-static {v12, v1}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;)I

    move-result v1

    goto :goto_15

    .line 1645
    :pswitch_2e
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1644
    sget v2, Ll/ۡۚۖ;->֫:I

    .line 475
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_24

    goto :goto_14

    .line 479
    :cond_24
    invoke-static {v1}, Ll/ۡۚۖ;->ۧ(Ljava/util/List;)I

    move-result v1

    .line 485
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    goto :goto_13

    .line 1640
    :pswitch_2f
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1639
    sget v2, Ll/ۡۚۖ;->֫:I

    .line 367
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_25

    goto :goto_14

    .line 371
    :cond_25
    invoke-static {v1}, Ll/ۡۚۖ;->᩻(Ljava/util/List;)I

    move-result v1

    .line 377
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    :goto_13
    mul-int v3, v3, v2

    goto/16 :goto_17

    .line 1635
    :pswitch_30
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1634
    sget v2, Ll/ۡۚۖ;->֫:I

    .line 331
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_26

    :goto_14
    const/4 v3, 0x0

    goto :goto_18

    .line 335
    :cond_26
    invoke-static {v1}, Ll/ۡۚۖ;->ܽ(Ljava/util/List;)I

    move-result v2

    .line 341
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    mul-int v3, v3, v1

    add-int/2addr v3, v2

    goto :goto_18

    .line 1630
    :pswitch_31
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1629
    invoke-static {v12, v1}, Ll/ۡۚۖ;->֫(ILjava/util/List;)I

    move-result v1

    goto :goto_15

    .line 1625
    :pswitch_32
    invoke-virtual {v0, v10, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 1624
    invoke-static {v12, v1}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;)I

    move-result v1

    :goto_15
    move v2, v1

    move v1, v13

    goto/16 :goto_1a

    :pswitch_33
    move-object v2, v9

    move-object v3, v10

    move-wide v6, v4

    move v4, v8

    move v5, v13

    move-wide/from16 v17, v6

    move v6, v15

    move/from16 v7, v16

    .line 1613
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v1

    if-eqz v1, :cond_4

    move-wide/from16 v6, v17

    .line 1618
    invoke-virtual {v0, v10, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    .line 1619
    invoke-direct {v9, v8}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    .line 1051
    :goto_16
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    .line 1064
    check-cast v1, Ll/ۘۜۖ;

    invoke-virtual {v1, v2}, Ll/ۘۜۖ;->getSerializedSize(Ll/ۢۚۖ;)I

    move-result v1

    :goto_17
    add-int/2addr v3, v1

    :cond_27
    :goto_18
    add-int/2addr v11, v3

    goto/16 :goto_5

    :pswitch_34
    move-wide v6, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v13

    move-wide/from16 v19, v6

    move v6, v15

    move/from16 v7, v16

    .line 1607
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_28

    move-wide/from16 v6, v19

    .line 1609
    invoke-virtual {v0, v10, v6, v7}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v2

    .line 544
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v4

    shl-long v5, v2, v14

    shr-long v1, v2, v1

    xor-long/2addr v1, v5

    .line 779
    invoke-static {v1, v2}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v1

    add-int/2addr v1, v4

    add-int/2addr v11, v1

    :cond_28
    move v1, v13

    goto/16 :goto_1e

    :pswitch_35
    move-wide v6, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v13

    move v1, v13

    move-wide v13, v6

    move v6, v15

    move/from16 v7, v16

    .line 1601
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 1603
    invoke-virtual {v0, v10, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v2

    .line 504
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    shl-int/lit8 v4, v2, 0x1

    shr-int/lit8 v2, v2, 0x1f

    xor-int/2addr v2, v4

    .line 746
    invoke-static {v2}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v2

    add-int/2addr v2, v3

    goto/16 :goto_1d

    :pswitch_36
    move v1, v13

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1595
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 560
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    goto/16 :goto_1c

    :pswitch_37
    move v1, v13

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1589
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 520
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    goto/16 :goto_1f

    :pswitch_38
    move v1, v13

    move-wide v13, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1583
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 1585
    invoke-virtual {v0, v10, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v12, v2}, Ll/ܳ᩷ۖ;->ܿ(II)I

    move-result v2

    goto/16 :goto_1d

    :pswitch_39
    move v1, v13

    move-wide v13, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1577
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 1579
    invoke-virtual {v0, v10, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v12, v2}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v2

    goto/16 :goto_1d

    :pswitch_3a
    move v1, v13

    move-wide v13, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1570
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 1572
    invoke-virtual {v0, v10, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۜۖ;

    .line 1573
    invoke-static {v12, v2}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v2

    goto/16 :goto_1d

    :pswitch_3b
    move v1, v13

    move-wide v13, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1563
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2d

    .line 1565
    invoke-virtual {v0, v10, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    .line 1566
    invoke-direct {v9, v8}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v3

    sget v4, Ll/ۡۚۖ;->֫:I

    .line 647
    instance-of v4, v2, Ll/ܺ᩵ۖ;

    if-eqz v4, :cond_29

    .line 648
    check-cast v2, Ll/ܺ᩵ۖ;

    invoke-static {v12, v2}, Ll/ܳ᩷ۖ;->֫(ILl/ܺ᩵ۖ;)I

    move-result v2

    goto :goto_1a

    .line 650
    :cond_29
    check-cast v2, Ll/ۡ֡ۖ;

    .line 649
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v4

    .line 865
    check-cast v2, Ll/ۘۜۖ;

    invoke-virtual {v2, v3}, Ll/ۘۜۖ;->getSerializedSize(Ll/ۢۚۖ;)I

    move-result v2

    .line 869
    invoke-static {v2}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    :goto_19
    add-int/2addr v3, v2

    add-int v2, v3, v4

    :goto_1a
    add-int/2addr v11, v2

    goto/16 :goto_22

    :pswitch_3c
    move v1, v13

    move-wide v13, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1552
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 1554
    invoke-virtual {v0, v10, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    .line 1555
    instance-of v3, v2, Ll/ۛۜۖ;

    if-eqz v3, :cond_2a

    .line 1556
    check-cast v2, Ll/ۛۜۖ;

    invoke-static {v12, v2}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v2

    goto :goto_1b

    .line 1558
    :cond_2a
    check-cast v2, Ljava/lang/String;

    .line 600
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v3

    invoke-static {v2}, Ll/ܳ᩷ۖ;->ۧ(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v2, v3

    :goto_1b
    add-int/2addr v11, v2

    goto/16 :goto_1e

    :pswitch_3d
    move v1, v13

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1546
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 1548
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v2

    goto/16 :goto_20

    :pswitch_3e
    move v1, v13

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1540
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 1542
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܿ(I)I

    move-result v2

    goto/16 :goto_20

    :pswitch_3f
    move v1, v13

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1534
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 552
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    :goto_1c
    add-int/lit8 v2, v2, 0x8

    goto/16 :goto_20

    :pswitch_40
    move v1, v13

    move-wide v13, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1528
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 1530
    invoke-virtual {v0, v10, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v12, v2}, Ll/ܳ᩷ۖ;->ܳ(II)I

    move-result v2

    goto :goto_1d

    :pswitch_41
    move v1, v13

    move-wide v13, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1522
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 1524
    invoke-virtual {v0, v10, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {v12, v2, v3}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v2

    goto :goto_1d

    :pswitch_42
    move v1, v13

    move-wide v13, v4

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1516
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 1518
    invoke-virtual {v0, v10, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {v12, v2, v3}, Ll/ܳ᩷ۖ;->ܽ(IJ)I

    move-result v2

    :goto_1d
    add-int/2addr v11, v2

    :cond_2b
    :goto_1e
    move-object/from16 v9, p0

    goto :goto_22

    :pswitch_43
    move v1, v13

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1510
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 568
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    :goto_1f
    add-int/lit8 v2, v2, 0x4

    :goto_20
    add-int/2addr v11, v2

    :cond_2c
    move-object/from16 v9, p0

    move-object/from16 v10, p1

    goto :goto_22

    :pswitch_44
    move v1, v13

    move-object v2, v9

    move-object v3, v10

    move v4, v8

    move v5, v1

    move v6, v15

    move/from16 v7, v16

    .line 1504
    invoke-direct/range {v2 .. v7}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v2

    if-eqz v2, :cond_2d

    .line 576
    invoke-static {v12}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    :goto_21
    add-int/lit8 v2, v2, 0x8

    goto/16 :goto_1a

    :cond_2d
    :goto_22
    add-int/lit8 v8, v8, 0x3

    const v2, 0xfffff

    move v3, v1

    move v4, v15

    const v1, 0xfffff

    goto/16 :goto_0

    .line 2061
    :cond_2e
    iget-object v0, v9, Ll/ܶ֡ۖ;->ᩴ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, v10}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 2062
    invoke-virtual {v0, v1}, Ll/ܿ֨ۖ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v11, v0

    .line 2052
    iget-boolean v0, v9, Ll/ܶ֡ۖ;->ܿ:Z

    if-eqz v0, :cond_2f

    .line 2053
    iget-object v0, v9, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    invoke-virtual {v0, v10}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ۘۖ;->ᩳ()I

    move-result v0

    add-int/2addr v11, v0

    :cond_2f
    return v11

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/᩸ᩴۖ;)I
    .locals 9

    .line 956
    iget-object v0, p0, Ll/ܶ֡ۖ;->֫:[I

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 958
    invoke-direct {p0, v2}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v4

    .line 4649
    aget v5, v0, v2

    const v6, 0xfffff

    and-int/2addr v6, v4

    int-to-long v6, v6

    .line 963
    invoke-static {v4}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result v4

    const/16 v8, 0x25

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_4

    .line 1163
    :pswitch_0
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1164
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    mul-int/lit8 v3, v3, 0x35

    .line 1165
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_3

    .line 1158
    :pswitch_1
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1159
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto/16 :goto_3

    .line 1153
    :pswitch_2
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1154
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_2

    .line 1148
    :pswitch_3
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1149
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto/16 :goto_3

    .line 1143
    :pswitch_4
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1144
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_2

    .line 1138
    :pswitch_5
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1139
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_2

    .line 1133
    :pswitch_6
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1134
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_2

    .line 1128
    :pswitch_7
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1129
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_3

    .line 1122
    :pswitch_8
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1123
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    mul-int/lit8 v3, v3, 0x35

    .line 1124
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_3

    .line 1116
    :pswitch_9
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1118
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    goto/16 :goto_3

    .line 1111
    :pswitch_a
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 4739
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 1112
    invoke-static {v4}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v4

    goto/16 :goto_3

    .line 1106
    :pswitch_b
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1107
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_2

    .line 1101
    :pswitch_c
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1102
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto/16 :goto_3

    .line 1096
    :pswitch_d
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1097
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_2

    .line 1091
    :pswitch_e
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1092
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto/16 :goto_3

    .line 1086
    :pswitch_f
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 1087
    invoke-static {v6, v7, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto/16 :goto_3

    .line 1081
    :pswitch_10
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 4727
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 1082
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto/16 :goto_3

    .line 1074
    :pswitch_11
    invoke-direct {p0, v5, v2, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    mul-int/lit8 v3, v3, 0x35

    .line 4723
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    .line 1077
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto/16 :goto_3

    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    .line 1071
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_3

    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    .line 1068
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_3

    .line 1029
    :pswitch_14
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 1031
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_1

    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    .line 1023
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto/16 :goto_3

    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    .line 1020
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_2

    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    .line 1017
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto/16 :goto_3

    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    .line 1014
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v4

    goto :goto_2

    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    .line 1011
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v4

    goto :goto_2

    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    .line 1008
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v4

    goto :goto_2

    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    .line 1005
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_3

    .line 997
    :pswitch_1c
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 999
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v8

    :cond_0
    :goto_1
    mul-int/lit8 v3, v3, 0x35

    add-int/2addr v3, v8

    goto :goto_4

    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    .line 992
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    goto :goto_3

    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    .line 989
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ܿ(JLjava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v4

    goto :goto_3

    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    .line 986
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v4

    goto :goto_2

    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    .line 983
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto :goto_3

    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    .line 980
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v4

    :goto_2
    add-int/2addr v3, v4

    goto :goto_4

    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    .line 977
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto :goto_3

    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    .line 974
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    goto :goto_3

    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    .line 971
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->᩻(JLjava/lang/Object;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto :goto_3

    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    .line 968
    invoke-static {v6, v7, p1}, Ll/᩸֨ۖ;->ܳ(JLjava/lang/Object;)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    .line 967
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v4

    :goto_3
    add-int/2addr v4, v3

    move v3, v4

    :cond_1
    :goto_4
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v3, v3, 0x35

    .line 1174
    iget-object v0, p0, Ll/ܶ֡ۖ;->ᩴ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    .line 1176
    iget-boolean v1, p0, Ll/ܶ֡ۖ;->ܿ:Z

    if-eqz v1, :cond_3

    mul-int/lit8 v0, v0, 0x35

    .line 1177
    iget-object v1, p0, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    invoke-virtual {v1, p1}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩵ۘۖ;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_3
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 797
    iget-object v0, p0, Ll/ܶ֡ۖ;->ܺ:Ll/᩹֡ۖ;

    iget-object v1, p0, Ll/ܶ֡ۖ;->ܽ:Ll/ۡ֡ۖ;

    invoke-interface {v0, v1}, Ll/᩹֡ۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 8

    .line 4305
    invoke-static {p1}, Ll/ܶ֡ۖ;->ᩳ(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 4311
    :cond_0
    instance-of v0, p1, Ll/᩸ᩴۖ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 4312
    move-object v0, p1

    check-cast v0, Ll/᩸ᩴۖ;

    const v2, 0x7fffffff

    .line 294
    invoke-virtual {v0, v2}, Ll/᩸ᩴۖ;->setMemoizedSerializedSize(I)V

    .line 80
    iput v1, v0, Ll/ۘۜۖ;->memoizedHashCode:I

    .line 4315
    invoke-virtual {v0}, Ll/᩸ᩴۖ;->ܽ()V

    .line 4318
    :cond_1
    iget-object v0, p0, Ll/ܶ֡ۖ;->֫:[I

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_5

    .line 4320
    invoke-direct {p0, v1}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v3

    const v4, 0xfffff

    and-int/2addr v4, v3

    int-to-long v4, v4

    .line 4322
    invoke-static {v3}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result v3

    const/16 v6, 0x9

    if-eq v3, v6, :cond_3

    const/16 v6, 0x3c

    if-eq v3, v6, :cond_2

    const/16 v6, 0x44

    if-eq v3, v6, :cond_2

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 4371
    :pswitch_0
    sget-object v3, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 4373
    iget-object v7, p0, Ll/ܶ֡ۖ;->᩷:Ll/ۧ֡ۖ;

    invoke-interface {v7, v6}, Ll/ۧ֡ۖ;->ܿ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, p1, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    .line 4367
    :pswitch_1
    iget-object v3, p0, Ll/ܶ֡ۖ;->᩻:Ll/֡᩵ۖ;

    invoke-virtual {v3, v4, v5, p1}, Ll/֡᩵ۖ;->֫(JLjava/lang/Object;)V

    goto :goto_1

    .line 4649
    :cond_2
    aget v3, v0, v1

    .line 4331
    invoke-direct {p0, v3, v1, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 4332
    invoke-direct {p0, v1}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v3

    sget-object v6, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    invoke-virtual {v6, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 4325
    :cond_3
    :pswitch_2
    invoke-direct {p0, v1, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 4326
    invoke-direct {p0, v1}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v3

    sget-object v6, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    invoke-virtual {v6, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    .line 4379
    :cond_5
    iget-object v0, p0, Ll/ܶ֡ۖ;->ᩴ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ܿ(Ljava/lang/Object;)V

    .line 4380
    iget-boolean v0, p0, Ll/ܶ֡ۖ;->ܿ:Z

    if-eqz v0, :cond_6

    .line 4381
    iget-object v0, p0, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    invoke-virtual {v0, p1}, Ll/ܿۘۖ;->ܽ(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1185
    invoke-static {p1}, Ll/ܶ֡ۖ;->ܽ(Ljava/lang/Object;)V

    .line 1187
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 1189
    :goto_0
    iget-object v1, p0, Ll/ܶ֡ۖ;->֫:[I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 1202
    invoke-direct {p0, v0}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    int-to-long v3, v3

    .line 4649
    aget v1, v1, v0

    .line 1206
    invoke-static {v2}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_1

    .line 1377
    :pswitch_0
    invoke-direct {p0, v0, p1, p2}, Ll/ܶ֡ۖ;->ۧ(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1371
    :pswitch_1
    invoke-direct {p0, v1, v0, p2}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1372
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v4, p1, v2}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 1373
    invoke-direct {p0, v1, v0, p1}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1362
    :pswitch_2
    invoke-direct {p0, v0, p1, p2}, Ll/ܶ֡ۖ;->ۧ(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1355
    :pswitch_3
    invoke-direct {p0, v1, v0, p2}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1356
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v4, p1, v2}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 1357
    invoke-direct {p0, v1, v0, p1}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1344
    :pswitch_4
    sget v1, Ll/ۡۚۖ;->֫:I

    .line 857
    invoke-static {v3, v4, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 856
    iget-object v5, p0, Ll/ܶ֡ۖ;->᩷:Ll/ۧ֡ۖ;

    invoke-interface {v5, v1, v2}, Ll/ۧ֡ۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 858
    invoke-static {v3, v4, p1, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1341
    :pswitch_5
    iget-object v1, p0, Ll/ܶ֡ۖ;->᩻:Ll/֡᩵ۖ;

    invoke-virtual {v1, v3, v4, p1, p2}, Ll/֡᩵ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1307
    :pswitch_6
    invoke-direct {p0, v0, p1, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1301
    :pswitch_7
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1302
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 1303
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1295
    :pswitch_8
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1296
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v3, v4, p1}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 1297
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1289
    :pswitch_9
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1290
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 1291
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1283
    :pswitch_a
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1284
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v3, v4, p1}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 1285
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1277
    :pswitch_b
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1278
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v3, v4, p1}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 1279
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1271
    :pswitch_c
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1272
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v3, v4, p1}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 1273
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1265
    :pswitch_d
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1266
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v4, p1, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 1267
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1262
    :pswitch_e
    invoke-direct {p0, v0, p1, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1256
    :pswitch_f
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1257
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v4, p1, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 1258
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1250
    :pswitch_10
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1251
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ܿ(JLjava/lang/Object;)Z

    move-result v1

    invoke-static {p1, v3, v4, v1}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Object;JZ)V

    .line 1252
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 1244
    :pswitch_11
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1245
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v3, v4, p1}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 1246
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_1

    .line 1238
    :pswitch_12
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1239
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 1240
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_1

    .line 1232
    :pswitch_13
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1233
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v3, v4, p1}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 1234
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_1

    .line 1226
    :pswitch_14
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1227
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 1228
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_1

    .line 1220
    :pswitch_15
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1221
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 1222
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_1

    .line 1214
    :pswitch_16
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1215
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->᩻(JLjava/lang/Object;)F

    move-result v1

    invoke-static {p1, v3, v4, v1}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JF)V

    .line 1216
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_1

    .line 1208
    :pswitch_17
    invoke-direct {p0, v0, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1209
    invoke-static {v3, v4, p2}, Ll/᩸֨ۖ;->ܳ(JLjava/lang/Object;)D

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JD)V

    .line 1210
    invoke-direct {p0, v0, p1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    .line 1194
    :cond_1
    sget v0, Ll/ۡۚۖ;->֫:I

    .line 872
    iget-object v0, p0, Ll/ܶ֡ۖ;->ᩴ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 873
    invoke-virtual {v0, p2}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 874
    invoke-virtual {v0, v1, v2}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 875
    invoke-virtual {v0, p1, v1}, Ll/ܿ֨ۖ;->ܽ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1196
    iget-boolean v0, p0, Ll/ܶ֡ۖ;->ܿ:Z

    if-eqz v0, :cond_2

    .line 863
    iget-object v0, p0, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    invoke-virtual {v0, p2}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p2

    .line 864
    invoke-virtual {p2}, Ll/᩵ۘۖ;->ܿ()Z

    move-result v1

    if-nez v1, :cond_2

    .line 865
    invoke-virtual {v0, p1}, Ll/ܿۘۖ;->ۧ(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p1

    .line 866
    invoke-virtual {p1, p2}, Ll/᩵ۘۖ;->֫(Ll/᩵ۘۖ;)V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۜ۠ۖ;)V
    .locals 13

    .line 2070
    move-object v0, p2

    check-cast v0, Ll/᩻᩷ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    sget-object v1, Ll/᩻۠ۖ;->᩹:Ll/᩻۠ۖ;

    .line 2070
    sget-object v2, Ll/᩻۠ۖ;->᩶:Ll/᩻۠ۖ;

    if-ne v1, v2, :cond_7

    .line 2945
    iget-object v1, p0, Ll/ܶ֡ۖ;->ᩴ:Ll/ܿ֨ۖ;

    invoke-virtual {v1, p1}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;Ll/ۜ۠ۖ;)V

    .line 2486
    iget-boolean v1, p0, Ll/ܶ֡ۖ;->ܿ:Z

    iget-object v2, p0, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 2487
    invoke-virtual {v2, p1}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object v1

    .line 2488
    invoke-virtual {v1}, Ll/᩵ۘۖ;->ܿ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 2489
    invoke-virtual {v1}, Ll/᩵ۘۖ;->֫()Ljava/util/Iterator;

    move-result-object v1

    .line 2490
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    move-object v1, v3

    move-object v4, v1

    .line 2494
    :goto_0
    iget-object v5, p0, Ll/ܶ֡ۖ;->֫:[I

    array-length v6, v5

    :cond_1
    :goto_1
    add-int/lit8 v6, v6, -0x3

    if-ltz v6, :cond_4

    .line 2495
    invoke-direct {p0, v6}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v7

    .line 4649
    aget v8, v5, v6

    :goto_2
    if-eqz v4, :cond_3

    .line 2499
    invoke-virtual {v2, v4}, Ll/ܿۘۖ;->֫(Ljava/util/Map$Entry;)I

    move-result v9

    if-le v9, v8, :cond_3

    .line 2500
    invoke-virtual {v2, p2, v4}, Ll/ܿۘۖ;->֫(Ll/ۜ۠ۖ;Ljava/util/Map$Entry;)V

    .line 2501
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_2
    move-object v4, v3

    goto :goto_2

    .line 2504
    :cond_3
    invoke-static {v7}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x1

    const v12, 0xfffff

    packed-switch v9, :pswitch_data_0

    goto :goto_1

    .line 2915
    :pswitch_0
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2918
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 2919
    invoke-direct {p0, v6}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v9

    .line 2916
    invoke-virtual {v0, v8, v7, v9}, Ll/᩻᩷ۖ;->֫(ILjava/lang/Object;Ll/ۢۚۖ;)V

    goto :goto_1

    .line 2910
    :pswitch_1
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2911
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->ᩳ(IJ)V

    goto :goto_1

    .line 2905
    :pswitch_2
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2906
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v7

    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ܿ(II)V

    goto :goto_1

    .line 2900
    :pswitch_3
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2901
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->ܽ(IJ)V

    goto :goto_1

    .line 2895
    :pswitch_4
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2896
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v7

    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ᩳ(II)V

    goto/16 :goto_1

    .line 2890
    :pswitch_5
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2891
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v7

    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->֫(II)V

    goto/16 :goto_1

    .line 2885
    :pswitch_6
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2886
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v7

    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ܳ(II)V

    goto/16 :goto_1

    .line 2879
    :pswitch_7
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2881
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛۜۖ;

    .line 2880
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->֫(ILl/ۛۜۖ;)V

    goto/16 :goto_1

    .line 2873
    :pswitch_8
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2874
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 2875
    invoke-direct {p0, v6}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v9

    invoke-virtual {v0, v8, v7, v9}, Ll/᩻᩷ۖ;->ۧ(ILjava/lang/Object;Ll/ۢۚۖ;)V

    goto/16 :goto_1

    .line 2868
    :pswitch_9
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2869
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8, v7, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;Ll/ۜ۠ۖ;)V

    goto/16 :goto_1

    .line 2863
    :pswitch_a
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4739
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 2864
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->֫(IZ)V

    goto/16 :goto_1

    .line 2858
    :pswitch_b
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2859
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v7

    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ۧ(II)V

    goto/16 :goto_1

    .line 2853
    :pswitch_c
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2854
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->֫(IJ)V

    goto/16 :goto_1

    .line 2848
    :pswitch_d
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2849
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->֫(JLjava/lang/Object;)I

    move-result v7

    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ܽ(II)V

    goto/16 :goto_1

    .line 2843
    :pswitch_e
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2844
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->ܿ(IJ)V

    goto/16 :goto_1

    .line 2838
    :pswitch_f
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2839
    invoke-static {v9, v10, p1}, Ll/ܶ֡ۖ;->ۧ(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->ۧ(IJ)V

    goto/16 :goto_1

    .line 2833
    :pswitch_10
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4727
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    .line 2834
    invoke-virtual {v0, v7, v8}, Ll/᩻᩷ۖ;->֫(FI)V

    goto/16 :goto_1

    .line 2828
    :pswitch_11
    invoke-direct {p0, v8, v6, p1}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4723
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Double;

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    .line 2829
    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->֫(ID)V

    goto/16 :goto_1

    :pswitch_12
    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2825
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_1

    .line 2938
    invoke-direct {p0, v6}, Ll/ܶ֡ۖ;->ۧ(I)Ljava/lang/Object;

    move-result-object v9

    iget-object v10, p0, Ll/ܶ֡ۖ;->᩷:Ll/ۧ֡ۖ;

    invoke-interface {v10, v9}, Ll/ۧ֡ۖ;->֫(Ljava/lang/Object;)V

    .line 2939
    invoke-interface {v10, v7}, Ll/ۧ֡ۖ;->ᩳ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v7

    .line 2936
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->֫(ILjava/util/Map;)V

    goto/16 :goto_1

    .line 4649
    :pswitch_13
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2819
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2821
    invoke-direct {p0, v6}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v9

    .line 2817
    invoke-static {v8, v7, p2, v9}, Ll/ۡۚۖ;->֫(ILjava/util/List;Ll/ۜ۠ۖ;Ll/ۢۚۖ;)V

    goto/16 :goto_1

    .line 4649
    :pswitch_14
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2812
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2810
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ܺ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_15
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2805
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2803
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ۡ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_16
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2798
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2796
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ۢ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_17
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2791
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2789
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->᩷(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_18
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2784
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2782
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ܽ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_19
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2777
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2775
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ۖ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_1a
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2770
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2768
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->֫(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_1b
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2762
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2760
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ᩳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_1c
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2755
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2753
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ܿ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_1d
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2748
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2746
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->᩻(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_1e
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2741
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2739
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ۘ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_1f
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2734
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2732
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ۜ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_20
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2727
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2725
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ܳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_21
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2720
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2718
    invoke-static {v8, v7, p2, v11}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_22
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2713
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2711
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ܺ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_23
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2706
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2704
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ۡ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_24
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2699
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2697
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ۢ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_25
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2692
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2690
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->᩷(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_26
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2685
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2683
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ܽ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_27
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2678
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2676
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ۖ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_28
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2672
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2670
    sget v9, Ll/ۡۚۖ;->֫:I

    if-eqz v7, :cond_1

    .line 267
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1

    .line 268
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->֫(ILjava/util/List;)V

    goto/16 :goto_1

    .line 4649
    :pswitch_29
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2665
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2667
    invoke-direct {p0, v6}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v9

    .line 2663
    invoke-static {v8, v7, p2, v9}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;Ll/ۜ۠ۖ;Ll/ۢۚۖ;)V

    goto/16 :goto_1

    .line 4649
    :pswitch_2a
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2659
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2657
    sget v9, Ll/ۡۚۖ;->֫:I

    if-eqz v7, :cond_1

    .line 260
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1

    .line 261
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ۧ(ILjava/util/List;)V

    goto/16 :goto_1

    .line 4649
    :pswitch_2b
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2652
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2650
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->֫(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_2c
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2645
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2643
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ᩳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_2d
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2638
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2636
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ܿ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_2e
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2631
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2629
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->᩻(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_2f
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2624
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2622
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ۘ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_30
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2617
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2615
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ۜ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_31
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2610
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2608
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ܳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 4649
    :pswitch_32
    aget v8, v5, v6

    and-int/2addr v7, v12

    int-to-long v11, v7

    .line 2603
    invoke-static {v11, v12, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 2601
    invoke-static {v8, v7, p2, v10}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    goto/16 :goto_1

    .line 2593
    :pswitch_33
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2596
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 2597
    invoke-direct {p0, v6}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v9

    .line 2594
    invoke-virtual {v0, v8, v7, v9}, Ll/᩻᩷ۖ;->֫(ILjava/lang/Object;Ll/ۢۚۖ;)V

    goto/16 :goto_1

    .line 2588
    :pswitch_34
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4715
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v9

    .line 2589
    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->ᩳ(IJ)V

    goto/16 :goto_1

    .line 2583
    :pswitch_35
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4711
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v7

    .line 2584
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ܿ(II)V

    goto/16 :goto_1

    .line 2578
    :pswitch_36
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4715
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v9

    .line 2579
    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->ܽ(IJ)V

    goto/16 :goto_1

    .line 2573
    :pswitch_37
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4711
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v7

    .line 2574
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ᩳ(II)V

    goto/16 :goto_1

    .line 2568
    :pswitch_38
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4711
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v7

    .line 2569
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->֫(II)V

    goto/16 :goto_1

    .line 2563
    :pswitch_39
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4711
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v7

    .line 2564
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ܳ(II)V

    goto/16 :goto_1

    .line 2557
    :pswitch_3a
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2559
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛۜۖ;

    .line 2558
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->֫(ILl/ۛۜۖ;)V

    goto/16 :goto_1

    .line 2551
    :pswitch_3b
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2552
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 2553
    invoke-direct {p0, v6}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v9

    invoke-virtual {v0, v8, v7, v9}, Ll/᩻᩷ۖ;->ۧ(ILjava/lang/Object;Ll/ۢۚۖ;)V

    goto/16 :goto_1

    .line 2546
    :pswitch_3c
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 2547
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8, v7, p2}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;Ll/ۜ۠ۖ;)V

    goto/16 :goto_1

    .line 2541
    :pswitch_3d
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4719
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ܿ(JLjava/lang/Object;)Z

    move-result v7

    .line 2542
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->֫(IZ)V

    goto/16 :goto_1

    .line 2536
    :pswitch_3e
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4711
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v7

    .line 2537
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ۧ(II)V

    goto/16 :goto_1

    .line 2531
    :pswitch_3f
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4715
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v9

    .line 2532
    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->֫(IJ)V

    goto/16 :goto_1

    .line 2526
    :pswitch_40
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4711
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v7

    .line 2527
    invoke-virtual {v0, v8, v7}, Ll/᩻᩷ۖ;->ܽ(II)V

    goto/16 :goto_1

    .line 2521
    :pswitch_41
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4715
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v9

    .line 2522
    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->ܿ(IJ)V

    goto/16 :goto_1

    .line 2516
    :pswitch_42
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4715
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v9

    .line 2517
    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->ۧ(IJ)V

    goto/16 :goto_1

    .line 2511
    :pswitch_43
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4707
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->᩻(JLjava/lang/Object;)F

    move-result v7

    .line 2512
    invoke-virtual {v0, v7, v8}, Ll/᩻᩷ۖ;->֫(FI)V

    goto/16 :goto_1

    .line 2506
    :pswitch_44
    invoke-direct {p0, v6, p1}, Ll/ܶ֡ۖ;->֫(ILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    and-int/2addr v7, v12

    int-to-long v9, v7

    .line 4703
    invoke-static {v9, v10, p1}, Ll/᩸֨ۖ;->ܳ(JLjava/lang/Object;)D

    move-result-wide v9

    .line 2507
    invoke-virtual {v0, v8, v9, v10}, Ll/᩻᩷ۖ;->֫(ID)V

    goto/16 :goto_1

    :cond_4
    :goto_3
    if-eqz v4, :cond_6

    .line 2927
    invoke-virtual {v2, p2, v4}, Ll/ܿۘۖ;->֫(Ll/ۜ۠ۖ;Ljava/util/Map$Entry;)V

    .line 2928
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/util/Map$Entry;

    goto :goto_3

    :cond_5
    move-object v4, v3

    goto :goto_3

    :cond_6
    return-void

    .line 2073
    :cond_7
    invoke-direct {p0, p1, p2}, Ll/ܶ֡ۖ;->ۧ(Ljava/lang/Object;Ll/ۜ۠ۖ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۧۚۖ;Ll/ᩳۘۖ;)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v15, p1

    move-object/from16 v0, p2

    move-object/from16 v6, p3

    .line 2952
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2954
    invoke-static/range {p1 .. p1}, Ll/ܶ֡ۖ;->ܽ(Ljava/lang/Object;)V

    .line 2955
    iget-object v14, v7, Ll/ܶ֡ۖ;->ᩴ:Ll/ܿ֨ۖ;

    .line 2969
    iget-object v13, v7, Ll/ܶ֡ۖ;->ܳ:[I

    iget v12, v7, Ll/ܶ֡ۖ;->ۘ:I

    iget v5, v7, Ll/ܶ֡ۖ;->ۧ:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v8, v1

    move-object v11, v2

    .line 2973
    :goto_0
    :try_start_0
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۘ()I

    move-result v2

    .line 4845
    iget v1, v7, Ll/ܶ֡ۖ;->ۡ:I

    if-lt v2, v1, :cond_2

    iget v1, v7, Ll/ܶ֡ۖ;->ۢ:I

    if-gt v2, v1, :cond_2

    .line 4859
    iget-object v1, v7, Ll/ܶ֡ۖ;->֫:[I

    array-length v3, v1

    div-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x0

    :goto_1
    if-gt v4, v3, :cond_2

    add-int v9, v3, v4

    ushr-int/lit8 v9, v9, 0x1

    mul-int/lit8 v10, v9, 0x3

    move/from16 v16, v3

    .line 4649
    aget v3, v1, v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_f

    if-ne v2, v3, :cond_0

    move v3, v10

    goto :goto_2

    :cond_0
    if-ge v2, v3, :cond_1

    add-int/lit8 v3, v9, -0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v9, 0x1

    move/from16 v3, v16

    goto :goto_1

    :cond_2
    const/4 v1, -0x1

    const/4 v3, -0x1

    :goto_2
    if-gez v3, :cond_d

    const v1, 0x7fffffff

    if-ne v2, v1, :cond_4

    move v0, v5

    :goto_3
    if-ge v0, v12, :cond_3

    .line 3408
    aget v3, v13, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v4, v11

    move-object v5, v14

    move-object/from16 v6, p1

    .line 3409
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;ILjava/lang/Object;Ll/ܿ֨ۖ;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    if-eqz v11, :cond_1a

    .line 3413
    invoke-virtual {v14, v15, v11}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_24

    .line 2981
    :cond_4
    :try_start_1
    iget-boolean v1, v7, Ll/ܶ֡ۖ;->ܿ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    iget-object v3, v7, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    if-nez v1, :cond_5

    const/4 v1, 0x0

    goto :goto_4

    .line 2983
    :cond_5
    :try_start_2
    iget-object v1, v7, Ll/ܶ֡ۖ;->ܽ:Ll/ۡ֡ۖ;

    invoke-virtual {v3, v6, v1, v2}, Ll/ܿۘۖ;->֫(Ll/ᩳۘۖ;Ll/ۡ֡ۖ;I)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    :goto_4
    if-eqz v1, :cond_7

    if-nez v8, :cond_6

    .line 2987
    :try_start_3
    invoke-virtual {v3, v15}, Ll/ܿۘۖ;->ۧ(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    move v10, v12

    move-object/from16 v16, v13

    move-object v9, v14

    move v12, v5

    move-object v13, v11

    move-object v11, v15

    goto/16 :goto_15

    :cond_6
    move-object v2, v8

    :goto_5
    move-object v8, v3

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object v4, v11

    move-object v11, v1

    move v3, v12

    move-object/from16 v12, p3

    move-object/from16 v16, v13

    move-object v13, v2

    move-object v1, v14

    move-object v14, v4

    move-object v7, v15

    move-object v15, v1

    .line 2990
    :try_start_4
    invoke-virtual/range {v8 .. v15}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;Ll/ۧۚۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;Ljava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;

    move-result-object v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v14, v1

    move-object v8, v2

    :goto_6
    move v12, v3

    move-object v15, v7

    move-object/from16 v13, v16

    move-object/from16 v7, p0

    goto/16 :goto_0

    :cond_7
    move-object v4, v11

    move v3, v12

    move-object/from16 v16, v13

    move-object v1, v14

    move-object v7, v15

    .line 3000
    :try_start_5
    invoke-virtual {v1, v0}, Ll/ܿ֨ۖ;->֫(Ll/ۧۚۖ;)Z

    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eqz v2, :cond_8

    .line 3001
    :try_start_6
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->᩵()Z

    move-result v2

    move-object v11, v4

    if-eqz v2, :cond_a

    goto :goto_9

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_8
    if-nez v4, :cond_9

    .line 3006
    invoke-virtual {v1, v7}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_8

    :goto_7
    move-object v9, v1

    move v10, v3

    goto :goto_c

    :cond_9
    move-object v11, v4

    .line 3009
    :goto_8
    :try_start_7
    invoke-virtual {v1, v11, v0}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;Ll/ۧۚۖ;)Z

    move-result v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v2, :cond_a

    :goto_9
    move-object v14, v1

    goto :goto_6

    :cond_a
    move v0, v5

    :goto_a
    if-ge v0, v3, :cond_b

    .line 3408
    aget v4, v16, v0

    move-object v9, v1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v10, v3

    move v3, v4

    move-object v4, v11

    move-object v5, v9

    move-object/from16 v6, p1

    .line 3409
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;ILjava/lang/Object;Ll/ܿ֨ۖ;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    move-object v1, v9

    move v3, v10

    goto :goto_a

    :cond_b
    move-object v9, v1

    if-eqz v11, :cond_c

    .line 3413
    invoke-virtual {v9, v7, v11}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v7, p0

    goto/16 :goto_24

    :catchall_2
    move-exception v0

    move-object v9, v1

    move v10, v3

    goto :goto_b

    :catchall_3
    move-exception v0

    move-object v9, v1

    move v10, v3

    move-object v11, v4

    :goto_b
    move v12, v5

    move-object v4, v11

    goto :goto_d

    :catchall_4
    move-exception v0

    move-object v4, v11

    move v10, v12

    move-object/from16 v16, v13

    move-object v9, v14

    move-object v7, v15

    :goto_c
    move v12, v5

    :goto_d
    move-object v11, v7

    move-object/from16 v7, p0

    goto/16 :goto_27

    :cond_d
    move-object v4, v11

    move v10, v12

    move-object/from16 v16, v13

    move-object v9, v14

    move-object/from16 v7, p0

    move-object v11, v15

    .line 3016
    :try_start_8
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_e

    .line 3019
    :try_start_9
    invoke-static {v1}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result v12
    :try_end_9
    .catch Ll/۟ᩴۖ; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_c

    const v13, 0xfffff

    const/4 v14, 0x0

    iget-object v15, v7, Ll/ܶ֡ۖ;->᩻:Ll/֡᩵ۖ;

    packed-switch v12, :pswitch_data_0

    move v12, v5

    move-object v14, v6

    if-nez v4, :cond_13

    .line 3382
    :try_start_a
    invoke-virtual {v9, v11}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_a
    .catch Ll/۟ᩴۖ; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    goto/16 :goto_19

    .line 3373
    :pswitch_0
    :try_start_b
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ۧ(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    .line 3375
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v12

    .line 3374
    invoke-interface {v0, v1, v12, v6}, Ll/ۧۚۖ;->֫(Ljava/lang/Object;Ll/ۢۚۖ;Ll/ᩳۘۖ;)V

    .line 3376
    invoke-direct {v7, v11, v2, v3, v1}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_1
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3367
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ܺ()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 3366
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3368
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_2
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3362
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->᩻()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 3361
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3363
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_3
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3357
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ܽ()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 3356
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3358
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_4
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3352
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->֡()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 3351
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3353
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_f

    .line 3338
    :pswitch_5
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ܳ()I

    move-result v12

    .line 3339
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->֫(I)Ll/۫ᩴۖ;

    move-result-object v14

    if-eqz v14, :cond_f

    .line 3340
    invoke-interface {v14, v12}, Ll/۫ᩴۖ;->֫(I)Z

    move-result v14

    if-eqz v14, :cond_e

    goto :goto_e

    .line 3345
    :cond_e
    invoke-static {v11, v2, v12, v4, v9}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;IILjava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    move v12, v5

    move-object v14, v6

    goto/16 :goto_1d

    :cond_f
    :goto_e
    and-int/2addr v1, v13

    int-to-long v13, v1

    .line 3341
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v13, v14, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3342
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_6
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3333
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ᩳ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 3332
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3334
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_7
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3328
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۜ()Ll/ۛۜۖ;

    move-result-object v1

    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3329
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_f

    .line 3321
    :pswitch_8
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ۧ(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    .line 3323
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v12

    .line 3322
    invoke-interface {v0, v1, v12, v6}, Ll/ۧۚۖ;->ۧ(Ljava/lang/Object;Ll/ۢۚۖ;Ll/ᩳۘۖ;)V

    .line 3324
    invoke-direct {v7, v11, v2, v3, v1}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_f

    .line 3315
    :pswitch_9
    invoke-direct {v7, v11, v1, v0}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;ILl/ۧۚۖ;)V

    .line 3316
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_a
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3311
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۧ()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 3310
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3312
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_b
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3306
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۡ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 3305
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3307
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto :goto_f

    :pswitch_c
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3301
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->֫()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 3300
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3302
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto :goto_f

    :pswitch_d
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3296
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->᩷()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 3295
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3297
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto :goto_f

    :pswitch_e
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3291
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۢ()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 3290
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3292
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto :goto_f

    :pswitch_f
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3286
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۚ()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 3285
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3287
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto :goto_f

    :pswitch_10
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3281
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->readFloat()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 3280
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3282
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V

    goto :goto_f

    :pswitch_11
    and-int/2addr v1, v13

    int-to-long v12, v1

    .line 3276
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->readDouble()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    .line 3275
    invoke-static {v12, v13, v11, v1}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3277
    invoke-direct {v7, v2, v3, v11}, Ll/ܶ֡ۖ;->ܽ(IILjava/lang/Object;)V
    :try_end_b
    .catch Ll/۟ᩴۖ; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_e

    :goto_f
    move v12, v5

    move-object v14, v6

    goto/16 :goto_18

    :catch_0
    move-object v13, v4

    move v12, v5

    move-object v15, v6

    goto :goto_11

    .line 3272
    :pswitch_12
    :try_start_c
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->ۧ(I)Ljava/lang/Object;

    move-result-object v12
    :try_end_c
    .catch Ll/۟ᩴۖ; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v13, v4

    move-object v4, v12

    move v12, v5

    move-object/from16 v5, p3

    move-object v15, v6

    move-object/from16 v6, p2

    :try_start_d
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;ILjava/lang/Object;Ll/ᩳۘۖ;Ll/ۧۚۖ;)V

    throw v14
    :try_end_d
    .catch Ll/۟ᩴۖ; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :catchall_5
    move-exception v0

    goto :goto_10

    :catch_1
    move-object v6, v13

    move-object v14, v15

    goto/16 :goto_13

    :catchall_6
    move-exception v0

    move-object v13, v4

    move v12, v5

    :goto_10
    move-object v6, v13

    goto/16 :goto_16

    :goto_11
    move-object v14, v15

    goto/16 :goto_20

    :pswitch_13
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3267
    :try_start_e
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v3

    .line 4645
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 4644
    invoke-interface {v0, v1, v3, v14}, Ll/ۧۚۖ;->֫(Ljava/util/List;Ll/ۢۚۖ;Ll/ᩳۘۖ;)V

    goto :goto_12

    :pswitch_14
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3259
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3258
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۧ(Ljava/util/List;)V

    goto :goto_12

    :pswitch_15
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3255
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3254
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->᩷(Ljava/util/List;)V

    goto :goto_12

    :pswitch_16
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3251
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3250
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۡ(Ljava/util/List;)V

    goto :goto_12

    :pswitch_17
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3247
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3246
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->֫(Ljava/util/List;)V
    :try_end_e
    .catch Ll/۟ᩴۖ; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    :goto_12
    move-object v4, v6

    goto/16 :goto_18

    :catch_2
    :goto_13
    move-object v4, v6

    goto/16 :goto_1f

    :pswitch_18
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v4, v1

    .line 3233
    :try_start_f
    invoke-virtual {v15, v4, v5, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 3234
    invoke-interface {v0, v4}, Ll/ۧۚۖ;->ܿ(Ljava/util/List;)V

    .line 3240
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->֫(I)Ll/۫ᩴۖ;

    move-result-object v5
    :try_end_f
    .catch Ll/۟ᩴۖ; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    move-object/from16 v1, p1

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v13, v6

    move-object v6, v9

    .line 3236
    :try_start_10
    invoke-static/range {v1 .. v6}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;ILjava/util/List;Ll/۫ᩴۖ;Ljava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;

    move-result-object v1
    :try_end_10
    .catch Ll/۟ᩴۖ; {:try_start_10 .. :try_end_10} :catch_4
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    goto/16 :goto_1e

    :catch_3
    move-object v13, v6

    goto :goto_14

    :catchall_7
    move-exception v0

    move-object v13, v6

    goto/16 :goto_15

    :catch_4
    :goto_14
    move-object v4, v13

    goto/16 :goto_1f

    :pswitch_19
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3228
    :try_start_11
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3227
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۢ(Ljava/util/List;)V

    goto :goto_12

    :pswitch_1a
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3224
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3223
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ܳ(Ljava/util/List;)V

    goto :goto_12

    :pswitch_1b
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3220
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3219
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۖ(Ljava/util/List;)V

    goto :goto_12

    :pswitch_1c
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3216
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3215
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۜ(Ljava/util/List;)V

    goto :goto_12

    :pswitch_1d
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3212
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3211
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ܺ(Ljava/util/List;)V

    goto :goto_12

    :pswitch_1e
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3208
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3207
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ܽ(Ljava/util/List;)V

    goto :goto_12

    :pswitch_1f
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3204
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3203
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ᩳ(Ljava/util/List;)V

    goto/16 :goto_12

    :pswitch_20
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3200
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3199
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ᩴ(Ljava/util/List;)V

    goto/16 :goto_12

    :pswitch_21
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3196
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3195
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->֡(Ljava/util/List;)V

    goto/16 :goto_12

    :pswitch_22
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3192
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3191
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۧ(Ljava/util/List;)V

    goto/16 :goto_12

    :pswitch_23
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3188
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3187
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->᩷(Ljava/util/List;)V

    goto/16 :goto_12

    :pswitch_24
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3184
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3183
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۡ(Ljava/util/List;)V

    goto/16 :goto_12

    :pswitch_25
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3180
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3179
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->֫(Ljava/util/List;)V

    goto/16 :goto_12

    :pswitch_26
    move v12, v5

    move-object v14, v6

    move-object v6, v4

    and-int/2addr v1, v13

    int-to-long v4, v1

    .line 3166
    invoke-virtual {v15, v4, v5, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 3167
    invoke-interface {v0, v4}, Ll/ۧۚۖ;->ܿ(Ljava/util/List;)V
    :try_end_11
    .catch Ll/۟ᩴۖ; {:try_start_11 .. :try_end_11} :catch_2
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 3173
    :try_start_12
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->֫(I)Ll/۫ᩴۖ;

    move-result-object v5
    :try_end_12
    .catch Ll/۟ᩴۖ; {:try_start_12 .. :try_end_12} :catch_3
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    move-object/from16 v1, p1

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v13, v6

    move-object v6, v9

    .line 3169
    :try_start_13
    invoke-static/range {v1 .. v6}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;ILjava/util/List;Ll/۫ᩴۖ;Ljava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;

    move-result-object v1
    :try_end_13
    .catch Ll/۟ᩴۖ; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    goto/16 :goto_1e

    :catchall_8
    move-exception v0

    :goto_15
    move-object v4, v13

    goto/16 :goto_27

    :catchall_9
    move-exception v0

    :goto_16
    move-object v4, v6

    goto/16 :goto_27

    :pswitch_27
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3161
    :try_start_14
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3160
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۢ(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_28
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3157
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3156
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->᩵(Ljava/util/List;)V

    goto/16 :goto_18

    :catchall_a
    move-exception v0

    goto/16 :goto_27

    :pswitch_29
    move v12, v5

    move-object v14, v6

    .line 3151
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    and-int/2addr v1, v13

    int-to-long v5, v1

    .line 4634
    invoke-virtual {v15, v5, v6, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 4633
    invoke-interface {v0, v1, v2, v14}, Ll/ۧۚۖ;->ۧ(Ljava/util/List;Ll/ۢۚۖ;Ll/ᩳۘۖ;)V

    goto/16 :goto_18

    :pswitch_2a
    move v12, v5

    move-object v14, v6

    const/high16 v2, 0x20000000

    and-int/2addr v2, v1

    if-eqz v2, :cond_10

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 4619
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 4618
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->᩻(Ljava/util/List;)V

    goto/16 :goto_18

    :cond_10
    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 4621
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۘ(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_2b
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3140
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3139
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ܳ(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_2c
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3136
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3135
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۖ(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_2d
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3132
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3131
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ۜ(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_2e
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3128
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3127
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ܺ(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_2f
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3124
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3123
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ܽ(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_30
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3120
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3119
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ᩳ(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_31
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3116
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3115
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->ᩴ(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_32
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3112
    invoke-virtual {v15, v1, v2, v11}, Ll/֡᩵ۖ;->ۧ(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 3111
    invoke-interface {v0, v1}, Ll/ۧۚۖ;->֡(Ljava/util/List;)V

    goto/16 :goto_18

    :pswitch_33
    move v12, v5

    move-object v14, v6

    .line 3104
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ۧ(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    .line 3106
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    .line 3105
    invoke-interface {v0, v1, v2, v14}, Ll/ۧۚۖ;->֫(Ljava/lang/Object;Ll/ۢۚۖ;Ll/ᩳۘۖ;)V

    .line 3107
    invoke-direct {v7, v3, v11, v1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_34
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3099
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ܺ()J

    move-result-wide v5

    invoke-static {v11, v1, v2, v5, v6}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 3100
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_35
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3095
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->᩻()I

    move-result v5

    invoke-static {v5, v1, v2, v11}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 3096
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_36
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3091
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ܽ()J

    move-result-wide v5

    invoke-static {v11, v1, v2, v5, v6}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 3092
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_37
    move v12, v5

    move-object v14, v6

    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3087
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->֡()I

    move-result v5

    invoke-static {v5, v1, v2, v11}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 3088
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_38
    move v12, v5

    move-object v14, v6

    .line 3074
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ܳ()I

    move-result v5

    .line 3075
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->֫(I)Ll/۫ᩴۖ;

    move-result-object v6

    if-eqz v6, :cond_12

    .line 3076
    invoke-interface {v6, v5}, Ll/۫ᩴۖ;->֫(I)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_17

    .line 3081
    :cond_11
    invoke-static {v11, v2, v5, v4, v9}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;IILjava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_1e

    :cond_12
    :goto_17
    and-int/2addr v1, v13

    int-to-long v1, v1

    .line 3077
    invoke-static {v5, v1, v2, v11}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 3078
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_39
    move v12, v5

    move-object v14, v6

    .line 3069
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ᩳ()I

    move-result v5

    invoke-static {v5, v1, v2, v11}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 3070
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_3a
    move v12, v5

    move-object v14, v6

    .line 3065
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۜ()Ll/ۛۜۖ;

    move-result-object v5

    invoke-static {v1, v2, v11, v5}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 3066
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_3b
    move v12, v5

    move-object v14, v6

    .line 3058
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ۧ(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    .line 3060
    invoke-direct {v7, v3}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v2

    .line 3059
    invoke-interface {v0, v1, v2, v14}, Ll/ۧۚۖ;->ۧ(Ljava/lang/Object;Ll/ۢۚۖ;Ll/ᩳۘۖ;)V

    .line 3061
    invoke-direct {v7, v3, v11, v1}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_3c
    move v12, v5

    move-object v14, v6

    .line 3053
    invoke-direct {v7, v11, v1, v0}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;ILl/ۧۚۖ;)V

    .line 3054
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_3d
    move v12, v5

    move-object v14, v6

    .line 3049
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۧ()Z

    move-result v5

    invoke-static {v11, v1, v2, v5}, Ll/᩸֨ۖ;->ܽ(Ljava/lang/Object;JZ)V

    .line 3050
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_3e
    move v12, v5

    move-object v14, v6

    .line 3045
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۡ()I

    move-result v5

    invoke-static {v5, v1, v2, v11}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 3046
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_3f
    move v12, v5

    move-object v14, v6

    .line 3041
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->֫()J

    move-result-wide v5

    invoke-static {v11, v1, v2, v5, v6}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 3042
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_18

    :pswitch_40
    move v12, v5

    move-object v14, v6

    .line 3037
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->᩷()I

    move-result v5

    invoke-static {v5, v1, v2, v11}, Ll/᩸֨ۖ;->֫(IJLjava/lang/Object;)V

    .line 3038
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_18

    :pswitch_41
    move v12, v5

    move-object v14, v6

    .line 3033
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۢ()J

    move-result-wide v5

    invoke-static {v11, v1, v2, v5, v6}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 3034
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_18

    :pswitch_42
    move v12, v5

    move-object v14, v6

    .line 3029
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->ۚ()J

    move-result-wide v5

    invoke-static {v11, v1, v2, v5, v6}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JJ)V

    .line 3030
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_18

    :pswitch_43
    move v12, v5

    move-object v14, v6

    .line 3025
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->readFloat()F

    move-result v5

    invoke-static {v11, v1, v2, v5}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JF)V

    .line 3026
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_18

    :pswitch_44
    move v12, v5

    move-object v14, v6

    .line 3021
    invoke-static {v1}, Ll/ܶ֡ۖ;->ᩳ(I)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->readDouble()D

    move-result-wide v5

    invoke-static {v11, v1, v2, v5, v6}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JD)V

    .line 3022
    invoke-direct {v7, v3, v11}, Ll/ܶ֡ۖ;->ܽ(ILjava/lang/Object;)V
    :try_end_14
    .catch Ll/۟ᩴۖ; {:try_start_14 .. :try_end_14} :catch_6
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    :goto_18
    move-object v1, v4

    goto :goto_1e

    :goto_19
    move-object v13, v1

    goto :goto_1a

    :cond_13
    move-object v13, v4

    .line 3384
    :goto_1a
    :try_start_15
    invoke-virtual {v9, v13, v0}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;Ll/ۧۚۖ;)Z

    move-result v1
    :try_end_15
    .catch Ll/۟ᩴۖ; {:try_start_15 .. :try_end_15} :catch_7
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    if-nez v1, :cond_15

    :goto_1b
    if-ge v12, v10, :cond_14

    .line 3408
    aget v3, v16, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v4, v13

    move-object v5, v9

    move-object/from16 v6, p1

    .line 3409
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;ILjava/lang/Object;Ll/ܿ֨ۖ;Ljava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_1b

    :cond_14
    if-eqz v13, :cond_1a

    .line 3413
    :goto_1c
    invoke-virtual {v9, v11, v13}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_24

    :cond_15
    :goto_1d
    move-object v1, v13

    :goto_1e
    move-object v13, v1

    goto :goto_25

    :catchall_b
    move-exception v0

    goto/16 :goto_28

    :catchall_c
    move-exception v0

    goto/16 :goto_26

    :catch_5
    move v12, v5

    move-object v14, v6

    :catch_6
    :goto_1f
    move-object v13, v4

    .line 3392
    :catch_7
    :goto_20
    :try_start_16
    invoke-virtual {v9, v0}, Ll/ܿ֨ۖ;->֫(Ll/ۧۚۖ;)Z

    move-result v1

    if-eqz v1, :cond_17

    .line 3393
    invoke-interface/range {p2 .. p2}, Ll/ۧۚۖ;->᩵()Z

    move-result v1
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    if-nez v1, :cond_1b

    :goto_21
    if-ge v12, v10, :cond_16

    .line 3408
    aget v3, v16, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v4, v13

    move-object v5, v9

    move-object/from16 v6, p1

    .line 3409
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;ILjava/lang/Object;Ll/ܿ֨ۖ;Ljava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_21

    :cond_16
    if-eqz v13, :cond_1a

    goto :goto_23

    :cond_17
    if-nez v13, :cond_18

    .line 3398
    :try_start_17
    invoke-virtual {v9, v11}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    .line 3400
    :cond_18
    invoke-virtual {v9, v13, v0}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;Ll/ۧۚۖ;)Z

    move-result v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    if-nez v1, :cond_1b

    :goto_22
    if-ge v12, v10, :cond_19

    .line 3408
    aget v3, v16, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v4, v13

    move-object v5, v9

    move-object/from16 v6, p1

    .line 3409
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;ILjava/lang/Object;Ll/ܿ֨ۖ;Ljava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_22

    :cond_19
    if-eqz v13, :cond_1a

    :goto_23
    goto :goto_1c

    :cond_1a
    :goto_24
    return-void

    :cond_1b
    :goto_25
    move-object v15, v11

    move v5, v12

    move-object v11, v13

    move-object v6, v14

    move-object/from16 v13, v16

    move-object v14, v9

    move v12, v10

    goto/16 :goto_0

    :catchall_d
    move-exception v0

    goto/16 :goto_15

    :catchall_e
    move-exception v0

    :goto_26
    move v12, v5

    goto :goto_27

    :catchall_f
    move-exception v0

    move-object v4, v11

    move v10, v12

    move-object/from16 v16, v13

    move-object v9, v14

    move-object v11, v15

    goto :goto_26

    :goto_27
    move-object v13, v4

    :goto_28
    if-ge v12, v10, :cond_1c

    .line 3408
    aget v3, v16, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v4, v13

    move-object v5, v9

    move-object/from16 v6, p1

    .line 3409
    invoke-direct/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;ILjava/lang/Object;Ll/ܿ֨ۖ;Ljava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_28

    :cond_1c
    if-eqz v13, :cond_1d

    .line 3413
    invoke-virtual {v9, v11, v13}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3415
    :cond_1d
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;)Z
    .locals 10

    .line 802
    iget-object v0, p0, Ll/ܶ֡ۖ;->֫:[I

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_2

    .line 824
    invoke-direct {p0, v3}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v5

    const v6, 0xfffff

    and-int v7, v5, v6

    int-to-long v7, v7

    .line 827
    invoke-static {v5}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    add-int/lit8 v5, v3, 0x2

    .line 4657
    aget v5, v0, v5

    and-int/2addr v5, v6

    int-to-long v5, v5

    .line 4835
    invoke-static {v5, v6, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v9

    .line 4836
    invoke-static {v5, v6, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v5

    if-ne v9, v5, :cond_0

    .line 946
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 945
    invoke-static {v5, v6}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    .line 925
    :pswitch_1
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 924
    invoke-static {v4, v5}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto/16 :goto_1

    .line 922
    :pswitch_2
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 921
    invoke-static {v4, v5}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto/16 :goto_1

    .line 885
    :pswitch_3
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 887
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 886
    invoke-static {v5, v6}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    .line 882
    :pswitch_4
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 883
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    goto/16 :goto_1

    .line 879
    :pswitch_5
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 880
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v6

    if-ne v5, v6, :cond_0

    goto/16 :goto_1

    .line 876
    :pswitch_6
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 877
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    goto/16 :goto_1

    .line 873
    :pswitch_7
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 874
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v6

    if-ne v5, v6, :cond_0

    goto/16 :goto_1

    .line 870
    :pswitch_8
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 871
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v6

    if-ne v5, v6, :cond_0

    goto/16 :goto_1

    .line 867
    :pswitch_9
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 868
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v6

    if-ne v5, v6, :cond_0

    goto/16 :goto_1

    .line 863
    :pswitch_a
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 865
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 864
    invoke-static {v5, v6}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    .line 859
    :pswitch_b
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 861
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 860
    invoke-static {v5, v6}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    .line 855
    :pswitch_c
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 857
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 856
    invoke-static {v5, v6}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    .line 852
    :pswitch_d
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 853
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ܿ(JLjava/lang/Object;)Z

    move-result v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ܿ(JLjava/lang/Object;)Z

    move-result v6

    if-ne v5, v6, :cond_0

    goto/16 :goto_1

    .line 849
    :pswitch_e
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 850
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v6

    if-ne v5, v6, :cond_0

    goto/16 :goto_1

    .line 846
    :pswitch_f
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 847
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    goto/16 :goto_1

    .line 843
    :pswitch_10
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 844
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ۜ(JLjava/lang/Object;)I

    move-result v6

    if-ne v5, v6, :cond_0

    goto :goto_1

    .line 840
    :pswitch_11
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 841
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    goto :goto_1

    .line 837
    :pswitch_12
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 838
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    goto :goto_1

    .line 833
    :pswitch_13
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 834
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->᩻(JLjava/lang/Object;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v5

    .line 835
    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->᩻(JLjava/lang/Object;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v6

    if-ne v5, v6, :cond_0

    goto :goto_1

    .line 829
    :pswitch_14
    invoke-direct {p0, p1, p2, v3}, Ll/ܶ֡ۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 830
    invoke-static {v7, v8, p1}, Ll/᩸֨ۖ;->ܳ(JLjava/lang/Object;)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    .line 831
    invoke-static {v7, v8, p2}, Ll/᩸֨ۖ;->ܳ(JLjava/lang/Object;)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x3

    goto/16 :goto_0

    .line 809
    :cond_2
    iget-object v0, p0, Ll/ܶ֡ۖ;->ᩴ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 810
    invoke-virtual {v0, p2}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 811
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_2
    return v2

    .line 815
    :cond_3
    iget-boolean v0, p0, Ll/ܶ֡ۖ;->ܿ:Z

    if-eqz v0, :cond_4

    .line 816
    iget-object v0, p0, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    invoke-virtual {v0, p1}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p1

    .line 817
    invoke-virtual {v0, p2}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p2

    .line 818
    invoke-virtual {p1, p2}, Ll/᩵ۘۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ(Ljava/lang/Object;)Z
    .locals 17

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const v8, 0xfffff

    const/4 v9, 0x0

    const v0, 0xfffff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v10, 0x0

    .line 4482
    :goto_0
    iget v2, v6, Ll/ܶ֡ۖ;->ۧ:I

    const/4 v3, 0x1

    if-ge v10, v2, :cond_b

    .line 4483
    iget-object v2, v6, Ll/ܶ֡ۖ;->ܳ:[I

    aget v11, v2, v10

    .line 4649
    iget-object v2, v6, Ll/ܶ֡ۖ;->֫:[I

    aget v12, v2, v11

    .line 4485
    invoke-direct {v6, v11}, Ll/ܶ֡ۖ;->ܳ(I)I

    move-result v13

    add-int/lit8 v4, v11, 0x2

    .line 4487
    aget v2, v2, v4

    and-int v4, v2, v8

    ushr-int/lit8 v2, v2, 0x14

    shl-int v14, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v8, :cond_0

    .line 4493
    sget-object v0, Ll/ܶ֡ۖ;->ۚ:Lsun/misc/Unsafe;

    int-to-long v1, v4

    invoke-virtual {v0, v7, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    :cond_0
    move/from16 v16, v1

    move v15, v4

    goto :goto_1

    :cond_1
    move v15, v0

    move/from16 v16, v1

    :goto_1
    const/high16 v0, 0x10000000

    and-int/2addr v0, v13

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    .line 4498
    invoke-direct/range {v0 .. v5}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_4

    .line 4507
    :cond_2
    invoke-static {v13}, Ll/ܶ֡ۖ;->ܿ(I)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_9

    const/16 v1, 0x11

    if-eq v0, v1, :cond_9

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_6

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_5

    const/16 v1, 0x44

    if-eq v0, v1, :cond_5

    const/16 v1, 0x31

    if-eq v0, v1, :cond_6

    const/16 v1, 0x32

    if-eq v0, v1, :cond_3

    goto/16 :goto_3

    :cond_3
    and-int v0, v13, v8

    int-to-long v0, v0

    .line 4571
    invoke-static {v0, v1, v7}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, v6, Ll/ܶ֡ۖ;->᩷:Ll/ۧ֡ۖ;

    invoke-interface {v1, v0}, Ll/ۧ֡ۖ;->ᩳ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    .line 4572
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_3

    .line 4575
    :cond_4
    invoke-direct {v6, v11}, Ll/ܶ֡ۖ;->ۧ(I)Ljava/lang/Object;

    move-result-object v0

    .line 4576
    invoke-interface {v1, v0}, Ll/ۧ֡ۖ;->֫(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 4577
    throw v0

    .line 4524
    :cond_5
    invoke-direct {v6, v12, v11, v7}, Ll/ܶ֡ۖ;->֫(IILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 4525
    invoke-direct {v6, v11}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v0

    and-int v1, v13, v8

    int-to-long v1, v1

    .line 4549
    invoke-static {v1, v2, v7}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 4550
    invoke-interface {v0, v1}, Ll/ۢۚۖ;->ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_4

    :cond_6
    and-int v0, v13, v8

    int-to-long v0, v0

    .line 4555
    invoke-static {v0, v1, v7}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 4556
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_3

    .line 4560
    :cond_7
    invoke-direct {v6, v11}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v1

    const/4 v2, 0x0

    .line 4561
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_a

    .line 4562
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 4563
    invoke-interface {v1, v3}, Ll/ۢۚۖ;->ۧ(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    .line 4510
    invoke-direct/range {v0 .. v5}, Ll/ܶ֡ۖ;->֫(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 4512
    invoke-direct {v6, v11}, Ll/ܶ֡ۖ;->ܽ(I)Ll/ۢۚۖ;

    move-result-object v0

    and-int v1, v13, v8

    int-to-long v1, v1

    .line 4549
    invoke-static {v1, v2, v7}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 4550
    invoke-interface {v0, v1}, Ll/ۢۚۖ;->ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_4

    :cond_a
    :goto_3
    add-int/lit8 v10, v10, 0x1

    move v0, v15

    move/from16 v1, v16

    goto/16 :goto_0

    .line 4539
    :cond_b
    iget-boolean v0, v6, Ll/ܶ֡ۖ;->ܿ:Z

    if-eqz v0, :cond_c

    .line 4540
    iget-object v0, v6, Ll/ܶ֡ۖ;->ᩳ:Ll/ܿۘۖ;

    invoke-virtual {v0, v7}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ۘۖ;->᩻()Z

    move-result v0

    if-nez v0, :cond_c

    :goto_4
    return v9

    :cond_c
    return v3
.end method
