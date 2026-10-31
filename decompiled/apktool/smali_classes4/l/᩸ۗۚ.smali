.class public final enum Ll/᩸ۗۚ;
.super Ljava/lang/Enum;
.source "G7CB"


# static fields
.field public static final enum ۗ:Ll/᩸ۗۚ;

.field public static final enum ۙ:Ll/᩸ۗۚ;

.field public static final enum ᩶:Ll/᩸ۗۚ;

.field public static final synthetic ᩹:[Ll/᩸ۗۚ;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 4
    new-instance v0, Ll/᩸ۗۚ;

    const/4 v1, 0x0

    const-string v2, "err."

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Ll/᩸ۗۚ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/᩸ۗۚ;->᩶:Ll/᩸ۗۚ;

    .line 5
    new-instance v0, Ll/᩸ۗۚ;

    const/4 v1, 0x1

    const-string v2, "warn."

    const-string v3, "WARNING"

    invoke-direct {v0, v3, v1, v2}, Ll/᩸ۗۚ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/᩸ۗۚ;->ۗ:Ll/᩸ۗۚ;

    .line 6
    new-instance v0, Ll/᩸ۗۚ;

    const/4 v1, 0x2

    const-string v2, "info."

    const-string v3, "INFO"

    invoke-direct {v0, v3, v1, v2}, Ll/᩸ۗۚ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/᩸ۗۚ;->ۙ:Ll/᩸ۗۚ;

    .line 3
    invoke-static {}, Ll/᩸ۗۚ;->ܿ()[Ll/᩸ۗۚ;

    move-result-object v0

    sput-object v0, Ll/᩸ۗۚ;->᩹:[Ll/᩸ۗۚ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 10
    iput-object p3, p0, Ll/᩸ۗۚ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩸ۗۚ;
    .locals 1

    .line 3
    const-class v0, Ll/᩸ۗۚ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩸ۗۚ;

    return-object p0
.end method

.method public static values()[Ll/᩸ۗۚ;
    .locals 1

    .line 3
    sget-object v0, Ll/᩸ۗۚ;->᩹:[Ll/᩸ۗۚ;

    invoke-virtual {v0}, [Ll/᩸ۗۚ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸ۗۚ;

    return-object v0
.end method

.method public static synthetic ܿ()[Ll/᩸ۗۚ;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/᩸ۗۚ;

    .line 3
    sget-object v1, Ll/᩸ۗۚ;->᩶:Ll/᩸ۗۚ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸ۗۚ;->ۗ:Ll/᩸ۗۚ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸ۗۚ;->ۙ:Ll/᩸ۗۚ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()Ljava/lang/String;
    .locals 4

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۧ()Ljava/lang/String;
    .locals 3

    .line 18
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
