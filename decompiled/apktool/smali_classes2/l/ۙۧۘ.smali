.class public abstract Ll/ۙۧۘ;
.super Ljava/lang/Object;
.source "J9FC"


# instance fields
.field public ֫:Ll/ۙۧۘ;


# virtual methods
.method public final ֫(Ll/ۙۧۘ;)V
    .locals 0

    .line 35
    iput-object p1, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    return-void
.end method

.method public abstract ֫(Ll/۠֫ۘ;)Z
.end method

.method public abstract ۧ(Ll/۠֫ۘ;)V
.end method

.method public final ܽ(Ll/۠֫ۘ;)V
    .locals 1

    .line 26
    invoke-virtual {p0, p1}, Ll/ۙۧۘ;->֫(Ll/۠֫ۘ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {p0, p1}, Ll/ۙۧۘ;->ۧ(Ll/۠֫ۘ;)V

    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    invoke-virtual {v0, p1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    return-void
.end method
