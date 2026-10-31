.class public final synthetic Ll/᩷᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩷᩶ܳ;->᩸:I

    iput-object p2, p0, Ll/᩷᩶ܳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩷᩶ܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 2
    iget p1, p0, Ll/᩷᩶ܳ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/᩷᩶ܳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/ۧܶܿ;

    .line 11
    iget-object v0, p0, Ll/᩷᩶ܳ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v0, Ll/֡ۚۢ;

    .line 16
    invoke-static {p1, v0}, Ll/ۧܶܿ;->֫(Ll/ۧܶܿ;Ll/֡ۚۢ;)V

    return-void

    .line 19
    :pswitch_0
    iget-object p1, p0, Ll/᩷᩶ܳ;->᩹:Ljava/lang/Object;

    .line 21
    check-cast p1, Ll/ܽۙܳ;

    .line 23
    iget-object v0, p0, Ll/᩷᩶ܳ;->᩶:Ljava/lang/Object;

    .line 25
    check-cast v0, Ll/ۢۢۡ;

    .line 729
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    iput v0, p1, Ll/ܽۙܳ;->ۧ:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
