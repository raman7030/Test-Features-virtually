.class public final Ll/۠ۛ֡;
.super Ll/ۚ۬֡;
.source "M605"

# interfaces
.implements Ll/ۡ֫ۚ;


# instance fields
.field public ۗ:I

.field public final ۙ:I

.field public final ۛ:I

.field public ۤ:I

.field public final ۨ:I

.field public final ۫:I

.field public final ۬:Ll/֨ۛ֡;

.field public ܰ:I

.field public final ᩶:Ll/۬ۛ֡;

.field public ᩸:Ll/ۧ۟֡;

.field public final ᩹:I

.field public final ᩺:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;II)V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 75
    iput v0, p0, Ll/۠ۛ֡;->ۤ:I

    .line 76
    iput v0, p0, Ll/۠ۛ֡;->ۗ:I

    .line 77
    iput v0, p0, Ll/۠ۛ֡;->ܰ:I

    .line 84
    iput-object p1, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    .line 85
    iput p2, p0, Ll/۠ۛ֡;->᩹:I

    .line 87
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    add-int/lit8 p2, p2, 0x18

    invoke-virtual {v1, p2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, -0x1

    .line 89
    iput p1, p0, Ll/۠ۛ֡;->ۨ:I

    .line 90
    iput v0, p0, Ll/۠ۛ֡;->ۛ:I

    .line 91
    iput v0, p0, Ll/۠ۛ֡;->۫:I

    .line 92
    iput v0, p0, Ll/۠ۛ֡;->ۙ:I

    .line 93
    iput v0, p0, Ll/۠ۛ֡;->᩺:I

    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result p2

    iput p2, p0, Ll/۠ۛ֡;->ۛ:I

    .line 97
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result p2

    iput p2, p0, Ll/۠ۛ֡;->۫:I

    .line 98
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result p2

    iput p2, p0, Ll/۠ۛ֡;->ۙ:I

    .line 99
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result p2

    iput p2, p0, Ll/۠ۛ֡;->᩺:I

    .line 100
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result p2

    iput p2, p0, Ll/۠ۛ֡;->ۨ:I

    .line 101
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۘ()V

    :goto_0
    if-eqz p3, :cond_1

    .line 105
    new-instance p1, Ll/֨ۛ֡;

    invoke-direct {p1, p0, p3}, Ll/֨ۛ֡;-><init>(Ll/۠ۛ֡;I)V

    iput-object p1, p0, Ll/۠ۛ֡;->۬:Ll/֨ۛ֡;

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 107
    iput-object p1, p0, Ll/۠ۛ֡;->۬:Ll/֨ۛ֡;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠ۛ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۠ۛ֡;->ۙ:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/۠ۛ֡;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠ۛ֡;->ۗ:I

    return-void
.end method

.method private ۗ()I
    .locals 3

    .line 510
    iget v0, p0, Ll/۠ۛ֡;->ۤ:I

    if-lez v0, :cond_0

    return v0

    .line 513
    :cond_0
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/۠ۛ֡;->ۨ:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v0

    const/4 v1, 0x0

    .line 130
    :goto_0
    iget v2, p0, Ll/۠ۛ֡;->ۛ:I

    if-ge v1, v2, :cond_1

    .line 131
    invoke-virtual {v0}, Ll/ᩴۨ֡;->֡()V

    .line 132
    invoke-virtual {v0}, Ll/ᩴۨ֡;->֡()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 515
    :cond_1
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۧ()I

    move-result v1

    iput v1, p0, Ll/۠ۛ֡;->ۤ:I

    .line 516
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۘ()V

    .line 517
    iget v0, p0, Ll/۠ۛ֡;->ۤ:I

    return v0
.end method

.method private ۙ()I
    .locals 3

    .line 521
    iget v0, p0, Ll/۠ۛ֡;->ۗ:I

    if-lez v0, :cond_0

    return v0

    .line 524
    :cond_0
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    invoke-direct {p0}, Ll/۠ۛ֡;->ۗ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v0

    const/4 v1, 0x0

    .line 130
    :goto_0
    iget v2, p0, Ll/۠ۛ֡;->۫:I

    if-ge v1, v2, :cond_1

    .line 131
    invoke-virtual {v0}, Ll/ᩴۨ֡;->֡()V

    .line 132
    invoke-virtual {v0}, Ll/ᩴۨ֡;->֡()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 526
    :cond_1
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۧ()I

    move-result v1

    iput v1, p0, Ll/۠ۛ֡;->ۗ:I

    .line 527
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۘ()V

    .line 528
    iget v0, p0, Ll/۠ۛ֡;->ۗ:I

    return v0
.end method

.method public static bridge synthetic ۧ(Ll/۠ۛ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۠ۛ֡;->۫:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/۠ۛ֡;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠ۛ֡;->ۤ:I

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/۠ۛ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۠ۛ֡;->ۛ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/۠ۛ֡;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠ۛ֡;->ܰ:I

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/۠ۛ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۠ۛ֡;->᩺:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/۠ۛ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۠ۛ֡;->ۨ:I

    return p0
.end method

.method private ᩹()Ll/ۧ۟֡;
    .locals 3

    .line 502
    iget-object v0, p0, Ll/۠ۛ֡;->᩸:Ll/ۧ۟֡;

    if-nez v0, :cond_0

    .line 503
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/۠ۛ֡;->᩹:I

    add-int/lit8 v2, v2, 0x14

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    .line 504
    invoke-static {v0, v1}, Ll/ۧ۟֡;->ܽ(Ll/۬ۛ֡;I)Ll/ۧ۟֡;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۛ֡;->᩸:Ll/ۧ۟֡;

    .line 506
    :cond_0
    iget-object v0, p0, Ll/۠ۛ֡;->᩸:Ll/ۧ۟֡;

    return-object v0
.end method


# virtual methods
.method public final getAnnotations()Ljava/util/Set;
    .locals 1

    .line 204
    invoke-direct {p0}, Ll/۠ۛ֡;->᩹()Ll/ۧ۟֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ۟֡;->֫()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getFields()Ljava/lang/Iterable;
    .locals 2

    const/4 v0, 0x1

    .line 210
    invoke-virtual {p0, v0}, Ll/۠ۛ֡;->ܿ(Z)Ljava/lang/Iterable;

    move-result-object v1

    .line 278
    invoke-virtual {p0, v0}, Ll/۠ۛ֡;->ᩳ(Z)Ljava/lang/Iterable;

    move-result-object v0

    .line 344
    invoke-static {v1, v0}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final getMethods()Ljava/lang/Iterable;
    .locals 2

    const/4 v0, 0x1

    .line 350
    invoke-virtual {p0, v0}, Ll/۠ۛ֡;->ܽ(Z)Ljava/lang/Iterable;

    move-result-object v1

    .line 476
    invoke-virtual {p0, v0}, Ll/۠ۛ֡;->ܳ(Z)Ljava/lang/Iterable;

    move-result-object v0

    .line 482
    invoke-static {v1, v0}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 3

    .line 118
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/۠ۛ֡;->᩹:I

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()I
    .locals 2

    .line 616
    iget v0, p0, Ll/۠ۛ֡;->ۛ:I

    iget v1, p0, Ll/۠ۛ֡;->۫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֨()I
    .locals 2

    .line 612
    iget v0, p0, Ll/۠ۛ֡;->ۙ:I

    iget v1, p0, Ll/۠ۛ֡;->᩺:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(Ljava/io/Writer;)V
    .locals 3

    .line 122
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/۠ۛ֡;->᩹:I

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    return-void
.end method

.method public final ֫(Ll/۠ۛ֡;ZZZZZ)Z
    .locals 11

    move-object v0, p0

    move-object v1, p1

    move/from16 v9, p6

    .line 732
    invoke-virtual {p0}, Ll/۠ۛ֡;->ܽ()I

    move-result v2

    invoke-virtual {p1}, Ll/۠ۛ֡;->ܽ()I

    move-result v3

    const/4 v10, 0x0

    if-eq v2, v3, :cond_0

    goto/16 :goto_1

    .line 486
    :cond_0
    iget v2, v0, Ll/۠ۛ֡;->ۛ:I

    iget v3, v1, Ll/۠ۛ֡;->ۛ:I

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    .line 490
    :cond_1
    iget v2, v0, Ll/۠ۛ֡;->۫:I

    iget v3, v1, Ll/۠ۛ֡;->۫:I

    if-eq v2, v3, :cond_2

    goto/16 :goto_1

    .line 494
    :cond_2
    iget v2, v0, Ll/۠ۛ֡;->ۙ:I

    iget v3, v1, Ll/۠ۛ֡;->ۙ:I

    if-eq v2, v3, :cond_3

    goto/16 :goto_1

    .line 498
    :cond_3
    iget v2, v0, Ll/۠ۛ֡;->᩺:I

    iget v3, v1, Ll/۠ۛ֡;->᩺:I

    if-eq v2, v3, :cond_4

    goto/16 :goto_1

    .line 752
    :cond_4
    invoke-virtual {p0}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_1

    .line 756
    :cond_5
    invoke-virtual {p0}, Ll/۠ۛ֡;->ۜܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/۠ۛ֡;->ۜܽ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_1

    .line 761
    :cond_6
    invoke-virtual {p0}, Ll/۠ۛ֡;->ܳ֫()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Ll/۠ۛ֡;->ܳ֫()Ljava/util/List;

    move-result-object v3

    .line 14
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-eq v4, v5, :cond_7

    goto/16 :goto_1

    .line 17
    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_9

    .line 18
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    goto/16 :goto_1

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_9
    if-nez p2, :cond_a

    .line 766
    invoke-virtual {p0}, Ll/۠ۛ֡;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/۠ۛ֡;->ۜ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_1

    .line 771
    :cond_a
    invoke-virtual {p0}, Ll/۠ۛ֡;->getAnnotations()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p1}, Ll/۠ۛ֡;->getAnnotations()Ljava/util/Set;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۗ᩻ۚ;->֫(Ljava/util/Set;Ljava/util/Set;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_1

    .line 776
    :cond_b
    invoke-virtual {p0, v10}, Ll/۠ۛ֡;->ܿ(Z)Ljava/lang/Iterable;

    move-result-object v2

    invoke-virtual {p1, v10}, Ll/۠ۛ֡;->ܿ(Z)Ljava/lang/Iterable;

    move-result-object v3

    invoke-static {v2, v3, v9}, Ll/ۗ᩻ۚ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;Z)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_1

    .line 780
    :cond_c
    invoke-virtual {p0, v10}, Ll/۠ۛ֡;->ᩳ(Z)Ljava/lang/Iterable;

    move-result-object v2

    invoke-virtual {p1, v10}, Ll/۠ۛ֡;->ᩳ(Z)Ljava/lang/Iterable;

    move-result-object v3

    invoke-static {v2, v3, v9}, Ll/ۗ᩻ۚ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;Z)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_1

    .line 785
    :cond_d
    invoke-virtual {p0, v10}, Ll/۠ۛ֡;->ܽ(Z)Ljava/lang/Iterable;

    move-result-object v2

    invoke-virtual {p1, v10}, Ll/۠ۛ֡;->ܽ(Z)Ljava/lang/Iterable;

    move-result-object v3

    move v4, p2

    move v5, p3

    move v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    invoke-static/range {v2 .. v8}, Ll/ۗ᩻ۚ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;ZZZZZ)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_1

    .line 789
    :cond_e
    invoke-virtual {p0, v10}, Ll/۠ۛ֡;->ܳ(Z)Ljava/lang/Iterable;

    move-result-object v2

    invoke-virtual {p1, v10}, Ll/۠ۛ֡;->ܳ(Z)Ljava/lang/Iterable;

    move-result-object v3

    move-object v1, v2

    move-object v2, v3

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    invoke-static/range {v1 .. v7}, Ll/ۗ᩻ۚ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;ZZZZZ)Z

    move-result v1

    if-nez v1, :cond_f

    :goto_1
    return v10

    :cond_f
    const/4 v1, 0x1

    return v1
