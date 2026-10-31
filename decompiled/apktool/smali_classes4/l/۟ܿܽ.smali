.class public final Ll/۟ܿܽ;
.super Ll/ܽܳܽ;
.source "I1EW"


# virtual methods
.method public final ֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V
    .locals 11

    .line 25
    invoke-interface {p2}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 28
    invoke-interface {p2}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {p2}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v0

    invoke-interface {v0}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v0

    const/high16 v1, 0x1000000

    if-ne v0, v1, :cond_15

    invoke-interface {p2}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v0

    invoke-interface {v0}, Ll/֨᩻ܽ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v0, "attr"

    .line 32
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    .line 33
    invoke-interface {p2}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "name"

    invoke-interface {p1, v2, v1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    invoke-interface {p2}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/֨᩻ܽ;->getValue()I

    move-result v1

    const v3, 0xffff

    const/4 v4, 0x0

    if-eq v1, v3, :cond_b

    .line 37
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    and-int/lit8 v6, v1, 0x1

    if-eqz v6, :cond_1

    const-string v6, "reference"

    .line 39
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    and-int/lit8 v6, v1, 0x2

    if-eqz v6, :cond_2

    const-string v6, "string"

    .line 41
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_3

    const-string v6, "integer"

    .line 43
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_4

    const-string v6, "boolean"

    .line 45
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_5

    const-string v6, "color"

    .line 47
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    and-int/lit8 v6, v1, 0x20

    if-eqz v6, :cond_6

    const-string v6, "float"

    .line 49
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    and-int/lit8 v6, v1, 0x40

    if-eqz v6, :cond_7

    const-string v6, "dimension"

    .line 51
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    and-int/lit16 v6, v1, 0x80

    if-eqz v6, :cond_8

    const-string v6, "fraction"

    .line 53
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    const/high16 v6, 0x10000

    and-int/2addr v6, v1

    if-eqz v6, :cond_9

    const-string v6, "enum"

    .line 56
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_9
    move-object v6, v4

    :goto_0
    const/high16 v7, 0x20000

    and-int/2addr v1, v7

    if-eqz v1, :cond_a

    const-string v1, "flags"

    .line 60
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "flag"

    :cond_a
    const/16 v1, 0x7c

    .line 63
    invoke-static {v5, v1}, Ll/ۢܺ֡;->֫(Ljava/util/Collection;C)Ljava/lang/String;

    move-result-object v1

    const-string v5, "format"

    invoke-interface {p1, v5, v1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_b
    move-object v6, v4

    .line 65
    :goto_1
    invoke-static {p1, p2, p4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ᩳܳܽ;)V

    .line 66
    invoke-interface {p2}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    .line 67
    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v1

    const-string v5, "id"

    invoke-interface {v1, v5}, Ll/ۘ᩻ܽ;->getType(Ljava/lang/String;)Ll/֡᩻ܽ;

    move-result-object v1

    const/4 v5, 0x0

    if-eqz v1, :cond_d

    .line 68
    invoke-interface {v1}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v7

    if-nez v7, :cond_c

    goto :goto_2

    :cond_c
    invoke-interface {v1, v5}, Ll/֡᩻ܽ;->ܿ(I)Ll/ۜ᩻ܽ;

    move-result-object v4

    .line 69
    :cond_d
    :goto_2
    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v7

    invoke-interface {v7}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v7

    shl-int/lit8 v7, v7, 0x18

    const/16 v8, 0x10

    if-eqz v1, :cond_e

    .line 71
    invoke-interface {v1}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v1

    shl-int/2addr v1, v8

    or-int/2addr v7, v1

    :cond_e
    :goto_3
    if-ge v5, p4, :cond_14

    add-int/lit8 v5, v5, 0x1

    .line 74
    invoke-interface {p2, v5}, Ll/᩷᩻ܽ;->getValue(I)Ll/֨᩻ܽ;

    move-result-object v1

    if-eqz v6, :cond_13

    .line 99
    invoke-interface {v1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v9

    if-eq v9, v8, :cond_f

    .line 100
    invoke-interface {v1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v9

    const/16 v10, 0x11

    if-ne v9, v10, :cond_13

    :cond_f
    if-eqz v4, :cond_12

    .line 80
    invoke-interface {v1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v9

    const/high16 v10, -0x10000

    and-int/2addr v9, v10

    if-eq v9, v7, :cond_10

    goto :goto_4

    .line 83
    :cond_10
    invoke-interface {v1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v9

    and-int/2addr v9, v3

    invoke-interface {v4, v9}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v9

    if-nez v9, :cond_11

    .line 85
    invoke-interface {v1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v9

    invoke-static {v9}, Ll/ۢۤۡ;->֫(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 87
    :cond_11
    invoke-interface {v9}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 81
    :cond_12
    :goto_4
    invoke-interface {v1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v9

    invoke-static {v9}, Ll/ۢۤۡ;->֫(I)Ljava/lang/String;

    move-result-object v9

    .line 90
    :goto_5
    invoke-interface {p1, v6}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    .line 91
    invoke-interface {p1, v2, v9}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-static {p3, v1}, Ll/ۢܳܽ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v9, "value"

    invoke-interface {p1, v9, v1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-interface {p1, v6}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    goto :goto_3

    .line 76
    :cond_13
    invoke-static {p1, v1, p3}, Ll/ܽܳܽ;->֫(Ll/ܰܿܽ;Ll/֨᩻ܽ;Ll/ܳܳܽ;)V

    goto :goto_3

    .line 95
    :cond_14
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 29
    :cond_15
    :goto_6
    invoke-super {p0, p1, p2, p3, p4}, Ll/ܽܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V

    return-void

    .line 26
    :cond_16
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
