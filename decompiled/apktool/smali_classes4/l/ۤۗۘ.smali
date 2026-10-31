.class public final Ll/ۤۗۘ;
.super Ll/᩻᩶ۘ;
.source "690O"


# instance fields
.field public final ֫:Ll/۫ۗۘ;


# direct methods
.method public constructor <init>(Ll/ۜ۬ۘ;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ll/۫ۗۘ;

    invoke-direct {v0, p1}, Ll/۫ۗۘ;-><init>(Ll/ۜ۬ۘ;)V

    iput-object v0, p0, Ll/ۤۗۘ;->֫:Ll/۫ۗۘ;

    return-void
.end method

.method public static ֫(Ll/᩶۫᩷;)Ll/ۤۗۘ;
    .locals 2

    .line 55
    new-instance p0, Ll/᩻۬ۘ;

    invoke-direct {p0}, Ll/᩻۬ۘ;-><init>()V

    .line 332
    sget v0, Ll/᩹֡᩷;->ܳ:I

    invoke-virtual {p0, v0}, Ll/᩻۬ۘ;->֫(I)V

    .line 333
    invoke-virtual {p0}, Ll/᩻۬ۘ;->֫()V

    const/high16 v0, 0x40800000    # 4.0f

    .line 334
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩻۬ۘ;->ۧ(I)V

    .line 335
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, -0xdfdfe0

    .line 336
    invoke-virtual {p0, v0}, Ll/᩻۬ۘ;->ᩳ(I)V

    const v1, -0xefeff0

    .line 337
    invoke-virtual {p0, v1}, Ll/᩻۬ۘ;->ܽ(I)V

    .line 338
    invoke-virtual {p0, v0}, Ll/᩻۬ۘ;->ܿ(I)V

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    .line 340
    invoke-virtual {p0, v0}, Ll/᩻۬ۘ;->ᩳ(I)V

    const v1, -0x90706

    .line 341
    invoke-virtual {p0, v1}, Ll/᩻۬ۘ;->ܽ(I)V

    .line 342
    invoke-virtual {p0, v0}, Ll/᩻۬ۘ;->ܿ(I)V

    .line 57
    :goto_0
    new-instance v0, Ll/ۤۗۘ;

    .line 184
    new-instance v1, Ll/ۜ۬ۘ;

    invoke-direct {v1, p0}, Ll/ۜ۬ۘ;-><init>(Ll/᩻۬ۘ;)V

    .line 57
    invoke-direct {v0, v1}, Ll/ۤۗۘ;-><init>(Ll/ۜ۬ۘ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;)V
    .locals 4

    .line 77
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 78
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    instance-of v1, v0, Landroid/text/Spanned;

    if-eqz v1, :cond_0

    .line 79
    move-object v1, v0

    check-cast v1, Landroid/text/Spanned;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v3, Ll/֫۬ۘ;

    invoke-interface {v1, v2, v0, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 17
    array-length v1, v0

    if-lez v1, :cond_2

    const v1, 0x7f0a02fb

    .line 20
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    .line 21
    new-instance v3, Ll/ۧ۬ۘ;

    invoke-direct {v3, p1}, Ll/ۧ۬ۘ;-><init>(Landroid/widget/TextView;)V

    .line 34
    invoke-virtual {p1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 35
    invoke-virtual {p1, v1, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 38
    :cond_1
    new-instance v1, Ll/ᩳ۬ۘ;

    invoke-direct {v1, p1}, Ll/ᩳ۬ۘ;-><init>(Landroid/widget/TextView;)V

    .line 58
    array-length p1, v0

    :goto_1
    if-ge v2, p1, :cond_2

    aget-object v3, v0, v2

    .line 59
    check-cast v3, Ll/֫۬ۘ;

    invoke-virtual {v3, v1}, Ll/֫۬ۘ;->֫(Ll/۟ۗۘ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V
    .locals 0

    .line 92
    invoke-static {p1}, Ll/ܿ۬ۘ;->֫(Landroid/widget/TextView;)V

    return-void
.end method

.method public final ֫(Ll/ܰۚ֡;)V
    .locals 1

    .line 106
    new-instance v0, Ll/ۗᩴ֡;

    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 76
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܰۚ֡;->֫(Ljava/lang/Iterable;)V

    return-void
.end method

.method public final ֫(Ll/᩶᩶ۘ;)V
    .locals 3

    .line 119
    new-instance v0, Ll/۬ۗۘ;

    .line 121
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/֨ᩴ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    new-instance v0, Ll/ۗۗۘ;

    iget-object v1, p0, Ll/ۤۗۘ;->֫:Ll/۫ۗۘ;

    invoke-direct {v0, v1}, Ll/ۗۗۘ;-><init>(Ll/۫ۗۘ;)V

    .line 137
    const-class v2, Ll/۠ᩴ֡;

    invoke-interface {p1, v2, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    new-instance v0, Ll/ۙۗۘ;

    invoke-direct {v0, v1}, Ll/ۙۗۘ;-><init>(Ll/۫ۗۘ;)V

    .line 144
    const-class v2, Ll/᩶ᩴ֡;

    invoke-interface {p1, v2, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    new-instance v0, Ll/᩶ۗۘ;

    invoke-direct {v0, v1}, Ll/᩶ۗۘ;-><init>(Ll/۫ۗۘ;)V

    .line 150
    const-class v2, Ll/᩹ᩴ֡;

    invoke-interface {p1, v2, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    new-instance v0, Ll/᩹ۗۘ;

    invoke-direct {v0, v1}, Ll/᩹ۗۘ;-><init>(Ll/۫ۗۘ;)V

    .line 156
    const-class v1, Ll/᩸ᩴ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    return-void
.end method

.method public final ۧ(Landroid/widget/TextView;)V
    .locals 0

    .line 87
    iget-object p1, p0, Ll/ۤۗۘ;->֫:Ll/۫ۗۘ;

    invoke-virtual {p1}, Ll/۫ۗۘ;->֫()V

    return-void
.end method
