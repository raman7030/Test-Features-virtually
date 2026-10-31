.class public final Ll/۬ۢ֨;
.super Ljava/lang/Object;
.source "R4WE"


# static fields
.field public static ֫:Landroid/content/Context;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# direct methods
.method public static ֫()V
    .locals 3

    const-string v0, "pl_droidsonroids_gif"

    .line 49
    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 33
    :catch_0
    sget-object v0, Ll/۬ۢ֨;->֫:Landroid/content/Context;

    if-nez v0, :cond_0

    :try_start_1
    const-string v0, "android.app.ActivityThread"

    .line 36
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "currentApplication"

    const/4 v2, 0x0

    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 39
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sput-object v0, Ll/۬ۢ֨;->֫:Landroid/content/Context;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 41
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 44
    :cond_0
    :goto_0
    sget-object v0, Ll/۬ۢ֨;->֫:Landroid/content/Context;

    .line 51
    invoke-static {v0}, Ll/᩺֨ܺ;->֫(Landroid/content/Context;)V

    return-void
.end method
