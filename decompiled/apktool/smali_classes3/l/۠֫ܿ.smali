.class public final Ll/۠֫ܿ;
.super Ljava/lang/Object;
.source "Y6PV"


# instance fields
.field public final ֫:Ll/ۨۙᩳ;

.field public final ۧ:Ll/۫᩶ᩳ;

.field public final ܽ:J


# direct methods
.method public constructor <init>(JLl/۫᩶ᩳ;Ll/ۨۙᩳ;)V
    .locals 3

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-ltz v2, :cond_2

    .line 20
    iput-wide p1, p0, Ll/۠֫ܿ;->ܽ:J

    .line 21
    iput-object p3, p0, Ll/۠֫ܿ;->ۧ:Ll/۫᩶ᩳ;

    .line 22
    iput-object p4, p0, Ll/۠֫ܿ;->֫:Ll/ۨۙᩳ;

    if-eqz p4, :cond_1

    if-eqz p3, :cond_1

    .line 23
    invoke-virtual {p4}, Ll/ۨۙᩳ;->ܽ()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p3}, Ll/۫᩶ᩳ;->ܽ()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Editor state and migration belong to different sessions"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void

    .line 19
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid saved text mark"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫([BLjava/lang/Long;)Ll/۠֫ܿ;
    .locals 11

    .line 31
    array-length v0, p0

    const v1, 0x32535645

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    array-length v0, p0

    const/4 v3, 0x4

    if-lt v0, v3, :cond_0

    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p0}, Ll/۬ۜܽ;-><init>([B)V

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 33
    :cond_0
    :try_start_0
    invoke-static {p0}, Ll/۫᩶ᩳ;->ۧ([B)Ll/۫᩶ᩳ;

    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ll/۫᩶ᩳ;->ܿ()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v10, v0

    move-object v0, p0

    move-object p0, v10

    goto :goto_0

    :catch_0
    move-exception p0

    .line 36
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid editor session metadata"

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    move-object v0, v2

    .line 39
    :goto_0
    array-length v3, p0

    if-nez v3, :cond_3

    if-eqz p1, :cond_2

    .line 41
    new-instance p0, Ll/۠֫ܿ;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-direct {p0, v3, v4, v0, v2}, Ll/۠֫ܿ;-><init>(JLl/۫᩶ᩳ;Ll/ۨۙᩳ;)V

    return-object p0

    .line 40
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Editor saved mark has not been initialized"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 43
    :cond_3
    array-length v3, p0

    const/16 v4, 0x10

    if-eq v3, v4, :cond_5

    array-length v3, p0

    const/16 v5, 0x64

    if-ne v3, v5, :cond_4

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Invalid editor saved state length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 44
    :cond_5
    :goto_1
    new-instance v3, Ll/۬ۜܽ;

    invoke-direct {v3, p0}, Ll/۬ۜܽ;-><init>([B)V

    .line 45
    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    const-string v6, "Unsupported editor saved state"

    if-ne v5, v1, :cond_c

    .line 46
    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    .line 47
    array-length p0, p0

    const/4 v5, 0x2

    if-ne p0, v4, :cond_6

    const/4 p0, 0x1

    goto :goto_2

    :cond_6
    const/4 p0, 0x2

    :goto_2
    if-ne v1, p0, :cond_b

    .line 50
    invoke-virtual {v3}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long p0, v6, v8

    if-ltz p0, :cond_a

    if-eqz p1, :cond_8

    .line 52
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    cmp-long v4, p0, v6

    if-nez v4, :cond_7

    goto :goto_3

    .line 53
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Editor saved mark is already initialized"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    :goto_3
    if-ne v1, v5, :cond_9

    const/16 p0, 0x54

    :try_start_1
    new-array p1, p0, [B

    .line 212
    invoke-virtual {v3, p0, p1}, Ll/۬ۜܽ;->֫(I[B)V

    .line 57
    invoke-static {p1}, Ll/ۨۙᩳ;->֫([B)Ll/ۨۙᩳ;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception p0

    .line 58
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid editor recovery attachment"

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 60
    :cond_9
    :goto_4
    new-instance p0, Ll/۠֫ܿ;

    invoke-direct {p0, v6, v7, v0, v2}, Ll/۠֫ܿ;-><init>(JLl/۫᩶ᩳ;Ll/ۨۙᩳ;)V

    return-object p0

    .line 51
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Invalid editor saved mark"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 48
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 45
    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/util/UUID;[B)Ll/ۨۙᩳ;
    .locals 3

    if-eqz p0, :cond_3

    .line 87
    array-length v0, p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    array-length v0, p1

    const/4 v2, 0x4

    if-lt v0, v2, :cond_2

    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p1}, Ll/۬ۜܽ;-><init>([B)V

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v2, 0x32535645

    if-eq v0, v2, :cond_2

    .line 90
    :try_start_0
    invoke-static {p1}, Ll/۫᩶ᩳ;->ۧ([B)Ll/۫᩶ᩳ;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ll/۫᩶ᩳ;->ܽ()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 93
    invoke-virtual {v0}, Ll/۫᩶ᩳ;->ܿ()[B

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_2

    :goto_0
    return-object v1

    .line 91
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Editor migration belongs to another session"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 94
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid editor migration metadata"

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 96
    :cond_2
    invoke-static {p1, v1}, Ll/۠֫ܿ;->֫([BLjava/lang/Long;)Ll/۠֫ܿ;

    move-result-object p1

    .line 97
    invoke-virtual {p1, p0}, Ll/۠֫ܿ;->֫(Ljava/util/UUID;)V

    .line 98
    iget-object p0, p1, Ll/۠֫ܿ;->֫:Ll/ۨۙᩳ;

    return-object p0

    .line 86
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Editor recovery session identity is missing"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫([BLl/ۨۙᩳ;Ljava/util/UUID;)[B
    .locals 3

    const/4 v0, 0x0

    .line 76
    invoke-static {p0, v0}, Ll/۠֫ܿ;->֫([BLjava/lang/Long;)Ll/۠֫ܿ;

    move-result-object p0

    iget-wide v0, p0, Ll/۠֫ܿ;->ܽ:J

    .line 77
    invoke-virtual {p0, p2}, Ll/۠֫ܿ;->֫(Ljava/util/UUID;)V

    .line 78
    invoke-virtual {p1}, Ll/ۨۙᩳ;->ܽ()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 81
    new-instance p2, Ll/۠֫ܿ;

    iget-object p0, p0, Ll/۠֫ܿ;->ۧ:Ll/۫᩶ᩳ;

    invoke-direct {p2, v0, v1, p0, p1}, Ll/۠֫ܿ;-><init>(JLl/۫᩶ᩳ;Ll/ۨۙᩳ;)V

    invoke-virtual {p2, v0, v1}, Ll/۠֫ܿ;->֫(J)[B

    move-result-object p0

    return-object p0

    .line 79
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Editor recovery attachment belongs to another session"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/util/UUID;[B)V
    .locals 1

    const/4 v0, 0x0

    .line 103
    invoke-static {p1, v0}, Ll/۠֫ܿ;->֫([BLjava/lang/Long;)Ll/۠֫ܿ;

    move-result-object p1

    .line 104
    invoke-virtual {p1, p0}, Ll/۠֫ܿ;->֫(Ljava/util/UUID;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/UUID;)V
    .locals 1

    if-eqz p1, :cond_2

    .line 109
    iget-object v0, p0, Ll/۠֫ܿ;->ۧ:Ll/۫᩶ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۫᩶ᩳ;->ܽ()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Ll/۠֫ܿ;->֫:Ll/ۨۙᩳ;

    if-eqz v0, :cond_1

    .line 110
    invoke-virtual {v0}, Ll/ۨۙᩳ;->ܽ()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    return-void

    .line 111
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Editor recovery metadata belongs to another session"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(J)[B
    .locals 3

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-ltz v2, :cond_4

    .line 65
    new-instance v0, Ll/ۤۜܽ;

    iget-object v1, p0, Ll/۠֫ܿ;->֫:Ll/ۨۙᩳ;

    if-nez v1, :cond_0

    const/16 v2, 0x10

    goto :goto_0

    :cond_0
    const/16 v2, 0x64

    :goto_0
    invoke-direct {v0, v2}, Ll/ۤۜܽ;-><init>(I)V

    const v2, 0x32535645

    .line 66
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    if-nez v1, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    .line 67
    :goto_1
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 68
    invoke-virtual {v0, p1, p2}, Ll/ۤۜܽ;->ۧ(J)V

    if-eqz v1, :cond_2

    .line 69
    invoke-virtual {v1}, Ll/ۨۙᩳ;->֫()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->write([B)V

    .line 70
    :cond_2
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p1

    .line 71
    iget-object p2, p0, Ll/۠֫ܿ;->ۧ:Ll/۫᩶ᩳ;

    if-nez p2, :cond_3

    return-object p1

    :cond_3
    invoke-virtual {p2, p1}, Ll/۫᩶ᩳ;->֫([B)[B

    move-result-object p1

    return-object p1

    .line 64
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid saved text mark"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
