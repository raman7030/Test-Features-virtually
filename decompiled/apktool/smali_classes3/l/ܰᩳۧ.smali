.class public final Ll/ܰᩳۧ;
.super Ljava/lang/Object;
.source "18UV"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    .line 2338
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 2339
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x2

    .line 2340
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 2329
    const-class v2, Ll/ܰᩳۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 2332
    :cond_1
    check-cast p1, Ll/ܰᩳۧ;

    const/4 p1, 0x0

    .line 2334
    invoke-static {p1, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    .line 2320
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
