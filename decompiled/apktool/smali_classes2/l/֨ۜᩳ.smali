.class public final Ll/֨ۜᩳ;
.super Ljava/lang/Object;
.source "05XT"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/۠ۜᩳ;


# direct methods
.method public constructor <init>(Ll/۠ۜᩳ;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۜᩳ;->᩸:Ll/۠ۜᩳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 56
    invoke-static {p1}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Ll/֨ۜᩳ;->᩸:Ll/۠ۜᩳ;

    if-eqz v0, :cond_0

    .line 57
    invoke-static {p1}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result p1

    .line 58
    invoke-static {v1}, Ll/۠ۜᩳ;->ۧ(Ll/۠ۜᩳ;)Ll/᩻ۜᩳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩻ۜᩳ;->ۤ:Ll/᩶ܿܽ;

    invoke-virtual {v0}, Ll/᩶ܿܽ;->᩷()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 59
    invoke-static {v1}, Ll/۠ۜᩳ;->ۧ(Ll/۠ۜᩳ;)Ll/᩻ۜᩳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩻ۜᩳ;->ۤ:Ll/᩶ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩶ܿܽ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 61
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 62
    invoke-static {v1}, Ll/۠ۜᩳ;->֫(Ll/۠ۜᩳ;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    invoke-static {v1}, Ll/۠ۜᩳ;->֫(Ll/۠ۜᩳ;)Landroid/widget/EditText;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 64
    invoke-static {v1}, Ll/۠ۜᩳ;->֫(Ll/۠ۜᩳ;)Landroid/widget/EditText;

    move-result-object p1

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    .line 66
    :cond_1
    invoke-static {v1}, Ll/۠ۜᩳ;->֫(Ll/۠ۜᩳ;)Landroid/widget/EditText;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 67
    invoke-static {v1}, Ll/۠ۜᩳ;->֫(Ll/۠ۜᩳ;)Landroid/widget/EditText;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
