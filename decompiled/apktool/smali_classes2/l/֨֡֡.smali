.class public final Ll/֨֡֡;
.super Ljava/lang/Object;
.source "97SA"

# interfaces
.implements Ll/ܳ֨֡;


# virtual methods
.method public final create()Ll/ܿ֨֡;
    .locals 1

    .line 66
    new-instance v0, Ll/۠֡֡;

    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public final ֫()Ljava/util/Set;
    .locals 4

    const/16 v0, 0x26

    .line 61
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    .line 0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    aget-object v1, v2, v3

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "duplicate element: "

    invoke-static {v1, v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
