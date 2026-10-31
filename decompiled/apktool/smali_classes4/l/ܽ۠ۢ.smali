.class public final synthetic Ll/ܽ۠ۢ;
.super Ljava/lang/Object;
.source "LAXL"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ܽ۠ۢ;->᩸:I

    iput-object p1, p0, Ll/ܽ۠ۢ;->᩹:Ll/ۗܺ᩷;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget p1, p0, Ll/ܽ۠ۢ;->᩸:I

    packed-switch p1, :pswitch_data_0

    const p1, 0x7f12018d

    const/4 v0, 0x0

    .line 415
    iget-object v1, p0, Ll/ܽ۠ۢ;->᩹:Ll/ۗܺ᩷;

    const v2, 0x7f12042f

    invoke-virtual {v1, v2, p1, v0}, Ll/ۗܺ᩷;->֫(IIZ)V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ܽ۠ۢ;->᩹:Ll/ۗܺ᩷;

    const/4 v0, 0x0

    .line 181
    invoke-static {p1, v0}, Ll/ۜ᩸᩷;->֫(Ll/ۗܺ᩷;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
