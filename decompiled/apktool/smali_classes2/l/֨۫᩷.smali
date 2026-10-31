.class public final synthetic Ll/֨۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨۫᩷;->᩸:I

    iput-object p2, p0, Ll/֨۫᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/֨۫᩷;->᩸:I

    .line 4
    iget-object v1, p0, Ll/֨۫᩷;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ۘ᩹ۢ;

    .line 12
    invoke-static {v1}, Ll/ۘ᩹ۢ;->֫(Ll/ۘ᩹ۢ;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/᩶ܶۢ;

    .line 18
    invoke-virtual {v1}, Ll/ۘ۠ۢ;->cancel()V

    return-void

    .line 21
    :pswitch_1
    check-cast v1, Ljava/lang/Runnable;

    const/16 v0, 0xa

    .line 45
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 46
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 0
    :pswitch_2
    check-cast v1, Ll/ۚ᩵ܳ;

    invoke-static {v1}, Ll/ۚ᩵ܳ;->ۧ(Ll/ۚ᩵ܳ;)V

    return-void

    :pswitch_3
    check-cast v1, Ll/᩹ܶᩳ;

    .line 406
    invoke-virtual {v1}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 408
    check-cast v0, Ll/ܽ֨ᩳ;

    const v1, 0x7f0d0054

    .line 230
    invoke-virtual {v0, v1}, Ll/ܽ֨ᩳ;->ܿ(I)V

    :cond_0
    return-void

    .line 0
    :pswitch_4
    check-cast v1, Ljava/util/ArrayList;

    sget v0, Ll/ܿۛ᩷;->ۛۧ:I

    .line 868
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 869
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_0

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
