.class public final enum Ll/᩸ܺ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    .line 111
    invoke-direct/range {v0 .. v8}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const-string v4, "opt.Xdoclint.subopts"

    const-string v5, "opt.Xdoclint.custom"

    const-string v1, "XDOCLINT_CUSTOM"

    const/4 v2, 0x6

    const-string v3, "-Xdoclint:"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    .line 0
    invoke-direct/range {v0 .. v7}, Ll/᩸ܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 120
    sget-object p2, Ll/֡ۖ۠;->ۧܽ:Ll/֡ۖ۠;

    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/֡ۖ۠;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, " "

    .line 0
    invoke-static {v0, v1, p3}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 122
    :goto_0
    iget-object p2, p2, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Ll/֨ۖ۠;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 3

    .line 114
    invoke-static {}, Ll/֨ۖ֨;->֫()Ll/֨ۖ֨;

    move-result-object v0

    sget-object v1, Ll/֡ۖ۠;->ۧܽ:Ll/֡ۖ۠;

    iget-object v1, v1, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    const-string v2, "-Xmsgs:"

    .line 115
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 114
    invoke-virtual {v0, p1}, Ll/֨ۖ֨;->֫(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
