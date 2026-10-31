.class public final Ll/ܽۘܺ;
.super Ljava/lang/Object;
.source "FBHL"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public ۖ:Ljava/util/BitSet;

.field public final ۜ:Ll/᩷ۘܺ;

.field public final ۡ:I

.field public ۢ:I

.field public final ۧ:I

.field public ܳ:I

.field public ܺ:Ll/᩷ᩴܺ;

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:Ll/ۢᩴܺ;

.field public ᩳ:Ll/ۢᩴܺ;

.field public ᩷:Ljava/util/BitSet;

.field public ᩻:I


# direct methods
.method public constructor <init>(IILl/᩷ۘܺ;)V
    .locals 1

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 76
    iput v0, p0, Ll/ܽۘܺ;->ۢ:I

    const/4 v0, 0x0

    .line 102
    iput v0, p0, Ll/ܽۘܺ;->᩻:I

    .line 108
    iput v0, p0, Ll/ܽۘܺ;->ܳ:I

    .line 131
    iput-object p3, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    .line 132
    iput p1, p0, Ll/ܽۘܺ;->ۧ:I

    .line 133
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    .line 134
    iput p2, p0, Ll/ܽۘܺ;->ۡ:I

    .line 136
    new-instance p1, Ljava/util/BitSet;

    invoke-virtual {p3}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    .line 137
    new-instance p1, Ljava/util/BitSet;

    invoke-virtual {p3}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    .line 138
    new-instance p1, Ll/᩷ᩴܺ;

    invoke-direct {p1}, Ll/᩷ᩴܺ;-><init>()V

    iput-object p1, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    .line 140
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܽۘܺ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method private ֨()I
    .locals 4

    .line 301
    iget-object v0, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 303
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳۘܺ;

    .line 304
    instance-of v3, v3, Ll/ܰۖܺ;

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method

