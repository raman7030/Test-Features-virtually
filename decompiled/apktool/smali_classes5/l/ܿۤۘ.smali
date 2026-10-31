.class public final enum Ll/ܿۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "ScriptDataEscapedEndTagOpen"

    const/16 v1, 0x19

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܿۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 425
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 427
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 428
    invoke-virtual {p1, v0}, Ll/ܶ۫ۘ;->֫(Z)Ll/ۚ۫ۘ;

    .line 429
    iget-object v0, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۢ()C

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۚ۫ۘ;->ܽ(Ljava/lang/String;)V

    .line 430
    iget-object v0, p1, Ll/ܶ۫ۘ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۢ()C

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 431
    sget-object p2, Ll/ܶۛۘ;->ᩴۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void

    :cond_0
    const-string p2, "</"

    .line 433
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ljava/lang/String;)V

    .line 434
    sget-object p2, Ll/ܶۛۘ;->ܺۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method
