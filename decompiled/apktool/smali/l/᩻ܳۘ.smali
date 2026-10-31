.class public final Ll/᩻ܳۘ;
.super Ljava/lang/Object;
.source "01M8"


# direct methods
.method public static ֫(IILjava/util/List;)Ll/֫ܳۘ;
    .locals 1

    .line 87
    new-instance v0, Ll/ܺܳۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܺܳۘ;-><init>(IILjava/util/List;)V

    .line 101
    new-instance p0, Ll/ۢܳۘ;

    invoke-direct {p0, v0}, Ll/ۢܳۘ;-><init>(Ll/֫ܳۘ;)V

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;II)Ll/֫ܳۘ;
    .locals 1

    .line 87
    new-instance v0, Ll/ܺܳۘ;

    invoke-direct {v0, p1, p2, p0}, Ll/ܺܳۘ;-><init>(IILjava/util/List;)V

    return-object v0
.end method

.method public static ֫(Ll/ۜܳۘ;IIII)Ll/֫ܳۘ;
    .locals 7

    .line 116
    new-instance v6, Ll/ۘܳۘ;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Ll/ۘܳۘ;-><init>(Ll/ۜܳۘ;IIII)V

    return-object v6
.end method

.method public static ֫(Ljava/util/List;Ljava/util/List;Ll/ۙܳۘ;)Ll/ۜܳۘ;
    .locals 1

    .line 64
    invoke-interface {p0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object p1

    .line 46
    invoke-virtual {p2}, Ll/ۙܳۘ;->ۧ()V

    .line 50
    :try_start_0
    invoke-static {p0, p1}, Ll/᩺ܳۘ;->֫([Ljava/lang/Object;[Ljava/lang/Object;)Ll/ۛܳۘ;

    move-result-object p2

    .line 51
    array-length p0, p0

    array-length p1, p1

    .line 73
    new-instance v0, Ll/᩺ܿۘ;

    invoke-direct {v0, p2, p0, p1}, Ll/᩺ܿۘ;-><init>(Ll/ۛܳۘ;II)V

    .line 51
    invoke-static {v0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object p0
    :try_end_0
    .catch Ll/ܰܳۘ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 53
    :catch_0
    new-instance p0, Ll/ܶܿۘ;

    .line 32
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 53
    throw p0
.end method

.method public static ֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;
    .locals 1

    .line 108
    instance-of v0, p0, Ll/ۜܳۘ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۜܳۘ;

    return-object p0

    .line 109
    :cond_0
    new-instance v0, Ll/᩷ܳۘ;

    invoke-direct {v0, p0}, Ll/᩷ܳۘ;-><init>(Ll/֫ܳۘ;)V

    return-object v0
.end method

.method public static ֫([I[ILl/ۙܳۘ;)Ll/ۜܳۘ;
    .locals 1

    .line 29
    invoke-virtual {p2}, Ll/ۙܳۘ;->ۧ()V

    .line 33
    :try_start_0
    invoke-static {p0, p1}, Ll/᩺ܳۘ;->֫([I[I)Ll/ۛܳۘ;

    move-result-object p2

    .line 34
    array-length p0, p0

    array-length p1, p1

    .line 73
    new-instance v0, Ll/᩺ܿۘ;

    invoke-direct {v0, p2, p0, p1}, Ll/᩺ܿۘ;-><init>(Ll/ۛܳۘ;II)V

    .line 34
    invoke-static {v0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object p0
    :try_end_0
    .catch Ll/ܰܳۘ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 36
    :catch_0
    new-instance p0, Ll/ܶܿۘ;

    .line 32
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 36
    throw p0
.end method
