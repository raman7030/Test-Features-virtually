.class public final Ll/۬ܳ۠;
.super Ll/۫ܳ۠;
.source "U7M7"


# instance fields
.field public final ᩻:Ll/᩷۠ᩴ;


# direct methods
.method public constructor <init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 234
    invoke-direct {p0, p1, p2}, Ll/۫ܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;)V

    .line 235
    iput-object p3, p0, Ll/۬ܳ۠;->᩻:Ll/᩷۠ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;I)V
    .locals 0

    .line 234
    invoke-direct {p0, p1, p2}, Ll/۫ܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;)V

    .line 235
    iput-object p3, p0, Ll/۬ܳ۠;->᩻:Ll/᩷۠ᩴ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 240
    iget-object v0, p0, Ll/۬ܳ۠;->᩻:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toUri()Ljava/net/URI;
    .locals 1

    .line 278
    iget-object v0, p0, Ll/۬ܳ۠;->᩻:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toUri()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/util/Collection;)Ljava/lang/String;
    .locals 3

    .line 250
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object v0

    .line 251
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷۠ᩴ;

    .line 252
    invoke-interface {v1}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object v1

    .line 253
    invoke-interface {v0, v1}, Ll/᩷۠ᩴ;->startsWith(Ll/᩷۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 255
    :try_start_0
    invoke-interface {v1, v0}, Ll/᩷۠ᩴ;->relativize(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 257
    invoke-static {v1}, Ll/۫ܳ۠;->֫(Ll/᩷۠ᩴ;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    nop

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/۫ܳ۠;
    .locals 3

    .line 283
    new-instance v0, Ll/۬ܳ۠;

    iget-object v1, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    .line 284
    invoke-interface {v1, p1}, Ll/᩷۠ᩴ;->resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v1

    iget-object v2, p0, Ll/۬ܳ۠;->᩻:Ll/᩷۠ᩴ;

    .line 285
    invoke-interface {v2, p1}, Ll/᩷۠ᩴ;->resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    iget-object v2, p0, Ll/۫ܳ۠;->֫:Ll/᩷ܿ۠;

    invoke-direct {v0, v2, v1, p1}, Ll/۬ܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V

    return-object v0
.end method

.method public final ֫()Ll/ܽ᩶۠;
    .locals 1

    .line 268
    sget-object v0, Ll/᩷ܿ۠;->۟:Ljava/util/Set;

    .line 491
    iget-object v0, p0, Ll/۬ܳ۠;->᩻:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩷ܿ۠;->ۧ(Ljava/lang/String;)Ll/ܽ᩶۠;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z
    .locals 1

    .line 273
    iget-object v0, p0, Ll/۬ܳ۠;->᩻:Ll/᩷۠ᩴ;

    invoke-static {v0, p1, p2}, Ll/۫ܳ۠;->֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ll/ܽ᩶۠;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Ll/۬ܳ۠;->᩻:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
