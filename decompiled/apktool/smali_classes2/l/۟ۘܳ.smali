.class public final synthetic Ll/۟ۘܳ;
.super Ljava/lang/Object;
.source "OAYY"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ll/ܳ᩶᩵;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Ll/ܳ᩶᩵;Landroid/widget/EditText;Ljava/util/ArrayList;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۘܳ;->᩸:Ll/ܳ᩶᩵;

    iput-object p2, p0, Ll/۟ۘܳ;->᩹:Landroid/widget/EditText;

    iput-object p3, p0, Ll/۟ۘܳ;->᩶:Ljava/util/ArrayList;

    iput-object p4, p0, Ll/۟ۘܳ;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    const-string v0, "dialog"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 855
    iget-object v0, p0, Ll/۟ۘܳ;->᩸:Ll/ܳ᩶᩵;

    iput p2, v0, Ll/ܳ᩶᩵;->᩸:I

    .line 856
    iget-object v0, p0, Ll/۟ۘܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Ll/۟ۘܳ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 857
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۗ᩻᩻;

    invoke-virtual {p2}, Ll/ۗ᩻᩻;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    .line 858
    iget-object v0, p0, Ll/۟ۘܳ;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 859
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
