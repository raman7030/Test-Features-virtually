.class public final Ll/ܺ᩻ۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# instance fields
.field public final synthetic ֫:Ll/ۖ᩻ۖ;

.field public final synthetic ۧ:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ll/ۖ᩻ۖ;Ljava/lang/Class;)V
    .locals 0

    .line 907
    iput-object p1, p0, Ll/ܺ᩻ۖ;->֫:Ll/ۖ᩻ۖ;

    iput-object p2, p0, Ll/ܺ᩻ۖ;->ۧ:Ljava/lang/Class;

    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 5

    .line 915
    iget-object v0, p0, Ll/ܺ᩻ۖ;->֫:Ll/ۖ᩻ۖ;

    iget-object v0, v0, Ll/ۖ᩻ۖ;->᩹:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 916
    iget-object v1, p0, Ll/ܺ᩻ۖ;->ۧ:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 917
    :cond_0
    new-instance v2, Ll/ܳᩳۖ;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Expected a "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 919
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 921
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 923
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 923
    throw v2

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 1

    .line 910
    iget-object v0, p0, Ll/ܺ᩻ۖ;->֫:Ll/ۖ᩻ۖ;

    iget-object v0, v0, Ll/ۖ᩻ۖ;->᩹:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1, p2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void
.end method
