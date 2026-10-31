.class public final enum Ll/ᩳۨ֨;
.super Ljava/lang/Enum;
.source "M43N"


# static fields
.field public static final enum ۙ:Ll/ᩳۨ֨;

.field public static final enum ᩶:Ll/ᩳۨ֨;

.field public static final synthetic ᩹:[Ll/ᩳۨ֨;


# instance fields
.field public final ᩸:Ljava/util/EnumSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1565
    new-instance v0, Ll/ᩳۨ֨;

    sget-object v1, Ll/ۧۨ֨;->ۙ:Ll/ۧۨ֨;

    sget-object v2, Ll/ۧۨ֨;->ۗ:Ll/ۧۨ֨;

    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    const-string v3, "EQ_LOWER"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v2}, Ll/ᩳۨ֨;-><init>(Ljava/lang/String;ILjava/util/EnumSet;)V

    sput-object v0, Ll/ᩳۨ֨;->᩶:Ll/ᩳۨ֨;

    .line 1566
    new-instance v0, Ll/ᩳۨ֨;

    sget-object v2, Ll/ۧۨ֨;->ۤ:Ll/ۧۨ֨;

    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    const-string v2, "EQ_UPPER"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Ll/ᩳۨ֨;-><init>(Ljava/lang/String;ILjava/util/EnumSet;)V

    sput-object v0, Ll/ᩳۨ֨;->ۙ:Ll/ᩳۨ֨;

    .line 1563
    invoke-static {}, Ll/ᩳۨ֨;->֫()[Ll/ᩳۨ֨;

    move-result-object v0

    sput-object v0, Ll/ᩳۨ֨;->᩹:[Ll/ᩳۨ֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/EnumSet;)V
    .locals 0

    .line 1570
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 1571
    iput-object p3, p0, Ll/ᩳۨ֨;->᩸:Ljava/util/EnumSet;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ᩳۨ֨;
    .locals 1

    .line 1563
    const-class v0, Ll/ᩳۨ֨;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ᩳۨ֨;

    return-object p0
.end method

.method public static values()[Ll/ᩳۨ֨;
    .locals 1

    .line 1563
    sget-object v0, Ll/ᩳۨ֨;->᩹:[Ll/ᩳۨ֨;

    invoke-virtual {v0}, [Ll/ᩳۨ֨;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩳۨ֨;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/ᩳۨ֨;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/ᩳۨ֨;

    .line 1563
    sget-object v1, Ll/ᩳۨ֨;->᩶:Ll/ᩳۨ֨;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩳۨ֨;->ۙ:Ll/ᩳۨ֨;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method
