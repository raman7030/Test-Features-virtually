.class public final enum Ll/᩵ۛۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "CdataSection"

    const/16 v1, 0x42

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩵ۛۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1600
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 1602
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 1603
    iget-object v1, p1, Ll/ܶ۫ۘ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]]>"

    .line 1604
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۡ()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 1605
    :cond_1
    :goto_0
    new-instance p2, Ll/ۡ۫ۘ;

    iget-object v0, p1, Ll/ܶ۫ۘ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 320
    invoke-direct {p2}, Ll/ܺ۫ۘ;-><init>()V

    .line 321
    invoke-virtual {p2, v0}, Ll/ܺ۫ۘ;->֫(Ljava/lang/String;)V

    .line 1605
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/۠۫ۘ;)V

    .line 1606
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method
