.class public interface abstract Lmoe/shizuku/server/IRemoteProcess;
.super Ljava/lang/Object;
.source "IRemoteProcess.java"

# interfaces
.implements Landroid/os/IInterface;


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
