.class public final enum Ll/ܳᩴ֡;
.super Ljava/lang/Enum;
.source "L2E6"


# static fields
.field public static final enum ۙ:Ll/ܳᩴ֡;

.field public static final enum ᩶:Ll/ܳᩴ֡;

.field public static final synthetic ᩸:[Ll/ܳᩴ֡;

.field public static final enum ᩹:Ll/ܳᩴ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 35
    new-instance v0, Ll/ܳᩴ֡;

    const-string v1, "semiColonRequired"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܳᩴ֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܳᩴ֡;->ۙ:Ll/ܳᩴ֡;

    new-instance v1, Ll/ܳᩴ֡;

    const-string v3, "semiColonOptional"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ll/ܳᩴ֡;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll/ܳᩴ֡;->᩶:Ll/ܳᩴ֡;

    new-instance v3, Ll/ܳᩴ֡;

    const-string v5, "errorIfNoSemiColon"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ll/ܳᩴ֡;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll/ܳᩴ֡;->᩹:Ll/ܳᩴ֡;

    const/4 v5, 0x3

    new-array v5, v5, [Ll/ܳᩴ֡;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ll/ܳᩴ֡;->᩸:[Ll/ܳᩴ֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܳᩴ֡;
    .locals 1

    .line 35
    const-class v0, Ll/ܳᩴ֡;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܳᩴ֡;

    return-object p0
.end method

.method public static values()[Ll/ܳᩴ֡;
    .locals 1

    .line 35
    sget-object v0, Ll/ܳᩴ֡;->᩸:[Ll/ܳᩴ֡;

    invoke-virtual {v0}, [Ll/ܳᩴ֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܳᩴ֡;

    return-object v0
.end method
