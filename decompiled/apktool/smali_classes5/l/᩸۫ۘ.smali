.class public final enum Ll/᩸۫ۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "TagName"

    const/16 v1, 0x9

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩸۫ۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 141
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 146
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 147
    iget-object v1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v1, v0}, Ll/ۚ۫ۘ;->ܽ(Ljava/lang/String;)V

    .line 149
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result p2

    if-eqz p2, :cond_4

    const/16 v0, 0x20

    if-eq p2, v0, :cond_3

    const/16 v0, 0x2f

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3e

    if-eq p2, v0, :cond_1

    const v0, 0xffff

    if-eq p2, v0, :cond_0

    const/16 v0, 0x9

    if-eq p2, v0, :cond_3

    const/16 v0, 0xa

    if-eq p2, v0, :cond_3

    const/16 v0, 0xc

    if-eq p2, v0, :cond_3

    const/16 v0, 0xd

    if-eq p2, v0, :cond_3

    .line 173
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 169
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 170
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 162
    :cond_1
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܿ()V

    .line 163
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 159
    :cond_2
    sget-object p2, Ll/ܶۛۘ;->֨ۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 156
    :cond_3
    sget-object p2, Ll/ܶۛۘ;->۟:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 166
    :cond_4
    iget-object p1, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-static {}, Ll/ܶۛۘ;->ۧ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۚ۫ۘ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
