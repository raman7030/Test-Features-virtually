.class public abstract Ll/ܳۙܺ;
.super Ljava/lang/Object;
.source "M3XQ"

# interfaces
.implements Ll/֡ۤܺ;


# instance fields
.field public transient ᩶:Ljava/util/Collection;

.field public transient ᩸:Ljava/util/Map;

.field public transient ᩹:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2230
    :cond_0
    instance-of v0, p1, Ll/֡ۤܺ;

    if-eqz v0, :cond_1

    .line 2231
    check-cast p1, Ll/֡ۤܺ;

    .line 2232
    invoke-interface {p0}, Ll/֡ۤܺ;->֫()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Ll/֡ۤܺ;->֫()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 232
    invoke-virtual {p0}, Ll/ܳۙܺ;->֫()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 243
    invoke-virtual {p0}, Ll/ܳۙܺ;->֫()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ܳۙܺ;->᩶:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 173
    invoke-virtual {p0}, Ll/ܳۙܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۙܺ;->᩶:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method

.method public ֫()Ljava/util/Map;
    .locals 1

    .line 209
    iget-object v0, p0, Ll/ܳۙܺ;->᩸:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 210
    invoke-virtual {p0}, Ll/ܳۙܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۙܺ;->᩸:Ljava/util/Map;

    :cond_0
    return-object v0
.end method

.method public ֫(Ljava/lang/Object;)Z
    .locals 2

    .line 48
    invoke-virtual {p0}, Ll/ܳۙܺ;->֫()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    .line 49
    invoke-interface {v1, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public abstract ۧ()Ljava/util/Map;
.end method

.method public abstract ܽ()Ljava/util/Set;
.end method

.method public ܿ()Ljava/util/Set;
    .locals 1

    .line 152
    iget-object v0, p0, Ll/ܳۙܺ;->᩹:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 153
    invoke-virtual {p0}, Ll/ܳۙܺ;->ܽ()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۙܺ;->᩹:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public abstract ᩳ()Ljava/util/Collection;
.end method
