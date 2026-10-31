.class public final Ll/᩹᩻ۖ;
.super Ljava/lang/Object;
.source "I87D"


# static fields
.field public static final ֫:Ljava/util/TimeZone;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTC"

    .line 54
    invoke-static {v0}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    sput-object v0, Ll/᩹᩻ۖ;->֫:Ljava/util/TimeZone;

    return-void
.end method

.method public static ֫(IILjava/lang/String;)I
    .locals 5

    if-ltz p0, :cond_4

    .line 334
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-gt p1, v0, :cond_4

    if-gt p0, p1, :cond_4

    const-string v0, "Invalid number: "

    const/16 v1, 0xa

    if-ge p0, p1, :cond_1

    add-int/lit8 v2, p0, 0x1

    .line 342
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v1}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    if-ltz v3, :cond_0

    neg-int v3, v3

    goto :goto_0

    .line 344
    :cond_0
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    const/4 v3, 0x0

    move v2, p0

    :goto_0
    if-ge v2, p1, :cond_3

    add-int/lit8 v4, v2, 0x1

    .line 349
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Character;->digit(CI)I

    move-result v2

    if-ltz v2, :cond_2

    mul-int/lit8 v3, v3, 0xa

    sub-int/2addr v3, v2

    move v2, v4

    goto :goto_0

    .line 351
    :cond_2
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    neg-int p0, v3

    return p0

    .line 335
    :cond_4
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0, p2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 150
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/text/ParsePosition;->getIndex()I

    move-result v0

    add-int/lit8 v3, v0, 0x4

    .line 153
    invoke-static {v0, v3, v1}, Ll/᩹᩻ۖ;->֫(IILjava/lang/String;)I

    move-result v4

    const/16 v5, 0x2d

    .line 154
    invoke-static {v1, v3, v5}, Ll/᩹᩻ۖ;->֫(Ljava/lang/String;IC)Z

    move-result v6

    if-eqz v6, :cond_0

    add-int/lit8 v3, v0, 0x5

    :cond_0
    add-int/lit8 v0, v3, 0x2

    .line 159
    invoke-static {v3, v0, v1}, Ll/᩹᩻ۖ;->֫(IILjava/lang/String;)I

    move-result v6

    .line 160
    invoke-static {v1, v0, v5}, Ll/᩹᩻ۖ;->֫(Ljava/lang/String;IC)Z

    move-result v7

    if-eqz v7, :cond_1

    add-int/lit8 v0, v3, 0x3

    :cond_1
    add-int/lit8 v3, v0, 0x2

    .line 165
    invoke-static {v0, v3, v1}, Ll/᩹᩻ۖ;->֫(IILjava/lang/String;)I

    move-result v7

    const/16 v8, 0x54

    .line 176
    invoke-static {v1, v3, v8}, Ll/᩹᩻ۖ;->֫(Ljava/lang/String;IC)Z

    move-result v8

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v8, :cond_2

    .line 178
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v11

    if-gt v11, v3, :cond_2

    .line 179
    new-instance v0, Ljava/util/GregorianCalendar;

    sub-int/2addr v6, v9

    invoke-direct {v0, v4, v6, v7}, Ljava/util/GregorianCalendar;-><init>(III)V

    .line 180
    invoke-virtual {v0, v10}, Ljava/util/Calendar;->setLenient(Z)V

    .line 182
    invoke-virtual {v2, v3}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 183
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0

    :cond_2
    const/16 v10, 0x2b

    const/16 v11, 0x5a

    const/4 v12, 0x2

    if-eqz v8, :cond_d

    add-int/lit8 v3, v0, 0x3

    add-int/lit8 v8, v0, 0x5

    .line 189
    invoke-static {v3, v8, v1}, Ll/᩹᩻ۖ;->֫(IILjava/lang/String;)I

    move-result v3

    const/16 v13, 0x3a

    .line 190
    invoke-static {v1, v8, v13}, Ll/᩹᩻ۖ;->֫(Ljava/lang/String;IC)Z

    move-result v14

    if-eqz v14, :cond_3

    add-int/lit8 v8, v0, 0x6

    :cond_3
    add-int/lit8 v0, v8, 0x2

    .line 194
    invoke-static {v8, v0, v1}, Ll/᩹᩻ۖ;->֫(IILjava/lang/String;)I

    move-result v14

    .line 195
    invoke-static {v1, v0, v13}, Ll/᩹᩻ۖ;->֫(Ljava/lang/String;IC)Z

    move-result v13

    if-eqz v13, :cond_4

    add-int/lit8 v8, v8, 0x3

    move v0, v8

    .line 199
    :cond_4
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v8

    if-le v8, v0, :cond_c

    .line 200
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-eq v8, v11, :cond_c

    if-eq v8, v10, :cond_c

    if-eq v8, v5, :cond_c

    add-int/lit8 v5, v0, 0x2

    .line 202
    invoke-static {v0, v5, v1}, Ll/᩹᩻ۖ;->֫(IILjava/lang/String;)I

    move-result v8

    const/16 v13, 0x3b

    if-le v8, v13, :cond_5

    const/16 v13, 0x3f

    if-ge v8, v13, :cond_5

    const/16 v8, 0x3b

    :cond_5
    const/16 v13, 0x2e

    .line 207
    invoke-static {v1, v5, v13}, Ll/᩹᩻ۖ;->֫(Ljava/lang/String;IC)Z

    move-result v13

    if-eqz v13, :cond_b

    add-int/lit8 v5, v0, 0x3

    add-int/lit8 v13, v0, 0x4

    .line 378
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v13, v15, :cond_8

    .line 379
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v10, 0x30

    if-lt v15, v10, :cond_7

    const/16 v10, 0x39

    if-le v15, v10, :cond_6

    goto :goto_1

    :cond_6
    add-int/lit8 v13, v13, 0x1

    const/16 v10, 0x2b

    goto :goto_0

    :cond_7
    :goto_1
    move v10, v13

    goto :goto_2

    .line 384
    :cond_8
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v10

    :goto_2
    add-int/lit8 v0, v0, 0x6

    .line 210
    invoke-static {v10, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 211
    invoke-static {v5, v0, v1}, Ll/᩹᩻ۖ;->֫(IILjava/lang/String;)I

    move-result v13

    sub-int/2addr v0, v5

    if-eq v0, v9, :cond_a

    if-eq v0, v12, :cond_9

    goto :goto_3

    :cond_9
    mul-int/lit8 v13, v13, 0xa

    goto :goto_3

    :cond_a
    mul-int/lit8 v13, v13, 0x64

    :goto_3
    move v5, v10

    goto :goto_5

    :cond_b
    const/4 v13, 0x0

    goto :goto_5

    :cond_c
    move/from16 v16, v3

    move v3, v0

    move/from16 v0, v16

    goto :goto_4

    :cond_d
    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_4
    const/4 v13, 0x0

    const/4 v8, 0x0

    move v5, v3

    move v3, v0

    .line 230
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v5, :cond_15

    .line 235
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    sget-object v10, Ll/᩹᩻ۖ;->֫:Ljava/util/TimeZone;

    if-ne v0, v11, :cond_e

    add-int/2addr v5, v9

    goto/16 :goto_8

    :cond_e
    const/16 v11, 0x2b

    if-eq v0, v11, :cond_10

    const/16 v11, 0x2d

    if-ne v0, v11, :cond_f

    goto :goto_6

    .line 279
    :cond_f
    :try_start_1
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid time zone indicator \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 241
    :cond_10
    :goto_6
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 245
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v12, 0x5

    if-lt v11, v12, :cond_11

    goto :goto_7

    :cond_11
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "00"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 247
    :goto_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    add-int/2addr v5, v11

    const-string v11, "+0000"

    .line 249
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_14

    const-string v11, "+00:00"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_12

    goto :goto_8

    .line 256
    :cond_12
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "GMT"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 259
    invoke-static {v0}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v10

    .line 261
    invoke-virtual {v10}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v11

    .line 262
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_14

    const-string v12, ":"

    const-string v15, ""

    .line 268
    invoke-virtual {v11, v12, v15}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    .line 269
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    goto :goto_8

    .line 270
    :cond_13
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Mismatching time zone indicator: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " given, resolves to "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    invoke-virtual {v10}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 283
    :cond_14
    :goto_8
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0, v10}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    const/4 v10, 0x0

    .line 284
    invoke-virtual {v0, v10}, Ljava/util/Calendar;->setLenient(Z)V

    .line 285
    invoke-virtual {v0, v9, v4}, Ljava/util/Calendar;->set(II)V

    sub-int/2addr v6, v9

    const/4 v4, 0x2

    .line 286
    invoke-virtual {v0, v4, v6}, Ljava/util/Calendar;->set(II)V

    const/4 v4, 0x5

    .line 287
    invoke-virtual {v0, v4, v7}, Ljava/util/Calendar;->set(II)V

    const/16 v4, 0xb

    .line 288
    invoke-virtual {v0, v4, v3}, Ljava/util/Calendar;->set(II)V

    const/16 v3, 0xc

    .line 289
    invoke-virtual {v0, v3, v14}, Ljava/util/Calendar;->set(II)V

    const/16 v3, 0xd

    .line 290
    invoke-virtual {v0, v3, v8}, Ljava/util/Calendar;->set(II)V

    const/16 v3, 0xe

    .line 291
    invoke-virtual {v0, v3, v13}, Ljava/util/Calendar;->set(II)V

    .line 293
    invoke-virtual {v2, v5}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 294
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0

    .line 231
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v3, "No time zone indicator"

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    goto :goto_9

    :catch_1
    move-exception v0

    :goto_9
    if-nez v1, :cond_16

    const/4 v1, 0x0

    goto :goto_a

    .line 300
    :cond_16
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 301
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_17

    .line 302
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_18

    .line 303
    :cond_17
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 305
    :cond_18
    new-instance v4, Ljava/text/ParseException;

    const-string v5, "Failed to parse date ["

    const-string v6, "]: "

    .line 0
    invoke-static {v5, v1, v6, v3}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 306
    invoke-virtual/range {p1 .. p1}, Ljava/text/ParsePosition;->getIndex()I

    move-result v2

    invoke-direct {v4, v1, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 307
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 308
    throw v4
.end method

.method public static ֫(Ljava/lang/String;IC)Z
    .locals 1

    .line 320
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    if-ne p0, p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
