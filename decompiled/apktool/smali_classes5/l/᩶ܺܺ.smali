.class public final Ll/᩶ܺܺ;
.super Ll/ܰۡܺ;
.source "EBCE"


# static fields
.field public static final ᩶:Ll/᩶ܺܺ;


# instance fields
.field public final ᩸:Ll/۬ܺܺ;

.field public final ᩹:Ll/۬ܺܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 30
    new-instance v0, Ll/᩶ܺܺ;

    new-instance v1, Ll/۬ܺܺ;

    const-string v2, "TYPE"

    invoke-direct {v1, v2}, Ll/۬ܺܺ;-><init>(Ljava/lang/String;)V

    new-instance v2, Ll/۬ܺܺ;

    const-string v3, "Ljava/lang/Class;"

    invoke-direct {v2, v3}, Ll/۬ܺܺ;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Ll/᩶ܺܺ;-><init>(Ll/۬ܺܺ;Ll/۬ܺܺ;)V

    sput-object v0, Ll/᩶ܺܺ;->᩶:Ll/᩶ܺܺ;

    return-void
.end method

.method public constructor <init>(Ll/۬ܺܺ;Ll/۬ܺܺ;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ll/ܰۡܺ;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 59
    iput-object p1, p0, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    .line 60
    iput-object p2, p0, Ll/᩶ܺܺ;->᩸:Ll/۬ܺܺ;

    return-void

    .line 56
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "descriptor == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "name == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 68
    instance-of v0, p1, Ll/᩶ܺܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 72
    :cond_0
    check-cast p1, Ll/᩶ܺܺ;

    .line 73
    iget-object v0, p0, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    iget-object v2, p1, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    invoke-virtual {v0, v2}, Ll/۬ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩶ܺܺ;->᩸:Ll/۬ܺܺ;

    iget-object p1, p1, Ll/᩶ܺܺ;->᩸:Ll/۬ܺܺ;

    .line 74
    invoke-virtual {v0, p1}, Ll/۬ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final getName()Ll/۬ܺܺ;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 82
    iget-object v0, p0, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/᩶ܺܺ;->᩸:Ll/۬ܺܺ;

    invoke-virtual {v1}, Ll/۬ܺܺ;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "nat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/᩶ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Z
    .locals 2

    .line 185
    iget-object v0, p0, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<clinit>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    invoke-virtual {v1}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩶ܺܺ;->᩸:Ll/۬ܺܺ;

    invoke-virtual {v1}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۚ()Z
    .locals 2

    .line 173
    iget-object v0, p0, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<init>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 2

    .line 90
    check-cast p1, Ll/᩶ܺܺ;

    .line 91
    iget-object v0, p0, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    iget-object v1, p1, Ll/᩶ܺܺ;->᩹:Ll/۬ܺܺ;

    invoke-virtual {v0, v1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 97
    :cond_0
    iget-object v0, p0, Ll/᩶ܺܺ;->᩸:Ll/۬ܺܺ;

    iget-object p1, p1, Ll/᩶ܺܺ;->᩸:Ll/۬ܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Ll/۬ܺܺ;
    .locals 1

    .line 139
    iget-object v0, p0, Ll/᩶ܺܺ;->᩸:Ll/۬ܺܺ;

    return-object v0
.end method

.method public final ᩴ()Ll/۟ܺܺ;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/᩶ܺܺ;->᩸:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۟ܺܺ;->֫(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "nat"

    return-object v0
.end method
