.class public final Ll/ۨ֡ۜ;
.super Ljava/lang/Object;
.source "Q8FL"

# interfaces
.implements Ll/۟ܰۜ;


# instance fields
.field public final ᩸:Ll/ܰ᩻᩻;


# direct methods
.method public constructor <init>(Ll/ܰ᩻᩻;)V
    .locals 0

    .line 1288
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1289
    iput-object p1, p0, Ll/ۨ֡ۜ;->᩸:Ll/ܰ᩻᩻;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1311
    iget-object v0, p0, Ll/ۨ֡ۜ;->᩸:Ll/ܰ᩻᩻;

    invoke-virtual {v0}, Ll/ܰ᩻᩻;->close()V

    return-void
.end method

.method public final length()J
    .locals 2

    .line 1294
    iget-object v0, p0, Ll/ۨ֡ۜ;->᩸:Ll/ܰ᩻᩻;

    invoke-virtual {v0}, Ll/ܰ᩻᩻;->ᩳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(J[BII)V
    .locals 9

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p5, :cond_1

    int-to-long v1, v0

    add-long v4, p1, v1

    add-int v7, p4, v0

    sub-int v8, p5, v0

    .line 1301
    iget-object v3, p0, Ll/ۨ֡ۜ;->᩸:Ll/ܰ᩻᩻;

    move-object v6, p3

    invoke-virtual/range {v3 .. v8}, Ll/ܰ᩻᩻;->ܽ(J[BII)I

    move-result v1

    if-lez v1, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    .line 1303
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Unexpected end of metadata"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method
