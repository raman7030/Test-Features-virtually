.class public final Ll/ᩳۚ֫;
.super Ljava/lang/Object;
.source "Y8PY"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:[Ljava/lang/String;

.field public static final ܽ:[B

.field public static final ᩳ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 40
    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳۚ֫;->ܽ:[B

    const-string v0, "B"

    const-string v1, "C"

    const-string v2, ""

    const-string v3, "A"

    .line 41
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ᩳۚ֫;->ۧ:[Ljava/lang/String;

    const-string v0, "^\\D?(\\d+)$"

    .line 70
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩳۚ֫;->ᩳ:Ljava/util/regex/Pattern;

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public static ֫(Ljava/lang/String;[Ljava/lang/String;Ll/᩷ᩴ֫;)Landroid/util/Pair;
    .locals 8

    .line 420
    array-length v0, p1

    const-string v1, "Ignoring malformed HEVC codec string: "

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-ge v0, v3, :cond_0

    .line 0
    invoke-static {v1, p0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 426
    :cond_0
    sget-object v0, Ll/ᩳۚ֫;->ᩳ:Ljava/util/regex/Pattern;

    const/4 v4, 0x1

    aget-object v5, p1, v4

    invoke-virtual {v0, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 427
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-nez v5, :cond_1

    .line 0
    invoke-static {v1, p0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 431
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "1"

    .line 433
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/16 v5, 0x1000

    const/4 v6, 0x6

    if-eqz v0, :cond_2

    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const-string v0, "2"

    .line 435
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p2, :cond_3

    .line 436
    iget p0, p2, Ll/᩷ᩴ֫;->ᩳ:I

    if-ne p0, v6, :cond_3

    const/16 p0, 0x1000

    goto :goto_0

    :cond_3
    const/4 p0, 0x2

    goto :goto_0

    :cond_4
    const-string p2, "6"

    .line 445
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_21

    const/4 p0, 0x6

    :goto_0
    const/4 p2, 0x3

    .line 452
    aget-object p1, p1, p2

    if-nez p1, :cond_5

    goto/16 :goto_3

    .line 1007
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/16 v0, 0x10

    const/16 v7, 0x8

    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string p2, "L186"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v6, 0x19

    goto/16 :goto_2

    :sswitch_1
    const-string p2, "L183"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v6, 0x18

    goto/16 :goto_2

    :sswitch_2
    const-string p2, "L180"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v6, 0x17

    goto/16 :goto_2

    :sswitch_3
    const-string p2, "L156"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v6, 0x16

    goto/16 :goto_2

    :sswitch_4
    const-string p2, "L153"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v6, 0x15

    goto/16 :goto_2

    :sswitch_5
    const-string p2, "L150"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v6, 0x14

    goto/16 :goto_2

    :sswitch_6
    const-string p2, "L123"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v6, 0x13

    goto/16 :goto_2

    :sswitch_7
    const-string p2, "L120"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v6, 0x12

    goto/16 :goto_2

    :sswitch_8
    const-string p2, "H186"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v6, 0x11

    goto/16 :goto_2

    :sswitch_9
    const-string p2, "H183"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_f

    goto/16 :goto_1

    :cond_f
    const/16 v6, 0x10

    goto/16 :goto_2

    :sswitch_a
    const-string p2, "H180"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v6, 0xf

    goto/16 :goto_2

    :sswitch_b
    const-string p2, "H156"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_11

    goto/16 :goto_1

    :cond_11
    const/16 v6, 0xe

    goto/16 :goto_2

    :sswitch_c
    const-string p2, "H153"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_12

    goto/16 :goto_1

    :cond_12
    const/16 v6, 0xd

    goto/16 :goto_2

    :sswitch_d
    const-string p2, "H150"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_13

    goto/16 :goto_1

    :cond_13
    const/16 v6, 0xc

    goto/16 :goto_2

    :sswitch_e
    const-string p2, "H123"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_14

    goto/16 :goto_1

    :cond_14
    const/16 v6, 0xb

    goto/16 :goto_2

    :sswitch_f
    const-string p2, "H120"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_15

    goto/16 :goto_1

    :cond_15
    const/16 v6, 0xa

    goto/16 :goto_2

    :sswitch_10
    const-string p2, "L93"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_16

    goto/16 :goto_1

    :cond_16
    const/16 v6, 0x9

    goto/16 :goto_2

    :sswitch_11
    const-string p2, "L90"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_17

    goto/16 :goto_1

    :cond_17
    const/16 v6, 0x8

    goto/16 :goto_2

    :sswitch_12
    const-string p2, "L63"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_18

    goto :goto_1

    :cond_18
    const/4 v6, 0x7

    goto :goto_2

    :sswitch_13
    const-string p2, "L60"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1f

    goto :goto_1

    :sswitch_14
    const-string p2, "L30"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_19

    goto :goto_1

    :cond_19
    const/4 v6, 0x5

    goto :goto_2

    :sswitch_15
    const-string p2, "H93"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1a

    goto :goto_1

    :cond_1a
    const/4 v6, 0x4

    goto :goto_2

    :sswitch_16
    const-string p2, "H90"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1b

    goto :goto_1

    :cond_1b
    const/4 v6, 0x3

    goto :goto_2

    :sswitch_17
    const-string p2, "H63"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1c

    goto :goto_1

    :cond_1c
    const/4 v6, 0x2

    goto :goto_2

    :sswitch_18
    const-string p2, "H60"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1d

    goto :goto_1

    :cond_1d
    const/4 v6, 0x1

    goto :goto_2

    :sswitch_19
    const-string p2, "H30"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1e

    goto :goto_1

    :cond_1e
    const/4 v6, 0x0

    goto :goto_2

    :goto_1
    const/4 v6, -0x1

    :cond_1f
    :goto_2
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const/high16 p2, 0x1000000

    .line 1033
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_1
    const/high16 p2, 0x400000

    .line 1031
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_2
    const/high16 p2, 0x100000

    .line 1029
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_3
    const/high16 p2, 0x40000

    .line 1027
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_4
    const/high16 p2, 0x10000

    .line 1025
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_5
    const/16 p2, 0x4000

    .line 1023
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    .line 1021
    :pswitch_6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_7
    const/16 p2, 0x400

    .line 1019
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_8
    const/high16 p2, 0x2000000

    .line 1059
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_9
    const/high16 p2, 0x800000

    .line 1057
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_a
    const/high16 p2, 0x200000

    .line 1055
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_4

    :pswitch_b
    const/high16 p2, 0x80000

    .line 1053
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :pswitch_c
    const/high16 p2, 0x20000

    .line 1051
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :pswitch_d
    const p2, 0x8000

    .line 1049
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :pswitch_e
    const/16 p2, 0x2000

    .line 1047
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :pswitch_f
    const/16 p2, 0x800

    .line 1045
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :pswitch_10
    const/16 p2, 0x100

    .line 1017
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :pswitch_11
    const/16 p2, 0x40

    .line 1015
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    .line 1013
    :pswitch_12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    .line 1011
    :pswitch_13
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    .line 1009
    :pswitch_14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :pswitch_15
    const/16 p2, 0x200

    .line 1043
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :pswitch_16
    const/16 p2, 0x80

    .line 1041
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :pswitch_17
    const/16 p2, 0x20

    .line 1039
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    .line 1037
    :pswitch_18
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    .line 1035
    :pswitch_19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :goto_3
    move-object p2, v2

    :goto_4
    if-nez p2, :cond_20

    const-string p0, "Unknown HEVC level string: "

    .line 0
    invoke-static {p0, p1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 458
    :cond_20
    new-instance p1, Landroid/util/Pair;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {p1, p0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_21
    const-string p1, "Unknown HEVC profile string: "

    .line 0
    invoke-static {p1, p0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x114a5 -> :sswitch_19
        0x11502 -> :sswitch_18
        0x11505 -> :sswitch_17
        0x1155f -> :sswitch_16
        0x11562 -> :sswitch_15
        0x123a9 -> :sswitch_14
        0x12406 -> :sswitch_13
        0x12409 -> :sswitch_12
        0x12463 -> :sswitch_11
        0x12466 -> :sswitch_10
        0x2178e7 -> :sswitch_f
        0x2178ea -> :sswitch_e
        0x217944 -> :sswitch_d
        0x217947 -> :sswitch_c
        0x21794a -> :sswitch_b
        0x2179a1 -> :sswitch_a
        0x2179a4 -> :sswitch_9
        0x2179a7 -> :sswitch_8
        0x234a63 -> :sswitch_7
        0x234a66 -> :sswitch_6
        0x234ac0 -> :sswitch_5
        0x234ac3 -> :sswitch_4
        0x234ac6 -> :sswitch_3
        0x234b1d -> :sswitch_2
        0x234b20 -> :sswitch_1
        0x234b23 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
.end method

.method public static ֫(Ll/۠ᩴ֫;)Landroid/util/Pair;
    .locals 27

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 806
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    .line 1072
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 375
    iget-object v4, v0, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    iget-object v5, v0, Ll/۠ᩴ֫;->᩻:Ll/᩷ᩴ֫;

    if-nez v4, :cond_0

    const/4 v0, 0x0

    goto/16 :goto_1b

    :cond_0
    const-string v6, "\\."

    .line 378
    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    const-string v7, "video/dolby-vision"

    .line 380
    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v8, 0x200

    const/16 v9, 0x100

    const/16 v10, 0x80

    const/16 v11, 0x40

    const/16 v12, 0x20

    const/16 v14, 0x8

    const/16 v15, 0x10

    const/16 v16, 0x400

    const/16 v17, 0x4

    const/16 v18, 0x800

    const/4 v7, 0x3

    const/16 v19, 0x2

    if-eqz v0, :cond_1f

    .line 1076
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 1078
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 1080
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 1082
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 1084
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 1086
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 1088
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 1090
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 1092
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 1074
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    .line 626
    array-length v2, v6

    const-string v13, "Ignoring malformed Dolby Vision codec string: "

    if-ge v2, v7, :cond_1

    .line 0
    invoke-static {v13, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    return-object v2

    :cond_1
    const/4 v2, 0x0

    .line 632
    sget-object v7, Ll/ᩳۚ֫;->ᩳ:Ljava/util/regex/Pattern;

    move-object/from16 v16, v0

    const/4 v2, 0x1

    aget-object v0, v6, v2

    invoke-virtual {v7, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 633
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v7

    if-nez v7, :cond_2

    .line 0
    invoke-static {v13, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    .line 637
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "10"

    const-string v4, "09"

    const-string v7, "08"

    const-string v13, "07"

    move-object/from16 v19, v1

    const-string v1, "06"

    move-object/from16 v20, v5

    const-string v5, "05"

    const/16 v21, 0x2

    move-object/from16 v22, v8

    const-string v8, "04"

    move-object/from16 v23, v9

    const-string v9, "03"

    move-object/from16 v24, v10

    const-string v10, "02"

    move-object/from16 v25, v11

    const-string v11, "01"

    if-nez v0, :cond_3

    move-object/from16 v26, v12

    goto/16 :goto_3

    .line 1070
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v26

    sparse-switch v26, :sswitch_data_0

    :goto_0
    move-object/from16 v26, v12

    goto/16 :goto_1

    :sswitch_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_4

    goto :goto_0

    :cond_4
    const/16 v26, 0xa

    move-object/from16 v26, v12

    const/16 v12, 0xa

    goto/16 :goto_2

    :sswitch_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_5

    goto :goto_0

    :cond_5
    const/16 v26, 0x9

    move-object/from16 v26, v12

    const/16 v12, 0x9

    goto/16 :goto_2

    :sswitch_2
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_6

    goto :goto_0

    :cond_6
    const/16 v26, 0x8

    move-object/from16 v26, v12

    const/16 v12, 0x8

    goto/16 :goto_2

    :sswitch_3
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_7

    goto :goto_0

    :cond_7
    const/16 v26, 0x7

    move-object/from16 v26, v12

    const/4 v12, 0x7

    goto/16 :goto_2

    :sswitch_4
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_8

    goto :goto_0

    :cond_8
    const/16 v26, 0x6

    move-object/from16 v26, v12

    const/4 v12, 0x6

    goto :goto_2

    :sswitch_5
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_9

    goto :goto_0

    :cond_9
    const/16 v26, 0x5

    move-object/from16 v26, v12

    const/4 v12, 0x5

    goto :goto_2

    :sswitch_6
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_a

    goto :goto_0

    :cond_a
    const/16 v26, 0x4

    move-object/from16 v26, v12

    const/4 v12, 0x4

    goto :goto_2

    :sswitch_7
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_b

    goto :goto_0

    :cond_b
    const/16 v26, 0x3

    move-object/from16 v26, v12

    const/4 v12, 0x3

    goto :goto_2

    :sswitch_8
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_c

    goto :goto_0

    :cond_c
    const/16 v26, 0x2

    move-object/from16 v26, v12

    const/4 v12, 0x2

    goto :goto_2

    :sswitch_9
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-nez v26, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v26, 0x1

    move-object/from16 v26, v12

    const/4 v12, 0x1

    goto :goto_2

    :sswitch_a
    move-object/from16 v26, v12

    const-string v12, "00"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    goto :goto_1

    :cond_e
    const/4 v12, 0x0

    goto :goto_2

    :goto_1
    const/4 v12, -0x1

    :goto_2
    packed-switch v12, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    move-object v12, v14

    goto :goto_4

    :pswitch_1
    move-object/from16 v12, v22

    goto :goto_4

    :pswitch_2
    move-object/from16 v12, v23

    goto :goto_4

    :pswitch_3
    move-object/from16 v12, v24

    goto :goto_4

    :pswitch_4
    move-object/from16 v12, v25

    goto :goto_4

    :pswitch_5
    move-object/from16 v12, v26

    goto :goto_4

    :pswitch_6
    move-object/from16 v12, v20

    goto :goto_4

    :pswitch_7
    move-object/from16 v12, v19

    goto :goto_4

    :pswitch_8
    move-object/from16 v12, v16

    goto :goto_4

    :pswitch_9
    move-object v12, v15

    goto :goto_4

    :pswitch_a
    move-object v12, v3

    goto :goto_4

    :goto_3
    const/4 v12, 0x0

    :goto_4
    if-nez v12, :cond_f

    const-string v1, "Unknown Dolby Vision profile string: "

    .line 0
    invoke-static {v1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    .line 643
    :cond_f
    aget-object v0, v6, v21

    if-nez v0, :cond_10

    goto/16 :goto_7

    .line 1104
    :cond_10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_1

    goto/16 :goto_5

    :sswitch_b
    const-string v1, "13"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_5

    :cond_11
    const/16 v1, 0xc

    goto/16 :goto_6

    :sswitch_c
    const-string v1, "12"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_5

    :cond_12
    const/16 v1, 0xb

    goto/16 :goto_6

    :sswitch_d
    const-string v1, "11"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_5

    :cond_13
    const/16 v1, 0xa

    goto/16 :goto_6

    :sswitch_e
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto/16 :goto_5

    :cond_14
    const/16 v1, 0x9

    goto/16 :goto_6

    :sswitch_f
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto :goto_5

    :cond_15
    const/16 v1, 0x8

    goto :goto_6

    :sswitch_10
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto :goto_5

    :cond_16
    const/4 v1, 0x7

    goto :goto_6

    :sswitch_11
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_5

    :cond_17
    const/4 v1, 0x6

    goto :goto_6

    :sswitch_12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_5

    :cond_18
    const/4 v1, 0x5

    goto :goto_6

    :sswitch_13
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto :goto_5

    :cond_19
    const/4 v1, 0x4

    goto :goto_6

    :sswitch_14
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto :goto_5

    :cond_1a
    const/4 v1, 0x3

    goto :goto_6

    :sswitch_15
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto :goto_5

    :cond_1b
    const/4 v1, 0x2

    goto :goto_6

    :sswitch_16
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    goto :goto_5

    :cond_1c
    const/4 v1, 0x1

    goto :goto_6

    :sswitch_17
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    goto :goto_5

    :cond_1d
    const/4 v1, 0x0

    goto :goto_6

    :goto_5
    const/4 v1, -0x1

    :goto_6
    packed-switch v1, :pswitch_data_1

    goto :goto_7

    :pswitch_b
    const/16 v1, 0x1000

    .line 1130
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_8

    .line 1128
    :pswitch_c
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_8

    :pswitch_d
    move-object v3, v14

    goto :goto_8

    :pswitch_e
    move-object/from16 v3, v22

    goto :goto_8

    :pswitch_f
    move-object/from16 v3, v23

    goto :goto_8

    :pswitch_10
    move-object/from16 v3, v24

    goto :goto_8

    :pswitch_11
    move-object/from16 v3, v25

    goto :goto_8

    :pswitch_12
    move-object/from16 v3, v26

    goto :goto_8

    :pswitch_13
    move-object/from16 v3, v20

    goto :goto_8

    :pswitch_14
    move-object/from16 v3, v19

    goto :goto_8

    :pswitch_15
    move-object/from16 v3, v16

    goto :goto_8

    :pswitch_16
    move-object v3, v15

    goto :goto_8

    :goto_7
    const/4 v3, 0x0

    :goto_8
    :pswitch_17
    if-nez v3, :cond_1e

    const-string v1, "Unknown Dolby Vision level string: "

    .line 0
    invoke-static {v1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    .line 649
    :cond_1e
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, v12, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1f
    const/4 v0, 0x0

    const/4 v2, 0x2

    const/4 v7, 0x1

    .line 383
    aget-object v0, v6, v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_2

    goto/16 :goto_9

    :sswitch_18
    const-string v8, "vp09"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_9

    :cond_20
    const/16 v0, 0x9

    goto/16 :goto_a

    :sswitch_19
    const-string v8, "s263"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_9

    :cond_21
    const/16 v0, 0x8

    goto/16 :goto_a

    :sswitch_1a
    const-string v8, "mp4a"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_9

    :cond_22
    const/4 v0, 0x7

    goto :goto_a

    :sswitch_1b
    const-string v8, "iamf"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto :goto_9

    :cond_23
    const/4 v0, 0x6

    goto :goto_a

    :sswitch_1c
    const-string v8, "hvc1"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_9

    :cond_24
    const/4 v0, 0x5

    goto :goto_a

    :sswitch_1d
    const-string v8, "hev1"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto :goto_9

    :cond_25
    const/4 v0, 0x4

    goto :goto_a

    :sswitch_1e
    const-string v8, "avc2"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto :goto_9

    :cond_26
    const/4 v0, 0x3

    goto :goto_a

    :sswitch_1f
    const-string v8, "avc1"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    goto :goto_9

    :cond_27
    const/4 v0, 0x2

    goto :goto_a

    :sswitch_20
    const-string v8, "av01"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    goto :goto_9

    :cond_28
    const/4 v0, 0x1

    goto :goto_a

    :sswitch_21
    const-string v8, "ac-4"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto :goto_9

    :cond_29
    const/4 v0, 0x0

    goto :goto_a

    :goto_9
    const/4 v0, -0x1

    :goto_a
    const/high16 v8, 0x10000

    const/16 v9, 0x14

    packed-switch v0, :pswitch_data_2

    :cond_2a
    const/4 v1, 0x0

    goto/16 :goto_1a

    .line 716
    :pswitch_18
    array-length v0, v6

    const-string v1, "Ignoring malformed VP9 codec string: "

    const/4 v3, 0x3

    if-ge v0, v3, :cond_2b

    .line 0
    invoke-static {v1, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    .line 723
    :cond_2b
    :try_start_0
    aget-object v0, v6, v7

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 724
    aget-object v2, v6, v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    if-eqz v0, :cond_2f

    if-eq v0, v2, :cond_2e

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2d

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2c

    const/4 v2, -0x1

    goto :goto_b

    :cond_2c
    const/16 v2, 0x8

    goto :goto_b

    :cond_2d
    const/4 v2, 0x4

    goto :goto_b

    :cond_2e
    const/4 v2, 0x2

    :cond_2f
    :goto_b
    const/4 v3, -0x1

    if-ne v2, v3, :cond_30

    const-string v1, "Unknown VP9 profile: "

    .line 0
    invoke-static {v0, v1}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    :cond_30
    const/16 v0, 0xa

    if-eq v1, v0, :cond_3a

    const/16 v0, 0xb

    if-eq v1, v0, :cond_39

    if-eq v1, v9, :cond_38

    const/16 v0, 0x15

    if-eq v1, v0, :cond_37

    const/16 v0, 0x1e

    if-eq v1, v0, :cond_36

    const/16 v0, 0x1f

    if-eq v1, v0, :cond_35

    const/16 v0, 0x28

    if-eq v1, v0, :cond_34

    const/16 v0, 0x29

    if-eq v1, v0, :cond_33

    const/16 v0, 0x32

    if-eq v1, v0, :cond_32

    const/16 v0, 0x33

    if-eq v1, v0, :cond_31

    const/4 v0, -0x1

    packed-switch v1, :pswitch_data_3

    const/4 v3, -0x1

    goto :goto_c

    :pswitch_19
    const/16 v3, 0x2000

    goto :goto_c

    :pswitch_1a
    const/16 v3, 0x1000

    goto :goto_c

    :pswitch_1b
    const/16 v3, 0x800

    goto :goto_c

    :cond_31
    const/4 v0, -0x1

    const/16 v3, 0x200

    goto :goto_c

    :cond_32
    const/4 v0, -0x1

    const/16 v3, 0x100

    goto :goto_c

    :cond_33
    const/4 v0, -0x1

    const/16 v3, 0x80

    goto :goto_c

    :cond_34
    const/4 v0, -0x1

    const/16 v3, 0x40

    goto :goto_c

    :cond_35
    const/4 v0, -0x1

    const/16 v3, 0x20

    goto :goto_c

    :cond_36
    const/4 v0, -0x1

    const/16 v3, 0x10

    goto :goto_c

    :cond_37
    const/4 v0, -0x1

    const/16 v3, 0x8

    goto :goto_c

    :cond_38
    const/4 v0, -0x1

    const/4 v3, 0x4

    goto :goto_c

    :cond_39
    const/4 v0, -0x1

    const/4 v3, 0x2

    goto :goto_c

    :cond_3a
    const/4 v0, -0x1

    const/4 v3, 0x1

    :goto_c
    if-ne v3, v0, :cond_3b

    const-string v0, "Unknown VP9 level: "

    invoke-static {v1, v0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    const/4 v2, 0x0

    return-object v2

    .line 740
    :cond_3b
    new-instance v0, Landroid/util/Pair;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :catch_0
    const/4 v2, 0x0

    .line 0
    invoke-static {v1, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 654
    :pswitch_1c
    new-instance v0, Landroid/util/Pair;

    .line 657
    invoke-direct {v0, v3, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 658
    array-length v1, v6

    const-string v2, "Ignoring malformed H263 codec string: "

    const/4 v3, 0x3

    if-ge v1, v3, :cond_3c

    .line 0
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3c
    const/4 v1, 0x1

    .line 664
    :try_start_1
    aget-object v1, v6, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v3, 0x2

    .line 665
    aget-object v3, v6, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 666
    new-instance v5, Landroid/util/Pair;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v5, v1, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v5

    .line 0
    :catch_1
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 792
    :pswitch_1d
    array-length v0, v6

    const-string v2, "Ignoring malformed MP4A codec string: "

    const/4 v3, 0x3

    if-eq v0, v3, :cond_3d

    .line 0
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    :cond_3d
    const/4 v0, 0x1

    .line 798
    :try_start_2
    aget-object v0, v6, v0

    invoke-static {v0, v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 799
    invoke-static {v0}, Ll/ۢ᩵֫;->֫(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "audio/mp4a-latm"

    .line 800
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2a

    const/4 v0, 0x2

    .line 802
    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v3, 0x11

    if-eq v0, v3, :cond_3f

    if-eq v0, v9, :cond_3e

    const/16 v3, 0x17

    if-eq v0, v3, :cond_3f

    const/16 v3, 0x1d

    if-eq v0, v3, :cond_3f

    const/16 v3, 0x27

    if-eq v0, v3, :cond_3f

    const/16 v3, 0x2a

    if-eq v0, v3, :cond_3f

    packed-switch v0, :pswitch_data_4

    const/4 v0, -0x1

    const/4 v3, -0x1

    goto :goto_d

    :pswitch_1e
    const/4 v0, -0x1

    const/4 v3, 0x6

    goto :goto_d

    :pswitch_1f
    const/4 v0, -0x1

    const/4 v3, 0x5

    goto :goto_d

    :pswitch_20
    const/4 v0, -0x1

    const/4 v3, 0x4

    goto :goto_d

    :pswitch_21
    const/4 v0, -0x1

    const/4 v3, 0x3

    goto :goto_d

    :pswitch_22
    const/4 v0, -0x1

    const/4 v3, 0x2

    goto :goto_d

    :pswitch_23
    const/4 v0, -0x1

    const/4 v3, 0x1

    goto :goto_d

    :cond_3e
    const/4 v0, -0x1

    const/16 v3, 0x14

    goto :goto_d

    :cond_3f
    const/4 v0, -0x1

    :goto_d
    if-eq v3, v0, :cond_2a

    .line 806
    new-instance v0, Landroid/util/Pair;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v3, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    .line 0
    :catch_2
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    return-object v2

    :pswitch_24
    const/4 v2, 0x0

    .line 852
    array-length v0, v6

    const/4 v3, 0x4

    if-ge v0, v3, :cond_40

    const-string v0, "Ignoring malformed IAMF codec string: "

    .line 0
    invoke-static {v0, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_40
    const/4 v0, 0x1

    .line 859
    :try_start_3
    aget-object v2, v6, v0

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    add-int/2addr v2, v15

    shl-int/2addr v0, v2

    const/4 v2, 0x3

    .line 869
    aget-object v2, v6, v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_3

    goto :goto_e

    :sswitch_22
    const-string v3, "mp4a"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_41

    goto :goto_e

    :cond_41
    const/4 v2, 0x3

    goto :goto_f

    :sswitch_23
    const-string v3, "ipcm"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_42

    goto :goto_e

    :cond_42
    const/4 v2, 0x2

    goto :goto_f

    :sswitch_24
    const-string v3, "fLaC"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_43

    goto :goto_e

    :cond_43
    const/4 v2, 0x1

    goto :goto_f

    :sswitch_25
    const-string v3, "Opus"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_44

    goto :goto_e

    :cond_44
    const/4 v2, 0x0

    goto :goto_f

    :goto_e
    const/4 v2, -0x1

    :goto_f
    packed-switch v2, :pswitch_data_5

    .line 883
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ignoring unknown codec identifier for IAMF auxiliary profile: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x3

    aget-object v1, v6, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    :pswitch_25
    const/4 v2, 0x2

    goto :goto_10

    :pswitch_26
    const/16 v2, 0x8

    goto :goto_10

    :pswitch_27
    const/4 v2, 0x4

    goto :goto_10

    :pswitch_28
    const/4 v2, 0x1

    .line 890
    :goto_10
    new-instance v3, Landroid/util/Pair;

    const/high16 v4, 0x1000000

    or-int/2addr v0, v4

    or-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v3, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v3

    :catch_3
    move-exception v0

    .line 861
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ignoring malformed primary profile in IAMF codec string: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    aget-object v2, v6, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    return-object v1

    .line 393
    :pswitch_29
    invoke-static {v4, v6, v5}, Ll/ᩳۚ֫;->֫(Ljava/lang/String;[Ljava/lang/String;Ll/᩷ᩴ֫;)Landroid/util/Pair;

    move-result-object v0

    return-object v0

    :pswitch_2a
    const/4 v1, 0x0

    .line 675
    array-length v0, v6

    const-string v2, "Ignoring malformed AVC codec string: "

    const/4 v3, 0x2

    if-ge v0, v3, :cond_45

    .line 0
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_45
    const/4 v0, 0x1

    .line 683
    :try_start_4
    aget-object v1, v6, v0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v5, 0x6

    if-ne v1, v5, :cond_46

    .line 685
    aget-object v1, v6, v0

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    .line 686
    aget-object v0, v6, v0

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_11

    .line 687
    :cond_46
    array-length v0, v6

    const/4 v1, 0x3

    if-lt v0, v1, :cond_50

    const/4 v0, 0x1

    .line 689
    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v0, 0x2

    .line 690
    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    :goto_11
    const/16 v2, 0x42

    if-eq v1, v2, :cond_4d

    const/16 v2, 0x4d

    if-eq v1, v2, :cond_4c

    const/16 v2, 0x58

    if-eq v1, v2, :cond_4b

    const/16 v2, 0x64

    if-eq v1, v2, :cond_4a

    const/16 v2, 0x6e

    if-eq v1, v2, :cond_49

    const/16 v2, 0x7a

    if-eq v1, v2, :cond_48

    const/16 v2, 0xf4

    if-eq v1, v2, :cond_47

    const/4 v2, -0x1

    goto :goto_12

    :cond_47
    const/16 v2, 0x40

    goto :goto_12

    :cond_48
    const/16 v2, 0x20

    goto :goto_12

    :cond_49
    const/16 v2, 0x10

    goto :goto_12

    :cond_4a
    const/16 v2, 0x8

    goto :goto_12

    :cond_4b
    const/4 v2, 0x4

    goto :goto_12

    :cond_4c
    const/4 v2, 0x2

    goto :goto_12

    :cond_4d
    const/4 v2, 0x1

    :goto_12
    const/4 v3, -0x1

    if-ne v2, v3, :cond_4e

    const-string v0, "Unknown AVC profile: "

    .line 0
    invoke-static {v1, v0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    :cond_4e
    packed-switch v0, :pswitch_data_6

    packed-switch v0, :pswitch_data_7

    packed-switch v0, :pswitch_data_8

    const/4 v1, -0x1

    packed-switch v0, :pswitch_data_9

    packed-switch v0, :pswitch_data_a

    const/4 v8, -0x1

    goto :goto_13

    :pswitch_2b
    const/4 v1, -0x1

    const/16 v8, 0x10

    goto :goto_13

    :pswitch_2c
    const/4 v1, -0x1

    const/16 v8, 0x8

    goto :goto_13

    :pswitch_2d
    const/4 v1, -0x1

    const/4 v8, 0x4

    goto :goto_13

    :pswitch_2e
    const/4 v1, -0x1

    const/4 v8, 0x1

    goto :goto_13

    :pswitch_2f
    const/4 v1, -0x1

    const/16 v8, 0x80

    goto :goto_13

    :pswitch_30
    const/4 v1, -0x1

    const/16 v8, 0x40

    goto :goto_13

    :pswitch_31
    const/4 v1, -0x1

    const/16 v8, 0x20

    goto :goto_13

    :pswitch_32
    const/4 v1, -0x1

    const/16 v8, 0x400

    goto :goto_13

    :pswitch_33
    const/4 v1, -0x1

    const/16 v8, 0x200

    goto :goto_13

    :pswitch_34
    const/4 v1, -0x1

    const/16 v8, 0x100

    goto :goto_13

    :pswitch_35
    const/16 v8, 0x2000

    goto :goto_13

    :pswitch_36
    const/16 v8, 0x1000

    goto :goto_13

    :pswitch_37
    const/16 v8, 0x800

    goto :goto_13

    :pswitch_38
    const v8, 0x8000

    goto :goto_13

    :pswitch_39
    const/16 v8, 0x4000

    :goto_13
    :pswitch_3a
    if-ne v8, v1, :cond_4f

    const-string v1, "Unknown AVC level: "

    invoke-static {v0, v1}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    .line 711
    :cond_4f
    new-instance v0, Landroid/util/Pair;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 693
    :cond_50
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_4

    const/4 v1, 0x0

    return-object v1

    :catch_4
    const/4 v1, 0x0

    .line 0
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_3b
    const/4 v1, 0x0

    .line 746
    array-length v0, v6

    const-string v2, "Ignoring malformed AV1 codec string: "

    const/4 v3, 0x4

    if-ge v0, v3, :cond_51

    .line 0
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_51
    const/4 v0, 0x1

    .line 754
    :try_start_6
    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    .line 755
    aget-object v3, v6, v1

    const/4 v7, 0x0

    invoke-virtual {v3, v7, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v3, 0x3

    .line 756
    aget-object v3, v6, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_5

    if-eqz v0, :cond_52

    const-string v1, "Unknown AV1 profile: "

    .line 0
    invoke-static {v0, v1}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    const/4 v3, 0x0

    return-object v3

    :cond_52
    const/4 v3, 0x0

    const/16 v0, 0x8

    if-eq v2, v0, :cond_53

    const/16 v4, 0xa

    if-eq v2, v4, :cond_53

    const-string v0, "Unknown AV1 bit depth: "

    invoke-static {v2, v0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    return-object v3

    :cond_53
    if-ne v2, v0, :cond_54

    const/4 v0, 0x1

    goto :goto_14

    :cond_54
    if-eqz v5, :cond_56

    .line 773
    iget-object v0, v5, Ll/᩷ᩴ֫;->ܳ:[B

    if-nez v0, :cond_55

    iget v0, v5, Ll/᩷ᩴ֫;->ᩳ:I

    const/4 v2, 0x7

    if-eq v0, v2, :cond_55

    const/4 v2, 0x6

    if-ne v0, v2, :cond_56

    :cond_55
    const/16 v0, 0x1000

    goto :goto_14

    :cond_56
    const/4 v0, 0x2

    :goto_14
    packed-switch v1, :pswitch_data_b

    const/4 v2, -0x1

    const/4 v8, -0x1

    goto/16 :goto_16

    :pswitch_3c
    const/high16 v8, 0x800000

    goto :goto_15

    :pswitch_3d
    const/high16 v8, 0x400000

    goto :goto_15

    :pswitch_3e
    const/high16 v8, 0x200000

    goto :goto_15

    :pswitch_3f
    const/high16 v8, 0x100000

    goto :goto_15

    :pswitch_40
    const/high16 v8, 0x80000

    goto :goto_15

    :pswitch_41
    const/high16 v8, 0x40000

    goto :goto_15

    :pswitch_42
    const/high16 v8, 0x20000

    :goto_15
    :pswitch_43
    const/4 v2, -0x1

    goto :goto_16

    :pswitch_44
    const/4 v2, -0x1

    const v8, 0x8000

    goto :goto_16

    :pswitch_45
    const/4 v2, -0x1

    const/16 v8, 0x4000

    goto :goto_16

    :pswitch_46
    const/4 v2, -0x1

    const/16 v8, 0x2000

    goto :goto_16

    :pswitch_47
    const/4 v2, -0x1

    const/16 v8, 0x1000

    goto :goto_16

    :pswitch_48
    const/4 v2, -0x1

    const/16 v8, 0x800

    goto :goto_16

    :pswitch_49
    const/4 v2, -0x1

    const/16 v8, 0x400

    goto :goto_16

    :pswitch_4a
    const/4 v2, -0x1

    const/16 v8, 0x200

    goto :goto_16

    :pswitch_4b
    const/4 v2, -0x1

    const/16 v8, 0x100

    goto :goto_16

    :pswitch_4c
    const/4 v2, -0x1

    const/16 v8, 0x80

    goto :goto_16

    :pswitch_4d
    const/4 v2, -0x1

    const/16 v8, 0x40

    goto :goto_16

    :pswitch_4e
    const/4 v2, -0x1

    const/16 v8, 0x20

    goto :goto_16

    :pswitch_4f
    const/4 v2, -0x1

    const/16 v8, 0x10

    goto :goto_16

    :pswitch_50
    const/4 v2, -0x1

    const/16 v8, 0x8

    goto :goto_16

    :pswitch_51
    const/4 v2, -0x1

    const/4 v8, 0x4

    goto :goto_16

    :pswitch_52
    const/4 v2, -0x1

    const/4 v8, 0x2

    goto :goto_16

    :pswitch_53
    const/4 v2, -0x1

    const/4 v8, 0x1

    :goto_16
    if-ne v8, v2, :cond_57

    const-string v0, "Unknown AV1 level: "

    .line 0
    invoke-static {v1, v0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    .line 787
    :cond_57
    new-instance v1, Landroid/util/Pair;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    .line 0
    :catch_5
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    :pswitch_54
    const/4 v1, 0x0

    .line 817
    array-length v0, v6

    const-string v2, "Ignoring malformed AC-4 codec string: "

    const/4 v3, 0x4

    if-eq v0, v3, :cond_58

    .line 0
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_58
    const/4 v0, 0x1

    .line 825
    :try_start_7
    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    .line 826
    aget-object v3, v6, v1

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v5, 0x3

    .line 827
    aget-object v5, v6, v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_6

    if-eqz v0, :cond_5d

    const/4 v4, 0x1

    if-eq v0, v4, :cond_5b

    if-eq v0, v1, :cond_59

    goto :goto_17

    :cond_59
    if-ne v3, v4, :cond_5a

    const/16 v1, 0x402

    goto :goto_18

    :cond_5a
    if-ne v3, v1, :cond_5e

    const/16 v1, 0x404

    goto :goto_18

    :cond_5b
    if-nez v3, :cond_5c

    const/16 v1, 0x201

    goto :goto_18

    :cond_5c
    if-ne v3, v4, :cond_5e

    const/16 v1, 0x202

    goto :goto_18

    :cond_5d
    if-nez v3, :cond_5e

    const/16 v1, 0x101

    goto :goto_18

    :cond_5e
    :goto_17
    const/4 v1, -0x1

    :goto_18
    const/4 v4, -0x1

    if-ne v1, v4, :cond_5f

    .line 837
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AC-4 profile: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    :cond_5f
    if-eqz v2, :cond_64

    const/4 v0, 0x1

    if-eq v2, v0, :cond_63

    const/4 v0, 0x2

    if-eq v2, v0, :cond_62

    const/4 v0, 0x3

    if-eq v2, v0, :cond_61

    const/4 v0, 0x4

    if-eq v2, v0, :cond_60

    const/4 v0, -0x1

    const/4 v3, -0x1

    goto :goto_19

    :cond_60
    const/4 v0, -0x1

    const/16 v3, 0x10

    goto :goto_19

    :cond_61
    const/4 v0, -0x1

    const/16 v3, 0x8

    goto :goto_19

    :cond_62
    const/4 v0, -0x1

    const/4 v3, 0x4

    goto :goto_19

    :cond_63
    const/4 v0, -0x1

    const/4 v3, 0x2

    goto :goto_19

    :cond_64
    const/4 v0, -0x1

    const/4 v3, 0x1

    :goto_19
    if-ne v3, v0, :cond_65

    const-string v0, "Unknown AC-4 level: "

    .line 0
    invoke-static {v2, v0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    .line 847
    :cond_65
    new-instance v0, Landroid/util/Pair;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 0
    :catch_6
    invoke-static {v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    :goto_1a
    move-object v0, v1

    :goto_1b
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x600 -> :sswitch_a
        0x601 -> :sswitch_9
        0x602 -> :sswitch_8
        0x603 -> :sswitch_7
        0x604 -> :sswitch_6
        0x605 -> :sswitch_5
        0x606 -> :sswitch_4
        0x607 -> :sswitch_3
        0x608 -> :sswitch_2
        0x609 -> :sswitch_1
        0x61f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
        0x601 -> :sswitch_17
        0x602 -> :sswitch_16
        0x603 -> :sswitch_15
        0x604 -> :sswitch_14
        0x605 -> :sswitch_13
        0x606 -> :sswitch_12
        0x607 -> :sswitch_11
        0x608 -> :sswitch_10
        0x609 -> :sswitch_f
        0x61f -> :sswitch_e
        0x620 -> :sswitch_d
        0x621 -> :sswitch_c
        0x622 -> :sswitch_b
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
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
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x2d9149 -> :sswitch_21
        0x2dd8f6 -> :sswitch_20
        0x2ddf23 -> :sswitch_1f
        0x2ddf24 -> :sswitch_1e
        0x30d038 -> :sswitch_1d
        0x310dbc -> :sswitch_1c
        0x3134b1 -> :sswitch_1b
        0x333790 -> :sswitch_1a
        0x35091c -> :sswitch_19
        0x374e43 -> :sswitch_18
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_54
        :pswitch_3b
        :pswitch_2a
        :pswitch_2a
        :pswitch_29
        :pswitch_29
        :pswitch_24
        :pswitch_1d
        :pswitch_1c
        :pswitch_18
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x3c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        0x259c5f -> :sswitch_25
        0x2f8728 -> :sswitch_24
        0x316bd1 -> :sswitch_23
        0x333790 -> :sswitch_22
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0xa
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x14
        :pswitch_31
        :pswitch_30
        :pswitch_2f
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x1e
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x28
        :pswitch_37
        :pswitch_36
        :pswitch_35
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x32
        :pswitch_39
        :pswitch_38
        :pswitch_3a
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
    .end packed-switch
.end method

.method public static ֫(III[IZI)Ljava/lang/String;
    .locals 3

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Ll/ᩳۚ֫;->ۧ:[Ljava/lang/String;

    aget-object p0, v1, p0

    .line 328
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 329
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p4, :cond_0

    const/16 p4, 0x48

    goto :goto_0

    :cond_0
    const/16 p4, 0x4c

    .line 330
    :goto_0
    invoke-static {p4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p4

    .line 331
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p1, 0x2

    aput-object p2, v1, p1

    const/4 p1, 0x3

    aput-object p4, v1, p1

    const/4 p1, 0x4

    aput-object p5, v1, p1

    .line 325
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p2, "hvc1.%s%d.%X.%c%d"

    invoke-static {p1, p2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 325
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    array-length p1, p3

    :goto_1
    if-lez p1, :cond_1

    add-int/lit8 p2, p1, -0x1

    .line 334
    aget p2, p3, p2

    if-nez p2, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_2
    if-ge p2, p1, :cond_2

    .line 338
    aget p4, p3, p2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    new-array p5, p0, [Ljava/lang/Object;

    aput-object p4, p5, v2

    const-string p4, ".%02X"

    invoke-static {p4, p5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 340
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(II[B)[B
    .locals 4

    add-int/lit8 v0, p1, 0x4

    .line 470
    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 471
    sget-object v2, Ll/ᩳۚ֫;->ܽ:[B

    const/4 v3, 0x4

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 472
    invoke-static {p2, p0, v0, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method
