.class public final Ll/ܰۚ;
.super Ljava/lang/Object;
.source "11CW"


# instance fields
.field public ֡:Ll/ܰ֨;

.field public ֫:I

.field public final ۖ:Ll/۟ۚ;

.field public ۘ:Ljava/util/ArrayList;

.field public ۚ:I

.field public ۜ:I

.field public ۡ:Ljava/util/ArrayList;

.field public ۢ:Z

.field public ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܺ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:I

.field public ᩵:F

.field public ᩷:I

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/۟ۚ;Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 9

    .line 799
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 434
    iput v0, p0, Ll/ܰۚ;->᩷:I

    const/4 v1, 0x0

    .line 435
    iput-boolean v1, p0, Ll/ܰۚ;->ۢ:Z

    .line 436
    iput v0, p0, Ll/ܰۚ;->ۧ:I

    .line 437
    iput v0, p0, Ll/ܰۚ;->ܽ:I

    .line 438
    iput v1, p0, Ll/ܰۚ;->ᩳ:I

    const/4 v2, 0x0

    .line 439
    iput-object v2, p0, Ll/ܰۚ;->ܳ:Ljava/lang/String;

    .line 440
    iput v0, p0, Ll/ܰۚ;->ܿ:I

    const/16 v3, 0x190

    .line 441
    iput v3, p0, Ll/ܰۚ;->ۜ:I

    const/4 v3, 0x0

    .line 442
    iput v3, p0, Ll/ܰۚ;->᩵:F

    .line 444
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Ll/ܰۚ;->ۡ:Ljava/util/ArrayList;

    .line 445
    iput-object v2, p0, Ll/ܰۚ;->֡:Ll/ܰ֨;

    .line 446
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/ܰۚ;->ۘ:Ljava/util/ArrayList;

    .line 447
    iput v1, p0, Ll/ܰۚ;->֫:I

    .line 453
    iput-boolean v1, p0, Ll/ܰۚ;->᩻:Z

    .line 454
    iput v0, p0, Ll/ܰۚ;->ᩴ:I

    .line 455
    iput v1, p0, Ll/ܰۚ;->ܺ:I

    .line 456
    iput v1, p0, Ll/ܰۚ;->ۚ:I

    .line 800
    invoke-static {p1}, Ll/۟ۚ;->ᩳ(Ll/۟ۚ;)I

    move-result v2

    iput v2, p0, Ll/ܰۚ;->ۜ:I

    .line 801
    invoke-static {p1}, Ll/۟ۚ;->֫(Ll/۟ۚ;)I

    move-result v2

    iput v2, p0, Ll/ܰۚ;->ܺ:I

    .line 802
    iput-object p1, p0, Ll/ܰۚ;->ۖ:Ll/۟ۚ;

    .line 803
    invoke-static {p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p3

    .line 807
    sget-object v2, Ll/᩸᩸;->ۙ:[I

    invoke-virtual {p2, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p3

    .line 813
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v2, :cond_e

    .line 815
    invoke-virtual {p3, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v5

    const/4 v6, 0x2

    const-string v7, "layout"

    if-ne v5, v6, :cond_0

    .line 817
    iget v4, p0, Ll/ܰۚ;->ۧ:I

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->ۧ:I

    .line 818
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    iget v5, p0, Ll/ܰۚ;->ۧ:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v4

    .line 819
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 820
    new-instance v4, Ll/ۘ᩸;

    invoke-direct {v4}, Ll/ۘ᩸;-><init>()V

    .line 821
    iget v5, p0, Ll/ܰۚ;->ۧ:I

    invoke-virtual {v4, p2, v5}, Ll/ۘ᩸;->֫(Landroid/content/Context;I)V

    .line 822
    invoke-static {p1}, Ll/۟ۚ;->ۧ(Ll/۟ۚ;)Landroid/util/SparseArray;

    move-result-object v5

    iget v6, p0, Ll/ܰۚ;->ۧ:I

    invoke-virtual {v5, v6, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    const/4 v6, 0x3

    if-ne v5, v6, :cond_1

    .line 829
    iget v4, p0, Ll/ܰۚ;->ܽ:I

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->ܽ:I

    .line 830
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    iget v5, p0, Ll/ܰۚ;->ܽ:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v4

    .line 831
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 832
    new-instance v4, Ll/ۘ᩸;

    invoke-direct {v4}, Ll/ۘ᩸;-><init>()V

    .line 833
    iget v5, p0, Ll/ܰۚ;->ܽ:I

    invoke-virtual {v4, p2, v5}, Ll/ۘ᩸;->֫(Landroid/content/Context;I)V

    .line 834
    invoke-static {p1}, Ll/۟ۚ;->ۧ(Ll/۟ۚ;)Landroid/util/SparseArray;

    move-result-object v5

    iget v6, p0, Ll/ܰۚ;->ܽ:I

    invoke-virtual {v5, v6, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    const/4 v7, 0x6

    if-ne v5, v7, :cond_5

    .line 837
    invoke-virtual {p3, v5}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v7

    .line 839
    iget v7, v7, Landroid/util/TypedValue;->type:I

    const/4 v8, -0x2

    if-ne v7, v4, :cond_2

    .line 840
    invoke-virtual {p3, v5, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->ܿ:I

    if-eq v4, v0, :cond_d

    .line 842
    iput v8, p0, Ll/ܰۚ;->ᩳ:I

    goto/16 :goto_1

    :cond_2
    if-ne v7, v6, :cond_4

    .line 845
    invoke-virtual {p3, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Ll/ܰۚ;->ܳ:Ljava/lang/String;

    const-string v6, "/"

    .line 846
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-lez v4, :cond_3

    .line 847
    invoke-virtual {p3, v5, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->ܿ:I

    .line 848
    iput v8, p0, Ll/ܰۚ;->ᩳ:I

    goto/16 :goto_1

    .line 850
    :cond_3
    iput v0, p0, Ll/ܰۚ;->ᩳ:I

    goto :goto_1

    .line 853
    :cond_4
    iget v4, p0, Ll/ܰۚ;->ᩳ:I

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->ᩳ:I

    goto :goto_1

    :cond_5
    const/4 v6, 0x4

    if-ne v5, v6, :cond_6

    .line 857
    iget v4, p0, Ll/ܰۚ;->ۜ:I

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->ۜ:I

    goto :goto_1

    :cond_6
    const/16 v6, 0x8

    if-ne v5, v6, :cond_7

    .line 859
    iget v4, p0, Ll/ܰۚ;->᩵:F

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    iput v4, p0, Ll/ܰۚ;->᩵:F

    goto :goto_1

    :cond_7
    if-ne v5, v4, :cond_8

    .line 861
    iget v4, p0, Ll/ܰۚ;->֫:I

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->֫:I

    goto :goto_1

    :cond_8
    if-nez v5, :cond_9

    .line 863
    iget v4, p0, Ll/ܰۚ;->᩷:I

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->᩷:I

    goto :goto_1

    :cond_9
    const/16 v4, 0x9

    if-ne v5, v4, :cond_a

    .line 865
    iget-boolean v4, p0, Ll/ܰۚ;->᩻:Z

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Ll/ܰۚ;->᩻:Z

    goto :goto_1

    :cond_a
    const/4 v4, 0x7

    if-ne v5, v4, :cond_b

    .line 867
    invoke-virtual {p3, v5, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->ᩴ:I

    goto :goto_1

    :cond_b
    const/4 v4, 0x5

    if-ne v5, v4, :cond_c

    .line 869
    invoke-virtual {p3, v5, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->ܺ:I

    goto :goto_1

    :cond_c
    const/16 v4, 0xa

    if-ne v5, v4, :cond_d

    .line 871
    invoke-virtual {p3, v5, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    iput v4, p0, Ll/ܰۚ;->ۚ:I

    :cond_d
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 874
    :cond_e
    iget p1, p0, Ll/ܰۚ;->ܽ:I

    if-ne p1, v0, :cond_f

    .line 875
    iput-boolean v4, p0, Ll/ܰۚ;->ۢ:Z

    .line 809
    :cond_f
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Ll/۟ۚ;Ll/ܰۚ;)V
    .locals 4

    .line 763
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 434
    iput v0, p0, Ll/ܰۚ;->᩷:I

    const/4 v1, 0x0

    .line 435
    iput-boolean v1, p0, Ll/ܰۚ;->ۢ:Z

    .line 436
    iput v0, p0, Ll/ܰۚ;->ۧ:I

    .line 437
    iput v0, p0, Ll/ܰۚ;->ܽ:I

    .line 438
    iput v1, p0, Ll/ܰۚ;->ᩳ:I

    const/4 v2, 0x0

    .line 439
    iput-object v2, p0, Ll/ܰۚ;->ܳ:Ljava/lang/String;

    .line 440
    iput v0, p0, Ll/ܰۚ;->ܿ:I

    const/16 v3, 0x190

    .line 441
    iput v3, p0, Ll/ܰۚ;->ۜ:I

    const/4 v3, 0x0

    .line 442
    iput v3, p0, Ll/ܰۚ;->᩵:F

    .line 444
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Ll/ܰۚ;->ۡ:Ljava/util/ArrayList;

    .line 445
    iput-object v2, p0, Ll/ܰۚ;->֡:Ll/ܰ֨;

    .line 446
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/ܰۚ;->ۘ:Ljava/util/ArrayList;

    .line 447
    iput v1, p0, Ll/ܰۚ;->֫:I

    .line 453
    iput-boolean v1, p0, Ll/ܰۚ;->᩻:Z

    .line 454
    iput v0, p0, Ll/ܰۚ;->ᩴ:I

    .line 455
    iput v1, p0, Ll/ܰۚ;->ܺ:I

    .line 456
    iput v1, p0, Ll/ܰۚ;->ۚ:I

    .line 764
    iput-object p1, p0, Ll/ܰۚ;->ۖ:Ll/۟ۚ;

    if-eqz p2, :cond_0

    .line 766
    iget p1, p2, Ll/ܰۚ;->ᩴ:I

    iput p1, p0, Ll/ܰۚ;->ᩴ:I

    .line 767
    iget p1, p2, Ll/ܰۚ;->ᩳ:I

    iput p1, p0, Ll/ܰۚ;->ᩳ:I

    .line 768
    iget-object p1, p2, Ll/ܰۚ;->ܳ:Ljava/lang/String;

    iput-object p1, p0, Ll/ܰۚ;->ܳ:Ljava/lang/String;

    .line 769
    iget p1, p2, Ll/ܰۚ;->ܿ:I

    iput p1, p0, Ll/ܰۚ;->ܿ:I

    .line 770
    iget p1, p2, Ll/ܰۚ;->ۜ:I

    iput p1, p0, Ll/ܰۚ;->ۜ:I

    .line 771
    iget-object p1, p2, Ll/ܰۚ;->ۡ:Ljava/util/ArrayList;

    iput-object p1, p0, Ll/ܰۚ;->ۡ:Ljava/util/ArrayList;

    .line 772
    iget p1, p2, Ll/ܰۚ;->᩵:F

    iput p1, p0, Ll/ܰۚ;->᩵:F

    .line 773
    iget p1, p2, Ll/ܰۚ;->ܺ:I

    iput p1, p0, Ll/ܰۚ;->ܺ:I

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ܰۚ;)I
    .locals 0

    .line 433
    iget p0, p0, Ll/ܰۚ;->ۧ:I

    return p0
.end method

.method public static synthetic ֫(Ll/ܰۚ;I)V
    .locals 0

    .line 433
    iput p1, p0, Ll/ܰۚ;->ۧ:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܰۚ;Ll/ܰ֨;)V
    .locals 0

    .line 433
    iput-object p1, p0, Ll/ܰۚ;->֡:Ll/ܰ֨;

    return-void
.end method

.method public static synthetic ۖ(Ll/ܰۚ;)Z
    .locals 0

    .line 433
    iget-boolean p0, p0, Ll/ܰۚ;->᩻:Z

    return p0
.end method

.method public static synthetic ۘ(Ll/ܰۚ;)I
    .locals 0

    .line 433
    iget p0, p0, Ll/ܰۚ;->֫:I

    return p0
.end method

.method public static synthetic ۜ(Ll/ܰۚ;)I
    .locals 0

    .line 433
    iget p0, p0, Ll/ܰۚ;->ۜ:I

    return p0
.end method

.method public static synthetic ۡ(Ll/ܰۚ;)Ll/ܰ֨;
    .locals 0

    .line 433
    iget-object p0, p0, Ll/ܰۚ;->֡:Ll/ܰ֨;

    return-object p0
.end method

.method public static synthetic ۢ(Ll/ܰۚ;)F
    .locals 0

    .line 433
    iget p0, p0, Ll/ܰۚ;->᩵:F

    return p0
.end method

.method public static synthetic ۧ(Ll/ܰۚ;)I
    .locals 0

    .line 433
    iget p0, p0, Ll/ܰۚ;->ܽ:I

    return p0
.end method

.method public static synthetic ۧ(Ll/ܰۚ;I)V
    .locals 0

    .line 433
    iput p1, p0, Ll/ܰۚ;->ܽ:I

    return-void
.end method

.method public static synthetic ܳ(Ll/ܰۚ;)Ljava/lang/String;
    .locals 0

    .line 433
    iget-object p0, p0, Ll/ܰۚ;->ܳ:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic ܺ(Ll/ܰۚ;)Ljava/util/ArrayList;
    .locals 0

    .line 433
    iget-object p0, p0, Ll/ܰۚ;->ۘ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ܰۚ;)Z
    .locals 0

    .line 433
    iget-boolean p0, p0, Ll/ܰۚ;->ۢ:Z

    return p0
.end method

.method public static synthetic ܿ(Ll/ܰۚ;)I
    .locals 0

    .line 433
    iget p0, p0, Ll/ܰۚ;->ᩳ:I

    return p0
.end method

.method public static synthetic ᩳ(Ll/ܰۚ;)Ljava/util/ArrayList;
    .locals 0

    .line 433
    iget-object p0, p0, Ll/ܰۚ;->ۡ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic ᩴ(Ll/ܰۚ;)Ll/۟ۚ;
    .locals 0

    .line 433
    iget-object p0, p0, Ll/ܰۚ;->ۖ:Ll/۟ۚ;

    return-object p0
.end method

.method public static synthetic ᩷(Ll/ܰۚ;)I
    .locals 0

    .line 433
    iget p0, p0, Ll/ܰۚ;->ᩴ:I

    return p0
.end method

.method public static synthetic ᩻(Ll/ܰۚ;)I
    .locals 0

    .line 433
    iget p0, p0, Ll/ܰۚ;->ܿ:I

    return p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 485
    iget v0, p0, Ll/ܰۚ;->֫:I

    return v0
.end method

.method public final ֫(Landroid/content/Context;)V
    .locals 3

    .line 621
    iget v0, p0, Ll/ܰۚ;->ܽ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 624
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v2, p0, Ll/ܰۚ;->ܽ:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 626
    :goto_0
    iget v0, p0, Ll/ܰۚ;->ۧ:I

    if-ne v0, v1, :cond_1

    return-void

    .line 629
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iget v0, p0, Ll/ܰۚ;->ۧ:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    return-void
.end method

.method public final ֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 1

    .line 464
    new-instance v0, Ll/᩺ۚ;

    invoke-direct {v0, p1, p0, p2}, Ll/᩺ۚ;-><init>(Landroid/content/Context;Ll/ܰۚ;Landroid/content/res/XmlResourceParser;)V

    iget-object p1, p0, Ll/ܰۚ;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 502
    iget v0, p0, Ll/ܰۚ;->ۧ:I

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 599
    iget-boolean v0, p0, Ll/ܰۚ;->᩻:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 460
    iget v0, p0, Ll/ܰۚ;->ܺ:I

    return v0
.end method

.method public final ܿ()Ll/ܰ֨;
    .locals 1

    .line 560
    iget-object v0, p0, Ll/ܰۚ;->֡:Ll/ܰ֨;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 511
    iget v0, p0, Ll/ܰۚ;->ܽ:I

    return v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 635
    iget v0, p0, Ll/ܰۚ;->ۚ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
