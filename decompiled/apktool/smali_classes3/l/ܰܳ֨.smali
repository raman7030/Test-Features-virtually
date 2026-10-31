.class public final Ll/ܰܳ֨;
.super Ljava/lang/Object;
.source "8BM6"


# instance fields
.field public ֫:Landroid/content/Context;

.field public ۧ:Ll/ۨܳ֨;

.field public ܽ:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Ll/ܰܳ֨;->֫:Landroid/content/Context;

    return-void
.end method

.method public static synthetic ֫(Ll/ܰܳ֨;Ll/ۨܳ֨;)V
    .locals 0

    .line 13
    iput-object p1, p0, Ll/ܰܳ֨;->ۧ:Ll/ۨܳ֨;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)I
    .locals 3

    .line 31
    iput-object p1, p0, Ll/ܰܳ֨;->֫:Landroid/content/Context;

    .line 34
    new-instance p1, Ll/᩺ܳ֨;

    invoke-direct {p1, p0}, Ll/᩺ܳ֨;-><init>(Ll/ܰܳ֨;)V

    iput-object p1, p0, Ll/ܰܳ֨;->ܽ:Landroid/content/ServiceConnection;

    .line 47
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "org.repackage.com.zui.deviceidservice"

    const-string v1, "org.repackage.com.zui.deviceidservice.DeviceidService"

    .line 48
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    iget-object v0, p0, Ll/ܰܳ֨;->֫:Landroid/content/Context;

    iget-object v1, p0, Ll/ܰܳ֨;->ܽ:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-eqz p1, :cond_0

    return v2

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 64
    iget-object v0, p0, Ll/ܰܳ֨;->֫:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 70
    :try_start_0
    iget-object v0, p0, Ll/ܰܳ֨;->ۧ:Ll/ۨܳ֨;

    if-eqz v0, :cond_0

    .line 71
    invoke-interface {v0}, Ll/ۨܳ֨;->a()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 66
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context is null, must be new OpenDeviceId first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 102
    :try_start_0
    iget-object v0, p0, Ll/ܰܳ֨;->ۧ:Ll/ۨܳ֨;

    if-eqz v0, :cond_0

    .line 104
    invoke-interface {v0}, Ll/ۨܳ֨;->c()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
