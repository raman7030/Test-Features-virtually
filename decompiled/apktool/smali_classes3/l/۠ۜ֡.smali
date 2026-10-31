.class public Ll/۠ۜ֡;
.super Ll/ܽۜ֡;
.source "XAQ5"


# instance fields
.field public final ܽ:Ll/ܽۜ֡;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/ܽۜ֡;I)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 111
    invoke-static {v0, p1}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result v0

    .line 112
    invoke-static {v0, p2}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    const/4 v1, 0x2

    .line 113
    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 105
    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    .line 14
    :goto_0
    invoke-direct {p0, v0}, Ll/ܽۜ֡;-><init>(I)V

    .line 16
    iput-object p1, p0, Ll/۠ۜ֡;->ܽ:Ll/ܽۜ֡;

    .line 17
    iput p2, p0, Ll/۠ۜ֡;->ᩳ:I

    return-void
.end method

.method public static ֫(Ll/ܽۜ֡;I)Ll/۠ۜ֡;
    .locals 1

    const v0, 0x7fffffff

    if-ne p1, v0, :cond_0

    if-nez p0, :cond_0

    .line 23
    sget-object p0, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    return-object p0

    .line 25
    :cond_0
    new-instance v0, Ll/۠ۜ֡;

    invoke-direct {v0, p0, p1}, Ll/۠ۜ֡;-><init>(Ll/ܽۜ֡;I)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 50
    :cond_0
    instance-of v1, p1, Ll/۠ۜ֡;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 54
    :cond_1
    move-object v1, p1

    check-cast v1, Ll/ܽۜ֡;

    .line 97
    iget v1, v1, Ll/ܽۜ֡;->֫:I

    .line 54
    iget v3, p0, Ll/ܽۜ֡;->֫:I

    if-eq v3, v1, :cond_2

    return v2

    .line 58
    :cond_2
    check-cast p1, Ll/۠ۜ֡;

    .line 59
    iget v1, p0, Ll/۠ۜ֡;->ᩳ:I

    iget v3, p1, Ll/۠ۜ֡;->ᩳ:I

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Ll/۠ۜ֡;->ܽ:Ll/ܽۜ֡;

    if-eqz v1, :cond_3

    iget-object p1, p1, Ll/۠ۜ֡;->ܽ:Ll/ܽۜ֡;

    .line 60
    invoke-virtual {v1, p1}, Ll/ܽۜ֡;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 65
    iget-object v0, p0, Ll/۠ۜ֡;->ܽ:Ll/ܽۜ֡;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 66
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Ll/۠ۜ֡;->ᩳ:I

    if-nez v1, :cond_2

    const v0, 0x7fffffff

    if-ne v2, v0, :cond_1

    const-string v0, "$"

    return-object v0

    .line 70
    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 72
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(I)Ll/ܽۜ֡;
    .locals 0

    .line 36
    iget-object p1, p0, Ll/۠ۜ֡;->ܽ:Ll/ܽۜ֡;

    return-object p1
.end method

.method public ۧ(I)I
    .locals 0

    .line 42
    iget p1, p0, Ll/۠ۜ֡;->ᩳ:I

    return p1
.end method

.method public ܽ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
