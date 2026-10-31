.class public final Ll/۠֨ۢ;
.super Ljava/lang/Object;
.source "19AV"

# interfaces
.implements Landroid/content/ServiceConnection;


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    const-string p1, "Shizuku service connected"

    .line 65
    invoke-static {p1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 66
    sget p1, Ll/ܰۚۢ;->ܿ:I

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string p1, "bin.mt.shell.IShizukuCommand"

    .line 46
    invoke-interface {p2, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 47
    instance-of v0, p1, Ll/۟ۚۢ;

    if-eqz v0, :cond_1

    .line 48
    check-cast p1, Ll/۟ۚۢ;

    goto :goto_0

    .line 50
    :cond_1
    new-instance p1, Ll/᩺ۚۢ;

    invoke-direct {p1, p2}, Ll/᩺ۚۢ;-><init>(Landroid/os/IBinder;)V

    .line 111
    :goto_0
    new-instance p2, Ll/ܶ֨ۢ;

    invoke-direct {p2, p1}, Ll/ܶ֨ۢ;-><init>(Ll/۟ۚۢ;)V

    .line 67
    invoke-static {p2}, Ll/᩶֨ۢ;->֫(Ll/ܶ֨ۢ;)V

    .line 68
    invoke-static {}, Ll/᩶֨ۢ;->ۜ()[Ll/᩶֨ۢ;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 69
    invoke-static {v2, p2}, Ll/᩶֨ۢ;->֫(Ll/᩶֨ۢ;Ll/ܶ֨ۢ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    const-string p1, "Shizuku service disconnected"

    .line 75
    invoke-static {p1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 76
    invoke-static {}, Ll/᩶֨ۢ;->᩻()V

    return-void
.end method
