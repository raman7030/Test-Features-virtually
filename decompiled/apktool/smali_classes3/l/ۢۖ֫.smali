.class public final Ll/ۢۖ֫;
.super Landroid/os/Handler;
.source "X32D"


# instance fields
.field public final synthetic ֫:Ll/ۖۖ֫;


# direct methods
.method public constructor <init>(Ll/ۖۖ֫;Landroid/os/Looper;)V
    .locals 0

    .line 115
    iput-object p1, p0, Ll/ۢۖ֫;->֫:Ll/ۖۖ֫;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 119
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 124
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void

    .line 121
    :cond_0
    iget-object p1, p0, Ll/ۢۖ֫;->֫:Ll/ۖۖ֫;

    invoke-virtual {p1}, Ll/ۖۖ֫;->֫()V

    return-void
.end method
