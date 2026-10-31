.class public final synthetic Ll/ۚᩴᩳ;
.super Ljava/lang/Object;
.source "76RQ"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/۬ۧۧ;
.implements Ll/۠ۜ᩵;
.implements Ll/ܶۖ;
.implements Ll/ۖۛۡ;
.implements Ll/᩷ܿۖ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۚᩴᩳ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤܽۖ;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚᩴᩳ;->᩸:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۚᩴᩳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩻᩵֫;

    .line 6
    check-cast p1, Ll/֡᩵֫;

    .line 3244
    invoke-interface {p1, v0}, Ll/֡᩵֫;->֫(Ll/᩻᩵֫;)V

    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۚᩴᩳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۚܶܳ;

    invoke-static {v0, p1}, Ll/ۚܶܳ;->֫(Ll/ۚܶܳ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۚᩴᩳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩵ᩳ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۚᩴᩳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۤܽۖ;

    .line 119
    invoke-interface {v0}, Ll/ۤܽۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    iget-object p2, p0, Ll/ۚᩴᩳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast p2, Ll/᩹ᩴᩳ;

    .line 6
    check-cast p1, Ljava/lang/Void;

    const/4 p1, 0x0

    .line 65
    invoke-virtual {p2, p1}, Ll/᩹ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    return-void
.end method
