.class public final enum Ll/۠֨ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "RCDATAEndTagName"

    const/16 v1, 0xc

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۠֨ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 214
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method private ۧ(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 1

    const-string v0, "</"

    .line 255
    invoke-virtual {p1, v0}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;)V

    .line 256
    iget-object v0, p1, Ll/᩵֨ۚ;->᩻:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ll/᩵֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    .line 257
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 258
    sget-object p2, Ll/᩵ܶۚ;->ܰ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 216
    invoke-virtual {p2}, Ll/ᩳۚۚ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    invoke-virtual {p2}, Ll/ᩳۚۚ;->᩻()Ljava/lang/String;

    move-result-object p2

    .line 218
    iget-object v0, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {v0, p2}, Ll/ۡ֨ۚ;->ܽ(Ljava/lang/String;)V

    .line 219
    iget-object p1, p1, Ll/᩵֨ۚ;->᩻:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 223
    :cond_0
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_5

    const/16 v1, 0xa

    if-eq v0, v1, :cond_5

    const/16 v1, 0xc

    if-eq v0, v1, :cond_5

    const/16 v1, 0xd

    if-eq v0, v1, :cond_5

    const/16 v1, 0x20

    if-eq v0, v1, :cond_5

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_3

    const/16 v1, 0x3e

    if-eq v0, v1, :cond_1

    .line 250
    invoke-direct {p0, p1, p2}, Ll/۠֨ۚ;->ۧ(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V

    return-void

    .line 242
    :cond_1
    invoke-virtual {p1}, Ll/᩵֨ۚ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 243
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܳ()V

    .line 244
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 247
    :cond_2
    invoke-direct {p0, p1, p2}, Ll/۠֨ۚ;->ۧ(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V

    return-void

    .line 236
    :cond_3
    invoke-virtual {p1}, Ll/᩵֨ۚ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 237
    sget-object p2, Ll/᩵ܶۚ;->֨ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 239
    :cond_4
    invoke-direct {p0, p1, p2}, Ll/۠֨ۚ;->ۧ(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V

    return-void

    .line 230
    :cond_5
    invoke-virtual {p1}, Ll/᩵֨ۚ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 231
    sget-object p2, Ll/᩵ܶۚ;->۟:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 233
    :cond_6
    invoke-direct {p0, p1, p2}, Ll/۠֨ۚ;->ۧ(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V

    return-void
.end method
