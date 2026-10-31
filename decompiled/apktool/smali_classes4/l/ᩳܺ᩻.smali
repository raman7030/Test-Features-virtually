.class public final synthetic Ll/ᩳܺ᩻;
.super Ljava/lang/Object;
.source "CAG8"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩶:Landroid/widget/EditText;

.field public final synthetic ᩸:Landroid/widget/RadioButton;

.field public final synthetic ᩹:Landroid/widget/RadioButton;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/EditText;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳܺ᩻;->᩸:Landroid/widget/RadioButton;

    iput-object p2, p0, Ll/ᩳܺ᩻;->᩹:Landroid/widget/RadioButton;

    iput-object p3, p0, Ll/ᩳܺ᩻;->᩶:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 250
    iget-object v0, p0, Ll/ᩳܺ᩻;->᩸:Landroid/widget/RadioButton;

    if-ne p1, v0, :cond_0

    .line 251
    iget-object p1, p0, Ll/ᩳܺ᩻;->᩹:Landroid/widget/RadioButton;

    goto :goto_0

    :cond_0
    move-object p1, v0

    .line 255
    :goto_0
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-ne v1, p2, :cond_2

    xor-int/lit8 p2, p2, 0x1

    .line 256
    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 257
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    iget-object p2, p0, Ll/ᩳܺ᩻;->᩶:Landroid/widget/EditText;

    const-string v0, "21"

    const-string v1, "990"

    if-eqz p1, :cond_1

    .line 258
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 259
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 262
    :cond_1
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 263
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method
