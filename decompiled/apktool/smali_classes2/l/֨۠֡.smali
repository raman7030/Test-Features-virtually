.class public final Ll/֨۠֡;
.super Ljava/lang/Object;
.source "2571"


# instance fields
.field public final ֫:Ll/ۡ֫ۚ;

.field public final ۧ:Ljava/util/HashSet;

.field public final ܽ:Ll/᩹ܶ֡;


# direct methods
.method public constructor <init>(Ll/᩹ܶ֡;Ll/ۡ֫ۚ;)V
    .locals 5

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Ll/֨۠֡;->ܽ:Ll/᩹ܶ֡;

    .line 73
    iput-object p2, p0, Ll/֨۠֡;->֫:Ll/ۡ֫ۚ;

    .line 79
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 81
    invoke-interface {p2}, Ll/ۡ֫ۚ;->ۧܽ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ֫ۚ;

    .line 82
    invoke-interface {v1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "<clinit>"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 83
    invoke-interface {v1}, Ll/ᩴ֫ۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 85
    invoke-interface {v1}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺֫ۚ;

    .line 86
    sget-object v3, Ll/ۚ۠֡;->֫:[I

    invoke-interface {v2}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 94
    :pswitch_0
    check-cast v2, Ll/֨ۧۚ;

    .line 95
    invoke-interface {v2}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v2

    check-cast v2, Ll/ᩴܽۚ;

    .line 97
    :try_start_0
    invoke-interface {v2}, Ll/۠ܽۚ;->ܿ()V

    .line 98
    invoke-interface {v2}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 99
    invoke-static {v2}, Ll/ܳۜۚ;->֫(Ll/ᩴܽۚ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ll/֨ܽۚ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 74
    :cond_2
    iput-object p1, p0, Ll/֨۠֡;->ۧ:Ljava/util/HashSet;

    return-void

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
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;)V
    .locals 14

    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, ".class "

    const/4 v1, 0x0

    const/4 v2, 0x7

    .line 116
    invoke-virtual {p1, v0, v1, v2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 144
    iget-object v0, p0, Ll/֨۠֡;->֫:Ll/ۡ֫ۚ;

    invoke-interface {v0}, Ll/ۡ֫ۚ;->ܽ()I

    move-result v3

    invoke-static {v3}, Ll/ܺۗ֡;->ܳ(I)[Ll/ܺۗ֡;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5

    .line 145
    invoke-virtual {v6}, Ll/ܺۗ֡;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    const/16 v6, 0x20

    .line 146
    invoke-virtual {p1, v6}, Ll/ۗ᩵ۚ;->write(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 135
    :cond_0
    instance-of v3, v0, Ll/۠ۛ֡;

    if-eqz v3, :cond_1

    .line 136
    move-object v4, v0

    check-cast v4, Ll/۠ۛ֡;

    invoke-virtual {v4, p1}, Ll/۠ۛ֡;->֫(Ljava/io/Writer;)V

    goto :goto_1

    .line 138
    :cond_1
    invoke-interface {v0}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    :goto_1
    const/16 v4, 0xa

    .line 140
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    const/4 v5, -0x1

    const-string v6, ".super "

    if-eqz v3, :cond_2

    .line 152
    move-object v7, v0

    check-cast v7, Ll/۠ۛ֡;

    .line 153
    invoke-virtual {v7}, Ll/۠ۛ֡;->᩸()I

    move-result v8

    if-eq v8, v5, :cond_3

    .line 116
    invoke-virtual {p1, v6, v1, v2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 156
    iget-object v2, v7, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v2, p1, v8}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    .line 157
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    goto :goto_2

    .line 160
    :cond_2
    invoke-interface {v0}, Ll/ۡ֫ۚ;->ۜܽ()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    .line 116
    invoke-virtual {p1, v6, v1, v2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1, v7, v1, v2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 164
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    .line 121
    :cond_3
    :goto_2
    iget-object v2, p0, Ll/֨۠֡;->ܽ:Ll/᩹ܶ֡;

    iget-boolean v6, v2, Ll/᩹ܶ֡;->ܿ:Z

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v6, :cond_5

    const-string v6, "\"\n"

    const/16 v9, 0x9

    const-string v10, ".source \""

    if-eqz v3, :cond_4

    .line 171
    move-object v11, v0

    check-cast v11, Ll/۠ۛ֡;

    .line 172
    invoke-virtual {v11}, Ll/۠ۛ֡;->۠()I

    move-result v12

    if-eq v12, v5, :cond_5

    .line 116
    invoke-virtual {p1, v10, v1, v9}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 175
    iget-object v5, v11, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v5, v12, p1, v8}, Ll/۬ۛ֡;->ۧ(ILjava/io/Writer;Z)V

    goto :goto_3

    .line 179
    :cond_4
    invoke-interface {v0}, Ll/ۡ֫ۚ;->ۜ()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 116
    invoke-virtual {p1, v10, v1, v9}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 182
    invoke-static {p1, v5}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;Ljava/lang/String;)V

    .line 116
    :goto_3
    invoke-virtual {p1, v6, v1, v7}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    :cond_5
    const/16 v5, 0xc

    const-string v6, ".implements "

    const/16 v9, 0xd

    const-string v10, "# interfaces\n"

    if-eqz v3, :cond_6

    .line 190
    move-object v11, v0

    check-cast v11, Ll/۠ۛ֡;

    .line 191
    invoke-virtual {v11}, Ll/۠ۛ֡;->ۚ()[I

    move-result-object v12

    if-eqz v12, :cond_7

    .line 193
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    .line 116
    invoke-virtual {p1, v10, v1, v9}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 195
    iget-object v9, v11, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    .line 196
    array-length v10, v12

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_7

    aget v13, v12, v11

    .line 116
    invoke-virtual {p1, v6, v1, v5}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 198
    invoke-virtual {v9, p1, v13}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    .line 199
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 203
    :cond_6
    invoke-interface {v0}, Ll/ۡ֫ۚ;->ܳ֫()Ljava/util/List;

    move-result-object v11

    .line 204
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-eqz v12, :cond_7

    .line 205
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    .line 116
    invoke-virtual {p1, v10, v1, v9}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 207
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 116
    invoke-virtual {p1, v6, v1, v5}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 209
    invoke-virtual {p1, v10}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    .line 210
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    goto :goto_5

    .line 217
    :cond_7
    invoke-interface {v0}, Ll/ۡ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v5

    .line 218
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v6

    const-string v9, "\n\n"

    if-eqz v6, :cond_8

    .line 116
    invoke-virtual {p1, v9, v1, v7}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const-string v6, "# annotations\n"

    const/16 v10, 0xe

    invoke-virtual {p1, v6, v1, v10}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 227
    invoke-static {p1, v5}, Ll/ᩴ۠֡;->֫(Ll/ۗ᩵ۚ;Ljava/util/Set;)V

    :cond_8
    if-eqz v3, :cond_9

    .line 235
    move-object v5, v0

    check-cast v5, Ll/۠ۛ֡;

    invoke-virtual {v5, v1}, Ll/۠ۛ֡;->ܿ(Z)Ljava/lang/Iterable;

    move-result-object v5

    goto :goto_6

    .line 237
    :cond_9
    invoke-interface {v0}, Ll/ۡ֫ۚ;->ۨ֫()Ljava/lang/Iterable;

    move-result-object v5

    .line 240
    :goto_6
    iget-boolean v6, v2, Ll/᩹ܶ֡;->᩻:Z

    if-eqz v6, :cond_b

    .line 243
    const-class v10, Ll/ۘ֫ۚ;

    invoke-static {v5, v10}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ll/ۘ֫ۚ;

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 58
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, -0x1

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 59
    check-cast v13, Ll/ۘ֫ۚ;

    .line 245
    invoke-interface {v13}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object v13

    if-eqz v13, :cond_a

    .line 246
    invoke-static {v13}, Ll/ۛ᩻ۚ;->֫(Ll/ۤܽۚ;)Z

    move-result v13

    if-nez v13, :cond_a

    move v12, v11

    :cond_a
    add-int/2addr v11, v8

    goto :goto_7

    :cond_b
    const/4 v12, 0x0

    .line 249
    :cond_c
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v8, 0x0

    const/4 v10, 0x0

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۘ֫ۚ;

    if-nez v8, :cond_d

    .line 116
    invoke-virtual {p1, v9, v1, v7}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const-string v8, "# static fields"

    const/16 v13, 0xf

    invoke-virtual {p1, v8, v1, v13}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const/4 v8, 0x1

    .line 255
    :cond_d
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    .line 256
    iget-object v4, p0, Ll/֨۠֡;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_e

    .line 257
    invoke-static {v11}, Ll/ܳۜۚ;->֫(Ll/ᩴܽۚ;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const/4 v4, 0x1

    goto :goto_9

    :cond_e
    const/4 v4, 0x0

    :goto_9
    if-eqz v6, :cond_f

    if-le v10, v12, :cond_f

    const/4 v13, 0x0

    goto :goto_a

    .line 262
    :cond_f
    invoke-interface {v11}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object v13

    .line 264
    :goto_a
    invoke-static {v2, p1, v11, v13, v4}, Ll/ܰ۠֡;->֫(Ll/᩹ܶ֡;Ll/ۗ᩵ۚ;Ll/ۘ֫ۚ;Ll/ۤܽۚ;Z)V

    add-int/lit8 v10, v10, 0x1

    const/16 v4, 0xa

    goto :goto_8

    :cond_10
    if-eqz v3, :cond_11

    .line 274
    move-object v4, v0

    check-cast v4, Ll/۠ۛ֡;

    invoke-virtual {v4, v1}, Ll/۠ۛ֡;->ᩳ(Z)Ljava/lang/Iterable;

    move-result-object v4

    goto :goto_b

    .line 276
    :cond_11
    invoke-interface {v0}, Ll/ۡ֫ۚ;->ܰۧ()Ljava/lang/Iterable;

    move-result-object v4

    .line 279
    :goto_b
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/16 v8, 0x11

    if-eqz v6, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘ֫ۚ;

    if-nez v5, :cond_12

    .line 116
    invoke-virtual {p1, v9, v1, v7}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const-string v5, "# instance fields"

    invoke-virtual {p1, v5, v1, v8}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const/4 v5, 0x1

    :cond_12
    const/16 v8, 0xa

    .line 285
    invoke-virtual {p1, v8}, Ll/ۗ᩵ۚ;->write(I)V

    .line 286
    invoke-interface {v6}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object v8

    invoke-static {v2, p1, v6, v8, v1}, Ll/ܰ۠֡;->֫(Ll/᩹ܶ֡;Ll/ۗ᩵ۚ;Ll/ۘ֫ۚ;Ll/ۤܽۚ;Z)V

    goto :goto_c

    :cond_13
    if-eqz v3, :cond_14

    .line 295
    move-object v4, v0

    check-cast v4, Ll/۠ۛ֡;

    invoke-virtual {v4, v1}, Ll/۠ۛ֡;->ܽ(Z)Ljava/lang/Iterable;

    move-result-object v4

    goto :goto_d

    .line 297
    :cond_14
    invoke-interface {v0}, Ll/ۡ֫ۚ;->ۧܽ()Ljava/lang/Iterable;

    move-result-object v4

    .line 300
    :goto_d
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩴ֫ۚ;

    if-nez v5, :cond_15

    .line 116
    invoke-virtual {p1, v9, v1, v7}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const-string v5, "# direct methods"

    const/16 v10, 0x10

    invoke-virtual {p1, v5, v1, v10}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const/4 v5, 0x1

    :cond_15
    const/16 v10, 0xa

    .line 306
    invoke-virtual {p1, v10}, Ll/ۗ᩵ۚ;->write(I)V

    .line 307
    invoke-interface {v6}, Ll/ᩴ֫ۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v10

    if-eqz v10, :cond_17

    .line 308
    invoke-interface {v10}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v11

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_16

    goto :goto_f

    .line 311
    :cond_16
    new-instance v11, Ll/֨ܶ֡;

    invoke-direct {v11, v2, v6, v10}, Ll/֨ܶ֡;-><init>(Ll/᩹ܶ֡;Ll/ᩴ֫ۚ;Ll/᩵֫ۚ;)V

    .line 312
    invoke-virtual {v11, p1}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;)V

    .line 313
    invoke-virtual {v11}, Ll/֨ܶ֡;->ۧ()V

    goto :goto_e

    .line 309
    :cond_17
    :goto_f
    invoke-static {p1, v6, v2}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;Ll/ᩴ֫ۚ;Ll/᩹ܶ֡;)V

    goto :goto_e

    :cond_18
    if-eqz v3, :cond_19

    .line 323
    check-cast v0, Ll/۠ۛ֡;

    invoke-virtual {v0, v1}, Ll/۠ۛ֡;->ܳ(Z)Ljava/lang/Iterable;

    move-result-object v0

    goto :goto_10

    .line 325
    :cond_19
    invoke-interface {v0}, Ll/ۡ֫ۚ;->ܿܽ()Ljava/lang/Iterable;

    move-result-object v0

    .line 328
    :goto_10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴ֫ۚ;

    if-nez v3, :cond_1a

    .line 116
    invoke-virtual {p1, v9, v1, v7}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const-string v3, "# virtual methods"

    invoke-virtual {p1, v3, v1, v8}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const/4 v3, 0x1

    :cond_1a
    const/16 v5, 0xa

    .line 334
    invoke-virtual {p1, v5}, Ll/ۗ᩵ۚ;->write(I)V

    .line 335
    invoke-interface {v4}, Ll/ᩴ֫ۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v5

    if-eqz v5, :cond_1c

    .line 336
    invoke-interface {v5}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1b

    goto :goto_12

    .line 339
    :cond_1b
    new-instance v6, Ll/֨ܶ֡;

    invoke-direct {v6, v2, v4, v5}, Ll/֨ܶ֡;-><init>(Ll/᩹ܶ֡;Ll/ᩴ֫ۚ;Ll/᩵֫ۚ;)V

    .line 340
    invoke-virtual {v6, p1}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;)V

    .line 341
    invoke-virtual {v6}, Ll/֨ܶ֡;->ۧ()V

    goto :goto_11

    .line 337
    :cond_1c
    :goto_12
    invoke-static {p1, v4, v2}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;Ll/ᩴ֫ۚ;Ll/᩹ܶ֡;)V

    goto :goto_11

    :cond_1d
    return-void
.end method
