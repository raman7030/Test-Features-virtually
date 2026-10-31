.class public final synthetic Ll/ᩳᩳ᩻;
.super Ljava/lang/Object;
.source "Y96B"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩸:Landroid/view/View$OnClickListener;

.field public final synthetic ᩹:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View$OnClickListener;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳᩳ᩻;->᩸:Landroid/view/View$OnClickListener;

    iput-object p2, p0, Ll/ᩳᩳ᩻;->᩹:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p3, p0, Ll/ᩳᩳ᩻;->᩶:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ᩳᩳ᩻;->᩸:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 69
    iget-object p1, p0, Ll/ᩳᩳ᩻;->᩹:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {p1}, Lcom/google/android/material/textfield/TextInputLayoutHelper;->hasPasswordTransformation(Lcom/google/android/material/textfield/TextInputLayout;)Z

    move-result p1

    iget-object v0, p0, Ll/ᩳᩳ᩻;->᩶:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 70
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/16 p1, 0x8

    .line 72
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
