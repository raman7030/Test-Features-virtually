.class public final Ll/۬ۢ;
.super Ljava/lang/Object;
.source "WB0M"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:Z

.field public final ᩳ:Ll/ۗۢ;


# direct methods
.method public constructor <init>(Ll/ۗۢ;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, Ll/۬ۢ;->֫:Z

    .line 45
    iput-boolean v0, p0, Ll/۬ۢ;->ۧ:Z

    .line 50
    iput-object p1, p0, Ll/۬ۢ;->ᩳ:Ll/ۗۢ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 119
    iget-object v0, p0, Ll/۬ۢ;->ᩳ:Ll/ۗۢ;

    invoke-virtual {v0}, Landroid/widget/CheckedTextView;->getCheckMarkDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 134
    iget-boolean v2, p0, Ll/۬ۢ;->֫:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Ll/۬ۢ;->ۧ:Z

    if-eqz v2, :cond_4

    .line 135
    :cond_0
    invoke-static {v1}, Ll/۠۬;->ܳ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 136
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 137
    iget-boolean v2, p0, Ll/۬ۢ;->֫:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 138
    invoke-static {v1, v3}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 140
    :cond_1
    iget-boolean v2, p0, Ll/۬ۢ;->ۧ:Z

    if-eqz v2, :cond_2

    .line 141
    invoke-static {v1, v3}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 145
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 146
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 148
    :cond_3
    invoke-virtual {v0, v1}, Ll/ۗۢ;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method

.method public final ֫(Landroid/util/AttributeSet;I)V
    .locals 9

    .line 55
    iget-object v6, p0, Ll/۬ۢ;->ᩳ:Ll/ۗۢ;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Ll/ۗᩳ;->ۖ:[I

    const/4 v7, 0x0

    invoke-static {v0, p1, v2, p2, v7}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object v8

    .line 57
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 58
    invoke-virtual {v8}, Ll/᩺ۘ;->ܽ()Landroid/content/res/TypedArray;

    move-result-object v4

    move-object v0, v6

    move-object v3, p1

    move v5, p2

    .line 57
    invoke-static/range {v0 .. v5}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 p1, 0x1

    .line 61
    :try_start_0
    invoke-virtual {v8, p1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 62
    invoke-virtual {v8, p1, v7}, Ll/᩺ۘ;->ܳ(II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 67
    :try_start_1
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 66
    invoke-virtual {v6, p1}, Ll/ۗۢ;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 75
    :catch_0
    :cond_0
    :try_start_2
    invoke-virtual {v8, v7}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 77
    invoke-virtual {v8, v7, v7}, Ll/᩺ۘ;->ܳ(II)I

    move-result p1

    if-eqz p1, :cond_1

    .line 81
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 80
    invoke-virtual {v6, p1}, Ll/ۗۢ;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    const/4 p1, 0x2

    .line 84
    invoke-virtual {v8, p1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 86
    invoke-virtual {v8, p1}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 130
    invoke-virtual {v6, p1}, Landroid/widget/CheckedTextView;->setCheckMarkTintList(Landroid/content/res/ColorStateList;)V

    :cond_2
    const/4 p1, 0x3

    .line 88
    invoke-virtual {v8, p1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, -0x1

    .line 91
    invoke-virtual {v8, p1, p2}, Ll/᩺ۘ;->ܽ(II)I

    move-result p1

    const/4 p2, 0x0

    .line 90
    invoke-static {p1, p2}, Ll/ܶܺ;->֫(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    .line 140
    invoke-virtual {v6, p1}, Landroid/widget/CheckedTextView;->setCheckMarkTintMode(Landroid/graphics/PorterDuff$Mode;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    :cond_3
    invoke-virtual {v8}, Ll/᩺ۘ;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v8}, Ll/᩺ۘ;->ܿ()V

    .line 96
    throw p1
.end method

.method public final ۧ()V
    .locals 1

    .line 122
    iget-boolean v0, p0, Ll/۬ۢ;->ܽ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 123
    iput-boolean v0, p0, Ll/۬ۢ;->ܽ:Z

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 127
    iput-boolean v0, p0, Ll/۬ۢ;->ܽ:Z

    .line 128
    invoke-virtual {p0}, Ll/۬ۢ;->֫()V

    return-void
.end method
