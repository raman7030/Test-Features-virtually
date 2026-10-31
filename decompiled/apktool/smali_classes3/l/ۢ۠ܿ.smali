.class public final Ll/ۢ۠ܿ;
.super Ljava/lang/Object;
.source "313O"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/ۡ۠ܿ;

.field public ᩸:Z

.field public ᩹:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/ۡ۠ܿ;)V
    .locals 0

    .line 620
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ۠ܿ;->᩶:Ll/ۡ۠ܿ;

    const/4 p1, 0x0

    .line 621
    iput-boolean p1, p0, Ll/ۢ۠ܿ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 626
    iget-object v0, p0, Ll/ۢ۠ܿ;->᩶:Ll/ۡ۠ܿ;

    iget-object v1, v0, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    .line 627
    iget-object v2, v0, Ll/ۡ۠ܿ;->ܿ:Landroid/content/pm/PackageManager;

    invoke-virtual {v1, v2}, Ll/ۗ֨ܿ;->֫(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Ll/ۡ۠ܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    .line 629
    invoke-virtual {v1}, Ll/ۗ֨ܿ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 630
    invoke-static {}, Ll/ۘ۠ܿ;->֫()Ll/֨᩵;

    move-result-object v0

    monitor-enter v0

    .line 631
    :try_start_0
    invoke-static {}, Ll/ۘ۠ܿ;->֫()Ll/֨᩵;

    move-result-object v2

    iget-object v3, p0, Ll/ۢ۠ܿ;->᩶:Ll/ۡ۠ܿ;

    iget-object v3, v3, Ll/ۡ۠ܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v1, v3}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 634
    new-instance v0, Ll/᩷۠ܿ;

    invoke-direct {v0, p0}, Ll/᩷۠ܿ;-><init>(Ll/ۢ۠ܿ;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v1

    .line 632
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
