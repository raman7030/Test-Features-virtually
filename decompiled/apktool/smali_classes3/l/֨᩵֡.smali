.class public final Ll/֨᩵֡;
.super Ll/ܺ֨֡;
.source "Z90G"


# virtual methods
.method public final ֫(Ll/᩵᩵֡;Ll/ᩴ֨֡;)Ll/᩷᩵֡;
    .locals 13

    .line 45
    invoke-virtual {p1}, Ll/᩵᩵֡;->ܽ()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    goto/16 :goto_b

    .line 49
    :cond_0
    invoke-virtual {p1}, Ll/᩵᩵֡;->getLine()Ll/ܽ֨֡;

    move-result-object v0

    .line 50
    invoke-virtual {p1}, Ll/᩵᩵֡;->ᩳ()I

    move-result p1

    .line 51
    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x23

    if-ne v1, v5, :cond_c

    .line 53
    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/ܽ֨֡;->֫(II)Ll/ܽ֨֡;

    move-result-object v1

    .line 21
    new-instance v6, Ll/ᩳ֨֡;

    invoke-direct {v6}, Ll/ᩳ֨֡;-><init>()V

    .line 22
    invoke-virtual {v6, v1}, Ll/ᩳ֨֡;->֫(Ll/ܽ֨֡;)V

    .line 79
    invoke-static {v6}, Ll/ۢ֨֡;->֫(Ll/ᩳ֨֡;)Ll/ۢ֨֡;

    move-result-object v1

    .line 80
    invoke-virtual {v1, v5}, Ll/ۢ֨֡;->ۧ(C)I

    move-result v6

    if-eqz v6, :cond_b

    const/4 v7, 0x6

    if-le v6, v7, :cond_1

    goto/16 :goto_3

    .line 86
    :cond_1
    invoke-virtual {v1}, Ll/ۢ֨֡;->֫()Z

    move-result v7

    if-nez v7, :cond_2

    .line 88
    new-instance v1, Ll/۠᩵֡;

    .line 17
    new-instance v5, Ll/ᩳ֨֡;

    invoke-direct {v5}, Ll/ᩳ֨֡;-><init>()V

    .line 88
    invoke-direct {v1, v6, v5}, Ll/۠᩵֡;-><init>(ILl/ᩳ֨֡;)V

    goto/16 :goto_4

    .line 91
    :cond_2
    invoke-virtual {v1}, Ll/ۢ֨֡;->ܽ()C

    move-result v7

    const/16 v8, 0x9

    const/16 v9, 0x20

    if-eq v7, v9, :cond_3

    if-eq v7, v8, :cond_3

    goto/16 :goto_3

    .line 96
    :cond_3
    invoke-virtual {v1}, Ll/ۢ֨֡;->᩻()I

    .line 97
    invoke-virtual {v1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v7

    move-object v10, v7

    :goto_0
    const/4 v11, 0x1

    .line 101
    :goto_1
    invoke-virtual {v1}, Ll/ۢ֨֡;->֫()Z

    move-result v12

    if-eqz v12, :cond_9

    .line 102
    invoke-virtual {v1}, Ll/ۢ֨֡;->ܽ()C

    move-result v12

    if-eq v12, v8, :cond_8

    if-eq v12, v9, :cond_8

    if-eq v12, v5, :cond_4

    .line 126
    invoke-virtual {v1}, Ll/ۢ֨֡;->ۧ()V

    .line 127
    invoke-virtual {v1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v10

    goto :goto_2

    :cond_4
    if-eqz v11, :cond_7

    .line 106
    invoke-virtual {v1, v5}, Ll/ۢ֨֡;->ۧ(C)I

    .line 107
    invoke-virtual {v1}, Ll/ۢ֨֡;->᩻()I

    move-result v11

    .line 110
    invoke-virtual {v1}, Ll/ۢ֨֡;->֫()Z

    move-result v12

    if-eqz v12, :cond_5

    .line 111
    invoke-virtual {v1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v10

    :cond_5
    if-lez v11, :cond_6

    goto :goto_0

    :cond_6
    :goto_2
    const/4 v11, 0x0

    goto :goto_1

    .line 115
    :cond_7
    invoke-virtual {v1}, Ll/ۢ֨֡;->ۧ()V

    .line 116
    invoke-virtual {v1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v10

    goto :goto_1

    .line 122
    :cond_8
    invoke-virtual {v1}, Ll/ۢ֨֡;->ۧ()V

    goto :goto_0

    .line 131
    :cond_9
    invoke-virtual {v1, v7, v10}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;

    move-result-object v1

    .line 132
    invoke-virtual {v1}, Ll/ᩳ֨֡;->֫()Ljava/lang/String;

    move-result-object v5

    .line 133
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 134
    new-instance v1, Ll/۠᩵֡;

    .line 17
    new-instance v5, Ll/ᩳ֨֡;

    invoke-direct {v5}, Ll/ᩳ֨֡;-><init>()V

    .line 134
    invoke-direct {v1, v6, v5}, Ll/۠᩵֡;-><init>(ILl/ᩳ֨֡;)V

    goto :goto_4

    .line 136
    :cond_a
    new-instance v5, Ll/۠᩵֡;

    invoke-direct {v5, v6, v1}, Ll/۠᩵֡;-><init>(ILl/ᩳ֨֡;)V

    move-object v1, v5

    goto :goto_4

    :cond_b
    :goto_3
    move-object v1, v2

    :goto_4
    if-eqz v1, :cond_c

    new-array p1, v3, [Ll/ۖ֨֡;

    aput-object v1, p1, v4

    .line 17
    new-instance p2, Ll/᩷᩵֡;

    invoke-direct {p2, p1}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 55
    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {p2, p1}, Ll/᩷᩵֡;->ۧ(I)Ll/᩷᩵֡;

    return-object p2

    .line 59
    :cond_c
    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    .line 142
    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x2d

    if-eq v5, v6, :cond_10

    const/16 v6, 0x3d

    if-eq v5, v6, :cond_d

    goto :goto_9

    :cond_d
    add-int/2addr p1, v3

    .line 158
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    :goto_5
    if-ge p1, v5, :cond_f

    .line 117
    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-eq v7, v6, :cond_e

    move v5, p1

    goto :goto_6

    :cond_e
    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    .line 159
    :cond_f
    :goto_6
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {v5, p1, v1}, Ll/ۡ۠ۘ;->֫(IILjava/lang/CharSequence;)I

    move-result p1

    .line 160
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt p1, v1, :cond_13

    const/4 p1, 0x1

    goto :goto_a

    :cond_10
    add-int/2addr p1, v3

    .line 158
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    :goto_7
    if-ge p1, v5, :cond_12

    .line 117
    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-eq v7, v6, :cond_11

    move v5, p1

    goto :goto_8

    :cond_11
    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    .line 159
    :cond_12
    :goto_8
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {v5, p1, v1}, Ll/ۡ۠ۘ;->֫(IILjava/lang/CharSequence;)I

    move-result p1

    .line 160
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt p1, v1, :cond_13

    const/4 p1, 0x2

    goto :goto_a

    :cond_13
    :goto_9
    const/4 p1, 0x0

    :goto_a
    if-lez p1, :cond_14

    .line 61
    check-cast p2, Ll/ۘ᩵֡;

    invoke-virtual {p2}, Ll/ۘ᩵֡;->ۧ()Ll/ᩳ֨֡;

    move-result-object p2

    .line 62
    invoke-virtual {p2}, Ll/ᩳ֨֡;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_14

    .line 63
    new-instance v1, Ll/۠᩵֡;

    invoke-direct {v1, p1, p2}, Ll/۠᩵֡;-><init>(ILl/ᩳ֨֡;)V

    new-array p1, v3, [Ll/ۖ֨֡;

    aput-object v1, p1, v4

    .line 17
    new-instance v1, Ll/᩷᩵֡;

    invoke-direct {v1, p1}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 64
    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {v1, p1}, Ll/᩷᩵֡;->ۧ(I)Ll/᩷᩵֡;

    .line 65
    invoke-virtual {p2}, Ll/ᩳ֨֡;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ll/᩷᩵֡;->ܽ(I)Ll/᩷᩵֡;

    return-object v1

    :cond_14
    :goto_b
    return-object v2
.end method
