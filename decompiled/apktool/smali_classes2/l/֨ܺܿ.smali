.class public final Ll/֨ܺܿ;
.super Ljava/lang/Object;
.source "86ZM"


# instance fields
.field public final ֫:[I

.field public final ۧ:Ll/ܶܺܿ;

.field public final ܽ:Ll/ۢܺܿ;

.field public final ܿ:Ll/ܶۜܿ;

.field public final ᩳ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ܶۜܿ;Ll/ۢܺܿ;Ljava/util/List;Ll/ܶܺܿ;)V
    .locals 1

    .line 802
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 803
    iput-object p1, p0, Ll/֨ܺܿ;->ܿ:Ll/ܶۜܿ;

    .line 804
    iput-object p2, p0, Ll/֨ܺܿ;->ܽ:Ll/ۢܺܿ;

    .line 0
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 805
    iput-object p1, p0, Ll/֨ܺܿ;->ᩳ:Ljava/util/List;

    .line 806
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Ll/֨ܺܿ;->֫:[I

    .line 807
    iput-object p4, p0, Ll/֨ܺܿ;->ۧ:Ll/ܶܺܿ;

    return-void
.end method
