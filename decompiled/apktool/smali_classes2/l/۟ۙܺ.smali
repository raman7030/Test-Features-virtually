.class public final Ll/۟ۙܺ;
.super Ljava/util/AbstractSet;
.source "O2OZ"


# instance fields
.field public final synthetic ᩸:Ll/ܽۗܺ;


# direct methods
.method public constructor <init>(Ll/ܽۗܺ;)V
    .locals 0

    .line 680
    iput-object p1, p0, Ll/۟ۙܺ;->᩸:Ll/ܽۗܺ;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 706
    iget-object v0, p0, Ll/۟ۙܺ;->᩸:Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 688
    iget-object v0, p0, Ll/۟ۙܺ;->᩸:Ll/ܽۗܺ;

    invoke-virtual {v0, p1}, Ll/ܽۗܺ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 711
    iget-object v0, p0, Ll/۟ۙܺ;->᩸:Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 713
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    .line 715
    :cond_0
    new-instance v1, Ll/ۤۙܺ;

    invoke-direct {v1, v0}, Ll/ۤۙܺ;-><init>(Ll/ܽۗܺ;)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    .line 693
    iget-object v0, p0, Ll/۟ۙܺ;->᩸:Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 695
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 696
    :cond_0
    invoke-static {v0, p1}, Ll/ܽۗܺ;->֫(Ll/ܽۗܺ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ll/ܽۗܺ;->ܿ()Ljava/lang/Object;

    move-result-object v0

    if-eq p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 683
    iget-object v0, p0, Ll/۟ۙܺ;->᩸:Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->size()I

    move-result v0

    return v0
.end method
