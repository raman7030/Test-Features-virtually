.class public final Ll/ۘۜۡ;
.super Ll/ۗ۬ۧ;
.source "T8WR"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ۗ:Landroid/widget/TextView;

.field public final ۙ:Ll/ܺ᩶ۘ;

.field public ᩶:Ll/ۖۜۡ;

.field public final ᩸:Ll/ۗܺ᩷;

.field public ᩹:[Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ܺ᩶ۘ;Landroid/view/View;)V
    .locals 3

    .line 23
    invoke-direct {p0, p3}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const/4 v0, 0x4

    new-array v0, v0, [Landroid/widget/TextView;

    .line 20
    iput-object v0, p0, Ll/ۘۜۡ;->᩹:[Landroid/widget/TextView;

    .line 24
    iput-object p1, p0, Ll/ۘۜۡ;->᩸:Ll/ۗܺ᩷;

    .line 25
    iput-object p2, p0, Ll/ۘۜۡ;->ۙ:Ll/ܺ᩶ۘ;

    const p1, 0x7f0a05be

    .line 26
    invoke-virtual {p3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۘۜۡ;->ۗ:Landroid/widget/TextView;

    const p1, 0x7f0a00a3

    .line 27
    invoke-virtual {p3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 p2, 0x0

    aput-object p1, v0, p2

    const p1, 0x7f0a00a4

    .line 28
    invoke-virtual {p3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const p1, 0x7f0a00a5

    .line 29
    invoke-virtual {p3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 v2, 0x2

    aput-object p1, v0, v2

    const p1, 0x7f0a00a6

    .line 30
    invoke-virtual {p3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 p3, 0x3

    aput-object p1, v0, p3

    .line 31
    aget-object p1, v0, p2

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    aget-object p1, v0, v1

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    aget-object p1, v0, v2

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    aget-object p1, v0, p3

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۘۜۡ;Ll/ۖۜۡ;)V
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۘۜۡ;->ۗ:Landroid/widget/TextView;

    iget-object p0, p0, Ll/ۘۜۡ;->᩶:Ll/ۖۜۡ;

    if-ne p0, p1, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->isTextSelectable()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    .line 61
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 68
    iget-object v0, p0, Ll/ۘۜۡ;->᩶:Ll/ۖۜۡ;

    invoke-virtual {v0}, Ll/ۖۜۡ;->֫()I

    move-result v0

    iget-object v1, p0, Ll/ۘۜۡ;->᩹:[Landroid/widget/TextView;

    array-length v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 70
    aget-object v3, v1, v2

    if-ne p1, v3, :cond_0

    .line 71
    iget-object v3, p0, Ll/ۘۜۡ;->᩶:Ll/ۖۜۡ;

    invoke-virtual {v3, v2}, Ll/ۖۜۡ;->֫(I)Ll/ܺۜۡ;

    move-result-object v3

    iget-object v4, p0, Ll/ۘۜۡ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v3, v4}, Ll/ܺۜۡ;->֫(Ll/ۗܺ᩷;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۖۜۡ;)V
    .locals 8

    .line 38
    iput-object p1, p0, Ll/ۘۜۡ;->᩶:Ll/ۖۜۡ;

    .line 39
    invoke-virtual {p1}, Ll/ۖۜۡ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۘۜۡ;->ۙ:Ll/ܺ᩶ۘ;

    iget-object v2, p0, Ll/ۘۜۡ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Ll/ܺ᩶ۘ;->֫(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Ll/ۖۜۡ;->֫()I

    move-result v0

    .line 41
    iget-object v1, p0, Ll/ۘۜۡ;->᩹:[Landroid/widget/TextView;

    array-length v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    .line 43
    aget-object v6, v1, v5

    if-ge v5, v0, :cond_1

    .line 45
    invoke-virtual {v6, v4}, Landroid/view/View;->setVisibility(I)V

    .line 46
    invoke-virtual {p1, v5}, Ll/ۖۜۡ;->ۧ(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    invoke-virtual {p1, v5}, Ll/ۖۜۡ;->֫(I)Ll/ܺۜۡ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܺۜۡ;->֫()I

    move-result v7

    if-eqz v7, :cond_0

    .line 48
    sget v7, Ll/᩹֡᩷;->֫:I

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v7, 0x1

    .line 49
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_1

    .line 51
    :cond_0
    sget-object v7, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 52
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_1

    :cond_1
    const/16 v7, 0x8

    .line 55
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 59
    new-instance v0, Ll/ܽۛᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Ll/ܽۛᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v1, 0xc8

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    return-void
.end method
