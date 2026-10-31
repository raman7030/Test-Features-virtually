.class public Ll/᩸ۢ;
.super Landroid/widget/AutoCompleteTextView;
.source "168V"

# interfaces
.implements Ll/۫֫֫;


# static fields
.field public static final TINT_ATTRS:[I


# instance fields
.field public final mAppCompatEmojiEditTextHelper:Ll/ܰۢ;

.field public final mBackgroundTintHelper:Ll/᩹ۢ;

.field public final mTextHelper:Ll/֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x1010176

    .line 63
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/᩸ۢ;->TINT_ATTRS:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 73
    invoke-direct {p0, p1, v0}, Ll/᩸ۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040045

    .line 77
    invoke-direct {p0, p1, p2, v0}, Ll/᩸ۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 82
    invoke-static {p1}, Ll/ۤۘ;->֫(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Ll/᩸ۢ;->TINT_ATTRS:[I

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

    iput-object p1, p0, Ll/᩸ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    .line 94
    invoke-virtual {p1, p2, p3}, Ll/᩹ۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 96
    new-instance p1, Ll/֫ܺ;

    invoke-direct {p1, p0}, Ll/֫ܺ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    .line 97
    invoke-virtual {p1, p2, p3}, Ll/֫ܺ;->֫(Landroid/util/AttributeSet;I)V

    .line 98
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    .line 100
    new-instance p1, Ll/ܰۢ;

    invoke-direct {p1, p0}, Ll/ܰۢ;-><init>(Landroid/widget/EditText;)V

    iput-object p1, p0, Ll/᩸ۢ;->mAppCompatEmojiEditTextHelper:Ll/ܰۢ;

    .line 101
    invoke-virtual {p1, p2, p3}, Ll/ܰۢ;->֫(Landroid/util/AttributeSet;I)V

    .line 102
    invoke-virtual {p0, p1}, Ll/᩸ۢ;->initEmojiKeyListener(Ll/ܰۢ;)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 220
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->drawableStateChanged()V

    .line 221
    iget-object v0, p0, Ll/᩸ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 222
    invoke-virtual {v0}, Ll/᩹ۢ;->֫()V

    .line 224
    :cond_0
    iget-object v0, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_1

    .line 225
    invoke-virtual {v0}, Ll/֫ܺ;->֫()V

    :cond_1
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1

    .line 259
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    .line 258
    invoke-static {v0}, Ll/ۙ֫֫;->֫(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object v0

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 188
    iget-object v0, p0, Ll/᩸ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 189
    invoke-virtual {v0}, Ll/᩹ۢ;->ۧ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 214
    iget-object v0, p0, Ll/᩸ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {v0}, Ll/᩹ۢ;->ܽ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 314
    iget-object v0, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->ۜ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 355
    iget-object v0, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0}, Ll/֫ܺ;->᩷()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public initEmojiKeyListener(Ll/ܰۢ;)V
    .locals 5

    .line 126
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    move-result-object v0

    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    instance-of v1, v0, Landroid/text/method/NumberKeyListener;

    if-nez v1, :cond_1

    .line 128
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->isFocusable()Z

    move-result v1

    .line 129
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->isClickable()Z

    move-result v2

    .line 130
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->isLongClickable()Z

    move-result v3

    .line 131
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->getInputType()I

    move-result v4

    .line 132
    invoke-virtual {p1, v0}, Ll/ܰۢ;->֫(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 136
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 138
    invoke-super {p0, v4}, Landroid/widget/AutoCompleteTextView;->setRawInputType(I)V

    .line 139
    invoke-super {p0, v1}, Landroid/widget/AutoCompleteTextView;->setFocusable(Z)V

    .line 140
    invoke-super {p0, v2}, Landroid/widget/AutoCompleteTextView;->setClickable(Z)V

    .line 141
    invoke-super {p0, v3}, Landroid/widget/AutoCompleteTextView;->setLongClickable(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    .line 280
    iget-object v0, p0, Ll/᩸ۢ;->mAppCompatEmojiEditTextHelper:Ll/ܰۢ;

    invoke-virtual {v0}, Ll/ܰۢ;->֫()Z

    move-result v0

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .line 240
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 239
    invoke-static {v0, p1, p0}, Ll/֫ۡ;->֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V

    .line 241
    iget-object v1, p0, Ll/᩸ۢ;->mAppCompatEmojiEditTextHelper:Ll/ܰۢ;

    invoke-virtual {v1, v0, p1}, Ll/ܰۢ;->֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 160
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 161
    iget-object p1, p0, Ll/᩸ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz p1, :cond_0

    .line 162
    invoke-virtual {p1}, Ll/᩹ۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 152
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundResource(I)V

    .line 153
    iget-object v0, p0, Ll/᩸ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(I)V

    :cond_0
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 286
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/AutoCompleteTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 287
    iget-object p1, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 295
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/AutoCompleteTextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 296
    iget-object p1, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz p1, :cond_0

    .line 536
    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 252
    invoke-static {p1, p0}, Ll/ۙ֫֫;->֫(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 251
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setDropDownBackgroundResource(I)V
    .locals 1

    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    .line 275
    iget-object v0, p0, Ll/᩸ۢ;->mAppCompatEmojiEditTextHelper:Ll/ܰۢ;

    invoke-virtual {v0, p1}, Ll/ܰۢ;->֫(Z)V

    return-void
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 1

    .line 270
    iget-object v0, p0, Ll/᩸ۢ;->mAppCompatEmojiEditTextHelper:Ll/ܰۢ;

    invoke-virtual {v0, p1}, Ll/ܰۢ;->֫(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 174
    iget-object v0, p0, Ll/᩸ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->ۧ(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/᩸ۢ;->mBackgroundTintHelper:Ll/᩹ۢ;

    if-eqz v0, :cond_0

    .line 201
    invoke-virtual {v0, p1}, Ll/᩹ۢ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 336
    iget-object v0, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/content/res/ColorStateList;)V

    .line 337
    iget-object p1, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 374
    iget-object v0, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {v0, p1}, Ll/֫ܺ;->֫(Landroid/graphics/PorterDuff$Mode;)V

    .line 375
    iget-object p1, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    invoke-virtual {p1}, Ll/֫ܺ;->֫()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    .line 231
    invoke-super {p0, p1, p2}, Landroid/widget/AutoCompleteTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 232
    iget-object v0, p0, Ll/᩸ۢ;->mTextHelper:Ll/֫ܺ;

    if-eqz v0, :cond_0

    .line 233
    invoke-virtual {v0, p1, p2}, Ll/֫ܺ;->֫(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
