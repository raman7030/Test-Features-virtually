.class public final Ll/ۤ۬ۡ;
.super Ljava/lang/Object;
.source "D946"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final ᩸:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/ۤ۬ۡ;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method

.method public static ֫(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 2

    .line 14
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/ۤ۬ۡ;

    invoke-direct {v1, p0}, Ll/ۤ۬ۡ;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 33
    iget-object p1, p0, Ll/ۤ۬ۡ;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

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
