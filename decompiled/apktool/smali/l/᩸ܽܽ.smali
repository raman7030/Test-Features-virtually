.class public final Ll/᩸ܽܽ;
.super Ljava/lang/Object;
.source "O5DR"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ۗ֫:[C

.field public static final ۙ֫:[[I

.field public static final ۤ֫:[C

.field public static final ۫֫:[C

.field public static final ۬֫:[C

.field public static final ᩶֫:Ljava/util/regex/Pattern;

.field public static final ᩸֫:Ljava/util/regex/Pattern;

.field public static final ᩹֫:Ll/֡ۛۡ;


# instance fields
.field public ֡֫:I

.field public ֨֫:B

.field public ֫֫:B

.field public ۖ֫:B

.field public final ۗ:[B

.field public ۘ֫:I

.field public ۙ:I

.field public ۚ֫:I

.field public ۛ:B

.field public ۜ֫:Ljava/lang/String;

.field public ۟:[C

.field public ۠֫:B

.field public ۡ֫:I

.field public ۢ֫:I

.field public ۤ:B

.field public ۧ֫:[C

.field public ۨ:[C

.field public ۫:B

.field public ۬:I

.field public ܰ:[C

.field public ܳ֫:B

.field public ܶ֫:[B

.field public ܺ֫:B

.field public ܽ֫:S

.field public ܿ֫:I

.field public ᩳ֫:S

.field public ᩴ֫:I

.field public ᩵֫:S

.field public ᩶:[B

.field public ᩷֫:S

.field public ᩸:B

.field public ᩹:[C

.field public ᩺:Ll/ۤܽܽ;

.field public ᩻֫:B


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 39
    new-instance v0, Ll/֡ۛۡ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/᩸ܽܽ;->᩹֫:Ll/֡ۛۡ;

    const-string v0, "(\\d+)x(\\d+)"

    .line 40
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩸ܽܽ;->᩶֫:Ljava/util/regex/Pattern;

    const-string v0, "(\\d+)dpi"

    .line 41
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩸ܽܽ;->᩸֫:Ljava/util/regex/Pattern;

    const/16 v0, 0xb

    new-array v0, v0, [[I

    const/16 v2, 0x13

    const/4 v3, 0x1

    .line 249
    filled-new-array {v2, v3}, [I

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v0, v4

    const/16 v2, 0xc

    const/4 v4, 0x4

    filled-new-array {v2, v4}, [I

    move-result-object v2

    aput-object v2, v0, v3

    const/16 v2, 0x10

    const/4 v5, 0x3

    filled-new-array {v2, v5}, [I

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v2, 0x14

    filled-new-array {v2, v4}, [I

    move-result-object v2

    aput-object v2, v0, v5

    const/16 v2, 0x18

    filled-new-array {v2, v4}, [I

    move-result-object v2

    aput-object v2, v0, v4

    const/16 v2, 0x1c

    filled-new-array {v2, v3}, [I

    move-result-object v2

    const/4 v5, 0x5

    aput-object v2, v0, v5

    const/16 v2, 0x30

    filled-new-array {v2, v3}, [I

    move-result-object v2

    const/4 v5, 0x6

    aput-object v2, v0, v5

    const/16 v2, 0x31

    filled-new-array {v2, v3}, [I

    move-result-object v2

    const/4 v5, 0x7

    aput-object v2, v0, v5

    const/16 v2, 0x1d

    filled-new-array {v2, v3}, [I

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v0, v3

    const/16 v2, 0x1e

    filled-new-array {v2, v1}, [I

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v0, v3

    const/16 v2, 0x20

    filled-new-array {v2, v4}, [I

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v0, v3

    sput-object v0, Ll/᩸ܽܽ;->ۙ֫:[[I

    new-array v0, v1, [C

    .line 2375
    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸ܽܽ;->ۗ֫:[C

    new-array v0, v1, [C

    .line 2376
    fill-array-data v0, :array_1

    sput-object v0, Ll/᩸ܽܽ;->ۤ֫:[C

    new-array v0, v1, [C

    .line 2377
    fill-array-data v0, :array_2

    sput-object v0, Ll/᩸ܽܽ;->۬֫:[C

    new-array v0, v1, [C

    .line 2378
    fill-array-data v0, :array_3

    sput-object v0, Ll/᩸ܽܽ;->۫֫:[C

    return-void

    :array_0
    .array-data 2
        0x65s
        0x6es
    .end array-data

    :array_1
    .array-data 2
        0x55s
        0x53s
    .end array-data

    :array_2
    .array-data 2
        0xads
        0x5s
    .end array-data

    :array_3
    .array-data 2
        0x74s
        0x6cs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    iput-object v0, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    const/4 v0, 0x3

    new-array v0, v0, [B

    .line 84
    iput-object v0, p0, Ll/᩸ܽܽ;->ۗ:[B

    const/4 v0, 0x0

    .line 93
    iput-short v0, p0, Ll/᩸ܽܽ;->ܽ֫:S

    .line 94
    iput-short v0, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    const/4 v1, 0x2

    new-array v2, v1, [C

    .line 95
    iput-object v2, p0, Ll/᩸ܽܽ;->ۨ:[C

    new-array v1, v1, [C

    .line 96
    iput-object v1, p0, Ll/᩸ܽܽ;->᩹:[C

    .line 97
    iput-byte v0, p0, Ll/᩸ܽܽ;->᩻֫:B

    .line 98
    iput-byte v0, p0, Ll/᩸ܽܽ;->֨֫:B

    .line 99
    iput v0, p0, Ll/᩸ܽܽ;->ۙ:I

    .line 100
    iput-byte v0, p0, Ll/᩸ܽܽ;->ۛ:B

    .line 101
    iput-byte v0, p0, Ll/᩸ܽܽ;->ܳ֫:B

    .line 102
    iput-byte v0, p0, Ll/᩸ܽܽ;->ۤ:B

    .line 103
    iput-byte v0, p0, Ll/᩸ܽܽ;->۫:B

    .line 104
    iput v0, p0, Ll/᩸ܽܽ;->ۘ֫:I

    .line 105
    iput v0, p0, Ll/᩸ܽܽ;->ۢ֫:I

    .line 106
    iput-short v0, p0, Ll/᩸ܽܽ;->᩵֫:S

    .line 107
    iput-byte v0, p0, Ll/᩸ܽܽ;->ܺ֫:B

    .line 108
    iput-byte v0, p0, Ll/᩸ܽܽ;->۠֫:B

    .line 109
    iput v0, p0, Ll/᩸ܽܽ;->֡֫:I

    .line 110
    iput v0, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    .line 111
    iput v0, p0, Ll/᩸ܽܽ;->ۡ֫:I

    const/4 v1, 0x4

    new-array v1, v1, [C

    .line 112
    iput-object v1, p0, Ll/᩸ܽܽ;->۟:[C

    const/16 v1, 0x8

    new-array v2, v1, [C

    .line 113
    iput-object v2, p0, Ll/᩸ܽܽ;->ۧ֫:[C

    .line 114
    iput-byte v0, p0, Ll/᩸ܽܽ;->ۖ֫:B

    .line 115
    iput-byte v0, p0, Ll/᩸ܽܽ;->᩸:B

    .line 116
    iput-short v0, p0, Ll/᩸ܽܽ;->᩷֫:S

    new-array v0, v1, [C

    .line 117
    iput-object v0, p0, Ll/᩸ܽܽ;->ܰ:[C

    const/4 v0, 0x0

    .line 118
    iput-object v0, p0, Ll/᩸ܽܽ;->ܶ֫:[B

    .line 119
    iput-object v0, p0, Ll/᩸ܽܽ;->ۜ֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(II)I
    .locals 0

    and-int/2addr p0, p1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return p1
.end method

.method public static ֫(II[B[B)I
    .locals 2

    :cond_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_1

    add-int v0, p0, p1

    .line 302
    invoke-static {v0, p2}, Ll/᩸ܽܽ;->֫(I[B)I

    move-result v1

    invoke-static {v0, p3}, Ll/᩸ܽܽ;->֫(I[B)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(I[B)I
    .locals 1

    add-int/lit8 p0, p0, -0x4

    .line 296
    array-length v0, p1

    if-ge p0, v0, :cond_0

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫([C)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2303
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 2304
    aget-char v2, p0, v1

    if-nez v2, :cond_1

    if-nez v1, :cond_0

    const-string p0, ""

    return-object p0

    .line 2308
    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p0, v0, v1}, Ljava/lang/String;-><init>([CII)V

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2311
    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ֫(Landroid/content/res/Resources;)Ll/᩸ܽܽ;
    .locals 19

    .line 2206
    new-instance v0, Ll/᩸ܽܽ;

    invoke-direct {v0}, Ll/᩸ܽܽ;-><init>()V

    .line 2207
    invoke-virtual/range {p0 .. p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 2208
    invoke-virtual/range {p0 .. p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 2210
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-lt v3, v4, :cond_0

    .line 2211
    invoke-static {v1}, Ll/ܽܳۧ;->֫(Landroid/content/res/Configuration;)I

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 2214
    :goto_0
    iget v5, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    if-lt v5, v2, :cond_1

    move/from16 v18, v5

    move v5, v2

    move/from16 v2, v18

    .line 2225
    :cond_1
    iget v6, v1, Landroid/content/res/Configuration;->keyboardHidden:I

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ne v6, v8, :cond_2

    iget v8, v1, Landroid/content/res/Configuration;->hardKeyboardHidden:I

    if-ne v8, v7, :cond_2

    const/4 v6, 0x3

    .line 2232
    :cond_2
    iget v7, v1, Landroid/content/res/Configuration;->mcc:I

    iget v8, v1, Landroid/content/res/Configuration;->mnc:I

    iget-object v9, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iget v10, v1, Landroid/content/res/Configuration;->orientation:I

    iget v11, v1, Landroid/content/res/Configuration;->touchscreen:I

    iget v12, v1, Landroid/content/res/Configuration;->densityDpi:I

    iget v13, v1, Landroid/content/res/Configuration;->keyboard:I

    iget v14, v1, Landroid/content/res/Configuration;->navigation:I

    iget v15, v1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    move-object/from16 p0, v9

    iget v9, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    move/from16 v16, v3

    iget v3, v1, Landroid/content/res/Configuration;->screenHeightDp:I

    move/from16 v17, v4

    iget v4, v1, Landroid/content/res/Configuration;->screenLayout:I

    iget v1, v1, Landroid/content/res/Configuration;->uiMode:I

    int-to-short v7, v7

    .line 2252
    iput-short v7, v0, Ll/᩸ܽܽ;->ܽ֫:S

    int-to-short v7, v8

    .line 2253
    iput-short v7, v0, Ll/᩸ܽܽ;->ᩳ֫:S

    int-to-byte v7, v10

    .line 2254
    iput-byte v7, v0, Ll/᩸ܽܽ;->᩻֫:B

    int-to-byte v7, v11

    .line 2255
    iput-byte v7, v0, Ll/᩸ܽܽ;->֨֫:B

    int-to-short v7, v12

    .line 2256
    iput v7, v0, Ll/᩸ܽܽ;->ۙ:I

    int-to-byte v7, v13

    .line 2257
    iput-byte v7, v0, Ll/᩸ܽܽ;->ۛ:B

    int-to-byte v6, v6

    .line 2258
    iput-byte v6, v0, Ll/᩸ܽܽ;->ۤ:B

    int-to-byte v6, v14

    .line 2259
    iput-byte v6, v0, Ll/᩸ܽܽ;->ܳ֫:B

    int-to-short v2, v2

    .line 2260
    iput v2, v0, Ll/᩸ܽܽ;->ۘ֫:I

    int-to-short v2, v5

    .line 2261
    iput v2, v0, Ll/᩸ܽܽ;->ۢ֫:I

    int-to-short v2, v15

    .line 2262
    iput v2, v0, Ll/᩸ܽܽ;->֡֫:I

    int-to-short v2, v9

    .line 2263
    iput v2, v0, Ll/᩸ܽܽ;->ᩴ֫:I

    int-to-short v2, v3

    .line 2264
    iput v2, v0, Ll/᩸ܽܽ;->ۡ֫:I

    int-to-byte v2, v4

    .line 2265
    iput-byte v2, v0, Ll/᩸ܽܽ;->ܺ֫:B

    int-to-byte v1, v1

    .line 2266
    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    move/from16 v1, v17

    int-to-byte v1, v1

    .line 2267
    iput-byte v1, v0, Ll/᩸ܽܽ;->᩸:B

    move/from16 v1, v16

    int-to-short v1, v1

    .line 2268
    iput-short v1, v0, Ll/᩸ܽܽ;->᩵֫:S

    if-eqz p0, :cond_6

    .line 2271
    invoke-virtual/range {p0 .. p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 2273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v2, "yi"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x2

    goto :goto_2

    :sswitch_1
    const-string v2, "id"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x1

    goto :goto_2

    :sswitch_2
    const-string v2, "he"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    goto :goto_2

    :goto_1
    const/4 v2, -0x1

    :goto_2
    packed-switch v2, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    const-string v1, "ji"

    goto :goto_3

    :pswitch_1
    const-string v1, "in"

    goto :goto_3

    :pswitch_2
    const-string v1, "iw"

    .line 2284
    :goto_3
    iget-object v2, v0, Ll/᩸ܽܽ;->ۨ:[C

    invoke-static {v1, v2}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;[C)V

    .line 2285
    iget-object v1, v0, Ll/᩸ܽܽ;->᩹:[C

    invoke-virtual/range {p0 .. p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;[C)V

    .line 2286
    iget-object v1, v0, Ll/᩸ܽܽ;->۟:[C

    invoke-virtual/range {p0 .. p0}, Ljava/util/Locale;->getScript()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;[C)V

    .line 2287
    iget-object v1, v0, Ll/᩸ܽܽ;->ۧ֫:[C

    invoke-virtual/range {p0 .. p0}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;[C)V

    :cond_6
    and-int/lit16 v1, v4, 0x300

    shr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    .line 2297
    iput-byte v1, v0, Ll/᩸ܽܽ;->ۖ֫:B

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xcfd -> :sswitch_2
        0xd1b -> :sswitch_1
        0xf10 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;Ll/ۤܽܽ;)Ll/᩸ܽܽ;
    .locals 1

    .line 140
    new-instance v0, Ll/᩸ܽܽ;

    invoke-direct {v0}, Ll/᩸ܽܽ;-><init>()V

    .line 141
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, v0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    .line 142
    invoke-direct {v0, p0}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ll/ۛۜܽ;Ll/ۤܽܽ;)Ll/᩸ܽܽ;
    .locals 1

    .line 128
    new-instance v0, Ll/᩸ܽܽ;

    invoke-direct {v0}, Ll/᩸ܽܽ;-><init>()V

    .line 129
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, v0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    .line 130
    invoke-direct {v0, p0}, Ll/᩸ܽܽ;->֫(Ll/ۛۜܽ;)V

    return-object v0
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 430
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_10

    .line 432
    :cond_0
    sget-object v2, Ll/᩸ܽܽ;->᩸֫:Ljava/util/regex/Pattern;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 433
    sget-object v4, Ll/᩸ܽܽ;->᩶֫:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 440
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "-"

    .line 441
    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    if-ge v7, v6, :cond_63

    aget-object v14, v5, v7

    if-eqz v9, :cond_2

    .line 444
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x0

    move-object/from16 v19, v4

    move-object/from16 v16, v5

    move/from16 v17, v6

    goto/16 :goto_c

    .line 445
    :cond_1
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    const-string v15, "unknown"

    .line 449
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v16

    const/16 v1, 0x2d

    if-nez v16, :cond_3

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    :cond_3
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v1, "notouch"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v1, 0x38

    goto/16 :goto_2

    :sswitch_1
    const-string v1, "notlong"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v1, 0x37

    goto/16 :goto_2

    :sswitch_2
    const-string v1, "nowidecg"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v1, 0x36

    goto/16 :goto_2

    :sswitch_3
    const-string v1, "notround"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v1, 0x35

    goto/16 :goto_2

    :sswitch_4
    const-string v1, "notnight"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v1, 0x34

    goto/16 :goto_2

    :sswitch_5
    const-string v1, "keyshidden"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v1, 0x33

    goto/16 :goto_2

    :sswitch_6
    const-string v1, "trackball"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v1, 0x32

    goto/16 :goto_2

    :sswitch_7
    const-string v1, "navhidden"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v1, 0x31

    goto/16 :goto_2

    :sswitch_8
    const-string v1, "keyssoft"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v1, 0x30

    goto/16 :goto_2

    :sswitch_9
    const-string v1, "godzillaui"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v1, 0x2f

    goto/16 :goto_2

    :sswitch_a
    const-string v1, "keysexposed"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v1, 0x2e

    goto/16 :goto_2

    :sswitch_b
    const-string v1, "xhdpi"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_1

    :cond_f
    const/16 v1, 0x2d

    goto/16 :goto_2

    :sswitch_c
    const-string v1, "wheel"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v1, 0x2c

    goto/16 :goto_2

    :sswitch_d
    const-string v1, "watch"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_1

    :cond_11
    const/16 v1, 0x2b

    goto/16 :goto_2

    :sswitch_e
    const-string v1, "tvdpi"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_1

    :cond_12
    const/16 v1, 0x2a

    goto/16 :goto_2

    :sswitch_f
    const-string v1, "small"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_1

    :cond_13
    const/16 v1, 0x29

    goto/16 :goto_2

    :sswitch_10
    const-string v1, "round"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto/16 :goto_1

    :cond_14
    const/16 v1, 0x28

    goto/16 :goto_2

    :sswitch_11
    const-string v1, "nonav"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto/16 :goto_1

    :cond_15
    const/16 v1, 0x27

    goto/16 :goto_2

    :sswitch_12
    const-string v1, "nodpi"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto/16 :goto_1

    :cond_16
    const/16 v1, 0x26

    goto/16 :goto_2

    :sswitch_13
    const-string v1, "night"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_1

    :cond_17
    const/16 v1, 0x25

    goto/16 :goto_2

    :sswitch_14
    const-string v1, "lowdr"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_1

    :cond_18
    const/16 v1, 0x24

    goto/16 :goto_2

    :sswitch_15
    const-string v1, "ldrtl"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto/16 :goto_1

    :cond_19
    const/16 v1, 0x23

    goto/16 :goto_2

    :sswitch_16
    const-string v1, "ldltr"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_1

    :cond_1a
    const/16 v1, 0x22

    goto/16 :goto_2

    :sswitch_17
    const-string v1, "large"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto/16 :goto_1

    :cond_1b
    const/16 v1, 0x21

    goto/16 :goto_2

    :sswitch_18
    const-string v1, "12key"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    goto/16 :goto_1

    :cond_1c
    const/16 v1, 0x20

    goto/16 :goto_2

    :sswitch_19
    const-string v1, "feminine"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    goto/16 :goto_1

    :cond_1d
    const/16 v1, 0x1f

    goto/16 :goto_2

    :sswitch_1a
    const-string v1, "port"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    goto/16 :goto_1

    :cond_1e
    const/16 v1, 0x1e

    goto/16 :goto_2

    :sswitch_1b
    const-string v1, "mdpi"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    goto/16 :goto_1

    :cond_1f
    const/16 v1, 0x1d

    goto/16 :goto_2

    :sswitch_1c
    const-string v1, "long"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    goto/16 :goto_1

    :cond_20
    const/16 v1, 0x1c

    goto/16 :goto_2

    :sswitch_1d
    const-string v1, "ldpi"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    goto/16 :goto_1

    :cond_21
    const/16 v1, 0x1b

    goto/16 :goto_2

    :sswitch_1e
    const-string v1, "land"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    goto/16 :goto_1

    :cond_22
    const/16 v1, 0x1a

    goto/16 :goto_2

    :sswitch_1f
    const-string v1, "hdpi"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    goto/16 :goto_1

    :cond_23
    const/16 v1, 0x19

    goto/16 :goto_2

    :sswitch_20
    const-string v1, "dpad"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    goto/16 :goto_1

    :cond_24
    const/16 v1, 0x18

    goto/16 :goto_2

    :sswitch_21
    const-string v1, "desk"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    goto/16 :goto_1

    :cond_25
    const/16 v1, 0x17

    goto/16 :goto_2

    :sswitch_22
    const-string v1, "car"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    goto/16 :goto_1

    :cond_26
    const/16 v1, 0x16

    goto/16 :goto_2

    :sswitch_23
    const-string v1, "largeui"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    goto/16 :goto_1

    :cond_27
    const/16 v1, 0x15

    goto/16 :goto_2

    :sswitch_24
    const-string v1, "masculine"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    goto/16 :goto_1

    :cond_28
    const/16 v1, 0x14

    goto/16 :goto_2

    :sswitch_25
    const-string v1, "xxhdpi"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    goto/16 :goto_1

    :cond_29
    const/16 v1, 0x13

    goto/16 :goto_2

    :sswitch_26
    const-string v1, "xlarge"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    goto/16 :goto_1

    :cond_2a
    const/16 v1, 0x12

    goto/16 :goto_2

    :sswitch_27
    const-string v1, "widecg"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    goto/16 :goto_1

    :cond_2b
    const/16 v1, 0x11

    goto/16 :goto_2

    :sswitch_28
    const-string v1, "stylus"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto/16 :goto_1

    :cond_2c
    const/16 v1, 0x10

    goto/16 :goto_2

    :sswitch_29
    const-string v1, "square"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    goto/16 :goto_1

    :cond_2d
    const/16 v1, 0xf

    goto/16 :goto_2

    :sswitch_2a
    const-string v1, "mediumui"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    goto/16 :goto_1

    :cond_2e
    const/16 v1, 0xe

    goto/16 :goto_2

    :sswitch_2b
    const-string v1, "vrheadset"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    goto/16 :goto_1

    :cond_2f
    const/16 v1, 0xd

    goto/16 :goto_2

    :sswitch_2c
    const-string v1, "qwerty"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    goto/16 :goto_1

    :cond_30
    const/16 v1, 0xc

    goto/16 :goto_2

    :sswitch_2d
    const-string v1, "normal"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    goto/16 :goto_1

    :cond_31
    const/16 v1, 0xb

    goto/16 :goto_2

    :sswitch_2e
    const-string v1, "nokeys"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    goto/16 :goto_1

    :cond_32
    const/16 v1, 0xa

    goto/16 :goto_2

    :sswitch_2f
    const-string v1, "neuter"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    goto/16 :goto_1

    :cond_33
    const/16 v1, 0x9

    goto/16 :goto_2

    :sswitch_30
    const-string v1, "navexposed"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    goto/16 :goto_1

    :cond_34
    const/16 v1, 0x8

    goto/16 :goto_2

    :sswitch_31
    const-string v1, "hugeui"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    goto :goto_1

    :cond_35
    const/4 v1, 0x7

    goto :goto_2

    :sswitch_32
    const-string v1, "highdr"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    goto :goto_1

    :cond_36
    const/4 v1, 0x6

    goto :goto_2

    :sswitch_33
    const-string v1, "finger"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    goto :goto_1

    :cond_37
    const/4 v1, 0x5

    goto :goto_2

    :sswitch_34
    const-string v1, "television"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    goto :goto_1

    :cond_38
    const/4 v1, 0x4

    goto :goto_2

    :sswitch_35
    const-string v1, "anydpi"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    goto :goto_1

    :cond_39
    const/4 v1, 0x3

    goto :goto_2

    :sswitch_36
    const-string v1, "xxxhdpi"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    goto :goto_1

    :cond_3a
    const/4 v1, 0x2

    goto :goto_2

    :sswitch_37
    const-string v1, "appliance"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3b

    goto :goto_1

    :cond_3b
    const/4 v1, 0x1

    goto :goto_2

    :sswitch_38
    const-string v1, "smallui"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    goto :goto_1

    :cond_3c
    const/4 v1, 0x0

    goto :goto_2

    :goto_1
    const/4 v1, -0x1

    :goto_2
    packed-switch v1, :pswitch_data_0

    const-string v1, "mcc"

    .line 677
    invoke-virtual {v14, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3d

    const/4 v1, 0x3

    .line 678
    invoke-virtual {v14, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v1

    iput-short v1, v0, Ll/᩸ܽܽ;->ܽ֫:S

    goto/16 :goto_5

    :pswitch_0
    const/4 v1, 0x1

    .line 612
    iput-byte v1, v0, Ll/᩸ܽܽ;->֨֫:B

    goto/16 :goto_3

    .line 484
    :pswitch_1
    iget-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    or-int/lit8 v1, v1, 0x10

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    goto/16 :goto_3

    .line 510
    :pswitch_2
    iget-byte v1, v0, Ll/᩸ܽܽ;->᩸:B

    or-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->᩸:B

    goto/16 :goto_3

    .line 493
    :pswitch_3
    iget-byte v1, v0, Ll/᩸ܽܽ;->ۖ֫:B

    or-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ۖ֫:B

    goto/16 :goto_5

    .line 574
    :pswitch_4
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0x10

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto/16 :goto_5

    .line 625
    :pswitch_5
    iget-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    or-int/lit8 v1, v1, 0x2

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    goto/16 :goto_5

    :pswitch_6
    const/4 v1, 0x3

    .line 655
    iput-byte v1, v0, Ll/᩸ܽܽ;->ܳ֫:B

    goto/16 :goto_5

    .line 645
    :pswitch_7
    iget-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    or-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    goto/16 :goto_5

    .line 628
    :pswitch_8
    iget-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    or-int/lit8 v1, v1, 0x3

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    goto/16 :goto_5

    .line 549
    :pswitch_9
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0xb

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto/16 :goto_5

    .line 622
    :pswitch_a
    iget-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    or-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    goto/16 :goto_5

    :pswitch_b
    const/16 v1, 0x140

    .line 592
    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    goto/16 :goto_5

    :pswitch_c
    const/4 v1, 0x4

    .line 658
    iput-byte v1, v0, Ll/᩸ܽܽ;->ܳ֫:B

    goto/16 :goto_5

    .line 561
    :pswitch_d
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0x6

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto/16 :goto_5

    :pswitch_e
    const/16 v1, 0xd5

    .line 588
    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    goto/16 :goto_5

    .line 463
    :pswitch_f
    iget-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    or-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    goto/16 :goto_3

    .line 489
    :pswitch_10
    iget-byte v1, v0, Ll/᩸ܽܽ;->ۖ֫:B

    or-int/lit8 v1, v1, 0x2

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ۖ֫:B

    goto/16 :goto_3

    :pswitch_11
    const/4 v1, 0x1

    .line 649
    iput-byte v1, v0, Ll/᩸ܽܽ;->ܳ֫:B

    goto/16 :goto_3

    :pswitch_12
    const v1, 0xffff

    .line 608
    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    goto/16 :goto_5

    .line 570
    :pswitch_13
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0x20

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto/16 :goto_5

    .line 502
    :pswitch_14
    iget-byte v1, v0, Ll/᩸ܽܽ;->᩸:B

    or-int/lit8 v1, v1, 0x4

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->᩸:B

    goto/16 :goto_5

    .line 454
    :pswitch_15
    iget-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    goto/16 :goto_5

    .line 458
    :pswitch_16
    iget-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    or-int/lit8 v1, v1, 0x40

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    goto/16 :goto_5

    .line 471
    :pswitch_17
    iget-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    or-int/lit8 v1, v1, 0x3

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    goto/16 :goto_5

    :pswitch_18
    const/4 v1, 0x3

    .line 638
    iput-byte v1, v0, Ll/᩸ܽܽ;->ۛ:B

    goto/16 :goto_5

    :pswitch_19
    const/4 v1, 0x2

    .line 665
    iput-byte v1, v0, Ll/᩸ܽܽ;->۫:B

    goto/16 :goto_5

    :pswitch_1a
    const/4 v1, 0x1

    .line 515
    iput-byte v1, v0, Ll/᩸ܽܽ;->᩻֫:B

    goto/16 :goto_3

    :pswitch_1b
    const/16 v1, 0xa0

    .line 582
    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    goto/16 :goto_5

    .line 480
    :pswitch_1c
    iget-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    or-int/lit8 v1, v1, 0x20

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    goto/16 :goto_5

    :pswitch_1d
    const/16 v1, 0x78

    .line 579
    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    goto/16 :goto_5

    :pswitch_1e
    const/4 v1, 0x2

    .line 518
    iput-byte v1, v0, Ll/᩸ܽܽ;->᩻֫:B

    goto/16 :goto_5

    :pswitch_1f
    const/16 v1, 0xf0

    .line 585
    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    goto/16 :goto_5

    :pswitch_20
    const/4 v1, 0x2

    .line 652
    iput-byte v1, v0, Ll/᩸ܽܽ;->ܳ֫:B

    goto/16 :goto_5

    .line 529
    :pswitch_21
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0x2

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto/16 :goto_5

    .line 525
    :pswitch_22
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0x3

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto/16 :goto_5

    .line 545
    :pswitch_23
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0xe

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto/16 :goto_5

    :pswitch_24
    const/4 v1, 0x3

    .line 668
    iput-byte v1, v0, Ll/᩸ܽܽ;->۫:B

    goto/16 :goto_5

    :pswitch_25
    const/16 v1, 0x1e0

    .line 596
    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    goto/16 :goto_5

    .line 475
    :pswitch_26
    iget-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    or-int/lit8 v1, v1, 0x4

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    goto/16 :goto_5

    .line 506
    :pswitch_27
    iget-byte v1, v0, Ll/᩸ܽܽ;->᩸:B

    or-int/lit8 v1, v1, 0x2

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->᩸:B

    goto/16 :goto_5

    :pswitch_28
    const/4 v1, 0x2

    .line 615
    iput-byte v1, v0, Ll/᩸ܽܽ;->֨֫:B

    goto/16 :goto_5

    :pswitch_29
    const/4 v1, 0x3

    .line 521
    iput-byte v1, v0, Ll/᩸ܽܽ;->᩻֫:B

    goto/16 :goto_5

    .line 541
    :pswitch_2a
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0xd

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto/16 :goto_5

    .line 565
    :pswitch_2b
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0x7

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto/16 :goto_5

    :pswitch_2c
    const/4 v1, 0x2

    .line 635
    iput-byte v1, v0, Ll/᩸ܽܽ;->ۛ:B

    goto/16 :goto_5

    .line 467
    :pswitch_2d
    iget-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    or-int/lit8 v1, v1, 0x2

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ܺ֫:B

    goto/16 :goto_5

    :pswitch_2e
    const/4 v1, 0x1

    .line 632
    iput-byte v1, v0, Ll/᩸ܽܽ;->ۛ:B

    goto :goto_3

    :pswitch_2f
    const/4 v1, 0x1

    .line 662
    iput-byte v1, v0, Ll/᩸ܽܽ;->۫:B

    goto :goto_3

    .line 642
    :pswitch_30
    iget-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    or-int/lit8 v1, v1, 0x4

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->ۤ:B

    goto :goto_3

    .line 553
    :pswitch_31
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0xf

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto :goto_3

    .line 498
    :pswitch_32
    iget-byte v1, v0, Ll/᩸ܽܽ;->᩸:B

    or-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->᩸:B

    goto :goto_3

    :pswitch_33
    const/4 v1, 0x3

    .line 618
    iput-byte v1, v0, Ll/᩸ܽܽ;->֨֫:B

    goto :goto_3

    .line 533
    :pswitch_34
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0x4

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto :goto_3

    :pswitch_35
    const v1, 0xfffe

    .line 604
    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    goto :goto_3

    :pswitch_36
    const/16 v1, 0x280

    .line 600
    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    goto :goto_3

    .line 557
    :pswitch_37
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0x5

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    goto :goto_3

    .line 537
    :pswitch_38
    iget-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    or-int/lit8 v1, v1, 0xc

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/᩸ܽܽ;->۠֫:B

    :goto_3
    move-object/from16 v19, v4

    move-object/from16 v16, v5

    move/from16 v17, v6

    :goto_4
    move/from16 v18, v9

    move/from16 v20, v11

    goto/16 :goto_8

    :cond_3d
    const-string v1, "mnc"

    .line 679
    invoke-virtual {v14, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3e

    const/4 v1, 0x3

    .line 680
    invoke-virtual {v14, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v1

    iput-short v1, v0, Ll/᩸ܽܽ;->ᩳ֫:S

    if-nez v1, :cond_40

    const/4 v1, -0x1

    .line 682
    iput-short v1, v0, Ll/᩸ܽܽ;->ᩳ֫:S

    goto :goto_5

    :cond_3e
    const-string v1, "[a-z]{2,3}"

    .line 684
    invoke-virtual {v14, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3f

    .line 685
    invoke-virtual {v14}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    iput-object v1, v0, Ll/᩸ܽܽ;->ۨ:[C

    goto :goto_5

    :cond_3f
    const-string v1, "r[A-Z0-9]{2}"

    .line 686
    invoke-virtual {v14, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_41

    const/4 v1, 0x1

    .line 687
    invoke-virtual {v14, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    iput-object v1, v0, Ll/᩸ܽܽ;->᩹:[C

    :cond_40
    :goto_5
    move-object/from16 v19, v4

    move-object/from16 v16, v5

    move/from16 v17, v6

    goto :goto_4

    :cond_41
    const-string v1, "b+"

    .line 688
    invoke-virtual {v14, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4e

    const/4 v1, 0x2

    .line 689
    invoke-virtual {v14, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v15, "\\+"

    invoke-virtual {v1, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 690
    new-instance v15, Ll/ᩴۢᩴ;

    move-object/from16 v16, v5

    const/4 v5, 0x4

    invoke-direct {v15, v5}, Ll/ᩴۢᩴ;-><init>(I)V

    const/4 v5, 0x0

    move/from16 v17, v6

    .line 691
    :goto_6
    array-length v6, v1

    if-ge v5, v6, :cond_4d

    .line 692
    aget-object v6, v1, v5

    move/from16 v18, v9

    .line 693
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    move-result-object v9

    move-object/from16 v19, v4

    const/4 v4, 0x0

    .line 694
    invoke-virtual {v15, v4}, Ll/ᩴۢᩴ;->add(I)Z

    move-result v4

    if-eqz v4, :cond_43

    .line 695
    array-length v4, v9

    move/from16 v20, v11

    const/4 v11, 0x2

    if-eq v4, v11, :cond_42

    array-length v4, v9

    const/4 v11, 0x3

    if-ne v4, v11, :cond_44

    .line 696
    :cond_42
    iput-object v9, v0, Ll/᩸ܽܽ;->ۨ:[C

    goto/16 :goto_7

    :cond_43
    move/from16 v20, v11

    :cond_44
    const/4 v4, 0x1

    .line 700
    invoke-virtual {v15, v4}, Ll/ᩴۢᩴ;->add(I)Z

    move-result v4

    if-eqz v4, :cond_45

    .line 701
    array-length v4, v9

    const/4 v11, 0x4

    if-ne v4, v11, :cond_45

    .line 702
    iput-object v9, v0, Ll/᩸ܽܽ;->۟:[C

    goto :goto_7

    :cond_45
    const/4 v4, 0x2

    .line 706
    invoke-virtual {v15, v4}, Ll/ᩴۢᩴ;->add(I)Z

    move-result v11

    if-eqz v11, :cond_47

    .line 707
    array-length v11, v9

    if-eq v11, v4, :cond_46

    array-length v4, v9

    const/4 v11, 0x3

    if-ne v4, v11, :cond_48

    .line 708
    :cond_46
    iput-object v9, v0, Ll/᩸ܽܽ;->᩹:[C

    goto :goto_7

    :cond_47
    const/4 v11, 0x3

    .line 712
    :cond_48
    invoke-virtual {v15, v11}, Ll/ᩴۢᩴ;->add(I)Z

    move-result v4

    if-eqz v4, :cond_49

    .line 713
    array-length v4, v9

    const/4 v11, 0x5

    if-lt v4, v11, :cond_49

    array-length v4, v9

    const/16 v11, 0x8

    if-gt v4, v11, :cond_49

    .line 714
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v4

    iput-object v4, v0, Ll/᩸ܽܽ;->ۧ֫:[C

    goto :goto_7

    :cond_49
    const/4 v4, 0x4

    .line 718
    invoke-virtual {v15, v4}, Ll/ᩴۢᩴ;->add(I)Z

    move-result v4

    if-eqz v4, :cond_4c

    add-int/lit8 v4, v5, 0x2

    .line 719
    array-length v9, v1

    if-ge v4, v9, :cond_4c

    const-string v9, "u"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4c

    add-int/lit8 v5, v5, 0x1

    aget-object v5, v1, v5

    const-string v6, "nu"

    .line 720
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4c

    aget-object v5, v1, v4

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4c

    if-nez v13, :cond_4b

    .line 724
    aget-object v5, v1, v4

    invoke-virtual {v5}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    .line 725
    invoke-static {v5}, Ll/᩸ܽܽ;->ۧ([C)Z

    move-result v6

    if-eqz v6, :cond_4a

    const/16 v6, 0x8

    .line 729
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v5

    iput-object v5, v0, Ll/᩸ܽܽ;->ܰ:[C

    const/4 v5, 0x1

    move v5, v4

    const/4 v13, 0x1

    :goto_7
    add-int/lit8 v5, v5, 0x1

    move/from16 v9, v18

    move-object/from16 v4, v19

    move/from16 v11, v20

    goto/16 :goto_6

    .line 726
    :cond_4a
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Invalid numbering system: "

    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 722
    :cond_4b
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Duplicate numbering system: "

    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 734
    :cond_4c
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v14}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4d
    move-object/from16 v19, v4

    goto/16 :goto_4

    :cond_4e
    move-object/from16 v19, v4

    move-object/from16 v16, v5

    move/from16 v17, v6

    move/from16 v18, v9

    move/from16 v20, v11

    const-string v1, "sw"

    .line 736
    invoke-virtual {v14, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const-string v4, "dp"

    if-eqz v1, :cond_4f

    invoke-virtual {v14, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4f

    const/4 v1, 0x2

    .line 0
    invoke-static {v1, v1, v14}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 737
    invoke-static {v1}, Ll/᩸ܽܽ;->ۧ(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/᩸ܽܽ;->֡֫:I

    goto :goto_8

    :cond_4f
    const/4 v1, 0x2

    const-string v5, "w"

    .line 739
    invoke-virtual {v14, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_50

    invoke-virtual {v14, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_50

    const/4 v4, 0x1

    .line 0
    invoke-static {v1, v4, v14}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 740
    invoke-static {v1}, Ll/᩸ܽܽ;->ۧ(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/᩸ܽܽ;->ᩴ֫:I

    goto :goto_8

    :cond_50
    const/4 v5, 0x1

    const-string v6, "h"

    .line 742
    invoke-virtual {v14, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_51

    invoke-virtual {v14, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_51

    .line 0
    invoke-static {v1, v5, v14}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 743
    invoke-static {v1}, Ll/᩸ܽܽ;->ۧ(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/᩸ܽܽ;->ۡ֫:I

    goto :goto_8

    :cond_51
    const-string v1, "v"

    .line 745
    invoke-virtual {v14, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_53

    .line 747
    invoke-virtual {v14, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v1

    .line 748
    iget-short v4, v0, Ll/᩸ܽܽ;->᩵֫:S

    if-ge v4, v1, :cond_52

    .line 749
    iput-short v1, v0, Ll/᩸ܽܽ;->᩵֫:S

    :cond_52
    const/4 v1, 0x1

    move/from16 v9, v18

    const/4 v11, 0x1

    goto/16 :goto_c

    .line 750
    :cond_53
    invoke-virtual {v2, v14}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_54

    .line 751
    invoke-virtual {v2, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/᩸ܽܽ;->ۙ:I

    :goto_8
    move/from16 v9, v18

    move/from16 v11, v20

    goto/16 :goto_c

    .line 752
    :cond_54
    invoke-virtual {v3, v14}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_55

    .line 753
    invoke-virtual {v3, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ll/᩸ܽܽ;->ۧ(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/᩸ܽܽ;->ۘ֫:I

    const/4 v1, 0x2

    .line 754
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ll/᩸ܽܽ;->ۧ(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/᩸ܽܽ;->ۢ֫:I

    goto :goto_8

    .line 755
    :cond_55
    iget-object v1, v0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    sget-object v4, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    if-ne v1, v4, :cond_56

    const-string v1, "spn"

    invoke-virtual {v14, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_56

    const/4 v1, 0x3

    .line 756
    invoke-virtual {v14, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩸ܽܽ;->ܽ(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/᩸ܽܽ;->ۚ֫:I

    goto :goto_8

    .line 757
    :cond_56
    iget-object v1, v0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    if-ne v1, v4, :cond_57

    const-string v1, "gid1"

    invoke-virtual {v14, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_57

    const/4 v1, 0x4

    .line 758
    invoke-virtual {v14, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩸ܽܽ;->ܽ(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/᩸ܽܽ;->۬:I

    goto :goto_8

    .line 759
    :cond_57
    iget-object v1, v0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    const-string v5, "Unknown config part: "

    if-ne v1, v4, :cond_5d

    const-string v1, "mot"

    invoke-virtual {v14, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5d

    .line 760
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_1

    goto :goto_9

    :sswitch_39
    const-string v1, "motdesk"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_58

    goto :goto_9

    :cond_58
    const/4 v1, 0x3

    goto :goto_a

    :sswitch_3a
    const-string v1, "motphone"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_59

    goto :goto_9

    :cond_59
    const/4 v1, 0x2

    goto :goto_a

    :sswitch_3b
    const-string v1, "motmobile"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5a

    goto :goto_9

    :cond_5a
    const/4 v1, 0x1

    goto :goto_a

    :sswitch_3c
    const-string v1, "motcli"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5b

    goto :goto_9

    :cond_5b
    const/4 v1, 0x0

    goto :goto_a

    :goto_9
    const/4 v1, -0x1

    :goto_a
    packed-switch v1, :pswitch_data_1

    const-string v1, "motuimode"

    .line 766
    invoke-virtual {v14, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5c

    const/16 v1, 0x9

    .line 767
    invoke-virtual {v14, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩸ܽܽ;->ܽ(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/᩸ܽܽ;->ܿ֫:I

    goto/16 :goto_8

    :pswitch_39
    const/4 v1, 0x2

    .line 762
    iput v1, v0, Ll/᩸ܽܽ;->ܿ֫:I

    goto/16 :goto_8

    :pswitch_3a
    const/4 v1, 0x1

    .line 761
    iput v1, v0, Ll/᩸ܽܽ;->ܿ֫:I

    goto/16 :goto_8

    :pswitch_3b
    const/4 v1, 0x3

    .line 763
    iput v1, v0, Ll/᩸ܽܽ;->ܿ֫:I

    goto/16 :goto_8

    :pswitch_3c
    const/4 v1, 0x4

    .line 764
    iput v1, v0, Ll/᩸ܽܽ;->ܿ֫:I

    goto/16 :goto_8

    .line 766
    :cond_5c
    new-instance v1, Ljava/lang/Exception;

    invoke-virtual {v5, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 769
    :cond_5d
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_62

    if-nez v12, :cond_61

    const/16 v1, 0x2b

    .line 772
    invoke-virtual {v14, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v4, 0x7

    if-lt v1, v4, :cond_60

    if-ne v1, v4, :cond_5e

    const/16 v4, 0x3c

    goto :goto_b

    .line 774
    :cond_5e
    invoke-virtual {v14, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩸ܽܽ;->ܽ(Ljava/lang/String;)I

    move-result v4

    .line 775
    :goto_b
    invoke-static {}, Ll/ۧ᩺ܺ;->ᩳ()Ll/ۧ᩺ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۧ᩺ܺ;->ۧ()Ll/ۧ᩺ܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۧ᩺ܺ;->֫()Ll/ۧ᩺ܺ;

    move-result-object v5

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v14, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll/ۧ᩺ܺ;->֫(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v5, 0x4

    if-lt v4, v5, :cond_5f

    .line 776
    array-length v5, v1

    if-eqz v5, :cond_5f

    int-to-long v5, v4

    array-length v8, v1

    int-to-long v8, v8

    add-long/2addr v5, v8

    const-wide/16 v8, 0xff

    cmp-long v10, v5, v8

    if-gtz v10, :cond_5f

    const/4 v5, 0x1

    move-object v8, v1

    move v10, v4

    move/from16 v9, v18

    move/from16 v11, v20

    const/4 v12, 0x1

    :goto_c
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p1

    move-object/from16 v5, v16

    move/from16 v6, v17

    move-object/from16 v4, v19

    goto/16 :goto_0

    .line 777
    :cond_5f
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Invalid unknown config range: "

    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 773
    :cond_60
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Invalid unknown config bytes: "

    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 770
    :cond_61
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Duplicate unknown config bytes: "

    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 779
    :cond_62
    new-instance v1, Ljava/lang/Exception;

    invoke-virtual {v5, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_63
    move-object/from16 v19, v4

    move/from16 v20, v11

    if-eqz v8, :cond_6e

    .line 783
    invoke-direct/range {p0 .. p0}, Ll/᩸ܽܽ;->ܿ()[B

    move-result-object v1

    .line 785
    iget-object v2, v0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v2, v2, Ll/ۤܽܽ;->᩸:I

    array-length v3, v8

    add-int/2addr v3, v10

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    new-array v3, v2, [B

    .line 786
    array-length v4, v1

    const/4 v5, 0x0

    const/4 v6, 0x4

    invoke-static {v1, v5, v3, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x0

    .line 787
    :goto_d
    array-length v4, v8

    const-string v5, "Unknown bytes conflict with explicit qualifiers"

    if-ge v1, v4, :cond_6c

    add-int v4, v10, v1

    const/16 v6, 0x18

    const/16 v7, 0x1a

    if-eqz v20, :cond_65

    if-lt v4, v6, :cond_65

    if-ge v4, v7, :cond_65

    :cond_64
    const/16 v6, 0xff

    goto :goto_f

    .line 790
    :cond_65
    aget-byte v6, v3, v4

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0x12

    if-eq v4, v7, :cond_6a

    const/16 v7, 0x1c

    const/16 v9, 0x30

    if-eq v4, v7, :cond_69

    const/16 v7, 0x1d

    if-eq v4, v7, :cond_68

    if-eq v4, v9, :cond_67

    const/16 v7, 0x31

    if-eq v4, v7, :cond_66

    if-nez v6, :cond_64

    const/4 v6, 0x0

    goto :goto_f

    :cond_66
    const/4 v7, 0x3

    .line 819
    invoke-static {v6, v7}, Ll/᩸ܽܽ;->֫(II)I

    move-result v7

    const/16 v9, 0xc

    invoke-static {v6, v9}, Ll/᩸ܽܽ;->֫(II)I

    move-result v6

    goto :goto_e

    :cond_67
    const/4 v7, 0x3

    .line 817
    invoke-static {v6, v7}, Ll/᩸ܽܽ;->֫(II)I

    move-result v6

    goto :goto_f

    :cond_68
    const/16 v7, 0xf

    .line 815
    invoke-static {v6, v7}, Ll/᩸ܽܽ;->֫(II)I

    move-result v7

    invoke-static {v6, v9}, Ll/᩸ܽܽ;->֫(II)I

    move-result v6

    goto :goto_e

    :cond_69
    const/16 v7, 0xf

    .line 812
    invoke-static {v6, v7}, Ll/᩸ܽܽ;->֫(II)I

    move-result v7

    invoke-static {v6, v9}, Ll/᩸ܽܽ;->֫(II)I

    move-result v9

    or-int/2addr v7, v9

    const/16 v9, 0xc0

    .line 813
    invoke-static {v6, v9}, Ll/᩸ܽܽ;->֫(II)I

    move-result v6

    goto :goto_e

    :cond_6a
    const/4 v7, 0x3

    .line 810
    invoke-static {v6, v7}, Ll/᩸ܽܽ;->֫(II)I

    move-result v7

    const/16 v9, 0xc

    invoke-static {v6, v9}, Ll/᩸ܽܽ;->֫(II)I

    move-result v6

    :goto_e
    or-int/2addr v6, v7

    .line 791
    :goto_f
    aget-byte v4, v3, v4

    aget-byte v7, v8, v1

    xor-int/2addr v4, v7

    and-int/2addr v4, v6

    if-nez v4, :cond_6b

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    .line 792
    :cond_6b
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 794
    :cond_6c
    array-length v1, v8

    const/4 v4, 0x0

    invoke-static {v8, v4, v3, v10, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 795
    invoke-static {v4, v2, v3}, Ll/ܺܰۡ;->֫(II[B)V

    .line 797
    new-instance v1, Ll/ۗۜܽ;

    invoke-direct {v1, v3}, Ll/ۗۜܽ;-><init>([B)V

    invoke-virtual {v1, v4}, Ll/ۗۜܽ;->᩻(I)Ll/ۛۜܽ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩸ܽܽ;->֫(Ll/ۛۜܽ;)V

    const/4 v1, 0x0

    .line 798
    iput-object v1, v0, Ll/᩸ܽܽ;->᩶:[B

    .line 799
    invoke-direct/range {p0 .. p0}, Ll/᩸ܽܽ;->ܿ()[B

    move-result-object v2

    .line 800
    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;)V

    .line 801
    iput-object v1, v0, Ll/᩸ܽܽ;->᩶:[B

    .line 802
    invoke-direct/range {p0 .. p0}, Ll/᩸ܽܽ;->ܿ()[B

    move-result-object v1

    invoke-static {v2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_6d

    goto :goto_10

    :cond_6d
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6e
    :goto_10
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7d098225 -> :sswitch_38
        -0x7c939a53 -> :sswitch_37
        -0x6082de93 -> :sswitch_36
        -0x54334c0f -> :sswitch_35
        -0x4e8b47ee -> :sswitch_34
        -0x4bf67c97 -> :sswitch_33
        -0x488ff650 -> :sswitch_32
        -0x47e6e581 -> :sswitch_31
        -0x46bf4163 -> :sswitch_30
        -0x3e84b63d -> :sswitch_2f
        -0x3dfc8ccb -> :sswitch_2e
        -0x3df94319 -> :sswitch_2d
        -0x386fd0e8 -> :sswitch_2c
        -0x36c737ba -> :sswitch_2b
        -0x35a76b37 -> :sswitch_2a
        -0x3553a6e3 -> :sswitch_29
        -0x3527652e -> :sswitch_28
        -0x2ef8ad89 -> :sswitch_27
        -0x2d1aba3d -> :sswitch_26
        -0x2c6ea50b -> :sswitch_25
        -0xf8aea7b -> :sswitch_24
        -0x2e218f1 -> :sswitch_23
        0x17fd4 -> :sswitch_22
        0x2efe99 -> :sswitch_21
        0x2f25af -> :sswitch_20
        0x30cbf5 -> :sswitch_1f
        0x3291eb -> :sswitch_1e
        0x329d71 -> :sswitch_1d
        0x32c67c -> :sswitch_1c
        0x3311d0 -> :sswitch_1b
        0x349881 -> :sswitch_1a
        0x288b9cd -> :sswitch_19
        0x2cad89e -> :sswitch_18
        0x61fbb3b -> :sswitch_17
        0x6210372 -> :sswitch_16
        0x62119f2 -> :sswitch_15
        0x6262ae2 -> :sswitch_14
        0x63f6418 -> :sswitch_13
        0x64213fc -> :sswitch_12
        0x64237c2 -> :sswitch_11
        0x67ab18e -> :sswitch_10
        0x6879507 -> :sswitch_f
        0x699cf9b -> :sswitch_e
        0x6bac4cf -> :sswitch_d
        0x6bdbb5b -> :sswitch_c
        0x6cbd06d -> :sswitch_b
        0xd095cac -> :sswitch_a
        0x1637bf6a -> :sswitch_9
        0x1ef8081e -> :sswitch_8
        0x2b47a08d -> :sswitch_7
        0x2b8659ca -> :sswitch_6
        0x2dfb849e -> :sswitch_5
        0x5ec68525 -> :sswitch_4
        0x5f01d29b -> :sswitch_3
        0x639c4b78 -> :sswitch_2
        0x7eeccfcf -> :sswitch_1
        0x7eee421e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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

    :sswitch_data_1
    .sparse-switch
        -0x3fad5732 -> :sswitch_3c
        -0x1b9cddcc -> :sswitch_3b
        -0x8fece64 -> :sswitch_3a
        0x4a02ccab -> :sswitch_39
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;[C)V
    .locals 3

    .line 2315
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    array-length v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    .line 2316
    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([CC)V

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2318
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    aput-char v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(Ll/ۛۜܽ;)V
    .locals 9

    .line 327
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_11

    const/16 v2, 0xff

    if-le v0, v2, :cond_0

    .line 333
    iget-object v0, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v0, v0, Ll/ۤܽܽ;->᩸:I

    invoke-virtual {p1}, Ll/ۛۜܽ;->֫()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_0
    add-int/lit8 v3, v0, -0x4

    .line 335
    new-array v3, v3, [B

    .line 337
    :try_start_0
    invoke-virtual {p1, v3}, Ll/ۛۜܽ;->֫([B)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 344
    new-instance p1, Ll/۬ۜܽ;

    invoke-direct {p1, v3}, Ll/۬ۜܽ;-><init>([B)V

    .line 345
    invoke-virtual {p1}, Ll/۬ۜܽ;->readShort()S

    move-result v3

    iput-short v3, p0, Ll/᩸ܽܽ;->ܽ֫:S

    .line 346
    invoke-virtual {p1}, Ll/۬ۜܽ;->readShort()S

    move-result v3

    iput-short v3, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    const/16 v3, 0x30

    const/16 v4, 0xc

    const/4 v5, 0x2

    if-lt v0, v4, :cond_1

    .line 349
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v7

    const/16 v8, 0x61

    invoke-static {v6, v7, v8}, Ll/᩸ܽܽ;->֫(BBC)[C

    move-result-object v6

    iput-object v6, p0, Ll/᩸ܽܽ;->ۨ:[C

    .line 350
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v7

    invoke-static {v6, v7, v3}, Ll/᩸ܽܽ;->֫(BBC)[C

    move-result-object v6

    iput-object v6, p0, Ll/᩸ܽܽ;->᩹:[C

    goto :goto_0

    :cond_1
    new-array v6, v5, [C

    .line 352
    iput-object v6, p0, Ll/᩸ܽܽ;->ۨ:[C

    new-array v6, v5, [C

    .line 353
    iput-object v6, p0, Ll/᩸ܽܽ;->᩹:[C

    :goto_0
    const/16 v6, 0xe

    if-lt v0, v6, :cond_2

    .line 357
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    iput-byte v6, p0, Ll/᩸ܽܽ;->᩻֫:B

    .line 358
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    iput-byte v6, p0, Ll/᩸ܽܽ;->֨֫:B

    :cond_2
    const/16 v6, 0x10

    if-lt v0, v6, :cond_3

    .line 362
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v6

    iput v6, p0, Ll/᩸ܽܽ;->ۙ:I

    :cond_3
    const/16 v6, 0x1c

    if-lt v0, v6, :cond_4

    .line 366
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    iput-byte v6, p0, Ll/᩸ܽܽ;->ۛ:B

    .line 367
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    iput-byte v6, p0, Ll/᩸ܽܽ;->ܳ֫:B

    .line 368
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    iput-byte v6, p0, Ll/᩸ܽܽ;->ۤ:B

    .line 369
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    iput-byte v6, p0, Ll/᩸ܽܽ;->۫:B

    .line 371
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v6

    iput v6, p0, Ll/᩸ܽܽ;->ۘ֫:I

    .line 372
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v6

    iput v6, p0, Ll/᩸ܽܽ;->ۢ֫:I

    .line 374
    invoke-virtual {p1}, Ll/۬ۜܽ;->readShort()S

    move-result v6

    iput-short v6, p0, Ll/᩸ܽܽ;->᩵֫:S

    .line 376
    invoke-virtual {p1, v5}, Ll/۬ۜܽ;->skipBytes(I)V

    :cond_4
    const/16 v5, 0x20

    if-lt v0, v5, :cond_5

    .line 380
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v5

    iput-byte v5, p0, Ll/᩸ܽܽ;->ܺ֫:B

    .line 381
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v5

    iput-byte v5, p0, Ll/᩸ܽܽ;->۠֫:B

    .line 382
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v5

    iput v5, p0, Ll/᩸ܽܽ;->֡֫:I

    :cond_5
    const/16 v5, 0x24

    if-lt v0, v5, :cond_6

    .line 386
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v5

    iput v5, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    .line 387
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v5

    iput v5, p0, Ll/᩸ܽܽ;->ۡ֫:I

    :cond_6
    const/4 v5, 0x0

    if-lt v0, v3, :cond_9

    const/4 v3, 0x4

    new-array v6, v3, [C

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v3, :cond_7

    .line 1277
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v8

    int-to-char v8, v8

    aput-char v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 391
    :cond_7
    iput-object v6, p0, Ll/᩸ܽܽ;->۟:[C

    new-array v3, v1, [C

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v1, :cond_8

    .line 1277
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v7

    int-to-char v7, v7

    aput-char v7, v3, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 392
    :cond_8
    iput-object v3, p0, Ll/᩸ܽܽ;->ۧ֫:[C

    :cond_9
    const/16 v3, 0x34

    if-lt v0, v3, :cond_a

    .line 396
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    iput-byte v6, p0, Ll/᩸ܽܽ;->ۖ֫:B

    .line 397
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    iput-byte v6, p0, Ll/᩸ܽܽ;->᩸:B

    .line 398
    invoke-virtual {p1}, Ll/۬ۜܽ;->readShort()S

    move-result v6

    iput-short v6, p0, Ll/᩸ܽܽ;->᩷֫:S

    .line 401
    :cond_a
    iget-object v6, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    sget-object v7, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    if-ne v6, v7, :cond_c

    if-le v0, v3, :cond_c

    const/16 v3, 0x4c

    if-lt v0, v3, :cond_b

    .line 403
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    iput v3, p0, Ll/᩸ܽܽ;->ۚ֫:I

    .line 404
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    iput v3, p0, Ll/᩸ܽܽ;->۬:I

    .line 405
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    iput v3, p0, Ll/᩸ܽܽ;->ܿ֫:I

    goto :goto_3

    .line 402
    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Truncated Motorola config"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 407
    :cond_c
    :goto_3
    iget-object v3, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v3, v3, Ll/ۤܽܽ;->᩸:I

    sub-int/2addr v3, v4

    if-le v0, v3, :cond_e

    .line 410
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v4

    iput-byte v4, p0, Ll/᩸ܽܽ;->֫֫:B

    const/4 v4, 0x0

    :goto_4
    sub-int v6, v0, v3

    add-int/lit8 v7, v6, -0x1

    .line 411
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    if-ge v4, v7, :cond_d

    .line 412
    iget-object v6, p0, Ll/᩸ܽܽ;->ܰ:[C

    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v7

    and-int/2addr v7, v2

    int-to-char v7, v7

    aput-char v7, v6, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_d
    const/4 v1, 0x0

    :goto_5
    add-int/lit8 v2, v6, -0x9

    const/4 v3, 0x3

    .line 414
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_e

    .line 415
    iget-object v2, p0, Ll/᩸ܽܽ;->ۗ:[B

    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v3

    aput-byte v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 419
    :cond_e
    iget-object v1, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v1, v1, Ll/ۤܽܽ;->᩸:I

    sub-int/2addr v0, v1

    if-lez v0, :cond_10

    .line 421
    new-array v1, v0, [B

    .line 61
    invoke-virtual {p1, v0, v1}, Ll/۬ۜܽ;->֫(I[B)V

    :goto_6
    if-ge v5, v0, :cond_10

    .line 842
    aget-byte p1, v1, v5

    if-eqz p1, :cond_f

    .line 424
    iput-object v1, p0, Ll/᩸ܽܽ;->ܶ֫:[B

    return-void

    :cond_f
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :catch_0
    :cond_10
    return-void

    .line 329
    :cond_11
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Config size = "

    const-string v2, " is too small"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 329
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫([B[CC)V
    .locals 5

    .line 1256
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    .line 1257
    aget-char p2, p1, v2

    int-to-byte p2, p2

    aput-byte p2, p0, v2

    .line 1258
    aget-char p1, p1, v1

    int-to-byte p1, p1

    aput-byte p1, p0, v1

    return-void

    .line 1259
    :cond_0
    array-length v0, p1

    const/4 v4, 0x3

    if-ne v0, v4, :cond_1

    .line 1260
    aget-char v0, p1, v2

    sub-int/2addr v0, p2

    and-int/lit8 v0, v0, 0x1f

    .line 1261
    aget-char v4, p1, v1

    sub-int/2addr v4, p2

    and-int/lit8 v4, v4, 0x1f

    .line 1262
    aget-char p1, p1, v3

    sub-int/2addr p1, p2

    and-int/lit8 p1, p1, 0x1f

    shl-int/lit8 p1, p1, 0xa

    const p2, 0x8000

    or-int/2addr p1, p2

    shl-int/lit8 p2, v4, 0x5

    or-int/2addr p1, p2

    or-int/2addr p1, v0

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    .line 1267
    aput-byte p2, p0, v2

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 1268
    aput-byte p1, p0, v1

    return-void

    .line 1270
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method

.method public static ֫([C[C)Z
    .locals 3

    const/4 v0, 0x0

    .line 2368
    aget-char v1, p0, v0

    aget-char v2, p1, v0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    aget-char p0, p0, v1

    aget-char p1, p1, v1

    if-ne p0, p1, :cond_0

    return v1

    :cond_0
    return v0
.end method

.method public static ֫(BBC)[C
    .locals 6

    shr-int/lit8 v0, p0, 0x7

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v0, v1, :cond_0

    and-int/lit8 v0, p1, 0x1f

    and-int/lit16 p1, p1, 0xe0

    shr-int/lit8 p1, p1, 0x5

    and-int/lit8 v4, p0, 0x3

    const/4 v5, 0x3

    shl-int/2addr v4, v5

    add-int/2addr p1, v4

    and-int/lit8 p0, p0, 0x7c

    shr-int/2addr p0, v3

    add-int/2addr v0, p2

    int-to-char v0, v0

    add-int/2addr p1, p2

    int-to-char p1, p1

    add-int/2addr p0, p2

    int-to-char p0, p0

    new-array p2, v5, [C

    aput-char v0, p2, v2

    aput-char p1, p2, v1

    aput-char p0, p2, v3

    return-object p2

    :cond_0
    int-to-char p0, p0

    int-to-char p1, p1

    new-array p2, v3, [C

    aput-char p0, p2, v2

    aput-char p1, p2, v1

    return-object p2
.end method

.method private ۖ()I
    .locals 2

    .line 2348
    iget-short v0, p0, Ll/᩸ܽܽ;->᩵֫:S

    const v1, 0xffff

    and-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0x10

    return v0
.end method

.method private ۜ()I
    .locals 2

    .line 2344
    iget-byte v0, p0, Ll/᩸ܽܽ;->ۛ:B

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    iget-byte v1, p0, Ll/᩸ܽܽ;->ܳ֫:B

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    iget-byte v1, p0, Ll/᩸ܽܽ;->ۤ:B

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    return v0
.end method

.method private ۡ()I
    .locals 3

    .line 2336
    iget v0, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    const v1, 0xffff

    and-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0x10

    iget v2, p0, Ll/᩸ܽܽ;->ۡ֫:I

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    return v0
.end method

.method private ۢ()I
    .locals 3

    .line 2356
    iget v0, p0, Ll/᩸ܽܽ;->ۘ֫:I

    const v1, 0xffff

    and-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0x10

    iget v2, p0, Ll/᩸ܽܽ;->ۢ֫:I

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    return v0
.end method

.method public static ۧ(Ljava/lang/String;)I
    .locals 3

    .line 882
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    const v1, 0xffff

    if-gt v0, v1, :cond_0

    return v0

    .line 884
    :cond_0
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "Value out of range. Value:\""

    const-string v2, "\""

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 884
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ([C)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 860
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_4

    aget-char v2, p0, v1

    if-eqz v2, :cond_4

    const/16 v3, 0x61

    if-lt v2, v3, :cond_0

    const/16 v3, 0x7a

    if-le v2, v3, :cond_2

    :cond_0
    const/16 v3, 0x41

    if-lt v2, v3, :cond_1

    const/16 v3, 0x5a

    if-le v2, v3, :cond_2

    :cond_1
    const/16 v3, 0x30

    if-lt v2, v3, :cond_3

    const/16 v3, 0x39

    if-le v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0

    :cond_4
    const/4 v2, 0x3

    if-lt v1, v2, :cond_8

    const/16 v2, 0x8

    if-le v1, v2, :cond_5

    goto :goto_3

    .line 870
    :cond_5
    :goto_2
    array-length v2, p0

    if-ge v1, v2, :cond_7

    .line 871
    aget-char v2, p0, v1

    if-eqz v2, :cond_6

    return v0

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    const/4 p0, 0x1

    return p0

    :cond_8
    :goto_3
    return v0
.end method

.method public static ۧ([C[C)Z
    .locals 3

    .line 2361
    invoke-static {p0, p1}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2362
    sget-object v0, Ll/᩸ܽܽ;->۫֫:[C

    invoke-static {p0, v0}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v1

    sget-object v2, Ll/᩸ܽܽ;->۬֫:[C

    if-eqz v1, :cond_0

    invoke-static {p1, v2}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v1

    if-nez v1, :cond_2

    .line 2363
    :cond_0
    invoke-static {p0, v2}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {p1, v0}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ܳ()I
    .locals 3

    .line 2323
    iget-short v0, p0, Ll/᩸ܽܽ;->ܽ֫:S

    const v1, 0xffff

    and-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0x10

    iget-short v2, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    return v0
.end method

.method private ܺ()I
    .locals 3

    .line 2340
    iget-byte v0, p0, Ll/᩸ܽܽ;->᩻֫:B

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    iget-byte v1, p0, Ll/᩸ܽܽ;->֨֫:B

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    iget v1, p0, Ll/᩸ܽܽ;->ۙ:I

    const v2, 0xffff

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    return v0
.end method

.method public static ܽ(Ljava/lang/String;)I
    .locals 5

    .line 831
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    .line 832
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 833
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-lt v1, v2, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x39

    if-gt v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 834
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid unsigned config field: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 836
    :cond_1
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    long-to-int p0, v0

    return p0

    .line 837
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Config field overflow: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 831
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Empty unsigned config field"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܽ([C)Z
    .locals 4

    .line 850
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-char v3, p0, v2

    if-eqz v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private ܿ()[B
    .locals 13

    .line 151
    iget-object v0, p0, Ll/᩸ܽܽ;->᩶:[B

    if-eqz v0, :cond_0

    return-object v0

    .line 155
    :cond_0
    iget-object v0, p0, Ll/᩸ܽܽ;->ܶ֫:[B

    const/16 v1, 0x34

    const/16 v2, 0x24

    const/16 v3, 0x20

    iget-object v4, p0, Ll/᩸ܽܽ;->ۗ:[B

    const/16 v5, 0x30

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    .line 156
    iget-object v7, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v7, v7, Ll/ۤܽܽ;->᩸:I

    array-length v0, v0

    add-int/2addr v7, v0

    goto/16 :goto_6

    .line 158
    :cond_1
    iget v0, p0, Ll/᩸ܽܽ;->ۚ֫:I

    if-nez v0, :cond_c

    iget v0, p0, Ll/᩸ܽܽ;->۬:I

    if-nez v0, :cond_c

    iget v0, p0, Ll/᩸ܽܽ;->ܿ֫:I

    if-nez v0, :cond_c

    iget-byte v0, p0, Ll/᩸ܽܽ;->֫֫:B

    if-nez v0, :cond_c

    iget-object v0, p0, Ll/᩸ܽܽ;->ܰ:[C

    .line 159
    invoke-static {v0}, Ll/᩸ܽܽ;->ܽ([C)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 842
    array-length v0, v4

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v0, :cond_3

    aget-byte v8, v4, v7

    if-eqz v8, :cond_2

    goto :goto_5

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 161
    :cond_3
    iget-byte v0, p0, Ll/᩸ܽܽ;->ۖ֫:B

    if-nez v0, :cond_b

    iget-byte v0, p0, Ll/᩸ܽܽ;->᩸:B

    if-nez v0, :cond_b

    iget-short v0, p0, Ll/᩸ܽܽ;->᩷֫:S

    if-eqz v0, :cond_4

    goto :goto_4

    .line 164
    :cond_4
    iget-object v0, p0, Ll/᩸ܽܽ;->۟:[C

    invoke-static {v0}, Ll/᩸ܽܽ;->ܽ([C)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Ll/᩸ܽܽ;->ۧ֫:[C

    invoke-static {v0}, Ll/᩸ܽܽ;->ܽ([C)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    .line 166
    :cond_5
    iget v0, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    if-nez v0, :cond_9

    iget v0, p0, Ll/᩸ܽܽ;->ۡ֫:I

    if-eqz v0, :cond_6

    goto :goto_2

    .line 168
    :cond_6
    iget-byte v0, p0, Ll/᩸ܽܽ;->ܺ֫:B

    if-nez v0, :cond_8

    iget-byte v0, p0, Ll/᩸ܽܽ;->۠֫:B

    if-nez v0, :cond_8

    iget v0, p0, Ll/᩸ܽܽ;->֡֫:I

    if-eqz v0, :cond_7

    goto :goto_1

    :cond_7
    const/16 v7, 0x1c

    goto :goto_6

    :cond_8
    :goto_1
    const/16 v7, 0x20

    goto :goto_6

    :cond_9
    :goto_2
    const/16 v7, 0x24

    goto :goto_6

    :cond_a
    :goto_3
    const/16 v7, 0x30

    goto :goto_6

    :cond_b
    :goto_4
    const/16 v7, 0x34

    goto :goto_6

    .line 160
    :cond_c
    :goto_5
    iget-object v0, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v7, v0, Ll/ۤܽܽ;->᩸:I

    .line 173
    :goto_6
    new-instance v0, Ll/ۤۜܽ;

    add-int/lit8 v8, v7, -0x4

    invoke-direct {v0, v8}, Ll/ۤۜܽ;-><init>(I)V

    .line 174
    iget-short v9, p0, Ll/᩸ܽܽ;->ܽ֫:S

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->֫(S)V

    .line 175
    iget-short v9, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->֫(S)V

    const/4 v9, 0x2

    new-array v10, v9, [B

    .line 178
    iget-object v11, p0, Ll/᩸ܽܽ;->ۨ:[C

    const/16 v12, 0x61

    invoke-static {v10, v11, v12}, Ll/᩸ܽܽ;->֫([B[CC)V

    .line 44
    invoke-virtual {v0, v10, v6, v9}, Ll/ۤۜܽ;->write([BII)V

    .line 180
    iget-object v11, p0, Ll/᩸ܽܽ;->᩹:[C

    invoke-static {v10, v11, v5}, Ll/᩸ܽܽ;->֫([B[CC)V

    .line 44
    invoke-virtual {v0, v10, v6, v9}, Ll/ۤۜܽ;->write([BII)V

    .line 183
    iget-byte v9, p0, Ll/᩸ܽܽ;->᩻֫:B

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->writeByte(I)V

    .line 184
    iget-byte v9, p0, Ll/᩸ܽܽ;->֨֫:B

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->writeByte(I)V

    .line 185
    iget v9, p0, Ll/᩸ܽܽ;->ۙ:I

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->ۡ(I)V

    .line 187
    iget-byte v9, p0, Ll/᩸ܽܽ;->ۛ:B

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->writeByte(I)V

    .line 188
    iget-byte v9, p0, Ll/᩸ܽܽ;->ܳ֫:B

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->writeByte(I)V

    .line 189
    iget-byte v9, p0, Ll/᩸ܽܽ;->ۤ:B

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->writeByte(I)V

    .line 190
    iget-byte v9, p0, Ll/᩸ܽܽ;->۫:B

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->writeByte(I)V

    .line 191
    iget v9, p0, Ll/᩸ܽܽ;->ۘ֫:I

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->ۡ(I)V

    .line 192
    iget v9, p0, Ll/᩸ܽܽ;->ۢ֫:I

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->ۡ(I)V

    .line 194
    iget-short v9, p0, Ll/᩸ܽܽ;->᩵֫:S

    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->֫(S)V

    .line 195
    invoke-virtual {v0, v6}, Ll/ۤۜܽ;->֫(S)V

    if-lt v7, v3, :cond_d

    .line 198
    iget-byte v3, p0, Ll/᩸ܽܽ;->ܺ֫:B

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    .line 199
    iget-byte v3, p0, Ll/᩸ܽܽ;->۠֫:B

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    .line 200
    iget v3, p0, Ll/᩸ܽܽ;->֡֫:I

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->ۡ(I)V

    :cond_d
    if-lt v7, v2, :cond_e

    .line 204
    iget v2, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 205
    iget v2, p0, Ll/᩸ܽܽ;->ۡ֫:I

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->ۡ(I)V

    :cond_e
    if-lt v7, v5, :cond_11

    const/16 v2, 0xc

    new-array v3, v2, [B

    const/4 v5, 0x0

    :goto_7
    const/4 v9, 0x4

    if-ge v5, v9, :cond_f

    .line 211
    iget-object v9, p0, Ll/᩸ܽܽ;->۟:[C

    aget-char v9, v9, v5

    int-to-byte v9, v9

    aput-byte v9, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_f
    const/4 v5, 0x0

    :goto_8
    const/16 v9, 0x8

    if-ge v5, v9, :cond_10

    add-int/lit8 v9, v5, 0x4

    .line 214
    iget-object v10, p0, Ll/᩸ܽܽ;->ۧ֫:[C

    aget-char v10, v10, v5

    int-to-byte v10, v10

    aput-byte v10, v3, v9

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    .line 44
    :cond_10
    invoke-virtual {v0, v3, v6, v2}, Ll/ۤۜܽ;->write([BII)V

    :cond_11
    if-lt v7, v1, :cond_12

    .line 220
    iget-byte v1, p0, Ll/᩸ܽܽ;->ۖ֫:B

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 221
    iget-byte v1, p0, Ll/᩸ܽܽ;->᩸:B

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 222
    iget-short v1, p0, Ll/᩸ܽܽ;->᩷֫:S

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(S)V

    .line 224
    :cond_12
    iget-object v1, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    sget-object v2, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    if-ne v1, v2, :cond_13

    iget v1, v1, Ll/ۤܽܽ;->᩸:I

    if-lt v7, v1, :cond_13

    .line 225
    iget v1, p0, Ll/᩸ܽܽ;->ۚ֫:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 226
    iget v1, p0, Ll/᩸ܽܽ;->۬:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 227
    iget v1, p0, Ll/᩸ܽܽ;->ܿ֫:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 230
    :cond_13
    iget-object v1, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v1, v1, Ll/ۤܽܽ;->᩸:I

    if-lt v7, v1, :cond_15

    .line 231
    iget-byte v1, p0, Ll/᩸ܽܽ;->֫֫:B

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 232
    iget-object v1, p0, Ll/᩸ܽܽ;->ܰ:[C

    array-length v2, v1

    :goto_9
    if-ge v6, v2, :cond_14

    aget-char v3, v1, v6

    int-to-byte v3, v3

    .line 233
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    .line 235
    :cond_14
    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->write([B)V

    .line 238
    :cond_15
    iget-object v1, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v1, v1, Ll/ۤܽܽ;->᩸:I

    if-le v7, v1, :cond_16

    .line 239
    iget-object v1, p0, Ll/᩸ܽܽ;->ܶ֫:[B

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->write([B)V

    .line 241
    :cond_16
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    iput-object v0, p0, Ll/᩸ܽܽ;->᩶:[B

    .line 242
    array-length v1, v0

    if-ne v1, v8, :cond_17

    return-object v0

    .line 243
    :cond_17
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method private ᩷()I
    .locals 4

    .line 2327
    iget-object v0, p0, Ll/᩸ܽܽ;->ۨ:[C

    const/4 v1, 0x0

    aget-char v2, v0, v1

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x18

    const/4 v3, 0x1

    aget-char v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v2

    iget-object v2, p0, Ll/᩸ܽܽ;->᩹:[C

    aget-char v1, v2, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    aget-char v1, v2, v3

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1540
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ܽܽ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 1542
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1521
    :cond_0
    const-class v1, Ll/᩸ܽܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    return v0

    .line 1524
    :cond_1
    check-cast p1, Ll/᩸ܽܽ;

    .line 1525
    iget-object v1, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget-object v2, p1, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    if-ne v1, v2, :cond_2

    iget-byte v1, p0, Ll/᩸ܽܽ;->֫֫:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->֫֫:B

    if-ne v1, v2, :cond_2

    .line 1526
    invoke-virtual {p0}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1531
    iget-object v0, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Ll/᩸ܽܽ;->֫֫:B

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1532
    invoke-virtual {p0}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1509
    invoke-virtual {p0}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 1513
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0

    :cond_1
    const-string v0, "[DEFAULT]"

    return-object v0
.end method

.method public final ֫(Ll/᩸ܽܽ;)I
    .locals 10

    .line 256
    invoke-direct {p0}, Ll/᩸ܽܽ;->ܿ()[B

    move-result-object v0

    .line 257
    invoke-direct {p1}, Ll/᩸ܽܽ;->ܿ()[B

    move-result-object v1

    const/4 v2, 0x4

    .line 258
    invoke-static {v2, v2, v0, v1}, Ll/᩸ܽܽ;->֫(II[B[B)I

    move-result v3

    if-eqz v3, :cond_0

    return v3

    :cond_0
    const/16 v3, 0x8

    .line 260
    invoke-static {v3, v2, v0, v1}, Ll/᩸ܽܽ;->֫(II[B[B)I

    move-result v4

    if-eqz v4, :cond_1

    return v4

    :cond_1
    const/16 v4, 0x24

    :goto_0
    const/16 v5, 0x28

    const/4 v6, 0x0

    if-ge v4, v5, :cond_5

    .line 264
    iget-byte v5, p0, Ll/᩸ܽܽ;->֫֫:B

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_1

    :cond_2
    invoke-static {v4, v0}, Ll/᩸ܽܽ;->֫(I[B)I

    move-result v5

    .line 265
    :goto_1
    iget-byte v7, p1, Ll/᩸ܽܽ;->֫֫:B

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v4, v1}, Ll/᩸ܽܽ;->֫(I[B)I

    move-result v6

    .line 266
    :goto_2
    invoke-static {v5, v6}, Ljava/lang/Integer;->compare(II)I

    move-result v5

    if-eqz v5, :cond_4

    return v5

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_7

    add-int v7, v5, v4

    .line 310
    invoke-static {v7, v0}, Ll/᩸ܽܽ;->֫(I[B)I

    move-result v8

    invoke-static {v7, v1}, Ll/᩸ܽܽ;->֫(I[B)I

    move-result v7

    invoke-static {v8, v7}, Ljava/lang/Integer;->compare(II)I

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    const/4 v7, 0x0

    :goto_4
    if-eqz v7, :cond_8

    return v7

    :cond_8
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_5
    if-ge v4, v3, :cond_9

    if-nez v5, :cond_9

    .line 274
    iget-object v5, p0, Ll/᩸ܽܽ;->ܰ:[C

    aget-char v5, v5, v4

    iget-object v7, p1, Ll/᩸ܽܽ;->ܰ:[C

    aget-char v7, v7, v4

    invoke-static {v5, v7}, Ljava/lang/Integer;->compare(II)I

    move-result v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_9
    if-eqz v5, :cond_a

    return v5

    .line 277
    :cond_a
    sget-object v3, Ll/᩸ܽܽ;->ۙ֫:[[I

    array-length v4, v3

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v4, :cond_c

    aget-object v7, v3, v5

    .line 278
    aget v8, v7, v6

    const/4 v9, 0x1

    aget v7, v7, v9

    invoke-static {v8, v7, v0, v1}, Ll/᩸ܽܽ;->֫(II[B[B)I

    move-result v7

    if-eqz v7, :cond_b

    return v7

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 281
    :cond_c
    iget-object v3, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    iget-object p1, p1, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {v3, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    if-eqz p1, :cond_d

    return p1

    .line 283
    :cond_d
    iget-object p1, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    sget-object v3, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    if-ne p1, v3, :cond_f

    const/16 p1, 0x34

    :goto_7
    const/16 v3, 0x40

    if-ge p1, v3, :cond_f

    .line 285
    invoke-static {p1, v2, v0, v1}, Ll/᩸ܽܽ;->֫(II[B[B)I

    move-result v3

    if-eqz v3, :cond_e

    return v3

    :cond_e
    add-int/lit8 p1, p1, 0x4

    goto :goto_7

    :cond_f
    return v6
.end method

.method public final ֫()Ll/ۤܽܽ;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    return-object v0
.end method

.method public final ֫(Ll/ۙۜܽ;)V
    .locals 2

    .line 321
    invoke-direct {p0}, Ll/᩸ܽܽ;->ܿ()[B

    move-result-object v0

    .line 322
    array-length v1, v0

    add-int/lit8 v1, v1, 0x4

    invoke-interface {p1, v1}, Ll/ۙۜܽ;->writeInt(I)V

    .line 323
    invoke-interface {p1, v0}, Ll/ۙۜܽ;->write([B)V

    return-void
.end method

.method public final ֫(Ll/᩸ܽܽ;Ll/᩸ܽܽ;)Z
    .locals 9

    .line 1548
    invoke-direct {p0}, Ll/᩸ܽܽ;->ܳ()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p1}, Ll/᩸ܽܽ;->ܳ()I

    move-result v0

    if-eqz v0, :cond_2

    .line 1549
    :goto_0
    iget-short v0, p0, Ll/᩸ܽܽ;->ܽ֫:S

    iget-short v3, p1, Ll/᩸ܽܽ;->ܽ֫:S

    if-eq v0, v3, :cond_1

    iget-short v3, p2, Ll/᩸ܽܽ;->ܽ֫:S

    if-eqz v3, :cond_1

    if-eqz v0, :cond_6f

    goto/16 :goto_3b

    .line 1553
    :cond_1
    iget-short v0, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    iget-short v3, p1, Ll/᩸ܽܽ;->ᩳ֫:S

    if-eq v0, v3, :cond_2

    iget-short v3, p2, Ll/᩸ܽܽ;->ᩳ֫:S

    if-eqz v3, :cond_2

    if-eqz v0, :cond_6f

    goto/16 :goto_3b

    .line 1949
    :cond_2
    invoke-direct {p2}, Ll/᩸ܽܽ;->᩷()I

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_2

    .line 1955
    :cond_3
    invoke-direct {p0}, Ll/᩸ܽܽ;->᩷()I

    move-result v0

    if-nez v0, :cond_4

    invoke-direct {p1}, Ll/᩸ܽܽ;->᩷()I

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_2

    .line 1971
    :cond_4
    iget-object v0, p0, Ll/᩸ܽܽ;->ۨ:[C

    iget-object v3, p1, Ll/᩸ܽܽ;->ۨ:[C

    invoke-static {v0, v3}, Ll/᩸ܽܽ;->ۧ([C[C)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1983
    iget-object v0, p2, Ll/᩸ܽܽ;->ۨ:[C

    sget-object v3, Ll/᩸ܽܽ;->ۗ֫:[C

    invoke-static {v0, v3}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1984
    iget-object v0, p2, Ll/᩸ܽܽ;->᩹:[C

    sget-object v3, Ll/᩸ܽܽ;->ۤ֫:[C

    invoke-static {v0, v3}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1988
    iget-object v0, p0, Ll/᩸ܽܽ;->ۨ:[C

    aget-char v0, v0, v2

    if-eqz v0, :cond_5

    .line 1989
    iget-object v0, p0, Ll/᩸ܽܽ;->᩹:[C

    aget-char v4, v0, v2

    if-eqz v4, :cond_c

    invoke-static {v0, v3}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v0

    if-eqz v0, :cond_d

    goto/16 :goto_1

    .line 1991
    :cond_5
    iget-object v0, p1, Ll/᩸ܽܽ;->᩹:[C

    aget-char v4, v0, v2

    if-eqz v4, :cond_d

    invoke-static {v0, v3}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_1

    .line 1993
    :cond_6
    iget-object v0, p2, Ll/᩸ܽܽ;->᩹:[C

    invoke-static {v0}, Ll/۠ۜܽ;->֫([C)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1994
    iget-object v0, p0, Ll/᩸ܽܽ;->ۨ:[C

    aget-char v0, v0, v2

    if-eqz v0, :cond_7

    .line 1995
    iget-object v0, p0, Ll/᩸ܽܽ;->᩹:[C

    invoke-static {v0}, Ll/۠ۜܽ;->֫([C)Z

    move-result v0

    goto :goto_3

    .line 1997
    :cond_7
    iget-object v0, p1, Ll/᩸ܽܽ;->᩹:[C

    invoke-static {v0}, Ll/۠ۜܽ;->֫([C)Z

    move-result v0

    xor-int/2addr v0, v1

    goto :goto_3

    .line 2001
    :cond_8
    iget-object v0, p0, Ll/᩸ܽܽ;->ۨ:[C

    aget-char v0, v0, v2

    if-eqz v0, :cond_d

    goto :goto_1

    .line 2014
    :cond_9
    iget-object v0, p0, Ll/᩸ܽܽ;->᩹:[C

    iget-object v3, p1, Ll/᩸ܽܽ;->᩹:[C

    iget-object v4, p2, Ll/᩸ܽܽ;->ۨ:[C

    iget-object v5, p2, Ll/᩸ܽܽ;->۟:[C

    .line 2016
    invoke-static {v5}, Ll/᩸ܽܽ;->֫([C)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p2, Ll/᩸ܽܽ;->᩹:[C

    .line 2014
    invoke-static {v0, v3, v4, v5, v6}, Ll/۠ۜܽ;->֫([C[C[CLjava/lang/String;[C)I

    move-result v0

    if-eqz v0, :cond_a

    if-lez v0, :cond_d

    goto :goto_1

    .line 2022
    :cond_a
    iget-object v0, p0, Ll/᩸ܽܽ;->ۧ֫:[C

    iget-object v3, p2, Ll/᩸ܽܽ;->ۧ֫:[C

    invoke-static {v0, v3}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v0

    .line 2023
    iget-object v3, p1, Ll/᩸ܽܽ;->ۧ֫:[C

    iget-object v4, p2, Ll/᩸ܽܽ;->ۧ֫:[C

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v3

    if-eq v0, v3, :cond_b

    goto :goto_3

    .line 2043
    :cond_b
    iget-object v0, p0, Ll/᩸ܽܽ;->ۨ:[C

    iget-object v3, p2, Ll/᩸ܽܽ;->ۨ:[C

    invoke-static {v0, v3}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p1, Ll/᩸ܽܽ;->ۨ:[C

    iget-object v3, p2, Ll/᩸ܽܽ;->ۨ:[C

    .line 2044
    invoke-static {v0, v3}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    :goto_1
    const/4 v0, 0x1

    goto :goto_3

    :cond_d
    :goto_2
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_e

    goto/16 :goto_3b

    .line 1562
    :cond_e
    iget-byte v0, p0, Ll/᩸ܽܽ;->ܺ֫:B

    if-eqz v0, :cond_f

    const/4 v3, 0x1

    goto :goto_4

    :cond_f
    const/4 v3, 0x0

    :goto_4
    if-nez v3, :cond_11

    iget-byte v3, p1, Ll/᩸ܽܽ;->ܺ֫:B

    if-eqz v3, :cond_10

    const/4 v3, 0x1

    goto :goto_5

    :cond_10
    const/4 v3, 0x0

    :goto_5
    if-eqz v3, :cond_14

    .line 1563
    :cond_11
    iget-byte v3, p1, Ll/᩸ܽܽ;->ܺ֫:B

    xor-int v4, v0, v3

    and-int/lit16 v4, v4, 0xc0

    if-eqz v4, :cond_12

    const/4 v4, 0x1

    goto :goto_6

    :cond_12
    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_14

    iget-byte v4, p2, Ll/᩸ܽܽ;->ܺ֫:B

    and-int/lit16 v4, v4, 0xc0

    if-eqz v4, :cond_13

    const/4 v4, 0x1

    goto :goto_7

    :cond_13
    const/4 v4, 0x0

    :goto_7
    if-eqz v4, :cond_14

    and-int/lit16 p1, v0, 0xc0

    and-int/lit16 p2, v3, 0xc0

    if-le p1, p2, :cond_6f

    goto/16 :goto_3b

    .line 1571
    :cond_14
    iget v0, p0, Ll/᩸ܽܽ;->֡֫:I

    if-eqz v0, :cond_15

    const/4 v3, 0x1

    goto :goto_8

    :cond_15
    const/4 v3, 0x0

    :goto_8
    if-nez v3, :cond_17

    iget v3, p1, Ll/᩸ܽܽ;->֡֫:I

    if-eqz v3, :cond_16

    const/4 v3, 0x1

    goto :goto_9

    :cond_16
    const/4 v3, 0x0

    :goto_9
    if-eqz v3, :cond_18

    .line 1575
    :cond_17
    iget v3, p1, Ll/᩸ܽܽ;->֡֫:I

    if-eq v0, v3, :cond_18

    if-le v0, v3, :cond_6f

    goto/16 :goto_3b

    .line 1580
    :cond_18
    invoke-direct {p0}, Ll/᩸ܽܽ;->ۡ()I

    move-result v0

    if-eqz v0, :cond_19

    const/4 v0, 0x1

    goto :goto_a

    :cond_19
    const/4 v0, 0x0

    :goto_a
    if-nez v0, :cond_1b

    invoke-direct {p1}, Ll/᩸ܽܽ;->ۡ()I

    move-result v0

    if-eqz v0, :cond_1a

    const/4 v0, 0x1

    goto :goto_b

    :cond_1a
    const/4 v0, 0x0

    :goto_b
    if-eqz v0, :cond_20

    .line 1590
    :cond_1b
    iget v0, p2, Ll/᩸ܽܽ;->ᩴ֫:I

    if-eqz v0, :cond_1c

    const/4 v3, 0x1

    goto :goto_c

    :cond_1c
    const/4 v3, 0x0

    :goto_c
    if-eqz v3, :cond_1d

    .line 1591
    iget v3, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    sub-int v3, v0, v3

    .line 1592
    iget v4, p1, Ll/᩸ܽܽ;->ᩴ֫:I

    sub-int/2addr v0, v4

    goto :goto_d

    :cond_1d
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 1594
    :goto_d
    iget v4, p2, Ll/᩸ܽܽ;->ۡ֫:I

    if-eqz v4, :cond_1e

    const/4 v5, 0x1

    goto :goto_e

    :cond_1e
    const/4 v5, 0x0

    :goto_e
    if-eqz v5, :cond_1f

    .line 1595
    iget v5, p0, Ll/᩸ܽܽ;->ۡ֫:I

    sub-int v5, v4, v5

    add-int/2addr v3, v5

    .line 1596
    iget v5, p1, Ll/᩸ܽܽ;->ۡ֫:I

    sub-int/2addr v4, v5

    add-int/2addr v0, v4

    :cond_1f
    if-eq v3, v0, :cond_20

    if-ge v3, v0, :cond_6f

    goto/16 :goto_3b

    .line 1604
    :cond_20
    iget-byte v0, p0, Ll/᩸ܽܽ;->ܺ֫:B

    if-eqz v0, :cond_21

    const/4 v3, 0x1

    goto :goto_f

    :cond_21
    const/4 v3, 0x0

    :goto_f
    const/4 v4, 0x2

    if-nez v3, :cond_23

    iget-byte v3, p1, Ll/᩸ܽܽ;->ܺ֫:B

    if-eqz v3, :cond_22

    const/4 v3, 0x1

    goto :goto_10

    :cond_22
    const/4 v3, 0x0

    :goto_10
    if-eqz v3, :cond_2c

    .line 1605
    :cond_23
    iget-byte v3, p1, Ll/᩸ܽܽ;->ܺ֫:B

    xor-int v5, v0, v3

    and-int/lit8 v6, v5, 0xf

    if-eqz v6, :cond_24

    const/4 v6, 0x1

    goto :goto_11

    :cond_24
    const/4 v6, 0x0

    :goto_11
    if-eqz v6, :cond_2a

    iget-byte v6, p2, Ll/᩸ܽܽ;->ܺ֫:B

    and-int/lit8 v6, v6, 0xf

    if-eqz v6, :cond_25

    const/4 v7, 0x1

    goto :goto_12

    :cond_25
    const/4 v7, 0x0

    :goto_12
    if-eqz v7, :cond_2a

    and-int/lit8 p1, v0, 0xf

    and-int/lit8 p2, v3, 0xf

    if-lt v6, v4, :cond_27

    if-nez p1, :cond_26

    const/4 v0, 0x2

    goto :goto_13

    :cond_26
    move v0, p1

    :goto_13
    if-nez p2, :cond_28

    goto :goto_14

    :cond_27
    move v0, p1

    :cond_28
    move v4, p2

    :goto_14
    if-ne v0, v4, :cond_29

    if-eqz p1, :cond_6f

    goto/16 :goto_3b

    :cond_29
    if-le v0, v4, :cond_6f

    goto/16 :goto_3b

    :cond_2a
    and-int/lit8 v3, v5, 0x30

    if-eqz v3, :cond_2c

    .line 1629
    iget-byte v3, p2, Ll/᩸ܽܽ;->ܺ֫:B

    and-int/lit8 v3, v3, 0x30

    if-eqz v3, :cond_2b

    const/4 v3, 0x1

    goto :goto_15

    :cond_2b
    const/4 v3, 0x0

    :goto_15
    if-eqz v3, :cond_2c

    and-int/lit8 p1, v0, 0x30

    if-eqz p1, :cond_6f

    goto/16 :goto_3b

    .line 1635
    :cond_2c
    iget-byte v0, p0, Ll/᩸ܽܽ;->ۖ֫:B

    if-eqz v0, :cond_2d

    const/4 v3, 0x1

    goto :goto_16

    :cond_2d
    const/4 v3, 0x0

    :goto_16
    if-nez v3, :cond_2f

    iget-byte v3, p1, Ll/᩸ܽܽ;->ۖ֫:B

    if-eqz v3, :cond_2e

    const/4 v3, 0x1

    goto :goto_17

    :cond_2e
    const/4 v3, 0x0

    :goto_17
    if-eqz v3, :cond_31

    .line 1636
    :cond_2f
    iget-byte v3, p1, Ll/᩸ܽܽ;->ۖ֫:B

    xor-int/2addr v3, v0

    and-int/lit8 v3, v3, 0x3

    if-eqz v3, :cond_31

    iget-byte v3, p2, Ll/᩸ܽܽ;->ۖ֫:B

    and-int/lit8 v3, v3, 0x3

    if-eqz v3, :cond_30

    const/4 v3, 0x1

    goto :goto_18

    :cond_30
    const/4 v3, 0x0

    :goto_18
    if-eqz v3, :cond_31

    and-int/lit8 p1, v0, 0x3

    if-eqz p1, :cond_6f

    goto/16 :goto_3b

    .line 1642
    :cond_31
    iget-byte v0, p0, Ll/᩸ܽܽ;->᩸:B

    if-eqz v0, :cond_32

    const/4 v3, 0x1

    goto :goto_19

    :cond_32
    const/4 v3, 0x0

    :goto_19
    if-nez v3, :cond_34

    iget-byte v3, p1, Ll/᩸ܽܽ;->᩸:B

    if-eqz v3, :cond_33

    const/4 v3, 0x1

    goto :goto_1a

    :cond_33
    const/4 v3, 0x0

    :goto_1a
    if-eqz v3, :cond_38

    .line 1643
    :cond_34
    iget-byte v3, p1, Ll/᩸ܽܽ;->᩸:B

    xor-int/2addr v3, v0

    and-int/lit8 v4, v3, 0x3

    if-eqz v4, :cond_36

    iget-byte v4, p2, Ll/᩸ܽܽ;->᩸:B

    and-int/lit8 v4, v4, 0x3

    if-eqz v4, :cond_35

    const/4 v4, 0x1

    goto :goto_1b

    :cond_35
    const/4 v4, 0x0

    :goto_1b
    if-eqz v4, :cond_36

    and-int/lit8 p1, v0, 0x3

    if-eqz p1, :cond_6f

    goto/16 :goto_3b

    :cond_36
    and-int/lit8 v3, v3, 0xc

    if-eqz v3, :cond_38

    .line 1647
    iget-byte v3, p2, Ll/᩸ܽܽ;->᩸:B

    and-int/lit8 v3, v3, 0xc

    if-eqz v3, :cond_37

    const/4 v3, 0x1

    goto :goto_1c

    :cond_37
    const/4 v3, 0x0

    :goto_1c
    if-eqz v3, :cond_38

    and-int/lit8 p1, v0, 0xc

    if-eqz p1, :cond_6f

    goto/16 :goto_3b

    .line 1653
    :cond_38
    iget-byte v0, p0, Ll/᩸ܽܽ;->᩻֫:B

    iget-byte v3, p1, Ll/᩸ܽܽ;->᩻֫:B

    if-eq v0, v3, :cond_3a

    iget-byte v3, p2, Ll/᩸ܽܽ;->᩻֫:B

    if-eqz v3, :cond_39

    const/4 v3, 0x1

    goto :goto_1d

    :cond_39
    const/4 v3, 0x0

    :goto_1d
    if-eqz v3, :cond_3a

    if-eqz v0, :cond_6f

    goto/16 :goto_3b

    .line 1657
    :cond_3a
    iget-byte v0, p0, Ll/᩸ܽܽ;->۠֫:B

    if-eqz v0, :cond_3b

    const/4 v3, 0x1

    goto :goto_1e

    :cond_3b
    const/4 v3, 0x0

    :goto_1e
    if-nez v3, :cond_3d

    iget-byte v3, p1, Ll/᩸ܽܽ;->۠֫:B

    if-eqz v3, :cond_3c

    const/4 v3, 0x1

    goto :goto_1f

    :cond_3c
    const/4 v3, 0x0

    :goto_1f
    if-eqz v3, :cond_41

    .line 1658
    :cond_3d
    iget-byte v3, p1, Ll/᩸ܽܽ;->۠֫:B

    xor-int/2addr v3, v0

    and-int/lit8 v4, v3, 0xf

    if-eqz v4, :cond_3f

    iget-byte v4, p2, Ll/᩸ܽܽ;->۠֫:B

    and-int/lit8 v4, v4, 0xf

    if-eqz v4, :cond_3e

    const/4 v4, 0x1

    goto :goto_20

    :cond_3e
    const/4 v4, 0x0

    :goto_20
    if-eqz v4, :cond_3f

    and-int/lit8 p1, v0, 0xf

    if-eqz p1, :cond_6f

    goto/16 :goto_3b

    :cond_3f
    and-int/lit8 v3, v3, 0x30

    if-eqz v3, :cond_41

    .line 1662
    iget-byte v3, p2, Ll/᩸ܽܽ;->۠֫:B

    and-int/lit8 v3, v3, 0x30

    if-eqz v3, :cond_40

    const/4 v3, 0x1

    goto :goto_21

    :cond_40
    const/4 v3, 0x0

    :goto_21
    if-eqz v3, :cond_41

    and-int/lit8 p1, v0, 0x30

    if-eqz p1, :cond_6f

    goto/16 :goto_3b

    .line 1668
    :cond_41
    invoke-direct {p0}, Ll/᩸ܽܽ;->ܺ()I

    move-result v0

    if-eqz v0, :cond_42

    const/4 v0, 0x1

    goto :goto_22

    :cond_42
    const/4 v0, 0x0

    :goto_22
    if-nez v0, :cond_44

    invoke-direct {p1}, Ll/᩸ܽܽ;->ܺ()I

    move-result v0

    if-eqz v0, :cond_43

    const/4 v0, 0x1

    goto :goto_23

    :cond_43
    const/4 v0, 0x0

    :goto_23
    if-eqz v0, :cond_53

    .line 1669
    :cond_44
    iget v0, p0, Ll/᩸ܽܽ;->ۙ:I

    iget v3, p1, Ll/᩸ܽܽ;->ۙ:I

    if-eq v0, v3, :cond_51

    if-eqz v0, :cond_45

    const/4 p1, 0x1

    goto :goto_24

    :cond_45
    const/4 p1, 0x0

    :goto_24
    const/16 v4, 0xa0

    if-eqz p1, :cond_46

    goto :goto_25

    :cond_46
    const/16 v0, 0xa0

    :goto_25
    if-eqz v3, :cond_47

    const/4 p1, 0x1

    goto :goto_26

    :cond_47
    const/4 p1, 0x0

    :goto_26
    if-eqz p1, :cond_48

    goto :goto_27

    :cond_48
    const/16 v3, 0xa0

    :goto_27
    const p1, 0xfffe

    if-ne v0, p1, :cond_49

    goto/16 :goto_3b

    :cond_49
    if-ne v3, p1, :cond_4a

    goto/16 :goto_3c

    .line 1681
    :cond_4a
    iget p2, p2, Ll/᩸ܽܽ;->ۙ:I

    if-eqz p2, :cond_4c

    if-ne p2, p1, :cond_4b

    goto :goto_28

    :cond_4b
    move v4, p2

    :cond_4c
    :goto_28
    if-le v3, v0, :cond_4d

    move v8, v3

    move v3, v0

    move v0, v8

    goto :goto_29

    :cond_4d
    const/4 v2, 0x1

    :goto_29
    if-lt v4, v0, :cond_4e

    goto :goto_2b

    :cond_4e
    if-lt v3, v4, :cond_4f

    :goto_2a
    xor-int/lit8 p1, v2, 0x1

    return p1

    :cond_4f
    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v3, v4

    mul-int v3, v3, v0

    mul-int v4, v4, v4

    if-le v3, v4, :cond_50

    goto :goto_2a

    :cond_50
    :goto_2b
    return v2

    .line 1718
    :cond_51
    iget-byte v0, p0, Ll/᩸ܽܽ;->֨֫:B

    iget-byte v3, p1, Ll/᩸ܽܽ;->֨֫:B

    if-eq v0, v3, :cond_53

    iget-byte v3, p2, Ll/᩸ܽܽ;->֨֫:B

    if-eqz v3, :cond_52

    const/4 v3, 0x1

    goto :goto_2c

    :cond_52
    const/4 v3, 0x0

    :goto_2c
    if-eqz v3, :cond_53

    if-eqz v0, :cond_6f

    goto/16 :goto_3b

    .line 1723
    :cond_53
    invoke-direct {p0}, Ll/᩸ܽܽ;->ۜ()I

    move-result v0

    if-eqz v0, :cond_54

    const/4 v0, 0x1

    goto :goto_2d

    :cond_54
    const/4 v0, 0x0

    :goto_2d
    if-nez v0, :cond_56

    invoke-direct {p1}, Ll/᩸ܽܽ;->ۜ()I

    move-result v0

    if-eqz v0, :cond_55

    const/4 v0, 0x1

    goto :goto_2e

    :cond_55
    const/4 v0, 0x0

    :goto_2e
    if-eqz v0, :cond_62

    .line 1724
    :cond_56
    iget-byte v0, p0, Ll/᩸ܽܽ;->ۤ:B

    and-int/lit8 v3, v0, 0x3

    .line 1725
    iget-byte v4, p1, Ll/᩸ܽܽ;->ۤ:B

    and-int/lit8 v5, v4, 0x3

    if-eq v3, v5, :cond_5b

    .line 1727
    iget-byte v6, p2, Ll/᩸ܽܽ;->ۤ:B

    and-int/lit8 v6, v6, 0x3

    if-eqz v6, :cond_57

    const/4 v7, 0x1

    goto :goto_2f

    :cond_57
    const/4 v7, 0x0

    :goto_2f
    if-eqz v7, :cond_5b

    if-nez v3, :cond_58

    goto/16 :goto_3c

    :cond_58
    if-nez v5, :cond_59

    goto/16 :goto_3b

    :cond_59
    if-ne v6, v3, :cond_5a

    goto/16 :goto_3b

    :cond_5a
    if-ne v6, v5, :cond_5b

    goto/16 :goto_3c

    :cond_5b
    and-int/lit8 v0, v0, 0xc

    and-int/lit8 v3, v4, 0xc

    if-eq v0, v3, :cond_5e

    .line 1744
    iget-byte v4, p2, Ll/᩸ܽܽ;->ۤ:B

    and-int/lit8 v4, v4, 0xc

    if-eqz v4, :cond_5c

    const/4 v4, 0x1

    goto :goto_30

    :cond_5c
    const/4 v4, 0x0

    :goto_30
    if-eqz v4, :cond_5e

    if-nez v0, :cond_5d

    goto/16 :goto_3c

    :cond_5d
    if-nez v3, :cond_5e

    goto/16 :goto_3b

    .line 1753
    :cond_5e
    iget-byte v0, p0, Ll/᩸ܽܽ;->ۛ:B

    iget-byte v3, p1, Ll/᩸ܽܽ;->ۛ:B

    if-eq v0, v3, :cond_60

    iget-byte v3, p2, Ll/᩸ܽܽ;->ۛ:B

    if-eqz v3, :cond_5f

    const/4 v3, 0x1

    goto :goto_31

    :cond_5f
    const/4 v3, 0x0

    :goto_31
    if-eqz v3, :cond_60

    if-eqz v0, :cond_6f

    goto/16 :goto_3b

    .line 1757
    :cond_60
    iget-byte v0, p0, Ll/᩸ܽܽ;->ܳ֫:B

    iget-byte v3, p1, Ll/᩸ܽܽ;->ܳ֫:B

    if-eq v0, v3, :cond_62

    iget-byte v3, p2, Ll/᩸ܽܽ;->ܳ֫:B

    if-eqz v3, :cond_61

    const/4 v3, 0x1

    goto :goto_32

    :cond_61
    const/4 v3, 0x0

    :goto_32
    if-eqz v3, :cond_62

    if-eqz v0, :cond_6f

    goto/16 :goto_3b

    .line 1762
    :cond_62
    invoke-direct {p0}, Ll/᩸ܽܽ;->ۢ()I

    move-result v0

    if-eqz v0, :cond_63

    const/4 v0, 0x1

    goto :goto_33

    :cond_63
    const/4 v0, 0x0

    :goto_33
    if-nez v0, :cond_65

    invoke-direct {p1}, Ll/᩸ܽܽ;->ۢ()I

    move-result v0

    if-eqz v0, :cond_64

    const/4 v0, 0x1

    goto :goto_34

    :cond_64
    const/4 v0, 0x0

    :goto_34
    if-eqz v0, :cond_6a

    .line 1772
    :cond_65
    iget v0, p2, Ll/᩸ܽܽ;->ۘ֫:I

    if-eqz v0, :cond_66

    const/4 v3, 0x1

    goto :goto_35

    :cond_66
    const/4 v3, 0x0

    :goto_35
    if-eqz v3, :cond_67

    .line 1773
    iget v3, p0, Ll/᩸ܽܽ;->ۘ֫:I

    sub-int v3, v0, v3

    .line 1774
    iget v4, p1, Ll/᩸ܽܽ;->ۘ֫:I

    sub-int/2addr v0, v4

    goto :goto_36

    :cond_67
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 1776
    :goto_36
    iget v4, p2, Ll/᩸ܽܽ;->ۢ֫:I

    if-eqz v4, :cond_68

    const/4 v5, 0x1

    goto :goto_37

    :cond_68
    const/4 v5, 0x0

    :goto_37
    if-eqz v5, :cond_69

    .line 1777
    iget v5, p0, Ll/᩸ܽܽ;->ۢ֫:I

    sub-int v5, v4, v5

    add-int/2addr v3, v5

    .line 1778
    iget v5, p1, Ll/᩸ܽܽ;->ۢ֫:I

    sub-int/2addr v4, v5

    add-int/2addr v0, v4

    :cond_69
    if-eq v3, v0, :cond_6a

    if-ge v3, v0, :cond_6f

    goto :goto_3b

    .line 1785
    :cond_6a
    invoke-direct {p0}, Ll/᩸ܽܽ;->ۖ()I

    move-result v0

    if-eqz v0, :cond_6b

    const/4 v0, 0x1

    goto :goto_38

    :cond_6b
    const/4 v0, 0x0

    :goto_38
    if-nez v0, :cond_6d

    invoke-direct {p1}, Ll/᩸ܽܽ;->ۖ()I

    move-result v0

    if-eqz v0, :cond_6c

    const/4 v0, 0x1

    goto :goto_39

    :cond_6c
    const/4 v0, 0x0

    :goto_39
    if-eqz v0, :cond_6f

    .line 1786
    :cond_6d
    iget-short v0, p0, Ll/᩸ܽܽ;->᩵֫:S

    iget-short p1, p1, Ll/᩸ܽܽ;->᩵֫:S

    if-eq v0, p1, :cond_6f

    iget-short p2, p2, Ll/᩸ܽܽ;->᩵֫:S

    if-eqz p2, :cond_6e

    const/4 p2, 0x1

    goto :goto_3a

    :cond_6e
    const/4 p2, 0x0

    :goto_3a
    if-eqz p2, :cond_6f

    if-le v0, p1, :cond_6f

    :goto_3b
    return v1

    :cond_6f
    :goto_3c
    return v2
.end method

.method public final ۧ(Ll/᩸ܽܽ;)I
    .locals 4

    .line 1447
    iget-short v0, p0, Ll/᩸ܽܽ;->ܽ֫:S

    iget-short v1, p1, Ll/᩸ܽܽ;->ܽ֫:S

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1449
    :goto_0
    iget-short v1, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    iget-short v2, p1, Ll/᩸ܽܽ;->ᩳ֫:S

    if-eq v1, v2, :cond_1

    or-int/lit8 v0, v0, 0x2

    .line 1451
    :cond_1
    iget-object v1, p0, Ll/᩸ܽܽ;->ۨ:[C

    iget-object v2, p1, Ll/᩸ܽܽ;->ۨ:[C

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Ll/᩸ܽܽ;->᩹:[C

    iget-object v2, p1, Ll/᩸ܽܽ;->᩹:[C

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x4

    if-ge v1, v2, :cond_5

    .line 1497
    iget-byte v2, p0, Ll/᩸ܽܽ;->֫֫:B

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    iget-object v2, p0, Ll/᩸ܽܽ;->۟:[C

    aget-char v2, v2, v1

    .line 1498
    :goto_2
    iget-byte v3, p1, Ll/᩸ܽܽ;->֫֫:B

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    iget-object v3, p1, Ll/᩸ܽܽ;->۟:[C

    aget-char v3, v3, v1

    :goto_3
    if-eq v2, v3, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1452
    :cond_5
    iget-object v1, p0, Ll/᩸ܽܽ;->ۧ֫:[C

    iget-object v2, p1, Ll/᩸ܽܽ;->ۧ֫:[C

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Ll/᩸ܽܽ;->ܰ:[C

    iget-object v2, p1, Ll/᩸ܽܽ;->ܰ:[C

    .line 1453
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v1

    if-nez v1, :cond_7

    :cond_6
    :goto_4
    or-int/lit8 v0, v0, 0x4

    .line 1455
    :cond_7
    iget-byte v1, p0, Ll/᩸ܽܽ;->᩻֫:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->᩻֫:B

    if-eq v1, v2, :cond_8

    or-int/lit16 v0, v0, 0x80

    .line 1457
    :cond_8
    iget v1, p0, Ll/᩸ܽܽ;->ۙ:I

    iget v2, p1, Ll/᩸ܽܽ;->ۙ:I

    if-eq v1, v2, :cond_9

    or-int/lit16 v0, v0, 0x100

    .line 1459
    :cond_9
    iget-byte v1, p0, Ll/᩸ܽܽ;->֨֫:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->֨֫:B

    if-eq v1, v2, :cond_a

    or-int/lit8 v0, v0, 0x8

    .line 1461
    :cond_a
    iget-byte v1, p0, Ll/᩸ܽܽ;->ۤ:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->ۤ:B

    xor-int/2addr v1, v2

    and-int/lit8 v1, v1, 0xf

    if-eqz v1, :cond_b

    or-int/lit8 v0, v0, 0x20

    .line 1463
    :cond_b
    iget-byte v1, p0, Ll/᩸ܽܽ;->ۛ:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->ۛ:B

    if-eq v1, v2, :cond_c

    or-int/lit8 v0, v0, 0x10

    .line 1465
    :cond_c
    iget-byte v1, p0, Ll/᩸ܽܽ;->ܳ֫:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->ܳ֫:B

    if-eq v1, v2, :cond_d

    or-int/lit8 v0, v0, 0x40

    .line 1467
    :cond_d
    iget v1, p0, Ll/᩸ܽܽ;->ۘ֫:I

    iget v2, p1, Ll/᩸ܽܽ;->ۘ֫:I

    if-ne v1, v2, :cond_e

    iget v1, p0, Ll/᩸ܽܽ;->ۢ֫:I

    iget v2, p1, Ll/᩸ܽܽ;->ۢ֫:I

    if-ne v1, v2, :cond_e

    iget v1, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    iget v2, p1, Ll/᩸ܽܽ;->ᩴ֫:I

    if-ne v1, v2, :cond_e

    iget v1, p0, Ll/᩸ܽܽ;->ۡ֫:I

    iget v2, p1, Ll/᩸ܽܽ;->ۡ֫:I

    if-eq v1, v2, :cond_f

    :cond_e
    or-int/lit16 v0, v0, 0x200

    .line 1470
    :cond_f
    iget-short v1, p0, Ll/᩸ܽܽ;->᩵֫:S

    iget-short v2, p1, Ll/᩸ܽܽ;->᩵֫:S

    if-eq v1, v2, :cond_10

    or-int/lit16 v0, v0, 0x400

    .line 1472
    :cond_10
    iget-byte v1, p0, Ll/᩸ܽܽ;->ܺ֫:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->ܺ֫:B

    xor-int v3, v1, v2

    and-int/lit16 v3, v3, 0xc0

    if-eqz v3, :cond_11

    or-int/lit16 v0, v0, 0x4000

    :cond_11
    xor-int/2addr v1, v2

    and-int/lit8 v1, v1, 0x3f

    if-eqz v1, :cond_12

    or-int/lit16 v0, v0, 0x800

    .line 1476
    :cond_12
    iget-byte v1, p0, Ll/᩸ܽܽ;->ۖ֫:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->ۖ֫:B

    xor-int/2addr v1, v2

    and-int/lit8 v1, v1, 0x3

    if-eqz v1, :cond_13

    const v1, 0x8000

    or-int/2addr v0, v1

    .line 1478
    :cond_13
    iget-byte v1, p0, Ll/᩸ܽܽ;->᩸:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->᩸:B

    xor-int/2addr v1, v2

    and-int/lit8 v1, v1, 0xf

    if-eqz v1, :cond_14

    const/high16 v1, 0x10000

    or-int/2addr v0, v1

    .line 1480
    :cond_14
    iget-byte v1, p0, Ll/᩸ܽܽ;->۠֫:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->۠֫:B

    if-eq v1, v2, :cond_15

    or-int/lit16 v0, v0, 0x1000

    .line 1482
    :cond_15
    iget v1, p0, Ll/᩸ܽܽ;->֡֫:I

    iget v2, p1, Ll/᩸ܽܽ;->֡֫:I

    if-eq v1, v2, :cond_16

    or-int/lit16 v0, v0, 0x2000

    .line 1484
    :cond_16
    iget-byte v1, p0, Ll/᩸ܽܽ;->۫:B

    iget-byte v2, p1, Ll/᩸ܽܽ;->۫:B

    if-eq v1, v2, :cond_17

    const/high16 v1, 0x20000

    or-int/2addr v0, v1

    .line 1486
    :cond_17
    iget-object v1, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    sget-object v2, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    if-ne v1, v2, :cond_1a

    iget-object v2, p1, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    if-ne v2, v1, :cond_1a

    .line 1487
    iget v1, p0, Ll/᩸ܽܽ;->ۚ֫:I

    iget v2, p1, Ll/᩸ܽܽ;->ۚ֫:I

    if-eq v1, v2, :cond_18

    const/high16 v1, 0x40000

    or-int/2addr v0, v1

    .line 1488
    :cond_18
    iget v1, p0, Ll/᩸ܽܽ;->۬:I

    iget v2, p1, Ll/᩸ܽܽ;->۬:I

    if-eq v1, v2, :cond_19

    const/high16 v1, 0x80000

    or-int/2addr v0, v1

    .line 1489
    :cond_19
    iget v1, p0, Ll/᩸ܽܽ;->ܿ֫:I

    iget p1, p1, Ll/᩸ܽܽ;->ܿ֫:I

    if-eq v1, p1, :cond_1a

    const/high16 p1, 0x100000

    or-int/2addr p1, v0

    return p1

    :cond_1a
    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 14

    .line 895
    iget-object v0, p0, Ll/᩸ܽܽ;->ۜ֫:Ljava/lang/String;

    if-nez v0, :cond_59

    .line 901
    sget-object v0, Ll/᩸ܽܽ;->᩹֫:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 903
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_0

    .line 905
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 907
    :goto_0
    iget-short v3, p0, Ll/᩸ܽܽ;->ܽ֫:S

    const/4 v4, 0x1

    const-string v5, "-mnc"

    if-eqz v3, :cond_5

    const-string v3, "-mcc"

    .line 908
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 909
    iget-short v3, p0, Ll/᩸ܽܽ;->ܽ֫:S

    invoke-static {v1, v3}, Ll/ۢۤۡ;->֫(Ljava/lang/StringBuilder;I)V

    .line 910
    iget-short v3, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    const/4 v6, -0x1

    if-eq v3, v6, :cond_4

    if-eqz v3, :cond_6

    .line 912
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 913
    iget-short v3, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    if-lez v3, :cond_3

    const/16 v5, 0xa

    if-ge v3, v5, :cond_3

    if-ltz v3, :cond_2

    const/16 v6, 0x64

    if-lt v3, v6, :cond_1

    goto :goto_1

    .line 53
    :cond_1
    div-int/lit8 v6, v3, 0xa

    rem-int/2addr v6, v5

    .line 54
    rem-int/2addr v3, v5

    .line 55
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 50
    :cond_2
    :goto_1
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v6, v4, [Ljava/lang/Object;

    aput-object v3, v6, v2

    const-string v3, "%02d"

    invoke-static {v5, v3, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 916
    :cond_3
    invoke-static {v1, v3}, Ll/ۢۤۡ;->֫(Ljava/lang/StringBuilder;I)V

    goto :goto_2

    :cond_4
    const-string v3, "-mnc00"

    .line 920
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 923
    :cond_5
    iget-short v3, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    if-eqz v3, :cond_6

    .line 924
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v3, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1182
    :cond_6
    :goto_2
    iget-object v3, p0, Ll/᩸ܽܽ;->ۨ:[C

    invoke-static {v3}, Ll/᩸ܽܽ;->֫([C)Ljava/lang/String;

    move-result-object v3

    .line 1183
    iget-object v5, p0, Ll/᩸ܽܽ;->᩹:[C

    invoke-static {v5}, Ll/᩸ܽܽ;->֫([C)Ljava/lang/String;

    move-result-object v5

    .line 1184
    iget-object v6, p0, Ll/᩸ܽܽ;->۟:[C

    invoke-static {v6}, Ll/᩸ܽܽ;->֫([C)Ljava/lang/String;

    move-result-object v6

    .line 1185
    iget-object v7, p0, Ll/᩸ܽܽ;->ۧ֫:[C

    invoke-static {v7}, Ll/᩸ܽܽ;->֫([C)Ljava/lang/String;

    move-result-object v7

    .line 878
    iget-object v8, p0, Ll/᩸ܽܽ;->ۨ:[C

    aget-char v8, v8, v2

    if-eqz v8, :cond_7

    iget-object v8, p0, Ll/᩸ܽܽ;->ܰ:[C

    invoke-static {v8}, Ll/᩸ܽܽ;->ۧ([C)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 1187
    iget-object v8, p0, Ll/᩸ܽܽ;->ܰ:[C

    invoke-static {v8}, Ll/᩸ܽܽ;->֫([C)Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_7
    const-string v8, ""

    .line 1189
    :goto_3
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/4 v12, 0x3

    if-eqz v9, :cond_8

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_8

    goto/16 :goto_5

    .line 1194
    :cond_8
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v13, 0x5

    if-eq v9, v10, :cond_a

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v9, v13, :cond_a

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    if-eq v9, v12, :cond_a

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_4

    :cond_9
    const-string v6, "-"

    .line 1212
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1213
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_10

    const-string v3, "-r"

    .line 1214
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_a
    :goto_4
    const-string v9, "-b+"

    .line 1195
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1196
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_b

    .line 1197
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1199
    :cond_b
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v3

    const-string v9, "+"

    if-ne v3, v10, :cond_c

    .line 1200
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1202
    :cond_c
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v3, v11, :cond_d

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v12, :cond_e

    .line 1203
    :cond_d
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1205
    :cond_e
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v3, v13, :cond_f

    .line 1206
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1208
    :cond_f
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_10

    const-string v3, "+u+nu+"

    .line 1209
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 929
    :cond_10
    :goto_5
    iget-byte v3, p0, Ll/᩸ܽܽ;->ܺ֫:B

    and-int/lit16 v3, v3, 0xc0

    const/16 v5, 0x40

    if-eq v3, v5, :cond_12

    const/16 v5, 0x80

    if-eq v3, v5, :cond_11

    goto :goto_6

    :cond_11
    const-string v3, "-ldrtl"

    .line 931
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_12
    const-string v3, "-ldltr"

    .line 934
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 937
    :goto_6
    iget v3, p0, Ll/᩸ܽܽ;->֡֫:I

    const-string v5, "dp"

    if-eqz v3, :cond_13

    const-string v3, "-sw"

    .line 938
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/᩸ܽܽ;->֡֫:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 940
    :cond_13
    iget v3, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    if-eqz v3, :cond_14

    const-string v3, "-w"

    .line 941
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 943
    :cond_14
    iget v3, p0, Ll/᩸ܽܽ;->ۡ֫:I

    if-eqz v3, :cond_15

    const-string v3, "-h"

    .line 944
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/᩸ܽܽ;->ۡ֫:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 946
    :cond_15
    iget-byte v3, p0, Ll/᩸ܽܽ;->ܺ֫:B

    and-int/lit8 v3, v3, 0xf

    if-eq v3, v4, :cond_19

    if-eq v3, v11, :cond_18

    if-eq v3, v12, :cond_17

    if-eq v3, v10, :cond_16

    goto :goto_7

    :cond_16
    const-string v3, "-xlarge"

    .line 957
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_17
    const-string v3, "-large"

    .line 954
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_18
    const-string v3, "-normal"

    .line 951
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_19
    const-string v3, "-small"

    .line 948
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 960
    :goto_7
    iget-byte v3, p0, Ll/᩸ܽܽ;->ܺ֫:B

    and-int/lit8 v3, v3, 0x30

    const/16 v5, 0x20

    const/16 v6, 0x10

    if-eq v3, v6, :cond_1b

    if-eq v3, v5, :cond_1a

    goto :goto_8

    :cond_1a
    const-string v3, "-long"

    .line 962
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_1b
    const-string v3, "-notlong"

    .line 965
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 968
    :goto_8
    iget-byte v3, p0, Ll/᩸ܽܽ;->ۖ֫:B

    and-int/2addr v3, v12

    if-eq v3, v4, :cond_1d

    if-eq v3, v11, :cond_1c

    goto :goto_9

    :cond_1c
    const-string v3, "-round"

    .line 970
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_9

    :cond_1d
    const-string v3, "-notround"

    .line 973
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 976
    :goto_9
    iget-byte v3, p0, Ll/᩸ܽܽ;->᩸:B

    and-int/lit8 v3, v3, 0xc

    const/16 v7, 0x8

    if-eq v3, v10, :cond_1f

    if-eq v3, v7, :cond_1e

    goto :goto_a

    :cond_1e
    const-string v3, "-highdr"

    .line 978
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_a

    :cond_1f
    const-string v3, "-lowdr"

    .line 981
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 984
    :goto_a
    iget-byte v3, p0, Ll/᩸ܽܽ;->᩸:B

    and-int/2addr v3, v12

    if-eq v3, v4, :cond_21

    if-eq v3, v11, :cond_20

    goto :goto_b

    :cond_20
    const-string v3, "-widecg"

    .line 986
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_b

    :cond_21
    const-string v3, "-nowidecg"

    .line 989
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 992
    :goto_b
    iget-byte v3, p0, Ll/᩸ܽܽ;->᩻֫:B

    if-eq v3, v4, :cond_24

    if-eq v3, v11, :cond_23

    if-eq v3, v12, :cond_22

    goto :goto_c

    :cond_22
    const-string v3, "-square"

    .line 1000
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_23
    const-string v3, "-land"

    .line 997
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_24
    const-string v3, "-port"

    .line 994
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1003
    :goto_c
    iget-byte v3, p0, Ll/᩸ܽܽ;->۠֫:B

    and-int/lit8 v3, v3, 0xf

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    goto :goto_d

    :pswitch_1
    const-string v3, "-hugeui"

    .line 1026
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_2
    const-string v3, "-largeui"

    .line 1020
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_3
    const-string v3, "-mediumui"

    .line 1017
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_4
    const-string v3, "-smallui"

    .line 1014
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_5
    const-string v3, "-godzillaui"

    .line 1023
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_6
    const-string v3, "-vrheadset"

    .line 1035
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_7
    const-string v3, "-watch"

    .line 1032
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_8
    const-string v3, "-appliance"

    .line 1029
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_9
    const-string v3, "-television"

    .line 1011
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_a
    const-string v3, "-car"

    .line 1005
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :pswitch_b
    const-string v3, "-desk"

    .line 1008
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1038
    :goto_d
    iget-byte v3, p0, Ll/᩸ܽܽ;->۠֫:B

    and-int/lit8 v3, v3, 0x30

    if-eq v3, v6, :cond_26

    if-eq v3, v5, :cond_25

    goto :goto_e

    :cond_25
    const-string v3, "-night"

    .line 1040
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_e

    :cond_26
    const-string v3, "-notnight"

    .line 1043
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1046
    :goto_e
    iget v3, p0, Ll/᩸ܽܽ;->ۙ:I

    const/16 v5, 0x2d

    const/16 v6, 0x78

    if-eqz v3, :cond_2e

    if-eq v3, v6, :cond_2d

    const/16 v8, 0xa0

    if-eq v3, v8, :cond_2c

    const/16 v8, 0xd5

    if-eq v3, v8, :cond_2b

    const/16 v8, 0xf0

    if-eq v3, v8, :cond_2a

    const/16 v8, 0x140

    if-eq v3, v8, :cond_29

    const/16 v8, 0x1e0

    if-eq v3, v8, :cond_28

    const/16 v8, 0x280

    if-eq v3, v8, :cond_27

    packed-switch v3, :pswitch_data_1

    .line 1077
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/᩸ܽܽ;->ۙ:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "dpi"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :pswitch_c
    const-string v3, "-nodpi"

    .line 1074
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :pswitch_d
    const-string v3, "-anydpi"

    .line 1071
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :cond_27
    const-string v3, "-xxxhdpi"

    .line 1068
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :cond_28
    const-string v3, "-xxhdpi"

    .line 1065
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :cond_29
    const-string v3, "-xhdpi"

    .line 1062
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :cond_2a
    const-string v3, "-hdpi"

    .line 1056
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :cond_2b
    const-string v3, "-tvdpi"

    .line 1059
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :cond_2c
    const-string v3, "-mdpi"

    .line 1053
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :cond_2d
    const-string v3, "-ldpi"

    .line 1050
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1079
    :cond_2e
    :goto_f
    iget-byte v3, p0, Ll/᩸ܽܽ;->֨֫:B

    if-eq v3, v4, :cond_31

    if-eq v3, v11, :cond_30

    if-eq v3, v12, :cond_2f

    goto :goto_10

    :cond_2f
    const-string v3, "-finger"

    .line 1087
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_10

    :cond_30
    const-string v3, "-stylus"

    .line 1084
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_10

    :cond_31
    const-string v3, "-notouch"

    .line 1081
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1090
    :goto_10
    iget-byte v3, p0, Ll/᩸ܽܽ;->ۤ:B

    and-int/2addr v3, v12

    if-eq v3, v4, :cond_34

    if-eq v3, v11, :cond_33

    if-eq v3, v12, :cond_32

    goto :goto_11

    :cond_32
    const-string v3, "-keyssoft"

    .line 1098
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_11

    :cond_33
    const-string v3, "-keyshidden"

    .line 1095
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_11

    :cond_34
    const-string v3, "-keysexposed"

    .line 1092
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1101
    :goto_11
    iget-byte v3, p0, Ll/᩸ܽܽ;->ۛ:B

    if-eq v3, v4, :cond_37

    if-eq v3, v11, :cond_36

    if-eq v3, v12, :cond_35

    goto :goto_12

    :cond_35
    const-string v3, "-12key"

    .line 1109
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_12

    :cond_36
    const-string v3, "-qwerty"

    .line 1106
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_12

    :cond_37
    const-string v3, "-nokeys"

    .line 1103
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1112
    :goto_12
    iget-byte v3, p0, Ll/᩸ܽܽ;->ۤ:B

    and-int/lit8 v3, v3, 0xc

    if-eq v3, v10, :cond_39

    if-eq v3, v7, :cond_38

    goto :goto_13

    :cond_38
    const-string v3, "-navhidden"

    .line 1117
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    :cond_39
    const-string v3, "-navexposed"

    .line 1114
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1120
    :goto_13
    iget-byte v3, p0, Ll/᩸ܽܽ;->ܳ֫:B

    if-eq v3, v4, :cond_3d

    if-eq v3, v11, :cond_3c

    if-eq v3, v12, :cond_3b

    if-eq v3, v10, :cond_3a

    goto :goto_14

    :cond_3a
    const-string v3, "-wheel"

    .line 1131
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_14

    :cond_3b
    const-string v3, "-trackball"

    .line 1128
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_14

    :cond_3c
    const-string v3, "-dpad"

    .line 1125
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_14

    :cond_3d
    const-string v3, "-nonav"

    .line 1122
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1134
    :goto_14
    iget-byte v3, p0, Ll/᩸ܽܽ;->۫:B

    if-eq v3, v4, :cond_40

    if-eq v3, v11, :cond_3f

    if-eq v3, v12, :cond_3e

    goto :goto_15

    :cond_3e
    const-string v3, "-masculine"

    .line 1142
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    :cond_3f
    const-string v3, "-feminine"

    .line 1139
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    :cond_40
    const-string v3, "-neuter"

    .line 1136
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1145
    :goto_15
    iget v3, p0, Ll/᩸ܽܽ;->ۘ֫:I

    if-eqz v3, :cond_41

    iget v3, p0, Ll/᩸ܽܽ;->ۢ֫:I

    if-eqz v3, :cond_41

    .line 1146
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/᩸ܽܽ;->ۘ֫:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/᩸ܽܽ;->ۢ֫:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1148
    :cond_41
    iget-short v3, p0, Ll/᩸ܽܽ;->᩵֫:S

    if-lez v3, :cond_4b

    .line 1220
    iget-byte v5, p0, Ll/᩸ܽܽ;->۠֫:B

    and-int/lit8 v6, v5, 0xf

    const/4 v8, 0x7

    if-eq v6, v8, :cond_4a

    iget-byte v6, p0, Ll/᩸ܽܽ;->᩸:B

    and-int/lit8 v8, v6, 0x3

    if-nez v8, :cond_4a

    and-int/lit8 v6, v6, 0xc

    if-eqz v6, :cond_42

    goto :goto_18

    .line 1223
    :cond_42
    iget-byte v6, p0, Ll/᩸ܽܽ;->ۖ֫:B

    and-int/2addr v6, v12

    if-eqz v6, :cond_43

    const/16 v7, 0x17

    goto :goto_19

    .line 1226
    :cond_43
    iget v6, p0, Ll/᩸ܽܽ;->ۙ:I

    const v8, 0xfffe

    if-ne v6, v8, :cond_44

    const/16 v7, 0x15

    goto :goto_19

    .line 1229
    :cond_44
    iget v8, p0, Ll/᩸ܽܽ;->֡֫:I

    if-nez v8, :cond_49

    iget v8, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    if-nez v8, :cond_49

    iget v8, p0, Ll/᩸ܽܽ;->ۡ֫:I

    if-eqz v8, :cond_45

    goto :goto_17

    :cond_45
    and-int/lit8 v5, v5, 0x3f

    if-eqz v5, :cond_46

    goto :goto_19

    .line 1235
    :cond_46
    iget-byte v5, p0, Ll/᩸ܽܽ;->ܺ֫:B

    and-int/lit8 v5, v5, 0x3f

    if-nez v5, :cond_48

    if-eqz v6, :cond_47

    goto :goto_16

    :cond_47
    const/4 v7, 0x0

    goto :goto_19

    :cond_48
    :goto_16
    const/4 v7, 0x4

    goto :goto_19

    :cond_49
    :goto_17
    const/16 v7, 0xd

    goto :goto_19

    :cond_4a
    :goto_18
    const/16 v7, 0x1a

    :goto_19
    if-lt v3, v7, :cond_4b

    const-string v3, "-v"

    .line 1149
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v3, p0, Ll/᩸ܽܽ;->᩵֫:S

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1151
    :cond_4b
    iget-object v3, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    sget-object v5, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    if-ne v3, v5, :cond_52

    .line 1152
    iget v3, p0, Ll/᩸ܽܽ;->ۚ֫:I

    const-wide v5, 0xffffffffL

    if-eqz v3, :cond_4c

    const-string v3, "-spn"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/᩸ܽܽ;->ۚ֫:I

    int-to-long v7, v3

    and-long/2addr v7, v5

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1153
    :cond_4c
    iget v3, p0, Ll/᩸ܽܽ;->۬:I

    if-eqz v3, :cond_4d

    const-string v3, "-gid1"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/᩸ܽܽ;->۬:I

    int-to-long v7, v3

    and-long/2addr v7, v5

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1154
    :cond_4d
    iget v3, p0, Ll/᩸ܽܽ;->ܿ֫:I

    if-eqz v3, :cond_52

    if-eq v3, v4, :cond_51

    if-eq v3, v11, :cond_50

    if-eq v3, v12, :cond_4f

    if-eq v3, v10, :cond_4e

    const-string v3, "-motuimode"

    .line 1160
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/᩸ܽܽ;->ܿ֫:I

    int-to-long v3, v3

    and-long/2addr v3, v5

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_1a

    :cond_4e
    const-string v3, "-motcli"

    .line 1159
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1a

    :cond_4f
    const-string v3, "-motmobile"

    .line 1158
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1a

    :cond_50
    const-string v3, "-motdesk"

    .line 1157
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1a

    :cond_51
    const-string v3, "-motphone"

    .line 1156
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1163
    :cond_52
    :goto_1a
    iget-object v3, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v3, v3, Ll/ۤܽܽ;->᩸:I

    .line 1164
    iget-object v4, p0, Ll/᩸ܽܽ;->ܰ:[C

    invoke-static {v4}, Ll/᩸ܽܽ;->ܽ([C)Z

    move-result v4

    if-nez v4, :cond_54

    .line 878
    iget-object v4, p0, Ll/᩸ܽܽ;->ۨ:[C

    aget-char v4, v4, v2

    if-eqz v4, :cond_53

    iget-object v4, p0, Ll/᩸ܽܽ;->ܰ:[C

    invoke-static {v4}, Ll/᩸ܽܽ;->ۧ([C)Z

    move-result v4

    if-eqz v4, :cond_53

    goto :goto_1b

    .line 1165
    :cond_53
    iget-object v2, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v2, v2, Ll/ۤܽܽ;->᩸:I

    add-int/lit8 v3, v2, -0xb

    goto :goto_1d

    .line 842
    :cond_54
    :goto_1b
    iget-object v4, p0, Ll/᩸ܽܽ;->ۗ:[B

    array-length v5, v4

    :goto_1c
    if-ge v2, v5, :cond_56

    aget-byte v6, v4, v2

    if-eqz v6, :cond_55

    .line 1166
    iget-object v2, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v2, v2, Ll/ۤܽܽ;->᩸:I

    add-int/lit8 v3, v2, -0x3

    goto :goto_1d

    :cond_55
    add-int/lit8 v2, v2, 0x1

    goto :goto_1c

    .line 1167
    :cond_56
    :goto_1d
    iget-object v2, p0, Ll/᩸ܽܽ;->᩺:Ll/ۤܽܽ;

    iget v2, v2, Ll/ۤܽܽ;->᩸:I

    if-lt v3, v2, :cond_57

    iget-object v2, p0, Ll/᩸ܽܽ;->ܶ֫:[B

    if-eqz v2, :cond_58

    .line 1168
    :cond_57
    invoke-direct {p0}, Ll/᩸ܽܽ;->ܿ()[B

    move-result-object v2

    const-string v4, "-unknown"

    .line 1169
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v4, 0x2b

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1170
    invoke-static {}, Ll/ۧ᩺ܺ;->ᩳ()Ll/ۧ᩺ܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۧ᩺ܺ;->ۧ()Ll/ۧ᩺ܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۧ᩺ܺ;->֫()Ll/ۧ᩺ܺ;

    move-result-object v4

    sub-int/2addr v3, v10

    array-length v5, v2

    .line 1171
    invoke-static {v2, v3, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/ۧ᩺ܺ;->֫([B)Ljava/lang/String;

    move-result-object v2

    .line 1170
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1173
    :cond_58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1174
    invoke-virtual {v0, v1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 896
    iput-object v2, p0, Ll/᩸ܽܽ;->ۜ֫:Ljava/lang/String;

    .line 897
    :cond_59
    iget-object v0, p0, Ll/᩸ܽܽ;->ۜ֫:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xfffe
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method

.method public final ܽ(Ll/᩸ܽܽ;)Z
    .locals 9

    .line 2053
    invoke-direct {p0}, Ll/᩸ܽܽ;->ܳ()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2054
    iget-short v0, p0, Ll/᩸ܽܽ;->ܽ֫:S

    if-eqz v0, :cond_0

    iget-short v2, p1, Ll/᩸ܽܽ;->ܽ֫:S

    if-eq v0, v2, :cond_0

    goto/16 :goto_2

    .line 2057
    :cond_0
    iget-short v0, p0, Ll/᩸ܽܽ;->ᩳ֫:S

    if-eqz v0, :cond_1

    iget-short v2, p1, Ll/᩸ܽܽ;->ᩳ֫:S

    if-eq v0, v2, :cond_1

    goto/16 :goto_2

    .line 2061
    :cond_1
    invoke-direct {p0}, Ll/᩸ܽܽ;->᩷()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    .line 2062
    iget-object v0, p0, Ll/᩸ܽܽ;->ۨ:[C

    iget-object v3, p1, Ll/᩸ܽܽ;->ۨ:[C

    invoke-static {v0, v3}, Ll/᩸ܽܽ;->ۧ([C[C)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_2

    :cond_2
    const/4 v0, 0x4

    new-array v0, v0, [C

    .line 2068
    iget-object v3, p1, Ll/᩸ܽܽ;->۟:[C

    aget-char v3, v3, v1

    const/4 v4, 0x0

    if-nez v3, :cond_3

    goto :goto_0

    .line 2071
    :cond_3
    iget-object v3, p0, Ll/᩸ܽܽ;->۟:[C

    aget-char v5, v3, v1

    if-nez v5, :cond_4

    .line 2073
    iget-object v3, p0, Ll/᩸ܽܽ;->ۨ:[C

    iget-object v5, p0, Ll/᩸ܽܽ;->᩹:[C

    invoke-static {v0, v3, v5}, Ll/۠ۜܽ;->֫([C[C[C)V

    .line 2074
    aget-char v3, v0, v1

    if-nez v3, :cond_5

    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    move-object v0, v3

    :cond_5
    const/4 v3, 0x0

    move-object v4, v0

    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_6

    .line 2084
    iget-object v0, p0, Ll/᩸ܽܽ;->᩹:[C

    aget-char v3, v0, v1

    if-eqz v3, :cond_7

    iget-object v3, p1, Ll/᩸ܽܽ;->᩹:[C

    invoke-static {v0, v3}, Ll/᩸ܽܽ;->֫([C[C)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_2

    .line 2088
    :cond_6
    iget-object v0, p1, Ll/᩸ܽܽ;->۟:[C

    invoke-static {v4, v0}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_2

    .line 2331
    :cond_7
    iget-byte v0, p0, Ll/᩸ܽܽ;->ܺ֫:B

    and-int/lit16 v3, v0, 0xff

    shl-int/lit8 v3, v3, 0x18

    iget-byte v4, p0, Ll/᩸ܽܽ;->۠֫:B

    mul-int/lit16 v5, v4, 0xff

    shl-int/lit8 v5, v5, 0x10

    or-int/2addr v3, v5

    iget v5, p0, Ll/᩸ܽܽ;->֡֫:I

    const v6, 0xffff

    and-int v7, v5, v6

    or-int/2addr v3, v7

    if-eqz v3, :cond_d

    and-int/lit16 v3, v0, 0xc0

    .line 2095
    iget-byte v7, p1, Ll/᩸ܽܽ;->ܺ֫:B

    and-int/lit16 v8, v7, 0xc0

    if-eqz v3, :cond_8

    if-eq v3, v8, :cond_8

    goto/16 :goto_2

    :cond_8
    and-int/lit8 v3, v0, 0xf

    and-int/lit8 v8, v7, 0xf

    if-eqz v3, :cond_9

    if-le v3, v8, :cond_9

    goto/16 :goto_2

    :cond_9
    and-int/lit8 v0, v0, 0x30

    and-int/lit8 v3, v7, 0x30

    if-eqz v0, :cond_a

    if-eq v0, v3, :cond_a

    goto/16 :goto_2

    :cond_a
    and-int/lit8 v0, v4, 0xf

    .line 2115
    iget-byte v3, p1, Ll/᩸ܽܽ;->۠֫:B

    and-int/lit8 v7, v3, 0xf

    if-eqz v0, :cond_b

    if-eq v0, v7, :cond_b

    goto/16 :goto_2

    :cond_b
    and-int/lit8 v0, v4, 0x30

    and-int/lit8 v3, v3, 0x30

    if-eqz v0, :cond_c

    if-eq v0, v3, :cond_c

    goto/16 :goto_2

    :cond_c
    if-eqz v5, :cond_d

    .line 2126
    iget v0, p1, Ll/᩸ܽܽ;->֡֫:I

    if-le v5, v0, :cond_d

    goto/16 :goto_2

    .line 2352
    :cond_d
    iget-byte v0, p0, Ll/᩸ܽܽ;->ۖ֫:B

    and-int/lit16 v3, v0, 0xff

    shl-int/lit8 v3, v3, 0x18

    iget-byte v4, p0, Ll/᩸ܽܽ;->᩸:B

    mul-int/lit16 v5, v4, 0xff

    shl-int/lit8 v5, v5, 0x10

    or-int/2addr v3, v5

    iget-short v5, p0, Ll/᩸ܽܽ;->᩷֫:S

    and-int/2addr v5, v6

    or-int/2addr v3, v5

    const/4 v5, 0x3

    if-eqz v3, :cond_e

    and-int/2addr v0, v5

    .line 2134
    iget-byte v3, p1, Ll/᩸ܽܽ;->ۖ֫:B

    and-int/2addr v3, v5

    if-eqz v0, :cond_e

    if-eq v0, v3, :cond_e

    goto/16 :goto_2

    :cond_e
    and-int/lit8 v0, v4, 0xc

    .line 2141
    iget-byte v3, p1, Ll/᩸ܽܽ;->᩸:B

    and-int/lit8 v6, v3, 0xc

    if-eqz v0, :cond_f

    if-eq v0, v6, :cond_f

    goto/16 :goto_2

    :cond_f
    and-int/lit8 v0, v4, 0x3

    and-int/2addr v3, v5

    if-eqz v0, :cond_10

    if-eq v0, v3, :cond_10

    goto/16 :goto_2

    .line 2152
    :cond_10
    invoke-direct {p0}, Ll/᩸ܽܽ;->ۡ()I

    move-result v0

    if-eqz v0, :cond_12

    .line 2153
    iget v0, p0, Ll/᩸ܽܽ;->ᩴ֫:I

    if-eqz v0, :cond_11

    iget v3, p1, Ll/᩸ܽܽ;->ᩴ֫:I

    if-le v0, v3, :cond_11

    goto/16 :goto_2

    .line 2156
    :cond_11
    iget v0, p0, Ll/᩸ܽܽ;->ۡ֫:I

    if-eqz v0, :cond_12

    iget v3, p1, Ll/᩸ܽܽ;->ۡ֫:I

    if-le v0, v3, :cond_12

    goto/16 :goto_2

    .line 2160
    :cond_12
    invoke-direct {p0}, Ll/᩸ܽܽ;->ܺ()I

    move-result v0

    if-eqz v0, :cond_14

    .line 2161
    iget-byte v0, p0, Ll/᩸ܽܽ;->᩻֫:B

    if-eqz v0, :cond_13

    iget-byte v3, p1, Ll/᩸ܽܽ;->᩻֫:B

    if-eq v0, v3, :cond_13

    goto/16 :goto_2

    .line 2165
    :cond_13
    iget-byte v0, p0, Ll/᩸ܽܽ;->֨֫:B

    if-eqz v0, :cond_14

    iget-byte v3, p1, Ll/᩸ܽܽ;->֨֫:B

    if-eq v0, v3, :cond_14

    goto :goto_2

    .line 2169
    :cond_14
    invoke-direct {p0}, Ll/᩸ܽܽ;->ۜ()I

    move-result v0

    if-eqz v0, :cond_18

    .line 2170
    iget-byte v0, p0, Ll/᩸ܽܽ;->ۤ:B

    and-int/lit8 v3, v0, 0x3

    .line 2171
    iget-byte v4, p1, Ll/᩸ܽܽ;->ۤ:B

    and-int/lit8 v6, v4, 0x3

    if-eqz v3, :cond_15

    if-eq v3, v6, :cond_15

    if-ne v3, v2, :cond_1b

    if-eq v6, v5, :cond_15

    goto :goto_2

    :cond_15
    and-int/lit8 v0, v0, 0xc

    and-int/lit8 v3, v4, 0xc

    if-eqz v0, :cond_16

    if-eq v0, v3, :cond_16

    goto :goto_2

    .line 2182
    :cond_16
    iget-byte v0, p0, Ll/᩸ܽܽ;->ۛ:B

    if-eqz v0, :cond_17

    iget-byte v3, p1, Ll/᩸ܽܽ;->ۛ:B

    if-eq v0, v3, :cond_17

    goto :goto_2

    .line 2185
    :cond_17
    iget-byte v0, p0, Ll/᩸ܽܽ;->ܳ֫:B

    if-eqz v0, :cond_18

    iget-byte v3, p1, Ll/᩸ܽܽ;->ܳ֫:B

    if-eq v0, v3, :cond_18

    goto :goto_2

    .line 2189
    :cond_18
    invoke-direct {p0}, Ll/᩸ܽܽ;->ۢ()I

    move-result v0

    if-eqz v0, :cond_1a

    .line 2190
    iget v0, p0, Ll/᩸ܽܽ;->ۘ֫:I

    if-eqz v0, :cond_19

    iget v3, p1, Ll/᩸ܽܽ;->ۘ֫:I

    if-le v0, v3, :cond_19

    goto :goto_2

    .line 2193
    :cond_19
    iget v0, p0, Ll/᩸ܽܽ;->ۢ֫:I

    if-eqz v0, :cond_1a

    iget v3, p1, Ll/᩸ܽܽ;->ۢ֫:I

    if-le v0, v3, :cond_1a

    goto :goto_2

    .line 2197
    :cond_1a
    invoke-direct {p0}, Ll/᩸ܽܽ;->ۖ()I

    move-result v0

    if-eqz v0, :cond_1c

    .line 2198
    iget-short v0, p0, Ll/᩸ܽܽ;->᩵֫:S

    if-eqz v0, :cond_1c

    iget-short p1, p1, Ll/᩸ܽܽ;->᩵֫:S

    if-le v0, p1, :cond_1c

    :cond_1b
    :goto_2
    return v1

    :cond_1c
    return v2
.end method

.method public final ᩳ()I
    .locals 1

    .line 317
    invoke-direct {p0}, Ll/᩸ܽܽ;->ܿ()[B

    move-result-object v0

    array-length v0, v0

    return v0
.end method
