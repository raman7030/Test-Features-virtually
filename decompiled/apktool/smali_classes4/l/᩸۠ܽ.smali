.class public final Ll/᩸۠ܽ;
.super Ljava/lang/Object;
.source "M6VT"


# direct methods
.method public static ֫(IZLl/۠۠ܽ;ILjava/lang/CharSequence;)Z
    .locals 8

    const/16 v0, 0x2029

    const/16 v1, 0x85

    const/16 v2, 0xd

    const/16 v3, 0xa

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch p0, :pswitch_data_0

    .line 98
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown zero-width anchor: "

    .line 0
    invoke-static {p0, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 98
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 96
    :pswitch_0
    invoke-virtual {p2}, Ll/۠۠ܽ;->֨()I

    move-result p0

    if-ne p3, p0, :cond_14

    goto/16 :goto_4

    .line 84
    :pswitch_1
    iget-boolean p0, p2, Ll/۠۠ܽ;->ܽ:Z

    if-eqz p0, :cond_0

    iget p0, p2, Ll/۠۠ܽ;->ܽ֫:I

    goto :goto_0

    .line 961
    :cond_0
    iget-object p0, p2, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    :goto_0
    if-ge p3, p0, :cond_3

    .line 86
    invoke-interface {p4, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p4

    if-eq p4, v3, :cond_1

    goto/16 :goto_5

    :cond_1
    if-nez p1, :cond_2

    sub-int/2addr p0, v5

    if-eq p3, p0, :cond_2

    goto/16 :goto_5

    :cond_2
    if-eqz p1, :cond_3

    goto/16 :goto_4

    .line 91
    :cond_3
    iput-boolean v5, p2, Ll/۠۠ܽ;->ܺ:Z

    .line 92
    iput-boolean v5, p2, Ll/۠۠ܽ;->ۤ:Z

    return v5

    .line 57
    :pswitch_2
    iget-boolean p0, p2, Ll/۠۠ܽ;->ܽ:Z

    if-eqz p0, :cond_4

    iget p0, p2, Ll/۠۠ܽ;->ܽ֫:I

    goto :goto_1

    .line 961
    :cond_4
    iget-object p0, p2, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    :goto_1
    if-nez p1, :cond_7

    add-int/lit8 v6, p0, -0x2

    if-ge p3, v6, :cond_5

    goto/16 :goto_5

    :cond_5
    if-ne p3, v6, :cond_7

    .line 61
    invoke-interface {p4, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-eq v6, v2, :cond_6

    goto/16 :goto_5

    :cond_6
    add-int/lit8 v6, p3, 0x1

    .line 63
    invoke-interface {p4, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-eq v6, v3, :cond_7

    goto/16 :goto_5

    :cond_7
    if-ge p3, p0, :cond_b

    .line 68
    invoke-interface {p4, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    if-ne p0, v3, :cond_9

    if-lez p3, :cond_8

    sub-int/2addr p3, v5

    .line 71
    invoke-interface {p4, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    if-ne p0, v2, :cond_8

    goto/16 :goto_5

    :cond_8
    if-eqz p1, :cond_b

    goto/16 :goto_4

    :cond_9
    if-eq p0, v2, :cond_a

    if-eq p0, v1, :cond_a

    or-int/2addr p0, v5

    if-ne p0, v0, :cond_14

    :cond_a
    if-eqz p1, :cond_b

    goto :goto_4

    .line 79
    :cond_b
    iput-boolean v5, p2, Ll/۠۠ܽ;->ܺ:Z

    .line 80
    iput-boolean v5, p2, Ll/۠۠ܽ;->ۤ:Z

    return v5

    .line 35
    :pswitch_3
    iget p1, p2, Ll/۠۠ܽ;->ۜ:I

    .line 36
    iget v6, p2, Ll/۠۠ܽ;->ܽ֫:I

    .line 37
    iget-boolean v7, p2, Ll/۠۠ܽ;->ܽ:Z

    if-nez v7, :cond_c

    .line 961
    iget-object p1, p2, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    const/4 p1, 0x0

    :cond_c
    if-ne p3, v6, :cond_d

    .line 43
    iput-boolean v5, p2, Ll/۠۠ܽ;->ܺ:Z

    return v4

    :cond_d
    if-le p3, p1, :cond_13

    add-int/lit8 p1, p3, -0x1

    .line 47
    invoke-interface {p4, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    const/4 p2, 0x3

    if-ne p0, p2, :cond_e

    if-ne p1, v3, :cond_14

    goto :goto_4

    :cond_e
    if-eq p1, v3, :cond_f

    if-eq p1, v2, :cond_f

    or-int/lit8 p0, p1, 0x1

    if-eq p0, v0, :cond_f

    if-eq p1, v1, :cond_f

    goto :goto_5

    :cond_f
    if-ne p1, v2, :cond_13

    .line 52
    invoke-interface {p4, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    if-ne p0, v3, :cond_13

    goto :goto_5

    .line 28
    :pswitch_4
    iget-boolean p0, p2, Ll/۠۠ܽ;->ܽ:Z

    if-eqz p0, :cond_10

    iget p0, p2, Ll/۠۠ܽ;->ܽ֫:I

    goto :goto_2

    .line 961
    :cond_10
    iget-object p0, p2, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    :goto_2
    if-eq p3, p0, :cond_11

    goto :goto_5

    .line 30
    :cond_11
    iput-boolean v5, p2, Ll/۠۠ܽ;->ܺ:Z

    return v5

    .line 26
    :pswitch_5
    iget-boolean p0, p2, Ll/۠۠ܽ;->ܽ:Z

    if-eqz p0, :cond_12

    iget p0, p2, Ll/۠۠ܽ;->ۜ:I

    goto :goto_3

    :cond_12
    const/4 p0, 0x0

    :goto_3
    if-ne p3, p0, :cond_14

    :cond_13
    :goto_4
    return v5

    :cond_14
    :goto_5
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۗ᩵ܽ;Ll/۠۠ܽ;IILjava/lang/CharSequence;)Z
    .locals 10

    const/16 v0, 0x80

    const/16 v1, 0x39

    const/16 v2, 0x30

    const/16 v3, 0x5a

    const/16 v4, 0x41

    const/16 v5, 0x7a

    const/16 v6, 0x61

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ge p2, v0, :cond_3

    if-lt p2, v6, :cond_0

    if-le p2, v5, :cond_13

    :cond_0
    if-lt p2, v4, :cond_1

    if-le p2, v3, :cond_13

    :cond_1
    if-lt p2, v2, :cond_2

    if-le p2, v1, :cond_13

    :cond_2
    const/16 p0, 0x5f

    if-ne p2, p0, :cond_14

    goto/16 :goto_4

    .line 133
    :cond_3
    iget-boolean v0, p0, Ll/ۗ᩵ܽ;->ܽ:Z

    const/16 v9, 0x7f

    if-eqz v0, :cond_4

    iget-object p0, p0, Ll/ۗ᩵ܽ;->ۧ:Ll/ۧۚܽ;

    invoke-interface {p0, p2}, Ll/ۧۚܽ;->֫(I)Z

    move-result p0

    if-eqz p0, :cond_a

    goto/16 :goto_4

    :cond_4
    sget p0, Ll/֫᩻᩵;->֫:I

    if-le p2, v9, :cond_5

    .line 38
    invoke-static {p2}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result p0

    goto :goto_0

    :cond_5
    if-gt v6, p2, :cond_6

    if-le p2, v5, :cond_8

    :cond_6
    if-gt v4, p2, :cond_7

    if-le p2, v3, :cond_8

    :cond_7
    if-gt v2, p2, :cond_9

    if-gt p2, v1, :cond_9

    :cond_8
    const/4 p0, 0x1

    goto :goto_0

    :cond_9
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_a

    goto :goto_4

    .line 136
    :cond_a
    invoke-static {p2}, Ll/֫᩻᩵;->֫(I)I

    move-result p0

    const/4 p2, 0x6

    if-ne p0, p2, :cond_14

    .line 141
    iget-boolean p0, p1, Ll/۠۠ܽ;->ᩳ֫:Z

    if-eqz p0, :cond_b

    const/4 p0, 0x0

    goto :goto_1

    :cond_b
    iget p0, p1, Ll/۠۠ܽ;->ۜ:I

    :goto_1
    if-lt p3, p0, :cond_12

    .line 143
    invoke-static {p4, p3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result p1

    .line 144
    sget v0, Ll/֫᩻᩵;->֫:I

    if-le p1, v9, :cond_c

    .line 38
    invoke-static {p1}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result v0

    goto :goto_2

    :cond_c
    if-gt v6, p1, :cond_d

    if-le p1, v5, :cond_f

    :cond_d
    if-gt v4, p1, :cond_e

    if-le p1, v3, :cond_f

    :cond_e
    if-gt v2, p1, :cond_10

    if-gt p1, v1, :cond_10

    :cond_f
    const/4 v0, 0x1

    goto :goto_2

    :cond_10
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_11

    const/4 p0, 0x1

    goto :goto_3

    .line 145
    :cond_11
    invoke-static {p1}, Ll/֫᩻᩵;->֫(I)I

    move-result p1

    if-ne p1, p2, :cond_12

    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_12
    const/4 p0, 0x0

    :goto_3
    if-eqz p0, :cond_14

    :cond_13
    :goto_4
    return v8

    :cond_14
    return v7
.end method

.method public static ֫(Ll/ۗ᩵ܽ;Ll/۠۠ܽ;ILjava/lang/CharSequence;)Z
    .locals 4

    .line 104
    iget v0, p1, Ll/۠۠ܽ;->ۜ:I

    .line 105
    iget v1, p1, Ll/۠۠ܽ;->ܽ֫:I

    .line 106
    iget-boolean v2, p1, Ll/۠۠ܽ;->ᩳ֫:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 961
    iget-object v0, p1, Ll/۠۠ܽ;->ۨ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v0, 0x0

    :cond_0
    if-le p2, v0, :cond_1

    .line 112
    invoke-static {p3, p2}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v0

    add-int/lit8 v2, p2, -0x1

    .line 113
    invoke-static {p0, p1, v0, v2, p3}, Ll/᩸۠ܽ;->֫(Ll/ۗ᩵ܽ;Ll/۠۠ܽ;IILjava/lang/CharSequence;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x1

    if-ge p2, v1, :cond_2

    .line 117
    invoke-static {p3, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    .line 118
    invoke-static {p0, p1, v1, p2, p3}, Ll/᩸۠ܽ;->֫(Ll/ۗ᩵ܽ;Ll/۠۠ܽ;IILjava/lang/CharSequence;)Z

    move-result p1

    goto :goto_1

    .line 120
    :cond_2
    iput-boolean v2, p1, Ll/۠۠ܽ;->ܺ:Z

    .line 121
    iput-boolean v2, p1, Ll/۠۠ܽ;->ۤ:Z

    const/4 p1, 0x0

    :goto_1
    xor-int p2, v0, p1

    if-eqz p2, :cond_4

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x2

    goto :goto_2

    :cond_4
    const/4 p1, 0x4

    .line 124
    :goto_2
    iget p0, p0, Ll/ۗ᩵ܽ;->֫:I

    and-int/2addr p0, p1

    if-lez p0, :cond_5

    return v2

    :cond_5
    return v3
.end method
