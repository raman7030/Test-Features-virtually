.class public final Ll/ۤܰ᩵;
.super Ljava/lang/Object;
.source "44FR"


# instance fields
.field public final ֫:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۫ܰ᩵;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iget-object p1, p1, Ll/۫ܰ᩵;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static varargs ֫([Ljava/lang/String;)Ll/ۤܰ᩵;
    .locals 3

    .line 208
    array-length v0, p0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_3

    .line 213
    invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 214
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 215
    aget-object v2, p0, v1

    if-eqz v2, :cond_0

    .line 216
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 215
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Headers cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 220
    :cond_1
    :goto_1
    array-length v1, p0

    if-ge v0, v1, :cond_2

    .line 221
    aget-object v1, p0, v0

    add-int/lit8 v2, v0, 0x1

    .line 222
    aget-object v2, p0, v2

    .line 223
    invoke-static {v1}, Ll/ۤܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 224
    invoke-static {v2, v1}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    .line 227
    :cond_2
    new-instance v0, Ll/ۤܰ᩵;

    invoke-direct {v0, p0}, Ll/ۤܰ᩵;-><init>([Ljava/lang/String;)V

    return-object v0

    .line 209
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected alternating header names and values"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    if-eqz p0, :cond_3

    .line 269
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 270
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x1f

    if-gt v3, v4, :cond_0

    const/16 v4, 0x9

    if-ne v3, v4, :cond_1

    :cond_0
    const/16 v4, 0x7f

    if-ge v3, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 272
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 273
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v1, 0x2

    aput-object p1, v4, v1

    const/4 p1, 0x3

    aput-object p0, v4, p1

    .line 272
    sget-object p0, Ll/᩶۟᩵;->֫:[B

    .line 472
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p1, "Unexpected char %#04x at %d in %s value: %s"

    invoke-static {p0, p1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 272
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void

    .line 268
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "value for name "

    const-string v1, " == null"

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 268
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܽ()Ll/ۤܰ᩵;
    .locals 5

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 237
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 239
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 240
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 243
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 244
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 245
    invoke-static {v4}, Ll/ۤܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 246
    invoke-static {v3, v4}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    aput-object v4, v1, v2

    add-int/lit8 v4, v2, 0x1

    .line 248
    aput-object v3, v1, v4

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 241
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Headers cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 252
    :cond_1
    new-instance v0, Ll/ۤܰ᩵;

    invoke-direct {v0, v1}, Ll/ۤܰ᩵;-><init>([Ljava/lang/String;)V

    return-object v0

    .line 234
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "headers == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 5

    if-eqz p0, :cond_3

    .line 257
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 258
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 259
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-le v3, v4, :cond_0

    const/16 v4, 0x7f

    if-ge v3, v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 261
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 262
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v1, 0x2

    aput-object p0, v4, v1

    .line 261
    sget-object p0, Ll/᩶۟᩵;->֫:[B

    .line 472
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Unexpected char %#04x at %d in header name: %s"

    invoke-static {p0, v1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 261
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void

    .line 257
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "name is empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 256
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "name == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 163
    instance-of v0, p1, Ll/ۤܰ᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۤܰ᩵;

    iget-object p1, p1, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    iget-object v0, p0, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    .line 164
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

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

    .line 168
    iget-object v0, p0, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    invoke-virtual {p0}, Ll/ۤܰ᩵;->ۧ()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 174
    invoke-virtual {p0, v2}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 176
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    .line 82
    iget-object v0, p0, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 194
    iget-object v0, p0, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    array-length v1, v0

    :cond_0
    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_1

    .line 195
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 196
    aget-object p1, v0, v1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ll/۫ܰ᩵;
    .locals 3

    .line 131
    new-instance v0, Ll/۫ܰ᩵;

    invoke-direct {v0}, Ll/۫ܰ᩵;-><init>()V

    .line 132
    iget-object v1, v0, Ll/۫ܰ᩵;->֫:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    .line 87
    iget-object v0, p0, Ll/ۤܰ᩵;->֫:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 102
    invoke-virtual {p0}, Ll/ۤܰ᩵;->ۧ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 103
    invoke-virtual {p0, v2}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v1, :cond_0

    .line 104
    new-instance v1, Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    :cond_0
    invoke-virtual {p0, v2}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 109
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 110
    :cond_3
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method
