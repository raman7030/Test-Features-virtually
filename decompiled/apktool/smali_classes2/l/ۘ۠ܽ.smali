.class public final Ll/ۘ۠ܽ;
.super Ljava/lang/Object;
.source "Z6W2"


# instance fields
.field public final ֫:I

.field public final ۜ:I

.field public final ۢ:Ll/ۧۚܽ;

.field public final ۧ:I

.field public final ܳ:Z

.field public final ܽ:I

.field public final ܿ:Ll/ۧۚܽ;

.field public final ᩳ:Z

.field public final ᩷:Ll/ۧۚܽ;

.field public final ᩻:Ll/ۧۚܽ;


# direct methods
.method public constructor <init>(Ll/᩻ۚܽ;ILl/᩻ۚܽ;Ll/ۙ֡ܽ;Ll/᩻ۚܽ;Ll/۬ۚܽ;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iget-object v0, p1, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    iput-object v0, p0, Ll/ۘ۠ܽ;->᩻:Ll/ۧۚܽ;

    .line 22
    invoke-static {p1}, Ll/ۘ۠ܽ;->ۧ(Ll/ۛۚܽ;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۘ۠ܽ;->ܳ:Z

    .line 23
    iput p2, p0, Ll/ۘ۠ܽ;->ܽ:I

    .line 24
    iget-object p1, p3, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    iput-object p1, p0, Ll/ۘ۠ܽ;->ܿ:Ll/ۧۚܽ;

    .line 25
    invoke-static {p3}, Ll/ۘ۠ܽ;->ۧ(Ll/ۛۚܽ;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۘ۠ܽ;->ᩳ:Z

    if-nez p4, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p4, Ll/ۜۚܽ;->ܽ:Ll/ۧۚܽ;

    :goto_0
    iput-object p1, p0, Ll/ۘ۠ܽ;->᩷:Ll/ۧۚܽ;

    if-nez p4, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    .line 27
    :cond_1
    iget p1, p4, Ll/ۜۚܽ;->ۧ:I

    :goto_1
    iput p1, p0, Ll/ۘ۠ܽ;->ۜ:I

    .line 28
    iget-object p1, p5, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    iput-object p1, p0, Ll/ۘ۠ܽ;->ۢ:Ll/ۧۚܽ;

    .line 29
    iget p1, p6, Ll/۬ۚܽ;->ܿ:I

    iput p1, p0, Ll/ۘ۠ܽ;->ۧ:I

    .line 30
    iget p1, p6, Ll/۬ۚܽ;->ᩳ:I

    iput p1, p0, Ll/ۘ۠ܽ;->֫:I

    return-void
.end method

.method public static ֫(Ll/۬ۚܽ;)Ll/ۘ۠ܽ;
    .locals 14

    if-eqz p0, :cond_19

    .line 35
    iget v0, p0, Ll/۬ۚܽ;->ۧ:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/۬ۚܽ;

    if-ne v1, v2, :cond_19

    iget v1, p0, Ll/۬ۚܽ;->ܿ:I

    if-ltz v1, :cond_19

    iget v2, p0, Ll/۬ۚܽ;->ᩳ:I

    if-lt v2, v1, :cond_19

    iget v1, p0, Ll/۬ۚܽ;->᩻:I

    const/4 v2, -0x1

    if-lt v1, v2, :cond_19

    if-ltz v0, :cond_19

    iget v1, p0, Ll/۬ۚܽ;->ܳ:I

    if-ltz v1, :cond_19

    if-eq v0, v1, :cond_19

    iget-object v1, p0, Ll/۬ۚܽ;->ܽ:Ll/ۛۚܽ;

    if-eqz v1, :cond_19

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v3, Ll/ۚۚܽ;

    if-eq v1, v3, :cond_0

    goto/16 :goto_6

    .line 41
    :cond_0
    iget-object v1, p0, Ll/۬ۚܽ;->ܽ:Ll/ۛۚܽ;

    check-cast v1, Ll/ۚۚܽ;

    .line 42
    iget-boolean v3, v1, Ll/ۚۚܽ;->ܽ:Z

    iget v4, v1, Ll/ۚۚܽ;->ۧ:I

    if-eqz v3, :cond_19

    if-ne v4, v0, :cond_19

    iget-object v0, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v0, :cond_19

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v3, Ll/ۨ֡ܽ;

    if-eq v0, v3, :cond_1

    goto/16 :goto_6

    .line 46
    :cond_1
    iget-object v0, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    check-cast v0, Ll/ۨ֡ܽ;

    .line 47
    iget-object v3, v0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    iget-object v5, v0, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    if-eqz v3, :cond_19

    iget v6, v0, Ll/ۨ֡ܽ;->ܿ:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_19

    array-length v3, v3

    if-lt v3, v7, :cond_19

    if-eqz v5, :cond_19

    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v6, Ll/᩺֡ܽ;

    if-ne v3, v6, :cond_19

    iget-object v3, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v3, :cond_19

    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v6, Ll/֨ۚܽ;

    if-eq v3, v6, :cond_2

    goto/16 :goto_6

    .line 52
    :cond_2
    iget-object v3, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    check-cast v3, Ll/֨ۚܽ;

    .line 53
    iget-object v1, v1, Ll/ۚۚܽ;->ᩳ:Ll/֨ۚܽ;

    if-ne v1, v3, :cond_19

    iget-boolean v1, v3, Ll/֨ۚܽ;->ᩳ:Z

    if-eqz v1, :cond_19

    iget v1, v3, Ll/֨ۚܽ;->ۧ:I

    if-nez v1, :cond_19

    iget v1, v3, Ll/֨ۚܽ;->ܽ:I

    if-ne v1, v4, :cond_19

    iget-object v1, v3, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eq v1, p0, :cond_3

    goto/16 :goto_6

    .line 58
    :cond_3
    iget-object v1, v0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    const/4 v3, 0x0

    aget-object v1, v1, v3

    invoke-static {v1}, Ll/ۘ۠ܽ;->֫(Ll/ۛۚܽ;)Ll/᩻ۚܽ;

    move-result-object v1

    .line 59
    iget-object v0, v0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-static {v0}, Ll/ۘ۠ܽ;->֫(Ll/ۛۚܽ;)Ll/᩻ۚܽ;

    move-result-object v0

    if-eqz v1, :cond_19

    if-nez v0, :cond_4

    goto/16 :goto_6

    .line 63
    :cond_4
    iget-object v3, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-ne v3, v5, :cond_5

    move-object v7, v1

    move-object v1, v0

    goto :goto_0

    .line 66
    :cond_5
    iget-object v3, v0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-ne v3, v5, :cond_19

    move-object v7, v0

    .line 72
    :goto_0
    iget-object v0, v1, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-static {v1}, Ll/ۘ۠ܽ;->ۧ(Ll/ۛۚܽ;)Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_6

    .line 73
    :cond_6
    iget-object v1, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-static {v1}, Ll/ۘ۠ܽ;->֫(Ll/ۛۚܽ;)Ll/᩻ۚܽ;

    move-result-object v9

    if-eqz v9, :cond_19

    .line 74
    iget-object v1, v9, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eq v1, v5, :cond_7

    goto/16 :goto_6

    .line 76
    :cond_7
    iget-object v1, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v1, :cond_9

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ll/ۙ֡ܽ;

    if-ne v3, v4, :cond_9

    .line 79
    check-cast v1, Ll/ۙ֡ܽ;

    .line 80
    iget v3, v1, Ll/ۜۚܽ;->ۧ:I

    if-ltz v3, :cond_19

    iget-object v3, v1, Ll/ۜۚܽ;->ܽ:Ll/ۧۚܽ;

    if-nez v3, :cond_8

    goto/16 :goto_6

    .line 81
    :cond_8
    iget-object v3, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    move-object v10, v1

    move-object v1, v3

    goto :goto_1

    :cond_9
    const/4 v3, 0x0

    move-object v10, v3

    .line 83
    :goto_1
    invoke-static {v1}, Ll/ۘ۠ܽ;->ۧ(Ll/ۛۚܽ;)Z

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_6

    .line 84
    :cond_a
    move-object v11, v1

    check-cast v11, Ll/᩻ۚܽ;

    .line 85
    iget-object v1, v11, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    if-eqz v1, :cond_19

    iget-object v3, v11, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eqz v3, :cond_19

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ll/ܶۚܽ;

    if-eq v3, v4, :cond_b

    goto/16 :goto_6

    .line 91
    :cond_b
    invoke-static {v7}, Ll/ۘ۠ܽ;->ۧ(Ll/ۛۚܽ;)Z

    move-result v3

    .line 92
    invoke-static {v0}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v4

    .line 93
    invoke-static {v1}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v5

    .line 92
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-eqz v10, :cond_c

    .line 94
    iget-object v5, v10, Ll/ۜۚܽ;->ܽ:Ll/ۧۚܽ;

    invoke-static {v5}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_c
    const/4 v5, 0x0

    const/4 v8, -0x1

    :goto_2
    if-ge v5, v4, :cond_17

    .line 96
    invoke-interface {v0, v5}, Ll/ۧۚܽ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_e

    if-gez v8, :cond_19

    int-to-char v6, v5

    .line 98
    invoke-static {v6}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_6

    :cond_d
    move v8, v5

    .line 101
    :cond_e
    invoke-interface {v1, v5}, Ll/ۧۚܽ;->֫(I)Z

    move-result v6

    const/4 v12, 0x0

    if-eqz v10, :cond_f

    .line 102
    iget-object v13, v10, Ll/ۜۚܽ;->ܽ:Ll/ۧۚܽ;

    invoke-interface {v13, v5}, Ll/ۧۚܽ;->֫(I)Z

    move-result v13

    if-eqz v13, :cond_f

    const/4 v13, 0x1

    goto :goto_3

    :cond_f
    const/4 v13, 0x0

    :goto_3
    if-eqz v6, :cond_10

    if-eqz v13, :cond_10

    goto :goto_7

    :cond_10
    if-nez v6, :cond_12

    if-eqz v13, :cond_11

    goto :goto_4

    :cond_11
    const/4 v6, 0x0

    goto :goto_5

    :cond_12
    :goto_4
    const/4 v6, 0x1

    :goto_5
    if-nez v3, :cond_13

    if-eqz v6, :cond_13

    int-to-char v13, v5

    .line 106
    invoke-static {v13}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v13

    if-eqz v13, :cond_13

    goto :goto_7

    :cond_13
    if-eqz v2, :cond_14

    if-eqz v6, :cond_14

    goto :goto_7

    :cond_14
    if-nez v2, :cond_15

    if-eqz v6, :cond_16

    .line 108
    :cond_15
    iget-object v2, v7, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-interface {v2, v5}, Ll/ۧۚܽ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_7

    :cond_16
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_17
    const/4 v12, 0x0

    if-gez v8, :cond_18

    goto :goto_7

    .line 112
    :cond_18
    new-instance v0, Ll/ۘ۠ܽ;

    move-object v6, v0

    move-object v12, p0

    invoke-direct/range {v6 .. v12}, Ll/ۘ۠ܽ;-><init>(Ll/᩻ۚܽ;ILl/᩻ۚܽ;Ll/ۙ֡ܽ;Ll/᩻ۚܽ;Ll/۬ۚܽ;)V

    return-object v0

    :cond_19
    :goto_6
    const/4 v12, 0x0

    :goto_7
    return-object v12
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/᩻ۚܽ;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 118
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 119
    const-class v2, Ll/᩻ۚܽ;

    if-eq v1, v2, :cond_1

    const-class v2, Ll/ۡۚܽ;

    if-eq v1, v2, :cond_1

    const-class v2, Ll/ۧ۠ܽ;

    if-eq v1, v2, :cond_1

    .line 120
    invoke-static {p0}, Ll/ۘ۠ܽ;->ۧ(Ll/ۛۚܽ;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    .line 123
    :cond_1
    check-cast p0, Ll/᩻ۚܽ;

    .line 124
    iget-object v1, p0, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    return-object p0
.end method

.method public static ۧ(Ll/ۛۚܽ;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Ll/᩶֡ܽ;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
