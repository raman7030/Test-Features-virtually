.class public final Ll/۫᩺᩻;
.super Ljava/lang/Object;
.source "P784"


# direct methods
.method public static ֫(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 3

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v2, v1

    .line 172
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 173
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 174
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 175
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 176
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_2

    :cond_0
    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 180
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p2, v1, :cond_3

    .line 181
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩺᩻;

    iget v1, v1, Ll/۬᩺᩻;->֫:I

    add-int/2addr p3, v1

    if-lez p2, :cond_1

    add-int/lit8 p3, p3, 0x1

    :cond_1
    if-le p3, p0, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 189
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_6

    if-lez p1, :cond_4

    const/16 p2, 0xa

    .line 192
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 194
    :cond_4
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۬᩺᩻;

    iget-object p2, p2, Ll/۬᩺᩻;->ۧ:Ljava/lang/String;

    if-nez p2, :cond_5

    :goto_2
    const/4 p0, 0x0

    return-object p0

    .line 198
    :cond_5
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 200
    :cond_6
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/֫ܿۜ;Ll/᩻ۜۜ;)Ljava/lang/String;
    .locals 4

    .line 208
    iget v0, p1, Ll/֫ܿۜ;->᩻:I

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 209
    iget p1, p1, Ll/֫ܿۜ;->ۧ:I

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 210
    invoke-static {p0, v0, p1}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    move-result p1

    .line 211
    iget p2, p2, Ll/᩻ۜۜ;->ᩴ:I

    if-lt p1, p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sub-int p1, p2, p1

    .line 212
    div-int/lit8 v2, p2, 0x3

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    neg-int p1, p1

    .line 213
    invoke-static {v0, p1, p0}, Ll/۠ۨ᩻;->ۧ(IILjava/lang/CharSequence;)I

    move-result p1

    .line 219
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p1, v0, p2, p0}, Ll/۠ۨ᩻;->֫(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "\n"

    const/4 p2, -0x1

    .line 223
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 224
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 225
    array-length v0, p1

    :goto_1
    if-ge v1, v0, :cond_3

    aget-object v2, p1, v1

    .line 226
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 227
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    .line 230
    :cond_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_2

    const/16 v3, 0xa

    .line 231
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    :cond_2
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 235
    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 216
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    return-object p1
.end method

.method public static ֫(Ll/ۨۖܽ;Ll/֫ܿۜ;Ll/᩻ۜۜ;)Ljava/lang/String;
    .locals 12

    .line 26
    iget v0, p1, Ll/֫ܿۜ;->᩻:I

    iget-boolean v1, p2, Ll/᩻ۜۜ;->᩻:Z

    iget v2, p2, Ll/᩻ۜۜ;->ᩴ:I

    const/4 v3, 0x0

    if-eqz v1, :cond_18

    if-lez v2, :cond_18

    if-gez v0, :cond_0

    goto/16 :goto_d

    .line 29
    :cond_0
    invoke-static {v0, p0}, Ll/۠ۨ᩻;->ܽ(ILjava/lang/CharSequence;)I

    move-result v1

    .line 30
    iget v4, p1, Ll/֫ܿۜ;->ۧ:I

    const/4 v5, 0x1

    if-le v4, v0, :cond_1

    add-int/lit8 v0, v4, -0x1

    .line 31
    :cond_1
    invoke-static {v0, p0}, Ll/۠ۨ᩻;->ۧ(ILjava/lang/CharSequence;)I

    move-result v0

    .line 50
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-virtual {p0}, Ll/ۨۖܽ;->length()I

    move-result v6

    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/4 v7, 0x0

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 52
    invoke-virtual {p0}, Ll/ۨۖܽ;->length()I

    move-result v8

    invoke-static {v0, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    :goto_0
    if-gt v6, v8, :cond_4

    .line 53
    invoke-virtual {p0}, Ll/ۨۖܽ;->length()I

    move-result v9

    if-ge v6, v9, :cond_4

    .line 54
    invoke-static {v6, p0}, Ll/۠ۨ᩻;->ۧ(ILjava/lang/CharSequence;)I

    move-result v9

    .line 243
    invoke-static {v6, v9, v2, p0}, Ll/۫᩺᩻;->֫(IIILjava/lang/CharSequence;)Ll/۬᩺᩻;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 245
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    if-ge v9, v8, :cond_4

    .line 56
    invoke-virtual {p0}, Ll/ۨۖܽ;->length()I

    move-result v6

    if-lt v9, v6, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v9, 0x1

    goto :goto_0

    .line 34
    :cond_4
    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 35
    invoke-static {p0, p1, p2}, Ll/۫᩺᩻;->֫(Ljava/lang/CharSequence;Ll/֫ܿۜ;Ll/᩻ۜۜ;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 69
    :cond_5
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 70
    invoke-virtual {p0}, Ll/ۨۖܽ;->length()I

    move-result v8

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_6
    :goto_2
    const/4 v8, 0x2

    if-lez v1, :cond_9

    .line 71
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v9, v8, :cond_9

    add-int/lit8 v8, v1, -0x1

    add-int/lit8 v1, v1, -0x2

    :goto_3
    if-ltz v1, :cond_8

    .line 283
    invoke-virtual {p0, v1}, Ll/ۨۖܽ;->charAt(I)C

    move-result v9

    const/16 v10, 0xa

    if-ne v9, v10, :cond_7

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    add-int/lit8 v1, v1, -0x1

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    .line 74
    :goto_4
    invoke-static {v1, v8, v2, p0}, Ll/۫᩺᩻;->֫(IIILjava/lang/CharSequence;)Ll/۬᩺᩻;

    move-result-object v8

    if-eqz v8, :cond_6

    .line 76
    invoke-virtual {v6, v7, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 88
    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 89
    invoke-virtual {p0}, Ll/ۨۖܽ;->length()I

    move-result v9

    if-ge v0, v9, :cond_a

    add-int/2addr v0, v5

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Ll/ۨۖܽ;->length()I

    move-result v0

    .line 90
    :goto_5
    invoke-virtual {p0}, Ll/ۨۖܽ;->length()I

    move-result v9

    if-ge v0, v9, :cond_d

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v9, v8, :cond_d

    .line 91
    invoke-static {v0, p0}, Ll/۠ۨ᩻;->ۧ(ILjava/lang/CharSequence;)I

    move-result v9

    .line 243
    invoke-static {v0, v9, v2, p0}, Ll/۫᩺᩻;->֫(IIILjava/lang/CharSequence;)Ll/۬᩺᩻;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 245
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    :cond_b
    invoke-virtual {p0}, Ll/ۨۖܽ;->length()I

    move-result v0

    if-lt v9, v0, :cond_c

    goto :goto_6

    :cond_c
    add-int/lit8 v0, v9, 0x1

    goto :goto_5

    .line 109
    :cond_d
    :goto_6
    invoke-static {v2, v6, v4, v1}, Ll/۫᩺᩻;->֫(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    goto/16 :goto_c

    .line 113
    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 114
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 130
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-lt v10, v8, :cond_f

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۬᩺᩻;

    goto :goto_7

    :cond_f
    move-object v10, v3

    .line 131
    :goto_7
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-lt v11, v8, :cond_10

    .line 0
    invoke-static {v9, v5}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v3

    .line 131
    check-cast v3, Ll/۬᩺᩻;

    :cond_10
    if-nez v10, :cond_11

    if-nez v3, :cond_11

    goto :goto_9

    :cond_11
    if-eqz v10, :cond_13

    if-eqz v3, :cond_12

    .line 135
    iget v8, v10, Ll/۬᩺᩻;->֫:I

    iget v3, v3, Ll/۬᩺᩻;->֫:I

    if-le v8, v3, :cond_13

    .line 136
    :cond_12
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_8

    .line 0
    :cond_13
    invoke-static {v9, v5}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    .line 116
    :goto_8
    invoke-static {v2, v0, v4, v9}, Ll/۫᩺᩻;->֫(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    goto :goto_c

    .line 147
    :cond_14
    :goto_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, v5, :cond_15

    goto :goto_a

    .line 150
    :cond_15
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v5

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v6, v3, v8}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v6, v0

    .line 157
    :goto_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, v5, :cond_16

    goto :goto_b

    .line 160
    :cond_16
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v1, v7, v5}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v1, v0

    .line 121
    :goto_b
    invoke-static {v2, v6, v4, v1}, Ll/۫᩺᩻;->֫(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    :goto_c
    if-eqz v0, :cond_17

    return-object v0

    .line 42
    :cond_17
    invoke-static {p0, p1, p2}, Ll/۫᩺᩻;->֫(Ljava/lang/CharSequence;Ll/֫ܿۜ;Ll/᩻ۜۜ;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_18
    :goto_d
    return-object v3
.end method

.method public static ֫(IIILjava/lang/CharSequence;)Ll/۬᩺᩻;
    .locals 2

    .line 254
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 v0, 0x0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 255
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    :goto_0
    const/16 v0, 0x20

    if-ge p0, p1, :cond_0

    .line 256
    invoke-interface {p3, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-gt v1, v0, :cond_0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-le p1, p0, :cond_1

    add-int/lit8 v1, p1, -0x1

    .line 259
    invoke-interface {p3, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-gt v1, v0, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    if-lt p0, p1, :cond_2

    return-object v0

    .line 265
    :cond_2
    invoke-static {p3, p0, p1}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    move-result v1

    if-gt v1, p2, :cond_3

    .line 267
    invoke-static {p0, p1, p2, p3}, Ll/۠ۨ᩻;->֫(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 268
    :cond_3
    new-instance p0, Ll/۬᩺᩻;

    invoke-direct {p0, v0, v1}, Ll/۬᩺᩻;-><init>(Ljava/lang/String;I)V

    return-object p0
.end method
