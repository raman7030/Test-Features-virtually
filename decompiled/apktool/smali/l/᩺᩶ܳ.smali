.class public final synthetic Ll/᩺᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܰ᩶ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܰ᩶ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩶ܳ;->᩸:Ll/ܰ᩶ܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 604
    iget-object v0, p0, Ll/᩺᩶ܳ;->᩸:Ll/ܰ᩶ܳ;

    iget-object v1, v0, Ll/ܰ᩶ܳ;->ܽ:Ll/۟᩶ܳ;

    iget-object v2, v1, Ll/۟᩶ܳ;->ܳ:Landroid/widget/TextView;

    iget-object v3, v1, Ll/۟᩶ܳ;->ۜ:Ll/ܽۙܳ;

    iget-object v3, v3, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const v3, 0x7f120202

    invoke-static {v3, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 605
    iget-object v1, v1, Ll/۟᩶ܳ;->᩻:Landroid/widget/TextView;

    iget-object v0, v0, Ll/ܰ᩶ܳ;->ۧ:Ljava/lang/String;

    const/16 v2, 0xfa

    invoke-static {v2, v0}, Ll/ۜۚۜ;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
