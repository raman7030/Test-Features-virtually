.class public Lmoe/shizuku/server/IShizukuApplication$Default;
.super Ljava/lang/Object;
.source "IShizukuApplication.java"

# interfaces
.implements Lmoe/shizuku/server/IShizukuApplication;


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

.method public bindApplication(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public dispatchRequestPermissionResult(ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public showPermissionConfirmation(IILjava/lang/String;I)V
    .locals 0

    return-void
.end method
