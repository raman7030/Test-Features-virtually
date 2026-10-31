.class public final Ll/ܿܳ֨;
.super Ll/ۡܳ֨;
.source "34PY"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ll/ܿܳ֨;

.field public final ܽ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ܿܳ֨;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 244
    invoke-direct {p0}, Ll/ۡܳ֨;-><init>()V

    .line 245
    iput-object p1, p0, Ll/ܿܳ֨;->ۧ:Ll/ܿܳ֨;

    .line 246
    iput-object p2, p0, Ll/ܿܳ֨;->֫:Ljava/lang/String;

    .line 247
    iput-object p3, p0, Ll/ܿܳ֨;->ܽ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    iget-object v1, p0, Ll/ܿܳ֨;->ۧ:Ll/ܿܳ֨;

    if-eqz v1, :cond_0

    .line 265
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    :cond_0
    iget-object v1, p0, Ll/ܿܳ֨;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    iget-object v1, p0, Ll/ܿܳ֨;->ܽ:Ljava/util/List;

    const-string v2, ">"

    const-string v3, "<"

    invoke-static {v0, v3, v1, v2}, Ll/ۡܳ֨;->ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 270
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 2

    .line 275
    iget-object v0, p0, Ll/ܿܳ֨;->ۧ:Ll/ܿܳ֨;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܿܳ֨;->֫:Ljava/lang/String;

    const-string v1, "java/lang/Object"

    .line 276
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܿܳ֨;->ܽ:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 277
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
