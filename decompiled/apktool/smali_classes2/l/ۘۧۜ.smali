.class public final Ll/ۘۧۜ;
.super Ljava/lang/Object;
.source "X770"


# static fields
.field public static final ֫:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "entries"

    const-string v1, "relocations"

    const-string v2, "imports"

    const-string v3, "symbols"

    .line 31
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۘۧۜ;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static ֫(J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    const-string p0, "?"

    return-object p0

    .line 556
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    .line 505
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 508
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " demangled=\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۘۧۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "\""

    .line 0
    invoke-static {v0, p0, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(Ll/۠ܺۢ;)Ljava/lang/String;
    .locals 1

    .line 491
    instance-of v0, p0, Ll/ۚܺۢ;

    if-eqz v0, :cond_0

    .line 492
    check-cast p0, Ll/ۚܺۢ;

    iget-object p0, p0, Ll/ۚܺۢ;->ܽ:Ljava/lang/String;

    return-object p0

    .line 493
    :cond_0
    instance-of v0, p0, Ll/ۨܺۢ;

    if-eqz v0, :cond_1

    .line 494
    check-cast p0, Ll/ۨܺۢ;

    iget-object p0, p0, Ll/ۨܺۢ;->ᩳ:Ljava/lang/String;

    return-object p0

    .line 495
    :cond_1
    instance-of v0, p0, Ll/᩶ܺۢ;

    if-eqz v0, :cond_2

    .line 496
    check-cast p0, Ll/᩶ܺۢ;

    iget-object p0, p0, Ll/᩶ܺۢ;->ܽ:Ljava/lang/String;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫()Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "NATIVE_ANALYZER_FAILED"

    const-string v1, "Native ELF analysis failed."

    .line 624
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۖۧۜ;Ll/ۖ۟᩻;IIIII)Ll/ۢۧۜ;
    .locals 35

    move-object/from16 v0, p0

    move/from16 v2, p3

    .line 184
    iget-object v1, v0, Ll/ۖۧۜ;->ܿ:Ljava/util/HashMap;

    iget-object v3, v0, Ll/ۖۧۜ;->֫:Ljava/util/ArrayList;

    new-instance v6, Ll/ۢۧۜ;

    const/4 v4, 0x0

    invoke-direct {v6, v4}, Ll/ۢۧۜ;-><init>(I)V

    move/from16 v4, p4

    :goto_0
    const/4 v5, 0x4

    if-ge v4, v5, :cond_22

    .line 186
    sget-object v5, Ll/ۘۧۜ;->֫:[Ljava/lang/String;

    aget-object v5, v5, v4

    move/from16 v14, p4

    if-ne v4, v14, :cond_0

    move/from16 v15, p5

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    const/4 v15, 0x0

    .line 189
    :goto_1
    iget-object v12, v0, Ll/ۖۧۜ;->ᩳ:Ll/ۧܿۜ;

    .line 190
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 616
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0xa

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 682
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    if-nez v8, :cond_1

    const/4 v8, -0x1

    goto :goto_2

    .line 683
    :cond_1
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 276
    :goto_2
    :try_start_0
    move-object/from16 v10, p1

    check-cast v10, Ll/᩸ۧۜ;

    .line 57
    iget-object v10, v10, Ll/᩸ۧۜ;->᩸:Ll/ۙܺۢ;

    invoke-virtual {v10, v15, v8, v5}, Ll/ۙܺۢ;->֫(IILjava/lang/String;)Ll/᩸ܺۢ;

    move-result-object v10

    .line 278
    invoke-static {v10, v5, v15, v8}, Ll/ۘۧۜ;->֫(Ll/᩸ܺۢ;Ljava/lang/String;II)V

    iget v13, v10, Ll/᩸ܺۢ;->ܿ:I

    iget-object v11, v10, Ll/᩸ܺۢ;->ۧ:Ljava/util/List;

    .line 616
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 687
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v7, 0x1

    .line 191
    iput-boolean v7, v6, Ll/ۢۧۜ;->֫:Z

    if-gt v15, v13, :cond_21

    const/4 v7, 0x0

    const/4 v10, 0x0

    .line 195
    :goto_3
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v7

    if-ge v10, v7, :cond_1e

    .line 196
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v22, v7

    check-cast v22, Ljava/lang/String;

    .line 197
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠ܺۢ;

    .line 348
    invoke-static {v7}, Ll/ۘۧۜ;->ۧ(Ll/۠ܺۢ;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1c

    .line 349
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_2

    goto/16 :goto_14

    .line 352
    :cond_2
    iget-object v9, v0, Ll/ۖۧۜ;->ܽ:Ll/᩻ۜۜ;

    invoke-virtual {v12, v8, v8}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v8

    const-string v0, ".name"

    .line 353
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    const-string v0, "entries"

    if-nez v8, :cond_6

    .line 354
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_6

    .line 355
    invoke-static {v7}, Ll/ۘۧۜ;->֫(Ll/۠ܺۢ;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    .line 356
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_3

    goto/16 :goto_14

    .line 359
    :cond_3
    invoke-virtual {v12, v8, v8}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v8

    if-nez v8, :cond_4

    goto/16 :goto_14

    :cond_4
    move-object/from16 v23, v1

    const-string v1, ".demangledName"

    .line 363
    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_5
    move-object/from16 v23, v1

    :goto_4
    move/from16 v1, p6

    move-object/from16 v24, v3

    move/from16 v33, v10

    move-object/from16 v25, v11

    move-object/from16 v26, v12

    move/from16 v34, v13

    move v3, v15

    goto/16 :goto_15

    :cond_6
    move-object/from16 v23, v1

    move-object/from16 v1, v16

    :goto_5
    if-nez v8, :cond_7

    goto :goto_4

    .line 368
    :cond_7
    new-instance v14, Ll/᩻᩷ۜ;

    .line 514
    iget-boolean v2, v9, Ll/᩻ۜۜ;->᩻:Z

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-string v19, ""

    if-nez v2, :cond_8

    move-object/from16 v24, v3

    move/from16 v20, v10

    move-object/from16 v25, v11

    move-object/from16 v26, v12

    move/from16 v27, v13

    goto/16 :goto_b

    .line 518
    :cond_8
    instance-of v2, v7, Ll/ۚܺۢ;

    if-eqz v2, :cond_9

    .line 519
    move-object v2, v7

    check-cast v2, Ll/ۚܺۢ;

    move-object/from16 v24, v3

    .line 520
    new-instance v3, Ljava/lang/StringBuilder;

    move/from16 v20, v10

    const-string v10, "imports name=\""

    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v2, Ll/ۚܺۢ;->᩻:Ljava/lang/String;

    invoke-static {v10}, Ll/ۘۧۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\" library=\""

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v2, Ll/ۚܺۢ;->ܳ:Ljava/lang/String;

    .line 521
    invoke-static {v10}, Ll/ۘۧۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\""

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Ll/ۚܺۢ;->ܽ:Ljava/lang/String;

    invoke-static {v2}, Ll/ۘۧۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v25, v11

    move-object/from16 v26, v12

    move/from16 v27, v13

    goto :goto_7

    :cond_9
    move-object/from16 v24, v3

    move/from16 v20, v10

    .line 522
    instance-of v2, v7, Ll/᩶ܺۢ;

    const-string v3, "?"

    const-string v10, " file="

    move-object/from16 v21, v3

    const-string v3, "\" va="

    if-eqz v2, :cond_b

    .line 523
    move-object v2, v7

    check-cast v2, Ll/᩶ܺۢ;

    move-object/from16 v25, v11

    .line 524
    new-instance v11, Ljava/lang/StringBuilder;

    move-object/from16 v26, v12

    const-string v12, "relocations name=\""

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v12, v2, Ll/᩶ܺۢ;->ܳ:Ljava/lang/String;

    invoke-static {v12}, Ll/ۘۧۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v27, v13

    iget-wide v12, v2, Ll/᩶ܺۢ;->ۢ:J

    .line 525
    invoke-static {v12, v13}, Ll/ۘۧۜ;->֫(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v12, v2, Ll/᩶ܺۢ;->ۜ:J

    invoke-static {v12, v13}, Ll/ۘۧۜ;->ۧ(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " type="

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v12, v2, Ll/᩶ܺۢ;->᩻:J

    cmp-long v3, v12, v16

    if-gez v3, :cond_a

    move-object/from16 v3, v21

    goto :goto_6

    .line 567
    :cond_a
    invoke-static {v12, v13}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    .line 526
    :goto_6
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Ll/᩶ܺۢ;->ܽ:Ljava/lang/String;

    .line 527
    invoke-static {v2}, Ll/ۘۧۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_7
    move-object v3, v14

    goto :goto_a

    :cond_b
    move-object/from16 v25, v11

    move-object/from16 v26, v12

    move/from16 v27, v13

    .line 528
    instance-of v2, v7, Ll/ۨܺۢ;

    if-eqz v2, :cond_f

    .line 529
    move-object v2, v7

    check-cast v2, Ll/ۨܺۢ;

    .line 530
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    move-object/from16 v11, v19

    goto :goto_8

    .line 531
    :cond_c
    iget-object v11, v2, Ll/ۨܺۢ;->ᩳ:Ljava/lang/String;

    :goto_8
    const-string v12, " name=\""

    .line 0
    invoke-static {v5, v12}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    .line 532
    iget-object v13, v2, Ll/ۨܺۢ;->᩻:Ljava/lang/String;

    invoke-static {v13}, Ll/ۘۧۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v3, v14

    iget-wide v13, v2, Ll/ۨܺۢ;->ۡ:J

    .line 533
    invoke-static {v13, v14}, Ll/ۘۧۜ;->֫(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v13, v2, Ll/ۨܺۢ;->ۜ:J

    invoke-static {v13, v14}, Ll/ۘۧۜ;->ۧ(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " size="

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v13, v2, Ll/ۨܺۢ;->᩷:J

    cmp-long v2, v13, v16

    if-gez v2, :cond_d

    move-object/from16 v2, v21

    goto :goto_9

    .line 567
    :cond_d
    invoke-static {v13, v14}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    .line 534
    :goto_9
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Ll/ۘۧۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 538
    :goto_a
    iget v10, v9, Ll/᩻ۜۜ;->ᩴ:I

    if-lez v10, :cond_10

    .line 586
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v11

    if-gt v11, v10, :cond_e

    goto :goto_c

    :cond_e
    const/4 v11, 0x0

    .line 589
    invoke-virtual {v2, v11, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_c

    :cond_f
    :goto_b
    move-object v3, v14

    move-object/from16 v2, v18

    .line 464
    :cond_10
    :goto_c
    iget-boolean v9, v9, Ll/᩻ۜۜ;->ܳ:Z

    if-nez v9, :cond_11

    move-object/from16 v28, v18

    goto :goto_d

    .line 467
    :cond_11
    invoke-virtual {v8}, Ll/֫ܿۜ;->ᩳ()V

    move-object/from16 v28, v8

    .line 404
    :goto_d
    invoke-static {v7}, Ll/ۘۧۜ;->ۧ(Ll/۠ܺۢ;)Ljava/lang/String;

    move-result-object v9

    .line 405
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    move-object/from16 v10, v19

    goto :goto_e

    :cond_12
    invoke-static {v7}, Ll/ۘۧۜ;->֫(Ll/۠ܺۢ;)Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    .line 406
    :goto_e
    instance-of v0, v7, Ll/ۚܺۢ;

    if-eqz v0, :cond_13

    .line 407
    new-instance v0, Ll/ۙۜۜ;

    const/16 v19, 0x0

    const-wide/16 v29, -0x1

    const/4 v11, 0x1

    const-wide/16 v12, -0x1

    const-wide/16 v16, -0x1

    const/16 v18, -0x1

    const-wide/16 v31, 0x0

    move-object v7, v0

    move-object v8, v5

    move/from16 v33, v20

    move/from16 v14, v27

    move-object/from16 v27, v3

    move/from16 v34, v14

    move v3, v15

    move-wide/from16 v14, v16

    move/from16 v16, v18

    move-wide/from16 v17, v31

    move-wide/from16 v20, v29

    invoke-direct/range {v7 .. v21}, Ll/ۙۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJIJLjava/lang/String;J)V

    goto/16 :goto_13

    :cond_13
    move/from16 v33, v20

    move/from16 v34, v27

    move-object/from16 v27, v3

    move v3, v15

    .line 409
    instance-of v0, v7, Ll/᩶ܺۢ;

    const-string v8, "virtual"

    if-eqz v0, :cond_16

    .line 410
    check-cast v7, Ll/᩶ܺۢ;

    .line 411
    iget-wide v11, v7, Ll/᩶ܺۢ;->ۢ:J

    invoke-static {v11, v12}, Ll/ۘۧۜ;->ᩳ(J)J

    move-result-wide v12

    .line 412
    iget-wide v14, v7, Ll/᩶ܺۢ;->ۜ:J

    invoke-static {v14, v15}, Ll/ۘۧۜ;->ᩳ(J)J

    move-result-wide v14

    cmp-long v0, v12, v16

    if-ltz v0, :cond_14

    move-object/from16 v19, v8

    goto :goto_f

    :cond_14
    move-object/from16 v19, v18

    :goto_f
    if-ltz v0, :cond_15

    move-wide/from16 v20, v12

    goto :goto_10

    :cond_15
    const-wide/16 v7, -0x1

    move-wide/from16 v20, v7

    .line 415
    :goto_10
    new-instance v0, Ll/ۙۜۜ;

    .line 416
    invoke-static {v14, v15}, Ll/ۘۧۜ;->ܽ(J)I

    move-result v16

    const-wide/16 v17, 0x0

    const/4 v11, 0x0

    move-object v7, v0

    move-object v8, v5

    invoke-direct/range {v7 .. v21}, Ll/ۙۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJIJLjava/lang/String;J)V

    goto/16 :goto_13

    .line 418
    :cond_16
    instance-of v0, v7, Ll/ۨܺۢ;

    if-eqz v0, :cond_1a

    .line 419
    check-cast v7, Ll/ۨܺۢ;

    .line 420
    iget-wide v11, v7, Ll/ۨܺۢ;->ۡ:J

    invoke-static {v11, v12}, Ll/ۘۧۜ;->ᩳ(J)J

    move-result-wide v12

    .line 421
    iget-wide v14, v7, Ll/ۨܺۢ;->ۜ:J

    invoke-static {v14, v15}, Ll/ۘۧۜ;->ᩳ(J)J

    move-result-wide v14

    .line 424
    iget-boolean v11, v7, Ll/ۨܺۢ;->ܿ:Z

    if-nez v11, :cond_18

    cmp-long v0, v12, v16

    if-ltz v0, :cond_17

    move-object/from16 v19, v8

    move-wide/from16 v20, v12

    goto :goto_11

    :cond_17
    cmp-long v0, v14, v16

    if-ltz v0, :cond_18

    const-string v0, "file_offset"

    move-object/from16 v19, v0

    move-wide/from16 v20, v14

    goto :goto_11

    :cond_18
    const-wide/16 v19, -0x1

    move-wide/from16 v20, v19

    move-object/from16 v19, v18

    .line 433
    :goto_11
    new-instance v0, Ll/ۙۜۜ;

    .line 434
    invoke-static {v14, v15}, Ll/ۘۧۜ;->ܽ(J)I

    move-result v18

    iget-wide v7, v7, Ll/ۨܺۢ;->᩷:J

    cmp-long v29, v7, v16

    if-lez v29, :cond_19

    move-wide/from16 v29, v7

    goto :goto_12

    :cond_19
    move-wide/from16 v29, v16

    :goto_12
    move-object v7, v0

    move-object v8, v5

    move/from16 v16, v18

    move-wide/from16 v17, v29

    .line 435
    invoke-direct/range {v7 .. v21}, Ll/ۙۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJIJLjava/lang/String;J)V

    goto :goto_13

    .line 437
    :cond_1a
    new-instance v0, Ll/ۙۜۜ;

    const/16 v19, 0x0

    const-wide/16 v20, -0x1

    const/4 v11, 0x0

    const-wide/16 v12, -0x1

    const-wide/16 v14, -0x1

    const/16 v16, -0x1

    const-wide/16 v17, 0x0

    move-object v7, v0

    move-object v8, v5

    invoke-direct/range {v7 .. v21}, Ll/ۙۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJIJLjava/lang/String;J)V

    :goto_13
    const-string v17, "native_symbol"

    move-object/from16 v16, v27

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v20, v28

    move-object/from16 v21, v22

    move-object/from16 v22, v0

    .line 371
    invoke-direct/range {v16 .. v22}, Ll/᩻᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֫ܿۜ;Ljava/lang/String;Ll/ۙۜۜ;)V

    .line 372
    invoke-static/range {v27 .. v27}, Ll/ᩴۧۜ;->֫(Ll/᩻᩷ۜ;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 375
    iget-object v0, v6, Ll/ۢۧۜ;->ۧ:Ljava/util/ArrayList;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move/from16 v1, p6

    if-lt v0, v1, :cond_1d

    .line 198
    new-instance v7, Ll/ᩳܿۜ;

    add-int v15, v3, v33

    add-int/lit8 v5, v15, 0x1

    const/4 v8, 0x0

    move-object v0, v7

    move/from16 v1, p2

    move/from16 v2, p3

    move v3, v4

    move v4, v5

    move v5, v8

    .line 36
    invoke-direct/range {v0 .. v5}, Ll/ᩳܿۜ;-><init>(IIIII)V

    .line 198
    iput-object v7, v6, Ll/ۢۧۜ;->ܽ:Ll/ᩳܿۜ;

    return-object v6

    .line 373
    :cond_1b
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1c
    :goto_14
    move-object/from16 v23, v1

    move-object/from16 v24, v3

    move/from16 v33, v10

    move-object/from16 v25, v11

    move-object/from16 v26, v12

    move/from16 v34, v13

    move v3, v15

    move/from16 v1, p6

    :cond_1d
    :goto_15
    add-int/lit8 v10, v33, 0x1

    move-object/from16 v0, p0

    move/from16 v2, p3

    move/from16 v14, p4

    move v15, v3

    move-object/from16 v1, v23

    move-object/from16 v3, v24

    move-object/from16 v11, v25

    move-object/from16 v12, v26

    move/from16 v13, v34

    goto/16 :goto_3

    :cond_1e
    move-object/from16 v23, v1

    move-object/from16 v24, v3

    move-object/from16 v25, v11

    move/from16 v34, v13

    move v3, v15

    move/from16 v1, p6

    .line 203
    invoke-interface/range {v25 .. v25}, Ljava/util/List;->size()I

    move-result v0

    add-int v15, v0, v3

    move/from16 v0, v34

    if-lt v15, v0, :cond_1f

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    move/from16 v2, p3

    move-object/from16 v1, v23

    move-object/from16 v3, v24

    goto/16 :goto_0

    .line 207
    :cond_1f
    invoke-interface/range {v25 .. v25}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    move-object/from16 v0, p0

    move/from16 v2, p3

    move/from16 v14, p4

    move-object/from16 v1, v23

    move-object/from16 v3, v24

    goto/16 :goto_1

    .line 208
    :cond_20
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 193
    :cond_21
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 282
    :catch_0
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_22
    return-object v6
.end method

.method public static ֫(Ll/ۖۧۜ;Ll/ۖ۟᩻;IIIJI)Ll/ۢۧۜ;
    .locals 37

    move-object/from16 v0, p0

    .line 225
    iget-object v1, v0, Ll/ۖۧۜ;->ܿ:Ljava/util/HashMap;

    new-instance v2, Ll/ۢۧۜ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ۢۧۜ;-><init>(I)V

    .line 226
    iget-object v3, v0, Ll/ۖۧۜ;->֫:Ljava/util/ArrayList;

    move/from16 v5, p3

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move/from16 v4, p4

    move-wide/from16 v6, p5

    .line 290
    :goto_0
    invoke-static {v3}, Ll/ۘۧۜ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 682
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    if-nez v8, :cond_0

    const/4 v8, -0x1

    goto :goto_1

    .line 683
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 293
    :goto_1
    :try_start_0
    move-object/from16 v9, p1

    check-cast v9, Ll/᩸ۧۜ;

    .line 64
    iget-object v9, v9, Ll/᩸ۧۜ;->᩸:Ll/ۙܺۢ;

    invoke-virtual {v9, v4, v8, v6, v7}, Ll/ۙܺۢ;->֫(IIJ)Ll/۫ܺۢ;

    move-result-object v13

    iget v6, v13, Ll/۫ܺۢ;->ᩳ:I

    .line 319
    iget-wide v14, v13, Ll/۫ܺۢ;->ܽ:J

    iget v12, v13, Ll/۫ܺۢ;->ܿ:I

    iget-object v11, v13, Ll/۫ܺۢ;->֫:Ljava/util/List;

    if-ne v6, v4, :cond_14

    iget v7, v13, Ll/۫ܺۢ;->ۧ:I

    const/16 v9, 0x400

    if-ne v7, v9, :cond_14

    if-ltz v12, :cond_14

    .line 320
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v7

    if-gt v7, v9, :cond_14

    .line 323
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v7

    if-gt v6, v12, :cond_13

    if-ltz v8, :cond_1

    if-ne v8, v12, :cond_13

    :cond_1
    int-to-long v8, v6

    int-to-long v6, v7

    add-long/2addr v8, v6

    int-to-long v6, v12

    cmp-long v10, v8, v6

    if-gtz v10, :cond_13

    .line 296
    invoke-static {v3}, Ll/ۘۧۜ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 687
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v6, 0x1

    .line 231
    iput-boolean v6, v2, Ll/ۢۧۜ;->֫:Z

    if-gt v4, v12, :cond_12

    const/4 v6, 0x0

    const/4 v10, 0x0

    .line 235
    :goto_2
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v6

    if-ge v10, v6, :cond_f

    .line 236
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬ܺۢ;

    .line 381
    iget-object v7, v6, Ll/۬ܺۢ;->ᩳ:Ljava/lang/String;

    iget-wide v8, v6, Ll/۬ܺۢ;->ܽ:J

    move/from16 p5, v10

    move-object/from16 p4, v11

    iget-wide v10, v6, Ll/۬ܺۢ;->ܿ:J

    move-wide/from16 v16, v14

    iget-wide v14, v6, Ll/۬ܺۢ;->֫:J

    .line 382
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v18

    if-eqz v18, :cond_2

    move-object/from16 v18, v1

    goto :goto_3

    :cond_2
    move-object/from16 v18, v1

    .line 385
    iget-object v1, v0, Ll/ۖۧۜ;->ᩳ:Ll/ۧܿۜ;

    iget-object v5, v0, Ll/ۖۧۜ;->ܽ:Ll/᩻ۜۜ;

    invoke-virtual {v1, v7, v7}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v1

    if-nez v1, :cond_3

    :goto_3
    move-object/from16 v1, p4

    move/from16 v0, p5

    move/from16 v7, p7

    move v5, v12

    goto/16 :goto_a

    .line 389
    :cond_3
    new-instance v7, Ll/᩻᩷ۜ;

    .line 543
    iget-boolean v0, v5, Ll/᩻ۜۜ;->᩻:Z

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    if-nez v0, :cond_4

    move/from16 p6, v12

    move-object/from16 v0, v21

    goto :goto_5

    .line 546
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    move/from16 p6, v12

    const-string v12, "section=\""

    invoke-direct {v0, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v12, v6, Ll/۬ܺۢ;->ۧ:Ljava/lang/String;

    invoke-static {v12}, Ll/ۘۧۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "\" file="

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    invoke-static {v14, v15}, Ll/ۘۧۜ;->ۧ(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " va="

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Ll/ۘۧۜ;->֫(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " len="

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    cmp-long v12, v8, v19

    if-gez v12, :cond_5

    const-string v12, "?"

    goto :goto_4

    .line 567
    :cond_5
    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v12

    .line 548
    :goto_4
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " \""

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v6, Ll/۬ܺۢ;->ᩳ:Ljava/lang/String;

    invoke-static {v6}, Ll/ۘۧۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v12, "\""

    .line 0
    invoke-static {v0, v6, v12}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 549
    iget v6, v5, Ll/᩻ۜۜ;->ᩴ:I

    if-lez v6, :cond_7

    .line 586
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v12

    if-gt v12, v6, :cond_6

    goto :goto_5

    :cond_6
    const/4 v12, 0x0

    .line 589
    invoke-virtual {v0, v12, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 464
    :cond_7
    :goto_5
    iget-boolean v5, v5, Ll/᩻ۜۜ;->ܳ:Z

    if-nez v5, :cond_8

    move-object/from16 v1, v21

    goto :goto_6

    .line 467
    :cond_8
    invoke-virtual {v1}, Ll/֫ܿۜ;->ᩳ()V

    .line 445
    :goto_6
    invoke-static {v14, v15}, Ll/ۘۧۜ;->ᩳ(J)J

    move-result-wide v29

    .line 446
    invoke-static {v10, v11}, Ll/ۘۧۜ;->ᩳ(J)J

    move-result-wide v27

    cmp-long v5, v29, v19

    if-ltz v5, :cond_9

    const-string v21, "file_offset"

    move-object/from16 v34, v21

    move-wide/from16 v35, v29

    goto :goto_7

    :cond_9
    cmp-long v5, v27, v19

    if-ltz v5, :cond_a

    const-string v21, "virtual"

    move-object/from16 v34, v21

    move-wide/from16 v35, v27

    goto :goto_7

    :cond_a
    const-wide/16 v5, -0x1

    move-wide/from16 v35, v5

    move-object/from16 v34, v21

    .line 456
    :goto_7
    new-instance v12, Ll/ۙۜۜ;

    .line 457
    invoke-static/range {v29 .. v30}, Ll/ۘۧۜ;->ܽ(J)I

    move-result v31

    cmp-long v5, v8, v19

    if-lez v5, :cond_b

    move-wide/from16 v32, v8

    goto :goto_8

    :cond_b
    move-wide/from16 v32, v19

    :goto_8
    const-string v23, ""

    const-string v24, ""

    const-string v25, ""

    const/16 v26, 0x0

    move-object/from16 v22, v12

    .line 458
    invoke-direct/range {v22 .. v36}, Ll/ۙۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJIJLjava/lang/String;J)V

    const-string v5, "native_string"

    const-string v8, "strings.text"

    move-object v6, v7

    move-object v14, v7

    move-object v7, v5

    move-object v9, v0

    move/from16 v0, p5

    move-object v10, v1

    move-object/from16 v1, p4

    move-object v11, v3

    move/from16 v5, p6

    .line 392
    invoke-direct/range {v6 .. v12}, Ll/᩻᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֫ܿۜ;Ljava/lang/String;Ll/ۙۜۜ;)V

    .line 393
    invoke-static {v14}, Ll/ᩴۧۜ;->֫(Ll/᩻᩷ۜ;)Z

    move-result v6

    if-eqz v6, :cond_e

    .line 396
    iget-object v6, v2, Ll/ۢۧۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    move/from16 v7, p7

    if-lt v6, v7, :cond_d

    add-int/lit8 v10, v0, 0x1

    .line 238
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v10, v3, :cond_c

    .line 239
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܺۢ;

    iget-wide v5, v1, Ll/۬ܺۢ;->֫:J

    move-wide v8, v5

    goto :goto_9

    :cond_c
    move-wide/from16 v8, v16

    :goto_9
    add-int/2addr v4, v0

    add-int/lit8 v6, v4, 0x1

    .line 240
    iget v7, v13, Ll/۫ܺۢ;->ܿ:I

    move/from16 v4, p2

    move/from16 v5, p3

    invoke-static/range {v4 .. v9}, Ll/ᩳܿۜ;->֫(IIIIJ)Ll/ᩳܿۜ;

    move-result-object v0

    iput-object v0, v2, Ll/ۢۧۜ;->ܽ:Ll/ᩳܿۜ;

    return-object v2

    :cond_d
    :goto_a
    add-int/lit8 v10, v0, 0x1

    move-object/from16 v0, p0

    move-object v11, v1

    move v12, v5

    move-wide/from16 v14, v16

    move-object/from16 v1, v18

    move/from16 v5, p3

    goto/16 :goto_2

    .line 394
    :cond_e
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_f
    move/from16 v7, p7

    move-object/from16 v18, v1

    move-object v1, v11

    move v5, v12

    move-wide/from16 v16, v14

    .line 245
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v4, v0

    if-lt v4, v5, :cond_10

    return-object v2

    .line 249
    :cond_10
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    move-object/from16 v0, p0

    move/from16 v5, p3

    move-wide/from16 v6, v16

    move-object/from16 v1, v18

    goto/16 :goto_0

    .line 250
    :cond_11
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 233
    :cond_12
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 330
    :cond_13
    :try_start_1
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 321
    :cond_14
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 299
    :catch_0
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ll/ۘۧۜ;Ll/ۖۧۜ;Ljava/lang/String;IIIIILl/ۡۧۜ;Ll/۟۟᩻;)Ll/ۢۧۜ;
    .locals 9

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    invoke-virtual {p1, p2}, Ll/ۖۧۜ;->֫(Ljava/lang/String;)V

    move-object/from16 v0, p9

    .line 108
    iget-object v0, v0, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 52
    invoke-static {v0, v1}, Ll/ܺܺۢ;->֫(Ljava/lang/String;Z)Ll/ۙܺۢ;

    move-result-object v0

    .line 53
    new-instance v8, Ll/᩸ۧۜ;

    invoke-direct {v8, v0}, Ll/᩸ۧۜ;-><init>(Ll/ۙܺۢ;)V

    move-object/from16 v0, p8

    .line 110
    :try_start_0
    iget-object v0, v0, Ll/ۡۧۜ;->ܽ:Ljava/util/ArrayList;

    .line 112
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int v7, p7, v0

    move-object v1, p1

    move-object v2, v8

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    .line 110
    invoke-static/range {v1 .. v7}, Ll/ۘۧۜ;->֫(Ll/ۖۧۜ;Ll/ۖ۟᩻;IIIII)Ll/ۢۧۜ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    invoke-virtual {v8}, Ll/᩸ۧۜ;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 108
    :try_start_1
    invoke-virtual {v8}, Ll/᩸ۧۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method

.method public static ֫(Ll/ۘۧۜ;Ll/ۖۧۜ;Ljava/lang/String;[ZIIIILl/ۡۧۜ;Ll/۟۟᩻;)Ll/ۢۧۜ;
    .locals 12

    move-object v0, p1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    invoke-virtual {p1, p2}, Ll/ۖۧۜ;->֫(Ljava/lang/String;)V

    .line 144
    iget-object v1, v0, Ll/ۖۧۜ;->ܽ:Ll/᩻ۜۜ;

    iget-object v1, v1, Ll/᩻ۜۜ;->ۢ:Ll/ᩳܿۜ;

    const/4 v2, 0x0

    .line 147
    aget-boolean v3, p3, v2

    if-eqz v3, :cond_0

    iget v3, v1, Ll/ᩳܿۜ;->᩻:I

    iget v4, v1, Ll/ᩳܿۜ;->ܳ:I

    move/from16 v5, p4

    if-ne v3, v5, :cond_1

    iget v3, v1, Ll/ᩳܿۜ;->ܽ:I

    move/from16 v6, p5

    if-ne v3, v6, :cond_2

    iget v3, v1, Ll/ᩳܿۜ;->ᩳ:I

    move/from16 v7, p6

    if-ne v3, v7, :cond_3

    if-ltz v4, :cond_3

    .line 150
    invoke-static {p2}, Ll/ۘۧۜ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 687
    iget-object v8, v0, Ll/ۖۧۜ;->ܿ:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v8, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    iget-wide v3, v1, Ll/ᩳܿۜ;->ܿ:J

    goto :goto_0

    :cond_0
    move/from16 v5, p4

    :cond_1
    move/from16 v6, p5

    :cond_2
    move/from16 v7, p6

    :cond_3
    const-wide/16 v3, -0x1

    :goto_0
    move-wide v8, v3

    .line 153
    aput-boolean v2, p3, v2

    move-object/from16 v1, p9

    .line 154
    iget-object v1, v1, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    const/4 v2, 0x1

    .line 52
    invoke-static {v1, v2}, Ll/ܺܺۢ;->֫(Ljava/lang/String;Z)Ll/ۙܺۢ;

    move-result-object v1

    .line 53
    new-instance v10, Ll/᩸ۧۜ;

    invoke-direct {v10, v1}, Ll/᩸ۧۜ;-><init>(Ll/ۙܺۢ;)V

    move-object/from16 v1, p8

    .line 156
    :try_start_0
    iget-object v1, v1, Ll/ۡۧۜ;->ܽ:Ljava/util/ArrayList;

    .line 157
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int v11, p7, v1

    move-object v1, p1

    move-object v2, v10

    move/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    move-wide v6, v8

    move v8, v11

    .line 156
    invoke-static/range {v1 .. v8}, Ll/ۘۧۜ;->֫(Ll/ۖۧۜ;Ll/ۖ۟᩻;IIIJI)Ll/ۢۧۜ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    invoke-virtual {v10}, Ll/᩸ۧۜ;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 154
    :try_start_1
    invoke-virtual {v10}, Ll/᩸ۧۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
.end method

.method public static ֫(Ll/᩸ܺۢ;Ljava/lang/String;II)V
    .locals 6

    .line 305
    iget-object v0, p0, Ll/᩸ܺۢ;->֫:Ljava/lang/String;

    iget v1, p0, Ll/᩸ܺۢ;->ܿ:I

    iget v2, p0, Ll/᩸ܺۢ;->ᩳ:I

    iget-object v3, p0, Ll/᩸ܺۢ;->ۧ:Ljava/util/List;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-ne v2, p2, :cond_5

    iget p0, p0, Ll/᩸ܺۢ;->ܽ:I

    const/16 p2, 0x400

    if-ne p0, p2, :cond_5

    if-ltz v1, :cond_5

    .line 306
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    if-gt p0, p2, :cond_5

    .line 309
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    if-gt v2, v1, :cond_4

    if-ltz p3, :cond_0

    if-ne p3, v1, :cond_4

    :cond_0
    int-to-long p2, v2

    int-to-long v4, p0

    add-long/2addr p2, v4

    int-to-long v0, v1

    cmp-long p0, p2, v0

    if-gtz p0, :cond_4

    const-string p0, "entries"

    .line 310
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    .line 311
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ܺۢ;

    .line 338
    invoke-static {p1}, Ll/ۘۧۜ;->֫(Ll/۠ܺۢ;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 340
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 p2, 0x1000

    if-gt p1, p2, :cond_2

    goto :goto_0

    .line 341
    :cond_2
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_3
    return-void

    .line 330
    :cond_4
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 307
    :cond_5
    invoke-static {}, Ll/ۘۧۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_1

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    if-lez v2, :cond_0

    goto :goto_0

    .line 563
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const-string p0, "?"

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 593
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 594
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_6

    .line 595
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    if-ne v2, v3, :cond_0

    const-string v2, "\\\\"

    .line 597
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/16 v3, 0x22

    if-ne v2, v3, :cond_1

    const-string v2, "\\\""

    .line 599
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/16 v3, 0xa

    if-ne v2, v3, :cond_2

    const-string v2, "\\n"

    .line 601
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const/16 v3, 0xd

    if-ne v2, v3, :cond_3

    const-string v2, "\\r"

    .line 603
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const/16 v3, 0x9

    if-ne v2, v3, :cond_4

    const-string v2, "\\t"

    .line 605
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 606
    :cond_4
    invoke-static {v2}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v2, 0x3f

    .line 607
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 609
    :cond_5
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 612
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/۠ܺۢ;)Ljava/lang/String;
    .locals 1

    .line 476
    instance-of v0, p0, Ll/ۚܺۢ;

    if-eqz v0, :cond_0

    .line 477
    check-cast p0, Ll/ۚܺۢ;

    iget-object p0, p0, Ll/ۚܺۢ;->᩻:Ljava/lang/String;

    return-object p0

    .line 478
    :cond_0
    instance-of v0, p0, Ll/ۨܺۢ;

    if-eqz v0, :cond_1

    .line 479
    check-cast p0, Ll/ۨܺۢ;

    iget-object p0, p0, Ll/ۨܺۢ;->᩻:Ljava/lang/String;

    return-object p0

    .line 480
    :cond_1
    instance-of v0, p0, Ll/᩶ܺۢ;

    if-eqz v0, :cond_2

    .line 481
    check-cast p0, Ll/᩶ܺۢ;

    iget-object p0, p0, Ll/᩶ܺۢ;->ܳ:Ljava/lang/String;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(J)I
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_1

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    long-to-int p1, p0

    return p1

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "\nstrings"

    .line 0
    invoke-static {p0, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    const-wide/16 p0, -0x1

    :cond_0
    return-wide p0
.end method


# virtual methods
.method public final ֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/᩻ۜۜ;IIII)Ll/ۡۧۜ;
    .locals 19

    move/from16 v1, p5

    .line 89
    new-instance v12, Ll/ۖۧۜ;

    move-object/from16 v13, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-direct {v12, v13, v0, v2, v3}, Ll/ۖۧۜ;-><init>(Ll/ۘۧۜ;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/᩻ۜۜ;)V

    .line 133
    new-instance v14, Ll/ۡۧۜ;

    iget-object v15, v12, Ll/ۖۧۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {v14, v0}, Ll/ۡۧۜ;-><init>(I)V

    const/4 v0, 0x0

    .line 134
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v11, v2

    :goto_0
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v11, v2, :cond_4

    .line 136
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    if-ne v11, v1, :cond_0

    move/from16 v9, p6

    .line 137
    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v2

    move/from16 v16, v2

    goto :goto_1

    :cond_0
    move/from16 v9, p6

    const/4 v2, 0x0

    const/16 v16, 0x0

    :goto_1
    const/4 v2, 0x1

    new-array v6, v2, [Z

    .line 138
    aput-boolean v2, v6, v0

    .line 140
    :try_start_0
    iget-object v0, v12, Ll/ۖۧۜ;->ܳ:Ll/ܳ᩻ۜ;

    iget-object v8, v12, Ll/ۖۧۜ;->ۧ:Ll/ܺ۟᩻;

    iget-object v2, v12, Ll/ۖۧۜ;->ܽ:Ll/᩻ۜۜ;

    iget-object v7, v2, Ll/᩻ۜۜ;->ܽ:Ljava/lang/String;

    new-instance v5, Ll/ۜۧۜ;
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    move-object v2, v5

    move-object/from16 v3, p0

    move-object v4, v12

    move-object v1, v5

    move-object v5, v10

    move-object/from16 v17, v12

    move-object v12, v7

    move/from16 v7, p4

    move-object v13, v8

    move v8, v11

    move/from16 v9, v16

    move-object/from16 v16, v15

    move-object v15, v10

    move/from16 v10, p7

    move/from16 v18, v11

    move-object v11, v14

    :try_start_1
    invoke-direct/range {v2 .. v11}, Ll/ۜۧۜ;-><init>(Ll/ۘۧۜ;Ll/ۖۧۜ;Ljava/lang/String;[ZIIIILl/ۡۧۜ;)V

    invoke-static {v0, v13, v12, v15, v1}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۧۜ;

    .line 262
    iget-object v1, v14, Ll/ۡۧۜ;->ܽ:Ljava/util/ArrayList;

    iget-object v2, v0, Ll/ۢۧۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 263
    iget-boolean v1, v0, Ll/ۢۧۜ;->֫:Z

    if-eqz v1, :cond_1

    .line 264
    iget v1, v14, Ll/ۡۧۜ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v14, Ll/ۡۧۜ;->֫:I

    .line 266
    :cond_1
    iget-object v0, v0, Ll/ۢۧۜ;->ܽ:Ll/ᩳܿۜ;

    iput-object v0, v14, Ll/ۡۧۜ;->ᩳ:Ll/ᩳܿۜ;
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3

    if-eqz v0, :cond_2

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    move/from16 v18, v11

    move-object/from16 v17, v12

    move-object/from16 v16, v15

    goto :goto_2

    :catch_2
    move/from16 v18, v11

    move-object/from16 v17, v12

    move-object/from16 v16, v15

    :catch_3
    const/4 v0, 0x1

    .line 170
    iput-boolean v0, v14, Ll/ۡۧۜ;->ܿ:Z

    goto :goto_3

    :goto_2
    const/4 v1, 0x1

    .line 165
    invoke-static {v0}, Ll/ܽܿۜ;->֫(Ll/ۗۛ᩻;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 168
    iput-boolean v1, v14, Ll/ۡۧۜ;->ܿ:Z

    :cond_2
    :goto_3
    add-int/lit8 v11, v18, 0x1

    const/4 v0, 0x0

    move-object/from16 v13, p0

    move/from16 v1, p5

    move-object/from16 v15, v16

    move-object/from16 v12, v17

    goto/16 :goto_0

    .line 166
    :cond_3
    throw v0

    :cond_4
    :goto_4
    return-object v14
.end method

.method public final ֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/᩻ۜۜ;IIIII)Ll/ۡۧۜ;
    .locals 19

    move/from16 v1, p5

    .line 74
    new-instance v12, Ll/ۖۧۜ;

    move-object/from16 v13, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-direct {v12, v13, v0, v2, v3}, Ll/ۖۧۜ;-><init>(Ll/ۘۧۜ;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/᩻ۜۜ;)V

    .line 96
    new-instance v14, Ll/ۡۧۜ;

    iget-object v15, v12, Ll/ۖۧۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {v14, v0}, Ll/ۡۧۜ;-><init>(I)V

    const/4 v0, 0x0

    .line 97
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v11, v2

    :goto_0
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v11, v2, :cond_5

    .line 99
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    if-ne v11, v1, :cond_0

    move/from16 v9, p6

    .line 101
    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v8, v2

    goto :goto_1

    :cond_0
    move/from16 v9, p6

    const/4 v2, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ne v11, v1, :cond_1

    move/from16 v7, p7

    .line 102
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_2

    :cond_1
    move/from16 v7, p7

    const/4 v0, 0x0

    .line 104
    :goto_2
    :try_start_0
    iget-object v6, v12, Ll/ۖۧۜ;->ܳ:Ll/ܳ᩻ۜ;

    iget-object v5, v12, Ll/ۖۧۜ;->ۧ:Ll/ܺ۟᩻;

    iget-object v2, v12, Ll/ۖۧۜ;->ܽ:Ll/᩻ۜۜ;

    iget-object v4, v2, Ll/᩻ۜۜ;->ܽ:Ljava/lang/String;

    new-instance v3, Ll/᩷ۧۜ;
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v16, 0x1

    move-object v2, v3

    move-object v1, v3

    move-object/from16 v3, p0

    move-object v13, v4

    move-object v4, v12

    move-object/from16 v17, v12

    move-object v12, v5

    move-object v5, v10

    move-object/from16 p1, v15

    move-object v15, v6

    move/from16 v6, p4

    move v7, v11

    move v9, v0

    move-object v0, v10

    move/from16 v10, p8

    move/from16 v18, v11

    move-object v11, v14

    :try_start_1
    invoke-direct/range {v2 .. v11}, Ll/᩷ۧۜ;-><init>(Ll/ۘۧۜ;Ll/ۖۧۜ;Ljava/lang/String;IIIIILl/ۡۧۜ;)V

    invoke-static {v15, v12, v13, v0, v1}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۧۜ;

    .line 262
    iget-object v1, v14, Ll/ۡۧۜ;->ܽ:Ljava/util/ArrayList;

    iget-object v2, v0, Ll/ۢۧۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 263
    iget-boolean v1, v0, Ll/ۢۧۜ;->֫:Z

    if-eqz v1, :cond_2

    .line 264
    iget v1, v14, Ll/ۡۧۜ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v14, Ll/ۡۧۜ;->֫:I

    .line 266
    :cond_2
    iget-object v0, v0, Ll/ۢۧۜ;->ܽ:Ll/ᩳܿۜ;

    iput-object v0, v14, Ll/ۡۧۜ;->ᩳ:Ll/ᩳܿۜ;
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    if-eqz v0, :cond_3

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move/from16 v18, v11

    move-object/from16 v17, v12

    move-object/from16 p1, v15

    const/16 v16, 0x1

    :catch_2
    const/4 v0, 0x1

    .line 125
    iput-boolean v0, v14, Ll/ۡۧۜ;->ܿ:Z

    goto :goto_4

    :catch_3
    move-exception v0

    move/from16 v18, v11

    move-object/from16 v17, v12

    move-object/from16 p1, v15

    const/16 v16, 0x1

    :goto_3
    const/4 v1, 0x1

    .line 120
    invoke-static {v0}, Ll/ܽܿۜ;->֫(Ll/ۗۛ᩻;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 123
    iput-boolean v1, v14, Ll/ۡۧۜ;->ܿ:Z

    :cond_3
    :goto_4
    add-int/lit8 v11, v18, 0x1

    const/4 v0, 0x0

    move-object/from16 v13, p0

    move-object/from16 v15, p1

    move/from16 v1, p5

    move-object/from16 v12, v17

    goto/16 :goto_0

    .line 121
    :cond_4
    throw v0

    :cond_5
    :goto_5
    return-object v14
.end method
