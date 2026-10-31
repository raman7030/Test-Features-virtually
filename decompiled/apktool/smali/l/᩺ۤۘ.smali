.class public final enum Ll/᩺ۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "CommentEndBang"

    const/16 v1, 0x31

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩺ۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1061
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 1063
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result p2

    const-string v0, "--!"

    if-eqz p2, :cond_3

    const/16 v1, 0x2d

    if-eq p2, v1, :cond_2

    const/16 v1, 0x3e

    if-eq p2, v1, :cond_1

    const v1, 0xffff

    if-eq p2, v1, :cond_0

    .line 1084
    iget-object v1, p1, Ll/ܶ۫ۘ;->ܿ:Ll/ۖ۫ۘ;

    iget-object v1, v1, Ll/ۖ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1085
    sget-object p2, Ll/ܶۛۘ;->ۡ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1079
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 1080
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܽ()V

    .line 1081
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1070
    :cond_1
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܽ()V

    .line 1071
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1066
    :cond_2
    iget-object p2, p1, Ll/ܶ۫ۘ;->ܿ:Ll/ۖ۫ۘ;

    iget-object p2, p2, Ll/ۖ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1067
    sget-object p2, Ll/ܶۛۘ;->ۘ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 1074
    :cond_3
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 1075
    iget-object p2, p1, Ll/ܶ۫ۘ;->ܿ:Ll/ۖ۫ۘ;

    iget-object p2, p2, Ll/ۖ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1076
    sget-object p2, Ll/ܶۛۘ;->ۡ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method
