.class public Ll/ᩴ᩹ۧ;
.super Ll/֫᩸ۧ;
.source "D6A1"


# instance fields
.field public ֫ۧ:I

.field public ۛ֫:I

.field public final ۟֫:Landroid/view/View$OnKeyListener;

.field public ۤ֫:I

.field public ۧۧ:Landroid/widget/TextView;

.field public ۨ֫:Landroid/widget/SeekBar;

.field public ۫֫:Z

.field public ܰ֫:I

.field public ܽۧ:Z

.field public ܿۧ:Z

.field public ᩳۧ:Z

.field public final ᩺֫:Landroid/widget/SeekBar$OnSeekBarChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f04040e

    .line 161
    invoke-direct {p0, p1, p2, v0}, Ll/ᩴ᩹ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const/4 v0, 0x0

    .line 137
    invoke-direct {p0, p1, p2, p3, v0}, Ll/֫᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 77
    new-instance v1, Ll/ۡ᩹ۧ;

    invoke-direct {v1, p0}, Ll/ۡ᩹ۧ;-><init>(Ll/ᩴ᩹ۧ;)V

    iput-object v1, p0, Ll/ᩴ᩹ۧ;->᩺֫:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 107
    new-instance v1, Ll/ܺ᩹ۧ;

    invoke-direct {v1, p0}, Ll/ܺ᩹ۧ;-><init>(Ll/ᩴ᩹ۧ;)V

    iput-object v1, p0, Ll/ᩴ᩹ۧ;->۟֫:Landroid/view/View$OnKeyListener;

    .line 139
    sget-object v1, Ll/ۢ᩹ۧ;->ܺ:[I

    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x3

    .line 145
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    const/16 p2, 0x64

    const/4 p3, 0x1

    .line 146
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 279
    iget v1, p0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    if-ge p2, v1, :cond_0

    move p2, v1

    .line 282
    :cond_0
    iget v1, p0, Ll/ᩴ᩹ۧ;->ۤ֫:I

    if-eq p2, v1, :cond_1

    .line 283
    iput p2, p0, Ll/ᩴ᩹ۧ;->ۤ֫:I

    .line 284
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    :cond_1
    const/4 p2, 0x4

    .line 147
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 258
    iget v1, p0, Ll/ᩴ᩹ۧ;->ܰ֫:I

    if-eq p2, v1, :cond_2

    .line 259
    iget v1, p0, Ll/ᩴ᩹ۧ;->ۤ֫:I

    iget v2, p0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    sub-int/2addr v1, v2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/ᩴ᩹ۧ;->ܰ֫:I

    .line 260
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    :cond_2
    const/4 p2, 0x2

    .line 148
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ll/ᩴ᩹ۧ;->۫֫:Z

    const/4 p2, 0x5

    .line 149
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ll/ᩴ᩹ۧ;->ܽۧ:Z

    const/4 p2, 0x6

    .line 150
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ll/ᩴ᩹ۧ;->ܿۧ:Z

    .line 152
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private ֫(IZ)V
    .locals 1

    .line 353
    iget v0, p0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    if-ge p1, v0, :cond_0

    move p1, v0

    .line 356
    :cond_0
    iget v0, p0, Ll/ᩴ᩹ۧ;->ۤ֫:I

    if-le p1, v0, :cond_1

    move p1, v0

    .line 360
    :cond_1
    iget v0, p0, Ll/ᩴ᩹ۧ;->֫ۧ:I

    if-eq p1, v0, :cond_2

    .line 361
    iput p1, p0, Ll/ᩴ᩹ۧ;->֫ۧ:I

    .line 362
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ۧ;->ܳ(I)V

    .line 363
    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->ۧ(I)V

    if-eqz p2, :cond_2

    .line 365
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 212
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/os/Parcelable;)V
    .locals 2

    .line 436
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/ۘ᩹ۧ;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 438
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Landroid/os/Parcelable;)V

    return-void

    .line 443
    :cond_0
    check-cast p1, Ll/ۘ᩹ۧ;

    .line 444
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Ll/֫᩸ۧ;->֫(Landroid/os/Parcelable;)V

    .line 445
    iget v0, p1, Ll/ۘ᩹ۧ;->᩶:I

    iput v0, p0, Ll/ᩴ᩹ۧ;->֫ۧ:I

    .line 446
    iget v0, p1, Ll/ۘ᩹ۧ;->᩹:I

    iput v0, p0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    .line 447
    iget p1, p1, Ll/ۘ᩹ۧ;->᩸:I

    iput p1, p0, Ll/ᩴ᩹ۧ;->ۤ֫:I

    .line 448
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    return-void
.end method

