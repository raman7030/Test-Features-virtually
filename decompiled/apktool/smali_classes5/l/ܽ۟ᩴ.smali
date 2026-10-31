.class public final Ll/ܽ۟ᩴ;
.super Ll/ۜۧ᩵;
.source "N673"


# instance fields
.field public b:Z

.field public final synthetic c:Ll/ۘ۟ᩴ;


# direct methods
.method public constructor <init>(Ll/ۘ۟ᩴ;Ll/֡ᩳ᩵;)V
    .locals 0

    .line 259
    iput-object p1, p0, Ll/ܽ۟ᩴ;->c:Ll/ۘ۟ᩴ;

    invoke-direct {p0, p2}, Ll/ۜۧ᩵;-><init>(Ll/֡ᩳ᩵;)V

    const/4 p1, 0x1

    .line 260
    iput-boolean p1, p0, Ll/ܽ۟ᩴ;->b:Z

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 1

    .line 269
    iget-boolean v0, p0, Ll/ܽ۟ᩴ;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ۟ᩴ;->c:Ll/ۘ۟ᩴ;

    iget-object v0, v0, Ll/ۘ۟ᩴ;->t:Ljava/util/function/DoublePredicate;

    invoke-interface {v0, p1, p2}, Ljava/util/function/DoublePredicate;->test(D)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܽ۟ᩴ;->b:Z

    if-eqz v0, :cond_0

    .line 270
    iget-object v0, p0, Ll/ۜۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1, p2}, Ll/֡ᩳ᩵;->accept(D)V

    :cond_0
    return-void
.end method

.method public final c(J)V
    .locals 2

    .line 264
    iget-object p1, p0, Ll/ۜۧ᩵;->a:Ll/֡ᩳ᩵;

    const-wide/16 v0, -0x1

    invoke-interface {p1, v0, v1}, Ll/֡ᩳ᩵;->c(J)V

    return-void
.end method

.method public final f()Z
    .locals 1

    .line 276
    iget-boolean v0, p0, Ll/ܽ۟ᩴ;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۜۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0}, Ll/֡ᩳ᩵;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
