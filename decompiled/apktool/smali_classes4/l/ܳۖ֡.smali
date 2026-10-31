.class public final Ll/ܳۖ֡;
.super Ll/ۨܺ֡;
.source "T3M6"


# static fields
.field public static final ֫:Ll/ܳۖ֡;

.field public static final ۧ:Ljava/util/HashMap;

.field public static final ܽ:[I

.field public static final ᩳ:[[I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 63
    new-instance v0, Ll/ܳۖ֡;

    .line 33
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 63
    sput-object v0, Ll/ܳۖ֡;->֫:Ll/ܳۖ֡;

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܳۖ֡;->ۧ:Ljava/util/HashMap;

    const/4 v1, 0x0

    .line 67
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "file"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "cdir"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "pdir"

    .line 69
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "dir"

    .line 70
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    .line 73
    filled-new-array {v1, v2, v0}, [I

    move-result-object v3

    sput-object v3, Ll/ܳۖ֡;->ܽ:[I

    new-array v3, v1, [I

    const/16 v4, 0x8

    new-array v4, v4, [[I

    aput-object v3, v4, v1

    .line 76
    filled-new-array {v0}, [I

    move-result-object v3

    aput-object v3, v4, v2

    filled-new-array {v2}, [I

    move-result-object v3

    aput-object v3, v4, v0

    filled-new-array {v0, v2}, [I

    move-result-object v3

    const/4 v5, 0x3

    aput-object v3, v4, v5

    filled-new-array {v1}, [I

    move-result-object v3

    const/4 v5, 0x4

    aput-object v3, v4, v5

    filled-new-array {v1, v0}, [I

    move-result-object v3

    const/4 v5, 0x5

    aput-object v3, v4, v5

    filled-new-array {v1, v2}, [I

    move-result-object v3

    const/4 v5, 0x6

    aput-object v3, v4, v5

    filled-new-array {v1, v2, v0}, [I

    move-result-object v0

    const/4 v1, 0x7

    aput-object v0, v4, v1

    sput-object v4, Ll/ܳۖ֡;->ᩳ:[[I

    return-void
.end method

.method public static ֫()Ll/ܳۖ֡;
    .locals 1

    .line 88
    sget-object v0, Ll/ܳۖ֡;->֫:Ll/ܳۖ֡;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ۤܺ֡;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, " "

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 205
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_1b

    .line 206
    new-instance v1, Ll/ۤܺ֡;

    invoke-direct {v1}, Ll/ۤܺ֡;-><init>()V

    .line 207
    invoke-virtual {v1, v0}, Ll/ۤܺ֡;->ᩳ(Ljava/lang/String;)V

    .line 208
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۤܺ֡;->ܽ(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v2, 0x2

    .line 214
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    .line 215
    array-length v4, v1

    if-ne v4, v2, :cond_1b

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_b

    :cond_1
    const/4 v4, 0x0

    .line 218
    aget-object v5, v1, v4

    const-string v6, ";"

    .line 219
    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_2

    goto/16 :goto_b

    .line 222
    :cond_2
    new-instance v7, Ll/ۤܺ֡;

    invoke-direct {v7}, Ll/ۤܺ֡;-><init>()V

    .line 223
    invoke-virtual {v7, v0}, Ll/ۤܺ֡;->ᩳ(Ljava/lang/String;)V

    .line 224
    aget-object v0, v1, v3

    invoke-virtual {v7, v0}, Ll/ۤܺ֡;->ܽ(Ljava/lang/String;)V

    .line 225
    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 226
    aget-object v1, v1, v4

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "unix.mode="

    invoke-virtual {v1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 227
    array-length v5, v0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1a

    aget-object v8, v0, v6

    const-string v9, "="

    const/4 v10, -0x1

    .line 228
    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v8

    .line 232
    array-length v9, v8

    if-eq v9, v2, :cond_3

    goto/16 :goto_b

    .line 235
    :cond_3
    aget-object v9, v8, v4

    sget-object v11, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v9, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    .line 236
    aget-object v8, v8, v3

    .line 237
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_4

    goto/16 :goto_a

    .line 240
    :cond_4
    invoke-virtual {v8, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    .line 241
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v13

    const/4 v14, 0x3

    sparse-switch v13, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v13, "type"

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    goto :goto_1

    :cond_5
    const/4 v13, 0x3

    goto :goto_2

    :sswitch_1
    const-string v13, "size"

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_6

    goto :goto_1

    :cond_6
    const/4 v13, 0x2

    goto :goto_2

    :sswitch_2
    const-string v13, "sizd"

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    goto :goto_1

    :cond_7
    const/4 v13, 0x1

    goto :goto_2

    :sswitch_3
    const-string v13, "modify"

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    goto :goto_1

    :cond_8
    const/4 v13, 0x0

    goto :goto_2

    :goto_1
    const/4 v13, -0x1

    :goto_2
    packed-switch v13, :pswitch_data_0

    const-string v13, "unix."

    .line 264
    invoke-virtual {v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    const/4 v12, 0x5

    .line 265
    invoke-virtual {v9, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    .line 266
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_1

    goto/16 :goto_5

    .line 255
    :pswitch_0
    sget-object v8, Ll/ܳۖ֡;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v8, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    if-nez v8, :cond_9

    const/4 v8, 0x3

    .line 257
    invoke-virtual {v7, v8}, Ll/ۤܺ֡;->֫(I)V

    goto/16 :goto_a

    .line 259
    :cond_9
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v7, v8}, Ll/ۤܺ֡;->֫(I)V

    goto/16 :goto_a

    .line 244
    :pswitch_1
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ll/ۤܺ֡;->֫(J)V

    goto/16 :goto_a

    :pswitch_2
    const/4 v9, 0x0

    const-string v10, "."

    .line 113
    invoke-virtual {v8, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_a

    .line 114
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v11, "yyyyMMddHHmmss.SSS"

    invoke-direct {v10, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const/4 v11, 0x1

    goto :goto_3

    .line 117
    :cond_a
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v11, "yyyyMMddHHmmss"

    invoke-direct {v10, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const/4 v11, 0x0

    :goto_3
    const-string v12, "GMT"

    .line 120
    invoke-static {v12}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v12

    .line 122
    invoke-virtual {v10, v12}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 123
    new-instance v13, Ljava/util/GregorianCalendar;

    invoke-direct {v13, v12}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 124
    new-instance v12, Ljava/text/ParsePosition;

    invoke-direct {v12, v4}, Ljava/text/ParsePosition;-><init>(I)V

    .line 125
    invoke-virtual {v10, v4}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 126
    invoke-virtual {v10, v8, v12}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v10

    .line 127
    invoke-virtual {v12}, Ljava/text/ParsePosition;->getIndex()I

    move-result v12

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-eq v12, v8, :cond_b

    move-object v13, v9

    goto :goto_4

    .line 130
    :cond_b
    invoke-virtual {v13, v10}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    if-nez v11, :cond_c

    const/16 v8, 0xe

    .line 132
    invoke-virtual {v13, v8}, Ljava/util/Calendar;->clear(I)V

    :cond_c
    :goto_4
    if-nez v13, :cond_d

    goto/16 :goto_c

    .line 251
    :cond_d
    invoke-virtual {v7, v13}, Ll/ۤܺ֡;->֫(Ljava/util/Calendar;)V

    goto/16 :goto_a

    :sswitch_4
    const-string v11, "owner"

    .line 266
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    goto :goto_5

    :cond_e
    const/4 v10, 0x2

    goto :goto_5

    :sswitch_5
    const-string v11, "group"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    goto :goto_5

    :cond_f
    const/4 v10, 0x1

    goto :goto_5

    :sswitch_6
    const-string v11, "mode"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    goto :goto_5

    :cond_10
    const/4 v10, 0x0

    :goto_5
    packed-switch v10, :pswitch_data_1

    goto/16 :goto_a

    .line 271
    :pswitch_3
    invoke-virtual {v7, v8}, Ll/ۤܺ֡;->ܿ(Ljava/lang/String;)V

    goto/16 :goto_a

    .line 268
    :pswitch_4
    invoke-virtual {v7, v8}, Ll/ۤܺ֡;->֫(Ljava/lang/String;)V

    goto/16 :goto_a

    .line 274
    :pswitch_5
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    sub-int/2addr v9, v14

    const/4 v10, 0x0

    :goto_6
    if-ge v10, v14, :cond_19

    add-int v11, v9, v10

    .line 276
    invoke-virtual {v8, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    add-int/lit8 v11, v11, -0x30

    if-ltz v11, :cond_11

    const/4 v12, 0x7

    if-gt v11, v12, :cond_11

    .line 278
    sget-object v12, Ll/ܳۖ֡;->ᩳ:[[I

    aget-object v11, v12, v11

    array-length v12, v11

    const/4 v13, 0x0

    :goto_7
    if-ge v13, v12, :cond_11

    aget v14, v11, v13

    .line 279
    sget-object v15, Ll/ܳۖ֡;->ܽ:[I

    aget v15, v15, v10

    invoke-virtual {v7, v15, v14, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    :cond_11
    add-int/lit8 v10, v10, 0x1

    const/4 v14, 0x3

    goto :goto_6

    :cond_12
    if-nez v1, :cond_19

    const-string v8, "perm"

    .line 291
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    .line 162
    invoke-virtual {v12}, Ljava/lang/String;->toCharArray()[C

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    :goto_8
    if-ge v10, v9, :cond_19

    aget-char v11, v8, v10

    const/16 v12, 0x61

    if-eq v11, v12, :cond_18

    const/16 v12, 0x70

    if-eq v11, v12, :cond_17

    const/16 v12, 0x72

    if-eq v11, v12, :cond_16

    const/16 v12, 0x77

    if-eq v11, v12, :cond_15

    const/16 v12, 0x6c

    if-eq v11, v12, :cond_14

    const/16 v12, 0x6d

    if-eq v11, v12, :cond_13

    packed-switch v11, :pswitch_data_2

    goto :goto_9

    .line 175
    :pswitch_6
    invoke-virtual {v7, v4, v4, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    goto :goto_9

    .line 172
    :pswitch_7
    invoke-virtual {v7, v4, v3, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    goto :goto_9

    .line 169
    :pswitch_8
    invoke-virtual {v7, v4, v3, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    goto :goto_9

    .line 184
    :cond_13
    invoke-virtual {v7, v4, v3, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    goto :goto_9

    .line 181
    :cond_14
    invoke-virtual {v7, v4, v2, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    goto :goto_9

    .line 193
    :cond_15
    invoke-virtual {v7, v4, v3, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    goto :goto_9

    .line 190
    :cond_16
    invoke-virtual {v7, v4, v4, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    goto :goto_9

    .line 187
    :cond_17
    invoke-virtual {v7, v4, v3, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    goto :goto_9

    .line 166
    :cond_18
    invoke-virtual {v7, v4, v3, v3}, Ll/ۤܺ֡;->֫(IIZ)V

    :goto_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_19
    :goto_a
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_1a
    return-object v7

    :cond_1b
    :goto_b
    const/4 v9, 0x0

    :goto_c
    return-object v9

    :sswitch_data_0
    .sparse-switch
        -0x3fb48746 -> :sswitch_3
        0x35e000 -> :sswitch_2
        0x35e001 -> :sswitch_1
        0x368f3a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x3339a3 -> :sswitch_6
        0x5e0f67f -> :sswitch_5
        0x653f2b3 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x63
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
