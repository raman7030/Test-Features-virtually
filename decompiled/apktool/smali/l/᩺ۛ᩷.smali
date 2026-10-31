.class public final synthetic Ll/᩺ۛ᩷;
.super Ljava/lang/Object;
.source "51FV"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩺ۛ᩷;->᩸:I

    iput-object p2, p0, Ll/᩺ۛ᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    iget p1, p0, Ll/᩺ۛ᩷;->᩸:I

    .line 4
    iget-object p2, p0, Ll/᩺ۛ᩷;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast p2, Ll/ۤ᩹ۢ;

    .line 11
    sget p1, Ll/ۤ᩹ۢ;->ۢۧ:I

    .line 302
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_0
    check-cast p2, Ll/֡ۧ᩷;

    invoke-static {p2}, Ll/֡ۧ᩷;->֫(Ll/֡ۧ᩷;)V

    return-void

    :pswitch_1
    check-cast p2, Ll/ۢܽ᩻;

    invoke-static {p2}, Ll/ۢܽ᩻;->֫(Ll/ۢܽ᩻;)V

    return-void

    :pswitch_2
    check-cast p2, Ll/ۘۛ᩷;

    const/4 p1, 0x3

    .line 2095
    invoke-virtual {p2, p1}, Ll/ۘۛ᩷;->ۧ(I)V

    .line 2096
    invoke-virtual {p2}, Ll/ۘۛ᩷;->ۡ()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
