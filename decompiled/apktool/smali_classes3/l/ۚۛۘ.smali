.class public final enum Ll/ۚۛۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "PLAINTEXT"

    const/4 v1, 0x6

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۚۛۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 79
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 81
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۢ()C

    move-result v0

    if-eqz v0, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    .line 91
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->֫(C)Ljava/lang/String;

    move-result-object p2

    .line 92
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ljava/lang/String;)V

    return-void

    .line 88
    :cond_0
    new-instance p2, Ll/ᩴ۫ۘ;

    invoke-direct {p2}, Ll/ᩴ۫ۘ;-><init>()V

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/۠۫ۘ;)V

    return-void

    .line 83
    :cond_1
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 84
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->֫()V

    const p2, 0xfffd

    .line 85
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    return-void
.end method
