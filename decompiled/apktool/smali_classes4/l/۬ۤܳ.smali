.class public final Ll/۬ۤܳ;
.super Ll/֨᩺ۡ;
.source "Q7TC"


# virtual methods
.method public final ֫(Ljava/lang/Object;)J
    .locals 2

    .line 8
    check-cast p1, Ll/ۘܳᩳ;

    .line 40
    invoke-virtual {p1}, Ll/ۘܳᩳ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(JLjava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p3, Ll/ۘܳᩳ;

    .line 50
    invoke-virtual {p3, p1, p2}, Ll/ۘܳᩳ;->֫(J)V

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 8
    check-cast p1, Ll/ۘܳᩳ;

    .line 16
    invoke-virtual {p1}, Ll/ۘܳᩳ;->ܿ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Ll/ۘܳᩳ;->ۢ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ۧ(JLjava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p3, Ll/ۘܳᩳ;

    .line 45
    invoke-virtual {p3, p1, p2}, Ll/ۘܳᩳ;->ۧ(J)V

    return-void
.end method

.method public final ܽ(Ljava/lang/Object;)J
    .locals 2

    .line 8
    check-cast p1, Ll/ۘܳᩳ;

    .line 35
    invoke-virtual {p1}, Ll/ۘܳᩳ;->ۜ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v2, p1

    const-string v0, "/"

    const/4 v1, 0x0

    .line 486
    invoke-static {v2, v0, v1}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 82
    new-instance v3, Ll/ۗ᩺ۡ;

    invoke-direct {v3, v2}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->᩶()Ljava/lang/String;

    move-result-object v4

    .line 84
    sget v5, Ll/۫᩶᩻;->ᩳ֫:I

    .line 41
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getParent()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    :goto_0
    move-object v5, v0

    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 85
    :goto_1
    new-instance v15, Ll/ۘܳᩳ;

    .line 88
    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 89
    invoke-static {v5}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 95
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v1, -0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-wide/16 v8, -0x1

    const-wide/16 v10, -0x1

    const-wide/16 v16, 0x0

    move-object v0, v15

    move-object/from16 v2, p1

    move-object v3, v4

    move-object v4, v5

    move v5, v6

    move v6, v7

    move-wide v7, v8

    move-wide v9, v10

    move-wide/from16 v11, v16

    .line 85
    invoke-direct/range {v0 .. v14}, Ll/ۘܳᩳ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJJJLjava/lang/Integer;Ljava/lang/String;)V

    return-object v15

    .line 80
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ܽ(JLjava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p3, Ll/ۘܳᩳ;

    .line 30
    invoke-virtual {p3, p1, p2}, Ll/ۘܳᩳ;->ܽ(J)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/Object;)J
    .locals 2

    .line 8
    check-cast p1, Ll/ۘܳᩳ;

    .line 25
    invoke-virtual {p1}, Ll/ۘܳᩳ;->᩷()J

    move-result-wide v0

    return-wide v0
.end method
