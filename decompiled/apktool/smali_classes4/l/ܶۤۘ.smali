.class public final enum Ll/ܶۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AttributeValue_unquoted"

    const/16 v1, 0x27

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܶۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 796
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 798
    sget-object v0, Ll/ܶۛۘ;->ۙۧ:[C

    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->ۧ([C)Ljava/lang/String;

    move-result-object v0

    .line 799
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 800
    iget-object v1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v1, v0}, Ll/ۚ۫ۘ;->ۧ(Ljava/lang/String;)V

    .line 802
    :cond_0
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result p2

    if-eqz p2, :cond_6

    const/16 v0, 0x20

    if-eq p2, v0, :cond_5

    const/16 v0, 0x22

    if-eq p2, v0, :cond_4

    const/16 v0, 0x60

    if-eq p2, v0, :cond_4

    const v0, 0xffff

    if-eq p2, v0, :cond_3

    const/16 v0, 0x9

    if-eq p2, v0, :cond_5

    const/16 v0, 0xa

    if-eq p2, v0, :cond_5

    const/16 v0, 0xc

    if-eq p2, v0, :cond_5

    const/16 v0, 0xd

    if-eq p2, v0, :cond_5

    const/16 v0, 0x26

    if-eq p2, v0, :cond_1

    const/16 v0, 0x27

    if-eq p2, v0, :cond_4

    packed-switch p2, :pswitch_data_0

    .line 839
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void

    .line 819
    :pswitch_0
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܿ()V

    .line 820
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    :cond_1
    const/16 p2, 0x3e

    .line 812
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v1}, Ll/ܶ۫ۘ;->֫(Ljava/lang/Character;Z)[I

    move-result-object p2

    if-eqz p2, :cond_2

    .line 814
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->֫([I)V

    return-void

    .line 816
    :cond_2
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, v0}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void

    .line 827
    :cond_3
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 828
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 835
    :cond_4
    :pswitch_1
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 836
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void

    .line 809
    :cond_5
    sget-object p2, Ll/ܶۛۘ;->۟:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 823
    :cond_6
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 824
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
