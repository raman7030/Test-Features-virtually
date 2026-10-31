.class public final enum Ll/ۧۘ۠;
.super Ljava/lang/Enum;
.source "K434"


# static fields
.field public static final enum ۗ:Ll/ۧۘ۠;

.field public static final enum ۙ:Ll/ۧۘ۠;

.field public static final enum ۬:Ll/ۧۘ۠;

.field public static final enum ᩶:Ll/ۧۘ۠;

.field public static final synthetic ᩹:[Ll/ۧۘ۠;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1911
    new-instance v0, Ll/ۧۘ۠;

    const-string v1, "VAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/ۧۘ۠;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۧۘ۠;->۬:Ll/ۧۘ۠;

    .line 1912
    new-instance v0, Ll/ۧۘ۠;

    const-string v1, "EXPLICIT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ll/ۧۘ۠;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۧۘ۠;->ۙ:Ll/ۧۘ۠;

    .line 1913
    new-instance v0, Ll/ۧۘ۠;

    const-string v1, "IMPLICIT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Ll/ۧۘ۠;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۧۘ۠;->ۗ:Ll/ۧۘ۠;

    .line 1914
    new-instance v0, Ll/ۧۘ۠;

    const/4 v1, 0x3

    const/4 v2, -0x1

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Ll/ۧۘ۠;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۧۘ۠;->᩶:Ll/ۧۘ۠;

    .line 1910
    invoke-static {}, Ll/ۧۘ۠;->֫()[Ll/ۧۘ۠;

    move-result-object v0

    sput-object v0, Ll/ۧۘ۠;->᩹:[Ll/ۧۘ۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1918
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 1919
    iput p3, p0, Ll/ۧۘ۠;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۧۘ۠;
    .locals 1

    .line 1910
    const-class v0, Ll/ۧۘ۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۧۘ۠;

    return-object p0
.end method

.method public static values()[Ll/ۧۘ۠;
    .locals 1

    .line 1910
    sget-object v0, Ll/ۧۘ۠;->᩹:[Ll/ۧۘ۠;

    invoke-virtual {v0}, [Ll/ۧۘ۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۧۘ۠;

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ۧۘ۠;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۧۘ۠;->᩸:I

    return p0
.end method

.method public static synthetic ֫()[Ll/ۧۘ۠;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ۧۘ۠;

    .line 1910
    sget-object v1, Ll/ۧۘ۠;->۬:Ll/ۧۘ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۧۘ۠;->ۙ:Ll/ۧۘ۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۧۘ۠;->ۗ:Ll/ۧۘ۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۧۘ۠;->᩶:Ll/ۧۘ۠;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method
