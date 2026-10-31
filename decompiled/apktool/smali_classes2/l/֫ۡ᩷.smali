.class public final Ll/֫ۡ᩷;
.super Ll/۟ܶۡ;
.source "R7YU"


# instance fields
.field public final synthetic ۜ:Landroid/widget/CheckBox;

.field public final synthetic ۡ:Landroid/view/View;

.field public final synthetic ۢ:Ll/ܺ᩶ۘ;

.field public final synthetic ܳ:Ll/ۜۡ᩷;

.field public final synthetic ܺ:Landroid/widget/TextView;

.field public final synthetic ᩷:Landroid/widget/CheckBox;

.field public final synthetic ᩻:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Ll/ۜۡ᩷;Ll/ܺ᩶ۘ;Landroid/widget/TextView;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/Button;Landroid/view/View;)V
    .locals 0

    .line 52
    iput-object p1, p0, Ll/֫ۡ᩷;->ܳ:Ll/ۜۡ᩷;

    iput-object p2, p0, Ll/֫ۡ᩷;->ۢ:Ll/ܺ᩶ۘ;

    iput-object p3, p0, Ll/֫ۡ᩷;->ܺ:Landroid/widget/TextView;

    iput-object p4, p0, Ll/֫ۡ᩷;->ۜ:Landroid/widget/CheckBox;

    iput-object p5, p0, Ll/֫ۡ᩷;->᩷:Landroid/widget/CheckBox;

    iput-object p6, p0, Ll/֫ۡ᩷;->᩻:Landroid/widget/Button;

    iput-object p7, p0, Ll/֫ۡ᩷;->ۡ:Landroid/view/View;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 7

    .line 70
    iget-object v0, p0, Ll/֫ۡ᩷;->ܳ:Ll/ۜۡ᩷;

    invoke-static {v0}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;

    move-result-object v1

    invoke-static {v1}, Ll/᩻ۡ᩷;->ᩳ(Ll/᩻ۡ᩷;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/֫ۡ᩷;->ۢ:Ll/ܺ᩶ۘ;

    iget-object v3, p0, Ll/֫ۡ᩷;->ܺ:Landroid/widget/TextView;

    invoke-virtual {v2, v3, v1}, Ll/ܺ᩶ۘ;->֫(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 72
    invoke-static {v0}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;

    move-result-object v1

    invoke-static {v1}, Ll/᩻ۡ᩷;->ۧ(Ll/᩻ۡ᩷;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    iget-object v2, p0, Ll/֫ۡ᩷;->ۜ:Landroid/widget/CheckBox;

    iget-object v3, p0, Ll/֫ۡ᩷;->᩷:Landroid/widget/CheckBox;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    new-array v1, v4, [Landroid/widget/CheckBox;

    aput-object v2, v1, v5

    .line 74
    invoke-static {v0}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ۡ᩷;->֫(Ll/᩻ۡ᩷;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v0, 0x8

    .line 75
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [Landroid/widget/CheckBox;

    aput-object v2, v1, v5

    aput-object v3, v1, v4

    .line 78
    invoke-static {v0}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;

    move-result-object v4

    invoke-static {v4}, Ll/᩻ۡ᩷;->֫(Ll/᩻ۡ᩷;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    invoke-static {v0}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ۡ᩷;->ۧ(Ll/᩻ۡ᩷;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    :goto_0
    new-instance v0, Ll/ܰۢ᩷;

    iget-object v2, p0, Ll/֫ۡ᩷;->᩻:Landroid/widget/Button;

    invoke-direct {v0, v1, v2}, Ll/ܰۢ᩷;-><init>([Landroid/widget/CheckBox;Landroid/widget/Button;)V

    .line 91
    array-length v3, v1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_1

    aget-object v6, v1, v4

    .line 92
    invoke-virtual {v6, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 94
    :cond_1
    new-instance v0, Ll/۟ۢ᩷;

    invoke-direct {v0, p0}, Ll/۟ۢ᩷;-><init>(Ll/֫ۡ᩷;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    iget-object v0, p0, Ll/֫ۡ᩷;->ۡ:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 100
    iget-object v0, p0, Ll/֫ۡ᩷;->ܳ:Ll/ۜۡ᩷;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 56
    iget-object v0, p0, Ll/֫ۡ᩷;->ܳ:Ll/ۜۡ᩷;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 10

    const/16 v0, 0x1074

    .line 1114
    invoke-static {v0}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v0

    .line 1115
    invoke-virtual {v0}, Ll/ᩳᩴۡ;->ᩳ()Ll/᩻ᩴۡ;

    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 65
    new-instance v1, Ll/᩻ۡ᩷;

    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ll/᩻ᩴۡ;->᩻()Z

    move-result v6

    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object v9

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Ll/᩻ۡ᩷;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ll/֫ۡ᩷;->ܳ:Ll/ۜۡ᩷;

    invoke-static {v0, v1}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;Ll/᩻ۡ᩷;)V

    return-void

    .line 63
    :cond_0
    new-instance v1, Ll/֫ۛۡ;

    const v2, 0x7f120520

    .line 232
    invoke-static {v0, v2}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 63
    throw v1
.end method

.method public final ᩳ()V
    .locals 0

    .line 105
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
