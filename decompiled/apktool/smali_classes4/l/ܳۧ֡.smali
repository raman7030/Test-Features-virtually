.class public final Ll/ܳۧ֡;
.super Ljava/lang/Object;
.source "U4FJ"

# interfaces
.implements Ll/᩵֫֡;


# static fields
.field public static final ܳ:Ljava/util/List;

.field public static final ᩻:Ljava/util/List;


# instance fields
.field public final ֫:Ll/۠֫֡;

.field public final ۧ:Ll/᩹ۧ֡;

.field public final ܽ:Ll/ܳ۟᩵;

.field public final ܿ:Ll/ܺ֫֡;

.field public ᩳ:Ll/ۤۧ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    const-string v10, ":scheme"

    const-string v11, ":authority"

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v8, ":method"

    const-string v9, ":path"

    .line 69
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۟᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ܳۧ֡;->ܳ:Ljava/util/List;

    const-string v7, "encoding"

    const-string v8, "upgrade"

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    .line 82
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۟᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ܳۧ֡;->᩻:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ܿ۟᩵;Ll/۠֫֡;Ll/ܺ֫֡;Ll/᩹ۧ֡;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p2, p0, Ll/ܳۧ֡;->֫:Ll/۠֫֡;

    .line 101
    iput-object p3, p0, Ll/ܳۧ֡;->ܿ:Ll/ܺ֫֡;

    .line 102
    iput-object p4, p0, Ll/ܳۧ֡;->ۧ:Ll/᩹ۧ֡;

    .line 103
    invoke-virtual {p1}, Ll/ܿ۟᩵;->ۘ()Ljava/util/List;

    move-result-object p1

    sget-object p2, Ll/ܳ۟᩵;->᩶:Ll/ܳ۟᩵;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    sget-object p2, Ll/ܳ۟᩵;->۬:Ll/ܳ۟᩵;

    :goto_0
    iput-object p2, p0, Ll/ܳۧ֡;->ܽ:Ll/ܳ۟᩵;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    .line 192
    iget-object v0, p0, Ll/ܳۧ֡;->ᩳ:Ll/ۤۧ֡;

    if-eqz v0, :cond_0

    sget-object v1, Ll/ܰ֫֡;->᩶:Ll/ܰ֫֡;

    invoke-virtual {v0, v1}, Ll/ۤۧ֡;->ۧ(Ll/ܰ֫֡;)V

    :cond_0
    return-void
.end method

.method public final ֫(Z)Ll/ۘ۟᩵;
    .locals 9

    .line 131
    iget-object v0, p0, Ll/ܳۧ֡;->ᩳ:Ll/ۤۧ֡;

    invoke-virtual {v0}, Ll/ۤۧ֡;->ۜ()Ll/ۤܰ᩵;

    move-result-object v0

    .line 164
    new-instance v1, Ll/۫ܰ᩵;

    invoke-direct {v1}, Ll/۫ܰ᩵;-><init>()V

    .line 165
    invoke-virtual {v0}, Ll/ۤܰ᩵;->ۧ()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    :goto_0
    if-ge v4, v2, :cond_2

    .line 166
    invoke-virtual {v0, v4}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v6

    .line 167
    invoke-virtual {v0, v4}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, ":status"

    .line 168
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 169
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "HTTP/1.1 "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩹֫֡;->֫(Ljava/lang/String;)Ll/᩹֫֡;

    move-result-object v5

    goto :goto_1

    .line 170
    :cond_0
    sget-object v8, Ll/ܳۧ֡;->᩻:Ljava/util/List;

    invoke-interface {v8, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 171
    sget-object v8, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    invoke-virtual {v8, v1, v6, v7}, Ll/۠۟᩵;->֫(Ll/۫ܰ᩵;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-eqz v5, :cond_4

    .line 176
    new-instance v0, Ll/ۘ۟᩵;

    invoke-direct {v0}, Ll/ۘ۟᩵;-><init>()V

    .line 177
    iget-object v2, p0, Ll/ܳۧ֡;->ܽ:Ll/ܳ۟᩵;

    invoke-virtual {v0, v2}, Ll/ۘ۟᩵;->֫(Ll/ܳ۟᩵;)V

    iget v2, v5, Ll/᩹֫֡;->֫:I

    .line 178
    invoke-virtual {v0, v2}, Ll/ۘ۟᩵;->֫(I)V

    iget-object v2, v5, Ll/᩹֫֡;->ۧ:Ljava/lang/String;

    .line 179
    invoke-virtual {v0, v2}, Ll/ۘ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v1}, Ll/۫ܰ᩵;->֫()Ll/ۤܰ᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۘ۟᩵;->֫(Ll/ۤܰ᩵;)V

    if-eqz p1, :cond_3

    .line 133
    sget-object p1, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    invoke-virtual {p1, v0}, Ll/۠۟᩵;->֫(Ll/ۘ۟᩵;)I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_3

    return-object v3

    :cond_3
    return-object v0

    .line 174
    :cond_4
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۡ۟᩵;J)Ll/ۚᩳ֡;
    .locals 0

    .line 109
    iget-object p1, p0, Ll/ܳۧ֡;->ᩳ:Ll/ۤۧ֡;

    invoke-virtual {p1}, Ll/ۤۧ֡;->ܽ()Ll/ۚᩳ֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩴ۟᩵;)Ll/ܶ֫֡;
    .locals 4

    .line 184
    iget-object v0, p0, Ll/ܳۧ֡;->ܿ:Ll/ܺ֫֡;

    iget-object v0, v0, Ll/ܺ֫֡;->ۜ:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Content-Type"

    .line 185
    invoke-virtual {p1, v0}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 186
    invoke-static {p1}, Ll/֨֫֡;->֫(Ll/ᩴ۟᩵;)J

    move-result-wide v1

    .line 187
    new-instance p1, Ll/ܿۧ֡;

    iget-object v3, p0, Ll/ܳۧ֡;->ᩳ:Ll/ۤۧ֡;

    invoke-virtual {v3}, Ll/ۤۧ֡;->ᩳ()Ll/֨ᩳ֡;

    move-result-object v3

    invoke-direct {p1, p0, v3}, Ll/ܿۧ֡;-><init>(Ll/ܳۧ֡;Ll/֨ᩳ֡;)V

    .line 188
    new-instance v3, Ll/ܶ֫֡;

    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object p1

    invoke-direct {v3, v0, v1, v2, p1}, Ll/ܶ֫֡;-><init>(Ljava/lang/String;JLl/ۛܽ֡;)V

    return-object v3
