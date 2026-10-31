.class public final enum Ll/ۨ۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AfterDoctypeName"

    const/16 v1, 0x35

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۨ۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1196
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 3

    .line 1198
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 1199
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 1200
    iget-object p2, p1, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    iput-boolean v1, p2, Ll/᩻֨ۚ;->ᩳ:Z

    .line 1201
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܿ()V

    .line 1202
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    :cond_0
    const/4 v0, 0x5

    new-array v0, v0, [C

    .line 1205
    fill-array-data v0, :array_0

    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ܽ([C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1206
    invoke-virtual {p2}, Ll/ᩳۚۚ;->֫()V

    return-void

    :cond_1
    const/16 v0, 0x3e

    .line 1207
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ۧ(C)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1208
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܿ()V

    .line 1209
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    :cond_2
    const-string v0, "PUBLIC"

    .line 1210
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ܽ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1211
    iget-object p2, p1, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    iput-object v0, p2, Ll/᩻֨ۚ;->ܳ:Ljava/lang/String;

    .line 1212
    sget-object p2, Ll/᩵ܶۚ;->۬:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    :cond_3
    const-string v0, "SYSTEM"

    .line 1213
    invoke-virtual {p2, v0}, Ll/ᩳۚۚ;->ܽ(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 1214
    iget-object p2, p1, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    iput-object v0, p2, Ll/᩻֨ۚ;->ܳ:Ljava/lang/String;

    .line 1215
    sget-object p2, Ll/᩵ܶۚ;->ۤ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1217
    :cond_4
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 1218
    iget-object p2, p1, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    iput-boolean v1, p2, Ll/᩻֨ۚ;->ᩳ:Z

    .line 1219
    sget-object p2, Ll/᩵ܶۚ;->᩻֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    nop

    :array_0
    .array-data 2
        0x9s
        0xas
        0xds
        0xcs
        0x20s
    .end array-data
.end method
