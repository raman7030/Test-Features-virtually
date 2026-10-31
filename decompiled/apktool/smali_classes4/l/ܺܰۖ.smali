.class public final Ll/ܺܰۖ;
.super Ljava/lang/Object;
.source "DACT"


# static fields
.field public static ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 23
    sput-object v0, Ll/ܺܰۖ;->֫:[B

    return-void
.end method

.method public static ֫(Ll/۫ܰۖ;[BI)I
    .locals 2

    if-eqz p1, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    sget-object p1, Ll/ܺܰۖ;->֫:[B

    .line 34
    :goto_0
    array-length v0, p1

    invoke-virtual {p0, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 35
    array-length v0, p1

    invoke-virtual {p0, v0}, Ll/ۤܰۖ;->ۧ(I)V

    int-to-long v0, p2

    .line 36
    invoke-virtual {p0, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 37
    array-length p0, p1

    add-int/2addr p2, p0

    return p2
.end method
