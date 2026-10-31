.class public final Ll/᩸᩶ܺ;
.super Ll/ۜۤܺ;
.source "O3K3"


# instance fields
.field public final synthetic ᩸:Ll/᩶᩶ܺ;


# direct methods
.method public constructor <init>(Ll/᩶᩶ܺ;)V
    .locals 0

    .line 1378
    iput-object p1, p0, Ll/᩸᩶ܺ;->᩸:Ll/᩶᩶ܺ;

    .line 82
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1393
    iget-object v0, p0, Ll/᩸᩶ܺ;->᩸:Ll/᩶᩶ܺ;

    iget-object v0, v0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 902
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1386
    new-instance v0, Ll/᩹᩶ܺ;

    iget-object v1, p0, Ll/᩸᩶ܺ;->᩸:Ll/᩶᩶ܺ;

    invoke-direct {v0, v1}, Ll/᩹᩶ܺ;-><init>(Ll/᩶᩶ܺ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1398
    invoke-virtual {p0, p1}, Ll/᩸᩶ܺ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1402
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1403
    iget-object v0, p0, Ll/᩸᩶ܺ;->᩸:Ll/᩶᩶ܺ;

    iget-object v0, v0, Ll/᩶᩶ܺ;->ۙ:Ll/ܽۙܺ;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()Ljava/util/Map;
    .locals 1

    .line 1381
    iget-object v0, p0, Ll/᩸᩶ܺ;->᩸:Ll/᩶᩶ܺ;

    return-object v0
.end method
