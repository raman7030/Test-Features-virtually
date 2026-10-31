.class public final enum Ll/ۘ۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AttributeValue_singleQuoted"

    const/16 v1, 0x26

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۘ۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 775
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 3

    const/4 v0, 0x1

    .line 777
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->֫(Z)Ljava/lang/String;

    move-result-object v1

    .line 778
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 779
    iget-object v2, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {v2, v1}, Ll/ۡ֨ۚ;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 781
    :cond_0
    iget-object v1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {v1}, Ll/ۡ֨ۚ;->ۖ()V

    .line 783
    :goto_0
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result p2

    if-eqz p2, :cond_5

    const v1, 0xffff

    if-eq p2, v1, :cond_4

    const/16 v1, 0x27

    const/16 v2, 0x26

    if-eq p2, v2, :cond_2

    if-eq p2, v1, :cond_1

    .line 804
    iget-object p1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p1, p2}, Ll/ۡ֨ۚ;->ۧ(C)V

    return-void

    .line 786
    :cond_1
    sget-object p2, Ll/᩵ܶۚ;->᩶:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 789
    :cond_2
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Ll/᩵֨ۚ;->֫(Ljava/lang/Character;Z)[I

    move-result-object p2

    if-eqz p2, :cond_3

    .line 791
    iget-object p1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p1, p2}, Ll/ۡ֨ۚ;->֫([I)V

    return-void

    .line 793
    :cond_3
    iget-object p1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p1, v2}, Ll/ۡ֨ۚ;->ۧ(C)V

    return-void

    .line 800
    :cond_4
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 801
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 796
    :cond_5
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 797
    iget-object p1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Ll/ۡ֨ۚ;->ۧ(C)V

    return-void
.end method
