.class public final enum Ll/ᩳۛۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "BeforeDoctypePublicIdentifier"

    const/16 v1, 0x37

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ᩳۛۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1254
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 1

    .line 1256
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

    .line 1285
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 1286
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1287
    sget-object p2, Ll/ܶۛۘ;->᩻֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1279
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 1280
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1281
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ᩳ()V

    .line 1282
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1273
    :cond_1
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 1274
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1275
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ᩳ()V

    .line 1276
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1270
    :cond_2
    sget-object p2, Ll/ܶۛۘ;->ܶ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1266
    :cond_3
    sget-object p2, Ll/ܶۛۘ;->۠֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    :cond_4
    return-void
.end method
