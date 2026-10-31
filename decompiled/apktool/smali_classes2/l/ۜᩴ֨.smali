.class public final enum Ll/ۜᩴ֨;
.super Ljava/lang/Enum;
.source "C7LA"


# static fields
.field public static final enum ۙ:Ll/ۜᩴ֨;

.field public static final enum ᩶:Ll/ۜᩴ֨;

.field public static final synthetic ᩹:[Ll/ۜᩴ֨;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 156
    new-instance v0, Ll/ۜᩴ֨;

    const/4 v1, 0x0

    const/16 v2, 0x1000

    const-string v3, "SYNTHETIC"

    invoke-direct {v0, v3, v1, v2}, Ll/ۜᩴ֨;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۜᩴ֨;->ۙ:Ll/ۜᩴ֨;

    .line 157
    new-instance v0, Ll/ۜᩴ֨;

    const/4 v1, 0x1

    const v2, 0x8000

    const-string v3, "MANDATED"

    invoke-direct {v0, v3, v1, v2}, Ll/ۜᩴ֨;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۜᩴ֨;->᩶:Ll/ۜᩴ֨;

    .line 155
    invoke-static {}, Ll/ۜᩴ֨;->֫()[Ll/ۜᩴ֨;

    move-result-object v0

    sput-object v0, Ll/ۜᩴ֨;->᩹:[Ll/ۜᩴ֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 167
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 168
    iput p3, p0, Ll/ۜᩴ֨;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۜᩴ֨;
    .locals 1

    .line 155
    const-class v0, Ll/ۜᩴ֨;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۜᩴ֨;

    return-object p0
.end method

.method public static values()[Ll/ۜᩴ֨;
    .locals 1

    .line 155
    sget-object v0, Ll/ۜᩴ֨;->᩹:[Ll/ۜᩴ֨;

    invoke-virtual {v0}, [Ll/ۜᩴ֨;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۜᩴ֨;

    return-object v0
.end method

.method public static ֫(Ljava/util/Set;)I
    .locals 2

    .line 162
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜᩴ֨;

    .line 163
    iget v1, v1, Ll/ۜᩴ֨;->᩸:I

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static synthetic ֫()[Ll/ۜᩴ֨;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/ۜᩴ֨;

    .line 155
    sget-object v1, Ll/ۜᩴ֨;->ۙ:Ll/ۜᩴ֨;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۜᩴ֨;->᩶:Ll/ۜᩴ֨;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method