.method public static ֫(Ll/۬ۡܺ;ILl/᩷ۘܺ;)Ll/ܽۘܺ;
    .locals 8

    .line 154
    invoke-virtual {p0}, Ll/۬ۡܺ;->֫()Ll/ܿۡܺ;

    move-result-object v0

    .line 155
    invoke-virtual {v0, p1}, Ll/ܿᩴܺ;->get(I)Ll/ܽۡܺ;

    move-result-object v1

    .line 156
    new-instance v2, Ll/ܽۘܺ;

    .line 157
    invoke-virtual {v1}, Ll/ܽۡܺ;->֫()I

    move-result v3

    invoke-direct {v2, p1, v3, p2}, Ll/ܽۘܺ;-><init>(IILl/᩷ۘܺ;)V

    .line 158
    invoke-virtual {v1}, Ll/ܽۡܺ;->ᩳ()Ll/ۖۡܺ;

    move-result-object p1

    .line 160
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result p2

    iget-object v3, v2, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 162
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, p2, :cond_0

    .line 163
    new-instance v6, Ll/۫ۖܺ;

    invoke-virtual {p1, v5}, Ll/ܿᩴܺ;->get(I)Ll/ܺۡܺ;

    move-result-object v7

    invoke-direct {v6, v7, v2}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 168
    :cond_0
    invoke-virtual {v1}, Ll/ܽۡܺ;->֫()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۬ۡܺ;->֫(I)Ll/᩷ᩴܺ;

    move-result-object p0

    .line 166
    invoke-static {v0, p0}, Ll/᩷ۘܺ;->֫(Ll/ܿۡܺ;Ll/᩷ᩴܺ;)Ljava/util/BitSet;

    move-result-object p0

    iput-object p0, v2, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    .line 171
    invoke-virtual {v1}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/᩷ۘܺ;->֫(Ll/ܿۡܺ;Ll/᩷ᩴܺ;)Ljava/util/BitSet;

    move-result-object p0

    iput-object p0, v2, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    .line 175
    invoke-virtual {v1}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object p0

    .line 178
    new-instance p1, Ll/᩷ᩴܺ;

    invoke-virtual {p0}, Ll/᩷ᩴܺ;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ll/᩷ᩴܺ;-><init>(I)V

    .line 180
    invoke-virtual {p0}, Ll/᩷ᩴܺ;->size()I

    move-result p2

    :goto_1
    if-ge v4, p2, :cond_1

    .line 181
    invoke-virtual {p0, v4}, Ll/᩷ᩴܺ;->get(I)I

    move-result v3

    invoke-virtual {v0, v3}, Ll/ܺᩴܺ;->ᩳ(I)I

    move-result v3

    invoke-virtual {p1, v3}, Ll/᩷ᩴܺ;->add(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 174
    :cond_1
    iput-object p1, v2, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    .line 177
    invoke-virtual {p1}, Ll/᩷ᩴܺ;->size()I

    move-result p0

    if-eqz p0, :cond_3

    .line 178
    invoke-virtual {v1}, Ll/ܽۡܺ;->ܳ()I

    move-result p0

    if-gez p0, :cond_2

    const/4 p0, -0x1

    goto :goto_2

    .line 181
    :cond_2
    invoke-virtual {v0, p0}, Ll/ܺᩴܺ;->ᩳ(I)I

    move-result p0

    :goto_2
    iput p0, v2, Ll/ܽۘܺ;->ۢ:I

    :cond_3
    return-object v2
.end method

.method private ֫(Ljava/util/List;)V
    .locals 12

    .line 705
    new-instance v0, Ljava/util/BitSet;

    iget-object v1, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v1}, Ll/᩷ۘܺ;->ۜ()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/BitSet;-><init>(I)V

    .line 708
    new-instance v2, Ljava/util/BitSet;

    invoke-virtual {v1}, Ll/᩷ۘܺ;->ۜ()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 710
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_8

    move v6, v5

    :goto_1
    if-ge v6, v3, :cond_2

    .line 720
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܳۘܺ;

    invoke-virtual {v7}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v7

    invoke-virtual {v7, v4}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v7

    .line 670
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v8

    invoke-virtual {v0, v8}, Ljava/util/BitSet;->set(I)V

    .line 671
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ۧ()I

    move-result v8

    const/4 v9, 0x1

    if-le v8, v9, :cond_0

    .line 672
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v7

    add-int/2addr v7, v9

    invoke-virtual {v0, v7}, Ljava/util/BitSet;->set(I)V

    .line 723
    :cond_0
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܳۘܺ;

    invoke-virtual {v7}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v7

    .line 670
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v8

    invoke-virtual {v2, v8}, Ljava/util/BitSet;->set(I)V

    .line 671
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ۧ()I

    move-result v8

    if-le v8, v9, :cond_1

    .line 672
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v7

    add-int/2addr v7, v9

    invoke-virtual {v2, v7}, Ljava/util/BitSet;->set(I)V

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    move v6, v5

    move v7, v6

    :goto_2
    if-ge v6, v3, :cond_4

    .line 731
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܳۘܺ;

    .line 737
    invoke-virtual {v8}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v8

    invoke-static {v0, v8}, Ll/ܽۘܺ;->֫(Ljava/util/BitSet;Ll/᩸ۡܺ;)Z

    move-result v8

    if-nez v8, :cond_3

    add-int/lit8 v8, v7, 0x1

    .line 738
    invoke-static {p1, v6, v7}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    move v7, v8

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    if-ne v5, v7, :cond_7

    move v5, v7

    :goto_3
    if-ge v5, v3, :cond_6

    .line 752
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܳۘܺ;

    .line 753
    invoke-virtual {v6}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v8

    invoke-static {v0, v8}, Ll/ܽۘܺ;->֫(Ljava/util/BitSet;Ll/᩸ۡܺ;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 755
    invoke-virtual {v6}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v8

    invoke-virtual {v8, v4}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v8

    .line 754
    invoke-static {v2, v8}, Ll/ܽۘܺ;->֫(Ljava/util/BitSet;Ll/᩸ۡܺ;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 762
    invoke-static {p1, v7, v5}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    goto :goto_4

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    const/4 v6, 0x0

    .line 769
    :goto_4
    invoke-virtual {v6}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v3

    .line 771
    invoke-virtual {v3}, Ll/᩸ۡܺ;->ۧ()I

    move-result v5

    invoke-virtual {v1, v5}, Ll/᩷ۘܺ;->ۧ(I)I

    move-result v5

    .line 770
    invoke-virtual {v3, v5}, Ll/᩸ۡܺ;->ۧ(I)Ll/᩸ۡܺ;

    move-result-object v5

    .line 773
    new-instance v8, Ll/۫ۖܺ;

    new-instance v9, Ll/֨ۡܺ;

    .line 774
    invoke-virtual {v3}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v10

    invoke-static {v10}, Ll/۫ۡܺ;->ۧ(Ll/֫ۖܺ;)Ll/ۗۡܺ;

    move-result-object v10

    sget-object v11, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    .line 777
    invoke-virtual {v6}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v6

    invoke-direct {v9, v10, v11, v5, v6}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    invoke-direct {v8, v9, p0}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    add-int/lit8 v6, v7, 0x1

    .line 779
    invoke-interface {p1, v7, v8}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 781
    invoke-static {v5}, Ll/᩶ۡܺ;->ۧ(Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v5

    .line 783
    new-instance v7, Ll/۫ۖܺ;

    new-instance v8, Ll/֨ۡܺ;

    .line 784
    invoke-virtual {v3}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v9

    invoke-static {v9}, Ll/۫ۡܺ;->ۧ(Ll/֫ۖܺ;)Ll/ۗۡܺ;

    move-result-object v9

    invoke-direct {v8, v9, v11, v3, v5}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    invoke-direct {v7, v8, p0}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    .line 789
    invoke-interface {p1, v6, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 792
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    move v5, v6

    goto :goto_5

    :cond_7
    move v5, v7

    .line 795
    :goto_5
    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 796
    invoke-virtual {v2}, Ljava/util/BitSet;->clear()V

    goto/16 :goto_0

    :cond_8
    return-void
.end method

.method public static ֫(Ljava/util/BitSet;Ll/᩸ۡܺ;)Z
    .locals 3

    .line 686
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 687
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ۧ()I

    move-result p1

    .line 689
    invoke-virtual {p0, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    add-int/2addr v0, v2

    .line 690
    invoke-virtual {p0, v0}, Ljava/util/BitSet;->get(I)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v2
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 992
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܽۘܺ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܽۘܺ;->ۡ:I

    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()V
    .locals 3

    const/4 v0, 0x0

    .line 290
    invoke-direct {p0}, Ll/ܽۘܺ;->֨()I

    move-result v1

    iget-object v2, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final ֫()Ljava/util/ArrayList;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ܽۘܺ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 821
    iget-object v0, p0, Ll/ܽۘܺ;->ᩳ:Ll/ۢᩴܺ;

    if-nez v0, :cond_1

    .line 822
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۜ()I

    move-result v0

    const/16 v1, 0xc00

    if-gt v0, v1, :cond_0

    .line 94
    new-instance v1, Ll/᩺ۘܺ;

    invoke-direct {v1, v0}, Ll/᩺ۘܺ;-><init>(I)V

    goto :goto_0

    .line 95
    :cond_0
    new-instance v1, Ll/ۘᩴܺ;

    invoke-direct {v1}, Ll/ۘᩴܺ;-><init>()V

    .line 822
    :goto_0
    iput-object v1, p0, Ll/ܽۘܺ;->ᩳ:Ll/ۢᩴܺ;

    .line 825
    :cond_1
    iget-object v0, p0, Ll/ܽۘܺ;->ᩳ:Ll/ۢᩴܺ;

    invoke-interface {v0, p1}, Ll/ۢᩴܺ;->add(I)V

    return-void
.end method

.method public final ֫(II)V
    .locals 2

    if-ne p1, p2, :cond_0

    return-void

    .line 508
    :cond_0
    iget-object v0, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    invoke-virtual {v0, p2}, Ljava/util/BitSet;->set(I)V

    .line 510
    iget v0, p0, Ll/ܽۘܺ;->ۢ:I

    if-ne v0, p1, :cond_1

    .line 511
    iput p2, p0, Ll/ܽۘܺ;->ۢ:I

    .line 514
    :cond_1
    iget-object v0, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v0

    :cond_2
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_3

    .line 515
    iget-object v1, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v1, v0}, Ll/᩷ᩴܺ;->get(I)I

    move-result v1

    if-ne v1, p1, :cond_2

    .line 516
    iget-object v1, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v1, v0, p2}, Ll/᩷ᩴܺ;->set(II)V

    goto :goto_0

    .line 520
    :cond_3
    iget-object v0, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->clear(I)V

    .line 523
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܽۘܺ;

    iget-object p2, p2, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    iget v1, p0, Ll/ܽۘܺ;->ۧ:I

    invoke-virtual {p2, v1}, Ljava/util/BitSet;->set(I)V

    .line 526
    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۘܺ;

    iget-object p1, p1, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    invoke-virtual {p1, v1}, Ljava/util/BitSet;->clear(I)V

    return-void
.end method

.method public final ֫(Ll/ܺۡܺ;)V
    .locals 2

    .line 64
    new-instance v0, Ll/۫ۖܺ;

    invoke-direct {v0, p1, p0}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    .line 235
    iget-object p1, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-direct {p0}, Ll/ܽۘܺ;->֨()I

    move-result v1

    invoke-virtual {p1, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 574
    iget-object p1, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ll/᩷ۘܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;)V

    .line 575
    invoke-virtual {p1, v0, v1}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)V

    return-void
.end method

.method public final ֫(Ll/ܽۘܺ;)V
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ܽۘܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ܿۘܺ;)V
    .locals 4

    .line 981
    iget-object v0, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 983
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳۘܺ;

    invoke-virtual {v3, p1}, Ll/ܳۘܺ;->֫(Ll/ܿۘܺ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩸ۡܺ;)V
    .locals 2

    .line 224
    new-instance v0, Ll/ܰۖܺ;

    invoke-direct {v0, p1, p0}, Ll/ܰۖܺ;-><init>(Ll/᩸ۡܺ;Ll/ܽۘܺ;)V

    iget-object p1, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/᩸ۡܺ;Ll/᩸ۡܺ;)V
    .locals 8

    .line 588
    iget-object v0, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_5

    .line 592
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-virtual {p2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    if-ne v0, v2, :cond_0

    goto/16 :goto_3

    .line 0
    :cond_0
    iget-object v0, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 602
    check-cast v2, Ll/۫ۖܺ;

    .line 604
    invoke-virtual {v2}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Ll/۫ۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܿᩴܺ;->size()I

    move-result v2

    if-lez v2, :cond_1

    goto :goto_0

    .line 630
    :cond_1
    invoke-static {p2}, Ll/᩶ۡܺ;->ۧ(Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object p2

    .line 631
    new-instance v2, Ll/۫ۖܺ;

    new-instance v3, Ll/֨ۡܺ;

    .line 632
    invoke-virtual {p1}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v4

    invoke-static {v4}, Ll/۫ۡܺ;->ۧ(Ll/֫ۖܺ;)Ll/ۗۡܺ;

    move-result-object v4

    sget-object v5, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    invoke-direct {v3, v4, v5, p1, p2}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    invoke-direct {v2, v3, p0}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    .line 635
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 637
    iget p1, p0, Ll/ܽۘܺ;->᩻:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ܽۘܺ;->᩻:I

    return-void

    .line 615
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    :goto_1
    if-ltz v0, :cond_4

    .line 621
    iget-object v2, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v2}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۘܺ;

    .line 622
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    invoke-virtual {p2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    if-ne v3, v4, :cond_3

    goto :goto_2

    .line 653
    :cond_3
    invoke-static {p2}, Ll/᩶ۡܺ;->ۧ(Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v3

    .line 654
    new-instance v4, Ll/۫ۖܺ;

    new-instance v5, Ll/֨ۡܺ;

    .line 655
    invoke-virtual {p1}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v6

    invoke-static {v6}, Ll/۫ۡܺ;->ۧ(Ll/֫ۖܺ;)Ll/ۗۡܺ;

    move-result-object v6

    sget-object v7, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    invoke-direct {v5, v6, v7, p1, v3}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    invoke-direct {v4, v5, v2}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    .line 658
    iget-object v3, v2, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-direct {v2}, Ll/ܽۘܺ;->֨()I

    move-result v5

    invoke-virtual {v3, v5, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 659
    iget v3, v2, Ll/ܽۘܺ;->ܳ:I

    add-int/2addr v3, v1

    iput v3, v2, Ll/ܽۘܺ;->ܳ:I

    .line 617
    :goto_2
    iget-object v2, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    goto :goto_1

    :cond_4
    :goto_3
    return-void

    .line 589
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Inserting a move to a block with multiple successors"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩺ۖܺ;)V
    .locals 5

    .line 265
    iget-object v0, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 268
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳۘܺ;

    .line 269
    instance-of v4, v3, Ll/ܰۖܺ;

    if-eqz v4, :cond_0

    .line 270
    check-cast v3, Ll/ܰۖܺ;

    invoke-interface {p1, v3}, Ll/᩺ۖܺ;->֫(Ll/ܰۖܺ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۖ()Ll/᩷ᩴܺ;
    .locals 1

    .line 367
    iget-object v0, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    return-object v0
.end method

.method public final ۘ()Ljava/util/BitSet;
    .locals 1

    .line 359
    iget-object v0, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    return-object v0
.end method

.method public final ۚ()V
    .locals 4

    .line 873
    iget v0, p0, Ll/ܽۘܺ;->ܳ:I

    iget-object v1, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    const/4 v3, 0x0

    .line 876
    invoke-virtual {v1, v3, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 878
    invoke-direct {p0, v0}, Ll/ܽۘܺ;->֫(Ljava/util/List;)V

    .line 880
    iget v0, p0, Ll/ܽۘܺ;->ܳ:I

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۘܺ;

    .line 887
    invoke-virtual {v0}, Ll/ܳۘܺ;->֡()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 894
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected: moves from phis before move-exception"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 962
    :cond_1
    :goto_0
    iget v0, p0, Ll/ܽۘܺ;->᩻:I

    if-le v0, v2, :cond_2

    .line 964
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v3, p0, Ll/ܽۘܺ;->᩻:I

    sub-int/2addr v0, v3

    sub-int/2addr v0, v2

    .line 965
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v2

    .line 964
    invoke-virtual {v1, v0, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 963
    invoke-direct {p0, v0}, Ll/ܽۘܺ;->֫(Ljava/util/List;)V

    .line 969
    :cond_2
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۘ()V

    return-void
.end method

.method public final ۜ()Ll/ܽۘܺ;
    .locals 2

    .line 390
    iget v0, p0, Ll/ܽۘܺ;->ۢ:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 393
    :cond_0
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Ll/ܽۘܺ;->ۢ:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۘܺ;

    return-object v0
.end method

.method public final ۡ()I
    .locals 1

    .line 338
    iget v0, p0, Ll/ܽۘܺ;->ۡ:I

    return v0
.end method

.method public final ۢ()I
    .locals 2

    .line 382
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    iget v1, p0, Ll/ܽۘܺ;->ۢ:I

    invoke-virtual {v0, v1}, Ll/᩷ۘܺ;->֫(I)I

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 331
    iget v0, p0, Ll/ܽۘܺ;->ۧ:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 2

    .line 807
    iget-object v0, p0, Ll/ܽۘܺ;->ܿ:Ll/ۢᩴܺ;

    if-nez v0, :cond_1

    .line 808
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۜ()I

    move-result v0

    const/16 v1, 0xc00

    if-gt v0, v1, :cond_0

    .line 94
    new-instance v1, Ll/᩺ۘܺ;

    invoke-direct {v1, v0}, Ll/᩺ۘܺ;-><init>(I)V

    goto :goto_0

    .line 95
    :cond_0
    new-instance v1, Ll/ۘᩴܺ;

    invoke-direct {v1}, Ll/ۘᩴܺ;-><init>()V

    .line 808
    :goto_0
    iput-object v1, p0, Ll/ܽۘܺ;->ܿ:Ll/ۢᩴܺ;

    .line 811
    :cond_1
    iget-object v0, p0, Ll/ܽۘܺ;->ܿ:Ll/ۢᩴܺ;

    invoke-interface {v0, p1}, Ll/ۢᩴܺ;->add(I)V

    return-void
.end method

.method public final ۧ(Ll/ܺۡܺ;)V
    .locals 4

    .line 246
    invoke-virtual {p1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡܺ;->ۧ()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 0
    iget-object v0, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 250
    check-cast v2, Ll/ܳۘܺ;

    .line 64
    new-instance v3, Ll/۫ۖܺ;

    invoke-direct {v3, p1, p0}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    .line 253
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 255
    iget-object p1, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {p1, v2}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;)V

    const/4 v0, 0x0

    .line 574
    invoke-virtual {p1, v3, v0}, Ll/᩷ۘܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;)V

    .line 575
    invoke-virtual {p1, v3, v0}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)V

    return-void

    .line 247
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "last insn must branch"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/ܽۘܺ;)V
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 562
    :cond_0
    iget-object v0, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 567
    iget-object v0, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    iget v1, p1, Ll/ܽۘܺ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 568
    iget-object v0, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v0, v1}, Ll/᩷ᩴܺ;->add(I)V

    .line 569
    iput v1, p0, Ll/ܽۘܺ;->ۢ:I

    .line 570
    iget-object p1, p1, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    iget v0, p0, Ll/ܽۘܺ;->ۧ:I

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->set(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ܳ()Ljava/util/List;
    .locals 3

    const/4 v0, 0x0

    .line 324
    invoke-direct {p0}, Ll/ܽۘܺ;->֨()I

    move-result v1

    iget-object v2, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()Ll/᩷ᩴܺ;
    .locals 5

    .line 401
    new-instance v0, Ll/᩷ᩴܺ;

    iget-object v1, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v1}, Ll/᩷ᩴܺ;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ll/᩷ᩴܺ;-><init>(I)V

    .line 403
    iget-object v1, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v1}, Ll/᩷ᩴܺ;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 406
    iget-object v3, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v3, v2}, Ll/᩷ᩴܺ;->get(I)I

    move-result v3

    iget-object v4, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v4, v3}, Ll/᩷ۘܺ;->֫(I)I

    move-result v3

    invoke-virtual {v0, v3}, Ll/᩷ᩴܺ;->add(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 1

    .line 317
    iget-object v0, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܽ(Ll/ܽۘܺ;)Ll/ܽۘܺ;
    .locals 6

    .line 462
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۡ()Ll/ܽۘܺ;

    move-result-object v0

    iget v1, v0, Ll/ܽۘܺ;->ۧ:I

    .line 464
    iget-object v2, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    iget v3, p1, Ll/ܽۘܺ;->ۧ:I

    iget v4, p1, Ll/ܽۘܺ;->ۧ:I

    invoke-virtual {v2, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 470
    iget-object v2, v0, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    iget v3, p0, Ll/ܽۘܺ;->ۧ:I

    invoke-virtual {v2, v3}, Ljava/util/BitSet;->set(I)V

    .line 471
    iget-object v2, v0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    invoke-virtual {v2, v4}, Ljava/util/BitSet;->set(I)V

    .line 472
    iget-object v2, v0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v2, v4}, Ll/᩷ᩴܺ;->add(I)V

    .line 473
    iput v4, v0, Ll/ܽۘܺ;->ۢ:I

    .line 476
    iget-object v2, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v2}, Ll/᩷ᩴܺ;->size()I

    move-result v2

    :cond_0
    :goto_0
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_1

    .line 477
    iget-object v5, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v5, v2}, Ll/᩷ᩴܺ;->get(I)I

    move-result v5

    if-ne v5, v4, :cond_0

    .line 478
    iget-object v5, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v5, v2, v1}, Ll/᩷ᩴܺ;->set(II)V

    goto :goto_0

    .line 482
    :cond_1
    iget v2, p0, Ll/ܽۘܺ;->ۢ:I

    if-ne v2, v4, :cond_2

    .line 483
    iput v1, p0, Ll/ܽۘܺ;->ۢ:I

    .line 485
    :cond_2
    iget-object v2, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    invoke-virtual {v2, v4}, Ljava/util/BitSet;->clear(I)V

    .line 486
    iget-object v2, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->set(I)V

    .line 489
    iget-object v2, p1, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->set(I)V

    .line 490
    iget-object p1, p1, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    iget-object v1, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    invoke-virtual {v1, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    invoke-virtual {p1, v3, v1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0

    .line 465
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Block "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    iget p1, p1, Ll/ܽۘܺ;->ۡ:I

    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    .line 465
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " not successor of "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    iget p1, p0, Ll/ܽۘܺ;->ۡ:I

    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    .line 466
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(I)V
    .locals 2

    .line 213
    new-instance v0, Ll/ܰۖܺ;

    invoke-direct {v0, p1, p0}, Ll/ܰۖܺ;-><init>(ILl/ܽۘܺ;)V

    iget-object p1, p0, Ll/ܽۘܺ;->ܽ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public final ܿ()Ll/᩷ۘܺ;
    .locals 1

    .line 415
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    return-object v0
.end method

.method public final ᩳ()Ll/ۢᩴܺ;
    .locals 2

    .line 848
    iget-object v0, p0, Ll/ܽۘܺ;->ܿ:Ll/ۢᩴܺ;

    if-nez v0, :cond_1

    .line 849
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۜ()I

    move-result v0

    const/16 v1, 0xc00

    if-gt v0, v1, :cond_0

    .line 94
    new-instance v1, Ll/᩺ۘܺ;

    invoke-direct {v1, v0}, Ll/᩺ۘܺ;-><init>(I)V

    goto :goto_0

    .line 95
    :cond_0
    new-instance v1, Ll/ۘᩴܺ;

    invoke-direct {v1}, Ll/ۘᩴܺ;-><init>()V

    .line 849
    :goto_0
    iput-object v1, p0, Ll/ܽۘܺ;->ܿ:Ll/ۢᩴܺ;

    .line 851
    :cond_1
    iget-object v0, p0, Ll/ܽۘܺ;->ܿ:Ll/ۢᩴܺ;

    return-object v0
.end method

.method public final ᩳ(I)V
    .locals 3

    .line 537
    iget-object v0, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-ltz v0, :cond_1

    .line 538
    iget-object v2, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v2, v0}, Ll/᩷ᩴܺ;->get(I)I

    move-result v2

    if-ne v2, p1, :cond_0

    move v1, v0

    goto :goto_1

    .line 541
    :cond_0
    iget-object v2, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v2, v0}, Ll/᩷ᩴܺ;->get(I)I

    move-result v2

    iput v2, p0, Ll/ܽۘܺ;->ۢ:I

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 545
    :cond_1
    iget-object v0, p0, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v0, v1}, Ll/᩷ᩴܺ;->ۧ(I)V

    .line 546
    iget-object v0, p0, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->clear(I)V

    .line 547
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۘܺ;

    iget-object p1, p1, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    iget v0, p0, Ll/ܽۘܺ;->ۧ:I

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->clear(I)V

    return-void
