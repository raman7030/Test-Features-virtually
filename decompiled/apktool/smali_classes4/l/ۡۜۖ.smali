.class public abstract Ll/ۡۜۖ;
.super Ll/ۘۜۖ;
.source "N9Q4"

# interfaces
.implements Ll/᩻֡ۖ;


# instance fields
.field public memoizedSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ll/ۘۜۖ;-><init>()V

    const/4 v0, -0x1

    .line 95
    iput v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    return-void
.end method

.method public static ֫(ILjava/util/Map;)I
    .locals 4

    .line 260
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 261
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖۖ;

    .line 262
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    mul-int/lit8 p0, p0, 0x25

    .line 263
    invoke-virtual {v1}, Ll/֡ۖۖ;->getNumber()I

    move-result v2

    add-int/2addr v2, p0

    .line 264
    invoke-virtual {v1}, Ll/֡ۖۖ;->۬()Z

    move-result p0

    if-eqz p0, :cond_0

    mul-int/lit8 v2, v2, 0x35

    .line 265
    invoke-static {v0}, Ll/ۡۜۖ;->֫(Ljava/lang/Object;)I

    move-result p0

    add-int/2addr v2, p0

    :goto_1
    move p0, v2

    goto :goto_0

    .line 266
    :cond_0
    invoke-virtual {v1}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object p0

    sget-object v3, Ll/᩵ۖۖ;->۬:Ll/᩵ۖۖ;

    if-eq p0, v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    goto :goto_3

    .line 268
    :cond_1
    invoke-virtual {v1}, Ll/֡ۖۖ;->۟֫()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 269
    check-cast v0, Ljava/util/List;

    mul-int/lit8 v2, v2, 0x35

    .line 231
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x1

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗᩴۖ;

    mul-int/lit8 v0, v0, 0x1f

    .line 225
    invoke-interface {v1}, Ll/ۗᩴۖ;->getNumber()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_2

    :cond_2
    add-int/2addr v2, v0

    goto :goto_1

    :cond_3
    mul-int/lit8 v2, v2, 0x35

    .line 272
    check-cast v0, Ll/ۗᩴۖ;

    .line 225
    invoke-interface {v0}, Ll/ۗᩴۖ;->getNumber()I

    move-result p0

    :goto_3
    add-int/2addr p0, v2

    goto :goto_0

    :cond_4
    return p0
.end method

