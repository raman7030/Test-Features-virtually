.class public Lcom/rosan/dhizuku/aidl/IDhizuku$Default;
.super Ljava/lang/Object;
.source "IDhizuku.java"

# interfaces
.implements Lcom/rosan/dhizuku/aidl/IDhizuku;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bindUserService(Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public getDelegatedScopes(Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getVersionCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isPermissionGranted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public remoteProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public setDelegatedScopes(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public unbindUserService(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method
