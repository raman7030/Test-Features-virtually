.class public Ll/ۢۖ;
.super Ljava/lang/Object;
.source "25PA"

# interfaces
.implements Ll/ۢ᩷;


# static fields
.field public static ۘ֫:Ljava/lang/reflect/Method;

.field public static ᩴ֫:Ljava/lang/reflect/Method;

.field public static ᩵֫:Ljava/lang/reflect/Method;


# instance fields
.field public final ֫֫:Ll/ܿۖ;

.field public final ۖ֫:Ll/ۜۖ;

.field public ۗ:I

.field public ۙ:I

.field public ۛ:Z

.field public ۜ֫:Z

.field public final ۟:Landroid/os/Handler;

.field public final ۡ֫:Ll/᩻ۖ;

.field public final ۢ֫:Ll/᩷ۖ;

.field public ۤ:I

.field public ۧ֫:Landroid/widget/AdapterView$OnItemClickListener;

.field public ۨ:I

.field public ۫:Ll/۫ܺ;

.field public ۬:I

.field public ܰ:Landroid/graphics/Rect;

.field public ܳ֫:Landroid/database/DataSetObserver;

.field public final ܺ֫:Landroid/graphics/Rect;

.field public ܽ֫:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public ܿ֫:Z

.field public ᩳ֫:I

.field public ᩶:Landroid/view/View;

.field public ᩷֫:Landroid/widget/PopupWindow;

.field public ᩸:Landroid/widget/ListAdapter;

.field public ᩹:Landroid/content/Context;

.field public ᩺:I

