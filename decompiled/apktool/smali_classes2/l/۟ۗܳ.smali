.class public final synthetic Ll/۟ۗܳ;
.super Ljava/lang/Object;
.source "Y5PI"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ۙ:Landroid/widget/Spinner;

.field public final synthetic ᩶:Ll/ۗۘ;

.field public final synthetic ᩸:Landroid/widget/TextView;

.field public final synthetic ᩹:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ۗۘ;Landroid/widget/Spinner;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۗܳ;->᩸:Landroid/widget/TextView;

    iput-object p2, p0, Ll/۟ۗܳ;->᩹:Landroid/widget/TextView;

    iput-object p3, p0, Ll/۟ۗܳ;->᩶:Ll/ۗۘ;

    iput-object p4, p0, Ll/۟ۗܳ;->ۙ:Landroid/widget/Spinner;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    if-nez p2, :cond_0

    const p1, 0x7f12029a

    goto :goto_0

    :cond_0
    const p1, 0x7f12029d

    .line 105
    :goto_0
    iget-object v0, p0, Ll/۟ۗܳ;->᩸:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    const/16 p1, 0x8

    if-nez p2, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/16 v0, 0x8

    .line 106
    :goto_1
    iget-object v1, p0, Ll/۟ۗܳ;->᩹:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    if-nez p2, :cond_2

    const/4 p1, 0x0

    .line 107
    :cond_2
    iget-object v0, p0, Ll/۟ۗܳ;->᩶:Ll/ۗۘ;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    xor-int/lit8 p1, p2, 0x1

    .line 108
    iget-object v0, p0, Ll/۟ۗܳ;->ۙ:Landroid/widget/Spinner;

    invoke-virtual {v0, p1}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 109
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "dfoh"

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return-void
.end method
