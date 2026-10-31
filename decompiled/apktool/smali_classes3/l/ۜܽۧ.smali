.class public final Ll/ۜܽۧ;
.super Ljava/lang/Object;
.source "N8PX"

# interfaces
.implements Ll/ܶܿۧ;


# instance fields
.field public ֫:Ll/۠ܿۧ;

.field public ۧ:J

.field public ܽ:Ll/ۜܽۧ;

.field public ᩳ:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 2

    .line 486
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 497
    iget-object v0, p0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 498
    iput-wide p2, p0, Ll/ۜܽۧ;->ᩳ:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    .line 499
    iput-wide p2, p0, Ll/ۜܽۧ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final next()Ll/ܶܿۧ;
    .locals 2

    .line 546
    iget-object v0, p0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫()Ll/۠ܿۧ;
    .locals 1

    .line 540
    iget-object v0, p0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method
