.class public Ll/᩻ۡۡ;
.super Landroid/widget/LinearLayout;
.source "P9S5"


# static fields
.field public static final synthetic ֫֫:I


# instance fields
.field public ۗ:Ll/ܿۡۡ;

.field public ۙ:Z

.field public ۛ:Z

.field public ۟:Ll/ܶۡۡ;

.field public ۤ:Ljava/lang/String;

.field public final ۨ:Landroid/widget/ImageView;

.field public ۫:Ljava/lang/CharSequence;

.field public ۬:Landroid/util/SparseArray;

.field public final ܰ:Landroid/widget/ImageView;

.field public ᩶:Z

.field public ᩸:Z

.field public final ᩹:Landroid/widget/ImageView;

.field public final ᩺:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 69
    invoke-direct {p0, p1, p2, v0}, Ll/᩻ۡۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 76
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p3, ""

    .line 45
    iput-object p3, p0, Ll/᩻ۡۡ;->۫:Ljava/lang/CharSequence;

    const/4 p3, 0x0

    .line 53
    iput-boolean p3, p0, Ll/᩻ۡۡ;->᩶:Z

    const/4 v0, 0x1

    .line 54
    iput-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    .line 77
    invoke-virtual {p0, p3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v1, 0x10

    .line 78
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 79
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v1, 0x7f0d01d9

    invoke-virtual {p1, v1, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p1, 0x7f0a04d1

    .line 80
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/᩻ۡۡ;->ۨ:Landroid/widget/ImageView;

    const v1, 0x7f0a04d8

    .line 81
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/᩻ۡۡ;->᩺:Landroid/view/View;

    const v2, 0x7f0a04dc

    .line 82
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Ll/᩻ۡۡ;->ܰ:Landroid/widget/ImageView;

    const v2, 0x7f0a04d5

    .line 83
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Ll/᩻ۡۡ;->᩹:Landroid/widget/ImageView;

    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x1010150

    const v5, 0x101014f

    filled-new-array {v4, v5}, [I

    move-result-object v4

    invoke-virtual {v3, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 101
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 103
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/᩻ۡۡ;->ۤ:Ljava/lang/String;

    .line 105
    :cond_0
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 107
    invoke-static {v3}, Landroid/text/TextUtils;->stringOrSpannedString(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    iput-object v4, p0, Ll/᩻ۡۡ;->۫:Ljava/lang/CharSequence;

    .line 108
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    .line 110
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 180
    new-instance p2, Ll/ۧۡۡ;

    const/4 v0, 0x0

    invoke-direct {p2, v0, p0}, Ll/ۧۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    new-instance p1, Ll/ܽۡۡ;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, Ll/ܽۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    new-instance p1, Ll/ܰۢۡ;

    invoke-direct {p1, p0}, Ll/ܰۢۡ;-><init>(Ll/᩻ۡۡ;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    invoke-virtual {p0}, Ll/᩻ۡۡ;->֫()V

    .line 88
    iget-boolean p1, p0, Ll/᩻ۡۡ;->ۙ:Z

    if-nez p1, :cond_3

    invoke-direct {p0}, Ll/᩻ۡۡ;->ۜ()V

    .line 89
    :cond_3
    invoke-direct {p0}, Ll/᩻ۡۡ;->ۡ()V

    .line 90
    invoke-direct {p0, p3}, Ll/᩻ۡۡ;->ܽ(Z)V

    return-void
.end method

.method public static ֫(Ll/᩻ۡۡ;)V
    .locals 1

    .line 439
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    if-nez v0, :cond_0

    return-void

    .line 440
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 441
    iget-object p0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۤۤᩳ;->ᩴ(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩻ۡۡ;I)Z
    .locals 1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    if-nez p1, :cond_1

    .line 155
    :cond_0
    iget-object p1, p0, Ll/᩻ۡۡ;->ۗ:Ll/ܿۡۡ;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ll/᩻ۡۡ;->ܽ()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ll/ܿۡۡ;->ۧ(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic ֫(Ll/᩻ۡۡ;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 159
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    if-nez p2, :cond_0

    const/16 p2, 0x42

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Ll/᩻ۡۡ;->ۗ:Ll/ܿۡۡ;

    if-eqz p1, :cond_0

    .line 162
    invoke-virtual {p0}, Ll/᩻ۡۡ;->ܽ()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ll/ܿۡۡ;->ۧ(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ۜ()V
    .locals 3

    .line 115
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 116
    iput-boolean v0, p0, Ll/᩻ۡۡ;->ۛ:Z

    const/4 v0, 0x0

    const v1, 0x7f0a04d9

    .line 118
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewStub;

    .line 119
    invoke-virtual {v1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ܶۡۡ;

    iput-object v1, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    .line 120
    invoke-direct {p0}, Ll/᩻ۡۡ;->᩷()V

    .line 121
    iget-object v1, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    iget-object v2, p0, Ll/᩻ۡۡ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/۫ۨᩳ;->ܽ(Ljava/lang/String;)V

    .line 122
    invoke-direct {p0}, Ll/᩻ۡۡ;->ۢ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    iput-boolean v0, p0, Ll/᩻ۡۡ;->ۛ:Z

    return-void

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, Ll/᩻ۡۡ;->ۛ:Z

    .line 125
    throw v1
.end method

.method private ۡ()V
    .locals 2

    .line 456
    iget-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 457
    invoke-virtual {p0}, Ll/᩻ۡۡ;->ܽ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩻ۡۡ;->ۤ:Ljava/lang/String;

    .line 458
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    .line 449
    :goto_1
    iget-object v0, p0, Ll/᩻ۡۡ;->ܰ:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private ۢ()V
    .locals 2

    .line 130
    iget-object v0, p0, Ll/᩻ۡۡ;->۬:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    .line 131
    iget-object v1, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-virtual {v1, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    const/4 v0, 0x0

    .line 132
    iput-object v0, p0, Ll/᩻ۡۡ;->۬:Landroid/util/SparseArray;

    goto :goto_0

    .line 134
    :cond_0
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    iget-object v1, p0, Ll/᩻ۡۡ;->۫:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 135
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->ᩴ(I)V

    :goto_0
    const-string v0, ""

    .line 137
    iput-object v0, p0, Ll/᩻ۡۡ;->۫:Ljava/lang/CharSequence;

    .line 139
    invoke-direct {p0}, Ll/᩻ۡۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩻ۡۡ;)Ll/ܿۡۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ۡۡ;->ۗ:Ll/ܿۡۡ;

    return-object p0
.end method

.method private ܽ(Z)V
    .locals 3

    .line 465
    iget-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    iget-object v2, p0, Ll/᩻ۡۡ;->ۨ:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 466
    iget-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iget-object v0, p0, Ll/᩻ۡۡ;->᩺:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 467
    invoke-direct {p0}, Ll/᩻ۡۡ;->ۡ()V

    if-eqz p1, :cond_2

    .line 469
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩻ۡۡ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩻ۡۡ;->ۛ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩻ۡۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩻ۡۡ;->ۡ()V

    return-void
.end method

.method private ᩷()V
    .locals 3

    .line 146
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 147
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    const v1, 0x80001

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->᩹(I)V

    .line 148
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    const/4 v1, 0x1

    .line 437
    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->֨(Z)V

    .line 149
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->᩸(I)V

    .line 150
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    new-instance v1, Ll/۟ۢۡ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/۟ۢۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ܶۡۡ;->֫(Ll/۟ۢۡ;)V

    .line 159
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    new-instance v1, Ll/֫ۡۡ;

    invoke-direct {v1, p0}, Ll/֫ۡۡ;-><init>(Ll/᩻ۡۡ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 163
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    new-instance v1, Ll/ᩳۡۡ;

    invoke-direct {v1, p0}, Ll/ᩳۡۡ;-><init>(Ll/᩻ۡۡ;)V

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private ᩻()V
    .locals 2

    .line 213
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    if-nez v0, :cond_0

    return-void

    .line 215
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x1010036

    .line 126
    invoke-static {v0, v1}, Ll/᩸֡᩷;->֫(Landroid/content/res/Resources$Theme;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 215
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    .line 216
    iget-object v1, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-virtual {v1, v0}, Ll/ۤۤᩳ;->۫(I)V

    .line 217
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-virtual {v0}, Ll/ܶۡۡ;->ܽ()V

    return-void
.end method


# virtual methods
.method public final clearFocus()V
    .locals 1

    const/4 v0, 0x1

    .line 418
    iput-boolean v0, p0, Ll/᩻ۡۡ;->᩸:Z

    .line 419
    invoke-super {p0}, Landroid/widget/LinearLayout;->clearFocus()V

    .line 420
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    if-eqz v0, :cond_0

    .line 421
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 422
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۘۧ()V

    :cond_0
    const/4 v0, 0x0

    .line 424
    iput-boolean v0, p0, Ll/᩻ۡۡ;->᩸:Z

    return-void
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 481
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    return-void
.end method

.method public final dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 476
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    return-void
.end method

.method public final onCheckIsTextEditor()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 392
    iget-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    const/high16 v1, -0x80000000

    const/16 v2, 0x8

    const/high16 v3, 0x40000000    # 2.0f

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 395
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 396
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070037

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    if-eq v0, v1, :cond_2

    if-eqz v0, :cond_1

    goto :goto_0

    .line 402
    :cond_1
    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0

    .line 399
    :cond_2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {v4, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 400
    invoke-static {p1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 361
    :cond_3
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 362
    iget-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    if-nez v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v2, :cond_6

    .line 363
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f070036

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 364
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 365
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 366
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    if-eq v4, v1, :cond_4

    if-eq v4, v3, :cond_5

    .line 377
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result p2

    goto :goto_1

    .line 373
    :cond_4
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_5
    :goto_1
    if-eq p2, v2, :cond_6

    .line 382
    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 381
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    :cond_6
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 500
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "parent"

    .line 504
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    const-string v0, "query"

    const-string v1, ""

    .line 505
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۡۡ;->۫:Ljava/lang/CharSequence;

    const-string v0, "editor"

    .line 506
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ۡۡ;->۬:Landroid/util/SparseArray;

    .line 508
    iget-object p1, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 509
    iput-boolean v0, p0, Ll/᩻ۡۡ;->ۛ:Z

    const/4 p1, 0x0

    .line 511
    :try_start_0
    invoke-direct {p0}, Ll/᩻ۡۡ;->ۢ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 513
    iput-boolean p1, p0, Ll/᩻ۡۡ;->ۛ:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-boolean p1, p0, Ll/᩻ۡۡ;->ۛ:Z

    .line 514
    throw v0

    .line 515
    :cond_0
    invoke-virtual {p0}, Ll/᩻ۡۡ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 516
    invoke-direct {p0}, Ll/᩻ۡۡ;->ۜ()V

    .line 518
    :cond_1
    :goto_0
    invoke-direct {p0, v0}, Ll/᩻ۡۡ;->ܽ(Z)V

    return-void

    .line 501
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 486
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "parent"

    .line 487
    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 488
    invoke-virtual {p0}, Ll/᩻ۡۡ;->ܽ()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->stringOrSpannedString(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    const-string v2, "query"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 489
    iget-object v1, p0, Ll/᩻ۡۡ;->۬:Landroid/util/SparseArray;

    .line 490
    iget-object v2, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    if-eqz v2, :cond_0

    .line 491
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 492
    iget-object v2, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    :cond_0
    const-string v2, "editor"

    .line 494
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 1

    .line 429
    iget-boolean v0, p0, Ll/᩻ۡۡ;->᩸:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 432
    :cond_0
    iget-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 435
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 3

    .line 196
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x1010429

    .line 126
    invoke-static {v0, v1}, Ll/᩸֡᩷;->֫(Landroid/content/res/Resources$Theme;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 197
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x1010036

    .line 126
    invoke-static {v1, v2}, Ll/᩸֡᩷;->֫(Landroid/content/res/Resources$Theme;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 197
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    .line 198
    iget-object v2, p0, Ll/᩻ۡۡ;->ۨ:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 199
    iget-object v2, p0, Ll/᩻ۡۡ;->ܰ:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 200
    iget-object v2, p0, Ll/᩻ۡۡ;->᩹:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 201
    invoke-direct {p0}, Ll/᩻ۡۡ;->᩻()V

    .line 202
    iget-object v0, p0, Ll/᩻ۡۡ;->᩺:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 205
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Ll/۠۬;->ܳ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 206
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {v2, v1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 207
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 209
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    .line 250
    :cond_0
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    if-nez v0, :cond_4

    .line 252
    iget-object v0, p0, Ll/᩻ۡۡ;->۫:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 253
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->stringOrSpannedString(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ۡۡ;->۫:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    .line 254
    iput-object p1, p0, Ll/᩻ۡۡ;->۬:Landroid/util/SparseArray;

    .line 255
    invoke-direct {p0}, Ll/᩻ۡۡ;->ۡ()V

    if-eqz v0, :cond_3

    .line 256
    iget-object p1, p0, Ll/᩻ۡۡ;->ۗ:Ll/ܿۡۡ;

    if-eqz p1, :cond_3

    iget-object v0, p0, Ll/᩻ۡۡ;->۫:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿۡۡ;->֫(Ljava/lang/String;)V

    :cond_3
    return-void

    .line 258
    :cond_4
    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 259
    iget-object p1, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۤᩳ;->ᩴ(I)V

    return-void
.end method

.method public final ֫(Ll/ܿۡۡ;)V
    .locals 0

    .line 235
    iput-object p1, p0, Ll/᩻ۡۡ;->ۗ:Ll/ܿۡۡ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 224
    iput-boolean p1, p0, Ll/᩻ۡۡ;->᩶:Z

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 335
    iget-boolean v0, p0, Ll/᩻ۡۡ;->᩶:Z

    if-eqz v0, :cond_0

    .line 336
    invoke-virtual {p0}, Ll/᩻ۡۡ;->ᩳ()V

    return-void

    .line 320
    :cond_0
    iget-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 321
    iput-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    .line 322
    invoke-direct {p0, v0}, Ll/᩻ۡۡ;->ܽ(Z)V

    .line 323
    invoke-virtual {p0}, Ll/᩻ۡۡ;->clearFocus()V

    .line 324
    iget-object v0, p0, Ll/᩻ۡۡ;->ۗ:Ll/ܿۡۡ;

    if-eqz v0, :cond_1

    .line 325
    sget-object v1, Ll/ܳۡۡ;->᩹:Ll/ܳۡۡ;

    invoke-interface {v0, v1}, Ll/ܿۡۡ;->֫(Ll/ܳۡۡ;)V

    :cond_1
    return-void
.end method

.method public final ۧ(Z)V
    .locals 4

    .line 283
    invoke-direct {p0}, Ll/᩻ۡۡ;->ۜ()V

    .line 285
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 286
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 289
    :goto_0
    iget-boolean v3, p0, Ll/᩻ۡۡ;->ۙ:Z

    if-eqz v3, :cond_1

    .line 290
    iput-boolean v2, p0, Ll/᩻ۡۡ;->ۙ:Z

    .line 291
    invoke-direct {p0, v1}, Ll/᩻ۡۡ;->ܽ(Z)V

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    if-eqz v1, :cond_2

    .line 294
    iget-object v0, p0, Ll/᩻ۡۡ;->ۗ:Ll/ܿۡۡ;

    if-eqz v0, :cond_2

    .line 295
    sget-object v1, Ll/ܳۡۡ;->᩶:Ll/ܳۡۡ;

    invoke-interface {v0, v1}, Ll/ܿۡۡ;->֫(Ll/ܳۡۡ;)V

    .line 439
    :cond_2
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    if-nez v0, :cond_3

    goto :goto_2

    .line 440
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 441
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->ᩴ(I)V

    :goto_2
    if-eqz p1, :cond_4

    .line 299
    iget-object p1, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    invoke-static {p1}, Ll/ۙ᩸᩷;->ܽ(Landroid/view/View;)V

    :cond_4
    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 228
    iget-boolean v0, p0, Ll/᩻ۡۡ;->᩶:Z

    return v0
.end method

.method public final ܽ()Ljava/lang/CharSequence;
    .locals 1

    .line 267
    iget-object v0, p0, Ll/᩻ۡۡ;->۟:Ll/ܶۡۡ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩻ۡۡ;->۫:Ljava/lang/CharSequence;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 343
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩻ۡۡ;->ۙ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 307
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 308
    invoke-virtual {p0}, Ll/᩻ۡۡ;->clearFocus()V

    .line 309
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 310
    iget-object v0, p0, Ll/᩻ۡۡ;->ۗ:Ll/ܿۡۡ;

    if-eqz v0, :cond_0

    .line 311
    sget-object v1, Ll/ܳۡۡ;->ۙ:Ll/ܳۡۡ;

    invoke-interface {v0, v1}, Ll/ܿۡۡ;->֫(Ll/ܳۡۡ;)V

    :cond_0
    return-void
.end method
