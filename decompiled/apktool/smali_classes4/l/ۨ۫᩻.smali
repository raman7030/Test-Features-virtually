.class public final Ll/ۨ۫᩻;
.super Ll/ۗ۬ۡ;
.source "Y6Y9"


# instance fields
.field public final synthetic ᩶:Landroid/widget/EditText;

.field public final synthetic ᩸:Ll/۫۬᩻;

.field public final synthetic ᩹:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Ll/۫۬᩻;Landroid/widget/EditText;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 346
    iput-object p1, p0, Ll/ۨ۫᩻;->᩹:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Ll/ۨ۫᩻;->᩸:Ll/۫۬᩻;

    iput-object p3, p0, Ll/ۨ۫᩻;->᩶:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 349
    iget-object p1, p0, Ll/ۨ۫᩻;->᩹:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, p0, Ll/ۨ۫᩻;->᩸:Ll/۫۬᩻;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 350
    invoke-virtual {v0}, Ll/۫۬᩻;->run()V

    .line 351
    iget-object v0, p0, Ll/ۨ۫᩻;->᩶:Landroid/widget/EditText;

    .line 726
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۗۡ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const v2, 0x7f12085b

    .line 728
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 730
    invoke-virtual {p1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 731
    invoke-virtual {p1, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    :goto_0
    if-eqz v0, :cond_1

    .line 352
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Ll/᩸ۛ᩻;->ᩳ()I

    move-result v2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {p1, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconVisible(Z)V

    return-void
.end method
