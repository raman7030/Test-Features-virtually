.class public final synthetic Ll/ᩴۛᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static $default$andThen(Ljava/util/function/LongUnaryOperator;Ljava/util/function/LongUnaryOperator;)Ljava/util/function/LongUnaryOperator;
    .locals 2

    .line 83
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    new-instance v0, Ll/۫ۛᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/۫ۛᩴ;-><init>(Ljava/util/function/LongUnaryOperator;Ljava/util/function/LongUnaryOperator;I)V

    return-object v0
.end method

.method public static $default$compose(Ljava/util/function/LongUnaryOperator;Ljava/util/function/LongUnaryOperator;)Ljava/util/function/LongUnaryOperator;
    .locals 2

    .line 65
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    new-instance v0, Ll/۫ۛᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Ll/۫ۛᩴ;-><init>(Ljava/util/function/LongUnaryOperator;Ljava/util/function/LongUnaryOperator;I)V

    return-object v0
.end method
