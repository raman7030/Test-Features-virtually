.class public final Ll/᩹ۚܳ;
.super Ll/֫ۜܳ;
.source "J1YV"


# static fields
.field public static final ۗ:Ll/᩹ۚܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 8
    new-instance v0, Ll/᩹ۚܳ;

    invoke-direct {v0}, Ll/᩹ۚܳ;-><init>()V

    sput-object v0, Ll/᩹ۚܳ;->ۗ:Ll/᩹ۚܳ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205c2

    const v1, 0x7f0801e3

    .line 15
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    .line 16
    invoke-virtual {p0}, Ll/֫ۜܳ;->֫()V

    return-void
.end method

.method public static ᩻()Ll/᩹ۚܳ;
    .locals 1

    .line 11
    sget-object v0, Ll/᩹ۚܳ;->ۗ:Ll/᩹ۚܳ;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/֫ۜܳ;)Ll/֫ۜܳ;
    .locals 1

    .line 21
    sget-object v0, Ll/᩹ۚܳ;->ۗ:Ll/᩹ۚܳ;

    if-eq p0, v0, :cond_0

    .line 24
    invoke-super {p0, p1}, Ll/֫ۜܳ;->֫(Ll/֫ۜܳ;)Ll/֫ۜܳ;

    return-object p0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 0

    .line 34
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
