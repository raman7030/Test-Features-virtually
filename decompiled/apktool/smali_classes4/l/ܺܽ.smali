.class public final Ll/ܺܽ;
.super Ljava/lang/Object;
.source "38CF"

# interfaces
.implements Ll/ۘܽ;


# virtual methods
.method public ֫(Ll/֫ᩳ;Ll/֫ᩳ;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 1

    const-string v0, "statusBarStyle"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationBarStyle"

    .line 11
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "window"

    .line 17
    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    .line 23
    invoke-static {p4, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 266
    invoke-static {p3, v0}, Ll/ۙ᩺;->֫(Landroid/view/Window;Z)V

    .line 267
    invoke-virtual {p1, p5}, Ll/֫ᩳ;->֫(Z)I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 268
    invoke-virtual {p2, p6}, Ll/֫ᩳ;->֫(Z)I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 269
    new-instance p1, Ll/۫ܰ;

    invoke-direct {p1, p3, p4}, Ll/۫ܰ;-><init>(Landroid/view/Window;Landroid/view/View;)V

    xor-int/lit8 p2, p5, 0x1

    .line 270
    invoke-virtual {p1, p2}, Ll/۫ܰ;->ۧ(Z)V

    xor-int/lit8 p2, p6, 0x1

    .line 271
    invoke-virtual {p1, p2}, Ll/۫ܰ;->֫(Z)V

    return-void
.end method
