.class public final Ll/֫ۧ۠;
.super Ll/֨ܽ۠;
.source "A451"


# instance fields
.field public final synthetic ֫֫:Ll/᩹ܽ۠;

.field public ۧ֫:Z


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۛ֡֨;Z)V
    .locals 0

    .line 4655
    iput-object p1, p0, Ll/֫ۧ۠;->֫֫:Ll/᩹ܽ۠;

    .line 4656
    invoke-direct {p0, p2, p1}, Ll/֨ܽ۠;-><init>(Ll/ۛ֡֨;Ll/᩹ܽ۠;)V

    .line 4657
    iput-boolean p3, p0, Ll/֫ۧ۠;->ۧ֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 16

    move-object/from16 v0, p0

    .line 4663
    iget-boolean v1, v0, Ll/֫ۧ۠;->ۧ֫:Z

    iget-object v2, v0, Ll/ᩴۧ۠;->᩺:Ll/ۛ֡֨;

    if-nez v1, :cond_0

    const-string v1, "bad.static.method.in.bound.lookup"

    :goto_0
    move-object v7, v1

    goto :goto_1

    .line 4665
    :cond_0
    invoke-virtual {v2}, Ll/ۛ֡֨;->֡֫()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "bad.static.method.in.unbound.lookup"

    goto :goto_0

    :cond_1
    const-string v1, "bad.instance.method.in.unbound.lookup"

    goto :goto_0

    .line 4670
    :goto_1
    iget-object v1, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v1}, Ll/֨ᩴ֨;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4671
    move-object v8, v2

    check-cast v8, Ll/ۚܽ۠;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move-object/from16 v14, p6

    move-object/from16 v15, p7

    invoke-virtual/range {v8 .. v15}, Ll/ۚܽ۠;->֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1

    .line 4672
    :cond_2
    iget-object v1, v0, Ll/֫ۧ۠;->֫֫:Ll/᩹ܽ۠;

    iget-object v3, v1, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object v1, v1, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    invoke-virtual {v1}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v5

    invoke-static {v2}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v1

    const/4 v4, 0x2

    new-array v8, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v8, v4

    const/4 v1, 0x1

    aput-object v2, v8, v1

    move-object/from16 v4, p1

    move-object/from16 v6, p2

    invoke-virtual/range {v3 .. v8}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1
.end method
