.class public final Ll/۠ܺܺ;
.super Ll/ۚܺܺ;
.source "ABB0"


# static fields
.field public static final ᩶:Ll/۠ܺܺ;

.field public static final ᩹:Ll/۠ܺܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 48
    new-instance v0, Ll/۠ܺܺ;

    const-wide/16 v1, 0x0

    .line 57
    invoke-direct {v0, v1, v2}, Ll/ۚܺܺ;-><init>(J)V

    .line 30
    sput-object v0, Ll/۠ܺܺ;->᩹:Ll/۠ܺܺ;

    .line 48
    new-instance v0, Ll/۠ܺܺ;

    const-wide/16 v1, 0x1

    .line 57
    invoke-direct {v0, v1, v2}, Ll/ۚܺܺ;-><init>(J)V

    .line 35
    sput-object v0, Ll/۠ܺܺ;->᩶:Ll/۠ܺܺ;

    return-void
.end method

.method public static ֫(J)Ll/۠ܺܺ;
    .locals 1

    .line 48
    new-instance v0, Ll/۠ܺܺ;

    .line 57
    invoke-direct {v0, p0, p1}, Ll/ۚܺܺ;-><init>(J)V

    return-object v0
.end method


# virtual methods
.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 74
    sget-object v0, Ll/۟ܺܺ;->᩵֫:Ll/۟ܺܺ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 65
    invoke-virtual {p0}, Ll/ۚܺܺ;->֡()J

    move-result-wide v0

    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "long{0x"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ll/ܳᩴܺ;->֫(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " / "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 90
    invoke-virtual {p0}, Ll/ۚܺܺ;->֡()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "long"

    return-object v0
.end method
