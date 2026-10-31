.class public final Ll/۟ܿۧ;
.super Ljava/lang/Object;
.source "H8J7"


# instance fields
.field public final ֫:J

.field public final ۧ:I


# direct methods
.method public constructor <init>(IJ)V
    .locals 3

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 153
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 154
    iput p1, p0, Ll/۟ܿۧ;->ۧ:I

    .line 155
    iput-wide p2, p0, Ll/۟ܿۧ;->֫:J

    return-void
.end method
