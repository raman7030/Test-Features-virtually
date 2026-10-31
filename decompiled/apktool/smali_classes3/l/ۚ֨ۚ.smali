.class public final enum Ll/ۚ֨ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "RcdataLessthanSign"

    const/16 v1, 0xa

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۚ֨ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 183
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 1

    const/16 v0, 0x2f

    .line 186
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ۧ(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܽ()V

    .line 188
    sget-object p2, Ll/᩵ܶۚ;->۫֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    .line 189
    :cond_0
    invoke-virtual {p2}, Ll/ᩳۚۚ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/᩵֨ۚ;->֫()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/᩵֨ۚ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->֫(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    .line 192
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Z)Ll/ۡ֨ۚ;

    move-result-object p2

    invoke-virtual {p1}, Ll/᩵֨ۚ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۡ֨ۚ;->ᩳ(Ljava/lang/String;)V

    iput-object p2, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    .line 193
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܳ()V

    .line 194
    sget-object p2, Ll/᩵ܶۚ;->ܶۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    :cond_1
    const-string p2, "<"

    .line 196
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;)V

    .line 197
    sget-object p2, Ll/᩵ܶۚ;->ܰ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
