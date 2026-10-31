.class public final Ll/ܳ᩷ܽ;
.super Ljava/lang/Object;
.source "31R1"


# static fields
.field public static final ֡:I

.field public static final ֫:I

.field public static final ۖ:I

.field public static final ۘ:I

.field public static final ۜ:I

.field public static final ۡ:I

.field public static final ۢ:I

.field public static final ۧ:Ljava/util/List;

.field public static final ܳ:I

.field public static final ܺ:I

.field public static final ܽ:Ljava/util/List;

.field public static final ܿ:I

.field public static final ᩳ:I

.field public static final ᩴ:I

.field public static final ᩵:I

.field public static final ᩷:I

.field public static final ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "UTF-8"

    .line 88
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v3

    .line 36
    sput v3, Ll/ܳ᩷ܽ;->᩵:I

    const-string v3, "UTF-8-BOM"

    .line 37
    invoke-static {v2, v3, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2

    sput v2, Ll/ܳ᩷ܽ;->֡:I

    const-string v2, "UTF-16BE"

    .line 88
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2

    .line 38
    sput v2, Ll/ܳ᩷ܽ;->ܺ:I

    const-string v2, "UTF-16LE"

    .line 88
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2

    .line 39
    sput v2, Ll/ܳ᩷ܽ;->ۖ:I

    const-string v2, "UTF-32BE"

    .line 88
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2

    .line 40
    sput v2, Ll/ܳ᩷ܽ;->ۘ:I

    const-string v2, "UTF-32LE"

    .line 88
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2

    .line 41
    sput v2, Ll/ܳ᩷ܽ;->ᩴ:I

    const-string v2, "GB2312"

    .line 88
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2

    .line 42
    sput v2, Ll/ܳ᩷ܽ;->ܿ:I

    const-string v2, "GB18030"

    .line 88
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2

    .line 43
    sput v2, Ll/ܳ᩷ܽ;->ᩳ:I

    const-string v2, "GBK"

    .line 88
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2

    .line 44
    sput v2, Ll/ܳ᩷ܽ;->ܳ:I

    const-string v2, "Big5"

    const/4 v3, -0x1

    .line 88
    :try_start_0
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, -0x1

    .line 45
    :goto_0
    sput v2, Ll/ܳ᩷ܽ;->֫:I

    const-string v2, "Big5-HKSCS"

    .line 88
    :try_start_1
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const-string v2, "CESU-8"

    :try_start_2
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const-string v2, "EUC-JP"

    :try_start_3
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    const-string v2, "EUC-KR"

    :try_start_4
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    const-string v2, "IBM866"

    :try_start_5
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    const-string v2, "IBM850"

    :try_start_6
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    const-string v2, "ISO-2022-CN"

    :try_start_7
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_1

    :catch_7
    const/4 v2, -0x1

    .line 52
    :goto_1
    sput v2, Ll/ܳ᩷ܽ;->᩻:I

    const-string v2, "ISO-2022-JP"

    .line 88
    :try_start_8
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_2

    :catch_8
    const/4 v2, -0x1

    .line 53
    :goto_2
    sput v2, Ll/ܳ᩷ܽ;->ۜ:I

    const-string v2, "ISO-2022-KR"

    .line 88
    :try_start_9
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_3

    :catch_9
    const/4 v2, -0x1

    .line 54
    :goto_3
    sput v2, Ll/ܳ᩷ܽ;->᩷:I

    const-string v2, "ISO-8859-1"

    .line 88
    :try_start_a
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    const-string v2, "ISO-8859-2"

    :try_start_b
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    const-string v2, "ISO-8859-3"

    :try_start_c
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    const-string v2, "ISO-8859-4"

    :try_start_d
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    const-string v2, "ISO-8859-5"

    :try_start_e
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    const-string v2, "ISO-8859-6"

    :try_start_f
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    const-string v2, "ISO-8859-7"

    :try_start_10
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    const-string v2, "ISO-8859-8"

    :try_start_11
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    const-string v2, "ISO-8859-9"

    :try_start_12
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_12

    :catch_12
    const-string v2, "ISO-8859-10"

    :try_start_13
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_13

    :catch_13
    const-string v2, "ISO-8859-13"

    :try_start_14
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_14

    :catch_14
    const-string v2, "ISO-8859-14"

    :try_start_15
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_15

    :catch_15
    const-string v2, "ISO-8859-15"

    :try_start_16
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_16

    :catch_16
    const-string v2, "KOI8-R"

    :try_start_17
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_17

    :catch_17
    const-string v2, "KOI8-U"

    :try_start_18
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_18

    :catch_18
    const-string v2, "ShiftJIS"

    :try_start_19
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v3
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_19

    .line 70
    :catch_19
    sput v3, Ll/ܳ᩷ܽ;->ۢ:I

    const-string v2, "Windows-1250"

    .line 88
    :try_start_1a
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_1a

    :catch_1a
    const-string v2, "Windows-1251"

    :try_start_1b
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_1b

    :catch_1b
    const-string v2, "Windows-1252"

    :try_start_1c
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_1c

    :catch_1c
    const-string v2, "Windows-1253"

    :try_start_1d
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_1d

    :catch_1d
    const-string v2, "Windows-1254"

    :try_start_1e
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_1e

    :catch_1e
    const-string v2, "Windows-1255"

    :try_start_1f
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_1f

    :catch_1f
    const-string v2, "Windows-1256"

    :try_start_20
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_20

    :catch_20
    const-string v2, "Windows-1257"

    :try_start_21
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_21

    :catch_21
    const-string v2, "Windows-1258"

    :try_start_22
    invoke-static {v2, v2, v0, v1}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_22

    .line 80
    :catch_22
    invoke-virtual {v0}, Ljava/util/ArrayList;->trimToSize()V

    .line 81
    invoke-virtual {v1}, Ljava/util/ArrayList;->trimToSize()V

    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sput v2, Ll/ܳ᩷ܽ;->ۡ:I

    .line 83
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ܳ᩷ܽ;->ۧ:Ljava/util/List;

    .line 84
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ܳ᩷ܽ;->ܽ:Ljava/util/List;

    return-void
.end method

.method public static ֫(I[B)I
    .locals 12

    .line 208
    sget-object v0, Ll/ۘ᩷ܽ;->֫:[Ll/ۘ᩷ܽ;

    .line 209
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v2, :cond_3

    .line 210
    aget-object v6, v0, v4

    .line 211
    invoke-interface {v6}, Ll/ۘ᩷ܽ;->֫()I

    move-result v7

    if-ne v7, v5, :cond_0

    goto :goto_1

    .line 214
    :cond_0
    invoke-interface {v6, p0, p1}, Ll/ۘ᩷ܽ;->֫(I[B)I

    move-result v5

    const/16 v7, 0x64

    if-ne v5, v7, :cond_1

    .line 216
    invoke-interface {v6}, Ll/ۘ᩷ܽ;->֫()I

    move-result p0

    return p0

    :cond_1
    const/16 v7, 0x32

    if-lt v5, v7, :cond_2

    .line 220
    new-instance v7, Ll/ܿ᩷ܽ;

    invoke-interface {v6}, Ll/ۘ᩷ܽ;->֫()I

    move-result v6

    .line 236
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 237
    iput v5, v7, Ll/ܿ᩷ܽ;->᩹:I

    .line 238
    iput v6, v7, Ll/ܿ᩷ܽ;->᩸:I

    .line 220
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 223
    :cond_3
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 224
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ᩷ܽ;

    .line 225
    iget v2, v1, Ll/ܿ᩷ܽ;->᩸:I

    invoke-static {v2}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v2

    .line 248
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, p1, v3, p0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 250
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_3
    if-ge v6, v2, :cond_a

    .line 253
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const v9, 0xd800

    if-lt v8, v9, :cond_5

    const v9, 0xdbff

    if-gt v8, v9, :cond_5

    add-int/lit8 v9, v6, 0x1

    if-ge v9, v2, :cond_5

    .line 258
    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const v11, 0xdc00

    if-lt v10, v11, :cond_5

    const v11, 0xdfff

    if-gt v10, v11, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    const/16 v9, 0x20

    const/16 v10, 0xa

    if-ge v8, v9, :cond_6

    const/16 v9, 0xd

    if-eq v8, v9, :cond_6

    if-eq v8, v10, :cond_6

    const/16 v9, 0x9

    if-ne v8, v9, :cond_4

    :cond_6
    const/16 v9, 0x7f

    if-ne v8, v9, :cond_7

    goto :goto_2

    :cond_7
    const v11, 0xfffd

    if-ne v8, v11, :cond_8

    add-int/lit8 v7, v7, 0x1

    if-le v7, v10, :cond_8

    goto :goto_2

    :cond_8
    if-le v8, v9, :cond_9

    .line 276
    invoke-static {v8}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    move-result-object v8

    .line 277
    sget-object v9, Ljava/lang/Character$UnicodeBlock;->PRIVATE_USE_AREA:Ljava/lang/Character$UnicodeBlock;

    if-eq v8, v9, :cond_4

    sget-object v9, Ljava/lang/Character$UnicodeBlock;->SUPPLEMENTARY_PRIVATE_USE_AREA_A:Ljava/lang/Character$UnicodeBlock;

    if-eq v8, v9, :cond_4

    sget-object v9, Ljava/lang/Character$UnicodeBlock;->SUPPLEMENTARY_PRIVATE_USE_AREA_B:Ljava/lang/Character$UnicodeBlock;

    if-ne v8, v9, :cond_9

    goto :goto_2

    :cond_9
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 226
    :cond_a
    iget p0, v1, Ll/ܿ᩷ܽ;->᩸:I

    return p0

    :cond_b
    return v5
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 5

    .line 115
    sget-object v0, Ll/ܳ᩷ܽ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 116
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return v3

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 120
    :cond_1
    sget-object v0, Ll/ܳ᩷ܽ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_3

    .line 121
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/charset/Charset;

    .line 122
    invoke-virtual {v3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    return v2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    .locals 0

    .line 92
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p0

    .line 93
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static ֫(I)Ljava/nio/charset/Charset;
    .locals 1

    .line 107
    sget-object v0, Ll/ܳ᩷ܽ;->ۧ:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/nio/charset/Charset;

    return-object p0
.end method

.method public static ۧ(I[B)I
    .locals 0

    .line 196
    invoke-static {p0, p1}, Ll/ܳ᩷ܽ;->֫(I[B)I

    move-result p0

    const/4 p1, -0x1

    if-ne p0, p1, :cond_0

    .line 198
    sget p0, Ll/ܳ᩷ܽ;->᩵:I

    :cond_0
    return p0
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 1

    .line 111
    sget-object v0, Ll/ܳ᩷ܽ;->ܽ:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method
