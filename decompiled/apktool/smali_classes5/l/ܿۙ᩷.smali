.class public Ll/ܿۙ᩷;
.super Ll/ۘۙ᩷;
.source "T12U"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# static fields
.field public static ۫֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    invoke-static {}, Ll/ܿۙ᩷;->ܺ֫()[I

    move-result-object v0

    sput-object v0, Ll/ܿۙ᩷;->۫֫:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 94
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 90
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 86
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static ۖ֫()V
    .locals 1

    .line 38
    invoke-static {}, Ll/ܿۙ᩷;->ܺ֫()[I

    move-result-object v0

    sput-object v0, Ll/ܿۙ᩷;->۫֫:[I

    return-void
.end method

.method public static ۡ֫()[I
    .locals 1

    .line 34
    sget-object v0, Ll/ܿۙ᩷;->۫֫:[I

    return-object v0
.end method

.method public static bridge synthetic ۢ֫()[I
    .locals 1

    .line 0
    sget-object v0, Ll/ܿۙ᩷;->۫֫:[I

    return-object v0
.end method

.method public static ܺ֫()[I
    .locals 8

    .line 42
    sget-object v0, Ll/ۢ֨ܿ;->ۧ:Ljava/util/List;

    .line 43
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "built_in_method_sort"

    invoke-interface {v1, v2}, Ll/۫ۤۡ;->֫(Ljava/lang/String;)[I

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    .line 44
    array-length v3, v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-le v3, v4, :cond_0

    goto/16 :goto_5

    .line 49
    :cond_0
    array-length v3, v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 50
    new-instance v3, Ll/ܺۢᩴ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ll/ܺۢᩴ;-><init>(I)V

    .line 51
    new-instance v4, Ll/ܺۢᩴ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ll/ܺۢᩴ;-><init>(I)V

    .line 52
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۢ֨ܿ;

    .line 53
    iget v5, v5, Ll/ۢ֨ܿ;->֫:I

    invoke-virtual {v4, v5}, Ll/ܺۢᩴ;->add(I)Z

    goto :goto_0

    .line 55
    :cond_1
    array-length v0, v1

    :goto_1
    if-ge v2, v0, :cond_3

    aget v5, v1, v2

    .line 56
    invoke-virtual {v4, v5}, Ll/ܺۢᩴ;->ۖ(I)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 57
    invoke-virtual {v3, v5}, Ll/ܺۢᩴ;->add(I)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 60
    :cond_3
    invoke-virtual {v3, v4}, Ll/ۤܿᩴ;->֫(Ll/֨ۡᩴ;)Z

    .line 61
    invoke-virtual {v3}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v0

    return-object v0

    .line 63
    :cond_4
    new-instance v3, Ll/ᩴۢᩴ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ll/ᩴۢᩴ;-><init>(I)V

    .line 64
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۢ֨ܿ;

    .line 65
    iget v5, v5, Ll/ۢ֨ܿ;->֫:I

    invoke-virtual {v3, v5}, Ll/ᩴۢᩴ;->add(I)Z

    goto :goto_2

    .line 68
    :cond_5
    array-length v4, v1

    const/4 v5, 0x1

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v4, :cond_7

    aget v7, v1, v6

    .line 69
    invoke-virtual {v3, v7}, Ll/ᩴۢᩴ;->remove(I)Z

    move-result v7

    if-nez v7, :cond_6

    const/4 v5, 0x0

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_7
    if-eqz v5, :cond_8

    .line 74
    invoke-virtual {v3}, Ll/ᩴۢᩴ;->isEmpty()Z

    move-result v5

    :cond_8
    if-nez v5, :cond_9

    .line 77
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    .line 78
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢ֨ܿ;

    iget v3, v3, Ll/ۢ֨ܿ;->֫:I

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_9
    return-object v1

    .line 45
    :cond_a
    :goto_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [I

    .line 46
    :goto_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    .line 47
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢ֨ܿ;

    iget v3, v3, Ll/ۢ֨ܿ;->֫:I

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_b
    return-object v1
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 148
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "built_in_method_sort"

    sget-object v1, Ll/ܿۙ᩷;->۫֫:[I

    invoke-interface {p1, v0, v1}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[I)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 4

    const v0, 0x7f0d00ab

    .line 103
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 104
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f120150

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a0486

    .line 105
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/۬۬ۧ;

    .line 106
    new-instance v2, Ll/ܽۙ᩷;

    .line 163
    invoke-direct {v2}, Ll/᩶ۗۧ;-><init>()V

    .line 106
    invoke-virtual {v1, v2}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 108
    new-instance v2, Ll/᩸ۙۧ;

    const/4 v3, 0x3

    invoke-direct {v2, p1, v3}, Ll/᩸ۙۧ;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v2}, Ll/۬۬ۧ;->setLayoutManager(Ll/ܿ۬ۧ;)V

    .line 111
    new-instance p1, Ll/֫ۗۧ;

    new-instance v2, Ll/ۧۙ᩷;

    .line 2246
    invoke-direct {v2}, Ll/ۤۙۧ;-><init>()V

    .line 111
    invoke-direct {p1, v2}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    .line 135
    invoke-virtual {p1, v1}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    .line 136
    invoke-virtual {v1}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object p1

    const-wide/16 v2, 0xc8

    invoke-virtual {p1, v2, v3}, Ll/᩺ۗۧ;->֫(J)V

    .line 137
    invoke-virtual {v1}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Ll/᩺ۗۧ;->ᩳ(J)V

    .line 138
    invoke-virtual {v1}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Ll/᩺ۗۧ;->ܽ(J)V

    .line 139
    invoke-virtual {v1}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Ll/᩺ۗۧ;->ۧ(J)V

    .line 141
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object p1

    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 142
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    invoke-virtual {v1, p0}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 143
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
