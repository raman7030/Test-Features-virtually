.class public final Ll/ۘ᩸᩻;
.super Ll/֫ۜܳ;
.source "9981"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 3

    const-string v0, "trash"

    .line 33
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 37
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳۜܳ;->᩺()Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const v0, 0x7f1207e2

    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const v0, 0x7f1207e1

    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const v2, 0x7f1205ca

    .line 41
    invoke-virtual {p0, p1, v2, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    .line 43
    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 44
    new-instance v0, Ll/᩹ܶ᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Ll/᩹ܶ᩷;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x12c

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 2

    .line 49
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v1, Ll/ۖ᩸᩻;

    invoke-direct {v0, v1}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 50
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֨۠ۢ;->ܽ(Ljava/util/List;)V

    .line 51
    invoke-virtual {v0, p1}, Ll/֨۠ۢ;->ܽ(Ll/ۖۢܳ;)V

    const-string v1, "deleteFrom"

    .line 52
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "recycle"

    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, p1, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    const-string p1, "speedMode"

    .line 54
    invoke-virtual {v0, p1, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    const-string p1, "minTotal"

    .line 55
    invoke-virtual {v0, v1, p1}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    .line 56
    invoke-virtual {v0}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "trash"

    .line 28
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
