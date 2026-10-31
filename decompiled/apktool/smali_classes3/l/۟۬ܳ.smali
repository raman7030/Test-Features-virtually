.class public final Ll/۟۬ܳ;
.super Ljava/lang/Object;
.source "M2AR"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/۟۬ܳ;->ܽ:Ljava/util/HashMap;

    const-string v0, "[0-9]+|\\.?[^.0-9]*"

    .line 499
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/۟۬ܳ;->ۧ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(I)I
    .locals 1

    const/4 v0, 0x4

    if-lt p0, v0, :cond_0

    add-int/lit8 p0, p0, -0x4

    :cond_0
    if-ltz p0, :cond_1

    const/4 v0, 0x3

    if-gt p0, v0, :cond_1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(IZ)I
    .locals 1

    if-ltz p0, :cond_1

    const/4 v0, 0x3

    if-gt p0, v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/2addr p0, p1

    return p0

    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "\nidentityLength="

    .line 0
    invoke-static {p0, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 240
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܽ᩷ܳ;)Ljava/lang/String;
    .locals 7

    .line 222
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->ۗ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "zip"

    const-string v3, "tar"

    const-string v4, "archive"

    const-string v5, "payload"

    const/4 v6, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x3

    goto :goto_0

    :sswitch_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    goto :goto_0

    :sswitch_2
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    :goto_0
    packed-switch v6, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 223
    :pswitch_0
    check-cast p0, Ll/ۧۗ᩻;

    .line 224
    invoke-virtual {p0}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object p0

    .line 223
    invoke-static {v2, p0}, Ll/۟۬ܳ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 227
    :pswitch_1
    check-cast p0, Ll/ۡ᩸᩻;

    .line 228
    invoke-virtual {p0}, Ll/ۡ᩸᩻;->ܿ֫()Ljava/lang/String;

    move-result-object p0

    .line 227
    invoke-static {v3, p0}, Ll/۟۬ܳ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 225
    :pswitch_2
    check-cast p0, Ll/ۚۛܳ;

    .line 226
    invoke-virtual {p0}, Ll/ۚۛܳ;->ܿ֫()Ljava/lang/String;

    move-result-object p0

    .line 225
    invoke-static {v4, p0}, Ll/۟۬ܳ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 229
    :pswitch_3
    check-cast p0, Ll/᩹֨᩻;

    .line 230
    invoke-virtual {p0}, Ll/᩹֨᩻;->ܿ֫()Ljava/lang/String;

    move-result-object p0

    .line 229
    invoke-static {v5, p0}, Ll/۟۬ܳ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x2ee41e72 -> :sswitch_3
        -0x2c971f3e -> :sswitch_2
        0x1bfa5 -> :sswitch_1
        0x1d721 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static bridge synthetic ֫()Ljava/util/regex/Pattern;
    .locals 1

    .line 0
    sget-object v0, Ll/۟۬ܳ;->ۧ:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public static ֫(ILjava/lang/String;Z)V
    .locals 0

    .line 255
    invoke-static {p0, p2}, Ll/۟۬ܳ;->֫(IZ)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sget-object p2, Ll/۟۬ܳ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {p2, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 263
    sget-object v0, Ll/۟۬ܳ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;IZ)V
    .locals 7

    .line 164
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 165
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v1

    .line 166
    invoke-static {p0}, Ll/ۘ۬ܳ;->֫(Ljava/util/List;)Z

    move-result v2

    .line 167
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۜܳ;

    .line 168
    invoke-interface {v4}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ll/ۤ۬ܳ;

    invoke-interface {v4}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v1, v4, v2}, Ll/ۤ۬ܳ;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    if-eqz p1, :cond_4

    if-eq p1, v3, :cond_3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_2

    const/4 v4, 0x3

    if-ne p1, v4, :cond_1

    .line 182
    new-instance p1, Ll/ܰ۬ܳ;

    invoke-direct {p1, v0, p2}, Ll/ܰ۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_1

    .line 185
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "method="

    .line 0
    invoke-static {p1, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 185
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 179
    :cond_2
    new-instance p1, Ll/᩺۬ܳ;

    invoke-direct {p1, v0, p2}, Ll/᩺۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_1

    .line 176
    :cond_3
    new-instance p1, Ll/۫۬ܳ;

    invoke-direct {p1, v0, p2, v3}, Ll/۫۬ܳ;-><init>(Ljava/util/HashMap;ZZ)V

    goto :goto_1

    .line 173
    :cond_4
    new-instance p1, Ll/ۨ۬ܳ;

    invoke-direct {p1, v0, p2}, Ll/ۨ۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    .line 188
    :goto_1
    :try_start_0
    invoke-static {p0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    if-nez v2, :cond_6

    .line 193
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 194
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 195
    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ll/ۤ۬ܳ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v1, v2, v3}, Ll/ۤ۬ܳ;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 197
    :cond_5
    invoke-static {p0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void

    .line 191
    :cond_6
    throw p2
.end method

.method public static ֫(Ll/ܽۢܳ;Ljava/util/List;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 63
    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    .line 65
    instance-of v3, v0, Ll/ۚۡ᩻;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Ll/ۚۡ᩻;

    .line 66
    invoke-virtual {v3}, Ll/ۚۡ᩻;->ܿ֫()Ll/ۗ᩻᩻;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 68
    :goto_0
    invoke-static {v0}, Ll/۟۬ܳ;->֫(Ll/ܽ᩷ܳ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->ۗ()Ljava/lang/String;

    move-result-object v0

    const-string v5, "local"

    .line 202
    invoke-virtual {v1, v5}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 204
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "local:"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 206
    :cond_1
    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object v6

    .line 69
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->᩺()Z

    move-result v7

    .line 137
    invoke-static {v4}, Ll/۟۬ܳ;->ۧ(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    const/4 v8, 0x2

    const/4 v9, -0x1

    const/4 v10, 0x0

    const-string v11, "trash"

    const/4 v12, 0x1

    if-eqz v4, :cond_2

    .line 139
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto/16 :goto_5

    .line 141
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x2

    goto :goto_3

    :sswitch_1
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    goto :goto_3

    :sswitch_2
    const-string v4, "net"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    goto :goto_3

    :goto_2
    const/4 v0, -0x1

    :goto_3
    packed-switch v0, :pswitch_data_0

    goto :goto_4

    .line 155
    :pswitch_0
    sget v0, Ll/᩶ۖ᩷;->ۢ:I

    goto :goto_5

    .line 143
    :pswitch_1
    sget-object v0, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 145
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_5

    :pswitch_2
    if-eqz v3, :cond_6

    .line 149
    iget-object v0, v3, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 151
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_5

    :cond_6
    :goto_4
    if-eqz v7, :cond_7

    .line 159
    sget v0, Ll/᩶ۖ᩷;->ܽ:I

    sget-boolean v3, Ll/᩶ۖ᩷;->ܿ:Z

    invoke-static {v0, v3}, Ll/۟۬ܳ;->֫(IZ)I

    move-result v0

    goto :goto_5

    .line 160
    :cond_7
    sget v0, Ll/᩶ۖ᩷;->ᩳ:I

    sget-boolean v3, Ll/᩶ۖ᩷;->ܳ:Z

    invoke-static {v0, v3}, Ll/۟۬ܳ;->֫(IZ)I

    move-result v0

    .line 70
    :goto_5
    invoke-static {v0}, Ll/۟۬ܳ;->֫(I)I

    move-result v3

    .line 71
    invoke-static {v0}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result v0

    .line 73
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 74
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v5

    .line 75
    invoke-static/range {p1 .. p1}, Ll/ۘ۬ܳ;->֫(Ljava/util/List;)Z

    move-result v6

    .line 76
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ᩳۜܳ;

    .line 77
    invoke-interface {v13}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ll/ۤ۬ܳ;

    invoke-interface {v13}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v15, v5, v13, v6}, Ll/ۤ۬ܳ;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v4, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_8
    if-eqz v3, :cond_e

    if-eq v3, v12, :cond_b

    if-eq v3, v8, :cond_a

    const/4 v7, 0x3

    if-ne v3, v7, :cond_9

    .line 101
    new-instance v7, Ll/ܰ۬ܳ;

    invoke-direct {v7, v4, v0}, Ll/ܰ۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_9

    .line 104
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "method="

    .line 0
    invoke-static {v3, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 104
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_a
    new-instance v7, Ll/᩺۬ܳ;

    invoke-direct {v7, v4, v0}, Ll/᩺۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_9

    .line 94
    :cond_b
    new-instance v7, Ll/۫۬ܳ;

    .line 95
    invoke-virtual {v1, v11}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-le v8, v12, :cond_c

    goto :goto_7

    :cond_c
    const/4 v8, 0x0

    goto :goto_8

    :cond_d
    :goto_7
    const/4 v8, 0x1

    :goto_8
    invoke-direct {v7, v4, v0, v8}, Ll/۫۬ܳ;-><init>(Ljava/util/HashMap;ZZ)V

    goto :goto_9

    :cond_e
    const-string v7, "zip"

    .line 82
    invoke-virtual {v1, v7}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_10

    .line 83
    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v7

    check-cast v7, Ll/ۧۗ᩻;

    .line 84
    invoke-virtual {v7}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {v7}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-gt v7, v12, :cond_f

    .line 85
    new-instance v7, Ll/۬۬ܳ;

    invoke-direct {v7, v4, v0}, Ll/۬۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_9

    .line 87
    :cond_f
    new-instance v7, Ll/ۨ۬ܳ;

    invoke-direct {v7, v4, v0}, Ll/ۨ۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_9

    .line 90
    :cond_10
    new-instance v7, Ll/ۨ۬ܳ;

    invoke-direct {v7, v4, v0}, Ll/ۨ۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    .line 107
    :goto_9
    :try_start_0
    invoke-static {v2, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    move-object v8, v0

    if-nez v6, :cond_14

    .line 112
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 113
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 114
    invoke-interface {v6}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v8

    new-instance v13, Ll/ۤ۬ܳ;

    invoke-interface {v6}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v13, v5, v6, v12}, Ll/ۤ۬ܳ;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v4, v8, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 116
    :cond_11
    invoke-static {v2, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :goto_b
    if-ne v3, v12, :cond_13

    .line 118
    invoke-virtual {v1, v11}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v12, :cond_13

    .line 119
    new-instance v0, Ll/ۖۖᩳ;

    invoke-direct {v0}, Ll/ۖۖᩳ;-><init>()V

    .line 121
    :goto_c
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v10, v1, :cond_13

    .line 122
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    invoke-interface {v1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ll/ۖۖᩳ;->֫(J)I

    move-result v1

    if-eq v1, v9, :cond_12

    .line 125
    new-instance v3, Ll/᩵ۘܳ;

    packed-switch v1, :pswitch_data_1

    .line 46
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :pswitch_3
    const v4, 0x7f120a6f

    goto :goto_d

    :pswitch_4
    const v4, 0x7f120a73

    goto :goto_d

    :pswitch_5
    const v4, 0x7f120a74

    goto :goto_d

    :pswitch_6
    const v4, 0x7f120a75

    goto :goto_d

    :pswitch_7
    const v4, 0x7f120a71

    goto :goto_d

    :pswitch_8
    const v4, 0x7f120a72

    goto :goto_d

    :pswitch_9
    const v4, 0x7f120a70

    .line 48
    :goto_d
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v14

    const-wide/16 v19, 0x0

    const/16 v21, 0x1

    const-string v15, ""

    const/16 v16, 0x0

    const-wide/16 v17, -0x1

    move-object v13, v3

    .line 6
    invoke-direct/range {v13 .. v21}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 125
    invoke-interface {v2, v10, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    move v9, v1

    :cond_12
    add-int/2addr v10, v12

    goto :goto_c

    :cond_13
    return-void

    .line 110
    :cond_14
    throw v8

    :sswitch_data_0
    .sparse-switch
        0x1a99d -> :sswitch_2
        0x625df6b -> :sswitch_1
        0x697f338 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 248
    :cond_0
    sget-object v0, Ll/۟۬ܳ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method public static ۧ(I)Z
    .locals 1

    const/4 v0, 0x4

    if-lt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
