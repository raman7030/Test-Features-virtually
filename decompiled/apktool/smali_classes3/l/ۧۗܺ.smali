.class public final Ll/ۧۗܺ;
.super Ljava/util/AbstractCollection;
.source "O2OZ"


# instance fields
.field public final synthetic ᩸:Ll/ܽۗܺ;


# direct methods
.method public constructor <init>(Ll/ܽۗܺ;)V
    .locals 0

    .line 915
    iput-object p1, p0, Ll/ۧۗܺ;->᩸:Ll/ܽۗܺ;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 923
    iget-object v0, p0, Ll/ۧۗܺ;->᩸:Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->clear()V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 933
    iget-object v0, p0, Ll/ۧۗܺ;->᩸:Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 935
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    .line 937
    :cond_0
    new-instance v1, Ll/ۨۙܺ;

    invoke-direct {v1, v0}, Ll/ۨۙܺ;-><init>(Ll/ܽۗܺ;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 918
    iget-object v0, p0, Ll/ۧۗܺ;->᩸:Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->size()I

    move-result v0

    return v0
.end method
