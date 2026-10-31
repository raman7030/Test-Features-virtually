.class public final Ll/ۛ᩷᩻;
.super Landroid/widget/BaseAdapter;
.source "W79N"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public ᩶:I

.field public ᩸:Ljava/util/List;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1812
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 1806
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۛ᩷᩻;->᩸:Ljava/util/List;

    .line 1813
    iput-object p1, p0, Ll/ۛ᩷᩻;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩷᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩷᩻;->᩸:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩷᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩷᩻;->᩹:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩷᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛ᩷᩻;->᩸:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۛ᩷᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩷᩻;->᩶:I

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 1818
    iget-object v0, p0, Ll/ۛ᩷᩻;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 1833
    check-cast p2, Landroid/widget/TextView;

    if-nez p2, :cond_0

    .line 1835
    new-instance p2, Ll/ܳܺ;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    const/high16 p3, 0x41700000    # 15.0f

    .line 1836
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1837
    sget-object p3, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 1838
    iget p3, p0, Ll/ۛ᩷᩻;->᩹:I

    iget v0, p0, Ll/ۛ᩷᩻;->᩶:I

    invoke-virtual {p2, p3, v0, p3, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 p3, 0x0

    const v0, 0x3f866666    # 1.05f

    .line 1839
    invoke-virtual {p2, p3, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 1841
    :cond_0
    iget-object p3, p0, Ll/ۛ᩷᩻;->᩸:Ljava/util/List;

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧۢ᩻;

    .line 1842
    new-instance p3, Landroid/text/SpannableStringBuilder;

    invoke-direct {p3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 1843
    invoke-virtual {p1}, Ll/ۧۢ᩻;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 1844
    invoke-virtual {p3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 1845
    iget-object v1, p0, Ll/ۛ᩷᩻;->ۙ:Ljava/lang/String;

    invoke-virtual {p3, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    const-string v2, "://"

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۧۢ᩻;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۧۢ᩻;->ܽ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 1846
    invoke-virtual {p3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    .line 1847
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    sget v2, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v1, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v2, 0x21

    invoke-virtual {p3, v1, v0, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1848
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v3}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result v3

    invoke-direct {v1, v3}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {p3, v1, v0, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1849
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
