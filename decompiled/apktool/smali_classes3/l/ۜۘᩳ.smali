.class public final synthetic Ll/ۜۘᩳ;
.super Ljava/lang/Object;
.source "QB32"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ۙ:Landroid/view/View;

.field public final synthetic ᩶:Landroid/view/View;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ۜۘᩳ;->᩸:I

    iput-object p1, p0, Ll/ۜۘᩳ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۜۘᩳ;->᩶:Landroid/view/View;

    iput-object p3, p0, Ll/ۜۘᩳ;->ۙ:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    .line 0
    iget v0, p0, Ll/ۜۘᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۜۘᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۫ܶۢ;

    iget-object v1, p0, Ll/ۜۘᩳ;->᩶:Landroid/view/View;

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Ll/ۜۘᩳ;->ۙ:Landroid/view/View;

    check-cast v2, Landroid/widget/TextView;

    check-cast p1, Ll/ۘ۠ۢ;

    invoke-static {v0, v1, v2}, Ll/۫ܶۢ;->֫(Ll/۫ܶۢ;Landroid/widget/TextView;Landroid/widget/TextView;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۜۘᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۢۘᩳ;

    iget-object v1, p0, Ll/ۜۘᩳ;->᩶:Landroid/view/View;

    check-cast v1, Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/ۜۘᩳ;->ۙ:Landroid/view/View;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, v2, p1}, Ll/ۢۘᩳ;->֫(Ll/ۢۘᩳ;Ll/۫ۨᩳ;Landroid/view/View;Ljava/lang/Boolean;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
