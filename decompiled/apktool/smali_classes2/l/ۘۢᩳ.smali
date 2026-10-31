.class public final Ll/ۘۢᩳ;
.super Landroid/graphics/drawable/LayerDrawable;
.source "28VJ"


# instance fields
.field public ᩸:I

.field public ᩹:[Landroid/graphics/drawable/Drawable;


# direct methods
.method public static ֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Ll/ۘۢᩳ;
    .locals 6

    .line 26
    new-instance v0, Ll/ۘۢᩳ;

    const v1, 0x7f080237

    .line 27
    invoke-static {p0, v1, p1}, Ll/ۙۗ;->ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const v2, 0x7f08021b

    .line 28
    invoke-static {p0, v2, p1}, Ll/ۙۗ;->ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const v3, 0x7f080216

    .line 29
    invoke-static {p0, v3, p1}, Ll/ۙۗ;->ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const v4, 0x7f080215

    .line 30
    invoke-static {p0, v4, p1}, Ll/ۙۗ;->ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    const/4 p1, 0x4

    new-array v4, p1, [Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v1, 0x2

    aput-object v3, v4, v1

    const/4 v1, 0x3

    aput-object p0, v4, v1

    .line 35
    invoke-direct {v0, v4}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 23
    iput v5, v0, Ll/ۘۢᩳ;->᩸:I

    .line 36
    iput-object v4, v0, Ll/ۘۢᩳ;->᩹:[Landroid/graphics/drawable/Drawable;

    .line 37
    new-instance p0, Landroid/graphics/PorterDuffColorFilter;

    sget v1, Ll/᩹֡᩷;->ܺ֫:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    const/4 p0, 0x0

    :goto_0
    if-ge p0, p1, :cond_0

    .line 38
    aget-object v1, v4, p0

    .line 39
    invoke-virtual {v1, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ֫(I)V
    .locals 5

    .line 44
    iget-object v0, p0, Ll/ۘۢᩳ;->᩹:[Landroid/graphics/drawable/Drawable;

    iget v1, p0, Ll/ۘۢᩳ;->᩸:I

    if-eq v1, p1, :cond_3

    .line 45
    iput p1, p0, Ll/ۘۢᩳ;->᩸:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    .line 47
    array-length p1, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    aget-object v3, v0, v1

    .line 48
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 51
    :cond_0
    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    .line 52
    aget-object v3, v0, v2

    if-ne v2, p1, :cond_1

    const/16 v4, 0xff

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_3
    return-void
.end method
