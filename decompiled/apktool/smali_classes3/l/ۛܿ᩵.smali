.class public final Ll/ۛܿ᩵;
.super Ll/֨ۧ᩵;
.source "N673"


# instance fields
.field public b:Z

.field public final synthetic c:Ll/᩻ܳ᩵;


# direct methods
.method public constructor <init>(Ll/᩻ܳ᩵;Ll/֡ᩳ᩵;)V
    .locals 0

    .line 145
    iput-object p1, p0, Ll/ۛܿ᩵;->c:Ll/᩻ܳ᩵;

    invoke-direct {p0, p2}, Ll/֨ۧ᩵;-><init>(Ll/֡ᩳ᩵;)V

    const/4 p1, 0x1

    .line 146
    iput-boolean p1, p0, Ll/ۛܿ᩵;->b:Z

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 1

    .line 155
    iget-boolean v0, p0, Ll/ۛܿ᩵;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛܿ᩵;->c:Ll/᩻ܳ᩵;

    iget-object v0, v0, Ll/᩻ܳ᩵;->s:Ljava/util/function/IntPredicate;

    invoke-interface {v0, p1}, Ljava/util/function/IntPredicate;->test(I)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛܿ᩵;->b:Z

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1}, Ll/֡ᩳ᩵;->accept(I)V

    :cond_0
    return-void
.end method

.method public final c(J)V
    .locals 2

    .line 150
    iget-object p1, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    const-wide/16 v0, -0x1

    invoke-interface {p1, v0, v1}, Ll/֡ᩳ᩵;->c(J)V

    return-void
.end method

.method public final f()Z
    .locals 1

    .line 162
    iget-boolean v0, p0, Ll/ۛܿ᩵;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

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
