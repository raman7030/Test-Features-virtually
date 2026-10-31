.class public final Ll/ܶۚܳ;
.super Ll/֫ۜܳ;
.source "Y1XG"


# static fields
.field public static final ۗ:Ll/ܶۚܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 8
    new-instance v0, Ll/ܶۚܳ;

    const v1, 0x7f1205ae

    const v2, 0x7f0801cf

    .line 15
    invoke-direct {v0, v1, v2}, Ll/֫ۜܳ;-><init>(II)V

    .line 8
    sput-object v0, Ll/ܶۚܳ;->ۗ:Ll/ܶۚܳ;

    return-void
.end method

.method public static ᩻()Ll/ܶۚܳ;
    .locals 1

    .line 11
    sget-object v0, Ll/ܶۚܳ;->ۗ:Ll/ܶۚܳ;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/֫ۜܳ;)Ll/֫ۜܳ;
    .locals 1

    .line 20
    sget-object v0, Ll/ܶۚܳ;->ۗ:Ll/ܶۚܳ;

    if-eq p0, v0, :cond_0

    .line 23
    invoke-super {p0, p1}, Ll/֫ۜܳ;->֫(Ll/֫ۜܳ;)Ll/֫ۜܳ;

    return-object p0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 0

    .line 33
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
