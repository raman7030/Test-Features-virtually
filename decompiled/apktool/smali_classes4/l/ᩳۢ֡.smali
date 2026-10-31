.class public final Ll/ᩳۢ֡;
.super Ljava/lang/Object;
.source "R8FH"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 40
    sget-object v0, Ll/ۘ᩹ᩴ;->EPOCH:Ll/ۘ᩹ᩴ;

    invoke-static {v0}, Ll/ۙ۠ᩴ;->from(Ll/ۘ᩹ᩴ;)Ll/ۙ۠ᩴ;

    .line 57
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 62
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    return-void
.end method