.field public ᩻֫:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 86
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x1

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v5, Landroid/widget/PopupWindow;

    if-gt v0, v1, :cond_0

    :try_start_0
    const-string v0, "setClipToScreenEnabled"

    new-array v1, v3, [Ljava/lang/Class;

    aput-object v4, v1, v2

    .line 88
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/ۢۖ;->ᩴ֫:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    const-string v0, "setEpicenterBounds"

    new-array v1, v3, [Ljava/lang/Class;

    .line 95
    const-class v6, Landroid/graphics/Rect;

    aput-object v6, v1, v2

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/ۢۖ;->᩵֫:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    .line 102
    :cond_0
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_1

    :try_start_2
    const-string v0, "getMaxAvailableHeight"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Class;

    .line 104
    const-class v6, Landroid/view/View;

    aput-object v6, v1, v2

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v4, v1, v2

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/ۢۖ;->ۘ֫:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7f0402fe

    .line 226
    invoke-direct {p0, p1, v0, v1}, Ll/ۢۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0402fe

    .line 237
    invoke-direct {p0, p1, p2, v0}, Ll/ۢۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 250
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۢۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, -0x2

    .line 117
    iput p4, p0, Ll/ۢۖ;->ۗ:I

    .line 118
    iput p4, p0, Ll/ۢۖ;->ۨ:I

    const/16 p4, 0x3ea

    .line 121
    iput p4, p0, Ll/ۢۖ;->᩺:I

    const/4 p4, 0x0

    .line 126
    iput p4, p0, Ll/ۢۖ;->ۙ:I

    const v0, 0x7fffffff

    .line 130
    iput v0, p0, Ll/ۢۖ;->ᩳ֫:I

    .line 144
    new-instance v0, Ll/᩷ۖ;

    invoke-direct {v0, p0}, Ll/᩷ۖ;-><init>(Ll/ۢۖ;)V

    iput-object v0, p0, Ll/ۢۖ;->ۢ֫:Ll/᩷ۖ;

    .line 145
    new-instance v0, Ll/ۜۖ;

    invoke-direct {v0, p0}, Ll/ۜۖ;-><init>(Ll/ۢۖ;)V

    iput-object v0, p0, Ll/ۢۖ;->ۖ֫:Ll/ۜۖ;

    .line 146
    new-instance v0, Ll/᩻ۖ;

    invoke-direct {v0, p0}, Ll/᩻ۖ;-><init>(Ll/ۢۖ;)V

    iput-object v0, p0, Ll/ۢۖ;->ۡ֫:Ll/᩻ۖ;

    .line 147
    new-instance v0, Ll/ܿۖ;

    invoke-direct {v0, p0}, Ll/ܿۖ;-><init>(Ll/ۢۖ;)V

    iput-object v0, p0, Ll/ۢۖ;->֫֫:Ll/ܿۖ;

    .line 152
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۢۖ;->ܺ֫:Landroid/graphics/Rect;

    .line 264
    iput-object p1, p0, Ll/ۢۖ;->᩹:Landroid/content/Context;

    .line 265
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ۢۖ;->۟:Landroid/os/Handler;

    .line 267
    sget-object v0, Ll/ۗᩳ;->֡:[I

    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 269
    invoke-virtual {v0, p4, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    iput v1, p0, Ll/ۢۖ;->۬:I

    const/4 v1, 0x1

    .line 271
    invoke-virtual {v0, v1, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Ll/ۢۖ;->ۤ:I

    if-eqz v2, :cond_0

    .line 274
    iput-boolean v1, p0, Ll/ۢۖ;->ۛ:Z

    .line 276
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 278
    new-instance v0, Ll/ܳۡ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/ܳۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    .line 279
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method


# virtual methods
.method public final dismiss()V
    .locals 2

    .line 771
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 v1, 0x0

    .line 773
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 774
    iput-object v1, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    .line 775
    iget-object v0, p0, Ll/ۢۖ;->۟:Landroid/os/Handler;

    iget-object v1, p0, Ll/ۢۖ;->ۢ֫:Ll/᩷ۖ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final getBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 422
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final isShowing()Z
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 431
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final show()V
    .locals 13

    .line 1157
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    iget-object v1, p0, Ll/ۢۖ;->᩹:Landroid/content/Context;

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    if-nez v0, :cond_1

    .line 1177
    iget-boolean v0, p0, Ll/ۢۖ;->ܿ֫:Z

    xor-int/2addr v0, v2

    invoke-virtual {p0, v1, v0}, Ll/ۢۖ;->֫(Landroid/content/Context;Z)Ll/۫ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    .line 1181
    iget-object v4, p0, Ll/ۢۖ;->᩸:Landroid/widget/ListAdapter;

    invoke-virtual {v0, v4}, Ll/ۢۢۡ;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1182
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    iget-object v4, p0, Ll/ۢۖ;->ۧ֫:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1183
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 1184
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 1185
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    new-instance v4, Ll/ۧۖ;

    invoke-direct {v4, p0}, Ll/ۧۖ;-><init>(Ll/ۢۖ;)V

    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1203
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    iget-object v4, p0, Ll/ۢۖ;->ۡ֫:Ll/᩻ۖ;

    invoke-virtual {v0, v4}, Ll/ۢۢۡ;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1205
    iget-object v0, p0, Ll/ۢۖ;->ܽ֫:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v0, :cond_0

    .line 1206
    iget-object v4, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v4, v0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1209
    :cond_0
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    .line 1260
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    goto :goto_0

    .line 1262
    :cond_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1275
    :goto_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1276
    iget-object v4, p0, Ll/ۢۖ;->ܺ֫:Landroid/graphics/Rect;

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    .line 1277
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1278
    iget v0, v4, Landroid/graphics/Rect;->top:I

    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v6, v0

    .line 1282
    iget-boolean v7, p0, Ll/ۢۖ;->ۛ:Z

    if-nez v7, :cond_3

    neg-int v0, v0

    .line 1283
    iput v0, p0, Ll/ۢۖ;->ۤ:I

    goto :goto_1

    .line 1286
    :cond_2
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    const/4 v6, 0x0

    .line 1292
    :cond_3
    :goto_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    const/4 v7, 0x2

    if-ne v0, v7, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 459
    :goto_2
    iget-object v8, p0, Ll/ۢۖ;->᩶:Landroid/view/View;

    .line 1293
    iget v9, p0, Ll/ۢۖ;->ۤ:I

    .line 1443
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x17

    if-gt v10, v11, :cond_6

    .line 1444
    sget-object v10, Ll/ۢۖ;->ۘ֫:Ljava/lang/reflect/Method;

    if-eqz v10, :cond_5

    .line 1446
    :try_start_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 1447
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v12, 0x3

    new-array v12, v12, [Ljava/lang/Object;

    aput-object v8, v12, v5

    aput-object v11, v12, v2

    aput-object v0, v12, v7

    .line 1446
    invoke-virtual {v10, v3, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 1453
    :catch_0
    :cond_5
    invoke-virtual {v3, v8, v9}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I

    move-result v0

    goto :goto_3

    .line 1455
    :cond_6
    invoke-static {v3, v8, v9, v0}, Ll/ܽۖ;->֫(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    move-result v0

    .line 1295
    :goto_3
    iget v8, p0, Ll/ۢۖ;->ۗ:I

    const/4 v9, -0x2

    const/4 v10, -0x1

    if-ne v8, v10, :cond_7

    add-int/2addr v0, v6

    goto :goto_6

    .line 1300
    :cond_7
    iget v11, p0, Ll/ۢۖ;->ۨ:I

    if-eq v11, v9, :cond_9

    const/high16 v12, 0x40000000    # 2.0f

    if-eq v11, v10, :cond_8

    .line 1314
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_4

    .line 1309
    :cond_8
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v11, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v11, v4

    sub-int/2addr v1, v11

    .line 1308
    invoke-static {v1, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_4

    .line 1303
    :cond_9
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v11, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v11, v4

    sub-int/2addr v1, v11

    const/high16 v4, -0x80000000

    .line 1302
    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 1320
    :goto_4
    iget-object v4, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v4, v1, v0}, Ll/۫ܺ;->֫(II)I

    move-result v0

    if-lez v0, :cond_a

    .line 1323
    iget-object v1, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget-object v4, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    .line 1324
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v1

    add-int/2addr v4, v6

    goto :goto_5

    :cond_a
    const/4 v4, 0x0

    :goto_5
    add-int/2addr v0, v4

    .line 867
    :goto_6
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v1

    if-ne v1, v7, :cond_b

    const/4 v1, 0x1

    goto :goto_7

    :cond_b
    const/4 v1, 0x0

    .line 665
    :goto_7
    iget v4, p0, Ll/ۢۖ;->᩺:I

    invoke-static {v3, v4}, Ll/֨֫֫;->֫(Landroid/widget/PopupWindow;I)V

    .line 667
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v4

    if-eqz v4, :cond_17

    .line 459
    iget-object v4, p0, Ll/ۢۖ;->᩶:Landroid/view/View;

    .line 668
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_11

    .line 673
    :cond_c
    iget v4, p0, Ll/ۢۖ;->ۨ:I

    if-ne v4, v10, :cond_d

    const/4 v4, -0x1

    goto :goto_8

    :cond_d
    if-ne v4, v9, :cond_e

    .line 459
    iget-object v4, p0, Ll/ۢۖ;->᩶:Landroid/view/View;

    .line 678
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    :cond_e
    :goto_8
    if-ne v8, v10, :cond_13

    if-eqz v1, :cond_f

    move v8, v0

    goto :goto_9

    :cond_f
    const/4 v0, -0x1

    const/4 v8, -0x1

    :goto_9
    if-eqz v1, :cond_11

    .line 689
    iget v0, p0, Ll/ۢۖ;->ۨ:I

    if-ne v0, v10, :cond_10

    const/4 v0, -0x1

    goto :goto_a

    :cond_10
    const/4 v0, 0x0

    :goto_a
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 691
    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_b

    .line 693
    :cond_11
    iget v0, p0, Ll/ۢۖ;->ۨ:I

    if-ne v0, v10, :cond_12

    const/4 v5, -0x1

    :cond_12
    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 695
    invoke-virtual {v3, v10}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_b

    :cond_13
    if-ne v8, v9, :cond_14

    move v8, v0

    .line 703
    :cond_14
    :goto_b
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 459
    iget-object v0, p0, Ll/ۢۖ;->᩶:Landroid/view/View;

    .line 705
    iget v5, p0, Ll/ۢۖ;->۬:I

    iget v6, p0, Ll/ۢۖ;->ۤ:I

    if-gez v4, :cond_15

    const/4 v1, -0x1

    const/4 v7, -0x1

    goto :goto_c

    :cond_15
    move v7, v4

    :goto_c
    if-gez v8, :cond_16

    const/4 v1, -0x1

    const/4 v8, -0x1

    :cond_16
    move-object v4, v0

    invoke-virtual/range {v3 .. v8}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    goto/16 :goto_11

    .line 710
    :cond_17
    iget v1, p0, Ll/ۢۖ;->ۨ:I

    if-ne v1, v10, :cond_18

    const/4 v1, -0x1

    goto :goto_d

    :cond_18
    if-ne v1, v9, :cond_19

    .line 459
    iget-object v1, p0, Ll/ۢۖ;->᩶:Landroid/view/View;

    .line 714
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    :cond_19
    :goto_d
    if-ne v8, v10, :cond_1a

    const/4 v8, -0x1

    goto :goto_e

    :cond_1a
    if-ne v8, v9, :cond_1b

    move v8, v0

    .line 731
    :cond_1b
    :goto_e
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 732
    invoke-virtual {v3, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 1429
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_1c

    .line 1430
    sget-object v0, Ll/ۢۖ;->ᩴ֫:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1d

    :try_start_1
    new-array v4, v2, [Ljava/lang/Object;

    .line 1432
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v6, v4, v5

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_f

    :catch_1
    nop

    goto :goto_f

    .line 1438
    :cond_1c
    invoke-static {v3, v2}, Ll/ᩳۖ;->֫(Landroid/widget/PopupWindow;Z)V

    .line 737
    :cond_1d
    :goto_f
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 738
    iget-object v0, p0, Ll/ۢۖ;->ۖ֫:Ll/ۜۖ;

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 739
    iget-boolean v0, p0, Ll/ۢۖ;->ۜ֫:Z

    if-eqz v0, :cond_1e

    .line 740
    iget-boolean v0, p0, Ll/ۢۖ;->᩻֫:Z

    invoke-static {v3, v0}, Ll/֨֫֫;->֫(Landroid/widget/PopupWindow;Z)V

    .line 742
    :cond_1e
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v0, v1, :cond_1f

    .line 743
    sget-object v0, Ll/ۢۖ;->᩵֫:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_20

    .line 745
    :try_start_2
    iget-object v1, p0, Ll/ۢۖ;->ܰ:Landroid/graphics/Rect;

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v1, v4, v5

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_10

    :catch_2
    nop

    goto :goto_10

    .line 751
    :cond_1f
    iget-object v0, p0, Ll/ۢۖ;->ܰ:Landroid/graphics/Rect;

    invoke-static {v3, v0}, Ll/ᩳۖ;->֫(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 459
    :cond_20
    :goto_10
    iget-object v0, p0, Ll/ۢۖ;->᩶:Landroid/view/View;

    .line 753
    iget v1, p0, Ll/ۢۖ;->۬:I

    iget v4, p0, Ll/ۢۖ;->ۤ:I

    iget v5, p0, Ll/ۢۖ;->ۙ:I

    .line 67
    invoke-virtual {v3, v0, v1, v4, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 755
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v0, v10}, Ll/ۢۢۡ;->setSelection(I)V

    .line 757
    iget-boolean v0, p0, Ll/ۢۖ;->ܿ֫:Z

    if-eqz v0, :cond_21

    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v0}, Ll/۫ܺ;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_22

    .line 845
    :cond_21
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    if-eqz v0, :cond_22

    .line 848
    invoke-virtual {v0, v2}, Ll/۫ܺ;->֫(Z)V

    .line 850
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 760
    :cond_22
    iget-boolean v0, p0, Ll/ۢۖ;->ܿ֫:Z

    if-nez v0, :cond_23

    .line 761
    iget-object v0, p0, Ll/ۢۖ;->۟:Landroid/os/Handler;

    iget-object v1, p0, Ll/ۢۖ;->֫֫:Ll/ܿۖ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_23
    :goto_11
    return-void
.end method

.method public final ֫()I
    .locals 1

    .line 476
    iget v0, p0, Ll/ۢۖ;->۬:I

    return v0
.end method

.method public ֫(Landroid/content/Context;Z)Ll/۫ܺ;
    .locals 1

    .line 949
    new-instance v0, Ll/۫ܺ;

    invoke-direct {v0, p1, p2}, Ll/۫ܺ;-><init>(Landroid/content/Context;Z)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 485
    iput p1, p0, Ll/ۢۖ;->۬:I

    return-void
.end method

.method public final ֫(Landroid/graphics/Rect;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 516
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ll/ۢۖ;->ܰ:Landroid/graphics/Rect;

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 0

    .line 469
    iput-object p1, p0, Ll/ۢۖ;->᩶:Landroid/view/View;

    return-void
.end method

.method public final ֫(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .line 618
    iput-object p1, p0, Ll/ۢۖ;->ۧ֫:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method public final ֫(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0

    .line 629
    iput-object p1, p0, Ll/ۢۖ;->ܽ֫:Landroid/widget/AdapterView$OnItemSelectedListener;

    return-void
.end method

.method public ֫(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 289
    iget-object v0, p0, Ll/ۢۖ;->ܳ֫:Landroid/database/DataSetObserver;

    if-nez v0, :cond_0

    .line 290
    new-instance v0, Ll/ܳۖ;

    invoke-direct {v0, p0}, Ll/ܳۖ;-><init>(Ll/ۢۖ;)V

    iput-object v0, p0, Ll/ۢۖ;->ܳ֫:Landroid/database/DataSetObserver;

    goto :goto_0

    .line 291
    :cond_0
    iget-object v1, p0, Ll/ۢۖ;->᩸:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_1

    .line 292
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 294
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ۢۖ;->᩸:Landroid/widget/ListAdapter;

    if-eqz p1, :cond_2

    .line 296
    iget-object v0, p0, Ll/ۢۖ;->ܳ֫:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 299
    :cond_2
    iget-object p1, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    if-eqz p1, :cond_3

    .line 300
    iget-object v0, p0, Ll/ۢۖ;->᩸:Landroid/widget/ListAdapter;

    invoke-virtual {p1, v0}, Ll/ۢۢۡ;->setAdapter(Landroid/widget/ListAdapter;)V

    :cond_3
    return-void
.end method

.method public final ֫(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 1

    .line 784
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method

.method public final ۖ()V
    .locals 2

    const/4 v0, 0x1

    .line 337
    iput-boolean v0, p0, Ll/ۢۖ;->ܿ֫:Z

    .line 338
    iget-object v1, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    return-void
.end method

.method public final ۘ()V
    .locals 1

    const/4 v0, 0x1

    .line 1336
    iput-boolean v0, p0, Ll/ۢۖ;->ۜ֫:Z

    .line 1337
    iput-boolean v0, p0, Ll/ۢۖ;->᩻֫:Z

    return-void
.end method

.method public final ۜ()Landroid/view/View;
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 936
    :cond_0
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ()V
    .locals 2

    const/4 v0, 0x0

    .line 440
    iget-object v1, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    return-void
.end method

.method public final ۢ()Z
    .locals 1

    .line 347
    iget-boolean v0, p0, Ll/ۢۖ;->ܿ֫:Z

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 504
    iput p1, p0, Ll/ۢۖ;->ۤ:I

    const/4 p1, 0x1

    .line 505
    iput-boolean p1, p0, Ll/ۢۖ;->ۛ:Z

    return-void
.end method

.method public final ܳ()J
    .locals 2

    .line 859
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    .line 923
    :cond_0
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemId()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܺ()V
    .locals 2

    const/4 v0, 0x2

    .line 810
    iget-object v1, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 492
    iget-boolean v0, p0, Ll/ۢۖ;->ۛ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 495
    :cond_0
    iget v0, p0, Ll/ۢۖ;->ۤ:I

    return v0
.end method

.method public final ܿ()Ljava/lang/Object;
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 897
    :cond_0
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 537
    iput p1, p0, Ll/ۢۖ;->ۙ:I

    return-void
.end method

.method public final ᩳ()Landroid/widget/ListView;
    .locals 1

    .line 945
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    return-object v0
.end method

.method public final ᩳ(I)V
    .locals 2

    .line 564
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 566
    iget-object v1, p0, Ll/ۢۖ;->ܺ֫:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 567
    iget v0, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۢۖ;->ۨ:I

    return-void

    .line 554
    :cond_0
    iput p1, p0, Ll/ۢۖ;->ۨ:I

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 544
    iget v0, p0, Ll/ۢۖ;->ۨ:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 910
    :cond_0
    iget-object v0, p0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    return v0
.end method
