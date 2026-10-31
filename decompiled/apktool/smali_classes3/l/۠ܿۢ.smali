.class public final synthetic Ll/۠ܿۢ;
.super Ljava/lang/Object;
.source "SBMC"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:[I

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>([ILandroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ܿۢ;->᩸:[I

    iput-object p2, p0, Ll/۠ܿۢ;->᩹:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_0
    const/16 v0, 0x15

    if-ge p1, v0, :cond_1

    .line 351
    iget-object v0, p0, Ll/۠ܿۢ;->᩸:[I

    aget v0, v0, p1

    .line 352
    iget-object v1, p0, Ll/۠ܿۢ;->᩹:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۗۘ;

    .line 353
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    shl-int/2addr v0, p1

    or-int/2addr p2, v0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 357
    :cond_1
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "dnm"

    invoke-interface {p1, p2, v0}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
