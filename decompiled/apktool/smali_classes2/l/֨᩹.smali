.class public final Ll/֨᩹;
.super Ljava/lang/Object;
.source "K22G"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public ֫:Ljava/lang/Object;

.field public ۧ:Landroid/app/Activity;

.field public ܳ:Z

.field public ܽ:Z

.field public ܿ:Z

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 182
    iput-boolean v0, p0, Ll/֨᩹;->ܿ:Z

    .line 186
    iput-boolean v0, p0, Ll/֨᩹;->ܽ:Z

    .line 190
    iput-boolean v0, p0, Ll/֨᩹;->ܳ:Z

    .line 193
    iput-object p1, p0, Ll/֨᩹;->ۧ:Landroid/app/Activity;

    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Ll/֨᩹;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 240
    iget-object v0, p0, Ll/֨᩹;->ۧ:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 244
    iput-object p1, p0, Ll/֨᩹;->ۧ:Landroid/app/Activity;

    const/4 p1, 0x1

    .line 245
    iput-boolean p1, p0, Ll/֨᩹;->ܽ:Z

    :cond_0
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 217
    iget-boolean v0, p0, Ll/֨᩹;->ܽ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/֨᩹;->ܳ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/֨᩹;->ܿ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֨᩹;->֫:Ljava/lang/Object;

    iget v1, p0, Ll/֨᩹;->ᩳ:I

    .line 221
    invoke-static {v0, v1, p1}, Ll/۠᩹;->֫(Ljava/lang/Object;ILandroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 223
    iput-boolean p1, p0, Ll/֨᩹;->ܳ:Z

    const/4 p1, 0x0

    .line 225
    iput-object p1, p0, Ll/֨᩹;->֫:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 206
    iget-object v0, p0, Ll/֨᩹;->ۧ:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    .line 207
    iput-boolean p1, p0, Ll/֨᩹;->ܿ:Z

    :cond_0
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
