.class public final Ll/᩵ܿۧ;
.super Ljava/lang/Object;
.source "C7M1"


# direct methods
.method public static ֫(Ll/ۢܿۧ;)Ll/ܰܿۧ;
    .locals 6

    .line 118
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 119
    invoke-interface {p0}, Ll/ᩴܿۧ;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 122
    invoke-interface {p0, v3, v0, v1}, Ll/ۢܿۧ;->֫(IJ)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 126
    :cond_1
    new-instance p0, Ll/ܰܿۧ;

    invoke-direct {p0, v2, v4}, Ll/ܰܿۧ;-><init>(II)V

    return-object p0
.end method
