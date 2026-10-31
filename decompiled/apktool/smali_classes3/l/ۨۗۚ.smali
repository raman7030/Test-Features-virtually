.class public final enum Ll/ۨۗۚ;
.super Ljava/lang/Enum;
.source "47EO"


# static fields
.field public static final enum ۗ:Ll/ۨۗۚ;

.field public static final enum ۙ:Ll/ۨۗۚ;

.field public static final enum ᩶:Ll/ۨۗۚ;

.field public static final synthetic ᩹:[Ll/ۨۗۚ;


# instance fields
.field public final ᩸:Ll/۟ۗۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 97
    new-instance v0, Ll/ۨۗۚ;

    new-instance v1, Ll/ۡܽܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "SHORT"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ll/ۨۗۚ;-><init>(Ljava/lang/String;ILl/۟ۗۚ;)V

    sput-object v0, Ll/ۨۗۚ;->ۙ:Ll/ۨۗۚ;

    .line 98
    new-instance v0, Ll/ۨۗۚ;

    new-instance v1, Ll/ᩴۖܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "LONG"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Ll/ۨۗۚ;-><init>(Ljava/lang/String;ILl/۟ۗۚ;)V

    sput-object v0, Ll/ۨۗۚ;->᩶:Ll/ۨۗۚ;

    .line 99
    new-instance v0, Ll/ۨۗۚ;

    new-instance v1, Ll/ᩴۘܿ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "VERBOSE"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Ll/ۨۗۚ;-><init>(Ljava/lang/String;ILl/۟ۗۚ;)V

    sput-object v0, Ll/ۨۗۚ;->ۗ:Ll/ۨۗۚ;

    .line 96
    invoke-static {}, Ll/ۨۗۚ;->֫()[Ll/ۨۗۚ;

    move-result-object v0

    sput-object v0, Ll/ۨۗۚ;->᩹:[Ll/ۨۗۚ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILl/۟ۗۚ;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 104
    iput-object p3, p0, Ll/ۨۗۚ;->᩸:Ll/۟ۗۚ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۨۗۚ;
    .locals 1

    .line 96
    const-class v0, Ll/ۨۗۚ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۨۗۚ;

    return-object p0
.end method

.method public static values()[Ll/ۨۗۚ;
    .locals 1

    .line 96
    sget-object v0, Ll/ۨۗۚ;->᩹:[Ll/ۨۗۚ;

    invoke-virtual {v0}, [Ll/ۨۗۚ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۨۗۚ;

    return-object v0
.end method

.method public static synthetic ֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۨۗۚ;->ܳ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫()[Ll/ۨۗۚ;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/ۨۗۚ;

    .line 96
    sget-object v1, Ll/ۨۗۚ;->ۙ:Ll/ۨۗۚ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۨۗۚ;->᩶:Ll/ۨۗۚ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۨۗۚ;->ۗ:Ll/ۨۗۚ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static synthetic ۧ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۨۗۚ;->ܿ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ܳ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 99
    sget-object v0, Ll/᩸ۗۚ;->ۙ:Ll/᩸ۗۚ;

    if-ne p0, v0, :cond_0

    return-object p2

    .line 100
    :cond_0
    invoke-virtual {p0}, Ll/᩸ۗۚ;->ۧ()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p0, v0, p1

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const-string p0, "%-7s-%6s: %s"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ܽ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۨۗۚ;->ᩳ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ܿ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 98
    invoke-virtual {p0}, Ll/᩸ۗۚ;->֫()Ljava/lang/String;

    move-result-object p0

    const-string p1, ": "

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 97
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ֫(Ljava/lang/String;Ll/᩺ۗۚ;)Ljava/lang/String;
    .locals 2

    .line 112
    invoke-virtual {p2}, Ll/᩺ۗۚ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget-object v0, p0, Ll/ۨۗۚ;->᩸:Ll/۟ۗۚ;

    invoke-virtual {p2}, Ll/᩺ۗۚ;->֫()Ll/᩸ۗۚ;

    move-result-object v1

    invoke-virtual {p2}, Ll/᩺ۗۚ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, v1, p1, p2}, Ll/۟ۗۚ;->֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public varargs ֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-eqz p3, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 108
    :cond_0
    iget-object v0, p0, Ll/ۨۗۚ;->᩸:Ll/۟ۗۚ;

    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Ll/۟ۗۚ;->֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method
