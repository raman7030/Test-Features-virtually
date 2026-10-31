.class public abstract Ll/۟۬ۘ;
.super Ljava/lang/Object;
.source "68XX"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/֨۬ۘ;)V
    .locals 2

    .line 31
    invoke-interface {p2}, Ll/֨۬ۘ;->ᩳ()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ۘ;

    .line 33
    invoke-interface {v0}, Ll/ܶ۬ۘ;->isClosed()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v0}, Ll/ܶ۬ۘ;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/֫᩺᩵;->֫(Ljava/lang/String;)Ll/۟۬ۘ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 39
    invoke-virtual {v1, p0, p1, v0}, Ll/۟۬ۘ;->֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/ܶ۬ۘ;)V

    goto :goto_0

    .line 41
    :cond_1
    invoke-static {p0, p1, v0}, Ll/۟۬ۘ;->֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/֨۬ۘ;)V

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public abstract ֫()Ljava/util/Collection;
.end method

.method public abstract ֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/ܶ۬ۘ;)V
.end method
