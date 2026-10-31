.class public final Ll/ۛ֫۠;
.super Ll/ᩴۧ۠;
.source "A451"


# instance fields
.field public ֫֫:Ll/ۙ֨֨;

.field public ۟:Ll/֫ۤ֨;

.field public final synthetic ۧ֫:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/ۛ֡֨;)V
    .locals 2

    .line 4356
    iput-object p1, p0, Ll/ۛ֫۠;->ۧ֫:Ll/᩹ܽ۠;

    .line 4357
    sget-object v0, Ll/֨ᩴ֨;->ܰ:Ll/֨ᩴ֨;

    const-string v1, "access error"

    invoke-direct {p0, p1, v0, p4, v1}, Ll/ᩴۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ll/ۛ֡֨;Ljava/lang/String;)V

    .line 4358
    iput-object p2, p0, Ll/ۛ֫۠;->۟:Ll/֫ۤ֨;

    .line 4359
    iput-object p3, p0, Ll/ۛ֫۠;->֫֫:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 21

    move-object/from16 v0, p0

    .line 4375
    iget-object v1, v0, Ll/ᩴۧ۠;->᩺:Ll/ۛ֡֨;

    iget-object v2, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v3, v0, Ll/ۛ֫۠;->ۧ֫:Ll/᩹ܽ۠;

    iget-object v4, v3, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v5, v3, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    iget-object v4, v4, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne v2, v4, :cond_0

    iget-object v2, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    move-object/from16 v4, p4

    iget-object v6, v4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-eq v2, v6, :cond_0

    .line 4376
    new-instance v6, Ll/۠ܽ۠;

    sget-object v1, Ll/֨ᩴ֨;->۬:Ll/֨ᩴ֨;

    invoke-direct {v6, v3, v1}, Ll/۠ܽ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;)V

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    invoke-virtual/range {v6 .. v13}, Ll/۠ܽ۠;->֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1

    .line 4379
    :cond_0
    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    and-long/2addr v6, v8

    const/4 v2, 0x3

    const/4 v4, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    iget-object v12, v0, Ll/ۛ֫۠;->۟:Ll/֫ۤ֨;

    cmp-long v13, v6, v10

    if-nez v13, :cond_3

    if-eqz v12, :cond_1

    iget-object v6, v0, Ll/ۛ֫۠;->֫֫:Ll/ۙ֨֨;

    if-eqz v6, :cond_1

    .line 384
    invoke-virtual {v3, v12, v6, v9}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/ۙ֨֨;Z)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_0

    .line 4398
    :cond_1
    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v6

    const-wide/16 v12, 0x6

    and-long/2addr v6, v12

    cmp-long v14, v6, v10

    if-eqz v14, :cond_2

    .line 4399
    iget-object v15, v3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v5}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v17

    .line 4401
    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v5

    and-long/2addr v5, v12

    invoke-static {v5, v6}, Ll/᩵ᩴ֨;->֫(J)Ljava/util/EnumSet;

    move-result-object v3

    .line 4402
    invoke-virtual {v1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v9

    aput-object v3, v2, v8

    aput-object v5, v2, v4

    const-string v19, "report.access"

    move-object/from16 v16, p1

    move-object/from16 v18, p2

    move-object/from16 v20, v2

    .line 4399
    invoke-virtual/range {v15 .. v20}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1

    .line 4405
    :cond_2
    iget-object v2, v3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v5}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v5

    .line 4406
    invoke-virtual {v1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v3

    new-array v7, v4, [Ljava/lang/Object;

    aput-object v1, v7, v9

    aput-object v3, v7, v8

    const-string v6, "not.def.public.cant.access"

    move-object/from16 v3, p1

    move-object v4, v5

    move-object/from16 v5, p2

    .line 4405
    invoke-virtual/range {v2 .. v7}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1

    .line 4382
    :cond_3
    :goto_0
    iget-object v6, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v6, v6, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v7, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v6, v7, :cond_4

    .line 4383
    iget-object v13, v3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v5}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v15

    .line 4385
    invoke-virtual {v1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v5

    invoke-virtual {v1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v6

    invoke-virtual {v3, v12, v6}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/۠֡֨;)Ll/ܽܶ۠;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v9

    aput-object v5, v2, v8

    aput-object v3, v2, v4

    const-string v17, "not.def.access.package.cant.access"

    move-object/from16 v14, p1

    move-object/from16 v16, p2

    move-object/from16 v18, v2

    .line 4383
    invoke-virtual/range {v13 .. v18}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1

    .line 4386
    :cond_4
    invoke-virtual {v1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v6

    iget-object v7, v3, Ll/᩹ܽ۠;->ᩳ֫:Ll/᩷ۚ֨;

    iget-object v7, v7, Ll/᩷ۚ֨;->۟֫:Ll/᩹֡֨;

    if-eq v6, v7, :cond_6

    .line 2204
    iget-object v6, v12, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v6, v6, Ll/֨᩵۠;->ۛ:Ll/֡֡֨;

    .line 2205
    invoke-virtual {v1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v7

    .line 2206
    iget-object v10, v7, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    if-eq v6, v10, :cond_6

    iget-object v6, v6, Ll/֡֡֨;->ۘ֫:Ljava/util/Map;

    iget-object v7, v7, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    .line 2207
    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_1

    .line 4388
    :cond_5
    iget-object v13, v3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v5}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v15

    .line 4390
    invoke-virtual {v1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v5

    invoke-virtual {v1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v6

    .line 4391
    invoke-virtual {v1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v7

    invoke-virtual {v3, v12, v7}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/۠֡֨;)Ll/ܽܶ۠;

    move-result-object v3

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v9

    aput-object v5, v7, v8

    aput-object v6, v7, v4

    aput-object v3, v7, v2

    const-string v17, "not.def.access.class.intf.cant.access.reason"

    move-object/from16 v14, p1

    move-object/from16 v16, p2

    move-object/from16 v18, v7

    .line 4388
    invoke-virtual/range {v13 .. v18}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1

    .line 4393
    :cond_6
    :goto_1
    iget-object v2, v3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v5}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v5

    .line 4395
    invoke-virtual {v1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v3

    new-array v7, v4, [Ljava/lang/Object;

    aput-object v1, v7, v9

    aput-object v3, v7, v8

    const-string v6, "not.def.access.class.intf.cant.access"

    move-object/from16 v3, p1

    move-object v4, v5

    move-object/from16 v5, p2

    .line 4393
    invoke-virtual/range {v2 .. v7}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1
.end method
