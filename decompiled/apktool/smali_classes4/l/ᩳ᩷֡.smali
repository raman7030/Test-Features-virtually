.class public Ll/ᩳ᩷֡;
.super Ljava/lang/Object;
.source "L978"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public final ᩶:I

.field public ᩸:[Ljava/util/LinkedList;

.field public final ᩹:Ll/ۖ᩹ۢ;


# direct methods
.method public constructor <init>(Ll/ۖ᩹ۢ;)V
    .locals 4

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput v0, p0, Ll/ᩳ᩷֡;->ۙ:I

    .line 64
    iput-object p1, p0, Ll/ᩳ᩷֡;->᩹:Ll/ۖ᩹ۢ;

    const/16 p1, 0x10

    .line 65
    iput p1, p0, Ll/ᩳ᩷֡;->᩶:I

    int-to-double v0, p1

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    mul-double v0, v0, v2

    .line 67
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int p1, v0

    iput p1, p0, Ll/ᩳ᩷֡;->ۗ:I

    const/16 p1, 0x8

    new-array p1, p1, [Ljava/util/LinkedList;

    .line 68
    iput-object p1, p0, Ll/ᩳ᩷֡;->᩸:[Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 4

    .line 73
    iget v0, p0, Ll/ᩳ᩷֡;->᩶:I

    new-array v1, v0, [Ljava/util/LinkedList;

    .line 216
    iput-object v1, p0, Ll/ᩳ᩷֡;->᩸:[Ljava/util/LinkedList;

    const/4 v1, 0x0

    .line 217
    iput v1, p0, Ll/ᩳ᩷֡;->ۙ:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    mul-double v0, v0, v2

    .line 218
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Ll/ᩳ᩷֡;->ۗ:I

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 156
    invoke-virtual {p0, p1}, Ll/ᩳ᩷֡;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 161
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 151
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 181
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    if-nez p1, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Ll/ᩳ᩷֡;->᩹:Ll/ۖ᩹ۢ;

    invoke-virtual {v0, p1}, Ll/ۖ᩹ۢ;->֫(Ljava/lang/Object;)I

    move-result v1

    .line 79
    iget-object v2, p0, Ll/ᩳ᩷֡;->᩸:[Ljava/util/LinkedList;

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v1, v3

    .line 89
    aget-object v1, v2, v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 91
    :cond_1
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ᩷֡;

    .line 92
    iget-object v3, v2, Ll/ܽ᩷֡;->֫:Ljava/lang/Object;

    invoke-virtual {v0, v3, p1}, Ll/ۖ᩹ۢ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 93
    iget-object p1, v2, Ll/ܽ᩷֡;->ۧ:Ljava/lang/Object;

    return-object p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final hashCode()I
    .locals 7

    .line 167
    iget-object v0, p0, Ll/ᩳ᩷֡;->᩸:[Ljava/util/LinkedList;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_2

    .line 169
    :cond_0
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽ᩷֡;

    if-nez v5, :cond_1

    goto :goto_2

    .line 171
    :cond_1
    iget-object v6, p0, Ll/ᩳ᩷֡;->᩹:Ll/ۖ᩹ۢ;

    iget-object v5, v5, Ll/ܽ᩷֡;->֫:Ljava/lang/Object;

    invoke-virtual {v6, v5}, Ll/ۖ᩹ۢ;->֫(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v3, v5}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v3

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 206
    :cond_3
    iget v0, p0, Ll/ᩳ᩷֡;->ۙ:I

    .line 175
    invoke-static {v3, v0}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 211
    iget v0, p0, Ll/ᩳ᩷֡;->ۙ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 134
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 102
    :cond_0
    iget v1, p0, Ll/ᩳ᩷֡;->ۙ:I

    iget v2, p0, Ll/ᩳ᩷֡;->ۗ:I

    if-le v1, v2, :cond_5

    .line 185
    iget-object v2, p0, Ll/ᩳ᩷֡;->᩸:[Ljava/util/LinkedList;

    .line 187
    array-length v3, v2

    mul-int/lit8 v3, v3, 0x2

    .line 73
    new-array v4, v3, [Ljava/util/LinkedList;

    .line 189
    iput-object v4, p0, Ll/ᩳ᩷֡;->᩸:[Ljava/util/LinkedList;

    int-to-double v3, v3

    const-wide/high16 v5, 0x3fe8000000000000L    # 0.75

    mul-double v3, v3, v5

    double-to-int v3, v3

    .line 190
    iput v3, p0, Ll/ᩳ᩷֡;->ۗ:I

    .line 194
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    aget-object v5, v2, v4

    if-nez v5, :cond_1

    goto :goto_2

    .line 196
    :cond_1
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽ᩷֡;

    if-nez v6, :cond_2

    goto :goto_2

    .line 198
    :cond_2
    iget-object v7, v6, Ll/ܽ᩷֡;->֫:Ljava/lang/Object;

    iget-object v6, v6, Ll/ܽ᩷֡;->ۧ:Ljava/lang/Object;

    invoke-virtual {p0, v7, v6}, Ll/ᩳ᩷֡;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 201
    :cond_4
    iput v1, p0, Ll/ᩳ᩷֡;->ۙ:I

    .line 78
    :cond_5
    iget-object v1, p0, Ll/ᩳ᩷֡;->᩹:Ll/ۖ᩹ۢ;

    invoke-virtual {v1, p1}, Ll/ۖ᩹ۢ;->֫(Ljava/lang/Object;)I

    move-result v2

    .line 79
    iget-object v3, p0, Ll/ᩳ᩷֡;->᩸:[Ljava/util/LinkedList;

    array-length v4, v3

    add-int/lit8 v4, v4, -0x1

    and-int/2addr v2, v4

    .line 104
    aget-object v4, v3, v2

    if-nez v4, :cond_6

    .line 106
    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    aput-object v4, v3, v2

    .line 108
    :cond_6
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽ᩷֡;

    .line 109
    iget-object v5, v3, Ll/ܽ᩷֡;->֫:Ljava/lang/Object;

    invoke-virtual {v1, v5, p1}, Ll/ۖ᩹ۢ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 110
    iget-object p1, v3, Ll/ܽ᩷֡;->ۧ:Ljava/lang/Object;

    .line 111
    iput-object p2, v3, Ll/ܽ᩷֡;->ۧ:Ljava/lang/Object;

    .line 112
    iget p2, p0, Ll/ᩳ᩷֡;->ۙ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/ᩳ᩷֡;->ۙ:I

    return-object p1

    .line 117
    :cond_8
    new-instance v1, Ll/ܽ᩷֡;

    invoke-direct {v1, p1, p2}, Ll/ܽ᩷֡;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 118
    iget p1, p0, Ll/ᩳ᩷֡;->ۙ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ᩳ᩷֡;->ۙ:I

    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 0

    .line 129
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 124
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 206
    iget v0, p0, Ll/ᩳ᩷֡;->ۙ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 206
    iget v0, p0, Ll/ᩳ᩷֡;->ۙ:I

    if-nez v0, :cond_0

    const-string v0, "{}"

    return-object v0

    .line 225
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    iget-object v1, p0, Ll/ᩳ᩷֡;->᩸:[Ljava/util/LinkedList;

    array-length v2, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_5

    aget-object v5, v1, v4

    if-nez v5, :cond_1

    goto :goto_3

    .line 230
    :cond_1
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽ᩷֡;

    if-nez v6, :cond_2

    goto :goto_3

    :cond_2
    if-eqz v3, :cond_3

    const/4 v3, 0x0

    goto :goto_2

    :cond_3
    const-string v7, ", "

    .line 233
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    :goto_2
    invoke-virtual {v6}, Ll/ܽ᩷֡;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    const/16 v1, 0x7d

    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 238
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 6

    .line 139
    new-instance v0, Ljava/util/ArrayList;

    .line 206
    iget v1, p0, Ll/ᩳ᩷֡;->ۙ:I

    .line 139
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    iget-object v1, p0, Ll/ᩳ᩷֡;->᩸:[Ljava/util/LinkedList;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    if-nez v4, :cond_0

    goto :goto_2

    .line 142
    :cond_0
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽ᩷֡;

    .line 143
    iget-object v5, v5, Ll/ܽ᩷֡;->ۧ:Ljava/lang/Object;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method
