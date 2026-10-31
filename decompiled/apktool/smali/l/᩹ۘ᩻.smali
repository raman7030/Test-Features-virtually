.class public final Ll/᩹ۘ᩻;
.super Ll/ۗ۬ۧ;
.source "J7J5"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ᩶:Landroid/widget/TextView;

.field public ᩸:Landroid/widget/ImageView;

.field public final synthetic ᩹:Ll/᩶ۘ᩻;


# direct methods
.method public constructor <init>(Ll/᩶ۘ᩻;Landroid/view/View;)V
    .locals 1

    .line 194
    iput-object p1, p0, Ll/᩹ۘ᩻;->᩹:Ll/᩶ۘ᩻;

    .line 195
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 196
    invoke-static {p2}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 197
    sget v0, Ll/ᩳ᩹ۡ;->֫:I

    .line 26
    new-instance v0, Ll/ܽ᩹ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 198
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 199
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a0631

    .line 200
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩹ۘ᩻;->᩶:Landroid/widget/TextView;

    const v0, 0x7f0a0163

    .line 201
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Ll/᩹ۘ᩻;->᩸:Landroid/widget/ImageView;

    const v0, 0x7f0801ee

    .line 202
    invoke-static {p1, v0}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x77

    .line 204
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 205
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 206
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 p1, 0x1

    .line 207
    invoke-virtual {p2, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 208
    invoke-virtual {p2, p1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 213
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    iget-object v0, p0, Ll/᩹ۘ᩻;->᩹:Ll/᩶ۘ᩻;

    invoke-static {v0, p1}, Ll/᩶ۘ᩻;->֫(Ll/᩶ۘ᩻;I)V

    .line 214
    invoke-static {v0}, Ll/᩶ۘ᩻;->ۧ(Ll/᩶ۘ᩻;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0}, Ll/᩶ۘ᩻;->ܽ(Ll/᩶ۘ᩻;)I

    move-result v1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۘ᩻;

    invoke-virtual {p1, v0}, Ll/ۖۘ᩻;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    .line 219
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v0

    .line 220
    new-instance v1, Ll/᩸ۖ;

    .line 68
    iget-object v2, p0, Ll/᩹ۘ᩻;->᩹:Ll/᩶ۘ᩻;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 221
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v2

    const v4, 0x7f1202dd

    invoke-interface {v2, v3, v4, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v4, 0x7f0801f0

    invoke-interface {v2, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 222
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v2

    const v4, 0x7f1205ca

    invoke-interface {v2, v3, v4, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801e6

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 223
    invoke-virtual {v1}, Ll/᩸ۖ;->ᩳ()V

    .line 224
    new-instance v2, Ll/ܶۘ᩻;

    invoke-direct {v2, p0, p1, v0}, Ll/ܶۘ᩻;-><init>(Ll/᩹ۘ᩻;Landroid/view/View;I)V

    invoke-virtual {v1, v2}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 239
    invoke-static {p1, v1}, Ll/ᩳ᩹ۡ;->֫(Landroid/view/View;Ll/᩸ۖ;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 245
    iget-object p1, p0, Ll/᩹ۘ᩻;->᩸:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 246
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 247
    iget-object p1, p0, Ll/᩹ۘ᩻;->᩹:Ll/᩶ۘ᩻;

    invoke-static {p1}, Ll/᩶ۘ᩻;->ᩳ(Ll/᩶ۘ᩻;)Ll/֫ۗۧ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
