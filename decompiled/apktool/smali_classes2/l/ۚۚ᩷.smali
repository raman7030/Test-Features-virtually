.class public final Ll/ۚۚ᩷;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֫֫:Ll/ܰܺܳ;

.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/lang/String;

.field public final ۛ:Z

.field public final ۟:Ljava/lang/String;

.field public ۤ:I

.field public final ۧ֫:Ljava/lang/String;

.field public final ۨ:Ljava/lang/String;

.field public volatile ۫:Ljava/lang/String;

.field public final ۬:Z

.field public ܰ:Ljava/util/List;

.field public final ᩶:Ljava/lang/String;

.field public volatile ᩸:Z

.field public final ᩹:Z

.field public final ᩺:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ܰܺܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLl/ܶ᩵ܿ;Z)V
    .locals 2

    .line 1661
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1646
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۚۚ᩷;->ܰ:Ljava/util/List;

    const/4 v0, -0x1

    .line 1648
    iput v0, p0, Ll/ۚۚ᩷;->ۤ:I

    .line 1651
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "preview-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".appassets.androidplatform.net"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۚ᩷;->ۙ:Ljava/lang/String;

    .line 1652
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۚ᩷;->᩶:Ljava/lang/String;

    .line 1662
    iput-object p1, p0, Ll/ۚۚ᩷;->֫֫:Ll/ܰܺܳ;

    .line 1663
    iput-object p2, p0, Ll/ۚۚ᩷;->ۨ:Ljava/lang/String;

    .line 1664
    iput-object p3, p0, Ll/ۚۚ᩷;->ۗ:Ljava/lang/String;

    .line 1665
    iput-object p4, p0, Ll/ۚۚ᩷;->ۧ֫:Ljava/lang/String;

    .line 1666
    iput-object p5, p0, Ll/ۚۚ᩷;->۟:Ljava/lang/String;

    .line 1667
    iput-boolean p6, p0, Ll/ۚۚ᩷;->۬:Z

    .line 1668
    iput-boolean p7, p0, Ll/ۚۚ᩷;->ۛ:Z

    .line 1669
    iput-object p8, p0, Ll/ۚۚ᩷;->᩺:Ll/ܶ᩵ܿ;

    .line 1670
    iput-boolean p9, p0, Ll/ۚۚ᩷;->᩹:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۚ᩷;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۚۚ᩷;->ۤ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۚ᩷;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۚۚ᩷;->۫:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۚ᩷;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۚۚ᩷;->ܰ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۚ᩷;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚۚ᩷;->᩸:Z

    return p0
.end method

.method public static bridge synthetic ۖ(Ll/ۚۚ᩷;)Ll/ܰܺܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۚ᩷;->֫֫:Ll/ܰܺܳ;

    return-object p0
.end method

.method public static bridge synthetic ۘ(Ll/ۚۚ᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۚ᩷;->ۧ֫:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۜ(Ll/ۚۚ᩷;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۚۚ᩷;->ۤ:I

    return p0
.end method

.method public static bridge synthetic ۡ(Ll/ۚۚ᩷;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۚ᩷;->᩺:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۚۚ᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۚ᩷;->ۨ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۚۚ᩷;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚۚ᩷;->᩹:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ۚۚ᩷;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚۚ᩷;->۬:Z

    return p0
.end method

.method public static bridge synthetic ܺ(Ll/ۚۚ᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۚ᩷;->۟:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۚ᩷;->᩶:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۚۚ᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۚ᩷;->ۗ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۚ᩷;->ۙ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۚۚ᩷;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۚۚ᩷;->᩸:Z

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۚۚ᩷;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚۚ᩷;->ۛ:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ۚۚ᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۚ᩷;->۫:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1678
    sget-object v0, Ll/֨ۚ᩷;->᩺ۧ:Ll/᩵ۚ᩷;

    .line 310
    iget-object v0, p0, Ll/ۚۚ᩷;->֫֫:Ll/ܰܺܳ;

    instance-of v1, v0, Ljava/lang/AutoCloseable;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/AutoCloseable;

    .line 312
    :try_start_0
    check-cast v0, Ljava/lang/AutoCloseable;

    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1679
    :catch_0
    :cond_0
    iget-object v0, p0, Ll/ۚۚ᩷;->ܰ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/ܽ᩷ܳ;->֫(J)V

    goto :goto_0

    .line 1680
    :cond_1
    iget-object v0, p0, Ll/ۚۚ᩷;->᩺:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_2

    .line 1681
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_2
    return-void
.end method
