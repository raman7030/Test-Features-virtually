.class public final enum Ll/᩶ۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "BogusComment"

    const/16 v1, 0x2a

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩶ۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 895
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 899
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->֡()V

    .line 900
    new-instance v0, Ll/ۖ۫ۘ;

    invoke-direct {v0}, Ll/ۖ۫ۘ;-><init>()V

    const/16 v1, 0x3e

    .line 902
    invoke-virtual {p2, v1}, Ll/ۜ۫ۘ;->֫(C)Ljava/lang/String;

    move-result-object p2

    iget-object v1, v0, Ll/ۖ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 904
    invoke-virtual {p1, v0}, Ll/ܶ۫ۘ;->֫(Ll/۠۫ۘ;)V

    .line 905
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void
.end method
