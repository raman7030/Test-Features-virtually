.class public final synthetic Ll/֡ۗ᩷;
.super Ljava/lang/Object;
.source "Z3WS"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ۗ:[Ljava/lang/CharSequence;

.field public final synthetic ۙ:Ll/֡ۚۢ;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۚۗ᩷;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۚۗ᩷;Ll/ۗܺ᩷;ILl/֡ۚۢ;[Ljava/lang/CharSequence;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۗ᩷;->᩸:Ll/ۚۗ᩷;

    iput-object p2, p0, Ll/֡ۗ᩷;->᩹:Ll/ۗܺ᩷;

    iput p3, p0, Ll/֡ۗ᩷;->᩶:I

    iput-object p4, p0, Ll/֡ۗ᩷;->ۙ:Ll/֡ۚۢ;

    iput-object p5, p0, Ll/֡ۗ᩷;->ۗ:[Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 9

    .line 113
    iget-object v0, p0, Ll/֡ۗ᩷;->᩸:Ll/ۚۗ᩷;

    iget-object v2, v0, Ll/ۚۗ᩷;->᩻:Ll/᩶ۗ᩷;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    iget-object v5, p0, Ll/֡ۗ᩷;->᩹:Ll/ۗܺ᩷;

    iget v3, p0, Ll/֡ۗ᩷;->᩶:I

    iget-object v6, p0, Ll/֡ۗ᩷;->ۙ:Ll/֡ۚۢ;

    const/4 v7, 0x1

    const v8, 0x7f1206c4

    if-ne v1, v8, :cond_0

    .line 114
    iget-object p1, v0, Ll/ۚۗ᩷;->ܳ:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟᩵ۡ;

    .line 177
    new-instance v0, Ll/۠ۗ᩷;

    move-object v1, v0

    move-object v3, v5

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Ll/۠ۗ᩷;-><init>(Ll/᩶ۗ᩷;Ll/ۗܺ᩷;Ll/۟᩵ۡ;Ll/ۗܺ᩷;Ll/֡ۚۢ;)V

    .line 224
    invoke-virtual {v0, v8}, Ll/۬ۗܿ;->ۡ(I)V

    .line 225
    invoke-virtual {p1}, Ll/۟᩵ۡ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const/16 p1, 0x32

    .line 226
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ܳ(I)V

    .line 205
    invoke-virtual {v0, v7}, Ll/۬ۗܿ;->ۧ(Z)V

    return v7

    .line 115
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v1, 0x7f1205ca

    if-ne p1, v1, :cond_1

    .line 116
    iget-object p1, p0, Ll/֡ۗ᩷;->ۗ:[Ljava/lang/CharSequence;

    aget-object p1, p1, v3

    iget-object v0, v0, Ll/ۚۗ᩷;->ܳ:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟᩵ۡ;

    .line 231
    invoke-virtual {v5}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    .line 232
    invoke-virtual {v3, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "\n"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v7, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v1, v4

    const p1, 0x7f120870

    .line 233
    invoke-static {p1, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p1, Ll/ۢۗ᩷;

    invoke-direct {p1, v2, v5, v0, v6}, Ll/ۢۗ᩷;-><init>(Ll/᩶ۗ᩷;Ll/ۗܺ᩷;Ll/۟᩵ۡ;Ll/֡ۚۢ;)V

    const v0, 0x7f12070a

    .line 234
    invoke-virtual {v3, v0, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v0, 0x0

    .line 267
    invoke-virtual {v3, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 268
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :cond_1
    return v7
.end method
