.class public final Ll/᩺ۡ֫;
.super Ljava/lang/Object;
.source "763R"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static final ֫:Ll/ۨۡ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/ۨۡ֫;

    .line 153
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/᩺ۡ֫;->֫:Ll/ۨۡ֫;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ֫(Landroid/app/Activity;)V
    .locals 1

    .line 0
    sget-object v0, Ll/᩺ۡ֫;->֫:Ll/ۨۡ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ll/ۨۡ֫;->֫(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    .line 0
    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    .line 5
    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    sget p2, Ll/ܰۡ֫;->᩹:I

    sget-object p2, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    invoke-static {p1, p2}, Ll/ۛۡ֫;->֫(Landroid/app/Activity;Ll/᩺ۢ֫;)V

    return-void
.end method

.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    sget v0, Ll/ܰۡ֫;->᩹:I

    sget-object v0, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    invoke-static {p1, v0}, Ll/ۛۡ֫;->֫(Landroid/app/Activity;Ll/᩺ۢ֫;)V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    sget v0, Ll/ܰۡ֫;->᩹:I

    sget-object v0, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    invoke-static {p1, v0}, Ll/ۛۡ֫;->֫(Landroid/app/Activity;Ll/᩺ۢ֫;)V

    return-void
.end method

.method public onActivityPreDestroyed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    sget v0, Ll/ܰۡ֫;->᩹:I

    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    invoke-static {p1, v0}, Ll/ۛۡ֫;->֫(Landroid/app/Activity;Ll/᩺ۢ֫;)V

    return-void
.end method

.method public onActivityPrePaused(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    sget v0, Ll/ܰۡ֫;->᩹:I

    sget-object v0, Ll/᩺ۢ֫;->۬:Ll/᩺ۢ֫;

    invoke-static {p1, v0}, Ll/ۛۡ֫;->֫(Landroid/app/Activity;Ll/᩺ۢ֫;)V

    return-void
.end method

.method public onActivityPreStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    sget v0, Ll/ܰۡ֫;->᩹:I

    sget-object v0, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-static {p1, v0}, Ll/ۛۡ֫;->֫(Landroid/app/Activity;Ll/᩺ۢ֫;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "activity"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bundle"

    invoke-static {p2, p1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
