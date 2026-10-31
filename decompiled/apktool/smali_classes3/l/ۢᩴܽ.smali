.class public final Ll/ۢᩴܽ;
.super Ljava/lang/Object;
.source "R6PB"


# instance fields
.field public final ֫:[J

.field public final ۧ:[J

.field public final ܽ:[B


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 619
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 620
    new-array v0, p1, [J

    iput-object v0, p0, Ll/ۢᩴܽ;->ۧ:[J

    .line 621
    new-array v0, p1, [J

    iput-object v0, p0, Ll/ۢᩴܽ;->֫:[J

    .line 622
    new-array p1, p1, [B

    iput-object p1, p0, Ll/ۢᩴܽ;->ܽ:[B

    return-void
.end method
