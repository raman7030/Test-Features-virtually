.class public abstract Ll/ۤۤܺ;
.super Ljava/lang/Object;
.source "84M0"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 402
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۧ()Ll/ۤۤܺ;
    .locals 1

    .line 172
    sget-object v0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    return-object v0
.end method

.method public static ۧ(Ljava/util/Comparator;)Ll/ۤۤܺ;
    .locals 1

    .line 193
    instance-of v0, p0, Ll/ۤۤܺ;

    if-eqz v0, :cond_0

    .line 194
    check-cast p0, Ll/ۤۤܺ;

    return-object p0

    .line 195
    :cond_0
    new-instance v0, Ll/ܿۗܺ;

    invoke-direct {v0, p0}, Ll/ܿۗܺ;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static ܽ()Ll/ۤۤܺ;
    .locals 1

    .line 303
    sget-object v0, Ll/ۗۨܺ;->᩸:Ll/ۗۨܺ;

    return-object v0
.end method


# virtual methods
.method public ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 609
    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method public final ֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 1

    .line 864
    invoke-static {p1}, Ll/ۡ۫ܺ;->ܿ(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    .line 865
    invoke-static {p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 866
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public ֫()Ll/ۤۤܺ;
    .locals 1

    .line 415
    new-instance v0, Ll/ܺۛܺ;

    invoke-direct {v0, p0}, Ll/ܺۛܺ;-><init>(Ll/ۤۤܺ;)V

    return-object v0
.end method

.method public final ֫(Ljava/util/Comparator;)Ll/ۤۤܺ;
    .locals 1

    .line 484
    new-instance v0, Ll/᩷ۗܺ;

    invoke-direct {v0, p0, p1}, Ll/᩷ۗܺ;-><init>(Ll/ۤۤܺ;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final ֫(Ll/ܽܶܺ;)Ll/ۤۤܺ;
    .locals 1

    .line 460
    new-instance v0, Ll/ᩴۙܺ;

    invoke-direct {v0, p1, p0}, Ll/ᩴۙܺ;-><init>(Ll/ܽܶܺ;Ll/ۤۤܺ;)V

    return-object v0
.end method
