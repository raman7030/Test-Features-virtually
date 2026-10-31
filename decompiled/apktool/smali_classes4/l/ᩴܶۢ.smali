.class public final synthetic Ll/ᩴܶۢ;
.super Ljava/lang/Object;
.source "CAJ1"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴܶۢ;->᩸:I

    iput-object p2, p0, Ll/ᩴܶۢ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ᩴܶۢ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 0
    iget p1, p0, Ll/ᩴܶۢ;->᩸:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ll/ᩴܶۢ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܶᩴܺ;

    iget-object v0, p0, Ll/ᩴܶۢ;->᩶:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, p1}, Ll/᩸ᩴܺ;->ۧ(Landroid/content/Context;Ll/ܶᩴܺ;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ll/ᩴܶۢ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/۠ܶۢ;

    iget-object v0, p0, Ll/ᩴܶۢ;->᩶:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {p1, v0}, Ll/۠ܶۢ;->ۧ(Ll/۠ܶۢ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
