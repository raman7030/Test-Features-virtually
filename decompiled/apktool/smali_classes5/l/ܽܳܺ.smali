.class public final Ll/ܽܳܺ;
.super Ll/۠ܳܺ;
.source "3B9V"


# instance fields
.field public final ܿ:Ll/᩸ۡܺ;


# direct methods
.method public constructor <init>(Ll/ۤۡܺ;Ll/᩸ۡܺ;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Ll/۠ܳܺ;-><init>(Ll/ۤۡܺ;)V

    if-eqz p2, :cond_0

    .line 63
    iput-object p2, p0, Ll/ܽܳܺ;->ܿ:Ll/᩸ۡܺ;

    return-void

    .line 60
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "local == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/᩸ۡܺ;)Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴۡܺ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-virtual {p0}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ܽܳܺ;->ܿ:Ll/᩸ۡܺ;

    invoke-virtual {v0}, Ll/᩸ۡܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܽۖܺ;)Ll/ۙܿܺ;
    .locals 3

    .line 113
    new-instance v0, Ll/ܽܳܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v1

    iget-object v2, p0, Ll/ܽܳܺ;->ܿ:Ll/᩸ۡܺ;

    invoke-virtual {p1, v2}, Ll/ܽۖܺ;->֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/ܽܳܺ;-><init>(Ll/ۤۡܺ;Ll/᩸ۡܺ;)V

    return-object v0
.end method

.method public final ֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;
    .locals 2

    .line 79
    new-instance p1, Ll/ܽܳܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    iget-object v1, p0, Ll/ܽܳܺ;->ܿ:Ll/᩸ۡܺ;

    invoke-direct {p1, v0, v1}, Ll/ܽܳܺ;-><init>(Ll/ۤۡܺ;Ll/᩸ۡܺ;)V

    return-object p1
.end method

.method public final ۖ()Ll/᩸ۡܺ;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ܽܳܺ;->ܿ:Ll/᩸ۡܺ;

    return-object v0
.end method

.method public final ۧ(I)Ll/ۙܿܺ;
    .locals 3

    .line 71
    new-instance v0, Ll/ܽܳܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v1

    iget-object v2, p0, Ll/ܽܳܺ;->ܿ:Ll/᩸ۡܺ;

    invoke-virtual {v2, p1}, Ll/᩸ۡܺ;->֫(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/ܽܳܺ;-><init>(Ll/ۤۡܺ;Ll/᩸ۡܺ;)V

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 2

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "local-start "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܽܳܺ;->ܿ:Ll/᩸ۡܺ;

    invoke-static {v1}, Ll/ܽܳܺ;->֫(Ll/᩸ۡܺ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
