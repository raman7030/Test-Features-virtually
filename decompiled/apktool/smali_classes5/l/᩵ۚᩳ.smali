.class public final synthetic Ll/᩵ۚᩳ;
.super Ljava/lang/Object;
.source "75NJ"

# interfaces
.implements Ll/ܶۜ᩵;
.implements Ll/ܳ۫ᩳ;
.implements Ll/᩻ᩴ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩵ۚᩳ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩵ۚᩳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܽ֨ᩳ;

    invoke-virtual {v0, p1}, Ll/ܽ֨ᩳ;->֫(Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ֫(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩵ۚᩳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p2}, Ll/ۨ᩵ᩳ;->ۧ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Z)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩵ۚᩳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۢۘᩳ;

    invoke-virtual {v0, p1}, Ll/ۢۘᩳ;->֫(Z)V

    return-void
.end method
