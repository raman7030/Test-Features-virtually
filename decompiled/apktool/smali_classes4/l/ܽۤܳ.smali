.class public final enum Ll/ܽۤܳ;
.super Ljava/lang/Enum;
.source "Z75W"


# static fields
.field public static final enum ۙ:Ll/ܽۤܳ;

.field public static final enum ᩶:Ll/ܽۤܳ;

.field public static final synthetic ᩸:[Ll/ܽۤܳ;

.field public static final enum ᩹:Ll/ܽۤܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 7
    new-instance v0, Ll/ܽۤܳ;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܽۤܳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܽۤܳ;->᩶:Ll/ܽۤܳ;

    .line 8
    new-instance v0, Ll/ܽۤܳ;

    const-string v1, "EXACT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ܽۤܳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܽۤܳ;->᩹:Ll/ܽۤܳ;

    .line 9
    new-instance v0, Ll/ܽۤܳ;

    const-string v1, "TREE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ܽۤܳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܽۤܳ;->ۙ:Ll/ܽۤܳ;

    .line 6
    invoke-static {}, Ll/ܽۤܳ;->֫()[Ll/ܽۤܳ;

    move-result-object v0

    sput-object v0, Ll/ܽۤܳ;->᩸:[Ll/ܽۤܳ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܽۤܳ;
    .locals 1

    .line 6
    const-class v0, Ll/ܽۤܳ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܽۤܳ;

    return-object p0
.end method

.method public static values()[Ll/ܽۤܳ;
    .locals 1

    .line 6
    sget-object v0, Ll/ܽۤܳ;->᩸:[Ll/ܽۤܳ;

    invoke-virtual {v0}, [Ll/ܽۤܳ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܽۤܳ;

    return-object v0
.end method

.method public static ֫(Z)Ll/ܽۤܳ;
    .locals 0

    if-eqz p0, :cond_0

    .line 15
    sget-object p0, Ll/ܽۤܳ;->ۙ:Ll/ܽۤܳ;

    return-object p0

    :cond_0
    sget-object p0, Ll/ܽۤܳ;->᩹:Ll/ܽۤܳ;

    return-object p0
.end method

.method public static synthetic ֫()[Ll/ܽۤܳ;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/ܽۤܳ;

    .line 6
    sget-object v1, Ll/ܽۤܳ;->᩶:Ll/ܽۤܳ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܽۤܳ;->᩹:Ll/ܽۤܳ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ܽۤܳ;->ۙ:Ll/ܽۤܳ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫(Ljava/lang/String;)V
    .locals 2

    .line 22
    sget-object v0, Ll/ۧۤܳ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    .line 24
    :cond_0
    invoke-static {p1}, Ll/ܳۤܳ;->ܿ(Ljava/lang/String;)V

    return-void

    .line 23
    :cond_1
    invoke-static {p1}, Ll/ܳۤܳ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method
