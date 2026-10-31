.class public final Ll/ܶۚۢ;
.super Landroid/os/Handler;
.source "Z1XI"


# instance fields
.field public final ֫:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 187
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 188
    iput-object p1, p0, Ll/ܶۚۢ;->֫:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final dispatchMessage(Landroid/os/Message;)V
    .locals 0

    .line 194
    :try_start_0
    invoke-super {p0, p1}, Landroid/os/Handler;->dispatchMessage(Landroid/os/Message;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ܶۚۢ;->֫:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void
.end method
