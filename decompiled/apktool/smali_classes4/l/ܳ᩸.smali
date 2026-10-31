.class public final Ll/ܳ᩸;
.super Ljava/lang/Object;
.source "C1BZ"


# instance fields
.field public ֫:I

.field public ۧ:Ll/ۘ᩸;

.field public ܽ:I

.field public ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 6

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܳ᩸;->ᩳ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 142
    iput v0, p0, Ll/ܳ᩸;->֫:I

    .line 146
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    .line 147
    sget-object v0, Ll/᩸᩸;->᩸:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 148
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 150
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    if-nez v2, :cond_0

    .line 152
    iget v3, p0, Ll/ܳ᩸;->ܽ:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/ܳ᩸;->ܽ:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 154
    iget v3, p0, Ll/ܳ᩸;->֫:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/ܳ᩸;->֫:I

    .line 155
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 156
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    const-string v4, "layout"

    .line 158
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 159
    new-instance v3, Ll/ۘ᩸;

    invoke-direct {v3}, Ll/ۘ᩸;-><init>()V

    iput-object v3, p0, Ll/ܳ᩸;->ۧ:Ll/ۘ᩸;

    .line 1478
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ܿ᩸;

    invoke-virtual {v3, v2}, Ll/ۘ᩸;->ܽ(Ll/ܿ᩸;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 167
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
