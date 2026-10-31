.class public final Ll/ۘ᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 441
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩻᩻;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 454
    iget-object p1, p0, Ll/ۘ᩻᩻;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->isErrorEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 455
    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    :cond_0
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
