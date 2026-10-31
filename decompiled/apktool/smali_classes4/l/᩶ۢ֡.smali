.class public final enum Ll/᩶ۢ֡;
.super Ljava/lang/Enum;
.source "L7IG"


# static fields
.field public static final enum ۗ:Ll/᩶ۢ֡;

.field public static final enum ۙ:Ll/᩶ۢ֡;

.field public static final enum ᩶:Ll/᩶ۢ֡;

.field public static final synthetic ᩹:[Ll/᩶ۢ֡;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 33
    new-instance v0, Ll/᩶ۢ֡;

    const/4 v1, 0x0

    const-string v2, "\r"

    const-string v3, "CR"

    invoke-direct {v0, v3, v1, v2}, Ll/᩶ۢ֡;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/᩶ۢ֡;->᩶:Ll/᩶ۢ֡;

    .line 38
    new-instance v0, Ll/᩶ۢ֡;

    const/4 v1, 0x1

    const-string v2, "\r\n"

    const-string v3, "CRLF"

    invoke-direct {v0, v3, v1, v2}, Ll/᩶ۢ֡;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/᩶ۢ֡;->ۙ:Ll/᩶ۢ֡;

    .line 43
    new-instance v0, Ll/᩶ۢ֡;

    const/4 v1, 0x2

    const-string v2, "\n"

    const-string v3, "LF"

    invoke-direct {v0, v3, v1, v2}, Ll/᩶ۢ֡;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/᩶ۢ֡;->ۗ:Ll/᩶ۢ֡;

    .line 28
    invoke-static {}, Ll/᩶ۢ֡;->֫()[Ll/᩶ۢ֡;

    move-result-object v0

    sput-object v0, Ll/᩶ۢ֡;->᩹:[Ll/᩶ۢ֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const-string p1, "lineSeparator"

    .line 53
    invoke-static {p3, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p3, p0, Ll/᩶ۢ֡;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩶ۢ֡;
    .locals 1

    .line 28
    const-class v0, Ll/᩶ۢ֡;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩶ۢ֡;

    return-object p0
.end method

.method public static values()[Ll/᩶ۢ֡;
    .locals 1

    .line 28
    sget-object v0, Ll/᩶ۢ֡;->᩹:[Ll/᩶ۢ֡;

    invoke-virtual {v0}, [Ll/᩶ۢ֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶ۢ֡;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/᩶ۢ֡;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/᩶ۢ֡;

    .line 28
    sget-object v1, Ll/᩶ۢ֡;->᩶:Ll/᩶ۢ֡;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩶ۢ֡;->ۙ:Ll/᩶ۢ֡;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩶ۢ֡;->ۗ:Ll/᩶ۢ֡;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getString()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/᩶ۢ֡;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public ֫(Ljava/nio/charset/Charset;)[B
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩶ۢ֡;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    return-object p1
.end method
