.class public final enum Ll/᩵֡֨;
.super Ljava/lang/Enum;
.source "643O"


# static fields
.field public static final enum ۗ:Ll/᩵֡֨;

.field public static final enum ۙ:Ll/᩵֡֨;

.field public static final enum ۬:Ll/᩵֡֨;

.field public static final enum ᩶:Ll/᩵֡֨;

.field public static final synthetic ᩹:[Ll/᩵֡֨;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1119
    new-instance v0, Ll/᩵֡֨;

    const-string v1, "DO_NOT_RESOLVE_BY_DEFAULT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ll/᩵֡֨;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩵֡֨;->᩶:Ll/᩵֡֨;

    .line 1120
    new-instance v0, Ll/᩵֡֨;

    const-string v1, "WARN_DEPRECATED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Ll/᩵֡֨;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩵֡֨;->ۙ:Ll/᩵֡֨;

    .line 1121
    new-instance v0, Ll/᩵֡֨;

    const-string v1, "WARN_DEPRECATED_REMOVAL"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Ll/᩵֡֨;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩵֡֨;->ۗ:Ll/᩵֡֨;

    .line 1122
    new-instance v0, Ll/᩵֡֨;

    const/4 v1, 0x3

    const/16 v2, 0x8

    const-string v3, "WARN_INCUBATING"

    invoke-direct {v0, v3, v1, v2}, Ll/᩵֡֨;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩵֡֨;->۬:Ll/᩵֡֨;

    .line 1118
    invoke-static {}, Ll/᩵֡֨;->֫()[Ll/᩵֡֨;

    move-result-object v0

    sput-object v0, Ll/᩵֡֨;->᩹:[Ll/᩵֡֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1131
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 1132
    iput p3, p0, Ll/᩵֡֨;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩵֡֨;
    .locals 1

    .line 1118
    const-class v0, Ll/᩵֡֨;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩵֡֨;

    return-object p0
.end method

.method public static values()[Ll/᩵֡֨;
    .locals 1

    .line 1118
    sget-object v0, Ll/᩵֡֨;->᩹:[Ll/᩵֡֨;

    invoke-virtual {v0}, [Ll/᩵֡֨;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩵֡֨;

    return-object v0
.end method

.method public static ֫(Ljava/util/Set;)I
    .locals 2

    .line 1126
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵֡֨;

    .line 1127
    iget v1, v1, Ll/᩵֡֨;->᩸:I

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static synthetic ֫()[Ll/᩵֡֨;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/᩵֡֨;

    .line 1118
    sget-object v1, Ll/᩵֡֨;->᩶:Ll/᩵֡֨;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩵֡֨;->ۙ:Ll/᩵֡֨;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩵֡֨;->ۗ:Ll/᩵֡֨;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/᩵֡֨;->۬:Ll/᩵֡֨;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method
