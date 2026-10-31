.class public final Ll/ᩴ۠ۖ;
.super Ljava/lang/Object;
.source "428G"


# instance fields
.field public final ֫:[I

.field public final ۧ:Ll/ۘ۠ۖ;


# direct methods
.method public constructor <init>(Ll/ۘ۠ۖ;[I)V
    .locals 3

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    array-length v0, p2

    if-eqz v0, :cond_3

    .line 46
    iput-object p1, p0, Ll/ᩴ۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    .line 47
    array-length p1, p2

    const/4 v0, 0x1

    if-le p1, v0, :cond_2

    const/4 v1, 0x0

    .line 48
    aget v2, p2, v1

    if-nez v2, :cond_2

    :goto_0
    if-ge v0, p1, :cond_0

    .line 51
    aget v2, p2, v0

    if-nez v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_1

    .line 55
    filled-new-array {v1}, [I

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ۠ۖ;->֫:[I

    return-void

    :cond_1
    sub-int/2addr p1, v0

    .line 57
    new-array v2, p1, [I

    iput-object v2, p0, Ll/ᩴ۠ۖ;->֫:[I

    .line 58
    invoke-static {p2, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 65
    :cond_2
    iput-object p2, p0, Ll/ᩴ۠ۖ;->֫:[I

    return-void

    .line 44
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 228
    invoke-virtual {p0}, Ll/ᩴ۠ۖ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "0"

    return-object v0

    .line 231
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩴ۠ۖ;->ۧ()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 232
    invoke-virtual {p0}, Ll/ᩴ۠ۖ;->ۧ()I

    move-result v1

    :goto_0
    if-ltz v1, :cond_a

    .line 91
    iget-object v2, p0, Ll/ᩴ۠ۖ;->֫:[I

    array-length v3, v2

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    sub-int/2addr v3, v1

    aget v2, v2, v3

    if-eqz v2, :cond_9

    if-gez v2, :cond_2

    .line 236
    invoke-virtual {p0}, Ll/ᩴ۠ۖ;->ۧ()I

    move-result v3

    if-ne v1, v3, :cond_1

    const-string v3, "-"

    .line 237
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v3, " - "

    .line 239
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    neg-int v2, v2

    goto :goto_2

    .line 243
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_3

    const-string v3, " + "

    .line 244
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    if-eq v2, v4, :cond_7

    .line 248
    :cond_4
    iget-object v3, p0, Ll/ᩴ۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    invoke-virtual {v3, v2}, Ll/ۘ۠ۖ;->ܽ(I)I

    move-result v2

    if-nez v2, :cond_5

    const/16 v2, 0x31

    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    if-ne v2, v4, :cond_6

    const/16 v2, 0x61

    .line 252
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    const-string v3, "a^"

    .line 254
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_7
    :goto_3
    if-eqz v1, :cond_9

    if-ne v1, v4, :cond_8

    const/16 v2, 0x78

    .line 260
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_8
    const-string v2, "x^"

    .line 262
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_9
    :goto_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 268
    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(II)Ll/ᩴ۠ۖ;
    .locals 5

    if-ltz p1, :cond_2

    .line 189
    iget-object v0, p0, Ll/ᩴ۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    if-nez p2, :cond_0

    .line 190
    invoke-virtual {v0}, Ll/ۘ۠ۖ;->ۧ()Ll/ᩴ۠ۖ;

    move-result-object p1

    return-object p1

    .line 192
    :cond_0
    iget-object v1, p0, Ll/ᩴ۠ۖ;->֫:[I

    array-length v2, v1

    add-int/2addr p1, v2

    .line 193
    new-array p1, p1, [I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 195
    aget v4, v1, v3

    invoke-virtual {v0, v4, p2}, Ll/ۘ۠ۖ;->ۧ(II)I

    move-result v4

    aput v4, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 197
    :cond_1
    new-instance p2, Ll/ᩴ۠ۖ;

    invoke-direct {p2, v0, p1}, Ll/ᩴ۠ۖ;-><init>(Ll/ۘ۠ۖ;[I)V

    return-object p2

    .line 187
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ᩴ۠ۖ;)Ll/ᩴ۠ۖ;
    .locals 8

    .line 119
    iget-object v0, p1, Ll/ᩴ۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    iget-object v1, p0, Ll/ᩴ۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 122
    invoke-virtual {p0}, Ll/ᩴ۠ۖ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 125
    :cond_0
    invoke-virtual {p1}, Ll/ᩴ۠ۖ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 130
    :cond_1
    iget-object p1, p1, Ll/ᩴ۠ۖ;->֫:[I

    .line 131
    iget-object v0, p0, Ll/ᩴ۠ۖ;->֫:[I

    array-length v2, v0

    array-length v3, p1

    if-le v2, v3, :cond_2

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    .line 136
    :cond_2
    array-length v2, p1

    new-array v2, v2, [I

    .line 137
    array-length v3, p1

    array-length v4, v0

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    .line 139
    invoke-static {p1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v4, v3

    .line 141
    :goto_0
    array-length v5, p1

    if-ge v4, v5, :cond_3

    sub-int v5, v4, v3

    .line 142
    aget v5, v0, v5

    aget v6, p1, v4

    xor-int/2addr v5, v6

    aput v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 145
    :cond_3
    new-instance p1, Ll/ᩴ۠ۖ;

    invoke-direct {p1, v1, v2}, Ll/ᩴ۠ۖ;-><init>(Ll/ۘ۠ۖ;[I)V

    return-object p1

    .line 120
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "GenericGFPolys do not have same GenericGF field"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()[I
    .locals 1

    .line 70
    iget-object v0, p0, Ll/ᩴ۠ۖ;->֫:[I

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ᩴ۠ۖ;->֫:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final ۧ(Ll/ᩴ۠ۖ;)[Ll/ᩴ۠ۖ;
    .locals 9

    .line 201
    iget-object v0, p1, Ll/ᩴ۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    iget-object v1, p0, Ll/ᩴ۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 204
    invoke-virtual {p1}, Ll/ᩴ۠ۖ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 208
    invoke-virtual {v1}, Ll/ۘ۠ۖ;->ۧ()Ll/ᩴ۠ۖ;

    move-result-object v0

    .line 211
    invoke-virtual {p1}, Ll/ᩴ۠ۖ;->ۧ()I

    move-result v2

    .line 91
    iget-object v3, p1, Ll/ᩴ۠ۖ;->֫:[I

    array-length v4, v3

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    sub-int/2addr v4, v2

    aget v2, v3, v4

    .line 212
    invoke-virtual {v1, v2}, Ll/ۘ۠ۖ;->ۧ(I)I

    move-result v2

    move-object v3, p0

    .line 214
    :goto_0
    invoke-virtual {v3}, Ll/ᩴ۠ۖ;->ۧ()I

    move-result v4

    invoke-virtual {p1}, Ll/ᩴ۠ۖ;->ۧ()I

    move-result v6

    if-lt v4, v6, :cond_0

    invoke-virtual {v3}, Ll/ᩴ۠ۖ;->ܽ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 215
    invoke-virtual {v3}, Ll/ᩴ۠ۖ;->ۧ()I

    move-result v4

    invoke-virtual {p1}, Ll/ᩴ۠ۖ;->ۧ()I

    move-result v6

    sub-int/2addr v4, v6

    .line 216
    invoke-virtual {v3}, Ll/ᩴ۠ۖ;->ۧ()I

    move-result v6

    .line 91
    iget-object v7, v3, Ll/ᩴ۠ۖ;->֫:[I

    array-length v8, v7

    sub-int/2addr v8, v5

    sub-int/2addr v8, v6

    aget v6, v7, v8

    .line 216
    invoke-virtual {v1, v6, v2}, Ll/ۘ۠ۖ;->ۧ(II)I

    move-result v6

    .line 217
    invoke-virtual {p1, v4, v6}, Ll/ᩴ۠ۖ;->֫(II)Ll/ᩴ۠ۖ;

    move-result-object v7

    .line 218
    invoke-virtual {v1, v4, v6}, Ll/ۘ۠ۖ;->֫(II)Ll/ᩴ۠ۖ;

    move-result-object v4

    .line 219
    invoke-virtual {v0, v4}, Ll/ᩴ۠ۖ;->֫(Ll/ᩴ۠ۖ;)Ll/ᩴ۠ۖ;

    move-result-object v0

    .line 220
    invoke-virtual {v3, v7}, Ll/ᩴ۠ۖ;->֫(Ll/ᩴ۠ۖ;)Ll/ᩴ۠ۖ;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    new-array p1, p1, [Ll/ᩴ۠ۖ;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    aput-object v3, p1, v5

    return-object p1

    .line 205
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Divide by 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 202
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "GenericGFPolys do not have same GenericGF field"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(Ll/ᩴ۠ۖ;)Ll/ᩴ۠ۖ;
    .locals 11

    .line 149
    iget-object v0, p1, Ll/ᩴ۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    iget-object v1, p0, Ll/ᩴ۠ۖ;->ۧ:Ll/ۘ۠ۖ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 152
    invoke-virtual {p0}, Ll/ᩴ۠ۖ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Ll/ᩴ۠ۖ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 156
    :cond_0
    iget-object v0, p0, Ll/ᩴ۠ۖ;->֫:[I

    array-length v2, v0

    .line 157
    iget-object p1, p1, Ll/ᩴ۠ۖ;->֫:[I

    .line 158
    array-length v3, p1

    add-int v4, v2, v3

    add-int/lit8 v4, v4, -0x1

    .line 159
    new-array v4, v4, [I

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_2

    .line 161
    aget v6, v0, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v3, :cond_1

    add-int v8, v5, v7

    .line 163
    aget v9, v4, v8

    aget v10, p1, v7

    .line 164
    invoke-virtual {v1, v6, v10}, Ll/ۘ۠ۖ;->ۧ(II)I

    move-result v10

    xor-int/2addr v9, v10

    .line 163
    aput v9, v4, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 167
    :cond_2
    new-instance p1, Ll/ᩴ۠ۖ;

    invoke-direct {p1, v1, v4}, Ll/ᩴ۠ۖ;-><init>(Ll/ۘ۠ۖ;[I)V

    return-object p1

    .line 153
    :cond_3
    :goto_2
    invoke-virtual {v1}, Ll/ۘ۠ۖ;->ۧ()Ll/ᩴ۠ۖ;

    move-result-object p1

    return-object p1

    .line 150
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "GenericGFPolys do not have same GenericGF field"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ()Z
    .locals 2

    .line 84
    iget-object v0, p0, Ll/ᩴ۠ۖ;->֫:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method
