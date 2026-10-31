.class public final Ll/֫ܰ֨;
.super Ll/ܳ֨۠;
.source "37LB"


# static fields
.field public static final ۧ:Ll/۟᩺֨;

.field public static final ܽ:Ll/ۙ֨۠;


# instance fields
.field public final ֫:Ll/᩹ܶ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 44
    new-instance v0, Ll/۟᩺֨;

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v2

    const/4 v3, 0x0

    .line 161
    invoke-direct {v0, v1, v2, v3}, Ll/۟᩺֨;-><init>(Ll/ۖܶ۠;Ll/ۖܶ۠;Z)V

    .line 44
    sput-object v0, Ll/֫ܰ֨;->ۧ:Ll/۟᩺֨;

    .line 46
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/֫ܰ֨;->ܽ:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֫ܰ֨;->֫:Ll/᩹ܶ۠;

    return-void
.end method

.method private ֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 11

    .line 173
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 174
    invoke-virtual {p2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ֡֨;

    .line 175
    invoke-virtual {p3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿ֡֨;

    .line 176
    iget-object v4, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v5, v3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-ne v4, v5, :cond_1

    .line 111
    iget-wide v4, v1, Ll/ۛ֡֨;->᩶:J

    const-wide v6, 0x40000000000L

    and-long/2addr v4, v6

    const-wide/16 v8, 0x0

    cmp-long v10, v4, v8

    if-nez v10, :cond_1

    iget-wide v4, v3, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v4, v6

    cmp-long v10, v4, v8

    if-nez v10, :cond_1

    .line 179
    iget-object v4, p0, Ll/֫ܰ֨;->֫:Ll/᩹ܶ۠;

    sget-object v5, Ll/ۛᩴ۠;->ܰۧ:Ll/۫۠۠;

    invoke-virtual {v4, p1, v5}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 180
    iget-wide v4, v3, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v4, v6

    iput-wide v4, v3, Ll/ۛ֡֨;->᩶:J

    .line 181
    invoke-virtual {v0, v3}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private final varargs ֫(Ll/᩵᩵۠;Ll/ۖܶ۠;[Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 12
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 192
    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v2, p3, v1

    .line 193
    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿ֡֨;

    .line 194
    invoke-virtual {p2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿ֡֨;

    .line 195
    iget-object v6, v5, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v7, v3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-ne v6, v7, :cond_0

    .line 111
    iget-wide v5, v5, Ll/ۛ֡֨;->᩶:J

    const-wide v7, 0x40000000000L

    and-long/2addr v5, v7

    const-wide/16 v9, 0x0

    cmp-long v11, v5, v9

    if-nez v11, :cond_0

    iget-wide v5, v3, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v5, v7

    cmp-long v11, v5, v9

    if-nez v11, :cond_0

    .line 198
    iget-object v5, p0, Ll/֫ܰ֨;->֫:Ll/᩹ܶ۠;

    sget-object v6, Ll/ۛᩴ۠;->ܰۧ:Ll/۫۠۠;

    invoke-virtual {v5, p1, v6}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    .line 199
    iget-wide v5, v3, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v5, v7

    iput-wide v5, v3, Ll/ۛ֡֨;->᩶:J

    goto :goto_2

    .line 202
    :cond_1
    invoke-virtual {p2, v3}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object p2
.end method


# virtual methods
.method public final ֫(Ll/۠᩵۠;Ll/۟᩺֨;Ll/۟᩺֨;Ll/۟᩺֨;)Ll/۟᩺֨;
    .locals 6

    .line 62
    sget-object v0, Ll/֫ܰ֨;->ۧ:Ll/۟᩺֨;

    if-ne p2, v0, :cond_0

    if-ne p3, v0, :cond_0

    if-ne p4, v0, :cond_0

    return-object v0

    .line 70
    :cond_0
    iget-object v0, p2, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    iget-object v1, p2, Ll/۟᩺֨;->֫:Ll/ۖܶ۠;

    iget-object v2, p4, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    iget-object v3, p4, Ll/۟᩺֨;->֫:Ll/ۖܶ۠;

    invoke-direct {p0, p1, v0, v2}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 72
    iget-object v2, p3, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    iget-object v4, p3, Ll/۟᩺֨;->֫:Ll/ۖܶ۠;

    invoke-direct {p0, p1, v1, v2}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v2

    .line 74
    iget-object p3, p3, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    iget-object p4, p4, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    invoke-direct {p0, p1, p3, p4}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p3

    .line 76
    iget-object p2, p2, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    invoke-direct {p0, p1, p2, v3}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    .line 78
    invoke-direct {p0, p1, v1, v4}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p4

    .line 80
    invoke-direct {p0, p1, v4, v3}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v1

    const/4 v3, 0x2

    new-array v4, v3, [Ll/ۖܶ۠;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v2, v4, v0

    .line 87
    invoke-direct {p0, p1, p3, v4}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;[Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p3

    new-array v2, v3, [Ll/ۖܶ۠;

    aput-object p2, v2, v5

    aput-object p4, v2, v0

    .line 88
    invoke-direct {p0, p1, v1, v2}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;[Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 89
    new-instance p2, Ll/۟᩺֨;

    .line 161
    invoke-direct {p2, p3, p1, v5}, Ll/۟᩺֨;-><init>(Ll/ۖܶ۠;Ll/ۖܶ۠;Z)V

    return-object p2
.end method

.method public final ֫(Ll/ۡ᩵۠;Ll/۟᩺֨;Ll/۟᩺֨;)Ll/۟᩺֨;
    .locals 3

    .line 98
    sget-object v0, Ll/ܰ᩺֨;->֫:[I

    invoke-virtual {p1}, Ll/֨֡۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    .line 112
    sget-object p1, Ll/֫ܰ֨;->ۧ:Ll/۟᩺֨;

    return-object p1

    .line 106
    :cond_0
    iget-object v0, p2, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    iget-object v2, p3, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    invoke-direct {p0, p1, v0, v2}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 108
    iget-object p2, p2, Ll/۟᩺֨;->֫:Ll/ۖܶ۠;

    iget-object p3, p3, Ll/۟᩺֨;->֫:Ll/ۖܶ۠;

    new-array v1, v1, [Ll/ۖܶ۠;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    invoke-direct {p0, p1, p2, v1}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;[Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 109
    new-instance p2, Ll/۟᩺֨;

    .line 161
    invoke-direct {p2, v0, p1, v2}, Ll/۟᩺֨;-><init>(Ll/ۖܶ۠;Ll/ۖܶ۠;Z)V

    return-object p2

    .line 100
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/۟᩺֨;Ll/۟᩺֨;)Ll/۟᩺֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩵᩵۠;Ll/۟᩺֨;Ll/۟᩺֨;)Ll/۟᩺֨;
    .locals 4

    .line 122
    iget-object v0, p2, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    iget-object v1, p3, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    const/4 v2, 0x1

    new-array v2, v2, [Ll/ۖܶ۠;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    .line 123
    invoke-direct {p0, p1, v0, v2}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;[Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 124
    iget-object p2, p2, Ll/۟᩺֨;->֫:Ll/ۖܶ۠;

    iget-object p3, p3, Ll/۟᩺֨;->֫:Ll/ۖܶ۠;

    .line 125
    invoke-direct {p0, p1, p2, p3}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 126
    new-instance p2, Ll/۟᩺֨;

    .line 161
    invoke-direct {p2, v0, p1, v3}, Ll/۟᩺֨;-><init>(Ll/ۖܶ۠;Ll/ۖܶ۠;Z)V

    return-object p2
.end method

.method public final ۧ(Ll/᩵᩵۠;Ll/۟᩺֨;Ll/۟᩺֨;)Ll/۟᩺֨;
    .locals 3

    if-nez p2, :cond_0

    goto :goto_0

    .line 132
    :cond_0
    iget-boolean v0, p2, Ll/۟᩺֨;->ܽ:Z

    if-eqz v0, :cond_1

    :goto_0
    return-object p3

    .line 135
    :cond_1
    iget-boolean v0, p3, Ll/۟᩺֨;->ܽ:Z

    if-eqz v0, :cond_2

    return-object p2

    .line 138
    :cond_2
    new-instance v0, Ll/۟᩺֨;

    iget-object v1, p2, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    iget-object v2, p3, Ll/۟᩺֨;->ۧ:Ll/ۖܶ۠;

    invoke-direct {p0, p1, v1, v2}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v1

    .line 139
    iget-object p2, p2, Ll/۟᩺֨;->֫:Ll/ۖܶ۠;

    iget-object p3, p3, Ll/۟᩺֨;->֫:Ll/ۖܶ۠;

    invoke-direct {p0, p1, p2, p3}, Ll/֫ܰ֨;->֫(Ll/᩵᩵۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    const/4 p2, 0x0

    .line 161
    invoke-direct {v0, v1, p1, p2}, Ll/۟᩺֨;-><init>(Ll/ۖܶ۠;Ll/ۖܶ۠;Z)V

    return-object v0
.end method
