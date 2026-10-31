.class public Ll/۟ۙ᩵;
.super Ll/᩺ۙ᩵;
.source "D94Y"


# direct methods
.method public static final ֫(ILjava/lang/CharSequence;Ljava/lang/String;Z)I
    .locals 6

    const-string v0, "<this>"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "string"

    .line 10
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_1

    .line 1138
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 1141
    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1, p2, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result p0

    return p0

    .line 1139
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p2

    move v2, p0

    move v4, p3

    .line 1008
    invoke-static/range {v0 .. v5}, Ll/۟ۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I

    move-result p0

    return p0
.end method

.method public static final ֫(Ljava/lang/CharSequence;)I
    .locals 1

    const-string v0, "<this>"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static synthetic ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZ)I
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 1008
    invoke-static/range {v0 .. v5}, Ll/۟ۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I

    move-result p0

    return p0
.end method

.method public static final ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I
    .locals 7

    const/4 v0, -0x1

    if-nez p5, :cond_2

    .line 1010
    new-instance p5, Ll/ۙ᩶᩵;

    if-gez p2, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le p3, v1, :cond_1

    move p3, v1

    :cond_1
    const/4 v1, 0x1

    .line 54
    invoke-direct {p5, p2, p3, v1}, Ll/᩹᩶᩵;-><init>(III)V

    goto :goto_0

    .line 1012
    :cond_2
    invoke-static {p0}, Ll/۟ۙ᩵;->֫(Ljava/lang/CharSequence;)I

    move-result p5

    if-le p2, p5, :cond_3

    move p2, p5

    :cond_3
    if-gez p3, :cond_4

    const/4 p3, 0x0

    .line 134
    :cond_4
    new-instance p5, Ll/᩹᩶᩵;

    invoke-direct {p5, p2, p3, v0}, Ll/᩹᩶᩵;-><init>(III)V

    .line 1014
    :goto_0
    instance-of p2, p0, Ljava/lang/String;

    if-eqz p2, :cond_8

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_8

    .line 1015
    invoke-virtual {p5}, Ll/᩹᩶᩵;->getFirst()I

    move-result p2

    invoke-virtual {p5}, Ll/᩹᩶᩵;->getLast()I

    move-result p3

    invoke-virtual {p5}, Ll/᩹᩶᩵;->ۧ()I

    move-result p5

    if-lez p5, :cond_5

    if-le p2, p3, :cond_6

    :cond_5
    if-gez p5, :cond_f

    if-gt p3, p2, :cond_f

    .line 1016
    :cond_6
    :goto_1
    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    move-object v5, p0

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v1, 0x0

    move v2, p2

    move v6, p4

    invoke-static/range {v1 .. v6}, Ll/᩺ۙ᩵;->֫(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_7

    return p2

    :cond_7
    if-eq p2, p3, :cond_f

    add-int/2addr p2, p5

    goto :goto_1

    .line 1020
    :cond_8
    invoke-virtual {p5}, Ll/᩹᩶᩵;->getFirst()I

    move-result p2

    invoke-virtual {p5}, Ll/᩹᩶᩵;->getLast()I

    move-result p3

    invoke-virtual {p5}, Ll/᩹᩶᩵;->ۧ()I

    move-result p5

    if-lez p5, :cond_9

    if-le p2, p3, :cond_a

    :cond_9
    if-gez p5, :cond_f

    if-gt p3, p2, :cond_f

    .line 1021
    :cond_a
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-string v2, "other"

    invoke-static {p0, v2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_e

    .line 857
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v2, v1

    if-ltz v2, :cond_e

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v2, v1

    if-le p2, v2, :cond_b

    goto :goto_4

    :cond_b
    const/4 v2, 0x0

    :goto_3
    if-ge v2, v1, :cond_d

    .line 862
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    add-int v4, p2, v2

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v3, v4, p4}, Ll/֨ۙ᩵;->֫(CCZ)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_4

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_d
    return p2

    :cond_e
    :goto_4
    if-eq p2, p3, :cond_f

    add-int/2addr p2, p5

    goto :goto_2

    :cond_f
    return v0
.end method

.method public static synthetic ۧ(ILjava/lang/CharSequence;Ljava/lang/String;Z)I
    .locals 1

    and-int/lit8 p0, p0, 0x4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const/4 p3, 0x0

    .line 1137
    :cond_0
    invoke-static {v0, p1, p2, p3}, Ll/۟ۙ᩵;->֫(ILjava/lang/CharSequence;Ljava/lang/String;Z)I

    move-result p0

    return p0
.end method
