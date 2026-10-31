.class public final Ll/᩻ܺܺ;
.super Ll/ܰۡܺ;
.source "ZBCT"


# instance fields
.field public final ᩸:I

.field public final ᩹:Ll/ᩴܺܺ;


# direct methods
.method public constructor <init>(Ll/ᩴܺܺ;I)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ll/ܰۡܺ;-><init>()V

    .line 49
    iput-object p1, p0, Ll/᩻ܺܺ;->᩹:Ll/ᩴܺܺ;

    .line 50
    iput p2, p0, Ll/᩻ܺܺ;->᩸:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/᩻ܺܺ;->᩹:Ll/ᩴܺܺ;

    invoke-virtual {v0}, Ll/ᩴܺܺ;->֡()Ll/ܳܺܺ;

    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ll/ܳܺܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/᩻ܺܺ;->᩹:Ll/ᩴܺܺ;

    invoke-virtual {v0}, Ll/ᩴܺܺ;->֡()Ll/ܳܺܺ;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ll/ܳܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 2

    .line 74
    check-cast p1, Ll/᩻ܺܺ;

    .line 75
    iget-object v0, p0, Ll/᩻ܺܺ;->᩹:Ll/ᩴܺܺ;

    iget-object v1, p1, Ll/᩻ܺܺ;->᩹:Ll/ᩴܺܺ;

    invoke-virtual {v0, v1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 79
    :cond_0
    iget v0, p0, Ll/᩻ܺܺ;->᩸:I

    iget p1, p1, Ll/᩻ܺܺ;->᩸:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Ll/ܳܺܺ;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/᩻ܺܺ;->᩹:Ll/ᩴܺܺ;

    invoke-virtual {v0}, Ll/ᩴܺܺ;->֡()Ll/ܳܺܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ll/۟ܺܺ;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/᩻ܺܺ;->᩹:Ll/ᩴܺܺ;

    invoke-virtual {v0}, Ll/ᩴܺܺ;->ᩳ()Ll/۟ܺܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ll/᩺ܺܺ;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/᩻ܺܺ;->᩹:Ll/ᩴܺܺ;

    invoke-virtual {v0}, Ll/ᩴܺܺ;->֨()Ll/᩺ܺܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "CallSiteRef"

    return-object v0
.end method
