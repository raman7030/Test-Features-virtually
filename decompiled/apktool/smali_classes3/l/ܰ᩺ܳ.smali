.class public final synthetic Ll/ܰ᩺ܳ;
.super Ljava/lang/Object;
.source "A1YB"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/CheckBox;

.field public final synthetic ᩹:Landroid/widget/CheckBox;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/CheckBox;Landroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩺ܳ;->᩸:Landroid/widget/CheckBox;

    iput-object p2, p0, Ll/ܰ᩺ܳ;->᩹:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 108
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "duaw"

    .line 109
    iget-object v1, p0, Ll/ܰ᩺ܳ;->᩸:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-interface {p1, v0, v1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "duds"

    .line 110
    iget-object v1, p0, Ll/ܰ᩺ܳ;->᩹:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-interface {p1, v0, v1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    .line 111
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
