.class public final enum Ll/۫֨ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "ScriptDataEscapeStart"

    const/16 v1, 0x13

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۫֨ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 315
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 1

    const/16 v0, 0x2d

    .line 317
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ۧ(C)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 318
    invoke-virtual {p1, v0}, Ll/᩵֨ۚ;->֫(C)V

    .line 319
    sget-object p2, Ll/᩵ܶۚ;->ۡۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    .line 321
    :cond_0
    sget-object p2, Ll/᩵ܶۚ;->֫ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
