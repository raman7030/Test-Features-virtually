.class public final Ll/ۨۡ֫;
.super Ljava/lang/Object;
.source "763R"


# direct methods
.method public static ֫(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    new-instance v0, Ll/᩺ۡ֫;

    invoke-direct {v0}, Ll/᩺ۡ֫;-><init>()V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
