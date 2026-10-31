.class public final Ll/ۧۜܺ;
.super Ll/ۗۜܺ;
.source "556V"


# instance fields
.field public final ۗ:Ll/ۧܺܺ;

.field public ۬:[B


# direct methods
.method public constructor <init>(Ll/ۧܺܺ;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 53
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    .line 59
    iput-object p1, p0, Ll/ۧۜܺ;->ۗ:Ll/ۧܺܺ;

    const/4 p1, 0x0

    .line 60
    iput-object p1, p0, Ll/ۧۜܺ;->۬:[B

    return-void
.end method


# virtual methods
.method public final hashCode()I
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۧۜܺ;->ۗ:Ll/ۧܺܺ;

    invoke-virtual {v0}, Ll/ۧܺܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۗۜܺ;)I
    .locals 1

    .line 84
    check-cast p1, Ll/ۧۜܺ;

    .line 86
    iget-object v0, p0, Ll/ۧۜܺ;->ۗ:Ll/ۧܺܺ;

    iget-object p1, p1, Ll/ۧۜܺ;->ۗ:Ll/ۧܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 68
    sget-object v0, Ll/ۘۜܺ;->ۧ֫:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۧۜܺ;->ۗ:Ll/ۧܺܺ;

    invoke-static {p1, v0}, Ll/᩻᩷ܺ;->֫(Ll/֫ۜܺ;Ll/ܰۡܺ;)V

    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۧۜܺ;->ۗ:Ll/ۧܺܺ;

    invoke-virtual {v0}, Ll/ۧܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 2

    .line 125
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۗۜܺ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " encoded array"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 135
    new-instance v0, Ll/᩻᩷ܺ;

    invoke-direct {v0, p1, p2}, Ll/᩻᩷ܺ;-><init>(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    .line 136
    iget-object p1, p0, Ll/ۧۜܺ;->ۗ:Ll/ۧܺܺ;

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p2}, Ll/᩻᩷ܺ;->֫(Ll/ۧܺܺ;Z)V

    return-void

    .line 138
    :cond_0
    iget-object p1, p0, Ll/ۧۜܺ;->۬:[B

    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->֫([B)V

    return-void
.end method

.method public final ۧ(Ll/ۙۜܺ;I)V
    .locals 2

    .line 112
    new-instance p2, Ll/ᩳᩴܺ;

    invoke-direct {p2}, Ll/ᩳᩴܺ;-><init>()V

    .line 113
    new-instance v0, Ll/᩻᩷ܺ;

    invoke-virtual {p1}, Ll/ۛۜܺ;->ۧ()Ll/֫ۜܺ;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ll/᩻᩷ܺ;-><init>(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    .line 115
    iget-object p1, p0, Ll/ۧۜܺ;->ۗ:Ll/ۧܺܺ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/᩻᩷ܺ;->֫(Ll/ۧܺܺ;Z)V

    .line 116
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->᩻()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۧۜܺ;->۬:[B

    .line 117
    array-length p1, p1

    invoke-virtual {p0, p1}, Ll/ۗۜܺ;->֫(I)V

    return-void
.end method