.end method

.method public final ֫()V
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ܳۧ֡;->ᩳ:Ll/ۤۧ֡;

    invoke-virtual {v0}, Ll/ۤۧ֡;->ܽ()Ll/ۚᩳ֡;

    move-result-object v0

    check-cast v0, Ll/ۗۧ֡;

    invoke-virtual {v0}, Ll/ۗۧ֡;->close()V

    return-void
.end method

.method public final ֫(Ll/ۡ۟᩵;)V
    .locals 9

    .line 113
    iget-object v0, p0, Ll/ܳۧ֡;->ᩳ:Ll/ۤۧ֡;

    if-eqz v0, :cond_0

    return-void

    .line 115
    :cond_0
    invoke-virtual {p1}, Ll/ۡ۟᩵;->֫()Ll/ۖ۟᩵;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 140
    :goto_0
    invoke-virtual {p1}, Ll/ۡ۟᩵;->ܽ()Ll/ۤܰ᩵;

    move-result-object v2

    .line 141
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ll/ۤܰ᩵;->ۧ()I

    move-result v4

    add-int/lit8 v4, v4, 0x4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 142
    new-instance v4, Ll/۟֫֡;

    sget-object v5, Ll/۟֫֡;->᩻:Ll/ۨܽ֡;

    invoke-virtual {p1}, Ll/ۡ۟᩵;->ܿ()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    new-instance v4, Ll/۟֫֡;

    sget-object v5, Ll/۟֫֡;->ۜ:Ll/ۨܽ֡;

    invoke-virtual {p1}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v6

    .line 60
    invoke-virtual {v6}, Ll/ۨܰ᩵;->ۧ()Ljava/lang/String;

    move-result-object v7

    .line 61
    invoke-virtual {v6}, Ll/ۨܰ᩵;->ᩳ()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 62
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x3f

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 143
    :cond_2
    invoke-direct {v4, v5, v7}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v4, "Host"

    .line 144
    invoke-virtual {p1, v4}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 146
    new-instance v5, Ll/۟֫֡;

    sget-object v6, Ll/۟֫֡;->ܳ:Ll/ۨܽ֡;

    invoke-direct {v5, v6, v4}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    :cond_3
    new-instance v4, Ll/۟֫֡;

    sget-object v5, Ll/۟֫֡;->᩷:Ll/ۨܽ֡;

    invoke-virtual {p1}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨܰ᩵;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, v5, p1}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    invoke-virtual {v2}, Ll/ۤܰ᩵;->ۧ()I

    move-result p1

    :goto_1
    if-ge v1, p1, :cond_5

    .line 152
    invoke-virtual {v2, v1}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v4

    .line 153
    sget-object v5, Ll/ܳۧ֡;->ܳ:Ljava/util/List;

    invoke-virtual {v4}, Ll/ۨܽ֡;->ᩴ()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 154
    new-instance v5, Ll/۟֫֡;

    invoke-virtual {v2, v1}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v4, v6}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 117
    :cond_5
    iget-object p1, p0, Ll/ܳۧ֡;->ۧ:Ll/᩹ۧ֡;

    invoke-virtual {p1, v3, v0}, Ll/᩹ۧ֡;->֫(Ljava/util/ArrayList;Z)Ll/ۤۧ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ܳۧ֡;->ᩳ:Ll/ۤۧ֡;

    .line 208
    iget-object p1, p1, Ll/ۤۧ֡;->᩻:Ll/۫ۧ֡;

    .line 118
    iget-object v0, p0, Ll/ܳۧ֡;->֫:Ll/۠֫֡;

    invoke-virtual {v0}, Ll/۠֫֡;->ܳ()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2}, Ll/ܶᩳ֡;->ۧ(J)Ll/ܶᩳ֡;

    .line 119
    iget-object p1, p0, Ll/ܳۧ֡;->ᩳ:Ll/ۤۧ֡;

    .line 212
    iget-object p1, p1, Ll/ۤۧ֡;->ۡ:Ll/۫ۧ֡;

    .line 119
    invoke-virtual {v0}, Ll/۠֫֡;->᩷()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/ܶᩳ֡;->ۧ(J)Ll/ܶᩳ֡;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ܳۧ֡;->ۧ:Ll/᩹ۧ֡;

    .line 444
    iget-object v0, v0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {v0}, Ll/ۛۧ֡;->flush()V

    return-void
.end method
