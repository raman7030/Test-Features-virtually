.class public final Ll/ۧ֨ܳ;
.super Ll/ۗ۬ۡ;
.source "QB4F"


# instance fields
.field public final synthetic ᩸:Ll/᩷֨ܳ;


# direct methods
.method public constructor <init>(Ll/᩷֨ܳ;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-object p1, p0, Ll/ۧ֨ܳ;->᩸:Ll/᩷֨ܳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ۧ֨ܳ;->᩸:Ll/᩷֨ܳ;

    invoke-static {v0}, Ll/᩷֨ܳ;->ܽ(Ll/᩷֨ܳ;)Ll/ۗۘ;

    move-result-object v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
