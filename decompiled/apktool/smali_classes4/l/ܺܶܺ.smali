.class public final Ll/ܺܶܺ;
.super Ljava/lang/Object;
.source "55BL"


# direct methods
.method public static ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    return-object p1

    .line 67
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Both parameters are null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/Object;)Ll/ۡܶܺ;
    .locals 1

    .line 111
    new-instance v0, Ll/ۡܶܺ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۡܶܺ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
