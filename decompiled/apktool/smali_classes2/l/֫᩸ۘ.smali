.class public final Ll/֫᩸ۘ;
.super Landroid/os/Handler;
.source "51RR"


# instance fields
.field public final synthetic ֫:Ll/ᩳ᩸ۘ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩸ۘ;Landroid/os/Looper;)V
    .locals 0

    .line 133
    iput-object p1, p0, Ll/֫᩸ۘ;->֫:Ll/ᩳ᩸ۘ;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 136
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x3e8

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3e9

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 626
    :cond_0
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 629
    :cond_1
    iget-object v0, p0, Ll/֫᩸ۘ;->֫:Ll/ᩳ᩸ۘ;

    iget-object v1, v0, Ll/ᩳ᩸ۘ;->ܿ:Ljava/util/concurrent/Executor;

    new-instance v2, Ll/ܽ᩸ۘ;

    invoke-direct {v2, v0}, Ll/ܽ᩸ۘ;-><init>(Ll/ᩳ᩸ۘ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 146
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void
.end method
