.class public final Ll/ܶᩴۧ;
.super Ll/ۙᩴۧ;
.source "M8UR"


# instance fields
.field public final ֡:I

.field public ۖ:Ll/۠ᩴۧ;

.field public ۘ:I

.field public final ۜ:Ll/ܽ֨֫;

.field public ۡ:Ljava/util/List;

.field public final ۢ:[Ll/֨ᩴۧ;

.field public ܺ:Ll/֨ᩴۧ;

.field public ᩴ:Ljava/util/List;

.field public ᩵:I

.field public final ᩷:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 3

    .line 173
    invoke-direct {p0}, Ll/ۙᩴۧ;-><init>()V

    .line 174
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/ܶᩴۧ;->᩷:Ll/ᩳ֨֫;

    .line 175
    new-instance v0, Ll/ܽ֨֫;

    invoke-direct {v0}, Ll/ܽ֨֫;-><init>()V

    iput-object v0, p0, Ll/ܶᩴۧ;->ۜ:Ll/ܽ֨֫;

    const/4 v0, -0x1

    .line 176
    iput v0, p0, Ll/ܶᩴۧ;->᩵:I

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    .line 177
    :cond_0
    iput p1, p0, Ll/ܶᩴۧ;->֡:I

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    .line 180
    sget v0, Ll/ᩳۚ֫;->֫:I

    .line 151
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 152
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    if-ne v0, v1, :cond_1

    .line 153
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    aget-byte p2, p2, p1

    :cond_1
    const/16 p2, 0x8

    new-array v0, p2, [Ll/֨ᩴۧ;

    .line 182
    iput-object v0, p0, Ll/ܶᩴۧ;->ۢ:[Ll/֨ᩴۧ;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_2

    .line 184
    iget-object v1, p0, Ll/ܶᩴۧ;->ۢ:[Ll/֨ᩴۧ;

    new-instance v2, Ll/֨ᩴۧ;

    invoke-direct {v2}, Ll/֨ᩴۧ;-><init>()V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 187
    :cond_2
    iget-object p2, p0, Ll/ܶᩴۧ;->ۢ:[Ll/֨ᩴۧ;

    aget-object p1, p2, p1

    iput-object p1, p0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    return-void
.end method

.method private ۜ()V
    .locals 21

    move-object/from16 v0, p0

    .line 285
    iget-object v1, v0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    if-nez v1, :cond_0

    return-void

    .line 296
    :cond_0
    iget v2, v1, Ll/۠ᩴۧ;->֫:I

    iget v1, v1, Ll/۠ᩴۧ;->ܽ:I

    const/4 v3, 0x2

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, -0x1

    if-eq v2, v1, :cond_1

    .line 297
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DtvCcPacket ended prematurely; size is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    iget v2, v2, Ll/۠ᩴۧ;->ܽ:I

    mul-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", but current index is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    iget v2, v2, Ll/۠ᩴۧ;->֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " (sequence number "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    iget v2, v2, Ll/۠ᩴۧ;->ᩳ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ");"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;)V

    .line 324
    :cond_1
    iget-object v1, v0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    iget-object v2, v1, Ll/۠ᩴۧ;->ۧ:[B

    iget v1, v1, Ll/۠ᩴۧ;->֫:I

    iget-object v4, v0, Ll/ܶᩴۧ;->ۜ:Ll/ܽ֨֫;

    invoke-virtual {v4, v1, v2}, Ll/ܽ֨֫;->ܽ(I[B)V

    const/4 v1, 0x0

    .line 325
    :cond_2
    :goto_0
    invoke-virtual {v4}, Ll/ܽ֨֫;->֫()I

    move-result v2

    if-lez v2, :cond_2f

    const/4 v2, 0x3

    .line 327
    invoke-virtual {v4, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    const/4 v6, 0x5

    .line 328
    invoke-virtual {v4, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    const/4 v7, 0x6

    const/4 v8, 0x7

    if-ne v5, v8, :cond_3

    .line 331
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 332
    invoke-virtual {v4, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    if-ge v5, v8, :cond_3

    const-string v9, "Invalid extended service number: "

    .line 0
    invoke-static {v5, v9}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    :cond_3
    if-nez v6, :cond_4

    if-eqz v5, :cond_2f

    .line 341
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "serviceNumber is non-zero ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ") when blockSize is 0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_a

    .line 346
    :cond_4
    iget v9, v0, Ll/ܶᩴۧ;->֡:I

    if-eq v5, v9, :cond_5

    .line 347
    invoke-virtual {v4, v6}, Ll/ܽ֨֫;->ܳ(I)V

    goto :goto_0

    .line 353
    :cond_5
    invoke-virtual {v4}, Ll/ܽ֨֫;->ᩳ()I

    move-result v5

    mul-int/lit8 v6, v6, 0x8

    add-int/2addr v6, v5

    .line 354
    :cond_6
    :goto_1
    :pswitch_0
    invoke-virtual {v4}, Ll/ܽ֨֫;->ᩳ()I

    move-result v5

    if-ge v5, v6, :cond_2

    const/16 v5, 0x8

    .line 355
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    const/16 v10, 0x17

    const/16 v11, 0x9f

    const/16 v12, 0x7f

    const/16 v13, 0x18

    const/16 v14, 0x1f

    const/16 v15, 0x10

    if-eq v9, v15, :cond_1a

    if-gt v9, v14, :cond_b

    if-eqz v9, :cond_6

    if-eq v9, v2, :cond_a

    if-eq v9, v5, :cond_9

    packed-switch v9, :pswitch_data_0

    const/16 v11, 0x11

    if-lt v9, v11, :cond_7

    if-gt v9, v10, :cond_7

    .line 419
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Currently unsupported COMMAND_EXT1 Command: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 420
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_1

    .line 412
    :pswitch_1
    iget-object v5, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v9, 0xa

    invoke-virtual {v5, v9}, Ll/֨ᩴۧ;->֫(C)V

    goto :goto_1

    .line 409
    :pswitch_2
    invoke-direct/range {p0 .. p0}, Ll/ܶᩴۧ;->ۢ()V

    goto :goto_1

    :cond_7
    if-lt v9, v13, :cond_8

    if-gt v9, v14, :cond_8

    .line 422
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "Currently unsupported COMMAND_P16 Command: "

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 423
    invoke-virtual {v4, v15}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_1

    :cond_8
    const-string v5, "Invalid C0 command: "

    .line 0
    :goto_2
    invoke-static {v9, v5}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    goto :goto_1

    .line 406
    :cond_9
    iget-object v5, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v5}, Ll/֨ᩴۧ;->֫()V

    goto :goto_1

    .line 403
    :cond_a
    invoke-direct/range {p0 .. p0}, Ll/ܶᩴۧ;->᩷()Ljava/util/List;

    move-result-object v5

    iput-object v5, v0, Ll/ܶᩴۧ;->ۡ:Ljava/util/List;

    goto :goto_1

    :cond_b
    if-gt v9, v12, :cond_d

    if-ne v9, v12, :cond_c

    .line 577
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x266b

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 579
    :cond_c
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    and-int/lit16 v5, v9, 0xff

    int-to-char v5, v5

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    :cond_d
    if-gt v9, v11, :cond_17

    const/4 v1, 0x4

    .line 432
    iget-object v10, v0, Ll/ܶᩴۧ;->ۢ:[Ll/֨ᩴۧ;

    packed-switch v9, :pswitch_data_1

    :pswitch_3
    const-string v1, "Invalid C1 command: "

    .line 0
    :goto_3
    invoke-static {v9, v1}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    goto/16 :goto_9

    :pswitch_4
    add-int/lit16 v9, v9, -0x98

    .line 775
    aget-object v11, v10, v9

    .line 779
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 780
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v12

    .line 783
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 784
    invoke-virtual {v4, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v13

    .line 786
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v14

    .line 787
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v15

    .line 789
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v16

    .line 791
    invoke-virtual {v4, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v18

    .line 792
    invoke-virtual {v4, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v17

    .line 794
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 796
    invoke-virtual {v4, v7}, Ll/ܽ֨֫;->ܿ(I)V

    .line 798
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 799
    invoke-virtual {v4, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v19

    .line 800
    invoke-virtual {v4, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v20

    .line 802
    invoke-virtual/range {v11 .. v20}, Ll/֨ᩴۧ;->֫(ZIZIIIIII)V

    .line 536
    iget v1, v0, Ll/ܶᩴۧ;->ۘ:I

    if-eq v1, v9, :cond_18

    .line 537
    iput v9, v0, Ll/ܶᩴۧ;->ۘ:I

    .line 538
    aget-object v1, v10, v9

    iput-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    goto/16 :goto_9

    .line 518
    :pswitch_5
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v1}, Ll/֨ᩴۧ;->ܿ()Z

    move-result v1

    if-nez v1, :cond_e

    const/16 v1, 0x20

    .line 520
    invoke-virtual {v4, v1}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_9

    .line 741
    :cond_e
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    .line 742
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 743
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    .line 744
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    .line 745
    invoke-static {v9, v10, v11, v1}, Ll/֨ᩴۧ;->֫(IIII)I

    move-result v1

    .line 747
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    .line 748
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 749
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    .line 750
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    const/4 v12, 0x0

    .line 1369
    invoke-static {v9, v10, v11, v12}, Ll/֨ᩴۧ;->֫(IIII)I

    .line 753
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    .line 756
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    .line 757
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    .line 758
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    .line 759
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 762
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 764
    iget-object v5, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v5, v1, v9}, Ll/֨ᩴۧ;->ۧ(II)V

    goto/16 :goto_9

    .line 510
    :pswitch_6
    iget-object v5, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v5}, Ll/֨ᩴۧ;->ܿ()Z

    move-result v5

    if-nez v5, :cond_f

    .line 512
    invoke-virtual {v4, v15}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_9

    .line 729
    :cond_f
    invoke-virtual {v4, v1}, Ll/ܽ֨֫;->ܿ(I)V

    .line 730
    invoke-virtual {v4, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    .line 732
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 733
    invoke-virtual {v4, v7}, Ll/ܽ֨֫;->ۧ(I)I

    .line 735
    iget-object v5, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v5, v1}, Ll/֨ᩴۧ;->֫(I)V

    goto/16 :goto_9

    .line 502
    :pswitch_7
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v1}, Ll/֨ᩴۧ;->ܿ()Z

    move-result v1

    if-nez v1, :cond_10

    .line 504
    invoke-virtual {v4, v13}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_9

    .line 703
    :cond_10
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    .line 704
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    .line 705
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 706
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    .line 708
    invoke-static {v5, v9, v10, v1}, Ll/֨ᩴۧ;->֫(IIII)I

    move-result v1

    .line 710
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    .line 711
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 712
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    .line 713
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    .line 715
    invoke-static {v9, v10, v11, v5}, Ll/֨ᩴۧ;->֫(IIII)I

    move-result v5

    .line 717
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 718
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 719
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    .line 720
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    const/4 v12, 0x0

    .line 1369
    invoke-static {v9, v10, v11, v12}, Ll/֨ᩴۧ;->֫(IIII)I

    .line 723
    iget-object v9, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v9, v1, v5}, Ll/֨ᩴۧ;->֫(II)V

    goto/16 :goto_9

    .line 494
    :pswitch_8
    iget-object v5, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v5}, Ll/֨ᩴۧ;->ܿ()Z

    move-result v5

    if-nez v5, :cond_11

    .line 496
    invoke-virtual {v4, v15}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_9

    .line 687
    :cond_11
    invoke-virtual {v4, v1}, Ll/ܽ֨֫;->ۧ(I)I

    .line 688
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    .line 689
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ۧ(I)I

    .line 691
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    .line 692
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    .line 693
    invoke-virtual {v4, v2}, Ll/ܽ֨֫;->ۧ(I)I

    .line 694
    invoke-virtual {v4, v2}, Ll/ܽ֨֫;->ۧ(I)I

    .line 696
    iget-object v9, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v9, v1, v5}, Ll/֨ᩴۧ;->֫(ZZ)V

    goto/16 :goto_9

    .line 491
    :pswitch_9
    invoke-direct/range {p0 .. p0}, Ll/ܶᩴۧ;->ۢ()V

    goto/16 :goto_9

    .line 485
    :pswitch_a
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_9

    :pswitch_b
    const/4 v1, 0x1

    :goto_4
    if-gt v1, v5, :cond_18

    .line 478
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_12

    rsub-int/lit8 v9, v1, 0x8

    .line 479
    aget-object v9, v10, v9

    invoke-virtual {v9}, Ll/֨ᩴۧ;->ۜ()V

    :cond_12
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :pswitch_c
    const/4 v1, 0x1

    :goto_5
    if-gt v1, v5, :cond_18

    .line 470
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_13

    rsub-int/lit8 v9, v1, 0x8

    .line 471
    aget-object v9, v10, v9

    .line 472
    invoke-virtual {v9}, Ll/֨ᩴۧ;->᩻()Z

    move-result v11

    xor-int/lit8 v11, v11, 0x1

    invoke-virtual {v9, v11}, Ll/֨ᩴۧ;->֫(Z)V

    :cond_13
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :pswitch_d
    const/4 v1, 0x1

    :goto_6
    if-gt v1, v5, :cond_18

    .line 463
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_14

    rsub-int/lit8 v9, v1, 0x8

    .line 464
    aget-object v9, v10, v9

    const/4 v11, 0x0

    invoke-virtual {v9, v11}, Ll/֨ᩴۧ;->֫(Z)V

    :cond_14
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :pswitch_e
    const/4 v1, 0x1

    :goto_7
    if-gt v1, v5, :cond_18

    .line 456
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_15

    rsub-int/lit8 v9, v1, 0x8

    .line 457
    aget-object v9, v10, v9

    const/4 v11, 0x1

    invoke-virtual {v9, v11}, Ll/֨ᩴۧ;->֫(Z)V

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :pswitch_f
    const/4 v1, 0x1

    :goto_8
    if-gt v1, v5, :cond_18

    .line 449
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_16

    rsub-int/lit8 v9, v1, 0x8

    .line 450
    aget-object v9, v10, v9

    invoke-virtual {v9}, Ll/֨ᩴۧ;->ᩳ()V

    :cond_16
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :pswitch_10
    add-int/lit8 v9, v9, -0x80

    .line 442
    iget v1, v0, Ll/ܶᩴۧ;->ۘ:I

    if-eq v1, v9, :cond_18

    .line 443
    iput v9, v0, Ll/ܶᩴۧ;->ۘ:I

    .line 444
    aget-object v1, v10, v9

    iput-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    goto :goto_9

    :cond_17
    const/16 v5, 0xff

    if-gt v9, v5, :cond_19

    .line 584
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    and-int/lit16 v5, v9, 0xff

    int-to-char v5, v5

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    :cond_18
    :goto_9
    :pswitch_11
    const/4 v1, 0x1

    goto/16 :goto_1

    :cond_19
    const-string v5, "Invalid base command: "

    goto/16 :goto_2

    .line 374
    :cond_1a
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    if-gt v9, v14, :cond_1e

    if-gt v9, v8, :cond_1b

    goto/16 :goto_1

    :cond_1b
    const/16 v11, 0xf

    if-gt v9, v11, :cond_1c

    .line 551
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_1

    :cond_1c
    if-gt v9, v10, :cond_1d

    .line 553
    invoke-virtual {v4, v15}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_1

    :cond_1d
    if-gt v9, v14, :cond_6

    .line 555
    invoke-virtual {v4, v13}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_1

    :cond_1e
    const/16 v5, 0xa0

    if-gt v9, v12, :cond_29

    const/16 v1, 0x20

    if-eq v9, v1, :cond_28

    const/16 v1, 0x21

    if-eq v9, v1, :cond_27

    const/16 v1, 0x25

    if-eq v9, v1, :cond_26

    const/16 v1, 0x2a

    if-eq v9, v1, :cond_25

    const/16 v1, 0x2c

    if-eq v9, v1, :cond_24

    const/16 v1, 0x3f

    if-eq v9, v1, :cond_23

    const/16 v1, 0x39

    if-eq v9, v1, :cond_22

    const/16 v1, 0x3a

    if-eq v9, v1, :cond_21

    const/16 v1, 0x3c

    if-eq v9, v1, :cond_20

    const/16 v1, 0x3d

    if-eq v9, v1, :cond_1f

    packed-switch v9, :pswitch_data_2

    packed-switch v9, :pswitch_data_3

    const-string v1, "Invalid G2 character: "

    goto/16 :goto_3

    .line 620
    :pswitch_12
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2022

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto :goto_9

    .line 617
    :pswitch_13
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x201d

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto :goto_9

    .line 614
    :pswitch_14
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x201c

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto :goto_9

    .line 611
    :pswitch_15
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2019

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto :goto_9

    .line 608
    :pswitch_16
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2018

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 605
    :pswitch_17
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2588

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 665
    :pswitch_18
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x250c

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 662
    :pswitch_19
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2518

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 659
    :pswitch_1a
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2500

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 656
    :pswitch_1b
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2514

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 653
    :pswitch_1c
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2510

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 650
    :pswitch_1d
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2502

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 647
    :pswitch_1e
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x215e

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 644
    :pswitch_1f
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x215d

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 641
    :pswitch_20
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x215c

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 638
    :pswitch_21
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x215b

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 632
    :cond_1f
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2120

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 629
    :cond_20
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x153

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 626
    :cond_21
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x161

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 623
    :cond_22
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2122

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 635
    :cond_23
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x178

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 602
    :cond_24
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x152

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 599
    :cond_25
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x160

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 596
    :cond_26
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x2026

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 593
    :cond_27
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    .line 590
    :cond_28
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x20

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    :cond_29
    const/16 v10, 0x20

    if-gt v9, v11, :cond_2c

    const/16 v5, 0x87

    if-gt v9, v5, :cond_2a

    .line 562
    invoke-virtual {v4, v10}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_1

    :cond_2a
    const/16 v5, 0x8f

    if-gt v9, v5, :cond_2b

    const/16 v5, 0x28

    .line 564
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_1

    :cond_2b
    if-gt v9, v11, :cond_6

    .line 569
    invoke-virtual {v4, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 570
    invoke-virtual {v4, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    mul-int/lit8 v5, v5, 0x8

    .line 571
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_1

    :cond_2c
    const/16 v10, 0xff

    if-gt v9, v10, :cond_2e

    if-ne v9, v5, :cond_2d

    .line 676
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x33c4

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    :cond_2d
    const-string v1, "Invalid G3 character: "

    .line 0
    invoke-static {v9, v1}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    .line 680
    iget-object v1, v0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    const/16 v5, 0x5f

    invoke-virtual {v1, v5}, Ll/֨ᩴۧ;->֫(C)V

    goto/16 :goto_9

    :cond_2e
    const-string v5, "Invalid extended command: "

    goto/16 :goto_2

    :cond_2f
    :goto_a
    if-eqz v1, :cond_30

    .line 393
    invoke-direct/range {p0 .. p0}, Ll/ܶᩴۧ;->᩷()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Ll/ܶᩴۧ;->ۡ:Ljava/util/List;

    :cond_30
    const/4 v1, 0x0

    .line 291
    iput-object v1, v0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_11
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x30
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x76
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
    .end packed-switch
.end method

.method private ۢ()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    .line 834
    iget-object v1, p0, Ll/ܶᩴۧ;->ۢ:[Ll/֨ᩴۧ;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ll/֨ᩴۧ;->ۜ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ᩷()Ljava/util/List;
    .locals 5

    .line 815
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_1

    .line 817
    iget-object v3, p0, Ll/ܶᩴۧ;->ۢ:[Ll/֨ᩴۧ;

    aget-object v4, v3, v2

    invoke-virtual {v4}, Ll/֨ᩴۧ;->ܳ()Z

    move-result v4

    if-nez v4, :cond_0

    aget-object v4, v3, v2

    invoke-virtual {v4}, Ll/֨ᩴۧ;->᩻()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 818
    aget-object v3, v3, v2

    invoke-virtual {v3}, Ll/֨ᩴۧ;->ۧ()Ll/ۚᩴۧ;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 820
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 824
    :cond_1
    invoke-static {}, Ll/ۚᩴۧ;->֫()Ll/֡ᩴۧ;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 825
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 826
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 827
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚᩴۧ;

    iget-object v3, v3, Ll/ۚᩴۧ;->֫:Ll/᩶֡֫;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 829
    :cond_2
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final flush()V
    .locals 3

    .line 197
    invoke-super {p0}, Ll/ۙᩴۧ;->flush()V

    const/4 v0, 0x0

    .line 198
    iput-object v0, p0, Ll/ܶᩴۧ;->ۡ:Ljava/util/List;

    .line 199
    iput-object v0, p0, Ll/ܶᩴۧ;->ᩴ:Ljava/util/List;

    const/4 v1, 0x0

    .line 200
    iput v1, p0, Ll/ܶᩴۧ;->ۘ:I

    .line 201
    iget-object v2, p0, Ll/ܶᩴۧ;->ۢ:[Ll/֨ᩴۧ;

    aget-object v1, v2, v1

    iput-object v1, p0, Ll/ܶᩴۧ;->ܺ:Ll/֨ᩴۧ;

    .line 202
    invoke-direct {p0}, Ll/ܶᩴۧ;->ۢ()V

    .line 203
    iput-object v0, p0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "Cea708Decoder"

    return-object v0
.end method

.method public final bridge synthetic ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ᩳᩴۧ;)V
    .locals 9

    .line 220
    iget-object p1, p1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    .line 223
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    iget-object v1, p0, Ll/ܶᩴۧ;->᩷:Ll/ᩳ֨֫;

    invoke-virtual {v1, p1, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 224
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    const/4 v0, 0x3

    if-lt p1, v0, :cond_9

    .line 225
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    and-int/lit8 v2, p1, 0x3

    const/4 v3, 0x4

    and-int/2addr p1, v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne p1, v3, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 229
    :goto_1
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    int-to-byte v6, v6

    .line 230
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result v7

    int-to-byte v7, v7

    const/4 v8, 0x2

    if-eq v2, v8, :cond_2

    if-eq v2, v0, :cond_2

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    if-ne v2, v0, :cond_6

    .line 243
    invoke-direct {p0}, Ll/ܶᩴۧ;->ۜ()V

    and-int/lit16 p1, v6, 0xc0

    shr-int/lit8 p1, p1, 0x6

    .line 246
    iget v0, p0, Ll/ܶᩴۧ;->᩵:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    add-int/lit8 v0, v0, 0x1

    rem-int/2addr v0, v3

    if-eq p1, v0, :cond_4

    .line 248
    invoke-direct {p0}, Ll/ܶᩴۧ;->ۢ()V

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Sequence number discontinuity. previous="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ܶᩴۧ;->᩵:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " current="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 256
    :cond_4
    iput p1, p0, Ll/ܶᩴۧ;->᩵:I

    and-int/lit8 v0, v6, 0x3f

    if-nez v0, :cond_5

    const/16 v0, 0x40

    .line 263
    :cond_5
    new-instance v2, Ll/۠ᩴۧ;

    invoke-direct {v2, p1, v0}, Ll/۠ᩴۧ;-><init>(II)V

    iput-object v2, p0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    .line 264
    iput v5, v2, Ll/۠ᩴۧ;->֫:I

    iget-object p1, v2, Ll/۠ᩴۧ;->ۧ:[B

    aput-byte v7, p1, v4

    goto :goto_2

    :cond_6
    if-ne v2, v8, :cond_7

    const/4 v4, 0x1

    .line 267
    :cond_7
    invoke-static {v4}, Ll/᩺֡֫;->֫(Z)V

    .line 269
    iget-object p1, p0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    if-nez p1, :cond_8

    const-string p1, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START"

    .line 270
    invoke-static {p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 274
    :cond_8
    iget-object v0, p1, Ll/۠ᩴۧ;->ۧ:[B

    iget v2, p1, Ll/۠ᩴۧ;->֫:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p1, Ll/۠ᩴۧ;->֫:I

    aput-byte v6, v0, v2

    add-int/2addr v2, v8

    .line 275
    iput v2, p1, Ll/۠ᩴۧ;->֫:I

    aput-byte v7, v0, v3

    .line 278
    :goto_2
    iget-object p1, p0, Ll/ܶᩴۧ;->ۖ:Ll/۠ᩴۧ;

    iget v0, p1, Ll/۠ᩴۧ;->֫:I

    iget p1, p1, Ll/۠ᩴۧ;->ܽ:I

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr p1, v5

    if-ne v0, p1, :cond_0

    .line 279
    invoke-direct {p0}, Ll/ܶᩴۧ;->ۜ()V

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method public final ᩳ()Ll/ܰۘۧ;
    .locals 2

    .line 213
    iget-object v0, p0, Ll/ܶᩴۧ;->ۡ:Ljava/util/List;

    iput-object v0, p0, Ll/ܶᩴۧ;->ᩴ:Ljava/util/List;

    .line 214
    new-instance v1, Ll/ۗᩴۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    invoke-direct {v1, v0}, Ll/ۗᩴۧ;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method public final ᩻()Z
    .locals 2

    .line 208
    iget-object v0, p0, Ll/ܶᩴۧ;->ۡ:Ljava/util/List;

    iget-object v1, p0, Ll/ܶᩴۧ;->ᩴ:Ljava/util/List;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
