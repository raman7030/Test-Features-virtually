.class public final Ll/֨᩵ܺ;
.super Ljava/lang/Object;
.source "UB7S"

# interfaces
.implements Ll/ۚ᩵ܺ;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:Z

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZZ)V
    .locals 0

    .line 1514
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1515
    iput p2, p0, Ll/֨᩵ܺ;->֫:I

    .line 1516
    iput p3, p0, Ll/֨᩵ܺ;->ۧ:I

    .line 1517
    iput-boolean p4, p0, Ll/֨᩵ܺ;->ܽ:Z

    .line 1518
    iput-boolean p5, p0, Ll/֨᩵ܺ;->ᩳ:Z

    .line 1519
    iput-object p1, p0, Ll/֨᩵ܺ;->ܿ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1565
    iget-boolean v0, p0, Ll/֨᩵ܺ;->ܽ:Z

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    const-string v0, "last-"

    .line 1566
    :goto_0
    iget-boolean v1, p0, Ll/֨᩵ܺ;->ᩳ:Z

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget v6, p0, Ll/֨᩵ܺ;->ۧ:I

    iget v7, p0, Ll/֨᩵ܺ;->֫:I

    if-eqz v1, :cond_1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v0, v7, v5

    aput-object v1, v7, v4

    aput-object v6, v7, v3

    iget-object v0, p0, Ll/֨᩵ܺ;->ܿ:Ljava/lang/String;

    aput-object v0, v7, v2

    const-string v0, "nth-%schild(%dn%+d of type <%s>)"

    invoke-static {v0, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1567
    :cond_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v5

    aput-object v1, v2, v4

    aput-object v6, v2, v3

    const-string v0, "nth-%schild(%dn%+d)"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩵ۚܺ;)Z
    .locals 7

    .line 1527
    iget-boolean v0, p0, Ll/֨᩵ܺ;->ᩳ:Z

    iget-object v1, p0, Ll/֨᩵ܺ;->ܿ:Ljava/lang/String;

    if-eqz v0, :cond_0

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ll/ۚۚܺ;->᩻()Ljava/lang/String;

    move-result-object v1

    .line 1535
    :cond_0
    iget-object v0, p1, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_4

    .line 1537
    invoke-interface {v0}, Ll/ۘۚܺ;->getChildren()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚۚܺ;

    .line 1538
    check-cast v6, Ll/᩵ۚܺ;

    if-ne v6, p1, :cond_2

    move v4, v5

    :cond_2
    if-eqz v1, :cond_3

    .line 1541
    invoke-virtual {v6}, Ll/ۚۚܺ;->᩻()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 1546
    :cond_5
    iget-boolean p1, p0, Ll/֨᩵ܺ;->ܽ:Z

    if-eqz p1, :cond_6

    add-int/2addr v4, v3

    goto :goto_1

    :cond_6
    sub-int v4, v5, v4

    .line 1551
    :goto_1
    iget p1, p0, Ll/֨᩵ܺ;->֫:I

    iget v0, p0, Ll/֨᩵ܺ;->ۧ:I

    if-nez p1, :cond_7

    if-ne v4, v0, :cond_9

    goto :goto_2

    :cond_7
    sub-int/2addr v4, v0

    .line 1557
    rem-int v0, v4, p1

    if-nez v0, :cond_9

    .line 1559
    invoke-static {v4}, Ljava/lang/Integer;->signum(I)I

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {v4}, Ljava/lang/Integer;->signum(I)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Integer;->signum(I)I

    move-result p1

    if-ne v0, p1, :cond_9

    :cond_8
    :goto_2
    return v3

    :cond_9
    return v2
.end method
