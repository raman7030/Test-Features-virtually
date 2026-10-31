.class public final Ll/ۡᩳܿ;
.super Ljava/lang/Object;
.source "97UL"


# static fields
.field public static final ᩳ:Ll/᩶ۧᩴ;


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashSet;

.field public final ܽ:Ll/᩵֡ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 25
    new-instance v0, Ll/᩶ۧᩴ;

    invoke-direct {v0}, Ll/᩶ۧᩴ;-><init>()V

    sput-object v0, Ll/ۡᩳܿ;->ᩳ:Ll/᩶ۧᩴ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x80

    if-ge v1, v2, :cond_5

    const/16 v2, 0x30

    if-gt v2, v1, :cond_0

    const/16 v2, 0x39

    if-gt v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0x41

    if-gt v2, v1, :cond_1

    const/16 v2, 0x5a

    if-gt v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x61

    if-gt v2, v1, :cond_2

    const/16 v2, 0x7a

    if-gt v1, v2, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x24

    if-eq v1, v2, :cond_4

    const/16 v2, 0x5f

    if-eq v1, v2, :cond_4

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_3

    goto :goto_1

    .line 41
    :cond_3
    sget-object v2, Ll/ۡᩳܿ;->ᩳ:Ll/᩶ۧᩴ;

    int-to-char v3, v1

    invoke-virtual {v2, v3}, Ll/᩶ۧᩴ;->ۧ(C)Z

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    const/16 v1, 0x4e

    if-ge v0, v1, :cond_6

    .line 48
    sget-object v1, Ll/ۡᩳܿ;->ᩳ:Ll/᩶ۧᩴ;

    const-string v2, "\uff08\uff09\uff3b\uff3d\uff5b\uff5d\u3008\u3009\u300a\u300b\u300c\u300d\u300e\u300f\u3010\u3011\u3014\u3015\u3016\u3017\u3018\u3019\u300c\u300d\u300e\u300f\u201c\u201d\u2018\u2019\u3002\uff01\uff1f\uff0c\u3001\uff1b\uff1a\u2026\u2014\uff0d\u00b7\uff5e\uff5c\uff3c\uff0f\uff0a\uff03\uff06\uff05\uff20\uff0b\uff0d\uff1d\uff1c\uff1e\ufffd\u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u200b\u200c\u200d\u2028\u2029\u202f\u205f\u3000\ufeff"

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ll/᩶ۧᩴ;->ۧ(C)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [Ll/ۢᩳܿ;

    .line 52
    invoke-static {v0}, Ll/᩵֡ᩴ;->֫([Ljava/lang/Object;)Ll/᩵֡ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۡᩳܿ;->ܽ:Ll/᩵֡ᩴ;

    .line 53
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۡᩳܿ;->ۧ:Ljava/util/HashSet;

    .line 54
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۡᩳܿ;->֫:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(ILjava/lang/CharSequence;)I
    .locals 2

    .line 250
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lt p0, v0, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    return p0

    .line 253
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p0, v0, :cond_2

    .line 254
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 266
    sget-object v1, Ll/ۡᩳܿ;->ᩳ:Ll/᩶ۧᩴ;

    invoke-virtual {v1, v0}, Ll/᩶ۧᩴ;->᩻(C)Z

    move-result v0

    if-eqz v0, :cond_1

    return p0

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 258
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    return p0
.end method

.method public static ֫(Ll/۟᩺ᩳ;I)I
    .locals 0

    .line 196
    invoke-static {p1, p0}, Ll/ۡᩳܿ;->֫(ILjava/lang/CharSequence;)I

    move-result p0

    return p0
.end method

.method public static ֫(IILjava/lang/CharSequence;)Ljava/util/ArrayList;
    .locals 4

    sub-int v0, p1, p0

    .line 274
    div-int/lit8 v0, v0, 0x5

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 275
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz p2, :cond_4

    if-lt p0, p1, :cond_0

    goto :goto_3

    :cond_0
    :goto_0
    if-ge p0, p1, :cond_4

    .line 284
    :goto_1
    sget-object v0, Ll/ۡᩳܿ;->ᩳ:Ll/᩶ۧᩴ;

    if-ge p0, p1, :cond_1

    invoke-interface {p2, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 266
    invoke-virtual {v0, v2}, Ll/᩶ۧᩴ;->᩻(C)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    :cond_1
    if-lt p0, p1, :cond_2

    goto :goto_3

    :cond_2
    move v2, p0

    :goto_2
    if-ge v2, p1, :cond_3

    .line 296
    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 266
    invoke-virtual {v0, v3}, Ll/᩶ۧᩴ;->᩻(C)Z

    move-result v3

    if-nez v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 301
    :cond_3
    invoke-interface {p2, p0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 302
    new-instance v3, Ll/ۢᩳܿ;

    invoke-direct {v3, v0, p0, v2}, Ll/ۢᩳܿ;-><init>(Ljava/lang/String;II)V

    .line 303
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move p0, v2

    goto :goto_0

    :cond_4
    :goto_3
    return-object v1
.end method

.method public static ۧ(ILjava/lang/CharSequence;)I
    .locals 2

    if-gtz p0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    if-ltz p0, :cond_1

    .line 239
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 266
    sget-object v1, Ll/ۡᩳܿ;->ᩳ:Ll/᩶ۧᩴ;

    invoke-virtual {v1, v0}, Ll/᩶ۧᩴ;->᩻(C)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(ILjava/lang/CharSequence;)Ljava/lang/String;
    .locals 3

    .line 180
    invoke-static {p0, p1}, Ll/ۡᩳܿ;->ۧ(ILjava/lang/CharSequence;)I

    move-result v0

    sub-int v1, p0, v0

    const/16 v2, 0x64

    if-le v1, v2, :cond_0

    const-string p0, ""

    return-object p0

    .line 184
    :cond_0
    invoke-interface {p1, v0, p0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(ILjava/lang/CharSequence;)Ljava/lang/String;
    .locals 3

    .line 188
    invoke-static {p0, p1}, Ll/ۡᩳܿ;->֫(ILjava/lang/CharSequence;)I

    move-result v0

    sub-int v1, v0, p0

    const/16 v2, 0x64

    if-le v1, v2, :cond_0

    const-string p0, ""

    return-object p0

    .line 192
    :cond_0
    invoke-interface {p1, p0, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۢᩳܿ;)I
    .locals 1

    .line 318
    iget-object v0, p0, Ll/ۡᩳܿ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ᩳܿ;

    if-eqz p1, :cond_0

    .line 319
    iget p1, p1, Ll/᩷ᩳܿ;->֫:I

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 314
    iget-object v0, p0, Ll/ۡᩳܿ;->ۧ:Ljava/util/HashSet;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(IIILjava/lang/CharSequence;)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    .line 83
    invoke-static {v1, v4}, Ll/ۡᩳܿ;->ۧ(ILjava/lang/CharSequence;)I

    move-result v5

    add-int v6, v1, v3

    .line 84
    invoke-static {v6, v4}, Ll/ۡᩳܿ;->֫(ILjava/lang/CharSequence;)I

    move-result v6

    add-int/2addr v1, v2

    .line 203
    iget-object v7, v0, Ll/ۡᩳܿ;->ܽ:Ll/᩵֡ᩴ;

    invoke-virtual {v7}, Ll/᩵֡ᩴ;->᩷()[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ll/ۢᩳܿ;

    .line 204
    invoke-virtual {v7}, Ll/᩵֡ᩴ;->size()I

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v12, v9

    :goto_0
    if-ge v11, v12, :cond_1

    const/4 v13, 0x2

    .line 211
    invoke-static {v12, v11, v13, v11}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v13

    .line 212
    aget-object v14, v8, v13

    invoke-static {v14}, Ll/ۢᩳܿ;->֫(Ll/ۢᩳܿ;)I

    move-result v14

    if-ge v14, v5, :cond_0

    add-int/lit8 v11, v13, 0x1

    goto :goto_0

    :cond_0
    move v12, v13

    goto :goto_0

    :cond_1
    if-ge v11, v9, :cond_3

    .line 221
    aget-object v8, v8, v11

    invoke-static {v8}, Ll/ۢᩳܿ;->֫(Ll/ۢᩳܿ;)I

    move-result v8

    if-gt v8, v1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v11, v11, 0x1

    neg-int v11, v11

    goto :goto_1

    :cond_3
    add-int/lit8 v9, v9, 0x1

    neg-int v11, v9

    .line 89
    :goto_1
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 94
    iget-object v9, v0, Ll/ۡᩳܿ;->֫:Ljava/util/HashMap;

    if-ltz v11, :cond_9

    .line 96
    invoke-virtual {v7}, Ll/᩵֡ᩴ;->᩷()[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Ll/ۢᩳܿ;

    .line 97
    invoke-virtual {v7}, Ll/᩵֡ᩴ;->size()I

    move-result v13

    move v14, v11

    :goto_2
    if-ge v14, v13, :cond_8

    .line 98
    aget-object v15, v12, v14

    move-object/from16 p1, v12

    .line 99
    invoke-static {v15}, Ll/ۢᩳܿ;->֫(Ll/ۢᩳܿ;)I

    move-result v12

    if-le v12, v1, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 103
    invoke-virtual {v15}, Ll/ۢᩳܿ;->ܽ()Z

    move-result v12

    if-eqz v12, :cond_5

    .line 104
    invoke-virtual {v8, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 106
    :cond_5
    invoke-virtual {v9, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ᩳܿ;

    if-eqz v12, :cond_7

    move/from16 v16, v1

    .line 108
    iget v1, v12, Ll/᩷ᩳܿ;->֫:I

    move/from16 v17, v10

    const/4 v10, 0x1

    if-gt v1, v10, :cond_6

    .line 109
    invoke-virtual {v9, v15}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    add-int/lit8 v1, v1, -0x1

    .line 400
    iput v1, v12, Ll/᩷ᩳܿ;->֫:I

    goto :goto_3

    :cond_7
    move/from16 v16, v1

    move/from16 v17, v10

    :goto_3
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v12, p1

    move/from16 v1, v16

    move/from16 v10, v17

    goto :goto_2

    :cond_8
    :goto_4
    if-lez v10, :cond_9

    add-int/2addr v10, v11

    .line 116
    invoke-virtual {v7, v11, v10}, Ll/᩵֡ᩴ;->֫(II)V

    :cond_9
    if-ltz v11, :cond_a

    goto :goto_5

    :cond_a
    neg-int v1, v11

    add-int/lit8 v11, v1, -0x1

    :goto_5
    if-eq v2, v3, :cond_b

    sub-int v1, v3, v2

    .line 125
    invoke-virtual {v7}, Ll/᩵֡ᩴ;->᩷()[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ۢᩳܿ;

    .line 126
    invoke-virtual {v7}, Ll/᩵֡ᩴ;->size()I

    move-result v3

    move v10, v11

    :goto_6
    if-ge v10, v3, :cond_b

    .line 127
    aget-object v12, v2, v10

    invoke-virtual {v12, v1}, Ll/ۢᩳܿ;->֫(I)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    .line 132
    :cond_b
    invoke-interface/range {p4 .. p4}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iget-object v2, v0, Ll/ۡᩳܿ;->ۧ:Ljava/util/HashSet;

    if-ge v5, v1, :cond_d

    .line 133
    invoke-interface/range {p4 .. p4}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-ge v5, v1, :cond_d

    .line 135
    invoke-static {v5, v1, v4}, Ll/ۡᩳܿ;->֫(IILjava/lang/CharSequence;)Ljava/util/ArrayList;

    move-result-object v1

    .line 136
    invoke-virtual {v7, v11, v1}, Ll/᩵֡ᩴ;->addAll(ILjava/util/Collection;)Z

    .line 137
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢᩳܿ;

    .line 138
    new-instance v4, Ll/ۜᩳܿ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v9, v3, v4}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ᩳܿ;

    .line 396
    iget v5, v4, Ll/᩷ᩳܿ;->֫:I

    const/4 v6, 0x1

    add-int/2addr v5, v6

    iput v5, v4, Ll/᩷ᩳܿ;->֫:I

    .line 139
    invoke-virtual {v3}, Ll/ۢᩳܿ;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_c

    if-ne v5, v6, :cond_c

    invoke-virtual {v8, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    .line 141
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 149
    :cond_d
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢᩳܿ;

    .line 150
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    .line 152
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_f
    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 5

    .line 60
    iget-object v0, p0, Ll/ۡᩳܿ;->ܽ:Ll/᩵֡ᩴ;

    invoke-virtual {v0}, Ll/᩵֡ᩴ;->clear()V

    .line 61
    iget-object v1, p0, Ll/ۡᩳܿ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 62
    iget-object v2, p0, Ll/ۡᩳܿ;->֫:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 64
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v4, v3, p1}, Ll/ۡᩳܿ;->֫(IILjava/lang/CharSequence;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ᩳᩴᩴ;->addAll(Ljava/util/Collection;)Z

    .line 151
    invoke-virtual {v0, v4}, Ll/᩵֡ᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object p1

    .line 65
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢᩳܿ;

    .line 66
    new-instance v3, Ll/ۜᩳܿ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, v0, v3}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ᩳܿ;

    .line 396
    iget v4, v3, Ll/᩷ᩳܿ;->֫:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v3, Ll/᩷ᩳܿ;->֫:I

    .line 67
    invoke-virtual {v0}, Ll/ۢᩳܿ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 68
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method
