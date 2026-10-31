.class public Ll/ܰۡ֫;
.super Landroid/app/Fragment;
.source "763R"


# static fields
.field public static final synthetic ᩹:I


# instance fields
.field public ᩸:Ll/ۤۡ֫;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method private final ֫(Ll/᩺ۢ֫;)V
    .locals 2

    .line 83
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    .line 87
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "activity"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Ll/ۛۡ֫;->֫(Landroid/app/Activity;Ll/᩺ۢ֫;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 48
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 50
    sget-object p1, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    invoke-direct {p0, p1}, Ll/ܰۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 76
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 77
    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/ܰۡ֫;->֫(Ll/᩺ۢ֫;)V

    const/4 v0, 0x0

    .line 79
    iput-object v0, p0, Ll/ܰۡ֫;->᩸:Ll/ۤۡ֫;

    return-void
.end method

.method public final onPause()V
    .locals 1

    .line 66
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    .line 67
    sget-object v0, Ll/᩺ۢ֫;->۬:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/ܰۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 60
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 61
    iget-object v0, p0, Ll/ܰۡ֫;->᩸:Ll/ۤۡ֫;

    if-eqz v0, :cond_0

    .line 44
    invoke-interface {v0}, Ll/ۤۡ֫;->֫()V

    .line 62
    :cond_0
    sget-object v0, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/ܰۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 54
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 55
    iget-object v0, p0, Ll/ܰۡ֫;->᩸:Ll/ۤۡ֫;

    if-eqz v0, :cond_0

    .line 40
    invoke-interface {v0}, Ll/ۤۡ֫;->onStart()V

    .line 56
    :cond_0
    sget-object v0, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/ܰۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 71
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 72
    sget-object v0, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/ܰۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final ֫(Ll/ۙۡ֫;)V
    .locals 0

    .line 92
    iput-object p1, p0, Ll/ܰۡ֫;->᩸:Ll/ۤۡ֫;

    return-void
.end method
