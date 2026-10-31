.class public final Ll/ۧ۫ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static checkFromIndexSize(III)I
    .locals 2

    or-int v0, p2, p0

    or-int/2addr v0, p1

    if-ltz v0, :cond_0

    sub-int v0, p2, p0

    if-gt p1, v0, :cond_0

    return p0

    .line 82
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const-string p0, "checkFromIndexSize"

    invoke-static {p0, v0}, Ll/᩺ۚᩴ;->U(Ljava/lang/String;[Ljava/lang/Integer;)Ljava/lang/RuntimeException;

    move-result-object p0

    .line 343
    throw p0
.end method

.method public static checkFromToIndex(III)I
    .locals 2

    if-ltz p0, :cond_0

    if-gt p0, p1, :cond_0

    if-gt p1, p2, :cond_0

    return p0

    .line 76
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const-string p0, "checkFromToIndex"

    invoke-static {p0, v0}, Ll/᩺ۚᩴ;->U(Ljava/lang/String;[Ljava/lang/Integer;)Ljava/lang/RuntimeException;

    move-result-object p0

    .line 295
    throw p0
.end method

.method public static checkIndex(II)I
    .locals 2

    if-ltz p0, :cond_0

    if-ge p0, p1, :cond_0

    return p0

    .line 70
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const-string p0, "checkIndex"

    invoke-static {p0, v0}, Ll/᩺ۚᩴ;->U(Ljava/lang/String;[Ljava/lang/Integer;)Ljava/lang/RuntimeException;

    move-result-object p0

    .line 248
    throw p0
.end method

.method public static equals(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static varargs hash([Ljava/lang/Object;)I
    .locals 0

    .line 144
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static hashCode(Ljava/lang/Object;)I
    .locals 0

    if-eqz p0, :cond_0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static nonNull(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 219
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public static requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    if-eqz p0, :cond_0

    return-object p0

    .line 244
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static requireNonNull(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;
    .locals 0

    if-nez p0, :cond_1

    .line 344
    new-instance p0, Ljava/lang/NullPointerException;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 345
    :cond_0
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :goto_0
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0
.end method

.method public static requireNonNullElse(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "defaultObj"

    .line 299
    invoke-static {p1, p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static requireNonNullElseGet(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;
    .locals 0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "supplier"

    .line 319
    invoke-static {p1, p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/function/Supplier;

    invoke-interface {p0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p0

    const-string p1, "supplier.get()"

    invoke-static {p0, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static toString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 158
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    .line 175
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method
