.class public final Ll/ܶ᩵;
.super Ljava/lang/Object;
.source "G58P"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field public final synthetic ᩸:Ll/ۙ᩵;


# direct methods
.method public constructor <init>(Ll/ۙ᩵;)V
    .locals 0

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ᩵;->᩸:Ll/ۙ᩵;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 167
    check-cast p1, Ljava/util/Map$Entry;

    .line 170
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 4

    .line 175
    iget-object v0, p0, Ll/ܶ᩵;->᩸:Ll/ۙ᩵;

    invoke-virtual {v0}, Ll/ۙ᩵;->ܽ()I

    move-result v1

    .line 176
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 177
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ll/ۙ᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 179
    :cond_0
    invoke-virtual {v0}, Ll/ۙ᩵;->ܽ()I

    move-result p1

    if-eq v1, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final clear()V
    .locals 1

    .line 184
    iget-object v0, p0, Ll/ܶ᩵;->᩸:Ll/ۙ᩵;

    invoke-virtual {v0}, Ll/ۙ᩵;->֫()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 189
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 191
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 192
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Ll/ܶ᩵;->᩸:Ll/ۙ᩵;

    invoke-virtual {v2, v0}, Ll/ۙ᩵;->֫(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_1

    :goto_0
    return v1

    :cond_1
    const/4 v3, 0x1

    .line 196
    invoke-virtual {v2, v0, v3}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v0

    .line 197
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq v0, p1, :cond_3

    if-eqz v0, :cond_2

    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    return v1

    :cond_3
    :goto_1
    return v3
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 202
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 203
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܶ᩵;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 253
    invoke-static {p0, p1}, Ll/ۙ᩵;->֫(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 7

    .line 259
    iget-object v0, p0, Ll/ܶ᩵;->᩸:Ll/ۙ᩵;

    invoke-virtual {v0}, Ll/ۙ᩵;->ܽ()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ltz v1, :cond_2

    .line 260
    invoke-virtual {v0, v1, v3}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v5

    .line 261
    invoke-virtual {v0, v1, v2}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_0

    const/4 v5, 0x0

    goto :goto_1

    .line 262
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    :goto_1
    if-nez v6, :cond_1

    const/4 v6, 0x0

    goto :goto_2

    .line 263
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v6

    :goto_2
    xor-int/2addr v5, v6

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    return v4
.end method

.method public final isEmpty()Z
    .locals 1

    .line 213
    iget-object v0, p0, Ll/ܶ᩵;->᩸:Ll/ۙ᩵;

    invoke-virtual {v0}, Ll/ۙ᩵;->ܽ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 218
    new-instance v0, Ll/᩹᩵;

    iget-object v1, p0, Ll/ܶ᩵;->᩸:Ll/ۙ᩵;

    invoke-direct {v0, v1}, Ll/᩹᩵;-><init>(Ll/ۙ᩵;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 223
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    .line 228
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 233
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 238
    iget-object v0, p0, Ll/ܶ᩵;->᩸:Ll/ۙ᩵;

    invoke-virtual {v0}, Ll/ۙ᩵;->ܽ()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 243
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 248
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
