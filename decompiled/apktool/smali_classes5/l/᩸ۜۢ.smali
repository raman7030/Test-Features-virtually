.class public final synthetic Ll/᩸ۜۢ;
.super Ljava/lang/Object;
.source "O1JS"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/֫᩷ܽ;
.implements Ll/ܶۖ;
.implements Ll/᩶ۤۡ;
.implements Ll/᩷ܿۖ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۜۢ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩸ۜۢ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۙ֡֫;

    .line 6
    check-cast p1, Ll/֡᩵֫;

    .line 3228
    invoke-interface {p1, v0}, Ll/֡᩵֫;->֫(Ll/ۙ֡֫;)V

    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩸ۜۢ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/۠֫ۢ;

    invoke-static {v0, p1}, Ll/۠֫ۢ;->֫(Ll/۠֫ۢ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public writeByte(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩸ۜۢ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۙۜܽ;

    invoke-interface {v0, p1}, Ll/ۙۜܽ;->writeByte(I)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩸ۜۢ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܳ᩷ۢ;

    check-cast p1, Ll/ۨܽۢ;

    invoke-static {v0, p1}, Ll/ܳ᩷ۢ;->ܽ(Ll/ܳ᩷ۢ;Ll/ۨܽۢ;)V

    return-void
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩸ۜۢ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 275
    new-instance v1, Ll/ܰܽۖ;

    .line 42
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 275
    throw v1
.end method
