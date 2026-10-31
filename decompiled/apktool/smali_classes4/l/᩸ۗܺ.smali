.class public abstract Ll/᩸ۗܺ;
.super Ljava/lang/Object;
.source "X4RA"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:Ll/ۖܶܺ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    invoke-static {}, Ll/ۖܶܺ;->֫()Ll/ۖܶܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۗܺ;->᩸:Ll/ۖܶܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    invoke-static {p1}, Ll/ۖܶܺ;->֫(Ljava/lang/Iterable;)Ll/ۖܶܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۗܺ;->᩸:Ll/ۖܶܺ;

    return-void
.end method

.method public static ֫(Ljava/lang/Iterable;)Ll/᩸ۗܺ;
    .locals 1

    .line 144
    instance-of v0, p0, Ll/᩸ۗܺ;

    if-eqz v0, :cond_0

    .line 145
    check-cast p0, Ll/᩸ۗܺ;

    return-object p0

    .line 146
    :cond_0
    new-instance v0, Ll/ۚۗܺ;

    invoke-direct {v0, p0, p0}, Ll/ۚۗܺ;-><init>(Ljava/lang/Iterable;Ljava/lang/Iterable;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 133
    iget-object v0, p0, Ll/᩸ۗܺ;->᩸:Ll/ۖܶܺ;

    invoke-virtual {v0, p0}, Ll/ۖܶܺ;->֫(Ll/᩸ۗܺ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 291
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    .line 293
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v2, :cond_0

    const-string v2, ", "

    .line 295
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/16 v0, 0x5d

    .line 300
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/᩸ۗܺ;
    .locals 3

    .line 133
    iget-object v0, p0, Ll/᩸ۗܺ;->᩸:Ll/ۖܶܺ;

    invoke-virtual {v0, p0}, Ll/ۖܶܺ;->֫(Ll/᩸ۗܺ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 902
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "limit is negative"

    .line 991
    invoke-static {v2, v1}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    .line 992
    new-instance v1, Ll/ۢ۫ܺ;

    invoke-direct {v1, v0, p1}, Ll/ۢ۫ܺ;-><init>(Ljava/lang/Iterable;I)V

    .line 601
    invoke-static {v1}, Ll/᩸ۗܺ;->֫(Ljava/lang/Iterable;)Ll/᩸ۗܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽܶܺ;)Ll/᩸ۗܺ;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/᩸ۗܺ;->᩸:Ll/ۖܶܺ;

    invoke-virtual {v0, p0}, Ll/ۖܶܺ;->֫(Ll/᩸ۗܺ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 485
    invoke-static {v0, p1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ll/ܽܶܺ;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۗܺ;->֫(Ljava/lang/Iterable;)Ll/᩸ۗܺ;

    move-result-object p1

    return-object p1
.end method
