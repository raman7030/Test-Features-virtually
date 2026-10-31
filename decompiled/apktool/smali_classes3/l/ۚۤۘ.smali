.class public final enum Ll/ۚۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AttributeValue_doubleQuoted"

    const/16 v1, 0x25

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۚۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 730
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 732
    sget-object v0, Ll/ܶۛۘ;->᩸ۧ:[C

    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->֫([C)Ljava/lang/String;

    move-result-object v0

    .line 733
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 734
    iget-object v1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v1, v0}, Ll/ۚ۫ۘ;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 736
    :cond_0
    iget-object v0, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v0}, Ll/ۚ۫ۘ;->ܿ()V

    .line 738
    :goto_0
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result p2

    if-eqz p2, :cond_5

    const/16 v0, 0x22

    if-eq p2, v0, :cond_4

    const/16 v1, 0x26

    if-eq p2, v1, :cond_2

    const v0, 0xffff

    if-eq p2, v0, :cond_1

    .line 759
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void

    .line 755
    :cond_1
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 756
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 744
    :cond_2
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Ll/ܶ۫ۘ;->֫(Ljava/lang/Character;Z)[I

    move-result-object p2

    if-eqz p2, :cond_3

    .line 746
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->֫([I)V

    return-void

    .line 748
    :cond_3
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, v1}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void

    .line 741
    :cond_4
    sget-object p2, Ll/ܶۛۘ;->᩶:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 751
    :cond_5
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 752
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void
.end method
