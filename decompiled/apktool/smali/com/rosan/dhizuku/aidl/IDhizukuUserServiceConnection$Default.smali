.class public Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Default;
.super Ljava/lang/Object;
.source "IDhizukuUserServiceConnection.java"

# interfaces
.implements Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;


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

.method public connected(Landroid/os/Bundle;Landroid/os/IBinder;)V
    .locals 0

    return-void
.end method

.method public died(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method
