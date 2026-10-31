.class public final Ll/۠ۛ᩵;
.super Ljava/lang/Object;
.source "4AM6"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 22
    :try_start_0
    const-class v0, Ll/ۖ᩸᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 21
    invoke-static {v0}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object v0

    .line 23
    :goto_0
    invoke-static {v0}, Ll/ۘ۠᩵;->֫(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "kotlin.coroutines.jvm.internal.BaseContinuationImpl"

    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 26
    :try_start_1
    const-class v0, Ll/۠ۛ᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    .line 25
    invoke-static {v0}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object v0

    .line 27
    :goto_2
    invoke-static {v0}, Ll/ۘ۠᩵;->֫(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_3

    :cond_1
    const-string v0, "kotlinx.coroutines.internal.StackTraceRecoveryKt"

    :goto_3
    check-cast v0, Ljava/lang/String;

    return-void
.end method
