.class public final Ll/ܺۘܿ;
.super Ljava/lang/Object;
.source "Q983"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Landroid/widget/CompoundButton;

.field public final synthetic ᩹:Ll/᩺ܺܿ;


# direct methods
.method public constructor <init>(Landroid/widget/CompoundButton;Ll/᩺ܺܿ;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۘܿ;->᩸:Landroid/widget/CompoundButton;

    iput-object p2, p0, Ll/ܺۘܿ;->᩹:Ll/᩺ܺܿ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ܺۘܿ;->᩸:Landroid/widget/CompoundButton;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 99
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܺۘܿ;->᩹:Ll/᩺ܺܿ;

    invoke-static {v0, p1}, Ll/ۘۘܿ;->֫(Ll/᩺ܺܿ;Landroid/text/Editable;)V

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
