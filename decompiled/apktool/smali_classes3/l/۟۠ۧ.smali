.class public Ll/۟۠ۧ;
.super Ll/᩸᩹ۧ;
.source "05VZ"


# instance fields
.field public final ܰ֫:Ll/ܰ۠ۧ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const v0, 0x7f0400b2

    const v1, 0x101008f

    .line 71
    invoke-static {p1, v0, v1}, Ll/ۗۗ;->֫(Landroid/content/Context;II)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Ll/۟۠ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, p2, p3, v0}, Ll/᩸᩹ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 44
    new-instance v1, Ll/ܰ۠ۧ;

    invoke-direct {v1, p0}, Ll/ܰ۠ۧ;-><init>(Ll/۟۠ۧ;)V

    iput-object v1, p0, Ll/۟۠ۧ;->ܰ֫:Ll/ܰ۠ۧ;

    .line 55
    sget-object v1, Ll/ۢ᩹ۧ;->ۧ:[I

    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x5

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    .line 311
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 58
    :cond_0
    invoke-virtual {p0, p2}, Ll/᩸᩹ۧ;->ᩳ(Ljava/lang/String;)V

    const/4 p2, 0x4

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p2, 0x1

    .line 311
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 61
    :cond_1
    invoke-virtual {p0, p2}, Ll/᩸᩹ۧ;->ܽ(Ljava/lang/String;)V

    const/4 p2, 0x2

    .line 263
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    const/4 p3, 0x3

    .line 264
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 64
    invoke-virtual {p0, p2}, Ll/᩸᩹ۧ;->ۜ(Z)V

    .line 68
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private ܽ(Landroid/view/View;)V
    .locals 3

    .line 113
    instance-of v0, p1, Landroid/widget/CompoundButton;

    if-eqz v0, :cond_0

    .line 114
    move-object v1, p1

    check-cast v1, Landroid/widget/CompoundButton;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 116
    :cond_0
    instance-of v1, p1, Landroid/widget/Checkable;

    if-eqz v1, :cond_1

    .line 117
    move-object v1, p1

    check-cast v1, Landroid/widget/Checkable;

    iget-boolean v2, p0, Ll/᩸᩹ۧ;->۫֫:Z

    invoke-interface {v1, v2}, Landroid/widget/Checkable;->setChecked(Z)V

    :cond_1
    if-eqz v0, :cond_2

    .line 120
    check-cast p1, Landroid/widget/CompoundButton;

    iget-object v0, p0, Ll/۟۠ۧ;->ܰ֫:Ll/ܰ۠ۧ;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View;)V
    .locals 2

    .line 94
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Landroid/view/View;)V

    .line 100
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 101
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v0, 0x1020001

    .line 105
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 106
    invoke-direct {p0, v0}, Ll/۟۠ۧ;->ܽ(Landroid/view/View;)V

    const v0, 0x1020010

    .line 108
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 109
    invoke-virtual {p0, p1}, Ll/᩸᩹ۧ;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Ll/᩷᩹ۧ;)V
    .locals 1

    .line 81
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/᩷᩹ۧ;)V

    const v0, 0x1020001

    .line 83
    invoke-virtual {p1, v0}, Ll/᩷᩹ۧ;->ۧ(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/۟۠ۧ;->ܽ(Landroid/view/View;)V

    const v0, 0x1020010

    .line 217
    invoke-virtual {p1, v0}, Ll/᩷᩹ۧ;->ۧ(I)Landroid/view/View;

    move-result-object p1

    .line 218
    invoke-virtual {p0, p1}, Ll/᩸᩹ۧ;->ۧ(Landroid/view/View;)V

    return-void
.end method
