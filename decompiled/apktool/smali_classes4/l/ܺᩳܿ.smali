.class public final Ll/ܺᩳܿ;
.super Ljava/lang/Object;
.source "569Z"


# static fields
.field public static final ۧ:Ll/ۨۘܽ;


# instance fields
.field public ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "xmlns:(\\w+)\\s*=\\s*\"([^\"]*?)\""

    .line 11
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ܺᩳܿ;->ۧ:Ll/ۨۘܽ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܺᩳܿ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 5

    .line 31
    iget-object v0, p0, Ll/ܺᩳܿ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 32
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "http://schemas.android.com/apk/res/android"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 33
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 36
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 37
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "http://schemas.android.com/apk/res-auto"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_3
    const-string v0, "android"

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ܺᩳܿ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 3

    .line 16
    iget-object v0, p0, Ll/ܺᩳܿ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 17
    sget-object v1, Ll/ܺᩳܿ;->ۧ:Ll/ۨۘܽ;

    invoke-virtual {v1, p1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p1

    .line 18
    :goto_0
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 19
    invoke-virtual {p1, v1}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
