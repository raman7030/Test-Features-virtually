.class public final synthetic Ll/ۚ᩶᩷;
.super Ljava/lang/Object;
.source "O945"

# interfaces
.implements Ll/᩵᩹᩷;
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۚ᩶᩷;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Landroid/content/Intent;I)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۚ᩶᩷;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/֨᩶᩷;

    .line 6
    sget v1, Ll/֨᩶᩷;->ܳۧ:I

    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    .line 28
    new-instance p2, Landroid/content/Intent;

    const-class v1, Ll/ۗۨܿ;

    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "data"

    .line 29
    invoke-virtual {p2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 30
    invoke-static {v0, p2}, Ll/֨ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)V

    .line 31
    new-instance p1, Ll/ܽۨܺ;

    const/4 p2, 0x3

    invoke-direct {p1, p2, v0}, Ll/ܽۨܺ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v0, 0x64

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    .line 33
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public ֫(Ll/ۛ֡֨;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۚ᩶᩷;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۙۡ۠;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    check-cast p1, Ll/ܳ֡֨;

    const/4 v1, 0x0

    .line 778
    invoke-virtual {v0, v1, p1}, Ll/ۙۡ۠;->֫(Ll/֨᩵۠;Ll/ܳ֡֨;)V

    return-void
.end method

.method public synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
