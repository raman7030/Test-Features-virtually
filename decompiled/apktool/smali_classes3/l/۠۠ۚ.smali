.class public final enum Ll/۠۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "MarkupDeclarationOpen"

    const/16 v1, 0x2b

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۠۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 920
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 1

    const-string v0, "--"

    .line 922
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    iget-object p2, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    invoke-virtual {p2}, Ll/ܳ֨ۚ;->᩻()V

    .line 924
    sget-object p2, Ll/᩵ܶۚ;->ᩴ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    :cond_0
    const-string v0, "DOCTYPE"

    .line 925
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 926
    sget-object p2, Ll/᩵ܶۚ;->ۚ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    :cond_1
    const-string v0, "[CDATA["

    .line 927
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ۧ(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 931
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܽ()V

    .line 932
    sget-object p2, Ll/᩵ܶۚ;->ۜ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 934
    :cond_2
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 276
    iget-object p2, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    invoke-virtual {p2}, Ll/ܳ֨ۚ;->᩻()V

    const/4 v0, 0x1

    .line 277
    iput-boolean v0, p2, Ll/ܳ֨ۚ;->ᩳ:Z

    .line 936
    sget-object p2, Ll/᩵ܶۚ;->ܳ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