.method public final ֫(Landroid/widget/SeekBar;)V
    .locals 1

    .line 394
    iget v0, p0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p1

    add-int/2addr p1, v0

    .line 395
    iget v0, p0, Ll/ᩴ᩹ۧ;->֫ۧ:I

    if-eq p1, v0, :cond_0

    .line 396
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    const/4 v0, 0x0

    .line 397
    invoke-direct {p0, p1, v0}, Ll/ᩴ᩹ۧ;->֫(IZ)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 205
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 207
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(I)I

    move-result p1

    const/4 v0, 0x1

    .line 385
    invoke-direct {p0, p1, v0}, Ll/ᩴ᩹ۧ;->֫(IZ)V

    return-void
.end method

.method public final ֫(Ll/᩷᩹ۧ;)V
    .locals 2

    .line 170
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/᩷᩹ۧ;)V

    .line 171
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    iget-object v1, p0, Ll/ᩴ᩹ۧ;->۟֫:Landroid/view/View$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    const v0, 0x7f0a04f9

    .line 172
    invoke-virtual {p1, v0}, Ll/᩷᩹ۧ;->ۧ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Ll/ᩴ᩹ۧ;->ۨ֫:Landroid/widget/SeekBar;

    const v0, 0x7f0a04fa

    .line 173
    invoke-virtual {p1, v0}, Ll/᩷᩹ۧ;->ۧ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ᩴ᩹ۧ;->ۧۧ:Landroid/widget/TextView;

    .line 174
    iget-boolean v0, p0, Ll/ᩴ᩹ۧ;->ܽۧ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 175
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 177
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    .line 178
    iput-object p1, p0, Ll/ᩴ᩹ۧ;->ۧۧ:Landroid/widget/TextView;

    .line 181
    :goto_0
    iget-object p1, p0, Ll/ᩴ᩹ۧ;->ۨ֫:Landroid/widget/SeekBar;

    if-nez p1, :cond_1

    return-void

    .line 185
    :cond_1
    iget-object v0, p0, Ll/ᩴ᩹ۧ;->᩺֫:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 186
    iget-object p1, p0, Ll/ᩴ᩹ۧ;->ۨ֫:Landroid/widget/SeekBar;

    iget v0, p0, Ll/ᩴ᩹ۧ;->ۤ֫:I

    iget v1, p0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 191
    iget p1, p0, Ll/ᩴ᩹ۧ;->ܰ֫:I

    if-eqz p1, :cond_2

    .line 192
    iget-object v0, p0, Ll/ᩴ᩹ۧ;->ۨ֫:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/widget/AbsSeekBar;->setKeyProgressIncrement(I)V

    goto :goto_1

    .line 194
    :cond_2
    iget-object p1, p0, Ll/ᩴ᩹ۧ;->ۨ֫:Landroid/widget/SeekBar;

    invoke-virtual {p1}, Landroid/widget/AbsSeekBar;->getKeyProgressIncrement()I

    move-result p1

    iput p1, p0, Ll/ᩴ᩹ۧ;->ܰ֫:I

    .line 197
    :goto_1
    iget-object p1, p0, Ll/ᩴ᩹ۧ;->ۨ֫:Landroid/widget/SeekBar;

    iget v0, p0, Ll/ᩴ᩹ۧ;->֫ۧ:I

    iget v1, p0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 198
    iget p1, p0, Ll/ᩴ᩹ۧ;->֫ۧ:I

    invoke-virtual {p0, p1}, Ll/ᩴ᩹ۧ;->ܳ(I)V

    .line 199
    iget-object p1, p0, Ll/ᩴ᩹ۧ;->ۨ֫:Landroid/widget/SeekBar;

    invoke-virtual {p0}, Ll/֫᩸ۧ;->᩶()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public final ܳ(I)V
    .locals 1

    .line 412
    iget-object v0, p0, Ll/ᩴ᩹ۧ;->ۧۧ:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 413
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final ᩺()Landroid/os/Parcelable;
    .locals 2

    .line 420
    invoke-super {p0}, Ll/֫᩸ۧ;->᩺()Landroid/os/Parcelable;

    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 421
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 427
    :cond_0
    new-instance v0, Ll/ۘ᩹ۧ;

    invoke-direct {v0}, Ll/ۘ᩹ۧ;-><init>()V

    .line 428
    iget v1, p0, Ll/ᩴ᩹ۧ;->֫ۧ:I

    iput v1, v0, Ll/ۘ᩹ۧ;->᩶:I

    .line 429
    iget v1, p0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    iput v1, v0, Ll/ۘ᩹ۧ;->᩹:I

    .line 430
    iget v1, p0, Ll/ᩴ᩹ۧ;->ۤ֫:I

    iput v1, v0, Ll/ۘ᩹ۧ;->᩸:I

    return-object v0
.end method
