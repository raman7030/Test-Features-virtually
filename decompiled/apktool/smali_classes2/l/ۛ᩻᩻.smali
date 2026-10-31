.class public final Ll/ۛ᩻᩻;
.super Landroid/media/MediaDataSource;
.source "L8GV"


# instance fields
.field public ᩸:Z

.field public final synthetic ᩹:Ll/ܰ᩻᩻;


# direct methods
.method public constructor <init>(Ll/ܰ᩻᩻;)V
    .locals 0

    .line 524
    iput-object p1, p0, Ll/ۛ᩻᩻;->᩹:Ll/ܰ᩻᩻;

    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 539
    iget-boolean v0, p0, Ll/ۛ᩻᩻;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 542
    iput-boolean v0, p0, Ll/ۛ᩻᩻;->᩸:Z

    .line 543
    iget-object v0, p0, Ll/ۛ᩻᩻;->᩹:Ll/ܰ᩻᩻;

    invoke-virtual {v0}, Ll/ܰ᩻᩻;->close()V

    return-void
.end method

.method public final getSize()J
    .locals 2

    .line 534
    iget-object v0, p0, Ll/ۛ᩻᩻;->᩹:Ll/ܰ᩻᩻;

    invoke-virtual {v0}, Ll/ܰ᩻᩻;->ᩳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final readAt(J[BII)I
    .locals 6

    .line 529
    iget-object v0, p0, Ll/ۛ᩻᩻;->᩹:Ll/ܰ᩻᩻;

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/ܰ᩻᩻;->ܽ(J[BII)I

    move-result p1

    return p1
.end method
