.class public interface abstract Lmoe/shizuku/server/IShizukuService;
.super Ljava/lang/Object;
.source "IShizukuService.java"

# interfaces
.implements Landroid/os/IInterface;


# virtual methods
.method public abstract addUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I
.end method

.method public abstract attachApplication(Lmoe/shizuku/server/IShizukuApplication;Landroid/os/Bundle;)V
.end method

.method public abstract attachUserService(Landroid/os/IBinder;Landroid/os/Bundle;)V
.end method

.method public abstract checkPermission(Ljava/lang/String;)I
.end method

.method public abstract checkSelfPermission()Z
.end method

.method public abstract dispatchPackageChanged(Landroid/content/Intent;)V
.end method

.method public abstract dispatchPermissionConfirmationResult(IIILandroid/os/Bundle;)V
.end method

.method public abstract exit()V
.end method

.method public abstract getFlagsForUid(II)I
.end method

.method public abstract getSELinuxContext()Ljava/lang/String;
.end method

.method public abstract getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getUid()I
.end method

.method public abstract getVersion()I
.end method

.method public abstract isHidden(I)Z
.end method

.method public abstract newProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lmoe/shizuku/server/IRemoteProcess;
.end method

.method public abstract removeUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I
.end method

.method public abstract requestPermission(I)V
.end method

.method public abstract setSystemProperty(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract shouldShowRequestPermissionRationale()Z
.end method

.method public abstract updateFlagsForUid(III)V
.end method
