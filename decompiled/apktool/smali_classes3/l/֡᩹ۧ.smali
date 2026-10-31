.class public Ll/֡᩹ۧ;
.super Ll/᩸᩹ۧ;
.source "K5ZR"


# instance fields
.field public ֫ۧ:Ljava/lang/String;

.field public ۟֫:Ljava/lang/String;

.field public final ܰ֫:Ll/᩵᩹ۧ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const v0, 0x7f040488

    const v1, 0x101036d

    .line 114
    invoke-static {p1, v0, v1}, Ll/ۗۗ;->֫(Landroid/content/Context;II)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Ll/֡᩹ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/4 v0, 0x0

    .line 67
    invoke-direct {p0, p1, p2, p3, v0}, Ll/᩸᩹ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 47
    new-instance v1, Ll/᩵᩹ۧ;

    invoke-direct {v1, p0}, Ll/᩵᩹ۧ;-><init>(Ll/֡᩹ۧ;)V

    iput-object v1, p0, Ll/֡᩹ۧ;->ܰ֫:Ll/᩵᩹ۧ;

    .line 69
    sget-object v1, Ll/ۢ᩹ۧ;->ۖ:[I

    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x7

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    .line 311
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 72
    :cond_0
    invoke-virtual {p0, p2}, Ll/᩸᩹ۧ;->ᩳ(Ljava/lang/String;)V

    const/4 p2, 0x6

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p2, 0x1

    .line 311
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 75
    :cond_1
    invoke-virtual {p0, p2}, Ll/᩸᩹ۧ;->ܽ(Ljava/lang/String;)V

    const/16 p2, 0x9

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    const/4 p2, 0x3

    .line 311
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 143
    :cond_2
    iput-object p2, p0, Ll/֡᩹ۧ;->֫ۧ:Ljava/lang/String;

    .line 144
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    const/16 p2, 0x8

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_3

    const/4 p2, 0x4

    .line 311
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 154
    :cond_3
    iput-object p2, p0, Ll/֡᩹ۧ;->۟֫:Ljava/lang/String;

    .line 155
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    const/4 p2, 0x2

    .line 263
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    const/4 p3, 0x5

    .line 264
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 86
    invoke-virtual {p0, p2}, Ll/᩸᩹ۧ;->ۜ(Z)V

    .line 90
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private ܽ(Landroid/view/View;)V
    .locals 3

    .line 220
    instance-of v0, p1, Landroid/widget/Switch;

    if-eqz v0, :cond_0

    .line 221
    move-object v1, p1

    check-cast v1, Landroid/widget/Switch;

    const/4 v2, 0x0

    .line 222
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 224
    :cond_0
    instance-of v1, p1, Landroid/widget/Checkable;

    if-eqz v1, :cond_1

    .line 225
    move-object v1, p1

    check-cast v1, Landroid/widget/Checkable;

    iget-boolean v2, p0, Ll/᩸᩹ۧ;->۫֫:Z

    invoke-interface {v1, v2}, Landroid/widget/Checkable;->setChecked(Z)V

    :cond_1
    if-eqz v0, :cond_2

    .line 228
    check-cast p1, Landroid/widget/Switch;

    .line 229
    iget-object v0, p0, Ll/֡᩹ۧ;->֫ۧ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/Switch;->setTextOn(Ljava/lang/CharSequence;)V

    .line 230
    iget-object v0, p0, Ll/֡᩹ۧ;->۟֫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/Switch;->setTextOff(Ljava/lang/CharSequence;)V

    .line 231
    iget-object v0, p0, Ll/֡᩹ۧ;->ܰ֫:Ll/᩵᩹ۧ;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View;)V
    .locals 2

    .line 201
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Landroid/view/View;)V

    .line 207
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 208
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v0, 0x1020040

    .line 212
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 213
    invoke-direct {p0, v0}, Ll/֡᩹ۧ;->ܽ(Landroid/view/View;)V

    const v0, 0x1020010

    .line 215
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 216
    invoke-virtual {p0, p1}, Ll/᩸᩹ۧ;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Ll/᩷᩹ۧ;)V
    .locals 1

    .line 130
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/᩷᩹ۧ;)V

    const v0, 0x1020040

    .line 131
    invoke-virtual {p1, v0}, Ll/᩷᩹ۧ;->ۧ(I)Landroid/view/View;

    move-result-object v0

    .line 132
    invoke-direct {p0, v0}, Ll/֡᩹ۧ;->ܽ(Landroid/view/View;)V

    const v0, 0x1020010

    .line 217
    invoke-virtual {p1, v0}, Ll/᩷᩹ۧ;->ۧ(I)Landroid/view/View;

    move-result-object p1

    .line 218
    invoke-virtual {p0, p1}, Ll/᩸᩹ۧ;->ۧ(Landroid/view/View;)V

    return-void
.end method
