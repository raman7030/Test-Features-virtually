.class public final Ll/ۗܺܺ;
.super Ll/֡ܺܺ;
.source "QBI7"


# static fields
.field public static final ᩹:Ll/ۗܺܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 40
    new-instance v0, Ll/ۗܺܺ;

    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, v1}, Ll/֡ܺܺ;-><init>(I)V

    .line 30
    sput-object v0, Ll/ۗܺܺ;->᩹:Ll/ۗܺܺ;

    return-void
.end method

.method public static ֫(I)Ll/ۗܺܺ;
    .locals 2

    int-to-short v0, p0

    if-ne v0, p0, :cond_0

    .line 40
    new-instance p0, Ll/ۗܺܺ;

    .line 68
    invoke-direct {p0, v0}, Ll/֡ܺܺ;-><init>(I)V

    return-object p0

    .line 55
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bogus short value: "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 55
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 85
    sget-object v0, Ll/۟ܺܺ;->ۙ֫:Ll/۟ܺܺ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 76
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "short{0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " / "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 101
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "short"

    return-object v0
.end method
