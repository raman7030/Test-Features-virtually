.class public Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;
.super Ljava/lang/Process;
.source "DhizukuRemoteProcess.java"


# static fields
.field public static final TAG:Ljava/lang/String; = "DhizukuRemoteProcess"


# instance fields
.field public errorStream:Ljava/io/InputStream;

.field public inputStream:Ljava/io/InputStream;

.field public outputStream:Ljava/io/OutputStream;

.field public remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;


# direct methods
.method public static synthetic $r8$lambda$nKWSoMbvIhtGPU-SsX8xyyQ2WRc(Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->lambda$new$0()V

    return-void
.end method

.method public constructor <init>(Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;)V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Process;-><init>()V

    .line 25
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    .line 27
    :try_start_0
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    new-instance v0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess$$ExternalSyntheticLambda0;-><init>(Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;)V

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private synthetic lambda$new$0()V
    .locals 1

    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 80
    :try_start_0
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    invoke-interface {v0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 82
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public exitValue()I
    .locals 2

    .line 71
    :try_start_0
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    invoke-interface {v0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->exitValue()I

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 73
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getErrorStream()Ljava/io/InputStream;
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->errorStream:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    return-object v0

    .line 61
    :cond_0
    :try_start_0
    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    iget-object v1, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    invoke-interface {v1}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->getErrorStream()Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->errorStream:Ljava/io/InputStream;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 63
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->inputStream:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    return-object v0

    .line 50
    :cond_0
    :try_start_0
    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    iget-object v1, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    invoke-interface {v1}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->getInputStream()Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->inputStream:Ljava/io/InputStream;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 52
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->outputStream:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    return-object v0

    .line 39
    :cond_0
    :try_start_0
    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    iget-object v1, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    invoke-interface {v1}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->getOutputStream()Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->outputStream:Ljava/io/OutputStream;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 41
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public isAlive()Z
    .locals 2

    .line 89
    :try_start_0
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    invoke-interface {v0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->alive()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 91
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public waitFor()I
    .locals 2

    .line 98
    :try_start_0
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    invoke-interface {v0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->waitFor()I

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 100
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public waitFor(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    .line 107
    :try_start_0
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;->remote:Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->waitForTimeout(JLjava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 109
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
