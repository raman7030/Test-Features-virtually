.class public final Ll/᩸ܺۡ;
.super Ljava/lang/Object;
.source "34MM"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# static fields
.field public static final ۨ:I

.field public static final ᩺:I


# instance fields
.field public ۗ:Landroid/view/LayoutInflater;

.field public ۙ:Ll/֡ۚۢ;

.field public ۛ:Ll/ۙۖ;

.field public ۤ:Ljava/util/ArrayList;

.field public final ۫:I

.field public ۬:Ll/ۘ᩷ܳ;

.field public ᩶:Ll/ܶܺۡ;

.field public ᩸:Ll/ۗܺ᩷;

.field public ᩹:Landroid/view/View;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 42
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    sput v1, Ll/᩸ܺۡ;->᩺:I

    .line 43
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    sput v0, Ll/᩸ܺۡ;->ۨ:I

    return-void
.end method

.method public constructor <init>(Lbin/mt/plus/Main;Landroid/view/View;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩸ܺۡ;->ۤ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Ll/᩸ܺۡ;->᩶:Ll/ܶܺۡ;

    .line 51
    iput-object v0, p0, Ll/᩸ܺۡ;->۬:Ll/ۘ᩷ܳ;

    .line 56
    iput-object p1, p0, Ll/᩸ܺۡ;->᩸:Ll/ۗܺ᩷;

    .line 57
    iput-object p2, p0, Ll/᩸ܺۡ;->᩹:Landroid/view/View;

    .line 58
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iput-object p2, p0, Ll/᩸ܺۡ;->ۗ:Landroid/view/LayoutInflater;

    .line 59
    invoke-virtual {p1}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 61
    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Ll/᩸ܺۡ;->۫:I

    return-void
.end method

.method private ֫(Landroid/view/View;)V
    .locals 9

    const v0, 0x7f0a0160

    .line 184
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a0161

    .line 185
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v2, 0x7f0a015f

    .line 186
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 187
    sget v3, Ll/᩹֡᩷;->ۜ֫:I

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "\ufffc"

    aput-object v4, v3, v1

    .line 205
    iget-object v5, p0, Ll/᩸ܺۡ;->᩸:Ll/ۗܺ᩷;

    const v6, 0x7f1202ca

    invoke-virtual {v5, v6, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 206
    new-instance v5, Landroid/text/SpannableStringBuilder;

    invoke-direct {v5, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 207
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_0

    .line 209
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v4

    const/high16 v6, 0x40800000    # 4.0f

    .line 219
    invoke-static {v6}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v6

    const v7, 0x3e8f5c29    # 0.28f

    mul-float v7, v7, v4

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    const/high16 v7, 0x40000000    # 2.0f

    .line 220
    invoke-static {v7}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v7

    const v8, 0x3d75c28f    # 0.06f

    mul-float v4, v4, v8

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 221
    new-instance v7, Ll/֨ܺۡ;

    invoke-direct {v7, v6, v4, v4}, Ll/֨ܺۡ;-><init>(III)V

    add-int/lit8 v4, v3, 0x1

    const/16 v6, 0x21

    .line 209
    invoke-virtual {v5, v7, v3, v4, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 188
    :cond_0
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    sget v0, Ll/᩹֡᩷;->ۜ֫:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 190
    new-instance v0, Ll/ۚܺۡ;

    invoke-direct {v0, p0, p1, v1}, Ll/ۚܺۡ;-><init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private ֫(Landroid/view/View;Ll/۠ܺۡ;)V
    .locals 9

    if-nez p2, :cond_0

    const/4 p2, 0x4

    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 65
    :cond_0
    iget-object v0, p2, Ll/۠ܺۡ;->ܿ:Ljava/lang/String;

    iget-boolean v1, p2, Ll/۠ܺۡ;->ᩳ:Z

    .line 69
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const v2, 0x7f0a0631

    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0a0278

    .line 71
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 72
    sget-object v4, Ll/᩹֡᩷;->ۜ:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 73
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_1

    .line 102
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 103
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const-string v5, "\ufffc"

    .line 104
    invoke-virtual {v4, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 105
    invoke-virtual {v2}, Landroid/widget/TextView;->getTextSize()F

    move-result v5

    const/high16 v6, 0x40800000    # 4.0f

    .line 114
    invoke-static {v6}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v7

    const v8, 0x3e8f5c29    # 0.28f

    mul-float v8, v8, v5

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 115
    invoke-static {v6}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v6

    const v8, 0x3e0f5c29    # 0.14f

    mul-float v8, v8, v5

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    const v8, 0x3ca3d70a    # 0.02f

    mul-float v5, v5, v8

    .line 116
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    const/4 v8, 0x1

    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 117
    new-instance v8, Ll/֨ܺۡ;

    invoke-direct {v8, v7, v6, v5}, Ll/֨ܺۡ;-><init>(III)V

    add-int/lit8 v5, v0, 0x1

    const/16 v6, 0x21

    .line 105
    invoke-virtual {v4, v8, v0, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    move-object v0, v4

    .line 74
    :cond_1
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_2

    .line 75
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    goto :goto_0

    :cond_2
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 76
    iget v0, p2, Ll/۠ܺۡ;->ۧ:I

    if-nez v0, :cond_3

    const/16 v0, 0x8

    .line 77
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 79
    :cond_3
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 81
    :goto_1
    iget-boolean p2, p2, Ll/۠ܺۡ;->֫:Z

    if-nez p2, :cond_5

    const/4 p2, 0x0

    if-eqz v1, :cond_4

    .line 83
    invoke-virtual {v3, p2}, Landroid/view/View;->setDuplicateParentStateEnabled(Z)V

    .line 84
    invoke-virtual {v2, p2}, Landroid/view/View;->setDuplicateParentStateEnabled(Z)V

    .line 85
    invoke-virtual {v3, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 86
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_2

    .line 88
    :cond_4
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_2

    .line 91
    :cond_5
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_2
    if-eqz v1, :cond_6

    .line 94
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_6
    return-void
.end method

.method public static synthetic ֫(Ll/᩸ܺۡ;Landroid/view/View;)V
    .locals 3

    .line 191
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "sdrmlct"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    const v0, 0x7f0a0160

    .line 192
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 193
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x16

    if-gt p1, v0, :cond_0

    iget-object p1, p0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 194
    iget-object p1, p0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a0161

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 195
    iget-object v0, p0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 196
    iget-object p1, p0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v0

    iget-object p0, p0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getHeight()I

    move-result p0

    invoke-virtual {p1, v0, p0}, Landroid/widget/PopupWindow;->update(II)V

    :cond_0
    return-void
.end method

.method private ᩳ()Z
    .locals 5

    .line 172
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "sdrmlct"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 175
    :goto_0
    iget-object v3, p0, Ll/᩸ܺۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_2

    .line 176
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܺۡ;

    iget-boolean v3, v3, Ll/۠ܺۡ;->ᩳ:Z

    if-eqz v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 368
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ll/۠ܺۡ;

    .line 369
    iget-boolean v0, p1, Ll/۠ܺۡ;->֫:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 372
    :cond_0
    iget-object v0, p0, Ll/᩸ܺۡ;->᩶:Ll/ܶܺۡ;

    if-eqz v0, :cond_1

    .line 373
    iget p1, p1, Ll/۠ܺۡ;->ܽ:I

    invoke-interface {v0, p1}, Ll/ܶܺۡ;->֫(I)V

    .line 375
    :cond_1
    iget-object p1, p0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 376
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 377
    iput-object v0, p0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    .line 379
    :cond_2
    iget-object p1, p0, Ll/᩸ܺۡ;->ۙ:Ll/֡ۚۢ;

    if-eqz p1, :cond_3

    .line 380
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 381
    iput-object v0, p0, Ll/᩸ܺۡ;->ۙ:Ll/֡ۚۢ;

    :cond_3
    :goto_0
    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 387
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ll/۠ܺۡ;

    .line 388
    iget-boolean v0, p1, Ll/۠ܺۡ;->ᩳ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 391
    :cond_0
    iget-object v0, p0, Ll/᩸ܺۡ;->۬:Ll/ۘ᩷ܳ;

    if-eqz v0, :cond_4

    iget p1, p1, Ll/۠ܺۡ;->ܽ:I

    iget-object v1, v0, Ll/ۘ᩷ܳ;->֫:Ll/ܽۢܳ;

    iget v2, v0, Ll/ۘ᩷ܳ;->ۧ:I

    iget-object v3, v0, Ll/ۘ᩷ܳ;->ܽ:Ljava/util/ArrayList;

    iget-object v0, v0, Ll/ۘ᩷ܳ;->ᩳ:Ll/ۖۢܳ;

    invoke-static {v1, v2, v3, v0, p1}, Ll/ܽۢܳ;->ۧ(Ll/ܽۢܳ;ILjava/util/ArrayList;Ll/ۖۢܳ;I)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 394
    :cond_1
    iget-object p1, p0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 395
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 396
    iput-object v0, p0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    .line 398
    :cond_2
    iget-object p1, p0, Ll/᩸ܺۡ;->ۙ:Ll/֡ۚۢ;

    if-eqz p1, :cond_3

    .line 399
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 400
    iput-object v0, p0, Ll/᩸ܺۡ;->ۙ:Ll/֡ۚۢ;

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()V
    .locals 18

    move-object/from16 v0, p0

    const v1, 0x7f0d01b2

    .line 225
    iget-object v2, v0, Ll/᩸ܺۡ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v2, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v3, 0x7f0a02d9

    .line 226
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    .line 227
    new-instance v4, Ll/ۙۖ;

    const v5, 0x7f0403bd

    const/4 v6, 0x0

    invoke-direct {v4, v2, v6, v5}, Ll/ۙۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v4, v0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    .line 232
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 234
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 235
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 236
    iget v4, v5, Landroid/graphics/Rect;->left:I

    iget v6, v5, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v6

    .line 237
    iget v6, v5, Landroid/graphics/Rect;->top:I

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v6, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 240
    :goto_0
    iget v5, v0, Ll/᩸ܺۡ;->۫:I

    sub-int/2addr v5, v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 245
    :goto_1
    iget-object v11, v0, Ll/᩸ܺۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    sget v13, Ll/᩸ܺۡ;->ۨ:I

    sget v14, Ll/᩸ܺۡ;->᩺:I

    if-ge v7, v12, :cond_5

    add-int/lit8 v12, v7, 0x1

    .line 247
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/۠ܺۡ;

    move/from16 v16, v6

    .line 249
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-eq v12, v6, :cond_1

    add-int/lit8 v7, v7, 0x2

    .line 250
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠ܺۡ;

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    move v7, v12

    .line 254
    :goto_2
    iget-object v11, v0, Ll/᩸ܺۡ;->ۗ:Landroid/view/LayoutInflater;

    const v12, 0x7f0d01b3

    move/from16 v17, v7

    const/4 v7, 0x0

    invoke-virtual {v11, v12, v3, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v7

    if-nez v8, :cond_2

    .line 256
    invoke-virtual {v7, v14, v13}, Landroid/view/View;->measure(II)V

    .line 257
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    :cond_2
    const v11, 0x7f0a0358

    .line 259
    invoke-virtual {v7, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    const v12, 0x7f0a0359

    .line 260
    invoke-virtual {v7, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    .line 261
    invoke-direct {v0, v11, v15}, Ll/᩸ܺۡ;->֫(Landroid/view/View;Ll/۠ܺۡ;)V

    .line 262
    invoke-direct {v0, v12, v6}, Ll/᩸ܺۡ;->֫(Landroid/view/View;Ll/۠ܺۡ;)V

    .line 264
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/2addr v10, v8

    if-eq v9, v5, :cond_4

    .line 267
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    shl-int/lit8 v6, v6, 0x1

    if-le v6, v9, :cond_3

    move v9, v6

    :cond_3
    if-le v9, v5, :cond_4

    move v9, v5

    :cond_4
    move/from16 v6, v16

    move/from16 v7, v17

    goto :goto_1

    :cond_5
    move/from16 v16, v6

    .line 274
    invoke-direct/range {p0 .. p0}, Ll/᩸ܺۡ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 276
    invoke-direct {v0, v1}, Ll/᩸ܺۡ;->֫(Landroid/view/View;)V

    .line 278
    :cond_6
    iget-object v5, v0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 279
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x16

    if-gt v5, v6, :cond_a

    if-eqz v3, :cond_8

    if-lez v9, :cond_7

    const/high16 v3, 0x40000000    # 2.0f

    .line 283
    invoke-static {v9, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    .line 285
    :cond_7
    invoke-virtual {v1, v14, v13}, Landroid/view/View;->measure(II)V

    .line 286
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    .line 288
    :cond_8
    iget-object v1, v0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    add-int/2addr v9, v4

    invoke-virtual {v1, v9}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 291
    invoke-virtual {v2}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v3, "dimen"

    const-string v4, "android"

    const-string v5, "status_bar_height"

    invoke-virtual {v1, v5, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_9

    .line 293
    invoke-virtual {v2}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    goto :goto_3

    :cond_9
    const/4 v1, 0x0

    .line 295
    :goto_3
    iget-object v3, v0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    add-int v10, v10, v16

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    sub-int/2addr v4, v1

    sub-int v4, v4, v16

    invoke-static {v10, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 297
    :cond_a
    iget-object v1, v0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 298
    iget-object v1, v0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 299
    iget-object v1, v0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    const v1, 0x1020002

    .line 300
    invoke-virtual {v2, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    .line 301
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 302
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 303
    invoke-virtual {v1, v4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    new-array v1, v3, [I

    .line 306
    iget-object v3, v0, Ll/᩸ܺۡ;->᩹:Landroid/view/View;

    invoke-virtual {v3, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 307
    iget-object v1, v0, Ll/᩸ܺۡ;->ۛ:Ll/ۙۖ;

    const/16 v4, 0x11

    invoke-virtual {v1, v3, v4, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method

.method public final ֫(II)V
    .locals 7

    .line 431
    new-instance v6, Ll/۠ܺۡ;

    iget-object v0, p0, Ll/᩸ܺۡ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, v6

    move v2, p2

    invoke-direct/range {v0 .. v5}, Ll/۠ܺۡ;-><init>(Ljava/lang/String;IIZZ)V

    iget-object p1, p0, Ll/᩸ܺۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;IIZZ)V
    .locals 7

    .line 435
    new-instance v6, Ll/۠ܺۡ;

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Ll/۠ܺۡ;-><init>(Ljava/lang/String;IIZZ)V

    iget-object p1, p0, Ll/᩸ܺۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۘ᩷ܳ;)V
    .locals 0

    .line 443
    iput-object p1, p0, Ll/᩸ܺۡ;->۬:Ll/ۘ᩷ܳ;

    return-void
.end method

.method public final ֫(Ll/ܶܺۡ;)V
    .locals 0

    .line 439
    iput-object p1, p0, Ll/᩸ܺۡ;->᩶:Ll/ܶܺۡ;

    return-void
.end method

.method public final ۧ()V
    .locals 10

    const v0, 0x7f0d01b2

    .line 311
    iget-object v1, p0, Ll/᩸ܺۡ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0a02d9

    .line 312
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 314
    :goto_0
    iget-object v5, p0, Ll/᩸ܺۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v4, v6, :cond_1

    add-int/lit8 v6, v4, 0x1

    .line 315
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠ܺۡ;

    .line 317
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-eq v6, v8, :cond_0

    add-int/lit8 v4, v4, 0x2

    .line 318
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܺۡ;

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    move v4, v6

    .line 322
    :goto_1
    iget-object v6, p0, Ll/᩸ܺۡ;->ۗ:Landroid/view/LayoutInflater;

    const v8, 0x7f0d01b3

    invoke-virtual {v6, v8, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    const v8, 0x7f0a0358

    .line 323
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const v9, 0x7f0a0359

    .line 324
    invoke-virtual {v6, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 325
    invoke-direct {p0, v8, v7}, Ll/᩸ܺۡ;->֫(Landroid/view/View;Ll/۠ܺۡ;)V

    .line 326
    invoke-direct {p0, v9, v5}, Ll/᩸ܺۡ;->֫(Landroid/view/View;Ll/۠ܺۡ;)V

    .line 327
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 329
    :cond_1
    invoke-direct {p0}, Ll/᩸ܺۡ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 330
    invoke-direct {p0, v0}, Ll/᩸ܺۡ;->֫(Landroid/view/View;)V

    .line 332
    :cond_2
    sget v2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v2, Ll/᩵ۚۢ;

    invoke-direct {v2, v1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 332
    invoke-virtual {v2, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ܺۡ;->ۙ:Ll/֡ۚۢ;

    return-void
.end method

.method public final ܽ()V
    .locals 8

    const v0, 0x7f0d01b2

    .line 336
    iget-object v1, p0, Ll/᩸ܺۡ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    .line 361
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const/4 v3, -0x1

    .line 362
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 363
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v2, 0x7f0a04cc

    .line 340
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 361
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    const/4 v5, 0x0

    .line 362
    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 363
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v2, 0x7f0a02d9

    .line 341
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 361
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 362
    iput v3, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 363
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v3, 0x0

    .line 345
    :goto_0
    iget-object v4, p0, Ll/᩸ܺۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v3, v6, :cond_0

    add-int/lit8 v6, v3, 0x1

    .line 346
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܺۡ;

    .line 347
    iget-object v4, p0, Ll/᩸ܺۡ;->ۗ:Landroid/view/LayoutInflater;

    const v7, 0x7f0d01b4

    invoke-virtual {v4, v7, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 348
    invoke-direct {p0, v4, v3}, Ll/᩸ܺۡ;->֫(Landroid/view/View;Ll/۠ܺۡ;)V

    .line 349
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move v3, v6

    goto :goto_0

    .line 351
    :cond_0
    invoke-direct {p0}, Ll/᩸ܺۡ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 352
    invoke-direct {p0, v0}, Ll/᩸ܺۡ;->֫(Landroid/view/View;)V

    .line 354
    :cond_1
    sget v2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v2, Ll/᩵ۚۢ;

    invoke-direct {v2, v1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 354
    invoke-virtual {v2, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ܺۡ;->ۙ:Ll/֡ۚۢ;

    return-void
.end method
