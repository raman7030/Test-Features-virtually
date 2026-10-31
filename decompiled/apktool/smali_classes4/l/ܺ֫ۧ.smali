.class public final Ll/ܺ֫ۧ;
.super Ljava/lang/Object;
.source "D8KK"

# interfaces
.implements Ll/۫ۧۧ;


# instance fields
.field public ֫:Ll/֨᩷ۧ;

.field public ۧ:Ll/ܺ᩷ۧ;

.field public final ܽ:Ll/᩶᩷ۧ;


# direct methods
.method public constructor <init>(Ll/᩶᩷ۧ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ܺ֫ۧ;->ܽ:Ll/᩶᩷ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۢۧ;)I
    .locals 2

    .line 146
    iget-object v0, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    iget-object v1, p0, Ll/ܺ֫ۧ;->ۧ:Ll/ܺ᩷ۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    invoke-interface {v0, v1, p1}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 2

    .line 125
    iget-object v0, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 128
    :cond_0
    invoke-interface {v0}, Ll/֨᩷ۧ;->ܽ()Ll/֨᩷ۧ;

    move-result-object v0

    .line 129
    instance-of v1, v0, Ll/ܿۖۧ;

    if-eqz v1, :cond_1

    .line 130
    check-cast v0, Ll/ܿۖۧ;

    invoke-virtual {v0}, Ll/ܿۖۧ;->ۧ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 141
    iget-object v0, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    invoke-interface {v0, p1, p2, p3, p4}, Ll/֨᩷ۧ;->֫(JJ)V

    return-void
.end method

.method public final ֫(Ll/᩸۠֫;Landroid/net/Uri;Ljava/util/Map;JJLl/᩸᩷ۧ;)V
    .locals 7

    .line 70
    new-instance v6, Ll/ܺ᩷ۧ;

    move-object v0, v6

    move-object v1, p1

    move-wide v2, p4

    move-wide v4, p6

    invoke-direct/range {v0 .. v5}, Ll/ܺ᩷ۧ;-><init>(Ll/ۢᩴ֫;JJ)V

    .line 71
    iput-object v6, p0, Ll/ܺ֫ۧ;->ۧ:Ll/ܺ᩷ۧ;

    .line 72
    iget-object p1, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    if-eqz p1, :cond_0

    return-void

    .line 75
    :cond_0
    iget-object p1, p0, Ll/ܺ֫ۧ;->ܽ:Ll/᩶᩷ۧ;

    invoke-interface {p1, p2, p3}, Ll/᩶᩷ۧ;->֫(Landroid/net/Uri;Ljava/util/Map;)[Ll/֨᩷ۧ;

    move-result-object p1

    .line 76
    array-length p3, p1

    .line 77
    invoke-static {p3}, Ll/ܳ۬ܺ;->֫(I)Ll/֫۬ܺ;

    move-result-object p3

    .line 78
    array-length p6, p1

    const/4 p7, 0x0

    const/4 v0, 0x1

    if-ne p6, v0, :cond_1

    .line 79
    aget-object p1, p1, p7

    iput-object p1, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    goto :goto_4

    .line 81
    :cond_1
    array-length p6, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p6, :cond_7

    aget-object v1, p1, v0

    .line 83
    :try_start_0
    invoke-interface {v1, v6}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 84
    iput-object v1, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    invoke-virtual {v6}, Ll/ܺ᩷ۧ;->ۧ()V

    goto :goto_3

    .line 87
    :cond_2
    :try_start_1
    invoke-interface {v1}, Ll/֨᩷ۧ;->ܳ()Ljava/util/List;

    move-result-object v1

    .line 88
    invoke-virtual {p3, v1}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    iget-object v1, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    if-nez v1, :cond_6

    invoke-virtual {v6}, Ll/ܺ᩷ۧ;->getPosition()J

    move-result-wide v1

    cmp-long v3, v1, p4

    if-nez v3, :cond_5

    goto :goto_1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    if-nez p2, :cond_3

    invoke-virtual {v6}, Ll/ܺ᩷ۧ;->getPosition()J

    move-result-wide p2

    cmp-long p6, p2, p4

    if-nez p6, :cond_4

    :cond_3
    const/4 p7, 0x1

    :cond_4
    invoke-static {p7}, Ll/᩺֡֫;->ۧ(Z)V

    .line 94
    invoke-virtual {v6}, Ll/ܺ᩷ۧ;->ۧ()V

    .line 95
    throw p1

    .line 93
    :catch_0
    iget-object v1, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    if-nez v1, :cond_6

    invoke-virtual {v6}, Ll/ܺ᩷ۧ;->getPosition()J

    move-result-wide v1

    cmp-long v3, v1, p4

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    const/4 v1, 0x1

    :goto_2
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 94
    invoke-virtual {v6}, Ll/ܺ᩷ۧ;->ۧ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 97
    :cond_7
    :goto_3
    iget-object p4, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    if-eqz p4, :cond_8

    .line 111
    :goto_4
    iget-object p1, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    invoke-interface {p1, p8}, Ll/֨᩷ۧ;->֫(Ll/᩸᩷ۧ;)V

    return-void

    .line 98
    :cond_8
    new-instance p4, Ll/ۨܽۧ;

    new-instance p5, Ljava/lang/StringBuilder;

    const-string p6, "None of the available extractors ("

    invoke-direct {p5, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string p6, ", "

    .line 100
    invoke-static {p6}, Ll/ۜܶܺ;->֫(Ljava/lang/String;)Ll/ۜܶܺ;

    move-result-object p6

    .line 103
    invoke-static {p1}, Ll/ܳ۬ܺ;->֫([Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p1

    new-instance p7, Ll/ܽܳۧ;

    invoke-direct {p7}, Ljava/lang/Object;-><init>()V

    .line 102
    invoke-static {p1, p7}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object p1

    .line 101
    invoke-virtual {p6, p1}, Ll/ۜܶܺ;->֫(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") could read the stream."

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    invoke-virtual {p3}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p2

    invoke-direct {p4, p1, p2}, Ll/ۨܽۧ;-><init>(Ljava/lang/String;Ljava/util/List;)V

    throw p4
.end method

.method public final ۧ()J
    .locals 2

    .line 136
    iget-object v0, p0, Ll/ܺ֫ۧ;->ۧ:Ll/ܺ᩷ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܺ᩷ۧ;->getPosition()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final ܽ()V
    .locals 2

    .line 116
    iget-object v0, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 117
    invoke-interface {v0}, Ll/֨᩷ۧ;->֫()V

    .line 118
    iput-object v1, p0, Ll/ܺ֫ۧ;->֫:Ll/֨᩷ۧ;

    .line 120
    :cond_0
    iput-object v1, p0, Ll/ܺ֫ۧ;->ۧ:Ll/ܺ᩷ۧ;

    return-void
.end method
