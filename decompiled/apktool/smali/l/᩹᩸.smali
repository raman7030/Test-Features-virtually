.class public final Ll/᩹᩸;
.super Ljava/lang/Object;
.source "31AL"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 5

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩹᩸;->ܽ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 250
    iput v0, p0, Ll/᩹᩸;->֫:I

    .line 253
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    .line 254
    sget-object v0, Ll/᩸᩸;->᩸:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 255
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 257
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    if-nez v2, :cond_0

    .line 259
    iget v3, p0, Ll/᩹᩸;->ۧ:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/᩹᩸;->ۧ:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 261
    iget v3, p0, Ll/᩹᩸;->֫:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/᩹᩸;->֫:I

    .line 262
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 263
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    const-string v2, "layout"

    .line 265
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 270
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
