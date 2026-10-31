.class public final Ll/᩸ۙۘ;
.super Ll/᩻᩶ۘ;
.source "T91K"


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩸ۙۘ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ۙۘ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙۘ;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static ֫(Ll/ۗ᩶ۘ;Ljava/lang/String;Ljava/lang/String;Ll/ۨ֡֡;)V
    .locals 4

    .line 361
    invoke-interface {p0, p3}, Ll/ۗ᩶ۘ;->ᩳ(Ll/֡ۚ֡;)V

    .line 363
    invoke-interface {p0}, Ll/ۗ᩶ۘ;->length()I

    move-result v0

    .line 365
    invoke-interface {p0}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object v1

    const/16 v2, 0xa0

    .line 366
    invoke-virtual {v1, v2}, Ll/ᩳۙۘ;->append(C)V

    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Ll/ᩳۙۘ;->append(C)V

    .line 367
    invoke-interface {p0}, Ll/ۗ᩶ۘ;->ܽ()Ll/ᩴ᩶ۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ᩴ᩶ۘ;->ܳ()Ll/֡ܰ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, p2}, Ll/ᩳۙۘ;->append(Ljava/lang/CharSequence;)V

    .line 369
    invoke-interface {p0}, Ll/ۗ᩶ۘ;->ܿ()V

    .line 371
    invoke-interface {p0}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object p2

    invoke-virtual {p2, v2}, Ll/ᩳۙۘ;->append(C)V

    .line 374
    sget-object p2, Ll/ۙۙۘ;->ۧ:Ll/ۨ᩶ۘ;

    invoke-interface {p0}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v1

    invoke-virtual {p2, v1, p1}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 376
    invoke-interface {p0, p3, v0}, Ll/ۗ᩶ۘ;->֫(Ll/֡ۚ֡;I)V

    .line 378
    invoke-interface {p0, p3}, Ll/ۗ᩶ۘ;->ܿ(Ll/֡ۚ֡;)V

    return-void
.end method

.method public static ۧ()Ll/᩸ۙۘ;
    .locals 1

    .line 95
    new-instance v0, Ll/᩸ۙۘ;

    invoke-direct {v0}, Ll/᩸ۙۘ;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 130
    iput-boolean v0, p0, Ll/᩸ۙۘ;->֫:Z

    return-void
.end method

.method public final ֫(Landroid/widget/TextView;)V
    .locals 1

    .line 205
    iget-boolean v0, p0, Ll/᩸ۙۘ;->֫:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object v0

    if-nez v0, :cond_0

    .line 206
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V
    .locals 5

    .line 189
    invoke-static {p1, p2}, Ll/ۖۗۘ;->֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V

    .line 37
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ll/᩵ۗۘ;

    const/4 v2, 0x0

    invoke-interface {p2, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩵ۗۘ;

    if-eqz v0, :cond_0

    .line 39
    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 40
    invoke-interface {p2, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 44
    :cond_0
    new-instance v0, Ll/᩵ۗۘ;

    invoke-direct {v0, p1}, Ll/᩵ۗۘ;-><init>(Landroid/widget/TextView;)V

    .line 49
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/16 v1, 0x12

    .line 46
    invoke-interface {p2, v0, v2, p1, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public final ֫(Ll/֨᩶ۘ;)V
    .locals 3

    .line 172
    new-instance v0, Ll/ۛۙۘ;

    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 174
    new-instance v1, Ll/ۧۗۘ;

    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 175
    const-class v2, Ll/ۗۚ֡;

    invoke-interface {p1, v2, v1}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    new-instance v1, Ll/᩺ۙۘ;

    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 176
    const-class v2, Ll/ܿۚ֡;

    invoke-interface {p1, v2, v1}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    new-instance v1, Ll/ۤۙۘ;

    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 177
    const-class v2, Ll/᩺֡֡;

    invoke-interface {p1, v2, v1}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    new-instance v1, Ll/ۨۙۘ;

    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 178
    const-class v2, Ll/۟֡֡;

    invoke-interface {p1, v2, v1}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    const-class v1, Ll/ܳۚ֡;

    .line 179
    invoke-interface {p1, v1, v0}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    const-class v1, Ll/ܺۚ֡;

    .line 180
    invoke-interface {p1, v1, v0}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    new-instance v0, Ll/֫ۗۘ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 181
    const-class v1, Ll/᩵ۚ֡;

    invoke-interface {p1, v1, v0}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    new-instance v0, Ll/ܰۙۘ;

    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 182
    const-class v1, Ll/ۜۚ֡;

    invoke-interface {p1, v1, v0}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    new-instance v0, Ll/۟ۙۘ;

    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 183
    const-class v1, Ll/ۖۚ֡;

    invoke-interface {p1, v1, v0}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    new-instance v0, Ll/ܽۗۘ;

    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 184
    const-class v1, Ll/۫ۚ֡;

    invoke-interface {p1, v1, v0}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    return-void
.end method

.method public final ֫(Ll/᩶᩶ۘ;)V
    .locals 2

    .line 211
    new-instance v0, Ll/ۡۙۘ;

    invoke-direct {v0, p0}, Ll/ۡۙۘ;-><init>(Ll/᩸ۙۘ;)V

    const-class v1, Ll/۬ۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 232
    new-instance v0, Ll/ܺۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/ۗۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 243
    new-instance v0, Ll/ۖۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/ܿۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 254
    new-instance v0, Ll/ۘۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/᩺֡֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 271
    new-instance v0, Ll/ᩴۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/۟֡֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 290
    new-instance v0, Ll/᩵ۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/ܳۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 299
    new-instance v0, Ll/֡ۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/ܺۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 311
    new-instance v0, Ll/ۚۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/ۡۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 382
    new-instance v0, Ll/۫ۙۘ;

    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 382
    const-class v1, Ll/ܰ֡֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 386
    new-instance v0, Ll/۫ۙۘ;

    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 386
    const-class v1, Ll/ܶۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 390
    new-instance v0, Ll/۠ۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/᩵ۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 434
    new-instance v0, Ll/ܿۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/۫ۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 453
    new-instance v0, Ll/ܳۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/ۜۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 472
    new-instance v0, Ll/᩻ۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/᩹ۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 481
    new-instance v0, Ll/ۜۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/᩻ۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 490
    new-instance v0, Ll/᩷ۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/᩸ۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 528
    new-instance v0, Ll/ۢۙۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/ۖۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    return-void
.end method
