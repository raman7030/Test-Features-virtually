.class public final Ll/᩻᩻ܳ;
.super Ljava/lang/Object;
.source "W7FQ"


# direct methods
.method public static ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 134
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_b

    .line 135
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x5c

    const/4 v6, 0x1

    if-eq v4, v5, :cond_0

    .line 137
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :cond_0
    add-int/lit8 v4, v1, -0x1

    if-eq v3, v4, :cond_a

    add-int/lit8 v4, v3, 0x1

    .line 143
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x55

    if-eq v7, v8, :cond_6

    if-eq v7, v5, :cond_5

    const/16 v5, 0x6e

    if-eq v7, v5, :cond_4

    const/16 v5, 0x72

    if-eq v7, v5, :cond_3

    const/16 v5, 0x74

    if-eq v7, v5, :cond_2

    const/16 v4, 0x75

    if-ne v7, v4, :cond_1

    goto :goto_2

    .line 166
    :cond_1
    invoke-static {v7}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const p1, 0x7f1201b4

    .line 230
    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 202
    new-instance v0, Ll/ۜ᩻ܳ;

    invoke-direct {v0, p0, p1}, Ll/ۜ᩻ܳ;-><init>(ILjava/lang/String;)V

    .line 166
    throw v0

    :cond_2
    const/16 v3, 0x9

    .line 155
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const/16 v3, 0xd

    .line 152
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    const/16 v3, 0xa

    .line 149
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 146
    :cond_5
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    move v3, v4

    goto :goto_4

    :cond_6
    :goto_2
    add-int/lit8 v4, v3, 0x5

    const v5, 0x7f1201b3

    if-ge v4, v1, :cond_9

    add-int/lit8 v7, v3, 0x2

    add-int/lit8 v3, v3, 0x6

    .line 162
    invoke-virtual {p1, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    .line 176
    :goto_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x10

    if-ge v7, v8, :cond_8

    .line 177
    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-static {v8, v9}, Ljava/lang/Character;->digit(CI)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 178
    :cond_7
    invoke-static {p0, v5}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0

    .line 181
    :cond_8
    invoke-static {v3, v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    int-to-char v3, v3

    .line 162
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :goto_4
    add-int/2addr v3, v6

    goto/16 :goto_0

    .line 160
    :cond_9
    invoke-static {p0, v5}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0

    :cond_a
    const p1, 0x7f1201b2

    .line 141
    invoke-static {p0, p1}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0

    .line 169
    :cond_b
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 6

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 237
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const v2, 0x7f1201b5

    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "\\u"

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/16 v2, 0xa

    if-nez v1, :cond_0

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v4, v1, :cond_3

    .line 34
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ܺܳ;

    if-lez v4, :cond_1

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    const-string v5, "password="

    .line 38
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    iget-object v5, v3, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

    .line 38
    invoke-static {v5}, Ll/᩻᩻ܳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\nremark="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    iget-object v3, v3, Ll/۫ܺܳ;->֫:Ljava/lang/String;

    if-nez v3, :cond_2

    const-string v3, ""

    .line 39
    :cond_2
    invoke-static {v3}, Ll/᩻᩻ܳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 41
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 49
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    const-string v2, "\r\n"

    const-string v3, "\n"

    .line 188
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0xd

    const/16 v4, 0xa

    invoke-virtual {p0, v2, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    const/4 v2, -0x1

    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    move-object v6, v2

    .line 53
    :goto_0
    array-length v7, p0

    const v8, 0x7f1201af

    if-ge v4, v7, :cond_a

    add-int/lit8 v7, v4, 0x1

    .line 55
    aget-object v9, p0, v4

    if-nez v4, :cond_0

    .line 56
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v9, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v10, 0xfeff

    if-ne v4, v10, :cond_0

    const/4 v4, 0x1

    .line 57
    invoke-virtual {v9, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 59
    :cond_0
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    const-string v4, "#"

    invoke-virtual {v9, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "remark="

    const-string v5, "password="

    if-nez v6, :cond_6

    .line 63
    invoke-virtual {v9, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 64
    invoke-virtual {v9, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    const p0, 0x7f1201b0

    .line 65
    invoke-static {v7, p0}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0

    :cond_2
    const p0, 0x7f1201ae

    .line 67
    invoke-static {v7, p0}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0

    :cond_3
    const/16 v4, 0x9

    .line 69
    invoke-virtual {v9, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Ll/᩻᩻ܳ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 70
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    .line 73
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v5, v7

    goto :goto_1

    :cond_4
    const p0, 0x7f1201ac

    .line 74
    invoke-static {v7, p0}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0

    :cond_5
    const p0, 0x7f1201ad

    .line 71
    invoke-static {v7, p0}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0

    .line 79
    :cond_6
    invoke-virtual {v9, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_8

    .line 80
    invoke-virtual {v9, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_7

    .line 81
    invoke-static {v7, v8}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0

    :cond_7
    const p0, 0x7f1201b1

    .line 83
    invoke-static {v7, p0}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0

    :cond_8
    const/4 v4, 0x7

    .line 85
    invoke-virtual {v9, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Ll/᩻᩻ܳ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 86
    new-instance v5, Ll/۫ܺܳ;

    invoke-direct {v5, v6, v4}, Ll/۫ܺܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, -0x1

    move-object v6, v2

    const/4 v5, -0x1

    :cond_9
    :goto_1
    move v4, v7

    goto/16 :goto_0

    :cond_a
    if-nez v6, :cond_b

    return-object v0

    .line 92
    :cond_b
    invoke-static {v5, v8}, Ll/᩻᩻ܳ;->֫(II)Ll/ۜ᩻ܳ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(II)Ll/ۜ᩻ܳ;
    .locals 1

    .line 223
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    .line 202
    new-instance v0, Ll/ۜ᩻ܳ;

    invoke-direct {v0, p0, p1}, Ll/ۜ᩻ܳ;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 102
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    .line 103
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x9

    if-eq v4, v5, :cond_4

    const/16 v5, 0xa

    if-eq v4, v5, :cond_3

    const/16 v5, 0xd

    if-eq v4, v5, :cond_2

    const/16 v5, 0x5c

    if-eq v4, v5, :cond_1

    .line 118
    invoke-static {v4}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 119
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v4, v6, v2

    const-string v4, "\\u%04X"

    invoke-static {v5, v4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 121
    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v4, "\\\\"

    .line 106
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v4, "\\r"

    .line 112
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const-string v4, "\\n"

    .line 109
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    const-string v4, "\\t"

    .line 115
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 126
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
