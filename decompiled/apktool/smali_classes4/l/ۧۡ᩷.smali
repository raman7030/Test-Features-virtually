.class public final Ll/ۧۡ᩷;
.super Ll/ۗ۬ۡ;
.source "R7YU"


# instance fields
.field public final synthetic ᩸:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/widget/Button;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object p1, p0, Ll/ۧۡ᩷;->᩸:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 124
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Ll/ۧۡ᩷;->᩸:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
