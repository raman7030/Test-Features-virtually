.class public final enum Ll/᩶ۡ۠;
.super Ljava/lang/Enum;
.source "D445"


# static fields
.field public static final enum ۙ:Ll/᩶ۡ۠;

.field public static final enum ᩶:Ll/᩶ۡ۠;

.field public static final synthetic ᩸:[Ll/᩶ۡ۠;

.field public static final enum ᩹:Ll/᩶ۡ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 205
    new-instance v0, Ll/᩶ۡ۠;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩶ۡ۠;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩶ۡ۠;->᩶:Ll/᩶ۡ۠;

    .line 207
    new-instance v0, Ll/᩶ۡ۠;

    const-string v1, "CLASS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩶ۡ۠;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩶ۡ۠;->᩹:Ll/᩶ۡ۠;

    .line 209
    new-instance v0, Ll/᩶ۡ۠;

    const-string v1, "UNSET"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/᩶ۡ۠;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩶ۡ۠;->ۙ:Ll/᩶ۡ۠;

    .line 203
    invoke-static {}, Ll/᩶ۡ۠;->֫()[Ll/᩶ۡ۠;

    move-result-object v0

    sput-object v0, Ll/᩶ۡ۠;->᩸:[Ll/᩶ۡ۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 203
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩶ۡ۠;
    .locals 1

    .line 203
    const-class v0, Ll/᩶ۡ۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩶ۡ۠;

    return-object p0
.end method

.method public static values()[Ll/᩶ۡ۠;
    .locals 1

    .line 203
    sget-object v0, Ll/᩶ۡ۠;->᩸:[Ll/᩶ۡ۠;

    invoke-virtual {v0}, [Ll/᩶ۡ۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶ۡ۠;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩶ۡ۠;
    .locals 1

    if-nez p0, :cond_0

    .line 213
    sget-object p0, Ll/᩶ۡ۠;->ۙ:Ll/᩶ۡ۠;

    return-object p0

    :cond_0
    const-string v0, "none"

    .line 214
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    sget-object p0, Ll/᩶ۡ۠;->᩶:Ll/᩶ۡ۠;

    return-object p0

    :cond_1
    const-string v0, "class"

    .line 216
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 217
    sget-object p0, Ll/᩶ۡ۠;->᩹:Ll/᩶ۡ۠;

    return-object p0

    .line 219
    :cond_2
    sget-object p0, Ll/᩶ۡ۠;->ۙ:Ll/᩶ۡ۠;

    return-object p0
.end method

.method public static synthetic ֫()[Ll/᩶ۡ۠;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/᩶ۡ۠;

    .line 203
    sget-object v1, Ll/᩶ۡ۠;->᩶:Ll/᩶ۡ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩶ۡ۠;->᩹:Ll/᩶ۡ۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩶ۡ۠;->ۙ:Ll/᩶ۡ۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method
