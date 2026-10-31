.class public final Ll/֡֨۠;
.super Ll/ۡ֨۠;
.source "M445"


# instance fields
.field public ܳ:Ll/᩵֨۠;

.field public ܿ:Ljava/util/HashMap;

.field public ᩳ:Ljava/util/EnumMap;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 276
    sget-object v0, Ll/᩹ۖ֨;->۬:Ll/᩹ۖ֨;

    sget-object v1, Ll/᩹ۖ֨;->᩹:Ll/᩹ۖ֨;

    sget-object v2, Ll/᩹ۖ֨;->ۗ:Ll/᩹ۖ֨;

    sget-object v3, Ll/᩹ۖ֨;->ۙ:Ll/᩹ۖ֨;

    invoke-static {v0, v1, v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۡ֨۠;-><init>(Ljava/util/Set;)V

    .line 293
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Ll/ᩴ֨۠;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Ll/֡֨۠;->ᩳ:Ljava/util/EnumMap;

    .line 294
    sget-object v0, Ll/ᩴ֨۠;->ۙ:Ll/ᩴ֨۠;

    const-string v1, "%f:%l:%_%p%L%m"

    invoke-virtual {p0, v0, v1}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 295
    sget-object v0, Ll/ᩴ֨۠;->᩶:Ll/ᩴ֨۠;

    const-string v1, "%p%L%m"

    invoke-virtual {p0, v0, v1}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 296
    sget-object v0, Ll/ᩴ֨۠;->᩹:Ll/ᩴ֨۠;

    const-string v1, "%f:%_%p%L%m"

    invoke-virtual {p0, v0, v1}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 281
    invoke-direct {p0}, Ll/֡֨۠;->֫()V

    return-void
.end method

.method public constructor <init>(Ll/ۨܶ۠;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 226
    sget-object v2, Ll/᩹ۖ֨;->۬:Ll/᩹ۖ֨;

    sget-object v3, Ll/᩹ۖ֨;->᩹:Ll/᩹ۖ֨;

    sget-object v4, Ll/᩹ۖ֨;->ۗ:Ll/᩹ۖ֨;

    sget-object v5, Ll/᩹ۖ֨;->ۙ:Ll/᩹ۖ֨;

    invoke-static {v2, v3, v4, v5}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v6

    invoke-direct {v0, v1, v6}, Ll/ۡ֨۠;-><init>(Ll/ۨܶ۠;Ljava/util/EnumSet;)V

    .line 293
    new-instance v6, Ljava/util/EnumMap;

    const-class v7, Ll/ᩴ֨۠;

    invoke-direct {v6, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v6, v0, Ll/֡֨۠;->ᩳ:Ljava/util/EnumMap;

    .line 294
    sget-object v6, Ll/ᩴ֨۠;->ۙ:Ll/ᩴ֨۠;

    const-string v8, "%f:%l:%_%p%L%m"

    invoke-virtual {v0, v6, v8}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 295
    sget-object v8, Ll/ᩴ֨۠;->᩶:Ll/ᩴ֨۠;

    const-string v9, "%p%L%m"

    invoke-virtual {v0, v8, v9}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 296
    sget-object v10, Ll/ᩴ֨۠;->᩹:Ll/ᩴ֨۠;

    const-string v11, "%f:%_%p%L%m"

    invoke-virtual {v0, v10, v11}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 231
    invoke-direct/range {p0 .. p0}, Ll/֡֨۠;->֫()V

    const-string v11, "diags.legacy"

    .line 232
    invoke-virtual {v1, v11}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v11

    const-string v12, "%f:%_%t%L%m"

    const-string v13, "%f:%l:%_%t%L%m"

    if-eqz v11, :cond_0

    .line 293
    new-instance v11, Ljava/util/EnumMap;

    invoke-direct {v11, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v11, v0, Ll/֡֨۠;->ᩳ:Ljava/util/EnumMap;

    .line 294
    invoke-virtual {v0, v6, v13}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 295
    invoke-virtual {v0, v8, v9}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 296
    invoke-virtual {v0, v10, v12}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    :cond_0
    const-string v11, "diags.layout"

    .line 234
    invoke-virtual {v1, v11}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v15, "\\|"

    const/16 v16, 0x1

    if-eqz v11, :cond_4

    const-string v14, "OLD"

    .line 236
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    .line 293
    new-instance v11, Ljava/util/EnumMap;

    invoke-direct {v11, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v11, v0, Ll/֡֨۠;->ᩳ:Ljava/util/EnumMap;

    .line 294
    invoke-virtual {v0, v6, v13}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 295
    invoke-virtual {v0, v8, v9}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 296
    invoke-virtual {v0, v10, v12}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    goto :goto_1

    .line 301
    :cond_1
    invoke-virtual {v11, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 302
    array-length v9, v7

    const/4 v11, 0x2

    if-eq v9, v11, :cond_3

    const/4 v12, 0x3

    if-eq v9, v12, :cond_2

    goto :goto_0

    .line 304
    :cond_2
    aget-object v9, v7, v11

    invoke-virtual {v0, v10, v9}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    .line 306
    :cond_3
    aget-object v9, v7, v16

    invoke-virtual {v0, v8, v9}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    :goto_0
    const/4 v8, 0x0

    .line 308
    aget-object v7, v7, v8

    invoke-virtual {v0, v6, v7}, Ll/֡֨۠;->֫(Ll/ᩴ֨۠;Ljava/lang/String;)V

    :cond_4
    :goto_1
    const-string v6, "diags.sourcePosition"

    .line 242
    invoke-virtual {v1, v6}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    const-string v7, "bottom"

    .line 243
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 244
    sget-object v6, Ll/᩵֨۠;->᩶:Ll/᩵֨۠;

    goto :goto_2

    .line 246
    :cond_5
    sget-object v6, Ll/᩵֨۠;->᩹:Ll/᩵֨۠;

    .line 347
    :goto_2
    iput-object v6, v0, Ll/֡֨۠;->ܳ:Ll/᩵֨۠;

    const-string v6, "diags.indent"

    .line 247
    invoke-virtual {v1, v6}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 249
    invoke-virtual {v1, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 251
    :try_start_0
    array-length v6, v1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_9

    const/4 v7, 0x3

    if-eq v6, v7, :cond_8

    const/4 v7, 0x4

    if-eq v6, v7, :cond_7

    const/4 v8, 0x5

    if-eq v6, v8, :cond_6

    goto :goto_3

    .line 253
    :cond_6
    sget-object v6, Ll/᩹ۖ֨;->᩶:Ll/᩹ۖ֨;

    aget-object v7, v1, v7

    .line 254
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 253
    invoke-virtual {v0, v6, v7}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;I)V

    :cond_7
    const/4 v6, 0x3

    .line 256
    aget-object v6, v1, v6

    .line 257
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 256
    invoke-virtual {v0, v4, v6}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;I)V

    :cond_8
    const/4 v4, 0x2

    .line 259
    aget-object v4, v1, v4

    .line 260
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 259
    invoke-virtual {v0, v5, v4}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;I)V

    .line 262
    :cond_9
    aget-object v4, v1, v16

    .line 263
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 262
    invoke-virtual {v0, v3, v4}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;I)V

    :goto_3
    const/4 v3, 0x0

    .line 265
    aget-object v1, v1, v3

    .line 266
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 265
    invoke-virtual {v0, v2, v1}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 270
    :catch_0
    invoke-direct/range {p0 .. p0}, Ll/֡֨۠;->֫()V

    :cond_a
    return-void
.end method

.method private ֫()V
    .locals 3

    .line 313
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֡֨۠;->ܿ:Ljava/util/HashMap;

    .line 314
    sget-object v0, Ll/᩹ۖ֨;->۬:Ll/᩹ۖ֨;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;I)V

    .line 315
    sget-object v0, Ll/᩹ۖ֨;->᩹:Ll/᩹ۖ֨;

    const/4 v2, 0x2

    invoke-virtual {p0, v0, v2}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;I)V

    .line 316
    sget-object v0, Ll/᩹ۖ֨;->ۗ:Ll/᩹ۖ֨;

    const/4 v2, 0x4

    invoke-virtual {p0, v0, v2}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;I)V

    .line 317
    sget-object v0, Ll/᩹ۖ֨;->ۙ:Ll/᩹ۖ֨;

    invoke-virtual {p0, v0, v1}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;I)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩹ۖ֨;)I
    .locals 1

    .line 327
    iget-object v0, p0, Ll/֡֨۠;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ᩴ֨۠;Ljava/lang/String;)V
    .locals 1

    .line 383
    iget-object v0, p0, Ll/֡֨۠;->ᩳ:Ljava/util/EnumMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/᩹ۖ֨;I)V
    .locals 1

    .line 338
    iget-object v0, p0, Ll/֡֨۠;->ܿ:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
