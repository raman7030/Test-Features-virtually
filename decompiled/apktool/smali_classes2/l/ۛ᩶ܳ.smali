.class public final synthetic Ll/ۛ᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܰ᩶ܳ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ܰ᩶ܳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩶ܳ;->᩸:Ll/ܰ᩶ܳ;

    iput-object p2, p0, Ll/ۛ᩶ܳ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 599
    iget-object v0, p0, Ll/ۛ᩶ܳ;->᩸:Ll/ܰ᩶ܳ;

    iget-object v0, v0, Ll/ܰ᩶ܳ;->ܽ:Ll/۟᩶ܳ;

    iget-object v1, v0, Ll/۟᩶ܳ;->ܳ:Landroid/widget/TextView;

    iget-object v2, v0, Ll/۟᩶ܳ;->ۜ:Ll/ܽۙܳ;

    iget-object v2, v2, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const v2, 0x7f120202

    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 600
    iget-object v0, v0, Ll/۟᩶ܳ;->᩻:Landroid/widget/TextView;

    const/16 v1, 0xfa

    iget-object v2, p0, Ll/ۛ᩶ܳ;->᩹:Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ۜۚۜ;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
