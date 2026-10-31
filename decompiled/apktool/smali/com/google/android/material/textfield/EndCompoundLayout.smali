.class public Lcom/google/android/material/textfield/EndCompoundLayout;
.super Landroid/widget/LinearLayout;
.source "EndCompoundLayout.java"


# instance fields
.field public final accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

.field public editText:Landroid/widget/EditText;

.field public final editTextWatcher:Landroid/text/TextWatcher;

.field public final endIconChangedListeners:Ljava/util/LinkedHashSet;

.field public final endIconDelegates:Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;

.field public final endIconFrame:Landroid/widget/FrameLayout;

.field public endIconMinSize:I

.field public endIconMode:I

.field public endIconOnLongClickListener:Landroid/view/View$OnLongClickListener;

.field public endIconScaleType:Landroid/widget/ImageView$ScaleType;

.field public endIconTintList:Landroid/content/res/ColorStateList;

.field public endIconTintMode:Landroid/graphics/PorterDuff$Mode;

.field public final endIconView:Lcom/google/android/material/internal/CheckableImageButton;

.field public errorIconOnLongClickListener:Landroid/view/View$OnLongClickListener;

.field public errorIconTintList:Landroid/content/res/ColorStateList;

.field public errorIconTintMode:Landroid/graphics/PorterDuff$Mode;

.field public final errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

.field public hintExpanded:Z

.field public final onEditTextAttachedListener:Lcom/google/android/material/textfield/TextInputLayout$OnEditTextAttachedListener;

.field public suffixText:Ljava/lang/CharSequence;

.field public final suffixTextView:Landroid/widget/TextView;

