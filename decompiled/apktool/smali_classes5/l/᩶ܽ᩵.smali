.class public abstract Ll/᩶ܽ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/᩷ᩳ᩵;
.implements Ll/۠ᩳ᩵;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    iput-boolean p1, p0, Ll/᩶ܽ᩵;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)V
    .locals 2

    .line 156
    iget-boolean v0, p0, Ll/᩶ܽ᩵;->a:Z

    if-eqz v0, :cond_0

    .line 157
    new-instance v0, Ll/֫ᩳ᩵;

    invoke-direct {v0, p1, p2, p0}, Ll/֫ᩳ᩵;-><init>(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ll/᩶ܽ᩵;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 159
    :cond_0
    new-instance v0, Ll/ܺᩳ᩵;

    invoke-virtual {p1, p0}, Ll/ۡ᩺ᩴ;->g0(Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Ll/ܺᩳ᩵;-><init>(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public synthetic accept(D)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->m()V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic accept(I)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->t()V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic accept(J)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->u()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(J)V
    .locals 0

    return-void
.end method

.method public final synthetic end()V
    .locals 0

    return-void
.end method

.method public final synthetic f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()I
    .locals 1

    .line 144
    iget-boolean v0, p0, Ll/᩶ܽ᩵;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    sget v0, Ll/۟۟ᩴ;->r:I

    return v0
.end method
