.class public final Ll/֫ۜܺ;
.super Ljava/lang/Object;
.source "85A3"


# instance fields
.field public final ֡:Ll/ܽ᩷ܺ;

.field public final ֨:Ll/ۙۜܺ;

.field public final ֫:Ll/ۙۜܺ;

.field public final ۖ:Ll/ۤۜܺ;

.field public final ۘ:[Ll/ۛۜܺ;

.field public final ۚ:Ll/ۙۜܺ;

.field public ۜ:I

.field public final ۡ:Ll/۠ۜܺ;

.field public final ۢ:Ll/ۙۜܺ;

.field public final ۧ:Ll/᩸᩻ܺ;

.field public ܳ:I

.field public final ܺ:Ll/᩸ۜܺ;

.field public final ܽ:Ll/ۙۜܺ;

.field public final ܿ:Ll/ۢܿܺ;

.field public final ᩳ:Ll/۬᩻ܺ;

.field public final ᩴ:Ll/ۙۜܺ;

.field public final ᩵:Ll/֫᩷ܺ;

.field public final ᩷:Ll/ۢۜܺ;

.field public final ᩻:Ll/ۜۜܺ;


# direct methods
.method public constructor <init>(Ll/ۢܿܺ;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 155
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 156
    iput-object v1, v0, Ll/֫ۜܺ;->ܿ:Ll/ۢܿܺ;

    .line 158
    new-instance v2, Ll/ۢۜܺ;

    invoke-direct {v2, v0}, Ll/ۢۜܺ;-><init>(Ll/֫ۜܺ;)V

    iput-object v2, v0, Ll/֫ۜܺ;->᩷:Ll/ۢۜܺ;

    .line 159
    new-instance v3, Ll/ۙۜܺ;

    sget-object v4, Ll/᩶ۜܺ;->᩶:Ll/᩶ۜܺ;

    const/4 v5, 0x0

    const/4 v6, 0x4

    invoke-direct {v3, v5, v0, v6, v4}, Ll/ۙۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;ILl/᩶ۜܺ;)V

    iput-object v3, v0, Ll/֫ۜܺ;->ۚ:Ll/ۙۜܺ;

    .line 160
    new-instance v7, Ll/ۙۜܺ;

    sget-object v8, Ll/᩶ۜܺ;->ۙ:Ll/᩶ۜܺ;

    const-string v9, "word_data"

    invoke-direct {v7, v9, v0, v6, v8}, Ll/ۙۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;ILl/᩶ۜܺ;)V

    iput-object v7, v0, Ll/֫ۜܺ;->֨:Ll/ۙۜܺ;

    .line 161
    new-instance v9, Ll/ۙۜܺ;

    sget-object v10, Ll/᩶ۜܺ;->᩹:Ll/᩶ۜܺ;

    const-string v11, "string_data"

    const/4 v12, 0x1

    invoke-direct {v9, v11, v0, v12, v10}, Ll/ۙۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;ILl/᩶ۜܺ;)V

    iput-object v9, v0, Ll/֫ۜܺ;->ᩴ:Ll/ۙۜܺ;

    .line 163
    new-instance v10, Ll/ۙۜܺ;

    invoke-direct {v10, v5, v0, v12, v4}, Ll/ۙۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;ILl/᩶ۜܺ;)V

    iput-object v10, v0, Ll/֫ۜܺ;->ܽ:Ll/ۙۜܺ;

    .line 164
    new-instance v5, Ll/ۙۜܺ;

    const-string v11, "byte_data"

    invoke-direct {v5, v11, v0, v12, v8}, Ll/ۙۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;ILl/᩶ۜܺ;)V

    iput-object v5, v0, Ll/֫ۜܺ;->֫:Ll/ۙۜܺ;

    .line 165
    new-instance v8, Ll/֫᩷ܺ;

    invoke-direct {v8, v0}, Ll/֫᩷ܺ;-><init>(Ll/֫ۜܺ;)V

    iput-object v8, v0, Ll/֫ۜܺ;->᩵:Ll/֫᩷ܺ;

    .line 166
    new-instance v11, Ll/ܽ᩷ܺ;

    invoke-direct {v11, v0}, Ll/ܽ᩷ܺ;-><init>(Ll/֫ۜܺ;)V

    iput-object v11, v0, Ll/֫ۜܺ;->֡:Ll/ܽ᩷ܺ;

    .line 167
    new-instance v12, Ll/ۤۜܺ;

    invoke-direct {v12, v0}, Ll/ۤۜܺ;-><init>(Ll/֫ۜܺ;)V

    iput-object v12, v0, Ll/֫ۜܺ;->ۖ:Ll/ۤۜܺ;

    .line 168
    new-instance v13, Ll/ۜۜܺ;

    invoke-direct {v13, v0}, Ll/ۜۜܺ;-><init>(Ll/֫ۜܺ;)V

    iput-object v13, v0, Ll/֫ۜܺ;->᩻:Ll/ۜۜܺ;

    .line 169
    new-instance v15, Ll/᩸ۜܺ;

    invoke-direct {v15, v0}, Ll/᩸ۜܺ;-><init>(Ll/֫ۜܺ;)V

    iput-object v15, v0, Ll/֫ۜܺ;->ܺ:Ll/᩸ۜܺ;

    .line 170
    new-instance v14, Ll/۬᩻ܺ;

    invoke-direct {v14, v0}, Ll/۬᩻ܺ;-><init>(Ll/֫ۜܺ;)V

    iput-object v14, v0, Ll/֫ۜܺ;->ᩳ:Ll/۬᩻ܺ;

    move-object/from16 v16, v10

    .line 171
    new-instance v10, Ll/ۙۜܺ;

    move-object/from16 v17, v5

    const-string v5, "map"

    invoke-direct {v10, v5, v0, v6, v4}, Ll/ۙۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;ILl/᩶ۜܺ;)V

    iput-object v10, v0, Ll/֫ۜܺ;->ۢ:Ll/ۙۜܺ;

    const/16 v4, 0x1a

    .line 177
    invoke-virtual {v1, v4}, Ll/ۢܿܺ;->֫(I)Z

    move-result v1

    const/16 v6, 0xa

    const/16 v18, 0x9

    const/16 v19, 0x8

    const/16 v20, 0x7

    const/16 v21, 0x6

    const/16 v22, 0x5

    const/16 v23, 0x3

    const/16 v24, 0x2

    const/16 v25, 0x0

    if-eqz v1, :cond_0

    .line 184
    new-instance v1, Ll/᩸᩻ܺ;

    invoke-direct {v1, v0}, Ll/᩸᩻ܺ;-><init>(Ll/֫ۜܺ;)V

    iput-object v1, v0, Ll/֫ۜܺ;->ۧ:Ll/᩸᩻ܺ;

    const/16 v26, 0xc

    .line 185
    new-instance v4, Ll/۠ۜܺ;

    invoke-direct {v4, v0}, Ll/۠ۜܺ;-><init>(Ll/֫ۜܺ;)V

    iput-object v4, v0, Ll/֫ۜܺ;->ۡ:Ll/۠ۜܺ;

    const/16 v27, 0x4

    const/16 v5, 0xf

    new-array v5, v5, [Ll/ۛۜܺ;

    aput-object v2, v5, v25

    const/4 v2, 0x1

    aput-object v8, v5, v2

    aput-object v11, v5, v24

    aput-object v12, v5, v23

    aput-object v13, v5, v27

    aput-object v15, v5, v22

    aput-object v14, v5, v21

    aput-object v1, v5, v20

    aput-object v4, v5, v19

    aput-object v7, v5, v18

    aput-object v3, v5, v6

    const/16 v1, 0xb

    aput-object v9, v5, v1

    aput-object v17, v5, v26

    const/16 v1, 0xd

    aput-object v16, v5, v1

    const/16 v1, 0xe

    aput-object v10, v5, v1

    .line 187
    iput-object v5, v0, Ll/֫ۜܺ;->ۘ:[Ll/ۛۜܺ;

    goto :goto_0

    :cond_0
    const/16 v1, 0xd

    const/16 v4, 0xc

    const/4 v5, 0x0

    const/16 v26, 0x4

    .line 192
    iput-object v5, v0, Ll/֫ۜܺ;->ۧ:Ll/᩸᩻ܺ;

    .line 193
    iput-object v5, v0, Ll/֫ۜܺ;->ۡ:Ll/۠ۜܺ;

    new-array v1, v1, [Ll/ۛۜܺ;

    aput-object v2, v1, v25

    const/4 v2, 0x1

    aput-object v8, v1, v2

    aput-object v11, v1, v24

    aput-object v12, v1, v23

    aput-object v13, v1, v26

    aput-object v15, v1, v22

    aput-object v14, v1, v21

    aput-object v7, v1, v20

    aput-object v3, v1, v19

    aput-object v9, v1, v18

    aput-object v17, v1, v6

    const/16 v2, 0xb

    aput-object v16, v1, v2

    aput-object v10, v1, v4

    .line 195
    iput-object v1, v0, Ll/֫ۜܺ;->ۘ:[Ll/ۛۜܺ;

    :goto_0
    const/4 v1, -0x1

    .line 200
    iput v1, v0, Ll/֫ۜܺ;->ۜ:I

    const/16 v1, 0x4f

    .line 201
    iput v1, v0, Ll/֫ۜܺ;->ܳ:I

    return-void
.end method

.method private ֫(ZLl/۟᩻ܺ;)Ll/ᩳᩴܺ;
    .locals 13

    .line 653
    iget-object v0, p0, Ll/֫ۜܺ;->ᩳ:Ll/۬᩻ܺ;

    invoke-virtual {v0}, Ll/ۛۜܺ;->ܿ()V

    .line 654
    iget-object v0, p0, Ll/֫ۜܺ;->ܽ:Ll/ۙۜܺ;

    invoke-virtual {v0}, Ll/ۛۜܺ;->ܿ()V

    .line 655
    iget-object v0, p0, Ll/֫ۜܺ;->֨:Ll/ۙۜܺ;

    invoke-virtual {v0}, Ll/ۛۜܺ;->ܿ()V

    .line 656
    iget-object v1, p0, Ll/֫ۜܺ;->ܿ:Ll/ۢܿܺ;

    const/16 v2, 0x1a

    invoke-virtual {v1, v2}, Ll/ۢܿܺ;->֫(I)Z

    move-result v3

    iget-object v4, p0, Ll/֫ۜܺ;->ۧ:Ll/᩸᩻ܺ;

    if-eqz v3, :cond_0

    .line 658
    invoke-virtual {v4}, Ll/ۛۜܺ;->ܿ()V

    .line 660
    :cond_0
    iget-object v3, p0, Ll/֫ۜܺ;->֫:Ll/ۙۜܺ;

    invoke-virtual {v3}, Ll/ۛۜܺ;->ܿ()V

    .line 661
    invoke-virtual {v1, v2}, Ll/ۢܿܺ;->֫(I)Z

    move-result v1

    iget-object v2, p0, Ll/֫ۜܺ;->ۡ:Ll/۠ۜܺ;

    if-eqz v1, :cond_1

    .line 663
    invoke-virtual {v2}, Ll/ۛۜܺ;->ܿ()V

    .line 665
    :cond_1
    iget-object v1, p0, Ll/֫ۜܺ;->ܺ:Ll/᩸ۜܺ;

    invoke-virtual {v1}, Ll/ۛۜܺ;->ܿ()V

    .line 666
    iget-object v1, p0, Ll/֫ۜܺ;->᩻:Ll/ۜۜܺ;

    invoke-virtual {v1}, Ll/ۛۜܺ;->ܿ()V

    .line 667
    iget-object v1, p0, Ll/֫ۜܺ;->ۖ:Ll/ۤۜܺ;

    invoke-virtual {v1}, Ll/ۛۜܺ;->ܿ()V

    .line 668
    iget-object v1, p0, Ll/֫ۜܺ;->ۚ:Ll/ۙۜܺ;

    invoke-virtual {v1}, Ll/ۛۜܺ;->ܿ()V

    .line 669
    iget-object v1, p0, Ll/֫ۜܺ;->֡:Ll/ܽ᩷ܺ;

    invoke-virtual {v1}, Ll/ۛۜܺ;->ܿ()V

    .line 670
    iget-object v1, p0, Ll/֫ۜܺ;->᩵:Ll/֫᩷ܺ;

    invoke-virtual {v1}, Ll/ۛۜܺ;->ܿ()V

    .line 671
    iget-object v1, p0, Ll/֫ۜܺ;->ᩴ:Ll/ۙۜܺ;

    invoke-virtual {v1}, Ll/ۛۜܺ;->ܿ()V

    .line 672
    iget-object v1, p0, Ll/֫ۜܺ;->᩷:Ll/ۢۜܺ;

    invoke-virtual {v1}, Ll/ۛۜܺ;->ܿ()V

    .line 676
    iget-object v1, p0, Ll/֫ۜܺ;->ۘ:[Ll/ۛۜܺ;

    array-length v3, v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    const-string v8, "...while writing section "

    if-ge v6, v3, :cond_7

    .line 680
    aget-object v9, v1, v6

    if-eq v9, v4, :cond_2

    if-ne v9, v2, :cond_3

    .line 681
    :cond_2
    invoke-virtual {v9}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_1

    .line 690
    :cond_3
    invoke-virtual {v9, v7}, Ll/ۛۜܺ;->ۧ(I)I

    move-result v10

    if-lt v10, v7, :cond_6

    .line 696
    iget-object v7, p0, Ll/֫ۜܺ;->ۢ:Ll/ۙۜܺ;

    if-ne v9, v7, :cond_4

    .line 702
    :try_start_0
    invoke-static {v1, v7}, Ll/ᩴۜܺ;->֫([Ll/ۛۜܺ;Ll/ۙۜܺ;)V

    .line 703
    invoke-virtual {v7}, Ll/ۛۜܺ;->ܿ()V

    .line 706
    :cond_4
    instance-of v7, v9, Ll/ۙۜܺ;

    if-eqz v7, :cond_5

    .line 711
    move-object v7, v9

    check-cast v7, Ll/ۙۜܺ;

    invoke-virtual {v7}, Ll/ۙۜܺ;->ۢ()V

    .line 714
    :cond_5
    invoke-virtual {v9}, Ll/ۛۜܺ;->᩷()I

    move-result v7
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v7, v10

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 716
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/۠ۧܺ;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;

    move-result-object p1

    throw p1

    .line 692
    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "bogus placement for section "

    .line 0
    invoke-static {v6, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 692
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 723
    :cond_7
    iput v7, p0, Ll/֫ۜܺ;->ۜ:I

    if-nez p2, :cond_8

    .line 724
    new-array p2, v7, [B

    goto :goto_2

    .line 623
    :cond_8
    iget-object v6, p2, Ll/۟᩻ܺ;->֫:[B

    array-length v6, v6

    if-ge v6, v7, :cond_9

    .line 624
    invoke-static {}, Ljava/util/logging/Logger;->getAnonymousLogger()Ljava/util/logging/Logger;

    move-result-object v6

    sget-object v9, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "DexFile storage too small  "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v11, p2, Ll/۟᩻ܺ;->֫:[B

    array-length v11, v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, " vs "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v9, v10}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 630
    new-array v6, v7, [B

    iput-object v6, p2, Ll/۟᩻ܺ;->֫:[B

    .line 632
    :cond_9
    iget-object p2, p2, Ll/۟᩻ܺ;->֫:[B

    .line 726
    :goto_2
    new-instance v6, Ll/ᩳᩴܺ;

    invoke-direct {v6, p2}, Ll/ᩳᩴܺ;-><init>([B)V

    if-eqz p1, :cond_a

    .line 729
    iget v7, p0, Ll/֫ۜܺ;->ܳ:I

    invoke-virtual {v6, v7}, Ll/ᩳᩴܺ;->ܽ(I)V

    :cond_a
    const/4 v7, 0x0

    :goto_3
    if-ge v7, v3, :cond_f

    const/4 v9, 0x0

    .line 734
    :try_start_1
    aget-object v10, v1, v7

    if-eq v10, v4, :cond_b

    if-ne v10, v2, :cond_c

    .line 735
    :cond_b
    invoke-virtual {v10}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_4

    .line 738
    :cond_c
    invoke-virtual {v10}, Ll/ۛۜܺ;->ܽ()I

    move-result v11

    invoke-virtual {v6}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v12

    sub-int/2addr v11, v12

    if-ltz v11, :cond_d

    .line 743
    invoke-virtual {v6, v11}, Ll/ᩳᩴܺ;->᩷(I)V

    .line 744
    invoke-virtual {v10, v6}, Ll/ۛۜܺ;->֫(Ll/ᩳᩴܺ;)V

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 740
    :cond_d
    new-instance p1, Ll/۠ۧܺ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "excess write of "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    neg-int v0, v11

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 60
    invoke-direct {p1, p2, v9}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 740
    throw p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    move-exception p1

    .line 747
    instance-of p2, p1, Ll/۠ۧܺ;

    if-eqz p2, :cond_e

    .line 748
    check-cast p1, Ll/۠ۧܺ;

    goto :goto_5

    .line 750
    :cond_e
    new-instance p2, Ll/۠ۧܺ;

    .line 69
    invoke-direct {p2, v9, p1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object p1, p2

    .line 752
    :goto_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 753
    throw p1

    .line 757
    :cond_f
    invoke-virtual {v6}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v2

    iget v3, p0, Ll/֫ۜܺ;->ۜ:I

    if-ne v2, v3, :cond_13

    .line 763
    invoke-virtual {v6}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v2

    const-string v3, "unexpected digest write: "

    :try_start_2
    const-string v4, "SHA-1"

    .line 802
    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_3

    const/16 v7, 0x20

    sub-int/2addr v2, v7

    .line 807
    invoke-virtual {v4, p2, v7, v2}, Ljava/security/MessageDigest;->update([BII)V

    const/16 v2, 0xc

    const/16 v7, 0x14

    .line 810
    :try_start_3
    invoke-virtual {v4, p2, v2, v7}, Ljava/security/MessageDigest;->digest([BII)I

    move-result v4
    :try_end_3
    .catch Ljava/security/DigestException; {:try_start_3 .. :try_end_3} :catch_2

    if-ne v4, v7, :cond_12

    .line 764
    invoke-virtual {v6}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v3

    .line 828
    new-instance v4, Ljava/util/zip/Adler32;

    invoke-direct {v4}, Ljava/util/zip/Adler32;-><init>()V

    sub-int/2addr v3, v2

    .line 830
    invoke-virtual {v4, p2, v2, v3}, Ljava/util/zip/Adler32;->update([BII)V

    .line 832
    invoke-virtual {v4}, Ljava/util/zip/Adler32;->getValue()J

    move-result-wide v2

    long-to-int v3, v2

    const/16 v2, 0x8

    int-to-byte v4, v3

    .line 834
    aput-byte v4, p2, v2

    shr-int/lit8 v2, v3, 0x8

    int-to-byte v2, v2

    const/16 v4, 0x9

    .line 835
    aput-byte v2, p2, v4

    shr-int/lit8 v2, v3, 0x10

    int-to-byte v2, v2

    const/16 v4, 0xa

    .line 836
    aput-byte v2, p2, v4

    shr-int/lit8 v2, v3, 0x18

    int-to-byte v2, v2

    const/16 v3, 0xb

    .line 837
    aput-byte v2, p2, v3

    if-eqz p1, :cond_11

    .line 767
    sget-object p1, Ll/ۘۜܺ;->۟:Ll/ۘۜܺ;

    invoke-virtual {v0, v6, p1}, Ll/ۙۜܺ;->֫(Ll/ᩳᩴܺ;Ll/ۘۜܺ;)V

    .line 782
    new-instance p1, Ll/᩺ۜܺ;

    invoke-direct {p1}, Ll/᩺ۜܺ;-><init>()V

    .line 784
    array-length p2, v1

    :goto_6
    if-ge v5, p2, :cond_10

    aget-object v0, v1, v5

    .line 785
    invoke-virtual {p1, v0}, Ll/᩺ۜܺ;->֫(Ll/ۛۜܺ;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 769
    :cond_10
    invoke-virtual {p1, v6}, Ll/᩺ۜܺ;->֫(Ll/ᩳᩴܺ;)V

    .line 770
    invoke-virtual {v6}, Ll/ᩳᩴܺ;->ܽ()V

    :cond_11
    return-object v6

    .line 812
    :cond_12
    :try_start_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " bytes"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catch Ljava/security/DigestException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception p1

    .line 816
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_3
    move-exception p1

    .line 804
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 758
    :cond_13
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "foreshortened write"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֡()Ll/ۙۜܺ;
    .locals 1

    .line 379
    iget-object v0, p0, Ll/֫ۜܺ;->ۚ:Ll/ۙۜܺ;

    return-object v0
.end method

.method public final ֨()[B
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 304
    invoke-direct {p0, v0, v1}, Ll/֫ۜܺ;->֫(ZLl/۟᩻ܺ;)Ll/ᩳᩴܺ;

    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ll/ᩳᩴܺ;->ܿ()[B

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۙۜܺ;
    .locals 1

    .line 521
    iget-object v0, p0, Ll/֫ۜܺ;->֫:Ll/ۙۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;
    .locals 2

    .line 591
    instance-of v0, p1, Ll/۬ܺܺ;

    if-eqz v0, :cond_0

    .line 592
    iget-object v0, p0, Ll/֫ۜܺ;->᩵:Ll/֫᩷ܺ;

    invoke-virtual {v0, p1}, Ll/֫᩷ܺ;->֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;

    move-result-object p1

    return-object p1

    .line 593
    :cond_0
    instance-of v0, p1, Ll/۫ܺܺ;

    if-eqz v0, :cond_1

    .line 594
    iget-object v0, p0, Ll/֫ۜܺ;->֡:Ll/ܽ᩷ܺ;

    invoke-virtual {v0, p1}, Ll/ܽ᩷ܺ;->֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;

    move-result-object p1

    return-object p1

    .line 595
    :cond_1
    instance-of v0, p1, Ll/ܽܺܺ;

    if-eqz v0, :cond_2

    .line 596
    iget-object v0, p0, Ll/֫ۜܺ;->ܺ:Ll/᩸ۜܺ;

    invoke-virtual {v0, p1}, Ll/᩸ۜܺ;->֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;

    move-result-object p1

    return-object p1

    .line 597
    :cond_2
    instance-of v0, p1, Ll/ۡܺܺ;

    iget-object v1, p0, Ll/֫ۜܺ;->᩻:Ll/ۜۜܺ;

    if-eqz v0, :cond_3

    .line 598
    invoke-virtual {v1, p1}, Ll/ۜۜܺ;->֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;

    move-result-object p1

    return-object p1

    .line 599
    :cond_3
    instance-of v0, p1, Ll/ۢܺܺ;

    if-eqz v0, :cond_4

    .line 600
    check-cast p1, Ll/ۢܺܺ;

    invoke-virtual {p1}, Ll/ۢܺܺ;->ᩴ()Ll/ۡܺܺ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۜۜܺ;->ۧ(Ll/ۡܺܺ;)Ll/᩻ۜܺ;

    move-result-object p1

    return-object p1

    .line 601
    :cond_4
    instance-of v0, p1, Ll/ۙܺܺ;

    if-eqz v0, :cond_5

    .line 602
    iget-object v0, p0, Ll/֫ۜܺ;->ۖ:Ll/ۤۜܺ;

    invoke-virtual {v0, p1}, Ll/ۤۜܺ;->֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;

    move-result-object p1

    return-object p1

    .line 603
    :cond_5
    instance-of v0, p1, Ll/᩸ܺܺ;

    if-eqz v0, :cond_6

    .line 604
    iget-object v0, p0, Ll/֫ۜܺ;->ۡ:Ll/۠ۜܺ;

    invoke-virtual {v0, p1}, Ll/۠ۜܺ;->֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;

    move-result-object p1

    return-object p1

    .line 605
    :cond_6
    instance-of v0, p1, Ll/᩻ܺܺ;

    if-eqz v0, :cond_7

    .line 606
    iget-object v0, p0, Ll/֫ۜܺ;->ۧ:Ll/᩸᩻ܺ;

    invoke-virtual {v0, p1}, Ll/᩸᩻ܺ;->֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;

    move-result-object p1

    return-object p1

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/۟᩻ܺ;)Ll/ᩳᩴܺ;
    .locals 1

    const/4 v0, 0x0

    .line 289
    invoke-direct {p0, v0, p1}, Ll/֫ۜܺ;->֫(ZLl/۟᩻ܺ;)Ll/ᩳᩴܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۗ᩻ܺ;)V
    .locals 1

    .line 225
    iget-object v0, p0, Ll/֫ۜܺ;->ᩳ:Ll/۬᩻ܺ;

    invoke-virtual {v0, p1}, Ll/۬᩻ܺ;->֫(Ll/ۗ᩻ܺ;)V

    return-void
.end method

.method public final ۖ()Ll/ۤۜܺ;
    .locals 1

    .line 456
    iget-object v0, p0, Ll/֫ۜܺ;->ۖ:Ll/ۤۜܺ;

    return-object v0
.end method

.method public final ۘ()Ll/ۙۜܺ;
    .locals 1

    .line 353
    iget-object v0, p0, Ll/֫ۜܺ;->ᩴ:Ll/ۙۜܺ;

    return-object v0
.end method

.method public final ۚ()Ll/ۙۜܺ;
    .locals 1

    .line 366
    iget-object v0, p0, Ll/֫ۜܺ;->֨:Ll/ۙۜܺ;

    return-object v0
.end method

.method public final ۜ()Ll/ۙۜܺ;
    .locals 1

    .line 534
    iget-object v0, p0, Ll/֫ۜܺ;->֨:Ll/ۙۜܺ;

    return-object v0
.end method

.method public final ۡ()Ll/۠ۜܺ;
    .locals 1

    .line 495
    iget-object v0, p0, Ll/֫ۜܺ;->ۡ:Ll/۠ۜܺ;

    return-object v0
.end method

.method public final ۢ()Ll/ۙۜܺ;
    .locals 1

    .line 391
    iget-object v0, p0, Ll/֫ۜܺ;->ۢ:Ll/ۙۜܺ;

    return-object v0
.end method

.method public final ۧ()Ll/᩸᩻ܺ;
    .locals 1

    .line 508
    iget-object v0, p0, Ll/֫ۜܺ;->ۧ:Ll/᩸᩻ܺ;

    return-object v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)V
    .locals 2

    if-eqz p1, :cond_7

    .line 562
    instance-of v0, p1, Ll/۬ܺܺ;

    if-eqz v0, :cond_0

    .line 563
    iget-object v0, p0, Ll/֫ۜܺ;->᩵:Ll/֫᩷ܺ;

    check-cast p1, Ll/۬ܺܺ;

    invoke-virtual {v0, p1}, Ll/֫᩷ܺ;->ۧ(Ll/۬ܺܺ;)V

    return-void

    .line 564
    :cond_0
    instance-of v0, p1, Ll/۫ܺܺ;

    if-eqz v0, :cond_1

    .line 565
    iget-object v0, p0, Ll/֫ۜܺ;->֡:Ll/ܽ᩷ܺ;

    check-cast p1, Ll/۫ܺܺ;

    invoke-virtual {v0, p1}, Ll/ܽ᩷ܺ;->ۧ(Ll/۫ܺܺ;)Ll/ۧ᩷ܺ;

    return-void

    .line 566
    :cond_1
    instance-of v0, p1, Ll/ܽܺܺ;

    if-eqz v0, :cond_2

    .line 567
    iget-object v0, p0, Ll/֫ۜܺ;->ܺ:Ll/᩸ۜܺ;

    check-cast p1, Ll/ܽܺܺ;

    invoke-virtual {v0, p1}, Ll/᩸ۜܺ;->ۧ(Ll/ܽܺܺ;)V

    return-void

    .line 568
    :cond_2
    instance-of v0, p1, Ll/ۡܺܺ;

    iget-object v1, p0, Ll/֫ۜܺ;->᩻:Ll/ۜۜܺ;

    if-eqz v0, :cond_3

    .line 569
    check-cast p1, Ll/ۡܺܺ;

    invoke-virtual {v1, p1}, Ll/ۜۜܺ;->ۧ(Ll/ۡܺܺ;)Ll/᩻ۜܺ;

    return-void

    .line 570
    :cond_3
    instance-of v0, p1, Ll/ۢܺܺ;

    if-eqz v0, :cond_4

    .line 571
    check-cast p1, Ll/ۢܺܺ;

    invoke-virtual {p1}, Ll/ۢܺܺ;->ᩴ()Ll/ۡܺܺ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۜۜܺ;->ۧ(Ll/ۡܺܺ;)Ll/᩻ۜܺ;

    return-void

    .line 572
    :cond_4
    instance-of v0, p1, Ll/ۙܺܺ;

    if-eqz v0, :cond_5

    .line 573
    check-cast p1, Ll/ۙܺܺ;

    invoke-virtual {p1}, Ll/ۙܺܺ;->ܺ()Ll/᩺ܺܺ;

    move-result-object p1

    iget-object v0, p0, Ll/֫ۜܺ;->ۖ:Ll/ۤۜܺ;

    invoke-virtual {v0, p1}, Ll/ۤۜܺ;->ۧ(Ll/᩺ܺܺ;)V

    return-void

    .line 574
    :cond_5
    instance-of v0, p1, Ll/᩸ܺܺ;

    if-eqz v0, :cond_6

    .line 575
    iget-object v0, p0, Ll/֫ۜܺ;->ۡ:Ll/۠ۜܺ;

    check-cast p1, Ll/᩸ܺܺ;

    invoke-virtual {v0, p1}, Ll/۠ۜܺ;->ۧ(Ll/᩸ܺܺ;)V

    :cond_6
    return-void

    .line 559
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()Ll/ۜۜܺ;
    .locals 1

    .line 469
    iget-object v0, p0, Ll/֫ۜܺ;->᩻:Ll/ۜۜܺ;

    return-object v0
.end method

.method public final ܺ()Ll/᩸ۜܺ;
    .locals 1

    .line 482
    iget-object v0, p0, Ll/֫ۜܺ;->ܺ:Ll/᩸ۜܺ;

    return-object v0
.end method

.method public final ܽ()Ll/ۙۜܺ;
    .locals 1

    .line 430
    iget-object v0, p0, Ll/֫ۜܺ;->ܽ:Ll/ۙۜܺ;

    return-object v0
.end method

.method public final ܿ()Ll/ۢܿܺ;
    .locals 1

    .line 215
    iget-object v0, p0, Ll/֫ۜܺ;->ܿ:Ll/ۢܿܺ;

    return-object v0
.end method

.method public final ᩳ()Ll/۬᩻ܺ;
    .locals 1

    .line 417
    iget-object v0, p0, Ll/֫ۜܺ;->ᩳ:Ll/۬᩻ܺ;

    return-object v0
.end method

.method public final ᩴ()Ll/֫᩷ܺ;
    .locals 1

    .line 404
    iget-object v0, p0, Ll/֫ۜܺ;->᩵:Ll/֫᩷ܺ;

    return-object v0
.end method

.method public final ᩵()Ll/ܽ᩷ܺ;
    .locals 1

    .line 443
    iget-object v0, p0, Ll/֫ۜܺ;->֡:Ll/ܽ᩷ܺ;

    return-object v0
.end method

.method public final ᩷()Ll/ۙۜܺ;
    .locals 1

    .line 547
    iget-object v0, p0, Ll/֫ۜܺ;->ۢ:Ll/ۙۜܺ;

    return-object v0
.end method

.method public final ᩻()I
    .locals 2

    .line 336
    iget v0, p0, Ll/֫ۜܺ;->ۜ:I

    if-ltz v0, :cond_0

    return v0

    .line 337
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "file size not yet known"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
