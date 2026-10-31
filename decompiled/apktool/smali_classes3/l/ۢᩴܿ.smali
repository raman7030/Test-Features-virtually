.class public final synthetic Ll/ۢᩴܿ;
.super Ljava/lang/Object;
.source "N15M"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/֡ۚۢ;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ll/֡ۚۢ;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ۢᩴܿ;->᩸:I

    iput-object p1, p0, Ll/ۢᩴܿ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۢᩴܿ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۢᩴܿ;->ۙ:Ll/֡ۚۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۢᩴܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۢᩴܿ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/ۖۚ᩻;

    .line 11
    iget-object v0, p0, Ll/ۢᩴܿ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v0, Ll/ۚۚ᩻;

    .line 15
    iget-object v1, p0, Ll/ۢᩴܿ;->ۙ:Ll/֡ۚۢ;

    .line 18
    invoke-static {p1, v0, v1}, Ll/ۚۚ᩻;->֫(Ll/ۖۚ᩻;Ll/ۚۚ᩻;Ll/֡ۚۢ;)V

    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Ll/ۢᩴܿ;->᩹:Ljava/lang/Object;

    .line 23
    check-cast v0, Ll/᩻᩶᩵;

    .line 25
    iget-object v1, p0, Ll/ۢᩴܿ;->᩶:Ljava/lang/Object;

    .line 27
    check-cast v1, Landroid/widget/TextView;

    .line 210
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    const/16 p1, 0x8

    .line 212
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 213
    iget-object p1, p0, Ll/ۢᩴܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->ܽ()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->callOnClick()Z

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
