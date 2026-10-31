.class public final Ll/ܿ᩶᩷;
.super Ljava/lang/Object;
.source "V933"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۚᩴ۟:[S


# instance fields
.field public final synthetic ᩸:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x86

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿ᩶᩷;->ۚᩴ۟:[S

    return-void

    :array_0
    .array-data 2
        0xd49s
        0x64d4s
        0x64c8s
        0x64c5s
    .end array-data
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ᩶᩷;->᩸:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public native run()V
.end method
