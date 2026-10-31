.class public final synthetic Ll/ۤۢᩴ;
.super Ljava/lang/Object;
.source "J18G"


# direct methods
.method public static ֫(Ll/ۛۢᩴ;Ljava/util/function/IntConsumer;)Ll/۫ۢᩴ;
    .locals 1

    .line 61
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    new-instance v0, Ll/۫ۢᩴ;

    invoke-direct {v0, p0, p1}, Ll/۫ۢᩴ;-><init>(Ll/ۛۢᩴ;Ljava/util/function/IntConsumer;)V

    return-object v0
.end method

.method public static ֫(Ll/ۛۢᩴ;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛۢᩴ;Ljava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 35
    check-cast p1, Ljava/lang/Integer;

    invoke-interface {p0, p1}, Ll/ۛۢᩴ;->ܽ(Ljava/lang/Integer;)V

    return-void
.end method
