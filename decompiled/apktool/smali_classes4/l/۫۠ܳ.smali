.class public final Ll/۫۠ܳ;
.super Ll/ܳܶܳ;
.source "M5NX"


# instance fields
.field public final ۛ:Ll/ۛ۠ܳ;

.field public ۤ:Ll/۬۠ܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/ۛ۠ܳ;)V
    .locals 0

    .line 188
    invoke-direct {p0, p1, p2}, Ll/ܳܶܳ;-><init>(Ll/ۗܺ᩷;Landroid/view/View;)V

    .line 189
    iput-object p3, p0, Ll/۫۠ܳ;->ۛ:Ll/ۛ۠ܳ;

    return-void
.end method

.method public static synthetic ֫(Ll/۫۠ܳ;)V
    .locals 1

    .line 211
    iget-object v0, p0, Ll/۫۠ܳ;->ۛ:Ll/ۛ۠ܳ;

    invoke-static {v0, p0}, Ll/ۛ۠ܳ;->֫(Ll/ۛ۠ܳ;Ll/۫۠ܳ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫۠ܳ;Ll/۬۠ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۫۠ܳ;->ۤ:Ll/۬۠ܳ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۫۠ܳ;)Ll/۬۠ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫۠ܳ;->ۤ:Ll/۬۠ܳ;

    return-object p0
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 199
    iget-object p1, p0, Ll/۫۠ܳ;->ۛ:Ll/ۛ۠ܳ;

    iget-object v0, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/ۗܶܳ;->ܽ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    iget-object v0, p0, Ll/۫۠ܳ;->ۤ:Ll/۬۠ܳ;

    if-eqz v0, :cond_1

    .line 223
    iget-object p1, p1, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {p1}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 224
    invoke-virtual {v0}, Ll/۬۠ܳ;->֫()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۢۘܳ;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 205
    new-instance p1, Ll/᩸ۖ;

    iget-object v0, p0, Ll/ܳܶܳ;->᩸:Ll/ۗܺ᩷;

    const v2, 0x800003

    iget-object v3, p0, Ll/ܳܶܳ;->۫:Landroid/view/View;

    invoke-direct {p1, v0, v3, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 206
    invoke-static {v3}, Ll/۟᩷ۡ;->᩷(Landroid/view/View;)V

    .line 207
    invoke-virtual {p1}, Ll/᩸ۖ;->ᩳ()V

    .line 208
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v0

    const v2, 0x7f120189

    .line 209
    invoke-interface {v0, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x7f0801dd

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 210
    new-instance v0, Ll/ۡ᩵ܿ;

    invoke-direct {v0, p0}, Ll/ۡ᩵ܿ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 214
    invoke-virtual {p1}, Ll/᩸ۖ;->ܿ()V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v1
.end method
