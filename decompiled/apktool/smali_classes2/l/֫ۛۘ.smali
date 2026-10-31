.class public final enum Ll/֫ۛۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "DoctypeName"

    const/16 v1, 0x34

    .line 0
    invoke-direct {p0, v0, v1}, Ll/֫ۛۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1151
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 1

    .line 1153
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1154
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ܳ()Ljava/lang/String;

    move-result-object p2

    .line 1155
    iget-object p1, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    iget-object p1, p1, Ll/ۘ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 1158
    :cond_0
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result p2

    if-eqz p2, :cond_4

    const/16 v0, 0x20

    if-eq p2, v0, :cond_3

    const/16 v0, 0x3e

    if-eq p2, v0, :cond_2

    const v0, 0xffff

    if-eq p2, v0, :cond_1

    const/16 v0, 0x9

    if-eq p2, v0, :cond_3

    const/16 v0, 0xa

    if-eq p2, v0, :cond_3

    const/16 v0, 0xc

    if-eq p2, v0, :cond_3

    const/16 v0, 0xd

    if-eq p2, v0, :cond_3

    .line 1182
    iget-object p1, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    iget-object p1, p1, Ll/ۘ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 1176
    :cond_1
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 1177
    iget-object p2, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1178
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ᩳ()V

    .line 1179
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1161
    :cond_2
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ᩳ()V

    .line 1162
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1169
    :cond_3
    sget-object p2, Ll/ܶۛۘ;->ۙ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1172
    :cond_4
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 1173
    iget-object p1, p1, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    iget-object p1, p1, Ll/ۘ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
