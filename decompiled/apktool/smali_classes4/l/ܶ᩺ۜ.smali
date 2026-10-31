.class public final Ll/ܶ᩺ۜ;
.super Ljava/lang/Object;
.source "V6MU"

# interfaces
.implements Ll/ۗۨۜ;


# instance fields
.field public final ֡:Ll/֨᩺ۜ;

.field public ֨:Z

.field public ֫:J

.field public ֫֫:F

.field public volatile ۖ:Z

.field public ۗ:Z

.field public ۘ:Z

.field public final ۙ:J

.field public final ۚ:I

.field public final ۛ:Ljava/util/HashMap;

.field public final ۜ:Landroid/graphics/RectF;

.field public final ۟:Landroid/graphics/RectF;

.field public ۠:Ll/᩹ۛۜ;

.field public ۡ:I

.field public ۢ:I

.field public ۤ:Z

.field public volatile ۧ:Z

.field public ۧ֫:Z

.field public final synthetic ۨ:Ll/᩶᩺ۜ;

.field public final ۫:Ll/᩺ۨۜ;

.field public ۬:Z

.field public ܰ:Z

.field public final ܳ:Ljava/util/HashSet;

.field public ܶ:Ll/᩹ۨۜ;

.field public ܺ:Ll/ܶۨۜ;

.field public final ܽ:Ljava/util/ArrayList;

.field public ܽ֫:Ljava/util/List;

.field public final ܿ:Ljava/util/HashSet;

.field public final ܿ֫:Landroid/graphics/RectF;

.field public ᩳ:Z

.field public volatile ᩳ֫:Ljava/util/List;

.field public final ᩴ:Ljava/util/HashMap;

.field public ᩵:Z

.field public ᩶:Z

.field public ᩷:Z

.field public ᩸:Z

.field public final ᩹:Ll/۟ۨۜ;

.field public final ᩺:Ljava/util/HashMap;

.field public ᩻:Ll/ܰۛۜ;


