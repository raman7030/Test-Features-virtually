.class public final Ll/۟۠ۖ;
.super Ljava/lang/Object;
.source "D5R7"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ll/ۧܶۖ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/ۧܶۖ;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/۟۠ۖ;->ۧ:Ljava/lang/String;

    .line 51
    iput-object p2, p0, Ll/۟۠ۖ;->֫:Ljava/lang/String;

    .line 52
    iput-object p3, p0, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/۟۠ۖ;->ۧ:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Ll/۟۠ۖ;->֫:Ljava/lang/String;

    .line 47
    new-instance p1, Ll/ۧܶۖ;

    invoke-direct {p1, p4, p3}, Ll/ۧܶۖ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    iput-object p1, p0, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_6

    .line 86
    const-class v1, Ll/۟۠ۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_2

    .line 88
    :cond_1
    check-cast p1, Ll/۟۠ۖ;

    iget-object v1, p1, Ll/۟۠ۖ;->ۧ:Ljava/lang/String;

    iget-object v2, p1, Ll/۟۠ۖ;->֫:Ljava/lang/String;

    .line 90
    iget-object v3, p0, Ll/۟۠ۖ;->֫:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    :goto_0
    return v0

    .line 91
    :cond_3
    iget-object v2, p0, Ll/۟۠ۖ;->ۧ:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_4
    if-eqz v1, :cond_5

    :goto_1
    return v0

    .line 92
    :cond_5
    iget-object v0, p0, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    iget-object p1, p1, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    invoke-virtual {v0, p1}, Ll/ۧܶۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_2
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 97
    iget-object v1, p0, Ll/۟۠ۖ;->֫:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 98
    iget-object v2, p0, Ll/۟۠ۖ;->ۧ:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 99
    iget-object v0, p0, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    invoke-virtual {v0}, Ll/ۧܶۖ;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    iget-object v1, p0, Ll/۟۠ۖ;->ۧ:Ljava/lang/String;

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    iget-object v1, p0, Ll/۟۠ۖ;->֫:Ljava/lang/String;

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    iget-object v1, p0, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    invoke-virtual {v1}, Ll/ۧܶۖ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    invoke-virtual {v0}, Ll/ۧܶۖ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/۟۠ۖ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    invoke-virtual {v0}, Ll/ۧܶۖ;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/۟۠ۖ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ll/ۧܶۖ;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    return-object v0
.end method

.method public final ᩳ()[Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/۟۠ۖ;->ܽ:Ll/ۧܶۖ;

    invoke-virtual {v0}, Ll/ۧܶۖ;->ۧ()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
