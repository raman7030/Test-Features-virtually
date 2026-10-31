.class public final Ll/᩶֫ܺ;
.super Ljava/lang/Object;
.source "EAUD"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/᩵֫ܺ;


# static fields
.field public static final ֫:Ll/᩶֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/᩶֫ܺ;

    .line 43
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    sput-object v0, Ll/᩶֫ܺ;->֫:Ll/᩶֫ܺ;

    return-void
.end method

.method public static ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;
    .locals 13

    .line 159
    iget-object v0, p0, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    .line 162
    invoke-virtual {v0}, Ll/۟۟ۡ;->ܶ()I

    move-result v1

    iget v2, v0, Ll/۟۟ۡ;->ܳ:I

    const/4 v3, 0x0

    .line 163
    const-class v4, Ljava/util/Calendar;

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x2

    if-ne v1, v7, :cond_0

    .line 164
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۜ()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 165
    invoke-virtual {v0, v6}, Ll/۟۟ۡ;->ۧ(I)V

    goto/16 :goto_0

    :cond_0
    const/4 v8, 0x4

    if-ne v1, v8, :cond_3

    .line 167
    invoke-virtual {v0}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v1

    .line 169
    invoke-virtual {v0, v6}, Ll/۟۟ۡ;->ۧ(I)V

    .line 171
    sget-object v6, Ll/ܰ۟ۡ;->ۗ:Ll/ܰ۟ۡ;

    iget v6, v6, Ll/ܰ۟ۡ;->᩸:I

    and-int/2addr v2, v6

    if-eqz v2, :cond_d

    .line 172
    new-instance v2, Ll/۟۟ۡ;

    invoke-direct {v2, v1}, Ll/۟۟ۡ;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x1

    .line 173
    invoke-virtual {v2, v6}, Ll/۟۟ۡ;->ۧ(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 174
    iget-object v1, v2, Ll/۟۟ۡ;->ۧ:Ljava/util/Calendar;

    if-ne p1, v4, :cond_1

    .line 176
    invoke-virtual {v2}, Ll/۟۟ۡ;->ۧ()V

    return-object v1

    .line 179
    :cond_1
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    .line 181
    :cond_2
    invoke-virtual {v2}, Ll/۟۟ۡ;->ۧ()V

    goto/16 :goto_0

    :cond_3
    const/16 v9, 0x8

    if-ne v1, v9, :cond_4

    .line 184
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    move-object v1, v5

    goto/16 :goto_0

    :cond_4
    const/16 v9, 0xc

    const/16 v10, 0xd

    const/16 v11, 0x11

    const-string v12, "syntax error"

    if-ne v1, v9, :cond_9

    .line 187
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    .line 190
    invoke-virtual {v0}, Ll/۟۟ۡ;->ܶ()I

    move-result v1

    if-ne v1, v8, :cond_8

    .line 191
    invoke-virtual {v0}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v1

    const-string v9, "@type"

    .line 193
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 194
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    .line 195
    invoke-virtual {p0, v11}, Ll/ۨ۟ۡ;->֫(I)V

    .line 197
    invoke-virtual {v0}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v1

    .line 198
    iget-object v9, p0, Ll/ۨ۟ۡ;->᩸:Ll/᩻֫ܺ;

    invoke-virtual {v9, v1, v2, v5}, Ll/᩻֫ܺ;->֫(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_5

    move-object p1, v1

    .line 203
    :cond_5
    invoke-virtual {p0, v8}, Ll/ۨ۟ۡ;->֫(I)V

    .line 204
    invoke-virtual {p0, v6}, Ll/ۨ۟ۡ;->֫(I)V

    .line 207
    :cond_6
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۡ()V

    .line 213
    invoke-virtual {v0}, Ll/۟۟ۡ;->ܶ()I

    move-result v1

    if-ne v1, v7, :cond_7

    .line 215
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۜ()J

    move-result-wide v1

    .line 216
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    .line 221
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 223
    invoke-virtual {p0, v10}, Ll/ۨ۟ۡ;->֫(I)V

    goto :goto_0

    .line 218
    :cond_7
    new-instance p0, Ll/ܶ۟ۡ;

    invoke-static {v1}, Ll/᩶ۛ᩻;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "syntax error : "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 218
    throw p0

    .line 209
    :cond_8
    new-instance p0, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p0, v12}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 209
    throw p0

    .line 224
    :cond_9
    iget v1, p0, Ll/ۨ۟ۡ;->ۨ:I

    if-ne v1, v7, :cond_c

    .line 225
    iput v3, p0, Ll/ۨ۟ۡ;->ۨ:I

    .line 226
    invoke-virtual {p0, v6}, Ll/ۨ۟ۡ;->֫(I)V

    .line 228
    invoke-virtual {v0}, Ll/۟۟ۡ;->ܶ()I

    move-result v1

    if-ne v1, v8, :cond_b

    const-string v1, "val"

    .line 229
    invoke-virtual {v0}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 232
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۢ()V

    .line 237
    invoke-virtual {p0, v11}, Ll/ۨ۟ۡ;->֫(I)V

    .line 1380
    invoke-virtual {p0, v5}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 241
    invoke-virtual {p0, v10}, Ll/ۨ۟ۡ;->֫(I)V

    goto :goto_0

    .line 230
    :cond_a
    new-instance p0, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p0, v12}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 230
    throw p0

    .line 234
    :cond_b
    new-instance p0, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {p0, v12}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 234
    throw p0

    .line 1380
    :cond_c
    invoke-virtual {p0, v5}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :cond_d
    :goto_0
    if-nez v1, :cond_e

    goto/16 :goto_5

    .line 272
    :cond_e
    instance-of v2, v1, Ljava/util/Date;

    if-eqz v2, :cond_f

    goto/16 :goto_6

    .line 274
    :cond_f
    instance-of v2, v1, Ljava/math/BigDecimal;

    if-eqz v2, :cond_10

    .line 275
    new-instance p0, Ljava/util/Date;

    check-cast v1, Ljava/math/BigDecimal;

    invoke-virtual {v1}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Ljava/util/Date;-><init>(J)V

    :goto_1
    move-object v1, p0

    goto/16 :goto_6

    .line 276
    :cond_10
    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_11

    .line 277
    new-instance p0, Ljava/util/Date;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Ljava/util/Date;-><init>(J)V

    goto :goto_1

    .line 278
    :cond_11
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1b

    .line 279
    check-cast v1, Ljava/lang/String;

    .line 280
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_12

    goto :goto_5

    .line 284
    :cond_12
    new-instance v2, Ll/۟۟ۡ;

    invoke-direct {v2, v1}, Ll/۟۟ۡ;-><init>(Ljava/lang/String;)V

    .line 286
    :try_start_0
    invoke-virtual {v2, v3}, Ll/۟۟ۡ;->ۧ(Z)Z

    move-result v3

    if-eqz v3, :cond_14

    .line 287
    iget-object p0, v2, Ll/۟۟ۡ;->ۧ:Ljava/util/Calendar;

    if-ne p1, v4, :cond_13

    :goto_2
    move-object v1, p0

    goto :goto_3

    .line 293
    :cond_13
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 296
    :goto_3
    invoke-virtual {v2}, Ll/۟۟ۡ;->ۧ()V

    goto :goto_6

    :cond_14
    invoke-virtual {v2}, Ll/۟۟ۡ;->ۧ()V

    const-string v2, "0000-00-00"

    .line 299
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    const-string v2, "0000-00-00T00:00:00"

    .line 300
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_17

    const-string v2, "0001-01-01T00:00:00+08:00"

    .line 301
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_15

    goto :goto_5

    :cond_15
    if-eqz p2, :cond_16

    .line 308
    new-instance p0, Ljava/text/SimpleDateFormat;

    invoke-direct {p0, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    goto :goto_4

    .line 310
    :cond_16
    invoke-virtual {p0}, Ll/ۨ۟ۡ;->֫()Ljava/text/DateFormat;

    move-result-object p0

    .line 313
    :goto_4
    :try_start_1
    invoke-virtual {p0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_6

    .line 318
    :catch_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 319
    new-instance p0, Ljava/util/Date;

    invoke-direct {p0, v1, v2}, Ljava/util/Date;-><init>(J)V

    goto :goto_1

    :cond_17
    :goto_5
    move-object v1, v5

    :goto_6
    if-ne p1, v4, :cond_1a

    .line 248
    instance-of p0, v1, Ljava/util/Calendar;

    if-eqz p0, :cond_18

    return-object v1

    .line 252
    :cond_18
    check-cast v1, Ljava/util/Date;

    if-nez v1, :cond_19

    return-object v5

    .line 257
    :cond_19
    iget-object p0, v0, Ll/۟۟ۡ;->֨:Ljava/util/TimeZone;

    iget-object p1, v0, Ll/۟۟ۡ;->ۡ:Ljava/util/Locale;

    invoke-static {p0, p1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p0

    .line 258
    invoke-virtual {p0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    return-object p0

    :cond_1a
    return-object v1

    :catchall_0
    move-exception p0

    .line 296
    invoke-virtual {v2}, Ll/۟۟ۡ;->ۧ()V

    .line 297
    throw p0

    .line 322
    :cond_1b
    new-instance p0, Ll/ܶ۟ۡ;

    const-string p1, "parse error"

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 322
    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p3, 0x0

    .line 154
    invoke-static {p1, p2, p3}, Ll/᩶֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 48
    iget-object v2, v0, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    iget-object v3, v0, Ll/ۛ֫ܺ;->ܺ:Ljava/util/TimeZone;

    iget-object v4, v0, Ll/ۛ֫ܺ;->ܳ:Ljava/util/Locale;

    if-nez v1, :cond_0

    .line 51
    invoke-virtual {v2}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 55
    :cond_0
    iget v5, v2, Ll/ۜۧܺ;->᩶:I

    sget-object v6, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v6, v6, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v5, v6

    if-eqz v5, :cond_2

    .line 56
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    move-object/from16 v6, p4

    if-eq v5, v6, :cond_2

    .line 57
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ljava/util/Date;

    if-ne v3, v4, :cond_1

    const-string v0, "new Date("

    .line 58
    invoke-virtual {v2, v0}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    .line 59
    move-object v0, v1

    check-cast v0, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ll/ۜۧܺ;->ۧ(J)V

    const/16 v0, 0x29

    .line 60
    invoke-virtual {v2, v0}, Ll/ۜۧܺ;->write(I)V

    return-void

    :cond_1
    const/16 v3, 0x7b

    .line 62
    invoke-virtual {v2, v3}, Ll/ۜۧܺ;->write(I)V

    const-string v3, "@type"

    const/4 v4, 0x0

    .line 63
    invoke-virtual {v2, v3, v4}, Ll/ۜۧܺ;->֫(Ljava/lang/String;Z)V

    .line 64
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    const/16 v0, 0x2c

    .line 65
    invoke-virtual {v2, v0}, Ll/ۜۧܺ;->write(I)V

    const-string v0, "val"

    .line 66
    invoke-virtual {v2, v0, v4}, Ll/ۜۧܺ;->֫(Ljava/lang/String;Z)V

    .line 67
    move-object v0, v1

    check-cast v0, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ll/ۜۧܺ;->ۧ(J)V

    const/16 v0, 0x7d

    .line 68
    invoke-virtual {v2, v0}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 75
    :cond_2
    instance-of v5, v1, Ljava/util/Calendar;

    if-eqz v5, :cond_3

    .line 76
    check-cast v1, Ljava/util/Calendar;

    .line 77
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    goto :goto_0

    .line 79
    :cond_3
    check-cast v1, Ljava/util/Date;

    .line 82
    :goto_0
    iget v5, v2, Ll/ۜۧܺ;->᩶:I

    sget-object v6, Ll/᩷ۧܺ;->ܽ֫:Ll/᩷ۧܺ;

    iget v6, v6, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v5, v6

    if-eqz v5, :cond_5

    .line 83
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->ۧ()Ljava/text/DateFormat;

    move-result-object v0

    if-nez v0, :cond_4

    .line 85
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v5, Ll/ۚ۟ۡ;->᩶:Ljava/lang/String;

    invoke-direct {v0, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 86
    invoke-virtual {v0, v3}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 88
    :cond_4
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 89
    invoke-virtual {v2, v0}, Ll/ۜۧܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 93
    :cond_5
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    .line 95
    iget v5, v2, Ll/ۜۧܺ;->᩶:I

    sget-object v6, Ll/᩷ۧܺ;->۟:Ll/᩷ۧܺ;

    iget v6, v6, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v6, v5

    if-eqz v6, :cond_a

    .line 96
    sget-object v6, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v7, v6, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v5, v7

    const/16 v7, 0x22

    const/16 v8, 0x27

    if-eqz v5, :cond_6

    .line 97
    invoke-virtual {v2, v8}, Ll/ۜۧܺ;->write(I)V

    goto :goto_1

    .line 99
    :cond_6
    invoke-virtual {v2, v7}, Ll/ۜۧܺ;->write(I)V

    .line 102
    :goto_1
    invoke-static {v3, v4}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v3

    .line 103
    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 v0, 0x1

    .line 105
    invoke-virtual {v3, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v4, 0x2

    .line 106
    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    add-int/2addr v4, v0

    const/4 v0, 0x5

    .line 107
    invoke-virtual {v3, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/16 v5, 0xb

    .line 108
    invoke-virtual {v3, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/16 v7, 0xc

    .line 109
    invoke-virtual {v3, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/16 v8, 0xd

    .line 110
    invoke-virtual {v3, v8}, Ljava/util/Calendar;->get(I)I

    move-result v9

    const/16 v10, 0xe

    .line 111
    invoke-virtual {v3, v10}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/16 v10, 0x10

    const/16 v11, 0x13

    const/16 v12, 0xa

    if-eqz v3, :cond_7

    const-string v13, "0000-00-00T00:00:00.000"

    .line 115
    invoke-virtual {v13}, Ljava/lang/String;->toCharArray()[C

    move-result-object v13

    int-to-long v14, v3

    const/16 v3, 0x17

    .line 116
    invoke-static {v14, v15, v3, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v14, v9

    .line 117
    invoke-static {v14, v15, v11, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v14, v7

    .line 118
    invoke-static {v14, v15, v10, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v9, v5

    .line 119
    invoke-static {v9, v10, v8, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v7, v0

    .line 120
    invoke-static {v7, v8, v12, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v3, v4

    const/4 v0, 0x7

    .line 121
    invoke-static {v3, v4, v0, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v0, v1

    const/4 v3, 0x4

    .line 122
    invoke-static {v0, v1, v3, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    goto :goto_2

    :cond_7
    if-nez v9, :cond_8

    if-nez v7, :cond_8

    if-nez v5, :cond_8

    const-string v3, "0000-00-00"

    .line 126
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v13

    int-to-long v7, v0

    .line 127
    invoke-static {v7, v8, v12, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v3, v4

    const/4 v0, 0x7

    .line 128
    invoke-static {v3, v4, v0, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v0, v1

    const/4 v3, 0x4

    .line 129
    invoke-static {v0, v1, v3, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    goto :goto_2

    :cond_8
    const-string v3, "0000-00-00T00:00:00"

    .line 131
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v13

    int-to-long v14, v9

    .line 132
    invoke-static {v14, v15, v11, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v14, v7

    .line 133
    invoke-static {v14, v15, v10, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v9, v5

    .line 134
    invoke-static {v9, v10, v8, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v7, v0

    .line 135
    invoke-static {v7, v8, v12, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v3, v4

    const/4 v0, 0x7

    .line 136
    invoke-static {v3, v4, v0, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    int-to-long v0, v1

    const/4 v3, 0x4

    .line 137
    invoke-static {v0, v1, v3, v13}, Ll/ۜۧܺ;->֫(JI[C)V

    .line 141
    :goto_2
    invoke-virtual {v2, v13}, Ljava/io/Writer;->write([C)V

    .line 143
    iget v0, v2, Ll/ۜۧܺ;->᩶:I

    iget v1, v6, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_9

    const/16 v0, 0x27

    .line 144
    invoke-virtual {v2, v0}, Ll/ۜۧܺ;->write(I)V

    return-void

    :cond_9
    const/16 v0, 0x22

    .line 146
    invoke-virtual {v2, v0}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 149
    :cond_a
    invoke-virtual {v2, v0, v1}, Ll/ۜۧܺ;->ۧ(J)V

    return-void
.end method
