.class public final Ll/ܳܺ֡;
.super Ll/ۛۡ֡;
.source "O7II"


# static fields
.field public static final synthetic ۬:I


# virtual methods
.method public final write([BII)V
    .locals 2

    if-ltz p2, :cond_1

    .line 213
    array-length v0, p1

    if-gt p2, v0, :cond_1

    if-ltz p3, :cond_1

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_1

    if-ltz v0, :cond_1

    if-nez p3, :cond_0

    return-void

    .line 219
    :cond_0
    invoke-virtual {p0, p2, p3, p1}, Ll/ۛۡ֡;->ܿ(II[B)V

    return-void

    .line 214
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 p2, 0x1

    aput-object p3, v0, p2

    const-string p2, "offset=%,d, length=%,d"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()[B
    .locals 1

    .line 196
    invoke-virtual {p0}, Ll/ۛۡ֡;->ܽ()[B

    move-result-object v0

    return-object v0
.end method