.end method

.method public final ۚ()[I
    .locals 8

    .line 185
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/۠ۛ֡;->᩹:I

    add-int/lit8 v2, v2, 0xc

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    .line 187
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v3

    invoke-virtual {v3, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v3

    if-nez v3, :cond_0

    return-object v2

    .line 191
    :cond_0
    new-array v2, v3, [I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 193
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v5

    add-int/lit8 v6, v1, 0x4

    mul-int/lit8 v7, v4, 0x2

    add-int/2addr v7, v6

    invoke-virtual {v5, v7}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v5

    aput v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 3

    .line 143
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/۠ۛ֡;->᩹:I

    add-int/lit8 v2, v2, 0x10

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ܳ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->᩻(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜܽ()Ljava/lang/String;
    .locals 3

    .line 128
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/۠ۛ֡;->᩹:I

    add-int/lit8 v2, v2, 0x8

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ܳ(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 586
    :cond_0
    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()I
    .locals 2

    .line 147
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/۠ۛ֡;->᩹:I

    add-int/lit8 v1, v1, 0x10

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ܳ(I)I

    move-result v0

    return v0
.end method

.method public final ۧܽ()Ljava/lang/Iterable;
    .locals 1

    const/4 v0, 0x1

    .line 350
    invoke-virtual {p0, v0}, Ll/۠ۛ֡;->ܽ(Z)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ۨ֫()Ljava/lang/Iterable;
    .locals 1

    const/4 v0, 0x1

    .line 210
    invoke-virtual {p0, v0}, Ll/۠ۛ֡;->ܿ(Z)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ܰۧ()Ljava/lang/Iterable;
    .locals 1

    const/4 v0, 0x1

    .line 278
    invoke-virtual {p0, v0}, Ll/۠ۛ֡;->ᩳ(Z)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ(Z)Ljava/lang/Iterable;
    .locals 7

    .line 417
    iget v0, p0, Ll/۠ۛ֡;->᩺:I

    if-lez v0, :cond_3

    .line 419
    invoke-direct {p0}, Ll/۠ۛ֡;->᩹()Ll/ۧ۟֡;

    move-result-object v3

    .line 532
    iget v0, p0, Ll/۠ۛ֡;->ܰ:I

    if-lez v0, :cond_0

    :goto_0
    move v4, v0

    goto :goto_2

    .line 535
    :cond_0
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    invoke-direct {p0}, Ll/۠ۛ֡;->ۙ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v0

    .line 536
    sget v1, Ll/ܽۨ֡;->ܰ:I

    const/4 v1, 0x0

    .line 169
    :goto_1
    iget v2, p0, Ll/۠ۛ֡;->ۙ:I

    if-ge v1, v2, :cond_1

    .line 170
    invoke-virtual {v0}, Ll/ᩴۨ֡;->֡()V

    .line 171
    invoke-virtual {v0}, Ll/ᩴۨ֡;->֡()V

    .line 172
    invoke-virtual {v0}, Ll/ᩴۨ֡;->֡()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 537
    :cond_1
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۧ()I

    move-result v1

    iput v1, p0, Ll/۠ۛ֡;->ܰ:I

    .line 538
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۘ()V

    .line 539
    iget v0, p0, Ll/۠ۛ֡;->ܰ:I

    goto :goto_0

    .line 422
    :goto_2
    iget-object v0, p0, Ll/۠ۛ֡;->۬:Ll/֨ۛ֡;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_3

    .line 423
    :cond_2
    invoke-static {v0}, Ll/֨ۛ֡;->ᩳ(Ll/֨ۛ֡;)Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    move-object v5, v0

    .line 425
    new-instance v0, Ll/ۘۛ֡;

    move-object v1, v0

    move-object v2, p0

    move v6, p1

    invoke-direct/range {v1 .. v6}, Ll/ۘۛ֡;-><init>(Ll/۠ۛ֡;Ll/ۧ۟֡;ILjava/util/Iterator;Z)V

    return-object v0

    .line 469
    :cond_3
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ֫()Ljava/util/List;
    .locals 3

    .line 164
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/۠ۛ֡;->᩹:I

    add-int/lit8 v2, v2, 0xc

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    if-lez v1, :cond_0

    .line 166
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    .line 167
    new-instance v2, Ll/ܳۛ֡;

    invoke-direct {v2, p0, v1, v0}, Ll/ܳۛ֡;-><init>(Ll/۠ۛ֡;II)V

    return-object v2

    .line 180
    :cond_0
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 2

    .line 137
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/۠ۛ֡;->᩹:I

    add-int/lit8 v1, v1, 0x4

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    return v0
.end method

.method public final ܽ(Z)Ljava/lang/Iterable;
    .locals 7

    .line 355
    iget v0, p0, Ll/۠ۛ֡;->ۙ:I

    if-lez v0, :cond_1

    .line 357
    invoke-direct {p0}, Ll/۠ۛ֡;->᩹()Ll/ۧ۟֡;

    move-result-object v3

    .line 358
    invoke-direct {p0}, Ll/۠ۛ֡;->ۙ()I

    move-result v4

    .line 360
    iget-object v0, p0, Ll/۠ۛ֡;->۬:Ll/֨ۛ֡;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 361
    :cond_0
    invoke-static {v0}, Ll/֨ۛ֡;->֫(Ll/֨ۛ֡;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v5, v0

    .line 363
    new-instance v0, Ll/ܺۛ֡;

    move-object v1, v0

    move-object v2, p0

    move v6, p1

    invoke-direct/range {v1 .. v6}, Ll/ܺۛ֡;-><init>(Ll/۠ۛ֡;Ll/ۧ۟֡;ILjava/util/Iterator;Z)V

    return-object v0

    .line 408
    :cond_1
    iget p1, p0, Ll/۠ۛ֡;->ۗ:I

    if-lez p1, :cond_2

    .line 409
    iput p1, p0, Ll/۠ۛ֡;->ܰ:I

    .line 411
    :cond_2
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ(Z)Ljava/lang/Iterable;
    .locals 7

    .line 215
    iget v0, p0, Ll/۠ۛ֡;->ۛ:I

    if-lez v0, :cond_1

    .line 217
    invoke-direct {p0}, Ll/۠ۛ֡;->᩹()Ll/ۧ۟֡;

    move-result-object v3

    .line 218
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    .line 219
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/۠ۛ֡;->᩹:I

    add-int/lit8 v1, v1, 0x1c

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v4

    .line 221
    iget-object v0, p0, Ll/۠ۛ֡;->۬:Ll/֨ۛ֡;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 222
    :cond_0
    invoke-static {v0}, Ll/֨ۛ֡;->ܽ(Ll/֨ۛ֡;)Ll/᩸۟֡;

    move-result-object v0

    :goto_0
    move-object v5, v0

    .line 224
    new-instance v0, Ll/ۜۛ֡;

    move-object v1, v0

    move-object v2, p0

    move v6, p1

    invoke-direct/range {v1 .. v6}, Ll/ۜۛ֡;-><init>(Ll/۠ۛ֡;Ll/ۧ۟֡;ILjava/util/Iterator;Z)V

    return-object v0

    .line 270
    :cond_1
    iget p1, p0, Ll/۠ۛ֡;->ۨ:I

    iput p1, p0, Ll/۠ۛ֡;->ۤ:I

    .line 271
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ܿܽ()Ljava/lang/Iterable;
    .locals 1

    const/4 v0, 0x1

    .line 476
    invoke-virtual {p0, v0}, Ll/۠ۛ֡;->ܳ(Z)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Z)Ljava/lang/Iterable;
    .locals 7

    .line 283
    iget v0, p0, Ll/۠ۛ֡;->۫:I

    if-lez v0, :cond_1

    .line 285
    invoke-direct {p0}, Ll/۠ۛ֡;->᩹()Ll/ۧ۟֡;

    move-result-object v3

    .line 286
    invoke-direct {p0}, Ll/۠ۛ֡;->ۗ()I

    move-result v4

    .line 288
    iget-object v0, p0, Ll/۠ۛ֡;->۬:Ll/֨ۛ֡;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 289
    :cond_0
    invoke-static {v0}, Ll/֨ۛ֡;->ۧ(Ll/֨ۛ֡;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v5, v0

    .line 291
    new-instance v0, Ll/ۢۛ֡;

    move-object v1, v0

    move-object v2, p0

    move v6, p1

    invoke-direct/range {v1 .. v6}, Ll/ۢۛ֡;-><init>(Ll/۠ۛ֡;Ll/ۧ۟֡;ILjava/util/Iterator;Z)V

    return-object v0

    .line 334
    :cond_1
    iget p1, p0, Ll/۠ۛ֡;->ۤ:I

    if-lez p1, :cond_2

    .line 335
    iput p1, p0, Ll/۠ۛ֡;->ۗ:I

    .line 337
    :cond_2
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩸()I
    .locals 2

    .line 132
    iget-object v0, p0, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/۠ۛ֡;->᩹:I

    add-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ܳ(I)I

    move-result v0

    return v0
.end method
