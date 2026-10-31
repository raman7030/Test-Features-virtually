.class public final enum Ll/ܶܶ۠;
.super Ljava/lang/Enum;
.source "93Z4"


# static fields
.field public static final enum ۙ:Ll/ܶܶ۠;

.field public static final enum ᩶:Ll/ܶܶ۠;

.field public static final synthetic ᩹:[Ll/ܶܶ۠;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 72
    new-instance v0, Ll/ܶܶ۠;

    const/4 v1, 0x0

    const-string v2, "javac."

    const-string v3, "JAVAC"

    invoke-direct {v0, v3, v1, v2}, Ll/ܶܶ۠;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    .line 73
    new-instance v0, Ll/ܶܶ۠;

    const/4 v1, 0x1

    const-string v2, "compiler.misc."

    const-string v3, "COMPILER_MISC"

    invoke-direct {v0, v3, v1, v2}, Ll/ܶܶ۠;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܶܶ۠;->᩶:Ll/ܶܶ۠;

    .line 71
    invoke-static {}, Ll/ܶܶ۠;->֫()[Ll/ܶܶ۠;

    move-result-object v0

    sput-object v0, Ll/ܶܶ۠;->᩹:[Ll/ܶܶ۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 75
    iput-object p3, p0, Ll/ܶܶ۠;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܶܶ۠;
    .locals 1

    .line 71
    const-class v0, Ll/ܶܶ۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܶܶ۠;

    return-object p0
.end method

.method public static values()[Ll/ܶܶ۠;
    .locals 1

    .line 71
    sget-object v0, Ll/ܶܶ۠;->᩹:[Ll/ܶܶ۠;

    invoke-virtual {v0}, [Ll/ܶܶ۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܶܶ۠;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/ܶܶ۠;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/ܶܶ۠;

    .line 71
    sget-object v1, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܶܶ۠;->᩶:Ll/ܶܶ۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܶܶ۠;->᩸:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, p1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
