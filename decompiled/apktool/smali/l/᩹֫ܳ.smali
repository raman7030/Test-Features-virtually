.class public final Ll/᩹֫ܳ;
.super Ljava/lang/IllegalArgumentException;
.source "970S"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Hex clipboard selection exceeds 32 MiB"

    .line 7
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-void
.end method
