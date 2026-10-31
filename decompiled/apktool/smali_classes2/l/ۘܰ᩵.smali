.class public final Ll/ۘܰ᩵;
.super Ljava/lang/Object;
.source "14GL"


# static fields
.field public static final ۖ:Ljava/util/regex/Pattern;

.field public static final ۡ:Ljava/util/regex/Pattern;

.field public static final ۢ:Ljava/util/regex/Pattern;

.field public static final ܺ:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:Z

.field public final ۧ:J

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Z

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Z

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(\\d{2,4})[^\\d]*"

    .line 48
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۘܰ᩵;->ۖ:Ljava/util/regex/Pattern;

    const-string v0, "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"

    .line 50
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۘܰ᩵;->ۡ:Ljava/util/regex/Pattern;

    const-string v0, "(\\d{1,2})[^\\d]*"

    .line 52
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۘܰ᩵;->ۢ:Ljava/util/regex/Pattern;

    const-string v0, "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"

    .line 54
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۘܰ᩵;->ܺ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Ll/ۘܰ᩵;->ܿ:Ljava/lang/String;

    .line 70
    iput-object p2, p0, Ll/ۘܰ᩵;->᩷:Ljava/lang/String;

    .line 71
    iput-wide p3, p0, Ll/ۘܰ᩵;->ۧ:J

    .line 72
    iput-object p5, p0, Ll/ۘܰ᩵;->֫:Ljava/lang/String;

    .line 73
    iput-object p6, p0, Ll/ۘܰ᩵;->ܳ:Ljava/lang/String;

    .line 74
    iput-boolean p7, p0, Ll/ۘܰ᩵;->ۜ:Z

    .line 75
    iput-boolean p8, p0, Ll/ۘܰ᩵;->ᩳ:Z

    .line 76
    iput-boolean p9, p0, Ll/ۘܰ᩵;->ܽ:Z

    .line 77
    iput-boolean p10, p0, Ll/ۘܰ᩵;->᩻:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;IIZ)I
    .locals 2

    :goto_0
    if-ge p1, p2, :cond_7

    .line 390
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-ge v0, v1, :cond_0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_5

    :cond_0
    const/16 v1, 0x7f

    if-ge v0, v1, :cond_5

    const/16 v1, 0x30

    if-lt v0, v1, :cond_1

    const/16 v1, 0x39

    if-le v0, v1, :cond_5

    :cond_1
    const/16 v1, 0x61

    if-lt v0, v1, :cond_2

    const/16 v1, 0x7a

    if-le v0, v1, :cond_5

    :cond_2
    const/16 v1, 0x41

    if-lt v0, v1, :cond_3

    const/16 v1, 0x5a

    if-le v0, v1, :cond_5

    :cond_3
    const/16 v1, 0x3a

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v0, 0x1

    :goto_2
    xor-int/lit8 v1, p3, 0x1

    if-ne v0, v1, :cond_6

    return p1

    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_7
    return p2
.end method

