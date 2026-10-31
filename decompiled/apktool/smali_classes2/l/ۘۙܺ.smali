.class public final enum Ll/ۘۙܺ;
.super Ljava/lang/Enum;
.source "85L9"


# static fields
.field public static final enum ۙ:Ll/ۘۙܺ;

.field public static final enum ᩶:Ll/ۘۙܺ;

.field public static final synthetic ᩹:[Ll/ۘۙܺ;


# instance fields
.field public final ᩸:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 29
    new-instance v0, Ll/ۘۙܺ;

    const-string v1, "OPEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/ۘۙܺ;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ll/ۘۙܺ;->ۙ:Ll/ۘۙܺ;

    .line 30
    new-instance v0, Ll/ۘۙܺ;

    const-string v1, "CLOSED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ll/ۘۙܺ;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ll/ۘۙܺ;->᩶:Ll/ۘۙܺ;

    .line 26
    invoke-static {}, Ll/ۘۙܺ;->֫()[Ll/ۘۙܺ;

    move-result-object v0

    sput-object v0, Ll/ۘۙܺ;->᩹:[Ll/ۘۙܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 35
    iput-boolean p3, p0, Ll/ۘۙܺ;->᩸:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۘۙܺ;
    .locals 1

    .line 26
    const-class v0, Ll/ۘۙܺ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۘۙܺ;

    return-object p0
.end method

.method public static values()[Ll/ۘۙܺ;
    .locals 1

    .line 26
    sget-object v0, Ll/ۘۙܺ;->᩹:[Ll/ۘۙܺ;

    invoke-virtual {v0}, [Ll/ۘۙܺ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۘۙܺ;

    return-object v0
.end method

.method public static ֫(Z)Ll/ۘۙܺ;
    .locals 0

    if-eqz p0, :cond_0

    .line 40
    sget-object p0, Ll/ۘۙܺ;->᩶:Ll/ۘۙܺ;

    return-object p0

    :cond_0
    sget-object p0, Ll/ۘۙܺ;->ۙ:Ll/ۘۙܺ;

    return-object p0
.end method

.method public static synthetic ֫()[Ll/ۘۙܺ;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/ۘۙܺ;

    .line 26
    sget-object v1, Ll/ۘۙܺ;->ۙ:Ll/ۘۙܺ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۘۙܺ;->᩶:Ll/ۘۙܺ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method
