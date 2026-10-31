.class public final synthetic Ll/᩶۠ܳ;
.super Ljava/lang/Object;
.source "O60D"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗ۠ܳ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۗ۠ܳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶۠ܳ;->᩸:Ll/ۗ۠ܳ;

    iput-object p2, p0, Ll/᩶۠ܳ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 93
    iget-object p1, p0, Ll/᩶۠ܳ;->᩸:Ll/ۗ۠ܳ;

    iget-object v0, p1, Ll/ۗ۠ܳ;->ۤ:Ll/ۗۘ;

    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    .line 94
    iget-object v2, p1, Ll/ۗ۠ܳ;->᩶:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    .line 95
    iget-object p1, p1, Ll/ۗ۠ܳ;->۬:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    iget-object v2, p0, Ll/᩶۠ܳ;->᩹:Ljava/lang/String;

    invoke-interface {v1, p1, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    .line 98
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "dzds"

    .line 99
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-interface {v1, p1, v0}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    .line 101
    :cond_1
    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
