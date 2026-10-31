.class public abstract Ll/ᩳ᩺ۘ;
.super Ljava/lang/Object;
.source "28YN"


# static fields
.field public static ֫:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 18
    :try_start_0
    sget v0, Ll/֫ۢ֨;->ܳ֫:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    sput-boolean v0, Ll/ᩳ᩺ۘ;->֫:Z

    return-void
.end method

.method public static ֫()Z
    .locals 1

    .line 30
    sget-boolean v0, Ll/ᩳ᩺ۘ;->֫:Z

    return v0
.end method
