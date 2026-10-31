.class public Ll/ۡۤܺ;
.super Ll/֨ۛܺ;
.source "067E"


# instance fields
.field public final ᩸:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3741
    iput-object p1, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 3779
    invoke-virtual {p0}, Ll/ۡۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 3765
    invoke-virtual {p0}, Ll/ۡۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 3760
    invoke-virtual {p0}, Ll/ۡۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 3750
    invoke-virtual {p0}, Ll/ۡۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 121
    new-instance v1, Ll/֫ۤܺ;

    invoke-direct {v1, v0}, Ll/ۢۨܺ;-><init>(Ljava/util/Iterator;)V

    return-object v1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 3770
    invoke-virtual {p0, p1}, Ll/ۡۤܺ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3771
    invoke-virtual {p0}, Ll/ۡۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 3755
    invoke-virtual {p0}, Ll/ۡۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public ۧ()Ljava/util/Map;
    .locals 1

    .line 3745
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    return-object v0
.end method
