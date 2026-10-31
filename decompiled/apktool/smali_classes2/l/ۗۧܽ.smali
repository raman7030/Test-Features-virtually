.class public final Ll/ۗۧܽ;
.super Ljava/lang/Object;
.source "OANW"

# interfaces
.implements Landroid/content/ComponentCallbacks;


# instance fields
.field public final synthetic ᩸:Landroid/app/Activity;

.field public final synthetic ᩹:Ll/۬ۧܽ;


# direct methods
.method public constructor <init>(Ll/۬ۧܽ;Landroid/app/Activity;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ۗۧܽ;->᩹:Ll/۬ۧܽ;

    iput-object p2, p0, Ll/ۗۧܽ;->᩸:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    const-string v0, "newConfig"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    iget-object p1, p0, Ll/ۗۧܽ;->᩹:Ll/۬ۧܽ;

    invoke-static {p1}, Ll/۬ۧܽ;->֫(Ll/۬ۧܽ;)Ll/ܰ֫ܽ;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 125
    :cond_0
    iget-object v1, p0, Ll/ۗۧܽ;->᩸:Landroid/app/Activity;

    invoke-virtual {p1, v1}, Ll/۬ۧܽ;->ܽ(Landroid/app/Activity;)Ll/ܿܽܽ;

    move-result-object p1

    .line 123
    check-cast v0, Ll/᩸ۧܽ;

    invoke-virtual {v0, v1, p1}, Ll/᩸ۧܽ;->֫(Landroid/app/Activity;Ll/ܿܽܽ;)V

    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    return-void
.end method
