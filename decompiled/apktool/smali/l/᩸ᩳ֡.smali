.class public final Ll/᩸ᩳ֡;
.super Ljava/lang/Object;
.source "R5PD"


# static fields
.field public static final ֫:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    .line 22
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ll/᩸ᩳ֡;->֫:Ljava/nio/charset/Charset;

    return-void
.end method

.method public static ֫(JJJ)V
    .locals 5

    or-long v0, p2, p4

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    cmp-long v0, p2, p0

    if-gtz v0, :cond_0

    sub-long v0, p0, p2

    cmp-long v2, v0, p4

    if-ltz v2, :cond_0

    return-void

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "size="

    const-string v2, " offset="

    .line 0
    invoke-static {v1, v2, p0, p1}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 30
    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " byteCount="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
