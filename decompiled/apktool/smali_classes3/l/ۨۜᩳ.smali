.class public final synthetic Ll/ۨۜᩳ;
.super Ljava/lang/Object;
.source "N1MQ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۨۜᩳ;->᩸:I

    iput-object p2, p0, Ll/ۨۜᩳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۨۜᩳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget p1, p0, Ll/ۨۜᩳ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۨۜᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/ܳۜۡ;

    .line 11
    iget-object p2, p0, Ll/ۨۜᩳ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast p2, Ll/ۗܺ᩷;

    .line 16
    invoke-static {p1, p2}, Ll/ܳۜۡ;->ܽ(Ll/ܳۜۡ;Ll/ۗܺ᩷;)V

    return-void

    .line 19
    :pswitch_0
    iget-object p1, p0, Ll/ۨۜᩳ;->᩹:Ljava/lang/Object;

    .line 21
    check-cast p1, Ll/۠֫ۢ;

    .line 23
    iget-object p2, p0, Ll/ۨۜᩳ;->᩶:Ljava/lang/Object;

    .line 25
    check-cast p2, Ll/ܿۛ᩷;

    .line 28
    invoke-static {p1, p2}, Ll/۠֫ۢ;->֫(Ll/۠֫ۢ;Ll/ܿۛ᩷;)V

    return-void

    .line 31
    :pswitch_1
    iget-object p1, p0, Ll/ۨۜᩳ;->᩹:Ljava/lang/Object;

    .line 33
    check-cast p1, Ll/ܶ᩵ܿ;

    .line 35
    iget-object p2, p0, Ll/ۨۜᩳ;->᩶:Ljava/lang/Object;

    .line 37
    check-cast p2, Ll/᩵֡᩷;

    .line 40
    invoke-static {p1, p2}, Ll/᩵֡᩷;->ܽ(Ll/ܶ᩵ܿ;Ll/᩵֡᩷;)V

    return-void

    .line 43
    :pswitch_2
    iget-object p1, p0, Ll/ۨۜᩳ;->᩹:Ljava/lang/Object;

    .line 45
    check-cast p1, Ll/᩸᩷᩷;

    .line 47
    iget-object v0, p0, Ll/ۨۜᩳ;->᩶:Ljava/lang/Object;

    .line 49
    check-cast v0, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;

    .line 52
    invoke-static {p1, v0, p2}, Ll/᩸᩷᩷;->ᩳ(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;I)V

    return-void

    .line 55
    :pswitch_3
    iget-object p1, p0, Ll/ۨۜᩳ;->᩹:Ljava/lang/Object;

    .line 57
    check-cast p1, Ll/᩹ܶᩳ;

    .line 59
    iget-object p2, p0, Ll/ۨۜᩳ;->᩶:Ljava/lang/Object;

    .line 61
    check-cast p2, Ll/ܽ֨ᩳ;

    .line 2671
    new-instance v0, Ll/᩻᩷ᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Ll/᩻᩷ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2, v0}, Ll/᩹ܶᩳ;->֫(Ll/ܽ֨ᩳ;Ljava/lang/Runnable;)V

    return-void

    .line 0
    :pswitch_4
    iget-object p1, p0, Ll/ۨۜᩳ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/۟ۜᩳ;

    iget-object p2, p0, Ll/ۨۜᩳ;->᩶:Ljava/lang/Object;

    check-cast p2, Ll/ۗܺ᩷;

    invoke-static {p1, p2}, Ll/֫᩷ᩳ;->֫(Ll/۟ۜᩳ;Ll/ۗܺ᩷;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
