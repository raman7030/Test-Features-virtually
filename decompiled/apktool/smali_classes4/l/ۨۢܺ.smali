.class public final enum Ll/ۨۢܺ;
.super Ljava/lang/Enum;
.source "65AK"

# interfaces
.implements Ll/֡ᩴܺ;


# static fields
.field public static final enum ۗ:Ll/ۨۢܺ;

.field public static final enum ۙ:Ll/ۨۢܺ;

.field public static final enum ۬:Ll/ۨۢܺ;

.field public static final enum ᩶:Ll/ۨۢܺ;

.field public static final synthetic ᩹:[Ll/ۨۢܺ;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 25
    new-instance v0, Ll/ۨۢܺ;

    const/4 v1, 0x0

    const-string v2, "runtime"

    const-string v3, "RUNTIME"

    invoke-direct {v0, v3, v1, v2}, Ll/ۨۢܺ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ۨۢܺ;->ۗ:Ll/ۨۢܺ;

    .line 26
    new-instance v0, Ll/ۨۢܺ;

    const/4 v1, 0x1

    const-string v2, "build"

    const-string v3, "BUILD"

    invoke-direct {v0, v3, v1, v2}, Ll/ۨۢܺ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ۨۢܺ;->᩶:Ll/ۨۢܺ;

    .line 27
    new-instance v0, Ll/ۨۢܺ;

    const/4 v1, 0x2

    const-string v2, "system"

    const-string v3, "SYSTEM"

    invoke-direct {v0, v3, v1, v2}, Ll/ۨۢܺ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ۨۢܺ;->۬:Ll/ۨۢܺ;

    .line 28
    new-instance v0, Ll/ۨۢܺ;

    const/4 v1, 0x3

    const-string v2, "embedded"

    const-string v3, "EMBEDDED"

    invoke-direct {v0, v3, v1, v2}, Ll/ۨۢܺ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ۨۢܺ;->ۙ:Ll/ۨۢܺ;

    .line 24
    invoke-static {}, Ll/ۨۢܺ;->ۧ()[Ll/ۨۢܺ;

    move-result-object v0

    sput-object v0, Ll/ۨۢܺ;->᩹:[Ll/ۨۢܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 41
    iput-object p3, p0, Ll/ۨۢܺ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۨۢܺ;
    .locals 1

    .line 24
    const-class v0, Ll/ۨۢܺ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۨۢܺ;

    return-object p0
.end method

.method public static values()[Ll/ۨۢܺ;
    .locals 1

    .line 24
    sget-object v0, Ll/ۨۢܺ;->᩹:[Ll/ۨۢܺ;

    invoke-virtual {v0}, [Ll/ۨۢܺ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۨۢܺ;

    return-object v0
.end method

.method public static synthetic ۧ()[Ll/ۨۢܺ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ۨۢܺ;

    .line 24
    sget-object v1, Ll/ۨۢܺ;->ۗ:Ll/ۨۢܺ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۨۢܺ;->᩶:Ll/ۨۢܺ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۨۢܺ;->۬:Ll/ۨۢܺ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۨۢܺ;->ۙ:Ll/ۨۢܺ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۨۢܺ;->᩸:Ljava/lang/String;

    return-object v0
.end method
