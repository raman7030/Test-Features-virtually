.class public final synthetic Ll/᩸ܳۢ;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩸ܳۢ;->᩸:I

    iput-object p2, p0, Ll/᩸ܳۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget p1, p0, Ll/᩸ܳۢ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/᩸ܳۢ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/᩶ܿۢ;

    .line 12
    invoke-static {p1}, Ll/᩶ܿۢ;->֫(Ll/᩶ܿۢ;)V

    return-void

    .line 15
    :pswitch_0
    iget-object p1, p0, Ll/᩸ܳۢ;->᩹:Ljava/lang/Object;

    .line 17
    check-cast p1, Ll/ۗܺ᩷;

    const v0, 0x7f120889

    const/4 v1, 0x0

    const v2, 0x7f12042f

    .line 415
    invoke-virtual {p1, v2, v0, v1}, Ll/ۗܺ᩷;->֫(IIZ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
