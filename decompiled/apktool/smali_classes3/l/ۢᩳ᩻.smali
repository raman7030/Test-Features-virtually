.class public final synthetic Ll/ۢᩳ᩻;
.super Ljava/lang/Object;
.source "38V8"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/ۖۢܳ;

.field public final synthetic ۙ:Landroid/widget/CheckBox;

.field public final synthetic ᩶:Landroid/widget/CheckBox;

.field public final synthetic ᩸:Ll/ܺᩳ᩻;

.field public final synthetic ᩹:Landroid/widget/RadioGroup;


# direct methods
.method public synthetic constructor <init>(Ll/ܺᩳ᩻;Landroid/widget/RadioGroup;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/ۖۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢᩳ᩻;->᩸:Ll/ܺᩳ᩻;

    iput-object p2, p0, Ll/ۢᩳ᩻;->᩹:Landroid/widget/RadioGroup;

    iput-object p3, p0, Ll/ۢᩳ᩻;->᩶:Landroid/widget/CheckBox;

    iput-object p4, p0, Ll/ۢᩳ᩻;->ۙ:Landroid/widget/CheckBox;

    iput-object p5, p0, Ll/ۢᩳ᩻;->ۗ:Ll/ۖۢܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    .line 46
    iget-object p1, p0, Ll/ۢᩳ᩻;->᩹:Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result p1

    const p2, 0x7f0a0479

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v4, 0x0

    .line 47
    :goto_0
    iget-object p1, p0, Ll/ۢᩳ᩻;->᩶:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v6

    .line 48
    iget-object p1, p0, Ll/ۢᩳ᩻;->ۙ:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v5

    .line 49
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string p2, "eflr"

    invoke-interface {p1, p2, v4}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string p2, "efls"

    .line 50
    invoke-interface {p1, p2, v6}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string p2, "eflfs"

    .line 51
    invoke-interface {p1, p2, v5}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    .line 52
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 53
    iget-object p1, p0, Ll/ۢᩳ᩻;->ۗ:Ll/ۖۢܳ;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v2

    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v7

    .line 54
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v3

    .line 65
    new-instance p1, Ll/ۡᩳ᩻;

    iget-object v1, p0, Ll/ۢᩳ᩻;->᩸:Ll/ܺᩳ᩻;

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Ll/ۡᩳ᩻;-><init>(Ll/ܺᩳ᩻;Lbin/mt/plus/Main;Ljava/util/List;ZZZLl/ܰܺܳ;)V

    .line 131
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
