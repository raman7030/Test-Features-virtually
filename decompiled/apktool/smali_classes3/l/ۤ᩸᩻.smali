.class public final Ll/ۤ᩸᩻;
.super Ljava/lang/Object;
.source "X977"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ᩶:Ll/ܽۢܳ;

.field public final ᩸:[Landroid/widget/RadioButton;

.field public final ᩹:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ܽۢܳ;)V
    .locals 6

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Landroid/widget/RadioButton;

    .line 21
    iput-object v0, p0, Ll/ۤ᩸᩻;->᩸:[Landroid/widget/RadioButton;

    .line 25
    iput-object p2, p0, Ll/ۤ᩸᩻;->᩶:Ll/ܽۢܳ;

    const p2, 0x7f0d00f9

    .line 27
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p2

    const v1, 0x7f0a047e

    .line 28
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, 0x7f0a047d

    .line 29
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const v1, 0x7f0a047f

    .line 30
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const v1, 0x7f0a0480

    .line 31
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    const/4 v5, 0x3

    aput-object v1, v0, v5

    .line 33
    aget-object v1, v0, v2

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    aget-object v1, v0, v3

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    aget-object v1, v0, v4

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    aget-object v1, v0, v5

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0a0540

    .line 37
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/ۤ᩸᩻;->᩹:Landroid/widget/CheckBox;

    const v2, 0x7f0a053f

    .line 38
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 40
    sget v2, Ll/᩶ۖ᩷;->ۢ:I

    invoke-static {v2}, Ll/۟۬ܳ;->֫(I)I

    move-result v2

    aget-object v0, v0, v2

    invoke-virtual {v0, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 41
    sget v0, Ll/᩶ۖ᩷;->ۢ:I

    invoke-static {v0}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 42
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 43
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p2, 0x7f12070a

    .line 44
    invoke-virtual {p1, p2, p0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f12015e

    const/4 v0, 0x0

    .line 45
    invoke-virtual {p1, p2, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 46
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    const/4 p1, 0x0

    :goto_0
    const/4 p2, 0x4

    if-ge p1, p2, :cond_1

    .line 53
    iget-object p2, p0, Ll/ۤ᩸᩻;->᩸:[Landroid/widget/RadioButton;

    aget-object p2, p2, p1

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 56
    :cond_1
    :goto_1
    iget-object p2, p0, Ll/ۤ᩸᩻;->᩹:Landroid/widget/CheckBox;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    if-eqz p2, :cond_2

    add-int/lit8 p1, p1, 0x4

    .line 58
    :cond_2
    sput p1, Ll/᩶ۖ᩷;->ۢ:I

    .line 59
    sget-object p2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p2}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p2

    const-string v0, "rbs"

    int-to-byte p1, p1

    invoke-interface {p2, p1, v0}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 60
    iget-object p1, p0, Ll/ۤ᩸᩻;->᩶:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ܽ֫()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 65
    iget-object v0, p0, Ll/ۤ᩸᩻;->᩸:[Landroid/widget/RadioButton;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-virtual {v2, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const/4 v2, 0x1

    .line 66
    aget-object v3, v0, v2

    invoke-virtual {v3, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const/4 v3, 0x2

    .line 67
    aget-object v3, v0, v3

    invoke-virtual {v3, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const/4 v3, 0x3

    .line 68
    aget-object v0, v0, v3

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 69
    check-cast p1, Landroid/widget/RadioButton;

    invoke-virtual {p1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method
