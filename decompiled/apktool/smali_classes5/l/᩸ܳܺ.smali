.class public final Ll/᩸ܳܺ;
.super Ll/ۨܿܺ;
.source "7BD4"


# static fields
.field public static final ֫:Ll/᩸ܳܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ll/᩸ܳܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    sput-object v0, Ll/᩸ܳܺ;->֫:Ll/᩸ܳܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 1

    const/4 v0, 0x0

    .line 82
    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    .line 556
    invoke-virtual {p1, p2}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 1

    .line 73
    instance-of v0, p1, Ll/ᩴܳܺ;

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
