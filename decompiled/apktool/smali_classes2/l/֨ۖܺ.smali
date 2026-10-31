.class public final Ll/֨ۖܺ;
.super Ljava/lang/Object;
.source "HBGE"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:I

.field public final ܽ:Ll/᩷ۘܺ;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Ll/֨ۖܺ;->ܽ:Ll/᩷ۘܺ;

    .line 130
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۜ()I

    move-result p1

    iput p1, p0, Ll/֨ۖܺ;->ۧ:I

    .line 131
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֨ۖܺ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(Ll/᩸ۡܺ;)I
    .locals 3

    const/4 v0, 0x0

    .line 143
    :goto_0
    iget-object v1, p0, Ll/֨ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 144
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖܺ;

    .line 145
    iget-object v1, v1, Ll/֡ۖܺ;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v0
.end method

.method private ֫(Ll/ܳۘܺ;)Ll/ܳۘܺ;
    .locals 1

    .line 160
    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۘܺ;->᩻()Ljava/util/BitSet;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result p1

    .line 161
    iget-object v0, p0, Ll/֨ۖܺ;->ܽ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۘܺ;

    invoke-virtual {p1}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object p1

    const/4 v0, 0x1

    .line 0
    invoke-static {p1, v0}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p1

    .line 162
    check-cast p1, Ll/ܳۘܺ;

    return-object p1
.end method

