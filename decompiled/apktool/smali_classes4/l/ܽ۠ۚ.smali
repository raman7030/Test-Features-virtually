.class public final enum Ll/ܽ۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "ScriptDataDoubleEscaped"

    const/16 v1, 0x1c

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܽ۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 461
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 463
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܺ()C

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    const/4 v0, 0x3

    new-array v0, v0, [C

    .line 483
    fill-array-data v0, :array_0

    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->֫([C)Ljava/lang/String;

    move-result-object p2

    .line 484
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;)V

    return-void

    .line 479
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 480
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 470
    :cond_1
    invoke-virtual {p1, v0}, Ll/᩵֨ۚ;->֫(C)V

    .line 471
    sget-object p2, Ll/᩵ܶۚ;->᩻ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    .line 466
    :cond_2
    invoke-virtual {p1, v0}, Ll/᩵֨ۚ;->֫(C)V

    .line 467
    sget-object p2, Ll/᩵ܶۚ;->ܿۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    .line 474
    :cond_3
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 475
    invoke-virtual {p2}, Ll/ᩳۚۚ;->֫()V

    const p2, 0xfffd

    .line 476
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(C)V

    return-void

    nop

    :array_0
    .array-data 2
        0x2ds
        0x3cs
        0x0s
    .end array-data
.end method
