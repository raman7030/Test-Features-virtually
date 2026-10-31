.class public final Ll/᩻᩺ۘ;
.super Ll/᩻᩶ۘ;
.source "78YF"


# instance fields
.field public final ֫:Ll/ܶۗۘ;


# direct methods
.method public constructor <init>(Ll/ܶۗۘ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ll/᩻᩺ۘ;->֫:Ll/ܶۗۘ;

    return-void
.end method

.method public static ֫(Ll/ܶۗۘ;)Ll/᩻᩺ۘ;
    .locals 1

    .line 54
    new-instance v0, Ll/᩻᩺ۘ;

    invoke-direct {v0, p0}, Ll/᩻᩺ۘ;-><init>(Ll/ܶۗۘ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V
    .locals 1

    .line 77
    invoke-virtual {p1}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object p2

    .line 78
    iget-object v0, p0, Ll/᩻᩺ۘ;->֫:Ll/ܶۗۘ;

    if-eq p2, v0, :cond_0

    .line 79
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֡᩶ۘ;)V
    .locals 0

    .line 70
    invoke-interface {p1}, Ll/֡᩶ۘ;->֫()Ll/ۚ᩶ۘ;

    move-result-object p1

    check-cast p1, Ll/᩸ۙۘ;

    .line 71
    invoke-virtual {p1}, Ll/᩸ۙۘ;->֫()V

    return-void
.end method
