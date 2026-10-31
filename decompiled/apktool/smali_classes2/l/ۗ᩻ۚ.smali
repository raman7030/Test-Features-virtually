.class public final Ll/ۗ᩻ۚ;
.super Ljava/lang/Object;
.source "W7N3"


# static fields
.field public static ֫:Ll/۬ۘۘ;


# direct methods
.method public static ֫([B)J
    .locals 6

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 117
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    .line 118
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    mul-int/lit8 v5, v2, 0x8

    shl-long/2addr v3, v5

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 120
    :cond_0
    array-length p0, p0

    rsub-int/lit8 p0, p0, 0x8

    mul-int/lit8 p0, p0, 0x8

    shl-long/2addr v0, p0

    return-wide v0
.end method

.method public static ֫()Ll/۬ۘۘ;
    .locals 5

    .line 80
    sget-object v0, Ll/ۗ᩻ۚ;->֫:Ll/۬ۘۘ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "com.portaudio.PortAudio"

    .line 82
    invoke-static {v0, v1}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "com.jsyn.devices.jportaudio.JPortAudioDevice"

    const/4 v2, 0x1

    .line 52
    invoke-static {v0, v2}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۘۘ;

    sput-object v0, Ll/ۗ᩻ۚ;->֫:Ll/۬ۘۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 88
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not load JPortAudio device. "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 65
    :cond_0
    :goto_0
    sget-object v0, Ll/ۗ᩻ۚ;->֫:Ll/۬ۘۘ;

    if-nez v0, :cond_1

    :try_start_1
    const-string v0, "com.jsyn.devices.javasound.JavaSoundAudioDevice"

    .line 68
    invoke-static {v0, v1}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 71
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۘۘ;

    sput-object v0, Ll/ۗ᩻ۚ;->֫:Ll/۬ۘۘ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 74
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not load JavaSound device. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 61
    :cond_1
    :goto_1
    sget-object v0, Ll/ۗ᩻ۚ;->֫:Ll/۬ۘۘ;

    return-object v0
.end method

.method public static final ֫(Landroid/view/View;Ll/᩹۫ۧ;)V
    .locals 1

    const-string v0, "<this>"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a068b

    .line 41
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/lang/Iterable;Z)Z
    .locals 2

    .line 44
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 45
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 46
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۛ֡;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۛ֡;

    invoke-virtual {v0, v1, p2}, Ll/ۤۛ֡;->֫(Ll/ۤۛ֡;Z)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 51
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/lang/Iterable;ZZZZZ)Z
    .locals 8

    .line 55
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 56
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 57
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ܽۨ֡;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll/ܽۨ֡;

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v7}, Ll/ܽۨ֡;->֫(Ll/ܽۨ֡;ZZZZZ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 62
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ljava/util/Set;Ljava/util/Set;)Z
    .locals 2

    .line 26
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 34
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 35
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 40
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-nez p0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-nez p0, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(J)[B
    .locals 4

    .line 124
    invoke-static {p0, p1}, Ll/ۗ᩻ۚ;->ᩳ(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x8

    rsub-int/lit8 v1, v1, 0x40

    shr-long/2addr p0, v1

    .line 129
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    long-to-int v3, p0

    int-to-byte v3, v3

    .line 132
    aput-byte v3, v1, v2

    const/16 v3, 0x8

    shr-long/2addr p0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static ۧ([B)J
    .locals 6

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 51
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    .line 52
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    mul-int/lit8 v5, v2, 0x8

    shl-long/2addr v3, v5

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 55
    :cond_0
    array-length p0, p0

    rsub-int/lit8 p0, p0, 0x8

    mul-int/lit8 p0, p0, 0x8

    shl-long/2addr v0, p0

    shr-long/2addr v0, p0

    return-wide v0
.end method

.method public static ۧ(J)[B
    .locals 4

    .line 60
    invoke-static {p0, p1}, Ll/ۗ᩻ۚ;->ܿ(J)B

    move-result v0

    .line 62
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    long-to-int v3, p0

    int-to-byte v3, v3

    .line 65
    aput-byte v3, v1, v2

    const/16 v3, 0x8

    shr-long/2addr p0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static ܳ(J)B
    .locals 0

    .line 74
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x40

    if-nez p0, :cond_0

    const/4 p0, 0x1

    :cond_0
    add-int/lit8 p0, p0, 0x7

    shr-int/lit8 p0, p0, 0x3

    int-to-byte p0, p0

    return p0
.end method

.method public static ܽ([B)J
    .locals 6

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 85
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    .line 86
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    mul-int/lit8 v5, v2, 0x8

    shl-long/2addr v3, v5

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public static ܽ(J)[B
    .locals 4

    .line 92
    invoke-static {p0, p1}, Ll/ۗ᩻ۚ;->ܳ(J)B

    move-result v0

    .line 94
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    long-to-int v3, p0

    int-to-byte v3, v3

    .line 97
    aput-byte v3, v1, v2

    const/16 v3, 0x8

    shr-long/2addr p0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static ܿ(J)B
    .locals 2

    const/16 v0, 0x3f

    shr-long v0, p0, v0

    xor-long/2addr p0, v0

    .line 43
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x48

    shr-int/lit8 p0, p0, 0x3

    int-to-byte p0, p0

    return p0
.end method

.method public static ᩳ(J)I
    .locals 0

    .line 106
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x40

    if-nez p0, :cond_0

    const/4 p0, 0x1

    :cond_0
    add-int/lit8 p0, p0, 0x7

    shr-int/lit8 p0, p0, 0x3

    return p0
.end method
