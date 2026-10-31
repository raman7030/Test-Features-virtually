.class public final synthetic Ll/ܿᩳ᩻;
.super Ljava/lang/Object;
.source "Y96B"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Landroid/widget/CheckBox;

.field public final synthetic ۙ:Ll/ܳᩳ᩻;

.field public final synthetic ۬:Ll/ۖۢܳ;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩹:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Ll/֡ۚۢ;Ll/ܳᩳ᩻;Landroid/widget/CheckBox;Ll/ۖۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿᩳ᩻;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Ll/ܿᩳ᩻;->᩹:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p3, p0, Ll/ܿᩳ᩻;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ܿᩳ᩻;->ۙ:Ll/ܳᩳ᩻;

    iput-object p5, p0, Ll/ܿᩳ᩻;->ۗ:Landroid/widget/CheckBox;

    iput-object p6, p0, Ll/ܿᩳ᩻;->۬:Ll/ۖۢܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 90
    iget-object p1, p0, Ll/ܿᩳ᩻;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    iget-object v1, p0, Ll/ܿᩳ᩻;->᩹:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 93
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    const v1, 0x7f120305

    .line 94
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 95
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 98
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    .line 99
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const p1, 0x7f120ae6

    .line 100
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 101
    invoke-virtual {v2}, Landroid/widget/EditText;->selectAll()V

    .line 102
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 105
    :cond_2
    iget-object v0, p0, Ll/ܿᩳ᩻;->᩶:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 106
    iget-object v0, p0, Ll/ܿᩳ᩻;->ۙ:Ll/ܳᩳ᩻;

    iget-boolean v1, v0, Ll/ܳᩳ᩻;->ۧ:Z

    iget-object v2, p0, Ll/ܿᩳ᩻;->ۗ:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    if-ne v1, v4, :cond_3

    iget-boolean v1, v0, Ll/ܳᩳ᩻;->ܽ:Z

    if-eq v1, p1, :cond_4

    .line 107
    :cond_3
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Ll/ܳᩳ᩻;->ۧ:Z

    .line 108
    iput-boolean p1, v0, Ll/ܳᩳ᩻;->ܽ:Z

    .line 109
    invoke-virtual {v0}, Ll/ܳᩳ᩻;->ۧ()V

    .line 111
    :cond_4
    sget p1, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance p1, Ll/֨۠ۢ;

    const-class v0, Ll/ۜᩳ᩻;

    invoke-direct {p1, v0}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 112
    iget-object v0, p0, Ll/ܿᩳ᩻;->۬:Ll/ۖۢܳ;

    invoke-virtual {p1, v0}, Ll/֨۠ۢ;->ܽ(Ll/ۖۢܳ;)V

    .line 113
    invoke-virtual {v0}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    const-string v0, "password"

    .line 114
    invoke-virtual {p1, v0, v3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "removeSource"

    .line 115
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 116
    invoke-virtual {p1}, Ll/֨۠ۢ;->֫()I

    return-void
.end method
