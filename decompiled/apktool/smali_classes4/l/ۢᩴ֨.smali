.class public final Ll/ۢᩴ֨;
.super Ll/ۖᩴ֨;
.source "C7LA"


# instance fields
.field public final ֫:Ljava/util/Set;

.field public final ۧ:Ll/֡֡֨;


# direct methods
.method public constructor <init>(Ll/֡֡֨;Ljava/util/EnumSet;)V
    .locals 0

    .line 290
    invoke-direct {p0}, Ll/ۖᩴ֨;-><init>()V

    .line 291
    iput-object p1, p0, Ll/ۢᩴ֨;->ۧ:Ll/֡֡֨;

    .line 292
    iput-object p2, p0, Ll/ۢᩴ֨;->֫:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 317
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Requires["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۢᩴ֨;->֫:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۢᩴ֨;->ۧ:Ll/֡֡֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩳ᩹۠;)V
    .locals 0

    .line 322
    invoke-interface {p1, p0}, Ll/ᩳ᩹۠;->֫(Ll/ۢᩴ֨;)V

    return-void
.end method
