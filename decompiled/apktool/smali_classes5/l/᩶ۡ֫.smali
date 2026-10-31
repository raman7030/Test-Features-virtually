.class public final Ll/᩶ۡ֫;
.super Ll/᩹ۢ֫;
.source "P1KP"


# instance fields
.field public final synthetic ֫:Ll/ۗۡ֫;


# direct methods
.method public constructor <init>(Ll/ۗۡ֫;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/᩶ۡ֫;->֫:Ll/ۗۡ֫;

    .line 145
    invoke-direct {p0}, Ll/᩹ۢ֫;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string p2, "activity"

    .line 5
    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p2, v0, :cond_0

    .line 174
    sget p2, Ll/ܰۡ֫;->᩹:I

    .line 201
    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const-string p2, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p1, p2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment"

    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ll/ܰۡ֫;

    .line 174
    iget-object p2, p0, Ll/᩶ۡ֫;->֫:Ll/ۗۡ֫;

    invoke-static {p2}, Ll/ۗۡ֫;->ۧ(Ll/ۗۡ֫;)Ll/ۙۡ֫;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ܰۡ֫;->֫(Ll/ۙۡ֫;)V

    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    iget-object p1, p0, Ll/᩶ۡ֫;->֫:Ll/ۗۡ֫;

    invoke-virtual {p1}, Ll/ۗۡ֫;->֫()V

    return-void
.end method

.method public onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string p2, "activity"

    .line 5
    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    new-instance p2, Ll/᩹ۡ֫;

    iget-object v0, p0, Ll/᩶ۡ֫;->֫:Ll/ۗۡ֫;

    invoke-direct {p2, v0}, Ll/᩹ۡ֫;-><init>(Ll/ۗۡ֫;)V

    .line 157
    invoke-static {p1, p2}, Ll/᩸ۡ֫;->֫(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    iget-object p1, p0, Ll/᩶ۡ֫;->֫:Ll/ۗۡ֫;

    invoke-virtual {p1}, Ll/ۗۡ֫;->ᩳ()V

    return-void
.end method
