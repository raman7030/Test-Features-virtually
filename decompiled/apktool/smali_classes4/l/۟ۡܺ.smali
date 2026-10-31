.class public final Ll/۟ۡܺ;
.super Ll/ܰۡܺ;
.source "GBCR"


# instance fields
.field public final ᩸:Ll/ۛۢܺ;


# direct methods
.method public constructor <init>(Ll/ۛۢܺ;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ll/ܰۡܺ;-><init>()V

    .line 40
    invoke-virtual {p1}, Ll/ᩴᩴܺ;->֡()V

    .line 42
    iput-object p1, p0, Ll/۟ۡܺ;->᩸:Ll/ۛۢܺ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 50
    instance-of v0, p1, Ll/۟ۡܺ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 54
    :cond_0
    check-cast p1, Ll/۟ۡܺ;

    iget-object p1, p1, Ll/۟ۡܺ;->᩸:Ll/ۛۢܺ;

    iget-object v0, p0, Ll/۟ۡܺ;->᩸:Ll/ۛۢܺ;

    invoke-virtual {v0, p1}, Ll/ۛۢܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 62
    iget-object v0, p0, Ll/۟ۡܺ;->᩸:Ll/ۛۢܺ;

    invoke-virtual {v0}, Ll/ۛۢܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/۟ۡܺ;->᩸:Ll/ۛۢܺ;

    .line 145
    invoke-virtual {v0}, Ll/ۛۢܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/۟ۡܺ;->᩸:Ll/ۛۢܺ;

    .line 145
    invoke-virtual {v0}, Ll/ۛۢܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 1

    .line 70
    check-cast p1, Ll/۟ۡܺ;

    iget-object p1, p1, Ll/۟ۡܺ;->᩸:Ll/ۛۢܺ;

    iget-object v0, p0, Ll/۟ۡܺ;->᩸:Ll/ۛۢܺ;

    invoke-virtual {v0, p1}, Ll/ۛۢܺ;->֫(Ll/ۛۢܺ;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Ll/ۛۢܺ;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/۟ۡܺ;->᩸:Ll/ۛۢܺ;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "annotation"

    return-object v0
.end method
