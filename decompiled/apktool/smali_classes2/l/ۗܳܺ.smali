.class public final Ll/ۗܳܺ;
.super Ll/ۨܿܺ;
.source "MBBQ"


# static fields
.field public static final ֫:Ll/ۗܳܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ll/ۗܳܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    sput-object v0, Ll/ۗܳܺ;->֫:Ll/ۗܳܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    .line 47
    invoke-static {p1}, Ll/ۨܿܺ;->ᩳ(Ll/ۤܿܺ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 2

    .line 96
    move-object v0, p2

    check-cast v0, Ll/ۚܳܺ;

    invoke-virtual {v0}, Ll/ۚܳܺ;->ᩴ()I

    move-result v0

    const/4 v1, 0x0

    .line 98
    invoke-static {p2, v1}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    int-to-short v0, v0

    invoke-static {p1, p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۛۘܺ;SS)V

    return-void
.end method

.method public final ֫(Ll/ۚܳܺ;)Z
    .locals 1

    .line 85
    invoke-virtual {p1}, Ll/ۚܳܺ;->ᩴ()I

    move-result p1

    if-eqz p1, :cond_0

    int-to-short v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    .line 55
    invoke-static {p1}, Ll/ۨܿܺ;->ܽ(Ll/ۤܿܺ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 1

    .line 71
    instance-of v0, p1, Ll/ۚܳܺ;

    if-eqz v0, :cond_2

    .line 72
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    check-cast p1, Ll/ۚܳܺ;

    .line 77
    invoke-virtual {p1}, Ll/ۚܳܺ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Ll/ۗܳܺ;->֫(Ll/ۚܳܺ;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
