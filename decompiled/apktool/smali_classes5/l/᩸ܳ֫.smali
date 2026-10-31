.class public final Ll/᩸ܳ֫;
.super Ll/ܶܳ֫;
.source "RB93"


# instance fields
.field public final ܽ:Z

.field public final ܿ:Ljava/lang/Object;

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۙ᩷֫;Ll/᩻۫;ZZ)V
    .locals 1

    .line 918
    invoke-direct {p0, p1, p2}, Ll/ܶܳ֫;-><init>(Ll/ۙ᩷֫;Ll/᩻۫;)V

    .line 919
    invoke-virtual {p1}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object p2

    sget-object v0, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    if-ne p2, v0, :cond_2

    if-eqz p3, :cond_0

    .line 921
    invoke-virtual {p1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۡ᩻֫;->getReenterTransition()Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    .line 922
    :cond_0
    invoke-virtual {p1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۡ᩻֫;->getEnterTransition()Ljava/lang/Object;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Ll/᩸ܳ֫;->ܿ:Ljava/lang/Object;

    if-eqz p3, :cond_1

    .line 926
    invoke-virtual {p1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۡ᩻֫;->getAllowReturnTransitionOverlap()Z

    move-result p2

    goto :goto_1

    .line 927
    :cond_1
    invoke-virtual {p1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۡ᩻֫;->getAllowEnterTransitionOverlap()Z

    move-result p2

    :goto_1
    iput-boolean p2, p0, Ll/᩸ܳ֫;->ܽ:Z

    goto :goto_3

    :cond_2
    if-eqz p3, :cond_3

    .line 930
    invoke-virtual {p1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۡ᩻֫;->getReturnTransition()Ljava/lang/Object;

    move-result-object p2

    goto :goto_2

    .line 931
    :cond_3
    invoke-virtual {p1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۡ᩻֫;->getExitTransition()Ljava/lang/Object;

    move-result-object p2

    :goto_2
    iput-object p2, p0, Ll/᩸ܳ֫;->ܿ:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 933
    iput-boolean p2, p0, Ll/᩸ܳ֫;->ܽ:Z

    :goto_3
    if-eqz p4, :cond_5

    if-eqz p3, :cond_4

    .line 938
    invoke-virtual {p1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡ᩻֫;->getSharedElementReturnTransition()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ܳ֫;->ᩳ:Ljava/lang/Object;

    return-void

    .line 941
    :cond_4
    invoke-virtual {p1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡ᩻֫;->getSharedElementEnterTransition()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ܳ֫;->ᩳ:Ljava/lang/Object;

    return-void

    :cond_5
    const/4 p1, 0x0

    .line 944
    iput-object p1, p0, Ll/᩸ܳ֫;->ᩳ:Ljava/lang/Object;

    return-void
.end method

.method private ֫(Ljava/lang/Object;)Ll/ܺ᩷֫;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 988
    :cond_0
    sget-object v0, Ll/ᩳ᩷֫;->֫:Ll/ܺ᩷֫;

    if-eqz v0, :cond_1

    .line 38
    instance-of v1, p1, Landroid/transition/Transition;

    if-eqz v1, :cond_1

    return-object v0

    .line 992
    :cond_1
    sget-object v0, Ll/ᩳ᩷֫;->ۧ:Ll/ܺ᩷֫;

    if-eqz v0, :cond_2

    .line 993
    invoke-virtual {v0, p1}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 996
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transition "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for fragment "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 997
    invoke-virtual {p0}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid framework Transition or AndroidX Transition"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ۜ()Z
    .locals 1

    .line 958
    iget-object v0, p0, Ll/᩸ܳ֫;->ᩳ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Ljava/lang/Object;
    .locals 1

    .line 963
    iget-object v0, p0, Ll/᩸ܳ֫;->ᩳ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ܿ()Ll/ܺ᩷֫;
    .locals 5

    .line 968
    iget-object v0, p0, Ll/᩸ܳ֫;->ܿ:Ljava/lang/Object;

    invoke-direct {p0, v0}, Ll/᩸ܳ֫;->֫(Ljava/lang/Object;)Ll/ܺ᩷֫;

    move-result-object v1

    .line 970
    iget-object v2, p0, Ll/᩸ܳ֫;->ᩳ:Ljava/lang/Object;

    invoke-direct {p0, v2}, Ll/᩸ܳ֫;->֫(Ljava/lang/Object;)Ll/ܺ᩷֫;

    move-result-object v3

    if-eqz v1, :cond_1

    if-eqz v3, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    .line 973
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 975
    invoke-virtual {p0}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " returned Transition "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " which uses a different Transition  type than its shared element transition "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    return-object v3
.end method

.method public final ᩷()Z
    .locals 1

    .line 954
    iget-boolean v0, p0, Ll/᩸ܳ֫;->ܽ:Z

    return v0
.end method

.method public final ᩻()Ljava/lang/Object;
    .locals 1

    .line 950
    iget-object v0, p0, Ll/᩸ܳ֫;->ܿ:Ljava/lang/Object;

    return-object v0
.end method
