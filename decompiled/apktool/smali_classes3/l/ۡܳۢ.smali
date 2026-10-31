.class public final synthetic Ll/ۡܳۢ;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ۡܳۢ;->᩸:I

    iput-object p1, p0, Ll/ۡܳۢ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۡܳۢ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۡܳۢ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 2
    iget v0, p0, Ll/ۡܳۢ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۡܳۢ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/᩹ۖ᩻;

    .line 11
    iget-object v0, p0, Ll/ۡܳۢ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v0, Ll/۬ۖ᩻;

    .line 15
    iget-object v1, p0, Ll/ۡܳۢ;->ۙ:Ljava/lang/Object;

    .line 17
    check-cast v1, Ll/֡ۚۢ;

    .line 20
    invoke-static {p1, v0, v1}, Ll/۬ۖ᩻;->֫(Ll/᩹ۖ᩻;Ll/۬ۖ᩻;Ll/֡ۚۢ;)V

    return-void

    .line 23
    :pswitch_0
    iget-object v0, p0, Ll/ۡܳۢ;->᩹:Ljava/lang/Object;

    .line 25
    check-cast v0, Landroid/widget/RadioButton;

    .line 27
    iget-object v1, p0, Ll/ۡܳۢ;->᩶:Ljava/lang/Object;

    .line 29
    check-cast v1, Landroid/widget/RadioButton;

    .line 31
    iget-object v2, p0, Ll/ۡܳۢ;->ۙ:Ljava/lang/Object;

    .line 33
    check-cast v2, Landroid/widget/EditText;

    const/4 v3, 0x0

    if-ne p1, v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1013
    :goto_0
    invoke-virtual {v0, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    if-ne p1, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 1014
    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    if-ne p1, v1, :cond_2

    const/4 v3, 0x1

    .line 1015
    :cond_2
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
