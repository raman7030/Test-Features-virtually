.class public final Ll/ۧ᩻᩵;
.super Ljava/lang/Object;
.source "Q7L3"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 164
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    .line 167
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 168
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0xd

    const/16 v5, 0xa

    if-ne v3, v4, :cond_0

    .line 172
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v3, v2, 0x1

    .line 176
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v5, :cond_2

    move v2, v3

    goto :goto_1

    :cond_0
    if-ne v3, v5, :cond_1

    .line 181
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_1

    .line 184
    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 188
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-lez p0, :cond_4

    .line 189
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    if-eqz p0, :cond_b

    .line 105
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 110
    :cond_0
    invoke-static {p0}, Ll/ۧ᩻᩵;->֫(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-string v2, ""

    const/4 v3, 0x1

    if-gt v1, v3, :cond_1

    const-string v0, "^[ \t]+"

    .line 114
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 119
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const v4, 0x7fffffff

    const v5, 0x7fffffff

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 120
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_2

    const/4 v8, 0x0

    .line 203
    :goto_1
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v7, v9, :cond_4

    .line 204
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x20

    if-eq v9, v10, :cond_3

    const/16 v10, 0x9

    if-ne v9, v10, :cond_4

    :cond_3
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 122
    :cond_4
    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    move-result v5

    goto :goto_0

    :cond_5
    if-ne v5, v4, :cond_6

    return-object p0

    .line 132
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v7, v1, :cond_a

    .line 134
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 135
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 137
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 140
    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-lt v4, v5, :cond_8

    .line 141
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 143
    :cond_8
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v3

    if-ge v7, v1, :cond_9

    const-string v1, "\n"

    .line 149
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 153
    :cond_a
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_b
    :goto_4
    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 215
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, ""

    return-object p0

    .line 218
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    .line 219
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_1
    :goto_0
    if-ge v2, v0, :cond_c

    add-int/lit8 v4, v2, 0x1

    .line 223
    aget-char v5, p0, v2

    const/16 v6, 0x5c

    if-ne v5, v6, :cond_a

    if-ge v4, v0, :cond_2

    add-int/lit8 v2, v2, 0x2

    .line 225
    aget-char v4, p0, v4

    move v5, v4

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    move v2, v4

    const/4 v5, 0x0

    :goto_1
    const/16 v4, 0xa

    if-eq v5, v4, :cond_1

    const/16 v7, 0xd

    if-eq v5, v7, :cond_9

    const/16 v4, 0x22

    if-eq v5, v4, :cond_b

    const/16 v4, 0x27

    if-eq v5, v4, :cond_b

    if-eq v5, v6, :cond_b

    const/16 v4, 0x62

    if-eq v5, v4, :cond_8

    const/16 v4, 0x66

    if-eq v5, v4, :cond_7

    const/16 v4, 0x6e

    if-eq v5, v4, :cond_6

    const/4 v4, 0x2

    const/4 v6, 0x1

    packed-switch v5, :pswitch_data_0

    packed-switch v5, :pswitch_data_1

    .line 274
    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p0, v2, v1

    aput-object v0, v2, v6

    const-string p0, "Invalid escape sequence: \\%c \\\\u%04X"

    .line 272
    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 275
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/16 v6, 0x33

    if-gt v5, v6, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x1

    :goto_2
    add-int/2addr v4, v2

    .line 0
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int/lit8 v5, v5, -0x30

    :goto_3
    if-ge v2, v4, :cond_5

    .line 255
    aget-char v6, p0, v2

    const/16 v7, 0x30

    if-lt v6, v7, :cond_5

    const/16 v7, 0x37

    if-ge v7, v6, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v2, v2, 0x1

    shl-int/lit8 v5, v5, 0x3

    add-int/lit8 v6, v6, -0x30

    or-int/2addr v5, v6

    goto :goto_3

    :cond_5
    :goto_4
    int-to-char v5, v5

    goto :goto_5

    :pswitch_1
    const/16 v5, 0x9

    goto :goto_5

    :pswitch_2
    const/16 v5, 0x20

    goto :goto_5

    :pswitch_3
    const/16 v5, 0xd

    goto :goto_5

    :cond_6
    const/16 v5, 0xa

    goto :goto_5

    :cond_7
    const/16 v5, 0xc

    goto :goto_5

    :cond_8
    const/16 v5, 0x8

    goto :goto_5

    :cond_9
    if-ge v2, v0, :cond_1

    .line 267
    aget-char v5, p0, v2

    if-ne v5, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_a
    move v2, v4

    :cond_b
    :goto_5
    add-int/lit8 v4, v3, 0x1

    .line 280
    aput-char v5, p0, v3

    move v3, v4

    goto/16 :goto_0

    .line 283
    :cond_c
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x72
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
