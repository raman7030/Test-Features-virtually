.class public final Ll/ܶۢᩳ;
.super Ljava/lang/Object;
.source "P1XF"


# instance fields
.field public final ֫:Ll/֨۫֡;

.field public final ۧ:Ljava/util/List;

.field public final ܽ:Ljava/util/List;

.field public final ᩳ:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ll/֡᩷ۚ;Ll/֨ۢۚ;Ll/֨۫֡;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p3, p0, Ll/ܶۢᩳ;->֫:Ll/֨۫֡;

    .line 27
    invoke-virtual {p3}, Ll/֨۫֡;->᩷()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۢᩳ;->ۧ:Ljava/util/List;

    .line 28
    invoke-virtual {p3}, Ll/֨۫֡;->ۜ()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۢᩳ;->ܽ:Ljava/util/List;

    .line 29
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 30
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܽ۫֡;

    .line 31
    iget-object v0, p3, Ll/ܽ۫֡;->ܽ:Ll/ܿ۫֡;

    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    iget-object p3, p3, Ll/ܽ۫֡;->֫:Ll/ܿ۫֡;

    invoke-virtual {p2, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 34
    :cond_0
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۢᩳ;->ᩳ:Ljava/util/Set;

    return-void
.end method
