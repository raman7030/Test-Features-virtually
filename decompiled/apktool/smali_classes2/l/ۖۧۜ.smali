.class public final Ll/ۖۧۜ;
.super Ljava/lang/Object;
.source "X770"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/ܺ۟᩻;

.field public final ܳ:Ll/ܳ᩻ۜ;

.field public final ܽ:Ll/᩻ۜۜ;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ll/ۧܿۜ;


# direct methods
.method public constructor <init>(Ll/ۘۧۜ;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/᩻ۜۜ;)V
    .locals 1

    .line 668
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 662
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۖۧۜ;->ܿ:Ljava/util/HashMap;

    .line 669
    iput-object p2, p0, Ll/ۖۧۜ;->ܳ:Ll/ܳ᩻ۜ;

    .line 670
    iput-object p3, p0, Ll/ۖۧۜ;->ۧ:Ll/ܺ۟᩻;

    .line 671
    iput-object p4, p0, Ll/ۖۧۜ;->ܽ:Ll/᩻ۜۜ;

    .line 672
    iget-object v0, p4, Ll/᩻ۜۜ;->᩷:Ll/ܽܿۜ;

    invoke-virtual {v0}, Ll/ܽܿۜ;->֫()Ll/ۧܿۜ;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۧۜ;->ᩳ:Ll/ۧܿۜ;

    .line 673
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 703
    iget-object v0, p4, Ll/᩻ۜۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {p3, p2, v0}, Ll/ܺ۟᩻;->ܽ(Ll/ܳ᩻ۜ;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܰܳۜ;

    .line 704
    iget-object p3, p3, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    const-string v0, "lib/"

    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ".so"

    invoke-virtual {p3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 713
    iget-object v0, p4, Ll/᩻ۜۜ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 706
    :cond_1
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 673
    :cond_2
    iput-object p1, p0, Ll/ۖۧۜ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 694
    iget-object v0, p0, Ll/ۖۧۜ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/ܺۧۜ;

    invoke-direct {v1, p1}, Ll/ܺۧۜ;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-void
.end method
