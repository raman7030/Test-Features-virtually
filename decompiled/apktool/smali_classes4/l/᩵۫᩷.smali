.class public final synthetic Ll/᩵۫᩷;
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
    iput p1, p0, Ll/᩵۫᩷;->᩸:I

    iput-object p2, p0, Ll/᩵۫᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩵۫᩷;->᩸:I

    .line 4
    iget-object v1, p0, Ll/᩵۫᩷;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/᩹ܶۢ;

    .line 12
    invoke-virtual {v1}, Ll/ۘ۠ۢ;->cancel()V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/۠֫ۢ;

    .line 212
    new-instance v0, Ll/᩺۟᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v0}, Ll/ܳۛ᩷;->֫(Ljava/util/function/Consumer;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->֫(Ll/᩶᩺ۜ;)V

    return-void

    :pswitch_2
    check-cast v1, Ll/ۗۨܿ;

    invoke-static {v1}, Ll/ۗۨܿ;->ۧ(Ll/ۗۨܿ;)V

    return-void

    :pswitch_3
    check-cast v1, Ll/ۢᩴ;

    invoke-virtual {v1}, Ll/ۢᩴ;->invalidateMenu()V

    return-void

    :pswitch_4
    check-cast v1, Ll/ᩴۛ᩷;

    sget v0, Ll/ܿۛ᩷;->ۛۧ:I

    .line 1252
    invoke-interface {v1}, Ll/ᩴۛ᩷;->ۧ()V

    .line 1253
    invoke-interface {v1}, Ll/ᩴۛ᩷;->֫()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
