.class public final enum Ll/ᩴۨۚ;
.super Ljava/lang/Enum;
.source "O7F0"


# static fields
.field public static final enum ۗ:Ll/ᩴۨۚ;

.field public static final enum ۙ:Ll/ᩴۨۚ;

.field public static final enum ۬:Ll/ᩴۨۚ;

.field public static final enum ᩶:Ll/ᩴۨۚ;

.field public static final synthetic ᩹:[Ll/ᩴۨۚ;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 93
    new-instance v0, Ll/ᩴۨۚ;

    const/4 v1, 0x0

    const-string v2, "@+"

    const-string v3, "Visible"

    invoke-direct {v0, v3, v1, v2}, Ll/ᩴۨۚ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ᩴۨۚ;->ۗ:Ll/ᩴۨۚ;

    .line 94
    new-instance v0, Ll/ᩴۨۚ;

    const/4 v1, 0x1

    const-string v2, "@-"

    const-string v3, "Invisible"

    invoke-direct {v0, v3, v1, v2}, Ll/ᩴۨۚ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ᩴۨۚ;->᩶:Ll/ᩴۨۚ;

    .line 95
    new-instance v0, Ll/ᩴۨۚ;

    const/4 v1, 0x2

    const-string v2, "@T+"

    const-string v3, "VisibleType"

    invoke-direct {v0, v3, v1, v2}, Ll/ᩴۨۚ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ᩴۨۚ;->۬:Ll/ᩴۨۚ;

    .line 96
    new-instance v0, Ll/ᩴۨۚ;

    const/4 v1, 0x3

    const-string v2, "@T-"

    const-string v3, "InvisibleType"

    invoke-direct {v0, v3, v1, v2}, Ll/ᩴۨۚ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ᩴۨۚ;->ۙ:Ll/ᩴۨۚ;

    .line 92
    invoke-static {}, Ll/ᩴۨۚ;->֫()[Ll/ᩴۨۚ;

    move-result-object v0

    sput-object v0, Ll/ᩴۨۚ;->᩹:[Ll/ᩴۨۚ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 100
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 101
    iput-object p3, p0, Ll/ᩴۨۚ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ᩴۨۚ;
    .locals 1

    .line 92
    const-class v0, Ll/ᩴۨۚ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ᩴۨۚ;

    return-object p0
.end method

.method public static values()[Ll/ᩴۨۚ;
    .locals 1

    .line 92
    sget-object v0, Ll/ᩴۨۚ;->᩹:[Ll/ᩴۨۚ;

    invoke-virtual {v0}, [Ll/ᩴۨۚ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩴۨۚ;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "@"

    .line 141
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ֫()[Ll/ᩴۨۚ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ᩴۨۚ;

    .line 92
    sget-object v1, Ll/ᩴۨۚ;->ۗ:Ll/ᩴۨۚ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۨۚ;->᩶:Ll/ᩴۨۚ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۨۚ;->۬:Ll/ᩴۨۚ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۨۚ;->ۙ:Ll/ᩴۨۚ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 114
    sget-object v0, Ll/ᩴۨۚ;->᩶:Ll/ᩴۨۚ;

    iget-object v0, v0, Ll/ᩴۨۚ;->᩸:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ᩴۨۚ;->ۗ:Ll/ᩴۨۚ;

    iget-object v0, v0, Ll/ᩴۨۚ;->᩸:Ljava/lang/String;

    .line 115
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "-"

    .line 154
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ᩳ(Ljava/lang/String;)Z
    .locals 1

    .line 128
    sget-object v0, Ll/ᩴۨۚ;->ۙ:Ll/ᩴۨۚ;

    iget-object v0, v0, Ll/ᩴۨۚ;->᩸:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ᩴۨۚ;->۬:Ll/ᩴۨۚ;

    iget-object v0, v0, Ll/ᩴۨۚ;->᩸:Ljava/lang/String;

    .line 129
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
