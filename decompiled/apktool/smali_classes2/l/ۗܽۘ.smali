.class public abstract Ll/ۗܽۘ;
.super Ljava/lang/Object;
.source "H9CR"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ۙ:Ll/ܰܽۘ;

.field public ᩶:Ll/ܽۧۘ;

.field public ᩸:Ll/۫ۛۖ;

.field public final ᩹:Ll/֫᩻֨;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/۫ۛۖ;Ll/ܰܽۘ;Ll/ܽۧۘ;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    iput-object v0, p0, Ll/ۗܽۘ;->᩹:Ll/֫᩻֨;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 44
    iput-object p1, p0, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    .line 45
    iput-object p3, p0, Ll/ۗܽۘ;->᩶:Ll/ܽۧۘ;

    .line 46
    iput-object p2, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 92
    iget-object v0, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    iget-object v1, p0, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    invoke-virtual {v0, v1}, Ll/ۖᩳۘ;->֫(Ll/۫ۛۖ;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    .line 249
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 253
    :cond_2
    check-cast p1, Ll/ۗܽۘ;

    iget-object v0, p1, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    iget-object p1, p1, Ll/ۗܽۘ;->᩶:Ll/ܽۧۘ;

    .line 254
    iget-object v1, p0, Ll/ۗܽۘ;->᩶:Ll/ܽۧۘ;

    if-nez v1, :cond_3

    if-eqz p1, :cond_4

    goto :goto_0

    .line 258
    :cond_3
    invoke-virtual {v1, p1}, Ll/ܽۧۘ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    .line 261
    :cond_4
    iget-object p1, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    if-nez p1, :cond_5

    if-eqz v0, :cond_6

    goto :goto_0

    .line 265
    :cond_5
    invoke-virtual {p1, v0}, Ll/ۖᩳۘ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 236
    iget-object v1, p0, Ll/ۗܽۘ;->᩶:Ll/ܽۧۘ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ܽۧۘ;->hashCode()I

    move-result v1

    :goto_0
    add-int/lit8 v1, v1, 0x1f

    mul-int/lit8 v1, v1, 0x1f

    .line 237
    iget-object v2, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ll/ۖᩳۘ;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫(Ll/ۡۛۖ;)V
    .locals 4

    .line 89
    iget-object v0, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    new-instance v1, Ll/֡֫ۘ;

    invoke-direct {v1}, Ll/֡֫ۘ;-><init>()V

    .line 360
    invoke-static {p1}, Ll/ܳۛۖ;->֫(Ll/ۡۛۖ;)Ll/᩵ۤۖ;

    move-result-object v2

    .line 361
    invoke-interface {v2, p1, v1}, Ll/᩵ۤۖ;->֫(Ll/ۡۛۖ;Ll/֡֫ۘ;)V

    .line 363
    sget-object p1, Ll/ۜ᩺ۖ;->᩶:Ll/ۜ᩺ۖ;

    .line 367
    invoke-interface {v2}, Ll/᩵ۤۖ;->֫()Ll/ۧۤۖ;

    move-result-object v2

    .line 368
    invoke-virtual {v1}, Ll/ۤܰۖ;->ᩳ()[B

    move-result-object v1

    .line 363
    iget-object v3, p0, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    invoke-virtual {v0, v3, p1, v2, v1}, Ll/ۖᩳۘ;->֫(Ll/۫ۛۖ;Ll/ۜ᩺ۖ;Ll/ۧۤۖ;[B)V

    return-void
.end method
