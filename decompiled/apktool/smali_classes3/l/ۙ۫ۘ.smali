.class public final enum Ll/ۙ۫ۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "RCDATAEndTagName"

    const/16 v1, 0xc

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۙ۫ۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 209
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method private ۧ(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "</"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Ll/ܶ۫ۘ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܶ۫ۘ;->֫(Ljava/lang/String;)V

    .line 250
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->֡()V

    .line 251
    sget-object p2, Ll/ܶۛۘ;->ܰ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 211
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ܳ()Ljava/lang/String;

    move-result-object p2

    .line 213
    iget-object v0, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v0, p2}, Ll/ۚ۫ۘ;->ܽ(Ljava/lang/String;)V

    .line 214
    iget-object p1, p1, Ll/ܶ۫ۘ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 218
    :cond_0
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

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

    .line 244
    invoke-direct {p0, p1, p2}, Ll/ۙ۫ۘ;->ۧ(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V

    return-void

    .line 237
    :cond_1
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 238
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܿ()V

    .line 239
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 241
    :cond_2
    invoke-direct {p0, p1, p2}, Ll/ۙ۫ۘ;->ۧ(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V

    return-void

    .line 231
    :cond_3
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 232
    sget-object p2, Ll/ܶۛۘ;->֨ۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 234
    :cond_4
    invoke-direct {p0, p1, p2}, Ll/ۙ۫ۘ;->ۧ(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V

    return-void

    .line 225
    :cond_5
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 226
    sget-object p2, Ll/ܶۛۘ;->۟:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 228
    :cond_6
    invoke-direct {p0, p1, p2}, Ll/ۙ۫ۘ;->ۧ(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V

    return-void
.end method
