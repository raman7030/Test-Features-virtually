.class public final synthetic Ll/ۘۢۡ;
.super Ljava/lang/Object;
.source "U713"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘۢۡ;->᩸:I

    iput-object p2, p0, Ll/ۘۢۡ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/ۘۢۡ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۘۢۡ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, [Ljava/lang/String;

    const/4 v0, 0x1

    .line 104
    aget-object v0, v1, v0

    sget-object v1, Ll/ۜ᩻ۡ;->֫:Ll/ۚۡ֫;

    const-string v1, "orderId"

    .line 0
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    new-instance v1, Ljava/lang/Thread;

    .line 173
    new-instance v2, Ll/ۛ᩷ᩳ;

    const/4 v3, 0x5

    invoke-direct {v2, v3, v0}, Ll/ۛ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    .line 160
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 173
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ll/ᩴۢۡ;

    invoke-virtual {v1}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
