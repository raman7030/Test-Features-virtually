.class public final Ll/۬᩺ۚ;
.super Ljava/lang/Object;
.source "A7EF"

# interfaces
.implements Ll/۫ۛۚ;


# instance fields
.field public ᩸:Ljava/util/ArrayList;


# virtual methods
.method public final getLength()I
    .locals 2

    .line 878
    iget-object v0, p0, Ll/۬᩺ۚ;->᩸:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۗ᩺ۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->flatMapToInt(Ljava/util/function/Function;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->sum()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    return v0
.end method

.method public final ֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;
    .locals 2

    .line 883
    iget-object v0, p0, Ll/۬᩺ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۨۚ;

    .line 884
    invoke-static {v1, p1}, Ll/۬ۛۚ;->֫(Ll/֫ۨۚ;Ll/ۗۛۚ;)Ll/֫ۨۚ;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 868
    sget-object v0, Ll/۟۫ۚ;->ۗ:Ll/۟۫ۚ;

    invoke-virtual {v0}, Ll/۟۫ۚ;->ۧ()C

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 869
    iget-object v0, p0, Ll/۬᩺ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 871
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۨۚ;

    .line 872
    invoke-interface {v1, p1}, Ll/֫ۨۚ;->֫(Ll/֡۫ۚ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
