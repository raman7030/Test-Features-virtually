.class public final enum Ll/ۛۧۖ;
.super Ll/۟ۧۖ;
.source "17QY"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "TYPE"

    const/4 v1, 0x1

    .line 0
    invoke-direct {p0, v0, v1, v1}, Ll/ۛۧۖ;-><init>(Ljava/lang/String;IZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 1

    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, p1, p2, v0, p3}, Ll/۟ۧۖ;-><init>(Ljava/lang/String;IIZ)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/۫ۧۖ;)Ll/۟ۧۖ;
    .locals 1

    .line 64
    sget-object v0, Ll/۬ۧۖ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 70
    sget-object p1, Ll/۟ۧۖ;->۫:Ll/۟ۧۖ;

    return-object p1

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 68
    :cond_1
    sget-object p1, Ll/۟ۧۖ;->ۙ:Ll/۟ۧۖ;

    return-object p1
.end method
