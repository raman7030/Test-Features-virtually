.class public final enum Ll/ۗ۫ۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "RawtextLessthanSign"

    const/16 v1, 0xd

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۗ۫ۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 254
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 1

    const/16 v0, 0x2f

    .line 256
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->ۧ(C)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 257
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ۧ()V

    .line 258
    sget-object p2, Ll/ܶۛۘ;->ۨ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void

    :cond_0
    const/16 p2, 0x3c

    .line 260
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    .line 261
    sget-object p2, Ll/ܶۛۘ;->ۤ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method
