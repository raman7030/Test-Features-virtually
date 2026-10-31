.class public Ll/ܿ᩵֨;
.super Ll/۟᩵֨;
.source "R450"

# interfaces
.implements Ll/ۛ᩵֨;


# instance fields
.field public ܽ:I

.field public ᩳ:Ll/ᩴܶ۠;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;)V
    .locals 0

    .line 1030
    invoke-direct {p0, p1}, Ll/۟᩵֨;-><init>(Ll/ۛ֡֨;)V

    .line 1026
    new-instance p1, Ll/ᩴܶ۠;

    invoke-direct {p1}, Ll/ᩴܶ۠;-><init>()V

    iput-object p1, p0, Ll/ܿ᩵֨;->ᩳ:Ll/ᩴܶ۠;

    const/4 p1, 0x0

    .line 1027
    iput p1, p0, Ll/ܿ᩵֨;->ܽ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1067
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CompoundScope{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1070
    iget-object v1, p0, Ll/ܿ᩵֨;->ᩳ:Ll/ᩴܶ۠;

    invoke-virtual {v1}, Ll/ᩴܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, ""

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟᩵֨;

    .line 1071
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1072
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ","

    goto :goto_0

    :cond_0
    const-string v1, "}"

    .line 1075
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1076
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 1

    .line 1082
    new-instance v0, Ll/ۧ᩵֨;

    invoke-direct {v0, p0, p1, p2}, Ll/ۧ᩵֨;-><init>(Ll/ܿ᩵֨;Ljava/util/function/Predicate;Ll/֨᩵֨;)V

    return-object v0
.end method

.method public ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 1

    .line 1092
    new-instance v0, Ll/֫᩵֨;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/֫᩵֨;-><init>(Ll/ܿ᩵֨;Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)V

    return-object v0
.end method

.method public final ֫(Ll/ۛ֡֨;)Ll/۟᩵֨;
    .locals 3

    .line 1101
    iget-object v0, p0, Ll/ܿ᩵֨;->ᩳ:Ll/ᩴܶ۠;

    invoke-virtual {v0}, Ll/ᩴܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟᩵֨;

    .line 1102
    invoke-virtual {v1, p1}, Ll/۟᩵֨;->ۧ(Ll/ۛ֡֨;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1103
    invoke-virtual {v1, p1}, Ll/۟᩵֨;->֫(Ll/ۛ֡֨;)Ll/۟᩵֨;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/۟᩵֨;)V
    .locals 2

    .line 1044
    iget-object v0, p0, Ll/ܿ᩵֨;->ᩳ:Ll/ᩴܶ۠;

    invoke-virtual {v0, p1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1045
    iget-object p1, p1, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    .line 185
    iget-object v0, p1, Ll/ۨ᩵֨;->֫:Ll/ۖܶ۠;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p1, Ll/ۨ᩵֨;->֫:Ll/ۖܶ۠;

    .line 1046
    iget p1, p0, Ll/ܿ᩵֨;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܿ᩵֨;->ܽ:I

    .line 1047
    iget-object p1, p0, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Ll/ۨ᩵֨;->֫(Ll/۟᩵֨;Ll/ۛ֡֨;)V

    return-void
.end method

.method public final ֫(Ll/۟᩵֨;Ll/ۛ֡֨;)V
    .locals 1

    .line 1052
    iget v0, p0, Ll/ܿ᩵֨;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܿ᩵֨;->ܽ:I

    .line 1053
    iget-object v0, p0, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    invoke-virtual {v0, p1, p2}, Ll/ۨ᩵֨;->֫(Ll/۟᩵֨;Ll/ۛ֡֨;)V

    return-void
.end method

.method public ۧ()I
    .locals 1

    .line 1062
    iget v0, p0, Ll/ܿ᩵֨;->ܽ:I

    return v0
.end method

.method public final ۧ(Ll/۟᩵֨;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1035
    iget-object v0, p0, Ll/ܿ᩵֨;->ᩳ:Ll/ᩴܶ۠;

    invoke-virtual {v0, p1}, Ll/ᩴܶ۠;->ۧ(Ljava/lang/Object;)V

    .line 1036
    iget-object p1, p1, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    .line 185
    iget-object v0, p1, Ll/ۨ᩵֨;->֫:Ll/ۖܶ۠;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p1, Ll/ۨ᩵֨;->֫:Ll/ۖܶ۠;

    .line 1037
    iget p1, p0, Ll/ܿ᩵֨;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܿ᩵֨;->ܽ:I

    .line 1038
    iget-object p1, p0, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Ll/ۨ᩵֨;->֫(Ll/۟᩵֨;Ll/ۛ֡֨;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/۟᩵֨;Ll/ۛ֡֨;)V
    .locals 1

    .line 1057
    iget v0, p0, Ll/ܿ᩵֨;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܿ᩵֨;->ܽ:I

    .line 1058
    iget-object v0, p0, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    invoke-virtual {v0, p1, p2}, Ll/ۨ᩵֨;->ۧ(Ll/۟᩵֨;Ll/ۛ֡֨;)V

    return-void
.end method
