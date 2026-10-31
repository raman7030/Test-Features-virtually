.class public final Ll/֫᩶ܽ;
.super Ljava/lang/Object;
.source "P676"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/ܽ᩶ܽ;


# direct methods
.method public constructor <init>(Ll/ܽ᩶ܽ;)V
    .locals 0

    .line 1752
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫᩶ܽ;->᩸:Ll/ܽ᩶ܽ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 1765
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1766
    iget-object v0, p0, Ll/֫᩶ܽ;->᩸:Ll/ܽ᩶ܽ;

    iget-boolean v1, v0, Ll/ܽ᩶ܽ;->ۜ:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const-string v1, "static"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "final"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Ll/ܽ᩶ܽ;->᩻:Z

    const/4 v1, 0x3

    if-eqz p1, :cond_1

    .line 1768
    iget-boolean p1, v0, Ll/ܽ᩶ܽ;->ܺ:Z

    if-eqz p1, :cond_2

    iget-boolean p1, v0, Ll/ܽ᩶ܽ;->ۘ:Z

    if-nez p1, :cond_2

    .line 1769
    iput-boolean v2, v0, Ll/ܽ᩶ܽ;->ۘ:Z

    .line 1770
    invoke-virtual {v0, v1}, Ll/ܶ۬ܿ;->ۧ(I)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 1772
    :cond_1
    iget-boolean p1, v0, Ll/ܽ᩶ܽ;->ۘ:Z

    if-eqz p1, :cond_2

    .line 1773
    iput-boolean v3, v0, Ll/ܽ᩶ܽ;->ۘ:Z

    .line 1774
    invoke-virtual {v0, v1}, Ll/ܶ۬ܿ;->ۧ(I)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
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
