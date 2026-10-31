.class public final Ll/۟᩵ۖ;
.super Ljava/util/LinkedHashMap;
.source "R9OP"


# static fields
.field public static final ᩹:Ll/۟᩵ۖ;


# instance fields
.field public ᩸:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ll/۟᩵ۖ;

    invoke-direct {v0}, Ll/۟᩵ۖ;-><init>()V

    sput-object v0, Ll/۟᩵ۖ;->᩹:Ll/۟᩵ۖ;

    const/4 v1, 0x0

    .line 197
    iput-boolean v1, v0, Ll/۟᩵ۖ;->᩸:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Ll/۟᩵ۖ;->᩸:Z

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)I
    .locals 4

    .line 137
    instance-of v0, p0, [B

    if-eqz v0, :cond_2

    .line 138
    check-cast p0, [B

    .line 265
    array-length v0, p0

    .line 274
    sget-object v1, Ll/ܰᩴۖ;->֫:[B

    const/4 v1, 0x0

    move v2, v0

    :goto_0
    if-ge v1, v0, :cond_0

    mul-int/lit8 v2, v2, 0x1f

    .line 281
    aget-byte v3, p0, v1

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-nez v2, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v2

    .line 141
    :cond_2
    instance-of v0, p0, Ll/ۗᩴۖ;

    if-nez v0, :cond_3

    .line 144
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0

    .line 142
    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/util/Map;)I
    .locals 3

    .line 153
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 155
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll/۟᩵ۖ;->֫(Ljava/lang/Object;)I

    move-result v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/۟᩵ۖ;->֫(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v2

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static ֫(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 115
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    return v3

    .line 118
    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 119
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v3

    .line 122
    :cond_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 101
    instance-of v4, v2, [B

    if-eqz v4, :cond_4

    instance-of v4, v1, [B

    if-eqz v4, :cond_4

    .line 102
    check-cast v2, [B

    check-cast v1, [B

    invoke-static {v2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    goto :goto_0

    .line 104
    :cond_4
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_2

    return v3

    :cond_5
    return v0
.end method

.method private ۢ()V
    .locals 1

    .line 202
    iget-boolean v0, p0, Ll/۟᩵ۖ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    .line 207
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public static ۧ(Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 4

    .line 180
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    div-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 181
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 182
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 166
    instance-of v3, v1, [B

    if-eqz v3, :cond_0

    .line 167
    check-cast v1, [B

    .line 168
    array-length v3, v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    .line 182
    :cond_0
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ᩷()Ll/۟᩵ۖ;
    .locals 1

    .line 46
    sget-object v0, Ll/۟᩵ۖ;->᩹:Ll/۟᩵ۖ;

    return-object v0
.end method


# virtual methods
.method public final clear()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ll/۟᩵ۖ;->ۢ()V

    .line 64
    invoke-super {p0}, Ljava/util/LinkedHashMap;->clear()V

    return-void
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 58
    invoke-virtual {p0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0

    :cond_0
    invoke-super {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 133
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map;

    invoke-static {p0, p1}, Ll/۟᩵ۖ;->֫(Ljava/util/Map;Ljava/util/Map;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 162
    invoke-static {p0}, Ll/۟᩵ۖ;->֫(Ljava/util/Map;)I

    move-result v0

    return v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 69
    invoke-direct {p0}, Ll/۟᩵ۖ;->ۢ()V

    .line 70
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-super {p0, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 3

    .line 82
    invoke-direct {p0}, Ll/۟᩵ۖ;->ۢ()V

    .line 94
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 95
    sget-object v2, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    .line 84
    :cond_0
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 89
    invoke-direct {p0}, Ll/۟᩵ۖ;->ۢ()V

    .line 90
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۟᩵ۖ;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ll/۟᩵ۖ;->ۢ()V

    .line 51
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 52
    invoke-virtual {p0, p1}, Ll/۟᩵ۖ;->putAll(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 202
    iget-boolean v0, p0, Ll/۟᩵ۖ;->᩸:Z

    return v0
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 197
    iput-boolean v0, p0, Ll/۟᩵ۖ;->᩸:Z

    return-void
.end method

.method public final ܿ()Ll/۟᩵ۖ;
    .locals 2

    .line 189
    invoke-virtual {p0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ll/۟᩵ۖ;

    invoke-direct {v0}, Ll/۟᩵ۖ;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, Ll/۟᩵ۖ;

    .line 33
    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    const/4 v1, 0x1

    .line 34
    iput-boolean v1, v0, Ll/۟᩵ۖ;->᩸:Z

    return-object v0
.end method
