.class public Ll/ܶۙ᩷;
.super Ll/ۘۙ᩷;
.source "657B"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# static fields
.field public static ۫֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    invoke-static {}, Ll/ܶۙ᩷;->ܺ֫()[I

    move-result-object v0

    sput-object v0, Ll/ܶۙ᩷;->۫֫:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static ۖ֫()V
    .locals 1

    .line 38
    invoke-static {}, Ll/ܶۙ᩷;->ܺ֫()[I

    move-result-object v0

    sput-object v0, Ll/ܶۙ᩷;->۫֫:[I

    return-void
.end method

.method public static ۡ֫()[I
    .locals 1

    .line 34
    sget-object v0, Ll/ܶۙ᩷;->۫֫:[I

    return-object v0
.end method

.method public static bridge synthetic ۢ֫()[I
    .locals 1

    .line 0
    sget-object v0, Ll/ܶۙ᩷;->۫֫:[I

    return-object v0
.end method

.method public static ܺ֫()[I
    .locals 7

    .line 42
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "file_menu_sort"

    invoke-interface {v0, v1}, Ll/۫ۤۡ;->֫(Ljava/lang/String;)[I

    move-result-object v0

    if-eqz v0, :cond_3

    .line 43
    array-length v1, v0

    const/16 v2, 0xa

    if-ne v1, v2, :cond_3

    new-array v1, v2, [Z

    .line 46
    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget v5, v0, v4

    if-ltz v5, :cond_3

    if-lt v5, v2, :cond_0

    goto :goto_1

    .line 51
    :cond_0
    aget-boolean v6, v1, v5

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x1

    .line 55
    aput-boolean v6, v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-object v0

    .line 63
    :cond_3
    :goto_1
    sget-object v0, Ll/ܽ᩷ܳ;->ۚ:[I

    return-object v0
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 143
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "file_menu_sort"

    sget-object v1, Ll/ܶۙ᩷;->۫֫:[I

    invoke-interface {p1, v0, v1}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[I)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 4

    const v0, 0x7f0d00ab

    .line 84
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0486

    .line 85
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/۬۬ۧ;

    .line 86
    new-instance v2, Ll/֨ۙ᩷;

    .line 168
    invoke-direct {v2}, Ll/᩶ۗۧ;-><init>()V

    .line 86
    invoke-virtual {v1, v2}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 88
    new-instance v2, Ll/᩸ۙۧ;

    const/4 v3, 0x2

    invoke-direct {v2, p1, v3}, Ll/᩸ۙۧ;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v2}, Ll/۬۬ۧ;->setLayoutManager(Ll/ܿ۬ۧ;)V

    .line 91
    new-instance p1, Ll/֫ۗۧ;

    new-instance v2, Ll/ۚۙ᩷;

    .line 2246
    invoke-direct {v2}, Ll/ۤۙۧ;-><init>()V

    .line 91
    invoke-direct {p1, v2}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    .line 130
    invoke-virtual {p1, v1}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    .line 131
    invoke-virtual {v1}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object p1

    const-wide/16 v2, 0xc8

    invoke-virtual {p1, v2, v3}, Ll/᩺ۗۧ;->֫(J)V

    .line 132
    invoke-virtual {v1}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Ll/᩺ۗۧ;->ᩳ(J)V

    .line 133
    invoke-virtual {v1}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Ll/᩺ۗۧ;->ܽ(J)V

    .line 134
    invoke-virtual {v1}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Ll/᩺ۗۧ;->ۧ(J)V

    .line 136
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object p1

    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 137
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    invoke-virtual {v1, p0}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 138
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
