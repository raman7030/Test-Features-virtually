.class public Ll/ۜۙ᩷;
.super Ll/ۘۙ᩷;
.source "P7JT"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 6

    const v0, 0x7f0d01e8

    .line 41
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a04f3

    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    const/16 v2, 0x8

    .line 43
    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    const v2, 0x7f0a05e2

    .line 44
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 46
    new-instance v3, Ll/᩻ۙ᩷;

    invoke-direct {v3, p0, v2}, Ll/᩻ۙ᩷;-><init>(Ll/ۜۙ᩷;Landroid/widget/TextView;)V

    invoke-virtual {v1, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 64
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x3

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    add-int/lit8 v4, v3, -0x2

    .line 65
    invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 66
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 69
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 70
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 71
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 72
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public final ۤ()V
    .locals 3

    .line 34
    invoke-super {p0}, Ll/֫᩸ۧ;->ۤ()V

    .line 35
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 36
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
