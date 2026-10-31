.class public final synthetic Ll/ۙ᩵ᩴ;
.super Ljava/lang/Object;
.source "NJN"

# interfaces
.implements Ll/۠ۚ֫;


# direct methods
.method public static bridge synthetic ֫(Landroid/graphics/Insets;)I
    .locals 0

    .line 0
    iget p0, p0, Landroid/graphics/Insets;->top:I

    return p0
.end method

.method public static ֫(Ll/۫᩵ᩴ;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 2

    .line 425
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 429
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 430
    :cond_0
    invoke-interface {p3, v0, p2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_1

    .line 432
    invoke-interface {p0, p1}, Ll/۫᩵ᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    return-object p0

    .line 439
    :cond_1
    invoke-interface {p0, p1, p2}, Ll/۫᩵ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public static ֫(Ll/۫᩵ᩴ;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 3

    .line 393
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 395
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const/4 v2, 0x0

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v2

    .line 396
    :goto_2
    invoke-interface {p2, p1, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_4

    if-eqz v1, :cond_3

    .line 398
    invoke-interface {p0, p1}, Ll/۫᩵ᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v2

    .line 401
    :cond_4
    invoke-interface {p0, p1, p2}, Ll/۫᩵ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ljava/lang/Object;)Z
    .locals 0

    .line 0
    instance-of p0, p0, Landroid/media/MediaDrmResetException;

    return p0
.end method

.method public static ۧ(Ll/۫᩵ᩴ;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 3

    .line 362
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 364
    invoke-interface {p0, p1}, Ll/ۢ᩺ۘ;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    .line 365
    :cond_0
    invoke-interface {p2, p1, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_1

    .line 367
    invoke-interface {p0, p1}, Ll/۫᩵ᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    .line 370
    :cond_1
    invoke-interface {p0, p1, p2}, Ll/۫᩵ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 608
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
