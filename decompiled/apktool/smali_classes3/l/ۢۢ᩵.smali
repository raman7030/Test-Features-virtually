.class public final Ll/ۢۢ᩵;
.super Ljava/util/AbstractMap;
.source "QA30"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final ᩸:Ljava/util/HashSet;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 206
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 207
    iput-object p1, p0, Ll/ۢۢ᩵;->᩹:Ljava/lang/String;

    .line 208
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/ۢۢ᩵;->᩸:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 3

    .line 270
    new-instance v0, Ll/ۢۢ᩵;

    .line 217
    iget-object v1, p0, Ll/ۢۢ᩵;->᩹:Ljava/lang/String;

    .line 270
    invoke-direct {v0, v1}, Ll/ۢۢ᩵;-><init>(Ljava/lang/String;)V

    .line 226
    iget-object v1, p0, Ll/ۢۢ᩵;->᩸:Ljava/util/HashSet;

    .line 271
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 272
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/ۢۢ᩵;->֫(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 226
    iget-object v0, p0, Ll/ۢۢ᩵;->᩸:Ljava/util/HashSet;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 283
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 284
    invoke-virtual {p0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "empty"

    .line 285
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 287
    :cond_0
    invoke-virtual {p0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 288
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    .line 289
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 291
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 293
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ۢۢ᩵;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 237
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 251
    :cond_0
    new-instance v0, Ll/᩷ۢ᩵;

    invoke-direct {v0, p1}, Ll/᩷ۢ᩵;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Ll/ۢۢ᩵;->᩸:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method
