.class public final Ll/ܺ᩶᩵;
.super Ljava/lang/ThreadLocal;
.source "PAX3"


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 1

    .line 53
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    return-object v0
.end method
