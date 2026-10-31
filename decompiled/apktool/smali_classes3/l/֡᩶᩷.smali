.class public abstract Ll/֡᩶᩷;
.super Ll/ۗܺ᩷;
.source "194I"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 11
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 12
    invoke-virtual {p0}, Ll/ۗܺ᩷;->۬()V

    .line 13
    invoke-virtual {p0}, Ll/֡᩶᩷;->ۨ()V

    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 18
    invoke-super {p0}, Ll/ۗܺ᩷;->onStop()V

    .line 19
    invoke-virtual {p0}, Ll/֡᩶᩷;->᩺()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public abstract ۨ()V
.end method

.method public ᩺()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
