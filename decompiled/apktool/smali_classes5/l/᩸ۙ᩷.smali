.class public Ll/᩸ۙ᩷;
.super Ll/ۘۙ᩷;
.source "N9TB"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    .line 41
    new-instance p1, Ll/ۜۛۡ;

    invoke-direct {p1, p0}, Ll/ۜۛۡ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    new-instance p1, Ll/ۜۛۡ;

    invoke-direct {p1, p0}, Ll/ۜۛۡ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    new-instance p1, Ll/ۜۛۡ;

    invoke-direct {p1, p0}, Ll/ۜۛۡ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 41
    new-instance p1, Ll/ۜۛۡ;

    invoke-direct {p1, p0}, Ll/ۜۛۡ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/CharSequence;Ljava/lang/String;Ll/۬ۤ;)V
    .locals 6

    const v0, 0x7f0d00b3

    .line 63
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a017a

    .line 64
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    const v2, 0x7f0a0551

    .line 65
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    .line 66
    new-instance v3, Ll/᩶ۡۡ;

    const-string v4, "MB"

    const-string v5, "KB"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 67
    invoke-virtual {p2, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    .line 68
    invoke-virtual {v2, v3}, Landroid/widget/AdapterView;->setSelection(I)V

    :cond_0
    const/4 v3, 0x0

    .line 71
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x2

    invoke-virtual {p2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p2, "10"

    .line 73
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    invoke-virtual {v2, v3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 76
    :goto_0
    invoke-virtual {v1}, Landroid/widget/EditText;->selectAll()V

    .line 77
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    .line 78
    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 79
    invoke-virtual {p0, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance p1, Ll/֫ۡܳ;

    const/4 p2, 0x1

    invoke-direct {p1, v1, v2, p3, p2}, Ll/֫ۡܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p2, 0x7f12070a

    .line 80
    invoke-virtual {p0, p2, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 p2, 0x0

    .line 89
    invoke-virtual {p0, p1, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 90
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    .line 91
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸ۙ᩷;Ljava/lang/String;)V
    .locals 2

    .line 52
    :try_start_0
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 53
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    .line 54
    invoke-static {}, Ll/ᩳۜ᩻;->ܽ()V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 4

    .line 50
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object v0

    .line 45
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "10MB"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 50
    new-instance v2, Ll/ۨ᩻֫;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0}, Ll/ۨ᩻֫;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v0, v1, v2}, Ll/᩸ۙ᩷;->֫(Ll/ۗܺ᩷;Ljava/lang/CharSequence;Ljava/lang/String;Ll/۬ۤ;)V

    return-void
.end method
