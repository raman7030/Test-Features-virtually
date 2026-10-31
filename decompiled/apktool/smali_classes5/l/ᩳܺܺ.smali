.class public final Ll/ᩳܺܺ;
.super Ll/֡ܺܺ;
.source "DBDG"


# static fields
.field public static final ᩶:Ll/ᩳܺܺ;

.field public static final ᩹:Ll/ᩳܺܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Ll/ᩳܺܺ;

    const/4 v1, 0x0

    .line 70
    invoke-direct {v0, v1}, Ll/֡ܺܺ;-><init>(I)V

    .line 29
    sput-object v0, Ll/ᩳܺܺ;->᩹:Ll/ᩳܺܺ;

    .line 34
    new-instance v0, Ll/ᩳܺܺ;

    const/4 v1, 0x1

    .line 70
    invoke-direct {v0, v1}, Ll/֡ܺܺ;-><init>(I)V

    .line 34
    sput-object v0, Ll/ᩳܺܺ;->᩶:Ll/ᩳܺܺ;

    return-void
.end method

.method public static ֫(I)Ll/ᩳܺܺ;
    .locals 2

    if-nez p0, :cond_0

    .line 56
    sget-object p0, Ll/ᩳܺܺ;->᩹:Ll/ᩳܺܺ;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 58
    sget-object p0, Ll/ᩳܺܺ;->᩶:Ll/ᩳܺܺ;

    return-object p0

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bogus value: "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 60
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 86
    sget-object v0, Ll/۟ܺܺ;->ۤ:Ll/۟ܺܺ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 111
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "boolean{false}"

    return-object v0

    :cond_0
    const-string v0, "boolean{true}"

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 111
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "false"

    return-object v0

    :cond_0
    const-string v0, "true"

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "boolean"

    return-object v0
.end method
