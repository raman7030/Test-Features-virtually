.class public final Ll/ܶۘܺ;
.super Ll/ۗۘܺ;
.source "9BH0"


# instance fields
.field public final ۜ:Ljava/util/ArrayList;

.field public final ۡ:Ljava/util/BitSet;

.field public final ۢ:Ljava/util/BitSet;

.field public final ܳ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/util/ArrayList;

.field public final ܿ:Ll/۠ۖܺ;

.field public final ᩳ:Ljava/util/TreeMap;

.field public final ᩷:Ljava/util/BitSet;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;Ll/᩹ۘܺ;)V
    .locals 2

    .line 158
    invoke-direct {p0, p1, p2}, Ll/ۗۘܺ;-><init>(Ll/᩷ۘܺ;Ll/᩹ۘܺ;)V

    .line 160
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۜ()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Ll/ܶۘܺ;->ۢ:Ljava/util/BitSet;

    .line 162
    new-instance v0, Ll/۠ۖܺ;

    .line 163
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۜ()I

    move-result v1

    invoke-direct {v0, p2, v1}, Ll/۠ۖܺ;-><init>(Ll/᩹ۘܺ;I)V

    iput-object v0, p0, Ll/ܶۘܺ;->ܿ:Ll/۠ۖܺ;

    .line 173
    invoke-virtual {p1}, Ll/᩷ۘܺ;->᩻()I

    move-result p1

    iput p1, p0, Ll/ܶۘܺ;->᩻:I

    .line 175
    new-instance p2, Ljava/util/BitSet;

    mul-int/lit8 v0, p1, 0x2

    invoke-direct {p2, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p2, p0, Ll/ܶۘܺ;->᩷:Ljava/util/BitSet;

    const/4 v1, 0x0

    .line 176
    invoke-virtual {p2, v1, p1}, Ljava/util/BitSet;->set(II)V

    .line 177
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Ll/ܶۘܺ;->ۡ:Ljava/util/BitSet;

    .line 178
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Ll/ܶۘܺ;->ᩳ:Ljava/util/TreeMap;

    .line 179
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܶۘܺ;->ܳ:Ljava/util/ArrayList;

    .line 180
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܶۘܺ;->ܽ:Ljava/util/ArrayList;

    .line 181
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܶۘܺ;->ۜ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(II)I
    .locals 2

    .line 448
    sget-object v0, Ll/֨ۘܺ;->ۙ:Ll/֨ۘܺ;

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    .line 451
    iget v0, p0, Ll/ܶۘܺ;->᩻:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    .line 452
    sget-object v0, Ll/֨ۘܺ;->᩹:Ll/֨ۘܺ;

    goto :goto_0

    .line 454
    :cond_0
    sget-object v0, Ll/֨ۘܺ;->᩶:Ll/֨ۘܺ;

    .line 469
    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۘܺ;->֫(IILl/֨ۘܺ;)I

    move-result p1

    return p1
.end method

.method private ֫(IILl/֨ۘܺ;)I
    .locals 3

    .line 481
    iget-object v0, p0, Ll/ܶۘܺ;->᩷:Ljava/util/BitSet;

    invoke-virtual {p3, v0, p1}, Ll/֨ۘܺ;->֫(Ljava/util/BitSet;I)I

    move-result p1

    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-ge v1, p2, :cond_0

    add-int v2, p1, v1

    .line 486
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    if-ne v1, p2, :cond_1

    return p1

    :cond_1
    add-int/2addr p1, v1

    .line 494
    invoke-virtual {p3, v0, p1}, Ll/֨ۘܺ;->֫(Ljava/util/BitSet;I)I

    move-result p1

    goto :goto_0
.end method

.method private ֫(ILl/۫ۖܺ;[ILjava/util/BitSet;)I
    .locals 15

    move-object v0, p0

    .line 1060
    invoke-virtual/range {p2 .. p2}, Ll/۫ۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v1

    .line 1061
    invoke-virtual {v1}, Ll/ܿᩴܺ;->size()I

    move-result v2

    .line 1063
    invoke-virtual/range {p2 .. p2}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽۘܺ;->ᩳ()Ll/ۢᩴܺ;

    move-result-object v3

    .line 1123
    new-instance v4, Ll/᩶ۡܺ;

    invoke-interface {v3}, Ll/ۢᩴܺ;->elements()I

    move-result v5

    .line 105
    invoke-direct {v4, v5}, Ll/ܿᩴܺ;-><init>(I)V

    .line 1125
    invoke-interface {v3}, Ll/ۢᩴܺ;->iterator()Ll/ۜᩴܺ;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 1128
    :goto_0
    invoke-interface {v3}, Ll/ۜᩴܺ;->hasNext()Z

    move-result v7

    iget-object v8, v0, Ll/ۗۘܺ;->ۧ:Ll/᩷ۘܺ;

    if-eqz v7, :cond_1

    add-int/lit8 v7, v6, 0x1

    .line 1129
    invoke-interface {v3}, Ll/ۜᩴܺ;->next()I

    move-result v9

    .line 104
    invoke-virtual {v8, v9}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v8

    if-nez v8, :cond_0

    const/4 v8, 0x0

    goto :goto_1

    .line 106
    :cond_0
    invoke-virtual {v8}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v8

    .line 1129
    :goto_1
    invoke-virtual {v4, v6, v8}, Ll/ܿᩴܺ;->֫(ILl/᩸ۡܺ;)V

    move v6, v7

    goto :goto_0

    .line 1067
    :cond_1
    new-instance v3, Ljava/util/BitSet;

    invoke-virtual {v8}, Ll/᩷ۘܺ;->ۜ()I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/BitSet;-><init>(I)V

    const/4 v6, 0x0

    move/from16 v5, p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_2
    if-ge v6, v2, :cond_8

    .line 1070
    invoke-virtual {v1, v6}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v8

    .line 1071
    invoke-virtual {v8}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v9

    .line 1072
    aget v10, p3, v6

    if-eqz v6, :cond_2

    add-int/lit8 v11, v6, -0x1

    .line 1075
    aget v11, p3, v11

    add-int/2addr v5, v11

    .line 1078
    :cond_2
    iget-object v11, v0, Ll/ܶۘܺ;->ۢ:Ljava/util/BitSet;

    invoke-virtual {v11, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    iget-object v13, v0, Ll/ܶۘܺ;->ܿ:Ll/۠ۖܺ;

    if-eqz v12, :cond_3

    .line 1079
    invoke-virtual {v13, v9}, Ll/ܽۖܺ;->֫(I)I

    move-result v12

    if-ne v12, v5, :cond_3

    goto :goto_4

    :cond_3
    move v12, v5

    :goto_3
    add-int v14, v5, v10

    if-ge v12, v14, :cond_5

    .line 420
    iget-object v14, v0, Ll/ܶۘܺ;->᩷:Ljava/util/BitSet;

    invoke-virtual {v14, v12}, Ljava/util/BitSet;->get(I)Z

    move-result v14

    if-eqz v14, :cond_4

    goto :goto_6

    :cond_4
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 1085
    :cond_5
    invoke-virtual {v11, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v11

    if-nez v11, :cond_6

    .line 1086
    invoke-direct {p0, v5, v8}, Ll/ܶۘܺ;->ۧ(ILl/᩸ۡܺ;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 1087
    invoke-virtual {v3, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-nez v8, :cond_6

    :goto_4
    add-int/2addr v7, v10

    move-object/from16 v8, p4

    goto :goto_5

    .line 1090
    :cond_6
    invoke-virtual {v13, v4, v5, v10}, Ll/۠ۖܺ;->֫(Ll/᩶ۡܺ;II)Z

    move-result v8

    if-nez v8, :cond_7

    .line 1091
    invoke-virtual {v13, v1, v5, v10}, Ll/۠ۖܺ;->֫(Ll/᩶ۡܺ;II)Z

    move-result v8

    if-nez v8, :cond_7

    move-object/from16 v8, p4

    .line 1104
    invoke-virtual {v8, v6}, Ljava/util/BitSet;->set(I)V

    .line 1110
    :goto_5
    invoke-virtual {v3, v9}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_7
    :goto_6
    const/4 v1, -0x1

    return v1

    :cond_8
    return v7
.end method

.method public static bridge synthetic ֫(Ll/ܶۘܺ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۘܺ;->ܽ:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ֫(ILl/᩸ۡܺ;)V
    .locals 4

    .line 801
    invoke-virtual {p2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 804
    iget-object v1, p0, Ll/ܶۘܺ;->ۢ:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-direct {p0, p1, p2}, Ll/ܶۘܺ;->ۧ(ILl/᩸ۡܺ;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 814
    invoke-virtual {p2}, Ll/᩸ۡܺ;->ۧ()I

    move-result v2

    .line 815
    iget-object v3, p0, Ll/ܶۘܺ;->ܿ:Ll/۠ۖܺ;

    invoke-virtual {p2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p2

    invoke-virtual {v3, p2, p1, v2}, Ll/۠ۖܺ;->֫(III)V

    .line 816
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    .line 817
    iget-object p2, p0, Ll/ܶۘܺ;->ۡ:Ljava/util/BitSet;

    add-int/2addr v2, p1

    invoke-virtual {p2, p1, v2}, Ljava/util/BitSet;->set(II)V

    return-void

    .line 805
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "attempt to add invalid register mapping"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(I)Z
    .locals 1

    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ֫(IILjava/util/ArrayList;Z)Z
    .locals 5

    .line 362
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۡܺ;

    .line 363
    iget-object v3, p0, Ll/ܶۘܺ;->ۢ:Ljava/util/BitSet;

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 368
    :cond_1
    invoke-direct {p0, v1, p1, p2}, Ll/ܶۘܺ;->֫(Ll/᩸ۡܺ;II)Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-eqz v3, :cond_0

    if-eqz p4, :cond_0

    .line 373
    invoke-virtual {v1}, Ll/᩸ۡܺ;->ۧ()I

    move-result v1

    .line 407
    iget-object v3, p0, Ll/ܶۘܺ;->᩷:Ljava/util/BitSet;

    add-int/2addr v1, p1

    invoke-virtual {v3, p1, v1, v2}, Ljava/util/BitSet;->set(IIZ)V

    goto :goto_0

    :cond_4
    xor-int/lit8 p1, v0, 0x1

    return p1
.end method

.method private ֫(Ll/᩸ۡܺ;II)Z
    .locals 1

    .line 390
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ۧ()I

    move-result v0

    if-gt v0, p3, :cond_0

    iget-object p3, p0, Ll/ܶۘܺ;->ۢ:Ljava/util/BitSet;

    .line 391
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/util/BitSet;->get(I)Z

    move-result p3

    if-nez p3, :cond_0

    .line 392
    invoke-direct {p0, p2, p1}, Ll/ܶۘܺ;->ۧ(ILl/᩸ۡܺ;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 393
    invoke-direct {p0, p2, p1}, Ll/ܶۘܺ;->֫(ILl/᩸ۡܺ;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ(I)I
    .locals 2

    .line 292
    iget-object v0, p0, Ll/ۗۘܺ;->ۧ:Ll/᩷ۘܺ;

    invoke-virtual {v0, p1}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 297
    :cond_0
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 300
    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 301
    invoke-virtual {p1}, Ll/ܳۘܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object p1

    check-cast p1, Ll/ܳۡܺ;

    .line 302
    invoke-virtual {p1}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {p1}, Ll/֡ܺܺ;->ᩴ()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public static bridge synthetic ۧ(Ll/ܶۘܺ;)Ljava/util/TreeMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۘܺ;->ᩳ:Ljava/util/TreeMap;

    return-object p0
.end method

.method private ۧ(ILl/᩸ۡܺ;)Z
    .locals 2

    .line 700
    invoke-virtual {p2}, Ll/᩸ۡܺ;->ۧ()I

    move-result v0

    .line 717
    iget v1, p0, Ll/ܶۘܺ;->᩻:I

    if-ge p1, v1, :cond_0

    add-int/2addr v0, p1

    if-le v0, v1, :cond_0

    goto :goto_0

    .line 702
    :cond_0
    iget-object v0, p0, Ll/ܶۘܺ;->ܿ:Ll/۠ۖܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    invoke-virtual {p2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    invoke-virtual {p2}, Ll/᩸ۡܺ;->ۧ()I

    move-result p2

    invoke-virtual {v0, v1, p1, p2}, Ll/۠ۖܺ;->ۧ(III)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ܽ(Ll/ܶۘܺ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۘܺ;->ܳ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܶۘܺ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۘܺ;->ۜ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/۠ۖܺ;
    .locals 22

    move-object/from16 v0, p0

    .line 726
    new-instance v1, Ll/ᩴۘܺ;

    invoke-direct {v1, v0}, Ll/ᩴۘܺ;-><init>(Ll/ܶۘܺ;)V

    iget-object v2, v0, Ll/ۗۘܺ;->ۧ:Ll/᩷ۘܺ;

    invoke-virtual {v2, v1}, Ll/᩷ۘܺ;->֫(Ll/ܿۘܺ;)V

    .line 255
    iget-object v1, v0, Ll/ܶۘܺ;->ᩳ:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    .line 256
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, -0x1

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v6, :cond_1

    .line 262
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩸ۡܺ;

    .line 263
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v9

    .line 265
    invoke-direct {v0, v9}, Ll/ܶۘܺ;->ۧ(I)I

    move-result v9

    if-ltz v9, :cond_0

    .line 268
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ۧ()I

    move-result v6

    .line 269
    invoke-direct {v0, v9, v7}, Ll/ܶۘܺ;->֫(ILl/᩸ۡܺ;)V

    move v7, v9

    goto :goto_2

    :cond_0
    add-int/lit8 v8, v8, 0x1

    move v7, v9

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_2
    if-gez v7, :cond_2

    goto :goto_0

    .line 280
    :cond_2
    invoke-direct {v0, v7, v6, v4, v5}, Ll/ܶۘܺ;->֫(IILjava/util/ArrayList;Z)Z

    goto :goto_0

    .line 531
    :cond_3
    invoke-virtual {v2}, Ll/᩷ۘܺ;->ۜ()I

    move-result v3

    const/4 v4, 0x0

    .line 533
    :goto_3
    iget-object v5, v0, Ll/ܶۘܺ;->ۢ:Ljava/util/BitSet;

    if-ge v4, v3, :cond_7

    .line 534
    invoke-virtual {v5, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_5

    .line 539
    :cond_4
    invoke-direct {v0, v4}, Ll/ܶۘܺ;->ۧ(I)I

    move-result v5

    .line 104
    invoke-virtual {v2, v4}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v6

    if-nez v6, :cond_5

    const/4 v6, 0x0

    goto :goto_4

    .line 106
    :cond_5
    invoke-virtual {v6}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v6

    :goto_4
    if-ltz v5, :cond_6

    .line 543
    invoke-direct {v0, v5, v6}, Ll/ܶۘܺ;->֫(ILl/᩸ۡܺ;)V

    :cond_6
    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 552
    :cond_7
    iget-object v3, v0, Ll/ܶۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    iget-object v6, v0, Ll/ܶۘܺ;->ܿ:Ll/۠ۖܺ;

    iget v7, v0, Ll/ܶۘܺ;->᩻:I

    if-eqz v4, :cond_22

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۫ۖܺ;

    .line 887
    invoke-virtual {v4}, Ll/۫ۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v8

    .line 888
    invoke-virtual {v8}, Ll/ܿᩴܺ;->size()I

    move-result v9

    .line 890
    new-array v10, v9, [I

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_7
    if-ge v12, v9, :cond_8

    .line 895
    invoke-virtual {v8, v12}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v13

    invoke-virtual {v13}, Ll/᩸ۡܺ;->ۧ()I

    move-result v13

    .line 896
    aput v13, v10, v12

    add-int/2addr v11, v13

    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_8
    const/high16 v12, -0x80000000

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, -0x1

    const/16 v16, 0x0

    :goto_8
    if-ge v13, v9, :cond_10

    .line 914
    invoke-virtual {v8, v13}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v17

    move-object/from16 v18, v3

    invoke-virtual/range {v17 .. v17}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    if-eqz v13, :cond_9

    add-int/lit8 v17, v13, -0x1

    .line 917
    aget v17, v10, v17

    sub-int v14, v14, v17

    .line 919
    :cond_9
    invoke-virtual {v5, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v17

    if-nez v17, :cond_b

    :cond_a
    move/from16 v17, v14

    :goto_9
    move/from16 v19, v15

    goto :goto_a

    .line 923
    :cond_b
    invoke-virtual {v6, v3}, Ll/ܽۖܺ;->֫(I)I

    move-result v3

    add-int/2addr v3, v14

    if-ltz v3, :cond_a

    move/from16 v17, v14

    if-ge v3, v7, :cond_c

    add-int v14, v3, v11

    if-le v14, v7, :cond_c

    goto :goto_9

    .line 929
    :cond_c
    new-instance v14, Ljava/util/BitSet;

    invoke-direct {v14, v9}, Ljava/util/BitSet;-><init>(I)V

    move/from16 v19, v15

    .line 932
    invoke-direct {v0, v3, v4, v10, v14}, Ll/ܶۘܺ;->֫(ILl/۫ۖܺ;[ILjava/util/BitSet;)I

    move-result v15

    if-gez v15, :cond_d

    goto :goto_a

    .line 939
    :cond_d
    invoke-virtual {v14}, Ljava/util/BitSet;->cardinality()I

    move-result v20

    move/from16 v21, v3

    sub-int v3, v15, v20

    if-le v3, v12, :cond_e

    move v12, v3

    move-object/from16 v16, v14

    move/from16 v19, v21

    :cond_e
    if-ne v15, v11, :cond_f

    move/from16 v15, v19

    goto :goto_b

    :cond_f
    :goto_a
    move/from16 v15, v19

    add-int/lit8 v13, v13, 0x1

    move/from16 v14, v17

    move-object/from16 v3, v18

    goto :goto_8

    :cond_10
    move-object/from16 v18, v3

    move/from16 v19, v15

    :goto_b
    const/4 v3, -0x1

    if-ne v15, v3, :cond_19

    .line 960
    new-instance v3, Ljava/util/BitSet;

    invoke-direct {v3, v9}, Ljava/util/BitSet;-><init>(I)V

    .line 994
    sget-object v6, Ll/֨ۘܺ;->ۙ:Ll/֨ۘܺ;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_c
    if-ge v12, v9, :cond_13

    move-object/from16 v16, v6

    .line 1000
    aget v6, v10, v12

    move/from16 v17, v9

    const/4 v9, 0x2

    if-ne v6, v9, :cond_12

    and-int/lit8 v6, v15, 0x1

    if-nez v6, :cond_11

    add-int/lit8 v14, v14, 0x1

    goto :goto_d

    :cond_11
    add-int/lit8 v13, v13, 0x1

    :goto_d
    add-int/lit8 v15, v15, 0x2

    goto :goto_e

    :cond_12
    add-int/lit8 v15, v15, 0x1

    :goto_e
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v6, v16

    move/from16 v9, v17

    goto :goto_c

    :cond_13
    move-object/from16 v16, v6

    if-le v13, v14, :cond_15

    and-int/lit8 v6, v7, 0x1

    if-nez v6, :cond_14

    .line 1015
    sget-object v6, Ll/֨ۘܺ;->᩶:Ll/֨ۘܺ;

    goto :goto_f

    .line 1017
    :cond_14
    sget-object v6, Ll/֨ۘܺ;->᩹:Ll/֨ۘܺ;

    goto :goto_f

    :cond_15
    if-lez v14, :cond_17

    and-int/lit8 v6, v7, 0x1

    if-nez v6, :cond_16

    .line 1021
    sget-object v6, Ll/֨ۘܺ;->᩹:Ll/֨ۘܺ;

    goto :goto_f

    .line 1023
    :cond_16
    sget-object v6, Ll/֨ۘܺ;->᩶:Ll/֨ۘܺ;

    goto :goto_f

    :cond_17
    move-object/from16 v6, v16

    .line 1030
    :goto_f
    invoke-direct {v0, v7, v11, v6}, Ll/ܶۘܺ;->֫(IILl/֨ۘܺ;)I

    move-result v15

    .line 1032
    invoke-direct {v0, v15, v4, v10, v3}, Ll/ܶۘܺ;->֫(ILl/۫ۖܺ;[ILjava/util/BitSet;)I

    move-result v7

    if-ltz v7, :cond_18

    goto :goto_10

    :cond_18
    add-int/lit8 v7, v15, 0x1

    .line 1038
    invoke-virtual {v3}, Ljava/util/BitSet;->clear()V

    goto :goto_f

    :cond_19
    move-object/from16 v3, v16

    :goto_10
    const/4 v6, 0x0

    .line 970
    invoke-virtual {v3, v6}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v6

    :goto_11
    if-ltz v6, :cond_1a

    .line 972
    invoke-virtual {v8, v6}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v7

    invoke-virtual {v0, v4, v7}, Ll/ۗۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)Ll/᩸ۡܺ;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Ll/۫ۖܺ;->֫(ILl/᩸ۡܺ;)V

    add-int/lit8 v6, v6, 0x1

    .line 971
    invoke-virtual {v3, v6}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v6

    goto :goto_11

    .line 831
    :cond_1a
    invoke-virtual {v4}, Ll/۫ۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v3

    .line 832
    invoke-virtual {v3}, Ll/ܿᩴܺ;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_12
    if-ge v6, v4, :cond_21

    .line 836
    invoke-virtual {v3, v6}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v7

    .line 837
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v8

    .line 838
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ۧ()I

    move-result v9

    add-int v10, v15, v9

    .line 842
    invoke-virtual {v5, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v11

    if-eqz v11, :cond_1b

    goto :goto_16

    .line 1143
    :cond_1b
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_1c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1e

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 1144
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_1d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/᩸ۡܺ;

    .line 1145
    invoke-virtual {v14}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v14

    if-ne v14, v8, :cond_1d

    .line 1146
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩴۡܺ;

    goto :goto_13

    :cond_1e
    const/4 v8, 0x0

    .line 847
    :goto_13
    invoke-direct {v0, v15, v7}, Ll/ܶۘܺ;->֫(ILl/᩸ۡܺ;)V

    if-eqz v8, :cond_20

    .line 407
    iget-object v7, v0, Ll/ܶۘܺ;->᩷:Ljava/util/BitSet;

    const/4 v11, 0x1

    invoke-virtual {v7, v15, v10, v11}, Ljava/util/BitSet;->set(IIZ)V

    .line 852
    invoke-virtual {v1, v8}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    .line 854
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v11, 0x0

    :goto_14
    if-ge v11, v8, :cond_20

    .line 861
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩸ۡܺ;

    .line 862
    invoke-virtual {v12}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v13

    .line 865
    invoke-virtual {v3, v13}, Ll/᩶ۡܺ;->ᩳ(I)I

    move-result v13

    const/4 v14, -0x1

    if-eq v14, v13, :cond_1f

    goto :goto_15

    .line 870
    :cond_1f
    invoke-direct {v0, v12, v15, v9}, Ll/ܶۘܺ;->֫(Ll/᩸ۡܺ;II)Z

    :goto_15
    add-int/lit8 v11, v11, 0x1

    goto :goto_14

    :cond_20
    :goto_16
    add-int/lit8 v6, v6, 0x1

    move v15, v10

    goto/16 :goto_12

    :cond_21
    move-object/from16 v3, v18

    goto/16 :goto_6

    .line 316
    :cond_22
    invoke-virtual {v1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    const/4 v4, 0x0

    move v8, v7

    .line 324
    :cond_23
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x1

    const/4 v11, 0x0

    :goto_18
    if-ge v11, v9, :cond_25

    .line 326
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩸ۡܺ;

    .line 327
    invoke-virtual {v12}, Ll/᩸ۡܺ;->ۧ()I

    move-result v13

    .line 328
    invoke-virtual {v12}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    if-nez v12, :cond_24

    if-le v13, v10, :cond_24

    move v10, v13

    :cond_24
    add-int/lit8 v11, v11, 0x1

    goto :goto_18

    .line 448
    :cond_25
    sget-object v9, Ll/֨ۘܺ;->ۙ:Ll/֨ۘܺ;

    const/4 v11, 0x2

    if-ne v10, v11, :cond_27

    and-int/lit8 v9, v7, 0x1

    if-nez v9, :cond_26

    .line 452
    sget-object v9, Ll/֨ۘܺ;->᩹:Ll/֨ۘܺ;

    goto :goto_19

    .line 454
    :cond_26
    sget-object v9, Ll/֨ۘܺ;->᩶:Ll/֨ۘܺ;

    .line 509
    :cond_27
    :goto_19
    iget-object v11, v0, Ll/ܶۘܺ;->ۡ:Ljava/util/BitSet;

    invoke-virtual {v9, v11, v8}, Ll/֨ۘܺ;->֫(Ljava/util/BitSet;I)I

    move-result v8

    :goto_1a
    const/4 v12, 0x1

    :goto_1b
    if-ge v12, v10, :cond_28

    add-int v13, v8, v12

    .line 514
    invoke-virtual {v11, v13}, Ljava/util/BitSet;->get(I)Z

    move-result v13

    if-nez v13, :cond_28

    add-int/lit8 v12, v12, 0x1

    goto :goto_1b

    :cond_28
    if-ne v12, v10, :cond_2c

    .line 683
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_29
    :goto_1c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩸ۡܺ;

    .line 684
    invoke-virtual {v11}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    if-eqz v12, :cond_2a

    goto :goto_1c

    .line 685
    :cond_2a
    invoke-direct {v0, v8, v11}, Ll/ܶۘܺ;->ۧ(ILl/᩸ۡܺ;)Z

    move-result v11

    if-nez v11, :cond_29

    goto :goto_1d

    :cond_2b
    const/4 v4, 0x1

    .line 336
    invoke-direct {v0, v8, v10, v3, v4}, Ll/ܶۘܺ;->֫(IILjava/util/ArrayList;Z)Z

    move-result v4

    :goto_1d
    add-int/lit8 v8, v8, 0x1

    if-eqz v4, :cond_23

    goto :goto_17

    :cond_2c
    add-int/2addr v8, v12

    .line 522
    invoke-virtual {v9, v11, v8}, Ll/֨ۘܺ;->֫(Ljava/util/BitSet;I)I

    move-result v8

    goto :goto_1a

    .line 563
    :cond_2d
    iget-object v1, v0, Ll/ܶۘܺ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2e
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_36

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ۖܺ;

    .line 564
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v4

    .line 565
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v8

    .line 566
    invoke-virtual {v3}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽۘܺ;->᩻()Ljava/util/BitSet;

    move-result-object v3

    .line 569
    invoke-virtual {v3}, Ljava/util/BitSet;->cardinality()I

    move-result v9

    const/4 v10, 0x1

    if-eq v9, v10, :cond_2f

    goto :goto_1e

    .line 574
    :cond_2f
    invoke-virtual {v2}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v9

    const/4 v11, 0x0

    invoke-virtual {v3, v11}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۘܺ;

    .line 575
    invoke-virtual {v3}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v3

    .line 0
    invoke-static {v3, v10}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v3

    .line 581
    check-cast v3, Ll/ܳۘܺ;

    .line 582
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۗۡܺ;->ᩳ()I

    move-result v9

    const/16 v10, 0x2b

    if-eq v9, v10, :cond_30

    goto :goto_1e

    .line 586
    :cond_30
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v9

    .line 587
    invoke-virtual {v9}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v10

    .line 594
    invoke-virtual {v9}, Ll/᩸ۡܺ;->ۧ()I

    move-result v11

    .line 595
    invoke-virtual {v5, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    .line 596
    invoke-virtual {v5, v10}, Ljava/util/BitSet;->get(I)Z

    move-result v13

    xor-int/lit8 v14, v13, 0x1

    and-int/2addr v14, v12

    if-eqz v14, :cond_31

    .line 598
    invoke-virtual {v6, v8}, Ll/ܽۖܺ;->֫(I)I

    move-result v13

    .line 599
    invoke-direct {v0, v9, v13, v11}, Ll/ܶۘܺ;->֫(Ll/᩸ۡܺ;II)Z

    move-result v13

    :cond_31
    xor-int/lit8 v14, v12, 0x1

    and-int/2addr v14, v13

    if-eqz v14, :cond_32

    .line 602
    invoke-virtual {v6, v10}, Ll/ܽۖܺ;->֫(I)I

    move-result v12

    .line 603
    invoke-direct {v0, v4, v12, v11}, Ll/ܶۘܺ;->֫(Ll/᩸ۡܺ;II)Z

    move-result v12

    :cond_32
    if-eqz v12, :cond_33

    if-nez v13, :cond_34

    .line 608
    :cond_33
    invoke-direct {v0, v7, v11}, Ll/ܶۘܺ;->֫(II)I

    move-result v12

    .line 609
    new-instance v13, Ljava/util/ArrayList;

    const/4 v14, 0x2

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 611
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 612
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1f
    const/4 v4, 0x0

    .line 614
    invoke-direct {v0, v12, v11, v13, v4}, Ll/ܶۘܺ;->֫(IILjava/util/ArrayList;Z)Z

    move-result v4

    if-nez v4, :cond_34

    add-int/lit8 v12, v12, 0x1

    .line 615
    invoke-direct {v0, v12, v11}, Ll/ܶۘܺ;->֫(II)I

    move-result v12

    goto :goto_1f

    .line 625
    :cond_34
    invoke-virtual {v3}, Ll/ܳۘܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܺۡܺ;->ܽ()Ll/ۧۖܺ;

    move-result-object v4

    invoke-interface {v4}, Ll/ۧۖܺ;->size()I

    move-result v4

    if-eqz v4, :cond_35

    const/4 v4, 0x1

    goto :goto_20

    :cond_35
    const/4 v4, 0x0

    .line 626
    :goto_20
    invoke-virtual {v6, v8}, Ll/ܽۖܺ;->֫(I)I

    move-result v8

    .line 627
    invoke-virtual {v6, v10}, Ll/ܽۖܺ;->֫(I)I

    move-result v10

    if-eq v8, v10, :cond_2e

    if-nez v4, :cond_2e

    .line 629
    move-object v4, v3

    check-cast v4, Ll/۫ۖܺ;

    .line 630
    invoke-virtual {v0, v3, v9}, Ll/ۗۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)Ll/᩸ۡܺ;

    move-result-object v9

    const/4 v10, 0x0

    .line 629
    invoke-virtual {v4, v10, v9}, Ll/۫ۖܺ;->֫(ILl/᩸ۡܺ;)V

    .line 631
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v3

    invoke-virtual {v3, v10}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-direct {v0, v8, v3}, Ll/ܶۘܺ;->֫(ILl/᩸ۡܺ;)V

    goto/16 :goto_1e

    .line 640
    :cond_36
    iget-object v1, v0, Ll/ܶۘܺ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_37
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۖܺ;

    .line 1160
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v4

    .line 1161
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v8

    .line 1162
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ۧ()I

    move-result v9

    .line 1164
    invoke-virtual {v3}, Ll/ܰۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v3

    .line 1165
    invoke-virtual {v3}, Ll/ܿᩴܺ;->size()I

    move-result v10

    .line 1168
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1171
    new-instance v12, Ll/۠ۘܺ;

    add-int/lit8 v13, v10, 0x1

    invoke-direct {v12, v13}, Ll/۠ۘܺ;-><init>(I)V

    .line 1177
    invoke-virtual {v5, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v13

    if-eqz v13, :cond_38

    .line 1178
    invoke-virtual {v6, v8}, Ll/ܽۖܺ;->֫(I)I

    move-result v4

    invoke-virtual {v12, v4}, Ll/۠ۘܺ;->֫(I)V

    goto :goto_21

    .line 1180
    :cond_38
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_21
    const/4 v4, 0x0

    :goto_22
    if-ge v4, v10, :cond_3a

    .line 1184
    invoke-virtual {v3, v4}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v8

    .line 1185
    invoke-virtual {v8}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v8

    invoke-virtual {v2, v8}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v8

    .line 1186
    invoke-virtual {v8}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v8

    .line 1187
    invoke-virtual {v8}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v13

    .line 1193
    invoke-virtual {v5, v13}, Ljava/util/BitSet;->get(I)Z

    move-result v14

    if-eqz v14, :cond_39

    .line 1194
    invoke-virtual {v6, v13}, Ll/ܽۖܺ;->֫(I)I

    move-result v8

    invoke-virtual {v12, v8}, Ll/۠ۘܺ;->֫(I)V

    goto :goto_23

    .line 1196
    :cond_39
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_23
    add-int/lit8 v4, v4, 0x1

    goto :goto_22

    :cond_3a
    const/4 v3, 0x0

    .line 1201
    :goto_24
    invoke-virtual {v12}, Ll/۠ۘܺ;->ۧ()I

    move-result v4

    if-ge v3, v4, :cond_3b

    .line 1202
    invoke-virtual {v12}, Ll/۠ۘܺ;->֫()I

    move-result v4

    const/4 v8, 0x0

    .line 1203
    invoke-direct {v0, v4, v9, v11, v8}, Ll/ܶۘܺ;->֫(IILjava/util/ArrayList;Z)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_24

    :cond_3b
    const/4 v3, 0x0

    .line 1207
    invoke-direct {v0, v7, v9}, Ll/ܶۘܺ;->֫(II)I

    move-result v4

    .line 1208
    :goto_25
    invoke-direct {v0, v4, v9, v11, v3}, Ll/ܶۘܺ;->֫(IILjava/util/ArrayList;Z)Z

    move-result v8

    if-nez v8, :cond_37

    add-int/lit8 v4, v4, 0x1

    .line 1209
    invoke-direct {v0, v4, v9}, Ll/ܶۘܺ;->֫(II)I

    move-result v4

    goto :goto_25

    :cond_3c
    const/4 v1, 0x0

    .line 649
    invoke-virtual {v2}, Ll/᩷ۘܺ;->ۜ()I

    move-result v3

    :goto_26
    if-ge v1, v3, :cond_41

    .line 652
    invoke-virtual {v5, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-eqz v4, :cond_3d

    goto :goto_29

    .line 104
    :cond_3d
    invoke-virtual {v2, v1}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v4

    if-nez v4, :cond_3e

    const/4 v4, 0x0

    goto :goto_27

    .line 106
    :cond_3e
    invoke-virtual {v4}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v4

    :goto_27
    if-nez v4, :cond_3f

    goto :goto_29

    .line 661
    :cond_3f
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ۧ()I

    move-result v8

    .line 663
    invoke-direct {v0, v7, v8}, Ll/ܶۘܺ;->֫(II)I

    move-result v9

    .line 664
    :goto_28
    invoke-direct {v0, v9, v4}, Ll/ܶۘܺ;->ۧ(ILl/᩸ۡܺ;)Z

    move-result v10

    if-nez v10, :cond_40

    add-int/lit8 v9, v9, 0x1

    .line 665
    invoke-direct {v0, v9, v8}, Ll/ܶۘܺ;->֫(II)I

    move-result v9

    goto :goto_28

    .line 668
    :cond_40
    invoke-direct {v0, v9, v4}, Ll/ܶۘܺ;->֫(ILl/᩸ۡܺ;)V

    :goto_29
    add-int/lit8 v1, v1, 0x1

    goto :goto_26

    :cond_41
    return-object v6
.end method
