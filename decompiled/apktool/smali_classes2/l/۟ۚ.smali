.class public final Ll/۟ۚ;
.super Ljava/lang/Object;
.source "11CW"


# instance fields
.field public ֡:Ljava/util/ArrayList;

.field public ֫:Ljava/util/ArrayList;

.field public final ۖ:Ll/ۤۚ;

.field public ۘ:Z

.field public ۚ:Ll/᩶ۚ;

.field public ۜ:Z

.field public ۡ:F

.field public ۢ:F

.field public ۧ:Ljava/util/HashMap;

.field public ܳ:Ll/ܰۚ;

.field public ܺ:I

.field public ܽ:Landroid/util/SparseArray;

.field public ܿ:I

.field public ᩳ:Ll/ܰۚ;

.field public ᩴ:Z

.field public ᩵:Ll/ۙ᩸;

.field public ᩷:Landroid/view/MotionEvent;

.field public ᩻:Landroid/util/SparseIntArray;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ۤۚ;I)V
    .locals 4

    .line 890
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Ll/۟ۚ;->᩵:Ll/ۙ᩸;

    .line 70
    iput-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    .line 72
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/۟ۚ;->֡:Ljava/util/ArrayList;

    .line 73
    iput-object v0, p0, Ll/۟ۚ;->ܳ:Ll/ܰۚ;

    .line 74
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/۟ۚ;->֫:Ljava/util/ArrayList;

    .line 76
    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, p0, Ll/۟ۚ;->ܽ:Landroid/util/SparseArray;

    .line 77
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Ll/۟ۚ;->ۧ:Ljava/util/HashMap;

    .line 78
    new-instance v2, Landroid/util/SparseIntArray;

    invoke-direct {v2}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v2, p0, Ll/۟ۚ;->᩻:Landroid/util/SparseIntArray;

    const/16 v2, 0x190

    .line 80
    iput v2, p0, Ll/۟ۚ;->ܿ:I

    const/4 v2, 0x0

    .line 81
    iput v2, p0, Ll/۟ۚ;->ܺ:I

    .line 85
    iput-boolean v2, p0, Ll/۟ۚ;->ۜ:Z

    .line 86
    iput-boolean v2, p0, Ll/۟ۚ;->ۘ:Z

    .line 891
    iput-object p2, p0, Ll/۟ۚ;->ۖ:Ll/ۤۚ;

    .line 906
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 907
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    .line 912
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    :goto_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_6

    if-eqz v2, :cond_4

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    goto/16 :goto_2

    .line 920
    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    .line 927
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v3, "StateSet"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 960
    new-instance v2, Ll/ۙ᩸;

    invoke-direct {v2, p1, p2}, Ll/ۙ᩸;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    iput-object v2, p0, Ll/۟ۚ;->᩵:Ll/ۙ᩸;

    goto/16 :goto_2

    :sswitch_1
    const-string v3, "MotionScene"

    .line 927
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 929
    invoke-direct {p0, p1, p2}, Ll/۟ۚ;->ۧ(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    goto/16 :goto_2

    :sswitch_2
    const-string v3, "OnSwipe"

    .line 927
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    if-nez v0, :cond_1

    .line 950
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p3}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 951
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 954
    :cond_1
    new-instance v2, Ll/ܰ֨;

    iget-object v3, p0, Ll/۟ۚ;->ۖ:Ll/ۤۚ;

    invoke-direct {v2, p1, v3, p2}, Ll/ܰ֨;-><init>(Landroid/content/Context;Ll/ۤۚ;Landroid/content/res/XmlResourceParser;)V

    invoke-static {v0, v2}, Ll/ܰۚ;->֫(Ll/ܰۚ;Ll/ܰ֨;)V

    goto/16 :goto_2

    :sswitch_3
    const-string v3, "OnClick"

    .line 927
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 957
    invoke-virtual {v0, p1, p2}, Ll/ܰۚ;->֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    goto :goto_2

    :sswitch_4
    const-string v3, "Transition"

    .line 927
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 932
    new-instance v0, Ll/ܰۚ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܰۚ;-><init>(Ll/۟ۚ;Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 933
    iget-object v2, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-nez v2, :cond_2

    invoke-static {v0}, Ll/ܰۚ;->ܽ(Ll/ܰۚ;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 934
    iput-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    .line 935
    invoke-static {v0}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 936
    iget-object v2, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v2}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v2

    iget-boolean v3, p0, Ll/۟ۚ;->ᩴ:Z

    invoke-virtual {v2, v3}, Ll/ܰ֨;->֫(Z)V

    .line 939
    :cond_2
    invoke-static {v0}, Ll/ܰۚ;->ܽ(Ll/ܰۚ;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 940
    invoke-static {v0}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_3

    .line 941
    iput-object v0, p0, Ll/۟ۚ;->ܳ:Ll/ܰۚ;

    goto :goto_1

    .line 943
    :cond_3
    iget-object v2, p0, Ll/۟ۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 945
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_5
    const-string v3, "KeyFrameSet"

    .line 927
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 966
    new-instance v2, Ll/᩻ۚ;

    invoke-direct {v2, p1, p2}, Ll/᩻ۚ;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 967
    invoke-static {v0}, Ll/ܰۚ;->ᩳ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_6
    const-string v3, "ConstraintSet"

    .line 927
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 963
    invoke-direct {p0, p1, p2}, Ll/۟ۚ;->֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    goto :goto_2

    .line 917
    :cond_4
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 914
    :cond_5
    :goto_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 894
    :catch_0
    :cond_6
    iget-object p1, p0, Ll/۟ۚ;->ܽ:Landroid/util/SparseArray;

    new-instance p2, Ll/ۘ᩸;

    invoke-direct {p2}, Ll/ۘ᩸;-><init>()V

    const p3, 0x7f0a03b1

    invoke-virtual {p1, p3, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 895
    iget-object p1, p0, Ll/۟ۚ;->ۧ:Ljava/util/HashMap;

    const-string p2, "motion_base"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_6
        -0x49df9cec -> :sswitch_5
        0x100d4975 -> :sswitch_4
        0x12a432c9 -> :sswitch_3
        0x138aac7b -> :sswitch_2
        0x2f487256 -> :sswitch_1
        0x526c4e31 -> :sswitch_0
    .end sparse-switch
.end method

.method private ֫(Landroid/content/Context;Ljava/lang/String;)I
    .locals 5

    const-string v0, "/"

    .line 1006
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    const/16 v0, 0x2f

    .line 1007
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 1008
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "id"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v0, v4, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    if-ne p1, v2, :cond_1

    .line 1014
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_1

    .line 1015
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    :cond_1
    return p1
.end method

.method public static synthetic ֫(Ll/۟ۚ;)I
    .locals 0

    .line 60
    iget p0, p0, Ll/۟ۚ;->ܺ:I

    return p0
.end method

.method private ֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 9

    .line 1024
    new-instance v0, Ll/ۘ᩸;

    invoke-direct {v0}, Ll/ۘ᩸;-><init>()V

    .line 1025
    invoke-virtual {v0}, Ll/ۘ᩸;->ۧ()V

    .line 1026
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    :goto_0
    if-ge v2, v1, :cond_3

    .line 1030
    invoke-interface {p2, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v6

    .line 1031
    invoke-interface {p2, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v7

    .line 1035
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "deriveConstraintsFrom"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    const-string v8, "id"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_2

    .line 1037
    :cond_0
    invoke-direct {p0, p1, v7}, Ll/۟ۚ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    const/16 v6, 0x2f

    .line 1560
    invoke-virtual {v7, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-gez v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 1564
    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 1038
    :goto_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v8, p0, Ll/۟ۚ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v8, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1041
    :cond_2
    invoke-direct {p0, p1, v7}, Ll/۟ۚ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-eq v4, v3, :cond_5

    .line 1046
    iget-object v1, p0, Ll/۟ۚ;->ۖ:Ll/ۤۚ;

    iget v1, v1, Ll/ۤۚ;->ۗ:I

    .line 1049
    invoke-virtual {v0, p1, p2}, Ll/ۘ᩸;->֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    if-eq v5, v3, :cond_4

    .line 1051
    iget-object p1, p0, Ll/۟ۚ;->᩻:Landroid/util/SparseIntArray;

    invoke-virtual {p1, v4, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 1053
    :cond_4
    iget-object p1, p0, Ll/۟ۚ;->ܽ:Landroid/util/SparseArray;

    invoke-virtual {p1, v4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public static synthetic ۧ(Ll/۟ۚ;)Landroid/util/SparseArray;
    .locals 0

    .line 60
    iget-object p0, p0, Ll/۟ۚ;->ܽ:Landroid/util/SparseArray;

    return-object p0
.end method

.method private ۧ(I)V
    .locals 4

    .line 1540
    iget-object v0, p0, Ll/۟ۚ;->᩻:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    if-lez v1, :cond_1

    .line 1542
    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    invoke-direct {p0, v2}, Ll/۟ۚ;->ۧ(I)V

    .line 1543
    iget-object v2, p0, Ll/۟ۚ;->ܽ:Landroid/util/SparseArray;

    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘ᩸;

    .line 1544
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ᩸;

    if-nez v2, :cond_0

    .line 1546
    iget-object p1, p0, Ll/۟ۚ;->ۖ:Ll/ۤۚ;

    .line 1547
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Ll/֡֡;->֫(Landroid/content/Context;I)Ljava/lang/String;

    return-void

    .line 1550
    :cond_0
    invoke-virtual {v3, v2}, Ll/ۘ᩸;->֫(Ll/ۘ᩸;)V

    const/4 v1, -0x1

    .line 1551
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->put(II)V

    :cond_1
    return-void
.end method

.method private ۧ(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 4

    .line 990
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    .line 991
    sget-object v0, Ll/᩸᩸;->֡:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 992
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_2

    .line 994
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    if-nez v2, :cond_0

    .line 996
    iget v3, p0, Ll/۟ۚ;->ܿ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/۟ۚ;->ܿ:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 998
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    iput v2, p0, Ll/۟ۚ;->ܺ:I

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1001
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic ܽ(Ll/۟ۚ;)Ll/ۤۚ;
    .locals 0

    .line 60
    iget-object p0, p0, Ll/۟ۚ;->ۖ:Ll/ۤۚ;

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/۟ۚ;)I
    .locals 0

    .line 60
    iget p0, p0, Ll/۟ۚ;->ܿ:I

    return p0
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 1

    .line 327
    iget-object v0, p0, Ll/۟ۚ;->֡:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(I)Ll/ۘ᩸;
    .locals 2

    .line 1088
    iget-object v0, p0, Ll/۟ۚ;->᩵:Ll/ۙ᩸;

    if-eqz v0, :cond_0

    .line 1089
    invoke-virtual {v0, p1}, Ll/ۙ᩸;->֫(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    move p1, v0

    .line 1094
    :cond_0
    iget-object v0, p0, Ll/۟ۚ;->ܽ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 1095
    iget-object v1, p0, Ll/۟ۚ;->ۖ:Ll/ۤۚ;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Ll/֡֡;->֫(Landroid/content/Context;I)Ljava/lang/String;

    const/4 p1, 0x0

    .line 1096
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩸;

    return-object p1

    .line 1098
    :cond_1
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩸;

    return-object p1
.end method

.method public final ֫(II)V
    .locals 7

    const/4 v0, -0x1

    .line 101
    iget-object v1, p0, Ll/۟ۚ;->᩵:Ll/ۙ᩸;

    if-eqz v1, :cond_1

    .line 102
    invoke-virtual {v1, p1}, Ll/ۙ᩸;->֫(I)I

    move-result v1

    if-eq v1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, p1

    .line 106
    :goto_0
    iget-object v2, p0, Ll/۟ۚ;->᩵:Ll/ۙ᩸;

    invoke-virtual {v2, p2}, Ll/ۙ᩸;->֫(I)I

    move-result v2

    if-eq v2, v0, :cond_2

    goto :goto_1

    :cond_1
    move v1, p1

    :cond_2
    move v2, p2

    .line 116
    :goto_1
    iget-object v3, p0, Ll/۟ۚ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۚ;

    .line 117
    invoke-static {v5}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result v6

    if-ne v6, v2, :cond_4

    .line 118
    invoke-static {v5}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;)I

    move-result v6

    if-eq v6, v1, :cond_5

    .line 119
    :cond_4
    invoke-static {v5}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result v6

    if-ne v6, p2, :cond_3

    .line 120
    invoke-static {v5}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;)I

    move-result v6

    if-ne v6, p1, :cond_3

    .line 126
    :cond_5
    iput-object v5, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    .line 127
    invoke-static {v5}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 128
    iget-object p1, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {p1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object p1

    iget-boolean p2, p0, Ll/۟ۚ;->ᩴ:Z

    invoke-virtual {p1, p2}, Ll/ܰ֨;->֫(Z)V

    :cond_6
    return-void

    .line 135
    :cond_7
    iget-object p1, p0, Ll/۟ۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iget-object v4, p0, Ll/۟ۚ;->ܳ:Ll/ܰۚ;

    :cond_8
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۚ;

    .line 136
    invoke-static {v5}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result v6

    if-ne v6, p2, :cond_8

    move-object v4, v5

    goto :goto_2

    .line 141
    :cond_9
    new-instance p1, Ll/ܰۚ;

    invoke-direct {p1, p0, v4}, Ll/ܰۚ;-><init>(Ll/۟ۚ;Ll/ܰۚ;)V

    .line 143
    invoke-static {p1, v1}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;I)V

    .line 144
    invoke-static {p1, v2}, Ll/ܰۚ;->֫(Ll/ܰۚ;I)V

    if-eq v1, v0, :cond_a

    .line 146
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    :cond_a
    iput-object p1, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    return-void
.end method

.method public final ֫(Landroid/view/MotionEvent;ILl/ۤۚ;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    .line 1255
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 1256
    iget-object v5, v0, Ll/۟ۚ;->ۚ:Ll/᩶ۚ;

    iget-object v6, v0, Ll/۟ۚ;->ۖ:Ll/ۤۚ;

    if-nez v5, :cond_0

    .line 1257
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    invoke-static {}, Ll/ۙۚ;->֫()Ll/ۙۚ;

    move-result-object v5

    .line 1257
    iput-object v5, v0, Ll/۟ۚ;->ۚ:Ll/᩶ۚ;

    .line 1259
    :cond_0
    iget-object v5, v0, Ll/۟ۚ;->ۚ:Ll/᩶ۚ;

    check-cast v5, Ll/ۙۚ;

    .line 1095
    iget-object v5, v5, Ll/ۙۚ;->֫:Landroid/view/VelocityTracker;

    if-eqz v5, :cond_1

    .line 1096
    invoke-virtual {v5, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_1
    const/4 v5, -0x1

    if-eq v2, v5, :cond_17

    .line 1271
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v7

    if-eqz v7, :cond_14

    const/4 v8, 0x2

    if-eq v7, v8, :cond_2

    goto/16 :goto_7

    .line 1297
    :cond_2
    iget-boolean v7, v0, Ll/۟ۚ;->ۜ:Z

    if-eqz v7, :cond_3

    goto/16 :goto_7

    .line 1300
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v7

    iget v8, v0, Ll/۟ۚ;->ۡ:F

    sub-float/2addr v7, v8

    .line 1301
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v8

    iget v9, v0, Ll/۟ۚ;->ۢ:F

    sub-float/2addr v8, v9

    float-to-double v9, v8

    const-wide/16 v11, 0x0

    cmpl-double v13, v9, v11

    if-nez v13, :cond_4

    float-to-double v9, v7

    cmpl-double v13, v9, v11

    if-eqz v13, :cond_1b

    .line 1305
    :cond_4
    iget-object v9, v0, Ll/۟ۚ;->᩷:Landroid/view/MotionEvent;

    if-nez v9, :cond_5

    goto/16 :goto_9

    :cond_5
    if-eq v2, v5, :cond_11

    .line 220
    iget-object v10, v0, Ll/۟ۚ;->᩵:Ll/ۙ᩸;

    if-eqz v10, :cond_6

    .line 221
    invoke-virtual {v10, v2}, Ll/ۙ᩸;->֫(I)I

    move-result v10

    if-eq v10, v5, :cond_6

    goto :goto_0

    :cond_6
    move v10, v2

    .line 231
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 232
    iget-object v11, v0, Ll/۟ۚ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_7
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܰۚ;

    .line 233
    invoke-static {v12}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;)I

    move-result v13

    if-eq v13, v10, :cond_8

    invoke-static {v12}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result v13

    if-ne v13, v10, :cond_7

    .line 234
    :cond_8
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 280
    :cond_9
    new-instance v10, Landroid/graphics/RectF;

    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    .line 281
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܰۚ;

    .line 282
    invoke-static {v13}, Ll/ܰۚ;->ۖ(Ll/ܰۚ;)Z

    move-result v14

    if-eqz v14, :cond_b

    :cond_a
    move-object/from16 v16, v5

    goto :goto_4

    .line 285
    :cond_b
    invoke-static {v13}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v14

    if-eqz v14, :cond_a

    .line 286
    invoke-static {v13}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v14

    iget-boolean v15, v0, Ll/۟ۚ;->ᩴ:Z

    invoke-virtual {v14, v15}, Ll/ܰ֨;->֫(Z)V

    .line 287
    invoke-static {v13}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v14

    invoke-virtual {v14, v6, v10}, Ll/ܰ֨;->ۧ(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v14

    if-eqz v14, :cond_c

    .line 288
    invoke-virtual {v9}, Landroid/view/MotionEvent;->getX()F

    move-result v15

    move-object/from16 v16, v5

    invoke-virtual {v9}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {v14, v15, v5}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v5

    if-nez v5, :cond_d

    goto :goto_4

    :cond_c
    move-object/from16 v16, v5

    .line 291
    :cond_d
    invoke-static {v13}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v5

    invoke-virtual {v5, v6, v10}, Ll/ܰ֨;->ۧ(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v5

    if-eqz v5, :cond_e

    .line 292
    invoke-virtual {v9}, Landroid/view/MotionEvent;->getX()F

    move-result v14

    invoke-virtual {v9}, Landroid/view/MotionEvent;->getY()F

    move-result v15

    invoke-virtual {v5, v14, v15}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_4

    .line 296
    :cond_e
    invoke-static {v13}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v5

    invoke-virtual {v5, v8, v7}, Ll/ܰ֨;->֫(FF)F

    move-result v5

    .line 301
    invoke-static {v13}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result v14

    if-ne v14, v2, :cond_f

    const/high16 v14, -0x40800000    # -1.0f

    goto :goto_3

    :cond_f
    const v14, 0x3f8ccccd    # 1.1f

    :goto_3
    mul-float v5, v5, v14

    cmpl-float v14, v5, v11

    if-lez v14, :cond_10

    move v11, v5

    move-object v12, v13

    :cond_10
    :goto_4
    move-object/from16 v5, v16

    goto :goto_2

    .line 323
    :cond_11
    iget-object v12, v0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    :cond_12
    if-eqz v12, :cond_17

    .line 1316
    invoke-virtual {v3, v12}, Ll/ۤۚ;->֫(Ll/ܰۚ;)V

    .line 1317
    iget-object v2, v0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v2}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v2

    invoke-virtual {v2, v6, v4}, Ll/ܰ֨;->ۧ(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v2

    if-eqz v2, :cond_13

    .line 1318
    iget-object v4, v0, Ll/۟ۚ;->᩷:Landroid/view/MotionEvent;

    .line 1319
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    iget-object v5, v0, Ll/۟ۚ;->᩷:Landroid/view/MotionEvent;

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {v2, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v2

    if-nez v2, :cond_13

    const/4 v2, 0x1

    goto :goto_5

    :cond_13
    const/4 v2, 0x0

    :goto_5
    iput-boolean v2, v0, Ll/۟ۚ;->ۘ:Z

    .line 1320
    iget-object v2, v0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v2}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v2

    iget v4, v0, Ll/۟ۚ;->ۢ:F

    iget v5, v0, Ll/۟ۚ;->ۡ:F

    invoke-virtual {v2, v4, v5}, Ll/ܰ֨;->ܳ(FF)V

    goto :goto_7

    .line 1273
    :cond_14
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    iput v2, v0, Ll/۟ۚ;->ۢ:F

    .line 1274
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    iput v2, v0, Ll/۟ۚ;->ۡ:F

    .line 1275
    iput-object v1, v0, Ll/۟ۚ;->᩷:Landroid/view/MotionEvent;

    const/4 v1, 0x0

    .line 1276
    iput-boolean v1, v0, Ll/۟ۚ;->ۜ:Z

    .line 1277
    iget-object v1, v0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v1

    if-eqz v1, :cond_1b

    .line 1278
    iget-object v1, v0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v1

    invoke-virtual {v1, v6, v4}, Ll/ܰ֨;->֫(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v1

    if-eqz v1, :cond_15

    .line 1279
    iget-object v2, v0, Ll/۟ۚ;->᩷:Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget-object v3, v0, Ll/۟ۚ;->᩷:Landroid/view/MotionEvent;

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v1

    if-nez v1, :cond_15

    const/4 v1, 0x0

    .line 1280
    iput-object v1, v0, Ll/۟ۚ;->᩷:Landroid/view/MotionEvent;

    const/4 v1, 0x1

    .line 1281
    iput-boolean v1, v0, Ll/۟ۚ;->ۜ:Z

    return-void

    .line 1284
    :cond_15
    iget-object v1, v0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v1

    invoke-virtual {v1, v6, v4}, Ll/ܰ֨;->ۧ(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v1

    if-eqz v1, :cond_16

    .line 1285
    iget-object v2, v0, Ll/۟ۚ;->᩷:Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget-object v3, v0, Ll/۟ۚ;->᩷:Landroid/view/MotionEvent;

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v1

    if-nez v1, :cond_16

    const/4 v1, 0x1

    .line 1286
    iput-boolean v1, v0, Ll/۟ۚ;->ۘ:Z

    goto :goto_6

    :cond_16
    const/4 v1, 0x0

    .line 1288
    iput-boolean v1, v0, Ll/۟ۚ;->ۘ:Z

    .line 1290
    :goto_6
    iget-object v1, v0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v1

    iget v2, v0, Ll/۟ۚ;->ۢ:F

    iget v3, v0, Ll/۟ۚ;->ۡ:F

    invoke-virtual {v1, v2, v3}, Ll/ܰ֨;->ܿ(FF)V

    return-void

    .line 1324
    :cond_17
    :goto_7
    iget-boolean v2, v0, Ll/۟ۚ;->ۜ:Z

    if-eqz v2, :cond_18

    goto :goto_9

    .line 1327
    :cond_18
    iget-object v2, v0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-eqz v2, :cond_19

    invoke-static {v2}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v2

    if-eqz v2, :cond_19

    iget-boolean v2, v0, Ll/۟ۚ;->ۘ:Z

    if-nez v2, :cond_19

    .line 1328
    iget-object v2, v0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v2}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v2

    iget-object v4, v0, Ll/۟ۚ;->ۚ:Ll/᩶ۚ;

    invoke-virtual {v2, v1, v4}, Ll/ܰ֨;->֫(Landroid/view/MotionEvent;Ll/᩶ۚ;)V

    .line 1331
    :cond_19
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    iput v2, v0, Ll/۟ۚ;->ۢ:F

    .line 1332
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    iput v2, v0, Ll/۟ۚ;->ۡ:F

    .line 1334
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1b

    .line 1335
    iget-object v1, v0, Ll/۟ۚ;->ۚ:Ll/᩶ۚ;

    if-eqz v1, :cond_1b

    .line 1336
    check-cast v1, Ll/ۙۚ;

    .line 1080
    iget-object v2, v1, Ll/ۙۚ;->֫:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_1a

    .line 1081
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v2, 0x0

    .line 1082
    iput-object v2, v1, Ll/ۙۚ;->֫:Landroid/view/VelocityTracker;

    goto :goto_8

    :cond_1a
    const/4 v2, 0x0

    .line 1337
    :goto_8
    iput-object v2, v0, Ll/۟ۚ;->ۚ:Ll/᩶ۚ;

    .line 1338
    iget v1, v3, Ll/ۤۚ;->ۙ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1b

    .line 1339
    invoke-virtual {v0, v3, v1}, Ll/۟ۚ;->ۧ(Ll/ۤۚ;I)Z

    :cond_1b
    :goto_9
    return-void
.end method

.method public final ֫(Ll/ۤۚ;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1501
    :goto_0
    iget-object v2, p0, Ll/۟ۚ;->ܽ:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 1502
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 1522
    iget-object v3, p0, Ll/۟ۚ;->᩻:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    .line 1523
    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    move-result v5

    :goto_1
    if-lez v4, :cond_2

    if-ne v4, v2, :cond_0

    goto :goto_3

    :cond_0
    add-int/lit8 v6, v5, -0x1

    if-gez v5, :cond_1

    goto :goto_3

    .line 1531
    :cond_1
    invoke-virtual {v3, v4}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    move v5, v6

    goto :goto_1

    .line 1507
    :cond_2
    invoke-direct {p0, v2}, Ll/۟ۚ;->ۧ(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1509
    :cond_3
    :goto_2
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 1510
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩸;

    .line 1511
    invoke-virtual {v1, p1}, Ll/ۘ᩸;->ۧ(Ll/ۤۚ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    return-void
.end method

.method public final ֫(Ll/ۤۚ;I)V
    .locals 7

    .line 243
    iget-object v0, p0, Ll/۟ۚ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۚ;

    .line 244
    invoke-static {v2}, Ll/ܰۚ;->ܺ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_0

    .line 245
    invoke-static {v2}, Ll/ܰۚ;->ܺ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺ۚ;

    .line 688
    iget v5, v5, Ll/᩺ۚ;->᩹:I

    if-ne v5, v4, :cond_1

    goto :goto_0

    .line 691
    :cond_1
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_0

    .line 696
    :cond_2
    invoke-virtual {v5, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 250
    :cond_3
    iget-object v1, p0, Ll/۟ۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۚ;

    .line 251
    invoke-static {v5}, Ll/ܰۚ;->ܺ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_4

    .line 252
    invoke-static {v5}, Ll/ܰۚ;->ܺ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺ۚ;

    .line 688
    iget v6, v6, Ll/᩺ۚ;->᩹:I

    if-ne v6, v4, :cond_5

    goto :goto_1

    .line 691
    :cond_5
    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_6

    goto :goto_1

    .line 696
    :cond_6
    invoke-virtual {v6, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 258
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۚ;

    .line 259
    invoke-static {v2}, Ll/ܰۚ;->ܺ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_8

    .line 260
    invoke-static {v2}, Ll/ܰۚ;->ܺ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺ۚ;

    .line 261
    invoke-virtual {v4, p1, p2, v2}, Ll/᩺ۚ;->֫(Ll/ۤۚ;ILl/ܰۚ;)V

    goto :goto_2

    .line 265
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۚ;

    .line 266
    invoke-static {v1}, Ll/ܰۚ;->ܺ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_a

    .line 267
    invoke-static {v1}, Ll/ܰۚ;->ܺ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۚ;

    .line 268
    invoke-virtual {v3, p1, p2, v1}, Ll/᩺ۚ;->֫(Ll/ۤۚ;ILl/ܰۚ;)V

    goto :goto_3

    :cond_b
    return-void
.end method

.method public final ֫(Ll/ܰۚ;)V
    .locals 1

    .line 213
    iput-object p1, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    .line 214
    invoke-static {p1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 215
    iget-object p1, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {p1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object p1

    iget-boolean v0, p0, Ll/۟ۚ;->ᩴ:Z

    invoke-virtual {p1, v0}, Ll/ܰ֨;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩵ۚ;)V
    .locals 2

    .line 1117
    iget-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-nez v0, :cond_0

    .line 1118
    iget-object v0, p0, Ll/۟ۚ;->ܳ:Ll/ܰۚ;

    if-eqz v0, :cond_1

    .line 1119
    invoke-static {v0}, Ll/ܰۚ;->ᩳ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۚ;

    .line 1120
    invoke-virtual {v1, p1}, Ll/᩻ۚ;->֫(Ll/᩵ۚ;)V

    goto :goto_0

    .line 1125
    :cond_0
    invoke-static {v0}, Ll/ܰۚ;->ᩳ(Ll/ܰۚ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۚ;

    .line 1126
    invoke-virtual {v1, p1}, Ll/᩻ۚ;->֫(Ll/᩵ۚ;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 418
    iput-boolean p1, p0, Ll/۟ۚ;->ᩴ:Z

    .line 419
    iget-object p1, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-eqz p1, :cond_0

    invoke-static {p1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 420
    iget-object p1, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {p1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object p1

    iget-boolean v0, p0, Ll/۟ۚ;->ᩴ:Z

    invoke-virtual {p1, v0}, Ll/ܰ֨;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 1429
    iget-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-eqz v0, :cond_0

    .line 1430
    invoke-static {v0}, Ll/ܰۚ;->ۜ(Ll/ܰۚ;)I

    move-result v0

    return v0

    .line 1432
    :cond_0
    iget v0, p0, Ll/۟ۚ;->ܿ:I

    return v0
.end method

.method public final ۧ(Ll/ۤۚ;I)Z
    .locals 6

    .line 414
    iget-object v0, p0, Ll/۟ۚ;->ۚ:Ll/᩶ۚ;

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 364
    :cond_0
    iget-object v0, p0, Ll/۟ۚ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۚ;

    .line 365
    invoke-static {v1}, Ll/ܰۚ;->ۘ(Ll/ܰۚ;)I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 368
    :cond_2
    iget-object v2, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-ne v2, v1, :cond_3

    goto :goto_0

    .line 371
    :cond_3
    invoke-static {v1}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;)I

    move-result v2

    const/4 v3, 0x1

    if-ne p2, v2, :cond_6

    .line 372
    invoke-static {v1}, Ll/ܰۚ;->ۘ(Ll/ܰۚ;)I

    move-result v2

    const/4 v4, 0x4

    if-eq v2, v4, :cond_4

    .line 373
    invoke-static {v1}, Ll/ܰۚ;->ۘ(Ll/ܰۚ;)I

    move-result v2

    const/4 v5, 0x2

    if-ne v2, v5, :cond_6

    .line 374
    :cond_4
    sget-object p2, Ll/۫ۚ;->᩹:Ll/۫ۚ;

    invoke-virtual {p1, p2}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 375
    invoke-virtual {p1, v1}, Ll/ۤۚ;->֫(Ll/ܰۚ;)V

    .line 376
    invoke-static {v1}, Ll/ܰۚ;->ۘ(Ll/ܰۚ;)I

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-ne v0, v4, :cond_5

    .line 1796
    invoke-virtual {p1, v1}, Ll/ۤۚ;->֫(F)V

    .line 378
    sget-object p2, Ll/۫ۚ;->ۙ:Ll/۫ۚ;

    invoke-virtual {p1, p2}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 379
    sget-object p2, Ll/۫ۚ;->᩶:Ll/۫ۚ;

    invoke-virtual {p1, p2}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    return v3

    .line 381
    :cond_5
    invoke-virtual {p1, v1}, Ll/ۤۚ;->ۧ(F)V

    .line 382
    invoke-virtual {p1, v3}, Ll/ۤۚ;->֫(Z)V

    .line 383
    sget-object v0, Ll/۫ۚ;->ۙ:Ll/۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 384
    sget-object v0, Ll/۫ۚ;->᩶:Ll/۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 385
    invoke-virtual {p1, p2}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 386
    invoke-virtual {p1}, Ll/ۤۚ;->ܿ()V

    return v3

    .line 390
    :cond_6
    invoke-static {v1}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result v2

    if-ne p2, v2, :cond_1

    .line 391
    invoke-static {v1}, Ll/ܰۚ;->ۘ(Ll/ܰۚ;)I

    move-result v2

    const/4 v4, 0x3

    if-eq v2, v4, :cond_7

    .line 392
    invoke-static {v1}, Ll/ܰۚ;->ۘ(Ll/ܰۚ;)I

    move-result v2

    if-ne v2, v3, :cond_1

    .line 393
    :cond_7
    sget-object p2, Ll/۫ۚ;->᩹:Ll/۫ۚ;

    invoke-virtual {p1, p2}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 394
    invoke-virtual {p1, v1}, Ll/ۤۚ;->֫(Ll/ܰۚ;)V

    .line 395
    invoke-static {v1}, Ll/ܰۚ;->ۘ(Ll/ܰۚ;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v0, v4, :cond_8

    .line 1787
    invoke-virtual {p1, v1}, Ll/ۤۚ;->֫(F)V

    .line 397
    sget-object p2, Ll/۫ۚ;->ۙ:Ll/۫ۚ;

    invoke-virtual {p1, p2}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 398
    sget-object p2, Ll/۫ۚ;->᩶:Ll/۫ۚ;

    invoke-virtual {p1, p2}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    return v3

    .line 400
    :cond_8
    invoke-virtual {p1, v1}, Ll/ۤۚ;->ۧ(F)V

    .line 401
    invoke-virtual {p1, v3}, Ll/ۤۚ;->֫(Z)V

    .line 402
    sget-object v0, Ll/۫ۚ;->ۙ:Ll/۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 403
    sget-object v0, Ll/۫ۚ;->᩶:Ll/۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 404
    invoke-virtual {p1, p2}, Ll/ۤۚ;->֫(Ll/۫ۚ;)V

    .line 405
    invoke-virtual {p1}, Ll/ۤۚ;->ܿ()V

    return v3

    :cond_9
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()Z
    .locals 3

    .line 1241
    iget-object v0, p0, Ll/۟ۚ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۚ;

    .line 1242
    invoke-static {v1}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v1

    if-eqz v1, :cond_0

    return v2

    .line 1246
    :cond_1
    iget-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-eqz v0, :cond_2

    invoke-static {v0}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Landroid/view/animation/Interpolator;
    .locals 2

    .line 1395
    iget-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v0}, Ll/ܰۚ;->ܿ(Ll/ܰۚ;)I

    move-result v0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_6

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 1418
    :cond_0
    new-instance v0, Landroid/view/animation/BounceInterpolator;

    invoke-direct {v0}, Landroid/view/animation/BounceInterpolator;-><init>()V

    return-object v0

    .line 1416
    :cond_1
    new-instance v0, Landroid/view/animation/AnticipateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AnticipateInterpolator;-><init>()V

    return-object v0

    .line 1412
    :cond_2
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    return-object v0

    .line 1410
    :cond_3
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    return-object v0

    .line 1408
    :cond_4
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    return-object v0

    .line 1397
    :cond_5
    iget-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v0}, Ll/ܰۚ;->ܳ(Ll/ܰۚ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ֡;->֫(Ljava/lang/String;)Ll/ۡ֡;

    move-result-object v0

    .line 1398
    new-instance v1, Ll/ۨۚ;

    invoke-direct {v1, v0}, Ll/ۨۚ;-><init>(Ll/ۡ֡;)V

    return-object v1

    .line 1405
    :cond_6
    iget-object v0, p0, Ll/۟ۚ;->ۖ:Ll/ۤۚ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    .line 1406
    invoke-static {v1}, Ll/ܰۚ;->᩻(Ll/ܰۚ;)I

    move-result v1

    .line 1405
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 1374
    iget-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 1377
    :cond_0
    invoke-static {v0}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;)I

    move-result v0

    return v0
.end method

.method public final ᩳ()F
    .locals 1

    .line 1466
    iget-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1467
    iget-object v0, p0, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    invoke-static {v0}, Ll/ܰۚ;->ۡ(Ll/ܰۚ;)Ll/ܰ֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܰ֨;->ۧ()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
