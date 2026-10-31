.class public final enum Ll/᩷۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "BeforeAttributeName"

    const/16 v1, 0x21

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩷۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 561
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 564
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result v0

    if-eqz v0, :cond_4

    const/16 v1, 0x20

    if-eq v0, v1, :cond_3

    const/16 v1, 0x22

    if-eq v0, v1, :cond_2

    const/16 v1, 0x27

    if-eq v0, v1, :cond_2

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_3

    const/16 v1, 0xa

    if-eq v0, v1, :cond_3

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3

    const/16 v1, 0xd

    if-eq v0, v1, :cond_3

    packed-switch v0, :pswitch_data_0

    .line 602
    iget-object v0, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {v0}, Ll/ۡ֨ۚ;->ܺ()V

    .line 603
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 604
    sget-object p2, Ll/᩵ܶۚ;->ۛ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 576
    :pswitch_0
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 577
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 580
    :pswitch_1
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܳ()V

    .line 581
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 590
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 591
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 573
    :cond_1
    sget-object p2, Ll/᩵ܶۚ;->֨ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 596
    :cond_2
    :pswitch_2
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 597
    iget-object p2, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p2}, Ll/ۡ֨ۚ;->ܺ()V

    .line 598
    iget-object p2, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p2, v0}, Ll/ۡ֨ۚ;->֫(C)V

    .line 599
    sget-object p2, Ll/᩵ܶۚ;->ۛ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    :cond_3
    return-void

    .line 584
    :cond_4
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 585
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 586
    iget-object p2, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p2}, Ll/ۡ֨ۚ;->ܺ()V

    .line 587
    sget-object p2, Ll/᩵ܶۚ;->ۛ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
