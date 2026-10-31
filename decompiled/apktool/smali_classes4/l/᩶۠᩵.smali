.class public final Ll/᩶۠᩵;
.super Ljava/lang/Object;
.source "79A7"


# direct methods
.method public static ֫(III)V
    .locals 4

    const-string v0, "fromIndex: "

    if-ltz p0, :cond_1

    if-gt p1, p2, :cond_1

    if-gt p0, p1, :cond_0

    return-void

    .line 133
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, " > toIndex: "

    .line 0
    invoke-static {v0, p0, p1, v1}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 133
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 130
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ", toIndex: "

    const-string v3, ", size: "

    .line 0
    invoke-static {v0, p0, v2, v3, p1}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 130
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
