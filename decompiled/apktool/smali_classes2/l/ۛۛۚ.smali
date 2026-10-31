.class public final Ll/ۛۛۚ;
.super Ljava/lang/Object;
.source "I7EP"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xc

    .line 41
    invoke-direct {p0, v0}, Ll/ۛۛۚ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܿۤۚ;)Ll/ܽ۫ᩴ;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 76
    invoke-virtual {p0, p1}, Ll/ۛۛۚ;->ۧ(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final ֫(Ll/֫ۨۚ;)V
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ()I
    .locals 3

    .line 66
    iget-object v0, p0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۨۚ;

    .line 67
    invoke-interface {v2}, Ll/֫ۨۚ;->getLength()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x2

    return v1
.end method

.method public final ۧ(Ll/֡۫ۚ;)V
    .locals 2

    .line 81
    iget-object v0, p0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۨۚ;

    .line 82
    invoke-interface {v1, p1}, Ll/֫ۨۚ;->֫(Ll/֡۫ۚ;)V

    goto :goto_0

    :cond_0
    return-void
.end method
