.class public final Ll/ܳۜܺ;
.super Ljava/lang/Object;
.source "XBAQ"

# interfaces
.implements Ll/֡ᩴܺ;
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩸:Ll/֡᩻ܺ;

.field public final ᩹:Ll/ۡܺܺ;


# direct methods
.method public constructor <init>(Ll/ۡܺܺ;Ll/֡᩻ܺ;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Ll/ܳۜܺ;->᩹:Ll/ۡܺܺ;

    .line 57
    iput-object p2, p0, Ll/ܳۜܺ;->᩸:Ll/֡᩻ܺ;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 28
    check-cast p1, Ll/ܳۜܺ;

    .line 85
    iget-object v0, p0, Ll/ܳۜܺ;->᩹:Ll/ۡܺܺ;

    iget-object p1, p1, Ll/ܳۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 73
    instance-of v0, p1, Ll/ܳۜܺ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 77
    :cond_0
    check-cast p1, Ll/ܳۜܺ;

    iget-object p1, p1, Ll/ܳۜܺ;->᩹:Ll/ۡܺܺ;

    iget-object v0, p0, Ll/ܳۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v0, p1}, Ll/ܶܺܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ܳۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v0}, Ll/ܶܺܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܳۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v1}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳۜܺ;->᩸:Ll/֡᩻ܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 2

    .line 92
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object v0

    .line 93
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۚ()Ll/ۙۜܺ;

    move-result-object p1

    .line 95
    iget-object v1, p0, Ll/ܳۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v0, v1}, Ll/ۜۜܺ;->ۧ(Ll/ۡܺܺ;)Ll/᩻ۜܺ;

    .line 96
    iget-object v0, p0, Ll/ܳۜܺ;->᩸:Ll/֡᩻ܺ;

    invoke-virtual {p1, v0}, Ll/ۙۜܺ;->ۧ(Ll/ۗۜܺ;)Ll/ۗۜܺ;

    move-result-object p1

    check-cast p1, Ll/֡᩻ܺ;

    iput-object p1, p0, Ll/ܳۜܺ;->᩸:Ll/֡᩻ܺ;

    return-void
.end method

.method public final ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 4

    .line 103
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object p1

    iget-object v0, p0, Ll/ܳۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {p1, v0}, Ll/ۜۜܺ;->֫(Ll/ۡܺܺ;)I

    move-result p1

    .line 104
    iget-object v1, p0, Ll/ܳۜܺ;->᩸:Ll/֡᩻ܺ;

    invoke-virtual {v1}, Ll/ۗۜܺ;->ܿ()I

    move-result v1

    .line 106
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 107
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 108
    invoke-static {p1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "      field_idx:       "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {p2, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 110
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "      annotations_off: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 109
    invoke-virtual {p2, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 113
    :cond_0
    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 114
    invoke-virtual {p2, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method
