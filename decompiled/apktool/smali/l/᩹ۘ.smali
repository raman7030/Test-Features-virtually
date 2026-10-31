.class public Ll/᩹ۘ;
.super Ll/֫ۖ;
.source "N5JQ"

# interfaces
.implements Ll/۬᩻;


# static fields
.field public static final ᩴ֫:Ll/֡ۘ;


# instance fields
.field public final ֫֫:Landroid/widget/ImageView;

.field public ۖ֫:Ljava/lang/CharSequence;

.field public final ۗ:Ljava/lang/CharSequence;

.field public final ۘ֫:Landroid/widget/ImageView;

.field public ۙ:I

.field public ۛ:Z

.field public final ۜ֫:Landroid/view/View;

.field public ۟:Ljava/lang/Runnable;

.field public ۡ֫:Ll/᩸ۘ;

.field public ۢ֫:[I

.field public final ۤ:Landroid/widget/ImageView;

.field public final ۧ֫:Landroid/view/View;

.field public ۨ:Z

.field public ۫:Z

.field public final ۬:Landroid/view/View;

.field public ܰ:Ljava/lang/CharSequence;

.field public ܳ֫:Landroid/graphics/Rect;

.field public final ܺ֫:Ljava/lang/Runnable;

.field public final ܽ֫:Landroid/graphics/drawable/Drawable;

.field public final ܿ֫:Ll/ܶۘ;

.field public final ᩳ֫:Landroid/view/View;

.field public final ᩶:Landroid/widget/ImageView;

.field public ᩷֫:[I

.field public ᩸:Z

.field public final ᩹:Landroid/widget/ImageView;

.field public ᩺:I

.field public ᩻֫:Landroid/graphics/Rect;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 181
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    new-instance v0, Ll/֡ۘ;

    invoke-direct {v0}, Ll/֡ۘ;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Ll/᩹ۘ;->ᩴ֫:Ll/֡ۘ;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f04040a

    .line 276
    invoke-direct {p0, p1, p2, v0}, Ll/᩹ۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 17

    move-object/from16 v6, p0

    .line 280
    invoke-direct/range {p0 .. p3}, Ll/֫ۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 136
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v6, Ll/᩹ۘ;->ܳ֫:Landroid/graphics/Rect;

    .line 137
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v6, Ll/᩹ۘ;->᩻֫:Landroid/graphics/Rect;

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 138
    iput-object v1, v6, Ll/᩹ۘ;->᩷֫:[I

    new-array v0, v0, [I

    .line 139
    iput-object v0, v6, Ll/᩹ۘ;->ۢ֫:[I

    .line 183
    new-instance v0, Ll/᩻ۘ;

    invoke-direct {v0, v6}, Ll/᩻ۘ;-><init>(Ll/᩹ۘ;)V

    iput-object v0, v6, Ll/᩹ۘ;->ܺ֫:Ljava/lang/Runnable;

    .line 190
    new-instance v0, Ll/ۜۘ;

    invoke-direct {v0, v6}, Ll/ۜۘ;-><init>(Ll/᩹ۘ;)V

    iput-object v0, v6, Ll/᩹ۘ;->۟:Ljava/lang/Runnable;

    .line 201
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 992
    new-instance v7, Ll/ۡۘ;

    invoke-direct {v7, v6}, Ll/ۡۘ;-><init>(Ll/᩹ۘ;)V

    .line 1014
    new-instance v8, Ll/ܺۘ;

    invoke-direct {v8, v6}, Ll/ܺۘ;-><init>(Ll/᩹ۘ;)V

    .line 1177
    new-instance v9, Ll/ۖۘ;

    invoke-direct {v9, v6}, Ll/ۖۘ;-><init>(Ll/᩹ۘ;)V

    .line 1423
    new-instance v10, Ll/ۘۘ;

    invoke-direct {v10, v6}, Ll/ۘۘ;-><init>(Ll/᩹ۘ;)V

    .line 1435
    new-instance v11, Ll/ᩴۘ;

    invoke-direct {v11, v6}, Ll/ᩴۘ;-><init>(Ll/᩹ۘ;)V

    .line 1729
    new-instance v12, Ll/ܳۘ;

    invoke-direct {v12, v6}, Ll/ܳۘ;-><init>(Ll/᩹ۘ;)V

    .line 282
    sget-object v2, Ll/ۗᩳ;->᩹:[I

    const/4 v0, 0x0

    move-object/from16 v13, p1

    move-object/from16 v3, p2

    move/from16 v5, p3

    invoke-static {v13, v3, v2, v5, v0}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object v14

    .line 285
    invoke-virtual {v14}, Ll/᩺ۘ;->ܽ()Landroid/content/res/TypedArray;

    move-result-object v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 284
    invoke-static/range {v0 .. v5}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 287
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/16 v1, 0x13

    const v2, 0x7f0d0019

    .line 288
    invoke-virtual {v14, v1, v2}, Ll/᩺ۘ;->ܳ(II)I

    move-result v1

    const/4 v2, 0x1

    .line 290
    invoke-virtual {v0, v1, v6, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const v0, 0x7f0a04ef

    .line 292
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶۘ;

    iput-object v0, v6, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    .line 293
    invoke-virtual {v0, v6}, Ll/ܶۘ;->֫(Ll/᩹ۘ;)V

    const v1, 0x7f0a04eb

    .line 295
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v6, Ll/᩹ۘ;->ۧ֫:Landroid/view/View;

    const v1, 0x7f0a04ee

    .line 296
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v6, Ll/᩹ۘ;->ᩳ֫:Landroid/view/View;

    const v2, 0x7f0a0572

    .line 297
    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, v6, Ll/᩹ۘ;->ۜ֫:Landroid/view/View;

    const v3, 0x7f0a04e9

    .line 298
    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v6, Ll/᩹ۘ;->֫֫:Landroid/widget/ImageView;

    const v4, 0x7f0a04ec

    .line 299
    invoke-virtual {v6, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, v6, Ll/᩹ۘ;->ۤ:Landroid/widget/ImageView;

    const v5, 0x7f0a04ea

    .line 300
    invoke-virtual {v6, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, v6, Ll/᩹ۘ;->᩹:Landroid/widget/ImageView;

    const v13, 0x7f0a04f0

    .line 301
    invoke-virtual {v6, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/ImageView;

    iput-object v13, v6, Ll/᩹ۘ;->ۘ֫:Landroid/widget/ImageView;

    const v15, 0x7f0a04ed

    .line 302
    invoke-virtual {v6, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/ImageView;

    iput-object v15, v6, Ll/᩹ۘ;->᩶:Landroid/widget/ImageView;

    move-object/from16 v16, v8

    const/16 v8, 0x14

    .line 306
    invoke-virtual {v14, v8}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 3370
    invoke-virtual {v1, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v1, 0x19

    .line 308
    invoke-virtual {v14, v1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 3370
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v1, 0x17

    .line 309
    invoke-virtual {v14, v1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0xf

    .line 310
    invoke-virtual {v14, v2}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0xc

    .line 311
    invoke-virtual {v14, v2}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0x1c

    .line 312
    invoke-virtual {v14, v2}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v13, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 313
    invoke-virtual {v14, v1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v15, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 v1, 0x16

    .line 315
    invoke-virtual {v14, v1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v6, Ll/᩹ۘ;->ܽ֫:Landroid/graphics/drawable/Drawable;

    .line 318
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f120016

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 317
    invoke-static {v3, v1}, Ll/ᩴᩴ;->֫(Landroid/view/View;Ljava/lang/CharSequence;)V

    const/16 v1, 0x1a

    const v2, 0x7f0d0018

    .line 321
    invoke-virtual {v14, v1, v2}, Ll/᩺ۘ;->ܳ(II)I

    const/16 v1, 0xd

    const/4 v2, 0x0

    .line 323
    invoke-virtual {v14, v1, v2}, Ll/᩺ۘ;->ܳ(II)I

    .line 325
    invoke-virtual {v3, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 326
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 327
    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 328
    invoke-virtual {v13, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 329
    invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 331
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 332
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 333
    invoke-virtual {v0, v10}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 334
    invoke-virtual {v0, v11}, Landroid/widget/AutoCompleteTextView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    move-object/from16 v1, v16

    .line 335
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 338
    new-instance v1, Ll/᩷ۘ;

    invoke-direct {v1, v6}, Ll/᩷ۘ;-><init>(Ll/᩹ۘ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const/16 v1, 0x12

    const/4 v2, 0x1

    .line 346
    invoke-virtual {v14, v1, v2}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v1

    .line 650
    iget-boolean v2, v6, Ll/᩹ۘ;->ۨ:Z

    if-ne v2, v1, :cond_0

    goto :goto_0

    .line 651
    :cond_0
    iput-boolean v1, v6, Ll/᩹ۘ;->ۨ:Z

    .line 652
    invoke-direct {v6, v1}, Ll/᩹ۘ;->֫(Z)V

    .line 653
    invoke-direct/range {p0 .. p0}, Ll/᩹ۘ;->ۢ()V

    :goto_0
    const/4 v1, -0x1

    const/4 v2, 0x2

    .line 348
    invoke-virtual {v14, v2, v1}, Ll/᩺ۘ;->ۧ(II)I

    move-result v2

    if-eq v2, v1, :cond_1

    .line 773
    iput v2, v6, Ll/᩹ۘ;->᩺:I

    .line 775
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->requestLayout()V

    :cond_1
    const/16 v2, 0xe

    .line 353
    invoke-virtual {v14, v2}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, v6, Ll/᩹ۘ;->ۗ:Ljava/lang/CharSequence;

    const/16 v2, 0x15

    .line 354
    invoke-virtual {v14, v2}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, v6, Ll/᩹ۘ;->ܰ:Ljava/lang/CharSequence;

    const/4 v2, 0x6

    .line 356
    invoke-virtual {v14, v2, v1}, Ll/᩺ۘ;->ܽ(II)I

    move-result v2

    if-eq v2, v1, :cond_2

    .line 447
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setImeOptions(I)V

    :cond_2
    const/4 v2, 0x5

    .line 361
    invoke-virtual {v14, v2, v1}, Ll/᩺ۘ;->ܽ(II)I

    move-result v2

    if-eq v2, v1, :cond_3

    .line 471
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setInputType(I)V

    :cond_3
    const/4 v1, 0x1

    .line 367
    invoke-virtual {v14, v1, v1}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v1

    .line 368
    invoke-virtual {v6, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 370
    invoke-virtual {v14}, Ll/᩺ۘ;->ܿ()V

    .line 373
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.speech.action.WEB_SEARCH"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0x10000000

    .line 374
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v3, "android.speech.extra.LANGUAGE_MODEL"

    const-string v4, "web_search"

    .line 375
    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 378
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 379
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 381
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getDropDownAnchor()I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v6, Ll/᩹ۘ;->۬:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 383
    new-instance v1, Ll/ۢۘ;

    invoke-direct {v1, v6}, Ll/ۢۘ;-><init>(Ll/᩹ۘ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 392
    :cond_4
    iget-boolean v0, v6, Ll/᩹ۘ;->ۨ:Z

    invoke-direct {v6, v0}, Ll/᩹ۘ;->֫(Z)V

    .line 393
    invoke-direct/range {p0 .. p0}, Ll/᩹ۘ;->ۢ()V

    return-void
.end method

.method private ֫(Z)V
    .locals 4

    .line 879
    iput-boolean p1, p0, Ll/᩹ۘ;->ۛ:Z

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    .line 883
    :goto_0
    iget-object v3, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 885
    iget-object v3, p0, Ll/᩹ۘ;->֫֫:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 930
    iget-object v2, p0, Ll/᩹ۘ;->ۤ:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    if-eqz p1, :cond_1

    const/16 p1, 0x8

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 887
    :goto_1
    iget-object v2, p0, Ll/᩹ۘ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 890
    iget-object p1, p0, Ll/᩹ۘ;->᩶:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Ll/᩹ۘ;->ۨ:Z

    if-eqz v2, :cond_3

    :cond_2
    const/16 v1, 0x8

    .line 895
    :cond_3
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 897
    invoke-direct {p0}, Ll/᩹ۘ;->᩷()V

    .line 1174
    iget-object p1, p0, Ll/᩹ۘ;->ۘ֫:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 940
    iget-object p1, p0, Ll/᩹ۘ;->ۜ֫:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private ۢ()V
    .locals 7

    .line 627
    iget-object v0, p0, Ll/᩹ۘ;->ܰ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 634
    :cond_0
    iget-object v0, p0, Ll/᩹ۘ;->ۗ:Ljava/lang/CharSequence;

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    .line 1104
    :cond_1
    iget-boolean v1, p0, Ll/᩹ۘ;->ۨ:Z

    iget-object v2, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/᩹ۘ;->ܽ֫:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_2

    goto :goto_1

    .line 1108
    :cond_2
    invoke-virtual {v2}, Landroid/widget/TextView;->getTextSize()F

    move-result v3

    float-to-double v3, v3

    const-wide/high16 v5, 0x3ff4000000000000L    # 1.25

    mul-double v3, v3, v5

    double-to-int v3, v3

    const/4 v4, 0x0

    .line 1109
    invoke-virtual {v1, v4, v4, v3, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1111
    new-instance v3, Landroid/text/SpannableStringBuilder;

    const-string v4, "   "

    invoke-direct {v3, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1112
    new-instance v4, Landroid/text/style/ImageSpan;

    invoke-direct {v4, v1}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x2

    const/16 v5, 0x21

    const/4 v6, 0x1

    invoke-virtual {v3, v4, v6, v1, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1113
    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-object v0, v3

    .line 1119
    :cond_3
    :goto_1
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private ᩷()V
    .locals 3

    .line 944
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 947
    iget-boolean v1, p0, Ll/᩹ۘ;->ۨ:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/᩹ۘ;->۫:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 948
    :goto_1
    iget-object v2, p0, Ll/᩹ۘ;->᩹:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 949
    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_3

    if-nez v0, :cond_2

    .line 951
    sget-object v0, Landroid/view/ViewGroup;->ENABLED_STATE_SET:[I

    goto :goto_2

    :cond_2
    sget-object v0, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    :goto_2
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    return-void
.end method


# virtual methods
.method public final clearFocus()V
    .locals 2

    const/4 v0, 0x1

    .line 504
    iput-boolean v0, p0, Ll/᩹ۘ;->᩸:Z

    .line 505
    invoke-super {p0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 506
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    const/4 v1, 0x0

    .line 507
    invoke-virtual {v0, v1}, Ll/ܶۘ;->֫(Z)V

    .line 508
    iput-boolean v1, p0, Ll/᩹ۘ;->᩸:Z

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 975
    iget-object v0, p0, Ll/᩹ۘ;->ܺ֫:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 976
    iget-object v0, p0, Ll/᩹ۘ;->۟:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 977
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 4

    .line 842
    invoke-super/range {p0 .. p5}, Ll/֫ۖ;->onLayout(ZIIII)V

    if-eqz p1, :cond_1

    .line 861
    iget-object p1, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    iget-object p2, p0, Ll/᩹ۘ;->᩷֫:[I

    invoke-virtual {p1, p2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 862
    iget-object p4, p0, Ll/᩹ۘ;->ۢ֫:[I

    invoke-virtual {p0, p4}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v0, 0x1

    .line 863
    aget v1, p2, v0

    aget v0, p4, v0

    sub-int/2addr v1, v0

    const/4 v0, 0x0

    .line 864
    aget p2, p2, v0

    aget p4, p4, v0

    sub-int/2addr p2, p4

    .line 865
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p4

    add-int/2addr p4, p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr v2, v1

    iget-object v3, p0, Ll/᩹ۘ;->ܳ֫:Landroid/graphics/Rect;

    invoke-virtual {v3, p2, v1, p4, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 848
    iget p2, v3, Landroid/graphics/Rect;->left:I

    iget p4, v3, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p3

    iget-object p3, p0, Ll/᩹ۘ;->᩻֫:Landroid/graphics/Rect;

    invoke-virtual {p3, p2, v0, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    .line 850
    iget-object p2, p0, Ll/᩹ۘ;->ۡ֫:Ll/᩸ۘ;

    if-nez p2, :cond_0

    .line 851
    new-instance p2, Ll/᩸ۘ;

    invoke-direct {p2, p1, p3, v3}, Ll/᩸ۘ;-><init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iput-object p2, p0, Ll/᩹ۘ;->ۡ֫:Ll/᩸ۘ;

    .line 853
    invoke-virtual {p0, p2}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    return-void

    .line 855
    :cond_0
    invoke-virtual {p2, p3, v3}, Ll/᩸ۘ;->֫(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 692
    iget-boolean v0, p0, Ll/᩹ۘ;->ۛ:Z

    if-eqz v0, :cond_0

    .line 794
    invoke-super {p0, p1, p2}, Ll/֫ۖ;->onMeasure(II)V

    return-void

    .line 798
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 799
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const v1, 0x7f070037

    const/high16 v2, -0x80000000

    const/high16 v3, 0x40000000    # 2.0f

    if-eq v0, v2, :cond_4

    if-eqz v0, :cond_2

    if-eq v0, v3, :cond_1

    goto :goto_0

    .line 812
    :cond_1
    iget v0, p0, Ll/᩹ۘ;->᩺:I

    if-lez v0, :cond_6

    .line 813
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    .line 818
    :cond_2
    iget p1, p0, Ll/᩹ۘ;->᩺:I

    if-lez p1, :cond_3

    goto :goto_0

    .line 869
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 870
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    goto :goto_0

    .line 804
    :cond_4
    iget v0, p0, Ll/᩹ۘ;->᩺:I

    if-lez v0, :cond_5

    .line 805
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    .line 869
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 870
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 807
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 823
    :cond_6
    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 824
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const v1, 0x7f070036

    if-eq v0, v2, :cond_8

    if-eqz v0, :cond_7

    goto :goto_1

    .line 874
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 875
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    goto :goto_1

    .line 874
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 875
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 828
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 836
    :goto_1
    invoke-static {p1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 837
    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 836
    invoke-super {p0, p1, p2}, Ll/֫ۖ;->onMeasure(II)V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1369
    instance-of v0, p1, Ll/֨ۘ;

    if-nez v0, :cond_0

    .line 1370
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 1373
    :cond_0
    check-cast p1, Ll/֨ۘ;

    .line 1374
    invoke-virtual {p1}, Ll/۟֫֫;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1375
    iget-boolean p1, p1, Ll/֨ۘ;->᩸:Z

    invoke-direct {p0, p1}, Ll/᩹ۘ;->֫(Z)V

    .line 1376
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1361
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 1362
    new-instance v1, Ll/֨ۘ;

    invoke-direct {v1, v0}, Ll/֨ۘ;-><init>(Landroid/os/Parcelable;)V

    .line 692
    iget-boolean v0, p0, Ll/᩹ۘ;->ۛ:Z

    .line 1363
    iput-boolean v0, v1, Ll/֨ۘ;->᩸:Z

    return-object v1
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1285
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowFocusChanged(Z)V

    .line 956
    iget-object p1, p0, Ll/᩹ۘ;->ܺ֫:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    .line 487
    iget-boolean v0, p0, Ll/᩹ۘ;->᩸:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 489
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return v1

    .line 692
    :cond_1
    iget-boolean v0, p0, Ll/᩹ۘ;->ۛ:Z

    if-nez v0, :cond_3

    .line 492
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 494
    invoke-direct {p0, v1}, Ll/᩹ۘ;->֫(Z)V

    :cond_2
    return p1

    .line 498
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 3

    .line 1307
    iget-boolean v0, p0, Ll/᩹ۘ;->۫:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1309
    iput-boolean v0, p0, Ll/᩹ۘ;->۫:Z

    .line 1310
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0}, Landroid/widget/TextView;->getImeOptions()I

    move-result v1

    iput v1, p0, Ll/᩹ۘ;->ۙ:I

    const/high16 v2, 0x2000000

    or-int/2addr v1, v2

    .line 1311
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    const-string v1, ""

    .line 1312
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 681
    invoke-virtual {p0}, Ll/᩹ۘ;->ܿ()V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1190
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1191
    iput-object v0, p0, Ll/᩹ۘ;->ۖ֫:Ljava/lang/CharSequence;

    .line 1192
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 930
    iget-object v0, p0, Ll/᩹ۘ;->ۤ:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1174
    iget-object v0, p0, Ll/᩹ۘ;->ۘ֫:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1195
    invoke-direct {p0}, Ll/᩹ۘ;->᩷()V

    .line 940
    iget-object v0, p0, Ll/᩹ۘ;->ۜ֫:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1200
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    return-void
.end method

.method public final ۜ()V
    .locals 2

    .line 960
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 961
    sget-object v0, Landroid/view/ViewGroup;->FOCUSED_STATE_SET:[I

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    .line 962
    :goto_0
    iget-object v1, p0, Ll/᩹ۘ;->ᩳ֫:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 964
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 966
    :cond_1
    iget-object v1, p0, Ll/᩹ۘ;->ۜ֫:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 968
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 970
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 578
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 580
    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 581
    iput-object v1, p0, Ll/᩹ۘ;->ۖ֫:Ljava/lang/CharSequence;

    .line 1296
    invoke-virtual {p0}, Ll/᩹ۘ;->clearFocus()V

    const/4 v1, 0x1

    .line 1297
    invoke-direct {p0, v1}, Ll/᩹ۘ;->֫(Z)V

    .line 1298
    iget v1, p0, Ll/᩹ۘ;->ۙ:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    const/4 v0, 0x0

    .line 1299
    iput-boolean v0, p0, Ll/᩹ۘ;->۫:Z

    return-void
.end method

.method public final ܳ()V
    .locals 2

    .line 1204
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1205
    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 1211
    invoke-virtual {v0, v1}, Ll/ܶۘ;->֫(Z)V

    .line 1218
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 7

    .line 1380
    iget-object v0, p0, Ll/᩹ۘ;->۬:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_3

    .line 1381
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 1382
    iget-object v3, p0, Ll/᩹ۘ;->ᩳ֫:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    .line 1383
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 1384
    sget v5, Ll/᩹ᩴ;->֫:I

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    const/4 v6, 0x0

    if-ne v5, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 1385
    :goto_0
    iget-boolean v5, p0, Ll/᩹ۘ;->ۨ:Z

    if-eqz v5, :cond_1

    const v5, 0x7f070029

    .line 1386
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    const v6, 0x7f07002a

    .line 1387
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    add-int v6, v1, v5

    .line 1389
    :cond_1
    iget-object v1, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    if-eqz v2, :cond_2

    .line 1392
    iget v2, v4, Landroid/graphics/Rect;->left:I

    neg-int v2, v2

    goto :goto_1

    .line 1394
    :cond_2
    iget v2, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v6

    sub-int v2, v3, v2

    .line 1396
    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 1397
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v2, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v2

    iget v2, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v2

    add-int/2addr v0, v6

    sub-int/2addr v0, v3

    .line 1399
    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    :cond_3
    return-void
.end method

.method public final ܿ()V
    .locals 2

    const/4 v0, 0x0

    .line 1242
    invoke-direct {p0, v0}, Ll/᩹ۘ;->֫(Z)V

    .line 1243
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const/4 v1, 0x1

    .line 1244
    invoke-virtual {v0, v1}, Ll/ܶۘ;->֫(Z)V

    return-void
.end method

.method public final ᩳ()V
    .locals 3

    .line 1222
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 1223
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 1224
    iget-boolean v0, p0, Ll/᩹ۘ;->ۨ:Z

    if-eqz v0, :cond_0

    .line 1228
    invoke-virtual {p0}, Ll/᩹ۘ;->clearFocus()V

    .line 1230
    invoke-direct {p0, v2}, Ll/᩹ۘ;->֫(Z)V

    :cond_0
    return-void

    :cond_1
    const-string v1, ""

    .line 1234
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1235
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 1236
    invoke-virtual {v0, v2}, Ll/ܶۘ;->֫(Z)V

    return-void
.end method

.method public final ᩻()V
    .locals 3

    .line 692
    iget-boolean v0, p0, Ll/᩹ۘ;->ۛ:Z

    .line 1274
    invoke-direct {p0, v0}, Ll/᩹ۘ;->֫(Z)V

    .line 956
    iget-object v0, p0, Ll/᩹ۘ;->ܺ֫:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1278
    iget-object v0, p0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1713
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    .line 1714
    invoke-static {v0}, Ll/᩵ۘ;->֫(Landroid/widget/AutoCompleteTextView;)V

    return-void

    .line 1716
    :cond_0
    sget-object v1, Ll/᩹ۘ;->ᩴ֫:Ll/֡ۘ;

    invoke-virtual {v1, v0}, Ll/֡ۘ;->ۧ(Landroid/widget/AutoCompleteTextView;)V

    .line 1717
    invoke-virtual {v1, v0}, Ll/֡ۘ;->֫(Landroid/widget/AutoCompleteTextView;)V

    :cond_1
    return-void
.end method
