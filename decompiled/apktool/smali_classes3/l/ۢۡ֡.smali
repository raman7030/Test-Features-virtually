.class public final enum Ll/ۢۡ֡;
.super Ljava/lang/Enum;
.source "L7IW"

# interfaces
.implements Ll/ᩳۡ֡;


# static fields
.field public static final synthetic ᩸:[Ll/ۢۡ֡;

.field public static final enum ᩹:Ll/ۢۡ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 34
    new-instance v0, Ll/ۢۡ֡;

    const-string v1, "OVERRIDE_READ_ONLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۢۡ֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۢۡ֡;->᩹:Ll/ۢۡ֡;

    .line 29
    invoke-static {}, Ll/ۢۡ֡;->֫()[Ll/ۢۡ֡;

    move-result-object v0

    sput-object v0, Ll/ۢۡ֡;->᩸:[Ll/ۢۡ֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۢۡ֡;
    .locals 1

    .line 29
    const-class v0, Ll/ۢۡ֡;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۢۡ֡;

    return-object p0
.end method

.method public static values()[Ll/ۢۡ֡;
    .locals 1

    .line 29
    sget-object v0, Ll/ۢۡ֡;->᩸:[Ll/ۢۡ֡;

    invoke-virtual {v0}, [Ll/ۢۡ֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۢۡ֡;

    return-object v0
.end method

.method public static synthetic ֫(Ll/ᩳۡ֡;)Z
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۢۡ֡;->ۧ(Ll/ᩳۡ֡;)Z

    move-result p0

    return p0
.end method

.method public static ֫([Ll/ᩳۡ֡;)Z
    .locals 2

    .line 45
    sget-object v0, Ll/᩹ۢ֡;->֫:[B

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 1756
    :cond_0
    array-length v1, p0

    :goto_0
    if-nez v1, :cond_1

    return v0

    .line 48
    :cond_1
    invoke-static {p0}, Ll/ܽ᩺ᩴ;->of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/᩷ۡ֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ֫()[Ll/ۢۡ֡;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ۢۡ֡;

    .line 29
    sget-object v1, Ll/ۢۡ֡;->᩹:Ll/ۢۡ֡;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static synthetic ۧ(Ll/ᩳۡ֡;)Z
    .locals 1

    .line 48
    sget-object v0, Ll/ۢۡ֡;->᩹:Ll/ۢۡ֡;

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
