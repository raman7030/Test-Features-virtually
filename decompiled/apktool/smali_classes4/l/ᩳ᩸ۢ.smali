.class public final synthetic Ll/ᩳ᩸ۢ;
.super Ljava/lang/Object;
.source "Y9AZ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳ᩸ۢ;->᩸:I

    iput-object p2, p0, Ll/ᩳ᩸ۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 2
    iget p2, p0, Ll/ᩳ᩸ۢ;->᩸:I

    .line 4
    iget-object v0, p0, Ll/ᩳ᩸ۢ;->᩹:Ljava/lang/Object;

    packed-switch p2, :pswitch_data_0

    .line 9
    check-cast v0, Ll/ۛۚۡ;

    .line 11
    sget p1, Ll/ۛۚۡ;->ۢۧ:I

    .line 851
    new-instance p1, Ll/۬۬ܿ;

    const p2, 0x7f120528

    invoke-direct {p1, v0, p2}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {p1}, Ll/۬۬ܿ;->ܳ()V

    .line 852
    new-instance p2, Ll/ۧۘۡ;

    invoke-direct {p2, p1, v0}, Ll/ۧۘۡ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 861
    new-instance p1, Ljava/lang/Thread;

    new-instance v1, Ll/ܰ֨ۡ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0, p2}, Ll/ܰ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 870
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    .line 0
    :pswitch_0
    check-cast v0, Ll/᩷ۗܳ;

    invoke-static {v0}, Ll/᩷ۗܳ;->֫(Ll/᩷ۗܳ;)V

    return-void

    :pswitch_1
    check-cast v0, Ll/ܳۙܳ;

    invoke-static {v0}, Ll/ܳۙܳ;->ܿ(Ll/ܳۙܳ;)V

    return-void

    :pswitch_2
    check-cast v0, Ll/᩹ܶᩳ;

    .line 402
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p2

    check-cast p2, Ll/ܽ֨ᩳ;

    .line 2920
    check-cast p1, Ll/᩵ܿ;

    invoke-virtual {v0, p2, p1}, Ll/᩹ܶᩳ;->֫(Ll/ܽ֨ᩳ;Ll/᩵ܿ;)V

    return-void

    .line 0
    :pswitch_3
    check-cast v0, Ljava/lang/Runnable;

    .line 313
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
