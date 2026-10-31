.class public final Ll/ܺ᩵ۧ;
.super Ljava/lang/Object;
.source "V8K2"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public final ۖ:Ljava/lang/String;

.field public final ۜ:Ljava/lang/String;

.field public final ۡ:[Ljava/lang/String;

.field public final ۢ:Ll/ۚ᩵ۧ;

.field public final ۧ:J

.field public final ܳ:Ljava/util/HashMap;

.field public final ܺ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Z

.field public final ᩷:J

.field public final ᩻:Ll/ܺ᩵ۧ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLl/ۚ᩵ۧ;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܺ᩵ۧ;)V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object p1, p0, Ll/ܺ᩵ۧ;->ܺ:Ljava/lang/String;

    .line 175
    iput-object p2, p0, Ll/ܺ᩵ۧ;->ۖ:Ljava/lang/String;

    .line 176
    iput-object p10, p0, Ll/ܺ᩵ۧ;->ܽ:Ljava/lang/String;

    .line 177
    iput-object p7, p0, Ll/ܺ᩵ۧ;->ۢ:Ll/ۚ᩵ۧ;

    .line 178
    iput-object p8, p0, Ll/ܺ᩵ۧ;->ۡ:[Ljava/lang/String;

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 179
    :goto_0
    iput-boolean p1, p0, Ll/ܺ᩵ۧ;->ᩳ:Z

    .line 180
    iput-wide p3, p0, Ll/ܺ᩵ۧ;->᩷:J

    .line 181
    iput-wide p5, p0, Ll/ܺ᩵ۧ;->ۧ:J

    .line 155
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    iput-object p9, p0, Ll/ܺ᩵ۧ;->ۜ:Ljava/lang/String;

    .line 183
    iput-object p11, p0, Ll/ܺ᩵ۧ;->᩻:Ll/ܺ᩵ۧ;

    .line 184
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܺ᩵ۧ;->ܳ:Ljava/util/HashMap;

    .line 185
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܺ᩵ۧ;->ܿ:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;
    .locals 2

    .line 360
    invoke-virtual {p1, p0}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 361
    new-instance v0, Ll/᩹֡֫;

    invoke-direct {v0}, Ll/᩹֡֫;-><init>()V

    .line 362
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    .line 363
    invoke-virtual {p1, p0, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    :cond_0
    invoke-virtual {p1, p0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹֡֫;

    invoke-virtual {p0}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    check-cast p0, Landroid/text/SpannableStringBuilder;

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ܺ᩵ۧ;
    .locals 13

    .line 139
    new-instance v12, Ll/ܺ᩵ۧ;

    const-string v0, "\r\n"

    const-string v1, "\n"

    .line 310
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, " *\n *"

    .line 313
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, " "

    .line 315
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "[ \t\\x0B\u000c\r]+"

    .line 317
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x0

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, ""

    move-object v0, v12

    .line 141
    invoke-direct/range {v0 .. v11}, Ll/ܺ᩵ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;JJLl/ۚ᩵ۧ;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܺ᩵ۧ;)V

    return-object v12
.end method

.method public static ֫(Ljava/lang/String;JJLl/ۚ᩵ۧ;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܺ᩵ۧ;)Ll/ܺ᩵ۧ;
    .locals 13

    .line 160
    new-instance v12, Ll/ܺ᩵ۧ;

    const/4 v2, 0x0

    move-object v0, v12

    move-object v1, p0

    move-wide v3, p1

    move-wide/from16 v5, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    invoke-direct/range {v0 .. v11}, Ll/ܺ᩵ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;JJLl/ۚ᩵ۧ;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܺ᩵ۧ;)V

    return-object v12
.end method

.method private ֫(JLjava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    const-string v0, ""

    .line 307
    iget-object v1, p0, Ll/ܺ᩵ۧ;->ۜ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, v1

    .line 308
    :goto_0
    invoke-virtual {p0, p1, p2}, Ll/ܺ᩵ۧ;->֫(J)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "div"

    iget-object v1, p0, Ll/ܺ᩵ۧ;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܺ᩵ۧ;->ܽ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 309
    new-instance p1, Landroid/util/Pair;

    invoke-direct {p1, p3, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 312
    :goto_1
    invoke-virtual {p0}, Ll/ܺ᩵ۧ;->֫()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 313
    invoke-virtual {p0, v0}, Ll/ܺ᩵ۧ;->֫(I)Ll/ܺ᩵ۧ;

    move-result-object v1

    invoke-direct {v1, p1, p2, p3, p4}, Ll/ܺ᩵ۧ;->֫(JLjava/lang/String;Ljava/util/ArrayList;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private ֫(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v8, p3

    .line 375
    invoke-virtual/range {p0 .. p2}, Ll/ܺ᩵ۧ;->֫(J)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_12

    :cond_0
    const-string v1, ""

    .line 378
    iget-object v2, v0, Ll/ܺ᩵ۧ;->ۜ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object/from16 v9, p5

    goto :goto_0

    :cond_1
    move-object v9, v2

    .line 379
    :goto_0
    iget-object v1, v0, Ll/ܺ᩵ۧ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 380
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 381
    iget-object v4, v0, Ll/ܺ᩵ۧ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 382
    :goto_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v4, v2, :cond_25

    move-object/from16 v10, p6

    .line 384
    invoke-virtual {v10, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹֡֫;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v11, p4

    .line 386
    invoke-virtual {v11, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵᩵ۧ;

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    iget v5, v5, Ll/᩵᩵ۧ;->᩷:I

    .line 402
    iget-object v6, v0, Ll/ܺ᩵ۧ;->ۢ:Ll/ۚ᩵ۧ;

    iget-object v7, v0, Ll/ܺ᩵ۧ;->ۡ:[Ljava/lang/String;

    invoke-static {v6, v7, v8}, Ll/֡᩵ۧ;->֫(Ll/ۚ᩵ۧ;[Ljava/lang/String;Ljava/util/Map;)Ll/ۚ᩵ۧ;

    move-result-object v6

    .line 403
    invoke-virtual {v3}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v7

    check-cast v7, Landroid/text/SpannableStringBuilder;

    if-nez v7, :cond_3

    .line 405
    new-instance v7, Landroid/text/SpannableStringBuilder;

    invoke-direct {v7}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 406
    invoke-virtual {v3, v7}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    :cond_3
    if-eqz v6, :cond_26

    .line 94
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ۖ()I

    move-result v12

    const/16 v13, 0x21

    const/4 v14, -0x1

    if-eq v12, v14, :cond_4

    .line 95
    new-instance v12, Landroid/text/style/StyleSpan;

    .line 96
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ۖ()I

    move-result v15

    invoke-direct {v12, v15}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 95
    invoke-interface {v7, v12, v4, v2, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 98
    :cond_4
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->֨()Z

    move-result v12

    if-eqz v12, :cond_5

    .line 99
    new-instance v12, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v12}, Landroid/text/style/StrikethroughSpan;-><init>()V

    invoke-interface {v7, v12, v4, v2, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 101
    :cond_5
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->۠()Z

    move-result v12

    if-eqz v12, :cond_6

    .line 102
    new-instance v12, Landroid/text/style/UnderlineSpan;

    invoke-direct {v12}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-interface {v7, v12, v4, v2, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 104
    :cond_6
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ۚ()Z

    move-result v12

    if-eqz v12, :cond_7

    .line 105
    new-instance v12, Landroid/text/style/ForegroundColorSpan;

    .line 107
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ܽ()I

    move-result v13

    invoke-direct {v12, v13}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 105
    invoke-static {v7, v12, v4, v2}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 112
    :cond_7
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->֡()Z

    move-result v12

    if-eqz v12, :cond_8

    .line 113
    new-instance v12, Landroid/text/style/BackgroundColorSpan;

    .line 115
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->֫()I

    move-result v13

    invoke-direct {v12, v13}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 113
    invoke-static {v7, v12, v4, v2}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 120
    :cond_8
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ᩳ()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_9

    .line 121
    new-instance v12, Landroid/text/style/TypefaceSpan;

    .line 123
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ᩳ()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v13}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 121
    invoke-static {v7, v12, v4, v2}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 128
    :cond_9
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->᩵()Ll/ۡ᩵ۧ;

    move-result-object v12

    const/4 v13, 0x2

    if-eqz v12, :cond_e

    .line 129
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->᩵()Ll/ۡ᩵ۧ;

    move-result-object v12

    .line 155
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    iget v15, v12, Ll/ۡ᩵ۧ;->ۧ:I

    if-ne v15, v14, :cond_c

    if-eq v5, v13, :cond_b

    const/4 v14, 0x1

    if-ne v5, v14, :cond_a

    goto :goto_3

    :cond_a
    const/4 v5, 0x1

    const/4 v15, 0x1

    goto :goto_4

    :cond_b
    :goto_3
    const/4 v5, 0x3

    const/4 v15, 0x3

    :goto_4
    const/4 v5, 0x1

    goto :goto_5

    .line 143
    :cond_c
    iget v5, v12, Ll/ۡ᩵ۧ;->֫:I

    .line 147
    :goto_5
    iget v12, v12, Ll/ۡ᩵ۧ;->ܽ:I

    const/4 v14, -0x2

    if-ne v12, v14, :cond_d

    const/4 v12, 0x1

    .line 155
    :cond_d
    new-instance v14, Ll/ۛ֡֫;

    invoke-direct {v14, v15, v5, v12}, Ll/ۛ֡֫;-><init>(III)V

    invoke-static {v7, v14, v4, v2}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 162
    :cond_e
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ۡ()I

    move-result v5

    if-eq v5, v13, :cond_10

    const/4 v12, 0x3

    if-eq v5, v12, :cond_f

    const/4 v12, 0x4

    if-eq v5, v12, :cond_f

    goto/16 :goto_b

    .line 210
    :cond_f
    new-instance v5, Ll/ۢ᩵ۧ;

    invoke-direct {v5}, Ll/ۢ᩵ۧ;-><init>()V

    const/16 v12, 0x21

    invoke-interface {v7, v5, v4, v2, v12}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto/16 :goto_b

    .line 276
    :cond_10
    iget-object v5, v0, Ll/ܺ᩵ۧ;->᩻:Ll/ܺ᩵ۧ;

    :goto_6
    if-eqz v5, :cond_12

    .line 277
    iget-object v12, v5, Ll/ܺ᩵ۧ;->ۢ:Ll/ۚ᩵ۧ;

    .line 245
    iget-object v13, v5, Ll/ܺ᩵ۧ;->ۡ:[Ljava/lang/String;

    .line 277
    invoke-static {v12, v13, v8}, Ll/֡᩵ۧ;->֫(Ll/ۚ᩵ۧ;[Ljava/lang/String;Ljava/util/Map;)Ll/ۚ᩵ۧ;

    move-result-object v12

    if-eqz v12, :cond_11

    .line 278
    invoke-virtual {v12}, Ll/ۚ᩵ۧ;->ۡ()I

    move-result v12

    const/4 v13, 0x1

    if-ne v12, v13, :cond_11

    goto :goto_7

    .line 281
    :cond_11
    iget-object v5, v5, Ll/ܺ᩵ۧ;->᩻:Ll/ܺ᩵ۧ;

    goto :goto_6

    :cond_12
    const/4 v5, 0x0

    :goto_7
    if-nez v5, :cond_13

    goto/16 :goto_b

    .line 256
    :cond_13
    new-instance v12, Ljava/util/ArrayDeque;

    invoke-direct {v12}, Ljava/util/ArrayDeque;-><init>()V

    .line 257
    invoke-virtual {v12, v5}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 258
    :cond_14
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_16

    .line 259
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܺ᩵ۧ;

    .line 261
    iget-object v14, v13, Ll/ܺ᩵ۧ;->ۢ:Ll/ۚ᩵ۧ;

    .line 245
    iget-object v15, v13, Ll/ܺ᩵ۧ;->ۡ:[Ljava/lang/String;

    .line 261
    invoke-static {v14, v15, v8}, Ll/֡᩵ۧ;->֫(Ll/ۚ᩵ۧ;[Ljava/lang/String;Ljava/util/Map;)Ll/ۚ᩵ۧ;

    move-result-object v14

    if-eqz v14, :cond_15

    .line 262
    invoke-virtual {v14}, Ll/ۚ᩵ۧ;->ۡ()I

    move-result v14

    const/4 v15, 0x3

    if-ne v14, v15, :cond_15

    goto :goto_9

    .line 265
    :cond_15
    invoke-virtual {v13}, Ll/ܺ᩵ۧ;->֫()I

    move-result v14

    :goto_8
    add-int/lit8 v14, v14, -0x1

    if-ltz v14, :cond_14

    .line 266
    invoke-virtual {v13, v14}, Ll/ܺ᩵ۧ;->֫(I)Ll/ܺ᩵ۧ;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_8

    :cond_16
    const/4 v13, 0x0

    :goto_9
    if-nez v13, :cond_17

    goto :goto_b

    .line 176
    :cond_17
    invoke-virtual {v13}, Ll/ܺ᩵ۧ;->֫()I

    move-result v12

    const/4 v14, 0x1

    if-ne v12, v14, :cond_1a

    const/4 v12, 0x0

    invoke-virtual {v13, v12}, Ll/ܺ᩵ۧ;->֫(I)Ll/ܺ᩵ۧ;

    move-result-object v14

    iget-object v14, v14, Ll/ܺ᩵ۧ;->ۖ:Ljava/lang/String;

    if-eqz v14, :cond_1a

    .line 177
    invoke-virtual {v13, v12}, Ll/ܺ᩵ۧ;->֫(I)Ll/ܺ᩵ۧ;

    move-result-object v12

    iget-object v12, v12, Ll/ܺ᩵ۧ;->ۖ:Ljava/lang/String;

    sget-object v14, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 184
    iget-object v14, v13, Ll/ܺ᩵ۧ;->ۢ:Ll/ۚ᩵ۧ;

    .line 245
    iget-object v13, v13, Ll/ܺ᩵ۧ;->ۡ:[Ljava/lang/String;

    .line 184
    invoke-static {v14, v13, v8}, Ll/֡᩵ۧ;->֫(Ll/ۚ᩵ۧ;[Ljava/lang/String;Ljava/util/Map;)Ll/ۚ᩵ۧ;

    move-result-object v13

    if-eqz v13, :cond_18

    .line 189
    invoke-virtual {v13}, Ll/ۚ᩵ۧ;->ۢ()I

    move-result v13

    goto :goto_a

    :cond_18
    const/4 v13, -0x1

    :goto_a
    const/4 v14, -0x1

    if-ne v13, v14, :cond_19

    .line 194
    iget-object v14, v5, Ll/ܺ᩵ۧ;->ۢ:Ll/ۚ᩵ۧ;

    .line 245
    iget-object v5, v5, Ll/ܺ᩵ۧ;->ۡ:[Ljava/lang/String;

    .line 195
    invoke-static {v14, v5, v8}, Ll/֡᩵ۧ;->֫(Ll/ۚ᩵ۧ;[Ljava/lang/String;Ljava/util/Map;)Ll/ۚ᩵ۧ;

    move-result-object v5

    if-eqz v5, :cond_19

    .line 196
    invoke-virtual {v5}, Ll/ۚ᩵ۧ;->ۢ()I

    move-result v13

    .line 199
    :cond_19
    new-instance v5, Ll/ۤ֡֫;

    invoke-direct {v5, v12, v13}, Ll/ۤ֡֫;-><init>(Ljava/lang/String;I)V

    const/16 v12, 0x21

    invoke-interface {v7, v5, v4, v2, v12}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_b

    :cond_1a
    const-string v5, "Skipping rubyText node without exactly one text child."

    .line 179
    invoke-static {v5}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 218
    :goto_b
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ᩴ()Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 219
    new-instance v5, Ll/۬֡֫;

    invoke-direct {v5}, Ll/۬֡֫;-><init>()V

    invoke-static {v7, v5, v4, v2}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 226
    :cond_1b
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ܳ()I

    move-result v5

    const/high16 v12, 0x42c80000    # 100.0f

    const/4 v13, 0x1

    if-eq v5, v13, :cond_22

    const/4 v13, 0x2

    if-eq v5, v13, :cond_21

    const/4 v13, 0x3

    if-eq v5, v13, :cond_1c

    const/high16 v2, 0x42c80000    # 100.0f

    move-object/from16 p5, v1

    goto/16 :goto_f

    .line 245
    :cond_1c
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ܿ()F

    move-result v5

    div-float/2addr v5, v12

    .line 76
    const-class v12, Landroid/text/style/RelativeSizeSpan;

    invoke-interface {v7, v4, v2, v12}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Landroid/text/style/RelativeSizeSpan;

    array-length v13, v12

    const/4 v14, 0x0

    :goto_c
    if-ge v14, v13, :cond_20

    aget-object v15, v12, v14

    move-object/from16 p5, v1

    .line 77
    invoke-interface {v7, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    if-gt v1, v4, :cond_1d

    .line 78
    invoke-interface {v7, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v2, :cond_1d

    .line 79
    invoke-virtual {v15}, Landroid/text/style/RelativeSizeSpan;->getSizeChange()F

    move-result v1

    mul-float v1, v1, v5

    move v5, v1

    .line 88
    :cond_1d
    invoke-interface {v7, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    if-ne v1, v4, :cond_1e

    .line 89
    invoke-interface {v7, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v1

    if-ne v1, v2, :cond_1e

    .line 90
    invoke-interface {v7, v15}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v5

    const/16 v5, 0x21

    if-ne v1, v5, :cond_1f

    .line 91
    invoke-interface {v7, v15}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    goto :goto_d

    :cond_1e
    move/from16 v16, v5

    :cond_1f
    :goto_d
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, p5

    move/from16 v5, v16

    goto :goto_c

    :cond_20
    move-object/from16 p5, v1

    const/high16 v1, 0x42c80000    # 100.0f

    .line 83
    new-instance v12, Landroid/text/style/RelativeSizeSpan;

    invoke-direct {v12, v5}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    const/16 v5, 0x21

    invoke-interface {v7, v12, v4, v2, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_e

    :cond_21
    move-object/from16 p5, v1

    const/high16 v1, 0x42c80000    # 100.0f

    .line 236
    new-instance v5, Landroid/text/style/RelativeSizeSpan;

    .line 238
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ܿ()F

    move-result v12

    invoke-direct {v5, v12}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 236
    invoke-static {v7, v5, v4, v2}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    goto :goto_e

    :cond_22
    move-object/from16 p5, v1

    const/high16 v1, 0x42c80000    # 100.0f

    .line 228
    new-instance v5, Landroid/text/style/AbsoluteSizeSpan;

    .line 230
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ܿ()F

    move-result v12

    float-to-int v12, v12

    const/4 v13, 0x1

    invoke-direct {v5, v12, v13}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 228
    invoke-static {v7, v5, v4, v2}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    :goto_e
    const/high16 v2, 0x42c80000    # 100.0f

    :goto_f
    const-string v1, "p"

    .line 411
    iget-object v4, v0, Ll/ܺ᩵ۧ;->ܺ:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    .line 412
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ܺ()F

    move-result v1

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v1, v1, v4

    if-eqz v1, :cond_23

    .line 420
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ܺ()F

    move-result v1

    const/high16 v4, -0x3d4c0000    # -90.0f

    mul-float v1, v1, v4

    div-float/2addr v1, v2

    invoke-virtual {v3, v1}, Ll/᩹֡֫;->ܽ(F)V

    .line 422
    :cond_23
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ۘ()Landroid/text/Layout$Alignment;

    move-result-object v1

    if-eqz v1, :cond_24

    .line 423
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ۘ()Landroid/text/Layout$Alignment;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/᩹֡֫;->ۧ(Landroid/text/Layout$Alignment;)V

    .line 425
    :cond_24
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ۜ()Landroid/text/Layout$Alignment;

    move-result-object v1

    if-eqz v1, :cond_27

    .line 426
    invoke-virtual {v6}, Ll/ۚ᩵ۧ;->ۜ()Landroid/text/Layout$Alignment;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/᩹֡֫;->֫(Landroid/text/Layout$Alignment;)V

    goto :goto_10

    :cond_25
    move-object/from16 v11, p4

    move-object/from16 v10, p6

    :cond_26
    move-object/from16 p5, v1

    :cond_27
    :goto_10
    move-object/from16 v1, p5

    goto/16 :goto_1

    :cond_28
    move-object/from16 v11, p4

    move-object/from16 v10, p6

    const/4 v1, 0x0

    const/4 v12, 0x0

    .line 390
    :goto_11
    invoke-virtual/range {p0 .. p0}, Ll/ܺ᩵ۧ;->֫()I

    move-result v1

    if-ge v12, v1, :cond_29

    .line 391
    invoke-virtual {v0, v12}, Ll/ܺ᩵ۧ;->֫(I)Ll/ܺ᩵ۧ;

    move-result-object v1

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object v6, v9

    move-object/from16 v7, p6

    .line 392
    invoke-direct/range {v1 .. v7}, Ll/ܺ᩵ۧ;->֫(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_11

    :cond_29
    :goto_12
    return-void
.end method

.method private ֫(JZLjava/lang/String;Ljava/util/TreeMap;)V
    .locals 13

    move-object v0, p0

    move-object/from16 v7, p5

    .line 322
    iget-object v1, v0, Ll/ܺ᩵ۧ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 323
    iget-object v8, v0, Ll/ܺ᩵ۧ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v8}, Ljava/util/HashMap;->clear()V

    const-string v2, "metadata"

    .line 324
    iget-object v3, v0, Ll/ܺ᩵ۧ;->ܺ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_7

    :cond_0
    const-string v2, ""

    .line 329
    iget-object v4, v0, Ll/ܺ᩵ۧ;->ۜ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object/from16 v9, p4

    goto :goto_0

    :cond_1
    move-object v9, v4

    .line 331
    :goto_0
    iget-boolean v2, v0, Ll/ܺ᩵ۧ;->ᩳ:Z

    if-eqz v2, :cond_2

    if-eqz p3, :cond_2

    .line 332
    invoke-static {v9, v7}, Ll/ܺ᩵ۧ;->֫(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 155
    iget-object v2, v0, Ll/ܺ᩵ۧ;->ۖ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-void

    :cond_2
    const-string v2, "br"

    .line 333
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/16 v10, 0xa

    if-eqz v2, :cond_3

    if-eqz p3, :cond_3

    .line 334
    invoke-static {v9, v7}, Ll/ܺ᩵ۧ;->֫(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    return-void

    .line 335
    :cond_3
    invoke-virtual {p0, p1, p2}, Ll/ܺ᩵ۧ;->֫(J)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 337
    invoke-virtual/range {p5 .. p5}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 339
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹֡֫;

    invoke-virtual {v4}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v4

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 338
    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    const-string v1, "p"

    .line 342
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const/4 v1, 0x0

    const/4 v12, 0x0

    .line 343
    :goto_2
    invoke-virtual {p0}, Ll/ܺ᩵ۧ;->֫()I

    move-result v1

    if-ge v12, v1, :cond_7

    .line 344
    invoke-virtual {p0, v12}, Ll/ܺ᩵ۧ;->֫(I)Ll/ܺ᩵ۧ;

    move-result-object v1

    if-nez p3, :cond_6

    if-eqz v11, :cond_5

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    const/4 v4, 0x0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v2, 0x1

    const/4 v4, 0x1

    :goto_4
    move-wide v2, p1

    move-object v5, v9

    move-object/from16 v6, p5

    .line 345
    invoke-direct/range {v1 .. v6}, Ll/ܺ᩵ۧ;->֫(JZLjava/lang/String;Ljava/util/TreeMap;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_7
    if-eqz v11, :cond_9

    .line 348
    invoke-static {v9, v7}, Ll/ܺ᩵ۧ;->֫(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 293
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_5
    if-ltz v2, :cond_8

    .line 294
    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-ne v3, v4, :cond_8

    add-int/lit8 v2, v2, -0x1

    goto :goto_5

    :cond_8
    if-ltz v2, :cond_9

    .line 297
    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v2

    if-eq v2, v10, :cond_9

    .line 298
    invoke-virtual {v1, v10}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 351
    :cond_9
    invoke-virtual/range {p5 .. p5}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 353
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹֡֫;

    invoke-virtual {v2}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 352
    invoke-virtual {v8, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_a
    :goto_7
    return-void
.end method

.method private ֫(Ljava/util/TreeSet;Z)V
    .locals 6

    const-string v0, "p"

    .line 225
    iget-object v1, p0, Ll/ܺ᩵ۧ;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "div"

    .line 226
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez p2, :cond_0

    if-nez v0, :cond_0

    if-eqz v1, :cond_2

    .line 227
    iget-object v1, p0, Ll/ܺ᩵ۧ;->ܽ:Ljava/lang/String;

    if-eqz v1, :cond_2

    :cond_0
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 228
    iget-wide v3, p0, Ll/ܺ᩵ۧ;->᩷:J

    cmp-long v5, v3, v1

    if-eqz v5, :cond_1

    .line 229
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 231
    :cond_1
    iget-wide v3, p0, Ll/ܺ᩵ۧ;->ۧ:J

    cmp-long v5, v3, v1

    if-eqz v5, :cond_2

    .line 232
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 235
    :cond_2
    iget-object v1, p0, Ll/ܺ᩵ۧ;->֫:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    .line 238
    :goto_0
    iget-object v2, p0, Ll/ܺ᩵ۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    .line 239
    iget-object v2, p0, Ll/ܺ᩵ۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ᩵ۧ;

    if-nez p2, :cond_5

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v3, 0x1

    :goto_2
    invoke-direct {v2, p1, v3}, Ll/ܺ᩵ۧ;->֫(Ljava/util/TreeSet;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    :goto_3
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ܺ᩵ۧ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(JLjava/util/Map;Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/util/ArrayList;
    .locals 9

    .line 254
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 255
    iget-object v1, p0, Ll/ܺ᩵ۧ;->ۜ:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v1, v0}, Ll/ܺ᩵ۧ;->֫(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 257
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    const/4 v5, 0x0

    .line 258
    iget-object v6, p0, Ll/ܺ᩵ۧ;->ۜ:Ljava/lang/String;

    move-object v2, p0

    move-wide v3, p1

    move-object v7, v1

    invoke-direct/range {v2 .. v7}, Ll/ܺ᩵ۧ;->֫(JZLjava/lang/String;Ljava/util/TreeMap;)V

    .line 259
    iget-object v7, p0, Ll/ܺ᩵ۧ;->ۜ:Ljava/lang/String;

    move-object v5, p3

    move-object v6, p4

    move-object v8, v1

    invoke-direct/range {v2 .. v8}, Ll/ܺ᩵ۧ;->֫(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 261
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 264
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/util/Pair;

    .line 265
    iget-object v2, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {p5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_0

    .line 271
    :cond_0
    invoke-static {v2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 272
    array-length v3, v2

    invoke-static {v2, v0, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 273
    iget-object p3, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p4, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩵᩵ۧ;

    .line 155
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    new-instance v3, Ll/᩹֡֫;

    invoke-direct {v3}, Ll/᩹֡֫;-><init>()V

    .line 277
    invoke-virtual {v3, v2}, Ll/᩹֡֫;->֫(Landroid/graphics/Bitmap;)V

    iget v2, p3, Ll/᩵᩵ۧ;->ܳ:F

    .line 278
    invoke-virtual {v3, v2}, Ll/᩹֡֫;->ۧ(F)V

    .line 279
    invoke-virtual {v3, v0}, Ll/᩹֡֫;->ۧ(I)V

    iget v2, p3, Ll/᩵᩵ۧ;->ܽ:F

    .line 280
    invoke-virtual {v3, v2, v0}, Ll/᩹֡֫;->֫(FI)V

    iget v0, p3, Ll/᩵᩵ۧ;->ᩳ:I

    .line 281
    invoke-virtual {v3, v0}, Ll/᩹֡֫;->֫(I)V

    iget v0, p3, Ll/᩵᩵ۧ;->ۢ:F

    .line 282
    invoke-virtual {v3, v0}, Ll/᩹֡֫;->ᩳ(F)V

    iget v0, p3, Ll/᩵᩵ۧ;->֫:F

    .line 283
    invoke-virtual {v3, v0}, Ll/᩹֡֫;->֫(F)V

    iget p3, p3, Ll/᩵᩵ۧ;->᩷:I

    .line 284
    invoke-virtual {v3, p3}, Ll/᩹֡֫;->ܽ(I)V

    .line 285
    invoke-virtual {v3}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p3

    .line 275
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 289
    :cond_1
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 290
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ll/᩵᩵ۧ;

    .line 155
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩹֡֫;

    .line 292
    invoke-virtual {p3}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    check-cast v1, Landroid/text/SpannableStringBuilder;

    .line 435
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    const-class v3, Ll/ۢ᩵ۧ;

    invoke-virtual {v1, v0, v2, v3}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ۢ᩵ۧ;

    .line 436
    array-length v3, v2

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 437
    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    const-string v7, ""

    invoke-virtual {v1, v6, v5, v7}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    .line 440
    :goto_3
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    const/16 v4, 0x20

    if-ge v2, v3, :cond_5

    .line 441
    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v3

    if-ne v3, v4, :cond_4

    add-int/lit8 v3, v2, 0x1

    move v5, v3

    .line 443
    :goto_4
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    if-ge v5, v6, :cond_3

    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v6

    if-ne v6, v4, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_3
    sub-int/2addr v5, v3

    if-lez v5, :cond_4

    add-int/2addr v5, v2

    .line 448
    invoke-virtual {v1, v2, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 453
    :cond_5
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    const/4 v3, 0x1

    if-lez v2, :cond_6

    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_6

    .line 454
    invoke-virtual {v1, v0, v3}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_6
    const/4 v2, 0x0

    .line 456
    :goto_5
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    sub-int/2addr v5, v3

    const/16 v6, 0xa

    if-ge v2, v5, :cond_8

    .line 457
    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v5

    if-ne v5, v6, :cond_7

    add-int/lit8 v5, v2, 0x1

    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v6

    if-ne v6, v4, :cond_7

    add-int/lit8 v6, v2, 0x2

    .line 458
    invoke-virtual {v1, v5, v6}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 462
    :cond_8
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_9

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_9

    .line 463
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    invoke-virtual {v1, v2, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_9
    const/4 v2, 0x0

    .line 465
    :goto_6
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    sub-int/2addr v5, v3

    if-ge v2, v5, :cond_b

    .line 466
    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v5

    if-ne v5, v4, :cond_a

    add-int/lit8 v5, v2, 0x1

    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v7

    if-ne v7, v6, :cond_a

    .line 467
    invoke-virtual {v1, v2, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 471
    :cond_b
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_c

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v2

    if-ne v2, v6, :cond_c

    .line 472
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 293
    :cond_c
    iget v1, p5, Ll/᩵᩵ۧ;->ܽ:F

    iget v2, p5, Ll/᩵᩵ۧ;->ܿ:I

    invoke-virtual {p3, v1, v2}, Ll/᩹֡֫;->֫(FI)V

    .line 294
    iget v1, p5, Ll/᩵᩵ۧ;->ᩳ:I

    invoke-virtual {p3, v1}, Ll/᩹֡֫;->֫(I)V

    .line 295
    iget v1, p5, Ll/᩵᩵ۧ;->ܳ:F

    invoke-virtual {p3, v1}, Ll/᩹֡֫;->ۧ(F)V

    .line 296
    iget v1, p5, Ll/᩵᩵ۧ;->ۢ:F

    invoke-virtual {p3, v1}, Ll/᩹֡֫;->ᩳ(F)V

    .line 297
    iget v1, p5, Ll/᩵᩵ۧ;->᩻:F

    iget v2, p5, Ll/᩵᩵ۧ;->ۜ:I

    invoke-virtual {p3, v1, v2}, Ll/᩹֡֫;->ۧ(FI)V

    .line 298
    iget p5, p5, Ll/᩵᩵ۧ;->᩷:I

    invoke-virtual {p3, p5}, Ll/᩹֡֫;->ܽ(I)V

    .line 299
    invoke-virtual {p3}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_d
    return-object p1
.end method

.method public final ֫(I)Ll/ܺ᩵ۧ;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ܺ᩵ۧ;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 206
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺ᩵ۧ;

    return-object p1

    .line 204
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ܺ᩵ۧ;)V
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ܺ᩵ۧ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܺ᩵ۧ;->֫:Ljava/util/ArrayList;

    .line 199
    :cond_0
    iget-object v0, p0, Ll/ܺ᩵ۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(J)Z
    .locals 7

    .line 189
    iget-wide v0, p0, Ll/ܺ᩵ۧ;->ۧ:J

    iget-wide v2, p0, Ll/ܺ᩵ۧ;->᩷:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    cmp-long v6, v0, v4

    if-eqz v6, :cond_3

    :cond_0
    cmp-long v6, v2, p1

    if-gtz v6, :cond_1

    cmp-long v6, v0, v4

    if-eqz v6, :cond_3

    :cond_1
    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    cmp-long v4, p1, v0

    if-ltz v4, :cond_3

    :cond_2
    cmp-long v4, v2, p1

    if-gtz v4, :cond_4

    cmp-long v2, p1, v0

    if-gez v2, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()[J
    .locals 6

    .line 214
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    const/4 v1, 0x0

    .line 215
    invoke-direct {p0, v0, v1}, Ll/ܺ᩵ۧ;->֫(Ljava/util/TreeSet;Z)V

    .line 216
    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    move-result v2

    new-array v2, v2, [J

    .line 218
    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    add-int/lit8 v5, v1, 0x1

    .line 219
    aput-wide v3, v2, v1

    move v1, v5

    goto :goto_0

    :cond_0
    return-object v2
.end method
