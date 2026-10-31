.class public final Ll/۠ܺܳ;
.super Ll/ۗ۬ۡ;
.source "47JB"


# instance fields
.field public final synthetic ᩸:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩹:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 290
    iput-object p1, p0, Ll/۠ܺܳ;->᩹:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Ll/۠ܺܳ;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 293
    iget-object p1, p0, Ll/۠ܺܳ;->᩹:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->isErrorEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 294
    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 295
    iget-object p1, p0, Ll/۠ܺܳ;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v1, -0x1

    .line 27
    invoke-static {p1, v1, v0, v1, v1}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method
