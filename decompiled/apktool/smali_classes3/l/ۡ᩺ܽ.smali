.class public final Ll/ۡ᩺ܽ;
.super Ljava/lang/Object;
.source "U16Z"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/lang/String;

.field public ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡ᩺ܽ;->ᩳ:Ljava/util/ArrayList;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡ᩺ܽ;->ۧ:Ljava/util/ArrayList;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡ᩺ܽ;->֫:Ljava/util/ArrayList;

    const/16 v0, 0x2f

    const/16 v1, 0x20

    .line 26
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x5c

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ᩺ܽ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟۬֡;)Ll/ᩴ᩺ܽ;
    .locals 10

    .line 74
    invoke-virtual {p1}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v0

    .line 75
    iget-object v1, p0, Ll/ۡ᩺ܽ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_17

    iget-object v2, v0, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    sget-object v5, Ll/ۘۗ֡;->᩵֫:Ll/ۘۗ֡;

    if-eq v2, v5, :cond_0

    sget-object v5, Ll/ۘۗ֡;->֨֫:Ll/ۘۗ֡;

    if-ne v2, v5, :cond_17

    :cond_0
    iget v2, v0, Ll/֨ۗ֡;->۬:I

    const/4 v5, 0x3

    if-ne v2, v5, :cond_17

    .line 78
    check-cast p1, Ll/ۧۧۚ;

    .line 79
    invoke-interface {p1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object p1

    check-cast p1, Ll/ۚܽۚ;

    .line 81
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷᩺ܽ;

    .line 82
    iget-object v5, v2, Ll/᩷᩺ܽ;->ܽ:Ll/᩵᩺ܽ;

    .line 43
    iget-object v6, v5, Ll/᩵᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    .line 44
    iget-boolean v7, v5, Ll/᩵᩺ܽ;->ᩳ:Z

    if-eqz v7, :cond_3

    .line 45
    sget-object v7, Ll/֨ۗ֡;->ۙᩳ:Ll/֨ۗ֡;

    if-eq v0, v7, :cond_2

    sget-object v7, Ll/֨ۗ֡;->۫ᩳ:Ll/֨ۗ֡;

    if-eq v0, v7, :cond_2

    sget-object v7, Ll/֨ۗ֡;->ۘᩳ:Ll/֨ۗ֡;

    if-eq v0, v7, :cond_2

    sget-object v7, Ll/֨ۗ֡;->ᩴᩳ:Ll/֨ۗ֡;

    if-ne v0, v7, :cond_3

    :cond_2
    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    if-nez v7, :cond_6

    .line 48
    iget-boolean v8, v5, Ll/᩵᩺ܽ;->ۧ:Z

    if-eqz v8, :cond_6

    .line 49
    sget-object v7, Ll/֨ۗ֡;->ۡᩳ:Ll/֨ۗ֡;

    if-eq v0, v7, :cond_5

    sget-object v7, Ll/֨ۗ֡;->ۖᩳ:Ll/֨ۗ֡;

    if-ne v0, v7, :cond_4

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v7, 0x1

    :cond_6
    :goto_3
    if-nez v7, :cond_9

    .line 51
    iget-boolean v8, v5, Ll/᩵᩺ܽ;->ܽ:Z

    if-eqz v8, :cond_9

    .line 52
    sget-object v7, Ll/֨ۗ֡;->֨ᩳ:Ll/֨ۗ֡;

    if-eq v0, v7, :cond_8

    sget-object v7, Ll/֨ۗ֡;->۠ᩳ:Ll/֨ۗ֡;

    if-ne v0, v7, :cond_7

    goto :goto_4

    :cond_7
    const/4 v7, 0x0

    goto :goto_5

    :cond_8
    :goto_4
    const/4 v7, 0x1

    :cond_9
    :goto_5
    if-nez v7, :cond_a

    goto :goto_7

    .line 57
    :cond_a
    iget-object v7, v5, Ll/᩵᩺ܽ;->֫:Ll/ᩳܰܽ;

    invoke-interface {p1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ll/ᩳܰܽ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_b

    goto :goto_7

    .line 60
    :cond_b
    iget-object v7, v5, Ll/᩵᩺ܽ;->ܿ:Ll/ᩳܰܽ;

    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ll/ᩳܰܽ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_7

    .line 63
    :cond_c
    iget-boolean v7, v6, Ll/ᩳܰܽ;->֫:Z

    if-nez v7, :cond_e

    .line 64
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    invoke-interface {p1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    .line 66
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_6

    .line 68
    :cond_d
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 69
    invoke-virtual {v6, v7}, Ll/ᩳܰܽ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_e

    goto :goto_7

    .line 73
    :cond_e
    iget-object v5, v5, Ll/᩵᩺ܽ;->᩻:Ll/ᩳܰܽ;

    invoke-interface {p1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/ᩳܰܽ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_f

    :goto_7
    const/4 v5, 0x0

    goto :goto_8

    :cond_f
    const/4 v5, 0x1

    :goto_8
    if-eqz v5, :cond_1

    if-nez v3, :cond_10

    .line 84
    new-instance v3, Ll/ᩴ᩺ܽ;

    .line 3
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 86
    :cond_10
    iget v5, v2, Ll/᩷᩺ܽ;->ۧ:I

    if-nez v5, :cond_11

    .line 87
    iput-boolean v4, v3, Ll/ᩴ᩺ܽ;->ܳ:Z

    goto/16 :goto_0

    :cond_11
    if-ne v5, v4, :cond_15

    .line 89
    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "<init>"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 37
    iget v2, v2, Ll/᩷᩺ܽ;->ᩳ:I

    and-int/lit8 v5, v2, 0x1

    if-eqz v5, :cond_12

    const/4 v5, 0x1

    goto :goto_9

    :cond_12
    const/4 v5, 0x0

    :goto_9
    if-eqz v5, :cond_13

    .line 92
    iput-boolean v4, v3, Ll/ᩴ᩺ܽ;->ۧ:Z

    .line 93
    iput v4, v3, Ll/ᩴ᩺ܽ;->ᩳ:I

    :cond_13
    and-int/lit8 v2, v2, -0x2

    if-eqz v2, :cond_1

    .line 97
    iput-boolean v4, v3, Ll/ᩴ᩺ܽ;->ܽ:Z

    .line 98
    iget v5, v3, Ll/ᩴ᩺ܽ;->ܿ:I

    or-int/2addr v2, v5

    iput v2, v3, Ll/ᩴ᩺ܽ;->ܿ:I

    goto/16 :goto_0

    .line 101
    :cond_14
    iput-boolean v4, v3, Ll/ᩴ᩺ܽ;->ܽ:Z

    .line 102
    iget v5, v3, Ll/ᩴ᩺ܽ;->ܿ:I

    iget v2, v2, Ll/᩷᩺ܽ;->ᩳ:I

    or-int/2addr v2, v5

    iput v2, v3, Ll/ᩴ᩺ܽ;->ܿ:I

    goto/16 :goto_0

    .line 105
    :cond_15
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_16
    return-object v3

    .line 111
    :cond_17
    iget-object v1, p0, Ll/ۡ᩺ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_22

    iget-object v2, v0, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    sget-object v5, Ll/ۘۗ֡;->ܿ֫:Ll/ۘۗ֡;

    if-eq v2, v5, :cond_18

    sget-object v5, Ll/ۘۗ֡;->ܰ:Ll/ۘۗ֡;

    if-ne v2, v5, :cond_22

    :cond_18
    iget v2, v0, Ll/֨ۗ֡;->۬:I

    const/4 v5, 0x2

    if-ne v2, v5, :cond_22

    .line 114
    check-cast p1, Ll/ۧۧۚ;

    .line 115
    invoke-interface {p1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object p1

    check-cast p1, Ll/ᩴܽۚ;

    .line 116
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷᩺ܽ;

    .line 117
    iget-object v2, v2, Ll/᩷᩺ܽ;->֫:Ll/᩻᩺ܽ;

    .line 44
    iget-boolean v5, v2, Ll/᩻᩺ܽ;->ۧ:Z

    if-eqz v5, :cond_1a

    .line 45
    sget-object v5, Ll/ܳ᩺ܽ;->֫:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    goto :goto_a

    :pswitch_0
    const/4 v5, 0x1

    goto :goto_b

    :cond_1a
    :goto_a
    const/4 v5, 0x0

    :goto_b
    if-nez v5, :cond_1b

    .line 57
    iget-boolean v6, v2, Ll/᩻᩺ܽ;->ᩳ:Z

    if-eqz v6, :cond_1b

    .line 58
    sget-object v6, Ll/ܳ᩺ܽ;->֫:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_1

    goto :goto_c

    :pswitch_1
    const/4 v5, 0x1

    :cond_1b
    :goto_c
    if-nez v5, :cond_1c

    .line 70
    iget-boolean v6, v2, Ll/᩻᩺ܽ;->ܽ:Z

    if-eqz v6, :cond_1c

    .line 71
    sget-object v6, Ll/ܳ᩺ܽ;->֫:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_2

    goto :goto_d

    :pswitch_2
    const/4 v5, 0x1

    :cond_1c
    :goto_d
    if-nez v5, :cond_1d

    .line 83
    iget-boolean v6, v2, Ll/᩻᩺ܽ;->ܿ:Z

    if-eqz v6, :cond_1d

    .line 84
    sget-object v6, Ll/ܳ᩺ܽ;->֫:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_3

    goto :goto_e

    :pswitch_3
    const/4 v5, 0x1

    :cond_1d
    :goto_e
    if-nez v5, :cond_1e

    goto :goto_f

    .line 99
    :cond_1e
    iget-object v5, v2, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    invoke-interface {p1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/ᩳܰܽ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1f

    goto :goto_f

    .line 102
    :cond_1f
    iget-object v5, v2, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    invoke-interface {p1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/ᩳܰܽ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_20

    goto :goto_f

    .line 105
    :cond_20
    iget-object v2, v2, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    invoke-interface {p1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/ᩳܰܽ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_21

    :goto_f
    const/4 v2, 0x0

    goto :goto_10

    :cond_21
    const/4 v2, 0x1

    :goto_10
    if-eqz v2, :cond_19

    .line 118
    new-instance p1, Ll/ᩴ᩺ܽ;

    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-boolean v4, p1, Ll/ᩴ᩺ܽ;->֫:Z

    return-object p1

    :cond_22
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xf
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x16
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final ֫()V
    .locals 5

    .line 67
    iget-object v0, p0, Ll/ۡ᩺ܽ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷᩺ܽ;

    .line 105
    iget v2, v1, Ll/᩷᩺ܽ;->ۧ:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v2, v3, :cond_0

    .line 122
    iget-object v1, v1, Ll/᩷᩺ܽ;->ܽ:Ll/᩵᩺ܽ;

    .line 35
    iget-object v2, v1, Ll/᩵᩺ܽ;->֫:Ll/ᩳܰܽ;

    .line 43
    iput-object v4, v2, Ll/ᩳܰܽ;->ۧ:Ljava/util/regex/Matcher;

    .line 36
    iget-object v2, v1, Ll/᩵᩺ܽ;->ܿ:Ll/ᩳܰܽ;

    .line 43
    iput-object v4, v2, Ll/ᩳܰܽ;->ۧ:Ljava/util/regex/Matcher;

    .line 37
    iget-object v2, v1, Ll/᩵᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    .line 43
    iput-object v4, v2, Ll/ᩳܰܽ;->ۧ:Ljava/util/regex/Matcher;

    .line 38
    iget-object v1, v1, Ll/᩵᩺ܽ;->᩻:Ll/ᩳܰܽ;

    goto :goto_1

    .line 124
    :cond_0
    iget-object v1, v1, Ll/᩷᩺ܽ;->֫:Ll/᩻᩺ܽ;

    .line 34
    iget-object v2, v1, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    .line 43
    iput-object v4, v2, Ll/ᩳܰܽ;->ۧ:Ljava/util/regex/Matcher;

    .line 35
    iget-object v2, v1, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    .line 43
    iput-object v4, v2, Ll/ᩳܰܽ;->ۧ:Ljava/util/regex/Matcher;

    .line 36
    iget-object v1, v1, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    .line 43
    :goto_1
    iput-object v4, v1, Ll/ᩳܰܽ;->ۧ:Ljava/util/regex/Matcher;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Lorg/json/JSONObject;)V
    .locals 14

    .line 30
    iget-object v0, p0, Ll/ۡ᩺ܽ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    iget-object v1, p0, Ll/ۡ᩺ܽ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 32
    iget-object v2, p0, Ll/ۡ᩺ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    const-string v3, "a"

    .line 33
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v3, 0x0

    .line 34
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_a

    .line 35
    new-instance v4, Ll/᩷᩺ܽ;

    invoke-direct {v4}, Ll/᩷᩺ܽ;-><init>()V

    .line 36
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 61
    iget-object v6, v4, Ll/᩷᩺ܽ;->ܽ:Ll/᩵᩺ܽ;

    const-string v7, "b"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 88
    iget-object v8, v6, Ll/᩵᩺ܽ;->֫:Ll/ᩳܰܽ;

    const/16 v9, 0x61

    invoke-virtual {v8, v7, v9}, Ll/ᩳܰܽ;->֫(Lorg/json/JSONObject;C)V

    .line 89
    iget-object v8, v6, Ll/᩵᩺ܽ;->ܿ:Ll/ᩳܰܽ;

    const/16 v10, 0x64

    invoke-virtual {v8, v7, v10}, Ll/ᩳܰܽ;->֫(Lorg/json/JSONObject;C)V

    .line 90
    iget-object v8, v6, Ll/᩵᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    const/16 v11, 0x67

    invoke-virtual {v8, v7, v11}, Ll/ᩳܰܽ;->֫(Lorg/json/JSONObject;C)V

    .line 91
    iget-object v8, v6, Ll/᩵᩺ܽ;->᩻:Ll/ᩳܰܽ;

    const/16 v12, 0x6a

    invoke-virtual {v8, v7, v12}, Ll/ᩳܰܽ;->֫(Lorg/json/JSONObject;C)V

    const-string v8, "m"

    .line 92
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    const/4 v13, 0x1

    if-eqz v12, :cond_0

    const/4 v12, 0x1

    goto :goto_1

    :cond_0
    const/4 v12, 0x0

    :goto_1
    iput-boolean v12, v6, Ll/᩵᩺ܽ;->ᩳ:Z

    const-string v12, "n"

    .line 93
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x1

    goto :goto_2

    :cond_1
    const/4 v12, 0x0

    :goto_2
    iput-boolean v12, v6, Ll/᩵᩺ܽ;->ۧ:Z

    const-string v12, "o"

    .line 94
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x1

    goto :goto_3

    :cond_2
    const/4 v7, 0x0

    :goto_3
    iput-boolean v7, v6, Ll/᩵᩺ܽ;->ܽ:Z

    const-string v6, "e"

    .line 62
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 63
    iget-object v7, v4, Ll/᩷᩺ܽ;->֫:Ll/᩻᩺ܽ;

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 120
    iget-object v12, v7, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    invoke-virtual {v12, v6, v9}, Ll/ᩳܰܽ;->֫(Lorg/json/JSONObject;C)V

    .line 121
    iget-object v9, v7, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    invoke-virtual {v9, v6, v10}, Ll/ᩳܰܽ;->֫(Lorg/json/JSONObject;C)V

    .line 122
    iget-object v9, v7, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    invoke-virtual {v9, v6, v11}, Ll/ᩳܰܽ;->֫(Lorg/json/JSONObject;C)V

    const-string v9, "j"

    .line 123
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_3

    const/4 v9, 0x1

    goto :goto_4

    :cond_3
    const/4 v9, 0x0

    :goto_4
    iput-boolean v9, v7, Ll/᩻᩺ܽ;->ۧ:Z

    const-string v9, "k"

    .line 124
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_4

    const/4 v9, 0x1

    goto :goto_5

    :cond_4
    const/4 v9, 0x0

    :goto_5
    iput-boolean v9, v7, Ll/᩻᩺ܽ;->ᩳ:Z

    const-string v9, "l"

    .line 125
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_5

    const/4 v9, 0x1

    goto :goto_6

    :cond_5
    const/4 v9, 0x0

    :goto_6
    iput-boolean v9, v7, Ll/᩻᩺ܽ;->ܽ:Z

    .line 126
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, 0x1

    goto :goto_7

    :cond_6
    const/4 v6, 0x0

    :goto_7
    iput-boolean v6, v7, Ll/᩻᩺ܽ;->ܿ:Z

    :cond_7
    const-string v6, "c"

    .line 65
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    iput v6, v4, Ll/᩷᩺ܽ;->ۧ:I

    const-string v6, "d"

    .line 66
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    iput v5, v4, Ll/᩷᩺ܽ;->ᩳ:I

    .line 67
    iget v5, v4, Ll/᩷᩺ܽ;->ۧ:I

    const/4 v6, 0x2

    if-eqz v5, :cond_8

    if-eq v5, v13, :cond_8

    if-eq v5, v6, :cond_8

    const/4 v5, 0x0

    .line 68
    iput v5, v4, Ll/᩷᩺ܽ;->ۧ:I

    .line 37
    :cond_8
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    iget v5, v4, Ll/᩷᩺ܽ;->ۧ:I

    if-eq v5, v6, :cond_9

    .line 39
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 41
    :cond_9
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_8
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 61
    iget-object v0, p0, Ll/ۡ᩺ܽ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷᩺ܽ;

    .line 105
    iget v2, v1, Ll/᩷᩺ܽ;->ۧ:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    .line 114
    iget-object v1, v1, Ll/᩷᩺ܽ;->ܽ:Ll/᩵᩺ܽ;

    .line 28
    iget-object v2, v1, Ll/᩵᩺ܽ;->֫:Ll/ᩳܰܽ;

    invoke-virtual {v2}, Ll/ᩳܰܽ;->ۧ()V

    .line 29
    iget-object v2, v1, Ll/᩵᩺ܽ;->ܿ:Ll/ᩳܰܽ;

    invoke-virtual {v2}, Ll/ᩳܰܽ;->ۧ()V

    .line 30
    iget-object v2, v1, Ll/᩵᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    invoke-virtual {v2}, Ll/ᩳܰܽ;->ۧ()V

    .line 31
    iget-object v1, v1, Ll/᩵᩺ܽ;->᩻:Ll/ᩳܰܽ;

    invoke-virtual {v1}, Ll/ᩳܰܽ;->ۧ()V

    goto :goto_0

    .line 116
    :cond_0
    iget-object v1, v1, Ll/᩷᩺ܽ;->֫:Ll/᩻᩺ܽ;

    .line 28
    iget-object v2, v1, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    invoke-virtual {v2}, Ll/ᩳܰܽ;->ۧ()V

    .line 29
    iget-object v2, v1, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    invoke-virtual {v2}, Ll/ᩳܰܽ;->ۧ()V

    .line 30
    iget-object v1, v1, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    invoke-virtual {v1}, Ll/ᩳܰܽ;->ۧ()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ܽ()Lorg/json/JSONObject;
    .locals 4

    .line 48
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 49
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 50
    iget-object v2, p0, Ll/ۡ᩺ܽ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷᩺ܽ;

    .line 51
    invoke-virtual {v3}, Ll/᩷᩺ܽ;->ۧ()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_0
    const-string v2, "a"

    .line 53
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 56
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
