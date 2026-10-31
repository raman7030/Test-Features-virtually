.class public final Ll/۠ۚܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ll/۟ۚܿ;


# instance fields
.field public final synthetic ֫:Ll/ۧ֨ܿ;


# direct methods
.method public constructor <init>(Ll/ۧ֨ܿ;)V
    .locals 0

    .line 1021
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۚܿ;->֫:Ll/ۧ֨ܿ;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/pm/PackageInstaller$SessionParams;)Landroid/content/pm/PackageInstaller$Session;
    .locals 8

    .line 93
    invoke-static {}, Ll/᩶֨ܿ;->ۧ()Landroid/content/pm/IPackageInstaller;

    move-result-object v0

    .line 1025
    invoke-static {}, Ll/᩺᩶۠;->ᩳ()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 1027
    :goto_0
    iget-object v4, p0, Ll/۠ۚܿ;->֫:Ll/ۧ֨ܿ;

    if-eqz v1, :cond_1

    invoke-static {v4}, Ll/ۧ֨ܿ;->֫(Ll/ۧ֨ܿ;)Ll/ۗܺ᩷;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    const-string v5, "com.android.shell"

    :goto_1
    if-eqz v1, :cond_2

    .line 1028
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/UserHandle;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 1029
    :goto_2
    invoke-static {v4}, Ll/ۧ֨ܿ;->ܽ(Ll/ۧ֨ܿ;)Ljava/lang/String;

    move-result-object v6

    .line 98
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_4

    invoke-static {}, Ll/᩶֨ܿ;->֫()Landroid/content/pm/IPackageManager;

    move-result-object v7

    invoke-interface {v7, v6, v1}, Landroid/content/pm/IPackageManager;->isPackageAvailable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_3

    .line 103
    :cond_3
    new-instance p1, Ll/֫ۛۡ;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object v6, v0, v3

    const v1, 0x7f120057

    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 99
    throw p1

    .line 1030
    :cond_4
    :goto_3
    invoke-static {v4}, Ll/ۧ֨ܿ;->ܽ(Ll/ۧ֨ܿ;)Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, v5, v6}, Ll/ۙ֨ܿ;->֫(Landroid/content/pm/PackageInstaller$SessionParams;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1031
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1f

    if-lt v6, v7, :cond_5

    invoke-static {v4}, Ll/ۧ֨ܿ;->֫(Ll/ۧ֨ܿ;)Ll/ۗܺ᩷;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getAttributionTag()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    .line 1032
    :goto_4
    invoke-static {v0, v5, v4, v1}, Ll/ۙ֨ܿ;->֫(Landroid/content/pm/IPackageInstaller;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/pm/PackageInstaller;

    move-result-object v1

    .line 1033
    invoke-virtual {v1, p1}, Landroid/content/pm/PackageInstaller;->createSession(Landroid/content/pm/PackageInstaller$SessionParams;)I

    move-result p1

    .line 1034
    new-instance v1, Ll/ܰ᩶۠;

    invoke-interface {v0, p1}, Landroid/content/pm/IPackageInstaller;->openSession(I)Landroid/content/pm/IPackageInstallerSession;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/pm/IPackageInstallerSession;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/ܰ᩶۠;-><init>(Landroid/os/IBinder;)V

    invoke-static {v1}, Landroid/content/pm/IPackageInstallerSession$Stub;->asInterface(Landroid/os/IBinder;)Landroid/content/pm/IPackageInstallerSession;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Class;

    .line 44
    const-class v1, Landroid/content/pm/IPackageInstallerSession;

    aput-object v1, v0, v3

    const-class v1, Landroid/content/pm/PackageInstaller$Session;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/PackageInstaller$Session;

    return-object p1
.end method

.method public final ֫()V
    .locals 2

    .line 1040
    iget-object v0, p0, Ll/۠ۚܿ;->֫:Ll/ۧ֨ܿ;

    sget-object v1, Ll/ۛۚܿ;->ۙ:Ll/ۛۚܿ;

    invoke-virtual {v0, v1}, Ll/ۧ֨ܿ;->ۧ(Ll/ۛۚܿ;)V

    return-void
.end method
