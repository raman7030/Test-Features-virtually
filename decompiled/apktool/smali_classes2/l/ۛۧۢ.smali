.class public final Ll/ۛۧۢ;
.super Ljava/lang/Object;
.source "K1EG"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/StringBuilder;

.field public ܽ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۛۧۢ;->ۧ:Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    .line 211
    iput-boolean v0, p0, Ll/ۛۧۢ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 240
    iget-object v0, p0, Ll/ۛۧۢ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 215
    iget-boolean v0, p0, Ll/ۛۧۢ;->ܽ:Z

    if-nez v0, :cond_0

    return-void

    .line 218
    :cond_0
    iget-object v0, p0, Ll/ۛۧۢ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/16 v2, 0x1388

    if-le v1, v2, :cond_1

    const/4 p1, 0x0

    .line 219
    iput-boolean p1, p0, Ll/ۛۧۢ;->ܽ:Z

    const-string p1, "\n......"

    .line 220
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 223
    :cond_1
    iget-object v1, p0, Ll/ۛۧۢ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 224
    iput-object p1, p0, Ll/ۛۧۢ;->֫:Ljava/lang/String;

    .line 225
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_2

    const-string v1, "\n\n"

    .line 226
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v1, ">> "

    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const/16 p1, 0xa

    .line 230
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 234
    iget-object v0, p0, Ll/ۛۧۢ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
