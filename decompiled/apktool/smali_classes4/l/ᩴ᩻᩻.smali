.class public final Ll/ᩴ᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Landroid/widget/EditText;

.field public final synthetic ᩹:Ljava/util/function/Function;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Ljava/util/function/Function;)V
    .locals 0

    .line 569
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩻᩻;->᩸:Landroid/widget/EditText;

    iput-object p2, p0, Ll/ᩴ᩻᩻;->᩹:Ljava/util/function/Function;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 582
    iget-object v0, p0, Ll/ᩴ᩻᩻;->᩹:Ljava/util/function/Function;

    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ᩴ᩻᩻;->᩸:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

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
