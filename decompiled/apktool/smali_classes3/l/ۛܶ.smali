.class public Ll/ۛܶ;
.super Ll/۟ܶ;
.source "U1KA"


# instance fields
.field public ۛ:Ll/ۖ۠;

.field public ۨ:I

.field public ᩺:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 118
    invoke-direct {p0, p1}, Ll/۟ܶ;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    .line 119
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 123
    invoke-direct {p0, p1, p2}, Ll/۟ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x8

    .line 124
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 128
    invoke-direct {p0, p1, p2, p3}, Ll/۟ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x8

    .line 129
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private ֫(Ll/ܶ۠;IZ)V
    .locals 3

    .line 151
    iput p2, p0, Ll/ۛܶ;->᩺:I

    const/4 p2, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x5

    if-eqz p3, :cond_1

    .line 163
    iget p3, p0, Ll/ۛܶ;->ۨ:I

    if-ne p3, v2, :cond_0

    .line 164
    iput v1, p0, Ll/ۛܶ;->᩺:I

    goto :goto_0

    :cond_0
    if-ne p3, v0, :cond_3

    .line 166
    iput p2, p0, Ll/ۛܶ;->᩺:I

    goto :goto_0

    .line 169
    :cond_1
    iget p3, p0, Ll/ۛܶ;->ۨ:I

    if-ne p3, v2, :cond_2

    .line 170
    iput p2, p0, Ll/ۛܶ;->᩺:I

    goto :goto_0

    :cond_2
    if-ne p3, v0, :cond_3

    .line 172
    iput v1, p0, Ll/ۛܶ;->᩺:I

    .line 176
    :cond_3
    :goto_0
    instance-of p2, p1, Ll/ۖ۠;

    if-eqz p2, :cond_4

    .line 177
    check-cast p1, Ll/ۖ۠;

    .line 178
    iget p2, p0, Ll/ۛܶ;->᩺:I

    invoke-virtual {p1, p2}, Ll/ۖ۠;->֨(I)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 249
    iget-object v0, p0, Ll/ۛܶ;->ۛ:Ll/ۖ۠;

    invoke-virtual {v0, p1}, Ll/ۖ۠;->۠(I)V

    return-void
.end method

.method public final ֫(Landroid/util/AttributeSet;)V
    .locals 6

    .line 193
    invoke-super {p0, p1}, Ll/۟ܶ;->֫(Landroid/util/AttributeSet;)V

    .line 194
    new-instance v0, Ll/ۖ۠;

    invoke-direct {v0}, Ll/ۖ۠;-><init>()V

    iput-object v0, p0, Ll/ۛܶ;->ۛ:Ll/ۖ۠;

    if-eqz p1, :cond_4

    .line 196
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Ll/᩸᩸;->ۧ:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 197
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 199
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    const/16 v4, 0xf

    if-ne v3, v4, :cond_0

    .line 201
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 147
    iput v3, p0, Ll/ۛܶ;->ۨ:I

    goto :goto_1

    :cond_0
    const/16 v4, 0xe

    if-ne v3, v4, :cond_1

    .line 203
    iget-object v4, p0, Ll/ۛܶ;->ۛ:Ll/ۖ۠;

    const/4 v5, 0x1

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    invoke-virtual {v4, v3}, Ll/ۖ۠;->ۧ(Z)V

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    if-ne v3, v4, :cond_2

    .line 205
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 206
    iget-object v4, p0, Ll/ۛܶ;->ۛ:Ll/ۖ۠;

    invoke-virtual {v4, v3}, Ll/ۖ۠;->۠(I)V

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 209
    :cond_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 211
    :cond_4
    iget-object p1, p0, Ll/ۛܶ;->ۛ:Ll/ۖ۠;

    iput-object p1, p0, Ll/۟ܶ;->᩹:Ll/۬۠;

    .line 212
    invoke-virtual {p0}, Ll/۟ܶ;->ܽ()V

    return-void
.end method

.method public final ֫(Ll/ܶ۠;Z)V
    .locals 1

    .line 184
    iget v0, p0, Ll/ۛܶ;->ۨ:I

    invoke-direct {p0, p1, v0, p2}, Ll/ۛܶ;->֫(Ll/ܶ۠;IZ)V

    return-void
.end method

.method public final ֫(Ll/᩷᩸;Ll/۬۠;Ll/ᩴ᩸;Landroid/util/SparseArray;)V
    .locals 0

    .line 254
    invoke-super {p0, p1, p2, p3, p4}, Ll/۟ܶ;->֫(Ll/᩷᩸;Ll/۬۠;Ll/ᩴ᩸;Landroid/util/SparseArray;)V

    iget-object p1, p1, Ll/᩷᩸;->֫:Ll/ۢ᩸;

    .line 255
    instance-of p3, p2, Ll/ۖ۠;

    if-eqz p3, :cond_0

    .line 256
    move-object p3, p2

    check-cast p3, Ll/ۖ۠;

    .line 620
    iget-object p2, p2, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 257
    check-cast p2, Ll/᩸۠;

    .line 258
    invoke-virtual {p2}, Ll/᩸۠;->ܺ֫()Z

    move-result p2

    .line 259
    iget p4, p1, Ll/ۢ᩸;->ܽ֫:I

    invoke-direct {p0, p3, p4, p2}, Ll/ۛܶ;->֫(Ll/ܶ۠;IZ)V

    .line 260
    iget-boolean p2, p1, Ll/ۢ᩸;->ۧ֫:Z

    invoke-virtual {p3, p2}, Ll/ۖ۠;->ۧ(Z)V

    .line 261
    iget p1, p1, Ll/ۢ᩸;->ᩳ֫:I

    invoke-virtual {p3, p1}, Ll/ۖ۠;->۠(I)V

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 216
    iget-object v0, p0, Ll/ۛܶ;->ۛ:Ll/ۖ۠;

    invoke-virtual {v0, p1}, Ll/ۖ۠;->ۧ(Z)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 147
    iput p1, p0, Ll/ۛܶ;->ۨ:I

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 138
    iget v0, p0, Ll/ۛܶ;->ۨ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 240
    iget-object v0, p0, Ll/ۛܶ;->ۛ:Ll/ۖ۠;

    invoke-virtual {v0}, Ll/ۖ۠;->ۡ֫()I

    move-result v0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 220
    iget-object v0, p0, Ll/ۛܶ;->ۛ:Ll/ۖ۠;

    invoke-virtual {v0}, Ll/ۖ۠;->᩷֫()Z

    move-result v0

    return v0
.end method
