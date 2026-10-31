.class public final Ll/۠ܽ۠;
.super Ll/ۚܽ۠;
.source "A451"


# instance fields
.field public final synthetic ᩺:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;)V
    .locals 1

    .line 4024
    iput-object p1, p0, Ll/۠ܽ۠;->᩺:Ll/᩹ܽ۠;

    const-string v0, "symbol not found error"

    .line 4025
    invoke-direct {p0, p1, p2, v0}, Ll/ۚܽ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    if-nez p6, :cond_0

    .line 4036
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object/from16 v3, p6

    :goto_0
    if-nez p7, :cond_1

    .line 4037
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object/from16 v4, p7

    .line 4038
    :goto_1
    iget-object v5, v0, Ll/۠ܽ۠;->᩺:Ll/᩹ܽ۠;

    iget-object v6, v5, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v7, v5, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object v8, v5, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    iget-object v9, v5, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v6, v6, Ll/ۛܶ۠;->ܳۧ:Ll/ۤܶ۠;

    const/4 v10, 0x0

    if-ne v2, v6, :cond_2

    return-object v10

    :cond_2
    if-nez p3, :cond_3

    .line 4043
    iget-object v6, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    goto :goto_2

    :cond_3
    move-object/from16 v6, p3

    .line 4045
    :goto_2
    iget-object v11, v6, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v11}, Ll/ۤܶ۠;->isEmpty()Z

    move-result v11

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-nez v11, :cond_5

    .line 4046
    iget-object v11, v6, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v14, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v11, v14, :cond_4

    iget-object v11, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v11}, Ll/ۛ֡֨;->ۗ()Z

    move-result v11

    if-nez v11, :cond_4

    iget-object v11, v6, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v14, v9, Ll/ۛܶ۠;->֡ۧ:Ll/ۤܶ۠;

    if-eq v11, v14, :cond_4

    .line 4047
    iget-object v15, v5, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v8}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v17

    new-array v1, v12, [Ljava/lang/Object;

    aput-object v6, v1, v13

    const-string v19, "doesnt.exist"

    move-object/from16 v16, p1

    move-object/from16 v18, p2

    move-object/from16 v20, v1

    invoke-virtual/range {v15 .. v20}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1

    .line 4050
    :cond_4
    iget-object v11, v6, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v13, v9, Ll/ۛܶ۠;->᩶֫:Ll/ۤܶ۠;

    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    iget-object v11, v6, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v13, v9, Ll/ۛܶ۠;->᩹֫:Ll/ۤܶ۠;

    .line 4051
    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    const/4 v11, 0x1

    goto :goto_3

    :cond_5
    const/4 v11, 0x0

    .line 4053
    :goto_3
    iget-object v9, v9, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne v2, v9, :cond_6

    const/4 v9, 0x1

    goto :goto_4

    :cond_6
    const/4 v9, 0x0

    :goto_4
    if-eqz v9, :cond_7

    .line 4054
    sget-object v13, Ll/۠ᩴ֨;->۬:Ll/۠ᩴ֨;

    goto :goto_5

    :cond_7
    iget-object v13, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v13}, Ll/֨ᩴ֨;->֫()Ll/۠ᩴ֨;

    move-result-object v13

    :goto_5
    if-eqz v9, :cond_8

    .line 4055
    iget-object v2, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 4056
    :cond_8
    invoke-virtual {v4}, Ll/ۖܶ۠;->ܽ()Z

    move-result v9

    const-string v14, ""

    if-eqz v11, :cond_9

    const-string v15, ".location"

    goto :goto_6

    :cond_9
    move-object v15, v14

    .line 4077
    :goto_6
    sget-object v16, Ll/ܺ֫۠;->ۧ:[I

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    const/16 v18, 0x0

    aget v10, v16, v17

    const/4 v0, 0x2

    if-eq v10, v12, :cond_a

    if-eq v10, v0, :cond_a

    goto :goto_7

    :cond_a
    const-string v0, ".args"

    .line 4080
    invoke-virtual {v15, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    if-eqz v9, :cond_b

    const-string v14, ".params"

    .line 4081
    :cond_b
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    :goto_7
    const-string v0, "cant.resolve"

    .line 0
    invoke-static {v0, v15}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    const/4 v0, 0x4

    const/4 v9, 0x3

    if-eqz v11, :cond_13

    .line 4058
    iget-object v10, v5, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v8}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v21

    .line 4071
    invoke-virtual {v3}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v5, v3}, Ll/᩹ܽ۠;->֫(Ll/ۖܶ۠;)Ljava/lang/Object;

    move-result-object v3

    .line 4087
    :goto_8
    iget-object v5, v6, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v8, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    const/4 v11, 0x2

    const-string v12, "compiler"

    if-ne v5, v8, :cond_d

    .line 4088
    invoke-static {v6}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v1

    iget-object v5, v6, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object v8, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7616
    new-instance v8, Ll/ۨ۠۠;

    const/4 v14, 0x1

    new-array v15, v9, [Ljava/lang/Object;

    aput-object v1, v15, v18

    aput-object v6, v15, v14

    aput-object v5, v15, v11

    const-string v1, "location.1"

    invoke-direct {v8, v12, v1, v15}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4088
    invoke-virtual {v7, v8}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v1

    goto :goto_b

    :cond_d
    const/4 v14, 0x1

    .line 322
    sget-object v5, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {v1, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-nez v5, :cond_12

    sget-object v5, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    .line 323
    invoke-virtual {v1, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    const-wide/16 v15, 0x0

    if-eqz v5, :cond_e

    iget-object v5, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v5}, Ll/ۛ֡֨;->۬()J

    move-result-wide v5

    const-wide/32 v19, 0x1000000

    and-long v5, v5, v19

    cmp-long v8, v5, v15

    if-eqz v8, :cond_e

    goto :goto_9

    .line 325
    :cond_e
    sget-object v5, Ll/ۢ۠֨;->ۜ֫:Ll/ۢ۠֨;

    invoke-virtual {v1, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 326
    sget-object v5, Ll/۠ᩴ֨;->ܰ:Ll/۠ᩴ֨;

    goto :goto_a

    .line 327
    :cond_f
    iget-object v5, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-wide v5, v5, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v19, 0x2000

    and-long v19, v5, v19

    cmp-long v8, v19, v15

    if-eqz v8, :cond_10

    .line 328
    sget-object v5, Ll/۠ᩴ֨;->᩶:Ll/۠ᩴ֨;

    goto :goto_a

    :cond_10
    const-wide/16 v19, 0x200

    and-long v5, v5, v19

    cmp-long v8, v5, v15

    if-eqz v8, :cond_11

    .line 330
    sget-object v5, Ll/۠ᩴ֨;->ۛ:Ll/۠ᩴ֨;

    goto :goto_a

    .line 332
    :cond_11
    sget-object v5, Ll/۠ᩴ֨;->ۗ:Ll/۠ᩴ֨;

    goto :goto_a

    .line 324
    :cond_12
    :goto_9
    sget-object v5, Ll/۠ᩴ֨;->ۙ:Ll/۠ᩴ֨;

    .line 4092
    :goto_a
    sget-object v6, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7600
    new-instance v6, Ll/ۨ۠۠;

    new-array v8, v9, [Ljava/lang/Object;

    aput-object v5, v8, v18

    aput-object v1, v8, v14

    const/4 v1, 0x0

    aput-object v1, v8, v11

    const-string v1, "location"

    invoke-direct {v6, v12, v1, v8}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4092
    invoke-virtual {v7, v6}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v1

    :goto_b
    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v13, v5, v18

    .line 4061
    aput-object v2, v5, v14

    aput-object v4, v5, v11

    aput-object v3, v5, v9

    aput-object v1, v5, v0

    move-object/from16 v19, v10

    move-object/from16 v20, p1

    move-object/from16 v22, p2

    move-object/from16 v24, v5

    .line 4058
    invoke-virtual/range {v19 .. v24}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v0

    return-object v0

    :cond_13
    const/4 v1, 0x2

    const/4 v6, 0x1

    .line 4064
    iget-object v7, v5, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v8}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v21

    .line 4071
    invoke-virtual {v3}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_14

    goto :goto_c

    :cond_14
    invoke-virtual {v5, v3}, Ll/᩹ܽ۠;->֫(Ll/ۖܶ۠;)Ljava/lang/Object;

    move-result-object v3

    :goto_c
    new-array v0, v0, [Ljava/lang/Object;

    aput-object v13, v0, v18

    aput-object v2, v0, v6

    aput-object v4, v0, v1

    aput-object v3, v0, v9

    move-object/from16 v19, v7

    move-object/from16 v20, p1

    move-object/from16 v22, p2

    move-object/from16 v24, v0

    .line 4064
    invoke-virtual/range {v19 .. v24}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v0

    return-object v0
.end method
