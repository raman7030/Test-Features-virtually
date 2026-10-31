.class public final enum Ll/᩵ۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AfterAttributeName"

    const/16 v1, 0x23

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩵ۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 636
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 638
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

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

    .line 675
    iget-object v0, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v0}, Ll/ۚ۫ۘ;->ᩳ()V

    .line 676
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->֡()V

    .line 677
    sget-object p2, Ll/ܶۛۘ;->ۛ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 654
    :pswitch_0
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܿ()V

    .line 655
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 651
    :pswitch_1
    sget-object p2, Ll/ܶۛۘ;->֫֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 663
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 664
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 648
    :cond_1
    sget-object p2, Ll/ܶۛۘ;->֨ۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 669
    :cond_2
    :pswitch_2
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 670
    iget-object p2, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p2}, Ll/ۚ۫ۘ;->ᩳ()V

    .line 671
    iget-object p2, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p2, v0}, Ll/ۚ۫ۘ;->֫(C)V

    .line 672
    sget-object p2, Ll/ܶۛۘ;->ۛ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    :cond_3
    return-void

    .line 658
    :cond_4
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 659
    iget-object p2, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ll/ۚ۫ۘ;->֫(C)V

    .line 660
    sget-object p2, Ll/ܶۛۘ;->ۛ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
