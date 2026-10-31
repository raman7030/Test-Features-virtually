.class public final enum Ll/ܺ۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "BeforeAttributeValue"

    const/16 v1, 0x24

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܺ۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 693
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 695
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result v0

    if-eqz v0, :cond_6

    const/16 v1, 0x20

    if-eq v0, v1, :cond_5

    const/16 v1, 0x22

    if-eq v0, v1, :cond_4

    const/16 v1, 0x60

    if-eq v0, v1, :cond_3

    const v1, 0xffff

    if-eq v0, v1, :cond_2

    const/16 v1, 0x9

    if-eq v0, v1, :cond_5

    const/16 v1, 0xa

    if-eq v0, v1, :cond_5

    const/16 v1, 0xc

    if-eq v0, v1, :cond_5

    const/16 v1, 0xd

    if-eq v0, v1, :cond_5

    const/16 v1, 0x26

    if-eq v0, v1, :cond_1

    const/16 v1, 0x27

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    .line 737
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 738
    sget-object p2, Ll/᩵ܶۚ;->ܰ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 725
    :pswitch_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 726
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܳ()V

    .line 727
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 712
    :cond_0
    sget-object p2, Ll/᩵ܶۚ;->᩺:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 708
    :cond_1
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 709
    sget-object p2, Ll/᩵ܶۚ;->ܰ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 720
    :cond_2
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 721
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܳ()V

    .line 722
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 732
    :cond_3
    :pswitch_1
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 733
    iget-object p2, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p2, v0}, Ll/ۡ֨ۚ;->ۧ(C)V

    .line 734
    sget-object p2, Ll/᩵ܶۚ;->ܰ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 705
    :cond_4
    sget-object p2, Ll/᩵ܶۚ;->ۨ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    :cond_5
    return-void

    .line 715
    :cond_6
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 716
    iget-object p2, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ll/ۡ֨ۚ;->ۧ(C)V

    .line 717
    sget-object p2, Ll/᩵ܶۚ;->ܰ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
