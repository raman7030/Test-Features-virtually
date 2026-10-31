.class public final synthetic Ll/ۢ۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۢ۫᩷;->᩸:I

    iput-object p2, p0, Ll/ۢ۫᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    iget p1, p0, Ll/ۢ۫᩷;->᩸:I

    .line 4
    iget-object v0, p0, Ll/ۢ۫᩷;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, Ll/᩸ܰ᩷;

    .line 12
    invoke-static {v0}, Ll/᩸ܰ᩷;->֫(Ll/᩸ܰ᩷;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v0, Ll/ۛۙ᩷;

    .line 18
    invoke-static {v0}, Ll/ۛۙ᩷;->ۧ(Ll/ۛۙ᩷;)V

    return-void

    .line 21
    :pswitch_1
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 243
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void

    .line 0
    :pswitch_2
    check-cast v0, Ll/ܿۛ᩷;

    sget p1, Ll/ܿۛ᩷;->ۛۧ:I

    .line 471
    invoke-virtual {v0}, Ll/ܿۛ᩷;->finish()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
