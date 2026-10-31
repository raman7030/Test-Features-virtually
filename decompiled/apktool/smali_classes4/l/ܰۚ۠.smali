.class public final Ll/ܰۚ۠;
.super Ll/ܳ֨۠;
.source "M3ZI"


# instance fields
.field public ֫:Z


# virtual methods
.method public final ֫(Ll/ܿ᩵۠;)V
    .locals 1

    .line 1315
    iget-boolean v0, p0, Ll/ܰۚ۠;->֫:Z

    if-nez v0, :cond_1

    sget-object v0, Ll/ᩴۚ۠;->֨ܽ:Ll/ᩴۚ۠;

    invoke-virtual {p1, v0}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Ll/ܰۚ۠;->֫:Z

    return-void
.end method

.method public final ۧ(Ll/ۚۚ۠;)V
    .locals 1

    .line 1309
    iget-boolean v0, p0, Ll/ܰۚ۠;->֫:Z

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1, p0}, Ll/ۚۚ۠;->֫(Ll/֡ۚ۠;)V

    :cond_1
    :goto_0
    return-void
.end method
