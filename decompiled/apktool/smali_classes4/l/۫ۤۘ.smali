.class public final enum Ll/۫ۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "Comment"

    const/16 v1, 0x2e

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۫ۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 983
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 985
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۢ()C

    move-result v0

    if-eqz v0, :cond_2

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    .line 1001
    iget-object p1, p1, Ll/ܶ۫ۘ;->ܿ:Ll/ۖ۫ۘ;

    iget-object p1, p1, Ll/ۖ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    const/4 v0, 0x2

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->֫([C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 996
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 997
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܽ()V

    .line 998
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 988
    :cond_1
    sget-object p2, Ll/ܶۛۘ;->ۘ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void

    .line 991
    :cond_2
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 992
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->֫()V

    .line 993
    iget-object p1, p1, Ll/ܶ۫ۘ;->ܿ:Ll/ۖ۫ۘ;

    iget-object p1, p1, Ll/ۖ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :array_0
    .array-data 2
        0x2ds
        0x0s
    .end array-data
.end method
