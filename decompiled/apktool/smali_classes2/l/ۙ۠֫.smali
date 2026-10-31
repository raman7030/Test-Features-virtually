.class public final Ll/ۙ۠֫;
.super Ljava/lang/Object;
.source "L8KW"


# instance fields
.field public ֫:I

.field public ۜ:Landroid/net/Uri;

.field public ۧ:[B

.field public ܳ:J

.field public ܽ:I

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/util/Map;

.field public ᩷:J

.field public ᩻:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 65
    iput v0, p0, Ll/ۙ۠֫;->ܽ:I

    .line 66
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Ll/ۙ۠֫;->ᩳ:Ljava/util/Map;

    const-wide/16 v0, -0x1

    .line 67
    iput-wide v0, p0, Ll/ۙ۠֫;->ܳ:J

    return-void
.end method

.method public constructor <init>(Ll/ۗ۠֫;)V
    .locals 2

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iget-object v0, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iput-object v0, p0, Ll/ۙ۠֫;->ۜ:Landroid/net/Uri;

    .line 77
    iget-wide v0, p1, Ll/ۗ۠֫;->᩷:J

    iput-wide v0, p0, Ll/ۙ۠֫;->᩷:J

    .line 78
    iget v0, p1, Ll/ۗ۠֫;->ܽ:I

    iput v0, p0, Ll/ۙ۠֫;->ܽ:I

    .line 79
    iget-object v0, p1, Ll/ۗ۠֫;->ۧ:[B

    iput-object v0, p0, Ll/ۙ۠֫;->ۧ:[B

    .line 80
    iget-object v0, p1, Ll/ۗ۠֫;->ᩳ:Ljava/util/Map;

    iput-object v0, p0, Ll/ۙ۠֫;->ᩳ:Ljava/util/Map;

    .line 81
    iget-wide v0, p1, Ll/ۗ۠֫;->᩻:J

    iput-wide v0, p0, Ll/ۙ۠֫;->᩻:J

    .line 82
    iget-wide v0, p1, Ll/ۗ۠֫;->ܳ:J

    iput-wide v0, p0, Ll/ۙ۠֫;->ܳ:J

    .line 83
    iget-object v0, p1, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۙ۠֫;->ܿ:Ljava/lang/String;

    .line 84
    iget p1, p1, Ll/ۗ۠֫;->֫:I

    iput p1, p0, Ll/ۙ۠֫;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۗ۠֫;
    .locals 15

    .line 231
    iget-object v0, p0, Ll/ۙ۠֫;->ۜ:Landroid/net/Uri;

    if-eqz v0, :cond_0

    .line 232
    new-instance v0, Ll/ۗ۠֫;

    iget-object v2, p0, Ll/ۙ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v3, p0, Ll/ۙ۠֫;->᩷:J

    iget v5, p0, Ll/ۙ۠֫;->ܽ:I

    iget-object v6, p0, Ll/ۙ۠֫;->ۧ:[B

    iget-object v7, p0, Ll/ۙ۠֫;->ᩳ:Ljava/util/Map;

    iget-wide v8, p0, Ll/ۙ۠֫;->᩻:J

    iget-wide v10, p0, Ll/ۙ۠֫;->ܳ:J

    iget-object v12, p0, Ll/ۙ۠֫;->ܿ:Ljava/lang/String;

    iget v13, p0, Ll/ۙ۠֫;->֫:I

    const/4 v14, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v14}, Ll/ۗ۠֫;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;II)V

    return-object v0

    .line 137
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The uri must be set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 208
    iput p1, p0, Ll/ۙ۠֫;->֫:I

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 184
    iput-wide p1, p0, Ll/ۙ۠֫;->ܳ:J

    return-void
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 0

    .line 108
    iput-object p1, p0, Ll/ۙ۠֫;->ۜ:Landroid/net/Uri;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 196
    iput-object p1, p0, Ll/ۙ۠֫;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/Map;)V
    .locals 0

    .line 160
    iput-object p1, p0, Ll/ۙ۠֫;->ᩳ:Ljava/util/Map;

    return-void
.end method

.method public final ֫([B)V
    .locals 0

    .line 144
    iput-object p1, p0, Ll/ۙ۠֫;->ۧ:[B

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 132
    iput p1, p0, Ll/ۙ۠֫;->ܽ:I

    return-void
.end method

.method public final ۧ(J)V
    .locals 0

    .line 172
    iput-wide p1, p0, Ll/ۙ۠֫;->᩻:J

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 96
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ۠֫;->ۜ:Landroid/net/Uri;

    return-void
.end method

.method public final ܽ(J)V
    .locals 0

    .line 120
    iput-wide p1, p0, Ll/ۙ۠֫;->᩷:J

    return-void
.end method
