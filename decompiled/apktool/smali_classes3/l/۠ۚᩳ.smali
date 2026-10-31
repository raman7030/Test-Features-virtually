.class public final synthetic Ll/۠ۚᩳ;
.super Ljava/lang/Object;
.source "75NJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ܽ֨ᩳ;

.field public final synthetic ᩹:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ֨ᩳ;Landroid/content/Intent;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۚᩳ;->᩸:Ll/ܽ֨ᩳ;

    iput-object p2, p0, Ll/۠ۚᩳ;->᩹:Landroid/content/Intent;

    iput-boolean p3, p0, Ll/۠ۚᩳ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    sget v0, Ll/ܽ֨ᩳ;->᩶ۧ:I

    .line 377
    :try_start_0
    invoke-static {}, Ll/ۢ֨ۢ;->ᩴ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    :catchall_0
    new-instance v0, Ll/ܿۚᩳ;

    iget-object v1, p0, Ll/۠ۚᩳ;->᩸:Ll/ܽ֨ᩳ;

    iget-object v2, p0, Ll/۠ۚᩳ;->᩹:Landroid/content/Intent;

    iget-boolean v3, p0, Ll/۠ۚᩳ;->᩶:Z

    invoke-direct {v0, v1, v2, v3}, Ll/ܿۚᩳ;-><init>(Ll/ܽ֨ᩳ;Landroid/content/Intent;Z)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
