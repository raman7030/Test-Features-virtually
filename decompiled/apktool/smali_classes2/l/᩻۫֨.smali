.class public final Ll/᩻۫֨;
.super Ll/֡۠۠;
.source "W7SR"


# instance fields
.field public ۙ:Ljava/util/HashSet;


# virtual methods
.method public final ֫(Ll/ۡ۠۠;)Ljava/util/Collection;
    .locals 1

    .line 717
    sget-object v0, Ll/ۢۛ֨;->ۙ:Ll/ۢۛ֨;

    if-ne p1, v0, :cond_0

    .line 718
    iget-object p1, p0, Ll/᩻۫֨;->ۙ:Ljava/util/HashSet;

    return-object p1

    .line 720
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ۧ()[Ll/ۡ۠۠;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ۡ۠۠;

    .line 712
    sget-object v1, Ll/ۢۛ֨;->ۙ:Ll/ۢۛ֨;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public final ܿ()Ljava/lang/Iterable;
    .locals 1

    .line 726
    iget-object v0, p0, Ll/᩻۫֨;->ۙ:Ljava/util/HashSet;

    return-object v0
.end method
