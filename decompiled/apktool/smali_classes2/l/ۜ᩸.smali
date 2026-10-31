.class public final Ll/ۜ᩸;
.super Ljava/lang/Object;
.source "C1BZ"


# instance fields
.field public final ֫:Ll/ܿ᩸;

.field public ۧ:Landroid/util/SparseArray;

.field public ܽ:I

.field public ܿ:Landroid/util/SparseArray;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ܿ᩸;I)V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 42
    iput v0, p0, Ll/ۜ᩸;->ᩳ:I

    .line 43
    iput v0, p0, Ll/ۜ᩸;->ܽ:I

    .line 44
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ۜ᩸;->ܿ:Landroid/util/SparseArray;

    .line 45
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ۜ᩸;->ۧ:Landroid/util/SparseArray;

    .line 49
    iput-object p2, p0, Ll/ۜ᩸;->֫:Ll/ܿ᩸;

    .line 285
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 286
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    .line 292
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result p3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-eq p3, v1, :cond_3

    if-eqz p3, :cond_1

    const/4 v1, 0x2

    if-eq p3, v1, :cond_0

    goto :goto_2

    .line 300
    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object p3

    .line 301
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v1, "Variant"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 311
    new-instance p3, Ll/᩻᩸;

    invoke-direct {p3, p1, p2}, Ll/᩻᩸;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    if-eqz v0, :cond_2

    .line 171
    iget-object v1, v0, Ll/ܳ᩸;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_1
    const-string v1, "layoutDescription"

    goto :goto_1

    :sswitch_2
    const-string v1, "StateSet"

    .line 301
    :goto_1
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_3
    const-string v1, "State"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 307
    new-instance p3, Ll/ܳ᩸;

    invoke-direct {p3, p1, p2}, Ll/ܳ᩸;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 308
    iget-object v0, p0, Ll/ۜ᩸;->ܿ:Landroid/util/SparseArray;

    iget v1, p3, Ll/ܳ᩸;->ܽ:I

    invoke-virtual {v0, v1, p3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object v0, p3

    goto :goto_2

    :sswitch_4
    const-string v1, "ConstraintSet"

    .line 301
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 317
    invoke-direct {p0, p1, p2}, Ll/ۜ᩸;->֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    goto :goto_2

    .line 297
    :cond_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 294
    :cond_2
    :goto_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p3
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_4
        0x4c7d471 -> :sswitch_3
        0x526c4e31 -> :sswitch_2
        0x62ce7272 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method private ֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 8

    .line 347
    new-instance v0, Ll/ۘ᩸;

    invoke-direct {v0}, Ll/ۘ᩸;-><init>()V

    .line 348
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    .line 350
    invoke-interface {p2, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "id"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 351
    invoke-interface {p2, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "/"

    .line 354
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, -0x1

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    const/16 v2, 0x2f

    .line 355
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/2addr v2, v5

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 356
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v2, v4, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    goto :goto_1

    :cond_0
    const/4 v2, -0x1

    :goto_1
    if-ne v2, v3, :cond_1

    .line 360
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v5, :cond_1

    .line 361
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 366
    :cond_1
    invoke-virtual {v0, p1, p2}, Ll/ۘ᩸;->֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 370
    iget-object p1, p0, Ll/ۜ᩸;->ۧ:Landroid/util/SparseArray;

    invoke-virtual {p1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(FFI)V
    .locals 5

    .line 73
    iget v0, p0, Ll/ۜ᩸;->ᩳ:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۜ᩸;->֫:Ll/ܿ᩸;

    iget-object v3, p0, Ll/ۜ᩸;->ܿ:Landroid/util/SparseArray;

    const/4 v4, -0x1

    if-ne v0, p3, :cond_8

    if-ne p3, v4, :cond_0

    .line 76
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܳ᩸;

    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܳ᩸;

    .line 81
    :goto_0
    iget v0, p0, Ll/ۜ᩸;->ܽ:I

    if-eq v0, v4, :cond_1

    .line 82
    iget-object v3, p3, Ll/ܳ᩸;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻᩸;

    invoke-virtual {v0, p1, p2}, Ll/᩻᩸;->֫(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_9

    .line 175
    :cond_1
    iget-object v0, p3, Ll/ܳ᩸;->ᩳ:Ljava/util/ArrayList;

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 176
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻᩸;

    invoke-virtual {v3, p1, p2}, Ll/᩻᩸;->֫(FF)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, -0x1

    .line 86
    :goto_2
    iget-object p1, p3, Ll/ܳ᩸;->ᩳ:Ljava/util/ArrayList;

    .line 87
    iget p2, p0, Ll/ۜ᩸;->ܽ:I

    if-ne p2, v1, :cond_4

    goto :goto_9

    :cond_4
    if-ne v1, v4, :cond_5

    const/4 p2, 0x0

    goto :goto_3

    .line 92
    :cond_5
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩻᩸;

    iget-object p2, p2, Ll/᩻᩸;->ۧ:Ll/ۘ᩸;

    :goto_3
    if-ne v1, v4, :cond_6

    goto :goto_4

    .line 94
    :cond_6
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻᩸;

    iget p1, p1, Ll/᩻᩸;->֫:I

    :goto_4
    if-nez p2, :cond_7

    goto :goto_9

    .line 98
    :cond_7
    iput v1, p0, Ll/ۜ᩸;->ܽ:I

    .line 102
    invoke-virtual {p2, v2}, Ll/ۘ᩸;->֫(Ll/ܿ᩸;)V

    return-void

    .line 108
    :cond_8
    iput p3, p0, Ll/ۜ᩸;->ᩳ:I

    .line 109
    invoke-virtual {v3, p3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܳ᩸;

    .line 175
    iget-object v0, p3, Ll/ܳ᩸;->ᩳ:Ljava/util/ArrayList;

    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_a

    .line 176
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻᩸;

    invoke-virtual {v3, p1, p2}, Ll/᩻᩸;->֫(FF)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_a
    const/4 v1, -0x1

    .line 110
    :goto_6
    iget-object p1, p3, Ll/ܳ᩸;->ᩳ:Ljava/util/ArrayList;

    if-ne v1, v4, :cond_b

    .line 111
    iget-object p2, p3, Ll/ܳ᩸;->ۧ:Ll/ۘ᩸;

    goto :goto_7

    .line 112
    :cond_b
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩻᩸;

    iget-object p2, p2, Ll/᩻᩸;->ۧ:Ll/ۘ᩸;

    :goto_7
    if-ne v1, v4, :cond_c

    goto :goto_8

    .line 114
    :cond_c
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻᩸;

    iget p1, p1, Ll/᩻᩸;->֫:I

    :goto_8
    if-nez p2, :cond_d

    :goto_9
    return-void

    .line 120
    :cond_d
    iput v1, p0, Ll/ۜ᩸;->ܽ:I

    .line 124
    invoke-virtual {p2, v2}, Ll/ۘ᩸;->֫(Ll/ܿ᩸;)V

    return-void
.end method
