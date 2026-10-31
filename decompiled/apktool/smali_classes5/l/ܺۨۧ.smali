.class public final Ll/ܺۨۧ;
.super Ll/ᩳۨۧ;
.source "A5H1"


# instance fields
.field public ֫:Ll/ۖۨۧ;


# virtual methods
.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 2

    .line 446
    iget-object v0, p0, Ll/ܺۨۧ;->֫:Ll/ۖۨۧ;

    iget v1, v0, Ll/ۖۨۧ;->᩹:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Ll/ۖۨۧ;->᩹:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 449
    iput-boolean v1, v0, Ll/ۖۨۧ;->ۙ:Z

    .line 450
    invoke-virtual {v0}, Ll/ܽۨۧ;->end()V

    .line 452
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method

.method public final onTransitionStart(Ll/ܽۨۧ;)V
    .locals 1

    .line 438
    iget-object p1, p0, Ll/ܺۨۧ;->֫:Ll/ۖۨۧ;

    iget-boolean v0, p1, Ll/ۖۨۧ;->ۙ:Z

    if-nez v0, :cond_0

    .line 439
    invoke-virtual {p1}, Ll/ܽۨۧ;->start()V

    const/4 v0, 0x1

    .line 440
    iput-boolean v0, p1, Ll/ۖۨۧ;->ۙ:Z

    :cond_0
    return-void
.end method
