.class public Ll/֨᩶᩷;
.super Ll/֡᩶᩷;
.source "O945"

# interfaces
.implements Ll/۠ᩴܺ;


# static fields
.field public static final synthetic ܳۧ:I


# instance fields
.field public ܿۧ:Ll/ۚ᩹᩷;

.field public ᩳۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ll/֡᩶᩷;-><init>()V

    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Ll/֨᩶᩷;->ᩳۧ:Z

    return-void
.end method


# virtual methods
.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "ColorPickerActivity"

    return-object v0
.end method

.method public final ۨ()V
    .locals 1

    .line 26
    new-instance v0, Ll/ۚ᩶᩷;

    invoke-direct {v0, p0}, Ll/ۚ᩶᩷;-><init>(Ljava/lang/Object;)V

    .line 824
    invoke-static {p0, v0}, Ll/۠᩹᩷;->֫(Ll/᩻ܽ;Ll/᩵᩹᩷;)Ll/ۚ᩹᩷;

    move-result-object v0

    .line 26
    iput-object v0, p0, Ll/֨᩶᩷;->ܿۧ:Ll/ۚ᩹᩷;

    .line 36
    invoke-static {}, Ll/ۗۨܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    invoke-static {p0}, Ll/ۗۨܿ;->ۧ(Ll/ۗܺ᩷;)V

    return-void

    .line 39
    :cond_0
    invoke-virtual {p0}, Ll/֨᩶᩷;->ܰ()V

    return-void
.end method

.method public final ܰ()V
    .locals 2

    .line 44
    invoke-static {p0}, Ll/ۢ֨ۢ;->֫(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 76
    :try_start_0
    invoke-static {p0, v0}, Ll/᩸ᩴܺ;->ܽ(Landroid/content/Context;Ll/ܶᩴܺ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const/4 v1, 0x1

    .line 48
    invoke-virtual {p0, v0, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Z)V

    return-void

    :cond_0
    const-string v0, "media_projection"

    .line 52
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/projection/MediaProjectionManager;

    .line 53
    iget-object v1, p0, Ll/֨᩶᩷;->ܿۧ:Ll/ۚ᩹᩷;

    invoke-virtual {v0}, Landroid/media/projection/MediaProjectionManager;->createScreenCaptureIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۚ᩹᩷;->֫(Landroid/content/Intent;)V

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Ll/֨᩶᩷;->ᩳۧ:Z

    return-void
.end method

.method public final ᩺()Z
    .locals 1

    .line 59
    iget-boolean v0, p0, Ll/֨᩶᩷;->ᩳۧ:Z

    return v0
.end method
