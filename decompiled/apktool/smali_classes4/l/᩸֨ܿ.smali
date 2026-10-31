.class public final Ll/᩸֨ܿ;
.super Ljava/lang/Object;
.source "28BC"


# static fields
.field public static final ֫:Landroid/content/pm/IPackageManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "package"

    .line 140
    invoke-static {v0}, Ll/ܳۙ۠;->֫(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/rosan/dhizuku/api/Dhizuku;->binderWrapper(Landroid/os/IBinder;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Landroid/content/pm/IPackageManager$Stub;->asInterface(Landroid/os/IBinder;)Landroid/content/pm/IPackageManager;

    move-result-object v0

    sput-object v0, Ll/᩸֨ܿ;->֫:Landroid/content/pm/IPackageManager;

    return-void
.end method

.method public static ֫()Landroid/content/pm/IPackageInstaller;
    .locals 1

    .line 143
    sget-object v0, Ll/᩸֨ܿ;->֫:Landroid/content/pm/IPackageManager;

    invoke-interface {v0}, Landroid/content/pm/IPackageManager;->getPackageInstaller()Landroid/content/pm/IPackageInstaller;

    move-result-object v0

    .line 144
    invoke-interface {v0}, Landroid/content/pm/IPackageInstaller;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/rosan/dhizuku/api/Dhizuku;->binderWrapper(Landroid/os/IBinder;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Landroid/content/pm/IPackageInstaller$Stub;->asInterface(Landroid/os/IBinder;)Landroid/content/pm/IPackageInstaller;

    move-result-object v0

    return-object v0
.end method
