.class public final synthetic Ll/ܽۜۡ;
.super Ljava/lang/Object;
.source "98W2"

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
    iput p1, p0, Ll/ܽۜۡ;->᩸:I

    iput-object p2, p0, Ll/ܽۜۡ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ܽۜۡ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 2
    iget v0, p0, Ll/ܽۜۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ܽۜۡ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/᩸᩷᩷;

    .line 11
    iget-object v0, p0, Ll/ܽۜۡ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v0, Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;

    .line 16
    invoke-static {p1, v0, p2}, Ll/᩸᩷᩷;->ۧ(Ll/᩸᩷᩷;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;I)V

    return-void

    .line 19
    :pswitch_0
    iget-object p2, p0, Ll/ܽۜۡ;->᩹:Ljava/lang/Object;

    .line 21
    check-cast p2, Ljava/util/List;

    .line 23
    iget-object v0, p0, Ll/ܽۜۡ;->᩶:Ljava/lang/Object;

    .line 25
    check-cast v0, [I

    .line 327
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const/4 v2, 0x0

    aget v0, v0, v2

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܽᩴܿ;

    invoke-interface {p2}, Ll/ܽᩴܿ;->֫()Ljava/lang/String;

    move-result-object p2

    const-string v0, "stid"

    invoke-interface {v1, v0, p2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p2

    invoke-interface {p2}, Ll/۬ۤۡ;->apply()V

    .line 328
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    .line 0
    :pswitch_1
    iget-object p1, p0, Ll/ܽۜۡ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܳۜۡ;

    iget-object p2, p0, Ll/ܽۜۡ;->᩶:Ljava/lang/Object;

    check-cast p2, Ll/ۗܺ᩷;

    invoke-static {p1, p2}, Ll/ܳۜۡ;->ۧ(Ll/ܳۜۡ;Ll/ۗܺ᩷;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
