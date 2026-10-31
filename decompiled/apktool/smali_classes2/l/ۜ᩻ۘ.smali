.class public final Ll/ۜ᩻ۘ;
.super Ljava/lang/Object;
.source "NAGW"


# instance fields
.field public ֫:J

.field public final ۧ:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 30
    iput-object v0, p0, Ll/ۜ᩻ۘ;->ۧ:[B

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x4

    new-array p1, p1, [B

    .line 30
    iput-object p1, p0, Ll/ۜ᩻ۘ;->ۧ:[B

    const-wide/16 v0, 0x0

    .line 38
    iput-wide v0, p0, Ll/ۜ᩻ۘ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 57
    iget-wide v0, p0, Ll/ۜ᩻ۘ;->֫:J

    return-wide v0
.end method

.method public final ֫(Ll/᩻᩻ۘ;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 90
    invoke-virtual {p1}, Ll/᩻᩻ۘ;->ۧ()B

    move-result v1

    iget-object v2, p0, Ll/ۜ᩻ۘ;->ۧ:[B

    aput-byte v1, v2, v0

    const/4 v0, 0x1

    .line 91
    invoke-virtual {p1}, Ll/᩻᩻ۘ;->ۧ()B

    move-result v1

    aput-byte v1, v2, v0

    const/4 v0, 0x2

    .line 92
    invoke-virtual {p1}, Ll/᩻᩻ۘ;->ۧ()B

    move-result v1

    aput-byte v1, v2, v0

    const/4 v0, 0x3

    .line 93
    invoke-virtual {p1}, Ll/᩻᩻ۘ;->ۧ()B

    move-result v1

    aput-byte v1, v2, v0

    const-wide/16 v0, 0x4

    .line 94
    invoke-virtual {p1, v0, v1}, Ll/᩻᩻ۘ;->ۧ(J)V

    .line 95
    invoke-virtual {p1}, Ll/᩻᩻ۘ;->ᩳ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۜ᩻ۘ;->֫:J

    .line 96
    invoke-virtual {p1}, Ll/᩻᩻ۘ;->ᩳ()J

    .line 97
    new-instance p1, Ljava/lang/String;

    const-string v0, "ISO-8859-1"

    invoke-direct {p1, v2, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object p1
.end method
