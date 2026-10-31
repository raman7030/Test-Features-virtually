.class public final Ll/᩺᩵ۧ;
.super Ljava/lang/Object;
.source "E8SE"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ljava/util/Map;

.field public static final ᩳ:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$"

    .line 123
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩵ۧ;->֫:Ljava/util/regex/Pattern;

    const-string v0, "(\\S+?):(\\S+)"

    .line 124
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩵ۧ;->ۧ:Ljava/util/regex/Pattern;

    .line 161
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0xff

    .line 162
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "white"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    .line 163
    invoke-static {v2, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "lime"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    invoke-static {v2, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "cyan"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    invoke-static {v1, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "red"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    invoke-static {v1, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "yellow"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    invoke-static {v1, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "magenta"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    invoke-static {v2, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "blue"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "black"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ll/᩺᩵ۧ;->ᩳ:Ljava/util/Map;

    .line 180
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 181
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "bg_white"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    invoke-static {v2, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "bg_lime"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    invoke-static {v2, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "bg_cyan"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    invoke-static {v1, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "bg_red"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    invoke-static {v1, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "bg_yellow"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    invoke-static {v1, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "bg_magenta"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    invoke-static {v2, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "bg_blue"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "bg_black"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ll/᩺᩵ۧ;->ܽ:Ljava/util/Map;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;
    .locals 12

    .line 253
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 254
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 256
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    .line 257
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_1e

    .line 258
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x3e

    const/16 v6, 0x3c

    const/16 v7, 0x26

    const/4 v8, 0x2

    const/4 v9, -0x1

    if-eq v4, v7, :cond_15

    if-eq v4, v6, :cond_0

    .line 317
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v4, v3, 0x1

    .line 261
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-lt v4, v6, :cond_1

    goto/16 :goto_9

    .line 266
    :cond_1
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x2f

    if-ne v6, v7, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 494
    :goto_1
    invoke-virtual {p1, v5, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    if-ne v4, v9, :cond_3

    .line 495
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    :goto_2
    add-int/lit8 v5, v4, -0x2

    const/4 v9, 0x0

    .line 268
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-ne v10, v7, :cond_4

    const/4 v7, 0x1

    goto :goto_3

    :cond_4
    const/4 v7, 0x0

    :goto_3
    if-eqz v6, :cond_5

    const/4 v10, 0x2

    goto :goto_4

    :cond_5
    const/4 v10, 0x1

    :goto_4
    add-int/2addr v3, v10

    if-eqz v7, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v5, v4, -0x1

    .line 270
    :goto_5
    invoke-virtual {p1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 271
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    goto/16 :goto_9

    .line 754
    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 755
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    xor-int/lit8 v10, v10, 0x1

    invoke-static {v10}, Ll/᩺֡֫;->֫(Z)V

    .line 756
    sget-object v10, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v10, "[ \\.]"

    .line 1105
    invoke-virtual {v5, v10, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 756
    aget-object v5, v5, v9

    .line 519
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v8, "ruby"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_6

    :cond_8
    const/4 v8, 0x7

    goto :goto_7

    :sswitch_1
    const-string v8, "lang"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    const/4 v8, 0x6

    goto :goto_7

    :sswitch_2
    const-string v8, "rt"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_6

    :cond_a
    const/4 v8, 0x5

    goto :goto_7

    :sswitch_3
    const-string v8, "v"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_6

    :cond_b
    const/4 v8, 0x4

    goto :goto_7

    :sswitch_4
    const-string v8, "u"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_6

    :cond_c
    const/4 v8, 0x3

    goto :goto_7

    :sswitch_5
    const-string v8, "i"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_6

    :cond_d
    const/4 v8, 0x2

    goto :goto_7

    :sswitch_6
    const-string v8, "c"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto :goto_6

    :cond_e
    const/4 v8, 0x1

    goto :goto_7

    :sswitch_7
    const-string v8, "b"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_6

    :cond_f
    const/4 v8, 0x0

    goto :goto_7

    :goto_6
    const/4 v8, -0x1

    :goto_7
    packed-switch v8, :pswitch_data_0

    goto :goto_9

    :pswitch_0
    if-eqz v6, :cond_13

    .line 281
    :cond_10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_11

    goto :goto_9

    .line 284
    :cond_11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤ᩵ۧ;

    .line 285
    invoke-static {p0, v3, v2, v0, p2}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;Ll/ۤ᩵ۧ;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 286
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_12

    .line 287
    new-instance v6, Ll/۫᩵ۧ;

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v7

    invoke-direct {v6, v3, v7}, Ll/۫᩵ۧ;-><init>(Ll/ۤ᩵ۧ;I)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 289
    :cond_12
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 291
    :goto_8
    iget-object v3, v3, Ll/ۤ᩵ۧ;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_9

    :cond_13
    if-nez v7, :cond_14

    .line 293
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    invoke-static {v5, v3}, Ll/ۤ᩵ۧ;->֫(ILjava/lang/String;)Ll/ۤ᩵ۧ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_14
    :goto_9
    move v3, v4

    goto/16 :goto_0

    :cond_15
    add-int/lit8 v3, v3, 0x1

    const/16 v8, 0x3b

    .line 297
    invoke-virtual {p1, v8, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v8

    const/16 v10, 0x20

    .line 298
    invoke-virtual {p1, v10, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v11

    if-ne v8, v9, :cond_16

    move v8, v11

    goto :goto_a

    :cond_16
    if-ne v11, v9, :cond_17

    goto :goto_a

    .line 304
    :cond_17
    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    move-result v8

    :goto_a
    if-eq v8, v9, :cond_1d

    .line 306
    invoke-virtual {p1, v3, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 499
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_1

    goto :goto_b

    :sswitch_8
    const-string v4, "nbsp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    goto :goto_b

    :cond_18
    const/4 v9, 0x3

    goto :goto_b

    :sswitch_9
    const-string v4, "amp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    goto :goto_b

    :cond_19
    const/4 v9, 0x2

    goto :goto_b

    :sswitch_a
    const-string v4, "lt"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    goto :goto_b

    :cond_1a
    const/4 v9, 0x1

    goto :goto_b

    :sswitch_b
    const-string v4, "gt"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    goto :goto_b

    :cond_1b
    const/4 v9, 0x0

    :goto_b
    packed-switch v9, :pswitch_data_1

    .line 513
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ignoring unsupported entity: \'&"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ";\'"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_c

    .line 507
    :pswitch_1
    invoke-virtual {v0, v10}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    goto :goto_c

    .line 510
    :pswitch_2
    invoke-virtual {v0, v7}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    goto :goto_c

    .line 501
    :pswitch_3
    invoke-virtual {v0, v6}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    goto :goto_c

    .line 504
    :pswitch_4
    invoke-virtual {v0, v5}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    :goto_c
    if-ne v8, v11, :cond_1c

    const-string v3, " "

    .line 308
    invoke-virtual {v0, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_1c
    add-int/lit8 v3, v8, 0x1

    goto/16 :goto_0

    .line 312
    :cond_1d
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_0

    .line 323
    :cond_1e
    :goto_d
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1f

    .line 324
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ᩵ۧ;

    invoke-static {p0, p1, v2, v0, p2}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;Ll/ۤ᩵ۧ;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    goto :goto_d

    .line 328
    :cond_1f
    invoke-static {}, Ll/ۤ᩵ۧ;->֫()Ll/ۤ᩵ۧ;

    move-result-object p1

    .line 329
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 326
    invoke-static {p0, p1, v1, v0, p2}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;Ll/ۤ᩵ۧ;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 332
    invoke-static {v0}, Landroid/text/SpannedString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannedString;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x62 -> :sswitch_7
        0x63 -> :sswitch_6
        0x69 -> :sswitch_5
        0x75 -> :sswitch_4
        0x76 -> :sswitch_3
        0xe42 -> :sswitch_2
        0x3291ee -> :sswitch_1
        0x3595da -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0xced -> :sswitch_b
        0xd88 -> :sswitch_a
        0x179c4 -> :sswitch_9
        0x337f11 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static ֫(Ljava/util/List;Ljava/lang/String;Ll/ۤ᩵ۧ;)Ljava/util/ArrayList;
    .locals 6

    .line 761
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 762
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 763
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ᩵ۧ;

    .line 764
    iget-object v3, p2, Ll/ۤ᩵ۧ;->ۧ:Ljava/lang/String;

    iget-object v4, p2, Ll/ۤ᩵ۧ;->֫:Ljava/util/Set;

    iget-object v5, p2, Ll/ۤ᩵ۧ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v2, p1, v3, v4, v5}, Ll/ۙ᩵ۧ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_0

    .line 766
    new-instance v4, Ll/ۛ᩵ۧ;

    invoke-direct {v4, v3, v2}, Ll/ۛ᩵ۧ;-><init>(ILl/ۙ᩵ۧ;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 769
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/regex/Matcher;Ll/ᩳ֨֫;Ljava/util/ArrayList;)Ll/ۗ᩵ۧ;
    .locals 7

    .line 343
    new-instance v0, Ll/ۨ᩵ۧ;

    invoke-direct {v0}, Ll/ۨ᩵ۧ;-><init>()V

    const/4 v1, 0x1

    .line 347
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    invoke-static {v1}, Ll/۟᩵ۧ;->ۧ(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, v0, Ll/ۨ᩵ۧ;->ۜ:J

    const/4 v1, 0x2

    .line 349
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    invoke-static {v1}, Ll/۟᩵ۧ;->ۧ(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, v0, Ll/ۨ᩵ۧ;->֫:J
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x3

    .line 355
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    invoke-static {p1, v0}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;Ll/ۨ᩵ۧ;)V

    .line 358
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    :goto_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v1}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    .line 360
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 362
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_0

    const-string v2, "\n"

    .line 363
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 367
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, p3}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;

    move-result-object p0

    iput-object p0, v0, Ll/ۨ᩵ۧ;->᩷:Ljava/lang/CharSequence;

    .line 807
    new-instance p0, Ll/ۗ᩵ۧ;

    invoke-virtual {v0}, Ll/ۨ᩵ۧ;->֫()Ll/᩹֡֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object v2

    iget-wide v3, v0, Ll/ۨ᩵ۧ;->ۜ:J

    iget-wide v5, v0, Ll/ۨ᩵ۧ;->֫:J

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Ll/ۗ᩵ۧ;-><init>(Ll/᩶֡֫;JJ)V

    return-object p0

    .line 351
    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "Skipping cue with bad header: "

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ᩳ֨֫;Ljava/util/ArrayList;)Ll/ۗ᩵ۧ;
    .locals 6

    .line 201
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    .line 205
    :cond_0
    sget-object v3, Ll/᩺᩵ۧ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 206
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 208
    invoke-static {v2, v4, p0, p1}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;Ll/ᩳ֨֫;Ljava/util/ArrayList;)Ll/ۗ᩵ۧ;

    move-result-object p0

    return-object p0

    .line 588
    :cond_1
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 215
    :cond_2
    invoke-virtual {v3, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 216
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 218
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0, p0, p1}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;Ljava/util/regex/Matcher;Ll/ᩳ֨֫;Ljava/util/ArrayList;)Ll/ۗ᩵ۧ;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    return-object v2
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩹֡֫;
    .locals 1

    .line 230
    new-instance v0, Ll/ۨ᩵ۧ;

    invoke-direct {v0}, Ll/ۨ᩵ۧ;-><init>()V

    .line 231
    invoke-static {p0, v0}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;Ll/ۨ᩵ۧ;)V

    .line 232
    invoke-virtual {v0}, Ll/ۨ᩵ۧ;->֫()Ll/᩹֡֫;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ll/ۤ᩵ۧ;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 540
    iget v4, v1, Ll/ۤ᩵ۧ;->ܽ:I

    .line 541
    invoke-virtual/range {p3 .. p3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    .line 543
    iget-object v6, v1, Ll/ۤ᩵ۧ;->ۧ:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/4 v9, -0x1

    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v7, "ruby"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x7

    goto :goto_1

    :sswitch_1
    const-string v7, "lang"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    const/4 v6, 0x6

    goto :goto_1

    :sswitch_2
    const-string v7, "v"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x5

    goto :goto_1

    :sswitch_3
    const-string v7, "u"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x4

    goto :goto_1

    :sswitch_4
    const-string v7, "i"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_0

    :cond_4
    const/4 v6, 0x3

    goto :goto_1

    :sswitch_5
    const-string v7, "c"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_0

    :cond_5
    const/4 v6, 0x2

    goto :goto_1

    :sswitch_6
    const-string v7, "b"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_0

    :cond_6
    const/4 v6, 0x1

    goto :goto_1

    :sswitch_7
    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_0

    :cond_7
    const/4 v6, 0x0

    goto :goto_1

    :goto_0
    const/4 v6, -0x1

    :goto_1
    const/16 v7, 0x21

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_9

    .line 581
    :pswitch_0
    invoke-static {v3, v0, v1}, Ll/᩺᩵ۧ;->ۧ(Ljava/util/List;Ljava/lang/String;Ll/ۤ᩵ۧ;)I

    move-result v6

    .line 582
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v11, p2

    .line 583
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 584
    invoke-static {}, Ll/۫᩵ۧ;->֫()Ll/۬᩵ۧ;

    move-result-object v11

    invoke-static {v10, v11}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 586
    iget v11, v1, Ll/ۤ᩵ۧ;->ܽ:I

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 587
    :goto_2
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v12, v14, :cond_d

    .line 588
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/۫᩵ۧ;

    invoke-static {v14}, Ll/۫᩵ۧ;->ۧ(Ll/۫᩵ۧ;)Ll/ۤ᩵ۧ;

    move-result-object v14

    iget-object v14, v14, Ll/ۤ᩵ۧ;->ۧ:Ljava/lang/String;

    const-string v15, "rt"

    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    goto :goto_4

    .line 591
    :cond_8
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/۫᩵ۧ;

    .line 595
    invoke-static {v14}, Ll/۫᩵ۧ;->ۧ(Ll/۫᩵ۧ;)Ll/ۤ᩵ۧ;

    move-result-object v15

    .line 597
    invoke-static {v3, v0, v15}, Ll/᩺᩵ۧ;->ۧ(Ljava/util/List;Ljava/lang/String;Ll/ۤ᩵ۧ;)I

    move-result v15

    if-eq v15, v9, :cond_9

    goto :goto_3

    :cond_9
    if-eq v6, v9, :cond_a

    move v15, v6

    goto :goto_3

    :cond_a
    const/4 v15, 0x1

    .line 601
    :goto_3
    invoke-static {v14}, Ll/۫᩵ۧ;->ۧ(Ll/۫᩵ۧ;)Ll/ۤ᩵ۧ;

    move-result-object v9

    iget v9, v9, Ll/ۤ᩵ۧ;->ܽ:I

    sub-int/2addr v9, v13

    .line 602
    invoke-static {v14}, Ll/۫᩵ۧ;->֫(Ll/۫᩵ۧ;)I

    move-result v14

    sub-int/2addr v14, v13

    .line 603
    invoke-virtual {v2, v9, v14}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v16

    .line 604
    invoke-virtual {v2, v9, v14}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 605
    new-instance v14, Ll/ۤ֡֫;

    .line 606
    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v14, v8, v15}, Ll/ۤ֡֫;-><init>(Ljava/lang/String;I)V

    .line 605
    invoke-virtual {v2, v14, v11, v9, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 610
    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->length()I

    move-result v8

    add-int/2addr v8, v13

    move v13, v8

    move v11, v9

    :goto_4
    add-int/lit8 v12, v12, 0x1

    const/4 v9, -0x1

    goto :goto_2

    .line 560
    :pswitch_1
    iget-object v6, v1, Ll/ۤ᩵ۧ;->ᩳ:Ljava/lang/String;

    .line 666
    new-instance v8, Ll/ۨ֡֫;

    invoke-direct {v8, v6}, Ll/ۨ֡֫;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_6

    .line 554
    :pswitch_2
    new-instance v6, Landroid/text/style/UnderlineSpan;

    invoke-direct {v6}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {v2, v6, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_6

    .line 548
    :pswitch_3
    new-instance v6, Landroid/text/style/StyleSpan;

    const/4 v8, 0x2

    invoke-direct {v6, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v2, v6, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_6

    .line 557
    :pswitch_4
    iget-object v6, v1, Ll/ۤ᩵ۧ;->֫:Ljava/util/Set;

    .line 653
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_b
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 654
    sget-object v9, Ll/᩺᩵ۧ;->ᩳ:Ljava/util/Map;

    invoke-interface {v9, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    .line 655
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 656
    new-instance v9, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v9, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v2, v9, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_5

    .line 657
    :cond_c
    sget-object v9, Ll/᩺᩵ۧ;->ܽ:Ljava/util/Map;

    invoke-interface {v9, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    .line 658
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 659
    new-instance v9, Landroid/text/style/BackgroundColorSpan;

    invoke-direct {v9, v8}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    invoke-virtual {v2, v9, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_5

    .line 545
    :pswitch_5
    new-instance v6, Landroid/text/style/StyleSpan;

    const/4 v8, 0x1

    invoke-direct {v6, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v2, v6, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 569
    :cond_d
    :goto_6
    :pswitch_6
    invoke-static {v3, v0, v1}, Ll/᩺᩵ۧ;->֫(Ljava/util/List;Ljava/lang/String;Ll/ۤ᩵ۧ;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    .line 570
    :goto_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_18

    .line 571
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ᩵ۧ;

    iget-object v3, v3, Ll/ۛ᩵ۧ;->᩹:Ll/ۙ᩵ۧ;

    .line 674
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ۜ()I

    move-result v6

    const/4 v8, -0x1

    if-eq v6, v8, :cond_e

    .line 675
    new-instance v6, Landroid/text/style/StyleSpan;

    .line 677
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ۜ()I

    move-result v8

    invoke-direct {v6, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 675
    invoke-static {v2, v6, v4, v5}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 682
    :cond_e
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ۡ()Z

    move-result v6

    if-eqz v6, :cond_f

    .line 683
    new-instance v6, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v6}, Landroid/text/style/StrikethroughSpan;-><init>()V

    invoke-virtual {v2, v6, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 685
    :cond_f
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ܺ()Z

    move-result v6

    if-eqz v6, :cond_10

    .line 686
    new-instance v6, Landroid/text/style/UnderlineSpan;

    invoke-direct {v6}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {v2, v6, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 688
    :cond_10
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ۢ()Z

    move-result v6

    if-eqz v6, :cond_11

    .line 689
    new-instance v6, Landroid/text/style/ForegroundColorSpan;

    .line 691
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ܽ()I

    move-result v8

    invoke-direct {v6, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 689
    invoke-static {v2, v6, v4, v5}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 696
    :cond_11
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->᩷()Z

    move-result v6

    if-eqz v6, :cond_12

    .line 697
    new-instance v6, Landroid/text/style/BackgroundColorSpan;

    .line 699
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->֫()I

    move-result v8

    invoke-direct {v6, v8}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 697
    invoke-static {v2, v6, v4, v5}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 704
    :cond_12
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ᩳ()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_13

    .line 705
    new-instance v6, Landroid/text/style/TypefaceSpan;

    .line 707
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ᩳ()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v8}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 705
    invoke-static {v2, v6, v4, v5}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 712
    :cond_13
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ܳ()I

    move-result v6

    const/4 v8, 0x1

    if-eq v6, v8, :cond_16

    const/4 v8, 0x2

    if-eq v6, v8, :cond_15

    const/4 v9, 0x3

    if-eq v6, v9, :cond_14

    goto :goto_8

    .line 730
    :cond_14
    new-instance v6, Landroid/text/style/RelativeSizeSpan;

    .line 732
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ܿ()F

    move-result v9

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v9, v10

    invoke-direct {v6, v9}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 730
    invoke-static {v2, v6, v4, v5}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    goto :goto_8

    .line 722
    :cond_15
    new-instance v6, Landroid/text/style/RelativeSizeSpan;

    .line 724
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ܿ()F

    move-result v9

    invoke-direct {v6, v9}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 722
    invoke-static {v2, v6, v4, v5}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    goto :goto_8

    :cond_16
    const/4 v8, 0x2

    .line 714
    new-instance v6, Landroid/text/style/AbsoluteSizeSpan;

    .line 716
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ܿ()F

    move-result v9

    float-to-int v9, v9

    const/4 v10, 0x1

    invoke-direct {v6, v9, v10}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 714
    invoke-static {v2, v6, v4, v5}, Ll/ۛ᩸ۘ;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 741
    :goto_8
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_17

    .line 742
    new-instance v3, Ll/۬֡֫;

    invoke-direct {v3}, Ll/۬֡֫;-><init>()V

    invoke-virtual {v2, v3, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_17
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_7

    :cond_18
    :goto_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_7
        0x62 -> :sswitch_6
        0x63 -> :sswitch_5
        0x69 -> :sswitch_4
        0x75 -> :sswitch_3
        0x76 -> :sswitch_2
        0x3291ee -> :sswitch_1
        0x3595da -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;Ll/ۨ᩵ۧ;)V
    .locals 11

    .line 373
    sget-object v0, Ll/᩺᩵ۧ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 375
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 v0, 0x1

    .line 376
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x2

    .line 377
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    const-string v3, "line"

    .line 379
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 380
    invoke-static {v2, p1}, Ll/᩺᩵ۧ;->ۧ(Ljava/lang/String;Ll/ۨ᩵ۧ;)V

    goto :goto_0

    :cond_0
    const-string v3, "align"

    .line 381
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "start"

    const-string v5, "end"

    const-string v6, "middle"

    const-string v7, "center"

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v10, -0x1

    if-eqz v3, :cond_7

    .line 467
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v9, 0x5

    goto :goto_2

    :sswitch_1
    const-string v1, "right"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v9, 0x4

    goto :goto_2

    :sswitch_2
    const-string v1, "left"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v9, 0x3

    goto :goto_2

    :sswitch_3
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v9, 0x2

    goto :goto_2

    :sswitch_4
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v9, 0x1

    goto :goto_2

    :sswitch_5
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :goto_1
    const/4 v9, -0x1

    :cond_6
    :goto_2
    packed-switch v9, :pswitch_data_0

    :try_start_1
    const-string v0, "Invalid alignment value: "

    goto :goto_3

    :pswitch_0
    const/4 v0, 0x5

    goto :goto_4

    :pswitch_1
    const/4 v0, 0x4

    goto :goto_4

    :pswitch_2
    const/4 v0, 0x3

    goto :goto_4

    .line 480
    :goto_3
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :pswitch_3
    const/4 v0, 0x2

    .line 382
    :goto_4
    :pswitch_4
    iput v0, p1, Ll/ۨ᩵ۧ;->ۢ:I

    goto/16 :goto_0

    :cond_7
    const-string v3, "position"

    .line 383
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    const/16 v1, 0x2c

    .line 429
    invoke-virtual {v2, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-eq v1, v10, :cond_e

    add-int/lit8 v3, v1, 0x1

    .line 431
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 438
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_1

    goto :goto_5

    :sswitch_6
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_5

    :sswitch_7
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    const/4 v8, 0x4

    goto :goto_6

    :sswitch_8
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_5

    :cond_9
    const/4 v8, 0x3

    goto :goto_6

    :sswitch_9
    const-string v4, "line-right"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_5

    :cond_a
    const/4 v8, 0x2

    goto :goto_6

    :sswitch_a
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_5

    :cond_b
    const/4 v8, 0x1

    goto :goto_6

    :sswitch_b
    const-string v4, "line-left"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_5

    :cond_c
    const/4 v8, 0x0

    goto :goto_6

    :goto_5
    const/4 v8, -0x1

    :cond_d
    :goto_6
    packed-switch v8, :pswitch_data_1

    :try_start_2
    const-string v0, "Invalid anchor value: "

    goto :goto_7

    :pswitch_5
    const/4 v0, 0x2

    goto :goto_8

    :pswitch_6
    const/4 v0, 0x0

    goto :goto_8

    .line 449
    :goto_7
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/high16 v0, -0x80000000

    .line 431
    :goto_8
    :pswitch_7
    iput v0, p1, Ll/ۨ᩵ۧ;->ܳ:I

    .line 432
    invoke-virtual {v2, v9, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 434
    :cond_e
    invoke-static {v2}, Ll/۟᩵ۧ;->֫(Ljava/lang/String;)F

    move-result v0

    iput v0, p1, Ll/ۨ᩵ۧ;->ܿ:F

    goto/16 :goto_0

    :cond_f
    const-string v3, "size"

    .line 385
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 386
    invoke-static {v2}, Ll/۟᩵ۧ;->֫(Ljava/lang/String;)F

    move-result v0

    iput v0, p1, Ll/ۨ᩵ۧ;->᩻:F

    goto/16 :goto_0

    :cond_10
    const-string v3, "vertical"

    .line 387
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v3, :cond_13

    const-string v1, "lr"

    .line 455
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    const-string v1, "rl"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    :try_start_3
    const-string v0, "Invalid \'vertical\' value: "

    .line 461
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/high16 v0, -0x80000000

    goto :goto_9

    :cond_11
    const/4 v0, 0x2

    .line 388
    :cond_12
    :goto_9
    iput v0, p1, Ll/ۨ᩵ۧ;->ۡ:I

    goto/16 :goto_0

    .line 390
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown cue setting "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    .line 393
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Skipping bad cue setting: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_14
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_5
        -0x4009266b -> :sswitch_4
        0x188db -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x6dd215c0 -> :sswitch_b
        -0x514d33ab -> :sswitch_a
        -0x4c1a40fd -> :sswitch_9
        -0x4009266b -> :sswitch_8
        0x188db -> :sswitch_7
        0x68ac462 -> :sswitch_6
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static ۧ(Ljava/util/List;Ljava/lang/String;Ll/ۤ᩵ۧ;)I
    .locals 2

    .line 618
    invoke-static {p0, p1, p2}, Ll/᩺᩵ۧ;->֫(Ljava/util/List;Ljava/lang/String;Ll/ۤ᩵ۧ;)Ljava/util/ArrayList;

    move-result-object p0

    const/4 p1, 0x0

    .line 619
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v0, -0x1

    if-ge p1, p2, :cond_1

    .line 620
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۛ᩵ۧ;

    iget-object p2, p2, Ll/ۛ᩵ۧ;->᩹:Ll/ۙ᩵ۧ;

    .line 621
    invoke-virtual {p2}, Ll/ۙ᩵ۧ;->᩻()I

    move-result v1

    if-eq v1, v0, :cond_0

    .line 622
    invoke-virtual {p2}, Ll/ۙ᩵ۧ;->᩻()I

    move-result p0

    return p0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static ۧ(Ljava/lang/String;Ll/ۨ᩵ۧ;)V
    .locals 7

    const/16 v0, 0x2c

    .line 399
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v0, v3, :cond_4

    add-int/lit8 v4, v0, 0x1

    .line 401
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 414
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v6, 0x2

    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v5, "start"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1
    const-string v5, "end"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_2
    const-string v5, "middle"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_3
    const-string v5, "center"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    const-string v3, "Invalid anchor value: "

    .line 423
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/high16 v6, -0x80000000

    goto :goto_1

    :pswitch_0
    const/4 v6, 0x0

    goto :goto_1

    :pswitch_1
    const/4 v6, 0x1

    .line 401
    :goto_1
    :pswitch_2
    iput v6, p1, Ll/ۨ᩵ۧ;->ܽ:I

    .line 402
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_4
    const-string v0, "%"

    .line 404
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 405
    invoke-static {p0}, Ll/۟᩵ۧ;->֫(Ljava/lang/String;)F

    move-result p0

    iput p0, p1, Ll/ۨ᩵ۧ;->ۧ:F

    .line 406
    iput v1, p1, Ll/ۨ᩵ۧ;->ᩳ:I

    return-void

    .line 408
    :cond_5
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    int-to-float p0, p0

    iput p0, p1, Ll/ۨ᩵ۧ;->ۧ:F

    .line 409
    iput v2, p1, Ll/ۨ᩵ۧ;->ᩳ:I

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_3
        -0x4009266b -> :sswitch_2
        0x188db -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
