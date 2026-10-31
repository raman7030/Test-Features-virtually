.class public interface abstract Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;
.super Ljava/lang/Object;
.source "IDhizukuRemoteProcess.java"

# interfaces
.implements Landroid/os/IInterface;


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "com.rosan.dhizuku.aidl.IDhizukuRemoteProcess"


# virtual methods
.method public abstract alive()Z
.end method

.method public abstract destroy()V
.end method

.method public abstract exitValue()I
.end method

.method public abstract getErrorStream()Landroid/os/ParcelFileDescriptor;
.end method

.method public abstract getInputStream()Landroid/os/ParcelFileDescriptor;
.end method

.method public abstract getOutputStream()Landroid/os/ParcelFileDescriptor;
.end method

.method public abstract waitFor()I
.end method

.method public abstract waitForTimeout(JLjava/lang/String;)Z
.end method
