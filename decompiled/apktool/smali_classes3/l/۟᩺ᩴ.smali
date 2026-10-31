.class public final Ll/۟᩺ᩴ;
.super Ll/۬ܰᩴ;
.source "N673"


# instance fields
.field public final h:Ll/ۡ᩺ᩴ;


# direct methods
.method public constructor <init>(Ll/۟᩺ᩴ;Ll/ܶ۫ᩴ;)V
    .locals 0

    .line 941
    invoke-direct {p0, p1, p2}, Ll/۬ܰᩴ;-><init>(Ll/۬ܰᩴ;Ll/ܶ۫ᩴ;)V

    .line 942
    iget-object p1, p1, Ll/۟᩺ᩴ;->h:Ll/ۡ᩺ᩴ;

    iput-object p1, p0, Ll/۟᩺ᩴ;->h:Ll/ۡ᩺ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ۡ᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)V
    .locals 0

    .line 935
    invoke-direct {p0, p2, p3}, Ll/۬ܰᩴ;-><init>(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)V

    .line 936
    iput-object p1, p0, Ll/۟᩺ᩴ;->h:Ll/ۡ᩺ᩴ;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 952
    iget-object v0, p0, Ll/۬ܰᩴ;->a:Ll/ۡ᩺ᩴ;

    iget-object v1, p0, Ll/۟᩺ᩴ;->h:Ll/ۡ᩺ᩴ;

    invoke-virtual {v1}, Ll/ۡ᩺ᩴ;->e0()Ll/ᩳܿ᩵;

    move-result-object v1

    iget-object v2, p0, Ll/۬ܰᩴ;->b:Ll/ܶ۫ᩴ;

    invoke-virtual {v0, v2, v1}, Ll/ۡ᩺ᩴ;->f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    return-object v1
.end method

.method public final c(Ll/ܶ۫ᩴ;)Ll/۬ܰᩴ;
    .locals 1

    .line 947
    new-instance v0, Ll/۟᩺ᩴ;

    invoke-direct {v0, p0, p1}, Ll/۟᩺ᩴ;-><init>(Ll/۟᩺ᩴ;Ll/ܶ۫ᩴ;)V

    return-object v0
.end method

.method public final onCompletion(Ljava/util/concurrent/CountedCompleter;)V
    .locals 2

    .line 267
    iget-object v0, p0, Ll/۬ܰᩴ;->d:Ll/۬ܰᩴ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 958
    :cond_0
    check-cast v0, Ll/۟᩺ᩴ;

    .line 245
    iget-object v0, v0, Ll/۬ܰᩴ;->f:Ljava/lang/Object;

    .line 958
    check-cast v0, Ll/ᩳܿ᩵;

    .line 959
    iget-object v1, p0, Ll/۬ܰᩴ;->e:Ll/۬ܰᩴ;

    check-cast v1, Ll/۟᩺ᩴ;

    .line 245
    iget-object v1, v1, Ll/۬ܰᩴ;->f:Ljava/lang/Object;

    .line 959
    check-cast v1, Ll/ᩳܿ᩵;

    invoke-interface {v0, v1}, Ll/ᩳܿ᩵;->i(Ll/ᩳܿ᩵;)V

    .line 255
    iput-object v0, p0, Ll/۬ܰᩴ;->f:Ljava/lang/Object;

    .line 963
    :goto_0
    invoke-super {p0, p1}, Ll/۬ܰᩴ;->onCompletion(Ljava/util/concurrent/CountedCompleter;)V

    return-void
.end method