.field public final textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field public touchExplorationStateChangeListener:Ll/ۛܰ;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Ll/᩺ۘ;)V
    .locals 6

    .line 151
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 96
    iput v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    .line 97
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconChangedListeners:Ljava/util/LinkedHashSet;

    .line 114
    new-instance v1, Lcom/google/android/material/textfield/EndCompoundLayout$1;

    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/EndCompoundLayout$1;-><init>(Lcom/google/android/material/textfield/EndCompoundLayout;)V

    iput-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->editTextWatcher:Landroid/text/TextWatcher;

    .line 127
    new-instance v1, Lcom/google/android/material/textfield/EndCompoundLayout$2;

    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/EndCompoundLayout$2;-><init>(Lcom/google/android/material/textfield/EndCompoundLayout;)V

    iput-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->onEditTextAttachedListener:Lcom/google/android/material/textfield/TextInputLayout$OnEditTextAttachedListener;

    .line 154
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "accessibility"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/accessibility/AccessibilityManager;

    iput-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    .line 156
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 v2, 0x8

    .line 158
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 159
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 160
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const v3, 0x800005

    const/4 v4, -0x2

    const/4 v5, -0x1

    invoke-direct {v0, v4, v5, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 166
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconFrame:Landroid/widget/FrameLayout;

    .line 167
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 168
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 171
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 172
    sget v3, Ll/᩷۠ܺ;->᩸ۢ:I

    invoke-direct {p0, p0, v2, v3}, Lcom/google/android/material/textfield/EndCompoundLayout;->createIconView(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 173
    sget v4, Ll/᩷۠ܺ;->ܶۢ:I

    invoke-direct {p0, v0, v2, v4}, Lcom/google/android/material/textfield/EndCompoundLayout;->createIconView(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 174
    new-instance v4, Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;

    invoke-direct {v4, p0, p2}, Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;-><init>(Lcom/google/android/material/textfield/EndCompoundLayout;Ll/᩺ۘ;)V

    iput-object v4, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconDelegates:Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;

    .line 176
    new-instance v4, Ll/ܳܺ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    .line 178
    invoke-direct {p0, p2}, Lcom/google/android/material/textfield/EndCompoundLayout;->initErrorIconView(Ll/᩺ۘ;)V

    .line 179
    invoke-direct {p0, p2}, Lcom/google/android/material/textfield/EndCompoundLayout;->initEndIconView(Ll/᩺ۘ;)V

    .line 180
    invoke-direct {p0, p2}, Lcom/google/android/material/textfield/EndCompoundLayout;->initSuffixTextView(Ll/᩺ۘ;)V

    .line 182
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 184
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 185
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 186
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 188
    invoke-virtual {p1, v1}, Lcom/google/android/material/textfield/TextInputLayout;->addOnEditTextAttachedListener(Lcom/google/android/material/textfield/TextInputLayout$OnEditTextAttachedListener;)V

    .line 189
    new-instance p1, Lcom/google/android/material/textfield/EndCompoundLayout$3;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/EndCompoundLayout$3;-><init>(Lcom/google/android/material/textfield/EndCompoundLayout;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/google/android/material/textfield/EndCompoundLayout;)Landroid/widget/EditText;
    .locals 0

    .line 84
    iget-object p0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->editText:Landroid/widget/EditText;

    return-object p0
.end method

.method public static synthetic access$002(Lcom/google/android/material/textfield/EndCompoundLayout;Landroid/widget/EditText;)Landroid/widget/EditText;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->editText:Landroid/widget/EditText;

    return-object p1
.end method

.method public static synthetic access$100(Lcom/google/android/material/textfield/EndCompoundLayout;)Landroid/text/TextWatcher;
    .locals 0

    .line 84
    iget-object p0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->editTextWatcher:Landroid/text/TextWatcher;

    return-object p0
.end method

.method public static synthetic access$200(Lcom/google/android/material/textfield/EndCompoundLayout;Lcom/google/android/material/textfield/EndIconDelegate;)V
    .locals 0

    .line 84
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setOnFocusChangeListenersIfNeeded(Lcom/google/android/material/textfield/EndIconDelegate;)V

    return-void
.end method

.method public static synthetic access$300(Lcom/google/android/material/textfield/EndCompoundLayout;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->addTouchExplorationStateChangeListenerIfNeeded()V

    return-void
.end method

.method public static synthetic access$400(Lcom/google/android/material/textfield/EndCompoundLayout;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->removeTouchExplorationStateChangeListenerIfNeeded()V

    return-void
.end method

.method private addTouchExplorationStateChangeListenerIfNeeded()V
    .locals 2

    .line 426
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->touchExplorationStateChangeListener:Ll/ۛܰ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_0

    .line 428
    sget v0, Ll/ܿ᩺;->֫:I

    .line 4137
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 429
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->touchExplorationStateChangeListener:Ll/ۛܰ;

    invoke-static {v0, v1}, Ll/᩺ܰ;->֫(Landroid/view/accessibility/AccessibilityManager;Ll/ۛܰ;)V

    :cond_0
    return-void
.end method

.method private createIconView(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;
    .locals 2

    .line 205
    sget v0, Ll/ܺ۠ܺ;->᩷֫:I

    const/4 v1, 0x0

    .line 206
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 208
    invoke-virtual {p1, p3}, Landroid/view/View;->setId(I)V

    .line 209
    invoke-static {p1}, Lcom/google/android/material/textfield/IconHelper;->setCompatRippleBackgroundIfNeeded(Lcom/google/android/material/internal/CheckableImageButton;)V

    .line 210
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/material/resources/MaterialResources;->isFontScaleAtLeast1_3(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 212
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 82
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    :cond_0
    return-object p1
.end method

.method private dispatchOnEndIconChanged(I)V
    .locals 3

    .line 795
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconChangedListeners:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout$OnEndIconChangedListener;

    .line 796
    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-interface {v1, v2, p1}, Lcom/google/android/material/textfield/TextInputLayout$OnEndIconChangedListener;->onEndIconChanged(Lcom/google/android/material/textfield/TextInputLayout;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private getIconResId(Lcom/google/android/material/textfield/EndIconDelegate;)I
    .locals 1

    .line 442
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconDelegates:Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;

    invoke-static {v0}, Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;->access$500(Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;)I

    move-result v0

    if-nez v0, :cond_0

    .line 443
    invoke-virtual {p1}, Lcom/google/android/material/textfield/EndIconDelegate;->getIconDrawableResId()I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method private initEndIconView(Ll/᩺ۘ;)V
    .locals 5

    .line 243
    sget v0, Ll/᩵۠ܺ;->ۨᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-nez v0, :cond_1

    .line 245
    sget v0, Ll/᩵۠ܺ;->ۢᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Ll/᩵۠ܺ;->ۢᩴ֫:I

    .line 247
    invoke-static {v0, p1, v3}, Lcom/google/android/material/resources/MaterialResources;->getColorStateList(Landroid/content/Context;Ll/᩺ۘ;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    .line 251
    :cond_0
    sget v0, Ll/᩵۠ܺ;->ۡᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    sget v0, Ll/᩵۠ܺ;->ۡᩴ֫:I

    .line 254
    invoke-virtual {p1, v0, v2}, Ll/᩺ۘ;->ܽ(II)I

    move-result v0

    .line 253
    invoke-static {v0, v1}, Lcom/google/android/material/internal/ViewUtils;->parseTintMode(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 257
    :cond_1
    sget v0, Ll/᩵۠ܺ;->ۜᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    .line 259
    sget v0, Ll/᩵۠ܺ;->ۜᩴ֫:I

    invoke-virtual {p1, v0, v3}, Ll/᩺ۘ;->ܽ(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconMode(I)V

    .line 260
    sget v0, Ll/᩵۠ܺ;->ܿᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 261
    sget v0, Ll/᩵۠ܺ;->ܿᩴ֫:I

    .line 262
    invoke-virtual {p1, v0}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 261
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    .line 264
    :cond_2
    sget v0, Ll/᩵۠ܺ;->ᩳᩴ֫:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconCheckable(Z)V

    goto :goto_0

    .line 265
    :cond_3
    sget v0, Ll/᩵۠ܺ;->ۨᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 267
    sget v0, Ll/᩵۠ܺ;->᩺ᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 270
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v4, Ll/᩵۠ܺ;->᩺ᩴ֫:I

    .line 269
    invoke-static {v0, p1, v4}, Lcom/google/android/material/resources/MaterialResources;->getColorStateList(Landroid/content/Context;Ll/᩺ۘ;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    .line 272
    :cond_4
    sget v0, Ll/᩵۠ܺ;->ܰᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 273
    sget v0, Ll/᩵۠ܺ;->ܰᩴ֫:I

    .line 275
    invoke-virtual {p1, v0, v2}, Ll/᩺ۘ;->ܽ(II)I

    move-result v0

    .line 274
    invoke-static {v0, v1}, Lcom/google/android/material/internal/ViewUtils;->parseTintMode(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 277
    :cond_5
    sget v0, Ll/᩵۠ܺ;->ۨᩴ֫:I

    .line 278
    invoke-virtual {p1, v0, v3}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v0

    .line 279
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconMode(I)V

    .line 280
    sget v0, Ll/᩵۠ܺ;->ۤᩴ֫:I

    .line 281
    invoke-virtual {p1, v0}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 280
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    .line 283
    :cond_6
    :goto_0
    sget v0, Ll/᩵۠ܺ;->᩻ᩴ֫:I

    .line 286
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Ll/᩻۠ܺ;->۬۠:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 284
    invoke-virtual {p1, v0, v1}, Ll/᩺ۘ;->ۧ(II)I

    move-result v0

    .line 283
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconMinSize(I)V

    .line 287
    sget v0, Ll/᩵۠ܺ;->᩷ᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 288
    sget v0, Ll/᩵۠ܺ;->᩷ᩴ֫:I

    .line 289
    invoke-virtual {p1, v0, v2}, Ll/᩺ۘ;->ܽ(II)I

    move-result p1

    invoke-static {p1}, Lcom/google/android/material/textfield/IconHelper;->convertScaleType(I)Landroid/widget/ImageView$ScaleType;

    move-result-object p1

    .line 288
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_7
    return-void
.end method

.method private initErrorIconView(Ll/᩺ۘ;)V
    .locals 2

    .line 219
    sget v0, Ll/᩵۠ܺ;->᩵ᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Ll/᩵۠ܺ;->᩵ᩴ֫:I

    .line 221
    invoke-static {v0, p1, v1}, Lcom/google/android/material/resources/MaterialResources;->getColorStateList(Landroid/content/Context;Ll/᩺ۘ;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintList:Landroid/content/res/ColorStateList;

    .line 224
    :cond_0
    sget v0, Ll/᩵۠ܺ;->֡ᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 225
    sget v0, Ll/᩵۠ܺ;->֡ᩴ֫:I

    const/4 v1, -0x1

    .line 227
    invoke-virtual {p1, v0, v1}, Ll/᩺ۘ;->ܽ(II)I

    move-result v0

    const/4 v1, 0x0

    .line 226
    invoke-static {v0, v1}, Lcom/google/android/material/internal/ViewUtils;->parseTintMode(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 229
    :cond_1
    sget v0, Ll/᩵۠ܺ;->ᩴᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 230
    sget v0, Ll/᩵۠ܺ;->ᩴᩴ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 232
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 233
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Ll/ۘ۠ܺ;->ۖ֫:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 232
    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 234
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    sget v0, Ll/ܿ᩺;->֫:I

    const/4 v0, 0x2

    .line 1427
    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 236
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 237
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/CheckableImageButton;->setPressable(Z)V

    .line 238
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    return-void
.end method

.method private initSuffixTextView(Ll/᩺ۘ;)V
    .locals 4

    .line 295
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 296
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    sget v1, Ll/᩷۠ܺ;->ۤۢ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 297
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    const/high16 v3, 0x42a00000    # 80.0f

    invoke-direct {v1, v2, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 302
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    sget v1, Ll/ܿ᩺;->֫:I

    const/4 v1, 0x1

    .line 2205
    invoke-virtual {v0, v1}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 305
    sget v0, Ll/᩵۠ܺ;->᩵᩵֫:I

    const/4 v1, 0x0

    .line 306
    invoke-virtual {p1, v0, v1}, Ll/᩺ۘ;->ܳ(II)I

    move-result v0

    .line 305
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->setSuffixTextAppearance(I)V

    .line 307
    sget v0, Ll/᩵۠ܺ;->֡᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    sget v0, Ll/᩵۠ܺ;->֡᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->setSuffixTextColor(Landroid/content/res/ColorStateList;)V

    .line 310
    :cond_0
    sget v0, Ll/᩵۠ܺ;->ᩴ᩵֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setSuffixText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private removeTouchExplorationStateChangeListenerIfNeeded()V
    .locals 2

    .line 435
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->touchExplorationStateChangeListener:Ll/ۛܰ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v1, :cond_0

    .line 436
    invoke-static {v1, v0}, Ll/᩺ܰ;->ۧ(Landroid/view/accessibility/AccessibilityManager;Ll/ۛܰ;)V

    :cond_0
    return-void
.end method

.method private setOnFocusChangeListenersIfNeeded(Lcom/google/android/material/textfield/EndIconDelegate;)V
    .locals 2

    .line 463
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->editText:Landroid/widget/EditText;

    if-nez v0, :cond_0

    goto :goto_0

    .line 466
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/textfield/EndIconDelegate;->getOnEditTextFocusChangeListener()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 467
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->editText:Landroid/widget/EditText;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/EndIconDelegate;->getOnEditTextFocusChangeListener()Landroid/view/View$OnFocusChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 469
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/material/textfield/EndIconDelegate;->getOnIconViewFocusChangeListener()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 470
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/EndIconDelegate;->getOnIconViewFocusChangeListener()Landroid/view/View$OnFocusChangeListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private setUpDelegate(Lcom/google/android/material/textfield/EndIconDelegate;)V
    .locals 0

    .line 413
    invoke-virtual {p1}, Lcom/google/android/material/textfield/EndIconDelegate;->setUp()V

    .line 415
    invoke-virtual {p1}, Lcom/google/android/material/textfield/EndIconDelegate;->getTouchExplorationStateChangeListener()Ll/ۛܰ;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->touchExplorationStateChangeListener:Ll/ۛܰ;

    .line 416
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->addTouchExplorationStateChangeListenerIfNeeded()V

    return-void
.end method

.method private tearDownDelegate(Lcom/google/android/material/textfield/EndIconDelegate;)V
    .locals 1

    .line 420
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->removeTouchExplorationStateChangeListenerIfNeeded()V

    const/4 v0, 0x0

    .line 421
    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->touchExplorationStateChangeListener:Ll/ۛܰ;

    .line 422
    invoke-virtual {p1}, Lcom/google/android/material/textfield/EndIconDelegate;->tearDown()V

    return-void
.end method

.method private tintEndIconOnError(Z)V
    .locals 3

    if-eqz p1, :cond_0

    .line 801
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 804
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Ll/۠۬;->ܳ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 805
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 806
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    move-result v0

    .line 805
    invoke-static {p1, v0}, Ll/۠۬;->ۧ(Landroid/graphics/drawable/Drawable;I)V

    .line 807
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Ll/ۧۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 809
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method private updateEndLayoutVisibility()V
    .locals 3

    .line 785
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconFrame:Landroid/widget/FrameLayout;

    .line 786
    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isErrorIconVisible()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 785
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 788
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixText:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->hintExpanded:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/16 v0, 0x8

    .line 790
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isEndIconVisible()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isErrorIconVisible()Z

    move-result v1

    if-nez v1, :cond_2

    if-nez v0, :cond_3

    :cond_2
    const/4 v2, 0x0

    .line 791
    :cond_3
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private updateErrorIconVisibility()V
    .locals 3

    .line 772
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getErrorIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 773
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->isErrorEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 774
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->shouldShowError()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 775
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 776
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->updateEndLayoutVisibility()V

    .line 777
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->updateSuffixTextViewPadding()V

    .line 778
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->hasEndIcon()Z

    move-result v0

    if-nez v0, :cond_2

    .line 779
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->updateDummyDrawables()Z

    :cond_2
    return-void
.end method

.method private updateSuffixTextVisibility()V
    .locals 3

    .line 711
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    .line 712
    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixText:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->hintExpanded:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    if-eq v0, v1, :cond_2

    .line 714
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconDelegate()Lcom/google/android/material/textfield/EndIconDelegate;

    move-result-object v0

    if-nez v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/EndIconDelegate;->onSuffixVisibilityChanged(Z)V

    .line 716
    :cond_2
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->updateEndLayoutVisibility()V

    .line 719
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 720
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->updateDummyDrawables()Z

    return-void
.end method


# virtual methods
.method public addOnEndIconChangedListener(Lcom/google/android/material/textfield/TextInputLayout$OnEndIconChangedListener;)V
    .locals 1

    .line 589
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconChangedListeners:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public checkEndIcon()V
    .locals 1

    .line 512
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 514
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    return-void
.end method

.method public clearOnEndIconChangedListeners()V
    .locals 1

    .line 597
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconChangedListeners:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method public getCurrentEndIconView()Lcom/google/android/material/internal/CheckableImageButton;
    .locals 1

    .line 757
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isErrorIconVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 758
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    return-object v0

    .line 759
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->hasEndIcon()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isEndIconVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 760
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getEndIconContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 546
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getEndIconDelegate()Lcom/google/android/material/textfield/EndIconDelegate;
    .locals 2

    .line 351
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconDelegates:Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;

    iget v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;->get(I)Lcom/google/android/material/textfield/EndIconDelegate;

    move-result-object v0

    return-object v0
.end method

.method public getEndIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 531
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getEndIconMinSize()I
    .locals 1

    .line 575
    iget v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMinSize:I

    return v0
.end method

.method public getEndIconMode()I
    .locals 1

    .line 356
    iget v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    return v0
.end method

.method public getEndIconScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 585
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconScaleType:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public getEndIconView()Lcom/google/android/material/internal/CheckableImageButton;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    return-object v0
.end method

.method public getErrorIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 325
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getPasswordVisibilityToggleContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 657
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getPasswordVisibilityToggleDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 652
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getSuffixText()Ljava/lang/CharSequence;
    .locals 1

    .line 616
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixText:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getSuffixTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 629
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSuffixTextEndOffset()I
    .locals 3

    .line 742
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isEndIconVisible()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isErrorIconVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 743
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 744
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    .line 746
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 48
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v1

    add-int/2addr v0, v1

    .line 750
    :goto_1
    sget v1, Ll/ܿ᩺;->֫:I

    .line 2235
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v1

    .line 750
    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    .line 2235
    invoke-virtual {v2}, Landroid/view/View;->getPaddingEnd()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    return v2
.end method

.method public getSuffixTextView()Landroid/widget/TextView;
    .locals 1

    .line 605
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method public hasEndIcon()Z
    .locals 1

    .line 601
    iget v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isEndIconCheckable()Z
    .locals 1

    .line 504
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Lcom/google/android/material/internal/CheckableImageButton;->isCheckable()Z

    move-result v0

    return v0
.end method

.method public isEndIconChecked()Z
    .locals 1

    .line 508
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->hasEndIcon()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isEndIconVisible()Z
    .locals 1

    .line 488
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isErrorIconVisible()Z
    .locals 1

    .line 767
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isPasswordVisibilityToggleEnabled()Z
    .locals 2

    .line 661
    iget v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onHintStateChanged(Z)V
    .locals 0

    .line 694
    iput-boolean p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->hintExpanded:Z

    .line 695
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->updateSuffixTextVisibility()V

    return-void
.end method

.method public onTextInputBoxStateUpdated()V
    .locals 1

    .line 699
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->updateErrorIconVisibility()V

    .line 702
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->refreshErrorIconDrawableState()V

    .line 703
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->refreshEndIconDrawableState()V

    .line 705
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconDelegate()Lcom/google/android/material/textfield/EndIconDelegate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/textfield/EndIconDelegate;->shouldTintIconOnError()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 706
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->shouldShowError()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->tintEndIconOnError(Z)V

    :cond_0
    return-void
.end method

.method public refreshEndIconDrawableState()V
    .locals 3

    .line 496
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, v2}, Lcom/google/android/material/textfield/IconHelper;->refreshIconDrawableState(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public refreshErrorIconDrawableState()V
    .locals 3

    .line 475
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintList:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, v2}, Lcom/google/android/material/textfield/IconHelper;->refreshIconDrawableState(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public refreshIconState(Z)V
    .locals 4

    .line 392
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconDelegate()Lcom/google/android/material/textfield/EndIconDelegate;

    move-result-object v0

    .line 393
    invoke-virtual {v0}, Lcom/google/android/material/textfield/EndIconDelegate;->isIconCheckable()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 394
    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result v1

    .line 395
    invoke-virtual {v0}, Lcom/google/android/material/textfield/EndIconDelegate;->isIconChecked()Z

    move-result v3

    if-eq v1, v3, :cond_0

    .line 396
    iget-object v3, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    xor-int/2addr v1, v2

    invoke-virtual {v3, v1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 400
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/material/textfield/EndIconDelegate;->isIconActivable()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 401
    iget-object v3, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v3}, Landroid/view/View;->isActivated()Z

    move-result v3

    .line 402
    invoke-virtual {v0}, Lcom/google/android/material/textfield/EndIconDelegate;->isIconActivated()Z

    move-result v0

    if-eq v3, v0, :cond_1

    xor-int/lit8 v0, v3, 0x1

    .line 403
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconActivated(Z)V

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    if-nez p1, :cond_3

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    return-void

    .line 408
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->refreshEndIconDrawableState()V

    return-void
.end method

.method public removeOnEndIconChangedListener(Lcom/google/android/material/textfield/TextInputLayout$OnEndIconChangedListener;)V
    .locals 1

    .line 593
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconChangedListeners:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setEndIconActivated(Z)V
    .locals 1

    .line 492
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setActivated(Z)V

    return-void
.end method

.method public setEndIconCheckable(Z)V
    .locals 1

    .line 500
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    return-void
.end method

.method public setEndIconContentDescription(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 535
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setEndIconContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 539
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 540
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setEndIconDrawable(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 518
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 522
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Ll/ۧۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    .line 524
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 525
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->refreshEndIconDrawableState()V

    :cond_0
    return-void
.end method

.method public setEndIconMinSize(I)V
    .locals 1

    if-ltz p1, :cond_1

    .line 567
    iget v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMinSize:I

    if-eq p1, v0, :cond_0

    .line 568
    iput p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMinSize:I

    .line 569
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->setIconMinSize(Lcom/google/android/material/internal/CheckableImageButton;I)V

    .line 570
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->setIconMinSize(Lcom/google/android/material/internal/CheckableImageButton;I)V

    :cond_0
    return-void

    .line 565
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "endIconSize cannot be less than 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setEndIconMode(I)V
    .locals 4

    .line 360
    iget v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    if-ne v0, p1, :cond_0

    return-void

    .line 363
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconDelegate()Lcom/google/android/material/textfield/EndIconDelegate;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->tearDownDelegate(Lcom/google/android/material/textfield/EndIconDelegate;)V

    .line 364
    iget v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    .line 365
    iput p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    .line 366
    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->dispatchOnEndIconChanged(I)V

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 367
    :goto_0
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconVisible(Z)V

    .line 368
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconDelegate()Lcom/google/android/material/textfield/EndIconDelegate;

    move-result-object v1

    .line 369
    invoke-direct {p0, v1}, Lcom/google/android/material/textfield/EndCompoundLayout;->getIconResId(Lcom/google/android/material/textfield/EndIconDelegate;)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconDrawable(I)V

    .line 370
    invoke-virtual {v1}, Lcom/google/android/material/textfield/EndIconDelegate;->getIconContentDescriptionResId()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconContentDescription(I)V

    .line 371
    invoke-virtual {v1}, Lcom/google/android/material/textfield/EndIconDelegate;->isIconCheckable()Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconCheckable(Z)V

    .line 372
    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/material/textfield/EndIconDelegate;->isBoxBackgroundModeSupported(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 373
    invoke-direct {p0, v1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setUpDelegate(Lcom/google/android/material/textfield/EndIconDelegate;)V

    .line 381
    invoke-virtual {v1}, Lcom/google/android/material/textfield/EndIconDelegate;->getOnIconClickListener()Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 382
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->editText:Landroid/widget/EditText;

    if-eqz p1, :cond_2

    .line 383
    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/EndIconDelegate;->onEditTextAttached(Landroid/widget/EditText;)V

    .line 384
    invoke-direct {p0, v1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setOnFocusChangeListenersIfNeeded(Lcom/google/android/material/textfield/EndIconDelegate;)V

    .line 386
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    iget-object v3, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 387
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/EndCompoundLayout;->refreshIconState(Z)V

    return-void

    .line 375
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The current box background mode "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 377
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is not supported by the end icon mode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 447
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconOnLongClickListener:Landroid/view/View$OnLongClickListener;

    invoke-static {v0, p1, v1}, Lcom/google/android/material/textfield/IconHelper;->setIconOnClickListener(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setEndIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 452
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconOnLongClickListener:Landroid/view/View$OnLongClickListener;

    .line 453
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->setIconOnLongClickListener(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setEndIconScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .line 579
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconScaleType:Landroid/widget/ImageView$ScaleType;

    .line 580
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->setIconScaleType(Lcom/google/android/material/internal/CheckableImageButton;Landroid/widget/ImageView$ScaleType;)V

    .line 581
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->setIconScaleType(Lcom/google/android/material/internal/CheckableImageButton;Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public setEndIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 550
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    .line 551
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    .line 552
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setEndIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    .line 557
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    .line 558
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 559
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, v2, p1}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setEndIconVisible(Z)V
    .locals 1

    .line 479
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isEndIconVisible()Z

    move-result v0

    if-eq v0, p1, :cond_1

    .line 480
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 481
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->updateEndLayoutVisibility()V

    .line 482
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->updateSuffixTextViewPadding()V

    .line 483
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->updateDummyDrawables()Z

    :cond_1
    return-void
.end method

.method public setErrorIconDrawable(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 314
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 315
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->refreshErrorIconDrawableState()V

    return-void
.end method

.method public setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 319
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Ll/ۧۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 320
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->updateErrorIconVisibility()V

    .line 321
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintList:Landroid/content/res/ColorStateList;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintMode:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setErrorIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 343
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconOnLongClickListener:Landroid/view/View$OnLongClickListener;

    invoke-static {v0, p1, v1}, Lcom/google/android/material/textfield/IconHelper;->setIconOnClickListener(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setErrorIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 458
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconOnLongClickListener:Landroid/view/View$OnLongClickListener;

    .line 459
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->setIconOnLongClickListener(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setErrorIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 329
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintList:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    .line 330
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintList:Landroid/content/res/ColorStateList;

    .line 331
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintMode:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setErrorIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    .line 336
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintMode:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    .line 337
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 338
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->errorIconTintList:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, v2, p1}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setPasswordVisibilityToggleContentDescription(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 643
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 642
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setPasswordVisibilityToggleContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPasswordVisibilityToggleContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 647
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPasswordVisibilityToggleDrawable(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 634
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 633
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setPasswordVisibilityToggleDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPasswordVisibilityToggleDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 638
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Ll/ۧۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPasswordVisibilityToggleEnabled(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 665
    iget v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 667
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconMode(I)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 670
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/EndCompoundLayout;->setEndIconMode(I)V

    :cond_1
    return-void
.end method

.method public setPasswordVisibilityToggleTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 675
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    .line 676
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setPasswordVisibilityToggleTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    .line 680
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintMode:Landroid/graphics/PorterDuff$Mode;

    .line 681
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconTintList:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, v2, p1}, Lcom/google/android/material/textfield/IconHelper;->applyIconTint(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setSuffixText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 609
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iput-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixText:Ljava/lang/CharSequence;

    .line 610
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 611
    invoke-direct {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->updateSuffixTextVisibility()V

    return-void
.end method

.method public setSuffixTextAppearance(I)V
    .locals 1

    .line 620
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    invoke-static {v0, p1}, Ll/ۙ֫֫;->ᩳ(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setSuffixTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 624
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public togglePasswordVisibilityToggle(Z)V
    .locals 2

    .line 685
    iget v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 686
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    if-eqz p1, :cond_0

    .line 688
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->endIconView:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    :cond_0
    return-void
.end method

.method public updateSuffixTextViewPadding()V
    .locals 6

    .line 724
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->editText:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    .line 728
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isEndIconVisible()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->isErrorIconVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 729
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->editText:Landroid/widget/EditText;

    sget v1, Ll/ܿ᩺;->֫:I

    .line 2235
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    move-result v0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 730
    :goto_1
    iget-object v1, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->suffixTextView:Landroid/widget/TextView;

    .line 732
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 733
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Ll/᩻۠ܺ;->ܰ᩵:I

    .line 734
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v3, v3, Lcom/google/android/material/textfield/TextInputLayout;->editText:Landroid/widget/EditText;

    .line 735
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/material/textfield/EndCompoundLayout;->textInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v4, v4, Lcom/google/android/material/textfield/TextInputLayout;->editText:Landroid/widget/EditText;

    .line 737
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    .line 730
    sget v5, Ll/ܿ᩺;->֫:I

    .line 2255
    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    return-void
.end method
