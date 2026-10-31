.class public final synthetic Ll/֫۬ܳ;
.super Ljava/lang/Object;
.source "Y5PI"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֫۬ܳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 2
    iget v0, p0, Ll/֫۬ܳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    if-eqz p2, :cond_0

    const-string p2, "forbid_tip_"

    const-string v0, "multi_threaded_transfer"

    .line 34
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 35
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const/4 v2, 0x0

    invoke-interface {v1, p2, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_0

    .line 591
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Ll/ۗܺ᩷;

    const p2, 0x7f1202fa

    .line 592
    invoke-static {p2, p1, v0}, Ll/ۧۛܿ;->ۧ(ILl/ۗܺ᩷;Ljava/lang/String;)V

    goto :goto_0

    .line 114
    :pswitch_0
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "dfrwn"

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
