.class public final synthetic Ll/ܰ᩸ۡ;
.super Ljava/lang/Object;
.source "X5CP"

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
    iput p1, p0, Ll/ܰ᩸ۡ;->᩸:I

    iput-object p2, p0, Ll/ܰ᩸ۡ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ܰ᩸ۡ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    .line 2
    iget v0, p0, Ll/ܰ᩸ۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܰ᩸ۡ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Landroid/widget/EditText;

    .line 11
    iget-object v1, p0, Ll/ܰ᩸ۡ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v1, [Ljava/lang/String;

    .line 486
    aget-object p2, v1, p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 487
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܰ᩸ۡ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢܳ;

    iget-object v1, p0, Ll/ܰ᩸ۡ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/ᩳۜܳ;

    .line 1754
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    if-eqz p2, :cond_6

    const/4 p1, 0x1

    if-eq p2, p1, :cond_5

    const/4 p1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f12036c

    const v4, 0x7f120a76

    const-string v5, "net"

    const-string v6, "local"

    if-eq p2, p1, :cond_2

    const/4 p1, 0x3

    if-eq p2, p1, :cond_0

    goto :goto_1

    .line 1772
    :cond_0
    invoke-virtual {v0, v6}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 1773
    invoke-virtual {v0, v5}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    .line 1774
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p2

    if-eqz p1, :cond_3

    goto :goto_0

    .line 1776
    :cond_1
    new-instance p1, Ll/ۛ᩶ܿ;

    invoke-direct {p1, v0}, Ll/ۛ᩶ܿ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, p1}, Ll/᩵ܺܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩴܺܳ;)V

    goto :goto_1

    .line 1764
    :cond_2
    invoke-virtual {v0, v6}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 1765
    invoke-virtual {v0, v5}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    .line 1766
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p2

    if-eqz p1, :cond_3

    :goto_0
    const v3, 0x7f1202cd

    .line 415
    :cond_3
    invoke-virtual {p2, v4, v3, v2}, Ll/ۗܺ᩷;->֫(IIZ)V

    goto :goto_1

    .line 1768
    :cond_4
    new-instance p1, Ll/᩻ۡܳ;

    invoke-direct {p1, v0}, Ll/᩻ۡܳ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, p1}, Ll/᩵ܺܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩴܺܳ;)V

    goto :goto_1

    .line 1761
    :cond_5
    new-instance p1, Ll/ۖ֡ᩳ;

    const/4 p2, 0x3

    invoke-direct {p1, p2, v0}, Ll/ۖ֡ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1, p1}, Ll/᩵ܺܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩴܺܳ;)V

    goto :goto_1

    .line 1758
    :cond_6
    new-instance p1, Ll/᩻ۨۡ;

    invoke-direct {p1, v0}, Ll/᩻ۨۡ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, p1}, Ll/᩵ܺܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩴܺܳ;)V

    :goto_1
    return-void

    .line 0
    :pswitch_1
    iget-object p1, p0, Ll/ܰ᩸ۡ;->᩹:Ljava/lang/Object;

    check-cast p1, Lbin/mt/plus/Main;

    iget-object p2, p0, Ll/ܰ᩸ۡ;->᩶:Ljava/lang/Object;

    check-cast p2, Ll/֫᩹ۡ;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 80
    invoke-static {p1, v0}, Ll/֨ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_7

    .line 81
    invoke-interface {p2}, Ll/֫᩹ۡ;->onSuccess()V

    goto :goto_2

    .line 83
    :cond_7
    invoke-interface {p2}, Ll/֫᩹ۡ;->֫()V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
