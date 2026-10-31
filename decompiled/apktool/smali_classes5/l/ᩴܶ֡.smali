.class public final Ll/ᩴܶ֡;
.super Ll/ۧܶ֡;
.source "F63J"


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;)Z
    .locals 3

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x35

    const-string v1, "#Replaced unresolvable odex instruction with a throw\n"

    const/4 v2, 0x0

    .line 116
    invoke-virtual {p1, v1, v2, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const-string v0, "throw "

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v2, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 53
    iget-object v0, p0, Ll/ۧܶ֡;->᩹:Ll/᩺֫ۚ;

    check-cast v0, Ll/۫ۗ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ll/ۧܶ֡;->ۧ(Ll/ۗ᩵ۚ;I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ܿ()V
    .locals 0

    return-void
.end method
