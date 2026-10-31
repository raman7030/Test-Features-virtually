.class public final enum Ll/᩷ܺ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 408
    invoke-direct/range {v0 .. v7}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 7

    const-string v3, "--help -help -?"

    const-string v4, "opt.help"

    const-string v1, "HELP"

    const/16 v2, 0x2b

    move-object v0, p0

    move-object v5, p1

    move-object v6, p2

    .line 0
    invoke-direct/range {v0 .. v6}, Ll/᩷ܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;)V
    .locals 6

    .line 411
    invoke-virtual {p1}, Ll/֨ۖ۠;->֫()Ll/᩹ܶ۠;

    move-result-object v0

    .line 412
    invoke-virtual {p1}, Ll/֨ۖ۠;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 413
    sget-object v2, Ll/᩸ܶ۠;->ۗ:Ll/᩸ܶ۠;

    sget-object v3, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    .line 598
    invoke-virtual {v0, v2}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v1

    const-string v5, "msg.usage.header"

    invoke-virtual {v0, v3, v5, v4}, Ll/᩹ܶ۠;->֫(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ll/᩹ܶ۠;->֫(Ljava/io/PrintWriter;Ljava/lang/String;)V

    .line 414
    sget-object v1, Ll/ᩴۖ۠;->ۙ:Ll/ᩴۖ۠;

    invoke-static {v0, v1}, Ll/֡ۖ۠;->֫(Ll/᩹ܶ۠;Ll/ᩴۖ۠;)V

    .line 575
    invoke-virtual {v0, v2}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/PrintWriter;->println()V

    .line 416
    invoke-super {p0, p1, p2}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;)V

    return-void
.end method
