.class public final enum Ll/ۙۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "MarkupDeclarationOpen"

    const/16 v1, 0x2b

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۙۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 908
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 1

    const-string v0, "--"

    .line 910
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    iget-object p2, p1, Ll/ܶ۫ۘ;->ܿ:Ll/ۖ۫ۘ;

    invoke-virtual {p2}, Ll/ۖ۫ۘ;->֫()Ll/۠۫ۘ;

    .line 912
    sget-object p2, Ll/ܶۛۘ;->ᩴ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    :cond_0
    const-string v0, "DOCTYPE"

    .line 913
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 914
    sget-object p2, Ll/ܶۛۘ;->ۚ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    :cond_1
    const-string v0, "[CDATA["

    .line 915
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->֫(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 919
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ۧ()V

    .line 920
    sget-object p2, Ll/ܶۛۘ;->ۜ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 922
    :cond_2
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 923
    sget-object p2, Ll/ܶۛۘ;->ܳ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void
.end method
