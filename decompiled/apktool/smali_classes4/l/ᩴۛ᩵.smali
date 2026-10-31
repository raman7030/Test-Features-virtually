.class public final Ll/ᩴۛ᩵;
.super Ljava/lang/Object;
.source "QAY3"


# direct methods
.method public static ֫(ILjava/lang/Throwable;)V
    .locals 0

    and-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_0

    const/4 p1, 0x0

    :cond_0
    if-eqz p1, :cond_1

    .line 78
    throw p1

    .line 81
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
