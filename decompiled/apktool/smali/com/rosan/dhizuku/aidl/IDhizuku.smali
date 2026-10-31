.class public interface abstract Lcom/rosan/dhizuku/aidl/IDhizuku;
.super Ljava/lang/Object;
.source "IDhizuku.java"

# interfaces
.implements Landroid/os/IInterface;


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "com.rosan.dhizuku.aidl.IDhizuku"


# virtual methods
.method public abstract bindUserService(Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;Landroid/os/Bundle;)V
.end method

.method public abstract getDelegatedScopes(Ljava/lang/String;)[Ljava/lang/String;
.end method

.method public abstract getVersionCode()I
.end method

.method public abstract getVersionName()Ljava/lang/String;
.end method

.method public abstract isPermissionGranted()Z
.end method

.method public abstract remoteProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;
.end method

.method public abstract setDelegatedScopes(Ljava/lang/String;[Ljava/lang/String;)V
.end method

.method public abstract unbindUserService(Landroid/os/Bundle;)V
.end method