.method public static ֫(Ll/֨ۖܺ;Ll/۫ۖܺ;)V
    .locals 7

    .line 235
    iget v0, p0, Ll/֨ۖܺ;->ۧ:I

    iget-object v1, p0, Ll/֨ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/۫ۖܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗۡܺ;->ᩳ()I

    move-result v2

    .line 236
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v3

    const/16 v4, 0x38

    const/16 v5, 0x9

    if-ne v2, v4, :cond_6

    .line 241
    invoke-virtual {v3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v4

    invoke-interface {v4}, Ll/֫ۖܺ;->ܿ()I

    move-result v4

    if-ne v4, v5, :cond_6

    .line 269
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v2

    .line 270
    invoke-direct {p0, p1}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;)Ll/ܳۘܺ;

    move-result-object p1

    .line 271
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۗۡܺ;->ᩳ()I

    move-result v4

    const/4 v5, 0x5

    if-eq v4, v5, :cond_5

    const/16 v5, 0x26

    const/4 v6, 0x0

    if-eq v4, v5, :cond_2

    const/16 v5, 0x2d

    if-eq v4, v5, :cond_2

    const/16 v5, 0x2e

    if-eq v4, v5, :cond_1

    packed-switch v4, :pswitch_data_0

    const/4 p1, 0x0

    goto/16 :goto_1

    .line 285
    :pswitch_0
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object p1

    invoke-virtual {p1, v6}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    .line 286
    invoke-virtual {p1}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/֫ۖܺ;->ۡ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 288
    new-instance p1, Ll/֡ۖܺ;

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    sget-object v4, Ll/ۚۖܺ;->ۗ:Ll/ۚۖܺ;

    invoke-direct {p1, v2, v0, v4}, Ll/֡ۖܺ;-><init>(IILl/ۚۖܺ;)V

    const/4 v0, 0x1

    .line 290
    iput-boolean v0, p1, Ll/֡ۖܺ;->ܿ:Z

    goto :goto_0

    .line 293
    :cond_0
    new-instance p1, Ll/֡ۖܺ;

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    sget-object v4, Ll/ۚۖܺ;->᩹:Ll/ۚۖܺ;

    invoke-direct {p1, v2, v0, v4}, Ll/֡ۖܺ;-><init>(IILl/ۚۖܺ;)V

    goto :goto_0

    .line 299
    :cond_1
    new-instance p1, Ll/֡ۖܺ;

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    sget-object v4, Ll/ۚۖܺ;->᩹:Ll/ۚۖܺ;

    invoke-direct {p1, v2, v0, v4}, Ll/֡ۖܺ;-><init>(IILl/ۚۖܺ;)V

    goto :goto_0

    .line 306
    :cond_2
    :pswitch_1
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object p1

    invoke-virtual {p1, v6}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    .line 307
    invoke-direct {p0, p1}, Ll/֨ۖܺ;->֫(Ll/᩸ۡܺ;)I

    move-result v4

    .line 310
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-eq v4, v5, :cond_3

    .line 311
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ۖܺ;

    .line 312
    iget-object v0, p1, Ll/֡ۖܺ;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    goto :goto_1

    .line 317
    :cond_3
    invoke-virtual {p1}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object p1

    sget-object v4, Ll/۟ܺܺ;->ᩴ֫:Ll/۟ܺܺ;

    if-ne p1, v4, :cond_4

    .line 318
    new-instance p1, Ll/֡ۖܺ;

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    sget-object v4, Ll/ۚۖܺ;->ۗ:Ll/ۚۖܺ;

    invoke-direct {p1, v2, v0, v4}, Ll/֡ۖܺ;-><init>(IILl/ۚۖܺ;)V

    goto :goto_0

    .line 321
    :cond_4
    new-instance p1, Ll/֡ۖܺ;

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    sget-object v4, Ll/ۚۖܺ;->᩹:Ll/ۚۖܺ;

    invoke-direct {p1, v2, v0, v4}, Ll/֡ۖܺ;-><init>(IILl/ۚۖܺ;)V

    goto :goto_0

    .line 279
    :cond_5
    :pswitch_2
    new-instance p1, Ll/֡ۖܺ;

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    sget-object v4, Ll/ۚۖܺ;->ۗ:Ll/ۚۖܺ;

    invoke-direct {p1, v2, v0, v4}, Ll/֡ۖܺ;-><init>(IILl/ۚۖܺ;)V

    .line 330
    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    :goto_1
    invoke-direct {p0, v3, p1}, Ll/֨ۖܺ;->֫(Ll/᩸ۡܺ;Ll/֡ۖܺ;)V

    return-void

    :cond_6
    const/4 p1, 0x3

    if-ne v2, p1, :cond_7

    .line 246
    invoke-virtual {v3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/֫ۖܺ;->ܿ()I

    move-result p1

    if-ne p1, v5, :cond_7

    .line 248
    new-instance p1, Ll/֡ۖܺ;

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    sget-object v4, Ll/ۚۖܺ;->ۗ:Ll/ۚۖܺ;

    invoke-direct {p1, v2, v0, v4}, Ll/֡ۖܺ;-><init>(IILl/ۚۖܺ;)V

    .line 249
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    invoke-direct {p0, v3, p1}, Ll/֨ۖܺ;->֫(Ll/᩸ۡܺ;Ll/֡ۖܺ;)V

    return-void

    :cond_7
    const/16 p1, 0x37

    if-ne v2, p1, :cond_8

    .line 252
    invoke-virtual {v3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/֫ۖܺ;->ܿ()I

    move-result p1

    if-ne p1, v5, :cond_8

    .line 254
    new-instance p1, Ll/֡ۖܺ;

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    sget-object v4, Ll/ۚۖܺ;->ۗ:Ll/ۚۖܺ;

    invoke-direct {p1, v2, v0, v4}, Ll/֡ۖܺ;-><init>(IILl/ۚۖܺ;)V

    .line 255
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    invoke-direct {p0, v3, p1}, Ll/֨ۖܺ;->֫(Ll/᩸ۡܺ;Ll/֡ۖܺ;)V

    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x28
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private ֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;ILl/ۛܺܺ;)V
    .locals 8

    .line 846
    invoke-virtual {p1}, Ll/ܳۘܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 847
    invoke-static {p3, v1, p2, p4}, Ll/۫ۡܺ;->֫(ILl/֫ۖܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)Ll/ۗۡܺ;

    move-result-object v3

    if-nez p4, :cond_0

    .line 850
    new-instance p3, Ll/᩺ۡܺ;

    .line 851
    invoke-virtual {v0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object p4

    sget-object v0, Ll/ܰܺܺ;->᩺:Ll/ܰܺܺ;

    invoke-direct {p3, v3, p4, p2, v0}, Ll/᩺ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ۧۖܺ;)V

    goto :goto_0

    .line 853
    :cond_0
    new-instance p3, Ll/ۨۡܺ;

    .line 854
    invoke-virtual {v0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v4

    sget-object v6, Ll/ܰܺܺ;->᩺:Ll/ܰܺܺ;

    move-object v2, p3

    move-object v5, p2

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Ll/ۨۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ۧۖܺ;Ll/ܰۡܺ;)V

    .line 857
    :goto_0
    new-instance p2, Ll/۫ۖܺ;

    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p4

    invoke-direct {p2, p3, p4}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    .line 858
    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p3

    invoke-virtual {p3}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object p3

    .line 860
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {p3, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 574
    iget-object p1, p0, Ll/֨ۖܺ;->ܽ:Ll/᩷ۘܺ;

    invoke-virtual {p1, p2, v1}, Ll/᩷ۘܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;)V

    .line 575
    invoke-virtual {p1, p2, v1}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)V

    return-void
