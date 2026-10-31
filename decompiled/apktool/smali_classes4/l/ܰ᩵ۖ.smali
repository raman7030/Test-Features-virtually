.class public final Ll/ܰ᩵ۖ;
.super Ll/֫֡ۖ;
.source "89PP"


# instance fields
.field public final ֫:Ll/ۗ᩵ۖ;

.field public volatile ۧ:Z

.field public ܽ:Ljava/util/ArrayList;

.field public volatile ܿ:Ll/᩺᩵ۖ;

.field public ᩳ:Ll/ۨ᩵ۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ۗ᩵ۖ;Ll/᩺᩵ۖ;Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p1, p0, Ll/ܰ᩵ۖ;->֫:Ll/ۗ᩵ۖ;

    const/4 p1, 0x1

    .line 106
    iput-boolean p1, p0, Ll/ܰ᩵ۖ;->ۧ:Z

    .line 107
    iput-object p2, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    .line 108
    new-instance p1, Ll/ۨ᩵ۖ;

    invoke-direct {p1, p0, p3}, Ll/ۨ᩵ۖ;-><init>(Ll/ܰ᩵ۖ;Ljava/util/LinkedHashMap;)V

    iput-object p1, p0, Ll/ܰ᩵ۖ;->ᩳ:Ll/ۨ᩵ۖ;

    const/4 p1, 0x0

    .line 109
    iput-object p1, p0, Ll/ܰ᩵ۖ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(Ll/ۨ᩵ۖ;)Ljava/util/ArrayList;
    .locals 2

    .line 135
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 136
    invoke-virtual {p1}, Ll/ۨ᩵ۖ;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ll/ۛ᩵ۖ;

    invoke-virtual {p1}, Ll/ۛ᩵ۖ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    check-cast p1, Ll/ۤ᩵ۖ;

    invoke-virtual {p1}, Ll/ۤ᩵ۖ;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Ll/ۤ᩵ۖ;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    .line 137
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 127
    iget-object p1, p0, Ll/ܰ᩵ۖ;->֫:Ll/ۗ᩵ۖ;

    check-cast p1, Ll/۬᩵ۖ;

    invoke-virtual {p1}, Ll/۬᩵ۖ;->֫()Ll/᩻֡ۖ;

    const/4 p1, 0x0

    throw p1
.end method

.method private ֫(Ljava/util/ArrayList;)Ll/ۨ᩵ۖ;
    .locals 3

    .line 143
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 144
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֡ۖ;

    .line 131
    iget-object v2, p0, Ll/ܰ᩵ۖ;->֫:Ll/ۗ᩵ۖ;

    check-cast v2, Ll/۬᩵ۖ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    check-cast v1, Ll/᩶᩵ۖ;

    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 147
    :cond_0
    new-instance p1, Ll/ۨ᩵ۖ;

    invoke-direct {p1, p0, v0}, Ll/ۨ᩵ۖ;-><init>(Ll/ܰ᩵ۖ;Ljava/util/LinkedHashMap;)V

    return-object p1
.end method

