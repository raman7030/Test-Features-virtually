.class public final Ll/۬֡ۚ;
.super Ljava/lang/Object;
.source "FBIL"


# static fields
.field public static final ֫:[C

.field public static final ۧ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [C

    .line 27
    fill-array-data v0, :array_0

    sput-object v0, Ll/۬֡ۚ;->֫:[C

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/۬֡ۚ;->ۧ:Ljava/util/HashMap;

    .line 29
    new-instance v0, Ll/֡֡ۚ;

    invoke-direct {v0}, Ll/֡֡ۚ;-><init>()V

    return-void

    nop

    :array_0
    .array-data 2
        0x2cs
        0x3bs
    .end array-data
.end method

.method public static ֫(Ljava/lang/String;[I)I
    .locals 3

    .line 119
    sget-object v0, Ll/۬֡ۚ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    aput p0, p1, v2

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    aput p0, p1, v1

    const/4 p0, 0x2

    return p0

    .line 125
    :cond_0
    sget-object v0, Ll/ۗ֡ۚ;->۫:Ll/ۗ֡ۚ;

    invoke-virtual {v0, p0}, Ll/ۗ֡ۚ;->֫(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    .line 127
    aput p0, p1, v2

    return v1

    :cond_1
    return v2
.end method

.method public static ֫(Ljava/lang/Appendable;Ljava/lang/String;Ll/֡֡ۚ;ZZZZ)V
    .locals 16

    move-object/from16 v0, p0

    .line 169
    invoke-virtual/range {p2 .. p2}, Ll/֡֡ۚ;->ܽ()Ll/ۗ֡ۚ;

    move-result-object v1

    .line 170
    invoke-virtual/range {p2 .. p2}, Ll/֡֡ۚ;->֫()Ljava/nio/charset/CharsetEncoder;

    move-result-object v2

    move-object/from16 v3, p2

    .line 171
    iget-object v4, v3, Ll/֡֡ۚ;->᩹:Ll/ۙ֡ۚ;

    .line 172
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v6, v5, :cond_18

    move-object/from16 v10, p1

    .line 177
    invoke-virtual {v10, v6}, Ljava/lang/String;->codePointAt(I)I

    move-result v11

    const/16 v12, 0x20

    const/4 v13, 0x1

    if-eqz p4, :cond_5

    .line 180
    invoke-static {v11}, Ll/᩷֡ۚ;->֫(I)Z

    move-result v14

    if-eqz v14, :cond_3

    if-eqz p5, :cond_0

    if-nez v8, :cond_0

    goto/16 :goto_4

    :cond_0
    if-eqz v9, :cond_1

    goto/16 :goto_4

    :cond_1
    if-eqz p6, :cond_2

    const/4 v7, 0x1

    goto/16 :goto_4

    .line 187
    :cond_2
    invoke-interface {v0, v12}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    const/4 v9, 0x1

    goto/16 :goto_4

    :cond_3
    if-eqz v7, :cond_4

    .line 194
    invoke-interface {v0, v12}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    const/4 v7, 0x0

    :cond_4
    const/4 v8, 0x1

    const/4 v9, 0x0

    :cond_5
    const/high16 v14, 0x10000

    if-ge v11, v14, :cond_16

    int-to-char v14, v11

    const/16 v15, 0x9

    if-eq v14, v15, :cond_15

    const/16 v15, 0xa

    if-eq v14, v15, :cond_15

    const/16 v15, 0xd

    if-eq v14, v15, :cond_15

    const/16 v15, 0x22

    if-eq v14, v15, :cond_13

    const/16 v15, 0x26

    if-eq v14, v15, :cond_12

    const/16 v15, 0x3c

    if-eq v14, v15, :cond_f

    const/16 v15, 0x3e

    if-eq v14, v15, :cond_d

    const/16 v15, 0xa0

    if-eq v14, v15, :cond_b

    if-lt v14, v12, :cond_a

    .line 298
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_6

    if-eq v12, v13, :cond_8

    .line 304
    invoke-virtual {v2, v14}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z

    move-result v13

    goto :goto_1

    :cond_6
    const/16 v12, 0x80

    if-ge v14, v12, :cond_7

    goto :goto_1

    :cond_7
    const/4 v13, 0x0

    :cond_8
    :goto_1
    if-nez v13, :cond_9

    goto :goto_2

    .line 242
    :cond_9
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto/16 :goto_4

    .line 240
    :cond_a
    :goto_2
    invoke-static {v0, v1, v11}, Ll/۬֡ۚ;->֫(Ljava/lang/Appendable;Ll/ۗ֡ۚ;I)V

    goto/16 :goto_4

    .line 208
    :cond_b
    sget-object v12, Ll/ۗ֡ۚ;->ۤ:Ll/ۗ֡ۚ;

    if-eq v1, v12, :cond_c

    const-string v12, "&nbsp;"

    .line 209
    invoke-interface {v0, v12}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_4

    :cond_c
    const-string v12, "&#xa0;"

    .line 211
    invoke-interface {v0, v12}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_4

    :cond_d
    if-nez p3, :cond_e

    const-string v12, "&gt;"

    .line 222
    invoke-interface {v0, v12}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_4

    .line 224
    :cond_e
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_4

    :cond_f
    if-eqz p3, :cond_11

    .line 215
    sget-object v12, Ll/ۗ֡ۚ;->ۤ:Ll/ۗ֡ۚ;

    if-eq v1, v12, :cond_11

    invoke-virtual/range {p2 .. p2}, Ll/֡֡ۚ;->᩷()Ll/᩵֡ۚ;

    move-result-object v12

    sget-object v13, Ll/᩵֡ۚ;->᩶:Ll/᩵֡ۚ;

    if-ne v12, v13, :cond_10

    goto :goto_3

    .line 218
    :cond_10
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_4

    :cond_11
    :goto_3
    const-string v12, "&lt;"

    .line 216
    invoke-interface {v0, v12}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_4

    :cond_12
    const-string v12, "&amp;"

    .line 205
    invoke-interface {v0, v12}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_4

    :cond_13
    if-eqz p3, :cond_14

    const-string v12, "&quot;"

    .line 228
    invoke-interface {v0, v12}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_4

    .line 230
    :cond_14
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_4

    .line 236
    :cond_15
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_4

    .line 245
    :cond_16
    new-instance v12, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/lang/String;-><init>([C)V

    .line 246
    invoke-virtual {v2, v12}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_17

    .line 247
    invoke-interface {v0, v12}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_4

    .line 249
    :cond_17
    invoke-static {v0, v1, v11}, Ll/۬֡ۚ;->֫(Ljava/lang/Appendable;Ll/ۗ֡ۚ;I)V

    .line 176
    :goto_4
    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    move-result v11

    add-int/2addr v6, v11

    goto/16 :goto_0

    :cond_18
    return-void
.end method

.method public static ֫(Ljava/lang/Appendable;Ll/ۗ֡ۚ;I)V
    .locals 2

    .line 255
    invoke-virtual {p1, p2}, Ll/ۗ֡ۚ;->֫(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    .line 256
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x3b

    if-nez v0, :cond_0

    const/16 p2, 0x26

    .line 257
    invoke-interface {p0, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void

    :cond_0
    const-string p1, "&#x"

    .line 259
    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public static ֫(Ll/ۗ֡ۚ;Ljava/lang/String;I)V
    .locals 8

    .line 321
    new-array v0, p2, [Ljava/lang/String;

    invoke-static {p0, v0}, Ll/ۗ֡ۚ;->֫(Ll/ۗ֡ۚ;[Ljava/lang/String;)V

    .line 322
    new-array v0, p2, [I

    invoke-static {p0, v0}, Ll/ۗ֡ۚ;->ۧ(Ll/ۗ֡ۚ;[I)V

    .line 323
    new-array v0, p2, [I

    invoke-static {p0, v0}, Ll/ۗ֡ۚ;->֫(Ll/ۗ֡ۚ;[I)V

    .line 324
    new-array v0, p2, [Ljava/lang/String;

    invoke-static {p0, v0}, Ll/ۗ֡ۚ;->ۧ(Ll/ۗ֡ۚ;[Ljava/lang/String;)V

    .line 327
    new-instance v0, Ll/ᩳۚۚ;

    .line 51
    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-direct {v0, v1, p1}, Ll/ᩳۚۚ;-><init>(Ljava/io/StringReader;I)V

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 329
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v2

    if-nez v2, :cond_2

    const/16 v2, 0x3d

    .line 332
    invoke-virtual {v0, v2}, Ll/ᩳۚۚ;->֫(C)Ljava/lang/String;

    move-result-object v2

    .line 333
    invoke-virtual {v0}, Ll/ᩳۚۚ;->֫()V

    .line 334
    sget-object v3, Ll/۬֡ۚ;->֫:[C

    invoke-virtual {v0, v3}, Ll/ᩳۚۚ;->֫([C)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x24

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 335
    invoke-virtual {v0}, Ll/ᩳۚۚ;->ܺ()C

    move-result v5

    .line 336
    invoke-virtual {v0}, Ll/ᩳۚۚ;->֫()V

    const/16 v6, 0x2c

    const/4 v7, -0x1

    if-ne v5, v6, :cond_0

    const/16 v5, 0x3b

    .line 339
    invoke-virtual {v0, v5}, Ll/ᩳۚۚ;->֫(C)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 340
    invoke-virtual {v0}, Ll/ᩳۚۚ;->֫()V

    goto :goto_1

    :cond_0
    const/4 v5, -0x1

    :goto_1
    const/16 v6, 0x26

    .line 344
    invoke-virtual {v0, v6}, Ll/ᩳۚۚ;->֫(C)Ljava/lang/String;

    move-result-object v6

    .line 345
    invoke-static {v6, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    .line 346
    invoke-virtual {v0}, Ll/ᩳۚۚ;->֫()V

    .line 348
    invoke-static {p0}, Ll/ۗ֡ۚ;->ܽ(Ll/ۗ֡ۚ;)[Ljava/lang/String;

    move-result-object v6

    aput-object v2, v6, v1

    .line 349
    invoke-static {p0}, Ll/ۗ֡ۚ;->ۧ(Ll/ۗ֡ۚ;)[I

    move-result-object v6

    aput v3, v6, v1

    .line 350
    invoke-static {p0}, Ll/ۗ֡ۚ;->֫(Ll/ۗ֡ۚ;)[I

    move-result-object v6

    aput v3, v6, v4

    .line 351
    invoke-static {p0}, Ll/ۗ֡ۚ;->ᩳ(Ll/ۗ֡ۚ;)[Ljava/lang/String;

    move-result-object v6

    aput-object v2, v6, v4

    if-eq v5, v7, :cond_1

    .line 354
    sget-object v4, Ll/۬֡ۚ;->ۧ:Ljava/util/HashMap;

    new-instance v6, Ljava/lang/String;

    filled-new-array {v3, v5}, [I

    move-result-object v3

    const/4 v5, 0x2

    invoke-direct {v6, v3, p1, v5}, Ljava/lang/String;-><init>([III)V

    invoke-virtual {v4, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    if-ne v1, p2, :cond_3

    const/4 p1, 0x1

    :cond_3
    const-string p0, "Unexpected count of entities loaded"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_4

    .line 361
    invoke-virtual {v0}, Ll/ᩳۚۚ;->ۧ()V

    return-void

    .line 91
    :cond_4
    :try_start_1
    new-instance p1, Ll/ܳ֡ۚ;

    .line 14
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    .line 361
    invoke-virtual {v0}, Ll/ᩳۚۚ;->ۧ()V

    .line 362
    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    .line 99
    sget-object v0, Ll/ۗ֡ۚ;->۬:Ll/ۗ֡ۚ;

    invoke-virtual {v0, p0}, Ll/ۗ֡ۚ;->֫(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 88
    sget-object v0, Ll/ۗ֡ۚ;->۫:Ll/ۗ֡ۚ;

    invoke-virtual {v0, p0}, Ll/ۗ֡ۚ;->֫(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
