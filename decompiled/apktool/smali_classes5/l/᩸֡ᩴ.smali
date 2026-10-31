.class public final Ll/᩸֡ᩴ;
.super Ljava/lang/Object;
.source "E92A"

# interfaces
.implements Ll/᩹֡ᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public ᩸:Ll/֡ۚۢ;

.field public ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Ll/᩸֡ᩴ;->᩸:Ll/֡ۚۢ;

    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Ll/᩸֡ᩴ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-nez p1, :cond_0

    goto :goto_1

    .line 78
    :cond_0
    instance-of v0, p1, Ll/᩹֡ᩴ;

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p0, Ll/᩸֡ᩴ;->᩸:Ll/֡ۚۢ;

    check-cast p1, Ll/᩹֡ᩴ;

    invoke-interface {p1}, Ll/ܺ᩺ۘ;->ܽ()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/᩸֡ᩴ;->᩹:Z

    invoke-interface {p1}, Ll/᩹֡ᩴ;->ۧ()Z

    move-result p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    .line 81
    :cond_1
    instance-of v0, p1, Ll/ܺ᩺ۘ;

    if-eqz v0, :cond_2

    .line 82
    iget-object v0, p0, Ll/᩸֡ᩴ;->᩸:Ll/֡ۚۢ;

    check-cast p1, Ll/ܺ᩺ۘ;

    invoke-interface {p1}, Ll/ܺ᩺ۘ;->ܽ()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/᩸֡ᩴ;->᩹:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1}, Ll/ܺ᩺ۘ;->ܳ()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final first()Ljava/lang/Object;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩸֡ᩴ;->᩸:Ll/֡ۚۢ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 89
    iget-object v0, p0, Ll/᩸֡ᩴ;->᩸:Ll/֡ۚۢ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x13

    iget-boolean v1, p0, Ll/᩸֡ᩴ;->᩹:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v1, 0x4d5

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    iget-object v1, p0, Ll/᩸֡ᩴ;->᩸:Ll/֡ۚۢ;

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    iget-boolean v1, p0, Ll/᩸֡ᩴ;->᩹:Z

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ۚۢ;)V
    .locals 0

    .line 59
    iput-object p1, p0, Ll/᩸֡ᩴ;->᩸:Ll/֡ۚۢ;

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 65
    iget-boolean v0, p0, Ll/᩸֡ᩴ;->᩹:Z

    return v0
.end method

.method public final ܳ()Ljava/lang/Object;
    .locals 1

    .line 65
    iget-boolean v0, p0, Ll/᩸֡ᩴ;->᩹:Z

    .line 38
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x0

    .line 70
    iput-boolean v0, p0, Ll/᩸֡ᩴ;->᩹:Z

    return-void
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩸֡ᩴ;->᩸:Ll/֡ۚۢ;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 65
    iget-boolean v0, p0, Ll/᩸֡ᩴ;->᩹:Z

    .line 83
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
