.class public final Ll/᩶᩵ۧ;
.super Ljava/lang/Object;
.source "08T1"


# static fields
.field public static final ܽ:Ljava/util/regex/Pattern;

.field public static final ᩳ:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Ljava/lang/StringBuilder;

.field public final ۧ:Ll/ᩳ֨֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\\[voice=\"([^\"]*)\"\\]"

    .line 59
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩶᩵ۧ;->ᩳ:Ljava/util/regex/Pattern;

    const-string v0, "^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$"

    .line 61
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩶᩵ۧ;->ܽ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/᩶᩵ۧ;->ۧ:Ll/ᩳ֨֫;

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/᩶᩵ۧ;->֫:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    .line 323
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 324
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 325
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_5

    if-nez v0, :cond_5

    .line 328
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    aget-byte v3, v3, v1

    int-to-char v3, v3

    const/16 v4, 0x41

    if-lt v3, v4, :cond_0

    const/16 v4, 0x5a

    if-le v3, v4, :cond_4

    :cond_0
    const/16 v4, 0x61

    if-lt v3, v4, :cond_1

    const/16 v4, 0x7a

    if-le v3, v4, :cond_4

    :cond_1
    const/16 v4, 0x30

    if-lt v3, v4, :cond_2

    const/16 v4, 0x39

    if-le v3, v4, :cond_4

    :cond_2
    const/16 v4, 0x23

    if-eq v3, v4, :cond_4

    const/16 v4, 0x2d

    if-eq v3, v4, :cond_4

    const/16 v4, 0x2e

    if-eq v3, v4, :cond_4

    const/16 v4, 0x5f

    if-ne v3, v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 337
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 342
    :cond_5
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    sub-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 343
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 1

    .line 238
    invoke-static {p0}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;)V

    .line 239
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 242
    :cond_0
    invoke-static {p0, p1}, Ll/᩶᩵ۧ;->֫(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 243
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    .line 247
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    int-to-char p0, p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ᩳ֨֫;)V
    .locals 8

    const/4 v0, 0x1

    :goto_0
    const/4 v1, 0x1

    .line 230
    :goto_1
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    if-lez v2, :cond_4

    if-eqz v1, :cond_4

    .line 251
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 275
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    aget-byte v1, v2, v1

    int-to-char v1, v1

    const/16 v2, 0x9

    if-eq v1, v2, :cond_3

    const/16 v2, 0xa

    if-eq v1, v2, :cond_3

    const/16 v2, 0xc

    if-eq v1, v2, :cond_3

    const/16 v2, 0xd

    if-eq v1, v2, :cond_3

    const/16 v2, 0x20

    if-eq v1, v2, :cond_3

    .line 303
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 304
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    .line 305
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    add-int/lit8 v4, v1, 0x2

    if-gt v4, v2, :cond_2

    add-int/lit8 v5, v1, 0x1

    .line 306
    aget-byte v1, v3, v1

    const/16 v6, 0x2f

    if-ne v1, v6, :cond_2

    aget-byte v1, v3, v5

    const/16 v5, 0x2a

    if-ne v1, v5, :cond_2

    :goto_2
    add-int/lit8 v1, v4, 0x1

    if-ge v1, v2, :cond_1

    .line 308
    aget-byte v7, v3, v4

    int-to-char v7, v7

    if-ne v7, v5, :cond_0

    .line 310
    aget-byte v7, v3, v1

    int-to-char v7, v7

    if-ne v7, v6, :cond_0

    add-int/lit8 v4, v4, 0x2

    move v2, v4

    goto :goto_2

    :cond_0
    move v4, v1

    goto :goto_2

    .line 316
    :cond_1
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    sub-int/2addr v2, v1

    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    goto :goto_1

    .line 257
    :cond_3
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    goto :goto_0

    :cond_4
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳ֨֫;)Ljava/util/ArrayList;
    .locals 14

    .line 83
    iget-object v0, p0, Ll/᩶᩵ۧ;->֫:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 84
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    .line 588
    :cond_0
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v3}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    .line 271
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 86
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    iget-object v4, p0, Ll/᩶᩵ۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {v4, p1, v3}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 87
    invoke-virtual {v4, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 89
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 126
    :goto_0
    invoke-static {v4}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;)V

    .line 127
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    const-string v3, "{"

    const/4 v5, 0x1

    const/4 v6, 0x5

    if-ge v2, v6, :cond_1

    goto/16 :goto_4

    .line 510
    :cond_1
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v6, v2}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "::cue"

    .line 131
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_4

    .line 134
    :cond_2
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    .line 135
    invoke-static {v4, v0}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_4

    .line 139
    :cond_3
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 140
    invoke-virtual {v4, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    const-string v2, ""

    goto :goto_5

    :cond_4
    const-string v2, "("

    .line 144
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 156
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    .line 157
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܿ()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v2, v6, :cond_6

    if-nez v7, :cond_6

    .line 160
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v7

    add-int/lit8 v8, v2, 0x1

    aget-byte v2, v7, v2

    int-to-char v2, v2

    const/16 v7, 0x29

    if-ne v2, v7, :cond_5

    const/4 v2, 0x1

    const/4 v7, 0x1

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    const/4 v7, 0x0

    :goto_2
    move v2, v8

    goto :goto_1

    :cond_6
    add-int/lit8 v2, v2, -0x1

    .line 163
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v6

    sub-int/2addr v2, v6

    .line 510
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v2, v6}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    .line 163
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    .line 147
    :goto_3
    invoke-static {v4, v0}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ")"

    .line 148
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :goto_4
    const/4 v2, 0x0

    :cond_8
    :goto_5
    if-eqz v2, :cond_2c

    .line 92
    invoke-static {v4, v0}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_16

    .line 95
    :cond_9
    new-instance v3, Ll/ۙ᩵ۧ;

    invoke-direct {v3}, Ll/ۙ᩵ۧ;-><init>()V

    .line 376
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    const/4 v7, -0x1

    if-eqz v6, :cond_a

    goto :goto_8

    :cond_a
    const/16 v6, 0x5b

    .line 379
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-eq v6, v7, :cond_c

    .line 381
    sget-object v8, Ll/᩶᩵ۧ;->ᩳ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    .line 382
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    move-result v9

    if-eqz v9, :cond_b

    .line 383
    invoke-virtual {v8, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    .line 155
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    invoke-virtual {v3, v8}, Ll/ۙ᩵ۧ;->ᩳ(Ljava/lang/String;)V

    .line 385
    :cond_b
    invoke-virtual {v2, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 387
    :cond_c
    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v6, "\\."

    .line 1090
    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    .line 388
    aget-object v6, v2, v1

    const/16 v8, 0x23

    .line 389
    invoke-virtual {v6, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-eq v8, v7, :cond_d

    .line 391
    invoke-virtual {v6, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/ۙ᩵ۧ;->ܽ(Ljava/lang/String;)V

    add-int/lit8 v8, v8, 0x1

    .line 392
    invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/ۙ᩵ۧ;->ۧ(Ljava/lang/String;)V

    goto :goto_6

    .line 394
    :cond_d
    invoke-virtual {v3, v6}, Ll/ۙ᩵ۧ;->ܽ(Ljava/lang/String;)V

    .line 396
    :goto_6
    array-length v1, v2

    if-le v1, v5, :cond_f

    .line 397
    array-length v1, v2

    .line 654
    array-length v6, v2

    if-gt v1, v6, :cond_e

    const/4 v6, 0x1

    goto :goto_7

    :cond_e
    const/4 v6, 0x0

    :goto_7
    invoke-static {v6}, Ll/᩺֡֫;->֫(Z)V

    .line 655
    invoke-static {v2, v5, v1}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    .line 397
    check-cast v1, [Ljava/lang/String;

    invoke-virtual {v3, v1}, Ll/ۙ᩵ۧ;->֫([Ljava/lang/String;)V

    :cond_f
    :goto_8
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_9
    const-string v6, "}"

    if-nez v1, :cond_2a

    .line 100
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 101
    invoke-static {v4, v0}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_11

    .line 102
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    goto :goto_a

    :cond_10
    const/4 v7, 0x0

    goto :goto_b

    :cond_11
    :goto_a
    const/4 v7, 0x1

    :goto_b
    if-nez v7, :cond_29

    .line 104
    invoke-virtual {v4, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 169
    invoke-static {v4}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;)V

    .line 170
    invoke-static {v4, v0}, Ll/᩶᩵ۧ;->֫(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 171
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_12

    goto/16 :goto_15

    :cond_12
    const-string v8, ":"

    .line 174
    invoke-static {v4, v0}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    goto/16 :goto_15

    .line 177
    :cond_13
    invoke-static {v4}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;)V

    .line 280
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v9, 0x0

    :goto_c
    const-string v10, ";"

    if-nez v9, :cond_17

    .line 286
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v11

    .line 287
    invoke-static {v4, v0}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_14

    const/4 v8, 0x0

    goto :goto_e

    .line 292
    :cond_14
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_16

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_15

    goto :goto_d

    .line 296
    :cond_15
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    .line 293
    :cond_16
    :goto_d
    invoke-virtual {v4, v11}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v9, 0x1

    goto :goto_c

    .line 299
    :cond_17
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :goto_e
    if-eqz v8, :cond_29

    .line 179
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_18

    goto/16 :goto_15

    .line 182
    :cond_18
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v9

    .line 183
    invoke-static {v4, v0}, Ll/᩶᩵ۧ;->ۧ(Ll/ᩳ֨֫;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v11

    .line 184
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_19

    goto :goto_f

    .line 186
    :cond_19
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_29

    .line 189
    invoke-virtual {v4, v9}, Ll/ᩳ֨֫;->ܿ(I)V

    :goto_f
    const-string v6, "color"

    .line 195
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1a

    .line 196
    invoke-static {v8}, Ll/ܿۚ֫;->֫(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v3, v1}, Ll/ۙ᩵ۧ;->ۧ(I)V

    goto/16 :goto_15

    :cond_1a
    const-string v6, "background-color"

    .line 197
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    .line 198
    invoke-static {v8}, Ll/ܿۚ֫;->֫(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v3, v1}, Ll/ۙ᩵ۧ;->֫(I)V

    goto/16 :goto_15

    :cond_1b
    const-string v6, "ruby-position"

    .line 199
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v9, 0x2

    if-eqz v6, :cond_1d

    const-string v1, "over"

    .line 200
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 201
    invoke-virtual {v3, v5}, Ll/ۙ᩵ۧ;->ᩳ(I)V

    goto/16 :goto_15

    :cond_1c
    const-string v1, "under"

    .line 202
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    .line 203
    invoke-virtual {v3, v9}, Ll/ۙ᩵ۧ;->ᩳ(I)V

    goto/16 :goto_15

    :cond_1d
    const-string v6, "text-combine-upright"

    .line 205
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    const-string v1, "all"

    .line 206
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    const-string v1, "digits"

    invoke-virtual {v8, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1e

    goto :goto_10

    :cond_1e
    const/4 v1, 0x0

    goto :goto_11

    :cond_1f
    :goto_10
    const/4 v1, 0x1

    :goto_11
    invoke-virtual {v3, v1}, Ll/ۙ᩵ۧ;->֫(Z)V

    goto/16 :goto_15

    :cond_20
    const-string v6, "text-decoration"

    .line 207
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_21

    const-string v1, "underline"

    .line 208
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    .line 209
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ᩴ()V

    goto/16 :goto_15

    :cond_21
    const-string v6, "font-family"

    .line 211
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_22

    .line 212
    invoke-virtual {v3, v8}, Ll/ۙ᩵ۧ;->֫(Ljava/lang/String;)V

    goto/16 :goto_15

    :cond_22
    const-string v6, "font-weight"

    .line 213
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    const-string v1, "bold"

    .line 214
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    .line 215
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ۖ()V

    goto/16 :goto_15

    :cond_23
    const-string v6, "font-style"

    .line 217
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_24

    const-string v1, "italic"

    .line 218
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    .line 219
    invoke-virtual {v3}, Ll/ۙ᩵ۧ;->ۘ()V

    goto/16 :goto_15

    :cond_24
    const-string v6, "font-size"

    .line 221
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    .line 347
    sget-object v1, Ll/᩶᩵ۧ;->ܽ:Ljava/util/regex/Pattern;

    invoke-static {v8}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 348
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-nez v6, :cond_25

    .line 349
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "Invalid font-size: \'"

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\'."

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_15

    .line 352
    :cond_25
    invoke-virtual {v1, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    goto :goto_12

    :sswitch_0
    const-string v8, "px"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_26

    goto :goto_12

    :cond_26
    const/4 v6, 0x2

    goto :goto_13

    :sswitch_1
    const-string v8, "em"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_27

    goto :goto_12

    :cond_27
    const/4 v6, 0x1

    goto :goto_13

    :sswitch_2
    const-string v8, "%"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_28

    goto :goto_12

    :cond_28
    const/4 v6, 0x0

    goto :goto_13

    :goto_12
    const/4 v6, -0x1

    :goto_13
    packed-switch v6, :pswitch_data_0

    .line 366
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 355
    :pswitch_0
    invoke-virtual {v3, v5}, Ll/ۙ᩵ۧ;->ܽ(I)V

    goto :goto_14

    .line 358
    :pswitch_1
    invoke-virtual {v3, v9}, Ll/ۙ᩵ۧ;->ܽ(I)V

    goto :goto_14

    :pswitch_2
    const/4 v6, 0x3

    .line 361
    invoke-virtual {v3, v6}, Ll/ۙ᩵ۧ;->ܽ(I)V

    .line 368
    :goto_14
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v3, v1}, Ll/ۙ᩵ۧ;->֫(F)V

    :cond_29
    :goto_15
    move v1, v7

    goto/16 :goto_9

    .line 109
    :cond_2a
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2b

    .line 110
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2b
    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_2c
    :goto_16
    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x25 -> :sswitch_2
        0xca8 -> :sswitch_1
        0xe08 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
