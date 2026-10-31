.class public final synthetic Ll/ۚܺۡ;
.super Ljava/lang/Object;
.source "34MM"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Landroid/view/KeyEvent$Callback;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/ۚܺۡ;->᩸:I

    iput-object p1, p0, Ll/ۚܺۡ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۚܺۡ;->᩶:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 2
    iget v0, p0, Ll/ۚܺۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۚܺۡ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Landroid/widget/RadioButton;

    .line 11
    iget-object v1, p0, Ll/ۚܺۡ;->᩶:Landroid/view/KeyEvent$Callback;

    .line 13
    check-cast v1, Landroid/widget/RadioButton;

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ۚܺۡ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/۠۫ܽ;

    iget-object v0, p0, Ll/ۚܺۡ;->᩶:Landroid/view/KeyEvent$Callback;

    check-cast v0, Ll/ۗܺ᩷;

    invoke-static {p1, v0}, Ll/۠۫ܽ;->֫(Ll/۠۫ܽ;Ll/ۗܺ᩷;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ll/ۚܺۡ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/᩸ܺۡ;

    iget-object v0, p0, Ll/ۚܺۡ;->᩶:Landroid/view/KeyEvent$Callback;

    check-cast v0, Landroid/view/View;

    invoke-static {p1, v0}, Ll/᩸ܺۡ;->֫(Ll/᩸ܺۡ;Landroid/view/View;)V

    return-void

    :cond_0
    const/4 v3, 0x0

    .line 111
    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    if-ne p1, v1, :cond_1

    const/4 v2, 0x1

    .line 112
    :cond_1
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