.end method

.method private ֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;Ll/᩸ۡܺ;ILl/ܰۡܺ;)V
    .locals 7

    .line 808
    invoke-virtual {p1}, Ll/ܳۘܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v0

    const/16 v1, 0x38

    if-ne p4, v1, :cond_0

    .line 811
    invoke-virtual {p3}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object p4

    invoke-static {p4}, Ll/۫ۡܺ;->ᩳ(Ll/֫ۖܺ;)Ll/ۗۡܺ;

    move-result-object p4

    goto :goto_0

    .line 813
    :cond_0
    invoke-static {p4, p3, p2, p5}, Ll/۫ۡܺ;->֫(ILl/֫ۖܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)Ll/ۗۡܺ;

    move-result-object p4

    :goto_0
    move-object v2, p4

    if-nez p5, :cond_1

    .line 818
    new-instance p4, Ll/֨ۡܺ;

    .line 819
    invoke-virtual {v0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object p5

    invoke-direct {p4, v2, p5, p3, p2}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    goto :goto_1

    .line 821
    :cond_1
    new-instance p4, Ll/ۚۡܺ;

    .line 822
    invoke-virtual {v0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v3

    move-object v1, p4

    move-object v4, p3

    move-object v5, p2

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Ll/ۚۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 825
    :goto_1
    new-instance p2, Ll/۫ۖܺ;

    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p3

    invoke-direct {p2, p4, p3}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    .line 826
    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p3

    invoke-virtual {p3}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object p3

    .line 828
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {p3, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 574
    iget-object p1, p0, Ll/֨ۖܺ;->ܽ:Ll/᩷ۘܺ;

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Ll/᩷ۘܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;)V

    .line 575
    invoke-virtual {p1, p2, p3}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)V

    return-void
.end method

.method private ֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;Ljava/util/HashSet;)V
    .locals 10

    .line 758
    new-instance v0, Ll/۫ܺܺ;

    sget-object v1, Ll/ۜۡܺ;->᩷:Ll/۟ܺܺ;

    invoke-direct {v0, v1}, Ll/۫ܺܺ;-><init>(Ll/۟ܺܺ;)V

    .line 760
    sget-object v4, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    const/16 v1, 0x28

    invoke-direct {p0, p1, v4, v1, v0}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;ILl/ۛܺܺ;)V

    .line 764
    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p1

    .line 766
    invoke-virtual {p1}, Ll/ܽۘܺ;->ۜ()Ll/ܽۘܺ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ܽۘܺ;->ܽ(Ll/ܽۘܺ;)Ll/ܽۘܺ;

    move-result-object p1

    .line 767
    invoke-virtual {p1}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v8, 0x0

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܳۘܺ;

    .line 769
    iget-object v1, p0, Ll/֨ۖܺ;->ܽ:Ll/᩷ۘܺ;

    invoke-virtual {v1}, Ll/᩷ۘܺ;->ܺ()I

    move-result v2

    invoke-static {v2, v0}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v9

    const/16 v6, 0x38

    const/4 v7, 0x0

    move-object v2, p0

    move-object v5, v9

    .line 770
    invoke-direct/range {v2 .. v7}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;Ll/᩸ۡܺ;ILl/ܰۡܺ;)V

    .line 775
    invoke-virtual {p1}, Ll/ܽۘܺ;->ۜ()Ll/ܽۘܺ;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ܽۘܺ;->ܽ(Ll/ܽۘܺ;)Ll/ܽۘܺ;

    move-result-object p1

    .line 776
    invoke-virtual {p1}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳۘܺ;

    .line 777
    new-instance v3, Ll/᩶ܺܺ;

    new-instance v4, Ll/۬ܺܺ;

    const-string v5, "<init>"

    invoke-direct {v4, v5}, Ll/۬ܺܺ;-><init>(Ljava/lang/String;)V

    new-instance v5, Ll/۬ܺܺ;

    const-string v6, "(I)V"

    invoke-direct {v5, v6}, Ll/۬ܺܺ;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4, v5}, Ll/᩶ܺܺ;-><init>(Ll/۬ܺܺ;Ll/۬ܺܺ;)V

    .line 778
    new-instance v4, Ll/᩹ܺܺ;

    invoke-direct {v4, v0, v3}, Ll/᩹ܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    .line 779
    invoke-static {v9, p2}, Ll/᩶ۡܺ;->֫(Ll/᩸ۡܺ;Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object p2

    const/16 v0, 0x34

    invoke-direct {p0, v2, p2, v0, v4}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;ILl/ۛܺܺ;)V

    .line 781
    invoke-virtual {p3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 785
    invoke-virtual {p1}, Ll/ܽۘܺ;->ۜ()Ll/ܽۘܺ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ܽۘܺ;->ܽ(Ll/ܽۘܺ;)Ll/ܽۘܺ;

    move-result-object p1

    .line 786
    invoke-virtual {p1}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܳۘܺ;

    .line 787
    invoke-static {v9}, Ll/᩶ۡܺ;->ۧ(Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v0

    const/16 v2, 0x23

    const/4 v3, 0x0

    invoke-direct {p0, p2, v0, v2, v3}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;ILl/ۛܺܺ;)V

    .line 789
    invoke-virtual {p1}, Ll/ܽۘܺ;->᩷()I

    move-result v0

    .line 790
    invoke-virtual {v1}, Ll/᩷ۘܺ;->ܿ()Ll/ܽۘܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۘܺ;->ۧ()I

    move-result v1

    .line 789
    invoke-virtual {p1, v0, v1}, Ll/ܽۘܺ;->֫(II)V

    .line 791
    invoke-virtual {p3, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ֫(Ll/᩷ۘܺ;)V
    .locals 20

    move-object/from16 v0, p0

    .line 225
    new-instance v7, Ll/֨ۖܺ;

    invoke-direct {v7, v0}, Ll/֨ۖܺ;-><init>(Ll/᩷ۘܺ;)V

    .line 708
    new-instance v1, Ll/᩵ۖܺ;

    invoke-direct {v1, v7}, Ll/᩵ۖܺ;-><init>(Ll/֨ۖܺ;)V

    invoke-virtual {v0, v1}, Ll/᩷ۘܺ;->ۧ(Ll/ۧۘܺ;)V

    .line 732
    iget-object v1, v7, Ll/֨ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖܺ;

    .line 733
    iget-object v4, v3, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    sget-object v5, Ll/ۚۖܺ;->ۗ:Ll/ۚۖܺ;

    if-eq v4, v5, :cond_0

    .line 734
    iget-object v4, v3, Ll/֡ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ۖܺ;

    .line 735
    iget-object v6, v3, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    iget-object v8, v5, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    invoke-virtual {v6, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v6

    if-lez v6, :cond_1

    .line 736
    iget-object v6, v3, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    iput-object v6, v5, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    goto :goto_0

    .line 495
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_3
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖܺ;

    .line 496
    iget-boolean v2, v1, Ll/֡ۖܺ;->ܿ:Z

    if-eqz v2, :cond_3

    iget-object v2, v1, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    sget-object v3, Ll/ۚۖܺ;->ۗ:Ll/ۚۖܺ;

    if-eq v2, v3, :cond_4

    goto :goto_1

    .line 501
    :cond_4
    iget-object v1, v1, Ll/֡ۖܺ;->ᩳ:Ljava/util/BitSet;

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v10

    .line 502
    invoke-virtual {v0, v10}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v11

    .line 503
    invoke-direct {v7, v11}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;)Ll/ܳۘܺ;

    move-result-object v12

    .line 506
    invoke-virtual {v12}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-virtual {v1, v9}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v1

    .line 507
    check-cast v1, Ll/֨ܺܺ;

    invoke-virtual {v1}, Ll/֨ܺܺ;->ᩴ()I

    move-result v13

    .line 508
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 510
    new-instance v15, Ljava/util/HashSet;

    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    .line 553
    invoke-virtual {v11}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v16

    const/4 v1, 0x0

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v13, :cond_5

    .line 557
    invoke-virtual/range {v16 .. v16}, Ll/۟ܺܺ;->ᩴ()Ll/۟ܺܺ;

    move-result-object v1

    invoke-static {v1}, Ll/ۨܺܺ;->֫(Ll/۟ܺܺ;)Ll/֨ܺܺ;

    move-result-object v5

    .line 560
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->ܺ()I

    move-result v1

    invoke-static {v1, v5}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v4

    .line 561
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 562
    sget-object v3, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    const/16 v17, 0x5

    move-object v1, v7

    move-object v2, v11

    move-object/from16 v18, v5

    move/from16 v5, v17

    move/from16 v17, v6

    move-object/from16 v6, v18

    invoke-direct/range {v1 .. v6}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;Ll/᩸ۡܺ;ILl/ܰۡܺ;)V

    add-int/lit8 v6, v17, 0x1

    goto :goto_2

    .line 516
    :cond_5
    invoke-virtual {v15, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 517
    invoke-virtual {v15, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 520
    invoke-virtual {v0, v10}, Ll/᩷ۘܺ;->ᩳ(I)Ljava/util/List;

    move-result-object v1

    .line 521
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ll/ܳۘܺ;

    .line 583
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v13

    .line 589
    invoke-virtual {v11}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗۡܺ;->ᩳ()I

    move-result v1

    const/16 v3, 0x22

    if-eq v1, v3, :cond_c

    const/16 v3, 0x39

    if-eq v1, v3, :cond_b

    const/16 v3, 0x26

    if-eq v1, v3, :cond_8

    const/16 v3, 0x27

    if-eq v1, v3, :cond_6

    goto/16 :goto_5

    .line 610
    :cond_6
    invoke-virtual {v11}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v1

    .line 611
    invoke-virtual {v1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v3

    check-cast v3, Ll/֨ܺܺ;

    .line 612
    invoke-virtual {v3}, Ll/֨ܺܺ;->ᩴ()I

    move-result v6

    if-ge v6, v13, :cond_7

    .line 614
    invoke-virtual {v1, v9}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    .line 615
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸ۡܺ;

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/᩸ۡܺ;->ۧ(I)Ll/᩸ۡܺ;

    move-result-object v13

    .line 616
    invoke-static {v1}, Ll/᩶ۡܺ;->ۧ(Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v3

    const/4 v5, 0x2

    const/16 v16, 0x0

    move-object v1, v7

    move-object v2, v11

    move-object v4, v13

    move v9, v6

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;Ll/᩸ۡܺ;ILl/ܰۡܺ;)V

    .line 619
    invoke-virtual {v13}, Ll/᩸ۡܺ;->ܶ()Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v14, v9, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 622
    :cond_7
    invoke-virtual {v1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    invoke-direct {v7, v11, v1, v15}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;Ljava/util/HashSet;)V

    goto :goto_5

    .line 592
    :cond_8
    invoke-direct {v7, v11}, Ll/֨ۖܺ;->ۧ(Ll/ܳۘܺ;)Ll/ܳۘܺ;

    move-result-object v9

    .line 593
    invoke-virtual {v11}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v1

    const/4 v3, 0x1

    .line 594
    invoke-virtual {v1, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v4

    check-cast v4, Ll/֨ܺܺ;

    .line 595
    invoke-virtual {v4}, Ll/֨ܺܺ;->ᩴ()I

    move-result v4

    if-ge v4, v13, :cond_9

    .line 597
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۡܺ;

    .line 598
    invoke-virtual {v9}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/᩸ۡܺ;->ۧ(I)Ll/᩸ۡܺ;

    move-result-object v4

    .line 599
    invoke-static {v1}, Ll/᩶ۡܺ;->ۧ(Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v3

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, v9

    invoke-direct/range {v1 .. v6}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;Ll/᩸ۡܺ;ILl/ܰۡܺ;)V

    goto :goto_4

    .line 603
    :cond_9
    invoke-virtual {v1, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    invoke-direct {v7, v9, v1, v15}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;Ljava/util/HashSet;)V

    .line 604
    invoke-virtual {v9}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۘܺ;

    invoke-virtual {v15, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 606
    :goto_4
    invoke-virtual {v15, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_5
    move-object/from16 v19, v8

    goto/16 :goto_7

    .line 640
    :cond_b
    invoke-virtual {v11}, Ll/ܳۘܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v1

    .line 641
    check-cast v1, Ll/᩷ۡܺ;

    .line 642
    invoke-virtual {v1}, Ll/᩷ۡܺ;->᩵()Ljava/util/ArrayList;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v13, :cond_a

    .line 645
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۡܺ;

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    .line 646
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۖܺ;

    .line 645
    invoke-static {v1, v2}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v5

    .line 647
    sget-object v3, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    .line 648
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ll/ܰۡܺ;

    const/16 v18, 0x5

    move-object v1, v7

    move-object v2, v11

    move-object v4, v5

    move-object/from16 v19, v8

    move-object v8, v5

    move/from16 v5, v18

    move-object/from16 v18, v9

    move v9, v6

    move-object/from16 v6, v16

    .line 647
    invoke-direct/range {v1 .. v6}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;Ll/᩸ۡܺ;ILl/ܰۡܺ;)V

    .line 650
    invoke-virtual {v14, v9, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v9, 0x1

    move-object/from16 v9, v18

    move-object/from16 v8, v19

    goto :goto_6

    :cond_c
    move-object/from16 v19, v8

    .line 627
    invoke-virtual {v12}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v1

    .line 629
    invoke-direct {v7, v11}, Ll/֨ۖܺ;->ۧ(Ll/ܳۘܺ;)Ll/ܳۘܺ;

    move-result-object v8

    .line 630
    sget-object v3, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    .line 631
    invoke-virtual {v8}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v4

    const/4 v5, 0x5

    move-object v6, v1

    check-cast v6, Ll/ܰۡܺ;

    move-object v1, v7

    move-object v2, v8

    .line 630
    invoke-direct/range {v1 .. v6}, Ll/֨ۖܺ;->֫(Ll/ܳۘܺ;Ll/᩶ۡܺ;Ll/᩸ۡܺ;ILl/ܰۡܺ;)V

    .line 633
    invoke-virtual {v15, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 524
    :goto_7
    invoke-virtual {v15, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, v19

    const/4 v9, 0x0

    goto/16 :goto_3

    :cond_d
    move-object/from16 v19, v8

    .line 528
    invoke-virtual {v0, v15}, Ll/᩷ۘܺ;->֫(Ljava/util/HashSet;)V

    .line 529
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->ۖ()V

    .line 532
    iget v1, v7, Ll/֨ۖܺ;->ۧ:I

    invoke-static {v1, v0}, Ll/ᩳۘܺ;->֫(ILl/᩷ۘܺ;)V

    const/4 v3, 0x0

    .line 662
    :goto_8
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->ۜ()I

    move-result v4

    if-ge v3, v4, :cond_12

    .line 663
    invoke-virtual {v0, v3}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v4

    if-eqz v4, :cond_10

    .line 666
    invoke-virtual {v4}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v5

    if-eqz v5, :cond_10

    .line 667
    invoke-virtual {v4}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۗۡܺ;->ᩳ()I

    move-result v5

    if-eq v5, v2, :cond_e

    goto :goto_a

    .line 671
    :cond_e
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->᩷()[Ljava/util/ArrayList;

    move-result-object v5

    .line 672
    invoke-virtual {v4}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v6

    const/4 v8, 0x0

    invoke-virtual {v6, v8}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v6

    .line 673
    invoke-virtual {v4}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v4

    .line 676
    invoke-virtual {v6}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v9

    if-ge v9, v1, :cond_f

    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v9

    if-ge v9, v1, :cond_f

    goto :goto_b

    .line 681
    :cond_f
    new-instance v9, Ll/ۘۖܺ;

    invoke-direct {v9, v7, v4, v6}, Ll/ۘۖܺ;-><init>(Ll/֨ۖܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)V

    .line 698
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    aget-object v4, v5, v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳۘܺ;

    .line 699
    invoke-virtual {v5, v9}, Ll/ܳۘܺ;->ۧ(Ll/ۗۘۢ;)V

    goto :goto_9

    :cond_10
    :goto_a
    const/4 v8, 0x0

    :cond_11
    :goto_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_12
    move-object/from16 v8, v19

    goto/16 :goto_1

    :cond_13
    return-void
.end method

.method private ֫(Ll/᩸ۡܺ;Ll/֡ۖܺ;)V
    .locals 10

    .line 341
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 342
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_13

    const/4 p1, 0x1

    .line 0
    invoke-static {v0, p1}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    .line 347
    check-cast v1, Ll/᩸ۡܺ;

    .line 348
    iget-object v2, p0, Ll/֨ۖܺ;->ܽ:Ll/᩷ۘܺ;

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/᩷ۘܺ;->ᩳ(I)Ljava/util/List;

    move-result-object v2

    .line 351
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳۘܺ;

    .line 352
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v4

    const/4 v5, 0x0

    .line 354
    iget-object v6, p0, Ll/֨ۖܺ;->֫:Ljava/util/ArrayList;

    if-nez v4, :cond_6

    .line 377
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v4

    invoke-direct {p0, v4}, Ll/֨ۖܺ;->֫(Ll/᩸ۡܺ;)I

    move-result v4

    .line 378
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-eq v4, v7, :cond_5

    .line 380
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖܺ;

    if-eq v3, p2, :cond_1

    .line 383
    iput-boolean v5, p2, Ll/֡ۖܺ;->ܿ:Z

    .line 384
    iget-object v5, p2, Ll/֡ۖܺ;->ᩳ:Ljava/util/BitSet;

    iget-object v7, v3, Ll/֡ۖܺ;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {v5, v7}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 385
    iget-object v5, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    iget-object v7, v3, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    invoke-virtual {v5, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-gez v5, :cond_2

    .line 386
    iget-object v5, v3, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    iput-object v5, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    .line 206
    :cond_2
    iget-object v5, v3, Ll/֡ۖܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ۖܺ;

    .line 207
    iget-object v8, v7, Ll/֡ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 208
    iget-object v8, v7, Ll/֡ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    iget-object v8, p2, Ll/֡ۖܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 211
    :cond_3
    iget-object v5, v3, Ll/֡ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ۖܺ;

    .line 212
    iget-object v8, v7, Ll/֡ۖܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 213
    iget-object v8, v7, Ll/֡ۖܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    iget-object v8, p2, Ll/֡ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 389
    :cond_4
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto/16 :goto_0

    .line 393
    :cond_5
    iget-object v4, p2, Ll/֡ۖܺ;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {v3}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/util/BitSet;->set(I)V

    .line 394
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 410
    :cond_6
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۗۡܺ;->ᩳ()I

    move-result v4

    const/4 v7, 0x2

    if-eq v4, v7, :cond_12

    const/16 v8, 0x21

    if-eq v4, v8, :cond_11

    const/16 v8, 0x23

    if-eq v4, v8, :cond_11

    const/16 v8, 0x2b

    if-eq v4, v8, :cond_10

    const/4 v8, 0x7

    if-eq v4, v8, :cond_10

    const/16 v8, 0x8

    if-eq v4, v8, :cond_10

    const/16 v8, 0x26

    if-eq v4, v8, :cond_f

    const/16 v8, 0x27

    if-eq v4, v8, :cond_7

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_0

    .line 473
    :pswitch_0
    sget-object v3, Ll/ۚۖܺ;->᩹:Ll/ۚۖܺ;

    iput-object v3, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    goto/16 :goto_0

    .line 427
    :cond_7
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v4

    invoke-virtual {v4, v7}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    .line 428
    invoke-virtual {v4}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v4

    invoke-interface {v4}, Ll/֫ۖܺ;->ۡ()Z

    move-result v4

    if-nez v4, :cond_8

    .line 430
    iput-boolean v5, p2, Ll/֡ۖܺ;->ܿ:Z

    .line 435
    :cond_8
    :pswitch_1
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v4

    invoke-virtual {v4, v5}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    .line 436
    invoke-virtual {v4}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v4

    invoke-interface {v4}, Ll/֫ۖܺ;->ܿ()I

    move-result v4

    const/16 v7, 0x9

    if-eq v4, v7, :cond_9

    goto/16 :goto_0

    .line 439
    :cond_9
    iput-boolean v5, p2, Ll/֡ۖܺ;->ܿ:Z

    iget-object v4, p2, Ll/֡ۖܺ;->֫:Ljava/util/ArrayList;

    iget-object v7, p2, Ll/֡ۖܺ;->ܽ:Ljava/util/ArrayList;

    .line 442
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v3

    .line 443
    invoke-virtual {v3, v5}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v8

    invoke-virtual {v8}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v8

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v9

    if-ne v8, v9, :cond_c

    .line 444
    invoke-virtual {v3, p1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-direct {p0, v3}, Ll/֨ۖܺ;->֫(Ll/᩸ۡܺ;)I

    move-result v3

    .line 445
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-eq v3, v4, :cond_1

    .line 446
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖܺ;

    .line 189
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    .line 190
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    :cond_a
    iget-object v4, v3, Ll/֡ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    .line 193
    iget-object v4, v3, Ll/֡ۖܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 448
    :cond_b
    iget-object v4, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    iget-object v5, v3, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_1

    .line 449
    iget-object v3, v3, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    iput-object v3, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    goto/16 :goto_0

    .line 453
    :cond_c
    invoke-virtual {v3, v5}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-direct {p0, v3}, Ll/֨ۖܺ;->֫(Ll/᩸ۡܺ;)I

    move-result v3

    .line 454
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-eq v3, v5, :cond_1

    .line 455
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖܺ;

    .line 189
    iget-object v5, v3, Ll/֡ۖܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v5, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 190
    iget-object v5, v3, Ll/֡ۖܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v5, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    :cond_d
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    .line 193
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    :cond_e
    iget-object v4, v3, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    iget-object v5, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_1

    .line 458
    iget-object v4, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    iput-object v4, v3, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    goto/16 :goto_0

    .line 465
    :cond_f
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v3

    invoke-virtual {v3, p1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    .line 466
    invoke-virtual {v3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v3

    invoke-interface {v3}, Ll/֫ۖܺ;->ۡ()Z

    move-result v3

    if-nez v3, :cond_1

    .line 468
    iput-boolean v5, p2, Ll/֡ۖܺ;->ܿ:Z

    goto/16 :goto_0

    .line 421
    :cond_10
    iget-object v3, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    sget-object v4, Ll/ۚۖܺ;->ۙ:Ll/ۚۖܺ;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_1

    .line 422
    iput-object v4, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    goto/16 :goto_0

    .line 483
    :cond_11
    :pswitch_2
    sget-object v3, Ll/ۚۖܺ;->᩶:Ll/ۚۖܺ;

    iput-object v3, p2, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    goto/16 :goto_0

    .line 414
    :cond_12
    iget-object v4, p2, Ll/֡ۖܺ;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {v3}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/util/BitSet;->set(I)V

    .line 415
    invoke-virtual {v3}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_13
    return-void

    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private ۧ(Ll/ܳۘܺ;)Ll/ܳۘܺ;
    .locals 2

    .line 173
    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۘܺ;->ۘ()Ljava/util/BitSet;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result p1

    .line 174
    iget-object v1, p0, Ll/֨ۖܺ;->ܽ:Ll/᩷ۘܺ;

    invoke-virtual {v1}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۘܺ;

    invoke-virtual {p1}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object p1

    .line 175
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۘܺ;

    return-object p1
.end method
