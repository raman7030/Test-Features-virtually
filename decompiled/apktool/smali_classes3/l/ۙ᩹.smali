.class public Ll/ۙ᩹;
.super Landroid/app/Activity;
.source "V22O"

# interfaces
.implements Ll/᩻ۡ֫;
.implements Ll/۠ۛ;


# instance fields
.field public final ᩸:Ll/᩷ۡ֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 48
    new-instance v0, Ll/ۗ᩵;

    invoke-direct {v0}, Ll/ۗ᩵;-><init>()V

    .line 55
    new-instance v0, Ll/᩷ۡ֫;

    invoke-direct {v0, p0}, Ll/᩷ۡ֫;-><init>(Ll/᩻ۡ֫;)V

    iput-object v0, p0, Ll/ۙ᩹;->᩸:Ll/᩷ۡ֫;

    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    const-string v0, "event"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window.decorView"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    invoke-static {v0, p1}, Ll/ܶۛ;->֫(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 117
    :cond_0
    invoke-static {p0, v0, p0, p1}, Ll/ܶۛ;->֫(Ll/۠ۛ;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    const-string v0, "event"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window.decorView"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    invoke-static {v0, p1}, Ll/ܶۛ;->֫(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 110
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public getLifecycle()Ll/۟ۢ֫;
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۙ᩹;->᩸:Ll/᩷ۡ֫;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 73
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 74
    sget p1, Ll/ܰۡ֫;->᩹:I

    invoke-static {p0}, Ll/ۛۡ֫;->֫(Landroid/app/Activity;)V

    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 220
    invoke-virtual {p0}, Landroid/app/Activity;->onPostResume()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Ll/ۙ᩹;->᩸:Ll/᩷ۡ֫;

    sget-object v1, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/ܰۢ֫;)V

    .line 80
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ֫(Landroid/view/KeyEvent;)Z
    .locals 1

    const-string v0, "event"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
