.class public final enum Ll/ۖܺ۠;
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

    .line 470
    invoke-direct/range {v0 .. v7}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 7

    const-string v3, "--help-extra -X"

    const-string v4, "opt.X"

    const-string v1, "X"

    const/16 v2, 0x2e

    move-object v0, p0

    move-object v5, p1

    move-object v6, p2

    .line 0
    invoke-direct/range {v0 .. v6}, Ll/ۖܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;)V
    .locals 5

    .line 473
    invoke-virtual {p1}, Ll/֨ۖ۠;->֫()Ll/᩹ܶ۠;

    move-result-object v0

    .line 474
    sget-object v1, Ll/ᩴۖ۠;->᩹:Ll/ᩴۖ۠;

    invoke-static {v0, v1}, Ll/֡ۖ۠;->֫(Ll/᩹ܶ۠;Ll/ᩴۖ۠;)V

    .line 475
    sget-object v1, Ll/᩸ܶ۠;->ۗ:Ll/᩸ܶ۠;

    .line 575
    invoke-virtual {v0, v1}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/PrintWriter;->println()V

    .line 476
    sget-object v2, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 598
    invoke-virtual {v0, v1}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v1

    const-string v4, "msg.usage.nonstandard.footer"

    invoke-virtual {v0, v2, v4, v3}, Ll/᩹ܶ۠;->֫(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/᩹ܶ۠;->֫(Ljava/io/PrintWriter;Ljava/lang/String;)V

    .line 477
    invoke-super {p0, p1, p2}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;)V

    return-void
.end method
