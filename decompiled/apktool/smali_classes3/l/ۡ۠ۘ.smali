.class public final Ll/ۡ۠ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ֫:Ljava/lang/Class;

.field public static ۧ:Ljava/lang/Class;

.field public static ܽ:Ljava/lang/reflect/Method;

.field public static ܿ:Z

.field public static ᩳ:Ljava/lang/reflect/Method;


# direct methods
.method public static ֫(CLjava/lang/CharSequence;I)I
    .locals 2

    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    if-ge p2, v0, :cond_1

    .line 9
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, p0, :cond_0

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(IILjava/lang/CharSequence;)I
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_1

    .line 135
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/16 v0, 0x2d

    .line 189
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    .line 190
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2, p0}, Ll/ۡ۠ۘ;->֫(IILjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 191
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ll/ᩴ֫ۚ;)Ljava/lang/String;
    .locals 3

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    invoke-interface {p0}, Ll/ᩴ֫ۚ;->getParameters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡֫ۚ;

    .line 171
    invoke-interface {v2}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 173
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۠ۛ֡;)Ljava/util/LinkedHashMap;
    .locals 7

    .line 76
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 77
    invoke-virtual {p0}, Ll/۠ۛ֡;->getFields()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ֫ۚ;

    .line 78
    invoke-interface {v1}, Ll/ۘ֫ۚ;->ܽ()I

    move-result v2

    .line 79
    sget-object v3, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {v3, v2}, Ll/ܺۗ֡;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Ll/ܺۗ֡;->۟:Ll/ܺۗ֡;

    invoke-virtual {v3, v2}, Ll/ܺۗ֡;->֫(I)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 82
    :cond_1
    invoke-interface {v1}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 99
    :cond_2
    new-instance v3, Ll/ۨۖܽ;

    invoke-direct {v3}, Ll/ۨۖܽ;-><init>()V

    .line 101
    :try_start_0
    new-instance v4, Ll/ۗ᩵ۚ;

    new-instance v5, Ll/᩺ۖܽ;

    invoke-direct {v5, v3}, Ll/᩺ۖܽ;-><init>(Ll/ۨۖܽ;)V

    invoke-direct {v4, v5}, Ll/ۗ᩵ۚ;-><init>(Ljava/io/Writer;)V

    invoke-static {v4, v2}, Ll/ۨ۠֡;->֫(Ll/ۗ᩵ۚ;Ll/ۤܽۚ;)V

    .line 102
    invoke-virtual {v3}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->codePointCount(II)I

    move-result v3

    const/16 v5, 0xf0

    if-le v3, v5, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_4

    .line 219
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v4, v6, v5, v2}, Ll/۠ۨ᩻;->֫(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 109
    :cond_4
    new-instance v4, Ll/᩸᩺᩻;

    invoke-direct {v4, v2, v3}, Ll/᩸᩺᩻;-><init>(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_0

    .line 162
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-virtual {v0, v1, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_5
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/List;)Ll/ܶ᩵ܿ;
    .locals 5

    .line 104
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 105
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 108
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 109
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x2d

    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 112
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v3, v4, v1}, Ll/ۡ۠ۘ;->֫(IILjava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    .line 113
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 114
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    return-object v0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 10

    if-eqz p1, :cond_12

    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    const-string v0, "/"

    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Relative path can not start or end with \'/\': "

    if-nez v1, :cond_11

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_11

    const/16 v1, 0x2f

    .line 19
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x1

    if-eq v3, v5, :cond_8

    .line 21
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_7

    .line 47
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    goto/16 :goto_3

    .line 49
    :cond_0
    invoke-virtual {v7, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_6

    invoke-virtual {v7, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 52
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 53
    invoke-virtual {p0, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    goto/16 :goto_3

    .line 57
    :cond_1
    invoke-virtual {v7, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v2, -0x1

    :goto_0
    if-eq v0, v5, :cond_2

    .line 413
    invoke-virtual {p0, v6}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v8

    add-int/lit8 v9, v2, 0x1

    .line 60
    invoke-virtual {v7, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 61
    invoke-static {v9, v8}, Ll/ۡ۠ۘ;->֫(Ljava/lang/String;Ljava/util/List;)Ll/ܶ᩵ܿ;

    move-result-object v8

    if-eqz v8, :cond_2

    add-int/lit8 p0, v0, 0x1

    .line 65
    invoke-virtual {v7, v1, p0}, Ljava/lang/String;->indexOf(II)I

    move-result p0

    move v2, v0

    move v0, p0

    move-object p0, v8

    goto :goto_0

    :cond_2
    add-int/2addr v2, v6

    .line 70
    invoke-virtual {v7, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const-string v2, "-"

    if-ne v1, v5, :cond_4

    .line 413
    invoke-virtual {p0, v6}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v7

    .line 73
    invoke-static {v0, v7}, Ll/ۡ۠ۘ;->֫(Ljava/lang/String;Ljava/util/List;)Ll/ܶ᩵ܿ;

    move-result-object v7

    if-nez v7, :cond_3

    .line 75
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 76
    :goto_1
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 0
    invoke-static {v0, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    add-int/2addr v1, v6

    .line 77
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    goto :goto_1

    :cond_3
    move-object p0, v7

    goto :goto_3

    .line 83
    :cond_4
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    add-int/2addr v1, v6

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 413
    invoke-virtual {p0, v6}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v1

    .line 86
    invoke-static {v7, v1}, Ll/ۡ۠ۘ;->֫(Ljava/lang/String;Ljava/util/List;)Ll/ܶ᩵ܿ;

    move-result-object v1

    if-nez v1, :cond_5

    .line 89
    invoke-virtual {p0, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    const/4 v8, -0x1

    .line 90
    :goto_2
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_5

    .line 0
    invoke-static {v7, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/2addr v8, v6

    .line 91
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    goto :goto_2

    .line 95
    :cond_5
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    goto :goto_3

    .line 50
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    :goto_3
    add-int/2addr v3, v6

    .line 22
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 413
    :cond_8
    invoke-virtual {p0, v6}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 127
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/16 v2, 0x2e

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 128
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_4

    .line 131
    :cond_a
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 133
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_5

    .line 135
    :cond_b
    invoke-virtual {v3, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v7

    if-lez v7, :cond_9

    add-int/lit8 v8, v7, -0x1

    .line 137
    invoke-virtual {v3, v2, v8}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v8

    if-eq v8, v5, :cond_c

    add-int/lit8 v9, v8, 0x1

    .line 139
    invoke-static {v9, v7, v3}, Ll/ۡ۠ۘ;->֫(IILjava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 140
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 141
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_5

    :cond_c
    add-int/lit8 v8, v7, 0x1

    .line 144
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v9

    invoke-static {v8, v9, v3}, Ll/ۡ۠ۘ;->֫(IILjava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    .line 145
    invoke-virtual {v3, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 146
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_5

    :cond_d
    const/4 v1, 0x0

    :goto_5
    if-nez v1, :cond_10

    .line 28
    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-ne v1, v5, :cond_e

    const-string v1, "."

    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    goto :goto_6

    :cond_e
    add-int/lit8 v2, v1, 0x1

    .line 36
    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    move-object p1, v2

    .line 39
    :goto_6
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_f

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/2addr v5, v6

    .line 40
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_6

    :cond_f
    return-object v0

    :cond_10
    return-object v1

    .line 17
    :cond_11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 15
    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Relative path can not be empty."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/content/Context;Ll/᩸۠ۘ;)V
    .locals 3

    .line 33
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "101492915"

    invoke-static {p0, p1}, Ll/᩺᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ll/᩺᩸ۘ;

    move-result-object p0

    const-string p1, "Common_ta_enable"

    .line 34
    invoke-virtual {p0, p1}, Ll/᩺᩸ۘ;->ۧ(Ljava/lang/String;)Z

    move-result p0

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    .line 42
    sget-object p0, Ll/ۡ۠ۘ;->ᩳ:Ljava/lang/reflect/Method;

    sget-object v1, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v2, v0, p1

    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 44
    :cond_0
    sget-object p0, Ll/ۡ۠ۘ;->ᩳ:Ljava/lang/reflect/Method;

    sget-object v1, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v2, v0, p1

    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 47
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "checkStatStatus exception: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "OpenConfig"

    invoke-static {p1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/᩸۠֫;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 87
    :try_start_0
    invoke-interface {p0}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ֫(I)Z
    .locals 2

    .line 62
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x24

    if-eq p0, v0, :cond_0

    const/16 v0, 0x2b

    if-eq p0, v0, :cond_0

    const/16 v0, 0x5e

    if-eq p0, v0, :cond_0

    const/16 v0, 0x60

    if-eq p0, v0, :cond_0

    const/16 v0, 0x7c

    if-eq p0, v0, :cond_0

    const/16 v0, 0x7e

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_1

    const/4 p0, 0x0

    return p0

    :cond_0
    :pswitch_0
    return v1

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
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
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(IILjava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-lt p0, p1, :cond_0

    return v0

    :cond_0
    :goto_0
    if-ge p0, p1, :cond_3

    .line 158
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-lt v1, v2, :cond_2

    const/16 v2, 0x39

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(IILjava/lang/CharSequence;)I
    .locals 2

    :goto_0
    if-lt p0, p1, :cond_1

    .line 148
    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/16 v0, 0x2e

    .line 170
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    add-int/lit8 v3, v1, -0x1

    .line 172
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v0

    const/4 v3, 0x0

    if-eq v0, v2, :cond_0

    add-int/lit8 v2, v0, 0x1

    .line 174
    invoke-static {v2, v1, p0}, Ll/ۡ۠ۘ;->֫(IILjava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 175
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 177
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v0, v2, p0}, Ll/ۡ۠ۘ;->֫(IILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static ۧ(Ll/۠ۛ֡;)Ljava/util/LinkedHashMap;
    .locals 18

    .line 65
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 66
    invoke-virtual/range {p0 .. p0}, Ll/۠ۛ֡;->getMethods()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴ֫ۚ;

    .line 67
    invoke-static {v2}, Ll/ۡ۠ۘ;->֫(Ll/ᩴ֫ۚ;)Ljava/lang/String;

    move-result-object v3

    .line 119
    invoke-interface {v2}, Ll/ᩴ֫ۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v2

    if-nez v2, :cond_0

    .line 37
    new-instance v2, Ll/ۙ᩺᩻;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Ll/ۙ᩺᩻;-><init>(IIIILjava/util/AbstractCollection;Ljava/util/AbstractCollection;)V

    move-object/from16 p0, v1

    goto/16 :goto_9

    .line 127
    :cond_0
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 128
    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 129
    invoke-interface {v2}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺֫ۚ;

    add-int/lit8 v12, v12, 0x1

    .line 131
    invoke-interface {v6}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v7

    .line 132
    instance-of v8, v6, Ll/ۧۧۚ;

    const/4 v9, 0x0

    if-eqz v8, :cond_1

    .line 133
    move-object v8, v6

    check-cast v8, Ll/ۧۧۚ;

    goto :goto_2

    :cond_1
    move-object v8, v9

    :goto_2
    if-nez v8, :cond_2

    goto :goto_3

    .line 134
    :cond_2
    invoke-interface {v8}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v9

    :goto_3
    const/4 v10, 0x5

    if-eqz v8, :cond_7

    .line 135
    iget v11, v7, Ll/֨ۗ֡;->۬:I

    if-nez v11, :cond_7

    instance-of v11, v9, Ll/ܶܽۚ;

    if-eqz v11, :cond_7

    add-int/lit8 v13, v13, 0x1

    .line 138
    move-object v8, v9

    check-cast v8, Ll/ܶܽۚ;

    invoke-interface {v8}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v8

    .line 180
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v11

    if-ge v11, v10, :cond_6

    if-eqz v8, :cond_6

    .line 200
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_6

    .line 201
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v11, 0x0

    invoke-virtual {v8, v11, v10}, Ljava/lang/String;->codePointCount(II)I

    move-result v10

    const/16 v11, 0x50

    if-le v10, v11, :cond_3

    goto :goto_5

    :cond_3
    const/4 v10, 0x0

    .line 204
    :goto_4
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_5

    .line 205
    invoke-virtual {v8, v10}, Ljava/lang/String;->codePointAt(I)I

    move-result v11

    move-object/from16 p0, v1

    const/16 v1, 0xa

    if-eq v11, v1, :cond_a

    const/16 v1, 0xd

    if-eq v11, v1, :cond_a

    .line 206
    invoke-static {v11}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_6

    .line 209
    :cond_4
    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr v10, v1

    move-object/from16 v1, p0

    goto :goto_4

    :cond_5
    move-object/from16 p0, v1

    .line 183
    invoke-virtual {v4, v8}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_6
    :goto_5
    move-object/from16 p0, v1

    goto :goto_6

    :cond_7
    move-object/from16 p0, v1

    if-eqz v8, :cond_a

    .line 139
    iget v1, v7, Ll/֨ۗ֡;->۬:I

    const/4 v8, 0x2

    if-ne v1, v8, :cond_a

    instance-of v1, v9, Ll/ᩴܽۚ;

    if-eqz v1, :cond_a

    move-object v1, v9

    check-cast v1, Ll/ᩴܽۚ;

    const-string v8, "I"

    .line 231
    invoke-interface {v1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_6

    .line 234
    :cond_8
    invoke-interface {v1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    const-string v8, "/R$"

    .line 235
    invoke-virtual {v1, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_9

    const-string v8, "LR$"

    invoke-virtual {v1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_9
    add-int/lit8 v14, v14, 0x1

    .line 143
    :cond_a
    :goto_6
    instance-of v1, v6, Ll/ۢۧۚ;

    if-eqz v1, :cond_d

    check-cast v6, Ll/ۢۧۚ;

    .line 144
    invoke-interface {v6}, Ll/ۢۧۚ;->᩸()J

    move-result-wide v10

    const-wide/16 v16, 0x0

    cmp-long v1, v10, v16

    if-ltz v1, :cond_d

    const-wide v16, 0xffffffffL

    cmp-long v1, v10, v16

    if-lez v1, :cond_b

    goto :goto_7

    :cond_b
    long-to-int v1, v10

    ushr-int/lit8 v6, v1, 0x18

    and-int/lit16 v6, v6, 0xff

    ushr-int/lit8 v1, v1, 0x10

    and-int/lit16 v1, v1, 0xff

    const/16 v8, 0x7f

    if-eq v6, v8, :cond_c

    const/4 v8, 0x1

    if-ne v6, v8, :cond_d

    :cond_c
    if-eqz v1, :cond_d

    add-int/lit8 v14, v14, 0x1

    .line 147
    :cond_d
    :goto_7
    iget-object v1, v7, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v6, "invoke-"

    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    add-int/lit8 v15, v15, 0x1

    .line 149
    instance-of v1, v9, Ll/ۚܽۚ;

    if-eqz v1, :cond_f

    .line 150
    check-cast v9, Ll/ۚܽۚ;

    .line 190
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v6, 0x5

    if-lt v1, v6, :cond_e

    goto :goto_8

    .line 193
    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v9}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "->"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v9}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_8
    move-object/from16 v1, p0

    goto/16 :goto_1

    :cond_10
    move-object/from16 p0, v1

    .line 154
    new-instance v2, Ll/ۙ᩺᩻;

    move-object v11, v2

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    invoke-direct/range {v11 .. v17}, Ll/ۙ᩺᩻;-><init>(IIIILjava/util/AbstractCollection;Ljava/util/AbstractCollection;)V

    .line 67
    :goto_9
    invoke-virtual {v0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p0

    goto/16 :goto_0

    :cond_11
    return-object v0
.end method

.method public static ۧ(Landroid/content/Context;Ll/᩸۠ۘ;)V
    .locals 11

    .line 53
    const-class v0, Ljava/lang/String;

    const-class v1, Landroid/content/Context;

    :try_start_0
    const-string v2, "com.tencent.stat.StatConfig"

    .line 57
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    const-string v2, "com.tencent.stat.StatService"

    .line 58
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Ll/ۡ۠ۘ;->ۧ:Ljava/lang/Class;

    const-string v3, "reportQQ"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v7, 0x1

    aput-object v0, v5, v7

    .line 61
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Ll/ۡ۠ۘ;->ܽ:Ljava/lang/reflect/Method;

    .line 62
    sget-object v2, Ll/ۡ۠ۘ;->ۧ:Ljava/lang/Class;

    const-string v3, "trackCustomEvent"

    const/4 v5, 0x3

    new-array v8, v5, [Ljava/lang/Class;

    aput-object v1, v8, v6

    aput-object v0, v8, v7

    const-class v9, [Ljava/lang/String;

    aput-object v9, v8, v4

    invoke-virtual {v2, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    sget-object v2, Ll/ۡ۠ۘ;->ۧ:Ljava/lang/Class;

    const-string v3, "commitEvents"

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-array v9, v4, [Ljava/lang/Class;

    aput-object v1, v9, v6

    aput-object v8, v9, v7

    invoke-virtual {v2, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    sget-object v2, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    const-string v3, "setEnableStatService"

    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    new-array v10, v7, [Ljava/lang/Class;

    aput-object v9, v10, v6

    invoke-virtual {v2, v3, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Ll/ۡ۠ۘ;->ᩳ:Ljava/lang/reflect/Method;

    .line 66
    invoke-static {p0, p1}, Ll/ۡ۠ۘ;->֫(Landroid/content/Context;Ll/᩸۠ۘ;)V

    .line 69
    sget-object p1, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    const-string v2, "setAutoExceptionCaught"

    new-array v3, v7, [Ljava/lang/Class;

    aput-object v9, v3, v6

    invoke-virtual {p1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    sget-object v2, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    new-array v3, v7, [Ljava/lang/Object;

    .line 70
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v10, v3, v6

    invoke-virtual {p1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object p1, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    const-string v2, "setEnableSmartReporting"

    new-array v3, v7, [Ljava/lang/Class;

    aput-object v9, v3, v6

    invoke-virtual {p1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    sget-object v2, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    new-array v3, v7, [Ljava/lang/Object;

    .line 74
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v9, v3, v6

    invoke-virtual {p1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object p1, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    const-string v2, "setSendPeriodMinutes"

    new-array v3, v7, [Ljava/lang/Class;

    aput-object v8, v3, v6

    invoke-virtual {p1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    sget-object v2, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    const/16 v3, 0x5a0

    .line 78
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v8, v7, [Ljava/lang/Object;

    aput-object v3, v8, v6

    invoke-virtual {p1, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "com.tencent.stat.StatReportStrategy"

    .line 81
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 82
    sget-object v2, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    const-string v3, "setStatSendStrategy"

    new-array v8, v7, [Ljava/lang/Class;

    aput-object p1, v8, v6

    invoke-virtual {v2, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sget-object v3, Ll/ۡ۠ۘ;->֫:Ljava/lang/Class;

    const-string v8, "PERIOD"

    .line 84
    invoke-virtual {p1, v8}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 v8, 0x0

    invoke-virtual {p1, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    new-array v9, v7, [Ljava/lang/Object;

    aput-object p1, v9, v6

    .line 82
    invoke-virtual {v2, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object p1, Ll/ۡ۠ۘ;->ۧ:Ljava/lang/Class;

    const-string v2, "startStatService"

    new-array v3, v5, [Ljava/lang/Class;

    aput-object v1, v3, v6

    aput-object v0, v3, v7

    aput-object v0, v3, v4

    invoke-virtual {p1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    sget-object v0, Ll/ۡ۠ۘ;->ۧ:Ljava/lang/Class;

    const-string v1, "com.tencent.stat.common.StatConstants"

    .line 98
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "VERSION"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    aput-object p0, v2, v6

    const-string p0, "Aqc101492915"

    aput-object p0, v2, v7

    aput-object v1, v2, v4

    .line 94
    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sput-boolean v7, Ll/ۡ۠ۘ;->ܿ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 102
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "start4QQConnect exception: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "OpenConfig"

    invoke-static {p1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ۧ(I)Z
    .locals 3

    const/16 v0, 0x9

    const/4 v1, 0x1

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xc

    if-eq p0, v0, :cond_1

    const/16 v2, 0xd

    if-eq p0, v2, :cond_1

    const/16 v2, 0x20

    if-eq p0, v2, :cond_1

    .line 111
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result p0

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v1
.end method

.method public static ܽ(Landroid/content/Context;Ll/᩸۠ۘ;)V
    .locals 4

    .line 109
    invoke-virtual {p1}, Ll/᩸۠ۘ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 110
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object v0

    invoke-virtual {p1}, Ll/᩸۠ۘ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "101492915"

    const-string v2, "11"

    const-string v3, "0"

    invoke-static {v1, v0, v2, v3}, Ll/۟ܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    :cond_0
    sget-boolean v0, Ll/ۡ۠ۘ;->ܿ:Z

    if-nez v0, :cond_1

    goto :goto_0

    .line 118
    :cond_1
    invoke-static {p0, p1}, Ll/ۡ۠ۘ;->֫(Landroid/content/Context;Ll/᩸۠ۘ;)V

    .line 119
    invoke-virtual {p1}, Ll/᩸۠ۘ;->ۧ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 121
    :try_start_0
    sget-object v0, Ll/ۡ۠ۘ;->ܽ:Ljava/lang/reflect/Method;

    sget-object v1, Ll/ۡ۠ۘ;->ۧ:Ljava/lang/Class;

    invoke-virtual {p1}, Ll/᩸۠ۘ;->ۧ()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 p0, 0x1

    aput-object p1, v2, p0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 123
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "reportQQ exception: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "OpenConfig"

    invoke-static {p1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    .line 37
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_d

    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x40

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    const-wide/16 v6, 0x1

    shl-long v3, v6, v3

    const-wide v6, 0xffffd9ffL

    and-long/2addr v3, v6

    const-wide/16 v6, 0x0

    cmp-long v8, v3, v6

    if-eqz v8, :cond_b

    return v5

    :cond_1
    const/16 v4, 0x80

    if-ge v3, v4, :cond_2

    const/16 v4, 0x7f

    if-ne v3, v4, :cond_b

    return v5

    :cond_2
    const/16 v4, 0x200b

    if-lt v3, v4, :cond_5

    const/16 v4, 0x206f

    if-gt v3, v4, :cond_5

    const/16 v4, 0x200f

    if-le v3, v4, :cond_4

    const/16 v4, 0x2028

    if-lt v3, v4, :cond_3

    const/16 v4, 0x202f

    if-le v3, v4, :cond_4

    :cond_3
    const/16 v4, 0x2060

    if-lt v3, v4, :cond_b

    :cond_4
    return v5

    :cond_5
    const v4, 0xd800

    if-lt v3, v4, :cond_9

    const v4, 0xdfff

    if-gt v3, v4, :cond_9

    const v6, 0xdbff

    if-gt v3, v6, :cond_8

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_6

    return v5

    .line 65
    :cond_6
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const v7, 0xdc00

    if-lt v6, v7, :cond_8

    if-le v6, v4, :cond_7

    goto :goto_1

    .line 70
    :cond_7
    invoke-static {v3, v6}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v3

    const/high16 v4, 0xf0000

    if-lt v3, v4, :cond_b

    :cond_8
    :goto_1
    return v5

    :cond_9
    const v4, 0xe000

    if-lt v3, v4, :cond_a

    const v4, 0xf8ff

    if-gt v3, v4, :cond_a

    return v5

    :cond_a
    const v4, 0xfffd

    if-eq v3, v4, :cond_c

    const v4, 0xfeff

    if-ne v3, v4, :cond_b

    goto :goto_2

    :cond_b
    add-int/2addr v2, v5

    goto :goto_0

    :cond_c
    :goto_2
    return v5

    :cond_d
    :goto_3
    return v0
.end method
