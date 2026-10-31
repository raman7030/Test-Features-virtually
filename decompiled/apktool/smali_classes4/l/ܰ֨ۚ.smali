.class public final enum Ll/ܰ֨ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "ScriptDataEscapedLessthanSign"

    const/16 v1, 0x18

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܰ֨ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 421
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 423
    invoke-virtual {p2}, Ll/ᩳۚۚ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܽ()V

    .line 425
    iget-object v0, p1, Ll/᩵֨ۚ;->᩻:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܺ()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "<"

    .line 426
    invoke-virtual {p1, v0}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;)V

    .line 427
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܺ()C

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(C)V

    .line 428
    sget-object p2, Ll/᩵ܶۚ;->ܽۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    :cond_0
    const/16 v0, 0x2f

    .line 429
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ۧ(C)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 430
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܽ()V

    .line 431
    sget-object p2, Ll/᩵ܶۚ;->᩵ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    :cond_1
    const/16 p2, 0x3c

    .line 433
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(C)V

    .line 434
    sget-object p2, Ll/᩵ܶۚ;->ܺۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
