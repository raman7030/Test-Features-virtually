.class public final synthetic Ll/ۧۡۡ;
.super Ljava/lang/Object;
.source "P9S5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧۡۡ;->᩸:I

    iput-object p2, p0, Ll/ۧۡۡ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۧۡۡ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۧۡۡ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Lcom/google/android/material/search/SearchView;

    .line 12
    invoke-static {v1, p1}, Lcom/google/android/material/search/SearchView;->$r8$lambda$z6qQrR1V8KE1EVKGxNJ2AT4K2RQ(Lcom/google/android/material/search/SearchView;Landroid/view/View;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/ۛ᩻ۡ;

    .line 17
    sget-object p1, Ll/ۛ᩻ۡ;->᩷ۧ:Ll/ۙۤۡ;

    .line 44
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/۟᩸ۢ;

    invoke-static {v1}, Ll/۟᩸ۢ;->ᩳ(Ll/۟᩸ۢ;)V

    return-void

    :pswitch_2
    check-cast v1, Ll/ۤۤۜ;

    sget p1, Ll/ۤۤۜ;->᩻ܿ:I

    .line 369
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_3
    check-cast v1, Ll/ۗܺ᩷;

    .line 130
    sget p1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p1, Ll/᩵ۚۢ;

    invoke-direct {p1, v1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v0, 0x7f12042f

    .line 131
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f120854

    .line 132
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 133
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 134
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 0
    :pswitch_4
    check-cast v1, Ll/ܳۙܳ;

    invoke-static {v1}, Ll/ܳۙܳ;->ᩳ(Ll/ܳۙܳ;)V

    return-void

    :pswitch_5
    check-cast v1, Ll/ۢ᩻ܿ;

    sget p1, Ll/ۢ᩻ܿ;->ܳۧ:I

    .line 63
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_6
    check-cast v1, Ll/᩻ۡۡ;

    sget p1, Ll/᩻ۡۡ;->֫֫:I

    const/4 p1, 0x1

    .line 274
    invoke-virtual {v1, p1}, Ll/᩻ۡۡ;->ۧ(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