# direct methods
.method public constructor <init>(Ll/᩶᩺ۜ;IJLl/᩺ۨۜ;)V
    .locals 2

    .line 820
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    .line 791
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    .line 792
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ܿ֫:Landroid/graphics/RectF;

    .line 793
    new-instance v0, Ll/֨᩺ۜ;

    invoke-direct {v0, p0}, Ll/֨᩺ۜ;-><init>(Ll/ܶ᩺ۜ;)V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->֡:Ll/֨᩺ۜ;

    .line 794
    new-instance v0, Ll/۟ۨۜ;

    invoke-direct {v0}, Ll/۟ۨۜ;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->᩹:Ll/۟ۨۜ;

    .line 795
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ۜ:Landroid/graphics/RectF;

    .line 796
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    .line 797
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ܳ:Ljava/util/HashSet;

    .line 798
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ܽ֫:Ljava/util/List;

    .line 800
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    .line 801
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    .line 802
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ܿ:Ljava/util/HashSet;

    .line 805
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ᩳ֫:Ljava/util/List;

    .line 815
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ܽ:Ljava/util/ArrayList;

    .line 817
    invoke-static {p1}, Ll/᩶᩺ۜ;->᩵(Ll/᩶᩺ۜ;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܶ᩺ۜ;->֫:J

    const/16 p1, 0x800

    .line 818
    iput p1, p0, Ll/ܶ᩺ۜ;->ۡ:I

    iput p1, p0, Ll/ܶ᩺ۜ;->ۢ:I

    .line 821
    iput p2, p0, Ll/ܶ᩺ۜ;->ۚ:I

    .line 822
    iput-wide p3, p0, Ll/ܶ᩺ۜ;->ۙ:J

    .line 823
    iput-object p5, p0, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    return-void
.end method

.method public static ֫(Ll/ܶ᩺ۜ;)V
    .locals 20

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 911
    iput-boolean v1, v0, Ll/ܶ᩺ۜ;->᩵:Z

    .line 912
    iget-object v2, v0, Ll/ܶ᩺ۜ;->᩹:Ll/۟ۨۜ;

    invoke-virtual {v2}, Ll/۟ۨۜ;->֫()V

    .line 913
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩺ۜ;->ܽ()J

    move-result-wide v10

    .line 914
    iget-boolean v2, v0, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v2, :cond_1a

    iget-object v2, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v2}, Ll/᩶᩺ۜ;->ܳ(Ll/᩶᩺ۜ;)Z

    move-result v2

    if-eqz v2, :cond_1a

    iget-object v2, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v2, v0}, Ll/᩶᩺ۜ;->֫(Ll/᩶᩺ۜ;Ll/ܶ᩺ۜ;)Z

    move-result v2

    if-eqz v2, :cond_1a

    iget v2, v0, Ll/ܶ᩺ۜ;->֫֫:F

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_0

    goto/16 :goto_9

    .line 915
    :cond_0
    iget-object v2, v0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    const/4 v12, 0x1

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ll/ܰۛۜ;->֫()Z

    move-result v2

    if-eqz v2, :cond_10

    .line 916
    iget-object v2, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v3, v2, Ll/ܶۨۜ;->ۜ:I

    iget v4, v2, Ll/ܶۨۜ;->ۧ:I

    iget-object v5, v0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    iget v6, v0, Ll/ܶ᩺ۜ;->֫֫:F

    iget-object v2, v0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    .line 917
    invoke-virtual {v2}, Ll/ܰۛۜ;->ᩳ()I

    move-result v7

    move-wide v8, v10

    .line 916
    invoke-static/range {v3 .. v9}, Ll/ۜܰۜ;->֫(IILandroid/graphics/RectF;FIJ)Ljava/util/List;

    move-result-object v2

    .line 918
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, v0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ܰۜ;

    invoke-direct {v0, v3}, Ll/ܶ᩺ۜ;->֫(Ll/᩻ܰۜ;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 921
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide/16 v4, 0x0

    move-wide v6, v4

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩹ۨۜ;

    .line 922
    iget-object v8, v8, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v8

    int-to-long v8, v8

    add-long/2addr v6, v8

    goto :goto_0

    .line 923
    :cond_1
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v13, v3, Ll/ܶۨۜ;->ۜ:I

    iget v14, v3, Ll/ܶۨۜ;->ۧ:I

    iget-object v15, v0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    iget v3, v0, Ll/ܶ᩺ۜ;->֫֫:F

    iget-object v8, v0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    .line 924
    invoke-virtual {v8}, Ll/ܰۛۜ;->ᩳ()I

    move-result v17

    sub-long/2addr v10, v6

    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v18

    move/from16 v16, v3

    .line 923
    invoke-static/range {v13 .. v19}, Ll/ۜܰۜ;->֫(IILandroid/graphics/RectF;FIJ)Ljava/util/List;

    move-result-object v3

    .line 925
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ܰۜ;

    iget v2, v2, Ll/᩻ܰۜ;->᩻:F

    iget-object v4, v0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩻ܰۜ;

    iget v4, v4, Ll/᩻ܰۜ;->᩻:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_2

    .line 926
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ܰۜ;

    iget v2, v2, Ll/᩻ܰۜ;->᩻:F

    iget-object v4, v0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩻ܰۜ;

    iget v4, v4, Ll/᩻ܰۜ;->᩻:F

    cmpg-float v2, v2, v4

    if-gez v2, :cond_2

    .line 928
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :cond_2
    move-object v2, v3

    .line 932
    :cond_3
    :goto_1
    iput-boolean v12, v0, Ll/ܶ᩺ۜ;->᩷:Z

    .line 933
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ᩳ֫:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 934
    invoke-direct/range {p0 .. p0}, Ll/ܶ᩺ۜ;->ܳ()V

    .line 935
    iget-object v1, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v1

    if-eqz v1, :cond_1a

    iget-object v0, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    .line 938
    :cond_4
    iput-object v2, v0, Ll/ܶ᩺ۜ;->ᩳ֫:Ljava/util/List;

    .line 939
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 940
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 941
    invoke-direct/range {p0 .. p0}, Ll/ܶ᩺ۜ;->᩻()V

    goto/16 :goto_6

    .line 943
    :cond_5
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ܰۜ;

    invoke-direct {v0, v3}, Ll/ܶ᩺ۜ;->֫(Ll/᩻ܰۜ;)Z

    move-result v3

    if-nez v3, :cond_6

    const/4 v3, 0x1

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    iput-boolean v3, v0, Ll/ܶ᩺ۜ;->ۤ:Z

    if-nez v3, :cond_a

    .line 946
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 947
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 948
    iget-object v5, v0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻ܰۜ;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ۨۜ;

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ۨۜ;

    if-eqz v4, :cond_7

    .line 949
    invoke-virtual {v4}, Ll/᩹ۨۜ;->close()V

    goto :goto_3

    .line 950
    :cond_8
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ۨۜ;

    invoke-virtual {v4}, Ll/᩹ۨۜ;->close()V

    goto :goto_3

    .line 952
    :cond_9
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 1049
    :cond_a
    iget-boolean v3, v0, Ll/ܶ᩺ۜ;->ۤ:Z

    if-eqz v3, :cond_b

    iget-object v3, v0, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    goto :goto_4

    :cond_b
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    .line 1056
    :goto_4
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    .line 1057
    :cond_c
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    .line 1058
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 1059
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    .line 1060
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ۨۜ;

    invoke-virtual {v4}, Ll/᩹ۨۜ;->close()V

    .line 1061
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    const/4 v4, 0x1

    goto :goto_5

    :cond_d
    if-eqz v4, :cond_e

    .line 955
    iput-boolean v1, v0, Ll/ܶ᩺ۜ;->᩷:Z

    .line 956
    :cond_e
    invoke-direct/range {p0 .. p0}, Ll/ܶ᩺ۜ;->ܳ()V

    .line 958
    :goto_6
    iget-object v1, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v1

    if-eqz v1, :cond_f

    iget-object v1, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 959
    :cond_f
    iget-object v0, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->֨(Ll/᩶᩺ۜ;)V

    return-void

    .line 962
    :cond_10
    iget-object v2, v0, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    if-nez v2, :cond_11

    goto/16 :goto_9

    .line 963
    :cond_11
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_12

    .line 964
    iget-object v2, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v3, v2, Ll/ܶۨۜ;->ۜ:I

    iget v4, v2, Ll/ܶۨۜ;->ۧ:I

    iget-object v5, v0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    iget v6, v0, Ll/ܶ᩺ۜ;->֫֫:F

    iget-object v2, v0, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    iget v7, v2, Ll/᩹ۨۜ;->ۗ:I

    iget v2, v0, Ll/ܶ᩺ۜ;->ۡ:I

    iget v13, v0, Ll/ܶ᩺ۜ;->ۢ:I

    move-wide v8, v10

    move v10, v2

    move v11, v13

    invoke-static/range {v3 .. v11}, Ll/֫᩺ۜ;->֫(IILandroid/graphics/RectF;FIJII)Ljava/util/List;

    move-result-object v2

    goto :goto_7

    .line 966
    :cond_12
    iget-object v2, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v3, v2, Ll/ܶۨۜ;->ۜ:I

    iget v4, v2, Ll/ܶۨۜ;->ۧ:I

    iget-object v5, v0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    iget v6, v0, Ll/ܶ᩺ۜ;->֫֫:F

    iget-object v2, v0, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    iget v7, v2, Ll/᩹ۨۜ;->ۗ:I

    move-wide v8, v10

    invoke-static/range {v3 .. v9}, Ll/ܺܰۜ;->֫(IILandroid/graphics/RectF;FIJ)Ljava/util/List;

    move-result-object v2

    .line 968
    :goto_7
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_14

    .line 969
    iget-object v3, v0, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡܰۜ;

    .line 970
    iget-object v5, v0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    iget-object v6, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v7, v6, Ll/ܶۨۜ;->ۜ:I

    iget v6, v6, Ll/ܶۨۜ;->ۧ:I

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۡܰۜ;

    iget v8, v8, Ll/ۡܰۜ;->ۜ:I

    invoke-static {v4, v5, v7, v6, v8}, Ll/֫᩺ۜ;->֫(Ll/ۡܰۜ;Landroid/graphics/RectF;III)Z

    move-result v5

    if-eqz v5, :cond_13

    .line 971
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 976
    :cond_14
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ܽ֫:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 977
    iput-boolean v12, v0, Ll/ܶ᩺ۜ;->᩷:Z

    .line 979
    iget-object v1, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->ۚ(Ll/᩶᩺ۜ;)Ll/ۚ᩺ۜ;

    move-result-object v1

    if-eqz v1, :cond_1a

    iget-object v0, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->֨(Ll/᩶᩺ۜ;)V

    return-void

    .line 982
    :cond_15
    iput-object v2, v0, Ll/ܶ᩺ۜ;->ܽ֫:Ljava/util/List;

    .line 983
    iput-boolean v12, v0, Ll/ܶ᩺ۜ;->᩷:Z

    .line 984
    iget-object v3, v0, Ll/ܶ᩺ۜ;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 986
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_16

    const/4 v1, 0x1

    .line 987
    :cond_16
    iget-object v3, v0, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 988
    :cond_17
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_18

    .line 989
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 990
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    if-nez v1, :cond_17

    .line 991
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩺ۜ;

    iget-object v4, v4, Ll/᩹᩺ۜ;->֫:Ll/᩹ۨۜ;

    invoke-virtual {v4}, Ll/᩹ۨۜ;->close()V

    .line 992
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_8

    .line 1001
    :cond_18
    iget-object v1, v0, Ll/ܶ᩺ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1002
    iget-object v2, v0, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 996
    iget-object v1, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v1

    if-eqz v1, :cond_19

    iget-object v1, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 997
    :cond_19
    iget-object v0, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->֨(Ll/᩶᩺ۜ;)V

    :cond_1a
    :goto_9
    return-void
.end method

.method private ֫(Ll/᩻ܰۜ;)Z
    .locals 3

    .line 1044
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ܰۜ;

    .line 1045
    iget v1, p1, Ll/᩻ܰۜ;->ᩳ:I

    iget v2, v0, Ll/᩻ܰۜ;->ᩳ:I

    if-ne v1, v2, :cond_0

    iget p1, p1, Ll/᩻ܰۜ;->ܽ:I

    iget v0, v0, Ll/᩻ܰۜ;->ܽ:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۧ(Ll/ܶ᩺ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶ᩺ۜ;->ܳ()V

    return-void
.end method

.method private ܳ()V
    .locals 6

    .line 1071
    iget-boolean v0, p0, Ll/ܶ᩺ۜ;->᩵:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Ll/ܶ᩺ۜ;->ۤ:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Ll/ܶ᩺ۜ;->ᩳ֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 1073
    :cond_0
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ᩳ֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ܰۜ;

    .line 1074
    iget-object v4, v3, Ll/᩻ܰۜ;->ۧ:Landroid/graphics/RectF;

    iget-object v5, p0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    invoke-static {v4, v5}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 1076
    :cond_1
    iget-object v2, p0, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    if-nez v2, :cond_4

    goto :goto_2

    .line 1079
    :cond_4
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۨۜ;

    invoke-virtual {v2}, Ll/᩹ۨۜ;->close()V

    goto :goto_1

    .line 1080
    :cond_5
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 1081
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 1082
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 1083
    iput-boolean v1, p0, Ll/ܶ᩺ۜ;->ۤ:Z

    .line 1085
    iput-boolean v1, p0, Ll/ܶ᩺ۜ;->᩷:Z

    :cond_6
    :goto_2
    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܶ᩺ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶ᩺ۜ;->᩻()V

    return-void
.end method

.method private ᩻()V
    .locals 3

    .line 1089
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۨۜ;

    invoke-virtual {v2}, Ll/᩹ۨۜ;->close()V

    goto :goto_0

    .line 1090
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    .line 1091
    iput-boolean v0, p0, Ll/ܶ᩺ۜ;->ۤ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 1100
    iget-object v0, p0, Ll/ܶ᩺ۜ;->᩹:Ll/۟ۨۜ;

    invoke-virtual {v0}, Ll/۟ۨۜ;->ۧ()V

    .line 1101
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ۡ(Ll/᩶᩺ۜ;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Ll/ܶ᩺ۜ;->֡:Ll/֨᩺ۜ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 1102
    iput-boolean v0, p0, Ll/ܶ᩺ۜ;->᩵:Z

    .line 1103
    invoke-direct {p0}, Ll/ܶ᩺ۜ;->᩻()V

    .line 1104
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ܶ᩺ۜ;->ᩳ֫:Ljava/util/List;

    .line 1105
    iget-object v1, p0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۨۜ;

    invoke-virtual {v2}, Ll/᩹ۨۜ;->close()V

    goto :goto_0

    .line 1106
    :cond_0
    iget-object v1, p0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 1107
    iget-object v1, p0, Ll/ܶ᩺ۜ;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 1108
    iget-object v1, p0, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩺ۜ;

    iget-object v2, v2, Ll/᩹᩺ۜ;->֫:Ll/᩹ۨۜ;

    invoke-virtual {v2}, Ll/᩹ۨۜ;->close()V

    goto :goto_1

    .line 1109
    :cond_1
    iget-object v1, p0, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 1110
    iget-object v1, p0, Ll/ܶ᩺ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1111
    iput-boolean v0, p0, Ll/ܶ᩺ۜ;->᩷:Z

    .line 1112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶ᩺ۜ;->ܽ֫:Ljava/util/List;

    .line 1113
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    const/4 v0, 0x0

    .line 1114
    iput v0, p0, Ll/ܶ᩺ۜ;->֫֫:F

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 13

    .line 832
    iget-boolean v0, p0, Ll/ܶ᩺ۜ;->ۧ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 833
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMaximumBitmapWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMaximumBitmapHeight()I

    move-result v1

    .line 834
    iget v2, p0, Ll/ܶ᩺ۜ;->ۡ:I

    const/4 v3, 0x0

    if-ne v2, v0, :cond_1

    iget v2, p0, Ll/ܶ᩺ۜ;->ۢ:I

    if-eq v2, v1, :cond_2

    .line 835
    :cond_1
    iput v0, p0, Ll/ܶ᩺ۜ;->ۡ:I

    .line 836
    iput v1, p0, Ll/ܶ᩺ۜ;->ۢ:I

    .line 837
    iput-boolean v3, p0, Ll/ܶ᩺ۜ;->᩷:Z

    .line 839
    :cond_2
    iget-object v0, p0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 840
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 841
    iget-object v2, p0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ܰۜ;

    .line 842
    iget-object v3, v3, Ll/᩻ܰۜ;->ۧ:Landroid/graphics/RectF;

    sget-object v4, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z

    goto :goto_0

    .line 843
    :cond_3
    iget-object v2, p0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    invoke-virtual {v2, p1, p2}, Ll/ܰۛۜ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 844
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 845
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 846
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ܰۜ;

    .line 847
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 848
    iget-object v5, v3, Ll/᩻ܰۜ;->ۧ:Landroid/graphics/RectF;

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 849
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۨۜ;

    iget-object v2, v2, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    iget-object v3, v3, Ll/᩻ܰۜ;->ܿ:Landroid/graphics/RectF;

    invoke-virtual {p1, v2, v1, v3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 850
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_1

    .line 854
    :cond_4
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    if-nez v0, :cond_6

    :cond_5
    :goto_2
    return-void

    .line 855
    :cond_6
    invoke-virtual {p2}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result v0

    .line 856
    iget-object v2, p0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget-object v2, v2, Ll/ܶۨۜ;->ܳ:Ll/ۤۛۡ;

    if-eqz v2, :cond_7

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 858
    :cond_7
    :try_start_0
    iget-object v2, p0, Ll/ܶ᩺ۜ;->ۜ:Landroid/graphics/RectF;

    iget-object v4, p0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v5, v4, Ll/ܶۨۜ;->ۜ:I

    int-to-float v5, v5

    iget v4, v4, Ll/ܶۨۜ;->ۧ:I

    int-to-float v4, v4

    const/4 v6, 0x0

    invoke-virtual {v2, v6, v6, v5, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 860
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    const/4 v4, 0x0

    .line 861
    :goto_3
    iget-object v5, p0, Ll/ܶ᩺ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_8

    .line 862
    iget-object v5, p0, Ll/ܶ᩺ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹᩺ۜ;

    iget-object v5, v5, Ll/᩹᩺ۜ;->ܽ:Ll/ۡܰۜ;

    .line 863
    iget v6, v5, Ll/ۡܰۜ;->ܽ:I

    int-to-float v8, v6

    iget v6, v5, Ll/ۡܰۜ;->ܿ:I

    int-to-float v9, v6

    iget v6, v5, Ll/ۡܰۜ;->ᩳ:I

    int-to-float v10, v6

    iget v5, v5, Ll/ۡܰۜ;->ۧ:I

    int-to-float v11, v5

    sget-object v12, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 865
    :cond_8
    iget-object v4, p0, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    iget-object v4, v4, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    iget-object v5, p0, Ll/ܶ᩺ۜ;->ۜ:Landroid/graphics/RectF;

    invoke-virtual {p1, v4, v1, v5, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 866
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 867
    :goto_4
    iget-object v2, p0, Ll/ܶ᩺ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v3, v2, :cond_9

    .line 868
    iget-object v2, p0, Ll/ܶ᩺ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩺ۜ;

    .line 869
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 870
    iget-object v5, v2, Ll/᩹᩺ۜ;->ܽ:Ll/ۡܰۜ;

    .line 871
    iget v6, v5, Ll/ۡܰۜ;->ܽ:I

    iget v7, v5, Ll/ۡܰۜ;->ܿ:I

    iget v8, v5, Ll/ۡܰۜ;->ᩳ:I

    iget v5, v5, Ll/ۡܰۜ;->ۧ:I

    invoke-virtual {p1, v6, v7, v8, v5}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 872
    iget-object v5, v2, Ll/᩹᩺ۜ;->֫:Ll/᩹ۨۜ;

    iget-object v5, v5, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    iget-object v2, v2, Ll/᩹᩺ۜ;->ۧ:Landroid/graphics/RectF;

    invoke-virtual {p1, v5, v1, v2, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 873
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 876
    :cond_9
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 877
    throw p1
.end method

.method public final ֫(Landroid/graphics/RectF;FZ)V
    .locals 4

    .line 882
    iget-boolean v0, p0, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v0, :cond_9

    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ܳ(Ll/᩶᩺ۜ;)Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz p3, :cond_9

    iget-object p3, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {p3, p0}, Ll/᩶᩺ۜ;->֫(Ll/᩶᩺ۜ;Ll/ܶ᩺ۜ;)Z

    move-result p3

    if-nez p3, :cond_0

    goto/16 :goto_2

    .line 884
    :cond_0
    iget-object p3, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {p3}, Ll/᩶᩺ۜ;->ۜ(Ll/᩶᩺ۜ;)Z

    move-result p3

    if-nez p3, :cond_2

    invoke-virtual {p0}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {p3}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {p3}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object p3

    invoke-virtual {p3}, Ll/۬ۛۜ;->ܽ()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 885
    iget-object p1, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {p1}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object p1

    iget-object p2, p0, Ll/ܶ᩺ۜ;->ܿ֫:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Ll/۬ۛۜ;->֫(Landroid/graphics/RectF;)F

    move-result p2

    const/4 p1, 0x0

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_1

    goto/16 :goto_2

    .line 887
    :cond_1
    iget-object p1, p0, Ll/ܶ᩺ۜ;->ܿ֫:Landroid/graphics/RectF;

    .line 889
    :cond_2
    iget-object p3, p0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ll/ܰۛۜ;->֫()Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_0

    .line 890
    :cond_3
    iget-boolean p3, p0, Ll/ܶ᩺ۜ;->᩶:Z

    if-nez p3, :cond_9

    iget-object p3, p0, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    if-nez p3, :cond_4

    goto/16 :goto_2

    .line 891
    :cond_4
    :goto_0
    iget-boolean p3, p0, Ll/ܶ᩺ۜ;->᩷:Z

    if-eqz p3, :cond_5

    iget-object p3, p0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    invoke-virtual {p3, p1}, Landroid/graphics/RectF;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    iget p3, p0, Ll/ܶ᩺ۜ;->֫֫:F

    cmpl-float p3, p3, p2

    if-nez p3, :cond_5

    goto :goto_2

    .line 892
    :cond_5
    invoke-virtual {p0}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result p3

    const/4 v0, 0x1

    if-eqz p3, :cond_7

    .line 893
    iget-object p3, p0, Ll/ܶ᩺ۜ;->᩹:Ll/۟ۨۜ;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v3}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v3}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v3

    .line 894
    invoke-virtual {v3}, Ll/۬ۛۜ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    goto :goto_1

    :cond_6
    const/4 v3, 0x0

    .line 893
    :goto_1
    invoke-virtual {p3, v1, v2, p1, v3}, Ll/۟ۨۜ;->֫(JLandroid/graphics/RectF;Z)J

    move-result-wide v1

    .line 895
    iget-object p3, p0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    invoke-virtual {p3, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 896
    iput p2, p0, Ll/ܶ᩺ۜ;->֫֫:F

    .line 897
    iget-object p1, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {p1}, Ll/᩶᩺ۜ;->ۡ(Ll/᩶᩺ۜ;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Ll/ܶ᩺ۜ;->֡:Ll/֨᩺ۜ;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 898
    iput-boolean v0, p0, Ll/ܶ᩺ۜ;->᩵:Z

    .line 899
    iget-object p1, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {p1}, Ll/᩶᩺ۜ;->ۡ(Ll/᩶᩺ۜ;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Ll/ܶ᩺ۜ;->֡:Ll/֨᩺ۜ;

    invoke-virtual {p1, p2, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 902
    :cond_7
    iget-object p3, p0, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    invoke-virtual {p3, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 903
    iput p2, p0, Ll/ܶ᩺ۜ;->֫֫:F

    .line 904
    iget-boolean p1, p0, Ll/ܶ᩺ۜ;->᩵:Z

    if-eqz p1, :cond_8

    goto :goto_2

    .line 905
    :cond_8
    iput-boolean v0, p0, Ll/ܶ᩺ۜ;->᩵:Z

    .line 907
    iget-object p1, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {p1}, Ll/᩶᩺ۜ;->ۡ(Ll/᩶᩺ۜ;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Ll/ܶ᩺ۜ;->֡:Ll/֨᩺ۜ;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_9
    :goto_2
    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 1119
    iget-boolean v0, p0, Ll/ܶ᩺ۜ;->ۧ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1120
    iput-boolean v0, p0, Ll/ܶ᩺ۜ;->ۧ:Z

    .line 1121
    invoke-virtual {p0}, Ll/ܶ᩺ۜ;->֫()V

    .line 1122
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩹ۨۜ;->close()V

    :cond_1
    const/4 v0, 0x0

    .line 1123
    iput-object v0, p0, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    .line 1124
    iget-object v1, p0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz v1, :cond_2

    iget-object v2, p0, Ll/ܶ᩺ۜ;->۠:Ll/᩹ۛۜ;

    invoke-virtual {v1, v2}, Ll/ܰۛۜ;->֫(Ll/᩹ۛۜ;)V

    goto :goto_0

    .line 1125
    :cond_2
    iget-object v1, p0, Ll/ܶ᩺ۜ;->۠:Ll/᩹ۛۜ;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/᩹ۛۜ;->close()V

    .line 1126
    :cond_3
    :goto_0
    iput-object v0, p0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    .line 1127
    iput-object v0, p0, Ll/ܶ᩺ۜ;->۠:Ll/᩹ۛۜ;

    return-void
.end method

.method public final ܽ()J
    .locals 14

    .line 1007
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ۜ(Ll/᩶᩺ۜ;)Z

    move-result v0

    const-wide/16 v1, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 1009
    :goto_0
    iget-object v4, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v4}, Ll/᩶᩺ۜ;->ܺ(Ll/᩶᩺ۜ;)Landroid/util/SparseArray;

    move-result-object v4

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    iget-object v4, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v4}, Ll/᩶᩺ۜ;->ܺ(Ll/᩶᩺ۜ;)Landroid/util/SparseArray;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ᩺ۜ;

    iget-boolean v4, v4, Ll/ܶ᩺ۜ;->ۖ:Z

    if-eqz v4, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1011
    :cond_1
    iget-object v3, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v3}, Ll/᩶᩺ۜ;->᩻(Ll/᩶᩺ۜ;)Ll/᩶ۛۜ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v3

    div-long/2addr v3, v1

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-long v5, v0

    div-long/2addr v3, v5

    .line 1012
    iget-wide v5, p0, Ll/ܶ᩺ۜ;->֫:J

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-virtual {p0}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    :cond_2
    int-to-long v0, v1

    div-long/2addr v2, v0

    return-wide v2

    .line 1014
    :cond_3
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ۘ(Ll/᩶᩺ۜ;)J

    move-result-wide v4

    .line 1015
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ۢ(Ll/᩶᩺ۜ;)Ll/᩹ۛۜ;

    move-result-object v0

    const-wide/16 v6, 0x0

    if-eqz v0, :cond_4

    .line 1016
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ۢ(Ll/᩶᩺ۜ;)Ll/᩹ۛۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v8

    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ۖ(Ll/᩶᩺ۜ;)J

    move-result-wide v10

    sub-long/2addr v8, v10

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-long/2addr v4, v8

    .line 1017
    :cond_4
    :goto_1
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ܺ(Ll/᩶᩺ۜ;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v3, v0, :cond_7

    .line 1018
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ܺ(Ll/᩶᩺ۜ;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩺ۜ;

    .line 1019
    iget-object v8, v0, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    if-eqz v8, :cond_5

    .line 1020
    iget-object v8, v8, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v8

    int-to-long v8, v8

    iget-object v10, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v10}, Ll/᩶᩺ۜ;->ۖ(Ll/᩶᩺ۜ;)J

    move-result-wide v10

    sub-long/2addr v8, v10

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-long/2addr v4, v8

    .line 1021
    :cond_5
    iget-object v0, v0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz v0, :cond_6

    .line 1022
    invoke-virtual {v0}, Ll/ܰۛۜ;->ܽ()J

    move-result-wide v8

    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ۖ(Ll/᩶᩺ۜ;)J

    move-result-wide v10

    sub-long/2addr v8, v10

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-long/2addr v8, v4

    move-wide v4, v8

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1024
    :cond_7
    iget-wide v8, p0, Ll/ܶ᩺ۜ;->֫:J

    sub-long/2addr v8, v4

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    .line 1025
    invoke-virtual {p0}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result v0

    if-nez v0, :cond_8

    return-wide v8

    .line 1028
    :cond_8
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ۖ(Ll/᩶᩺ۜ;)J

    move-result-wide v10

    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->ᩴ(Ll/᩶᩺ۜ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v3, 0x3

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v3, v0

    int-to-long v12, v3

    mul-long v10, v10, v12

    .line 1029
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->᩵(Ll/᩶᩺ۜ;)J

    move-result-wide v12

    add-long/2addr v12, v10

    sub-long/2addr v12, v4

    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 1030
    div-long/2addr v3, v1

    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 1033
    iget-object v0, p0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll/ܶۨۜ;->ܳ:Ll/ۤۛۡ;

    if-nez v1, :cond_0

    const-string v1, "image/png"

    iget-object v0, v0, Ll/ܶۨۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 1095
    iget-object v0, p0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->ܳ(Ll/᩶᩺ۜ;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->᩷(Ll/᩶᩺ۜ;)Ll/ܶ᩺ۜ;

    move-result-object v1

    if-ne v1, p0, :cond_0

    iget-boolean v1, p0, Ll/ܶ᩺ۜ;->ۘ:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ll/۠᩺ۜ;

    invoke-direct {v2, p0}, Ll/۠᩺ۜ;-><init>(Ll/ܶ᩺ۜ;)V

    invoke-virtual {v0, v1, v2}, Ll/ܰۛۜ;->֫(ZLl/۠᩺ۜ;)V

    :cond_1
    return-void
.end method
