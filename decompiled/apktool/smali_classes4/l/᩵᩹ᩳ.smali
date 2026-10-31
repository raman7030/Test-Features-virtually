.class public final Ll/᩵᩹ᩳ;
.super Ljava/lang/Object;
.source "06PW"


# instance fields
.field public final ֫:Ljava/util/IdentityHashMap;

.field public final ۧ:Ll/ۤۜܽ;


# direct methods
.method public constructor <init>(Ll/ۤۜܽ;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/᩵᩹ᩳ;->֫:Ljava/util/IdentityHashMap;

    .line 17
    iput-object p1, p0, Ll/᩵᩹ᩳ;->ۧ:Ll/ۤۜܽ;

    return-void
.end method

.method private ֫(Ll/᩶᩹ᩳ;)V
    .locals 5

    .line 26
    iget-object v0, p0, Ll/᩵᩹ᩳ;->ۧ:Ll/ۤۜܽ;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void

    .line 27
    :cond_0
    iget-object v1, p0, Ll/᩵᩹ᩳ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_1

    .line 28
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void

    .line 29
    :cond_1
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 30
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    instance-of v1, p1, Ll/᩸᩹ᩳ;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Ll/᩸᩹ᩳ;

    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 33
    iget v1, p1, Ll/᩶᩹ᩳ;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 34
    invoke-virtual {p1}, Ll/᩸᩹ᩳ;->ۧ()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 35
    invoke-virtual {p1}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v1

    .line 36
    :goto_0
    :try_start_0
    iget v3, p1, Ll/᩶᩹ᩳ;->ۧ:I

    if-ge v2, v3, :cond_3

    .line 37
    iget-object v3, v1, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    invoke-virtual {v3, v2}, Ll/ۧ۫ᩳ;->֫(I)C

    move-result v3

    .line 38
    invoke-virtual {p1}, Ll/᩸᩹ᩳ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->֫(C)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 40
    :cond_3
    invoke-virtual {v1}, Ll/ܶ᩹ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 35
    :try_start_1
    invoke-virtual {v1}, Ll/ܶ᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    .line 42
    :cond_4
    check-cast p1, Ll/᩻᩹ᩳ;

    iget-object p1, p1, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    const/4 v1, 0x2

    .line 43
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 44
    array-length v1, p1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 45
    array-length v0, p1

    :goto_3
    if-ge v2, v0, :cond_5

    aget-object v1, p1, v2

    invoke-direct {p0, v1}, Ll/᩵᩹ᩳ;->֫(Ll/᩶᩹ᩳ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ᩹ᩳ;)V
    .locals 2

    .line 20
    iget v0, p1, Ll/ۨ᩹ᩳ;->֫:I

    iget-object v1, p0, Ll/᩵᩹ᩳ;->ۧ:Ll/ۤۜܽ;

    invoke-virtual {v1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 21
    iget v0, p1, Ll/ۨ᩹ᩳ;->ۧ:I

    invoke-virtual {v1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 22
    iget-object p1, p1, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    invoke-direct {p0, p1}, Ll/᩵᩹ᩳ;->֫(Ll/᩶᩹ᩳ;)V

    return-void
.end method
