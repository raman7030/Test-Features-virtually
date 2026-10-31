.class public final enum Ll/᩶֨ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "ScriptDataLessthanSign"

    const/16 v1, 0x10

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩶֨ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 282
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 3

    .line 284
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result v0

    const/16 v1, 0x21

    if-eq v0, v1, :cond_2

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    const-string v2, "<"

    if-eq v0, v1, :cond_0

    .line 299
    invoke-virtual {p1, v2}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;)V

    .line 300
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 301
    sget-object p2, Ll/᩵ܶۚ;->֫ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 294
    :cond_0
    invoke-virtual {p1, v2}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;)V

    .line 295
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 296
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 286
    :cond_1
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܽ()V

    .line 287
    sget-object p2, Ll/᩵ܶۚ;->᩷ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    :cond_2
    const-string p2, "<!"

    .line 290
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;)V

    .line 291
    sget-object p2, Ll/᩵ܶۚ;->ۢۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
