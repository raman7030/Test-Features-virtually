.class public final Ll/᩵ۧ۠;
.super Ll/ᩴۧ۠;
.source "A451"


# instance fields
.field public final ֫֫:Z

.field public final ۟:Ll/֫ۤ֨;

.field public final synthetic ۧ֫:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/֫ۤ֨;ZLl/ۛ֡֨;)V
    .locals 2

    .line 4428
    iput-object p1, p0, Ll/᩵ۧ۠;->ۧ֫:Ll/᩹ܽ۠;

    .line 4429
    sget-object v0, Ll/֨ᩴ֨;->ܰ:Ll/֨ᩴ֨;

    const-string v1, "invisible class error"

    invoke-direct {p0, p1, v0, p4, v1}, Ll/ᩴۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ll/ۛ֡֨;Ljava/lang/String;)V

    .line 4430
    iput-object p2, p0, Ll/᩵ۧ۠;->۟:Ll/֫ۤ֨;

    .line 4431
    iput-boolean p3, p0, Ll/᩵ۧ۠;->֫֫:Z

    .line 4432
    iget-object p1, p4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iput-object p1, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 15

    move-object v0, p0

    .line 4443
    iget-object v1, v0, Ll/᩵ۧ۠;->ۧ֫:Ll/᩹ܽ۠;

    iget-object v2, v1, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    iget-boolean v3, v0, Ll/᩵ۧ۠;->֫֫:Z

    if-eqz v3, :cond_0

    const/4 v1, 0x0

    return-object v1

    .line 4446
    :cond_0
    iget-object v3, v0, Ll/ᩴۧ۠;->᩺:Ll/ۛ֡֨;

    iget-object v4, v3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v5, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x2

    iget-object v9, v0, Ll/᩵ۧ۠;->۟:Ll/֫ۤ֨;

    if-ne v4, v5, :cond_1

    .line 4447
    invoke-virtual {v3}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v4

    invoke-virtual {v1, v9, v4}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/۠֡֨;)Ll/ܽܶ۠;

    move-result-object v4

    .line 4448
    iget-object v9, v1, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v2}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v11

    new-array v14, v8, [Ljava/lang/Object;

    aput-object v3, v14, v7

    aput-object v4, v14, v6

    const-string v13, "package.not.visible"

    move-object/from16 v10, p1

    move-object/from16 v12, p2

    invoke-virtual/range {v9 .. v14}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1

    .line 4452
    :cond_1
    invoke-virtual {v3}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v4

    invoke-virtual {v1, v9, v4}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/۠֡֨;)Ll/ܽܶ۠;

    move-result-object v4

    .line 4454
    invoke-interface/range {p2 .. p2}, Ll/ۗ۠۠;->۟()Ll/ۚۚ۠;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 4456
    invoke-interface/range {p2 .. p2}, Ll/ۗ۠۠;->۟()Ll/ۚۚ۠;

    move-result-object v5

    move-object v9, v3

    .line 4458
    :goto_0
    iget-object v10, v9, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v11, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-eq v10, v11, :cond_2

    sget-object v10, Ll/ᩴۚ۠;->᩺ۧ:Ll/ᩴۚ۠;

    invoke-virtual {v5, v10}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 4459
    iget-object v9, v9, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    .line 4460
    check-cast v5, Ll/ۛ᩵۠;

    iget-object v5, v5, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    goto :goto_0

    .line 4463
    :cond_2
    iget-object v10, v9, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne v10, v11, :cond_3

    .line 4464
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4466
    iget-object v1, v1, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v2}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v2

    new-array v3, v8, [Ljava/lang/Object;

    aput-object v9, v3, v7

    aput-object v4, v3, v6

    const-string v4, "package.not.visible"

    move-object/from16 p2, v1

    move-object/from16 p3, p1

    move-object/from16 p4, v2

    move-object/from16 p5, v5

    move-object/from16 p6, v4

    move-object/from16 p7, v3

    invoke-virtual/range {p2 .. p7}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1

    .line 4471
    :cond_3
    iget-object v1, v1, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v2}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v5

    .line 4472
    invoke-virtual {v3}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v2

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v3, v9, v7

    aput-object v2, v9, v6

    aput-object v4, v9, v8

    const-string v6, "not.def.access.package.cant.access"

    move-object v2, v1

    move-object/from16 v3, p1

    move-object v4, v5

    move-object/from16 v5, p2

    move-object v7, v9

    .line 4471
    invoke-virtual/range {v2 .. v7}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1
.end method
