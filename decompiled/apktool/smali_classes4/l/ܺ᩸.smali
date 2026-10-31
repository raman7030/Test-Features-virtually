.class public final Ll/ܺ᩸;
.super Ljava/lang/Object;
.source "R1K2"


# instance fields
.field public ֫:F

.field public ۧ:Z

.field public ܽ:F

.field public ܿ:I

.field public ᩳ:I


# virtual methods
.method public final ֫(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1155
    sget-object v0, Ll/᩸᩸;->ܶ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    .line 1156
    iput-boolean p2, p0, Ll/ܺ᩸;->ۧ:Z

    .line 1157
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    .line 1159
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    if-ne v2, p2, :cond_0

    .line 1162
    iget v3, p0, Ll/ܺ᩸;->֫:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Ll/ܺ᩸;->֫:F

    goto :goto_1

    :cond_0
    if-nez v2, :cond_1

    .line 1164
    iget v3, p0, Ll/ܺ᩸;->ܿ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/ܺ᩸;->ܿ:I

    .line 1165
    invoke-static {}, Ll/ۘ᩸;->ܽ()[I

    move-result-object v2

    iget v3, p0, Ll/ܺ᩸;->ܿ:I

    aget v2, v2, v3

    iput v2, p0, Ll/ܺ᩸;->ܿ:I

    goto :goto_1

    :cond_1
    const/4 v3, 0x4

    if-ne v2, v3, :cond_2

    .line 1167
    iget v3, p0, Ll/ܺ᩸;->ᩳ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/ܺ᩸;->ᩳ:I

    goto :goto_1

    :cond_2
    const/4 v3, 0x3

    if-ne v2, v3, :cond_3

    .line 1169
    iget v3, p0, Ll/ܺ᩸;->ܽ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Ll/ܺ᩸;->ܽ:F

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1172
    :cond_4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
