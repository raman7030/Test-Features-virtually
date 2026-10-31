.class public final Ll/֡۫ۘ;
.super Ll/ۚ۫ۘ;
.source "U4HR"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 226
    sget-object v0, Ll/֨۫ۘ;->۫:Ll/֨۫ۘ;

    invoke-direct {p0, v0}, Ll/ۚ۫ۘ;-><init>(Ll/֨۫ۘ;)V

    .line 227
    new-instance v0, Ll/ܳ۫ۘ;

    invoke-direct {v0}, Ll/ܳ۫ۘ;-><init>()V

    iput-object v0, p0, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 247
    iget-object v0, p0, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    const-string v1, ">"

    const-string v2, "<"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܳ۫ۘ;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۚ۫ۘ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 250
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۚ۫ۘ;->ܽ()Ljava/lang/String;

    move-result-object v2

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۚ۫ۘ;
    .locals 1

    .line 232
    invoke-super {p0}, Ll/ۚ۫ۘ;->֫()Ll/ۚ۫ۘ;

    .line 233
    new-instance v0, Ll/ܳ۫ۘ;

    invoke-direct {v0}, Ll/ܳ۫ۘ;-><init>()V

    iput-object v0, p0, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    return-object p0
.end method

.method public final bridge synthetic ֫()Ll/۠۫ۘ;
    .locals 0

    .line 224
    invoke-virtual {p0}, Ll/֡۫ۘ;->֫()Ll/ۚ۫ۘ;

    return-object p0
.end method
