.class public final Ll/᩵᩺ܳ;
.super Ljava/lang/Object;
.source "L1Y0"


# direct methods
.method public static ֫(Lbin/mt/plus/Main;Ll/ᩳۜܳ;Ljava/lang/String;Ll/ᩴ᩺ܳ;)V
    .locals 3

    .line 44
    invoke-interface {p1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x1

    .line 1147
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 48
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    goto :goto_0

    :cond_0
    const/16 p1, 0x2e

    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    .line 52
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    .line 56
    :cond_1
    :goto_0
    new-instance v2, Ll/ۘ᩺ܳ;

    invoke-direct {v2, p0, p2, p3}, Ll/ۘ᩺ܳ;-><init>(Lbin/mt/plus/Main;Ljava/lang/String;Ll/ᩴ᩺ܳ;)V

    const p0, 0x7f1205c2

    .line 73
    invoke-virtual {v2, p0}, Ll/۬ۗܿ;->ۡ(I)V

    .line 74
    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 75
    invoke-virtual {v2}, Ll/۬ۗܿ;->֫()V

    const/4 p0, 0x6

    .line 76
    invoke-virtual {v2, p0}, Ll/۬ۗܿ;->ᩳ(I)V

    const/4 p0, 0x0

    .line 77
    invoke-virtual {v2, p0, p1}, Ll/۬ۗܿ;->֫(II)V

    .line 205
    invoke-virtual {v2, v1}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method
