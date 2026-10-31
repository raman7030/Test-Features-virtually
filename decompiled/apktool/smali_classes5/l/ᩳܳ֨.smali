.class public final Ll/ᩳܳ֨;
.super Ll/ۡܳ֨;
.source "34PY"


# instance fields
.field public final ֫:Ll/ۡܳ֨;

.field public final ۧ:Ljava/util/List;

.field public final ܽ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ll/ۡܳ֨;Ljava/util/ArrayList;)V
    .locals 0

    .line 200
    invoke-direct {p0}, Ll/ۡܳ֨;-><init>()V

    .line 201
    iput-object p1, p0, Ll/ᩳܳ֨;->ܽ:Ljava/util/List;

    .line 202
    iput-object p2, p0, Ll/ᩳܳ֨;->֫:Ll/ۡܳ֨;

    .line 203
    iput-object p3, p0, Ll/ᩳܳ֨;->ۧ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    iget-object v1, p0, Ll/ᩳܳ֨;->ܽ:Ljava/util/List;

    const-string v2, ">"

    const-string v3, "<"

    invoke-static {v0, v3, v1, v2}, Ll/ۡܳ֨;->ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 214
    iget-object v1, p0, Ll/ᩳܳ֨;->֫:Ll/ۡܳ֨;

    if-eqz v1, :cond_0

    const-string v2, " extends "

    .line 215
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    :cond_0
    iget-object v1, p0, Ll/ᩳܳ֨;->ۧ:Ljava/util/List;

    const-string v2, ""

    const-string v3, " implements "

    invoke-static {v0, v3, v1, v2}, Ll/ۡܳ֨;->ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 219
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
