.class public final synthetic Ll/᩸᩸ۜ;
.super Ljava/lang/Object;
.source "O8UQ"

# interfaces
.implements Ll/᩷ܺۡ;
.implements Ll/ۙ۫ۡ;
.implements Ll/ܶۖ;
.implements Ll/۠ۖ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/ۖۛۡ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸᩸ۜ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩸᩸ۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->$r8$lambda$QWmsr9SOaqSJq5dogzEk6LuF6sM(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩸᩸ۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/֫ۧ᩻;

    invoke-static {v0, p1}, Ll/֫ۧ᩻;->֫(Ll/֫ۧ᩻;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ֫()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩸᩸ۜ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۟ۡۡ;

    .line 111
    invoke-static {v0}, Ll/ܿܺۡ;->֫(Ll/ۧܺۡ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩸᩸ۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩸ۛ᩷;

    invoke-interface {v0, p1}, Ll/᩸ۛ᩷;->ۧ(I)V

    return-void
.end method

.method public ֫(Ll/ۢܺۡ;)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/᩸᩸ۜ;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۢۘܳ;

    invoke-static {p1}, Ll/ۢۘܳ;->ܿ(Ll/ۢۘܳ;)V

    return-void
.end method

.method public ֫(Ll/᩸ۖ;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/᩸᩸ۜ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, [Ll/᩸ۖ;

    const/4 v1, 0x0

    .line 200
    aget-object v2, v0, v1

    if-ne v2, p1, :cond_0

    const/4 p1, 0x0

    .line 201
    aput-object p1, v0, v1

    :cond_0
    return-void
.end method
