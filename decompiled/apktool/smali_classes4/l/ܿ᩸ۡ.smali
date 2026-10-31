.class public final Ll/ܿ᩸ۡ;
.super Ljava/lang/Object;
.source "Z97A"


# static fields
.field public static final ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Ll/ܿ᩸ۡ;->֫:I

    return-void
.end method
