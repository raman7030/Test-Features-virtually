.class public Ll/ۜ۬᩷;
.super Ll/ۘۙ᩷;
.source "49SX"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    .line 41
    new-instance p1, Ll/᩹ۧۢ;

    const/4 v0, 0x3

    invoke-direct {p1, v0, p0}, Ll/᩹ۧۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    new-instance p1, Ll/᩹ۧۢ;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p0}, Ll/᩹ۧۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    new-instance p1, Ll/᩹ۧۢ;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p0}, Ll/᩹ۧۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 41
    new-instance p1, Ll/᩹ۧۢ;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p0}, Ll/᩹ۧۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/CharSequence;ILl/ۛۢᩴ;)V
    .locals 6

    .line 60
    new-instance v0, Ll/ܺۡ;

    const/4 v1, 0x0

    .line 41
    invoke-direct {v0, p0, v1}, Ll/ܺۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v2, 0x19

    .line 61
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 62
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-static {v4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v4

    add-int/2addr v4, v3

    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    .line 62
    invoke-virtual {v0, v2, v4, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    add-int/lit8 p2, p2, -0x5

    .line 64
    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 66
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " ("

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 68
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 68
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v2

    add-int/lit8 v2, v2, 0x5

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "s)"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 69
    invoke-virtual {p0, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p2, 0x7f120189

    .line 70
    invoke-virtual {p0, p2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 71
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p0

    .line 73
    new-instance p2, Ll/᩻۬᩷;

    invoke-direct {p2, p0, p1, p3}, Ll/᩻۬᩷;-><init>(Ll/֡ۚۢ;Ljava/lang/String;Ll/ۛۢᩴ;)V

    invoke-virtual {v0, p2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۜ۬᩷;I)V
    .locals 2

    .line 52
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 53
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    .line 54
    invoke-static {}, Ll/ۘۘܳ;->֫()V

    .line 55
    invoke-static {}, Ll/ᩳۜ᩻;->ܽ()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 4

    .line 51
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object v0

    .line 46
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xa

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 51
    new-instance v2, Ll/ܳ۬᩷;

    invoke-direct {v2, p0}, Ll/ܳ۬᩷;-><init>(Ll/ۜ۬᩷;)V

    invoke-static {p1, v0, v1, v2}, Ll/ۜ۬᩷;->֫(Ll/ۗܺ᩷;Ljava/lang/CharSequence;ILl/ۛۢᩴ;)V

    return-void
.end method
