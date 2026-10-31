.class public final Ll/۟ۜܺ;
.super Ll/ܺۜܺ;
.source "U4P4"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩶:Ll/۬ܺܺ;

.field public ᩹:Ll/ܰۜܺ;


# direct methods
.method public constructor <init>(Ll/۬ܺܺ;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ll/ܺۜܺ;-><init>()V

    if-eqz p1, :cond_0

    .line 49
    iput-object p1, p0, Ll/۟ۜܺ;->᩶:Ll/۬ܺܺ;

    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, Ll/۟ۜܺ;->᩹:Ll/ܰۜܺ;

    return-void

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "value == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 79
    check-cast p1, Ll/۟ۜܺ;

    .line 80
    iget-object v0, p0, Ll/۟ۜܺ;->᩶:Ll/۬ܺܺ;

    iget-object p1, p1, Ll/۟ۜܺ;->᩶:Ll/۬ܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 58
    instance-of v0, p1, Ll/۟ۜܺ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 62
    :cond_0
    check-cast p1, Ll/۟ۜܺ;

    .line 63
    iget-object v0, p0, Ll/۟ۜܺ;->᩶:Ll/۬ܺܺ;

    iget-object p1, p1, Ll/۟ۜܺ;->᩶:Ll/۬ܺܺ;

    invoke-virtual {v0, p1}, Ll/۬ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getValue()Ll/۬ܺܺ;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/۟ۜܺ;->᩶:Ll/۬ܺܺ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 71
    iget-object v0, p0, Ll/۟ۜܺ;->᩶:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 88
    sget-object v0, Ll/ۘۜܺ;->ܺ֫:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 2

    .line 104
    iget-object v0, p0, Ll/۟ۜܺ;->᩹:Ll/ܰۜܺ;

    if-nez v0, :cond_0

    .line 106
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۘ()Ll/ۙۜܺ;

    move-result-object p1

    .line 107
    new-instance v0, Ll/ܰۜܺ;

    iget-object v1, p0, Ll/۟ۜܺ;->᩶:Ll/۬ܺܺ;

    invoke-direct {v0, v1}, Ll/ܰۜܺ;-><init>(Ll/۬ܺܺ;)V

    iput-object v0, p0, Ll/۟ۜܺ;->᩹:Ll/ܰۜܺ;

    .line 108
    invoke-virtual {p1, v0}, Ll/ۙۜܺ;->֫(Ll/ۗۜܺ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 6

    .line 117
    iget-object p1, p0, Ll/۟ۜܺ;->᩹:Ll/ܰۜܺ;

    invoke-virtual {p1}, Ll/ۗۜܺ;->ܿ()I

    move-result p1

    .line 119
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܺۜܺ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۟ۜܺ;->᩶:Ll/۬ܺܺ;

    .line 349
    invoke-virtual {v1}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 350
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x62

    const/4 v4, 0x0

    if-gt v2, v3, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    const/16 v2, 0x5f

    .line 356
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "..."

    .line 360
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "\""

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v4, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 121
    invoke-static {p1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "  string_data_off: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p2, v1, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 124
    :cond_1
    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
