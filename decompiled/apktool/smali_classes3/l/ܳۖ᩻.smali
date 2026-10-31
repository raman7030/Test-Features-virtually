.class public final synthetic Ll/ܳۖ᩻;
.super Ljava/lang/Object;
.source "H88G"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/widget/EditText;

.field public final synthetic ᩶:Landroid/widget/EditText;

.field public final synthetic ᩸:Ll/᩻ۖ᩻;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ۖ᩻;Ll/ۢۖ᩻;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۖ᩻;->᩸:Ll/᩻ۖ᩻;

    iput-object p3, p0, Ll/ܳۖ᩻;->᩹:Landroid/widget/EditText;

    iput-object p4, p0, Ll/ܳۖ᩻;->᩶:Landroid/widget/EditText;

    iput-object p5, p0, Ll/ܳۖ᩻;->ۙ:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 407
    iget-object p1, p0, Ll/ܳۖ᩻;->᩸:Ll/᩻ۖ᩻;

    iget-object p1, p1, Ll/᩻ۖ᩻;->ܳ:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    .line 433
    check-cast p1, Ll/ۛܺ᩻;

    .line 444
    invoke-virtual {p1}, Ll/ۛܺ᩻;->ܽ()Ljava/lang/String;

    move-result-object p2

    .line 449
    invoke-virtual {p1}, Ll/ۛܺ᩻;->֫()Ljava/lang/String;

    move-result-object p1

    .line 410
    iget-object v0, p0, Ll/ܳۖ᩻;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    move-result v1

    iget-object v2, p0, Ll/ܳۖ᩻;->᩶:Landroid/widget/EditText;

    if-lez v1, :cond_0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 411
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 413
    :cond_0
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 414
    iget-object p2, p0, Ll/ܳۖ᩻;->ۙ:Landroid/widget/EditText;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    return-void
.end method
