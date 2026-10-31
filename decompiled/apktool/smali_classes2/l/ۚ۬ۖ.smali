.class public abstract Ll/ۚ۬ۖ;
.super Ljava/lang/Object;
.source "49FQ"


# instance fields
.field public ᩸:Ll/ۨ۬ۖ;


# direct methods
.method public constructor <init>(Ll/ۨ۬ۖ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ۚ۬ۖ;->᩸:Ll/ۨ۬ۖ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_4

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 33
    :cond_1
    check-cast p1, Ll/ۚ۬ۖ;

    .line 35
    iget-object v0, p0, Ll/ۚ۬ۖ;->᩸:Ll/ۨ۬ۖ;

    iget-object v1, p1, Ll/ۚ۬ۖ;->᩸:Ll/ۨ۬ۖ;

    if-eq v0, v1, :cond_2

    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {p0}, Ll/ۚ۬ۖ;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ll/ۚ۬ۖ;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۚ۬ۖ;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p1}, Ll/ۚ۬ۖ;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public abstract getValue()Ljava/lang/Object;
.end method

.method public final hashCode()I
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ۚ۬ۖ;->᩸:Ll/ۨ۬ۖ;

    invoke-virtual {v0}, Ll/ۨ۬ۖ;->ܽ()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۚ۬ۖ;->ܽ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "]"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ۨ۬ۖ;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۚ۬ۖ;->᩸:Ll/ۨ۬ۖ;

    return-object v0
.end method

.method public ܽ()Ljava/lang/String;
    .locals 1

    .line 52
    invoke-virtual {p0}, Ll/ۚ۬ۖ;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۚ۬ۖ;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
