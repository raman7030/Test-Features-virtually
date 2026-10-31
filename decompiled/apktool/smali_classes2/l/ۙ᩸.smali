.class public final Ll/ۙ᩸;
.super Ljava/lang/Object;
.source "31AL"


# instance fields
.field public ֫:I

.field public ۧ:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 5

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 41
    iput v0, p0, Ll/ۙ᩸;->֫:I

    .line 46
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ۙ᩸;->ۧ:Landroid/util/SparseArray;

    .line 47
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 70
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    .line 71
    sget-object v1, Ll/᩸᩸;->᩹:[I

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 75
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    if-nez v3, :cond_0

    .line 77
    iget v4, p0, Ll/ۙ᩸;->֫:I

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Ll/ۙ᩸;->֫:I

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 87
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    if-eqz v0, :cond_4

    const/4 v2, 0x2

    const-string v3, "StateSet"

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    goto :goto_2

    .line 119
    :cond_2
    :try_start_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    .line 96
    :cond_3
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v2, "Variant"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 107
    new-instance v0, Ll/᩶᩸;

    invoke-direct {v0, p1, p2}, Ll/᩶᩸;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    if-eqz v1, :cond_5

    .line 274
    iget-object v2, v1, Ll/᩹᩸;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 97
    :sswitch_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_2
    const-string v2, "LayoutDescription"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_3
    const-string v2, "State"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 103
    new-instance v0, Ll/᩹᩸;

    invoke-direct {v0, p1, p2}, Ll/᩹᩸;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 104
    iget-object v1, p0, Ll/ۙ᩸;->ۧ:Landroid/util/SparseArray;

    iget v2, v0, Ll/᩹᩸;->ۧ:I

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object v1, v0

    goto :goto_2

    .line 93
    :cond_4
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 89
    :cond_5
    :goto_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4c7d471 -> :sswitch_3
        0x4d92b252 -> :sswitch_2
        0x526c4e31 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final ֫(FFII)I
    .locals 4

    .line 177
    iget-object v0, p0, Ll/ۙ᩸;->ۧ:Landroid/util/SparseArray;

    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹᩸;

    if-nez v0, :cond_0

    return p4

    .line 178
    :cond_0
    iget-object p4, v0, Ll/᩹᩸;->ܽ:Ljava/util/ArrayList;

    iget v0, v0, Ll/᩹᩸;->֫:I

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v2, p1, v1

    if-eqz v2, :cond_6

    cmpl-float v1, p2, v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 193
    :cond_1
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶᩸;

    .line 194
    invoke-virtual {v2, p1, p2}, Ll/᩶᩸;->֫(FF)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 195
    iget v1, v2, Ll/᩶᩸;->֫:I

    if-ne p3, v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, v2

    goto :goto_0

    :cond_4
    if-eqz v1, :cond_5

    .line 202
    iget p1, v1, Ll/᩶᩸;->֫:I

    return p1

    :cond_5
    return v0

    :cond_6
    :goto_1
    if-ne v0, p3, :cond_7

    goto :goto_2

    .line 185
    :cond_7
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩶᩸;

    .line 186
    iget p2, p2, Ll/᩶᩸;->֫:I

    if-ne p3, p2, :cond_8

    :goto_2
    return p3

    :cond_9
    return v0
.end method

.method public final ֫(I)I
    .locals 5

    const/4 v0, -0x1

    int-to-float v1, v0

    const/4 v2, 0x0

    .line 210
    iget-object v3, p0, Ll/ۙ᩸;->ۧ:Landroid/util/SparseArray;

    if-ne v0, p1, :cond_6

    if-ne p1, v0, :cond_0

    .line 213
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹᩸;

    goto :goto_0

    .line 215
    :cond_0
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹᩸;

    :goto_0
    if-nez p1, :cond_1

    goto :goto_3

    .line 218
    :cond_1
    iget-object v3, p1, Ll/᩹᩸;->ܽ:Ljava/util/ArrayList;

    .line 278
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_3

    .line 279
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩶᩸;

    invoke-virtual {v4, v1, v1}, Ll/᩶᩸;->֫(FF)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, -0x1

    :goto_2
    if-ne v0, v2, :cond_4

    goto :goto_3

    :cond_4
    if-ne v2, v0, :cond_5

    .line 231
    iget p1, p1, Ll/᩹᩸;->֫:I

    return p1

    :cond_5
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶᩸;

    iget p1, p1, Ll/᩶᩸;->֫:I

    return p1

    .line 234
    :cond_6
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹᩸;

    if-nez p1, :cond_7

    :goto_3
    return v0

    .line 235
    :cond_7
    iget-object v3, p1, Ll/᩹᩸;->ܽ:Ljava/util/ArrayList;

    .line 278
    :goto_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_9

    .line 279
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩶᩸;

    invoke-virtual {v4, v1, v1}, Ll/᩶᩸;->֫(FF)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_9
    const/4 v2, -0x1

    :goto_5
    if-ne v2, v0, :cond_a

    .line 239
    iget p1, p1, Ll/᩹᩸;->֫:I

    return p1

    :cond_a
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶᩸;

    iget p1, p1, Ll/᩶᩸;->֫:I

    return p1
.end method
