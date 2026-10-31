.class public final synthetic Ll/֫᩺᩷;
.super Ljava/lang/Object;
.source "P1EM"

# interfaces
.implements Ll/֫۠ܳ;
.implements Ll/ܿ۠ܳ;
.implements Ll/ۢۖۜ;
.implements Ll/۟ܶۧ;
.implements Ll/ۖۛۡ;
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫᩺᩷;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֫᩸ۧ;)Ljava/lang/CharSequence;
    .locals 3

    .line 2
    iget-object p1, p0, Ll/֫᩺᩷;->᩸:Ljava/lang/Object;

    .line 4
    check-cast p1, Ll/᩷ۗ᩷;

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    invoke-virtual {p1}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0xc

    invoke-interface {v1, p1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " dp"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic ֫()V
    .locals 0

    return-void
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/֫᩺᩷;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۙۛ᩷;

    invoke-interface {v0, p1}, Ll/ۙۛ᩷;->ۧ(I)V

    return-void
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 1

    iget-object v0, p0, Ll/֫᩺᩷;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    .line 415
    invoke-static {p1, v0}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ֫(Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 1

    iget-object v0, p0, Ll/֫᩺᩷;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܽۜܳ;

    .line 51
    invoke-virtual {v0}, Ll/ܽۜܳ;->ܿ()Landroid/text/SpannableString;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    const/4 p1, 0x4

    .line 52
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public ֫(Ll/ۛ֡֨;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/֫᩺᩷;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩷ۚ֨;

    invoke-static {v0, p1}, Ll/᩷ۚ֨;->ۧ(Ll/᩷ۚ֨;Ll/ۛ֡֨;)V

    return-void
.end method

.method public ֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/֫᩺᩷;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {p1, p2, v0}, Ll/ۖᩴۜ;->֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;Ljava/util/ArrayList;)V

    return-void
.end method

.method public synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
