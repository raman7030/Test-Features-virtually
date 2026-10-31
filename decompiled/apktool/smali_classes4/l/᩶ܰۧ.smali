.class public final Ll/᩶ܰۧ;
.super Ljava/lang/Object;
.source "W1PL"


# static fields
.field public static final ۧ:Landroid/view/ViewGroup$MarginLayoutParams;


# instance fields
.field public ֫:Ll/ۜۗۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 46
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    sput-object v0, Ll/᩶ܰۧ;->ۧ:Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    .line 47
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    return-void
.end method

.method public constructor <init>(Ll/ۜۗۧ;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/᩶ܰۧ;->֫:Ll/ۜۗۧ;

    return-void
.end method

.method public static ֫(Landroid/view/View;)Z
    .locals 5

    .line 127
    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 128
    check-cast p0, Landroid/view/ViewGroup;

    .line 129
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {v0}, Landroid/animation/LayoutTransition;->isChangingLayout()Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    .line 133
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 135
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Ll/᩶ܰۧ;->֫(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method


# virtual methods
.method public final ֫()Z
    .locals 12

    .line 66
    iget-object v0, p0, Ll/᩶ܰۧ;->֫:Ll/ۜۗۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    goto/16 :goto_6

    .line 71
    :cond_0
    invoke-virtual {v0}, Ll/ۜۗۧ;->getOrientation()I

    move-result v4

    if-nez v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    new-array v6, v5, [I

    aput v5, v6, v3

    aput v1, v6, v2

    .line 72
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[I

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v1, :cond_6

    .line 74
    invoke-virtual {v0, v6}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_5

    .line 78
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    .line 80
    instance-of v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v9, :cond_2

    .line 81
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_2

    .line 83
    :cond_2
    sget-object v8, Ll/᩶ܰۧ;->ۧ:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 85
    :goto_2
    aget-object v9, v5, v6

    if-eqz v4, :cond_3

    .line 86
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v10

    iget v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_3

    .line 87
    :cond_3
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v10

    iget v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    :goto_3
    sub-int/2addr v10, v11

    aput v10, v9, v2

    .line 88
    aget-object v9, v5, v6

    if-eqz v4, :cond_4

    .line 89
    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    move-result v7

    iget v8, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_4

    .line 90
    :cond_4
    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    move-result v7

    iget v8, v8, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :goto_4
    add-int/2addr v7, v8

    aput v7, v9, v3

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 76
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "null view contained in the view hierarchy"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_6
    new-instance v4, Ll/᩹ܰۧ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v5, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    const/4 v4, 0x1

    :goto_5
    if-ge v4, v1, :cond_8

    add-int/lit8 v6, v4, -0x1

    .line 103
    aget-object v6, v5, v6

    aget v6, v6, v3

    aget-object v7, v5, v4

    aget v7, v7, v2

    if-eq v6, v7, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 109
    :cond_8
    aget-object v4, v5, v2

    aget v6, v4, v3

    aget v4, v4, v2

    sub-int/2addr v6, v4

    if-gtz v4, :cond_a

    sub-int/2addr v1, v3

    .line 110
    aget-object v1, v5, v1

    aget v1, v1, v3

    if-ge v1, v6, :cond_9

    goto :goto_7

    .line 60
    :cond_9
    :goto_6
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v1

    if-gt v1, v3, :cond_c

    .line 117
    :cond_a
    :goto_7
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v1

    const/4 v4, 0x0

    :goto_8
    if-ge v4, v1, :cond_c

    .line 119
    invoke-virtual {v0, v4}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5}, Ll/᩶ܰۧ;->֫(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_b

    return v3

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_c
    return v2
.end method
