.class public final Ll/۫᩵ۚ;
.super Ljava/lang/Object;
.source "35OG"


# direct methods
.method public static ֫(Ljava/lang/String;)I
    .locals 9

    if-eqz p0, :cond_f

    .line 177
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_e

    .line 181
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x0

    .line 185
    aget-char v2, v0, v1

    const/16 v3, 0x2d

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 190
    :goto_0
    aget-char v4, v0, v2

    const/16 v5, 0x30

    const/16 v6, 0xa

    if-ne v4, v5, :cond_5

    add-int/lit8 v4, v2, 0x1

    .line 192
    array-length v5, v0

    if-ne v4, v5, :cond_1

    return v1

    .line 194
    :cond_1
    aget-char v5, v0, v4

    const/16 v7, 0x78

    if-eq v5, v7, :cond_4

    const/16 v7, 0x58

    if-ne v5, v7, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    .line 197
    invoke-static {v5, v2}, Ljava/lang/Character;->digit(CI)I

    move-result v2

    if-ltz v2, :cond_3

    const/16 v6, 0x8

    :cond_3
    move v2, v4

    goto :goto_2

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x2

    const/16 v6, 0x10

    :cond_5
    :goto_2
    const v4, 0x7fffffff

    .line 205
    div-int/lit8 v5, v6, 0x2

    div-int/2addr v4, v5

    .line 207
    :goto_3
    array-length v5, v0

    const-string v7, " cannot fit into an int"

    if-ge v2, v5, :cond_a

    .line 208
    aget-char v5, v0, v2

    invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    if-ltz v5, :cond_9

    mul-int v8, v1, v6

    if-gt v1, v4, :cond_8

    if-gez v8, :cond_7

    neg-int v1, v5

    if-ge v8, v1, :cond_6

    goto :goto_4

    .line 217
    :cond_6
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_4
    add-int v1, v8, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 214
    :cond_8
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_9
    new-instance p0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "The string contains an invalid digit - \'"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-char v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    if-eqz v3, :cond_d

    const/high16 v0, -0x80000000

    if-ne v1, v0, :cond_b

    goto :goto_5

    :cond_b
    if-ltz v1, :cond_c

    mul-int/lit8 v1, v1, -0x1

    return v1

    .line 228
    :cond_c
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_5
    return v1

    .line 178
    :cond_e
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is blank"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 175
    :cond_f
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is null"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
