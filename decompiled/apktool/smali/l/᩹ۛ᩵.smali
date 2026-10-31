.class public final synthetic Ll/᩹ۛ᩵;
.super Ljava/lang/Object;
.source "1AXW"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 11
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Ll/᩹ۛ᩵;->ۧ:I

    return-void
.end method

.method public static final ֫()I
    .locals 1

    .line 11
    sget v0, Ll/᩹ۛ᩵;->ۧ:I

    return v0
.end method
