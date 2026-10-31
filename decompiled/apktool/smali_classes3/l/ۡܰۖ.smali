.class public final Ll/ۡܰۖ;
.super Ljava/lang/Object;
.source "D9E2"


# static fields
.field public static final ۧ:Ll/֫᩻֨;


# instance fields
.field public ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    const-class v0, Ll/ۡܰۖ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۡܰۖ;->ۧ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TargetInfo{targetInfo="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۡܰۖ;
    .locals 3

    .line 60
    new-instance v0, Ll/ۡܰۖ;

    invoke-direct {v0}, Ll/ۡܰۖ;-><init>()V

    .line 61
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩺ۖ;)Ll/۬᩺ۖ;
    .locals 3

    .line 67
    iget-object v0, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩺ۖ;

    .line 68
    invoke-virtual {v1}, Ll/۬᩺ۖ;->֫()Ll/ۗ᩺ۖ;

    move-result-object v2

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/۫ܰۖ;)V
    .locals 5

    .line 40
    :goto_0
    invoke-static {p1}, Ll/ۨ᩺ۖ;->֫(Ll/۫ܰۖ;)Ll/۬᩺ۖ;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ll/۬᩺ۖ;->֫()Ll/ۗ᩺ۖ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩺ۖ;->۫:Ll/ۗ᩺ۖ;

    if-ne v1, v2, :cond_0

    return-void

    .line 44
    :cond_0
    invoke-virtual {v0}, Ll/۬᩺ۖ;->֫()Ll/ۗ᩺ۖ;

    move-result-object v1

    invoke-virtual {v0}, Ll/۬᩺ۖ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Ll/ۡܰۖ;->ۧ:Ll/֫᩻֨;

    const-string v4, "Read TargetInfo {} --> {}"

    invoke-interface {v3, v4, v1, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    iget-object v1, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final ֫(Ll/۬᩺ۖ;)V
    .locals 4

    .line 76
    iget-object v0, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩺ۖ;

    .line 77
    invoke-virtual {v1}, Ll/۬᩺ۖ;->֫()Ll/ۗ᩺ۖ;

    move-result-object v2

    invoke-virtual {p1}, Ll/۬᩺ۖ;->֫()Ll/ۗ᩺ۖ;

    move-result-object v3

    if-ne v2, v3, :cond_0

    .line 78
    iget-object v0, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 82
    :cond_1
    iget-object v0, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ll/۫ܰۖ;)V
    .locals 6

    .line 52
    iget-object v0, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩺ۖ;

    .line 53
    invoke-virtual {v1}, Ll/۬᩺ۖ;->֫()Ll/ۗ᩺ۖ;

    move-result-object v2

    invoke-virtual {v1}, Ll/۬᩺ۖ;->ۧ()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Ll/ۡܰۖ;->ۧ:Ll/֫᩻֨;

    const-string v5, "Writing TargetInfo {} --> {}"

    invoke-interface {v4, v5, v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    invoke-virtual {v1, p1}, Ll/۬᩺ۖ;->֫(Ll/۫ܰۖ;)V

    goto :goto_0

    .line 56
    :cond_0
    new-instance v0, Ll/ۤ᩺ۖ;

    invoke-direct {v0}, Ll/ۤ᩺ۖ;-><init>()V

    invoke-virtual {v0, p1}, Ll/ۤ᩺ۖ;->֫(Ll/۫ܰۖ;)V

    return-void
.end method

.method public final ۧ(Ll/ۗ᩺ۖ;)Z
    .locals 2

    .line 86
    iget-object v0, p0, Ll/ۡܰۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩺ۖ;

    .line 87
    invoke-virtual {v1}, Ll/۬᩺ۖ;->֫()Ll/ۗ᩺ۖ;

    move-result-object v1

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
