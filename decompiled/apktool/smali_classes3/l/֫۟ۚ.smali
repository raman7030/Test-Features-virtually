.class public final Ll/֫۟ۚ;
.super Ll/ۜ۫ۚ;
.source "S7FD"


# instance fields
.field public ۙ:Ljava/util/ArrayList;

.field public ᩶:Ll/ܰ۫ۚ;


# direct methods
.method public constructor <init>(Ll/ܰ۫ۚ;)V
    .locals 2

    .line 46
    iget-object v0, p1, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    sget-object v1, Ll/ۙ۬ۚ;->ۖ֫:Ll/ۙ۬ۚ;

    invoke-direct {p0, v0, v1}, Ll/ۜ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫۟ۚ;->ۙ:Ljava/util/ArrayList;

    .line 47
    iput-object p1, p0, Ll/֫۟ۚ;->᩶:Ll/ܰ۫ۚ;

    return-void
.end method


# virtual methods
.method public final isEmpty()Z
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֫۟ۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 72
    invoke-super {p0, p1}, Ll/ۜ۫ۚ;->֫(Ll/֡۫ۚ;)V

    .line 73
    iget-object v0, p0, Ll/֫۟ۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 74
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܰۚ;

    .line 75
    invoke-virtual {v1, p1}, Ll/۟ܰۚ;->֫(Ll/֡۫ۚ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܺۤۚ;Ll/ܺۤۚ;Ll/ܺۤۚ;Ljava/util/ArrayList;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/ۛ۬ۚ;

    .line 55
    sget-object v1, Ll/ۛ۬ۚ;->۟:Ll/ۛ۬ۚ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛ۬ۚ;->ܿ֫:Ll/ۛ۬ۚ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛ۬ۚ;->ۨ:Ll/ۛ۬ۚ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ll/ۛ۬ۚ;->֫([Ll/ۛ۬ۚ;)I

    move-result v0

    iget-object v1, p0, Ll/֫۟ۚ;->᩶:Ll/ܰ۫ۚ;

    invoke-virtual {v1, v0, p1, p2}, Ll/ܰ۫ۚ;->ۧ(ILl/ܺۤۚ;Ll/ܺۤۚ;)Ll/ܳۨۚ;

    move-result-object p1

    .line 56
    new-instance p2, Ll/۟ܰۚ;

    invoke-direct {p2, v1, p1}, Ll/۟ܰۚ;-><init>(Ll/ܰ۫ۚ;Ll/ܳۨۚ;)V

    if-eqz p4, :cond_0

    .line 58
    invoke-virtual {p2, p4}, Ll/۫ۨۚ;->֫(Ljava/util/ArrayList;)V

    :cond_0
    if-eqz p3, :cond_1

    .line 61
    invoke-virtual {p2, p3}, Ll/۫ۨۚ;->֫(Ll/ܺۤۚ;)V

    .line 63
    :cond_1
    iget-object p1, p0, Ll/֫۟ۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()I
    .locals 2

    .line 81
    iget-object v0, p0, Ll/֫۟ۚ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܰܰۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->sum()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method
