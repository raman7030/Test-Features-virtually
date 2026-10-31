.class public Ll/ܿ᩶᩵;
.super Ll/۬᩹᩵;
.source "WBYW"

# interfaces
.implements Ll/᩺᩶᩵;
.implements Ll/ܰ᩶᩵;


# instance fields
.field public final ۤ:Z


# direct methods
.method public constructor <init>(Ll/᩷ۛ᩵;)V
    .locals 6

    const-string v4, "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"

    const/4 v5, 0x1

    .line 31
    const-class v2, Ll/ۧ۬᩵;

    const-string v3, "classSimpleName"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Ll/۬᩹᩵;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Ll/ܿ᩶᩵;->ۤ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 66
    :cond_0
    instance-of v0, p1, Ll/ܿ᩶᩵;

    if-eqz v0, :cond_1

    .line 67
    check-cast p1, Ll/ܿ᩶᩵;

    .line 68
    invoke-virtual {p0}, Ll/۬᩹᩵;->ܿ()Ll/۫᩹᩵;

    move-result-object v0

    invoke-virtual {p1}, Ll/۬᩹᩵;->ܿ()Ll/۫᩹᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 69
    invoke-virtual {p0}, Ll/۬᩹᩵;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/۬᩹᩵;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    invoke-virtual {p0}, Ll/۬᩹᩵;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/۬᩹᩵;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 81
    iget-object v0, p0, Ll/۬᩹᩵;->ۙ:Ljava/lang/Object;

    iget-object p1, p1, Ll/۬᩹᩵;->ۙ:Ljava/lang/Object;

    .line 71
    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 73
    :cond_1
    instance-of v0, p1, Ll/ܰ᩶᩵;

    if-eqz v0, :cond_2

    .line 74
    invoke-virtual {p0}, Ll/ܿ᩶᩵;->ۧ()Ll/۫᩶᩵;

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

    .line 81
    invoke-virtual {p0}, Ll/۬᩹᩵;->ܿ()Ll/۫᩹᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

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

    .line 86
    invoke-virtual {p0}, Ll/ܿ᩶᩵;->ۧ()Ll/۫᩶᩵;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 91
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "property "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/۬᩹᩵;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (Kotlin reflection is not available)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 35
    invoke-interface {p0}, Ll/᩺᩶᩵;->get()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/۫᩶᩵;
    .locals 1

    .line 48
    iget-boolean v0, p0, Ll/ܿ᩶᩵;->ۤ:Z

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-super {p0}, Ll/۬᩹᩵;->ۧ()Ll/۫᩶᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/۫᩶᩵;
    .locals 0

    .line 30
    invoke-static {p0}, Ll/ۜ᩶᩵;->֫(Ll/ܿ᩶᩵;)V

    return-object p0
.end method
