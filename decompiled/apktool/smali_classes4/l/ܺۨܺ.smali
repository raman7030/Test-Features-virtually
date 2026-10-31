.class public final Ll/ܺۨܺ;
.super Ll/ۢۤܺ;
.source "I5J5"


# instance fields
.field public final ᩸:Ljava/lang/Iterable;

.field public final synthetic ᩹:Ll/ۘۨܺ;


# direct methods
.method public constructor <init>(Ll/ۘۨܺ;Ljava/util/Collection;)V
    .locals 0

    .line 275
    iput-object p1, p0, Ll/ܺۨܺ;->᩹:Ll/ۘۨܺ;

    .line 3586
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 276
    iput-object p2, p0, Ll/ܺۨܺ;->᩸:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 281
    invoke-virtual {p0, p1}, Ll/ܺۨܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 286
    instance-of v0, p1, Ll/ܰۤܺ;

    if-eqz v0, :cond_0

    .line 287
    check-cast p1, Ll/ܰۤܺ;

    .line 288
    iget-object v0, p0, Ll/ܺۨܺ;->᩹:Ll/ۘۨܺ;

    invoke-static {v0}, Ll/ۘۨܺ;->֫(Ll/ۘۨܺ;)Ljava/util/TreeMap;

    move-result-object v0

    iget-object v1, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۨܺ;

    if-eqz v0, :cond_0

    .line 289
    invoke-virtual {v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۤܺ;

    invoke-virtual {v1, p1}, Ll/ܰۤܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 290
    invoke-virtual {v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 298
    iget-object v0, p0, Ll/ܺۨܺ;->᩹:Ll/ۘۨܺ;

    invoke-static {v0}, Ll/ۘۨܺ;->֫(Ll/ۘۨܺ;)Ljava/util/TreeMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/util/Iterator;
    .locals 1

    .line 303
    iget-object v0, p0, Ll/ܺۨܺ;->᩸:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
