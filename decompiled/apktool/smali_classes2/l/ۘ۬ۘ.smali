.class public final Ll/ۘ۬ۘ;
.super Ljava/lang/Object;
.source "D911"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CssProperty{key=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۘ۬ۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', value=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘ۬ۘ;->ۧ:Ljava/lang/String;

    const-string v2, "\'}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ۘ۬ۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 14
    iput-object p1, p0, Ll/ۘ۬ۘ;->֫:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Ll/ۘ۬ۘ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۘ۬ۘ;->ۧ:Ljava/lang/String;

    return-object v0
.end method
