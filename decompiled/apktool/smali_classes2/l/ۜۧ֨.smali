.class public final enum Ll/ۜۧ֨;
.super Ljava/lang/Enum;
.source "FBFP"


# static fields
.field public static final enum ۙ:Ll/ۜۧ֨;

.field public static final enum ᩶:Ll/ۜۧ֨;

.field public static final synthetic ᩸:[Ll/ۜۧ֨;

.field public static final enum ᩹:Ll/ۜۧ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 756
    new-instance v0, Ll/ۜۧ֨;

    const-string v1, "MODULE_INFO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۜۧ֨;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۜۧ֨;->᩶:Ll/ۜۧ֨;

    .line 757
    new-instance v0, Ll/ۜۧ֨;

    const-string v1, "PACKAGE_INFO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ۜۧ֨;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۜۧ֨;->ۙ:Ll/ۜۧ֨;

    .line 758
    new-instance v0, Ll/ۜۧ֨;

    const-string v1, "CLASS_UNIT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ۜۧ֨;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۜۧ֨;->᩹:Ll/ۜۧ֨;

    .line 755
    invoke-static {}, Ll/ۜۧ֨;->֫()[Ll/ۜۧ֨;

    move-result-object v0

    sput-object v0, Ll/ۜۧ֨;->᩸:[Ll/ۜۧ֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 755
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۜۧ֨;
    .locals 1

    .line 755
    const-class v0, Ll/ۜۧ֨;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۜۧ֨;

    return-object p0
.end method

.method public static values()[Ll/ۜۧ֨;
    .locals 1

    .line 755
    sget-object v0, Ll/ۜۧ֨;->᩸:[Ll/ۜۧ֨;

    invoke-virtual {v0}, [Ll/ۜۧ֨;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۜۧ֨;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;I)Ll/ۜۧ֨;
    .locals 1

    const-string v0, "module-info"

    .line 766
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Ll/ۛ۬ۚ;->ۖ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "package-info"

    .line 768
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {p1}, Ll/ۛ۬ۚ;->ۢ(I)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 769
    sget-object p0, Ll/ۜۧ֨;->ۙ:Ll/ۜۧ֨;

    return-object p0

    .line 771
    :cond_1
    sget-object p0, Ll/ۜۧ֨;->᩹:Ll/ۜۧ֨;

    return-object p0

    .line 767
    :cond_2
    :goto_0
    sget-object p0, Ll/ۜۧ֨;->᩶:Ll/ۜۧ֨;

    return-object p0
.end method

.method public static synthetic ֫()[Ll/ۜۧ֨;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/ۜۧ֨;

    .line 755
    sget-object v1, Ll/ۜۧ֨;->᩶:Ll/ۜۧ֨;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۜۧ֨;->ۙ:Ll/ۜۧ֨;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۜۧ֨;->᩹:Ll/ۜۧ֨;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method
