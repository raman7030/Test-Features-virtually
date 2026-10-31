.class public final Ll/ۨۚۧ;
.super Landroid/view/View;
.source "58GU"


# instance fields
.field public ۗ:F

.field public ۙ:Ll/᩺ۚۧ;

.field public final ᩶:Ljava/util/ArrayList;

.field public ᩸:F

.field public ᩹:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۨۚۧ;->᩶:Ljava/util/ArrayList;

    .line 52
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ۨۚۧ;->᩹:Ljava/util/List;

    const p1, 0x3d5a511a    # 0.0533f

    .line 54
    iput p1, p0, Ll/ۨۚۧ;->ۗ:F

    .line 55
    sget-object p1, Ll/᩺ۚۧ;->᩻:Ll/᩺ۚۧ;

    iput-object p1, p0, Ll/ۨۚۧ;->ۙ:Ll/᩺ۚۧ;

    const p1, 0x3da3d70a    # 0.08f

    .line 56
    iput p1, p0, Ll/ۨۚۧ;->᩸:F

    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 22

    move-object/from16 v0, p0

    .line 81
    iget-object v1, v0, Ll/ۨۚۧ;->᩹:Ljava/util/List;

    .line 82
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_8

    .line 86
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 89
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v14

    .line 90
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    .line 91
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int v13, v3, v4

    .line 92
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int v12, v2, v3

    if-le v12, v15, :cond_c

    if-gt v13, v14, :cond_1

    goto/16 :goto_8

    :cond_1
    sub-int v11, v12, v15

    .line 99
    iget v3, v0, Ll/ۨۚۧ;->ۗ:F

    const v4, -0x800001

    cmpl-float v5, v3, v4

    if-nez v5, :cond_2

    const v3, -0x800001

    const v16, -0x800001

    goto :goto_0

    :cond_2
    int-to-float v5, v11

    mul-float v3, v3, v5

    move/from16 v16, v3

    :goto_0
    const/4 v3, 0x0

    cmpg-float v3, v16, v3

    if-gtz v3, :cond_3

    goto/16 :goto_8

    .line 107
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v10

    const/4 v3, 0x0

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v10, :cond_c

    .line 109
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶֡֫;

    .line 110
    iget v5, v3, Ll/᩶֡֫;->ᩴ:I

    const/high16 v6, -0x80000000

    if-eq v5, v6, :cond_7

    .line 148
    invoke-virtual {v3}, Ll/᩶֡֫;->֫()Ll/᩹֡֫;

    move-result-object v5

    iget v7, v3, Ll/᩶֡֫;->ܽ:F

    .line 149
    invoke-virtual {v5, v4}, Ll/᩹֡֫;->ۧ(F)V

    .line 150
    invoke-virtual {v5, v6}, Ll/᩹֡֫;->ۧ(I)V

    const/4 v4, 0x0

    .line 151
    invoke-virtual {v5, v4}, Ll/᩹֡֫;->ۧ(Landroid/text/Layout$Alignment;)V

    .line 153
    iget v4, v3, Ll/᩶֡֫;->ܿ:I

    const/high16 v6, 0x3f800000    # 1.0f

    if-nez v4, :cond_4

    sub-float/2addr v6, v7

    const/4 v4, 0x0

    .line 154
    invoke-virtual {v5, v6, v4}, Ll/᩹֡֫;->֫(FI)V

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    neg-float v7, v7

    sub-float/2addr v7, v6

    const/4 v6, 0x1

    const v8, -0x800001

    .line 156
    invoke-virtual {v5, v7, v6}, Ll/᩹֡֫;->֫(FI)V

    :goto_2
    const v6, -0x800001

    .line 158
    iget v3, v3, Ll/᩶֡֫;->ᩳ:I

    if-eqz v3, :cond_6

    const/4 v7, 0x2

    if-eq v3, v7, :cond_5

    goto :goto_3

    .line 160
    :cond_5
    invoke-virtual {v5, v4}, Ll/᩹֡֫;->֫(I)V

    goto :goto_3

    :cond_6
    const/4 v3, 0x2

    .line 163
    invoke-virtual {v5, v3}, Ll/᩹֡֫;->֫(I)V

    .line 170
    :goto_3
    invoke-virtual {v5}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object v3

    goto :goto_4

    :cond_7
    const v6, -0x800001

    :goto_4
    move-object v4, v3

    .line 113
    iget v3, v4, Ll/᩶֡֫;->ۘ:I

    iget v5, v4, Ll/᩶֡֫;->ۖ:F

    cmpl-float v6, v5, v6

    if-nez v6, :cond_8

    goto :goto_5

    :cond_8
    if-eqz v3, :cond_a

    const/4 v6, 0x1

    if-eq v3, v6, :cond_9

    const/4 v6, 0x2

    if-eq v3, v6, :cond_b

    :goto_5
    const v3, -0x800001

    const v7, -0x800001

    goto :goto_7

    :cond_9
    int-to-float v3, v2

    goto :goto_6

    :cond_a
    int-to-float v3, v11

    :goto_6
    mul-float v5, v5, v3

    :cond_b
    move v7, v5

    .line 116
    :goto_7
    iget-object v3, v0, Ll/ۨۚۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵۠ۧ;

    .line 117
    iget-object v5, v0, Ll/ۨۚۧ;->ۙ:Ll/᩺ۚۧ;

    iget v8, v0, Ll/ۨۚۧ;->᩸:F

    move/from16 v6, v16

    move/from16 v17, v9

    move-object/from16 v9, p1

    move/from16 v18, v10

    move v10, v14

    move/from16 v19, v11

    move v11, v15

    move/from16 v20, v12

    move v12, v13

    move/from16 v21, v13

    move/from16 v13, v20

    invoke-virtual/range {v3 .. v13}, Ll/᩵۠ۧ;->֫(Ll/᩶֡֫;Ll/᩺ۚۧ;FFFLandroid/graphics/Canvas;IIII)V

    add-int/lit8 v9, v17, 0x1

    const v4, -0x800001

    move/from16 v10, v18

    move/from16 v11, v19

    move/from16 v12, v20

    move/from16 v13, v21

    goto/16 :goto_1

    :cond_c
    :goto_8
    return-void
.end method

.method public final ֫(Ljava/util/List;Ll/᩺ۚۧ;FF)V
    .locals 0

    .line 66
    iput-object p1, p0, Ll/ۨۚۧ;->᩹:Ljava/util/List;

    .line 67
    iput-object p2, p0, Ll/ۨۚۧ;->ۙ:Ll/᩺ۚۧ;

    .line 68
    iput p3, p0, Ll/ۨۚۧ;->ۗ:F

    .line 70
    iput p4, p0, Ll/ۨۚۧ;->᩸:F

    .line 72
    :goto_0
    iget-object p2, p0, Ll/ۨۚۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p4

    if-ge p3, p4, :cond_0

    .line 73
    new-instance p3, Ll/᩵۠ۧ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p3, p4}, Ll/᩵۠ۧ;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
