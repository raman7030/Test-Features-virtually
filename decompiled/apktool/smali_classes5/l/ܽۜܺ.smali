.class public final Ll/ܽۜܺ;
.super Ll/ᩳۜܺ;
.source "WBEW"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩹:Ll/ۡܺܺ;


# direct methods
.method public constructor <init>(Ll/ۡܺܺ;I)V
    .locals 0

    .line 45
    invoke-direct {p0, p2}, Ll/ᩳۜܺ;-><init>(I)V

    .line 56
    iput-object p1, p0, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 31
    check-cast p1, Ll/ܽۜܺ;

    .line 89
    iget-object v0, p0, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    iget-object p1, p1, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 72
    instance-of v0, p1, Ll/ܽۜܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 76
    :cond_0
    check-cast p1, Ll/ܽۜܺ;

    .line 89
    iget-object v0, p0, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    iget-object p1, p1, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v0}, Ll/ܶܺܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 99
    const-class v1, Ll/ܽۜܺ;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    invoke-virtual {p0}, Ll/ᩳۜܺ;->ܽ()I

    move-result v1

    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    iget-object v1, p0, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;II)I
    .locals 4

    .line 157
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object p1

    iget-object v0, p0, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {p1, v0}, Ll/ۜۜܺ;->֫(Ll/ۡܺܺ;)I

    move-result p1

    sub-int p3, p1, p3

    .line 159
    invoke-virtual {p0}, Ll/ᩳۜܺ;->ܽ()I

    move-result v1

    .line 161
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 162
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    .line 163
    invoke-virtual {v0}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p4, v2, v3

    const/4 p4, 0x1

    aput-object v0, v2, p4

    const-string p4, "  [%x] %s"

    .line 162
    invoke-static {p4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, v3, p4}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 164
    invoke-static {p3}, Ll/֨ۧܺ;->ۧ(I)I

    move-result p4

    .line 165
    invoke-static {p1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "    field_idx:    "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 164
    invoke-virtual {p2, p4, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 166
    invoke-static {v1}, Ll/֨ۧܺ;->ۧ(I)I

    move-result p4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "    access_flags: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    invoke-static {v1}, Ll/֫ۡܺ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 166
    invoke-virtual {p2, p4, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 171
    :cond_0
    invoke-virtual {p2, p3}, Ll/ᩳᩴܺ;->ۜ(I)I

    .line 172
    invoke-virtual {p2, v1}, Ll/ᩳᩴܺ;->ۜ(I)I

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {v0}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 1

    .line 113
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object p1

    .line 114
    iget-object v0, p0, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    invoke-virtual {p1, v0}, Ll/ۜۜܺ;->ۧ(Ll/ۡܺܺ;)Ll/᩻ۜܺ;

    return-void
.end method

.method public final ۧ()Ll/ۡܺܺ;
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ܽۜܺ;->᩹:Ll/ۡܺܺ;

    return-object v0
.end method
