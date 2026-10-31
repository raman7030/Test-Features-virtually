.class public abstract Ll/֫ۡ᩵;
.super Ljava/util/TimerTask;
.source "V9VI"


# instance fields
.field public final ᩸:Ll/ۡۢ᩵;


# direct methods
.method public constructor <init>(Ll/ۡۢ᩵;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 32
    iput-object p1, p0, Ll/֫ۡ᩵;->᩸:Ll/ۡۢ᩵;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 64
    invoke-virtual {p0}, Ll/֫ۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۡۢ᩵;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/֫ۡ᩵;->᩸:Ll/ۡۢ᩵;

    return-object v0
.end method

.method public final ֫(Ll/ܳ᩷᩵;Ll/ۧ᩷᩵;Ll/᩹᩷᩵;)Ll/ܳ᩷᩵;
    .locals 5

    .line 107
    :try_start_0
    invoke-virtual {p1, p2, p3}, Ll/ܳ᩷᩵;->֫(Ll/ۧ᩷᩵;Ll/᩹᩷᩵;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 109
    :catch_0
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v0

    .line 110
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->᩷()Z

    move-result v1

    .line 111
    invoke-virtual {p1}, Ll/ܳ᩷᩵;->֡()I

    move-result v2

    .line 112
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ᩳ()I

    move-result v3

    or-int/lit16 v4, v0, 0x200

    .line 114
    invoke-virtual {p1, v4}, Ll/ᩳ᩷᩵;->֫(I)V

    .line 115
    invoke-virtual {p1, v3}, Ll/ᩳ᩷᩵;->ۧ(I)V

    .line 116
    iget-object v3, p0, Ll/֫ۡ᩵;->᩸:Ll/ۡۢ᩵;

    invoke-virtual {v3, p1}, Ll/ۡۢ᩵;->֫(Ll/ܳ᩷᩵;)V

    .line 118
    new-instance p1, Ll/ܳ᩷᩵;

    invoke-direct {p1, v0, v2, v1}, Ll/ܳ᩷᩵;-><init>(IIZ)V

    .line 119
    invoke-virtual {p1, p2, p3}, Ll/ܳ᩷᩵;->֫(Ll/ۧ᩷᩵;Ll/᩹᩷᩵;)V

    return-object p1
.end method

.method public final ֫(Ll/ܳ᩷᩵;Ll/ᩴ᩷᩵;)Ll/ܳ᩷᩵;
    .locals 5

    .line 78
    :try_start_0
    invoke-virtual {p1, p2}, Ll/ܳ᩷᩵;->֫(Ll/ᩴ᩷᩵;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 80
    :catch_0
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v0

    .line 81
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->᩷()Z

    move-result v1

    .line 82
    invoke-virtual {p1}, Ll/ܳ᩷᩵;->֡()I

    move-result v2

    .line 83
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ᩳ()I

    move-result v3

    or-int/lit16 v4, v0, 0x200

    .line 85
    invoke-virtual {p1, v4}, Ll/ᩳ᩷᩵;->֫(I)V

    .line 86
    invoke-virtual {p1, v3}, Ll/ᩳ᩷᩵;->ۧ(I)V

    .line 87
    iget-object v3, p0, Ll/֫ۡ᩵;->᩸:Ll/ۡۢ᩵;

    invoke-virtual {v3, p1}, Ll/ۡۢ᩵;->֫(Ll/ܳ᩷᩵;)V

    .line 89
    new-instance p1, Ll/ܳ᩷᩵;

    invoke-direct {p1, v0, v2, v1}, Ll/ܳ᩷᩵;-><init>(IIZ)V

    .line 90
    invoke-virtual {p1, p2}, Ll/ܳ᩷᩵;->֫(Ll/ᩴ᩷᩵;)V

    return-object p1
.end method

.method public final ֫(Ll/ܳ᩷᩵;Ll/᩹᩷᩵;)Ll/ܳ᩷᩵;
    .locals 5

    .line 164
    :try_start_0
    invoke-virtual {p1, p2}, Ll/ܳ᩷᩵;->֫(Ll/᩹᩷᩵;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 166
    :catch_0
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v0

    .line 167
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->᩷()Z

    move-result v1

    .line 168
    invoke-virtual {p1}, Ll/ܳ᩷᩵;->֡()I

    move-result v2

    .line 169
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ᩳ()I

    move-result v3

    or-int/lit16 v4, v0, 0x200

    .line 171
    invoke-virtual {p1, v4}, Ll/ᩳ᩷᩵;->֫(I)V

    .line 172
    invoke-virtual {p1, v3}, Ll/ᩳ᩷᩵;->ۧ(I)V

    .line 173
    iget-object v3, p0, Ll/֫ۡ᩵;->᩸:Ll/ۡۢ᩵;

    invoke-virtual {v3, p1}, Ll/ۡۢ᩵;->֫(Ll/ܳ᩷᩵;)V

    .line 175
    new-instance p1, Ll/ܳ᩷᩵;

    invoke-direct {p1, v0, v2, v1}, Ll/ܳ᩷᩵;-><init>(IIZ)V

    .line 176
    invoke-virtual {p1, p2}, Ll/ܳ᩷᩵;->֫(Ll/᩹᩷᩵;)V

    return-object p1
.end method

.method public final ֫(Ll/ܳ᩷᩵;Ll/᩹᩷᩵;J)Ll/ܳ᩷᩵;
    .locals 5

    .line 136
    :try_start_0
    invoke-virtual {p1, p2, p3, p4}, Ll/ܳ᩷᩵;->֫(Ll/᩹᩷᩵;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 138
    :catch_0
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ܽ()I

    move-result v0

    .line 139
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->᩷()Z

    move-result v1

    .line 140
    invoke-virtual {p1}, Ll/ܳ᩷᩵;->֡()I

    move-result v2

    .line 141
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ᩳ()I

    move-result v3

    or-int/lit16 v4, v0, 0x200

    .line 143
    invoke-virtual {p1, v4}, Ll/ᩳ᩷᩵;->֫(I)V

    .line 144
    invoke-virtual {p1, v3}, Ll/ᩳ᩷᩵;->ۧ(I)V

    .line 145
    iget-object v3, p0, Ll/֫ۡ᩵;->᩸:Ll/ۡۢ᩵;

    invoke-virtual {v3, p1}, Ll/ۡۢ᩵;->֫(Ll/ܳ᩷᩵;)V

    .line 147
    new-instance p1, Ll/ܳ᩷᩵;

    invoke-direct {p1, v0, v2, v1}, Ll/ܳ᩷᩵;-><init>(IIZ)V

    .line 148
    invoke-virtual {p1, p2, p3, p4}, Ll/ܳ᩷᩵;->֫(Ll/᩹᩷᩵;J)V

    return-object p1
.end method

.method public abstract ۧ()Ljava/lang/String;
.end method
