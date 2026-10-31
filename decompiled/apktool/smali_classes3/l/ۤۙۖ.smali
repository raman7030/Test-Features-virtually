.class public final Ll/ۤۙۖ;
.super Ll/᩶᩹ۖ;
.source "95X4"


# instance fields
.field public final synthetic ֫:[Z


# direct methods
.method public constructor <init>([Z)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ll/ۤۙۖ;->֫:[Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;
    .locals 11

    .line 27
    iget-object v0, p1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->ۤ:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_0

    .line 28
    move-object v0, p1

    check-cast v0, Ll/ܺ᩶ۖ;

    .line 29
    iget-object v2, v0, Ll/᩵᩶ۖ;->ۗ:Ll/۠᩶ۖ;

    iget-object v3, v2, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    if-ne v3, v1, :cond_0

    .line 30
    check-cast v2, Ll/ܺ᩶ۖ;

    .line 31
    iget-object v0, v0, Ll/ܺ᩶ۖ;->۬:Ljava/lang/String;

    iget-object v3, v2, Ll/ܺ᩶ۖ;->۬:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p1, v2

    .line 36
    :cond_0
    invoke-super {p0, p1}, Ll/᩶᩹ۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    .line 39
    iget-object v0, p1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_10

    .line 40
    move-object v0, p1

    check-cast v0, Ll/ܺ᩶ۖ;

    iget-object v1, v0, Ll/ܺ᩶ۖ;->۬:Ljava/lang/String;

    const/4 v2, 0x0

    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x5b

    if-ne v3, v4, :cond_10

    .line 78
    iget-object v0, v0, Ll/᩵᩶ۖ;->ۗ:Ll/۠᩶ۖ;

    .line 43
    iget-object v3, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v5, Ll/֨᩶ۖ;->᩵֫:Ll/֨᩶ۖ;

    if-ne v3, v5, :cond_10

    .line 44
    check-cast v0, Ll/ۧ᩶ۖ;

    iget-object v3, v0, Ll/ۧ᩶ۖ;->۬:Ll/۟۠ۖ;

    .line 109
    invoke-virtual {v3}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v5

    const-string v6, "newInstance"

    .line 45
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 101
    invoke-virtual {v3}, Ll/۟۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Ljava/lang/reflect/Array;"

    .line 46
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 113
    invoke-virtual {v3}, Ll/۟۠ۖ;->ᩳ()[Ljava/lang/String;

    move-result-object v5

    .line 47
    array-length v5, v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_10

    .line 113
    invoke-virtual {v3}, Ll/۟۠ۖ;->ᩳ()[Ljava/lang/String;

    move-result-object v5

    .line 48
    aget-object v5, v5, v2

    const-string v7, "Ljava/lang/Class;"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 162
    iget-object v5, v0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    .line 49
    aget-object v5, v5, v2

    .line 51
    iget-object v7, v5, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v8, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    const-string v9, "I"

    const/4 v10, 0x1

    if-ne v7, v8, :cond_1

    .line 52
    check-cast v5, Ll/ۨ᩹ۖ;

    iget-object v5, v5, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    check-cast v5, Ll/᩺۠ۖ;

    iget-object v5, v5, Ll/᩺۠ۖ;->֫:Ljava/lang/String;

    goto/16 :goto_3

    .line 54
    :cond_1
    sget-object v8, Ll/֨᩶ۖ;->ܽۧ:Ll/֨᩶ۖ;

    if-ne v7, v8, :cond_b

    .line 55
    check-cast v5, Ll/ۢ᩶ۖ;

    iget-object v7, v5, Ll/ۢ᩶ۖ;->۬:Ljava/lang/String;

    const-string v8, "Ljava/lang/"

    .line 56
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    iget-object v5, v5, Ll/ۢ᩶ۖ;->ۗ:Ljava/lang/String;

    const-string v8, "TYPE"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 57
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v5, "Ljava/lang/Short;"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v6, 0x8

    goto/16 :goto_1

    :sswitch_1
    const-string v5, "Ljava/lang/Void;"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x7

    goto :goto_1

    :sswitch_2
    const-string v5, "Ljava/lang/Long;"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_0

    :cond_4
    const/4 v6, 0x6

    goto :goto_1

    :sswitch_3
    const-string v5, "Ljava/lang/Byte;"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    const/4 v6, 0x5

    goto :goto_1

    :sswitch_4
    const-string v5, "Ljava/lang/Float;"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_0

    :cond_6
    const/4 v6, 0x4

    goto :goto_1

    :sswitch_5
    const-string v5, "Ljava/lang/Character;"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_0

    :cond_7
    const/4 v6, 0x3

    goto :goto_1

    :sswitch_6
    const-string v5, "Ljava/lang/Double;"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_0

    :sswitch_7
    const-string v5, "Ljava/lang/Boolean;"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_0

    :cond_8
    const/4 v6, 0x1

    goto :goto_1

    :sswitch_8
    const-string v5, "Ljava/lang/Integer;"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_0

    :cond_9
    const/4 v6, 0x0

    goto :goto_1

    :goto_0
    const/4 v6, -0x1

    :cond_a
    :goto_1
    packed-switch v6, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const-string v5, "S"

    goto :goto_3

    :pswitch_1
    const-string v5, "V"

    goto :goto_3

    :pswitch_2
    const-string v5, "J"

    goto :goto_3

    :pswitch_3
    const-string v5, "B"

    goto :goto_3

    :pswitch_4
    const-string v5, "F"

    goto :goto_3

    :pswitch_5
    const-string v5, "C"

    goto :goto_3

    :pswitch_6
    const-string v5, "D"

    goto :goto_3

    :pswitch_7
    const-string v5, "Z"

    goto :goto_3

    :pswitch_8
    move-object v5, v9

    goto :goto_3

    :cond_b
    :goto_2
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_10

    .line 162
    iget-object v0, v0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    .line 91
    aget-object v0, v0, v10

    .line 113
    invoke-virtual {v3}, Ll/۟۠ۖ;->ᩳ()[Ljava/lang/String;

    move-result-object v3

    .line 92
    aget-object v3, v3, v10

    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    iget-object v6, p0, Ll/ۤۙۖ;->֫:[Z

    if-eqz v3, :cond_e

    const-string v3, "["

    .line 93
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 p1, 0x0

    .line 95
    :goto_4
    invoke-virtual {v5, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v4, :cond_c

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    .line 98
    :cond_c
    aput-boolean v10, v6, v2

    if-lez p1, :cond_d

    .line 100
    invoke-virtual {v5, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    add-int/2addr p1, v10

    new-array v3, v10, [Ll/۠᩶ۖ;

    aput-object v0, v3, v2

    .line 276
    new-instance v0, Ll/ܳ᩶ۖ;

    invoke-direct {v0, v1, p1, v3}, Ll/ܳ᩶ۖ;-><init>(Ljava/lang/String;I[Ll/۠᩶ۖ;)V

    return-object v0

    .line 260
    :cond_d
    new-instance p1, Ll/ܺ᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->۫֫:Ll/֨᩶ۖ;

    invoke-direct {p1, v1, v0, v5}, Ll/ܺ᩶ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object p1

    .line 106
    :cond_e
    iget-object v3, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v7, Ll/֨᩶ۖ;->ܳ֫:Ll/֨᩶ۖ;

    if-ne v3, v7, :cond_10

    .line 107
    check-cast v0, Ll/۟᩹ۖ;

    .line 162
    iget-object v3, v0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    .line 108
    array-length v3, v3

    .line 109
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v3, :cond_10

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 p1, 0x0

    .line 111
    :goto_5
    invoke-virtual {v5, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v4, :cond_f

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    .line 114
    :cond_f
    aput-boolean v10, v6, v2

    .line 115
    invoke-virtual {v5, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    add-int/2addr p1, v3

    .line 162
    iget-object v0, v0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    .line 276
    new-instance v2, Ll/ܳ᩶ۖ;

    invoke-direct {v2, v1, p1, v0}, Ll/ܳ᩶ۖ;-><init>(Ljava/lang/String;I[Ll/۠᩶ۖ;)V

    return-object v2

    :cond_10
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x53c18a03 -> :sswitch_8
        0x1d5e853 -> :sswitch_7
        0x305d474a -> :sswitch_6
        0x52c8a972 -> :sswitch_5
        0x5fa2c89f -> :sswitch_4
        0x6e3e38f3 -> :sswitch_3
        0x6ec681ff -> :sswitch_2
        0x6f5359e7 -> :sswitch_1
        0x7599aa7f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
