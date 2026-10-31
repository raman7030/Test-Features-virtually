.class public final Ll/ۧ۫᩵;
.super Ljava/lang/Object;
.source "HAYQ"

# interfaces
.implements Ll/᩶۬᩵;


# instance fields
.field public volatile synthetic _exceptionsHolder:Ljava/lang/Object;

.field public volatile synthetic _isCompleting:I

.field public volatile synthetic _rootCause:Ljava/lang/Object;

.field public final ᩸:Ll/᩻۫᩵;


# direct methods
.method public constructor <init>(Ll/᩻۫᩵;Ljava/lang/Throwable;)V
    .locals 0

    .line 1078
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1075
    iput-object p1, p0, Ll/ۧ۫᩵;->᩸:Ll/᩻۫᩵;

    const/4 p1, 0x0

    .line 1079
    iput p1, p0, Ll/ۧ۫᩵;->_isCompleting:I

    .line 1084
    iput-object p2, p0, Ll/ۧ۫᩵;->_rootCause:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 1089
    iput-object p1, p0, Ll/ۧ۫᩵;->_exceptionsHolder:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1141
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Finishing[cancelling="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۧ۫᩵;->ۧ()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", completing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1081
    iget v1, p0, Ll/ۧ۫᩵;->_isCompleting:I

    .line 1141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", rootCause="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1086
    iget-object v1, p0, Ll/ۧ۫᩵;->_rootCause:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    .line 1141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exceptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1091
    iget-object v1, p0, Ll/ۧ۫᩵;->_exceptionsHolder:Ljava/lang/Object;

    .line 1141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", list="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1075
    iget-object v1, p0, Ll/ۧ۫᩵;->᩸:Ll/᩻۫᩵;

    .line 1141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/Throwable;
    .locals 1

    .line 1086
    iget-object v0, p0, Ll/ۧ۫᩵;->_rootCause:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 3

    .line 1086
    iget-object v0, p0, Ll/ۧ۫᩵;->_rootCause:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    if-nez v0, :cond_0

    .line 1087
    iput-object p1, p0, Ll/ۧ۫᩵;->_rootCause:Ljava/lang/Object;

    return-void

    :cond_0
    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 1091
    :cond_1
    iget-object v0, p0, Ll/ۧ۫᩵;->_exceptionsHolder:Ljava/lang/Object;

    if-nez v0, :cond_2

    .line 1092
    iput-object p1, p0, Ll/ۧ۫᩵;->_exceptionsHolder:Ljava/lang/Object;

    return-void

    .line 1125
    :cond_2
    instance-of v1, v0, Ljava/lang/Throwable;

    if-eqz v1, :cond_4

    if-ne p1, v0, :cond_3

    :goto_0
    return-void

    .line 1138
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1128
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1129
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1092
    iput-object v1, p0, Ll/ۧ۫᩵;->_exceptionsHolder:Ljava/lang/Object;

    return-void

    .line 1133
    :cond_4
    instance-of v1, v0, Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 1134
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ljava/lang/Throwable;)Ljava/util/ArrayList;
    .locals 3

    .line 1091
    iget-object v0, p0, Ll/ۧ۫᩵;->_exceptionsHolder:Ljava/lang/Object;

    const/4 v1, 0x4

    if-nez v0, :cond_0

    .line 1138
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0

    .line 1104
    :cond_0
    instance-of v2, v0, Ljava/lang/Throwable;

    if-eqz v2, :cond_1

    .line 1138
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1104
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v2

    goto :goto_0

    .line 1105
    :cond_1
    instance-of v1, v0, Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/util/ArrayList;

    .line 1086
    :goto_0
    iget-object v1, p0, Ll/ۧ۫᩵;->_rootCause:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    .line 1109
    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_2
    if-eqz p1, :cond_3

    .line 169
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1110
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1111
    :cond_3
    invoke-static {}, Ll/ܿ۫᩵;->ܿ()Ll/ܶۛ᩵;

    move-result-object p1

    .line 1092
    iput-object p1, p0, Ll/ۧ۫᩵;->_exceptionsHolder:Ljava/lang/Object;

    return-object v0

    .line 1105
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 1106
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 1086
    iget-object v0, p0, Ll/ۧ۫᩵;->_rootCause:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Z
    .locals 2

    .line 1091
    iget-object v0, p0, Ll/ۧ۫᩵;->_exceptionsHolder:Ljava/lang/Object;

    .line 1095
    invoke-static {}, Ll/ܿ۫᩵;->ܿ()Ll/ܶۛ᩵;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 1086
    iget-object v0, p0, Ll/ۧ۫᩵;->_rootCause:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 1081
    iget v0, p0, Ll/ۧ۫᩵;->_isCompleting:I

    return v0
.end method

.method public final ᩳ()Ll/᩻۫᩵;
    .locals 1

    .line 1075
    iget-object v0, p0, Ll/ۧ۫᩵;->᩸:Ll/᩻۫᩵;

    return-object v0
.end method

.method public final ᩻()V
    .locals 1

    const/4 v0, 0x1

    .line 1082
    iput v0, p0, Ll/ۧ۫᩵;->_isCompleting:I

    return-void
.end method
