.class public final Ll/᩻֨᩵;
.super Ljava/lang/Object;
.source "E9ZA"

# interfaces
.implements Ll/ۜ֨᩵;


# static fields
.field public static final ܿ֫:Ll/֫᩻֨;


# instance fields
.field public ֫֫:Ll/ᩴۡ᩵;

.field public ۗ:Z

.field public ۙ:J

.field public ۛ:[B

.field public final ۟:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ۤ:J

.field public ۧ֫:Ljava/util/ArrayList;

.field public final ۨ:Ljava/lang/String;

.field public ۫:[B

.field public ۬:Ljava/lang/String;

.field public final ܰ:Ll/᩷֨᩵;

.field public ܽ֫:I

.field public final ᩳ֫:Ljava/util/concurrent/atomic/AtomicLong;

.field public ᩶:Ll/ܿۖ᩵;

.field public final ᩸:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ᩹:Ll/ۛ֡᩵;

.field public final ᩺:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 77
    const-class v0, Ll/᩻֨᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ll/᩷֨᩵;)V
    .locals 3

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    .line 91
    iput-object v0, p0, Ll/᩻֨᩵;->۬:Ljava/lang/String;

    .line 99
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Ll/᩻֨᩵;->ᩳ֫:Ljava/util/concurrent/atomic/AtomicLong;

    .line 100
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/᩻֨᩵;->۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 113
    iput-object p1, p0, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    .line 114
    iput-object p3, p0, Ll/᩻֨᩵;->ۨ:Ljava/lang/String;

    .line 115
    iput-object p2, p0, Ll/᩻֨᩵;->᩺:Ljava/lang/String;

    .line 278
    invoke-virtual {p4}, Ll/۟֨᩵;->֫()V

    .line 116
    iput-object p4, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    .line 117
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/᩻֨᩵;->ۧ֫:Ljava/util/ArrayList;

    .line 118
    invoke-interface {p1}, Ll/ᩴۡ᩵;->֫()Ll/ۛ֡᩵;

    move-result-object p1

    invoke-interface {p1}, Ll/ۛ֡᩵;->ۧ()Ll/ᩴۚ᩵;

    move-result-object p1

    invoke-interface {p1}, Ll/ۛ֡᩵;->clone()Ll/ۛ֡᩵;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    return-void
.end method

.method private ֫(Ll/᩷֨᩵;Ljava/lang/String;)Ll/֫ۖ᩵;
    .locals 24

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    .line 509
    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ll/ۗ᩵᩵;

    .line 514
    invoke-virtual {v9}, Ll/ۗ᩵᩵;->֨֫()[B

    move-result-object v0

    .line 515
    invoke-virtual {v9}, Ll/ۗ᩵᩵;->۠֫()I

    move-result v1

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/16 v17, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x2

    const/16 v17, 0x2

    .line 517
    :goto_1
    iget-object v14, v7, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    invoke-interface {v14}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v1

    .line 520
    invoke-virtual {v9}, Ll/ۗ᩵᩵;->᩻()Ll/᩸ۡ᩵;

    move-result-object v2

    sget-object v3, Ll/᩸ۡ᩵;->ۛ:Ll/᩸ۡ᩵;

    invoke-virtual {v2, v3}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result v18

    const/4 v15, 0x0

    if-eqz v18, :cond_2

    .line 521
    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->᩶()[B

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v15

    :goto_2
    iput-object v2, v7, Ll/᩻֨᩵;->۫:[B

    .line 523
    sget-object v13, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v13}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 524
    iget-object v2, v7, Ll/᩻֨᩵;->۫:[B

    .line 86
    array-length v4, v2

    invoke-static {v2, v3, v4}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Initial session preauth hash "

    .line 524
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_3
    const-wide/16 v2, 0x0

    move/from16 v19, v1

    move-wide v11, v2

    move-object v1, v15

    move-object v10, v1

    move-object/from16 v20, v10

    :goto_3
    const/4 v6, 0x0

    if-nez v1, :cond_4

    xor-int/lit8 v5, v19, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v9

    move-object/from16 v16, v6

    .line 530
    invoke-virtual/range {v1 .. v6}, Ll/᩻֨᩵;->֫(Ll/᩷֨᩵;Ljava/lang/String;Ll/ۗ᩵᩵;ZLjavax/security/auth/Subject;)Ll/ܶۚ᩵;

    move-result-object v1

    move-object/from16 v2, v16

    goto :goto_4

    :cond_4
    move-object v2, v6

    .line 532
    :goto_4
    invoke-static {v1, v0, v2}, Ll/᩻֨᩵;->֫(Ll/ܶۚ᩵;[BLjavax/security/auth/Subject;)[B

    move-result-object v16

    if-eqz v16, :cond_d

    .line 535
    new-instance v2, Ll/ۤ᩵᩵;

    .line 1200
    iget-object v0, v7, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v0

    .line 535
    invoke-virtual {v9}, Ll/ۗ᩵᩵;->֡֫()I

    move-result v3

    const-wide/16 v4, 0x0

    move-object v10, v2

    move-wide/from16 v21, v11

    move-object v11, v0

    move/from16 v12, v17

    move-object v6, v13

    move v13, v3

    move-object/from16 v23, v9

    move-object v3, v14

    move-object v9, v15

    move-wide v14, v4

    invoke-direct/range {v10 .. v16}, Ll/ۤ᩵᩵;-><init>(Ll/ᩴۡ᩵;IIJ[B)V

    move-wide/from16 v4, v21

    .line 539
    invoke-virtual {v2, v4, v5}, Ll/ۗᩴ᩵;->ۧ(J)V

    .line 540
    invoke-virtual {v2}, Ll/ۗᩴ᩵;->֡()V

    const v10, -0x3fffffea    # -2.0000052f

    .line 543
    :try_start_0
    sget-object v0, Ll/֡ۚ᩵;->ۗ:Ll/֡ۚ᩵;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {v8, v2, v9, v0}, Ll/᩷֨᩵;->ۧ(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;

    move-result-object v0

    check-cast v0, Ll/ۛ᩵᩵;

    .line 544
    invoke-virtual {v0}, Ll/ۗᩴ᩵;->᩷֫()J

    move-result-wide v11
    :try_end_0
    .catch Ll/᩹ۚ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    .line 548
    invoke-virtual {v2}, Ll/۬ᩴ᩵;->ۧ()Ll/۫ᩴ᩵;

    move-result-object v11

    check-cast v11, Ll/ۛ᩵᩵;

    .line 549
    invoke-virtual {v0}, Ll/ۗۚ᩵;->֫()I

    move-result v12

    const v13, -0x3ffffff3    # -2.000003f

    if-eq v12, v13, :cond_c

    .line 553
    invoke-virtual {v11}, Ll/۫ᩴ᩵;->۟()Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-virtual {v11}, Ll/۫ᩴ᩵;->ۘ()Z

    move-result v12

    if-nez v12, :cond_b

    invoke-virtual {v11}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v12

    if-eqz v12, :cond_5

    .line 554
    invoke-virtual {v11}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v12

    if-ne v12, v10, :cond_b

    :cond_5
    move-object/from16 v20, v0

    move-object v0, v11

    move-wide v11, v4

    .line 127
    :goto_5
    iget-object v4, v7, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    invoke-interface {v4}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    .line 561
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ll/ۛ᩵᩵;->ۚ֫()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 562
    invoke-interface {v3}, Ll/ۛ֡᩵;->ۗۧ()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v3}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_6

    .line 563
    :cond_6
    new-instance v0, Ll/᩹ۚ᩵;

    const v1, -0x3fffff93    # -2.000026f

    .line 39
    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(I)V

    .line 563
    throw v0

    .line 564
    :cond_7
    :goto_6
    invoke-interface {v3}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {v0}, Ll/ۛ᩵᩵;->ۚ֫()Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v19, 0x1

    .line 568
    :cond_8
    invoke-virtual {v0}, Ll/ۛ᩵᩵;->֡֫()I

    move-result v4

    and-int/lit8 v4, v4, 0x4

    if-nez v4, :cond_a

    if-eqz v18, :cond_9

    .line 573
    invoke-virtual {v2}, Ll/ۗᩴ᩵;->ۜ֫()[B

    move-result-object v2

    .line 574
    array-length v4, v2

    iget-object v5, v7, Ll/᩻֨᩵;->۫:[B

    invoke-virtual {v8, v4, v2, v5}, Ll/᩷֨᩵;->֫(I[B[B)[B

    move-result-object v2

    iput-object v2, v7, Ll/᩻֨᩵;->۫:[B

    .line 576
    invoke-virtual {v0}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v2

    if-ne v2, v10, :cond_9

    .line 577
    invoke-virtual {v0}, Ll/ۗᩴ᩵;->ۜ֫()[B

    move-result-object v2

    .line 578
    array-length v4, v2

    iget-object v5, v7, Ll/᩻֨᩵;->۫:[B

    invoke-virtual {v8, v4, v2, v5}, Ll/᩷֨᩵;->֫(I[B[B)[B

    move-result-object v2

    iput-object v2, v7, Ll/᩻֨᩵;->۫:[B

    .line 582
    :cond_9
    invoke-virtual {v0}, Ll/ۛ᩵᩵;->᩵֫()[B

    move-result-object v2

    move-object v10, v0

    move-object v0, v2

    goto :goto_7

    .line 569
    :cond_a
    new-instance v0, Ll/֡֨᩵;

    const-string v1, "Server requires encryption, not yet supported."

    .line 44
    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 569
    throw v0

    .line 555
    :cond_b
    throw v0

    .line 552
    :cond_c
    new-instance v1, Ll/᩹ۚ᩵;

    const-string v2, "Login failed"

    .line 49
    invoke-direct {v1, v2, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 552
    throw v1

    :catch_1
    move-exception v0

    .line 546
    throw v0

    :cond_d
    move-object/from16 v23, v9

    move-wide v4, v11

    move-object v6, v13

    move-object v3, v14

    move-object v9, v15

    move-object/from16 v0, v16

    :goto_7
    move/from16 v2, v19

    .line 585
    invoke-interface {v1}, Ll/ܶۚ᩵;->֫()Z

    move-result v4

    if-eqz v4, :cond_19

    const-string v0, "Context is established"

    .line 586
    invoke-interface {v6, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1191
    iput-object v9, v7, Ll/᩻֨᩵;->۬:Ljava/lang/String;

    .line 588
    invoke-interface {v1}, Ll/ܶۚ᩵;->ۧ()[B

    move-result-object v0

    if-eqz v0, :cond_e

    const/16 v3, 0x10

    new-array v4, v3, [B

    .line 592
    array-length v5, v0

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v5, 0x0

    invoke-static {v0, v5, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 593
    iput-object v4, v7, Ll/᩻֨᩵;->ۛ:[B

    :cond_e
    if-eqz v10, :cond_f

    .line 183
    invoke-virtual {v10}, Ll/ۗᩴ᩵;->ܿ֫()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_f

    const/4 v0, 0x1

    goto :goto_8

    :cond_f
    const/4 v0, 0x0

    :goto_8
    if-nez v2, :cond_16

    .line 597
    invoke-virtual/range {p0 .. p0}, Ll/᩻֨᩵;->ܶ()Z

    move-result v3

    if-nez v3, :cond_10

    if-eqz v0, :cond_16

    .line 598
    :cond_10
    invoke-interface {v1}, Ll/ܶۚ᩵;->ۧ()[B

    move-result-object v0

    if-eqz v0, :cond_15

    if-eqz v10, :cond_15

    .line 600
    iget-object v0, v7, Ll/᩻֨᩵;->۫:[B

    if-eqz v0, :cond_11

    invoke-interface {v6}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 601
    iget-object v0, v7, Ll/᩻֨᩵;->۫:[B

    .line 86
    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Final preauth integrity hash "

    .line 601
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 603
    :cond_11
    new-instance v0, Ll/ۛᩴ᩵;

    iget-object v1, v7, Ll/᩻֨᩵;->ۛ:[B

    invoke-virtual/range {v23 .. v23}, Ll/ۗ᩵᩵;->ۚ֫()I

    move-result v2

    iget-object v3, v7, Ll/᩻֨᩵;->۫:[B

    invoke-direct {v0, v1, v2, v3}, Ll/ۛᩴ᩵;-><init>([BI[B)V

    .line 610
    invoke-virtual/range {v23 .. v23}, Ll/ۗ᩵᩵;->᩻()Ll/᩸ۡ᩵;

    move-result-object v1

    sget-object v2, Ll/᩸ۡ᩵;->۫:Ll/᩸ۡ᩵;

    invoke-virtual {v1, v2}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result v1

    if-nez v1, :cond_12

    .line 183
    invoke-virtual {v10}, Ll/ۗᩴ᩵;->ܿ֫()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_13

    .line 611
    :cond_12
    invoke-virtual {v10, v0}, Ll/ۗᩴ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 612
    invoke-virtual {v10}, Ll/ۗᩴ᩵;->ۜ֫()[B

    move-result-object v1

    .line 613
    array-length v2, v1

    const/4 v3, 0x0

    invoke-virtual {v10, v3, v2, v1}, Ll/۫ᩴ᩵;->ۧ(II[B)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 617
    :cond_13
    invoke-direct {v7, v0}, Ll/᩻֨᩵;->֫(Ll/ܿۖ᩵;)V

    goto :goto_9

    .line 614
    :cond_14
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Signature validation failed"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0

    .line 618
    :cond_15
    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_9

    .line 621
    :cond_16
    invoke-interface {v6}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 622
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No digest setup "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " B "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Ll/᩻֨᩵;->ܶ()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_17
    :goto_9
    const/4 v0, 0x1

    .line 1178
    iput-boolean v0, v7, Ll/᩻֨᩵;->ۗ:Z

    .line 1179
    iget-object v0, v7, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1180
    invoke-virtual {v10}, Ll/ۗᩴ᩵;->᩷֫()J

    move-result-wide v0

    iput-wide v0, v7, Ll/᩻֨᩵;->ۤ:J

    if-nez v20, :cond_18

    .line 628
    invoke-virtual {v10}, Ll/ۗᩴ᩵;->᩹()Ll/֫ۖ᩵;

    move-result-object v0

    return-object v0

    .line 626
    :cond_18
    throw v20

    :cond_19
    move/from16 v19, v2

    move-object v14, v3

    move-object v13, v6

    move-object v15, v9

    move-object/from16 v9, v23

    goto/16 :goto_3
.end method

.method private ֫(Ll/᩷֨᩵;Ljava/lang/String;Ll/۟ܺ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;
    .locals 25

    move-object/from16 v7, p0

    move-object/from16 v8, p3

    .line 718
    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ll/ۗ᩵᩵;

    .line 719
    invoke-virtual {v9}, Ll/ۗ᩵᩵;->֨֫()[B

    move-result-object v0

    .line 720
    invoke-virtual {v9}, Ll/ۗ᩵᩵;->۠֫()I

    move-result v1

    .line 721
    iget-object v2, v7, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    invoke-interface {v2}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v2

    const/4 v10, 0x1

    if-eqz v1, :cond_0

    if-nez v2, :cond_0

    const/4 v1, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 724
    :goto_0
    iget-wide v11, v7, Ll/᩻֨᩵;->ۤ:J

    move-object/from16 v16, p1

    .line 726
    monitor-enter v16

    .line 727
    :try_start_0
    iget-object v1, v7, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    iget-object v1, v7, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v13, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v9

    move-object v6, v13

    .line 729
    invoke-virtual/range {v1 .. v6}, Ll/᩻֨᩵;->֫(Ll/᩷֨᩵;Ljava/lang/String;Ll/ۗ᩵᩵;ZLjavax/security/auth/Subject;)Ll/ܶۚ᩵;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, v2

    move-object v4, v3

    .line 731
    :goto_1
    invoke-static {v1, v0, v13}, Ll/᩻֨᩵;->֫(Ll/ܶۚ᩵;[BLjavax/security/auth/Subject;)[B

    move-result-object v23

    if-eqz v23, :cond_8

    .line 734
    new-instance v3, Ll/ۤ᩵᩵;

    .line 1200
    iget-object v0, v7, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v18

    .line 736
    invoke-virtual {v9}, Ll/ۗ᩵᩵;->۠֫()I

    move-result v19

    .line 737
    invoke-virtual {v9}, Ll/ۗ᩵᩵;->֡֫()I

    move-result v20

    move-object/from16 v17, v3

    move-wide/from16 v21, v11

    invoke-direct/range {v17 .. v23}, Ll/ۤ᩵᩵;-><init>(Ll/ᩴۡ᩵;IIJ[B)V

    if-eqz v8, :cond_1

    .line 742
    move-object v0, v8

    check-cast v0, Ll/ۗᩴ᩵;

    invoke-virtual {v3, v0}, Ll/ۤ᩵᩵;->֫(Ll/ۗᩴ᩵;)Z

    .line 745
    :cond_1
    iget-object v0, v7, Ll/᩻֨᩵;->᩶:Ll/ܿۖ᩵;

    invoke-virtual {v3, v0}, Ll/ۗᩴ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 746
    invoke-virtual {v3, v11, v12}, Ll/ۗᩴ᩵;->ۧ(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 749
    :try_start_1
    sget-object v0, Ll/֡ۚ᩵;->ۗ:Ll/֡ۚ᩵;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0
    :try_end_1
    .catch Ll/᩹ۚ᩵; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ll/ۗۚ᩵; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v5, p1

    :try_start_2
    invoke-virtual {v5, v3, v2, v0}, Ll/᩷֨᩵;->ۧ(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;

    move-result-object v0

    check-cast v0, Ll/ۛ᩵᩵;

    .line 750
    invoke-virtual {v0}, Ll/ۗᩴ᩵;->᩷֫()J

    move-result-wide v14

    cmp-long v6, v14, v11

    if-nez v6, :cond_2

    goto :goto_3

    .line 753
    :cond_2
    new-instance v0, Ll/᩹ۚ᩵;

    const-string v4, "Server did not reauthenticate after expiration"

    .line 44
    invoke-direct {v0, v4}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 753
    throw v0
    :try_end_2
    .catch Ll/᩹ۚ᩵; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ll/ۗۚ᩵; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object/from16 v5, p1

    .line 758
    :goto_2
    :try_start_3
    invoke-virtual {v3}, Ll/۬ᩴ᩵;->ۧ()Ll/۫ᩴ᩵;

    move-result-object v4

    check-cast v4, Ll/ۛ᩵᩵;

    .line 759
    invoke-virtual {v4}, Ll/۫ᩴ᩵;->۟()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v4}, Ll/۫ᩴ᩵;->ۘ()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v4}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v6

    if-eqz v6, :cond_3

    .line 760
    invoke-virtual {v4}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v6

    const v14, -0x3fffffea    # -2.0000052f

    if-ne v6, v14, :cond_7

    :cond_3
    move-object/from16 v24, v4

    move-object v4, v0

    move-object/from16 v0, v24

    .line 127
    :goto_3
    iget-object v6, v7, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    invoke-interface {v6}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v6

    .line 767
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ll/ۛ᩵᩵;->ۚ֫()Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, v7, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    .line 768
    invoke-interface {v6}, Ll/ۛ֡᩵;->ۗۧ()Z

    move-result v6

    if-nez v6, :cond_5

    iget-object v6, v7, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    invoke-interface {v6}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_4

    .line 769
    :cond_4
    new-instance v0, Ll/᩹ۚ᩵;

    const v1, -0x3fffff93    # -2.000026f

    .line 39
    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(I)V

    .line 769
    throw v0

    .line 770
    :cond_5
    :goto_4
    iget-object v6, v7, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    invoke-interface {v6}, Ll/ۛ֡᩵;->ܰ֫()Z

    .line 774
    invoke-virtual {v3}, Ll/ۗᩴ᩵;->getDigest()Ll/ۛᩴ᩵;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 776
    sget-object v6, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    const-string v14, "Setting digest"

    invoke-interface {v6, v14}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 777
    invoke-virtual {v3}, Ll/ۗᩴ᩵;->getDigest()Ll/ۛᩴ᩵;

    move-result-object v3

    invoke-direct {v7, v3}, Ll/᩻֨᩵;->֫(Ll/ܿۖ᩵;)V

    .line 780
    :cond_6
    invoke-virtual {v0}, Ll/ۛ᩵᩵;->᩵֫()[B

    move-result-object v3

    move-object/from16 v24, v3

    move-object v3, v0

    move-object/from16 v0, v24

    goto :goto_5

    .line 761
    :cond_7
    throw v0

    :catch_2
    move-exception v0

    .line 756
    throw v0

    :cond_8
    move-object/from16 v5, p1

    move-object/from16 v0, v23

    :goto_5
    if-nez v4, :cond_c

    .line 787
    invoke-interface {v1}, Ll/ܶۚ᩵;->֫()Z

    move-result v6

    if-eqz v6, :cond_b

    .line 1178
    iput-boolean v10, v7, Ll/᩻֨᩵;->ۗ:Z

    .line 1179
    iget-object v0, v7, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1180
    invoke-virtual {v3}, Ll/ۗᩴ᩵;->᩷֫()J

    move-result-wide v0

    iput-wide v0, v7, Ll/᩻֨᩵;->ۤ:J

    .line 790
    invoke-virtual {v3}, Ll/ۗᩴ᩵;->᩹()Ll/֫ۖ᩵;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 792
    invoke-interface {v0}, Ll/ܰ֨᩵;->۟()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 793
    monitor-exit v16

    return-object v0

    :cond_9
    if-eqz v8, :cond_a

    .line 796
    iget-object v0, v7, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    move-object/from16 v6, p4

    invoke-virtual {v0, v8, v2, v6}, Ll/᩷֨᩵;->ۧ(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;

    move-result-object v0

    monitor-exit v16

    return-object v0

    .line 798
    :cond_a
    monitor-exit v16

    return-object v2

    :cond_b
    move-object/from16 v6, p4

    goto/16 :goto_1

    .line 784
    :cond_c
    throw v4

    :catchall_0
    move-exception v0

    .line 801
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method private ֫(Ll/ܿۖ᩵;)V
    .locals 2

    .line 309
    iget-object v0, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0}, Ll/᩷֨᩵;->۬()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 310
    iput-object p1, p0, Ll/᩻֨᩵;->᩶:Ll/ܿۖ᩵;

    return-void

    .line 312
    :cond_0
    invoke-virtual {v0, p1}, Ll/᩷֨᩵;->֫(Ll/ܿۖ᩵;)V

    return-void
.end method

.method private ֫(Ll/᩷֨᩵;Ljava/lang/String;Ll/ۨۖ᩵;Ll/ۨۖ᩵;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 827
    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v3

    check-cast v3, Ll/ۡۘ᩵;

    .line 828
    iget-object v4, v1, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    invoke-interface {v4}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v5

    const/16 v6, 0xa

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v6, v5

    move-object v5, v0

    :goto_0
    const/16 v0, 0xa

    .line 830
    iget-object v12, v1, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v13, v1, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    const/16 v14, 0x14

    iget-object v15, v1, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    move-object/from16 p2, v9

    sget-object v9, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    if-eq v7, v0, :cond_14

    if-ne v7, v14, :cond_13

    if-nez v6, :cond_0

    .line 912
    invoke-virtual {v3}, Ll/ۡۘ᩵;->ۖ֫()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v14, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_1
    if-nez v8, :cond_3

    .line 916
    iget-object v0, v1, Ll/᩻֨᩵;->᩺:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 917
    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->ۙ()Ll/ۘۡ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۘۡ᩵;->֫()Ljava/lang/String;

    move-result-object v8

    .line 919
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->ۙ()Ll/ۘۡ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۘۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object/from16 v16, v8

    const-string v8, "Failed to resolve host name"

    .line 921
    invoke-interface {v9, v8, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object/from16 v8, v16

    goto :goto_3

    :cond_1
    :goto_2
    move-object v8, v0

    .line 925
    :goto_3
    invoke-interface {v9}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 926
    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v16, v10

    const-string v10, "Remote host is "

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_4

    :cond_2
    move-object/from16 v16, v10

    .line 1200
    :goto_4
    invoke-virtual {v15}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v0

    .line 930
    invoke-virtual {v3}, Ll/ۡۘ᩵;->᩵֫()Ll/ܰۖ᩵;

    move-result-object v10

    iget-object v10, v10, Ll/ܰۖ᩵;->ۧ:[B

    invoke-interface {v4, v0, v8, v10, v14}, Ll/ۛ֡᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;[BZ)Ll/ܶۚ᩵;

    move-result-object v8

    goto :goto_5

    :cond_3
    move-object/from16 v16, v10

    .line 954
    :goto_5
    invoke-interface {v9}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 955
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_4
    if-nez v5, :cond_5

    const/4 v0, 0x0

    goto :goto_6

    .line 976
    :cond_5
    :try_start_1
    array-length v0, v5

    :goto_6
    invoke-interface {v8, v0, v5}, Ll/ܶۚ᩵;->֫(I[B)[B

    move-result-object v0
    :try_end_1
    .catch Ll/ۗۚ᩵; {:try_start_1 .. :try_end_1} :catch_4

    if-eqz v0, :cond_e

    .line 995
    new-instance v5, Ll/ܶۘ᩵;

    .line 1200
    invoke-virtual {v15}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v10

    const/4 v11, 0x0

    .line 995
    invoke-direct {v5, v10, v3, v11, v0}, Ll/ܶۘ᩵;-><init>(Ll/ᩴۡ᩵;Ll/ۡۘ᩵;Ll/ۨۖ᩵;Ljava/lang/Object;)V

    .line 997
    invoke-virtual/range {p0 .. p0}, Ll/᩻֨᩵;->ܳ()Ll/ܿۖ᩵;

    move-result-object v0

    invoke-virtual {v5, v0}, Ll/ۨۖ᩵;->֫(Ll/ܿۖ᩵;)V

    if-eqz v14, :cond_7

    .line 998
    invoke-interface {v8}, Ll/ܶۚ᩵;->֫()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual/range {p0 .. p0}, Ll/᩻֨᩵;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 999
    invoke-interface {v8}, Ll/ܶۚ᩵;->ۧ()[B

    move-result-object v0

    if-eqz v0, :cond_6

    .line 1001
    new-instance v10, Ll/ۛۖ᩵;

    invoke-direct {v10, v0}, Ll/ۛۖ᩵;-><init>([B)V

    invoke-virtual {v5, v10}, Ll/ۨۖ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 1003
    :cond_6
    iput-object v0, v1, Ll/᩻֨᩵;->ۛ:[B

    goto :goto_7

    :cond_7
    const-string v0, "Not yet initializing signing"

    .line 1005
    invoke-interface {v9, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 1008
    :goto_7
    new-instance v10, Ll/᩸ۘ᩵;

    .line 1200
    invoke-virtual {v15}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v0

    .line 1008
    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    const/4 v11, 0x0

    invoke-direct {v10, v0, v11}, Ll/᩸ۘ᩵;-><init>(Ll/֨ۡ᩵;Ll/ۨۖ᩵;)V

    const/4 v0, 0x1

    .line 1009
    invoke-virtual {v10, v0}, Ll/ۨۖ᩵;->֫(Z)V

    .line 1217
    iget v0, v1, Ll/᩻֨᩵;->ܽ֫:I

    .line 1010
    invoke-virtual {v5, v0}, Ll/ۨۖ᩵;->ۧ(I)V

    const/4 v0, 0x0

    .line 1173
    iput v0, v1, Ll/᩻֨᩵;->ܽ֫:I

    .line 1014
    :try_start_2
    invoke-virtual {v2, v5, v10}, Ll/᩷֨᩵;->֫(Ll/۟ܺ᩵;Ll/ۨۖ᩵;)V
    :try_end_2
    .catch Ll/᩹ۚ᩵; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ll/ۗۚ᩵; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v11, p2

    goto :goto_8

    :catch_1
    move-exception v0

    move-object v11, v0

    .line 1019
    invoke-virtual {v11}, Ll/ۗۚ᩵;->֫()I

    move-result v0

    const v14, -0x3ffffff3    # -2.000003f

    if-ne v0, v14, :cond_8

    .line 1022
    new-instance v0, Ll/᩹ۚ᩵;

    const-string v14, "Login failed"

    .line 49
    invoke-direct {v0, v14, v11}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object v11, v0

    .line 1032
    :cond_8
    :try_start_3
    invoke-virtual/range {p1 .. p1}, Ll/۟֨᩵;->ܽ()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_8

    :catch_2
    move-exception v0

    move-object v14, v0

    const-string v0, "Failed to disconnect transport"

    .line 1034
    invoke-interface {v9, v0, v14}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 127
    :goto_8
    invoke-interface {v13}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    .line 1038
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ll/᩸ۘ᩵;->ۖ֫()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1039
    invoke-interface {v4}, Ll/ۛ֡᩵;->ۗۧ()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-interface {v4}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_9

    .line 1040
    :cond_9
    new-instance v0, Ll/᩹ۚ᩵;

    const v2, -0x3fffff93    # -2.000026f

    .line 39
    invoke-direct {v0, v2}, Ll/ۗۚ᩵;-><init>(I)V

    .line 1040
    throw v0

    .line 1041
    :cond_a
    :goto_9
    invoke-interface {v4}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {v10}, Ll/᩸ۘ᩵;->ۖ֫()Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v6, 0x1

    :cond_b
    if-nez v11, :cond_d

    .line 1049
    invoke-virtual {v10}, Ll/ۨۖ᩵;->ܿ֫()I

    move-result v0

    .line 1173
    iput v0, v1, Ll/᩻֨᩵;->ܽ֫:I

    .line 1051
    invoke-virtual {v5}, Ll/ۨۖ᩵;->getDigest()Ll/ۛۖ᩵;

    move-result-object v0

    if-eqz v0, :cond_c

    const-string v0, "Setting digest"

    .line 1053
    invoke-interface {v9, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1054
    invoke-virtual {v5}, Ll/ۨۖ᩵;->getDigest()Ll/ۛۖ᩵;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/᩻֨᩵;->֫(Ll/ܿۖ᩵;)V

    .line 1057
    :cond_c
    invoke-virtual {v10}, Ll/᩸ۘ᩵;->ܺ֫()[B

    move-result-object v0

    move-object/from16 v17, v5

    move-object v5, v0

    move-object v0, v10

    move-object/from16 v10, v17

    goto :goto_a

    .line 1046
    :cond_d
    throw v11

    :catch_3
    move-exception v0

    move-object v2, v0

    .line 1016
    throw v2

    :cond_e
    move-object v5, v0

    move-object v0, v11

    move-object/from16 v10, v16

    move-object/from16 v11, p2

    .line 1060
    :goto_a
    invoke-interface {v8}, Ll/ܶۚ᩵;->֫()Z

    move-result v13

    if-eqz v13, :cond_12

    const-string v7, "Context is established"

    .line 1061
    invoke-interface {v9, v7}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    const/4 v7, 0x0

    .line 1191
    iput-object v7, v1, Ll/᩻֨᩵;->۬:Ljava/lang/String;

    .line 1063
    invoke-interface {v8}, Ll/ܶۚ᩵;->ۧ()[B

    move-result-object v7

    iput-object v7, v1, Ll/᩻֨᩵;->ۛ:[B

    if-eqz v10, :cond_f

    .line 1064
    invoke-virtual {v10}, Ll/ۨۖ᩵;->getDigest()Ll/ۛۖ᩵;

    move-result-object v7

    if-eqz v7, :cond_f

    .line 1066
    invoke-virtual {v10}, Ll/ۨۖ᩵;->getDigest()Ll/ۛۖ᩵;

    move-result-object v7

    invoke-direct {v1, v7}, Ll/᩻֨᩵;->֫(Ll/ܿۖ᩵;)V

    goto :goto_c

    :cond_f
    if-nez v6, :cond_11

    .line 1067
    invoke-virtual/range {p0 .. p0}, Ll/᩻֨᩵;->ܶ()Z

    move-result v7

    if-eqz v7, :cond_11

    .line 1068
    invoke-interface {v8}, Ll/ܶۚ᩵;->ۧ()[B

    move-result-object v7

    if-eqz v7, :cond_10

    if-eqz v0, :cond_10

    .line 1070
    new-instance v9, Ll/ۛۖ᩵;

    const/4 v13, 0x0

    invoke-direct {v9, v7, v13}, Ll/ۛۖ᩵;-><init>([BLjava/lang/Object;)V

    invoke-direct {v1, v9}, Ll/᩻֨᩵;->֫(Ll/ܿۖ᩵;)V

    goto :goto_b

    .line 1071
    :cond_10
    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v9

    invoke-interface {v9}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    :goto_b
    iput-object v7, v1, Ll/᩻֨᩵;->ۛ:[B

    .line 1185
    :cond_11
    :goto_c
    invoke-virtual {v0}, Ll/ۨۖ᩵;->ܳ֫()Z

    move-result v7

    iput-boolean v7, v1, Ll/᩻֨᩵;->ۗ:Z

    const/4 v7, 0x2

    .line 1186
    invoke-virtual {v12, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    const/4 v14, 0x0

    move-object v9, v11

    move-object v11, v0

    goto :goto_e

    :cond_12
    move-object v9, v11

    goto :goto_f

    :catch_4
    move-exception v0

    :try_start_4
    const-string v3, "Exception during SSP authentication"

    .line 985
    invoke-interface {v9, v3, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 986
    invoke-virtual/range {p1 .. p1}, Ll/۟֨᩵;->ܽ()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    goto :goto_d

    :catch_5
    const-string v2, "Disconnect failed"

    .line 988
    invoke-interface {v9, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :goto_d
    const/4 v2, 0x0

    .line 1173
    iput v2, v1, Ll/᩻֨᩵;->ܽ֫:I

    .line 991
    throw v0

    .line 1082
    :cond_13
    new-instance v0, Ll/ۗۚ᩵;

    const-string v2, "Unexpected session setup state: "

    .line 0
    invoke-static {v7, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1082
    invoke-direct {v0, v2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    move-object/from16 v16, v10

    const/high16 v0, -0x80000000

    .line 212
    invoke-virtual/range {p1 .. p1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v7

    invoke-interface {v7, v0}, Ll/᩷ۖ᩵;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string v0, "Extended security negotiated"

    .line 834
    invoke-interface {v9, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    move-object/from16 v9, p2

    move-object/from16 v10, v16

    :goto_e
    move-object v0, v11

    move v7, v14

    :goto_f
    move-object/from16 v11, p3

    goto/16 :goto_15

    .line 1200
    :cond_15
    invoke-virtual {v15}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v0

    .line 837
    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Performing legacy session setup"

    .line 841
    invoke-interface {v9, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 842
    instance-of v0, v4, Ll/ᩴۚ᩵;

    if-eqz v0, :cond_23

    .line 846
    move-object v0, v4

    check-cast v0, Ll/ᩴۚ᩵;

    .line 848
    new-instance v7, Ll/ܶۘ᩵;

    .line 1200
    invoke-virtual {v15}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v10

    move-object/from16 v11, p3

    .line 848
    invoke-direct {v7, v10, v3, v11, v4}, Ll/ܶۘ᩵;-><init>(Ll/ᩴۡ᩵;Ll/ۡۘ᩵;Ll/ۨۖ᩵;Ljava/lang/Object;)V

    .line 850
    invoke-virtual/range {p0 .. p0}, Ll/᩻֨᩵;->ܳ()Ll/ܿۖ᩵;

    move-result-object v10

    invoke-virtual {v7, v10}, Ll/ۨۖ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 851
    new-instance v10, Ll/᩸ۘ᩵;

    .line 1200
    invoke-virtual {v15}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v14

    .line 851
    invoke-interface {v14}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v14

    move-object/from16 v16, v5

    move-object/from16 v5, p4

    invoke-direct {v10, v14, v5}, Ll/᩸ۘ᩵;-><init>(Ll/֨ۡ᩵;Ll/ۨۖ᩵;)V

    const/4 v14, 0x0

    .line 852
    invoke-virtual {v10, v14}, Ll/ۨۖ᩵;->֫(Z)V

    if-nez v6, :cond_1a

    .line 859
    invoke-virtual/range {p0 .. p0}, Ll/᩻֨᩵;->ܶ()Z

    move-result v14

    if-eqz v14, :cond_1a

    .line 1200
    invoke-virtual {v15}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v14

    .line 1092
    instance-of v5, v0, Ll/ۖۚ᩵;

    if-eqz v5, :cond_16

    move-object v5, v0

    check-cast v5, Ll/ۖۚ᩵;

    invoke-virtual {v5}, Ll/ۖۚ᩵;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_16

    .line 1093
    invoke-interface {v14}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_16
    const-string v5, "Initialize signing"

    .line 869
    invoke-interface {v9, v5}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1200
    invoke-virtual {v15}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v5

    .line 870
    invoke-virtual {v3}, Ll/ۡۘ᩵;->᩵֫()Ll/ܰۖ᩵;

    move-result-object v9

    iget-object v9, v9, Ll/ܰۖ᩵;->ۧ:[B

    .line 493
    invoke-interface {v5}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v14

    check-cast v14, Ll/ܰۡ᩵;

    invoke-virtual {v14}, Ll/ܰۡ᩵;->ۢ()I

    move-result v14

    if-eqz v14, :cond_18

    const/4 v15, 0x1

    if-eq v14, v15, :cond_18

    const/4 v15, 0x2

    if-eq v14, v15, :cond_18

    const/4 v0, 0x3

    if-eq v14, v0, :cond_17

    const/4 v0, 0x4

    if-eq v14, v0, :cond_17

    const/4 v0, 0x5

    if-eq v14, v0, :cond_17

    const/4 v0, 0x0

    goto :goto_10

    .line 508
    :cond_17
    new-instance v0, Ll/ۗۚ᩵;

    const-string v2, "NTLMv2 requires extended security (jcifs.smb.client.useExtendedSecurity must be true if jcifs.smb.lmCompatibility >= 3)"

    invoke-direct {v0, v2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    const/16 v14, 0x28

    new-array v14, v14, [B

    .line 498
    invoke-virtual {v0, v5, v9, v14}, Ll/ᩴۚ᩵;->֫(Ll/ᩴۡ᩵;[B[B)V

    .line 499
    invoke-virtual {v0, v5, v9}, Ll/ᩴۚ᩵;->ۧ(Ll/ᩴۡ᩵;[B)[B

    move-result-object v0

    const/16 v5, 0x10

    const/16 v9, 0x18

    const/4 v15, 0x0

    invoke-static {v0, v15, v14, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v14

    :goto_10
    const/4 v5, 0x0

    if-eqz v0, :cond_19

    .line 874
    new-instance v9, Ll/ۛۖ᩵;

    invoke-direct {v9, v0, v5}, Ll/ۛۖ᩵;-><init>([BI)V

    invoke-virtual {v7, v9}, Ll/ۨۖ᩵;->֫(Ll/ܿۖ᩵;)V

    goto :goto_11

    .line 872
    :cond_19
    new-instance v0, Ll/ۗۚ᩵;

    const-string v2, "Need a signature key but the server did not provide one"

    invoke-direct {v0, v2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0

    .line 879
    :cond_1a
    :goto_11
    :try_start_5
    invoke-virtual {v2, v7, v10}, Ll/᩷֨᩵;->֫(Ll/۟ܺ᩵;Ll/ۨۖ᩵;)V
    :try_end_5
    .catch Ll/᩹ۚ᩵; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ll/ۗۚ᩵; {:try_start_5 .. :try_end_5} :catch_6

    move-object/from16 v9, p2

    goto :goto_12

    :catch_6
    move-exception v0

    move-object v9, v0

    .line 127
    :goto_12
    invoke-interface {v13}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    .line 886
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ll/᩸ۘ᩵;->ۖ֫()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 887
    invoke-virtual {v3}, Ll/ۡۘ᩵;->᩵֫()Ll/ܰۖ᩵;

    move-result-object v0

    iget v0, v0, Ll/ܰۖ᩵;->ۢ:I

    if-eqz v0, :cond_1c

    .line 888
    invoke-interface {v4}, Ll/ۛ֡᩵;->ۗۧ()Z

    move-result v0

    if-nez v0, :cond_1c

    invoke-interface {v4}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_13

    .line 889
    :cond_1b
    new-instance v0, Ll/᩹ۚ᩵;

    const v2, -0x3fffff93    # -2.000026f

    .line 39
    invoke-direct {v0, v2}, Ll/ۗۚ᩵;-><init>(I)V

    .line 889
    throw v0

    .line 890
    :cond_1c
    :goto_13
    invoke-interface {v4}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v0

    if-nez v0, :cond_1d

    invoke-virtual {v10}, Ll/᩸ۘ᩵;->ۖ֫()Z

    move-result v0

    if-eqz v0, :cond_1d

    const/4 v6, 0x1

    :cond_1d
    if-nez v9, :cond_22

    .line 898
    invoke-virtual {v10}, Ll/ۨۖ᩵;->ܿ֫()I

    move-result v0

    .line 1173
    iput v0, v1, Ll/᩻֨᩵;->ܽ֫:I

    .line 900
    invoke-virtual {v7}, Ll/ۨۖ᩵;->getDigest()Ll/ۛۖ᩵;

    move-result-object v0

    if-eqz v0, :cond_1e

    .line 902
    invoke-virtual {v7}, Ll/ۨۖ᩵;->getDigest()Ll/ۛۖ᩵;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/᩻֨᩵;->֫(Ll/ܿۖ᩵;)V

    goto :goto_14

    :cond_1e
    if-nez v6, :cond_20

    .line 903
    invoke-virtual/range {p0 .. p0}, Ll/᩻֨᩵;->ܶ()Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_14

    .line 904
    :cond_1f
    new-instance v0, Ll/ۗۚ᩵;

    const-string v2, "Signing required but no session key available"

    invoke-direct {v0, v2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1185
    :cond_20
    :goto_14
    invoke-virtual {v10}, Ll/ۨۖ᩵;->ܳ֫()Z

    move-result v0

    iput-boolean v0, v1, Ll/᩻֨᩵;->ۗ:Z

    const/4 v0, 0x2

    .line 1186
    invoke-virtual {v12, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    const/4 v0, 0x0

    move-object v0, v10

    move-object/from16 v5, v16

    move-object v10, v7

    const/4 v7, 0x0

    :goto_15
    if-nez v7, :cond_21

    return-void

    :cond_21
    const/16 v12, 0xa

    move-object v11, v0

    goto/16 :goto_0

    .line 895
    :cond_22
    throw v9

    :catch_7
    move-exception v0

    move-object v2, v0

    .line 881
    throw v2

    .line 843
    :cond_23
    new-instance v0, Ll/᩹ۚ᩵;

    const-string v2, "Incompatible credentials"

    .line 44
    invoke-direct {v0, v2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 843
    throw v0
.end method

.method public static ֫(Ll/ܶۚ᩵;[BLjavax/security/auth/Subject;)[B
    .locals 1

    if-eqz p2, :cond_1

    .line 637
    :try_start_0
    new-instance v0, Ll/ܿ֨᩵;

    invoke-direct {v0, p0, p1}, Ll/ܿ֨᩵;-><init>(Ll/ܶۚ᩵;[B)V

    invoke-static {p2, v0}, Ljavax/security/auth/Subject;->doAs(Ljavax/security/auth/Subject;Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B
    :try_end_0
    .catch Ljava/security/PrivilegedActionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 646
    invoke-virtual {p0}, Ljava/security/PrivilegedActionException;->getException()Ljava/lang/Exception;

    move-result-object p1

    instance-of p1, p1, Ll/ۗۚ᩵;

    if-eqz p1, :cond_0

    .line 647
    invoke-virtual {p0}, Ljava/security/PrivilegedActionException;->getException()Ljava/lang/Exception;

    move-result-object p0

    check-cast p0, Ll/ۗۚ᩵;

    throw p0

    .line 649
    :cond_0
    new-instance p1, Ll/ۗۚ᩵;

    const-string p2, "Unexpected exception during context initialization"

    invoke-direct {p1, p2, p0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p1

    :cond_1
    if-nez p1, :cond_2

    const/4 p2, 0x0

    goto :goto_0

    .line 652
    :cond_2
    array-length p2, p1

    :goto_0
    invoke-interface {p0, p2, p1}, Ll/ܶۚ᩵;->֫(I[B)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 213
    invoke-virtual {p0}, Ll/᩻֨᩵;->᩸()V

    return-void
.end method

.method public final finalize()V
    .locals 5

    .line 200
    invoke-virtual {p0}, Ll/᩻֨᩵;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩵;->ᩳ֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 201
    sget-object v0, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    const-string v1, "Session was not properly released"

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final getContext()Ll/ᩴۡ᩵;
    .locals 1

    .line 1200
    iget-object v0, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1167
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SmbSession[credentials="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->֫()Ll/ۛ֡᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",targetHost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻֨᩵;->᩺:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",targetDomain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻֨᩵;->ۨ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩻֨᩵;->ܽ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",connectionState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",usage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻֨᩵;->ᩳ֫:Ljava/util/concurrent/atomic/AtomicLong;

    .line 1168
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Z
    .locals 5

    .line 152
    iget-object v0, p0, Ll/᩻֨᩵;->ᩳ֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    const-string v0, "\\IPC$"

    .line 348
    iget-object v5, v1, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    sget-object v6, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    const-string v7, "Have referral "

    const-string v8, "Response: "

    const-string v9, "Request: "

    const-string v10, "Response "

    const-string v11, "Request "

    const-string v12, "\\\\"

    .line 278
    iget-object v13, v1, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v13}, Ll/۟֨᩵;->֫()V

    if-eqz v3, :cond_0

    .line 350
    :try_start_0
    invoke-interface/range {p2 .. p2}, Ll/ܰ֨᩵;->ۤ()V

    .line 351
    iget-boolean v14, v1, Ll/᩻֨᩵;->ۗ:Z

    invoke-interface {v3, v14}, Ll/ܰܺ᩵;->֫(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_4

    .line 355
    :cond_0
    :goto_0
    :try_start_1
    sget-object v14, Ll/֡ۚ᩵;->ۙ:Ll/֡ۚ᩵;

    invoke-interface {v4, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    const-wide/16 v14, -0x1

    .line 356
    iput-wide v14, v1, Ll/᩻֨᩵;->ۙ:J

    move-object/from16 v17, v7

    move-object/from16 v16, v8

    goto :goto_1

    .line 358
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    invoke-interface {v5}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v16

    check-cast v16, Ll/ܰۡ᩵;

    move-object/from16 v17, v7

    invoke-virtual/range {v16 .. v16}, Ll/ܰۡ᩵;->ۧ֫()I

    move-result v7

    move-object/from16 v16, v8

    int-to-long v7, v7

    add-long/2addr v14, v7

    iput-wide v14, v1, Ll/᩻֨᩵;->ۙ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 363
    :goto_1
    :try_start_2
    invoke-virtual/range {p0 .. p2}, Ll/᩻֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;)Ll/ܰܺ᩵;

    move-result-object v7

    check-cast v7, Ll/֫ۖ᩵;
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v7, :cond_2

    .line 368
    :try_start_3
    invoke-interface {v7}, Ll/ܰ֨᩵;->۟()Z

    move-result v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v8, :cond_2

    const/4 v0, 0x0

    .line 436
    :try_start_4
    invoke-interface {v2, v0}, Ll/ܰܺ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 437
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v5}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ۧ֫()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/᩻֨᩵;->ۙ:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 122
    invoke-virtual {v13}, Ll/۟֨᩵;->ۘ()V

    return-object v7

    .line 372
    :cond_2
    :try_start_5
    instance-of v7, v2, Ll/ۙۘ᩵;

    if-eqz v7, :cond_3

    .line 373
    move-object v7, v2

    check-cast v7, Ll/ۙۘ᩵;

    .line 374
    iget-object v8, v1, Ll/᩻֨᩵;->۬:Ljava/lang/String;

    if-eqz v8, :cond_3

    invoke-virtual {v7}, Ll/ۨۖ᩵;->getPath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 381
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v12, v1, Ll/᩻֨᩵;->۬:Ljava/lang/String;

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;)V

    .line 385
    :cond_3
    iget-wide v7, v1, Ll/᩻֨᩵;->ۤ:J

    invoke-interface {v2, v7, v8}, Ll/ܰܺ᩵;->ۧ(J)V

    .line 386
    iget v0, v1, Ll/᩻֨᩵;->ܽ֫:I

    invoke-interface {v2, v0}, Ll/ܰܺ᩵;->ۧ(I)V

    .line 388
    invoke-interface/range {p1 .. p1}, Ll/ܰܺ᩵;->getDigest()Ll/ܿۖ᩵;

    move-result-object v0

    if-nez v0, :cond_4

    .line 389
    invoke-virtual/range {p0 .. p0}, Ll/᩻֨᩵;->ܳ()Ll/ܿۖ᩵;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ܰܺ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 392
    :cond_4
    instance-of v0, v2, Ll/ܽۖ᩵;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    iget-object v7, v1, Ll/᩻֨᩵;->ۨ:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 393
    :try_start_6
    move-object v0, v2

    check-cast v0, Ll/ܽۖ᩵;

    .line 394
    move-object v8, v2

    check-cast v8, Ll/ܽۖ᩵;

    .line 143
    iget-object v12, v1, Ll/᩻֨᩵;->᩺:Ljava/lang/String;

    .line 394
    invoke-interface {v0}, Ll/ܽۖ᩵;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v7, v12, v0}, Ll/ܽۖ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 398
    :cond_5
    :try_start_7
    invoke-interface {v6}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 399
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V
    :try_end_7
    .catch Ll/۟֡᩵; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ll/ۗۚ᩵; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 402
    :cond_6
    :try_start_8
    invoke-virtual {v13, v2, v3, v4}, Ll/᩷֨᩵;->ۧ(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;

    move-result-object v3
    :try_end_8
    .catch Ll/ۗۚ᩵; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 418
    :try_start_9
    invoke-interface {v6}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 419
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V
    :try_end_9
    .catch Ll/۟֡᩵; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ll/ۗۚ᩵; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :cond_7
    const/4 v0, 0x0

    .line 436
    :try_start_a
    invoke-interface {v2, v0}, Ll/ܰܺ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 437
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-interface {v5}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ۧ֫()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v6, v4

    iput-wide v6, v1, Ll/᩻֨᩵;->ۙ:J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 122
    invoke-virtual {v13}, Ll/۟֨᩵;->ۘ()V

    return-object v3

    :catch_0
    move-exception v0

    move-object v8, v0

    .line 404
    :try_start_b
    invoke-virtual {v8}, Ll/ۗۚ᩵;->֫()I

    move-result v0

    const v10, -0x3ffffca4    # -2.000205f

    const v11, -0x3ffffdfd    # -2.0001228f

    if-eq v0, v10, :cond_8

    invoke-virtual {v8}, Ll/ۗۚ᩵;->֫()I

    move-result v0

    if-ne v0, v11, :cond_a

    :cond_8
    invoke-virtual {v13}, Ll/᩷֨᩵;->۬()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 407
    invoke-virtual {v8}, Ll/ۗۚ᩵;->֫()I

    move-result v0
    :try_end_b
    .catch Ll/۟֡᩵; {:try_start_b .. :try_end_b} :catch_3
    .catch Ll/ۗۚ᩵; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    if-ne v0, v11, :cond_9

    :try_start_c
    const-string v0, "Got NT_STATUS_USER_SESSION_DELETED, disconnecting transport"

    .line 409
    invoke-interface {v6, v0}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    .line 410
    invoke-virtual {v13}, Ll/۟֨᩵;->ܽ()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    goto :goto_2

    :catch_1
    move-exception v0

    :try_start_d
    const-string v10, "Got NT_STATUS_USER_SESSION_DELETED, disconnected transport with error"

    .line 412
    invoke-interface {v6, v10, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_2
    const-string v0, "Session expired, trying reauth"

    .line 415
    invoke-interface {v6, v0, v8}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 416
    invoke-direct {v1, v13, v7, v2, v4}, Ll/᩻֨᩵;->֫(Ll/᩷֨᩵;Ljava/lang/String;Ll/۟ܺ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;

    move-result-object v0
    :try_end_d
    .catch Ll/۟֡᩵; {:try_start_d .. :try_end_d} :catch_3
    .catch Ll/ۗۚ᩵; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    const/4 v3, 0x0

    .line 436
    :try_start_e
    invoke-interface {v2, v3}, Ll/ܰܺ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 437
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v5}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    check-cast v4, Ll/ܰۡ᩵;

    invoke-virtual {v4}, Ll/ܰۡ᩵;->ۧ֫()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/᩻֨᩵;->ۙ:J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 122
    invoke-virtual {v13}, Ll/۟֨᩵;->ۘ()V

    return-object v0

    .line 405
    :cond_a
    :try_start_f
    throw v8
    :try_end_f
    .catch Ll/۟֡᩵; {:try_start_f .. :try_end_f} :catch_3
    .catch Ll/ۗۚ᩵; {:try_start_f .. :try_end_f} :catch_2
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    :catch_2
    move-exception v0

    .line 428
    :try_start_10
    invoke-interface {v6}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_b

    const-string v4, "Send failed"

    .line 429
    invoke-interface {v6, v4, v0}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 430
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 431
    new-instance v4, Ljava/lang/StringBuilder;

    move-object/from16 v7, v16

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v6, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 433
    :cond_b
    throw v0

    :catch_3
    move-exception v0

    .line 423
    invoke-interface {v6}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 424
    new-instance v3, Ljava/lang/StringBuilder;

    move-object/from16 v4, v17

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v6, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 426
    :cond_c
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    .line 365
    new-instance v3, Ll/ۗۚ᩵;

    const-string v4, "Session setup failed"

    invoke-direct {v3, v4, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    :goto_3
    const/4 v3, 0x0

    .line 436
    :try_start_11
    invoke-interface {v2, v3}, Ll/ܰܺ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 437
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v5}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    check-cast v4, Ll/ܰۡ᩵;

    invoke-virtual {v4}, Ll/ܰۡ᩵;->ۧ֫()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/᩻֨᩵;->ۙ:J

    .line 438
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 122
    :goto_4
    :try_start_12
    invoke-virtual {v13}, Ll/۟֨᩵;->ۘ()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v3, v0

    .line 348
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v2
.end method

.method public final ֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;)Ll/ܰܺ᩵;
    .locals 7

    .line 1209
    iget-object v1, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    .line 278
    invoke-virtual {v1}, Ll/۟֨᩵;->֫()V

    move-object v0, v1

    .line 446
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 448
    :goto_0
    :try_start_1
    iget-object v2, p0, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v2

    if-nez v2, :cond_2

    .line 449
    iget-object v2, p0, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    goto :goto_1

    .line 453
    :cond_0
    :try_start_2
    iget-object v2, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 455
    :try_start_3
    new-instance p2, Ll/ۗۚ᩵;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p2, v2, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    .line 451
    :cond_1
    :goto_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 122
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V

    return-object p2

    .line 460
    :cond_2
    :try_start_4
    invoke-virtual {v1}, Ll/᩷֨᩵;->ᩴ()Z

    .line 466
    sget-object v2, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 467
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "sessionSetup: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 476
    :cond_3
    iput v3, p0, Ll/᩻֨᩵;->ܽ֫:I

    .line 478
    invoke-virtual {v1}, Ll/᩷֨᩵;->۬()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 479
    iget-object p2, p0, Ll/᩻֨᩵;->ۨ:Ljava/lang/String;

    check-cast p1, Ll/۬ᩴ᩵;

    invoke-direct {p0, v1, p2}, Ll/᩻֨᩵;->֫(Ll/᩷֨᩵;Ljava/lang/String;)Ll/֫ۖ᩵;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 493
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 122
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V

    return-object p1

    .line 482
    :cond_4
    :try_start_6
    iget-object v2, p0, Ll/᩻֨᩵;->ۨ:Ljava/lang/String;

    check-cast p1, Ll/ۨۖ᩵;

    move-object v5, p2

    check-cast v5, Ll/ۨۖ᩵;

    invoke-direct {p0, v1, v2, p1, v5}, Ll/᩻֨᩵;->֫(Ll/᩷֨᩵;Ljava/lang/String;Ll/ۨۖ᩵;Ll/ۨۖ᩵;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 493
    :try_start_7
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 122
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V

    return-object p2

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 485
    :try_start_8
    sget-object p2, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    const-string v2, "Session setup failed"

    invoke-interface {p2, v2, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 486
    iget-object p2, p0, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2, v4, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 489
    invoke-virtual {p0, v4, v4}, Ll/᩻֨᩵;->֫(ZZ)Z

    .line 491
    :cond_5
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 493
    :goto_2
    :try_start_9
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 494
    throw p1

    :catchall_1
    move-exception p1

    .line 495
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception p1

    .line 122
    :try_start_b
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p2

    .line 445
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public final ֫(Ll/᩷֨᩵;Ljava/lang/String;Ll/ۗ᩵᩵;ZLjavax/security/auth/Subject;)Ll/ܶۚ᩵;
    .locals 8

    .line 670
    sget-object v0, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    iget-object v1, p0, Ll/᩻֨᩵;->᩺:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 671
    invoke-virtual {p1}, Ll/᩷֨᩵;->ۙ()Ll/ۘۡ᩵;

    move-result-object v1

    invoke-interface {v1}, Ll/ۘۡ᩵;->֫()Ljava/lang/String;

    move-result-object v1

    .line 673
    :try_start_0
    invoke-virtual {p1}, Ll/᩷֨᩵;->ۙ()Ll/ۘۡ᩵;

    move-result-object p1

    invoke-interface {p1}, Ll/ۘۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v2, "Failed to resolve host name"

    .line 675
    invoke-interface {v0, v2, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    :goto_0
    move-object v5, v1

    .line 679
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 680
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Remote host is "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_1
    if-nez p5, :cond_2

    .line 1200
    iget-object p1, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {p1}, Ll/᩷֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object p1

    .line 684
    invoke-virtual {p3}, Ll/ۗ᩵᩵;->֨֫()[B

    move-result-object p2

    iget-object p3, p0, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    invoke-interface {p3, p1, v5, p2, p4}, Ll/ۛ֡᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;[BZ)Ll/ܶۚ᩵;

    move-result-object p1

    return-object p1

    .line 689
    :cond_2
    :try_start_1
    new-instance p1, Ll/ܳ֨᩵;

    move-object v2, p1

    move-object v3, p0

    move-object v4, p2

    move-object v6, p3

    move v7, p4

    invoke-direct/range {v2 .. v7}, Ll/ܳ֨᩵;-><init>(Ll/᩻֨᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵᩵;Z)V

    invoke-static {p5, p1}, Ljavax/security/auth/Subject;->doAs(Ljavax/security/auth/Subject;Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶۚ᩵;
    :try_end_1
    .catch Ljava/security/PrivilegedActionException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    .line 698
    invoke-virtual {p1}, Ljava/security/PrivilegedActionException;->getException()Ljava/lang/Exception;

    move-result-object p2

    instance-of p2, p2, Ll/ۗۚ᩵;

    if-eqz p2, :cond_3

    .line 699
    invoke-virtual {p1}, Ljava/security/PrivilegedActionException;->getException()Ljava/lang/Exception;

    move-result-object p1

    check-cast p1, Ll/ۗۚ᩵;

    throw p1

    .line 701
    :cond_3
    new-instance p2, Ll/ۗۚ᩵;

    const-string p3, "Unexpected exception during context initialization"

    invoke-direct {p2, p3, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public final ֫(Ljava/lang/String;)Ll/᩵֨᩵;
    .locals 4

    if-nez p1, :cond_0

    const-string p1, "IPC$"

    .line 260
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩵;->ۧ֫:Ljava/util/ArrayList;

    monitor-enter v0

    .line 261
    :try_start_0
    iget-object v1, p0, Ll/᩻֨᩵;->ۧ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵֨᩵;

    const/4 v3, 0x0

    .line 262
    invoke-virtual {v2, p1, v3}, Ll/᩵֨᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 136
    invoke-virtual {v2}, Ll/᩵֨᩵;->֫()V

    .line 263
    monitor-exit v0

    return-object v2

    .line 266
    :cond_2
    new-instance v1, Ll/᩵֨᩵;

    invoke-direct {v1, p0, p1}, Ll/᩵֨᩵;-><init>(Ll/᩻֨᩵;Ljava/lang/String;)V

    .line 136
    invoke-virtual {v1}, Ll/᩵֨᩵;->֫()V

    .line 268
    iget-object p1, p0, Ll/᩻֨᩵;->ۧ֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 270
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 6

    .line 175
    iget-object v0, p0, Ll/᩻֨᩵;->ᩳ֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    .line 176
    sget-object v2, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 177
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Acquire session "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    const-wide/16 v3, 0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_2

    move-object v0, p0

    .line 181
    monitor-enter v0

    .line 182
    :try_start_0
    iget-object v1, p0, Ll/᩻֨᩵;->۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Reacquire transport"

    .line 183
    invoke-interface {v2, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 184
    iget-object v1, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    .line 278
    invoke-virtual {v1}, Ll/۟֨᩵;->֫()V

    .line 186
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1233
    iget-object v0, p0, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    .line 336
    invoke-interface {p1}, Ll/ᩴۡ᩵;->֫()Ll/ۛ֡᩵;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/᩻֨᩵;->᩺:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/᩻֨᩵;->ۨ:Ljava/lang/String;

    .line 337
    invoke-static {p1, p3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(ZZ)Z
    .locals 13

    const-string v2, "Logging off session while still in use "

    const-string v1, "Logging off session on "

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1209
    :try_start_0
    iget-object v5, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    .line 278
    invoke-virtual {v5}, Ll/۟֨᩵;->֫()V
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    move-object v0, v5

    .line 1100
    :try_start_1
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 1101
    :try_start_2
    iget-object v6, p0, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v7, 0x3

    const/4 v8, 0x2

    invoke-virtual {v6, v8, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v6

    if-nez v6, :cond_0

    .line 1102
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 122
    :try_start_3
    invoke-virtual {v5}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catch Ll/ۗۚ᩵; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 1157
    iget-object p1, p0, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1158
    iput-object v3, p0, Ll/᩻֨᩵;->᩶:Ll/ܿۖ᩵;

    .line 1159
    iget-object p1, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    return v4

    .line 1105
    :cond_0
    :try_start_4
    sget-object v6, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    invoke-interface {v6}, Ll/֫᩻֨;->֫()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 1106
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1109
    :cond_1
    iput-object v3, p0, Ll/᩻֨᩵;->۬:Ljava/lang/String;

    .line 1111
    iget-object v1, p0, Ll/᩻֨᩵;->ۧ֫:Ljava/util/ArrayList;

    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1112
    :try_start_5
    iget-object v7, p0, Ll/᩻֨᩵;->ᩳ֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v9

    if-eqz p2, :cond_2

    const-wide/16 v11, 0x1

    cmp-long v7, v9, v11

    if-nez v7, :cond_3

    :cond_2
    if-nez p2, :cond_4

    const-wide/16 v11, 0x0

    cmp-long p2, v9, v11

    if-lez p2, :cond_4

    .line 1114
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/᩻֨᩵;->ۧ֫:Ljava/util/ArrayList;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v6, p2}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_4
    const/4 p2, 0x0

    .line 1118
    :goto_0
    :try_start_6
    iget-object v2, p0, Ll/᩻֨᩵;->ۧ֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵֨᩵;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1120
    :try_start_7
    sget-object v7, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    const-string v9, "Disconnect tree on logoff"

    invoke-interface {v7, v9}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1121
    invoke-virtual {v6, p1, v4}, Ll/᩵֨᩵;->֫(ZZ)Z

    move-result v6
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    or-int/2addr p2, v6

    goto :goto_1

    :catch_0
    move-exception v7

    .line 1123
    :try_start_8
    sget-object v9, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Failed to disconnect tree "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v9, v6, v7}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 1126
    :cond_5
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    if-nez p1, :cond_6

    .line 1128
    :try_start_9
    invoke-virtual {v5}, Ll/᩷֨᩵;->۬()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1129
    new-instance p1, Ll/۬᩵᩵;

    .line 127
    iget-object v1, p0, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    .line 37
    invoke-direct {p1, v1, v8}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 1130
    invoke-virtual {p0}, Ll/᩻֨᩵;->ܳ()Ll/ܿۖ᩵;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۗᩴ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 1131
    iget-wide v1, p0, Ll/᩻֨᩵;->ۤ:J

    invoke-virtual {p1, v1, v2}, Ll/ۗᩴ᩵;->ۧ(J)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 1133
    :try_start_a
    iget-object v1, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v1, p1, v3}, Ll/᩷֨᩵;->֫(Ll/۟ܺ᩵;Ll/ۨۖ᩵;)V
    :try_end_a
    .catch Ll/ۗۚ᩵; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_3

    :catch_1
    move-exception p1

    .line 1135
    :try_start_b
    sget-object v1, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    const-string v2, "Smb2LogoffRequest failed"

    invoke-interface {v1, v2, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_6
    if-nez p1, :cond_8

    .line 1138
    invoke-virtual {v5}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object p1

    check-cast p1, Ll/ۡۘ᩵;

    .line 1139
    invoke-virtual {p1}, Ll/ۡۘ᩵;->᩵֫()Ll/ܰۖ᩵;

    move-result-object p1

    iget p1, p1, Ll/ܰۖ᩵;->ۢ:I

    if-nez p1, :cond_7

    goto :goto_3

    .line 1141
    :cond_7
    new-instance p1, Ll/᩻ۘ᩵;

    .line 127
    iget-object v1, p0, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    .line 1141
    invoke-direct {p1, v1}, Ll/᩻ۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 1142
    invoke-virtual {p0}, Ll/᩻֨᩵;->ܳ()Ll/ܿۖ᩵;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۨۖ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 1217
    iget v1, p0, Ll/᩻֨᩵;->ܽ֫:I

    .line 1143
    invoke-virtual {p1, v1}, Ll/ۨۖ᩵;->ۧ(I)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 1145
    :try_start_c
    iget-object v1, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    new-instance v2, Ll/۟ۖ᩵;

    .line 127
    iget-object v6, p0, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    invoke-interface {v6}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v6

    .line 1145
    invoke-direct {v2, v6}, Ll/۟ۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    invoke-virtual {v1, p1, v2}, Ll/᩷֨᩵;->֫(Ll/۟ܺ᩵;Ll/ۨۖ᩵;)V
    :try_end_c
    .catch Ll/ۗۚ᩵; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto :goto_2

    :catch_2
    move-exception p1

    .line 1147
    :try_start_d
    sget-object v1, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    const-string v2, "SmbComLogoffAndX failed"

    invoke-interface {v1, v2, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1149
    :goto_2
    iput v4, p0, Ll/᩻֨᩵;->ܽ֫:I

    .line 1153
    :cond_8
    :goto_3
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 122
    :try_start_e
    invoke-virtual {v5}, Ll/۟֨᩵;->ۘ()V
    :try_end_e
    .catch Ll/ۗۚ᩵; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    move-object v2, p0

    goto :goto_c

    :catch_3
    move-exception p1

    goto :goto_a

    :catchall_1
    move-exception p1

    goto :goto_4

    :catchall_2
    move-exception p1

    const/4 p2, 0x0

    :goto_4
    move-object v2, p0

    .line 1126
    :goto_5
    :try_start_f
    monitor-exit v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    :try_start_10
    throw p1

    :catchall_3
    move-exception p1

    goto :goto_5

    :catchall_4
    move-exception p1

    const/4 p2, 0x0

    :goto_6
    move-object v2, p0

    .line 1153
    :goto_7
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    :try_start_11
    throw p1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    :catchall_5
    move-exception p1

    goto :goto_8

    :catchall_6
    move-exception p1

    goto :goto_7

    :catchall_7
    move-exception p1

    const/4 p2, 0x0

    move-object v2, p0

    .line 122
    :goto_8
    :try_start_12
    invoke-virtual {v5}, Ll/۟֨᩵;->ۘ()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    goto :goto_9

    :catchall_8
    move-exception v0

    .line 1099
    :try_start_13
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw p1
    :try_end_13
    .catch Ll/ۗۚ᩵; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    :catch_4
    move-exception p1

    goto :goto_b

    :catchall_9
    move-exception p1

    move-object v2, p0

    goto :goto_d

    :catch_5
    move-exception p1

    const/4 p2, 0x0

    :goto_a
    move-object v2, p0

    .line 1155
    :goto_b
    :try_start_14
    sget-object v0, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    const-string v1, "Error in logoff"

    invoke-interface {v0, v1, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 1157
    :goto_c
    iget-object p1, v2, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1158
    iput-object v3, v2, Ll/᩻֨᩵;->᩶:Ll/ܿۖ᩵;

    .line 1159
    iget-object p1, v2, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    return p2

    :catchall_a
    move-exception p1

    .line 1157
    :goto_d
    iget-object p2, v2, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1158
    iput-object v3, v2, Ll/᩻֨᩵;->᩶:Ll/ܿۖ᩵;

    .line 1159
    iget-object p2, v2, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 1160
    throw p1
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/᩻֨᩵;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final ۘ()Ll/᩷֨᩵;
    .locals 1

    .line 278
    iget-object v0, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0}, Ll/۟֨᩵;->֫()V

    return-object v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Ll/᩻֨᩵;->ۨ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ll/ۜ֨᩵;
    .locals 2

    .line 2
    const-class v0, Ll/ۜ֨᩵;

    .line 164
    const-class v1, Ll/᩻֨᩵;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 167
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
.end method

.method public final ܳ()Ll/ܿۖ᩵;
    .locals 1

    .line 322
    iget-object v0, p0, Ll/᩻֨᩵;->᩶:Ll/ܿۖ᩵;

    if-eqz v0, :cond_0

    return-object v0

    .line 325
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0}, Ll/᩷֨᩵;->᩵()Ll/ܿۖ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܶ()Z
    .locals 2

    .line 294
    invoke-virtual {p0}, Ll/᩻֨᩵;->ܳ()Ll/ܿۖ᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 297
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0}, Ll/᩷֨᩵;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    return v0

    .line 300
    :cond_1
    invoke-virtual {v0}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷ۖ᩵;->᩸()Z

    move-result v0

    return v0
.end method

.method public final ܽ()Ll/֨ۡ᩵;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/᩻֨᩵;->֫֫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ll/ۛ֡᩵;
    .locals 1

    .line 1233
    iget-object v0, p0, Ll/᩻֨᩵;->᩹:Ll/ۛ֡᩵;

    return-object v0
.end method

.method public final ᩴ()Z
    .locals 2

    .line 1241
    iget-object v0, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0}, Ll/᩷֨᩵;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩵;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 1249
    iget-object v0, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0}, Ll/᩷֨᩵;->ۜ()Z

    move-result v0

    return v0
.end method

.method public final ᩸()V
    .locals 6

    .line 221
    iget-object v0, p0, Ll/᩻֨᩵;->ᩳ֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    move-result-wide v0

    .line 222
    sget-object v2, Ll/᩻֨᩵;->ܿ֫:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 223
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Release session "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_3

    .line 227
    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Usage dropped to zero, release connection "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_1
    move-object v0, p0

    .line 230
    monitor-enter v0

    .line 231
    :try_start_0
    iget-object v1, p0, Ll/᩻֨᩵;->۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 232
    iget-object v1, p0, Ll/᩻֨᩵;->ܰ:Ll/᩷֨᩵;

    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V

    .line 234
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_3
    if-ltz v5, :cond_4

    return-void

    .line 236
    :cond_4
    new-instance v0, Ll/۬ۡ᩵;

    const-string v1, "Usage count dropped below zero"

    .line 58
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 236
    throw v0
.end method

.method public final ᩻()Ljava/lang/Long;
    .locals 5

    .line 1225
    iget-wide v0, p0, Ll/᩻֨᩵;->ۙ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
