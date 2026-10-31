.class public final Ll/ۛ֫ܽ;
.super Ljava/lang/Object;
.source "FAMT"


# direct methods
.method public static ֫(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 1

    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p0

    invoke-interface {p0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    move-result-object p0

    const-string v0, "activity.windowManager.currentWindowMetrics.bounds"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
