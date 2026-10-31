.class public final Ll/ᩳ᩺ܺ;
.super Ljava/lang/Object;
.source "658Z"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 662
    new-instance v0, Ll/ܽ᩺ܺ;

    .line 663
    invoke-direct {v0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;[BII)V
    .locals 3

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p3, :cond_3

    add-int v0, p2, p3

    .line 944
    array-length v1, p1

    invoke-static {p2, v0, v1}, Ll/ۘܶܺ;->֫(III)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    add-int v1, p2, v0

    sub-int v2, p3, v0

    .line 947
    invoke-virtual {p0, p1, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne v0, p3, :cond_2

    return-void

    .line 816
    :cond_2
    new-instance p0, Ljava/io/EOFException;

    const-string p1, " bytes; "

    const-string p2, " bytes expected"

    const-string v1, "reached end of stream after reading "

    .line 0
    invoke-static {v1, v0, p1, p2, p3}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 816
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 942
    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string p1, "len ("

    const-string p2, ") cannot be negative"

    .line 0
    invoke-static {p3, p1, p2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 942
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/io/InputStream;)[B
    .locals 8

    .line 242
    new-instance v0, Ljava/util/ArrayDeque;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    const/4 v1, 0x0

    .line 179
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    const/16 v2, 0x80

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/16 v2, 0x2000

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    const v4, 0x7ffffff7

    if-ge v2, v4, :cond_3

    sub-int/2addr v4, v2

    .line 188
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    new-array v5, v4, [B

    .line 189
    invoke-virtual {v0, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_1

    sub-int v7, v4, v6

    .line 193
    invoke-virtual {p0, v5, v6, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    if-ne v7, v3, :cond_0

    .line 195
    invoke-static {v0, v2}, Ll/ᩳ᩺ܺ;->֫(Ljava/util/ArrayDeque;I)[B

    move-result-object p0

    return-object p0

    :cond_0
    add-int/2addr v6, v7

    add-int/2addr v2, v7

    goto :goto_1

    :cond_1
    const/16 v3, 0x1000

    if-ge v1, v3, :cond_2

    const/4 v3, 0x4

    goto :goto_2

    :cond_2
    const/4 v3, 0x2

    :goto_2
    int-to-long v4, v1

    int-to-long v6, v3

    mul-long v4, v4, v6

    .line 561
    invoke-static {v4, v5}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v1

    goto :goto_0

    .line 203
    :cond_3
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-ne p0, v3, :cond_4

    .line 205
    invoke-static {v0, v4}, Ll/ᩳ᩺ܺ;->֫(Ljava/util/ArrayDeque;I)[B

    move-result-object p0

    return-object p0

    .line 207
    :cond_4
    new-instance p0, Ljava/lang/OutOfMemoryError;

    const-string v0, "input is too large to fit in a byte array"

    invoke-direct {p0, v0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/util/ArrayDeque;I)[B
    .locals 6

    .line 212
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array p0, v1, [B

    return-object p0

    .line 215
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 216
    array-length v2, v0

    if-ne v2, p1, :cond_1

    return-object v0

    .line 219
    :cond_1
    array-length v2, v0

    sub-int v2, p1, v2

    .line 220
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    :goto_0
    if-lez v2, :cond_2

    .line 222
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 223
    array-length v4, v3

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int v5, p1, v2

    .line 225
    invoke-static {v3, v1, v0, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v2, v4

    goto :goto_0

    :cond_2
    return-object v0
.end method
