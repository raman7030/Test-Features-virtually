.class public final Ll/ۡܽ;
.super Ljava/lang/Object;
.source "38CF"

# interfaces
.implements Ll/ۘܽ;


# virtual methods
.method public ֫(Ll/֫ᩳ;Ll/֫ᩳ;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 0

    const-string p6, "statusBarStyle"

    .line 6
    invoke-static {p1, p6}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "navigationBarStyle"

    .line 11
    invoke-static {p2, p6}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "window"

    .line 17
    invoke-static {p3, p6}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "view"

    .line 23
    invoke-static {p4, p6}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p6, 0x0

    .line 247
    invoke-static {p3, p6}, Ll/ۙ᩺;->֫(Landroid/view/Window;Z)V

    .line 248
    invoke-virtual {p1, p5}, Ll/֫ᩳ;->֫(Z)I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 249
    invoke-virtual {p2}, Ll/֫ᩳ;->֫()I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 250
    new-instance p1, Ll/۫ܰ;

    invoke-direct {p1, p3, p4}, Ll/۫ܰ;-><init>(Landroid/view/Window;Landroid/view/View;)V

    xor-int/lit8 p2, p5, 0x1

    invoke-virtual {p1, p2}, Ll/۫ܰ;->ۧ(Z)V

    return-void
.end method
