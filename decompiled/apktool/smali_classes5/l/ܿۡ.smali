.class public Ll/ܿۡ;
.super Landroid/widget/MultiAutoCompleteTextView;
.source "A4VT"

# interfaces
.implements Ll/۫֫֫;


# static fields
.field public static final ۙ:[I


# instance fields
.field public final ᩶:Ll/֫ܺ;

.field public final ᩸:Ll/ܰۢ;

.field public final ᩹:Ll/᩹ۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x1010176

    .line 62
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/ܿۡ;->ۙ:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040045

    .line 77
    invoke-direct {p0, p1, p2, v0}, Ll/ܿۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 82
    invoke-static {p1}, Ll/ۤۘ;->֫(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/MultiAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Ll/ܿۡ;->ۙ:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object p1

    .line 88
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 91
    :cond_0
    invoke-virtual {p1}, Ll/᩺ۘ;->ܿ()V

    .line 93
    new-instance p1, Ll/᩹ۢ;

    invoke-direct {p1, p0}, Ll/᩹ۢ;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/ܿۡ;->᩹:Ll/᩹ۢ;

    .line 94
    invoke-virtual {p1, p2, p3}, Ll/᩹ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 96
    new-instance p1, Ll/֫ܺ;

    invoke-direct {p1, p0}, Ll/֫ܺ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/ܿۡ;->᩶:Ll/֫ܺ;

    .line 97
    invoke-virtual {p1, p2, p3}, Ll/֫ܺ;->֫(Landroid/util/AttributeSet;I)V

    .line 98
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    .line 100
    new-instance p1, Ll/ܰۢ;

    invoke-direct {p1, p0}, Ll/ܰۢ;-><init>(Landroid/widget/EditText;)V

    iput-object p1, p0, Ll/ܿۡ;->᩸:Ll/ܰۢ;

    .line 101
    invoke-virtual {p1, p2, p3}, Ll/ܰۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 126
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    move-result-object p2

    .line 86
    instance-of p3, p2, Landroid/text/method/NumberKeyListener;

    if-nez p3, :cond_2

    .line 128
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->isFocusable()Z

    move-result p3

    .line 129
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->isClickable()Z

    move-result v0

    .line 130
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->isLongClickable()Z

    move-result v1

    .line 131
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getInputType()I

    move-result v2

    .line 132
    invoke-virtual {p1, p2}, Ll/ܰۢ;->֫(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    if-ne p1, p2, :cond_1

    goto :goto_0

    .line 136
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 138
    invoke-super {p0, v2}, Landroid/widget/MultiAutoCompleteTextView;->setRawInputType(I)V

    .line 139
    invoke-super {p0, p3}, Landroid/widget/MultiAutoCompleteTextView;->setFocusable(Z)V

    .line 140
    invoke-super {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->setClickable(Z)V

    .line 141
    invoke-super {p0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setLongClickable(Z)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    .line 220
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->drawableStateChanged()V

    .line 221
    iget-object v0, p0, Ll/ܿۡ;->᩹:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 222
    invoke-virtual {v0}, Ll/᩹ۢ;->֫()V

    .line 224
    :cond_0
    iget-object v0, p0, Ll/ܿۡ;->᩶:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 225
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    :cond_1
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .line 240
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 239
    invoke-static {v0, p1, p0}, Ll/֫ۡ;->֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V

    .line 241
    iget-object v1, p0, Ll/ܿۡ;->᩸:Ll/ܰۢ;

    invoke-virtual {v1, v0, p1}, Ll/ܰۢ;->֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 160
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 161
    iget-object p1, p0, Ll/ܿۡ;->᩹:Ll/᩹ۢ;

    if-eqz p1, :cond_0

    .line 162
    invoke-virtual {p1}, Ll/᩹ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    .line 152
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setBackgroundResource(I)V

    .line 153
    iget-object v0, p0, Ll/ܿۡ;->᩹:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 268
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/MultiAutoCompleteTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 269
    iget-object p1, p0, Ll/ܿۡ;->᩶:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 277
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/MultiAutoCompleteTextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 278
    iget-object p1, p0, Ll/ܿۡ;->᩶:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public final setDropDownBackgroundResource(I)V
    .locals 1

    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 1

    .line 252
    iget-object v0, p0, Ll/ܿۡ;->᩸:Ll/ܰۢ;

    invoke-virtual {v0, p1}, Ll/ܰۢ;->֫(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method

.method public final setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 318
    iget-object v0, p0, Ll/ܿۡ;->᩶:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/content/res/ColorStateList;)V

    .line 319
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public final setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 356
    iget-object v0, p0, Ll/ܿۡ;->᩶:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    .line 357
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    .line 231
    invoke-super {p0, p1, p2}, Landroid/widget/MultiAutoCompleteTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 232
    iget-object v0, p0, Ll/ܿۡ;->᩶:Ll/֫ܺ;

    if-eqz v0, :cond_0

    .line 233
    invoke-virtual {v0, p1, p2}, Ll/֫ܺ;->֫(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
