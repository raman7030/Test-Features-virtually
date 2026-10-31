.class public final synthetic Ll/ۤۨᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static varargs of(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Ll/ۛۨᩴ;)Ll/ۨۨᩴ;
    .locals 7

    .line 296
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    invoke-static {p4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    sget-object v0, Ll/᩺ۨᩴ;->c:Ljava/util/Set;

    .line 302
    array-length v1, p4

    if-lez v1, :cond_0

    .line 303
    const-class v0, Ll/ۛۨᩴ;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 304
    invoke-static {v0, p4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 305
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    :cond_0
    move-object v6, v0

    .line 307
    new-instance p4, Ll/ۖۧ᩵;

    move-object v1, p4

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;Ljava/util/Set;)V

    return-object p4
.end method

.method public static varargs of(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;[Ll/ۛۨᩴ;)Ll/ۨۨᩴ;
    .locals 1

    .line 264
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    array-length v0, p3

    if-nez v0, :cond_0

    .line 269
    sget-object p3, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    goto :goto_0

    .line 270
    :cond_0
    sget-object v0, Ll/ۛۨᩴ;->IDENTITY_FINISH:Ll/ۛۨᩴ;

    invoke-static {v0, p3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p3

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p3

    .line 272
    :goto_0
    new-instance v0, Ll/ۖۧ᩵;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۖۧ᩵;-><init>(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object v0
.end method
