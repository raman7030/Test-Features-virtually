.class public Lcom/rosan/dhizuku/aidl/IDhizukuClient$Default;
.super Ljava/lang/Object;
.source "IDhizukuClient.java"

# interfaces
.implements Lcom/rosan/dhizuku/aidl/IDhizukuClient;


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

.method public getVersionCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
