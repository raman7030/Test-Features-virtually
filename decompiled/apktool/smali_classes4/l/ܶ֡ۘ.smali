.class public final Ll/ܶ֡ۘ;
.super Ll/᩸֡ۘ;
.source "61X7"


# instance fields
.field public ۜ֫:Ll/᩺֡ۘ;

.field public ܳ֫:F

.field public ᩻֫:Ll/֫֡ۘ;


# direct methods
.method public varargs constructor <init>(Ll/۟֡ۘ;[F)V
    .locals 0

    .line 923
    invoke-direct {p0, p1}, Ll/᩸֡ۘ;-><init>(Ll/۟֡ۘ;)V

    .line 924
    invoke-virtual {p0, p2}, Ll/ܶ֡ۘ;->֫([F)V

    .line 925
    instance-of p1, p1, Ll/᩺֡ۘ;

    if-eqz p1, :cond_0

    .line 926
    iget-object p1, p0, Ll/᩸֡ۘ;->ۗ:Ll/۟֡ۘ;

    check-cast p1, Ll/᩺֡ۘ;

    iput-object p1, p0, Ll/ܶ֡ۘ;->ۜ֫:Ll/᩺֡ۘ;

    :cond_0
    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 948
    invoke-super {p0}, Ll/᩸֡ۘ;->clone()Ll/᩸֡ۘ;

    move-result-object v0

    check-cast v0, Ll/ܶ֡ۘ;

    .line 949
    iget-object v1, v0, Ll/᩸֡ۘ;->ۙ:Ll/֫֡ۘ;

    iput-object v1, v0, Ll/ܶ֡ۘ;->᩻֫:Ll/֫֡ۘ;

    return-object v0
.end method

.method public final clone()Ll/᩸֡ۘ;
    .locals 2

    .line 948
    invoke-super {p0}, Ll/᩸֡ۘ;->clone()Ll/᩸֡ۘ;

    move-result-object v0

    check-cast v0, Ll/ܶ֡ۘ;

    .line 949
    iget-object v1, v0, Ll/᩸֡ۘ;->ۙ:Ll/֫֡ۘ;

    iput-object v1, v0, Ll/ܶ֡ۘ;->᩻֫:Ll/֫֡ۘ;

    return-object v0
.end method

.method public final ֫()Ljava/lang/Float;
    .locals 1

    .line 943
    iget v0, p0, Ll/ܶ֡ۘ;->ܳ֫:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(F)V
    .locals 1

    .line 938
    iget-object v0, p0, Ll/ܶ֡ۘ;->᩻֫:Ll/֫֡ۘ;

    invoke-virtual {v0, p1}, Ll/֫֡ۘ;->֫(F)F

    move-result p1

    iput p1, p0, Ll/ܶ֡ۘ;->ܳ֫:F

    return-void
.end method

.method public final ֫(Ljava/lang/Class;)V
    .locals 1

    .line 988
    iget-object v0, p0, Ll/᩸֡ۘ;->ۗ:Ll/۟֡ۘ;

    if-eqz v0, :cond_0

    return-void

    .line 1020
    :cond_0
    invoke-super {p0, p1}, Ll/᩸֡ۘ;->֫(Ljava/lang/Class;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    .line 962
    iget-object v0, p0, Ll/᩸֡ۘ;->ۛ:[Ljava/lang/Object;

    iget-object v1, p0, Ll/ܶ֡ۘ;->ۜ֫:Ll/᩺֡ۘ;

    if-eqz v1, :cond_0

    .line 963
    iget v0, p0, Ll/ܶ֡ۘ;->ܳ֫:F

    invoke-virtual {v1, p1, v0}, Ll/᩺֡ۘ;->֫(Ljava/lang/Object;F)V

    return-void

    .line 966
    :cond_0
    iget-object v1, p0, Ll/᩸֡ۘ;->ۗ:Ll/۟֡ۘ;

    if-eqz v1, :cond_1

    .line 967
    iget v0, p0, Ll/ܶ֡ۘ;->ܳ֫:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ll/۟֡ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 974
    :cond_1
    iget-object v1, p0, Ll/᩸֡ۘ;->ۤ:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_2

    .line 976
    :try_start_0
    iget v1, p0, Ll/ܶ֡ۘ;->ܳ֫:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 977
    iget-object v1, p0, Ll/᩸֡ۘ;->ۤ:Ljava/lang/reflect/Method;

    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 981
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_0

    :catch_1
    move-exception p1

    .line 979
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_2
    :goto_0
    return-void
.end method

.method public final varargs ֫([F)V
    .locals 0

    .line 932
    invoke-super {p0, p1}, Ll/᩸֡ۘ;->֫([F)V

    .line 933
    iget-object p1, p0, Ll/᩸֡ۘ;->ۙ:Ll/֫֡ۘ;

    iput-object p1, p0, Ll/ܶ֡ۘ;->᩻֫:Ll/֫֡ۘ;

    return-void
.end method
