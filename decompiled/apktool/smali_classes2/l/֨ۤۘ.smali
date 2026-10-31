.class public final enum Ll/֨ۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AttributeValue_singleQuoted"

    const/16 v1, 0x26

    .line 0
    invoke-direct {p0, v0, v1}, Ll/֨ۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 763
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 765
    sget-object v0, Ll/ܶۛۘ;->᩶ۧ:[C

    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->֫([C)Ljava/lang/String;

    move-result-object v0

    .line 766
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 767
    iget-object v1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v1, v0}, Ll/ۚ۫ۘ;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 769
    :cond_0
    iget-object v0, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v0}, Ll/ۚ۫ۘ;->ܿ()V

    .line 771
    :goto_0
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result p2

    if-eqz p2, :cond_5

    const v0, 0xffff

    if-eq p2, v0, :cond_4

    const/16 v0, 0x27

    const/16 v1, 0x26

    if-eq p2, v1, :cond_2

    if-eq p2, v0, :cond_1

    .line 792
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void

    .line 774
    :cond_1
    sget-object p2, Ll/ܶۛۘ;->᩶:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 777
    :cond_2
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Ll/ܶ۫ۘ;->֫(Ljava/lang/Character;Z)[I

    move-result-object p2

    if-eqz p2, :cond_3

    .line 779
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->֫([I)V

    return-void

    .line 781
    :cond_3
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1, v1}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void

    .line 788
    :cond_4
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 789
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 784
    :cond_5
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 785
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->ۧ(C)V

    return-void
.end method
