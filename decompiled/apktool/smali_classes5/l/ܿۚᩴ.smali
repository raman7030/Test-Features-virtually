.class public final Ll/ܿۚᩴ;
.super Ljava/lang/Object;
.source "MA3Q"

# interfaces
.implements Ll/ܺ᩺ۘ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:Ljava/lang/Object;

.field public final ᩹:Ll/ۛܿᩳ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۛܿᩳ;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ܿۚᩴ;->᩸:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, Ll/ܿۚᩴ;->᩹:Ll/ۛܿᩳ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 66
    :cond_0
    instance-of v0, p1, Ll/ܺ᩺ۘ;

    if-eqz v0, :cond_1

    .line 67
    check-cast p1, Ll/ܺ᩺ۘ;

    invoke-interface {p1}, Ll/ܺ᩺ۘ;->ܽ()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll/ܿۚᩴ;->᩸:Ljava/lang/Object;

    invoke-static {v1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܿۚᩴ;->᩹:Ll/ۛܿᩳ;

    invoke-interface {p1}, Ll/ܺ᩺ۘ;->ܳ()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final first()Ljava/lang/Object;
    .locals 1

    .line 99
    invoke-virtual {p0}, Ll/ܿۚᩴ;->ܽ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 74
    iget-object v0, p0, Ll/ܿۚᩴ;->᩸:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x13

    iget-object v1, p0, Ll/ܿۚᩴ;->᩹:Ll/ۛܿᩳ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    iget-object v1, p0, Ll/ܿۚᩴ;->᩸:Ljava/lang/Object;

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    iget-object v1, p0, Ll/ܿۚᩴ;->᩹:Ll/ۛܿᩳ;

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/Object;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ܿۚᩴ;->᩹:Ll/ۛܿᩳ;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ܿۚᩴ;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ܿۚᩴ;->᩹:Ll/ۛܿᩳ;

    return-object v0
.end method
