.class public abstract enum Ll/᩵֨֨;
.super Ljava/lang/Enum;
.source "34PY"


# static fields
.field public static final enum ۙ:Ll/᩵֨֨;

.field public static final enum ᩶:Ll/᩵֨֨;

.field public static final synthetic ᩸:[Ll/᩵֨֨;

.field public static final enum ᩹:Ll/᩵֨֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1915
    new-instance v0, Ll/ۖ֨֨;

    invoke-direct {v0}, Ll/ۖ֨֨;-><init>()V

    sput-object v0, Ll/᩵֨֨;->᩶:Ll/᩵֨֨;

    .line 1919
    new-instance v0, Ll/ۘ֨֨;

    invoke-direct {v0}, Ll/ۘ֨֨;-><init>()V

    sput-object v0, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    .line 1923
    new-instance v0, Ll/ᩴ֨֨;

    invoke-direct {v0}, Ll/ᩴ֨֨;-><init>()V

    sput-object v0, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    .line 1913
    invoke-static {}, Ll/᩵֨֨;->ۧ()[Ll/᩵֨֨;

    move-result-object v0

    sput-object v0, Ll/᩵֨֨;->᩸:[Ll/᩵֨֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1913
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/᩵֨֨;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩵֨֨;
    .locals 1

    .line 1913
    const-class v0, Ll/᩵֨֨;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩵֨֨;

    return-object p0
.end method

.method public static values()[Ll/᩵֨֨;
    .locals 1

    .line 1913
    sget-object v0, Ll/᩵֨֨;->᩸:[Ll/᩵֨֨;

    invoke-virtual {v0}, [Ll/᩵֨֨;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩵֨֨;

    return-object v0
.end method

.method public static synthetic ۧ()[Ll/᩵֨֨;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/᩵֨֨;

    .line 1913
    sget-object v1, Ll/᩵֨֨;->᩶:Ll/᩵֨֨;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public abstract ֫()Ll/᩵֨֨;
.end method

.method public ֫(Ll/᩵֨֨;)Z
    .locals 2

    const/4 v0, 0x0

    if-ne p1, p0, :cond_0

    return v0

    .line 1933
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    const-string p1, "Cannot get here!"

    .line 1938
    invoke-static {p1}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 1936
    :cond_2
    sget-object p1, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    if-eq p0, p1, :cond_3

    return v1

    :cond_3
    return v0
.end method
