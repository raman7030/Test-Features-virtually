.class public final Ll/ᩳܺۚ;
.super Ljava/lang/Object;
.source "Y5SH"


# instance fields
.field public final ֫:Ll/ۧܺۚ;

.field public final ۧ:Ll/ۧܺۚ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ll/ۧܺۚ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/ۧܺۚ;-><init>(II)V

    iput-object v0, p0, Ll/ᩳܺۚ;->ۧ:Ll/ۧܺۚ;

    .line 56
    new-instance v2, Ll/ۧܺۚ;

    invoke-direct {v2, v1, v1}, Ll/ۧܺۚ;-><init>(II)V

    iput-object v2, p0, Ll/ᩳܺۚ;->֫:Ll/ۧܺۚ;

    .line 57
    iput-object v2, v0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    .line 58
    iput-object v0, v2, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    return-void
.end method

.method public static ֫(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 13

    .line 63
    new-instance v0, Ll/ᩳܺۚ;

    invoke-direct {v0}, Ll/ᩳܺۚ;-><init>()V

    .line 65
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ֫ۚ;

    .line 66
    invoke-interface {v1}, Ll/ۚ֫ۚ;->֫()I

    move-result v2

    .line 67
    invoke-interface {v1}, Ll/ۚ֫ۚ;->ܽ()I

    move-result v3

    add-int/2addr v3, v2

    if-ne v2, v3, :cond_1

    goto :goto_0

    .line 71
    :cond_1
    invoke-interface {v1}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖ֫ۚ;

    .line 81
    iget-object v5, v0, Ll/ᩳܺۚ;->ۧ:Ll/ۧܺۚ;

    iget-object v5, v5, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    .line 82
    :goto_2
    iget-object v6, v0, Ll/ᩳܺۚ;->֫:Ll/ۧܺۚ;

    const/4 v7, 0x0

    if-eq v5, v6, :cond_6

    .line 83
    iget v8, v5, Ll/ۧܺۚ;->ܿ:I

    .line 84
    iget v9, v5, Ll/ۧܺۚ;->֫:I

    if-ne v2, v8, :cond_2

    goto :goto_3

    :cond_2
    if-le v2, v8, :cond_3

    if-ge v2, v9, :cond_3

    .line 98
    invoke-virtual {v5, v2}, Ll/ۧܺۚ;->֫(I)Ll/ۧܺۚ;

    move-result-object v5

    goto :goto_3

    :cond_3
    if-ge v2, v8, :cond_5

    if-gt v3, v8, :cond_4

    .line 106
    new-instance v6, Ll/ۧܺۚ;

    invoke-direct {v6, v2, v3}, Ll/ۧܺۚ;-><init>(II)V

    .line 107
    invoke-virtual {v5, v6}, Ll/ۧܺۚ;->֫(Ll/ۧܺۚ;)V

    .line 108
    new-instance v5, Ll/ܽܺۚ;

    invoke-direct {v5, v6, v6}, Ll/ܽܺۚ;-><init>(Ll/ۧܺۚ;Ll/ۧܺۚ;)V

    goto/16 :goto_6

    .line 115
    :cond_4
    new-instance v9, Ll/ۧܺۚ;

    invoke-direct {v9, v2, v8}, Ll/ۧܺۚ;-><init>(II)V

    .line 116
    invoke-virtual {v5, v9}, Ll/ۧܺۚ;->֫(Ll/ۧܺۚ;)V

    move-object v5, v9

    goto :goto_3

    .line 121
    :cond_5
    iget-object v5, v5, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    goto :goto_2

    :cond_6
    move-object v5, v7

    :goto_3
    if-nez v5, :cond_7

    .line 130
    new-instance v5, Ll/ۧܺۚ;

    invoke-direct {v5, v2, v3}, Ll/ۧܺۚ;-><init>(II)V

    .line 131
    invoke-virtual {v6, v5}, Ll/ۧܺۚ;->֫(Ll/ۧܺۚ;)V

    .line 132
    new-instance v6, Ll/ܽܺۚ;

    invoke-direct {v6, v5, v5}, Ll/ܽܺۚ;-><init>(Ll/ۧܺۚ;Ll/ۧܺۚ;)V

    :goto_4
    move-object v5, v6

    goto :goto_6

    :cond_7
    move-object v8, v5

    :goto_5
    if-eq v8, v6, :cond_b

    .line 137
    iget v9, v8, Ll/ۧܺۚ;->ܿ:I

    .line 138
    iget v10, v8, Ll/ۧܺۚ;->֫:I

    if-ne v3, v10, :cond_8

    .line 144
    new-instance v6, Ll/ܽܺۚ;

    invoke-direct {v6, v5, v8}, Ll/ܽܺۚ;-><init>(Ll/ۧܺۚ;Ll/ۧܺۚ;)V

    goto :goto_4

    :cond_8
    if-le v3, v9, :cond_9

    if-ge v3, v10, :cond_9

    .line 151
    invoke-virtual {v8, v3}, Ll/ۧܺۚ;->֫(I)Ll/ۧܺۚ;

    .line 152
    new-instance v6, Ll/ܽܺۚ;

    invoke-direct {v6, v5, v8}, Ll/ܽܺۚ;-><init>(Ll/ۧܺۚ;Ll/ۧܺۚ;)V

    goto :goto_4

    :cond_9
    if-gt v3, v9, :cond_a

    .line 159
    new-instance v6, Ll/ۧܺۚ;

    iget-object v9, v8, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    iget v9, v9, Ll/ۧܺۚ;->֫:I

    invoke-direct {v6, v9, v3}, Ll/ۧܺۚ;-><init>(II)V

    .line 160
    invoke-virtual {v8, v6}, Ll/ۧܺۚ;->֫(Ll/ۧܺۚ;)V

    .line 161
    new-instance v8, Ll/ܽܺۚ;

    invoke-direct {v8, v5, v6}, Ll/ܽܺۚ;-><init>(Ll/ۧܺۚ;Ll/ۧܺۚ;)V

    move-object v5, v8

    goto :goto_6

    .line 163
    :cond_a
    iget-object v8, v8, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    goto :goto_5

    .line 171
    :cond_b
    new-instance v8, Ll/ۧܺۚ;

    iget-object v9, v6, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    iget v9, v9, Ll/ۧܺۚ;->֫:I

    invoke-direct {v8, v9, v3}, Ll/ۧܺۚ;-><init>(II)V

    .line 172
    invoke-virtual {v6, v8}, Ll/ۧܺۚ;->֫(Ll/ۧܺۚ;)V

    .line 173
    new-instance v6, Ll/ܽܺۚ;

    invoke-direct {v6, v5, v8}, Ll/ܽܺۚ;-><init>(Ll/ۧܺۚ;Ll/ۧܺۚ;)V

    goto :goto_4

    .line 183
    :goto_6
    iget-object v6, v5, Ll/ܽܺۚ;->ۧ:Ll/ۧܺۚ;

    move v8, v2

    .line 191
    :cond_c
    iget v9, v6, Ll/ۧܺۚ;->ܿ:I

    if-le v9, v8, :cond_d

    .line 192
    new-instance v10, Ll/ۧܺۚ;

    invoke-direct {v10, v8, v9}, Ll/ۧܺۚ;-><init>(II)V

    .line 193
    invoke-virtual {v6, v10}, Ll/ۧܺۚ;->֫(Ll/ۧܺۚ;)V

    move-object v6, v10

    .line 359
    :cond_d
    iget-object v8, v6, Ll/ۧܺۚ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۖ֫ۚ;

    .line 360
    invoke-interface {v10}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v11

    .line 361
    invoke-interface {v4}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v12

    if-nez v11, :cond_10

    if-nez v12, :cond_e

    .line 365
    invoke-interface {v10}, Ll/ۖ֫ۚ;->۟()I

    move-result v8

    invoke-interface {v4}, Ll/ۖ֫ۚ;->۟()I

    move-result v9

    if-ne v8, v9, :cond_f

    goto :goto_7

    .line 366
    :cond_f
    new-instance p0, Ll/֫ܺۚ;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Multiple overlapping catch all handlers with different handlers"

    .line 46
    invoke-direct {p0, v7, v1, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    throw p0

    .line 371
    :cond_10
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    goto :goto_7

    .line 379
    :cond_11
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    :goto_7
    iget v8, v6, Ll/ۧܺۚ;->֫:I

    .line 199
    iget-object v6, v6, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    .line 200
    iget-object v9, v6, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    iget-object v10, v5, Ll/ܽܺۚ;->֫:Ll/ۧܺۚ;

    if-ne v9, v10, :cond_c

    goto/16 :goto_1

    .line 204
    :cond_12
    new-instance p0, Ll/۟ۡۚ;

    invoke-direct {p0, v0}, Ll/۟ۡۚ;-><init>(Ll/ᩳܺۚ;)V

    invoke-static {p0}, Ll/۟۫ܺ;->֫(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ᩳܺۚ;)Ll/ۧܺۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳܺۚ;->֫:Ll/ۧܺۚ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩳܺۚ;)Ll/ۧܺۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳܺۚ;->ۧ:Ll/ۧܺۚ;

    return-object p0
.end method
