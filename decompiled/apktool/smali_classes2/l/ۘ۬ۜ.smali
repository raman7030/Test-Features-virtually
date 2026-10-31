.class public final synthetic Ll/ۘ۬ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۤۤۜ;

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۤۜ;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ۬ۜ;->᩸:Ll/ۤۤۜ;

    iput-object p2, p0, Ll/ۘ۬ۜ;->᩹:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    sget v0, Ll/ۤۤۜ;->᩻ܿ:I

    .line 1073
    iget-object v0, p0, Ll/ۘ۬ۜ;->᩹:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1084
    iget-object v0, p0, Ll/ۘ۬ۜ;->᩸:Ll/ۤۤۜ;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->᩸()Ll/۫ܰ;

    move-result-object v0

    const/4 v1, 0x2

    .line 1085
    invoke-virtual {v0, v1}, Ll/۫ܰ;->ۧ(I)V

    const/4 v1, 0x7

    .line 1086
    invoke-virtual {v0, v1}, Ll/۫ܰ;->֫(I)V

    :cond_0
    return-void
.end method
