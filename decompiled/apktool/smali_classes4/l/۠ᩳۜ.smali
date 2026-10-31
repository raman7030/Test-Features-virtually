.class public final Ll/۠ᩳۜ;
.super Ll/ۡᩳܽ;
.source "W6LU"


# instance fields
.field public final ᩶:Ljava/util/ArrayList;

.field public final ᩹:Ll/ۢ᩻ܽ;


# direct methods
.method public constructor <init>(Ll/ۢ᩻ܽ;Ljava/util/ArrayList;)V
    .locals 7

    .line 31
    invoke-direct {p0}, Ll/ۡᩳܽ;-><init>()V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۠ᩳۜ;->᩶:Ljava/util/ArrayList;

    .line 32
    iput-object p1, p0, Ll/۠ᩳۜ;->᩹:Ll/ۢ᩻ܽ;

    .line 33
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 34
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ܽ;

    .line 35
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-interface {v1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 37
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘᩳۜ;

    .line 38
    invoke-virtual {v4}, Ll/ۘᩳۜ;->֫()Z

    move-result v5

    if-eqz v5, :cond_0

    iget v5, v4, Ll/ۘᩳۜ;->ܳ:I

    ushr-int/lit8 v5, v5, 0x18

    invoke-interface {v1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v6

    if-ne v5, v6, :cond_0

    .line 39
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 43
    :cond_1
    iget-object v3, p0, Ll/۠ᩳۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    new-instance v4, Ll/ۚᩳۜ;

    invoke-direct {v4, p0, v1, v2}, Ll/ۚᩳۜ;-><init>(Ll/ۢ᩻ܽ;Ll/ۘ᩻ܽ;Ljava/util/ArrayList;)V

    move-object v1, v4

    :goto_2
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 45
    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘᩳۜ;

    .line 46
    invoke-virtual {p2}, Ll/ۘᩳۜ;->֫()Z

    move-result v1

    if-eqz v1, :cond_4

    iget p2, p2, Ll/ۘᩳۜ;->ܳ:I

    ushr-int/lit8 p2, p2, 0x18

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_3

    :cond_5
    const-string p1, "Resource patch package is missing."

    const-string p2, "RESOURCE_PATCH_CORRUPT"

    .line 219
    invoke-static {p2, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 47
    throw p1

    :cond_6
    return-void
.end method


# virtual methods
.method public final ۚ()I
    .locals 1

    .line 53
    iget-object v0, p0, Ll/۠ᩳۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۢ(I)Ll/ۘ᩻ܽ;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/۠ᩳۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩻ܽ;

    return-object p1
.end method

.method public final ᩺()Ljava/lang/Iterable;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/۠ᩳۜ;->᩶:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ᩻ۧ()Ll/۫᩻ܽ;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/۠ᩳۜ;->᩹:Ll/ۢ᩻ܽ;

    invoke-interface {v0}, Ll/ۢ᩻ܽ;->᩻ۧ()Ll/۫᩻ܽ;

    move-result-object v0

    return-object v0
.end method
