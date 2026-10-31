.class public final enum Ll/᩸ۧᩳ;
.super Ljava/lang/Enum;
.source "819Z"


# static fields
.field public static final enum ۗ:Ll/᩸ۧᩳ;

.field public static final enum ۙ:Ll/᩸ۧᩳ;

.field public static final enum ᩶:Ll/᩸ۧᩳ;

.field public static final synthetic ᩸:[Ll/᩸ۧᩳ;

.field public static final enum ᩹:Ll/᩸ۧᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 501
    new-instance v0, Ll/᩸ۧᩳ;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩸ۧᩳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸ۧᩳ;->ۙ:Ll/᩸ۧᩳ;

    .line 502
    new-instance v0, Ll/᩸ۧᩳ;

    const-string v1, "SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩸ۧᩳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸ۧᩳ;->ۗ:Ll/᩸ۧᩳ;

    .line 503
    new-instance v0, Ll/᩸ۧᩳ;

    const-string v1, "FAIL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/᩸ۧᩳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸ۧᩳ;->᩹:Ll/᩸ۧᩳ;

    .line 504
    new-instance v0, Ll/᩸ۧᩳ;

    const-string v1, "MISSING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/᩸ۧᩳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸ۧᩳ;->᩶:Ll/᩸ۧᩳ;

    .line 500
    invoke-static {}, Ll/᩸ۧᩳ;->ۢ()[Ll/᩸ۧᩳ;

    move-result-object v0

    sput-object v0, Ll/᩸ۧᩳ;->᩸:[Ll/᩸ۧᩳ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 500
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩸ۧᩳ;
    .locals 1

    .line 500
    const-class v0, Ll/᩸ۧᩳ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩸ۧᩳ;

    return-object p0
.end method

.method public static values()[Ll/᩸ۧᩳ;
    .locals 1

    .line 500
    sget-object v0, Ll/᩸ۧᩳ;->᩸:[Ll/᩸ۧᩳ;

    invoke-virtual {v0}, [Ll/᩸ۧᩳ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸ۧᩳ;

    return-object v0
.end method

.method public static synthetic ۢ()[Ll/᩸ۧᩳ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/᩸ۧᩳ;

    .line 500
    sget-object v1, Ll/᩸ۧᩳ;->ۙ:Ll/᩸ۧᩳ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸ۧᩳ;->ۗ:Ll/᩸ۧᩳ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸ۧᩳ;->᩹:Ll/᩸ۧᩳ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸ۧᩳ;->᩶:Ll/᩸ۧᩳ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()Z
    .locals 1

    .line 515
    sget-object v0, Ll/᩸ۧᩳ;->᩹:Ll/᩸ۧᩳ;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۧ()Z
    .locals 1

    .line 523
    invoke-virtual {p0}, Ll/᩸ۧᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/᩸ۧᩳ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public ܿ()Z
    .locals 1

    .line 519
    sget-object v0, Ll/᩸ۧᩳ;->᩶:Ll/᩸ۧᩳ;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ᩷()Z
    .locals 1

    .line 511
    sget-object v0, Ll/᩸ۧᩳ;->ۗ:Ll/᩸ۧᩳ;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ᩻()Z
    .locals 1

    .line 507
    sget-object v0, Ll/᩸ۧᩳ;->ۙ:Ll/᩸ۧᩳ;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
