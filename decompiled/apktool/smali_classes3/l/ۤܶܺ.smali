.class public final Ll/ۤܶܺ;
.super Ljava/lang/Object;
.source "S4VX"


# direct methods
.method public static ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-gt p0, v1, :cond_3

    if-ltz p0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    if-nez p0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    return-object p1

    .line 190
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v0

    const-string p0, "invalid count: %s"

    invoke-static {p0, v1}, Ll/ۤܶܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 153
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    int-to-long v2, v1

    int-to-long v4, p0

    mul-long v2, v2, v4

    long-to-int p0, v2

    int-to-long v4, p0

    cmp-long v6, v4, v2

    if-nez v6, :cond_5

    .line 160
    new-array v2, p0, [C

    .line 161
    invoke-virtual {p1, v0, v1, v2, v0}, Ljava/lang/String;->getChars(II[CI)V

    :goto_1
    sub-int p1, p0, v1

    if-ge v1, p1, :cond_4

    .line 164
    invoke-static {v2, v0, v2, v1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    shl-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 166
    :cond_4
    invoke-static {v2, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 167
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    return-object p0

    .line 157
    :cond_5
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p1, "Required array size too large: "

    .line 0
    invoke-static {v2, v3, p1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 157
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    if-nez p0, :cond_0

    const-string p0, "null"

    return-object p0

    .line 303
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 306
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 307
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "com.google.common.base.Strings"

    .line 309
    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Exception during lenientFormat for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 310
    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v1, "<"

    const-string v2, " threw "

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ">"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 262
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 269
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    array-length v2, p1

    mul-int/lit8 v2, v2, 0x10

    add-int/2addr v2, v1

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 272
    :goto_0
    array-length v3, p1

    if-ge v1, v3, :cond_1

    const-string v3, "%s"

    .line 273
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    goto :goto_1

    .line 277
    :cond_0
    invoke-virtual {v0, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v1, 0x1

    .line 278
    aget-object v1, p1, v1

    invoke-static {v1}, Ll/ۤܶܺ;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v3, 0x2

    move v5, v2

    move v2, v1

    move v1, v5

    goto :goto_0

    .line 281
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 284
    array-length p0, p1

    if-ge v1, p0, :cond_3

    const-string p0, " ["

    .line 286
    :goto_2
    array-length v2, p1

    if-ge v1, v2, :cond_2

    .line 287
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    aget-object p0, p1, v1

    invoke-static {p0}, Ll/ۤܶܺ;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    const-string p0, ", "

    goto :goto_2

    :cond_2
    const/16 p0, 0x5d

    .line 291
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 294
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
