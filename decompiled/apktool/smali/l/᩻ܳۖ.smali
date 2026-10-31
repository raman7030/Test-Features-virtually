.class public final Ll/᩻ܳۖ;
.super Ll/۠ᩳۖ;
.source "H87Q"


# static fields
.field public static final ۧ:Ll/ܶᩳۖ;


# instance fields
.field public final ֫:Ll/ۚᩳۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 34
    sget-object v0, Ll/֡ᩳۖ;->ۙ:Ll/֡ᩳۖ;

    .line 44
    new-instance v1, Ll/᩻ܳۖ;

    invoke-direct {v1, v0}, Ll/᩻ܳۖ;-><init>(Ll/ۚᩳۖ;)V

    .line 45
    new-instance v0, Ll/ܿܳۖ;

    invoke-direct {v0, v1}, Ll/ܿܳۖ;-><init>(Ll/᩻ܳۖ;)V

    .line 35
    sput-object v0, Ll/᩻ܳۖ;->ۧ:Ll/ܶᩳۖ;

    return-void
.end method

.method public constructor <init>(Ll/ۚᩳۖ;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 40
    iput-object p1, p0, Ll/᩻ܳۖ;->֫:Ll/ۚᩳۖ;

    return-void
.end method

.method public static ֫(Ll/ۚᩳۖ;)Ll/ܶᩳۖ;
    .locals 1

    .line 55
    sget-object v0, Ll/֡ᩳۖ;->ۙ:Ll/֡ᩳۖ;

    if-ne p0, v0, :cond_0

    .line 56
    sget-object p0, Ll/᩻ܳۖ;->ۧ:Ll/ܶᩳۖ;

    return-object p0

    .line 44
    :cond_0
    new-instance v0, Ll/᩻ܳۖ;

    invoke-direct {v0, p0}, Ll/᩻ܳۖ;-><init>(Ll/ۚᩳۖ;)V

    .line 45
    new-instance p0, Ll/ܿܳۖ;

    invoke-direct {p0, v0}, Ll/ܿܳۖ;-><init>(Ll/᩻ܳۖ;)V

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 4

    .line 64
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    .line 65
    sget-object v1, Ll/ܳܳۖ;->֫:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    new-instance v1, Ll/ܳᩳۖ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expecting number, got: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 74
    throw v1

    .line 71
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩻ܳۖ;->֫:Ll/ۚᩳۖ;

    invoke-interface {v0, p1}, Ll/ۚᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    .line 67
    :cond_2
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 0

    .line 32
    check-cast p2, Ljava/lang/Number;

    .line 80
    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->֫(Ljava/lang/Number;)V

    return-void
.end method
