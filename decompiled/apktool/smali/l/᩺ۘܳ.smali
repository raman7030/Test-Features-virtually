.class public final synthetic Ll/᩺ۘܳ;
.super Ljava/lang/Object;
.source "OAYY"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ljava/util/ArrayList;

.field public final synthetic ۙ:Ll/ܳ᩶᩵;

.field public final synthetic ۬:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩶:[Ljava/lang/CharSequence;

.field public final synthetic ᩸:Landroid/widget/EditText;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Ll/ۗܺ᩷;[Ljava/lang/CharSequence;Ll/ܳ᩶᩵;Ljava/util/ArrayList;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۘܳ;->᩸:Landroid/widget/EditText;

    iput-object p2, p0, Ll/᩺ۘܳ;->᩹:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/᩺ۘܳ;->᩶:[Ljava/lang/CharSequence;

    iput-object p4, p0, Ll/᩺ۘܳ;->ۙ:Ll/ܳ᩶᩵;

    iput-object p5, p0, Ll/᩺ۘܳ;->ۗ:Ljava/util/ArrayList;

    iput-object p6, p0, Ll/᩺ۘܳ;->۬:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 848
    iget-object p1, p0, Ll/᩺ۘܳ;->᩸:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 849
    iget-object v0, p0, Ll/᩺ۘܳ;->᩹:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f1206c6

    .line 850
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 853
    iget-object v1, p0, Ll/᩺ۘܳ;->ۙ:Ll/ܳ᩶᩵;

    iget v2, v1, Ll/ܳ᩶᩵;->᩸:I

    .line 851
    new-instance v3, Ll/۟ۘܳ;

    iget-object v4, p0, Ll/᩺ۘܳ;->ۗ:Ljava/util/ArrayList;

    iget-object v5, p0, Ll/᩺ۘܳ;->۬:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v3, v1, p1, v4, v5}, Ll/۟ۘܳ;-><init>(Ll/ܳ᩶᩵;Landroid/widget/EditText;Ljava/util/ArrayList;Lcom/google/android/material/textfield/TextInputLayout;)V

    iget-object p1, p0, Ll/᩺ۘܳ;->᩶:[Ljava/lang/CharSequence;

    invoke-virtual {v0, p1, v2, v3}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120189

    const/4 v1, 0x0

    .line 861
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 862
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