.method public static ֫(Ll/᩶᩵ۖ;)Ll/ܰ᩵ۖ;
    .locals 4

    .line 123
    new-instance v0, Ll/ܰ᩵ۖ;

    sget-object v1, Ll/᩺᩵ۖ;->ۙ:Ll/᩺᩵ۖ;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 113
    new-instance v3, Ll/۬᩵ۖ;

    invoke-direct {v3, p0}, Ll/۬᩵ۖ;-><init>(Ll/᩶᩵ۖ;)V

    invoke-direct {v0, v3, v1, v2}, Ll/ܰ᩵ۖ;-><init>(Ll/ۗ᩵ۖ;Ll/᩺᩵ۖ;Ljava/util/LinkedHashMap;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 187
    instance-of v0, p1, Ll/ܰ᩵ۖ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 190
    :cond_0
    check-cast p1, Ll/ܰ᩵ۖ;

    .line 191
    invoke-virtual {p0}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Ll/۟᩵ۖ;->֫(Ljava/util/Map;Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 196
    invoke-virtual {p0}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ll/۟᩵ۖ;->֫(Ljava/util/Map;)I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/util/List;
    .locals 3

    .line 207
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    sget-object v1, Ll/᩺᩵ۖ;->ۙ:Ll/᩺᩵ۖ;

    if-ne v0, v1, :cond_1

    move-object v0, p0

    .line 208
    monitor-enter v0

    .line 209
    :try_start_0
    iget-object v2, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    if-ne v2, v1, :cond_0

    .line 210
    iget-object v1, p0, Ll/ܰ᩵ۖ;->ᩳ:Ll/ۨ᩵ۖ;

    invoke-direct {p0, v1}, Ll/ܰ᩵ۖ;->֫(Ll/ۨ᩵ۖ;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ᩵ۖ;->ܽ:Ljava/util/ArrayList;

    .line 211
    sget-object v1, Ll/᩺᩵ۖ;->᩹:Ll/᩺᩵ۖ;

    iput-object v1, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    .line 213
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 215
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 247
    iget-boolean v0, p0, Ll/ܰ᩵ۖ;->ۧ:Z

    return v0
.end method

.method public final ۧ()Ll/᩶᩵ۖ;
    .locals 1

    .line 234
    iget-object v0, p0, Ll/ܰ᩵ۖ;->֫:Ll/ۗ᩵ۖ;

    check-cast v0, Ll/۬᩵ۖ;

    invoke-virtual {v0}, Ll/۬᩵ۖ;->ۧ()Ll/᩶᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/util/Map;
    .locals 3

    .line 152
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    sget-object v1, Ll/᩺᩵ۖ;->᩶:Ll/᩺᩵ۖ;

    if-ne v0, v1, :cond_1

    move-object v0, p0

    .line 153
    monitor-enter v0

    .line 154
    :try_start_0
    iget-object v2, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    if-ne v2, v1, :cond_0

    .line 155
    iget-object v1, p0, Ll/ܰ᩵ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-direct {p0, v1}, Ll/ܰ᩵ۖ;->֫(Ljava/util/ArrayList;)Ll/ۨ᩵ۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ᩵ۖ;->ᩳ:Ll/ۨ᩵ۖ;

    .line 156
    sget-object v1, Ll/᩺᩵ۖ;->᩹:Ll/᩺᩵ۖ;

    iput-object v1, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    .line 158
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 160
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ᩳ:Ll/ۨ᩵ۖ;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/util/List;
    .locals 3

    .line 221
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    sget-object v1, Ll/᩺᩵ۖ;->᩶:Ll/᩺᩵ۖ;

    if-eq v0, v1, :cond_1

    .line 222
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    sget-object v2, Ll/᩺᩵ۖ;->ۙ:Ll/᩺᩵ۖ;

    if-ne v0, v2, :cond_0

    .line 223
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ᩳ:Ll/ۨ᩵ۖ;

    invoke-direct {p0, v0}, Ll/ܰ᩵ۖ;->֫(Ll/ۨ᩵ۖ;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/ܰ᩵ۖ;->ܽ:Ljava/util/ArrayList;

    :cond_0
    const/4 v0, 0x0

    .line 225
    iput-object v0, p0, Ll/ܰ᩵ۖ;->ᩳ:Ll/ۨ᩵ۖ;

    .line 226
    iput-object v1, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    .line 228
    :cond_1
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ܽ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܿ()V
    .locals 1

    .line 247
    iget-boolean v0, p0, Ll/ܰ᩵ۖ;->ۧ:Z

    if-eqz v0, :cond_0

    return-void

    .line 256
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ᩳ()V
    .locals 4

    .line 201
    new-instance v0, Ll/ܰ᩵ۖ;

    sget-object v1, Ll/᩺᩵ۖ;->ۙ:Ll/᩺᩵ۖ;

    invoke-virtual {p0}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Ll/۟᩵ۖ;->ۧ(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    iget-object v3, p0, Ll/ܰ᩵ۖ;->֫:Ll/ۗ᩵ۖ;

    invoke-direct {v0, v3, v1, v2}, Ll/ܰ᩵ۖ;-><init>(Ll/ۗ᩵ۖ;Ll/᩺᩵ۖ;Ljava/util/LinkedHashMap;)V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x0

    .line 242
    iput-boolean v0, p0, Ll/ܰ᩵ۖ;->ۧ:Z

    return-void
.end method

.method public final ᩻()Ljava/util/Map;
    .locals 3

    .line 165
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    sget-object v1, Ll/᩺᩵ۖ;->ۙ:Ll/᩺᩵ۖ;

    if-eq v0, v1, :cond_1

    .line 166
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    sget-object v2, Ll/᩺᩵ۖ;->᩶:Ll/᩺᩵ۖ;

    if-ne v0, v2, :cond_0

    .line 167
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ll/ܰ᩵ۖ;->֫(Ljava/util/ArrayList;)Ll/ۨ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ܰ᩵ۖ;->ᩳ:Ll/ۨ᩵ۖ;

    :cond_0
    const/4 v0, 0x0

    .line 169
    iput-object v0, p0, Ll/ܰ᩵ۖ;->ܽ:Ljava/util/ArrayList;

    .line 170
    iput-object v1, p0, Ll/ܰ᩵ۖ;->ܿ:Ll/᩺᩵ۖ;

    .line 172
    :cond_1
    iget-object v0, p0, Ll/ܰ᩵ۖ;->ᩳ:Ll/ۨ᩵ۖ;

    return-object v0
.end method
