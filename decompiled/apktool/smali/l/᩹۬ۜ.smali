.class public final synthetic Ll/᩹۬ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹۬ۜ;->᩸:I

    iput-object p2, p0, Ll/᩹۬ۜ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/᩹۬ۜ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/᩹۬ۜ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ۨۜۡ;

    .line 11
    sget-object p1, Ll/ۨۜۡ;->᩷ۧ:Ll/ۙۤۡ;

    .line 48
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ll/ܽۢܳ;

    .line 1111
    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    const v0, 0x7f120044

    const/4 v1, 0x0

    const v2, 0x7f120a76

    .line 415
    invoke-virtual {p1, v2, v0, v1}, Ll/ۗܺ᩷;->֫(IIZ)V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/ۤۤۜ;

    invoke-static {v1, p1}, Ll/ۤۤۜ;->ܽ(Ll/ۤۤۜ;Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