.method public static ֫(Ljava/lang/Object;)I
    .locals 0

    .line 254
    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Ll/ۡۜۖ;->֫(Ljava/util/List;)Ljava/util/Map;

    move-result-object p0

    invoke-static {p0}, Ll/۟᩵ۖ;->֫(Ljava/util/Map;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/util/List;)Ljava/util/Map;
    .locals 6

    .line 169
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p0

    .line 172
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 173
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 174
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֡ۖ;

    .line 175
    invoke-interface {v1}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v2

    const-string v3, "key"

    .line 176
    invoke-virtual {v2, v3}, Ll/ᩳۖۖ;->֫(Ljava/lang/String;)Ll/֡ۖۖ;

    move-result-object v3

    const-string v4, "value"

    .line 177
    invoke-virtual {v2, v4}, Ll/ᩳۖۖ;->֫(Ljava/lang/String;)Ll/֡ۖۖ;

    move-result-object v2

    .line 178
    invoke-interface {v1, v2}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v4

    .line 179
    instance-of v5, v4, Ll/ۖۖۖ;

    if-eqz v5, :cond_1

    .line 180
    check-cast v4, Ll/ۖۖۖ;

    invoke-virtual {v4}, Ll/ۖۖۖ;->getNumber()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 182
    :cond_1
    invoke-interface {v1, v3}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 184
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֡ۖ;

    .line 185
    invoke-interface {v1, v2}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v4

    .line 186
    instance-of v5, v4, Ll/ۖۖۖ;

    if-eqz v5, :cond_2

    .line 187
    check-cast v4, Ll/ۖۖۖ;

    invoke-virtual {v4}, Ll/ۖۖۖ;->getNumber()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 189
    :cond_2
    invoke-interface {v1, v3}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 160
    instance-of v0, p0, [B

    if-eqz v0, :cond_0

    instance-of v0, p1, [B

    if-eqz v0, :cond_0

    .line 161
    check-cast p0, [B

    check-cast p1, [B

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0

    .line 163
    :cond_0
    invoke-static {p0}, Ll/ۡۜۖ;->ۧ(Ljava/lang/Object;)Ll/ۛۜۖ;

    move-result-object p0

    invoke-static {p1}, Ll/ۡۜۖ;->ۧ(Ljava/lang/Object;)Ll/ۛۜۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 7

    .line 210
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 213
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖۖ;

    .line 214
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    .line 217
    :cond_2
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 218
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 219
    invoke-virtual {v1}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v5

    sget-object v6, Ll/᩵ۖۖ;->ۙ:Ll/᩵ۖۖ;

    if-ne v5, v6, :cond_6

    .line 220
    invoke-virtual {v1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 221
    check-cast v3, Ljava/util/List;

    .line 222
    check-cast v4, Ljava/util/List;

    .line 223
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-eq v1, v5, :cond_3

    return v2

    :cond_3
    const/4 v1, 0x0

    .line 226
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v1, v5, :cond_1

    .line 227
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Ll/ۡۜۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    return v2

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 233
    :cond_5
    invoke-static {v3, v4}, Ll/ۡۜۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    .line 237
    :cond_6
    invoke-virtual {v1}, Ll/֡ۖۖ;->۬()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 238
    invoke-static {v3, v4}, Ll/ۡۜۖ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    .line 243
    :cond_7
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_8
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Ljava/lang/Object;)Ll/ۛۜۖ;
    .locals 2

    .line 148
    instance-of v0, p0, [B

    if-eqz v0, :cond_0

    .line 149
    check-cast p0, [B

    const/4 v0, 0x0

    .line 412
    array-length v1, p0

    invoke-static {v0, v1, p0}, Ll/ۛۜۖ;->֫(II[B)Ll/ۛۜۖ;

    move-result-object p0

    return-object p0

    .line 151
    :cond_0
    check-cast p0, Ll/ۛۜۖ;

    return-object p0
.end method

.method public static ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 197
    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Ll/ۡۜۖ;->֫(Ljava/util/List;)Ljava/util/Map;

    move-result-object p0

    .line 198
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ll/ۡۜۖ;->֫(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    .line 199
    invoke-static {p0, p1}, Ll/۟᩵ۖ;->֫(Ljava/util/Map;Ljava/util/Map;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 123
    :cond_0
    instance-of v1, p1, Ll/᩻֡ۖ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 126
    :cond_1
    check-cast p1, Ll/᩻֡ۖ;

    .line 127
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v1

    invoke-interface {p1}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 130
    :cond_2
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v1

    invoke-interface {p1}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ۡۜۖ;->֫(Ljava/util/Map;Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 131
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-interface {p1}, Ll/ۘ֡ۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public findInitializationErrors()Ljava/util/List;
    .locals 1

    .line 65
    invoke-static {p0}, Ll/۠֡ۖ;->֫(Ll/ۘ֡ۖ;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 19
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDefaultInstanceForType()Ll/᩻֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public getInitializationErrorString()Ljava/lang/String;
    .locals 1

    .line 70
    invoke-virtual {p0}, Ll/ۡۜۖ;->findInitializationErrors()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/۠֡ۖ;->֫(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMemoizedSerializedSize()I
    .locals 1

    .line 99
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v0
.end method

.method public getOneofFieldDescriptor(Ll/ܶۖۖ;)Ll/֡ۖۖ;
    .locals 1

    .line 82
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getOneofFieldDescriptor() is not implemented."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getSerializedSize()I
    .locals 2

    .line 109
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 114
    :cond_0
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0}, Ll/۠֡ۖ;->֫(Ll/ۡۜۖ;Ljava/util/Map;)I

    move-result v0

    iput v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v0
.end method

.method public hasOneof(Ll/ܶۖۖ;)Z
    .locals 1

    .line 76
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "hasOneof() is not implemented."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public hashCode()I
    .locals 2

    .line 136
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-nez v0, :cond_0

    .line 139
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 140
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۡۜۖ;->֫(ILjava/util/Map;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1d

    .line 141
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 142
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1

    :cond_0
    return v0
.end method

.method public isInitialized()Z
    .locals 5

    .line 104
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖۖ;

    .line 105
    invoke-virtual {v1}, Ll/֡ۖۖ;->ۛ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 106
    invoke-interface {p0, v1}, Ll/ۘ֡ۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 114
    :cond_1
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 115
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۖۖ;

    .line 116
    invoke-virtual {v2}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v3

    sget-object v4, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v3, v4, :cond_2

    .line 117
    invoke-virtual {v2}, Ll/֡ۖۖ;->۟֫()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 118
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻֡ۖ;

    .line 119
    invoke-interface {v2}, Ll/ܺ֡ۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    .line 124
    :cond_4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֡ۖ;

    invoke-interface {v1}, Ll/ܺ֡ۖ;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_2

    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 24
    invoke-interface {p0}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 60
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Nested builder is not supported for this type."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public newUninitializedMessageException()Ll/ᩳ֨ۖ;
    .locals 1

    .line 284
    invoke-static {p0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    return-object v0
.end method

.method public setMemoizedSerializedSize(I)V
    .locals 0

    .line 104
    iput p1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return-void
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 24
    invoke-interface {p0}, Ll/᩻֡ۖ;->toBuilder()Ll/ܳ֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 87
    sget v0, Ll/ۨۚۖ;->֫:I

    .line 103
    invoke-static {}, Ll/ۤۚۖ;->֫()Ll/ۤۚۖ;

    move-result-object v0

    .line 87
    invoke-virtual {v0, p0}, Ll/ۤۚۖ;->֫(Ll/ۘ֡ۖ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 1

    .line 92
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0, p1}, Ll/۠֡ۖ;->֫(Ll/ۡۜۖ;Ljava/util/Map;Ll/ܳ᩷ۖ;)V

    return-void
.end method
