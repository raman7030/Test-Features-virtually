.class public final enum Ll/ۘܺ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# instance fields
.field public final ᩵ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 481
    invoke-direct/range {v0 .. v7}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    const-string p1, "    %-20s %s"

    .line 483
    iput-object p1, p0, Ll/ۘܺ۠;->᩵ܽ:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 7

    const-string v3, "--help-lint"

    const-string v4, "opt.help.lint"

    const-string v1, "HELP_LINT"

    const/16 v2, 0x2f

    move-object v0, p0

    move-object v5, p1

    move-object v6, p2

    .line 0
    invoke-direct/range {v0 .. v6}, Ll/ۘܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;)V
    .locals 15

    move-object v0, p0

    .line 486
    invoke-virtual/range {p1 .. p1}, Ll/֨ۖ۠;->֫()Ll/᩹ܶ۠;

    move-result-object v1

    .line 487
    sget-object v2, Ll/᩸ܶ۠;->ۗ:Ll/᩸ܶ۠;

    sget-object v3, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    const-string v6, "opt.help.lint.header"

    invoke-virtual {v1, v3, v6, v5}, Ll/᩹ܶ۠;->֫(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;Ljava/lang/String;)V

    .line 488
    iget-object v5, v0, Ll/ۘܺ۠;->᩵ܽ:Ljava/lang/String;

    const-string v6, "opt.Xlint.all"

    new-array v7, v4, [Ljava/lang/Object;

    .line 491
    invoke-virtual {v1, v3, v6, v7}, Ll/᩹ܶ۠;->֫(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x2

    new-array v7, v6, [Ljava/lang/Object;

    const-string v8, "all"

    aput-object v8, v7, v4

    const/4 v8, 0x1

    aput-object v3, v7, v8

    .line 489
    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 488
    invoke-virtual {v1, v2, v3}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;Ljava/lang/String;)V

    .line 492
    invoke-static {}, Ll/᩶ᩴ֨;->values()[Ll/᩶ᩴ֨;

    move-result-object v2

    array-length v3, v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    aget-object v7, v2, v5

    .line 493
    sget-object v9, Ll/᩸ܶ۠;->ۗ:Ll/᩸ܶ۠;

    iget-object v10, v0, Ll/ۘܺ۠;->᩵ܽ:Ljava/lang/String;

    iget-object v11, v7, Ll/᩶ᩴ֨;->᩹:Ljava/lang/String;

    sget-object v12, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "opt.Xlint.desc."

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v7, Ll/᩶ᩴ֨;->᩹:Ljava/lang/String;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v13, v4, [Ljava/lang/Object;

    .line 496
    invoke-virtual {v1, v12, v7, v13}, Ll/᩹ܶ۠;->֫(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-array v12, v6, [Ljava/lang/Object;

    aput-object v11, v12, v4

    aput-object v7, v12, v8

    .line 494
    invoke-static {v10, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 493
    invoke-virtual {v1, v9, v7}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;Ljava/lang/String;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 499
    :cond_0
    sget-object v2, Ll/᩸ܶ۠;->ۗ:Ll/᩸ܶ۠;

    iget-object v3, v0, Ll/ۘܺ۠;->᩵ܽ:Ljava/lang/String;

    sget-object v5, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    const-string v7, "opt.Xlint.none"

    new-array v9, v4, [Ljava/lang/Object;

    .line 502
    invoke-virtual {v1, v5, v7, v9}, Ll/᩹ܶ۠;->֫(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "none"

    aput-object v7, v6, v4

    aput-object v5, v6, v8

    .line 500
    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 499
    invoke-virtual {v1, v2, v3}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;Ljava/lang/String;)V

    .line 503
    invoke-super/range {p0 .. p2}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;)V

    return-void
.end method
