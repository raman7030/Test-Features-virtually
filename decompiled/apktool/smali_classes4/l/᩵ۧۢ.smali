.class public final synthetic Ll/᩵ۧۢ;
.super Ljava/lang/Object;
.source "P67V"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩵ۧۢ;->᩸:I

    iput-object p2, p0, Ll/᩵ۧۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    iget p1, p0, Ll/᩵ۧۢ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/᩵ۧۢ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ljava/lang/Runnable;

    .line 185
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/᩵ۧۢ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۚ۠ܳ;

    invoke-static {p1, p2}, Ll/ۚ۠ܳ;->֫(Ll/ۚ۠ܳ;I)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ll/᩵ۧۢ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۘۛ᩷;

    const/4 p2, 0x3

    .line 1776
    invoke-virtual {p1, p2}, Ll/ۘۛ᩷;->ܽ(I)V

    .line 1777
    invoke-virtual {p1}, Ll/ۘۛ᩷;->ܺ()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
