.class public final enum Ll/֡֨ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "TagName"

    const/16 v1, 0x9

    .line 0
    invoke-direct {p0, v0, v1}, Ll/֡֨ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 144
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 148
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 149
    iget-object v1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {v1, v0}, Ll/ۡ֨ۚ;->ܽ(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result v0

    if-eqz v0, :cond_5

    const/16 v1, 0x20

    if-eq v0, v1, :cond_4

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_3

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_1

    const/16 p2, 0x3e

    if-eq v0, p2, :cond_2

    const p2, 0xffff

    if-eq v0, p2, :cond_0

    const/16 p2, 0x9

    if-eq v0, p2, :cond_4

    const/16 p2, 0xa

    if-eq v0, p2, :cond_4

    const/16 p2, 0xc

    if-eq v0, p2, :cond_4

    const/16 p2, 0xd

    if-eq v0, p2, :cond_4

    .line 179
    iget-object p1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۡ֨ۚ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 175
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 176
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 164
    :cond_1
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 165
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 168
    :cond_2
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܳ()V

    .line 169
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 161
    :cond_3
    sget-object p2, Ll/᩵ܶۚ;->֨ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 158
    :cond_4
    sget-object p2, Ll/᩵ܶۚ;->۟:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 172
    :cond_5
    iget-object p1, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-static {}, Ll/᩵ܶۚ;->ۧ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۡ֨ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
