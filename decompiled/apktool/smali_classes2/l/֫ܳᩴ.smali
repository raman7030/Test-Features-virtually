.class public final synthetic Ll/֫ܳᩴ;
.super Ljava/lang/Object;
.source "52V"


# direct methods
.method public static ֫(Ll/ᩳܳᩴ;Ljava/lang/Integer;Ljava/lang/Byte;)Ljava/lang/Byte;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 122
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 123
    invoke-interface {p0, p1}, Ll/۟ܿᩴ;->֫(I)Z

    move-result v0

    .line 124
    invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B

    move-result p2

    invoke-interface {p0, p2, p1}, Ll/۟ܿᩴ;->֫(BI)B

    move-result p0

    if-eqz v0, :cond_0

    .line 125
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
