.class public final Ll/ۜܿ۠;
.super Ljava/lang/Object;
.source "F43P"


# instance fields
.field public final ֫:Ljava/lang/ref/SoftReference;

.field public final ۧ:J


# direct methods
.method public constructor <init>(Ll/۫ܳ۠;Ljava/nio/CharBuffer;)V
    .locals 2

    .line 475
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 476
    invoke-virtual {p1}, Ll/۫ܳ۠;->ᩳ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۜܿ۠;->ۧ:J

    .line 477
    new-instance p1, Ljava/lang/ref/SoftReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ۜܿ۠;->֫:Ljava/lang/ref/SoftReference;

    return-void
.end method
