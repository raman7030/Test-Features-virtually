.class public final Ll/ܳܳܳ;
.super Ljava/lang/Object;
.source "27BS"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:Ljava/util/HashMap;

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 7

    .line 258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 254
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳܳܳ;->᩸:Ljava/util/HashMap;

    .line 256
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܳܳܳ;->᩹:Ljava/util/ArrayList;

    const-string v0, "cookie"

    .line 259
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    const-string v0, ";"

    .line 261
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 262
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    .line 263
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 264
    array-length v4, v3

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    .line 265
    iget-object v4, p0, Ll/ܳܳܳ;->᩸:Ljava/util/HashMap;

    aget-object v5, v3, v1

    const/4 v6, 0x1

    aget-object v3, v3, v6

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 284
    iget-object v0, p0, Ll/ܳܳܳ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۠ܳܳ;)V
    .locals 3

    .line 325
    iget-object v0, p0, Ll/ܳܳܳ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿܳܳ;

    .line 326
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "null=null; expires=null"

    const-string v2, "Set-Cookie"

    invoke-virtual {p1, v2, v1}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method
