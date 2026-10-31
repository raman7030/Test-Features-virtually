.class public final Ll/ۙ֨ܿ;
.super Ljava/lang/Object;
.source "28BC"


# direct methods
.method public static ֫()Landroid/content/pm/PackageInstaller$SessionParams;
    .locals 7

    .line 56
    new-instance v0, Landroid/content/pm/PackageInstaller$SessionParams;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/content/pm/PackageInstaller$SessionParams;-><init>(I)V

    .line 48
    const-class v1, Landroid/content/pm/PackageInstaller$SessionParams;

    const-string v2, "installFlags"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v4, 0x100086

    or-int/2addr v4, v3

    .line 60
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x22

    if-lt v5, v6, :cond_0

    const v4, 0x1100086

    or-int/2addr v4, v3

    .line 63
    :cond_0
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/UserHandle;->hashCode()I

    move-result v3

    if-eqz v3, :cond_1

    or-int/lit8 v4, v4, 0x40

    .line 52
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ֫(Landroid/content/pm/IPackageInstaller;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/pm/PackageInstaller;
    .locals 11

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v8, Landroid/content/pm/IPackageInstaller;

    const-class v9, Landroid/content/pm/PackageInstaller;

    const-class v10, Ljava/lang/String;

    if-lt v0, v1, :cond_0

    new-array v0, v2, [Ljava/lang/Class;

    aput-object v8, v0, v6

    aput-object v10, v0, v5

    aput-object v10, v0, v4

    aput-object v7, v0, v3

    .line 32
    invoke-virtual {v9, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 33
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p0, v1, v6

    aput-object p1, v1, v5

    aput-object p2, v1, v4

    aput-object p3, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/PackageInstaller;

    return-object p0

    :cond_0
    const/16 p2, 0x1a

    if-lt v0, p2, :cond_1

    new-array p2, v3, [Ljava/lang/Class;

    aput-object v8, p2, v6

    aput-object v10, p2, v5

    aput-object v7, p2, v4

    .line 35
    invoke-virtual {v9, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    .line 36
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array v0, v3, [Ljava/lang/Object;

    aput-object p0, v0, v6

    aput-object p1, v0, v5

    aput-object p3, v0, v4

    invoke-virtual {p2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/PackageInstaller;

    return-object p0

    :cond_1
    const/4 p2, 0x5

    new-array v0, p2, [Ljava/lang/Class;

    .line 38
    const-class v1, Landroid/content/Context;

    aput-object v1, v0, v6

    const-class v1, Landroid/content/pm/PackageManager;

    aput-object v1, v0, v5

    aput-object v8, v0, v4

    aput-object v10, v0, v3

    aput-object v7, v0, v2

    invoke-virtual {v9, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 39
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v7

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array p2, p2, [Ljava/lang/Object;

    aput-object v1, p2, v6

    aput-object v7, p2, v5

    aput-object p0, p2, v4

    aput-object p1, p2, v3

    aput-object p3, p2, v2

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/PackageInstaller;

    return-object p0
.end method

.method public static ֫(Landroid/content/pm/PackageInstaller$SessionParams;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 106
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 109
    :cond_0
    invoke-static {p2}, Ll/ۨ֡ܿ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 112
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_1

    .line 113
    invoke-virtual {p0, p2}, Landroid/content/pm/PackageInstaller$SessionParams;->setInstallerPackageName(Ljava/lang/String;)V

    return-object p1

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 115
    const-class v0, Landroid/content/pm/PackageInstaller$SessionParams;

    const-string v1, "installerPackageName"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, p0, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_2
    return-object p2

    .line 110
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid installer package name"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
