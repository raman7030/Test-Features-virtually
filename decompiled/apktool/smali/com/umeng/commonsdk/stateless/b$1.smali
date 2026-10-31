.class public Lcom/umeng/commonsdk/stateless/b$1;
.super Landroid/os/Handler;
.source "G47B"


# instance fields
.field public final synthetic a:Lcom/umeng/commonsdk/stateless/b;


# direct methods
.method public constructor <init>(Lcom/umeng/commonsdk/stateless/b;Landroid/os/Looper;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/umeng/commonsdk/stateless/b$1;->a:Lcom/umeng/commonsdk/stateless/b;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 125
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x200

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    return-void

    .line 135
    :pswitch_0
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->g()V

    goto :goto_0

    .line 131
    :pswitch_1
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->f()V

    return-void

    .line 127
    :pswitch_2
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->e()V

    return-void

    .line 138
    :cond_0
    :goto_0
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->h()V

    return-void

    :pswitch_data_0
    .packed-switch 0x111
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
