.class public final synthetic Ll/᩸۬ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Ll/֫۠ܳ;
.implements Ll/ܽۨ;
.implements Ll/۫ܿۢ;
.implements Ll/ۚ֨֨;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸۬ۜ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩸۬ۜ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 1

    .line 0
    iget-object p1, p0, Ll/᩸۬ۜ;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۤۤۜ;

    iget-object v0, p0, Ll/᩸۬ۜ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۗۘ;

    invoke-static {p1, v0, p2}, Ll/ۤۤۜ;->֫(Ll/ۤۤۜ;Ll/ۗۘ;Ll/᩸ܰ;)V

    return-object p2
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/᩸۬ۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۧ᩸᩻;

    iget-object v1, p0, Ll/᩸۬ۜ;->᩹:Ljava/lang/Object;

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v0, v1, p1}, Ll/ۧ᩸᩻;->֫(Ll/ۧ᩸᩻;Landroid/widget/TextView;Landroid/widget/TextView;)V

    return-void
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 8

    .line 0
    iget-object v0, p0, Ll/᩸۬ۜ;->᩸:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll/ۤܿۢ;

    iget-object v0, p0, Ll/᩸۬ۜ;->᩹:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Set;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-static/range {v1 .. v7}, Ll/ۤܿۢ;->֫(Ll/ۤܿۢ;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public ֫(Ll/֨֨֨;)V
    .locals 0

    .line 1907
    invoke-static {}, Ll/۫ۙ;->֫()V

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫(Ll/֨֨֨;Ll/᩵֨֨;Ll/ۙ֨֨;Z)V
    .locals 1

    .line 2
    iget-object p4, p0, Ll/᩸۬ۜ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast p4, Ll/֨֨֨;

    .line 6
    iget-object v0, p0, Ll/᩸۬ۜ;->᩹:Ljava/lang/Object;

    .line 8
    check-cast v0, Ll/ᩴܶ۠;

    .line 11
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne p1, p4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2164
    :goto_0
    invoke-static {p1}, Ll/۫ۙ;->֫(Z)V

    .line 2165
    new-instance p1, Ll/᩺ܶ۠;

    invoke-direct {p1, p2, p3}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 227
    invoke-virtual {v0, p1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    return-void
.end method
