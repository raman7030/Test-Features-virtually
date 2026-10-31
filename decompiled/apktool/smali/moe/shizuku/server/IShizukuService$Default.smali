.class public Lmoe/shizuku/server/IShizukuService$Default;
.super Ljava/lang/Object;
.source "IShizukuService.java"

# interfaces
.implements Lmoe/shizuku/server/IShizukuService;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public attachApplication(Lmoe/shizuku/server/IShizukuApplication;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public attachUserService(Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public checkPermission(Ljava/lang/String;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public checkSelfPermission()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public dispatchPackageChanged(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public dispatchPermissionConfirmationResult(IIILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public exit()V
    .locals 0

    return-void
.end method

.method public getFlagsForUid(II)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getSELinuxContext()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getUid()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getVersion()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isHidden(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public newProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lmoe/shizuku/server/IRemoteProcess;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public removeUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public requestPermission(I)V
    .locals 0

    return-void
.end method

.method public setSystemProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public shouldShowRequestPermissionRationale()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public updateFlagsForUid(III)V
    .locals 0

    return-void
.end method
