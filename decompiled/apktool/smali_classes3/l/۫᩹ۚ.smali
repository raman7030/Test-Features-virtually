.class public Ll/۫᩹ۚ;
.super Ljava/lang/Object;
.source "G1JT"


# instance fields
.field public final artFieldOrMethod:J

.field public cachedSpreadInvoker:Ll/۫᩹ۚ;

.field public final handleKind:I

.field public nominalType:Ljava/lang/invoke/MethodType;

.field public final type:Ljava/lang/invoke/MethodType;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Ll/۫᩹ۚ;->type:Ljava/lang/invoke/MethodType;

    const/4 v0, 0x0

    .line 48
    iput v0, p0, Ll/۫᩹ۚ;->handleKind:I

    const-wide/16 v0, 0x0

    .line 51
    iput-wide v0, p0, Ll/۫᩹ۚ;->artFieldOrMethod:J

    return-void
.end method
