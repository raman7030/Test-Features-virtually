.class public final Ll/ۙۚۧ;
.super Ljava/lang/Object;
.source "C8SK"


# instance fields
.field public final ֫:I

.field public final ۧ:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 256
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 257
    iput p1, p0, Ll/ۙۚۧ;->֫:I

    .line 258
    iput-wide p2, p0, Ll/ۙۚۧ;->ۧ:J

    return-void
.end method

.method public static ֫(Ll/۠᩷ۧ;Ll/ᩳ֨֫;)Ll/ۙۚۧ;
    .locals 3

    .line 271
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {p0, v2, v1, v0}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 272
    invoke-virtual {p1, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 274
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩻()I

    move-result p0

    .line 275
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܺ()J

    move-result-wide v0

    .line 277
    new-instance p1, Ll/ۙۚۧ;

    invoke-direct {p1, p0, v0, v1}, Ll/ۙۚۧ;-><init>(IJ)V

    return-object p1
.end method
