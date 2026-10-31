.class public final Ll/ᩴᩳܿ;
.super Ljava/lang/Object;
.source "068W"


# static fields
.field public static final ֫:Ll/ۨۘܽ;

.field public static final ۧ:Ll/ۨۘܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "<[^<>\\s]+>?"

    .line 10
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ᩴᩳܿ;->֫:Ll/ۨۘܽ;

    const-string v0, "[/?]?>"

    .line 11
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ᩴᩳܿ;->ۧ:Ll/ۨۘܽ;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;IIILl/ۖᩳܿ;)Z
    .locals 7

    .line 143
    new-instance v0, Ll/ۘᩳܿ;

    const/4 v1, 0x1

    add-int/2addr p2, v1

    invoke-interface {p0, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    invoke-direct {v0, p3, p2}, Ll/ۘᩳܿ;-><init>([CI)V

    .line 145
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ܽ()Ljava/lang/String;

    .line 146
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result p3

    if-gt p1, p3, :cond_0

    .line 147
    invoke-interface {p0, p2, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    check-cast p4, Ll/ܺܽܿ;

    .line 75
    iget-object p0, p4, Ll/ܺܽܿ;->᩸:Ll/ᩴܽܿ;

    invoke-static {p0}, Ll/ᩴܽܿ;->᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    return v1

    .line 151
    :cond_0
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ᩳ()V

    .line 152
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result p2

    const/4 p3, 0x0

    if-gt p1, p2, :cond_1

    goto/16 :goto_3

    .line 155
    :cond_1
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result p2

    .line 156
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ܽ()Ljava/lang/String;

    move-result-object v2

    .line 157
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result v3

    const/4 v4, 0x2

    if-gt p1, v3, :cond_3

    .line 158
    invoke-interface {p0, p2, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast p4, Ll/ܺܽܿ;

    .line 80
    iget-object p3, p4, Ll/ܺܽܿ;->᩸:Ll/ᩴܽܿ;

    invoke-static {p3}, Ll/ᩴܽܿ;->ۜ(Ll/ᩴܽܿ;)Ll/ܺᩳܿ;

    move-result-object p4

    invoke-virtual {p4, p0}, Ll/ܺᩳܿ;->֫(Ljava/lang/CharSequence;)V

    .line 81
    invoke-static {p3}, Ll/ᩴܽܿ;->ۧ(Ll/ᩴܽܿ;)Ll/ۖܽܿ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/ۖܽܿ;->֫(Ljava/lang/String;)V

    .line 82
    invoke-static {p3, v4}, Ll/ᩴܽܿ;->ܽ(Ll/ᩴܽܿ;I)V

    .line 83
    invoke-static {p3}, Ll/ᩴܽܿ;->᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_2

    goto/16 :goto_2

    .line 86
    :cond_2
    invoke-static {p3, p2}, Ll/ᩴܽܿ;->ۧ(Ll/ᩴܽܿ;I)V

    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    add-int/2addr p0, p2

    invoke-static {p3, p0}, Ll/ᩴܽܿ;->֫(Ll/ᩴܽܿ;I)V

    return v1

    .line 162
    :cond_3
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ᩳ()V

    .line 163
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result p2

    if-gt p1, p2, :cond_4

    goto/16 :goto_3

    .line 165
    :cond_4
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ۧ()I

    move-result p2

    const/16 v3, 0x3d

    if-eq p2, v3, :cond_5

    goto/16 :goto_3

    .line 168
    :cond_5
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ᩳ()V

    .line 169
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result p2

    if-gt p1, p2, :cond_6

    goto/16 :goto_3

    .line 171
    :cond_6
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result p2

    add-int/2addr p2, v1

    .line 228
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ۧ()I

    move-result v3

    const/16 v5, 0x22

    if-eq v3, v5, :cond_7

    const/16 v5, 0x27

    if-eq v3, v5, :cond_7

    goto/16 :goto_3

    .line 231
    :cond_7
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ۧ()I

    move-result v5

    :goto_0
    const/4 v6, -0x1

    if-eq v5, v6, :cond_8

    if-eq v5, v3, :cond_8

    .line 233
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ۧ()I

    move-result v5

    goto :goto_0

    .line 173
    :cond_8
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result v3

    if-gt p1, v3, :cond_c

    if-gt p2, p1, :cond_d

    .line 174
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result v0

    if-eq p1, v0, :cond_d

    .line 175
    invoke-interface {p0, p2, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast p4, Ll/ܺܽܿ;

    .line 92
    iget-object p4, p4, Ll/ܺܽܿ;->᩸:Ll/ᩴܽܿ;

    invoke-static {p4}, Ll/ᩴܽܿ;->ۜ(Ll/ᩴܽܿ;)Ll/ܺᩳܿ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ܺᩳܿ;->֫(Ljava/lang/CharSequence;)V

    const-string p0, ":"

    .line 95
    invoke-virtual {v2, p0, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    .line 96
    array-length v0, p0

    if-ne v0, v4, :cond_9

    .line 97
    invoke-static {p4}, Ll/ᩴܽܿ;->ۜ(Ll/ᩴܽܿ;)Ll/ܺᩳܿ;

    move-result-object v0

    aget-object p3, p0, p3

    invoke-virtual {v0, p3}, Ll/ܺᩳܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 98
    aget-object v2, p0, v1

    goto :goto_1

    :cond_9
    const-string p3, ""

    .line 101
    :goto_1
    invoke-static {p4}, Ll/ᩴܽܿ;->֫(Ll/ᩴܽܿ;)Ll/۫ܽܽ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۫ܽܽ;->ۧ()Ll/ܿᩳܽ;

    move-result-object p0

    invoke-static {p4}, Ll/ᩴܽܿ;->ܳ(Ll/ᩴܽܿ;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p3, v2, v0}, Ll/ܿᩳܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll/ܽᩳܽ;

    move-result-object p0

    if-nez p0, :cond_a

    goto :goto_2

    .line 105
    :cond_a
    invoke-static {p4}, Ll/ᩴܽܿ;->ܽ(Ll/ᩴܽܿ;)Ll/ۘܽܿ;

    move-result-object p3

    invoke-virtual {p3, p0, p1}, Ll/ۘܽܿ;->֫(Ll/ܽᩳܽ;Ljava/lang/String;)V

    .line 106
    invoke-static {p4, v1}, Ll/ᩴܽܿ;->ܽ(Ll/ᩴܽܿ;I)V

    .line 107
    invoke-static {p4}, Ll/ᩴܽܿ;->᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_b

    :goto_2
    return v1

    .line 111
    :cond_b
    invoke-static {p4, p2}, Ll/ᩴܽܿ;->ۧ(Ll/ᩴܽܿ;I)V

    .line 112
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    add-int/2addr p0, p2

    invoke-static {p4, p0}, Ll/ᩴܽܿ;->֫(Ll/ᩴܽܿ;I)V

    return v1

    .line 182
    :cond_c
    invoke-virtual {v0}, Ll/ۘᩳܿ;->ᩳ()V

    .line 183
    invoke-virtual {v0}, Ll/ۘᩳܿ;->֫()I

    move-result p2

    if-gt p1, p2, :cond_1

    :cond_d
    :goto_3
    return p3
.end method

.method public static ֫(Ljava/lang/CharSequence;ILl/ۖᩳܿ;)Z
    .locals 4

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    add-int/lit8 p1, p1, -0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_1

    .line 127
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 128
    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 130
    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 132
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-lez p0, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p0

    const/16 p1, 0x3c

    if-ne p0, p1, :cond_2

    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 134
    check-cast p2, Ll/ܺܽܿ;

    .line 75
    iget-object p0, p2, Ll/ܺܽܿ;->᩸:Ll/ᩴܽܿ;

    invoke-static {p0}, Ll/ᩴܽܿ;->᩻(Ll/ᩴܽܿ;)Ll/ܶܽܿ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public static ۧ(Ljava/lang/CharSequence;ILl/ۖᩳܿ;)V
    .locals 13

    if-lez p1, :cond_12

    .line 14
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto/16 :goto_6

    .line 20
    :cond_0
    sget-object v0, Ll/ᩴᩳܿ;->֫:Ll/ۨۘܽ;

    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v1

    .line 21
    sget-object v2, Ll/ᩴᩳܿ;->ۧ:Ll/ۨۘܽ;

    invoke-virtual {v2, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    .line 26
    invoke-virtual {v1, v5}, Ll/۫ۘܽ;->find(I)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v6

    if-eqz v6, :cond_11

    :goto_1
    if-eqz v4, :cond_3

    const/4 v4, 0x0

    .line 29
    :cond_3
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v6

    if-gt p1, v6, :cond_4

    .line 30
    invoke-static {p0, p1, p2}, Ll/ᩴᩳܿ;->֫(Ljava/lang/CharSequence;ILl/ۖᩳܿ;)Z

    move-result p0

    if-nez p0, :cond_13

    .line 31
    check-cast p2, Ll/ܺܽܿ;

    invoke-virtual {p2}, Ll/ܺܽܿ;->֫()V

    return-void

    .line 35
    :cond_4
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v6

    const-string v7, "<!--"

    .line 37
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    const-string v9, "-->"

    if-eqz v8, :cond_6

    .line 38
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v6

    add-int/lit8 v6, v6, 0x4

    invoke-static {p0, v9, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v6

    if-ne v6, v3, :cond_5

    .line 41
    check-cast p2, Ll/ܺܽܿ;

    invoke-virtual {p2}, Ll/ܺܽܿ;->֫()V

    return-void

    :cond_5
    add-int/lit8 v6, v6, 0x3

    if-ge p1, v6, :cond_1

    .line 46
    check-cast p2, Ll/ܺܽܿ;

    invoke-virtual {p2}, Ll/ܺܽܿ;->֫()V

    return-void

    :cond_6
    const-string v8, ">"

    .line 53
    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 54
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v6

    if-ge p1, v6, :cond_1

    .line 56
    check-cast p2, Ll/ܺܽܿ;

    invoke-virtual {p2}, Ll/ܺܽܿ;->֫()V

    return-void

    .line 62
    :cond_7
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v6

    .line 64
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v8

    .line 96
    invoke-virtual {v2, v8}, Ll/۫ۘܽ;->find(I)Z

    move-result v10

    const/4 v11, -0x2

    if-nez v10, :cond_8

    goto :goto_3

    .line 98
    :cond_8
    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v10

    .line 99
    invoke-virtual {v10, v8}, Ll/۫ۘܽ;->find(I)Z

    move-result v8

    if-eqz v8, :cond_d

    .line 100
    :goto_2
    invoke-virtual {v10}, Ll/۫ۘܽ;->start()I

    move-result v8

    invoke-virtual {v2}, Ll/۫ۘܽ;->start()I

    move-result v12

    if-le v8, v12, :cond_9

    goto :goto_4

    .line 102
    :cond_9
    invoke-virtual {v10}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v8

    .line 103
    invoke-virtual {v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_c

    .line 104
    invoke-virtual {v10}, Ll/۫ۘܽ;->start()I

    move-result v8

    add-int/lit8 v8, v8, 0x4

    invoke-static {p0, v9, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v8

    if-ne v8, v3, :cond_a

    goto :goto_3

    :cond_a
    add-int/lit8 v8, v8, 0x3

    .line 109
    invoke-virtual {v2}, Ll/۫ۘܽ;->start()I

    move-result v12

    if-ge v12, v8, :cond_b

    invoke-virtual {v2, v8}, Ll/۫ۘܽ;->find(I)Z

    move-result v12

    if-nez v12, :cond_b

    :goto_3
    const/4 v7, -0x1

    goto :goto_5

    .line 111
    :cond_b
    invoke-virtual {v10, v8}, Ll/۫ۘܽ;->find(I)Z

    move-result v8

    if-eqz v8, :cond_d

    goto :goto_2

    .line 117
    :cond_c
    invoke-virtual {v10}, Ll/۫ۘܽ;->start()I

    move-result v7

    goto :goto_5

    :cond_d
    :goto_4
    const/4 v7, -0x2

    :goto_5
    if-ne v7, v11, :cond_e

    .line 67
    invoke-virtual {v2}, Ll/۫ۘܽ;->end()I

    move-result v7

    .line 68
    invoke-virtual {v2}, Ll/۫ۘܽ;->end()I

    move-result v8

    if-ge p1, v8, :cond_1

    .line 69
    invoke-static {p0, p1, v6, v7, p2}, Ll/ᩴᩳܿ;->֫(Ljava/lang/CharSequence;IIILl/ۖᩳܿ;)Z

    move-result p0

    if-nez p0, :cond_13

    .line 70
    check-cast p2, Ll/ܺܽܿ;

    invoke-virtual {p2}, Ll/ܺܽܿ;->֫()V

    return-void

    :cond_e
    if-ne v7, v3, :cond_f

    .line 74
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 75
    invoke-static {p0, p1, v6, v0, p2}, Ll/ᩴᩳܿ;->֫(Ljava/lang/CharSequence;IIILl/ۖᩳܿ;)Z

    move-result p0

    if-nez p0, :cond_13

    .line 76
    check-cast p2, Ll/ܺܽܿ;

    invoke-virtual {p2}, Ll/ܺܽܿ;->֫()V

    return-void

    :cond_f
    if-gt p1, v7, :cond_10

    .line 80
    invoke-static {p0, p1, p2}, Ll/ᩴᩳܿ;->֫(Ljava/lang/CharSequence;ILl/ۖᩳܿ;)Z

    move-result p0

    if-nez p0, :cond_13

    .line 81
    check-cast p2, Ll/ܺܽܿ;

    invoke-virtual {p2}, Ll/ܺܽܿ;->֫()V

    return-void

    :cond_10
    const/4 v4, 0x1

    move v5, v7

    goto/16 :goto_0

    .line 88
    :cond_11
    invoke-static {p0, p1, p2}, Ll/ᩴᩳܿ;->֫(Ljava/lang/CharSequence;ILl/ۖᩳܿ;)Z

    move-result p0

    if-nez p0, :cond_13

    .line 89
    check-cast p2, Ll/ܺܽܿ;

    invoke-virtual {p2}, Ll/ܺܽܿ;->֫()V

    return-void

    .line 15
    :cond_12
    :goto_6
    invoke-static {p0, p1, p2}, Ll/ᩴᩳܿ;->֫(Ljava/lang/CharSequence;ILl/ۖᩳܿ;)Z

    move-result p0

    if-nez p0, :cond_13

    .line 16
    check-cast p2, Ll/ܺܽܿ;

    invoke-virtual {p2}, Ll/ܺܽܿ;->֫()V

    :cond_13
    return-void
.end method
