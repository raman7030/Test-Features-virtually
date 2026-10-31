.class public final Ll/ۨ᩶ۘ;
.super Ljava/lang/Object;
.source "AA3Y"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/ۨ᩶ۘ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۨ᩶ۘ;
    .locals 1

    .line 24
    new-instance v0, Ll/ۨ᩶ۘ;

    invoke-direct {v0, p0}, Ll/ۨ᩶ۘ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 68
    const-class v0, Ll/ۨ᩶ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 70
    :cond_1
    check-cast p1, Ll/ۨ᩶ۘ;

    .line 72
    iget-object v0, p0, Ll/ۨ᩶ۘ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۨ᩶ۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۨ᩶ۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Prop{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۨ᩶ۘ;->֫:Ljava/lang/String;

    const-string v2, "\'}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܰ᩶ۘ;)Ljava/lang/Object;
    .locals 0

    .line 40
    check-cast p1, Ll/۟᩶ۘ;

    invoke-virtual {p1, p0}, Ll/۟᩶ۘ;->֫(Ll/ۨ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V
    .locals 0

    .line 58
    check-cast p1, Ll/۟᩶ۘ;

    invoke-virtual {p1, p0, p2}, Ll/۟᩶ۘ;->֫(Ll/ۨ᩶ۘ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;
    .locals 0

    .line 45
    check-cast p1, Ll/۟᩶ۘ;

    invoke-virtual {p1, p0}, Ll/۟᩶ۘ;->ۧ(Ll/ۨ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;
    .locals 1

    .line 40
    check-cast p1, Ll/۟᩶ۘ;

    invoke-virtual {p1, p0}, Ll/۟᩶ۘ;->֫(Ll/ۨ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    iget-object v0, p0, Ll/ۨ᩶ۘ;->֫:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
