.class public final Ll/ۙ᩵ܽ;
.super Ljava/lang/Object;
.source "G7I1"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/᩹֡ܽ;

.field public static final ܽ:Ll/᩹֡ܽ;

.field public static final ᩳ:Ll/᩹֡ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x2

    new-array v0, v0, [J

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x80

    if-ge v1, v2, :cond_1

    .line 48
    invoke-static {v1}, Ll/᩹۠ܽ;->ۧ(I)Z

    move-result v2

    if-eqz v2, :cond_0

    ushr-int/lit8 v2, v1, 0x6

    aget-wide v3, v0, v2

    const-wide/16 v5, 0x1

    shl-long/2addr v5, v1

    or-long/2addr v3, v5

    aput-wide v3, v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 50
    :cond_1
    new-instance v1, Ll/ܶ֡ܽ;

    invoke-direct {v1, v0}, Ll/ܶ֡ܽ;-><init>([J)V

    .line 41
    sput-object v1, Ll/ۙ᩵ܽ;->ۧ:Ll/᩹֡ܽ;

    .line 42
    new-instance v0, Ll/ۘ᩵ܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/ۙ᩵ܽ;->֫(Ll/᩹֡ܽ;)Ll/᩹֡ܽ;

    move-result-object v0

    sput-object v0, Ll/ۙ᩵ܽ;->ᩳ:Ll/᩹֡ܽ;

    .line 43
    new-instance v0, Ll/ᩴ᩵ܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/ۙ᩵ܽ;->֫(Ll/᩹֡ܽ;)Ll/᩹֡ܽ;

    move-result-object v0

    sput-object v0, Ll/ۙ᩵ܽ;->ܽ:Ll/᩹֡ܽ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۧۚܽ;
    .locals 2

    .line 263
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 266
    :try_start_0
    invoke-static {p0}, Ljava/lang/Character$UnicodeScript;->forName(Ljava/lang/String;)Ljava/lang/Character$UnicodeScript;

    move-result-object p0

    .line 267
    new-instance v0, Ll/֨᩵ܽ;

    invoke-direct {v0, p0}, Ll/֨᩵ܽ;-><init>(Ljava/lang/Character$UnicodeScript;)V

    return-object v0

    .line 273
    :cond_0
    invoke-static {p0}, Ll/۟ܳ᩵;->֫(Ljava/lang/String;)Ll/۟ܳ᩵;

    move-result-object p0

    .line 274
    new-instance v0, Ll/۠᩵ܽ;

    invoke-direct {v0, p0}, Ll/۠᩵ܽ;-><init>(Ll/۟ܳ᩵;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/ۧۚܽ;
    .locals 1

    .line 253
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Ll/ۙ᩵ܽ;->ᩳ(Ljava/lang/String;Z)Ll/ۧۚܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()Ll/᩹֡ܽ;
    .locals 1

    .line 449
    sget-object v0, Ll/ۙ᩵ܽ;->ۧ:Ll/᩹֡ܽ;

    return-object v0
.end method

.method public static ֫(Ll/᩹֡ܽ;)Ll/᩹֡ܽ;
    .locals 7

    const/4 v0, 0x2

    new-array v0, v0, [J

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x80

    if-ge v1, v2, :cond_1

    .line 48
    invoke-interface {p0, v1}, Ll/ۧۚܽ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_0

    ushr-int/lit8 v2, v1, 0x6

    aget-wide v3, v0, v2

    const-wide/16 v5, 0x1

    shl-long/2addr v5, v1

    or-long/2addr v3, v5

    aput-wide v3, v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 50
    :cond_1
    new-instance p0, Ll/ܶ֡ܽ;

    invoke-direct {p0, v0}, Ll/ܶ֡ܽ;-><init>([J)V

    return-object p0
.end method

.method public static synthetic ֫(Ljava/lang/Character$UnicodeScript;I)Z
    .locals 0

    .line 267
    invoke-static {p1}, Ljava/lang/Character$UnicodeScript;->of(I)Ljava/lang/Character$UnicodeScript;

    move-result-object p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Z)Ll/ۧۚܽ;
    .locals 16

    move-object/from16 v0, p0

    .line 300
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x41

    const/16 v3, 0x40

    const/16 v4, 0x39

    const/16 v5, 0x30

    const/16 v6, 0x10

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/16 v9, 0x20

    const/16 v10, 0xe

    const/4 v11, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "javaJavaIdentifierPart"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v11, 0x47

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "javaWhitespace"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v11, 0x46

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "javaUpperCase"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v11, 0x45

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "javaISOControl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v11, 0x44

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "javaLowerCase"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v11, 0x43

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "javaIdeographic"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v11, 0x42

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "javaSpaceChar"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v11, 0x41

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "javaMirrored"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v11, 0x40

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "javaJavaIdentifierStart"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v11, 0x3f

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "javaIdentifierIgnorable"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v11, 0x3e

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "javaAlphabetic"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v11, 0x3d

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "Upper"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v11, 0x3c

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "Space"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v11, 0x3b

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "Punct"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v11, 0x3a

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "Print"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v11, 0x39

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "Lower"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v11, 0x38

    goto/16 :goto_0

    :sswitch_10
    const-string v1, "Graph"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v11, 0x37

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "Digit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v11, 0x36

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "Cntrl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v11, 0x35

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "Blank"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v11, 0x34

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "Alpha"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v11, 0x33

    goto/16 :goto_0

    :sswitch_15
    const-string v1, "Alnum"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v11, 0x32

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "ASCII"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v11, 0x31

    goto/16 :goto_0

    :sswitch_17
    const-string v1, "all"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v11, 0x30

    goto/16 :goto_0

    :sswitch_18
    const-string v1, "Zs"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v11, 0x2f

    goto/16 :goto_0

    :sswitch_19
    const-string v1, "Zp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v11, 0x2e

    goto/16 :goto_0

    :sswitch_1a
    const-string v1, "Zl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v11, 0x2d

    goto/16 :goto_0

    :sswitch_1b
    const-string v1, "So"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v11, 0x2c

    goto/16 :goto_0

    :sswitch_1c
    const-string v1, "Sm"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v11, 0x2b

    goto/16 :goto_0

    :sswitch_1d
    const-string v1, "Sk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v11, 0x2a

    goto/16 :goto_0

    :sswitch_1e
    const-string v1, "Sc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v11, 0x29

    goto/16 :goto_0

    :sswitch_1f
    const-string v1, "Ps"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v11, 0x28

    goto/16 :goto_0

    :sswitch_20
    const-string v1, "Po"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v11, 0x27

    goto/16 :goto_0

    :sswitch_21
    const-string v1, "Pi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_0

    :cond_21
    const/16 v11, 0x26

    goto/16 :goto_0

    :sswitch_22
    const-string v1, "Pf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_0

    :cond_22
    const/16 v11, 0x25

    goto/16 :goto_0

    :sswitch_23
    const-string v1, "Pe"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto/16 :goto_0

    :cond_23
    const/16 v11, 0x24

    goto/16 :goto_0

    :sswitch_24
    const-string v1, "Pd"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto/16 :goto_0

    :cond_24
    const/16 v11, 0x23

    goto/16 :goto_0

    :sswitch_25
    const-string v1, "Pc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto/16 :goto_0

    :cond_25
    const/16 v11, 0x22

    goto/16 :goto_0

    :sswitch_26
    const-string v1, "No"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto/16 :goto_0

    :cond_26
    const/16 v11, 0x21

    goto/16 :goto_0

    :sswitch_27
    const-string v1, "Nl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    goto/16 :goto_0

    :cond_27
    const/16 v11, 0x20

    goto/16 :goto_0

    :sswitch_28
    const-string v1, "Nd"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    goto/16 :goto_0

    :cond_28
    const/16 v11, 0x1f

    goto/16 :goto_0

    :sswitch_29
    const-string v1, "Mn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto/16 :goto_0

    :cond_29
    const/16 v11, 0x1e

    goto/16 :goto_0

    :sswitch_2a
    const-string v1, "Me"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto/16 :goto_0

    :cond_2a
    const/16 v11, 0x1d

    goto/16 :goto_0

    :sswitch_2b
    const-string v1, "Mc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    goto/16 :goto_0

    :cond_2b
    const/16 v11, 0x1c

    goto/16 :goto_0

    :sswitch_2c
    const-string v1, "Lu"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    goto/16 :goto_0

    :cond_2c
    const/16 v11, 0x1b

    goto/16 :goto_0

    :sswitch_2d
    const-string v1, "Lt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto/16 :goto_0

    :cond_2d
    const/16 v11, 0x1a

    goto/16 :goto_0

    :sswitch_2e
    const-string v1, "Lo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    goto/16 :goto_0

    :cond_2e
    const/16 v11, 0x19

    goto/16 :goto_0

    :sswitch_2f
    const-string v1, "Lm"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    goto/16 :goto_0

    :cond_2f
    const/16 v11, 0x18

    goto/16 :goto_0

    :sswitch_30
    const-string v1, "Ll"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30

    goto/16 :goto_0

    :cond_30
    const/16 v11, 0x17

    goto/16 :goto_0

    :sswitch_31
    const-string v1, "LD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_31

    goto/16 :goto_0

    :cond_31
    const/16 v11, 0x16

    goto/16 :goto_0

    :sswitch_32
    const-string v1, "LC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    goto/16 :goto_0

    :cond_32
    const/16 v11, 0x15

    goto/16 :goto_0

    :sswitch_33
    const-string v1, "L1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    goto/16 :goto_0

    :cond_33
    const/16 v11, 0x14

    goto/16 :goto_0

    :sswitch_34
    const-string v1, "Cs"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_34

    goto/16 :goto_0

    :cond_34
    const/16 v11, 0x13

    goto/16 :goto_0

    :sswitch_35
    const-string v1, "Co"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_35

    goto/16 :goto_0

    :cond_35
    const/16 v11, 0x12

    goto/16 :goto_0

    :sswitch_36
    const-string v1, "Cn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_36

    goto/16 :goto_0

    :cond_36
    const/16 v11, 0x11

    goto/16 :goto_0

    :sswitch_37
    const-string v1, "Cf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    goto/16 :goto_0

    :cond_37
    const/16 v11, 0x10

    goto/16 :goto_0

    :sswitch_38
    const-string v1, "Cc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38

    goto/16 :goto_0

    :cond_38
    const/16 v11, 0xf

    goto/16 :goto_0

    :sswitch_39
    const-string v1, "Z"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_39

    goto/16 :goto_0

    :cond_39
    const/16 v11, 0xe

    goto/16 :goto_0

    :sswitch_3a
    const-string v1, "S"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3a

    goto/16 :goto_0

    :cond_3a
    const/16 v11, 0xd

    goto/16 :goto_0

    :sswitch_3b
    const-string v1, "P"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3b

    goto/16 :goto_0

    :cond_3b
    const/16 v11, 0xc

    goto/16 :goto_0

    :sswitch_3c
    const-string v1, "N"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c

    goto/16 :goto_0

    :cond_3c
    const/16 v11, 0xb

    goto/16 :goto_0

    :sswitch_3d
    const-string v1, "M"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    goto/16 :goto_0

    :cond_3d
    const/16 v11, 0xa

    goto/16 :goto_0

    :sswitch_3e
    const-string v1, "L"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3e

    goto/16 :goto_0

    :cond_3e
    const/16 v11, 0x9

    goto/16 :goto_0

    :sswitch_3f
    const-string v1, "C"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3f

    goto/16 :goto_0

    :cond_3f
    const/16 v11, 0x8

    goto/16 :goto_0

    :sswitch_40
    const-string v1, "javaUnicodeIdentifierPart"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_40

    goto :goto_0

    :cond_40
    const/4 v11, 0x7

    goto :goto_0

    :sswitch_41
    const-string v1, "javaTitleCase"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_41

    goto :goto_0

    :cond_41
    const/4 v11, 0x6

    goto :goto_0

    :sswitch_42
    const-string v1, "javaDigit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_42

    goto :goto_0

    :cond_42
    const/4 v11, 0x5

    goto :goto_0

    :sswitch_43
    const-string v1, "javaLetter"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_43

    goto :goto_0

    :cond_43
    const/4 v11, 0x4

    goto :goto_0

    :sswitch_44
    const-string v1, "javaUnicodeIdentifierStart"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_44

    goto :goto_0

    :cond_44
    const/4 v11, 0x3

    goto :goto_0

    :sswitch_45
    const-string v1, "javaLetterOrDigit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_45

    goto :goto_0

    :cond_45
    const/4 v11, 0x2

    goto :goto_0

    :sswitch_46
    const-string v1, "javaDefined"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_46

    goto :goto_0

    :cond_46
    const/4 v11, 0x1

    goto :goto_0

    :sswitch_47
    const-string v1, "XDigit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_47

    goto :goto_0

    :cond_47
    const/4 v11, 0x0

    :goto_0
    const v0, 0x8000

    const/16 v1, 0x4000

    const/16 v12, 0x2000

    const/16 v13, 0x1000

    const/16 v14, 0x800

    const/16 v15, 0x300

    packed-switch v11, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    .line 419
    :pswitch_0
    new-instance v0, Ll/ۙᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 424
    :pswitch_1
    new-instance v0, Ll/ۛᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_2
    if-eqz p1, :cond_48

    .line 404
    new-instance v0, Ll/ܰᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 407
    :cond_48
    new-instance v0, Ll/ܶ᩵ܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 425
    :pswitch_3
    new-instance v0, Ll/ۨᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_4
    if-eqz p1, :cond_49

    .line 400
    new-instance v0, Ll/۠ᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 403
    :cond_49
    new-instance v0, Ll/֫᩵ܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 409
    :pswitch_5
    new-instance v0, Ll/۟ᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 423
    :pswitch_6
    new-instance v0, Ll/ۤᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 426
    :pswitch_7
    new-instance v0, Ll/᩺ᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 418
    :pswitch_8
    new-instance v0, Ll/᩹ᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 422
    :pswitch_9
    new-instance v0, Ll/۫ᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 408
    :pswitch_a
    new-instance v0, Ll/ᩴᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_b
    if-eqz p1, :cond_4a

    .line 440
    new-instance v0, Ll/ۚ᩵ܽ;

    invoke-direct {v0, v15}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v0

    .line 436
    :cond_4a
    new-instance v0, Ll/֡᩵ܽ;

    const/16 v1, 0x5a

    invoke-direct {v0, v2, v1}, Ll/֡᩵ܽ;-><init>(II)V

    return-object v0

    .line 440
    :pswitch_c
    new-instance v0, Ll/ۚ᩵ܽ;

    invoke-direct {v0, v14}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_d
    new-instance v0, Ll/ۚ᩵ܽ;

    invoke-direct {v0, v13}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v0

    .line 436
    :pswitch_e
    new-instance v0, Ll/֡᩵ܽ;

    const/16 v1, 0x7e

    invoke-direct {v0, v9, v1}, Ll/֡᩵ܽ;-><init>(II)V

    return-object v0

    :pswitch_f
    if-eqz p1, :cond_4b

    .line 440
    new-instance v0, Ll/ۚ᩵ܽ;

    invoke-direct {v0, v15}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v0

    .line 436
    :cond_4b
    new-instance v0, Ll/֡᩵ܽ;

    const/16 v1, 0x61

    const/16 v2, 0x7a

    invoke-direct {v0, v1, v2}, Ll/֡᩵ܽ;-><init>(II)V

    return-object v0

    .line 440
    :pswitch_10
    new-instance v0, Ll/ۚ᩵ܽ;

    const/16 v1, 0x1700

    invoke-direct {v0, v1}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v0

    .line 436
    :pswitch_11
    new-instance v0, Ll/֡᩵ܽ;

    invoke-direct {v0, v5, v4}, Ll/֡᩵ܽ;-><init>(II)V

    return-object v0

    .line 440
    :pswitch_12
    new-instance v0, Ll/ۚ᩵ܽ;

    invoke-direct {v0, v12}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_13
    new-instance v0, Ll/ۚ᩵ܽ;

    invoke-direct {v0, v1}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_14
    new-instance v0, Ll/ۚ᩵ܽ;

    invoke-direct {v0, v15}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_15
    new-instance v0, Ll/ۚ᩵ܽ;

    const/16 v1, 0x700

    invoke-direct {v0, v1}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v0

    .line 436
    :pswitch_16
    new-instance v0, Ll/֡᩵ܽ;

    const/16 v1, 0x7f

    invoke-direct {v0, v8, v1}, Ll/֡᩵ܽ;-><init>(II)V

    return-object v0

    .line 380
    :pswitch_17
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2442
    new-instance v0, Ll/ܳ֡ܽ;

    invoke-direct {v0, v8}, Ll/ܳ֡ܽ;-><init>(I)V

    return-object v0

    .line 432
    :pswitch_18
    new-instance v0, Ll/᩵᩵ܽ;

    invoke-direct {v0, v13}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_19
    new-instance v0, Ll/᩵᩵ܽ;

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_1a
    new-instance v0, Ll/᩵᩵ܽ;

    invoke-direct {v0, v12}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_1b
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x10000000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_1c
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x2000000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_1d
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x8000000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_1e
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x4000000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_1f
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x200000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_20
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x1000000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_21
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x20000000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_22
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_23
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x400000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_24
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x100000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_25
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x800000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_26
    new-instance v0, Ll/᩵᩵ܽ;

    invoke-direct {v0, v14}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_27
    new-instance v0, Ll/᩵᩵ܽ;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_28
    new-instance v0, Ll/᩵᩵ܽ;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_29
    new-instance v0, Ll/᩵᩵ܽ;

    invoke-direct {v0, v3}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_2a
    new-instance v0, Ll/᩵᩵ܽ;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_2b
    new-instance v0, Ll/᩵᩵ܽ;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_2c
    if-eqz p1, :cond_4c

    const/16 v0, 0xe

    goto :goto_1

    :cond_4c
    const/4 v0, 0x2

    :goto_1
    new-instance v1, Ll/᩵᩵ܽ;

    invoke-direct {v1, v0}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v1

    :pswitch_2d
    if-eqz p1, :cond_4d

    const/16 v0, 0xe

    goto :goto_2

    :cond_4d
    const/16 v0, 0x8

    :goto_2
    new-instance v1, Ll/᩵᩵ܽ;

    invoke-direct {v1, v0}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v1

    :pswitch_2e
    new-instance v0, Ll/᩵᩵ܽ;

    invoke-direct {v0, v9}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_2f
    new-instance v0, Ll/᩵᩵ܽ;

    invoke-direct {v0, v6}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_30
    if-eqz p1, :cond_4e

    const/16 v0, 0xe

    goto :goto_3

    :cond_4e
    const/4 v0, 0x4

    :goto_3
    new-instance v1, Ll/᩵᩵ܽ;

    invoke-direct {v1, v0}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v1

    :pswitch_31
    new-instance v0, Ll/᩵᩵ܽ;

    const/16 v1, 0x23e

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_32
    new-instance v0, Ll/᩵᩵ܽ;

    invoke-direct {v0, v10}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    .line 436
    :pswitch_33
    new-instance v0, Ll/֡᩵ܽ;

    const/16 v1, 0xff

    invoke-direct {v0, v8, v1}, Ll/֡᩵ܽ;-><init>(II)V

    return-object v0

    .line 432
    :pswitch_34
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x80000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_35
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x40000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_36
    new-instance v0, Ll/᩵᩵ܽ;

    invoke-direct {v0, v7}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_37
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x10000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_38
    new-instance v1, Ll/᩵᩵ܽ;

    invoke-direct {v1, v0}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v1

    :pswitch_39
    new-instance v0, Ll/᩵᩵ܽ;

    const/16 v1, 0x7000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_3a
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x1e000000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_3b
    new-instance v0, Ll/᩵᩵ܽ;

    const/high16 v1, 0x61f00000

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_3c
    new-instance v0, Ll/᩵᩵ܽ;

    const/16 v1, 0xe00

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_3d
    new-instance v0, Ll/᩵᩵ܽ;

    const/16 v1, 0x1c0

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_3e
    new-instance v0, Ll/᩵᩵ܽ;

    const/16 v1, 0x3e

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    :pswitch_3f
    new-instance v0, Ll/᩵᩵ܽ;

    const v1, 0xd8001

    invoke-direct {v0, v1}, Ll/᩵᩵ܽ;-><init>(I)V

    return-object v0

    .line 421
    :pswitch_40
    new-instance v0, Ll/۬ᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_41
    if-eqz p1, :cond_4f

    .line 410
    new-instance v0, Ll/ۧ᩵ܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 413
    :cond_4f
    new-instance v0, Ll/ܺ֡ܽ;

    invoke-direct {v0, v7}, Ll/ܺ֡ܽ;-><init>(I)V

    return-object v0

    .line 414
    :pswitch_42
    new-instance v0, Ll/᩶ᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 416
    :pswitch_43
    new-instance v0, Ll/ܶᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 420
    :pswitch_44
    new-instance v0, Ll/ۗᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 417
    :pswitch_45
    new-instance v0, Ll/᩸ᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 415
    :pswitch_46
    new-instance v0, Ll/ܽ᩵ܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 440
    :pswitch_47
    new-instance v1, Ll/ۚ᩵ܽ;

    invoke-direct {v1, v0}, Ll/ۚ᩵ܽ;-><init>(I)V

    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x65e6004b -> :sswitch_47
        -0x564cfe79 -> :sswitch_46
        -0x458a24fe -> :sswitch_45
        -0x44e59ea2 -> :sswitch_44
        -0x372be718 -> :sswitch_43
        -0x33c31bd5 -> :sswitch_42
        -0x2a141e5a -> :sswitch_41
        -0x1b00c889 -> :sswitch_40
        0x43 -> :sswitch_3f
        0x4c -> :sswitch_3e
        0x4d -> :sswitch_3d
        0x4e -> :sswitch_3c
        0x50 -> :sswitch_3b
        0x53 -> :sswitch_3a
        0x5a -> :sswitch_39
        0x880 -> :sswitch_38
        0x883 -> :sswitch_37
        0x88b -> :sswitch_36
        0x88c -> :sswitch_35
        0x890 -> :sswitch_34
        0x965 -> :sswitch_33
        0x977 -> :sswitch_32
        0x978 -> :sswitch_31
        0x9a0 -> :sswitch_30
        0x9a1 -> :sswitch_2f
        0x9a3 -> :sswitch_2e
        0x9a8 -> :sswitch_2d
        0x9a9 -> :sswitch_2c
        0x9b6 -> :sswitch_2b
        0x9b8 -> :sswitch_2a
        0x9c1 -> :sswitch_29
        0x9d6 -> :sswitch_28
        0x9de -> :sswitch_27
        0x9e1 -> :sswitch_26
        0xa13 -> :sswitch_25
        0xa14 -> :sswitch_24
        0xa15 -> :sswitch_23
        0xa16 -> :sswitch_22
        0xa19 -> :sswitch_21
        0xa1f -> :sswitch_20
        0xa23 -> :sswitch_1f
        0xa70 -> :sswitch_1e
        0xa78 -> :sswitch_1d
        0xa7a -> :sswitch_1c
        0xa7c -> :sswitch_1b
        0xb52 -> :sswitch_1a
        0xb56 -> :sswitch_19
        0xb59 -> :sswitch_18
        0x179a1 -> :sswitch_17
        0x3bab731 -> :sswitch_16
        0x3c6bb5b -> :sswitch_15
        0x3c6c13e -> :sswitch_14
        0x3d4a134 -> :sswitch_13
        0x3e3e943 -> :sswitch_12
        0x3ef890d -> :sswitch_11
        0x41dd12e -> :sswitch_10
        0x4633ae1 -> :sswitch_f
        0x49cc28d -> :sswitch_e
        0x49e311a -> :sswitch_d
        0x4c600e6 -> :sswitch_c
        0x4e26882 -> :sswitch_b
        0xaafe68f -> :sswitch_a
        0x1698fca2 -> :sswitch_9
        0x19e14535 -> :sswitch_8
        0x1c2a50e0 -> :sswitch_7
        0x1c5dc17a -> :sswitch_6
        0x20d728c1 -> :sswitch_5
        0x36876dcf -> :sswitch_4
        0x4192fcda -> :sswitch_3
        0x6284e2f0 -> :sswitch_2
        0x63581a3f -> :sswitch_1
        0x7470fcc0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
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
.end method

.method public static ۧ()Ll/᩹֡ܽ;
    .locals 1

    .line 457
    sget-object v0, Ll/ۙ᩵ܽ;->ܽ:Ll/᩹֡ܽ;

    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;Z)Ll/ۧۚܽ;
    .locals 5

    .line 245
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 213
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "EMOJI_PRESENTATION"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x17

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "EXTENDED_PICTOGRAPHIC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x16

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "EMOJI_COMPONENT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x15

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "EMOJI_MODIFIER_BASE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "CONTROL"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "NONCHARACTER_CODE_POINT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "NONCHARACTERCODEPOINT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "WHITESPACE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "TITLECASE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "ASSIGNED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "HEXDIGIT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "EMOJI"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "WORD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "JOIN_CONTROL"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "PUNCTUATION"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "ALPHABETIC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "EMOJI_MODIFIER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_11
    const-string v0, "JOINCONTROL"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_12
    const-string v0, "UPPERCASE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_13
    const-string v0, "IDEOGRAPHIC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    :cond_13
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_14
    const-string v0, "WHITE_SPACE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_0

    :cond_14
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_15
    const-string v0, "HEX_DIGIT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_0

    :cond_15
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_16
    const-string v0, "LOWERCASE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_0

    :cond_16
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_17
    const-string v0, "LETTER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_0

    :cond_17
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x24

    const/4 v4, 0x0

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_2

    .line 470
    :pswitch_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v0, :cond_18

    goto/16 :goto_2

    :cond_18
    new-instance v4, Ll/ۜ᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_2

    .line 486
    :pswitch_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v0, :cond_19

    new-instance v4, Ll/᩸᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_2

    :cond_19
    new-instance v4, Ll/᩹᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_2

    .line 482
    :pswitch_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v0, :cond_1a

    goto/16 :goto_2

    :cond_1a
    new-instance v4, Ll/᩵ᩴܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_2

    .line 478
    :pswitch_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v0, :cond_1b

    goto/16 :goto_2

    :cond_1b
    new-instance v4, Ll/ۢ᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_2

    .line 93
    :pswitch_4
    new-instance v4, Ll/ۡ᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_2

    .line 126
    :pswitch_5
    new-instance v4, Ll/ܳ֡ܽ;

    invoke-direct {v4, v1}, Ll/ܳ֡ܽ;-><init>(I)V

    goto/16 :goto_2

    :pswitch_6
    if-eqz p1, :cond_1c

    .line 79
    new-instance v0, Ll/ܺ֡ܽ;

    invoke-direct {v0, v1}, Ll/ܺ֡ܽ;-><init>(I)V

    .line 71
    new-instance v1, Ll/֫᩵ܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v3, Ll/ܶ᩵ܽ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 2391
    invoke-static {v0, v1, v3, v2}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;

    move-result-object v4

    goto/16 :goto_2

    .line 79
    :cond_1c
    new-instance v4, Ll/ܺ֡ܽ;

    invoke-direct {v4, v1}, Ll/ܺ֡ܽ;-><init>(I)V

    goto/16 :goto_2

    .line 121
    :pswitch_7
    new-instance v4, Ll/᩶᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_2

    .line 466
    :pswitch_8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v0, :cond_1d

    goto/16 :goto_2

    :cond_1d
    new-instance v4, Ll/ܺ᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_2

    .line 239
    :pswitch_9
    invoke-static {}, Ll/ۙ᩵ܽ;->ᩳ()Ll/ۧۚܽ;

    move-result-object v4

    goto/16 :goto_2

    .line 98
    :pswitch_a
    new-instance v4, Ll/᩷᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_2

    .line 54
    :pswitch_b
    new-instance v4, Ll/ᩴᩴܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 474
    :pswitch_c
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v0, :cond_1e

    goto :goto_2

    :cond_1e
    new-instance v4, Ll/ܿ᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 170
    :pswitch_d
    new-instance v4, Ll/ۚᩴܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    :pswitch_e
    if-eqz p1, :cond_1f

    .line 75
    new-instance v0, Ll/ܶ᩵ܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    new-instance v3, Ll/֫᩵ܽ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v4, Ll/ܺ֡ܽ;

    invoke-direct {v4, v1}, Ll/ܺ֡ܽ;-><init>(I)V

    goto :goto_1

    .line 75
    :cond_1f
    new-instance v4, Ll/ܶ᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 67
    :pswitch_f
    new-instance v4, Ll/۟ᩴܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 84
    :pswitch_10
    new-instance v4, Ll/ܳ᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 59
    :pswitch_11
    new-instance v0, Ll/᩶ᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance v1, Ll/֨ᩴܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/᩶ᩴܽ;->ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object v4

    goto :goto_2

    :pswitch_12
    if-eqz p1, :cond_20

    .line 71
    new-instance v0, Ll/֫᩵ܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v3, Ll/ܶ᩵ܽ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v4, Ll/ܺ֡ܽ;

    invoke-direct {v4, v1}, Ll/ܺ֡ܽ;-><init>(I)V

    .line 2391
    :goto_1
    invoke-static {v0, v3, v4, v2}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;

    move-result-object v4

    goto :goto_2

    .line 71
    :cond_20
    new-instance v4, Ll/֫᩵ܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 63
    :pswitch_13
    new-instance v4, Ll/ܶᩴܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    :goto_2
    if-eqz v4, :cond_21

    return-object v4

    .line 249
    :cond_21
    invoke-static {p0, p1}, Ll/ۙ᩵ܽ;->ᩳ(Ljava/lang/String;Z)Ll/ۧۚܽ;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a5be7da -> :sswitch_17
        -0x7892b26f -> :sswitch_16
        -0x77ee6d37 -> :sswitch_15
        -0x6b57bad0 -> :sswitch_14
        -0x66d6f7dd -> :sswitch_13
        -0x4c953d4e -> :sswitch_12
        -0x4198272d -> :sswitch_11
        -0x3f959930 -> :sswitch_10
        -0x2b3cf133 -> :sswitch_f
        -0xf0a62c6 -> :sswitch_e
        -0xe355cd8 -> :sswitch_d
        0x28bf0a -> :sswitch_c
        0x3f08826 -> :sswitch_b
        0x136d8ef2 -> :sswitch_a
        0x1899fdce -> :sswitch_9
        0x26d1c168 -> :sswitch_8
        0x2d6b427d -> :sswitch_7
        0x3ca3b027 -> :sswitch_6
        0x44e611c1 -> :sswitch_5
        0x6382f13d -> :sswitch_4
        0x686f12e0 -> :sswitch_3
        0x6ac13804 -> :sswitch_2
        0x70a8d709 -> :sswitch_1
        0x7261b693 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_11
        :pswitch_7
        :pswitch_6
        :pswitch_10
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ܽ()Ll/᩹֡ܽ;
    .locals 1

    .line 453
    sget-object v0, Ll/ۙ᩵ܽ;->ᩳ:Ll/᩹֡ܽ;

    return-object v0
.end method

.method public static ᩳ()Ll/ۧۚܽ;
    .locals 4

    .line 54
    new-instance v0, Ll/ᩴᩴܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 179
    new-instance v1, Ll/ۖ᩵ܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 170
    new-instance v2, Ll/ۚᩴܽ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    .line 2391
    invoke-static {v0, v1, v2, v3}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ(Ljava/lang/String;Z)Ll/ۧۚܽ;
    .locals 4

    .line 191
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "UPPER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "SPACE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "PUNCT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "PRINT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "LOWER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_5
    const-string v0, "GRAPH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_6
    const-string v0, "DIGIT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_7
    const-string v0, "CNTRL"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_8
    const-string v0, "BLANK"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_9
    const-string v0, "ALPHA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_a
    const-string v0, "ALNUM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_b
    const-string v0, "XDIGIT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    if-eqz p1, :cond_c

    .line 75
    new-instance p0, Ll/ܶ᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    new-instance p1, Ll/֫᩵ܽ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v0, Ll/ܺ֡ܽ;

    invoke-direct {v0, v1}, Ll/ܺ֡ܽ;-><init>(I)V

    .line 2391
    invoke-static {p0, p1, v0, v2}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;

    move-result-object p0

    return-object p0

    .line 75
    :cond_c
    new-instance p0, Ll/ܶ᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 84
    :pswitch_1
    new-instance p0, Ll/ܳ᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 98
    :pswitch_2
    new-instance p0, Ll/᩷᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 151
    :pswitch_3
    new-instance p0, Ll/᩻᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    new-instance p1, Ll/ᩳ᩵ܽ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 165
    invoke-static {p0, p1}, Ll/֫ۚܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p0

    .line 93
    new-instance p1, Ll/ۡ᩵ܽ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 2395
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2374
    invoke-static {p1}, Ll/۟᩵ܽ;->ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;

    move-result-object p1

    .line 165
    invoke-interface {p0, p1}, Ll/ۧۚܽ;->֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p0

    return-object p0

    :pswitch_4
    if-eqz p1, :cond_d

    .line 71
    new-instance p0, Ll/֫᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance p1, Ll/ܶ᩵ܽ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v0, Ll/ܺ֡ܽ;

    invoke-direct {v0, v1}, Ll/ܺ֡ܽ;-><init>(I)V

    .line 2391
    invoke-static {p0, p1, v0, v2}, Ll/ܳ۠ܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;

    move-result-object p0

    return-object p0

    .line 71
    :cond_d
    new-instance p0, Ll/֫᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 151
    :pswitch_5
    new-instance p0, Ll/᩻᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 59
    :pswitch_6
    new-instance p0, Ll/᩶ᩴܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 93
    :pswitch_7
    new-instance p0, Ll/ۡ᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 140
    :pswitch_8
    new-instance p0, Ll/ᩳ᩵ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 54
    :pswitch_9
    new-instance p0, Ll/ᩴᩴܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    :pswitch_a
    new-instance p0, Ll/ᩴᩴܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance p1, Ll/᩶ᩴܽ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 132
    invoke-static {p0, p1}, Ll/֫ۚܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p0

    return-object p0

    .line 59
    :pswitch_b
    new-instance p0, Ll/᩶ᩴܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance p1, Ll/֨ᩴܽ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Ll/᩶ᩴܽ;->ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x65f5084b -> :sswitch_b
        0x3b7b35b -> :sswitch_a
        0x3b7b93e -> :sswitch_9
        0x3c59934 -> :sswitch_8
        0x3d4e143 -> :sswitch_7
        0x3e0810d -> :sswitch_6
        0x40ec92e -> :sswitch_5
        0x45432e1 -> :sswitch_4
        0x48dba8d -> :sswitch_3
        0x48f291a -> :sswitch_2
        0x4b6f8e6 -> :sswitch_1
        0x4d36082 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
