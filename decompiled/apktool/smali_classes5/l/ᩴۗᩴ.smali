.class public final enum Ll/ᩴۗᩴ;
.super Ljava/lang/Enum;
.source "N673"

# interfaces
.implements Ll/ۤۗᩴ;


# static fields
.field public static final enum ALIGNED_DAY_OF_WEEK_IN_MONTH:Ll/ᩴۗᩴ;

.field public static final enum ALIGNED_DAY_OF_WEEK_IN_YEAR:Ll/ᩴۗᩴ;

.field public static final enum ALIGNED_WEEK_OF_MONTH:Ll/ᩴۗᩴ;

.field public static final enum ALIGNED_WEEK_OF_YEAR:Ll/ᩴۗᩴ;

.field public static final enum AMPM_OF_DAY:Ll/ᩴۗᩴ;

.field public static final enum CLOCK_HOUR_OF_AMPM:Ll/ᩴۗᩴ;

.field public static final enum CLOCK_HOUR_OF_DAY:Ll/ᩴۗᩴ;

.field public static final enum DAY_OF_MONTH:Ll/ᩴۗᩴ;

.field public static final enum DAY_OF_WEEK:Ll/ᩴۗᩴ;

.field public static final enum DAY_OF_YEAR:Ll/ᩴۗᩴ;

.field public static final enum EPOCH_DAY:Ll/ᩴۗᩴ;

.field public static final enum ERA:Ll/ᩴۗᩴ;

.field public static final enum HOUR_OF_AMPM:Ll/ᩴۗᩴ;

.field public static final enum HOUR_OF_DAY:Ll/ᩴۗᩴ;

.field public static final enum INSTANT_SECONDS:Ll/ᩴۗᩴ;

.field public static final enum MICRO_OF_DAY:Ll/ᩴۗᩴ;

.field public static final enum MICRO_OF_SECOND:Ll/ᩴۗᩴ;

.field public static final enum MILLI_OF_DAY:Ll/ᩴۗᩴ;

.field public static final enum MILLI_OF_SECOND:Ll/ᩴۗᩴ;

.field public static final enum MINUTE_OF_DAY:Ll/ᩴۗᩴ;

.field public static final enum MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

.field public static final enum MONTH_OF_YEAR:Ll/ᩴۗᩴ;

.field public static final enum NANO_OF_DAY:Ll/ᩴۗᩴ;

.field public static final enum NANO_OF_SECOND:Ll/ᩴۗᩴ;

.field public static final enum OFFSET_SECONDS:Ll/ᩴۗᩴ;

.field public static final enum PROLEPTIC_MONTH:Ll/ᩴۗᩴ;

.field public static final enum SECOND_OF_DAY:Ll/ᩴۗᩴ;

.field public static final enum SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

.field public static final enum YEAR:Ll/ᩴۗᩴ;

.field public static final enum YEAR_OF_ERA:Ll/ᩴۗᩴ;

