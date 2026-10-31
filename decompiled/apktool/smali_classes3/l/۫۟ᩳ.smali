.class public final Ll/۫۟ᩳ;
.super Ljava/lang/Object;
.source "66VE"


# direct methods
.method public static ֫()V
    .locals 2

    .line 41
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 42
    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Search canceled"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/۫ۘܽ;)V
    .locals 1

    .line 31
    invoke-static {}, Ll/۫۟ᩳ;->֫()V

    .line 32
    invoke-virtual {p0}, Ll/۫ۘܽ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 35
    invoke-virtual {p0}, Ll/۫ۘܽ;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 36
    :cond_0
    new-instance p0, Ll/ܳۨۡ;

    const v0, 0x7f120a68

    invoke-direct {p0, v0}, Ll/ܳۨۡ;-><init>(I)V

    throw p0

    .line 33
    :cond_1
    new-instance p0, Ll/ܳۨۡ;

    const v0, 0x7f120a69

    invoke-direct {p0, v0}, Ll/ܳۨۡ;-><init>(I)V

    throw p0
.end method

.method public static ֫(Ll/۫ۘܽ;I)Z
    .locals 0

    .line 23
    invoke-static {}, Ll/۫۟ᩳ;->֫()V

    .line 24
    invoke-virtual {p0, p1}, Ll/۫ۘܽ;->find(I)Z

    move-result p1

    .line 25
    invoke-static {p0}, Ll/۫۟ᩳ;->֫(Ll/۫ۘܽ;)V

    return p1
.end method

.method public static ۧ(Ll/۫ۘܽ;)Z
    .locals 1

    .line 15
    invoke-static {}, Ll/۫۟ᩳ;->֫()V

    .line 16
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v0

    .line 17
    invoke-static {p0}, Ll/۫۟ᩳ;->֫(Ll/۫ۘܽ;)V

    return v0
.end method
