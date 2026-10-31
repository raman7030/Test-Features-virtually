.class public Ll/ۢ۫ۡ;
.super Ljava/lang/Object;
.source "1AG9"


# static fields
.field public static final ֫֫:Ll/᩵֫ᩴ;

.field public static final ۟:[Ljava/lang/String;

.field public static final ܰ:[Ljava/lang/String;


# instance fields
.field public ֡:Z

.field public ֨:F

.field public final ֫:[F

.field public final ۖ:F

.field public ۗ:I

.field public ۘ:Ll/᩻۫ۡ;

.field public ۙ:F

.field public ۚ:F

.field public final ۛ:Ll/֫ۖܽ;

.field public ۜ:Z

.field public ۠:F

.field public ۡ:F

.field public ۢ:F

.field public ۤ:I

.field public final ۧ:[F

.field public ۨ:Ll/ۖ۫ۡ;

.field public ۫:I

.field public ۬:F

.field public final ܳ:F

.field public ܶ:F

.field public ܺ:I

.field public final ܽ:[C

.field public ܿ:F

.field public final ᩳ:Ll/۫ܳᩴ;

.field public final ᩴ:Landroid/graphics/Rect;

.field public ᩵:Z

.field public ᩶:Z

.field public ᩷:F

.field public ᩸:F

.field public ᩹:Z

.field public final ᩺:Ll/ᩴ۫ۡ;

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 77

    const/16 v0, 0x80

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 42
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    int-to-char v3, v3

    goto :goto_0

    .line 44
    :cond_0
    sput-object v1, Ll/ۢ۫ۡ;->۟:[Ljava/lang/String;

    .line 45
    invoke-virtual {v1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const-string v1, "NUL"

    .line 46
    aput-object v1, v0, v2

    const-string v1, "SOH"

    const/4 v3, 0x1

    .line 47
    aput-object v1, v0, v3

    const/4 v1, 0x2

    const-string v3, "STX"

    .line 48
    aput-object v3, v0, v1

    const/4 v1, 0x3

    const-string v3, "ETX"

    .line 49
    aput-object v3, v0, v1

    const/4 v1, 0x4

    const-string v3, "EOT"

    .line 50
    aput-object v3, v0, v1

    const/4 v1, 0x5

    const-string v3, "ENQ"

    .line 51
    aput-object v3, v0, v1

    const/4 v1, 0x6

    const-string v3, "ACK"

    .line 52
    aput-object v3, v0, v1

    const/4 v1, 0x7

    const-string v3, "BEL"

    .line 53
    aput-object v3, v0, v1

    const/16 v1, 0x8

    const-string v3, "BS"

    .line 54
    aput-object v3, v0, v1

    const/16 v1, 0xb

    const-string v3, "VT"

    .line 55
    aput-object v3, v0, v1

    const/16 v1, 0xc

    const-string v3, "FF"

    .line 56
    aput-object v3, v0, v1

    const/16 v1, 0xe

    const-string v3, "SO"

    .line 57
    aput-object v3, v0, v1

    const/16 v1, 0xf

    const-string v3, "SI"

    .line 58
    aput-object v3, v0, v1

    const/16 v1, 0x10

    const-string v3, "DLE"

    .line 59
    aput-object v3, v0, v1

    const/16 v1, 0x11

    const-string v3, "DC1"

    .line 60
    aput-object v3, v0, v1

    const/16 v1, 0x12

    const-string v3, "DC2"

    .line 61
    aput-object v3, v0, v1

    const/16 v1, 0x13

    const-string v3, "DC3"

    .line 62
    aput-object v3, v0, v1

    const/16 v1, 0x14

    const-string v3, "DC4"

    .line 63
    aput-object v3, v0, v1

    const/16 v1, 0x15

    const-string v3, "NAK"

    .line 64
    aput-object v3, v0, v1

    const/16 v1, 0x16

    const-string v3, "SYN"

    .line 65
    aput-object v3, v0, v1

    const/16 v1, 0x17

    const-string v3, "ETB"

    .line 66
    aput-object v3, v0, v1

    const/16 v1, 0x18

    const-string v3, "CAN"

    .line 67
    aput-object v3, v0, v1

    const/16 v1, 0x19

    const-string v3, "EM"

    .line 68
    aput-object v3, v0, v1

    const/16 v1, 0x1a

    const-string v3, "SUB"

    .line 69
    aput-object v3, v0, v1

    const/16 v1, 0x1b

    const-string v3, "ESC"

    .line 70
    aput-object v3, v0, v1

    const/16 v1, 0x1c

    const-string v3, "FS"

    .line 71
    aput-object v3, v0, v1

    const/16 v1, 0x1d

    const-string v3, "GS"

    .line 72
    aput-object v3, v0, v1

    const/16 v1, 0x1e

    const-string v3, "RS"

    .line 73
    aput-object v3, v0, v1

    const/16 v1, 0x1f

    const-string v3, "US"

    .line 74
    aput-object v3, v0, v1

    const/16 v1, 0x7f

    const-string v3, "DEL"

    .line 75
    aput-object v3, v0, v1

    .line 76
    sput-object v0, Ll/ۢ۫ۡ;->ܰ:[Ljava/lang/String;

    const/16 v0, 0x4a

    new-array v0, v0, [C

    .line 78
    fill-array-data v0, :array_0

    .line 88
    new-instance v1, Ll/᩵֫ᩴ;

    const-string v75, "NODS"

    const-string v76, "ZWNBSP"

    const-string v3, "HOP"

    const-string v4, "BPH"

    const-string v5, "NBH"

    const-string v6, "IND"

    const-string v7, "NEL"

    const-string v8, "SSA"

    const-string v9, "ESA"

    const-string v10, "HTS"

    const-string v11, "HTJ"

    const-string v12, "VTS"

    const-string v13, "PLD"

    const-string v14, "PLU"

    const-string v15, "RI"

    const-string v16, "SS2"

    const-string v17, "SS3"

    const-string v18, "DCS"

    const-string v19, "PU1"

    const-string v20, "PU2"

    const-string v21, "STS"

    const-string v22, "CCH"

    const-string v23, "MW"

    const-string v24, "SPA"

    const-string v25, "EPA"

    const-string v26, "SOS"

    const-string v27, "SGCI"

    const-string v28, "SCI"

    const-string v29, "CSI"

    const-string v30, "ST"

    const-string v31, "OSC"

    const-string v32, "PM"

    const-string v33, "APC"

    const-string v34, "NBSP"

    const-string v35, "SHY"

    const-string v36, "NQSP"

    const-string v37, "MQSP"

    const-string v38, "ENSP"

    const-string v39, "EMSP"

    const-string v40, "3/MSP"

    const-string v41, "4/MSP"

    const-string v42, "6/MSP"

    const-string v43, "FSP"

    const-string v44, "PSP"

    const-string v45, "THSP"

    const-string v46, "HSP"

    const-string v47, "ZWSP"

    const-string v48, "ZWNJ"

    const-string v49, "ZWJ"

    const-string v50, "LRM"

    const-string v51, "RLM"

    const-string v52, "LSEP"

    const-string v53, "PSEP"

    const-string v54, "LRE"

    const-string v55, "RLE"

    const-string v56, "PDF"

    const-string v57, "LRO"

    const-string v58, "RLO"

    const-string v59, "NNBSP"

    const-string v60, "MMSP"

    const-string v61, "WJ"

    const-string v62, "f()"

    const-string v63, "x"

    const-string v64, ","

    const-string v65, "+"

    const-string v66, "LRI"

    const-string v67, "RLI"

    const-string v68, "FSI"

    const-string v69, "PDI"

    const-string v70, "ISS"

    const-string v71, "ASS"

    const-string v72, "IAFS"

    const-string v73, "AAFS"

    const-string v74, "NADS"

    filled-new-array/range {v3 .. v76}, [Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x4a

    .line 173
    invoke-direct {v1, v4}, Ll/᩵֫ᩴ;-><init>(I)V

    :goto_1
    const/16 v4, 0x4a

    if-ge v2, v4, :cond_1

    .line 175
    aget-char v4, v0, v2

    aget-object v5, v3, v2

    invoke-virtual {v1, v4, v5}, Ll/᩵֫ᩴ;->֫(CLjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 88
    :cond_1
    sput-object v1, Ll/ۢ۫ۡ;->֫֫:Ll/᩵֫ᩴ;

    return-void

    :array_0
    .array-data 2
        0x81s
        0x82s
        0x83s
        0x84s
        0x85s
        0x86s
        0x87s
        0x88s
        0x89s
        0x8as
        0x8bs
        0x8cs
        0x8ds
        0x8es
        0x8fs
        0x90s
        0x91s
        0x92s
        0x93s
        0x94s
        0x95s
        0x96s
        0x97s
        0x98s
        0x99s
        0x9as
        0x9bs
        0x9cs
        0x9ds
        0x9es
        0x9fs
        0xa0s
        0xads
        0x2000s
        0x2001s
        0x2002s
        0x2003s
        0x2004s
        0x2005s
        0x2006s
        0x2007s
        0x2008s
        0x2009s
        0x200as
        0x200bs
        0x200cs
        0x200ds
        0x200es
        0x200fs
        0x2028s
        0x2029s
        0x202as
        0x202bs
        0x202cs
        0x202ds
        0x202es
        0x202fs
        0x205fs
        0x2060s
        0x2061s
        0x2062s
        0x2063s
        0x2064s
        0x2066s
        0x2067s
        0x2068s
        0x2069s
        0x206as
        0x206bs
        0x206cs
        0x206ds
        0x206es
        0x206fs
        -0x101s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 131
    iput v0, p0, Ll/ۢ۫ۡ;->᩸:F

    .line 161
    new-instance v0, Ll/ᩴ۫ۡ;

    invoke-direct {v0}, Ll/ᩴ۫ۡ;-><init>()V

    iput-object v0, p0, Ll/ۢ۫ۡ;->᩺:Ll/ᩴ۫ۡ;

    .line 162
    new-instance v0, Ll/᩷᩻ᩴ;

    invoke-direct {v0}, Ll/᩷᩻ᩴ;-><init>()V

    invoke-static {v0}, Ll/ۤܳᩴ;->֫(Ll/᩷᩻ᩴ;)Ll/۫ܳᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ۫ۡ;->ᩳ:Ll/۫ܳᩴ;

    const/4 v0, 0x0

    .line 177
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->᩻:Z

    .line 182
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->ۜ:Z

    .line 187
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->֡:Z

    const/4 v1, 0x4

    .line 192
    iput v1, p0, Ll/ۢ۫ۡ;->۫:I

    .line 202
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->᩹:Z

    const/4 v1, 0x1

    .line 207
    iput-boolean v1, p0, Ll/ۢ۫ۡ;->᩶:Z

    .line 217
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->᩵:Z

    const/16 v1, 0x80

    new-array v2, v1, [F

    .line 219
    iput-object v2, p0, Ll/ۢ۫ۡ;->ۧ:[F

    new-array v1, v1, [F

    .line 221
    iput-object v1, p0, Ll/ۢ۫ۡ;->֫:[F

    .line 1047
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ll/ۢ۫ۡ;->ᩴ:Landroid/graphics/Rect;

    const/16 v1, 0x100

    new-array v1, v1, [C

    .line 1107
    iput-object v1, p0, Ll/ۢ۫ۡ;->ܽ:[C

    .line 226
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 227
    iget v1, p1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Ll/ۢ۫ۡ;->ܳ:F

    .line 228
    iget p1, p1, Landroid/util/DisplayMetrics;->scaledDensity:F

    iput p1, p0, Ll/ۢ۫ۡ;->ۖ:F

    .line 229
    new-instance p1, Ll/֫ۖܽ;

    invoke-direct {p1, v0}, Ll/֫ۖܽ;-><init>(I)V

    iput-object p1, p0, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    .line 230
    sget-object v0, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 231
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 232
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Ll/֫ۖܽ;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 233
    invoke-virtual {p0}, Ll/ۢ۫ۡ;->ۚ()V

    return-void
.end method

.method public constructor <init>(Ll/ۢ۫ۡ;)V
    .locals 6

    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 131
    iput v0, p0, Ll/ۢ۫ۡ;->᩸:F

    .line 161
    new-instance v0, Ll/ᩴ۫ۡ;

    invoke-direct {v0}, Ll/ᩴ۫ۡ;-><init>()V

    iput-object v0, p0, Ll/ۢ۫ۡ;->᩺:Ll/ᩴ۫ۡ;

    .line 162
    new-instance v0, Ll/᩷᩻ᩴ;

    invoke-direct {v0}, Ll/᩷᩻ᩴ;-><init>()V

    invoke-static {v0}, Ll/ۤܳᩴ;->֫(Ll/᩷᩻ᩴ;)Ll/۫ܳᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ۫ۡ;->ᩳ:Ll/۫ܳᩴ;

    const/4 v0, 0x0

    .line 177
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->᩻:Z

    .line 182
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->ۜ:Z

    .line 187
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->֡:Z

    const/4 v1, 0x4

    .line 192
    iput v1, p0, Ll/ۢ۫ۡ;->۫:I

    .line 202
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->᩹:Z

    const/4 v1, 0x1

    .line 207
    iput-boolean v1, p0, Ll/ۢ۫ۡ;->᩶:Z

    .line 217
    iput-boolean v0, p0, Ll/ۢ۫ۡ;->᩵:Z

    const/16 v1, 0x80

    new-array v2, v1, [F

    .line 219
    iput-object v2, p0, Ll/ۢ۫ۡ;->ۧ:[F

    new-array v3, v1, [F

    .line 221
    iput-object v3, p0, Ll/ۢ۫ۡ;->֫:[F

    .line 1047
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Ll/ۢ۫ۡ;->ᩴ:Landroid/graphics/Rect;

    const/16 v4, 0x100

    new-array v4, v4, [C

    .line 1107
    iput-object v4, p0, Ll/ۢ۫ۡ;->ܽ:[C

    .line 242
    iget v4, p1, Ll/ۢ۫ۡ;->ܳ:F

    iput v4, p0, Ll/ۢ۫ۡ;->ܳ:F

    .line 243
    iget v4, p1, Ll/ۢ۫ۡ;->ۖ:F

    iput v4, p0, Ll/ۢ۫ۡ;->ۖ:F

    .line 244
    new-instance v4, Ll/֫ۖܽ;

    iget-object v5, p1, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-direct {v4, v5}, Ll/֫ۖܽ;-><init>(Ll/֫ۖܽ;)V

    iput-object v4, p0, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    .line 245
    iget v4, p1, Ll/ۢ۫ۡ;->ۤ:I

    iput v4, p0, Ll/ۢ۫ۡ;->ۤ:I

    .line 246
    iget v4, p1, Ll/ۢ۫ۡ;->ۡ:F

    iput v4, p0, Ll/ۢ۫ۡ;->ۡ:F

    .line 247
    iget v4, p1, Ll/ۢ۫ۡ;->ܺ:I

    iput v4, p0, Ll/ۢ۫ۡ;->ܺ:I

    .line 248
    iget v4, p1, Ll/ۢ۫ۡ;->ۢ:F

    iput v4, p0, Ll/ۢ۫ۡ;->ۢ:F

    .line 249
    iget v4, p1, Ll/ۢ۫ۡ;->᩸:F

    iput v4, p0, Ll/ۢ۫ۡ;->᩸:F

    .line 250
    iget v4, p1, Ll/ۢ۫ۡ;->ܶ:F

    iput v4, p0, Ll/ۢ۫ۡ;->ܶ:F

    .line 252
    iget v4, p1, Ll/ۢ۫ۡ;->۠:F

    iput v4, p0, Ll/ۢ۫ۡ;->۠:F

    .line 253
    iget v4, p1, Ll/ۢ۫ۡ;->ܿ:F

    iput v4, p0, Ll/ۢ۫ۡ;->ܿ:F

    .line 254
    iget v4, p1, Ll/ۢ۫ۡ;->᩷:F

    iput v4, p0, Ll/ۢ۫ۡ;->᩷:F

    .line 255
    iget v4, p1, Ll/ۢ۫ۡ;->ۙ:F

    iput v4, p0, Ll/ۢ۫ۡ;->ۙ:F

    .line 256
    iget v4, p1, Ll/ۢ۫ۡ;->۬:F

    iput v4, p0, Ll/ۢ۫ۡ;->۬:F

    .line 257
    iget-boolean v4, p1, Ll/ۢ۫ۡ;->᩻:Z

    iput-boolean v4, p0, Ll/ۢ۫ۡ;->᩻:Z

    .line 258
    iget-boolean v4, p1, Ll/ۢ۫ۡ;->ۜ:Z

    iput-boolean v4, p0, Ll/ۢ۫ۡ;->ۜ:Z

    .line 259
    iget-boolean v4, p1, Ll/ۢ۫ۡ;->֡:Z

    iput-boolean v4, p0, Ll/ۢ۫ۡ;->֡:Z

    .line 260
    iget v4, p1, Ll/ۢ۫ۡ;->۫:I

    iput v4, p0, Ll/ۢ۫ۡ;->۫:I

    .line 261
    iget v4, p1, Ll/ۢ۫ۡ;->֨:F

    iput v4, p0, Ll/ۢ۫ۡ;->֨:F

    .line 262
    iget v4, p1, Ll/ۢ۫ۡ;->ۚ:F

    iput v4, p0, Ll/ۢ۫ۡ;->ۚ:F

    .line 263
    iget-boolean v4, p1, Ll/ۢ۫ۡ;->᩹:Z

    iput-boolean v4, p0, Ll/ۢ۫ۡ;->᩹:Z

    .line 264
    iget-boolean v4, p1, Ll/ۢ۫ۡ;->᩶:Z

    iput-boolean v4, p0, Ll/ۢ۫ۡ;->᩶:Z

    .line 265
    iget v4, p1, Ll/ۢ۫ۡ;->ۗ:I

    iput v4, p0, Ll/ۢ۫ۡ;->ۗ:I

    .line 266
    iget-object v4, p1, Ll/ۢ۫ۡ;->ۧ:[F

    invoke-static {v4, v0, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 267
    iget-object p1, p1, Ll/ۢ۫ۡ;->֫:[F

    invoke-static {p1, v0, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static ֫(II)I
    .locals 5

    .line 1639
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v0

    .line 1642
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v1

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, v0

    add-float/2addr v3, v2

    float-to-int v2, v3

    .line 1643
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, v1

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v4

    int-to-float v4, v4

    mul-float v4, v4, v0

    add-float/2addr v4, v3

    float-to-int v3, v4

    .line 1644
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    int-to-float p0, p0

    mul-float p0, p0, v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, v0

    add-float/2addr p1, p0

    float-to-int p0, p1

    .line 1646
    invoke-static {v2, v3, p0}, Landroid/graphics/Color;->rgb(III)I

    move-result p0

    return p0
.end method

.method private ֫(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;Ljava/lang/Runnable;)V
    .locals 10

    .line 1095
    iget-object v0, p0, Ll/ۢ۫ۡ;->ᩴ:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p5}, Ljava/lang/Runnable;->run()V

    return-void

    .line 1096
    :cond_0
    iget-object v2, p0, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    add-float v5, p2, v1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    add-float v6, p3, v1

    iget v1, v0, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    add-float v7, p2, v1

    iget p2, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float p2, p2

    add-float v8, p3, p2

    move-object v3, p1

    move-object v4, p4

    move-object v9, p5

    invoke-interface/range {v2 .. v9}, Ll/᩻۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFLjava/lang/Runnable;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 1097
    iput-object p1, p0, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    :cond_1
    return-void
.end method

.method private ֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V
    .locals 9

    .line 1102
    iget-object v0, p0, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    if-nez v0, :cond_0

    move-object v0, p1

    move v1, p3

    move v2, p4

    move v3, p5

    move v4, p6

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void

    .line 1103
    :cond_0
    new-instance v8, Ll/ܿ۫ۡ;

    move-object v1, v8

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Ll/ܿ۫ۡ;-><init>(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move-object v7, v8

    invoke-interface/range {v0 .. v7}, Ll/᩻۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFLjava/lang/Runnable;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 1104
    iput-object p1, p0, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    :cond_1
    return-void
.end method

.method private ֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V
    .locals 15

    move-object v6, p0

    move-object/from16 v0, p2

    move/from16 v1, p3

    move/from16 v2, p4

    move-object/from16 v4, p7

    .line 1065
    iget-object v3, v6, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    if-nez v3, :cond_0

    .line 1066
    invoke-virtual/range {p1 .. p7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    return-void

    .line 1069
    :cond_0
    instance-of v3, v0, Ljava/lang/String;

    iget-object v5, v6, Ll/ۢ۫ۡ;->ᩴ:Landroid/graphics/Rect;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 1070
    invoke-virtual {v4, v3, v1, v2, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    goto :goto_0

    .line 1071
    :cond_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1d

    if-lt v3, v7, :cond_2

    .line 1072
    invoke-virtual {v4, v0, v1, v2, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V

    goto :goto_0

    :cond_2
    sub-int v3, v2, v1

    .line 1075
    new-array v7, v3, [C

    const/4 v8, 0x0

    .line 1076
    invoke-static {v0, v1, v2, v7, v8}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    .line 1077
    invoke-virtual {v4, v7, v8, v3, v5}, Landroid/graphics/Paint;->getTextBounds([CIILandroid/graphics/Rect;)V

    .line 1079
    :goto_0
    new-instance v5, Ll/ᩳ۫ۡ;

    move-object v7, v5

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p3

    move/from16 v11, p4

    move/from16 v12, p5

    move/from16 v13, p6

    move-object/from16 v14, p7

    invoke-direct/range {v7 .. v14}, Ll/ᩳ۫ۡ;-><init>(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    move-object v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    move/from16 v3, p6

    move-object/from16 v4, p7

    invoke-direct/range {v0 .. v5}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;Ljava/lang/Runnable;)V

    return-void
.end method

.method private ֫(Landroid/graphics/Canvas;[CIFFLandroid/graphics/Paint;)V
    .locals 17

    move-object/from16 v6, p0

    .line 1084
    iget-object v0, v6, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    const/4 v9, 0x0

    if-nez v0, :cond_0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v10, p3

    move/from16 v11, p4

    move/from16 v12, p5

    move-object/from16 v13, p6

    .line 1085
    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    return-void

    .line 1088
    :cond_0
    iget-object v0, v6, Ll/ۢ۫ۡ;->ᩴ:Landroid/graphics/Rect;

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v4, p6

    invoke-virtual {v4, v1, v9, v2, v0}, Landroid/graphics/Paint;->getTextBounds([CIILandroid/graphics/Rect;)V

    .line 1089
    new-instance v5, Ll/ܽ۫ۡ;

    move-object v10, v5

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    move/from16 v14, p4

    move/from16 v15, p5

    move-object/from16 v16, p6

    invoke-direct/range {v10 .. v16}, Ll/ܽ۫ۡ;-><init>(Landroid/graphics/Canvas;[CIFFLandroid/graphics/Paint;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    move/from16 v3, p5

    invoke-direct/range {v0 .. v5}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;Ljava/lang/Runnable;)V

    return-void
.end method

.method private ֫(Landroid/graphics/Paint$FontMetrics;)V
    .locals 3

    .line 292
    iget-object v0, p0, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontSpacing()F

    move-result v0

    iget v1, p0, Ll/ۢ۫ۡ;->᩸:F

    mul-float v0, v0, v1

    iput v0, p0, Ll/ۢ۫ۡ;->ܶ:F

    float-to-double v0, v0

    .line 293
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 294
    iget v0, p1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    neg-float v1, v0

    iget v2, p0, Ll/ۢ۫ۡ;->ܶ:F

    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->descent:F

    sub-float/2addr p1, v0

    sub-float/2addr v2, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr v2, p1

    add-float/2addr v2, v1

    iput v2, p0, Ll/ۢ۫ۡ;->۠:F

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢ۫ۡ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۢ۫ۡ;->᩶:Z

    return p0
.end method

.method private ۧ(C)F
    .locals 3

    .line 905
    iget-object v0, p0, Ll/ۢ۫ۡ;->ᩳ:Ll/۫ܳᩴ;

    invoke-virtual {v0, p1}, Ll/۫ܳᩴ;->ۧ(I)F

    move-result v1

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v2, v1, v2

    if-nez v2, :cond_0

    .line 907
    iget-object v1, p0, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    .line 908
    invoke-virtual {v0, v1, p1}, Ll/᩸ܳᩴ;->֫(FI)F

    :cond_0
    return v1
.end method

.method private ۧ(Ljava/lang/CharSequence;IIFF)F
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p5

    const/4 v4, 0x0

    if-gez p2, :cond_0

    return v4

    .line 541
    :cond_0
    iget-boolean v4, v0, Ll/ۢ۫ۡ;->᩹:Z

    iget-object v5, v0, Ll/ۢ۫ۡ;->ۧ:[F

    if-eqz v4, :cond_1

    iget-object v4, v0, Ll/ۢ۫ۡ;->֫:[F

    goto :goto_0

    :cond_1
    move-object v4, v5

    .line 542
    :goto_0
    iget-boolean v6, v0, Ll/ۢ۫ۡ;->᩶:Z

    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpl-float v7, v3, v7

    if-nez v7, :cond_2

    .line 545
    instance-of v7, v1, Ll/᩷۫ۡ;

    if-eqz v7, :cond_2

    move-object v7, v1

    check-cast v7, Ll/᩷۫ۡ;

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v8, p2

    move v9, v8

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 555
    :goto_2
    iget-object v12, v0, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    iget-object v13, v0, Ll/ۢ۫ۡ;->᩺:Ll/ᩴ۫ۡ;

    if-ge v8, v2, :cond_1f

    cmpg-float v14, v10, v3

    if-gez v14, :cond_1f

    const/4 v14, 0x1

    if-eqz v11, :cond_8

    .line 557
    invoke-static {v8, v2, v1}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v15

    const/16 v16, 0x0

    move/from16 p2, v11

    sub-int v11, v15, v8

    if-ne v11, v14, :cond_7

    .line 559
    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    .line 560
    invoke-static {v11}, Ll/۫۬ۡ;->֫(C)B

    move-result v14

    move/from16 v18, v15

    const/16 v15, 0xf

    if-ne v14, v15, :cond_3

    .line 562
    invoke-static {v11}, Ll/ܰ۬ۡ;->ܽ(I)Z

    move-result v11

    if-nez v11, :cond_4

    goto :goto_3

    :cond_3
    const/16 v11, 0x8

    if-ne v14, v11, :cond_4

    if-nez v6, :cond_4

    goto :goto_3

    .line 580
    :cond_4
    invoke-interface {v1, v9, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v9

    .line 581
    invoke-virtual {v13, v9}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v11

    if-nez v11, :cond_5

    .line 583
    invoke-virtual {v12, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    .line 584
    invoke-virtual {v13, v9, v11}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 586
    :cond_5
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v9

    add-float/2addr v10, v9

    cmpl-float v9, v10, v3

    if-ltz v9, :cond_6

    const/4 v4, 0x0

    goto/16 :goto_12

    :cond_6
    const/4 v9, 0x0

    move v9, v8

    const/4 v11, 0x0

    const/4 v14, 0x1

    goto :goto_4

    :cond_7
    move/from16 v18, v15

    :goto_3
    move/from16 v11, p2

    move/from16 v8, v18

    goto :goto_2

    :cond_8
    move/from16 p2, v11

    const/4 v14, 0x1

    const/16 v16, 0x0

    :goto_4
    if-eqz v7, :cond_11

    .line 594
    invoke-static {v7, v8}, Ll/᩷۫ۡ;->֫(Ll/᩷۫ۡ;I)V

    .line 595
    invoke-static {v7}, Ll/᩷۫ۡ;->֫(Ll/᩷۫ۡ;)[C

    move-result-object v15

    move/from16 p2, v9

    .line 596
    invoke-static {v7}, Ll/᩷۫ۡ;->ۧ(Ll/᩷۫ۡ;)I

    move-result v9

    invoke-static {v2, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 597
    invoke-static {v7}, Ll/᩷۫ۡ;->ܽ(Ll/᩷۫ۡ;)I

    move-result v17

    sub-int v17, v8, v17

    :goto_5
    if-ge v8, v9, :cond_e

    move-object/from16 v18, v7

    .line 599
    aget-char v7, v15, v17

    move/from16 v19, v11

    const/16 v11, 0x7f

    if-gt v7, v11, :cond_f

    const/16 v11, 0x9

    if-ne v7, v11, :cond_9

    goto :goto_6

    .line 602
    :cond_9
    sget v11, Ll/ۛ۬ۡ;->֫:I

    const/16 v11, 0x30

    if-gt v11, v7, :cond_a

    const/16 v11, 0x39

    if-le v7, v11, :cond_b

    :cond_a
    const/16 v11, 0x23

    if-eq v7, v11, :cond_b

    const/16 v11, 0x2a

    if-ne v7, v11, :cond_c

    :cond_b
    add-int/lit8 v11, v8, 0x1

    if-ge v11, v2, :cond_c

    if-eq v11, v9, :cond_f

    add-int/lit8 v11, v17, 0x1

    aget-char v11, v15, v11

    move-object/from16 v20, v15

    const/16 v15, 0x7f

    if-le v11, v15, :cond_d

    goto :goto_6

    :cond_c
    move-object/from16 v20, v15

    .line 605
    :cond_d
    aget v7, v4, v7

    add-float/2addr v10, v7

    add-int/lit8 v17, v17, 0x1

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v7, v18

    move/from16 v11, v19

    move-object/from16 v15, v20

    goto :goto_5

    :cond_e
    move-object/from16 v18, v7

    move/from16 v19, v11

    :cond_f
    :goto_6
    if-ne v8, v2, :cond_10

    move/from16 v8, p2

    move/from16 v11, v19

    goto/16 :goto_11

    :cond_10
    if-ne v8, v9, :cond_12

    goto/16 :goto_d

    :cond_11
    move-object/from16 v18, v7

    move/from16 p2, v9

    move/from16 v19, v11

    .line 612
    :cond_12
    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    .line 613
    invoke-static {v7}, Ll/۫۬ۡ;->֫(C)B

    move-result v9

    .line 614
    sget-object v11, Ll/ۢ۫ۡ;->֫֫:Ll/᩵֫ᩴ;

    packed-switch v9, :pswitch_data_0

    .line 726
    invoke-static {v7}, Ll/ܰ۬ۡ;->ܽ(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    if-lez v8, :cond_1d

    add-int/lit8 v9, v8, -0x1

    .line 727
    invoke-interface {v1, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    invoke-static {v9}, Ll/ܰ۬ۡ;->ܽ(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    .line 728
    invoke-static {v7}, Ll/ܰ۬ۡ;->֫(I)Z

    move-result v9

    if-eqz v9, :cond_1c

    .line 729
    invoke-direct {v0, v7}, Ll/ۢ۫ۡ;->ۧ(C)F

    move-result v7

    goto/16 :goto_b

    :pswitch_0
    if-eqz v6, :cond_13

    .line 1011
    invoke-virtual {v11, v7}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 1012
    invoke-virtual {v13, v7}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v9

    if-nez v9, :cond_15

    goto :goto_8

    .line 648
    :cond_13
    iget v7, v0, Ll/ۢ۫ۡ;->ۙ:F

    goto :goto_7

    :pswitch_1
    if-eqz v6, :cond_14

    .line 1011
    invoke-virtual {v11, v7}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 1012
    invoke-virtual {v13, v7}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v9

    if-nez v9, :cond_15

    goto :goto_8

    .line 638
    :cond_14
    aget v7, v5, v16

    :goto_7
    add-float/2addr v7, v10

    goto :goto_9

    :pswitch_2
    if-eqz v6, :cond_16

    .line 1011
    invoke-virtual {v11, v7}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 1012
    invoke-virtual {v13, v7}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v9

    if-nez v9, :cond_15

    .line 1014
    :goto_8
    invoke-virtual {v12, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    .line 1015
    invoke-virtual {v13, v7, v9}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1017
    :cond_15
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v7

    iget v9, v0, Ll/ۢ۫ۡ;->ۗ:I

    mul-int/lit8 v9, v9, 0x2

    int-to-float v9, v9

    add-float/2addr v7, v9

    goto :goto_7

    :goto_9
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_a

    .line 629
    :cond_16
    invoke-static {v8, v2, v1}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v7

    goto/16 :goto_f

    .line 719
    :pswitch_3
    invoke-direct {v0, v7}, Ll/ۢ۫ۡ;->ۧ(C)F

    move-result v7

    goto/16 :goto_b

    .line 713
    :pswitch_4
    aget v7, v5, v16

    goto/16 :goto_b

    .line 707
    :pswitch_5
    iget v7, v0, Ll/ۢ۫ۡ;->᩷:F

    goto/16 :goto_b

    .line 701
    :pswitch_6
    aget v7, v4, v7

    goto/16 :goto_b

    :pswitch_7
    sub-int v9, v2, v8

    const/4 v11, 0x3

    if-lt v9, v11, :cond_18

    add-int/lit8 v11, v8, 0x1

    .line 673
    invoke-interface {v1, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    const v15, 0xfe0f

    if-ne v11, v15, :cond_18

    add-int/lit8 v11, v8, 0x2

    invoke-interface {v1, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    const/16 v15, 0x20e3

    const v20, 0xfe0f

    if-ne v11, v15, :cond_18

    const/4 v9, 0x3

    new-array v9, v9, [C

    .line 674
    aput-char v7, v9, v16

    aput-char v20, v9, v14

    const/4 v7, 0x2

    aput-char v15, v9, v7

    .line 675
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v9}, Ljava/lang/String;-><init>([C)V

    .line 676
    invoke-virtual {v13, v7}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v9

    if-nez v9, :cond_17

    .line 678
    invoke-virtual {v12, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    .line 679
    invoke-virtual {v13, v7, v9}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 681
    :cond_17
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v7

    add-float/2addr v7, v10

    add-int/lit8 v8, v8, 0x3

    goto :goto_a

    :cond_18
    const/4 v11, 0x2

    if-lt v9, v11, :cond_1a

    add-int/lit8 v9, v8, 0x1

    .line 683
    invoke-interface {v1, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    const/16 v15, 0x20e3

    if-ne v9, v15, :cond_1a

    new-array v9, v11, [C

    .line 684
    aput-char v7, v9, v16

    aput-char v15, v9, v14

    .line 685
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v9}, Ljava/lang/String;-><init>([C)V

    .line 686
    invoke-virtual {v13, v7}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v9

    if-nez v9, :cond_19

    .line 688
    invoke-virtual {v12, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    .line 689
    invoke-virtual {v13, v7, v9}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 691
    :cond_19
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v7

    add-float/2addr v7, v10

    add-int/lit8 v8, v8, 0x2

    :goto_a
    move/from16 v9, p2

    move v10, v7

    goto :goto_e

    .line 694
    :cond_1a
    aget v7, v4, v7

    goto :goto_b

    :pswitch_8
    add-float v7, p4, v10

    .line 662
    iget v9, v0, Ll/ۢ۫ۡ;->ۙ:F

    iget v11, v0, Ll/ۢ۫ۡ;->۫:I

    int-to-float v11, v11

    mul-float v11, v11, v9

    div-float v12, v7, v11

    float-to-int v12, v12

    add-int/lit8 v12, v12, 0x1

    int-to-float v12, v12

    mul-float v12, v12, v11

    sub-float/2addr v12, v7

    cmpg-float v7, v12, v9

    if-gez v7, :cond_1b

    add-float/2addr v12, v11

    :cond_1b
    add-float/2addr v10, v12

    goto :goto_c

    .line 655
    :pswitch_9
    iget v7, v0, Ll/ۢ۫ۡ;->ۙ:F

    goto :goto_b

    .line 617
    :pswitch_a
    iget v7, v0, Ll/ۢ۫ۡ;->ܿ:F

    goto :goto_b

    .line 731
    :cond_1c
    iget v7, v0, Ll/ۢ۫ۡ;->۬:F

    :goto_b
    add-float/2addr v10, v7

    :cond_1d
    :goto_c
    add-int/lit8 v8, v8, 0x1

    :goto_d
    move/from16 v9, p2

    :goto_e
    move/from16 v11, v19

    goto :goto_10

    .line 739
    :cond_1e
    invoke-static {v8, v2, v1}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v7

    :goto_f
    const/4 v9, 0x1

    move v9, v8

    const/4 v11, 0x1

    move v8, v7

    :goto_10
    move-object/from16 v7, v18

    goto/16 :goto_2

    :cond_1f
    move/from16 p2, v11

    move/from16 v11, p2

    move v8, v9

    :goto_11
    move v4, v11

    :goto_12
    if-eqz v4, :cond_21

    .line 752
    invoke-interface {v1, v8, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 753
    invoke-virtual {v13, v1}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    if-nez v2, :cond_20

    .line 755
    invoke-virtual {v12, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 756
    invoke-virtual {v13, v1, v2}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 758
    :cond_20
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v10, v1

    .line 760
    :cond_21
    invoke-static {v10, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    return v1

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
.end method


# virtual methods
.method public final ֡()Z
    .locals 1

    .line 358
    iget-boolean v0, p0, Ll/ۢ۫ۡ;->᩶:Z

    return v0
.end method

.method public final ֫(C)F
    .locals 1

    .line 915
    iget-boolean v0, p0, Ll/ۢ۫ۡ;->᩹:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢ۫ۡ;->֫:[F

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۢ۫ۡ;->ۧ:[F

    :goto_0
    aget p1, v0, p1

    return p1
.end method

.method public final ֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZ)F
    .locals 44

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move/from16 v11, p4

    move/from16 v12, p5

    move/from16 v13, p7

    move/from16 v14, p8

    move-object/from16 v15, p10

    .line 1120
    iget-boolean v0, v8, Ll/ۢ۫ۡ;->᩵:Z

    .line 1124
    iget-boolean v1, v8, Ll/ۢ۫ۡ;->᩹:Z

    if-eqz v1, :cond_0

    sget-object v2, Ll/ۢ۫ۡ;->ܰ:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v2, Ll/ۢ۫ۡ;->۟:[Ljava/lang/String;

    :goto_0
    move-object/from16 v16, v2

    .line 1125
    iget-object v7, v8, Ll/ۢ۫ۡ;->ۧ:[F

    if-eqz v1, :cond_1

    iget-object v1, v8, Ll/ۢ۫ۡ;->֫:[F

    move-object/from16 v17, v1

    goto :goto_1

    :cond_1
    move-object/from16 v17, v7

    .line 1126
    :goto_1
    iget-boolean v6, v8, Ll/ۢ۫ۡ;->᩶:Z

    and-int/lit8 v1, p11, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    const/16 v18, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    const/16 v18, 0x0

    :goto_2
    and-int/lit8 v1, p11, 0x2

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    const/16 v19, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    const/16 v19, 0x0

    :goto_3
    and-int/lit8 v1, p11, 0x4

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    const/16 v20, 0x1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    const/16 v20, 0x0

    :goto_4
    and-int/lit8 v1, p11, 0x8

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    const/16 v21, 0x1

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    const/16 v21, 0x0

    :goto_5
    if-nez p12, :cond_7

    if-nez v20, :cond_6

    if-eqz v21, :cond_7

    :cond_6
    const/4 v1, 0x1

    const/16 v22, 0x1

    goto :goto_6

    :cond_7
    move/from16 v22, p12

    :goto_6
    if-eqz v18, :cond_8

    .line 1138
    invoke-virtual {v15, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 1141
    :cond_8
    iget-object v5, v8, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    const/high16 v23, 0x40000000    # 2.0f

    if-eqz v19, :cond_a

    .line 1143
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 1144
    iget v2, v8, Ll/ۢ۫ۡ;->ۡ:F

    div-float v2, v2, v23

    .line 1145
    iget v3, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float v3, p6, v3

    add-float/2addr v3, v2

    const/4 v4, 0x0

    invoke-virtual {v9, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1146
    iget v3, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float/2addr v3, v2

    move/from16 v24, v0

    const v0, -0x41b33333    # -0.2f

    .line 1147
    invoke-virtual {v9, v0, v4}, Landroid/graphics/Canvas;->skew(FF)V

    if-eqz v5, :cond_9

    .line 1149
    iget v0, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float v0, p6, v0

    add-float/2addr v0, v2

    .line 1151
    new-instance v2, Ll/ۧ۫ۡ;

    invoke-direct {v2, v0, v5}, Ll/ۧ۫ۡ;-><init>(FLl/᩻۫ۡ;)V

    iput-object v2, v8, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    :cond_9
    move v4, v1

    move/from16 v25, v3

    goto :goto_7

    :cond_a
    move/from16 v24, v0

    const/4 v1, -0x1

    move/from16 v25, p6

    const/4 v4, -0x1

    .line 1175
    :goto_7
    iget-object v3, v8, Ll/ۢ۫ۡ;->ۨ:Ll/ۖ۫ۡ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    move/from16 v0, p3

    move v1, v0

    move/from16 v27, v12

    const/4 v2, 0x0

    const/16 v26, 0x0

    :goto_8
    const/16 v28, 0x0

    :goto_9
    if-ge v1, v11, :cond_66

    if-eqz v24, :cond_17

    .line 1178
    invoke-static {v1, v11, v10}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v29

    move-object/from16 p11, v3

    sub-int v3, v29, v1

    move/from16 p12, v4

    const/4 v4, 0x1

    if-ne v3, v4, :cond_16

    .line 1181
    invoke-interface {v10, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 1182
    invoke-static {v3}, Ll/۫۬ۡ;->֫(C)B

    move-result v4

    move-object/from16 v30, v5

    const/16 v5, 0xf

    if-ne v4, v5, :cond_b

    .line 1184
    invoke-static {v3}, Ll/ܰ۬ۡ;->ܽ(I)Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_a

    :cond_b
    const/16 v5, 0x8

    if-ne v4, v5, :cond_c

    if-nez v6, :cond_c

    :goto_a
    move-object/from16 v9, p11

    move/from16 v32, p12

    move v3, v0

    move-object/from16 v34, v7

    move-object/from16 v33, v30

    move/from16 v30, v6

    goto/16 :goto_e

    :cond_c
    const/4 v4, 0x0

    :cond_d
    if-eqz v4, :cond_f

    const/16 v4, 0x300

    if-lt v3, v4, :cond_e

    const/16 v4, 0x3ff

    if-gt v3, v4, :cond_e

    const/4 v4, 0x1

    goto :goto_b

    :cond_e
    const/4 v4, 0x0

    .line 1206
    :cond_f
    :goto_b
    invoke-virtual {v15, v10, v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v24

    if-nez v2, :cond_10

    add-float v3, v27, v24

    int-to-float v5, v13

    cmpl-float v3, v3, v5

    if-ltz v3, :cond_10

    const/4 v2, 0x1

    const/16 v28, 0x1

    goto :goto_c

    :cond_10
    move/from16 v28, v2

    :goto_c
    if-eqz v4, :cond_11

    add-int/lit8 v1, v1, 0x1

    :cond_11
    move v5, v1

    if-eqz v28, :cond_12

    const/16 v29, 0x0

    const/16 v31, 0x0

    move v3, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p11

    move/from16 v32, p12

    move-object v9, v4

    move v4, v5

    move v12, v5

    move-object/from16 v33, v30

    move/from16 v5, v27

    move/from16 v30, v6

    move/from16 v6, v25

    move-object/from16 v34, v7

    move-object/from16 v7, p10

    .line 1214
    invoke-direct/range {v0 .. v7}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    goto :goto_d

    :cond_12
    move-object/from16 v9, p11

    move/from16 v32, p12

    move v12, v5

    move-object/from16 v34, v7

    move-object/from16 v33, v30

    move/from16 v30, v6

    const/16 v29, 0x0

    const/16 v31, 0x0

    :goto_d
    add-float v27, v27, v24

    .line 1218
    iget-boolean v0, v8, Ll/ۢ۫ۡ;->᩵:Z

    if-eqz v28, :cond_13

    int-to-float v1, v14

    cmpl-float v1, v27, v1

    if-gtz v1, :cond_14

    :cond_13
    if-lt v12, v11, :cond_15

    :cond_14
    move-object v9, v10

    move v5, v12

    move-object/from16 v10, p1

    goto/16 :goto_3c

    :cond_15
    const/4 v1, 0x0

    move/from16 v24, v0

    move v3, v12

    move/from16 v2, v28

    const/16 v28, 0x0

    goto :goto_f

    :cond_16
    move-object/from16 v9, p11

    move/from16 v32, p12

    move v3, v0

    move-object/from16 v33, v5

    move/from16 v30, v6

    move-object/from16 v34, v7

    :goto_e
    move v0, v3

    move/from16 v1, v29

    goto :goto_10

    :cond_17
    move-object v9, v3

    move/from16 v32, v4

    move-object/from16 v33, v5

    move/from16 v30, v6

    move-object/from16 v34, v7

    move v3, v0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move v12, v1

    .line 1223
    :goto_f
    invoke-interface {v10, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-eqz v26, :cond_1c

    .line 1225
    invoke-static {v7}, Ll/۫۬ۡ;->ۧ(C)Z

    move-result v0

    if-eqz v0, :cond_18

    add-int/lit8 v12, v12, 0x1

    move v0, v3

    move v1, v12

    :goto_10
    move/from16 v12, p5

    move-object v3, v9

    move/from16 v6, v30

    move/from16 v4, v32

    move-object/from16 v5, v33

    move-object/from16 v7, v34

    move-object/from16 v9, p1

    goto/16 :goto_9

    .line 1229
    :cond_18
    invoke-virtual {v15, v10, v3, v12}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v26

    if-nez v2, :cond_19

    add-float v0, v27, v26

    int-to-float v1, v13

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_19

    const/4 v2, 0x1

    const/16 v28, 0x1

    goto :goto_11

    :cond_19
    move/from16 v28, v2

    :goto_11
    if-eqz v28, :cond_1a

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v4, v12

    move/from16 v5, v27

    move/from16 v6, v25

    move/from16 p3, v7

    move-object/from16 v7, p10

    .line 1234
    invoke-direct/range {v0 .. v7}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    goto :goto_12

    :cond_1a
    move/from16 p3, v7

    :goto_12
    add-float v27, v27, v26

    if-eqz v28, :cond_1b

    int-to-float v0, v14

    cmpl-float v0, v27, v0

    if-lez v0, :cond_1b

    const/4 v0, 0x0

    move-object v9, v10

    move-object/from16 v10, p1

    goto/16 :goto_40

    :cond_1b
    const/4 v0, 0x0

    const/4 v1, 0x0

    move/from16 v26, v12

    move/from16 v2, v28

    move/from16 v28, v27

    const/16 v27, 0x0

    goto :goto_13

    :cond_1c
    move/from16 p3, v7

    move/from16 v1, v28

    move/from16 v28, v27

    move/from16 v27, v26

    move/from16 v26, v3

    .line 1243
    :goto_13
    invoke-static/range {p3 .. p3}, Ll/۫۬ۡ;->֫(C)B

    move-result v0

    .line 1244
    iget-object v4, v8, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    sget-object v5, Ll/ۢ۫ۡ;->֫֫:Ll/᩵֫ᩴ;

    iget-object v6, v8, Ll/ۢ۫ۡ;->᩺:Ll/ᩴ۫ۡ;

    const/4 v7, 0x2

    iget-object v3, v8, Ll/ۢ۫ۡ;->ܽ:[C

    packed-switch v0, :pswitch_data_0

    move/from16 v0, p3

    move-object v7, v9

    move-object v9, v10

    move-object/from16 v10, p1

    .line 1551
    invoke-static {v0}, Ll/ܰ۬ۡ;->ܽ(I)Z

    move-result v4

    if-eqz v4, :cond_65

    if-lez v12, :cond_61

    add-int/lit8 v1, v12, -0x1

    .line 1553
    invoke-interface {v9, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ll/ܰ۬ۡ;->ܽ(I)Z

    move-result v1

    if-eqz v1, :cond_61

    .line 1554
    invoke-static {v0}, Ll/ܰ۬ۡ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_60

    .line 1555
    invoke-direct {v8, v0}, Ll/ۢ۫ۡ;->ۧ(C)F

    move-result v1

    goto/16 :goto_38

    :pswitch_0
    if-eqz v30, :cond_20

    move/from16 v0, p3

    .line 1338
    invoke-virtual {v5, v0}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    .line 1011
    invoke-virtual {v5, v0}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1012
    invoke-virtual {v6, v0}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_1d

    .line 1014
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 1015
    invoke-virtual {v6, v0, v1}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1017
    :cond_1d
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v7, v8, Ll/ۢ۫ۡ;->ۗ:I

    mul-int/lit8 v1, v7, 0x2

    int-to-float v1, v1

    add-float v29, v0, v1

    if-nez v2, :cond_1e

    add-float v0, v28, v29

    int-to-float v1, v13

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1e

    const/4 v2, 0x1

    const/16 v35, 0x1

    goto :goto_14

    :cond_1e
    move/from16 v35, v2

    :goto_14
    if-eqz v35, :cond_1f

    .line 1024
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    int-to-float v6, v7

    add-float v36, v28, v6

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v5

    move/from16 v5, v36

    move/from16 v37, v6

    move/from16 v6, v25

    move/from16 v38, v7

    move-object/from16 v7, p10

    invoke-direct/range {v0 .. v7}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 1025
    iget v0, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float v0, v25, v0

    .line 1026
    iget v1, v8, Ll/ۢ۫ۡ;->֨:F

    add-float/2addr v1, v0

    mul-int/lit8 v7, v38, 0x3

    int-to-float v2, v7

    sub-float/2addr v1, v2

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v6, v3

    .line 1027
    iget v1, v8, Ll/ۢ۫ۡ;->ۚ:F

    add-float/2addr v0, v1

    add-float/2addr v0, v2

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v5, v0

    add-float v39, v28, v29

    int-to-float v4, v6

    add-int v0, v6, v38

    int-to-float v3, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p10

    move/from16 v40, v3

    move/from16 v3, v28

    move-object/from16 p3, v9

    move v9, v5

    move/from16 v5, v39

    move/from16 v41, v6

    move/from16 v6, v40

    .line 1029
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    add-int v6, v41, v7

    int-to-float v6, v6

    move/from16 v4, v40

    move/from16 v5, v36

    move/from16 v41, v6

    .line 1030
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-float v37, v39, v37

    move/from16 v3, v37

    move/from16 v5, v39

    .line 1031
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-int v5, v9, v38

    int-to-float v6, v5

    int-to-float v5, v9

    move/from16 v3, v28

    move v4, v6

    move/from16 v38, v5

    move/from16 v5, v39

    move/from16 v40, v6

    move/from16 v6, v38

    .line 1032
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-int v5, v9, v7

    int-to-float v7, v5

    move/from16 v4, v40

    move/from16 v5, v36

    move v6, v7

    .line 1033
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    move/from16 v3, v37

    move/from16 v5, v39

    .line 1034
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    goto :goto_15

    :cond_1f
    move-object/from16 p3, v9

    :goto_15
    add-float v28, v28, v29

    add-int/lit8 v12, v12, 0x1

    if-eqz v35, :cond_2b

    int-to-float v0, v14

    cmpl-float v0, v28, v0

    if-lez v0, :cond_2b

    goto/16 :goto_18

    :cond_20
    move-object/from16 p3, v9

    if-nez v2, :cond_21

    .line 1353
    iget v0, v8, Ll/ۢ۫ۡ;->ۙ:F

    add-float v0, v28, v0

    int-to-float v1, v13

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_21

    const/4 v2, 0x1

    .line 1356
    :cond_21
    iget v0, v8, Ll/ۢ۫ۡ;->ۙ:F

    add-float v28, v28, v0

    add-int/lit8 v12, v12, 0x1

    if-eqz v2, :cond_22

    int-to-float v0, v14

    cmpl-float v0, v28, v0

    if-lez v0, :cond_22

    move/from16 v35, v2

    goto/16 :goto_18

    :cond_22
    move-object/from16 v7, p3

    move-object v9, v10

    move v1, v12

    move-object/from16 v10, p1

    goto/16 :goto_35

    :pswitch_1
    move/from16 v0, p3

    move-object/from16 p3, v9

    if-eqz v30, :cond_26

    .line 1293
    invoke-virtual {v5, v0}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    .line 1011
    invoke-virtual {v5, v0}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1012
    invoke-virtual {v6, v0}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_23

    .line 1014
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 1015
    invoke-virtual {v6, v0, v1}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1017
    :cond_23
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v9, v8, Ll/ۢ۫ۡ;->ۗ:I

    mul-int/lit8 v1, v9, 0x2

    int-to-float v1, v1

    add-float v29, v0, v1

    if-nez v2, :cond_24

    add-float v0, v28, v29

    int-to-float v1, v13

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_24

    const/4 v2, 0x1

    const/16 v35, 0x1

    goto :goto_16

    :cond_24
    move/from16 v35, v2

    :goto_16
    if-eqz v35, :cond_25

    .line 1024
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    int-to-float v7, v9

    add-float v36, v28, v7

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v5

    move/from16 v5, v36

    move/from16 v6, v25

    move/from16 v37, v7

    move-object/from16 v7, p10

    invoke-direct/range {v0 .. v7}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 1025
    iget v0, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float v0, v25, v0

    .line 1026
    iget v1, v8, Ll/ۢ۫ۡ;->֨:F

    add-float/2addr v1, v0

    mul-int/lit8 v7, v9, 0x3

    int-to-float v2, v7

    sub-float/2addr v1, v2

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v6, v3

    .line 1027
    iget v1, v8, Ll/ۢ۫ۡ;->ۚ:F

    add-float/2addr v0, v1

    add-float/2addr v0, v2

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v5, v0

    add-float v38, v28, v29

    int-to-float v4, v6

    add-int v0, v6, v9

    int-to-float v3, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p10

    move/from16 v39, v3

    move/from16 v3, v28

    move v10, v5

    move/from16 v5, v38

    move/from16 v40, v6

    move/from16 v6, v39

    .line 1029
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    add-int v6, v40, v7

    int-to-float v6, v6

    move/from16 v4, v39

    move/from16 v5, v36

    move/from16 v40, v6

    .line 1030
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-float v37, v38, v37

    move/from16 v3, v37

    move/from16 v5, v38

    .line 1031
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-int v5, v10, v9

    int-to-float v9, v5

    int-to-float v6, v10

    move/from16 v3, v28

    move v4, v9

    move/from16 v5, v38

    .line 1032
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-int v5, v10, v7

    int-to-float v7, v5

    move/from16 v5, v36

    move v6, v7

    .line 1033
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    move/from16 v3, v37

    move/from16 v5, v38

    .line 1034
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    :cond_25
    add-float v28, v28, v29

    add-int/lit8 v12, v12, 0x1

    if-eqz v35, :cond_2b

    int-to-float v0, v14

    cmpl-float v0, v28, v0

    if-lez v0, :cond_2b

    goto/16 :goto_18

    :cond_26
    move-object/from16 v9, p2

    goto/16 :goto_1c

    :pswitch_2
    move/from16 v0, p3

    move-object/from16 p3, v9

    if-eqz v30, :cond_2c

    .line 1262
    invoke-virtual {v5, v0}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 1264
    invoke-virtual {v6, v3}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    if-nez v0, :cond_27

    .line 1266
    invoke-virtual {v15, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 1267
    invoke-virtual {v6, v3, v0}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1269
    :cond_27
    iget v1, v8, Ll/ۢ۫ۡ;->ۗ:I

    .line 1270
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float v9, v0, v1

    if-nez v2, :cond_28

    add-float v0, v28, v9

    int-to-float v1, v13

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_28

    const/4 v2, 0x1

    const/4 v10, 0x1

    goto :goto_17

    :cond_28
    move v10, v2

    :goto_17
    if-eqz v10, :cond_29

    .line 1023
    iget v7, v8, Ll/ۢ۫ۡ;->ۗ:I

    .line 1024
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    int-to-float v6, v7

    add-float v29, v28, v6

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v5

    move/from16 v5, v29

    move/from16 v35, v6

    move/from16 v6, v25

    move/from16 v36, v7

    move-object/from16 v7, p10

    invoke-direct/range {v0 .. v7}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 1025
    iget v0, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float v0, v25, v0

    .line 1026
    iget v1, v8, Ll/ۢ۫ۡ;->֨:F

    add-float/2addr v1, v0

    mul-int/lit8 v7, v36, 0x3

    int-to-float v2, v7

    sub-float/2addr v1, v2

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v6, v3

    .line 1027
    iget v1, v8, Ll/ۢ۫ۡ;->ۚ:F

    add-float/2addr v0, v1

    add-float/2addr v0, v2

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v5, v0

    add-float v37, v28, v9

    int-to-float v4, v6

    add-int v0, v6, v36

    int-to-float v3, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p10

    move/from16 v38, v3

    move/from16 v3, v28

    move v15, v5

    move/from16 v5, v37

    move/from16 v39, v6

    move/from16 v6, v38

    .line 1029
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    add-int v6, v39, v7

    int-to-float v6, v6

    move/from16 v4, v38

    move/from16 v5, v29

    move/from16 v39, v6

    .line 1030
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-float v35, v37, v35

    move/from16 v3, v35

    move/from16 v5, v37

    .line 1031
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-int v5, v15, v36

    int-to-float v6, v5

    int-to-float v5, v15

    move/from16 v3, v28

    move v4, v6

    move/from16 v36, v5

    move/from16 v5, v37

    move/from16 v38, v6

    move/from16 v6, v36

    .line 1032
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-int v5, v15, v7

    int-to-float v7, v5

    move/from16 v4, v38

    move/from16 v5, v29

    move v6, v7

    .line 1033
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    move/from16 v3, v35

    move/from16 v5, v37

    .line 1034
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    :cond_29
    add-float v28, v28, v9

    add-int/lit8 v12, v12, 0x1

    if-eqz v10, :cond_2a

    int-to-float v0, v14

    cmpl-float v0, v28, v0

    if-lez v0, :cond_2a

    move/from16 v35, v10

    :goto_18
    move-object/from16 v10, p1

    move-object/from16 v9, p2

    :goto_19
    move-object/from16 v15, p10

    goto/16 :goto_3b

    :cond_2a
    move/from16 v35, v10

    :cond_2b
    move-object/from16 v9, p2

    goto/16 :goto_1e

    :cond_2c
    move-object/from16 v9, p2

    .line 1286
    invoke-static {v12, v11, v9}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v0

    const/16 v24, 0x1

    move-object/from16 v3, p3

    move-object/from16 v15, p10

    move-object v10, v9

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v6, v30

    move/from16 v4, v32

    move-object/from16 v5, v33

    move-object/from16 v7, v34

    move-object/from16 v9, p1

    move/from16 v28, v1

    :goto_1a
    move v1, v0

    move v0, v12

    move/from16 v12, p5

    goto/16 :goto_9

    :pswitch_3
    move/from16 v0, p3

    move-object/from16 p3, v9

    move-object v9, v10

    .line 1533
    invoke-direct {v8, v0}, Ll/ۢ۫ۡ;->ۧ(C)F

    move-result v7

    if-nez v2, :cond_2d

    add-float v1, v28, v7

    int-to-float v4, v13

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_2d

    const/4 v2, 0x1

    const/4 v10, 0x1

    goto :goto_1b

    :cond_2d
    move v10, v2

    :goto_1b
    if-eqz v10, :cond_2e

    .line 1538
    aput-char v0, v3, v29

    const/4 v4, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v4

    move/from16 v4, v28

    move/from16 v5, v25

    move-object/from16 v6, p10

    .line 1539
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;[CIFFLandroid/graphics/Paint;)V

    :cond_2e
    add-float v28, v28, v7

    add-int/lit8 v12, v12, 0x1

    if-eqz v10, :cond_2f

    int-to-float v0, v14

    cmpl-float v0, v28, v0

    if-lez v0, :cond_2f

    move-object/from16 v15, p10

    move/from16 v35, v10

    move-object/from16 v10, p1

    goto/16 :goto_3b

    :cond_2f
    move/from16 v35, v10

    goto/16 :goto_1e

    :pswitch_4
    move-object/from16 p3, v9

    move-object v9, v10

    :goto_1c
    if-nez v2, :cond_30

    .line 1310
    aget v0, v34, v29

    add-float v0, v0, v28

    int-to-float v1, v13

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_30

    const/4 v2, 0x1

    .line 1313
    :cond_30
    aget v0, v34, v29

    add-float v28, v28, v0

    add-int/lit8 v12, v12, 0x1

    if-eqz v2, :cond_31

    int-to-float v0, v14

    cmpl-float v0, v28, v0

    if-lez v0, :cond_31

    move-object/from16 v10, p1

    move-object/from16 v15, p10

    move/from16 v35, v2

    goto/16 :goto_3b

    :cond_31
    move/from16 v35, v2

    goto :goto_1e

    :pswitch_5
    move-object/from16 p3, v9

    move-object v9, v10

    if-nez v2, :cond_32

    .line 1321
    iget v0, v8, Ll/ۢ۫ۡ;->᩷:F

    add-float v0, v0, v28

    int-to-float v1, v13

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_32

    const/4 v2, 0x1

    const/4 v7, 0x1

    goto :goto_1d

    :cond_32
    move v7, v2

    :goto_1d
    if-eqz v7, :cond_33

    const v0, 0xfffd

    .line 1325
    aput-char v0, v3, v29

    const/4 v4, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v4

    move/from16 v4, v28

    move/from16 v5, v25

    move-object/from16 v6, p10

    .line 1326
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;[CIFFLandroid/graphics/Paint;)V

    .line 1328
    :cond_33
    iget v0, v8, Ll/ۢ۫ۡ;->᩷:F

    add-float v28, v28, v0

    add-int/lit8 v12, v12, 0x1

    if-eqz v7, :cond_34

    int-to-float v0, v14

    cmpl-float v0, v28, v0

    if-lez v0, :cond_34

    move-object/from16 v10, p1

    move-object/from16 v15, p10

    goto/16 :goto_2f

    :cond_34
    move/from16 v35, v7

    :goto_1e
    move-object/from16 v10, p3

    goto/16 :goto_28

    :pswitch_6
    move/from16 v0, p3

    move-object/from16 p3, v9

    move-object v9, v10

    .line 1482
    iget-boolean v4, v8, Ll/ۢ۫ۡ;->ۜ:Z

    if-eqz v4, :cond_35

    invoke-static {v0}, Ll/۫۬ۡ;->ۧ(C)Z

    move-result v4

    if-eqz v4, :cond_35

    add-int/lit8 v0, v12, 0x1

    move-object/from16 v10, p3

    move-object/from16 v15, p10

    goto/16 :goto_2a

    .line 1489
    :cond_35
    aget v10, v17, v0

    if-nez v2, :cond_36

    add-float v1, v28, v10

    int-to-float v4, v13

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_36

    const/4 v2, 0x1

    const/4 v15, 0x1

    goto :goto_1f

    :cond_36
    move v15, v2

    :goto_1f
    cmpl-float v1, v10, v31

    if-lez v1, :cond_44

    if-eqz v15, :cond_44

    .line 1495
    aget-object v2, v16, v0

    .line 1496
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v4, 0x1

    if-le v1, v4, :cond_38

    .line 1023
    iget v7, v8, Ll/ۢ۫ۡ;->ۗ:I

    .line 1024
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    int-to-float v6, v7

    add-float v29, v28, v6

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v5, v29

    move/from16 v35, v6

    move/from16 v6, v25

    move/from16 v36, v7

    move-object/from16 v7, p10

    invoke-direct/range {v0 .. v7}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 1025
    iget v0, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float v0, v25, v0

    .line 1026
    iget v1, v8, Ll/ۢ۫ۡ;->֨:F

    add-float/2addr v1, v0

    mul-int/lit8 v7, v36, 0x3

    int-to-float v2, v7

    sub-float/2addr v1, v2

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v6, v3

    .line 1027
    iget v1, v8, Ll/ۢ۫ۡ;->ۚ:F

    add-float/2addr v0, v1

    add-float/2addr v0, v2

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v5, v0

    add-float v37, v28, v10

    int-to-float v4, v6

    add-int v0, v6, v36

    int-to-float v3, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p10

    move/from16 v38, v3

    move/from16 v3, v28

    move/from16 p11, v10

    move v10, v5

    move/from16 v5, v37

    move/from16 v39, v6

    move/from16 v6, v38

    .line 1029
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    add-int v6, v39, v7

    int-to-float v6, v6

    move/from16 v4, v38

    move/from16 v5, v29

    move/from16 v39, v6

    .line 1030
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-float v35, v37, v35

    move/from16 v3, v35

    move/from16 v5, v37

    .line 1031
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-int v5, v10, v36

    int-to-float v6, v5

    int-to-float v5, v10

    move/from16 v3, v28

    move v4, v6

    move/from16 v36, v5

    move/from16 v5, v37

    move/from16 v38, v6

    move/from16 v6, v36

    .line 1032
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    sub-int v5, v10, v7

    int-to-float v7, v5

    move/from16 v4, v38

    move/from16 v5, v29

    move v6, v7

    .line 1033
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    move/from16 v3, v35

    move/from16 v5, v37

    .line 1034
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    :cond_37
    :goto_20
    move-object/from16 v10, p3

    goto/16 :goto_26

    :cond_38
    move/from16 p11, v10

    if-lez v0, :cond_37

    .line 1500
    aput-char v0, v3, v29

    .line 1502
    sget v1, Ll/ۖ۫ۡ;->ܿ:I

    const/16 v1, 0x61

    if-gt v1, v0, :cond_39

    const/16 v1, 0x7a

    if-le v0, v1, :cond_3b

    :cond_39
    const/16 v1, 0x41

    if-gt v1, v0, :cond_3a

    const/16 v1, 0x5a

    if-le v0, v1, :cond_3b

    :cond_3a
    const/16 v1, 0x30

    if-gt v1, v0, :cond_43

    const/16 v1, 0x39

    if-gt v0, v1, :cond_43

    .line 1504
    :cond_3b
    array-length v1, v3

    sub-int v2, v11, v12

    .line 1505
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x1

    move/from16 v10, p11

    move v7, v0

    :goto_21
    if-ge v2, v1, :cond_41

    add-int v0, v12, v2

    .line 1507
    invoke-interface {v9, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v4, 0x61

    if-gt v4, v0, :cond_3d

    const/16 v4, 0x7a

    if-le v0, v4, :cond_3c

    goto :goto_23

    :cond_3c
    :goto_22
    move-object/from16 v6, p3

    goto :goto_24

    :cond_3d
    :goto_23
    const/16 v4, 0x41

    if-gt v4, v0, :cond_3e

    const/16 v4, 0x5a

    if-le v0, v4, :cond_3c

    :cond_3e
    const/16 v4, 0x30

    if-gt v4, v0, :cond_3f

    const/16 v4, 0x39

    if-gt v0, v4, :cond_3f

    goto :goto_22

    .line 1508
    :goto_24
    invoke-virtual {v6, v7, v0}, Ll/ۖ۫ۡ;->֫(CC)Z

    move-result v4

    if-eqz v4, :cond_40

    .line 1510
    aput-char v0, v3, v2

    .line 1511
    aget v4, v17, v0

    add-float/2addr v10, v4

    add-int/lit8 v2, v2, 0x1

    move v7, v0

    move-object/from16 p3, v6

    goto :goto_21

    :cond_3f
    move-object/from16 v6, p3

    .line 1512
    :cond_40
    invoke-static {v0}, Ll/ܰ۬ۡ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_42

    add-int/lit8 v1, v2, 0x1

    .line 1513
    aput-char v0, v3, v2

    move v7, v1

    goto :goto_25

    :cond_41
    move-object/from16 v6, p3

    :cond_42
    move v7, v2

    goto :goto_25

    :cond_43
    move-object/from16 v6, p3

    const/4 v2, 0x1

    move/from16 v10, p11

    const/4 v7, 0x1

    :goto_25
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v7

    move/from16 v4, v28

    move/from16 v5, v25

    move/from16 p3, v10

    move-object v10, v6

    move-object/from16 v6, p10

    .line 1520
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;[CIFFLandroid/graphics/Paint;)V

    add-int/lit8 v7, v7, -0x1

    add-int/2addr v12, v7

    move/from16 v0, p3

    goto :goto_27

    :cond_44
    move/from16 p11, v10

    goto/16 :goto_20

    :goto_26
    move/from16 v0, p11

    :goto_27
    add-float v28, v28, v0

    add-int/lit8 v12, v12, 0x1

    if-eqz v15, :cond_45

    int-to-float v0, v14

    cmpl-float v0, v28, v0

    if-lez v0, :cond_45

    move-object/from16 v10, p1

    move/from16 v35, v15

    goto/16 :goto_19

    :cond_45
    move/from16 v35, v15

    :goto_28
    move-object/from16 v15, p10

    move-object v7, v10

    move v1, v12

    move/from16 v2, v35

    move-object/from16 v10, p1

    goto/16 :goto_37

    :pswitch_7
    move/from16 v0, p3

    move-object/from16 v42, v10

    move-object v10, v9

    move-object/from16 v9, v42

    .line 1428
    aput-char v0, v3, v29

    sub-int v4, v11, v12

    const/4 v5, 0x3

    if-lt v4, v5, :cond_47

    add-int/lit8 v5, v12, 0x1

    .line 1431
    invoke-interface {v9, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const v6, 0xfe0f

    if-ne v5, v6, :cond_47

    add-int/lit8 v5, v12, 0x2

    invoke-interface {v9, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x20e3

    const v15, 0xfe0f

    if-ne v5, v6, :cond_46

    const/4 v1, 0x1

    .line 1432
    aput-char v15, v3, v1

    .line 1433
    aput-char v6, v3, v7

    const/4 v1, 0x3

    const/4 v5, 0x0

    move-object/from16 v15, p10

    .line 1435
    invoke-virtual {v15, v3, v5, v1}, Landroid/graphics/Paint;->measureText([CII)F

    move-result v5

    goto :goto_2b

    :cond_46
    move-object/from16 v15, p10

    goto :goto_29

    :cond_47
    move-object/from16 v15, p10

    const/16 v6, 0x20e3

    :goto_29
    const/4 v5, 0x2

    if-lt v4, v5, :cond_48

    add-int/lit8 v5, v12, 0x1

    .line 1436
    invoke-interface {v9, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-ne v5, v6, :cond_48

    const/4 v1, 0x1

    .line 1437
    aput-char v6, v3, v1

    const/4 v1, 0x0

    const/4 v5, 0x2

    .line 1439
    invoke-virtual {v15, v3, v1, v5}, Landroid/graphics/Paint;->measureText([CII)F

    move-result v5

    const/4 v1, 0x2

    goto :goto_2b

    .line 1440
    :cond_48
    iget-boolean v5, v8, Ll/ۢ۫ۡ;->ۜ:Z

    if-eqz v5, :cond_4a

    const/16 v5, 0x23

    if-eq v0, v5, :cond_49

    const/16 v5, 0x2a

    if-ne v0, v5, :cond_4a

    :cond_49
    add-int/lit8 v0, v12, 0x1

    :goto_2a
    const/16 v26, 0x1

    move-object v3, v10

    move/from16 v27, v28

    move/from16 v6, v30

    move/from16 v4, v32

    move-object/from16 v5, v33

    move-object/from16 v7, v34

    move/from16 v28, v1

    move-object v10, v9

    move-object/from16 v9, p1

    goto/16 :goto_1a

    .line 1447
    :cond_4a
    aget v5, v17, v0

    const/4 v1, 0x1

    :goto_2b
    if-nez v2, :cond_4b

    add-float v6, v28, v5

    int-to-float v7, v13

    cmpl-float v6, v6, v7

    if-ltz v6, :cond_4b

    const/4 v2, 0x1

    const/4 v7, 0x1

    goto :goto_2c

    :cond_4b
    move v7, v2

    :goto_2c
    if-eqz v7, :cond_51

    const/4 v2, 0x1

    if-ne v1, v2, :cond_50

    const/16 v2, 0x30

    if-lt v0, v2, :cond_50

    .line 1454
    array-length v2, v3

    .line 1455
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    :goto_2d
    if-ge v1, v2, :cond_50

    add-int v4, v12, v1

    .line 1458
    invoke-interface {v9, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 1459
    sget v6, Ll/ۖ۫ۡ;->ܿ:I

    const/16 v6, 0x61

    if-gt v6, v4, :cond_4c

    const/16 v6, 0x7a

    if-le v4, v6, :cond_4e

    :cond_4c
    const/16 v6, 0x41

    if-gt v6, v4, :cond_4d

    const/16 v6, 0x5a

    if-le v4, v6, :cond_4e

    :cond_4d
    const/16 v6, 0x30

    if-gt v6, v4, :cond_4f

    const/16 v6, 0x39

    if-gt v4, v6, :cond_4f

    :cond_4e
    invoke-virtual {v10, v0, v4}, Ll/ۖ۫ۡ;->֫(CC)Z

    move-result v0

    if-eqz v0, :cond_4f

    .line 1461
    aput-char v4, v3, v1

    .line 1462
    aget v0, v17, v4

    add-float/2addr v5, v0

    add-int/lit8 v1, v1, 0x1

    move v0, v4

    goto :goto_2d

    .line 1463
    :cond_4f
    invoke-static {v4}, Ll/ܰ۬ۡ;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_50

    add-int/lit8 v0, v1, 0x1

    .line 1464
    aput-char v4, v3, v1

    move/from16 v29, v0

    goto :goto_2e

    :cond_50
    move/from16 v29, v1

    :goto_2e
    move/from16 v35, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v3

    move/from16 v3, v29

    move/from16 v4, v28

    move/from16 v5, v25

    move-object/from16 v6, p10

    .line 1471
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;[CIFFLandroid/graphics/Paint;)V

    move/from16 v1, v29

    move/from16 v5, v35

    :cond_51
    add-float v0, v28, v5

    add-int/2addr v1, v12

    if-eqz v7, :cond_52

    int-to-float v2, v14

    cmpl-float v2, v0, v2

    if-lez v2, :cond_52

    move-object/from16 v10, p1

    move/from16 v28, v0

    :goto_2f
    move/from16 v35, v7

    goto/16 :goto_3b

    :cond_52
    const/16 v28, 0x0

    move/from16 v12, p5

    move v2, v7

    move-object v3, v10

    move/from16 v6, v30

    move/from16 v4, v32

    move-object/from16 v5, v33

    move-object/from16 v7, v34

    move-object v10, v9

    move-object/from16 v9, p1

    move/from16 v42, v27

    move/from16 v27, v0

    move/from16 v0, v26

    move/from16 v26, v42

    goto/16 :goto_9

    :pswitch_8
    move-object/from16 v42, v10

    move-object v10, v9

    move-object/from16 v9, v42

    add-float v0, p9, v28

    move/from16 v7, p5

    sub-float/2addr v0, v7

    .line 1397
    iget v1, v8, Ll/ۢ۫ۡ;->ۙ:F

    iget v3, v8, Ll/ۢ۫ۡ;->۫:I

    int-to-float v3, v3

    mul-float v3, v3, v1

    div-float v4, v0, v3

    float-to-int v4, v4

    add-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    mul-float v4, v4, v3

    sub-float/2addr v4, v0

    cmpg-float v0, v4, v1

    if-gez v0, :cond_53

    add-float/2addr v4, v3

    :cond_53
    move v6, v4

    if-nez v2, :cond_54

    add-float v0, v28, v6

    int-to-float v3, v13

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_54

    const/4 v2, 0x1

    const/16 v29, 0x1

    goto :goto_30

    :cond_54
    move/from16 v29, v2

    :goto_30
    if-eqz v29, :cond_55

    .line 1408
    iget-boolean v0, v8, Ll/ۢ۫ۡ;->᩻:Z

    if-eqz v0, :cond_55

    const v0, 0x3e19999a    # 0.15f

    mul-float v1, v1, v0

    add-float v2, v1, v28

    add-float v0, v28, v6

    sub-float v3, v0, v1

    .line 1411
    iget v0, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float v0, v25, v0

    iget v1, v8, Ll/ۢ۫ۡ;->ۡ:F

    div-float v4, v1, v23

    add-float/2addr v4, v0

    const v0, 0x3ca3d70a    # 0.02f

    mul-float v1, v1, v0

    float-to-int v0, v1

    const/4 v1, 0x1

    .line 1412
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v1, v0

    sub-float/2addr v4, v1

    float-to-double v4, v4

    .line 1413
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v1, v4

    add-int v4, v1, v0

    add-int/2addr v4, v0

    .line 1415
    invoke-virtual/range {p10 .. p10}, Landroid/graphics/Paint;->getColor()I

    move-result v5

    .line 1416
    iget v0, v8, Ll/ۢ۫ۡ;->ۤ:I

    const v35, 0xffffff

    and-int v0, v0, v35

    move/from16 p3, v5

    const/16 v5, 0x32

    const/16 v7, 0x64

    invoke-static {v7, v5}, Ll/᩹֡᩷;->֫(II)I

    move-result v5

    shl-int/lit8 v5, v5, 0x18

    or-int/2addr v0, v5

    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v5, v1

    int-to-float v4, v4

    move-object/from16 v0, p1

    move v1, v2

    move v2, v5

    move/from16 v7, p3

    move-object/from16 v5, p10

    .line 1417
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1418
    invoke-virtual {v15, v7}, Landroid/graphics/Paint;->setColor(I)V

    :cond_55
    add-float v28, v28, v6

    add-int/lit8 v12, v12, 0x1

    if-eqz v29, :cond_56

    int-to-float v0, v14

    cmpl-float v0, v28, v0

    if-lez v0, :cond_56

    move-object/from16 v10, p1

    move/from16 v12, v26

    move/from16 v0, v27

    move/from16 v27, v28

    move/from16 v28, v29

    goto/16 :goto_40

    :cond_56
    move-object v7, v10

    move-object/from16 v10, p1

    goto/16 :goto_34

    :pswitch_9
    move-object/from16 v42, v10

    move-object v10, v9

    move-object/from16 v9, v42

    if-nez v2, :cond_57

    .line 1364
    iget v0, v8, Ll/ۢ۫ۡ;->ۙ:F

    add-float v0, v28, v0

    int-to-float v3, v13

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_57

    const/4 v0, 0x1

    goto :goto_31

    :cond_57
    move v0, v2

    :goto_31
    if-eqz v0, :cond_5a

    .line 1367
    iget-boolean v2, v8, Ll/ۢ۫ۡ;->᩻:Z

    if-eqz v2, :cond_5a

    .line 1368
    iget-boolean v2, v8, Ll/ۢ۫ۡ;->֡:Z

    if-eqz v2, :cond_59

    if-nez v1, :cond_59

    .line 1369
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v12, v2, :cond_58

    add-int/lit8 v2, v12, 0x1

    .line 1370
    invoke-interface {v9, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x20

    if-eq v2, v3, :cond_58

    const/16 v3, 0x9

    if-eq v2, v3, :cond_58

    const/16 v3, 0xd

    if-eq v2, v3, :cond_58

    const/16 v3, 0xa

    if-ne v2, v3, :cond_59

    :cond_58
    const/4 v1, 0x1

    .line 1377
    :cond_59
    iget-boolean v2, v8, Ll/ۢ۫ۡ;->֡:Z

    if-eqz v2, :cond_5b

    if-eqz v1, :cond_5a

    goto :goto_32

    :cond_5a
    move-object v7, v10

    move-object/from16 v10, p1

    goto :goto_33

    .line 1378
    :cond_5b
    :goto_32
    iget v1, v8, Ll/ۢ۫ۡ;->ۙ:F

    div-float v1, v1, v23

    add-float v1, v1, v28

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    .line 1379
    iget v2, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float v2, v25, v2

    iget v3, v8, Ll/ۢ۫ۡ;->ۡ:F

    div-float v3, v3, v23

    add-float/2addr v3, v2

    float-to-double v2, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    .line 1380
    iget v3, v8, Ll/ۢ۫ۡ;->ۡ:F

    const v4, 0x3d2c0831    # 0.042f

    mul-float v3, v3, v4

    .line 1381
    invoke-virtual/range {p10 .. p10}, Landroid/graphics/Paint;->getColor()I

    move-result v4

    .line 1382
    iget v5, v8, Ll/ۢ۫ۡ;->ۤ:I

    const v6, 0xffffff

    and-int/2addr v5, v6

    const/16 v6, 0x32

    const/16 v7, 0x64

    invoke-static {v7, v6}, Ll/᩹֡᩷;->֫(II)I

    move-result v6

    shl-int/lit8 v6, v6, 0x18

    or-int/2addr v5, v6

    invoke-virtual {v15, v5}, Landroid/graphics/Paint;->setColor(I)V

    move-object v7, v10

    move-object/from16 v10, p1

    .line 1383
    invoke-virtual {v10, v1, v2, v3, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1384
    invoke-virtual {v15, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1387
    :goto_33
    iget v1, v8, Ll/ۢ۫ۡ;->ۙ:F

    add-float v1, v28, v1

    add-int/lit8 v12, v12, 0x1

    if-eqz v0, :cond_5c

    int-to-float v2, v14

    cmpl-float v2, v1, v2

    if-lez v2, :cond_5c

    move/from16 v28, v0

    move/from16 v12, v26

    move/from16 v0, v27

    move/from16 v27, v1

    goto/16 :goto_40

    :cond_5c
    move/from16 v29, v0

    move/from16 v28, v1

    :goto_34
    move v1, v12

    move/from16 v2, v29

    :goto_35
    const/4 v0, 0x1

    move/from16 v12, p5

    move-object v3, v7

    move/from16 v0, v26

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v6, v30

    move/from16 v4, v32

    move-object/from16 v5, v33

    move-object/from16 v7, v34

    const/16 v28, 0x1

    goto/16 :goto_3d

    :pswitch_a
    move/from16 v0, p3

    move-object v7, v9

    move-object v9, v10

    move-object/from16 v10, p1

    if-nez v2, :cond_5d

    .line 1246
    iget v1, v8, Ll/ۢ۫ۡ;->ܿ:F

    add-float v1, v28, v1

    int-to-float v4, v13

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_5d

    const/4 v1, 0x1

    const/16 v29, 0x1

    goto :goto_36

    :cond_5d
    move/from16 v29, v2

    :goto_36
    if-eqz v29, :cond_5e

    const/4 v1, 0x0

    .line 1250
    aput-char v0, v3, v1

    const/4 v4, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v4

    move/from16 v4, v28

    move/from16 v5, v25

    move-object/from16 v6, p10

    .line 1251
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;[CIFFLandroid/graphics/Paint;)V

    .line 1253
    :cond_5e
    iget v0, v8, Ll/ۢ۫ۡ;->ܿ:F

    add-float v0, v28, v0

    add-int/lit8 v12, v12, 0x1

    if-eqz v29, :cond_5f

    int-to-float v1, v14

    cmpl-float v1, v0, v1

    if-lez v1, :cond_5f

    move/from16 v2, v29

    move/from16 v42, v27

    move/from16 v27, v0

    move/from16 v0, v26

    move/from16 v26, v42

    goto/16 :goto_3e

    :cond_5f
    move/from16 v28, v0

    move v1, v12

    move/from16 v2, v29

    :goto_37
    move/from16 v12, p5

    move-object v3, v7

    move/from16 v0, v26

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v6, v30

    move/from16 v4, v32

    move-object/from16 v5, v33

    move-object/from16 v7, v34

    move-object/from16 v42, v10

    move-object v10, v9

    move-object/from16 v9, v42

    goto/16 :goto_8

    .line 1557
    :cond_60
    iget v1, v8, Ll/ۢ۫ۡ;->۬:F

    :goto_38
    move/from16 v35, v1

    goto :goto_39

    :cond_61
    const/4 v1, 0x0

    const/16 v35, 0x0

    :goto_39
    if-nez v2, :cond_62

    add-float v1, v28, v35

    int-to-float v4, v13

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_62

    const/4 v1, 0x1

    const/16 v36, 0x1

    goto :goto_3a

    :cond_62
    move/from16 v36, v2

    :goto_3a
    if-eqz v36, :cond_63

    .line 1565
    aput-char v0, v3, v29

    const/4 v4, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v4

    move/from16 v4, v28

    move/from16 v5, v25

    move-object/from16 v6, p10

    .line 1566
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;[CIFFLandroid/graphics/Paint;)V

    :cond_63
    add-float v0, v28, v35

    add-int/lit8 v1, v12, 0x1

    if-eqz v36, :cond_64

    int-to-float v2, v14

    cmpl-float v2, v0, v2

    if-lez v2, :cond_64

    move/from16 v28, v0

    move/from16 v35, v36

    :goto_3b
    move/from16 v0, v24

    move/from16 v5, v26

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v28, v35

    :goto_3c
    move/from16 v24, v0

    move v12, v5

    goto :goto_3f

    :cond_64
    move/from16 v12, p5

    move-object v3, v7

    move/from16 v6, v30

    move/from16 v4, v32

    move-object/from16 v5, v33

    move-object/from16 v7, v34

    move/from16 v2, v36

    move/from16 v42, v27

    move/from16 v27, v0

    move/from16 v0, v26

    move/from16 v26, v42

    move-object/from16 v43, v10

    move-object v10, v9

    move-object/from16 v9, v43

    goto/16 :goto_8

    .line 1576
    :cond_65
    invoke-static {v12, v11, v9}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v0

    const/16 v24, 0x1

    move-object v3, v7

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v6, v30

    move/from16 v4, v32

    move-object/from16 v5, v33

    move-object/from16 v7, v34

    move/from16 v28, v1

    move v1, v0

    move v0, v12

    move/from16 v12, p5

    :goto_3d
    move-object/from16 v42, v10

    move-object v10, v9

    move-object/from16 v9, v42

    goto/16 :goto_9

    :cond_66
    move v3, v0

    move/from16 v32, v4

    move-object/from16 v33, v5

    move-object/from16 v42, v10

    move-object v10, v9

    move-object/from16 v9, v42

    const/16 v31, 0x0

    :goto_3e
    move v12, v0

    move/from16 v28, v2

    :goto_3f
    move/from16 v0, v26

    :goto_40
    if-nez v24, :cond_68

    if-eqz v0, :cond_67

    goto :goto_41

    :cond_67
    move/from16 v14, p5

    goto :goto_44

    :cond_68
    :goto_41
    if-nez v28, :cond_6a

    .line 1586
    invoke-virtual {v15, v9, v12, v11}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v0

    add-float v1, v27, v0

    int-to-float v2, v13

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_69

    const/16 v28, 0x1

    :cond_69
    move v13, v0

    goto :goto_42

    :cond_6a
    const/high16 v0, -0x40800000    # -1.0f

    const/high16 v13, -0x40800000    # -1.0f

    :goto_42
    if-eqz v28, :cond_6b

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v12

    move/from16 v4, p4

    move/from16 v5, v27

    move/from16 v6, v25

    move/from16 v14, p5

    move-object/from16 v7, p10

    .line 1591
    invoke-direct/range {v0 .. v7}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    goto :goto_43

    :cond_6b
    move/from16 v14, p5

    :goto_43
    if-eqz v22, :cond_6d

    cmpg-float v0, v13, v31

    if-gez v0, :cond_6c

    .line 1595
    invoke-virtual {v15, v9, v12, v11}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v13

    :cond_6c
    add-float v27, v27, v13

    :cond_6d
    :goto_44
    if-eqz v18, :cond_6e

    const/4 v0, 0x0

    .line 1600
    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    :cond_6e
    if-eqz v19, :cond_6f

    move/from16 v1, v32

    .line 1603
    invoke-virtual {v10, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    move/from16 v25, p6

    :cond_6f
    move-object/from16 v0, v33

    .line 1606
    iput-object v0, v8, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    const/high16 v7, 0x3f800000    # 1.0f

    .line 1607
    iget v9, v8, Ll/ۢ۫ۡ;->ܳ:F

    const/16 v11, 0x1d

    if-eqz v20, :cond_71

    .line 1609
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v11, :cond_70

    .line 1610
    invoke-virtual/range {p10 .. p10}, Landroid/graphics/Paint;->getUnderlinePosition()F

    move-result v0

    .line 1611
    invoke-virtual/range {p10 .. p10}, Landroid/graphics/Paint;->getUnderlineThickness()F

    move-result v1

    goto :goto_45

    .line 1613
    :cond_70
    iget v0, v8, Ll/ۢ۫ۡ;->ۡ:F

    const v1, 0x3f59999a    # 0.85f

    mul-float v0, v0, v1

    iget v1, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float/2addr v0, v1

    .line 1614
    invoke-virtual/range {p10 .. p10}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    const v2, 0x3c9ba5e3    # 0.019f

    mul-float v1, v1, v2

    mul-float v1, v1, v9

    :goto_45
    float-to-int v2, v14

    int-to-float v3, v2

    add-float v4, v0, v25

    add-float v0, v27, v7

    float-to-int v0, v0

    int-to-float v5, v0

    add-float v6, v4, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p10

    .line 1616
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    :cond_71
    if-eqz v21, :cond_73

    .line 1620
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v11, :cond_72

    .line 1621
    invoke-virtual/range {p10 .. p10}, Landroid/graphics/Paint;->getStrikeThruPosition()F

    move-result v0

    .line 1622
    invoke-virtual/range {p10 .. p10}, Landroid/graphics/Paint;->getStrikeThruThickness()F

    move-result v1

    goto :goto_46

    .line 1624
    :cond_72
    iget v0, v8, Ll/ۢ۫ۡ;->ۡ:F

    const v1, 0x3f0d0e56    # 0.551f

    mul-float v0, v0, v1

    iget v1, v8, Ll/ۢ۫ۡ;->ۢ:F

    sub-float/2addr v0, v1

    .line 1625
    invoke-virtual/range {p10 .. p10}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    const v2, 0x3cac0831    # 0.021f

    mul-float v1, v1, v2

    mul-float v1, v1, v9

    :goto_46
    float-to-int v2, v14

    int-to-float v3, v2

    add-float v4, v25, v0

    add-float v7, v27, v7

    float-to-int v0, v7

    int-to-float v5, v0

    add-float v6, v4, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p10

    .line 1627
    invoke-direct/range {v0 .. v6}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFF)V

    :cond_73
    if-eqz v22, :cond_74

    sub-float v27, v27, v14

    return v27

    :cond_74
    return v31

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
.end method

.method public final ֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZLl/ܰۢܿ;)F
    .locals 1

    .line 1053
    iget-object v0, p0, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    .line 1054
    iput-object p13, p0, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    .line 1056
    :try_start_0
    invoke-virtual/range {p0 .. p12}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZ)F

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1058
    iput-object v0, p0, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    return p1

    :catchall_0
    move-exception p1

    iput-object v0, p0, Ll/ۢ۫ۡ;->ۘ:Ll/᩻۫ۡ;

    .line 1059
    throw p1
.end method

.method public final ֫(Ljava/lang/CharSequence;IIF)F
    .locals 12

    move-object v6, p0

    .line 928
    iget-boolean v0, v6, Ll/ۢ۫ۡ;->᩹:Z

    iget-object v1, v6, Ll/ۢ۫ۡ;->ۧ:[F

    if-eqz v0, :cond_0

    iget-object v0, v6, Ll/ۢ۫ۡ;->֫:[F

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 929
    :goto_0
    iget-boolean v2, v6, Ll/ۢ۫ۡ;->᩶:Z

    sub-int v3, p3, p2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 931
    iget-object v8, v6, Ll/ۢ۫ۡ;->᩺:Ll/ᩴ۫ۡ;

    if-ne v3, v4, :cond_b

    .line 932
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 933
    invoke-static {v3}, Ll/۫۬ۡ;->֫(C)B

    move-result v9

    .line 934
    iget-object v10, v6, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    sget-object v11, Ll/ۢ۫ۡ;->֫֫:Ll/᩵֫ᩴ;

    packed-switch v9, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    if-eqz v2, :cond_2

    .line 1011
    invoke-virtual {v11, v3}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1012
    invoke-virtual {v8, v0}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_1

    .line 1014
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 1015
    invoke-virtual {v8, v0, v1}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1017
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, v6, Ll/ۢ۫ۡ;->ۗ:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0

    .line 951
    :cond_2
    iget v0, v6, Ll/ۢ۫ۡ;->ۙ:F

    return v0

    :pswitch_1
    if-eqz v2, :cond_4

    .line 1011
    invoke-virtual {v11, v3}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1012
    invoke-virtual {v8, v0}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_3

    .line 1014
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 1015
    invoke-virtual {v8, v0, v1}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1017
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, v6, Ll/ۢ۫ۡ;->ۗ:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0

    .line 943
    :cond_4
    aget v0, v1, v7

    return v0

    :pswitch_2
    if-eqz v2, :cond_6

    .line 1011
    invoke-virtual {v11, v3}, Ll/᩵֫ᩴ;->ۧ(C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1012
    invoke-virtual {v8, v0}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_5

    .line 1014
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 1015
    invoke-virtual {v8, v0, v1}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1017
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, v6, Ll/ۢ۫ۡ;->ۗ:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0

    .line 973
    :pswitch_3
    invoke-direct {p0, v3}, Ll/ۢ۫ۡ;->ۧ(C)F

    move-result v0

    return v0

    .line 970
    :pswitch_4
    aget v0, v1, v7

    return v0

    .line 967
    :pswitch_5
    iget v0, v6, Ll/ۢ۫ۡ;->᩷:F

    return v0

    .line 964
    :pswitch_6
    aget v0, v0, v3

    return v0

    :pswitch_7
    const/high16 v5, 0x7f800000    # Float.POSITIVE_INFINITY

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move/from16 v4, p4

    .line 460
    invoke-direct/range {v0 .. v5}, Ll/ۢ۫ۡ;->ۧ(Ljava/lang/CharSequence;IIFF)F

    move-result v0

    return v0

    .line 956
    :pswitch_8
    iget v0, v6, Ll/ۢ۫ۡ;->ۙ:F

    return v0

    .line 936
    :pswitch_9
    iget v0, v6, Ll/ۢ۫ۡ;->ܿ:F

    return v0

    .line 982
    :cond_6
    :goto_1
    invoke-static {v3}, Ll/ܰ۬ۡ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_8

    if-lez p2, :cond_9

    add-int/lit8 v0, p2, -0x1

    move-object v1, p1

    .line 984
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/ܰ۬ۡ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 985
    invoke-static {v3}, Ll/ܰ۬ۡ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 986
    invoke-direct {p0, v3}, Ll/ۢ۫ۡ;->ۧ(C)F

    move-result v0

    return v0

    .line 988
    :cond_7
    iget v0, v6, Ll/ۢ۫ۡ;->۬:F

    return v0

    :cond_8
    const/16 v0, 0x200d

    if-ne v3, v0, :cond_a

    :cond_9
    return v5

    .line 995
    :cond_a
    invoke-direct {p0, v3}, Ll/ۢ۫ۡ;->ۧ(C)F

    move-result v0

    return v0

    :cond_b
    move-object v1, p1

    .line 999
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v9

    .line 1000
    invoke-virtual {v8, v9}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    if-nez v0, :cond_c

    .line 1002
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v3

    const/high16 v10, 0x7f800000    # Float.POSITIVE_INFINITY

    move-object v0, p0

    move-object v1, v9

    move v2, v7

    move v4, v5

    move v5, v10

    .line 460
    invoke-direct/range {v0 .. v5}, Ll/ۢ۫ۡ;->ۧ(Ljava/lang/CharSequence;IIFF)F

    move-result v0

    .line 1002
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 1003
    invoke-virtual {v8, v9, v0}, Ll/ᩴ۫ۡ;->֫(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1005
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ljava/lang/CharSequence;IIFF)F
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p5, v0

    if-ltz v0, :cond_0

    .line 527
    invoke-direct/range {p0 .. p5}, Ll/ۢ۫ۡ;->ۧ(Ljava/lang/CharSequence;IIFF)F

    move-result p1

    return p1

    .line 525
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid maximum text width"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/CharSequence;IIFLl/ᩳܺܿ;)Ll/ۜ۫ۡ;
    .locals 8

    if-ltz p2, :cond_0

    if-lt p3, p2, :cond_0

    .line 772
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p3, v0, :cond_0

    .line 773
    new-instance v0, Ll/ۜ۫ۡ;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Ll/ۜ۫ۡ;-><init>(Ll/ۢ۫ۡ;Ljava/lang/CharSequence;IIFLjava/util/function/IntUnaryOperator;)V

    return-object v0

    .line 772
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public ֫(F)V
    .locals 1

    const v0, 0x3f4ccccd    # 0.8f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 287
    iput p1, p0, Ll/ۢ۫ۡ;->᩸:F

    .line 288
    iget-object p1, p0, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Paint$FontMetrics;)V

    return-void

    .line 286
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Line spacing must be between 0.8 and 2.0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(I)V
    .locals 0

    .line 346
    iput p1, p0, Ll/ۢ۫ۡ;->۫:I

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 330
    iput-boolean p1, p0, Ll/ۢ۫ۡ;->᩻:Z

    return-void
.end method

.method public final ֫()[F
    .locals 1

    .line 921
    iget-boolean v0, p0, Ll/ۢ۫ۡ;->᩹:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢ۫ۡ;->֫:[F

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۢ۫ۡ;->ۧ:[F

    return-object v0
.end method

.method public final ۖ()V
    .locals 15

    .line 366
    iget-object v0, p0, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v1

    .line 383
    iget v2, v1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    iget v3, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v2, v3

    .line 367
    iput v2, p0, Ll/ۢ۫ۡ;->ۡ:F

    float-to-double v2, v2

    .line 368
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, p0, Ll/ۢ۫ۡ;->ܺ:I

    .line 369
    iget v2, p0, Ll/ۢ۫ۡ;->ۡ:F

    const/high16 v3, 0x41c80000    # 25.0f

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, p0, Ll/ۢ۫ۡ;->ۗ:I

    const-string v2, "\u6211"

    .line 370
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    iput v2, p0, Ll/ۢ۫ۡ;->ܿ:F

    const-string v2, "\ufffd"

    .line 371
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    iput v2, p0, Ll/ۢ۫ۡ;->᩷:F

    .line 387
    iget v2, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    neg-float v2, v2

    .line 372
    iput v2, p0, Ll/ۢ۫ۡ;->ۢ:F

    .line 373
    invoke-direct {p0, v1}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Paint$FontMetrics;)V

    const-string v1, "n"

    .line 391
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    const-string v2, " "

    .line 392
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    cmpg-float v3, v2, v1

    if-gez v3, :cond_0

    const v3, 0x3f1eb852    # 0.62f

    .line 394
    invoke-static {v1, v2, v3, v2}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result v2

    :cond_0
    float-to-double v3, v2

    .line 396
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v1, v3

    iput v1, p0, Ll/ۢ۫ۡ;->ۙ:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v2, v1

    float-to-double v1, v2

    .line 397
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    iput v1, p0, Ll/ۢ۫ۡ;->۬:F

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x80

    .line 401
    iget-object v4, p0, Ll/ۢ۫ۡ;->֫:[F

    iget-object v5, p0, Ll/ۢ۫ۡ;->ۧ:[F

    if-ge v2, v3, :cond_2

    .line 402
    sget-object v3, Ll/ۢ۫ۡ;->۟:[Ljava/lang/String;

    aget-object v3, v3, v2

    .line 403
    sget-object v6, Ll/ۢ۫ۡ;->ܰ:[Ljava/lang/String;

    aget-object v6, v6, v2

    .line 404
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 405
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    aput v3, v4, v2

    aput v3, v5, v2

    goto :goto_1

    .line 407
    :cond_1
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    aput v3, v5, v2

    .line 408
    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    iget v5, p0, Ll/ۢ۫ۡ;->ۗ:I

    mul-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    add-float/2addr v3, v5

    aput v3, v4, v2

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 411
    :cond_2
    iget v2, p0, Ll/ۢ۫ۡ;->ۙ:F

    const/high16 v3, 0x42480000    # 50.0f

    div-float v3, v2, v3

    aput v3, v5, v1

    const/16 v3, 0x20

    .line 412
    aput v2, v5, v3

    const/16 v6, 0xa

    .line 413
    aput v2, v5, v6

    const/16 v7, 0xd

    .line 414
    aput v2, v5, v7

    .line 415
    aput v2, v4, v3

    .line 416
    aput v2, v4, v6

    .line 417
    aput v2, v4, v7

    const/16 v2, 0x69

    .line 418
    aget v2, v5, v2

    const/16 v3, 0x77

    aget v3, v5, v3

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    const/16 v2, 0x2e

    aget v2, v5, v2

    const/16 v3, 0x6d

    aget v3, v5, v3

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    iput-boolean v2, p0, Ll/ۢ۫ۡ;->ۜ:Z

    const-string v2, "Z"

    .line 422
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 423
    iget v5, p0, Ll/ۢ۫ۡ;->ۡ:F

    add-float/2addr v5, v4

    float-to-int v4, v5

    .line 424
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 425
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v14, -0x1

    .line 426
    invoke-virtual {v6, v14}, Landroid/graphics/Canvas;->drawColor(I)V

    const/high16 v7, -0x1000000

    .line 427
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 428
    iget v7, p0, Ll/ۢ۫ۡ;->ۢ:F

    const/4 v8, 0x0

    invoke-virtual {v6, v2, v8, v7, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 429
    new-array v0, v4, [I

    .line 430
    div-int/lit8 v10, v3, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v6, v5

    move-object v7, v0

    move v13, v4

    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 431
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 432
    iput v2, p0, Ll/ۢ۫ۡ;->֨:F

    .line 433
    iget v2, p0, Ll/ۢ۫ۡ;->ۡ:F

    iput v2, p0, Ll/ۢ۫ۡ;->ۚ:F

    :goto_3
    if-ge v1, v4, :cond_5

    .line 435
    aget v2, v0, v1

    if-eq v2, v14, :cond_4

    int-to-float v1, v1

    .line 436
    iput v1, p0, Ll/ۢ۫ۡ;->֨:F

    goto :goto_4

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    :goto_4
    add-int/lit8 v4, v4, -0x1

    :goto_5
    if-ltz v4, :cond_7

    .line 441
    aget v1, v0, v4

    if-eq v1, v14, :cond_6

    int-to-float v0, v4

    .line 442
    iput v0, p0, Ll/ۢ۫ۡ;->ۚ:F

    goto :goto_6

    :cond_6
    add-int/lit8 v4, v4, -0x1

    goto :goto_5

    .line 378
    :cond_7
    :goto_6
    iget-object v0, p0, Ll/ۢ۫ۡ;->᩺:Ll/ᩴ۫ۡ;

    invoke-virtual {v0}, Ll/ᩴ۫ۡ;->֫()V

    .line 379
    iget-object v0, p0, Ll/ۢ۫ۡ;->ᩳ:Ll/۫ܳᩴ;

    invoke-virtual {v0}, Ll/᩸ܳᩴ;->clear()V

    return-void
.end method

.method public final ۘ()Z
    .locals 1

    .line 326
    iget-boolean v0, p0, Ll/ۢ۫ۡ;->᩻:Z

    return v0
.end method

.method public final ۚ()V
    .locals 3

    .line 1633
    iget-object v0, p0, Ll/ۢ۫ۡ;->ۨ:Ll/ۖ۫ۡ;

    iget-object v1, p0, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/ۖ۫ۡ;->ᩳ:Landroid/graphics/Typeface;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 1634
    :cond_1
    :goto_0
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {v0}, Ll/ۖ۫ۡ;->֫(Landroid/graphics/Typeface;)Ll/ۖ۫ۡ;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ۫ۡ;->ۨ:Ll/ۖ۫ۡ;

    return-void
.end method

.method public final ۜ()F
    .locals 1

    .line 276
    iget v0, p0, Ll/ۢ۫ۡ;->ܶ:F

    return v0
.end method

.method public final ۡ()I
    .locals 1

    .line 342
    iget v0, p0, Ll/ۢ۫ۡ;->۫:I

    return v0
.end method

.method public final ۢ()F
    .locals 1

    .line 314
    iget v0, p0, Ll/ۢ۫ۡ;->ۙ:F

    return v0
.end method

.method public final ۧ(Ljava/lang/CharSequence;IIF)F
    .locals 6

    const/high16 v5, 0x7f800000    # Float.POSITIVE_INFINITY

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 460
    invoke-direct/range {v0 .. v5}, Ll/ۢ۫ۡ;->ۧ(Ljava/lang/CharSequence;IIFF)F

    move-result p1

    return p1
.end method

.method public final ۧ()Ll/ۢ۫ۡ;
    .locals 1

    .line 238
    new-instance v0, Ll/ۢ۫ۡ;

    invoke-direct {v0, p0}, Ll/ۢ۫ۡ;-><init>(Ll/ۢ۫ۡ;)V

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 322
    iput p1, p0, Ll/ۢ۫ۡ;->ۤ:I

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 338
    iput-boolean p1, p0, Ll/ۢ۫ۡ;->֡:Z

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 306
    iget v0, p0, Ll/ۢ۫ۡ;->ܺ:I

    return v0
.end method

.method public final ܺ()I
    .locals 1

    .line 318
    iget v0, p0, Ll/ۢ۫ۡ;->ۤ:I

    return v0
.end method

.method public final ܽ()F
    .locals 1

    .line 310
    iget v0, p0, Ll/ۢ۫ۡ;->ܿ:F

    return v0
.end method

.method public final ܽ(Z)V
    .locals 0

    .line 354
    iput-boolean p1, p0, Ll/ۢ۫ۡ;->᩹:Z

    return-void
.end method

.method public final ܿ()F
    .locals 1

    .line 298
    iget v0, p0, Ll/ۢ۫ۡ;->ۡ:F

    return v0
.end method

.method public final ᩳ()F
    .locals 1

    .line 272
    iget v0, p0, Ll/ۢ۫ۡ;->ۢ:F

    return v0
.end method

.method public final ᩳ(Z)V
    .locals 0

    .line 362
    iput-boolean p1, p0, Ll/ۢ۫ۡ;->᩶:Z

    return-void
.end method

.method public final ᩴ()Z
    .locals 1

    .line 334
    iget-boolean v0, p0, Ll/ۢ۫ۡ;->֡:Z

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 350
    iget-boolean v0, p0, Ll/ۢ۫ۡ;->᩹:Z

    return v0
.end method

.method public final ᩷()F
    .locals 1

    .line 281
    iget v0, p0, Ll/ۢ۫ۡ;->᩸:F

    return v0
.end method

.method public final ᩻()F
    .locals 1

    .line 279
    iget v0, p0, Ll/ۢ۫ۡ;->۠:F

    return v0
.end method
