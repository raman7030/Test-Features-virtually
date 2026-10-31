.class public final enum Ll/۟۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "DoctypePublicIdentifier_doubleQuoted"

    const/16 v1, 0x38

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۟۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1301
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 1303
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result p2

    if-eqz p2, :cond_3

    const/16 v0, 0x22

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3e

    const/4 v1, 0x1

    if-eq p2, v0, :cond_1

    const v0, 0xffff

    if-eq p2, v0, :cond_0

    .line 1325
    iget-object p1, p1, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    iget-object p1, p1, Ll/᩻֨ۚ;->᩻:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 1319
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 1320
    iget-object p2, p1, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    iput-boolean v1, p2, Ll/᩻֨ۚ;->ᩳ:Z

    .line 1321
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܿ()V

    .line 1322
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1313
    :cond_1
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 1314
    iget-object p2, p1, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    iput-boolean v1, p2, Ll/᩻֨ۚ;->ᩳ:Z

    .line 1315
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܿ()V

    .line 1316
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1306
    :cond_2
    sget-object p2, Ll/᩵ܶۚ;->ۗ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1309
    :cond_3
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 1310
    iget-object p1, p1, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    iget-object p1, p1, Ll/᩻֨ۚ;->᩻:Ljava/lang/StringBuilder;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