.end method

.method public final ᩴ()Ll/ܽۘܺ;
    .locals 6

    .line 425
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۡ()Ll/ܽۘܺ;

    move-result-object v1

    .line 428
    iget-object v2, p0, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    iput-object v2, v1, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    .line 429
    iget-object v2, v1, Ll/ܽۘܺ;->ۖ:Ljava/util/BitSet;

    iget v3, p0, Ll/ܽۘܺ;->ۧ:I

    invoke-virtual {v2, v3}, Ljava/util/BitSet;->set(I)V

    .line 430
    iget-object v2, v1, Ll/ܽۘܺ;->ܺ:Ll/᩷ᩴܺ;

    invoke-virtual {v2, v3}, Ll/᩷ᩴܺ;->add(I)V

    .line 431
    iput v3, v1, Ll/ܽۘܺ;->ۢ:I

    .line 435
    new-instance v2, Ljava/util/BitSet;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/BitSet;-><init>(I)V

    iput-object v2, p0, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    .line 436
    iget v4, v1, Ll/ܽۘܺ;->ۧ:I

    invoke-virtual {v2, v4}, Ljava/util/BitSet;->set(I)V

    .line 439
    iget-object v2, v1, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v2

    :goto_0
    if-ltz v2, :cond_0

    .line 442
    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۘܺ;

    .line 444
    invoke-virtual {v5, v3, v4}, Ll/ܽۘܺ;->֫(II)V

    .line 440
    iget-object v5, v1, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v5, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v2

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final ᩵()Z
    .locals 2

    .line 858
    iget-object v0, p0, Ll/ܽۘܺ;->ۜ:Ll/᩷ۘܺ;

    invoke-virtual {v0}, Ll/᩷ۘܺ;->ܳ()I

    move-result v0

    iget v1, p0, Ll/ܽۘܺ;->ۧ:I

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 375
    iget v0, p0, Ll/ܽۘܺ;->ۢ:I

    return v0
.end method

.method public final ᩻()Ljava/util/BitSet;
    .locals 1

    .line 352
    iget-object v0, p0, Ll/ܽۘܺ;->᩷:Ljava/util/BitSet;

    return-object v0
.end method
