.class public final Ll/ۧᩴܳ;
.super Ll/ܶ۬ܿ;
.source "OAYY"


# instance fields
.field public final synthetic ۜ:Ll/ܽᩴܳ;

.field public final synthetic ᩻:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ܽᩴܳ;Ljava/lang/Runnable;)V
    .locals 0

    .line 2
    iput-object p2, p0, Ll/ۧᩴܳ;->ۜ:Ll/ܽᩴܳ;

    .line 4
    iput-object p3, p0, Ll/ۧᩴܳ;->᩻:Ljava/lang/Runnable;

    .line 784
    invoke-direct {p0, p1}, Ll/ܶ۬ܿ;-><init>(Ll/ۗܺ᩷;)V

    return-void
.end method


# virtual methods
.method public final ܽ()Z
    .locals 7

    const/4 v0, 0x0

    .line 786
    invoke-virtual {p0, v0}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 787
    invoke-virtual {p0, v2}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 789
    invoke-virtual {p0}, Ll/ܶ۬ܿ;->ܿ()I

    move-result v4

    const/4 v5, 0x3

    if-lt v4, v5, :cond_0

    const/4 v4, 0x2

    invoke-virtual {p0, v4}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩻᩻;

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 790
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-le v5, v2, :cond_1

    const-string v5, "/"

    .line 486
    invoke-static {v3, v5, v0}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 791
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v5, v2

    invoke-virtual {v3, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v5, "substring(...)"

    invoke-static {v3, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 794
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    iget-object v6, p0, Ll/ۧᩴܳ;->ۜ:Ll/ܽᩴܳ;

    if-lez v5, :cond_2

    invoke-virtual {v6}, Ll/ܽᩴܳ;->ܳ()Ljava/lang/String;

    move-result-object v5

    .line 169
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 795
    invoke-virtual {v6, v1}, Ll/ܽᩴܳ;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 798
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {v6}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    .line 169
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 799
    invoke-virtual {v6, v3}, Ll/ܽᩴܳ;->ܽ(Ljava/lang/String;)V

    const/4 v0, 0x1

    :cond_3
    if-eqz v4, :cond_4

    .line 803
    invoke-virtual {v6}, Ll/ܽᩴܳ;->᩻()Ll/ܿᩴܳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Ll/ܿᩴܳ;->֫(Ll/ۗ᩻᩻;)Ll/ܿᩴܳ;

    move-result-object v0

    invoke-virtual {v6, v0}, Ll/ܽᩴܳ;->֫(Ll/ܿᩴܳ;)V

    const/4 v0, 0x1

    :cond_4
    if-eqz v0, :cond_5

    .line 807
    invoke-static {}, Ll/ۡᩴܳ;->ᩴ()V

    .line 808
    iget-object v0, p0, Ll/ۧᩴܳ;->᩻:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_5
    return v2
.end method
