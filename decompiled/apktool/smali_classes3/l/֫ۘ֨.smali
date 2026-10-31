.class public final Ll/֫ۘ֨;
.super Ll/ۡۘ֨;
.source "G67D"


# instance fields
.field public final ۧ:[Ll/ۡۘ֨;


# direct methods
.method public constructor <init>(Ll/ۙ֨֨;[Ll/ۡۘ֨;)V
    .locals 0

    .line 317
    invoke-direct {p0, p1}, Ll/ۡۘ֨;-><init>(Ll/ۙ֨֨;)V

    .line 318
    iput-object p2, p0, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    return-void
.end method

.method public constructor <init>(Ll/ۚۚ֨;Ll/ۖܶ۠;)V
    .locals 0

    .line 322
    invoke-direct {p0, p1}, Ll/ۡۘ֨;-><init>(Ll/ۙ֨֨;)V

    .line 218
    invoke-virtual {p2}, Ll/ۖܶ۠;->ۧ()I

    move-result p1

    .line 323
    new-array p1, p1, [Ll/ۡۘ֨;

    invoke-virtual {p2, p1}, Ll/ۖܶ۠;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ۡۘ֨;

    iput-object p1, p0, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 329
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    iget-object v1, p0, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    array-length v2, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    if-nez v3, :cond_0

    const-string v3, ", "

    .line 334
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    const/16 v1, 0x7d

    .line 338
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 339
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۛ᩸۠;)Ljava/lang/Object;
    .locals 1

    .line 343
    iget-object v0, p0, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    invoke-static {v0}, Ll/ۖܶ۠;->֫([Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    .line 347
    invoke-interface {p1, v0}, Ll/ۛ᩸۠;->֫(Ll/ۖܶ۠;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۢۘ֨;)V
    .locals 0

    .line 326
    invoke-interface {p1, p0}, Ll/ۢۘ֨;->֫(Ll/֫ۘ֨;)V

    return-void
.end method

.method public final ۧ()Ll/ۤ֨֨;
    .locals 2

    .line 352
    iget-object v0, p0, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    array-length v1, v0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 353
    aget-object v0, v0, v1

    invoke-virtual {v0}, Ll/ۡۘ֨;->ۧ()Ll/ۤ֨֨;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
