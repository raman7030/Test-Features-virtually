.class public final synthetic Ll/۟᩺ۜ;
.super Ljava/lang/Object;
.source "K6MS"

# interfaces
.implements Ll/ܿۖ᩷;


# instance fields
.field public final synthetic ᩶:Ll/ۗܺ᩷;

.field public final synthetic ᩸:Ll/ܿۖ᩷;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/ܿۖ᩷;ZLl/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟᩺ۜ;->᩸:Ll/ܿۖ᩷;

    iput-boolean p2, p0, Ll/۟᩺ۜ;->᩹:Z

    iput-object p3, p0, Ll/۟᩺ۜ;->᩶:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final ᩻()Z
    .locals 2

    .line 155
    iget-object v0, p0, Ll/۟᩺ۜ;->᩸:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/۟᩺ۜ;->᩹:Z

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Ll/۟᩺ۜ;->᩶:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
