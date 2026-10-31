.class public final enum Ll/۬ۡ۠;
.super Ljava/lang/Enum;
.source "V6B4"


# static fields
.field public static final enum ۗ:Ll/۬ۡ۠;

.field public static final enum ۙ:Ll/۬ۡ۠;

.field public static final enum ۫:Ll/۬ۡ۠;

.field public static final enum ۬:Ll/۬ۡ۠;

.field public static final enum ᩶:Ll/۬ۡ۠;

.field public static final synthetic ᩹:[Ll/۬ۡ۠;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 100
    new-instance v0, Ll/۬ۡ۠;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/۬ۡ۠;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۬ۡ۠;->۬:Ll/۬ۡ۠;

    .line 101
    new-instance v0, Ll/۬ۡ۠;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ll/۬ۡ۠;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۬ۡ۠;->ۗ:Ll/۬ۡ۠;

    .line 102
    new-instance v0, Ll/۬ۡ۠;

    const-string v1, "CMDERR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Ll/۬ۡ۠;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۬ۡ۠;->ۙ:Ll/۬ۡ۠;

    .line 103
    new-instance v0, Ll/۬ۡ۠;

    const-string v1, "SYSERR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Ll/۬ۡ۠;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۬ۡ۠;->۫:Ll/۬ۡ۠;

    .line 104
    new-instance v0, Ll/۬ۡ۠;

    const-string v1, "ABNORMAL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Ll/۬ۡ۠;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/۬ۡ۠;->᩶:Ll/۬ۡ۠;

    .line 99
    invoke-static {}, Ll/۬ۡ۠;->ۧ()[Ll/۬ۡ۠;

    move-result-object v0

    sput-object v0, Ll/۬ۡ۠;->᩹:[Ll/۬ۡ۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 106
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 107
    iput p3, p0, Ll/۬ۡ۠;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۬ۡ۠;
    .locals 1

    .line 99
    const-class v0, Ll/۬ۡ۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۬ۡ۠;

    return-object p0
.end method

.method public static values()[Ll/۬ۡ۠;
    .locals 1

    .line 99
    sget-object v0, Ll/۬ۡ۠;->᩹:[Ll/۬ۡ۠;

    invoke-virtual {v0}, [Ll/۬ۡ۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۬ۡ۠;

    return-object v0
.end method

.method public static synthetic ۧ()[Ll/۬ۡ۠;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ll/۬ۡ۠;

    .line 99
    sget-object v1, Ll/۬ۡ۠;->۬:Ll/۬ۡ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/۬ۡ۠;->ۗ:Ll/۬ۡ۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/۬ۡ۠;->ۙ:Ll/۬ۡ۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/۬ۡ۠;->۫:Ll/۬ۡ۠;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/۬ۡ۠;->᩶:Ll/۬ۡ۠;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()Z
    .locals 1

    .line 111
    iget v0, p0, Ll/۬ۡ۠;->᩸:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
