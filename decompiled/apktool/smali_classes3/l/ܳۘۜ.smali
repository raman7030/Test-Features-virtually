.class public final Ll/ܳۘۜ;
.super Ljava/lang/Object;
.source "46YI"


# static fields
.field public static final ֫:[Ll/ᩳۘۜ;

.field public static final ۧ:Ljava/util/List;

.field public static final ܽ:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    .line 23
    new-instance v0, Ll/ᩳۘۜ;

    sget v1, Ll/ܳ᩷ܽ;->ۘ:I

    const/4 v2, 0x4

    new-array v3, v2, [B

    fill-array-data v3, :array_0

    const-string v4, "utf-32be-bom"

    invoke-direct {v0, v4, v1, v3}, Ll/ᩳۘۜ;-><init>(Ljava/lang/String;I[B)V

    new-instance v1, Ll/ᩳۘۜ;

    sget v3, Ll/ܳ᩷ܽ;->ᩴ:I

    new-array v5, v2, [B

    fill-array-data v5, :array_1

    const-string v6, "utf-32le-bom"

    invoke-direct {v1, v6, v3, v5}, Ll/ᩳۘۜ;-><init>(Ljava/lang/String;I[B)V

    new-instance v3, Ll/ᩳۘۜ;

    sget v5, Ll/ܳ᩷ܽ;->᩵:I

    const/4 v7, 0x3

    new-array v8, v7, [B

    fill-array-data v8, :array_2

    const-string v9, "utf-8-bom"

    invoke-direct {v3, v9, v5, v8}, Ll/ᩳۘۜ;-><init>(Ljava/lang/String;I[B)V

    new-instance v5, Ll/ᩳۘۜ;

    sget v8, Ll/ܳ᩷ܽ;->ܺ:I

    const/4 v10, 0x2

    new-array v11, v10, [B

    fill-array-data v11, :array_3

    const-string v12, "utf-16be-bom"

    invoke-direct {v5, v12, v8, v11}, Ll/ᩳۘۜ;-><init>(Ljava/lang/String;I[B)V

    new-instance v8, Ll/ᩳۘۜ;

    sget v11, Ll/ܳ᩷ܽ;->ۖ:I

    new-array v13, v10, [B

    fill-array-data v13, :array_4

    const-string v14, "utf-16le-bom"

    invoke-direct {v8, v14, v11, v13}, Ll/ᩳۘۜ;-><init>(Ljava/lang/String;I[B)V

    const/4 v11, 0x5

    new-array v11, v11, [Ll/ᩳۘۜ;

    const/4 v13, 0x0

    aput-object v0, v11, v13

    const/4 v0, 0x1

    aput-object v1, v11, v0

    aput-object v3, v11, v10

    aput-object v5, v11, v7

    aput-object v8, v11, v2

    sput-object v11, Ll/ܳۘۜ;->֫:[Ll/ᩳۘۜ;

    .line 37
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 38
    :goto_0
    sget v1, Ll/ܳ᩷ܽ;->ۡ:I

    if-ge v13, v1, :cond_6

    .line 39
    sget v1, Ll/ܳ᩷ܽ;->֡:I

    if-ne v13, v1, :cond_0

    sget v2, Ll/ܳ᩷ܽ;->᩵:I

    goto :goto_1

    :cond_0
    move v2, v13

    .line 40
    :goto_1
    invoke-static {v2}, Ll/ܳۘۜ;->֫(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v3, v2}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-ne v13, v1, :cond_1

    .line 42
    sget v1, Ll/ܳ᩷ܽ;->᩵:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 43
    :cond_1
    sget v1, Ll/ܳ᩷ܽ;->ܺ:I

    if-ne v13, v1, :cond_2

    .line 44
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 45
    :cond_2
    sget v1, Ll/ܳ᩷ܽ;->ۖ:I

    if-ne v13, v1, :cond_3

    .line 46
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v14, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 47
    :cond_3
    sget v1, Ll/ܳ᩷ܽ;->ۘ:I

    if-ne v13, v1, :cond_4

    .line 48
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 49
    :cond_4
    sget v1, Ll/ܳ᩷ܽ;->ᩴ:I

    if-ne v13, v1, :cond_5

    .line 50
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 53
    :cond_6
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Ll/ܳۘۜ;->ܽ:Ljava/util/Map;

    .line 54
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ܳۘۜ;->ۧ:Ljava/util/List;

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        -0x2t
        -0x1t
    .end array-data

    :array_1
    .array-data 1
        -0x1t
        -0x2t
        0x0t
        0x0t
    .end array-data

    :array_2
    .array-data 1
        -0x11t
        -0x45t
        -0x41t
    .end array-data

    :array_3
    .array-data 1
        -0x2t
        -0x1t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x1t
        -0x2t
    .end array-data
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 2

    .line 160
    sget v0, Ll/ܳ᩷ܽ;->֡:I

    if-ne p0, v0, :cond_0

    .line 161
    sget p0, Ll/ܳ᩷ܽ;->᩵:I

    .line 163
    :cond_0
    invoke-static {p0}, Ll/ܳ᩷ܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x5f

    const/16 v1, 0x2d

    .line 165
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;[B)Ll/ܿۘۜ;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_b

    .line 69
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 110
    invoke-static {p1}, Ll/ܳۘۜ;->ۧ([B)Ll/ᩳۘۜ;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 112
    new-instance p1, Ll/ܿۘۜ;

    iget v0, p0, Ll/ᩳۘۜ;->ۧ:I

    invoke-static {v0}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳۘۜ;->ܽ:Ljava/lang/String;

    iget-object p0, p0, Ll/ᩳۘۜ;->֫:[B

    array-length v2, p0

    invoke-direct {p1, v0, v1, v2, p0}, Ll/ܿۘۜ;-><init>(Ljava/nio/charset/Charset;Ljava/lang/String;I[B)V

    return-object p1

    .line 115
    :cond_0
    sget p0, Ll/ܳ᩷ܽ;->᩵:I

    .line 116
    array-length v1, p1

    if-lez v1, :cond_2

    .line 117
    array-length v1, p1

    invoke-static {v1, p1}, Ll/ܽۘᩳ;->֫(I[B)Ljava/lang/String;

    move-result-object v1

    const/4 v3, -0x1

    if-nez v1, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    .line 119
    :cond_1
    invoke-static {v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;)I

    move-result v1

    :goto_0
    if-ne v1, v3, :cond_3

    .line 121
    array-length v1, p1

    invoke-static {v1, p1}, Ll/ܳ᩷ܽ;->ۧ(I[B)I

    move-result v1

    goto :goto_1

    :cond_2
    move v1, p0

    .line 123
    :cond_3
    :goto_1
    sget p1, Ll/ܳ᩷ܽ;->֡:I

    if-ne v1, p1, :cond_4

    goto :goto_2

    :cond_4
    move p0, v1

    .line 127
    :goto_2
    new-instance p1, Ll/ܿۘۜ;

    invoke-static {p0}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {p0}, Ll/ܳۘۜ;->֫(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, v1, p0, v2, v0}, Ll/ܿۘۜ;-><init>(Ljava/nio/charset/Charset;Ljava/lang/String;I[B)V

    return-object p1

    .line 72
    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 75
    sget-object v1, Ll/ܳۘۜ;->ܽ:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_9

    .line 79
    invoke-static {p1}, Ll/ܳۘۜ;->ۧ([B)Ll/ᩳۘۜ;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 80
    iget p1, p0, Ll/ᩳۘۜ;->ۧ:I

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne p1, v3, :cond_6

    .line 81
    iget-object p1, p0, Ll/ᩳۘۜ;->֫:[B

    array-length v2, p1

    :cond_6
    if-nez v2, :cond_7

    .line 83
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ll/ܳۘۜ;->֫(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_7
    iget-object p1, p0, Ll/ᩳۘۜ;->ܽ:Ljava/lang/String;

    .line 84
    :goto_3
    new-instance v3, Ll/ܿۘۜ;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v1

    if-nez v2, :cond_8

    goto :goto_4

    .line 85
    :cond_8
    iget-object v0, p0, Ll/ᩳۘۜ;->֫:[B

    :goto_4
    invoke-direct {v3, v1, p1, v2, v0}, Ll/ܿۘۜ;-><init>(Ljava/nio/charset/Charset;Ljava/lang/String;I[B)V

    return-object v3

    .line 77
    :cond_9
    invoke-static {p0}, Ll/ܳۘۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 73
    :cond_a
    invoke-static {p0}, Ll/ܳۘۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 67
    :cond_b
    invoke-static {v0}, Ll/ܳۘۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ᩳۘۜ;
    .locals 5

    .line 151
    sget-object v0, Ll/ܳۘۜ;->֫:[Ll/ᩳۘۜ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 152
    iget-object v4, v3, Ll/ᩳۘۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ֫([B)Ll/ᩳۘۜ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܳۘۜ;->ۧ([B)Ll/ᩳۘۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    .line 169
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 170
    sget-object v1, Ll/ܳۘۜ;->ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 171
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    .line 174
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 175
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "utf-8"

    const-string v3, "encoding"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Unsupported text encoding token"

    .line 173
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ([B)Ll/ᩳۘۜ;
    .locals 2

    .line 46
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ۧ᩷ܽ;->ܽ(I[B)Z

    move-result v0

    .line 132
    sget-object v1, Ll/ܳۘۜ;->֫:[Ll/ᩳۘۜ;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    .line 133
    aget-object p0, v1, p0

    return-object p0

    .line 61
    :cond_0
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ۧ᩷ܽ;->ᩳ(I[B)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    .line 136
    aget-object p0, v1, p0

    return-object p0

    .line 6
    :cond_1
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ۧ᩷ܽ;->ܿ(I[B)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x2

    .line 139
    aget-object p0, v1, p0

    return-object p0

    .line 20
    :cond_2
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ۧ᩷ܽ;->֫(I[B)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x3

    .line 142
    aget-object p0, v1, p0

    return-object p0

    .line 33
    :cond_3
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ۧ᩷ܽ;->ۧ(I[B)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x4

    .line 145
    aget-object p0, v1, p0

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ll/ܿۘۜ;
    .locals 8

    if-eqz p0, :cond_5

    .line 92
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 95
    sget-object v0, Ll/ܳۘۜ;->ܽ:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 151
    sget-object v1, Ll/ܳۘۜ;->֫:[Ll/ᩳۘۜ;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v2, :cond_1

    aget-object v6, v1, v4

    .line 152
    iget-object v7, v6, Ll/ᩳۘۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v7, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v5

    .line 100
    :goto_1
    new-instance v1, Ll/ܿۘۜ;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v0

    if-nez v6, :cond_2

    goto :goto_2

    .line 101
    :cond_2
    iget-object v2, v6, Ll/ᩳۘۜ;->֫:[B

    array-length v3, v2

    :goto_2
    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    iget-object v5, v6, Ll/ᩳۘۜ;->֫:[B

    :goto_3
    invoke-direct {v1, v0, p0, v3, v5}, Ll/ܿۘۜ;-><init>(Ljava/nio/charset/Charset;Ljava/lang/String;I[B)V

    return-object v1

    .line 97
    :cond_4
    invoke-static {p0}, Ll/ܳۘۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 93
    :cond_5
    invoke-static {p0}, Ll/ܳۘۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method
