.class public final Ll/᩸ۡ֫;
.super Ljava/lang/Object;
.source "P1KP"


# direct methods
.method public static final ֫(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    .line 10
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    invoke-virtual {p0, p1}, Landroid/app/Activity;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
