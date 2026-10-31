.class public abstract Ll/ۚۢۚ;
.super Ljava/util/AbstractCollection;
.source "O6BJ"


# instance fields
.field public final ᩸:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 46
    iput-object p1, p0, Ll/ۚۢۚ;->᩸:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 52
    iget-object v0, p0, Ll/ۚۢۚ;->᩸:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 54
    new-instance v1, Ll/᩵ۢۚ;

    invoke-direct {v1, p0, v0}, Ll/᩵ۢۚ;-><init>(Ll/ۚۢۚ;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۚۢۚ;->᩸:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public abstract ֫(ILjava/lang/Object;)I
.end method

.method public abstract ֫(Ljava/lang/Object;)I
.end method
