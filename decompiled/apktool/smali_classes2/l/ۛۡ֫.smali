.class public final Ll/ۛۡ֫;
.super Ljava/lang/Object;
.source "763R"


# direct methods
.method public static ֫(Landroid/app/Activity;)V
    .locals 3

    .line 167
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 169
    sget-object v0, Ll/᩺ۡ֫;->֫:Ll/ۨۡ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ll/ۨۡ֫;->֫(Landroid/app/Activity;)V

    .line 175
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    .line 176
    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_1

    .line 177
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    new-instance v2, Ll/ܰۡ֫;

    invoke-direct {v2}, Ll/ܰۡ֫;-><init>()V

    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 179
    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_1
    return-void
.end method

.method public static ֫(Landroid/app/Activity;Ll/᩺ۢ֫;)V
    .locals 1

    const-string v0, "event"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    instance-of v0, p0, Ll/ۢۡ֫;

    if-eqz v0, :cond_0

    .line 186
    check-cast p0, Ll/ۢۡ֫;

    invoke-interface {p0}, Ll/ۢۡ֫;->getLifecycle()Ll/᩷ۡ֫;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void

    .line 189
    :cond_0
    instance-of v0, p0, Ll/᩻ۡ֫;

    if-eqz v0, :cond_1

    .line 190
    check-cast p0, Ll/᩻ۡ֫;

    invoke-interface {p0}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p0

    .line 191
    instance-of v0, p0, Ll/᩷ۡ֫;

    if-eqz v0, :cond_1

    .line 192
    check-cast p0, Ll/᩷ۡ֫;

    invoke-virtual {p0, p1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    :cond_1
    return-void
.end method
