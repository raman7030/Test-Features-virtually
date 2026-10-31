.class public final Ll/۬۟;
.super Ljava/lang/Object;
.source "33S4"


# direct methods
.method public static ֫(Ll/᩺ۢ;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .line 362
    new-instance v0, Ll/֫ܶܽ;

    invoke-direct {v0, p0}, Ll/֫ܶܽ;-><init>(Ljava/lang/Object;)V

    .line 278
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt p0, v1, :cond_0

    .line 280
    new-instance p0, Ll/ۙ۟;

    invoke-direct {p0, p1, v0}, Ll/ۙ۟;-><init>(Landroid/view/inputmethod/InputConnection;Ll/֫ܶܽ;)V

    return-object p0

    .line 293
    :cond_0
    invoke-static {p2}, Ll/᩶۟;->֫(Landroid/view/inputmethod/EditorInfo;)[Ljava/lang/String;

    move-result-object p0

    .line 294
    array-length p0, p0

    if-nez p0, :cond_1

    return-object p1

    .line 298
    :cond_1
    new-instance p0, Ll/ۗ۟;

    invoke-direct {p0, p1, v0}, Ll/ۗ۟;-><init>(Landroid/view/inputmethod/InputConnection;Ll/֫ܶܽ;)V

    return-object p0
.end method
