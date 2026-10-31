.class public final synthetic Ll/ܶ᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/ۗܺ᩷;

.field public final synthetic ᩸:Ll/ۙ᩻᩻;

.field public final synthetic ᩹:Ll/֡᩻᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ᩻᩻;Ll/֡᩻᩻;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ᩻᩻;->᩸:Ll/ۙ᩻᩻;

    iput-object p2, p0, Ll/ܶ᩻᩻;->᩹:Ll/֡᩻᩻;

    iput-object p3, p0, Ll/ܶ᩻᩻;->᩶:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 235
    iget-object p1, p0, Ll/ܶ᩻᩻;->᩹:Ll/֡᩻᩻;

    iget-object v0, p1, Ll/֡᩻᩻;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 236
    iget-object v1, p1, Ll/֡᩻᩻;->֫:Ljava/lang/Object;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ܶ᩻᩻;->᩸:Ll/ۙ᩻᩻;

    iget v1, v1, Ll/ۗ᩻᩻;->ۤ:I

    goto :goto_0

    :cond_0
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 237
    :goto_0
    new-instance v2, Ll/᩶᩻᩻;

    iget-object v3, p0, Ll/ܶ᩻᩻;->᩶:Ll/ۗܺ᩷;

    invoke-direct {v2, p1, v3}, Ll/᩶᩻᩻;-><init>(Ll/֡᩻᩻;Ll/ۗܺ᩷;)V

    invoke-static {v3, v0, v1, v2}, Ll/ۜ۬᩷;->֫(Ll/ۗܺ᩷;Ljava/lang/CharSequence;ILl/ۛۢᩴ;)V

    return-void
.end method
