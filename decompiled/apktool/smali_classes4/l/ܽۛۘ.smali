.class public final enum Ll/ܽۛۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AfterDoctypePublicKeyword"

    const/16 v1, 0x36

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܽۛۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1214
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 1

    .line 1216
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result p2

    const/16 v0, 0x9

    if-eq p2, v0, :cond_4

    const/16 v0, 0xa

    if-eq p2, v0, :cond_4

    const/16 v0, 0xc

    if-eq p2, v0, :cond_4

    const/16 v0, 0xd

    if-eq p2, v0, :cond_4

    const/16 v0, 0x20

    if-eq p2, v0, :cond_4

    const/16 v0, 0x22

    if-eq p2, v0, :cond_3

    const/16 v0, 0x27

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3e

    if-eq p2, v0, :cond_1

    const v0, 0xffff

    if-eq p2, v0, :cond_0

    .line 1248
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 1249
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1250
    sget-object p2, Ll/ܶۛۘ;->᩻֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1242
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 1243
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1244
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ᩳ()V

    .line 1245
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1236
    :cond_1
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 1237
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1238
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ᩳ()V

    .line 1239
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1231
    :cond_2
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 1233
    sget-object p2, Ll/ܶۛۘ;->ܶ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1226
    :cond_3
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 1228
    sget-object p2, Ll/ܶۛۘ;->۠֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1223
    :cond_4
    sget-object p2, Ll/ܶۛۘ;->ܽ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method
