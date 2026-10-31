.class public final enum Ll/ۢ۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AttributeName"

    const/16 v1, 0x22

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۢ۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 608
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 611
    sget-object v0, Ll/᩵ܶۚ;->᩸ۧ:[C

    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ۧ([C)Ljava/lang/String;

    move-result-object v0

    .line 612
    iget-object v1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {v1, v0}, Ll/ۡ֨ۚ;->֫(Ljava/lang/String;)V

    .line 614
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result p2

    const/16 v0, 0x9

    if-eq p2, v0, :cond_3

    const/16 v0, 0xa

    if-eq p2, v0, :cond_3

    const/16 v0, 0xc

    if-eq p2, v0, :cond_3

    const/16 v0, 0xd

    if-eq p2, v0, :cond_3

    const/16 v0, 0x20

    if-eq p2, v0, :cond_3

    const/16 v0, 0x22

    if-eq p2, v0, :cond_2

    const/16 v0, 0x27

    if-eq p2, v0, :cond_2

    const/16 v0, 0x2f

    if-eq p2, v0, :cond_1

    const v0, 0xffff

    if-eq p2, v0, :cond_0

    packed-switch p2, :pswitch_data_0

    .line 644
    iget-object p1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p1, p2}, Ll/ۡ֨ۚ;->֫(C)V

    return-void

    .line 630
    :pswitch_0
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܳ()V

    .line 631
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 627
    :pswitch_1
    sget-object p2, Ll/᩵ܶۚ;->֫֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 634
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 635
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 624
    :cond_1
    sget-object p2, Ll/᩵ܶۚ;->֨ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 640
    :cond_2
    :pswitch_2
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 641
    iget-object p1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p1, p2}, Ll/ۡ֨ۚ;->֫(C)V

    return-void

    .line 621
    :cond_3
    sget-object p2, Ll/᩵ܶۚ;->᩹:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
