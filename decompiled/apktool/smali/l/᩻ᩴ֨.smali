.class public final Ll/᩻ᩴ֨;
.super Ll/ۖᩴ֨;
.source "C7LA"


# instance fields
.field public final ֫:Ljava/util/Set;

.field public final ۧ:Ll/ۖܶ۠;

.field public final ܽ:Ll/۠֡֨;


# direct methods
.method public constructor <init>(Ll/۠֡֨;Ll/ۖܶ۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 188
    invoke-direct {p0}, Ll/ۖᩴ֨;-><init>()V

    .line 189
    iput-object p1, p0, Ll/᩻ᩴ֨;->ܽ:Ll/۠֡֨;

    .line 190
    iput-object p2, p0, Ll/᩻ᩴ֨;->ۧ:Ll/ۖܶ۠;

    .line 191
    iput-object p3, p0, Ll/᩻ᩴ֨;->֫:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, "]"

    .line 213
    iget-object v1, p0, Ll/᩻ᩴ֨;->ܽ:Ll/۠֡֨;

    const-string v2, "Opens["

    iget-object v3, p0, Ll/᩻ᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-nez v3, :cond_0

    .line 214
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 216
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩳ᩹۠;)V
    .locals 0

    .line 221
    invoke-interface {p1, p0}, Ll/ᩳ᩹۠;->֫(Ll/᩻ᩴ֨;)V

    return-void
.end method
