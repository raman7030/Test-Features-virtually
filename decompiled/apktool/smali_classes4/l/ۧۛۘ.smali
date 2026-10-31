.class public final enum Ll/ۧۛۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AfterDoctypeName"

    const/16 v1, 0x35

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۧۛۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1186
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 1

    .line 1188
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1189
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 1190
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1191
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ᩳ()V

    .line 1192
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    :cond_0
    const/4 v0, 0x5

    new-array v0, v0, [C

    .line 1195
    fill-array-data v0, :array_0

    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->ܽ([C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1196
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->֫()V

    return-void

    :cond_1
    const/16 v0, 0x3e

    .line 1197
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->ۧ(C)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1198
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ᩳ()V

    .line 1199
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void

    :cond_2
    const-string v0, "PUBLIC"

    .line 1200
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1201
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1202
    sget-object p2, Ll/ܶۛۘ;->۬:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    :cond_3
    const-string v0, "SYSTEM"

    .line 1203
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->ۧ(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 1204
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1205
    sget-object p2, Ll/ܶۛۘ;->ۤ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1207
    :cond_4
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 1208
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1209
    sget-object p2, Ll/ܶۛۘ;->᩻֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void

    :array_0
    .array-data 2
        0x9s
        0xas
        0xds
        0xcs
        0x20s
    .end array-data
.end method
