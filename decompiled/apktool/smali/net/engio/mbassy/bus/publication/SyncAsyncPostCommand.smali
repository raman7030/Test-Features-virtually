.class public Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;
.super Ljava/lang/Object;
.source "SyncAsyncPostCommand.java"

# interfaces
.implements Lnet/engio/mbassy/bus/publication/ISyncAsyncPublicationCommand;


# instance fields
.field public mBassador:Lnet/engio/mbassy/bus/MBassador;

.field public message:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/bus/MBassador;Ljava/lang/Object;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;->mBassador:Lnet/engio/mbassy/bus/MBassador;

    .line 21
    iput-object p2, p0, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;->message:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public asynchronously()Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 2

    .line 31
    iget-object v0, p0, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;->mBassador:Lnet/engio/mbassy/bus/MBassador;

    iget-object v1, p0, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;->message:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/MBassador;->publishAsync(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;

    move-result-object v0

    return-object v0
.end method

.method public asynchronously(JLjava/util/concurrent/TimeUnit;)Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 2

    .line 36
    iget-object v0, p0, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;->mBassador:Lnet/engio/mbassy/bus/MBassador;

    iget-object v1, p0, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;->message:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1, p2, p3}, Lnet/engio/mbassy/bus/MBassador;->publishAsync(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Lnet/engio/mbassy/bus/IMessagePublication;

    move-result-object p1

    return-object p1
.end method

.method public now()Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 2

    .line 26
    iget-object v0, p0, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;->mBassador:Lnet/engio/mbassy/bus/MBassador;

    iget-object v1, p0, Lnet/engio/mbassy/bus/publication/SyncAsyncPostCommand;->message:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/MBassador;->publish(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;

    move-result-object v0

    return-object v0
.end method
