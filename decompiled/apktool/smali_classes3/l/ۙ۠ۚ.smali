.class public final enum Ll/ۙ۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "CommentEnd"

    const/16 v1, 0x30

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۙ۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1041
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 1043
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result p2

    const-string v0, "--"

    if-eqz p2, :cond_4

    const/16 v1, 0x21

    if-eq p2, v1, :cond_3

    const/16 v1, 0x2d

    if-eq p2, v1, :cond_2

    const/16 v1, 0x3e

    if-eq p2, v1, :cond_1

    const v1, 0xffff

    if-eq p2, v1, :cond_0

    .line 1066
    iget-object v1, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    invoke-virtual {v1, v0}, Ll/ܳ֨ۚ;->֫(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ll/ܳ֨ۚ;->֫(C)V

    .line 1067
    sget-object p2, Ll/᩵ܶۚ;->ۡ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1061
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 1062
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ᩳ()V

    .line 1063
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1046
    :cond_1
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ᩳ()V

    .line 1047
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1058
    :cond_2
    iget-object p1, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    invoke-virtual {p1, v1}, Ll/ܳ֨ۚ;->֫(C)V

    return-void

    .line 1055
    :cond_3
    sget-object p2, Ll/᩵ܶۚ;->ۖ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1050
    :cond_4
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 1051
    iget-object p2, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    invoke-virtual {p2, v0}, Ll/ܳ֨ۚ;->֫(Ljava/lang/String;)V

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ll/ܳ֨ۚ;->֫(C)V

    .line 1052
    sget-object p2, Ll/᩵ܶۚ;->ۡ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
