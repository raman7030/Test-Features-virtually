.class public final Ll/ۢ֨ܳ;
.super Ljava/lang/Object;
.source "D1Y9"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/ۡ֨ܳ;


# direct methods
.method public constructor <init>(Ll/ۡ֨ܳ;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ֨ܳ;->᩸:Ll/ۡ֨ܳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 43
    iget-object p1, p0, Ll/ۢ֨ܳ;->᩸:Ll/ۡ֨ܳ;

    invoke-static {p1}, Ll/ۡ֨ܳ;->֫(Ll/ۡ֨ܳ;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 44
    invoke-static {p1}, Ll/ۡ֨ܳ;->֫(Ll/ۡ֨ܳ;)Landroid/widget/TextView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
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
