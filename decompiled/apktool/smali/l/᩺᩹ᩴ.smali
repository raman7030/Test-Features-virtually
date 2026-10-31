.class public final enum Ll/᩺᩹ᩴ;
.super Ljava/lang/Enum;
.source "N673"

# interfaces
.implements Ll/ۘ᩶ᩴ;


# static fields
.field public static final enum BEFORE_ROC:Ll/᩺᩹ᩴ;

.field public static final enum ROC:Ll/᩺᩹ᩴ;

.field public static final synthetic a:[Ll/᩺᩹ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 119
    new-instance v0, Ll/᩺᩹ᩴ;

    const-string v1, "BEFORE_ROC"

    const/4 v2, 0x0

    .line 113
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 119
    sput-object v0, Ll/᩺᩹ᩴ;->BEFORE_ROC:Ll/᩺᩹ᩴ;

    .line 124
    new-instance v1, Ll/᩺᩹ᩴ;

    const-string v3, "ROC"

    const/4 v4, 0x1

    .line 113
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 124
    sput-object v1, Ll/᩺᩹ᩴ;->ROC:Ll/᩺᩹ᩴ;

    const/4 v3, 0x2

    new-array v3, v3, [Ll/᩺᩹ᩴ;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 113
    sput-object v3, Ll/᩺᩹ᩴ;->a:[Ll/᩺᩹ᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩺᩹ᩴ;
    .locals 1

    .line 113
    const-class v0, Ll/᩺᩹ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩺᩹ᩴ;

    return-object p0
.end method

.method public static values()[Ll/᩺᩹ᩴ;
    .locals 1

    .line 113
    sget-object v0, Ll/᩺᩹ᩴ;->a:[Ll/᩺᩹ᩴ;

    invoke-virtual {v0}, [Ll/᩺᩹ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩺᩹ᩴ;

    return-object v0
.end method


# virtual methods
.method public final synthetic G(Ll/ۤۗᩴ;)J
    .locals 2

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->d(Ll/ۘ᩶ᩴ;Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->f(Ll/ۘ᩶ᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic e(Ll/ۤۗᩴ;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->e(Ll/ۘ᩶ᩴ;Ll/ۤۗᩴ;)Z

    move-result p1

    return p1
.end method

.method public final getValue()I
    .locals 1

    .line 158
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public final synthetic l(Ll/ۤۗᩴ;)I
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->c(Ll/ۘ᩶ᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 0

    .line 179
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    .line 301
    sget-object v0, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {p0}, Ll/᩺᩹ᩴ;->getValue()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method
