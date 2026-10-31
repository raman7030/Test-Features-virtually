.class public final Ll/ܿ᩵ۧ;
.super Ljava/lang/Object;
.source "28LT"

# interfaces
.implements Ll/ۢᩴۧ;


# static fields
.field public static final ᩻:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Ll/ᩳ᩵ۧ;

.field public final ۧ:Z

.field public ܳ:Ljava/util/LinkedHashMap;

.field public final ܽ:Ll/ᩳ֨֫;

.field public ܿ:F

.field public ᩳ:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)"

    .line 67
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܿ᩵ۧ;->᩻:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0x800001

    .line 109
    iput v0, p0, Ll/ܿ᩵ۧ;->ܿ:F

    .line 110
    iput v0, p0, Ll/ܿ᩵ۧ;->ᩳ:F

    .line 111
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/ܿ᩵ۧ;->ܽ:Ll/ᩳ֨֫;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 113
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 114
    iput-boolean v1, p0, Ll/ܿ᩵ۧ;->ۧ:Z

    .line 118
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v0}, Ll/ۘ֨֫;->֫([B)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Format:"

    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ll/᩺֡֫;->֫(Z)V

    .line 121
    invoke-static {v0}, Ll/ᩳ᩵ۧ;->֫(Ljava/lang/String;)Ll/ᩳ᩵ۧ;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    iput-object v0, p0, Ll/ܿ᩵ۧ;->֫:Ll/ᩳ᩵ۧ;

    .line 122
    new-instance v0, Ll/ᩳ֨֫;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-direct {v0, p1}, Ll/ᩳ֨֫;-><init>([B)V

    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, p1}, Ll/ܿ᩵ۧ;->֫(Ll/ᩳ֨֫;Ljava/nio/charset/Charset;)V

    return-void

    .line 124
    :cond_0
    iput-boolean v0, p0, Ll/ܿ᩵ۧ;->ۧ:Z

    const/4 p1, 0x0

    .line 125
    iput-object p1, p0, Ll/ܿ᩵ۧ;->֫:Ll/ᩳ᩵ۧ;

    return-void
.end method

.method public static ֫(JLjava/util/ArrayList;Ljava/util/ArrayList;)I
    .locals 4

    .line 573
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_2

    .line 574
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v3, v1, p0

    if-nez v3, :cond_1

    return v0

    .line 578
    :cond_1
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v3, v1, p0

    if-gez v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 583
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {p2, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 587
    new-instance p0, Ljava/util/ArrayList;

    if-nez v0, :cond_3

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :cond_3
    add-int/lit8 p1, v0, -0x1

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 585
    :goto_1
    invoke-virtual {p3, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return v0
.end method

.method public static ֫(Ljava/lang/String;)J
    .locals 6

    .line 381
    sget-object v0, Ll/ܿ᩵ۧ;->᩻:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 382
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    :cond_0
    const/4 v0, 0x1

    .line 386
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide v2, 0xd693a400L

    mul-long v0, v0, v2

    const/4 v2, 0x2

    .line 387
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/32 v4, 0x3938700

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    const/4 v0, 0x3

    .line 388
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/32 v4, 0xf4240

    mul-long v0, v0, v4

    add-long/2addr v0, v2

    const/4 v2, 0x4

    .line 389
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x2710

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    return-wide v2
.end method

.method private ֫(Ll/ᩳ֨֫;Ljava/nio/charset/Charset;)V
    .locals 5

    .line 204
    :cond_0
    :goto_0
    invoke-virtual {p1, p2}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    const-string v1, "[Script Info]"

    .line 205
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/16 v2, 0x5b

    if-eqz v1, :cond_5

    .line 230
    :goto_1
    invoke-virtual {p1, p2}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 231
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, p2}, Ll/ᩳ֨֫;->֫(Ljava/nio/charset/Charset;)I

    move-result v1

    if-eq v1, v2, :cond_0

    :cond_1
    const-string v1, ":"

    .line 232
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 233
    array-length v1, v0

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 236
    aget-object v1, v0, v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "playresx"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_4

    const-string v3, "playresy"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    .line 246
    :cond_3
    :try_start_0
    aget-object v0, v0, v4

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Ll/ܿ᩵ۧ;->ᩳ:F

    goto :goto_1

    .line 239
    :cond_4
    aget-object v0, v0, v4

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Ll/ܿ᩵ۧ;->ܿ:F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    :cond_5
    const-string v1, "[V4+ Styles]"

    .line 207
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 266
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v1, 0x0

    .line 269
    :cond_6
    :goto_2
    invoke-virtual {p1, p2}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 270
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {p1, p2}, Ll/ᩳ֨֫;->֫(Ljava/nio/charset/Charset;)I

    move-result v4

    if-eq v4, v2, :cond_a

    :cond_7
    const-string v4, "Format:"

    .line 271
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 272
    invoke-static {v3}, Ll/ܳ᩵ۧ;->֫(Ljava/lang/String;)Ll/ܳ᩵ۧ;

    move-result-object v1

    goto :goto_2

    :cond_8
    const-string v4, "Style:"

    .line 273
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-nez v1, :cond_9

    const-string v4, "Skipping \'Style:\' line before \'Format:\' line: "

    .line 275
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_2

    .line 278
    :cond_9
    invoke-static {v3, v1}, Ll/ۜ᩵ۧ;->֫(Ljava/lang/String;Ll/ܳ᩵ۧ;)Ll/ۜ᩵ۧ;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 280
    iget-object v4, v3, Ll/ۜ᩵ۧ;->ܳ:Ljava/lang/String;

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 208
    :cond_a
    iput-object v0, p0, Ll/ܿ᩵ۧ;->ܳ:Ljava/util/LinkedHashMap;

    goto/16 :goto_0

    :cond_b
    const-string v1, "[V4 Styles]"

    .line 209
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    const-string v0, "[V4 Styles] are not supported"

    .line 210
    invoke-static {v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_c
    const-string v1, "[Events]"

    .line 211
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_d
    return-void
.end method


# virtual methods
.method public final synthetic reset()V
    .locals 0

    return-void
.end method

.method public final synthetic ֫(II[B)Ll/ܰۘۧ;
    .locals 0

    .line 0
    invoke-static {p0, p3, p2}, Ll/ܳᩴۧ;->֫(Ll/ۢᩴۧ;[BI)Ll/ܰۘۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫([BIILl/᩷ᩴۧ;Ll/᩻ۚ֫;)V
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    .line 141
    iget-wide v4, v2, Ll/᩷ᩴۧ;->ۧ:J

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 142
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    add-int v8, v1, p3

    .line 144
    iget-object v9, v0, Ll/ܿ᩵ۧ;->ܽ:Ll/ᩳ֨֫;

    move-object/from16 v10, p1

    invoke-virtual {v9, v8, v10}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 145
    invoke-virtual {v9, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 192
    invoke-virtual {v9}, Ll/ᩳ֨֫;->۫()Ljava/nio/charset/Charset;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 193
    :cond_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 148
    :goto_0
    iget-boolean v8, v0, Ll/ܿ᩵ۧ;->ۧ:Z

    if-nez v8, :cond_1

    .line 149
    invoke-direct {v0, v9, v1}, Ll/ܿ᩵ۧ;->֫(Ll/ᩳ֨֫;Ljava/nio/charset/Charset;)V

    :cond_1
    if-eqz v8, :cond_2

    .line 298
    iget-object v8, v0, Ll/ܿ᩵ۧ;->֫:Ll/ᩳ᩵ۧ;

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    .line 300
    :goto_1
    invoke-virtual {v9, v1}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_20

    const-string v11, "Format:"

    .line 301
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 302
    invoke-static {v10}, Ll/ᩳ᩵ۧ;->֫(Ljava/lang/String;)Ll/ᩳ᩵ۧ;

    move-result-object v8

    goto :goto_1

    :cond_3
    const-string v11, "Dialogue:"

    .line 303
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1e

    if-nez v8, :cond_4

    const-string v11, "Skipping dialogue line before complete format: "

    .line 305
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_12

    .line 304
    :cond_4
    iget v14, v8, Ll/ᩳ᩵ۧ;->ܽ:I

    .line 323
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    invoke-static {v11}, Ll/᩺֡֫;->֫(Z)V

    const/16 v11, 0x9

    .line 325
    invoke-virtual {v10, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    iget v15, v8, Ll/ᩳ᩵ۧ;->ۧ:I

    const-string v12, ","

    invoke-virtual {v11, v12, v14}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v11

    .line 326
    array-length v12, v11

    if-eq v12, v14, :cond_5

    const-string v11, "Skipping dialogue line with fewer columns than format: "

    .line 327
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_12

    :cond_5
    const/4 v12, -0x1

    if-eq v15, v12, :cond_6

    .line 334
    :try_start_0
    aget-object v12, v11, v15

    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 336
    :catch_0
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Fail to parse layer: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v13, v11, v15

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :cond_6
    const/4 v12, 0x0

    .line 340
    :goto_2
    iget v13, v8, Ll/ᩳ᩵ۧ;->ᩳ:I

    aget-object v13, v11, v13

    invoke-static {v13}, Ll/ܿ᩵ۧ;->֫(Ljava/lang/String;)J

    move-result-wide v13

    const-string v15, "Skipping invalid timing: "

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v18, v13, v16

    if-nez v18, :cond_7

    .line 342
    invoke-virtual {v15, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_12

    :cond_7
    move-object/from16 v18, v1

    .line 346
    iget v1, v8, Ll/ᩳ᩵ۧ;->֫:I

    aget-object v1, v11, v1

    invoke-static {v1}, Ll/ܿ᩵ۧ;->֫(Ljava/lang/String;)J

    move-result-wide v1

    cmp-long v19, v1, v16

    if-eqz v19, :cond_1d

    cmp-long v16, v1, v13

    if-gtz v16, :cond_8

    goto/16 :goto_11

    .line 354
    :cond_8
    iget-object v10, v0, Ll/ܿ᩵ۧ;->ܳ:Ljava/util/LinkedHashMap;

    if-eqz v10, :cond_9

    iget v15, v8, Ll/ᩳ᩵ۧ;->ܿ:I

    move-object/from16 v16, v9

    const/4 v9, -0x1

    if-eq v15, v9, :cond_a

    .line 355
    aget-object v9, v11, v15

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۜ᩵ۧ;

    goto :goto_3

    :cond_9
    move-object/from16 v16, v9

    :cond_a
    const/4 v9, 0x0

    .line 357
    :goto_3
    iget v10, v8, Ll/ᩳ᩵ۧ;->ܳ:I

    aget-object v10, v11, v10

    .line 358
    invoke-static {v10}, Ll/᩻᩵ۧ;->֫(Ljava/lang/String;)Ll/᩻᩵ۧ;

    move-result-object v11

    .line 360
    invoke-static {v10}, Ll/᩻᩵ۧ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v15, "\\N"

    move-object/from16 p1, v8

    const-string v8, "\n"

    .line 361
    invoke-virtual {v10, v15, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    const-string v15, "\\n"

    .line 362
    invoke-virtual {v10, v15, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    const-string v10, "\\h"

    const-string v15, "\u00a0"

    .line 363
    invoke-virtual {v8, v10, v15}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    .line 364
    iget v10, v0, Ll/ܿ᩵ۧ;->ܿ:F

    iget v15, v0, Ll/ܿ᩵ۧ;->ᩳ:F

    .line 400
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, v8}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 401
    new-instance v8, Ll/᩹֡֫;

    invoke-direct {v8}, Ll/᩹֡֫;-><init>()V

    invoke-virtual {v8, v0}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    invoke-virtual {v8, v12}, Ll/᩹֡֫;->ܿ(I)V

    if-eqz v9, :cond_12

    .line 403
    iget-boolean v12, v9, Ll/ۜ᩵ۧ;->ܿ:Z

    iget-object v3, v9, Ll/ۜ᩵ۧ;->᩻:Ljava/lang/Integer;

    move-wide/from16 v20, v4

    iget-object v4, v9, Ll/ۜ᩵ۧ;->ۜ:Ljava/lang/Integer;

    if-eqz v4, :cond_b

    .line 405
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 406
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct {v5, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 408
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v4

    move-wide/from16 v22, v1

    const/4 v1, 0x0

    const/16 v2, 0x21

    .line 405
    invoke-virtual {v0, v5, v1, v4, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_4

    :cond_b
    move-wide/from16 v22, v1

    const/4 v1, 0x0

    const/16 v2, 0x21

    .line 411
    :goto_4
    iget v4, v9, Ll/ۜ᩵ۧ;->ܽ:I

    const/4 v5, 0x3

    if-ne v4, v5, :cond_c

    if-eqz v3, :cond_c

    .line 412
    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    .line 413
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v4, v3}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 415
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    .line 412
    invoke-virtual {v0, v4, v1, v3, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 418
    :cond_c
    iget v1, v9, Ll/ۜ᩵ۧ;->ᩳ:F

    const v2, -0x800001

    cmpl-float v3, v1, v2

    if-eqz v3, :cond_d

    cmpl-float v3, v15, v2

    if-eqz v3, :cond_d

    div-float/2addr v1, v15

    const/4 v2, 0x1

    .line 419
    invoke-virtual {v8, v1, v2}, Ll/᩹֡֫;->ۧ(FI)V

    .line 422
    :cond_d
    iget-boolean v1, v9, Ll/ۜ᩵ۧ;->ۧ:Z

    if-eqz v1, :cond_e

    if-eqz v12, :cond_e

    .line 423
    new-instance v1, Landroid/text/style/StyleSpan;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 426
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x21

    .line 423
    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_5

    :cond_e
    const/4 v3, 0x0

    const/16 v4, 0x21

    if-eqz v1, :cond_f

    .line 429
    new-instance v1, Landroid/text/style/StyleSpan;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 432
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v2

    .line 429
    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_5

    :cond_f
    if-eqz v12, :cond_10

    .line 435
    new-instance v1, Landroid/text/style/StyleSpan;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 438
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v2

    .line 435
    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 441
    :cond_10
    :goto_5
    iget-boolean v1, v9, Ll/ۜ᩵ۧ;->ۢ:Z

    if-eqz v1, :cond_11

    .line 442
    new-instance v1, Landroid/text/style/UnderlineSpan;

    invoke-direct {v1}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 445
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v2

    .line 442
    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 448
    :cond_11
    iget-boolean v1, v9, Ll/ۜ᩵ۧ;->᩷:Z

    if-eqz v1, :cond_13

    .line 449
    new-instance v1, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v1}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 452
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v2

    .line 449
    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_6

    :cond_12
    move-wide/from16 v22, v1

    move-wide/from16 v20, v4

    .line 458
    :cond_13
    :goto_6
    iget v0, v11, Ll/᩻᩵ۧ;->֫:I

    iget-object v1, v11, Ll/᩻᩵ۧ;->ۧ:Landroid/graphics/PointF;

    const/4 v2, -0x1

    if-eq v0, v2, :cond_14

    goto :goto_7

    :cond_14
    if-eqz v9, :cond_15

    .line 461
    iget v0, v9, Ll/ۜ᩵ۧ;->֫:I

    goto :goto_7

    :cond_15
    const/4 v0, -0x1

    :goto_7
    const-string v2, "Unknown alignment: "

    packed-switch v0, :pswitch_data_0

    .line 0
    :pswitch_0
    invoke-static {v0, v2}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    goto :goto_8

    .line 497
    :pswitch_1
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_9

    .line 493
    :pswitch_2
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_9

    .line 489
    :pswitch_3
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_9

    :goto_8
    :pswitch_4
    const/4 v3, 0x0

    .line 465
    :goto_9
    invoke-virtual {v8, v3}, Ll/᩹֡֫;->ۧ(Landroid/text/Layout$Alignment;)V

    const/high16 v3, -0x80000000

    packed-switch v0, :pswitch_data_1

    .line 0
    :pswitch_5
    invoke-static {v0, v2}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    goto :goto_a

    :pswitch_6
    const/4 v4, 0x2

    goto :goto_b

    :pswitch_7
    const/4 v4, 0x1

    goto :goto_b

    :pswitch_8
    const/4 v4, 0x0

    goto :goto_b

    :goto_a
    :pswitch_9
    const/high16 v4, -0x80000000

    .line 466
    :goto_b
    invoke-virtual {v8, v4}, Ll/᩹֡֫;->ۧ(I)V

    packed-switch v0, :pswitch_data_2

    .line 0
    :pswitch_a
    invoke-static {v0, v2}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    goto :goto_c

    :pswitch_b
    const/4 v3, 0x0

    goto :goto_c

    :pswitch_c
    const/4 v3, 0x1

    goto :goto_c

    :pswitch_d
    const/4 v3, 0x2

    .line 467
    :goto_c
    :pswitch_e
    invoke-virtual {v8, v3}, Ll/᩹֡֫;->֫(I)V

    if-eqz v1, :cond_16

    const v0, -0x800001

    cmpl-float v2, v15, v0

    if-eqz v2, :cond_16

    cmpl-float v0, v10, v0

    if-eqz v0, :cond_16

    .line 472
    iget v0, v1, Landroid/graphics/PointF;->x:F

    div-float/2addr v0, v10

    invoke-virtual {v8, v0}, Ll/᩹֡֫;->ۧ(F)V

    .line 473
    iget v0, v1, Landroid/graphics/PointF;->y:F

    div-float/2addr v0, v15

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Ll/᩹֡֫;->֫(FI)V

    goto :goto_f

    .line 476
    :cond_16
    invoke-virtual {v8}, Ll/᩹֡֫;->ᩳ()I

    move-result v0

    const v1, 0x3d4ccccd    # 0.05f

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v0, :cond_19

    if-eq v0, v2, :cond_18

    if-eq v0, v3, :cond_17

    const v0, -0x800001

    goto :goto_d

    :cond_17
    const v0, 0x3f733333    # 0.95f

    goto :goto_d

    :cond_18
    const/high16 v0, 0x3f000000    # 0.5f

    goto :goto_d

    :cond_19
    const v0, 0x3d4ccccd    # 0.05f

    :goto_d
    invoke-virtual {v8, v0}, Ll/᩹֡֫;->ۧ(F)V

    .line 477
    invoke-virtual {v8}, Ll/᩹֡֫;->ܽ()I

    move-result v0

    if-eqz v0, :cond_1c

    if-eq v0, v2, :cond_1b

    if-eq v0, v3, :cond_1a

    const v1, -0x800001

    goto :goto_e

    :cond_1a
    const v1, 0x3f733333    # 0.95f

    goto :goto_e

    :cond_1b
    const/high16 v1, 0x3f000000    # 0.5f

    :cond_1c
    :goto_e
    const/4 v0, 0x0

    invoke-virtual {v8, v1, v0}, Ll/᩹֡֫;->֫(FI)V

    .line 480
    :goto_f
    invoke-virtual {v8}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object v0

    .line 366
    invoke-static {v13, v14, v7, v6}, Ll/ܿ᩵ۧ;->֫(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v1

    move-wide/from16 v2, v22

    .line 367
    invoke-static {v2, v3, v7, v6}, Ll/ܿ᩵ۧ;->֫(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v2

    :goto_10
    if-ge v1, v2, :cond_1f

    .line 370
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_1d
    :goto_11
    move-wide/from16 v20, v4

    move-object/from16 p1, v8

    move-object/from16 v16, v9

    .line 348
    invoke-virtual {v15, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_13

    :cond_1e
    :goto_12
    move-object/from16 v18, v1

    move-wide/from16 v20, v4

    move-object/from16 p1, v8

    move-object/from16 v16, v9

    :cond_1f
    :goto_13
    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v9, v16

    move-object/from16 v1, v18

    move-wide/from16 v4, v20

    goto/16 :goto_1

    :cond_20
    move-wide/from16 v20, v4

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v20, v0

    if-eqz v2, :cond_21

    move-object/from16 v2, p4

    .line 155
    iget-boolean v2, v2, Ll/᩷ᩴۧ;->֫:Z

    if-eqz v2, :cond_21

    .line 156
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_14

    :cond_21
    const/4 v2, 0x0

    :goto_14
    const/4 v3, 0x0

    .line 158
    :goto_15
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_27

    .line 159
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Ljava/util/List;

    .line 160
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_23

    if-eqz v3, :cond_23

    :cond_22
    :goto_16
    move-object/from16 v4, p5

    goto :goto_18

    .line 164
    :cond_23
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-eq v3, v4, :cond_26

    .line 168
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    add-int/lit8 v4, v3, 0x1

    .line 170
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 171
    new-instance v14, Ll/۬ۘۧ;

    sub-long v11, v4, v9

    move-object v8, v14

    invoke-direct/range {v8 .. v13}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    cmp-long v8, v20, v0

    if-eqz v8, :cond_25

    cmp-long v8, v4, v20

    if-ltz v8, :cond_24

    goto :goto_17

    :cond_24
    if-eqz v2, :cond_22

    .line 177
    invoke-interface {v2, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_25
    :goto_17
    move-object/from16 v4, p5

    .line 175
    invoke-interface {v4, v14}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    :goto_18
    add-int/lit8 v3, v3, 0x1

    goto :goto_15

    .line 166
    :cond_26
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_27
    move-object/from16 v4, p5

    if-eqz v2, :cond_28

    .line 181
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۘۧ;

    .line 182
    invoke-interface {v4, v1}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    goto :goto_19

    :cond_28
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_9
        :pswitch_5
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch -0x1
        :pswitch_e
        :pswitch_a
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method