.method public static ֫(ILjava/lang/String;)J
    .locals 14

    const/4 v0, 0x0

    .line 329
    invoke-static {p1, v0, p0, v0}, Ll/ۘܰ᩵;->֫(Ljava/lang/String;IIZ)I

    move-result v1

    .line 337
    sget-object v2, Ll/ۘܰ᩵;->ܺ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, -0x1

    const/4 v10, -0x1

    :goto_0
    const/4 v11, 0x2

    const/4 v12, 0x1

    if-ge v1, p0, :cond_4

    add-int/lit8 v13, v1, 0x1

    .line 340
    invoke-static {p1, v13, p0, v12}, Ll/ۘܰ᩵;->֫(Ljava/lang/String;IIZ)I

    move-result v13

    .line 341
    invoke-virtual {v3, v1, v13}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    if-ne v6, v4, :cond_0

    .line 343
    invoke-virtual {v3, v2}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 344
    invoke-virtual {v3, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 345
    invoke-virtual {v3, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    const/4 v9, 0x3

    .line 346
    invoke-virtual {v3, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    move v10, v9

    move v9, v6

    move v6, v1

    goto :goto_1

    :cond_0
    if-ne v7, v4, :cond_1

    .line 347
    sget-object v1, Ll/ۘܰ᩵;->ۢ:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 348
    invoke-virtual {v3, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    move v7, v1

    goto :goto_1

    :cond_1
    if-ne v8, v4, :cond_2

    .line 349
    sget-object v1, Ll/ۘܰ᩵;->ۡ:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    move-result v11

    if-eqz v11, :cond_2

    .line 350
    invoke-virtual {v3, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v8, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    .line 351
    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    move v8, v1

    goto :goto_1

    :cond_2
    if-ne v5, v4, :cond_3

    .line 352
    sget-object v1, Ll/ۘܰ᩵;->ۖ:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 353
    invoke-virtual {v3, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    move v5, v1

    :cond_3
    :goto_1
    add-int/lit8 v13, v13, 0x1

    .line 356
    invoke-static {p1, v13, p0, v0}, Ll/ۘܰ᩵;->֫(Ljava/lang/String;IIZ)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    const/16 p0, 0x46

    if-lt v5, p0, :cond_5

    const/16 p0, 0x63

    if-gt v5, p0, :cond_5

    add-int/lit16 v5, v5, 0x76c

    :cond_5
    if-ltz v5, :cond_6

    const/16 p0, 0x45

    if-gt v5, p0, :cond_6

    add-int/lit16 v5, v5, 0x7d0

    :cond_6
    const/16 p0, 0x641

    if-lt v5, p0, :cond_c

    if-eq v8, v4, :cond_b

    if-lt v7, v12, :cond_a

    const/16 p0, 0x1f

    if-gt v7, p0, :cond_a

    if-ltz v6, :cond_9

    const/16 p0, 0x17

    if-gt v6, p0, :cond_9

    if-ltz v9, :cond_8

    const/16 p0, 0x3b

    if-gt v9, p0, :cond_8

    if-ltz v10, :cond_7

    if-gt v10, p0, :cond_7

    .line 372
    new-instance p0, Ljava/util/GregorianCalendar;

    sget-object p1, Ll/᩶۟᩵;->ܳ:Ljava/util/TimeZone;

    invoke-direct {p0, p1}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 373
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->setLenient(Z)V

    .line 374
    invoke-virtual {p0, v12, v5}, Ljava/util/Calendar;->set(II)V

    sub-int/2addr v8, v12

    .line 375
    invoke-virtual {p0, v11, v8}, Ljava/util/Calendar;->set(II)V

    const/4 p1, 0x5

    .line 376
    invoke-virtual {p0, p1, v7}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xb

    .line 377
    invoke-virtual {p0, p1, v6}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xc

    .line 378
    invoke-virtual {p0, p1, v9}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xd

    .line 379
    invoke-virtual {p0, p1, v10}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xe

    .line 380
    invoke-virtual {p0, p1, v0}, Ljava/util/Calendar;->set(II)V

    .line 381
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p0

    return-wide p0

    .line 370
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 369
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 368
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 367
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 366
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 365
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(Ll/ۨܰ᩵;Ll/ۤܰ᩵;)Ljava/util/List;
    .locals 28

    const-string v0, "Set-Cookie"

    move-object/from16 v1, p1

    .line 441
    invoke-virtual {v1, v0}, Ll/ۤܰ᩵;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 444
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_26

    .line 445
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 219
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 224
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x3b

    .line 225
    invoke-static {v5, v0, v8, v9}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IIC)I

    move-result v9

    const/16 v10, 0x3d

    .line 227
    invoke-static {v5, v0, v9, v10}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IIC)I

    move-result v10

    if-ne v10, v9, :cond_1

    :cond_0
    :goto_1
    move-object/from16 p1, v1

    move-object/from16 v1, p0

    goto/16 :goto_10

    .line 368
    :cond_1
    invoke-static {v0, v10, v5}, Ll/᩶۟᩵;->ۧ(IILjava/lang/String;)I

    move-result v0

    .line 369
    invoke-static {v0, v10, v5}, Ll/᩶۟᩵;->ܽ(IILjava/lang/String;)I

    move-result v11

    .line 370
    invoke-virtual {v5, v0, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    .line 231
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 456
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v11, 0x0

    :goto_2
    const/16 v12, 0x7f

    const/16 v14, 0x1f

    if-ge v11, v0, :cond_3

    .line 457
    invoke-virtual {v13, v11}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-le v15, v14, :cond_4

    if-lt v15, v12, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_3
    const/4 v11, -0x1

    :cond_4
    :goto_3
    const/4 v0, -0x1

    if-eq v11, v0, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 368
    invoke-static {v10, v9, v5}, Ll/᩶۟᩵;->ۧ(IILjava/lang/String;)I

    move-result v0

    .line 369
    invoke-static {v0, v9, v5}, Ll/᩶۟᩵;->ܽ(IILjava/lang/String;)I

    move-result v10

    .line 370
    invoke-virtual {v5, v0, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 456
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v0, :cond_7

    .line 457
    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-le v15, v14, :cond_8

    if-lt v15, v12, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_7
    const/4 v11, -0x1

    :cond_8
    :goto_5
    const/4 v0, -0x1

    if-eq v11, v0, :cond_9

    goto :goto_1

    :cond_9
    add-int/lit8 v9, v9, 0x1

    const/4 v0, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, -0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const-wide v17, 0xe677d21fdbffL

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    move/from16 v27, v9

    move-object v9, v0

    move/from16 v0, v27

    :goto_6
    const-wide v23, 0x7fffffffffffffffL

    const-wide/high16 v25, -0x8000000000000000L

    if-ge v0, v8, :cond_17

    const/16 v11, 0x3b

    .line 247
    invoke-static {v5, v0, v8, v11}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IIC)I

    move-result v11

    const/16 v12, 0x3d

    .line 249
    invoke-static {v5, v0, v11, v12}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IIC)I

    move-result v12

    .line 368
    invoke-static {v0, v12, v5}, Ll/᩶۟᩵;->ۧ(IILjava/lang/String;)I

    move-result v0

    move-object/from16 p1, v1

    .line 369
    invoke-static {v0, v12, v5}, Ll/᩶۟᩵;->ܽ(IILjava/lang/String;)I

    move-result v1

    .line 370
    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    if-ge v12, v11, :cond_a

    add-int/lit8 v12, v12, 0x1

    .line 368
    invoke-static {v12, v11, v5}, Ll/᩶۟᩵;->ۧ(IILjava/lang/String;)I

    move-result v1

    .line 369
    invoke-static {v1, v11, v5}, Ll/᩶۟᩵;->ܽ(IILjava/lang/String;)I

    move-result v12

    .line 370
    invoke-virtual {v5, v1, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :cond_a
    const-string v1, ""

    :goto_7
    const-string v12, "expires"

    .line 255
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_b

    .line 257
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0, v1}, Ll/ۘܰ᩵;->֫(ILjava/lang/String;)J

    move-result-wide v17
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_9

    :cond_b
    const-string v12, "max-age"

    .line 262
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    .line 410
    :try_start_1
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v15
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    const-wide/16 v0, 0x0

    cmp-long v12, v15, v0

    if-gtz v12, :cond_d

    :goto_8
    move-wide/from16 v15, v25

    goto :goto_9

    :catch_0
    move-exception v0

    move-object v12, v0

    :try_start_2
    const-string v0, "-?\\d+"

    .line 414
    invoke-virtual {v1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "-"

    .line 415
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    move-wide/from16 v15, v23

    :cond_d
    :goto_9
    const/16 v22, 0x1

    goto :goto_a

    .line 417
    :cond_e
    throw v12
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    :cond_f
    const-string v12, "domain"

    .line 269
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_13

    :try_start_3
    const-string v0, "."

    .line 426
    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_12

    .line 429
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    .line 430
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 432
    :cond_10
    invoke-static {v1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    const/16 v21, 0x0

    move-object v9, v0

    goto :goto_a

    .line 434
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 427
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_13
    const-string v12, "path"

    .line 276
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_14

    move-object v14, v1

    goto :goto_a

    :cond_14
    const-string v1, "secure"

    .line 278
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    const/16 v19, 0x1

    goto :goto_a

    :cond_15
    const-string v1, "httponly"

    .line 280
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/16 v20, 0x1

    :catch_1
    :cond_16
    :goto_a
    add-int/lit8 v0, v11, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_6

    :cond_17
    move-object/from16 p1, v1

    const-wide/16 v0, -0x1

    cmp-long v5, v15, v25

    if-nez v5, :cond_18

    move-object/from16 v1, p0

    move-wide/from16 v15, v25

    goto :goto_c

    :cond_18
    cmp-long v5, v15, v0

    if-eqz v5, :cond_1c

    const-wide v0, 0x20c49ba5e353f7L

    cmp-long v5, v15, v0

    if-gtz v5, :cond_19

    const-wide/16 v0, 0x3e8

    mul-long v23, v15, v0

    :cond_19
    add-long v23, v6, v23

    cmp-long v0, v23, v6

    const-wide v5, 0xe677d21fdbffL

    if-ltz v0, :cond_1b

    cmp-long v0, v23, v5

    if-lez v0, :cond_1a

    goto :goto_b

    :cond_1a
    move-object/from16 v1, p0

    move-wide/from16 v15, v23

    goto :goto_c

    :cond_1b
    :goto_b
    move-object/from16 v1, p0

    move-wide v15, v5

    goto :goto_c

    :cond_1c
    move-object/from16 v1, p0

    move-wide/from16 v15, v17

    .line 486
    :goto_c
    iget-object v0, v1, Ll/ۨܰ᩵;->ۧ:Ljava/lang/String;

    if-nez v9, :cond_1d

    move-object v9, v0

    goto :goto_d

    .line 186
    :cond_1d
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    goto :goto_d

    .line 190
    :cond_1e
    invoke-virtual {v0, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_23

    .line 191
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v5, v6

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x2e

    if-ne v5, v6, :cond_23

    .line 192
    invoke-static {v0}, Ll/᩶۟᩵;->ۧ(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_23

    .line 310
    :goto_d
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v0, v5, :cond_1f

    .line 311
    invoke-static {}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->get()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    move-result-object v0

    invoke-virtual {v0, v9}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->getEffectiveTldPlusOne(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1f

    goto :goto_10

    :cond_1f
    const-string v0, "/"

    if-eqz v14, :cond_21

    .line 317
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_20

    goto :goto_e

    :cond_20
    move-object/from16 v18, v14

    goto :goto_f

    .line 318
    :cond_21
    :goto_e
    invoke-virtual/range {p0 .. p0}, Ll/ۨܰ᩵;->ۧ()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x2f

    .line 319
    invoke-virtual {v5, v6}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_22

    .line 320
    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_22
    move-object/from16 v18, v0

    .line 323
    :goto_f
    new-instance v0, Ll/ۘܰ᩵;

    move-object v12, v0

    move-object v14, v10

    move-object/from16 v17, v9

    invoke-direct/range {v12 .. v22}, Ll/ۘܰ᩵;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    goto :goto_11

    :cond_23
    :goto_10
    const/4 v0, 0x0

    :goto_11
    if-nez v0, :cond_24

    goto :goto_12

    :cond_24
    if-nez v4, :cond_25

    .line 447
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 448
    :cond_25
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_12
    add-int/lit8 v3, v3, 0x1

    const/4 v0, 0x0

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_26
    if-eqz v4, :cond_27

    .line 452
    invoke-static {v4}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_13

    .line 453
    :cond_27
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_13
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 586
    instance-of v0, p1, Ll/ۘܰ᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 587
    :cond_0
    check-cast p1, Ll/ۘܰ᩵;

    .line 588
    iget-object v0, p1, Ll/ۘܰ᩵;->ܿ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۘܰ᩵;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ll/ۘܰ᩵;->᩷:Ljava/lang/String;

    iget-object v2, p0, Ll/ۘܰ᩵;->᩷:Ljava/lang/String;

    .line 589
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ll/ۘܰ᩵;->֫:Ljava/lang/String;

    iget-object v2, p0, Ll/ۘܰ᩵;->֫:Ljava/lang/String;

    .line 590
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ll/ۘܰ᩵;->ܳ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۘܰ᩵;->ܳ:Ljava/lang/String;

    .line 591
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v2, p1, Ll/ۘܰ᩵;->ۧ:J

    iget-wide v4, p0, Ll/ۘܰ᩵;->ۧ:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-boolean v0, p1, Ll/ۘܰ᩵;->ۜ:Z

    iget-boolean v2, p0, Ll/ۘܰ᩵;->ۜ:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p1, Ll/ۘܰ᩵;->ᩳ:Z

    iget-boolean v2, p0, Ll/ۘܰ᩵;->ᩳ:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p1, Ll/ۘܰ᩵;->᩻:Z

    iget-boolean v2, p0, Ll/ۘܰ᩵;->᩻:Z

    if-ne v0, v2, :cond_1

    iget-boolean p1, p1, Ll/ۘܰ᩵;->ܽ:Z

    iget-boolean v0, p0, Ll/ۘܰ᩵;->ܽ:Z

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 6

    const/16 v0, 0x20f

    const/16 v1, 0x1f

    .line 0
    iget-object v2, p0, Ll/ۘܰ᩵;->ܿ:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 602
    iget-object v2, p0, Ll/ۘܰ᩵;->᩷:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 603
    iget-object v2, p0, Ll/ۘܰ᩵;->֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 604
    iget-object v2, p0, Ll/ۘܰ᩵;->ܳ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    const/16 v1, 0x20

    .line 605
    iget-wide v2, p0, Ll/ۘܰ᩵;->ۧ:J

    ushr-long v4, v2, v1

    xor-long v1, v2, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 606
    iget-boolean v1, p0, Ll/ۘܰ᩵;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 607
    iget-boolean v1, p0, Ll/ۘܰ᩵;->ᩳ:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 608
    iget-boolean v1, p0, Ll/ۘܰ᩵;->᩻:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 609
    iget-boolean v1, p0, Ll/ۘܰ᩵;->ܽ:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 551
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 552
    iget-object v1, p0, Ll/ۘܰ᩵;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    .line 553
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 554
    iget-object v1, p0, Ll/ۘܰ᩵;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    iget-boolean v1, p0, Ll/ۘܰ᩵;->᩻:Z

    if-eqz v1, :cond_1

    const-wide/high16 v1, -0x8000000000000000L

    .line 557
    iget-wide v3, p0, Ll/ۘܰ᩵;->ۧ:J

    cmp-long v5, v3, v1

    if-nez v5, :cond_0

    const-string v1, "; max-age=0"

    .line 558
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "; expires="

    .line 560
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-static {v1}, Ll/ۚ֫֡;->֫(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    :cond_1
    :goto_0
    iget-boolean v1, p0, Ll/ۘܰ᩵;->ܽ:Z

    if-nez v1, :cond_2

    const-string v1, "; domain="

    .line 565
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    iget-object v1, p0, Ll/ۘܰ᩵;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v1, "; path="

    .line 572
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘܰ᩵;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    iget-boolean v1, p0, Ll/ۘܰ᩵;->ۜ:Z

    if-eqz v1, :cond_3

    const-string v1, "; secure"

    .line 575
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    :cond_3
    iget-boolean v1, p0, Ll/ۘܰ᩵;->ᩳ:Z

    if-eqz v1, :cond_4

    const-string v1, "; httponly"

    .line 579
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۘܰ᩵;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۘܰ᩵;->᩷:Ljava/lang/String;

    return-object v0
.end method
