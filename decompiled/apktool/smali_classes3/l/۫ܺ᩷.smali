.class public Ll/۫ܺ᩷;
.super Landroid/app/Application;
.source "59KE"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "mtprotect"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const-string v0, "Landroid/"

    const-string v1, "Lcom/android/"

    .line 14
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۨ᩹ۚ;->֫([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method

.method public static native ۜۤܳ(I)V
.end method