.field public static final synthetic c:[Ll/ᩴۗᩴ;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ll/᩺ۗᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 47

    .line 120
    new-instance v7, Ll/ᩴۗᩴ;

    sget-object v8, Ll/ۡۗᩴ;->NANOS:Ll/ۡۗᩴ;

    sget-object v17, Ll/ۡۗᩴ;->SECONDS:Ll/ۡۗᩴ;

    const-wide/16 v14, 0x0

    const-wide/32 v0, 0x3b9ac9ff

    invoke-static {v14, v15, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "NANO_OF_SECOND"

    const/4 v2, 0x0

    const-string v3, "NanoOfSecond"

    move-object v0, v7

    move-object v4, v8

    move-object/from16 v5, v17

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v7, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    .line 136
    new-instance v18, Ll/ᩴۗᩴ;

    sget-object v27, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    const-wide v0, 0x4e94914effffL

    invoke-static {v14, v15, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "NANO_OF_DAY"

    const/4 v2, 0x1

    const-string v3, "NanoOfDay"

    move-object/from16 v0, v18

    move-object/from16 v5, v27

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v18, Ll/ᩴۗᩴ;->NANO_OF_DAY:Ll/ᩴۗᩴ;

    .line 156
    new-instance v8, Ll/ᩴۗᩴ;

    sget-object v9, Ll/ۡۗᩴ;->MICROS:Ll/ۡۗᩴ;

    const-wide/32 v0, 0xf423f

    invoke-static {v14, v15, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "MICRO_OF_SECOND"

    const/4 v2, 0x2

    const-string v3, "MicroOfSecond"

    move-object v0, v8

    move-object v4, v9

    move-object/from16 v5, v17

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v8, Ll/ᩴۗᩴ;->MICRO_OF_SECOND:Ll/ᩴۗᩴ;

    .line 175
    new-instance v28, Ll/ᩴۗᩴ;

    const-wide v0, 0x141dd75fffL

    invoke-static {v14, v15, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "MICRO_OF_DAY"

    const/4 v2, 0x3

    const-string v3, "MicroOfDay"

    move-object/from16 v0, v28

    move-object/from16 v5, v27

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v28, Ll/ᩴۗᩴ;->MICRO_OF_DAY:Ll/ᩴۗᩴ;

    .line 195
    new-instance v29, Ll/ᩴۗᩴ;

    sget-object v9, Ll/ۡۗᩴ;->MILLIS:Ll/ۡۗᩴ;

    const-wide/16 v0, 0x3e7

    invoke-static {v14, v15, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "MILLI_OF_SECOND"

    const/4 v2, 0x4

    const-string v3, "MilliOfSecond"

    move-object/from16 v0, v29

    move-object v4, v9

    move-object/from16 v5, v17

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v29, Ll/ᩴۗᩴ;->MILLI_OF_SECOND:Ll/ᩴۗᩴ;

    .line 214
    new-instance v30, Ll/ᩴۗᩴ;

    const-wide/32 v0, 0x5265bff

    invoke-static {v14, v15, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "MILLI_OF_DAY"

    const/4 v2, 0x5

    const-string v3, "MilliOfDay"

    move-object/from16 v0, v30

    move-object/from16 v5, v27

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v30, Ll/ᩴۗᩴ;->MILLI_OF_DAY:Ll/ᩴۗᩴ;

    .line 224
    new-instance v31, Ll/ᩴۗᩴ;

    sget-object v32, Ll/ۡۗᩴ;->MINUTES:Ll/ۡۗᩴ;

    const-wide/16 v5, 0x3b

    invoke-static {v14, v15, v5, v6}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v0

    const/16 v16, 0x0

    const-string v10, "SECOND_OF_MINUTE"

    const/4 v11, 0x6

    const-string v12, "SecondOfMinute"

    move-object/from16 v9, v31

    move-object/from16 v13, v17

    move-wide v3, v14

    move-object/from16 v14, v32

    move-object v15, v0

    invoke-direct/range {v9 .. v16}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V

    sput-object v31, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    .line 236
    new-instance v9, Ll/ᩴۗᩴ;

    const-wide/32 v0, 0x1517f

    invoke-static {v3, v4, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v10

    const-string v1, "SECOND_OF_DAY"

    const/4 v2, 0x7

    const-string v11, "SecondOfDay"

    move-object v0, v9

    move-wide v12, v3

    move-object v3, v11

    move-object/from16 v4, v17

    move-wide v14, v5

    move-object/from16 v5, v27

    move-object v6, v10

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v9, Ll/ᩴۗᩴ;->SECOND_OF_DAY:Ll/ᩴۗᩴ;

    .line 246
    new-instance v10, Ll/ᩴۗᩴ;

    sget-object v11, Ll/ۡۗᩴ;->HOURS:Ll/ۡۗᩴ;

    invoke-static {v12, v13, v14, v15}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v25

    const/16 v26, 0x0

    const-string v20, "MINUTE_OF_HOUR"

    const/16 v21, 0x8

    const-string v22, "MinuteOfHour"

    move-object/from16 v19, v10

    move-object/from16 v23, v32

    move-object/from16 v24, v11

    invoke-direct/range {v19 .. v26}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V

    sput-object v10, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    .line 257
    new-instance v14, Ll/ᩴۗᩴ;

    const-wide/16 v0, 0x59f

    invoke-static {v12, v13, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "MINUTE_OF_DAY"

    const/16 v2, 0x9

    const-string v3, "MinuteOfDay"

    move-object v0, v14

    move-object/from16 v4, v32

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v14, Ll/ᩴۗᩴ;->MINUTE_OF_DAY:Ll/ᩴۗᩴ;

    .line 273
    new-instance v15, Ll/ᩴۗᩴ;

    sget-object v16, Ll/ۡۗᩴ;->HALF_DAYS:Ll/ۡۗᩴ;

    const-wide/16 v0, 0xb

    invoke-static {v12, v13, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "HOUR_OF_AMPM"

    const/16 v2, 0xa

    const-string v3, "HourOfAmPm"

    move-object v0, v15

    move-object v4, v11

    move-object/from16 v5, v16

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v15, Ll/ᩴۗᩴ;->HOUR_OF_AMPM:Ll/ᩴۗᩴ;

    .line 289
    new-instance v32, Ll/ᩴۗᩴ;

    const-wide/16 v5, 0x1

    const-wide/16 v3, 0xc

    invoke-static {v5, v6, v3, v4}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v19

    const-string v1, "CLOCK_HOUR_OF_AMPM"

    const/16 v2, 0xb

    const-string v20, "ClockHourOfAmPm"

    move-object/from16 v0, v32

    move-object/from16 v3, v20

    move-object v4, v11

    move-object/from16 v5, v16

    move-object/from16 v6, v19

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v32, Ll/ᩴۗᩴ;->CLOCK_HOUR_OF_AMPM:Ll/ᩴۗᩴ;

    .line 306
    new-instance v37, Ll/ᩴۗᩴ;

    const-wide/16 v0, 0x17

    invoke-static {v12, v13, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v25

    const/16 v38, 0x0

    const-string v20, "HOUR_OF_DAY"

    const/16 v21, 0xc

    const-string v22, "HourOfDay"

    move-object/from16 v19, v37

    move-object/from16 v23, v11

    move-object/from16 v24, v27

    move/from16 v26, v38

    invoke-direct/range {v19 .. v26}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V

    sput-object v37, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    .line 322
    new-instance v39, Ll/ᩴۗᩴ;

    const-wide/16 v0, 0x18

    const-wide/16 v5, 0x1

    invoke-static {v5, v6, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v19

    const-string v1, "CLOCK_HOUR_OF_DAY"

    const/16 v2, 0xd

    const-string v3, "ClockHourOfDay"

    move-object/from16 v0, v39

    move-wide v12, v5

    move-object/from16 v5, v27

    move-object/from16 v6, v19

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v39, Ll/ᩴۗᩴ;->CLOCK_HOUR_OF_DAY:Ll/ᩴۗᩴ;

    .line 335
    new-instance v11, Ll/ᩴۗᩴ;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, v12, v13}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v25

    const-string v20, "AMPM_OF_DAY"

    const/16 v21, 0xe

    const-string v22, "AmPmOfDay"

    move-object/from16 v19, v11

    move-object/from16 v23, v16

    invoke-direct/range {v19 .. v26}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V

    sput-object v11, Ll/ᩴۗᩴ;->AMPM_OF_DAY:Ll/ᩴۗᩴ;

    .line 351
    new-instance v16, Ll/ᩴۗᩴ;

    sget-object v35, Ll/ۡۗᩴ;->WEEKS:Ll/ۡۗᩴ;

    const-wide/16 v5, 0x7

    invoke-static {v12, v13, v5, v6}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v25

    const-string v20, "DAY_OF_WEEK"

    const/16 v21, 0xf

    const-string v22, "DayOfWeek"

    move-object/from16 v19, v16

    move-object/from16 v23, v27

    move-object/from16 v24, v35

    invoke-direct/range {v19 .. v26}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V

    sput-object v16, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    .line 369
    new-instance v36, Ll/ᩴۗᩴ;

    const-string v3, "AlignedDayOfWeekInMonth"

    invoke-static {v12, v13, v5, v6}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v19

    const-string v1, "ALIGNED_DAY_OF_WEEK_IN_MONTH"

    const/16 v2, 0x10

    move-object/from16 v0, v36

    move-object/from16 v4, v27

    move-wide v12, v5

    move-object/from16 v5, v35

    move-object/from16 v6, v19

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v36, Ll/ᩴۗᩴ;->ALIGNED_DAY_OF_WEEK_IN_MONTH:Ll/ᩴۗᩴ;

    .line 387
    new-instance v40, Ll/ᩴۗᩴ;

    const-string v3, "AlignedDayOfWeekInYear"

    const-wide/16 v0, 0x1

    invoke-static {v0, v1, v12, v13}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "ALIGNED_DAY_OF_WEEK_IN_YEAR"

    const/16 v2, 0x11

    move-object/from16 v0, v40

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v40, Ll/ᩴۗᩴ;->ALIGNED_DAY_OF_WEEK_IN_YEAR:Ll/ᩴۗᩴ;

    .line 400
    new-instance v12, Ll/ᩴۗᩴ;

    sget-object v13, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    const-wide/16 v2, 0x1c

    const-wide/16 v4, 0x1f

    const-wide/16 v0, 0x1

    .line 147
    invoke-static/range {v0 .. v5}, Ll/᩺ۗᩴ;->g(JJJ)Ll/᩺ۗᩴ;

    move-result-object v25

    const-string v20, "DAY_OF_MONTH"

    const/16 v21, 0x12

    const-string v22, "DayOfMonth"

    move-object/from16 v19, v12

    move-object/from16 v24, v13

    .line 400
    invoke-direct/range {v19 .. v26}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V

    sput-object v12, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    .line 418
    new-instance v38, Ll/ᩴۗᩴ;

    sget-object v41, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    const-wide/16 v2, 0x16d

    const-wide/16 v4, 0x16e

    .line 147
    invoke-static/range {v0 .. v5}, Ll/᩺ۗᩴ;->g(JJJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "DAY_OF_YEAR"

    const/16 v2, 0x13

    const-string v3, "DayOfYear"

    move-object/from16 v0, v38

    move-object/from16 v4, v27

    move-object/from16 v5, v41

    .line 418
    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v38, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    .line 431
    new-instance v42, Ll/ᩴۗᩴ;

    sget-object v43, Ll/ۡۗᩴ;->FOREVER:Ll/ۡۗᩴ;

    const-wide v0, -0x550a313cdaL

    const-wide v2, 0x550a1b48f7L

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "EPOCH_DAY"

    const/16 v2, 0x14

    const-string v3, "EpochDay"

    move-object/from16 v0, v42

    move-object/from16 v5, v43

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v42, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    .line 447
    new-instance v27, Ll/ᩴۗᩴ;

    const-wide/16 v2, 0x4

    const-wide/16 v4, 0x5

    const-wide/16 v44, 0x1

    move-wide/from16 v0, v44

    .line 147
    invoke-static/range {v0 .. v5}, Ll/᩺ۗᩴ;->g(JJJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "ALIGNED_WEEK_OF_MONTH"

    const/16 v2, 0x15

    const-string v3, "AlignedWeekOfMonth"

    move-object/from16 v0, v27

    move-object/from16 v4, v35

    move-object v5, v13

    .line 447
    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v27, Ll/ᩴۗᩴ;->ALIGNED_WEEK_OF_MONTH:Ll/ᩴۗᩴ;

    .line 463
    new-instance v46, Ll/ᩴۗᩴ;

    const-wide/16 v0, 0x35

    const-wide/16 v2, 0x1

    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "ALIGNED_WEEK_OF_YEAR"

    const/16 v2, 0x16

    const-string v3, "AlignedWeekOfYear"

    move-object/from16 v0, v46

    move-object/from16 v5, v41

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v46, Ll/ᩴۗᩴ;->ALIGNED_WEEK_OF_YEAR:Ll/ᩴۗᩴ;

    .line 474
    new-instance v35, Ll/ᩴۗᩴ;

    const-wide/16 v0, 0x1

    const-wide/16 v2, 0xc

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v25

    const/16 v26, 0x0

    const-string v20, "MONTH_OF_YEAR"

    const/16 v21, 0x17

    const-string v22, "MonthOfYear"

    move-object/from16 v19, v35

    move-object/from16 v23, v13

    move-object/from16 v24, v41

    invoke-direct/range {v19 .. v26}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V

    sput-object v35, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    .line 494
    new-instance v33, Ll/ᩴۗᩴ;

    const-wide v0, -0x2cb4177f4L

    const-wide v2, 0x2cb4177ffL

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "PROLEPTIC_MONTH"

    const/16 v2, 0x18

    const-string v3, "ProlepticMonth"

    move-object/from16 v0, v33

    move-object v4, v13

    move-object/from16 v5, v43

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v33, Ll/ᩴۗᩴ;->PROLEPTIC_MONTH:Ll/ᩴۗᩴ;

    .line 529
    new-instance v13, Ll/ᩴۗᩴ;

    const-wide/32 v21, 0x3b9ac9ff

    const-wide/32 v23, 0x3b9aca00

    move-wide/from16 v19, v44

    .line 147
    invoke-static/range {v19 .. v24}, Ll/᩺ۗᩴ;->g(JJJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "YEAR_OF_ERA"

    const/16 v2, 0x19

    const-string v3, "YearOfEra"

    move-object v0, v13

    move-object/from16 v4, v41

    .line 529
    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v13, Ll/ᩴۗᩴ;->YEAR_OF_ERA:Ll/ᩴۗᩴ;

    .line 553
    new-instance v34, Ll/ᩴۗᩴ;

    const-wide/32 v0, -0x3b9ac9ff

    const-wide/32 v2, 0x3b9ac9ff

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v25

    const-string v20, "YEAR"

    const/16 v21, 0x1a

    const-string v22, "Year"

    move-object/from16 v19, v34

    move-object/from16 v23, v41

    move-object/from16 v24, v43

    invoke-direct/range {v19 .. v26}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V

    sput-object v34, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    .line 570
    new-instance v41, Ll/ᩴۗᩴ;

    const-wide/16 v0, 0x0

    sget-object v23, Ll/ۡۗᩴ;->ERAS:Ll/ۡۗᩴ;

    const-wide/16 v2, 0x1

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v25

    const-string v20, "ERA"

    const/16 v21, 0x1b

    const-string v22, "Era"

    move-object/from16 v19, v41

    invoke-direct/range {v19 .. v26}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V

    sput-object v41, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    .line 585
    new-instance v19, Ll/ᩴۗᩴ;

    const-wide/high16 v0, -0x8000000000000000L

    const-wide v2, 0x7fffffffffffffffL

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "INSTANT_SECONDS"

    const/16 v2, 0x1c

    const-string v3, "InstantSeconds"

    move-object/from16 v0, v19

    move-object/from16 v4, v17

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v19, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    .line 599
    new-instance v20, Ll/ᩴۗᩴ;

    const-wide/32 v0, -0xfd20

    const-wide/32 v2, 0xfd20

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v6

    const-string v1, "OFFSET_SECONDS"

    const/16 v2, 0x1d

    const-string v3, "OffsetSeconds"

    move-object/from16 v0, v20

    invoke-direct/range {v0 .. v6}, Ll/ᩴۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V

    sput-object v20, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    const/16 v0, 0x1e

    new-array v0, v0, [Ll/ᩴۗᩴ;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    const/4 v1, 0x1

    aput-object v18, v0, v1

    const/4 v1, 0x2

    aput-object v8, v0, v1

    const/4 v1, 0x3

    aput-object v28, v0, v1

    const/4 v1, 0x4

    aput-object v29, v0, v1

    const/4 v1, 0x5

    aput-object v30, v0, v1

    const/4 v1, 0x6

    aput-object v31, v0, v1

    const/4 v1, 0x7

    aput-object v9, v0, v1

    const/16 v1, 0x8

    aput-object v10, v0, v1

    const/16 v1, 0x9

    aput-object v14, v0, v1

    const/16 v1, 0xa

    aput-object v15, v0, v1

    const/16 v1, 0xb

    aput-object v32, v0, v1

    const/16 v1, 0xc

    aput-object v37, v0, v1

    const/16 v1, 0xd

    aput-object v39, v0, v1

    const/16 v1, 0xe

    aput-object v11, v0, v1

    const/16 v1, 0xf

    aput-object v16, v0, v1

    const/16 v1, 0x10

    aput-object v36, v0, v1

    const/16 v1, 0x11

    aput-object v40, v0, v1

    const/16 v1, 0x12

    aput-object v12, v0, v1

    const/16 v1, 0x13

    aput-object v38, v0, v1

    const/16 v1, 0x14

    aput-object v42, v0, v1

    const/16 v1, 0x15

    aput-object v27, v0, v1

    const/16 v1, 0x16

    aput-object v46, v0, v1

    const/16 v1, 0x17

    aput-object v35, v0, v1

    const/16 v1, 0x18

    aput-object v33, v0, v1

    const/16 v1, 0x19

    aput-object v13, v0, v1

    const/16 v1, 0x1a

    aput-object v34, v0, v1

    const/16 v1, 0x1b

    aput-object v41, v0, v1

    const/16 v1, 0x1c

    aput-object v19, v0, v1

    const/16 v1, 0x1d

    aput-object v20, v0, v1

    .line 98
    sput-object v0, Ll/ᩴۗᩴ;->c:[Ll/ᩴۗᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;)V
    .locals 0

    .line 607
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 608
    iput-object p3, p0, Ll/ᩴۗᩴ;->a:Ljava/lang/String;

    .line 611
    iput-object p6, p0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;Ll/᩺ۗᩴ;I)V
    .locals 0

    .line 616
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 617
    iput-object p3, p0, Ll/ᩴۗᩴ;->a:Ljava/lang/String;

    .line 620
    iput-object p6, p0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ᩴۗᩴ;
    .locals 1

    .line 98
    const-class v0, Ll/ᩴۗᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ᩴۗᩴ;

    return-object p0
.end method

.method public static values()[Ll/ᩴۗᩴ;
    .locals 1

    .line 98
    sget-object v0, Ll/ᩴۗᩴ;->c:[Ll/ᩴۗᩴ;

    invoke-virtual {v0}, [Ll/ᩴۗᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩴۗᩴ;

    return-object v0
.end method


# virtual methods
.method public final C(Ll/ۖۗᩴ;)J
    .locals 2

    .line 748
    invoke-interface {p1, p0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;
    .locals 0

    .line 754
    invoke-interface {p1, p2, p3, p0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final T(J)V
    .locals 1

    .line 669
    iget-object v0, p0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 713
    invoke-virtual {v0, p1, p2, p0}, Ll/᩺ۗᩴ;->b(JLl/ۤۗᩴ;)V

    return-void
.end method

.method public final V()Z
    .locals 2

    .line 694
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isDateBased()Z
    .locals 2

    .line 682
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l(Ll/ۖۗᩴ;)Z
    .locals 0

    .line 738
    invoke-interface {p1, p0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result p1

    return p1
.end method

.method public final m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;
    .locals 0

    .line 743
    invoke-interface {p1, p0}, Ll/ۖۗᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic n(Ljava/util/Map;Ll/ܽۙᩴ;Ll/ܿۙᩴ;)Ll/ۖۗᩴ;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final s()Ll/᩺ۗᩴ;
    .locals 1

    .line 669
    iget-object v0, p0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 760
    iget-object v0, p0, Ll/ᩴۗᩴ;->a:Ljava/lang/String;

    return-object v0
.end method
