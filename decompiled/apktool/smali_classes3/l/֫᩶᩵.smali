.class public Ll/֫᩶᩵;
.super Ll/۬᩹᩵;
.source "7BTO"

# interfaces
.implements Ll/۟᩹᩵;
.implements Ll/ۛ᩶᩵;


# instance fields
.field public final ۤ:I


# direct methods
.method public constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    .line 27
    invoke-direct/range {v0 .. v5}, Ll/۬᩹᩵;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 28
    iput p1, p0, Ll/֫᩶᩵;->ۤ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 81
    :cond_0
    instance-of v0, p1, Ll/֫᩶᩵;

    if-eqz v0, :cond_1

    .line 82
    check-cast p1, Ll/֫᩶᩵;

    .line 84
    invoke-virtual {p0}, Ll/۬᩹᩵;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/۬᩹᩵;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    invoke-virtual {p0}, Ll/۬᩹᩵;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/۬᩹᩵;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 81
    iget-object v0, p0, Ll/۬᩹᩵;->ۙ:Ljava/lang/Object;

    iget-object v1, p1, Ll/۬᩹᩵;->ۙ:Ljava/lang/Object;

    .line 86
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 87
    invoke-virtual {p0}, Ll/۬᩹᩵;->ܿ()Ll/۫᩹᩵;

    move-result-object v0

    invoke-virtual {p1}, Ll/۬᩹᩵;->ܿ()Ll/۫᩹᩵;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 89
    :cond_1
    instance-of v0, p1, Ll/ۛ᩶᩵;

    if-eqz v0, :cond_2

    .line 90
    invoke-virtual {p0}, Ll/۬᩹᩵;->ۧ()Ll/۫᩶᩵;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 97
    invoke-virtual {p0}, Ll/۬᩹᩵;->ܿ()Ll/۫᩹᩵;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/۬᩹᩵;->ܿ()Ll/۫᩹᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    :goto_0
    invoke-virtual {p0}, Ll/۬᩹᩵;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p0}, Ll/۬᩹᩵;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 102
    invoke-virtual {p0}, Ll/۬᩹᩵;->ۧ()Ll/۫᩶᩵;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "<init>"

    .line 108
    invoke-virtual {p0}, Ll/۬᩹᩵;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "constructor (Kotlin reflection is not available)"

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "function "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    invoke-virtual {p0}, Ll/۬᩹᩵;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (Kotlin reflection is not available)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()I
    .locals 1

    .line 33
    iget v0, p0, Ll/֫᩶᩵;->ۤ:I

    return v0
.end method

.method public final ܽ()Ll/۫᩶᩵;
    .locals 0

    .line 45
    invoke-static {p0}, Ll/ۜ᩶᩵;->֫(Ll/֫᩶᩵;)V

    return-object p0
.end method
